/*
 * The contents of this file, as updated from time to time by Dublin Core
 * Metadata Initiative (DCMI), are subject to the Dublin Core Public
 * License Version 1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a current copy of the
 * License at http://dublincore.org/dcpl/.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and
 * limitations under the License.
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Dublin Core Metadata Initiative. For
 * more information on the Dublin Core Metadata Initiative, please see
 * http://dublincore.org/.
 *
 * This is Original Code.
 *
 * The Developer of the Original Code is:
 *  H.Wagner    <wagnerh@oclc.org>
 *  M.Nagamori  <nagamorm@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.db.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.lang.StringBuffer;
import java.util.HashSet;
import java.util.Properties;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.DriverManager; 

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


public class adminLoginServlet extends registryServlet {

	String reqType = null;
	String account = null;
	String password = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		HttpSession session = request.getSession(true);
		getInputParameters(request, response, session);

		if (reqType.equals("login")) {
			try {
				Class.forName(JDBCDriver);
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				ModelRDB accountModel = ModelRDB.open(conn, account_model);
				Model loginModel = ModelFactory.createDefaultModel();
				Model tempModel = ModelFactory.createDefaultModel();
				boolean loginOK = false;
				
				if ((account != null) && (password != null)) {
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "account");
					Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "password"); 
					Selector s1 = new SimpleSelector(null, p1, account);
			
					tempModel = accountModel.query(s1);
					StmtIterator sti = tempModel.listStatements();
					if (sti.hasNext()) {
						Statement stmt = (Statement) sti.next();
						Resource subject = stmt.getSubject();
						//System.out.println("account match");
						SimpleSelector s2 = new SimpleSelector(subject, p2, password);
						tempModel = accountModel.query(s2);
						StmtIterator sti2 = tempModel.listStatements();
						if (sti2.hasNext()) {
							Statement stmt2 = (Statement) sti2.next();
							String pw = stmt2.getLiteral().getLexicalForm();
							if (pw.equals(password)) {
								//System.out.println("password match");
								loginOK = true;
							}
						}
					}
				}
				
				accountModel.close();
				tempModel.close();
				
				if (loginOK) {
					conn.close();
					setCookie(request, response, "registryUser", account);
					String tmp = request.getRequestURL().toString();
					tmp = tmp.substring(0,tmp.lastIndexOf("/"));
					response.sendRedirect(tmp + "/adminServlet");
				} else {
					CharArrayWriter caw = new CharArrayWriter();
					loginModel.write(caw, "RDF/XML");
					loginModel.close();
	
					//System.out.println(caw);
					transform(response, caw, "admin-login.xsl");
				}
	
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (Exception e2) { }
			}
		}

		if (reqType.equals("start")) {
			
			try {			
				Model loginModel = ModelFactory.createDefaultModel();
				CharArrayWriter caw = new CharArrayWriter();
				loginModel.write(caw, "RDF/XML");
				loginModel.close();
				transform(response, caw, "admin-login.xsl");
	
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
	}
	

	protected void setXSLTParms (Transformer transformer) {

		try {
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
						
		} catch (Exception e) {
			System.err.println(e);
		}		
	}


	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, 
		HttpSession session) throws ServletException, IOException {

		reqType = null;
		account = null;
		password = null;
		
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		}

		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
		
		account = getCookie(request, "registryUser");
		if (account != null) {
			gotoPage("/adminServlet", request, response);
		} else {
			account = request.getParameter("account");
			password = request.getParameter("password");	
		}
	}

}

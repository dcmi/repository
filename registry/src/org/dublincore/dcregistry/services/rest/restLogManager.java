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
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package org.dublincore.dcregistry.services.rest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.rpc.server.*;
import javax.xml.rpc.ServiceException;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.util.*;
import java.text.BreakIterator;
import java.sql.Connection;
import java.sql.DriverManager;  


public class restLogManager extends remoteRestServlet {
	
	String reqType = null;
	String account = null;
	String password = null;
	IDBConnection conn = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CharArrayWriter caw = new CharArrayWriter();
		String tmpstr = null;
		getInputParameters(request);
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB accountModel = ModelRDB.open(conn, account_model);
			Model tempModel = ModelFactory.createDefaultModel();
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "hasStatus");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "currentLog");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "oldLog");
			
			if (reqType.equals("start")) {	
				Resource r1 = tempModel.createResource("http://dublincore.org/registry/rest_log");
				if (lfn == null)
					r1.addProperty(p2, "not opened");
				else
					r1.addProperty(p2, lfn);
				
			} else if (reqType.equals("roll")) {
				boolean validAccount = false;
				if ((account != null) && (password != null)) {
					Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "account");
					Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "password"); 
					Selector s1 = new SimpleSelector(null, p4, account);
			
					tempModel = accountModel.query(s1);
					StmtIterator sti = tempModel.listStatements();
					if (sti.hasNext()) {
						Statement stmt = (Statement) sti.next();
						Resource subject = stmt.getSubject();
						SimpleSelector s2 = new SimpleSelector(subject, p5, password);
						tempModel = accountModel.query(s2);
						StmtIterator sti2 = tempModel.listStatements();
						if (sti2.hasNext()) {
							Statement stmt2 = (Statement) sti2.next();
							String pw = stmt2.getLiteral().getLexicalForm();
							if (pw.equals(password)) {
								validAccount = true;
							}
						}
					}
				}
				
				accountModel.close();
				tempModel.close();
				tempModel = ModelFactory.createDefaultModel();
				Resource r1 = tempModel.createResource("http://dublincore.org/registry/rest_log");
							
				if (validAccount) {
					r1.addProperty(p3, lfn);
					boolean recycleOK = newLogHandler();
					if (recycleOK) {
						//System.out.println("Rest Log recycled.");
						r1.addProperty(p1, "complete");
						r1.addProperty(p2, lfn);
					} else {
						System.out.println("Rest Log recycle failed!");
						r1.addProperty(p1, "failed");
					}
				} else {
					System.out.println("Non-authorized attempt to recycle Rest log file: " + account + ", " + password);
					r1.addProperty(p1, "not authorized");
				}
			}
			
			tempModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			tempModel.close();
			tmpstr = new String(caw.toString().getBytes("UTF8"), "UTF8");		
			response.setContentType("text/xml; charset=UTF-8");
			Writer out = response.getWriter();
			out.write(tmpstr);
			out.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
	}
	
	private void getInputParameters (HttpServletRequest request) {

		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else if (reqType.equals("")) {
			reqType = "start";
		}
		
		account = null;
		password = null;

		account = request.getParameter("account");
		password = request.getParameter("password");
		
	}
	
}

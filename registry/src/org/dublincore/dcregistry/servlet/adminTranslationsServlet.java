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

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


public class adminTranslationsServlet extends registryServlet {

	private String reqType = null;
	private String item = null;
	private String description = null;
	private String uiSupport = null;
	private String rsSupport = null;
	private String language = null;
	private String country = null;
	private String uiStyle = null;
	private String uiLang = null;
	private String resultsLang = null;
	private static boolean supported = true;
	private static boolean notSupported = false;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {

		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "uiSupport");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "rsSupport");
			
			if (reqType.equals("update")) {
				String tlang = "http://dublincore.org/registry/" + item.trim();
				Resource r3 = rdbModel.getResource(tlang);
				SimpleSelector s1 = new SimpleSelector(r3, null, (Object) null);
				StmtIterator sti = rdbModel.listStatements(s1);				
				while (sti.hasNext()) {
					Statement stmt = (Statement) sti.next();
					rdbModel.remove(stmt);
				}
				r3 = rdbModel.createResource(tlang);
				r3.addProperty(DC.description, description, item);
				if (uiSupport != null) {
					r3.addProperty(p1, supported);
				} else {
					r3.addProperty(p1, notSupported);
				}
				
				if (rsSupport != null) {
					r3.addProperty(p2, supported);
				} else {
					r3.addProperty(p2, notSupported);
				}
			}
			
			if (reqType.equals("delete")) {
				String tlang = "http://dublincore.org/registry/" + item.trim();
				Resource r3 = rdbModel.getResource(tlang);
				SimpleSelector s1 = new SimpleSelector(r3, null, (Object) null);
				StmtIterator sti = rdbModel.listStatements(s1);				
				while (sti.hasNext()) {
					Statement stmt = (Statement) sti.next();
					rdbModel.remove(stmt);
				}
			}
			
			if (reqType.equals("add")) {
				String rfcCode = language.substring(0, 2) + "-" + country;
				String tlang = "http://dublincore.org/registry/" + rfcCode;
				System.out.println(tlang);
				Resource r3 = rdbModel.createResource(tlang);
				r3.addProperty(DC.description, language.substring(2), rfcCode);
				if (uiSupport != null) {
					r3.addProperty(p1, supported);
				} else {
					r3.addProperty(p1, notSupported);
				}
				
				if (rsSupport != null) {
					r3.addProperty(p2, supported);
				} else {
					r3.addProperty(p2, notSupported);
				}
			}			
			
			// generate list of all supported languages
			SimpleSelector s1 = new SimpleSelector(null, null, (Object) null);
			tempModel = rdbModel.query(s1);
			
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			rdbModel.close();
			tempModel.close();
	
			//System.out.println(caw);
			transform(response, caw, "admin-translations.xsl");

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}	
	}
	
	
	protected ArrayList getSupportedLanguages (ModelRDB rdbModel, Property p1) {
		
		ArrayList rList = new ArrayList();
		
		try {
			SimpleSelector s1 = new SimpleSelector(null, p1, supported);
			StmtIterator sti = rdbModel.listStatements(s1);
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				SimpleSelector s2 = new SimpleSelector((Resource) stmt.getSubject(), DC.description, (String) null);
				StmtIterator sti2 = rdbModel.listStatements(s2);
				while (sti2.hasNext()) {
					Statement stmt2 = (Statement) sti2.next();
					String lang = new String((String) stmt.getSubject().toString() + "," +
						stmt2.getLiteral().getLexicalForm());
					rList.add(lang);					
				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		Collections.sort(rList);
		return rList;
	}
	

	protected void setXSLTParms (Transformer transformer) {

		try {
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			
		} catch (Exception e) {
			System.err.println(e);
		}		
		
	}


	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else {
			item = request.getParameter("item");
			//System.out.println("item: " + item);
			description = request.getParameter("description");
			uiSupport = request.getParameter("uiSupport");
			//System.out.println("uiSupport: " + uiSupport);
			rsSupport = request.getParameter("rsSupport");
			//System.out.println("rsSupport: " + rsSupport);
			language = request.getParameter("language");
			country = request.getParameter("country");
		}

		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
	}

}

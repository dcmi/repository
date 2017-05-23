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


public class preferenceServlet extends registryServlet {

	String reqType = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	static boolean supported = true;
	public static final int SECONDS_PER_YEAR = 60*60*24*365;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {

		HttpSession session = request.getSession(true);
		getInputParameters(request, response, session);
		//logger.info(session.getId() + ", " + request.getRemoteAddr());
		
		try {
			if (reqType.equals("setPreferences")) {
				logger.info(session.getId() + ", " + request.getRemoteAddr());
				gotoPage("/navigateServlet", request, response);
			} else {
				Class.forName(JDBCDriver);
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
				Model tempModel = ModelFactory.createDefaultModel();
				
				Resource r1 = tempModel.createResource("http://dublincore.org/registry/uiSupport");
				Resource r2 = tempModel.createResource("http://dublincore.org/registry/rsSupport");
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "uiSupport");
				Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "rsSupport");
			
				ArrayList rList = getSupportedLanguages(rdbModel, p1);
				for (int i=0; i < rList.size(); i++) {
					String s = (String) rList.get(i);
					//http://dublincore.org/registry/ca-ES,Castellano
					String lang = new String(s.substring(37) + " [" + s.substring(31, 36) + "]");
					//System.out.println(lang);
					r1.addProperty(DC.description, lang);
				}
				
				rList = getSupportedLanguages(rdbModel, p2);
				for (int i=0; i < rList.size(); i++) {
					String s = (String) rList.get(i);
					String lang = new String(s.substring(37) + " [" + s.substring(31, 36) + "]");
					r2.addProperty(DC.description, lang);
				}
				
				CharArrayWriter caw = new CharArrayWriter();
				tempModel.write(caw, "RDF/XML");
				rdbModel.close();
				tempModel.close();
		
				//System.out.println(caw);
				transform(response, caw, preference_xsl);
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
					String lang= new String((String) stmt.getSubject().toString() + "," +
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
			transformer.setParameter("docRoot", getServletContext().getRealPath("/"));
			transformer.setParameter("docRoot", rootdir);			
		} catch (Exception e) {
			System.err.println(e);
		}		
		
	}


	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		}
		
		uiStyle = "std";

		uiLang = request.getParameter("uiLang");
		if (uiLang == null) {
			uiLang = (String) session.getAttribute("uiLang");
			if (uiLang == null) { 	
				uiLang = defaut_ui_lang;
			} 
		}

		resultsLang = request.getParameter("resultsLang");
		if (resultsLang == null) {
			resultsLang = (String) session.getAttribute("resultsLang");
			if (resultsLang == null) { 	
				resultsLang = defaut_rs_lang;
			} 
		}
	
		session.setAttribute("uiStyle", uiStyle);
		session.setAttribute("uiLang", uiLang);
		session.setAttribute("resultsLang", resultsLang);
		
		try {
			setCookie(request, response, "uiLang", uiLang, SECONDS_PER_YEAR);
			setCookie(request, response, "resultsLang", resultsLang, SECONDS_PER_YEAR);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

}

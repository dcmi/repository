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
 *  M.Nagamori  <nagamori@slis.tsukuba.ac.jp>
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
import java.text.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


/**
* This servlet is used to display a summary of the registry.
* This is called by adminServlet.
*/
public class adminServlet extends registryServlet {
	
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, collection_model);
			Model resultsModel = ModelFactory.createDefaultModel();

			Resource subject = resultsModel.createResource();
			Property adminProperty = ResourceFactory.createProperty("http://dublincore.org/registry/", "collection");
			StmtIterator iter = rdbModel.listStatements();
			while (iter.hasNext()) {
				Statement stmt = (Statement) iter.next();         
				RDFNode object = stmt.getObject();    
				subject.addProperty(adminProperty, object.toString());	 
			}
			
			rdbModel.close();
			CharArrayWriter caw = new CharArrayWriter();
			resultsModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			resultsModel.close();
			transform(response, caw, "admin-start.xsl");
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}

	}
	
	
	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
	}
	
	
	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
	}
}

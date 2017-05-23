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

package org.dublincore.dcregistrylt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;


/**
* This servlet is used to display a summary of the registry.
* This is called by adminServlet.
*/
public class adminServlet extends registryServlet {
	
	String uiLang = null;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}
		
		try {
			Model resultsModel = ModelFactory.createDefaultModel();
			Resource subject = resultsModel.createResource();
			Property adminProperty = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "collection");
			StmtIterator iter = collectionsModel.listStatements();
			while (iter.hasNext()) {
				Statement stmt = (Statement) iter.next();         
				RDFNode object = stmt.getObject();    
				subject.addProperty(adminProperty, object.toString());
				//System.out.println("stmt: " + object.toString());
			}
			
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(resultsModel);
			resultsModel.write(caw, "RDF/XML");
			resultsModel.close();
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/admin-start.xsl\" ?>";
			String xmlparms = "<?params uiLang=\"" + uiLang + "\"" + " ?>";
			String xmlout = xmlheadr + xmlstyle + xmlparms + caw.toString();
			
			response.setContentType("text/xml; charset=UTF-8");               
			PrintWriter out = response.getWriter();
			//System.out.println(xmlout);
			out.write(xmlout);
			out.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		uiLang = get_uiLang_Preference(request,session);
	}
}

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


import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.util.*;
 
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;



public class navigateServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String action = null;
	String reqType = null;
	String address = null;
	
	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
			
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);

		try {
			if (action.equals("navigate")) {
				session.setAttribute("action", "navigate");
				if (reqType != null) {
					address = "/" + reqType;
					gotoPage (address, request, response);
				}
			} else if (action.equals("search")) {
				session.setAttribute("action", "search");
				address = "/" + "queryServlet";
				gotoPage (address, request, response);
			}
	
			Model tempModel = ModelFactory.createDefaultModel();
			//tempModel.add(getExtensions(uiStyle));
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			tempModel.close();
			transform(response, caw, query_xsl);
			
		} catch (Exception e) {
			 System.err.println(e);
			 e.printStackTrace();
		}
	}
	
	
	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("reqType", "start");
			transformer.setParameter("action", action);
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			transformer.setParameter("docRoot", rootdir);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
		
	}
	
	
	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		action = null;
		action = (String) request.getParameter("action");
		if (action == null) {	
			action = "navigate";
		} 
		
		reqType = request.getParameter("reqType");
		if (reqType != null) {
			if (reqType.equals("setPreferences")) {
				reqType = null;
			}
		}
		
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
	}					
}

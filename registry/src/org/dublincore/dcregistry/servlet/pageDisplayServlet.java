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
import java.text.BreakIterator;
import java.sql.Connection;
import java.sql.DriverManager;  

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


public class pageDisplayServlet extends registryServlet  {
	
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String page = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, response, session);
	
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			tempModel.close();
			transform(response, caw, page);
				
		} catch (Exception e) {
			 System.err.println(e);
			 e.printStackTrace();
		} 
	}
					
	protected void setXSLTParms (Transformer transformer) {

		try {
			transformer.setParameter("uiLang", uiLang);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
		
	}
	
	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
		
		page = request.getParameter("page");

	}
		
}

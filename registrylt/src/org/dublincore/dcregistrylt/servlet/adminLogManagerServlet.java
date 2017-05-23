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

package org.dublincore.dcregistrylt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;


public class adminLogManagerServlet extends registryServlet  {
	
	String reqType = null;
	String rollWeb = null;
   
	 public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		if (!isAuthorized(request, response)){
		    gotoPage("/adminLoginServlet", request, response);
		}
		 
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		String displayMsg = null;
		if (!reqType.equals("start"))
			displayMsg = validateInput();
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Resource r1 = tempModel.createResource("http://dublincore.org/dcregistrylt/appl_log");
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "hasStatus");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "currentLog");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "oldLog");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "displayMsg");
			
			if (reqType.equals("start")) {	
				if (lfn == null)
					r1.addProperty(p2, "not opened");
				else
					r1.addProperty(p2, lfn);
				
				if (displayMsg != null) {
					r1.addProperty(p4, displayMsg);
				}
				
			} else if (reqType.equals("roll")) {			
				if (rollWeb.equals("Y")) {
					//roll application log
					r1.addProperty(p3, lfn);
					boolean recycleOK = newLogHandler();
					if (recycleOK) {
						//System.out.println("Application Log recycled.");
						r1.addProperty(p1, "complete");
						r1.addProperty(p2, lfn);
					} else {
						System.out.println("Application Log recycle failed!");
						r1.addProperty(p1, "failed");
					}
				}
			}
			
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			tempModel.close();
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/admin-logManager.xsl\" ?>";
			String xmlout = xmlheadr + xmlstyle + caw.toString();
			
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
	
	protected String validateInput () {
		
		String msg = null;
		if (!rollWeb.equals("Y")) {
			msg = "Nothing to do!";
			reqType = "start";
		}
		
		return msg;
	}
			
	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else if (reqType.equals("")) {
			reqType = "start";
		}
		
		rollWeb = request.getParameter("rollWeb");
		if (rollWeb == null) {
			rollWeb = "N";
		} else if (rollWeb.equals("")) {
			rollWeb = "N";
		}
	}
	
}

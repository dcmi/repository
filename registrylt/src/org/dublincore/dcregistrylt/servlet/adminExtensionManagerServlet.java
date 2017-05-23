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

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;


public class adminExtensionManagerServlet extends registryServlet  {

	String reqType = null;
	String uiLang = null;
	String item = null;
	String seq_number = null;
	String label = null;
	String java_class = null;
	String stylesheet = null;
	String prop = null;
	String prop_value = null;
	String prop_value_type = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		String extensions_xsl = "adminExtensionManager.xsl";
		boolean extensionsChanged = false;
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}

		try {
			Model tempModel = ModelFactory.createDefaultModel();
				
			if (reqType.equals("update")) {
				deleteExtension();				
				StringBuffer td = formatDate();
				addExtension(td);
				tempModel = extensionsModel.query(new SimpleSelector(null, null, (Object) null));
				extensions_xsl = "adminExtensionManager.xsl";
				extensionsChanged = true;
			}  else if (reqType.equals("edit")) {
				Resource r1 = extensionsModel.getResource(item.trim());
				SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
				tempModel = extensionsModel.query(s1);				
				extensions_xsl = "adminEditExtension.xsl";
			}  else if (reqType.equals("new")) {
				extensions_xsl = "adminNewExtension.xsl";
			}  else if (reqType.equals("add")) {
				StringBuffer td = formatDate();
				addExtension(td);
				tempModel = extensionsModel.query(new SimpleSelector(null, null, (Object) null));
				extensions_xsl = "adminExtensionManager.xsl";
				extensionsChanged = true;
			}  else if (reqType.equals("delete")) {
				deleteExtension();				
				tempModel = extensionsModel.query(new SimpleSelector(null, null, (Object) null));
				extensions_xsl = "adminExtensionManager.xsl";
				extensionsChanged = true;				
			} else {			
				tempModel = extensionsModel.query(new SimpleSelector(null, null, (Object) null));
			}
			
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(tempModel);
			tempModel.write(caw, "RDF/XML");
			tempModel.close();
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/" + extensions_xsl + "\" ?>";
			String xmlparms = "<?params reqType=\"" + reqType + "\"" + " uiLang=\"" + uiLang + "\"" + " ?>";
			String xmlout = xmlheadr + xmlstyle + xmlparms + caw.toString();
			
			response.setContentType("text/xml; charset=UTF-8");               
			PrintWriter out = response.getWriter();
			//System.out.println(xmlout);
			out.write(xmlout);
			out.close();
			
			if (extensionsChanged) {
				String rootdir = getServletContext().getRealPath("/");
				BufferedWriter file_out = new BufferedWriter(new FileWriter(rootdir + "RDF/extensions/extensions.rdf"));
				file_out.write(xmlheadr + caw.toString());
				file_out.close();
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public StringBuffer formatDate() {
	
		StringBuffer td = new StringBuffer();
		try {
			Calendar tDate = new GregorianCalendar();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append(tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		return td;
	}
	
	public void deleteExtension() {
		
		try {		
			ArrayList sList = new ArrayList();
			Resource r1 = extensionsModel.getResource(item.trim());
			StmtIterator si = extensionsModel.listStatements(new SimpleSelector(r1, null, (Object) null));
			while (si.hasNext()) {
				sList.add(si.nextStatement());
			}
			
			for (int i=0; i < sList.size(); i++) {
				Statement stmt = (Statement) sList.get(i);
				extensionsModel.remove(stmt);
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public void addExtension(StringBuffer td) {
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Resource r1 = extensionsModel.createResource("http://dublincore.org/dcregistrylt/" + td.toString());
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "prop");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "prop_value");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "class");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "stylesheet");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "seq_number");
			
			if (prop != null && prop_value != null) {
				RDFNode o1 = tempModel.createResource(prop);
				r1.addProperty(p1, o1);
				if (prop_value_type.equals("R")) {
					RDFNode o2 = tempModel.createResource(prop_value);
					r1.addProperty(p2, o2);	
				} else {
					r1.addProperty(p2, prop_value);
				}
			}
			
			if (label != null && java_class != null && stylesheet != null && seq_number != null) {
				r1.addProperty(RDFS.label, label);
				r1.addProperty(p3, java_class);
				r1.addProperty(p4, stylesheet);
				r1.addProperty(p5, seq_number);
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		reqType = null;
		try {
			uiLang = get_uiLang_Preference(request,session);	
			reqType = request.getParameter("reqType");
			if (reqType == null) {
				reqType = "start";
			} else {
				item = request.getParameter("item");
				seq_number = request.getParameter("seq_number");
				label = request.getParameter("label");
				java_class = request.getParameter("java_class");
				stylesheet = request.getParameter("stylesheet");
				prop = request.getParameter("prop");
				//if (prop.equals(""))
				//	prop = null;
				prop_value = request.getParameter("prop_value");
				if (prop_value.equals(""))
					prop_value = null;
				prop_value_type = request.getParameter("prop_value_type");
			}
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
		
}

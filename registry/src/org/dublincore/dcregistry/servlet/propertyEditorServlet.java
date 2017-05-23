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
 *  M.Nagamori    <nagamorm@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.mail.*;
import javax.mail.internet.*;

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


public class propertyEditorServlet extends registryServlet  {

    String reqType = null;
    String uiStyle = null;
    String uiLang = null;
    String resultsLang = null;

    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	res.setContentType("text/html; charset=UTF-8");
	HttpSession session = req.getSession(true);
	getInputParameters(req, session);      
		
	try {
		Model tempModel = ModelFactory.createDefaultModel();
		CharArrayWriter caw = new CharArrayWriter();
		tempModel.write(caw, "RDF/XML");
		tempModel.close();
		//System.out.println(caw);
		transform(res, caw, "admin-property-editor.xsl");
	} catch (Exception e) {
		System.err.println(e);
		e.printStackTrace();
	}
    }
    

    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	HttpSession session = req.getSession(true);
	getInputParameters(req, session);

	try {
		CharArrayWriter caw;
		String function = req.getParameter("function");
		if (function!=null && function.equals("create")) {
			String asfile = req.getParameter("asfile");
			if (asfile != null && asfile.equals("true")) {
				if (isMSIE(req)) {
					res.setContentType("application/octetstream;");
					res.setHeader("Content-Disposition", "inline; filename=\"results.properties\"");
					res.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
					res.setHeader("Pragma", "public");
				} else {
					res.setContentType("application/octet-stream;");
					res.setHeader("Content-Disposition", "inline; filename=\"results.properties\"");
					res.setHeader("Pragma", "no-cache");
				}
				
				PrintWriter out = res.getWriter();
				String names[] = req.getParameterValues("pname");
				String values[] = req.getParameterValues("newval");
				for (int i = 0; i<names.length; i++) {
					String name = escape(names[i], "&");
					String val  = escape(values[i], "&");
					out.println(name + " = " + val);
				}
			} else {
				res.setContentType("text/html; charset=UTF-8");
				caw = createNewPropertiesFile(req);
				transform(res, caw, "admin-property-editor.xsl");
			}
		} else {
			res.setContentType("text/html; charset=UTF-8");
			caw = parsePropertiesFile(req);
			transform(res, caw, "admin-property-editor.xsl");
		}
		
	} catch (Exception e) {
	    System.err.println(e);
		e.printStackTrace();
	}
    }
    

    public boolean isMSIE (HttpServletRequest req) {
	boolean ret = false;
	String agent = req.getHeader("user-agent");
	if (agent != null && agent.indexOf("MSIE") > -1) {
		ret = true;
	}
	
	return ret;
    }
    

    public CharArrayWriter createNewPropertiesFile (HttpServletRequest req) throws IOException, RDFException {
	String names[] = req.getParameterValues("pname");
	String values[] = req.getParameterValues("newval");
	
	CharArrayWriter caw = new CharArrayWriter();
	Model model = ModelFactory.createDefaultModel();
	Resource root = model.createResource("http://dublincore.org/Registry#after");
	Property p_element = model.createProperty("http://dublincore.org/Registry#element");
	Property p_name = model.createProperty("http://dublincore.org/Registry#name");
	Property p_val = model.createProperty("http://dublincore.org/Registry#value");
	
	for (int i = 0; i<names.length; i++) {
		String name = names[i];
		String val  = values[i];
		
		Resource resource = model.createResource();
		root.addProperty(p_element, resource);
		
		//resource.addProperty(p_name, name);
		resource.addProperty(p_name, escape(name));
		resource.addProperty(p_val, escape(val));
	}
	
	model.write(caw, "RDF/XML");
	model.close();
	
	return caw;
    }
    

    public CharArrayWriter parsePropertiesFile (HttpServletRequest req) throws IOException, RDFException{

	int ind = req.getContentType().indexOf("boundary=");
	String boundary = req.getContentType().substring(ind+9);
	MultiPart mp = new MultiPart();
	Hashtable ctt_tbl = mp.parse(boundary, req.getInputStream());
	
	Properties p = new Properties();
	String ctt_str = (String)ctt_tbl.get("filedata");
	InputStream is = new ByteArrayInputStream(ctt_str.getBytes());
	p.load(is);
	
	CharArrayWriter caw = new CharArrayWriter();
	Model model = ModelFactory.createDefaultModel();       
	Resource root = model.createResource("http://dublincore.org/Registry#before");
	Property p_element = model.createProperty("http://dublincore.org/Registry#element");
	Property p_name = model.createProperty("http://dublincore.org/Registry#name");
	Property p_val = model.createProperty("http://dublincore.org/Registry#value");
	
	ArrayList rList = new ArrayList();
	Enumeration pnames = p.propertyNames();
	while (pnames.hasMoreElements()) {
		rList.add((String)pnames.nextElement());
	}
	Collections.sort(rList);

	for (int i=0; i<rList.size(); i++) {
		String name = (String)rList.get(i);
		String val  = p.getProperty(name);
		
		Resource resource = model.createResource();
		root.addProperty(p_element, resource);
		
		resource.addProperty(p_name, name);
		resource.addProperty(p_val, val);
	}

	model.write(caw, "RDF/XML");
	model.close();

	return caw;
    }
    
    
    private String escape(String str) {
	    return escape(str, "&amp;");
    }
    

    private String escape(String str, String amp) {
	StringBuffer buf = new StringBuffer();
	int i = 0;
	for (i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if ((int)c > 0x80) { // is NOT ascii
			buf.append(amp + "#x").append(Integer.toString((int)c, 16)).append(";");
		} else { // is ascii
			switch (c) {
				case '&': buf.append("&amp;"); break;
				case '<': buf.append("&lt;"); break;
				case '>': buf.append("&gt;"); break;
				case '"': buf.append("&quot;"); break;
				default:  buf.append(c);
			}
		}
	}
	
	return buf.toString();
    }
    

    private String tagFilter(String s){
	if((s.indexOf('<') == -1)&&(s.indexOf('>') == -1)){
		return s;
	}
	
	StringBuffer sb = new StringBuffer();
	for(int i=0; i<s.length() ;i++){
		char c = s.charAt(i);
		if(c == '<'){sb.append("&lt;");}
		else if(c == '>'){sb.append("&gt;");}
		else {sb.append(c);}
	}
	
	return sb.toString();
    }
    

    protected void setXSLTParms (Transformer transformer) {
	try {
		transformer.setParameter("uiStyle", uiStyle);
		transformer.setParameter("uiLang", uiLang);
		transformer.setParameter("resultsLang", resultsLang);
		transformer.setParameter("docRoot", getServletContext().getRealPath("/"));
	} catch (Exception e) {
		System.err.println(e);
		e.printStackTrace();
	}		
    }
    

    public void getInputParameters (HttpServletRequest request, HttpSession session) {

	reqType = request.getParameter("reqType");
	if (reqType == null) {
		reqType = "start";
	}

	uiStyle = "std";
	uiLang = get_uiLang_Preference(request,session);
	resultsLang = get_resultsLang_Preference(request,session);

	session.setAttribute("uiStyle", uiStyle);
	session.setAttribute("uiLang", uiLang);
	session.setAttribute("resultsLang", resultsLang);
    }

}



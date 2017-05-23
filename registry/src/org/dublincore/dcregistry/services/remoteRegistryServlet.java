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

package org.dublincore.dcregistry.services;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

import org.w3c.dom.*;
import javax.xml.transform.dom.*;
import javax.xml.parsers.*;
import org.apache.xpath.*;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


public class remoteRegistryServlet extends HttpServlet {
	
	protected String db_user;
	protected String db_password;
	protected String db_uri;
	protected String JDBCDriver;
	protected String registry_model;
	protected String provenance_model;
	protected String translations_model;
	protected String collection_model;
	protected String account_model;
	protected String remote_model;
	protected String db_type;
	protected String defaut_ui_lang;
	protected String defaut_rs_lang;
	protected String provenance;

	/**
	* Constructor
	* <p>
	* Read the JDBC property file and set JDBC parameters
	* @param config 				Servlet config
	* @return						void 
	**/
	public void init(ServletConfig config) throws ServletException {	
		
		super.init(config);	

		try {
			String rootdir = getServletContext().getRealPath("/");
			String propertyFile = rootdir + "WEB-INF/" + "jdbc.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);
	
			db_user = p.getProperty("db_user");
			db_password = "";
			db_uri = p.getProperty("db_uri");
			JDBCDriver = p.getProperty("JDBCDriver");
			registry_model = p.getProperty("registry_model");
			provenance_model = p.getProperty("provenance_model");
			collection_model = p.getProperty("collection_model");
			translations_model = p.getProperty("translations_model");
			account_model = p.getProperty("account_model");
			remote_model = p.getProperty("remote_model");
			db_type = p.getProperty("db_type");
			defaut_ui_lang = p.getProperty("defaut_ui_lang");
			defaut_rs_lang = p.getProperty("defaut_rs_lang");
			provenance = p.getProperty("provenance");
	
		} catch (Exception e) {
	   	System.err.println(e);
		}
				
	}


	/**
	* doGet method
	* <p>
	* Forward all get requests to the post method 
	* (must be provided by entending classes)
	* @param request	 				HTTP request
	* @param response 				HTTP response
	* @return							request, response 
	**/
	public void doGet (HttpServletRequest request, 
		HttpServletResponse response)
			throws ServletException, IOException  {
		
		this.doPost(request, response);
	}

	
	public void transform (HttpServletResponse response, CharArrayWriter caw, String reportXSL) 
		throws ServletException, IOException {

		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	
			TransformerFactory tFactory = TransformerFactory.newInstance();
			// Get the XML input document and the stylesheet.
			Source xmlSource = new StreamSource(new CharArrayReader(caw.toCharArray()));
			String fn = getServletContext().getRealPath("/") + "/xsl/" + reportXSL;
			Source xslSource = new StreamSource(new File(fn));
						
			// Generate the transformer.
			Transformer transformer = tFactory.newTransformer(xslSource);
			
			// Set required parameters
			setXSLTParms(transformer);
						
			// Perform the transformation, sending the output to the response.
			transformer.transform(xmlSource, new StreamResult(out));
		} catch (Exception e) {
         System.err.println(e);
      }		
		
   }


	public void transform (HttpServletResponse response, String reportXML, String reportXSL) 
		throws ServletException, IOException {

		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	
			TransformerFactory tFactory = TransformerFactory.newInstance();
			// Get the XML input document and the stylesheet.
			String xml_fn = getServletContext().getRealPath("/") + "/xsl/" + reportXML;
			Source xmlSource = new StreamSource(new File(xml_fn));

			String fn = getServletContext().getRealPath("/") + "/xsl/" + reportXSL;
			Source xslSource = new StreamSource(new File(fn));
						
			// Generate the transformer.
			Transformer transformer = tFactory.newTransformer(xslSource);
			
			// Set required parameters
			setXSLTParms(transformer);
						
			// Perform the transformation, sending the output to the response.
			transformer.transform(xmlSource, new StreamResult(out));
		} catch (Exception e) {
         System.err.println(e);
      }		
		
   }


	public void transform (HttpServletResponse response, CharArrayWriter caw, String reportXSL,
		String[] inputData) throws ServletException, IOException {

		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	
			TransformerFactory tFactory = TransformerFactory.newInstance();
			// Get the XML input document and the stylesheet.
			Source xmlSource = new StreamSource(new CharArrayReader(caw.toCharArray()));
			String fn = getServletContext().getRealPath("/") + "/xsl/" + reportXSL;
			Source xslSource = new StreamSource(new File(fn));
						
			// Generate the transformer.
			Transformer transformer = tFactory.newTransformer(xslSource);
			
			// Set required parameters
			setXSLTParms(transformer, inputData);
						
			// Perform the transformation, sending the output to the response.
			transformer.transform(xmlSource, new StreamResult(out));
		} catch (Exception e) {
         System.err.println(e);
      }		
		
   }
	 
	 
	 public void transform (HttpServletResponse response, Document doc, String reportXSL) 
		throws ServletException, IOException {

		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	
			TransformerFactory tFactory = TransformerFactory.newInstance();
			// Get the XML input document and the stylesheet.
			Source xmlSource = new DOMSource(doc);
			String fn = getServletContext().getRealPath("/") + "/xsl/" + reportXSL;
			Source xslSource = new StreamSource(new File(fn));
						
			// Generate the transformer.
			Transformer transformer = tFactory.newTransformer(xslSource);
			
			// Set parameters to pass to the stylesheet
			setXSLTParms(transformer);
						
			// Perform the transformation, sending the output to the response.
			transformer.transform(xmlSource, new StreamResult(out));
		} catch (Exception e) {
         System.err.println(e);
      }		
		
   }


	protected void setXSLTParms (Transformer transformer) {   }

	protected void setXSLTParms (Transformer transformer, String[] inputData) {   }
 

	/**
	* Get the cookies from user session and search for a specific one 
	* <p>
	* Gets the cookies from the user session and evaluates each one
	* looking for a match on the cookie name and the String parameter
	* passed to the method.
	* @param request  HTTP request 
   * @param s			cookie name to search for     
	* @return        	account name (if logged-in) or void (if not logged-in)
	**/
	public String getCookie(HttpServletRequest request, String s) {
	
		Cookie[] cookies = request.getCookies();
		String account = null; 
	
		if (cookies != null && cookies.length > 0) { 
			for(int i=0; i<cookies.length; i++) {
			   if (cookies[i].getName().equals(s)) {
			      account = cookies[i].getValue();
			   }
			}
		}
	
		return account;
	} 


	/**
	* Set the user account cookie 
	* <p>
	* Sets the user account cookie, indicating the user has logged-in
	* @param request  HTTP request 
	* @param response HTTP response
   * @param s			cookie name to write     
	* @return        	void
	**/
	public void setCookie(HttpServletRequest request, HttpServletResponse response, String s)
		throws ServletException, IOException  {
	
		Cookie[] cookies = request.getCookies();
		Cookie loginCookie = null; 
		
		if (cookies != null && cookies.length > 0) { 
			for(int i=0; i<cookies.length; i++) {
			   if (cookies[i].getName().equals("registryUser")) {
			      loginCookie = cookies[i];
			   }
			}
		}
		
		if (loginCookie == null) {
		   loginCookie = new Cookie("registryUser", s);
		} else {
		  loginCookie.setValue(s);
		}
		
		response.addCookie(loginCookie);
	}


	/**
	* Dispatch request to another servlet 
	* <p>
	* Forward the request to the requested servlet
	* @param s			name of servlet to forward to 
	* @param request  HTTP request 
	* @param response HTTP response    
	* @return        	void
	**/
	public void gotoPage (String address, HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		RequestDispatcher dispatcher = 
	   	 getServletContext().getRequestDispatcher(address);
				dispatcher.forward(request, response);
   }
	 
	 
	 protected void writeFile(String saveFileName, String inFile) throws IOException {
		
		File rdfFile = new File(saveFileName);
		if (rdfFile.createNewFile()) {
			System.out.println("RDF file: " + saveFileName + " opened for output");
		} else {
			System.out.println("Failed to open RDF file: " + saveFileName);
		}

		FileOutputStream out = new FileOutputStream(rdfFile);
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeBytes(inFile);
	}
	
}



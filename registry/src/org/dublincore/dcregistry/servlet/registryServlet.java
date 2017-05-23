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
 *  M.Nagamori  <nagamorm@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.text.BreakIterator;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


public class registryServlet extends HttpServlet {
	
	//static final String LOGIN_NEXT_PAGE = "nextPage";
	protected String rootdir;
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
	protected String canonical_model;
	protected String extensions_model;
	protected String db_type;
	protected String defaut_ui_lang;
	protected String defaut_rs_lang;
	protected String provenance;
	protected String appLog;
	protected String restLog;
	protected String axisLog;
	protected String summary_xsl;
	protected String detail_xsl;
	protected String documents_xsl;
	protected String translations_xsl;
	protected String refinements_xsl;
	protected String query_xsl;
	protected String preference_xsl;
	protected String properties_xsl;
	protected String provenance_xsl;
	protected String searchResults_xsl;
	protected String encodingSchemes_xsl;
	protected String elements_xsl;
	protected String termsOverview_xsl;
	protected String controlledTerms_xsl;
	protected String classes_xsl;
	protected static String lfn = null;
	protected static Logger logger;
	private static boolean logFileOpen = false;


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
			rootdir = getServletContext().getRealPath("/");
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
			canonical_model = p.getProperty("canonical_model");
			extensions_model = p.getProperty("extensions_model");
			db_type = p.getProperty("db_type");
			defaut_ui_lang = p.getProperty("defaut_ui_lang");
			defaut_rs_lang = p.getProperty("defaut_rs_lang");
			provenance = p.getProperty("provenance");
			appLog = p.getProperty("appLog");
			restLog = p.getProperty("restLog");
			axisLog = p.getProperty("axisLog");
			summary_xsl = p.getProperty("summary_xsl");
			detail_xsl = p.getProperty("detail_xsl");
			documents_xsl = p.getProperty("documents_xsl");
			translations_xsl = p.getProperty("translations_xsl");
			refinements_xsl = p.getProperty("refinements_xsl");
			query_xsl = p.getProperty("query_xsl");
			preference_xsl = p.getProperty("preference_xsl");
			properties_xsl = p.getProperty("properties_xsl");
			provenance_xsl = p.getProperty("provenance_xsl");
			searchResults_xsl = p.getProperty("searchResults_xsl");
			encodingSchemes_xsl = p.getProperty("encodingSchemes_xsl");
			elements_xsl = p.getProperty("elements_xsl");
			termsOverview_xsl = p.getProperty("termsOverview_xsl");
			controlledTerms_xsl = p.getProperty("controlledTerms_xsl");
			classes_xsl = p.getProperty("classes_xsl");
			
			if (!logFileOpen) {
				getRegistryLogger();
				logFileOpen = true;
			}
	
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
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


	protected void transform (HttpServletResponse response, CharArrayWriter caw, String reportXSL) 
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


	protected void transform (HttpServletResponse response, String reportXML, String reportXSL) 
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


	protected void transform (HttpServletResponse response, CharArrayWriter caw, String reportXSL,
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


	protected void setXSLTParms (Transformer transformer) {   }

	protected void setXSLTParms (Transformer transformer, String[] inputData) {   }
	
	protected String get_uiLang_Preference(HttpServletRequest request, HttpSession session) {
		
		String uiLang = (String) session.getAttribute("uiLang");
		if (uiLang == null) {
			uiLang = getCookie(request, "uiLang");
			if (uiLang == null) {
				uiLang = defaut_ui_lang;
			}
			session.setAttribute("uiLang", uiLang);
		}
		return uiLang;
	}
	
	
	protected String get_resultsLang_Preference(HttpServletRequest request, HttpSession session) {
		
		String resultsLang = (String) session.getAttribute("resultsLang");
		if (resultsLang == null) {
			resultsLang = getCookie(request, "resultsLang");
			if (resultsLang == null) {
				resultsLang = defaut_rs_lang;
			}
			session.setAttribute("resultsLang", resultsLang);
		}
		return resultsLang;
	}
 
	protected String getCookie(HttpServletRequest request, String s) {
	
		Cookie[] cookies = request.getCookies();
		String cookieValue = null; 
	
		if (cookies != null && cookies.length > 0) { 
			for(int i=0; i<cookies.length; i++) {
			   if (cookies[i].getName().equals(s)) {
			      cookieValue = cookies[i].getValue();
			   }
			}
		}
	
		//System.out.println("found cookie: " + cookieValue);
		return cookieValue;
	} 

	protected void setCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue)
		throws ServletException, IOException  {
	
		Cookie[] cookies = request.getCookies();
		Cookie aCookie = null; 
		
		if (cookies != null && cookies.length > 0) { 
			for(int i=0; i<cookies.length; i++) {
			   if (cookies[i].getName().equals(cookieName)) {
			      aCookie = cookies[i];
			   }
			}
		}

		if (aCookie == null) {
		   aCookie = new Cookie(cookieName, cookieValue);
		   response.addCookie(aCookie);
		}
	}
	
	protected void setCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, 
		String cookieValue, int cookieTime) throws ServletException, IOException  {
	
		Cookie[] cookies = request.getCookies();
		Cookie aCookie = null; 
		
		if (cookies != null && cookies.length > 0) { 
			for(int i=0; i<cookies.length; i++) {
			   if (cookies[i].getName().equals(cookieName)) {
			      aCookie = cookies[i];
			   }
			}
		}

		if (aCookie == null) {
			aCookie = new Cookie(cookieName, cookieValue);
			aCookie.setMaxAge(cookieTime);
			response.addCookie(aCookie);
		} else {
			aCookie.setValue(cookieValue);
			aCookie.setMaxAge(cookieTime);
			response.addCookie(aCookie);
		}
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
	protected void gotoPage (String address, HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		RequestDispatcher dispatcher = 
	   	 getServletContext().getRequestDispatcher(address);
				dispatcher.forward(request, response);
	}
   
   
	/**
	* check the user is authorized or not.
	*
	* @param request  HTTP request 
	* @param response HTTP response    
	* @return boolen ret - returns true if the user is authorized.
	**/
	public boolean isAuthorized(HttpServletRequest request, HttpServletResponse response) {
		boolean ret = false;
		String account = getCookie(request, "registryUser");
		if (account != null && account.length() > 0) {
		    ret = true;
		}   
		return ret;
	}
    
	protected void getRegistryLogger() {
		
		try {
			Calendar tDate = new GregorianCalendar();
			StringBuffer td = new StringBuffer();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append("_" + tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
			lfn = new String(appLog + "_" + td.toString());
					
			// Create an appending file handler
			boolean append = true;
			FileHandler handler = new FileHandler(lfn, append);
			
			// Add to the desired logger
			logger = Logger.getLogger("org.dublincore.dcregistry.servlet");
			logger.addHandler(handler);
			System.out.println("Application log file opened: " + lfn);
		
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	protected boolean newLogHandler() {
		try {
			String old_lfn = lfn;
			Calendar tDate = new GregorianCalendar();
			StringBuffer td = new StringBuffer();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append("_" + tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
			lfn = new String(appLog + "_" + td.toString());
			
			boolean append = true;
			FileHandler newHandler = new FileHandler(lfn, append);
			
			java.util.logging.Handler[] handlerArray = logger.getHandlers();
			for (int i = 0; i < handlerArray.length; i++) {
				java.util.logging.Handler currentHandler = handlerArray[i];
				currentHandler.flush();
				currentHandler.close();
				logger.removeHandler(currentHandler); 
			}
			
			logger.addHandler(newHandler);
			System.out.println("Application log file closed: " + old_lfn);
			System.out.println("Application log file opened: " + lfn);
		
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
}

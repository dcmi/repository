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

package org.dublincore.dcregistrylt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.text.BreakIterator;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;


public class registryServlet extends HttpServlet {
	protected String defaut_ui_lang;
	protected String log_level;
	protected String log_dir;
	protected String appLog;
	protected String detail_xsl;
	protected String query_xsl;
	protected String provenance_xsl;
	protected String searchResults_xsl;
	protected static String lfn = null;
	protected static Logger logger;
	private static boolean logFileOpen = false;
	protected static Model registryModel = null;
	protected static Model provenanceModel = null;
	protected static Model canonicalModel = null;
	protected static Model collectionsModel = null;
	protected static Model extensionsModel = null;
	private static boolean modelsLoaded = false;
	private List filelist = new ArrayList();

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
			String propertyFile = rootdir + "WEB-INF/" + "registry.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);

			defaut_ui_lang = p.getProperty("defaut_ui_lang");
			log_level = p.getProperty("log_level");
			log_dir = p.getProperty("log_dir");
			appLog = p.getProperty("appLog");
			detail_xsl = p.getProperty("detail_xsl");
			query_xsl = p.getProperty("query_xsl");
			provenance_xsl = p.getProperty("provenance_xsl");
			
			if (log_dir.equals("."))
				appLog = rootdir + appLog;
			else
				appLog = log_dir + appLog;				
			
			if (!logFileOpen) {
				getRegistryLogger();
				Level logLevel = Level.parse(log_level);
				logger.setLevel(logLevel);
				logFileOpen = true;
			}
			
			if (!modelsLoaded) {
				registryModel = importRDF("registry");
				provenanceModel = importRDF("provenance");
				canonicalModel = importRDF("canonical");
				collectionsModel = importRDF("collections");
				extensionsModel = importRDF("extensions");
				modelsLoaded = true;
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
	
	protected Model importRDF(String modelName) {
			Model tempModel = null;
			Model newModel = null;
			
		try {
			File fn = null;
			newModel = ModelFactory.createDefaultModel();
			fn = new File(getServletContext().getRealPath("/RDF/" + modelName));
			getFileList(fn);
			System.out.println("importing RDF for model: " + modelName);
			JenaReader jr = new JenaReader();
			for (int i=0; i < filelist.size(); i++) {
				String fileURL = "file://" + (String) filelist.get(i);
				//System.out.println("fileURL: " + fileURL);
				tempModel = ModelFactory.createDefaultModel();
				jr.read(tempModel, fileURL);
				StmtIterator si = tempModel.listStatements();
				while (si.hasNext()) {
					Statement stmt = (Statement) si.next();
					Resource subject = (Resource) stmt.getSubject();
					Property predicate = (Property) stmt.getPredicate();
					RDFNode object = (RDFNode) stmt.getObject();
					//rdbModel.add(stmt);
					if (object instanceof Literal)
						newModel.add(subject, predicate, stmt.getLiteral().getLexicalForm().trim(), stmt.getLanguage());		
					else
						newModel.add(stmt);
				}
				tempModel.close();
			}
			filelist = new ArrayList();
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return newModel;
	}

	private void getFileList(File f) {
		if (f.isDirectory()) {			// recurse if a directory
			String entries[] = f.list();
			for (int i = 0; i < entries.length; i++) {
				getFileList(new File(f, entries[i]));
			}
		} else if (f.isFile()) {		// for plain files, add to list
			filelist.add(f.getAbsolutePath());
		}
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
		String account = getCookie(request, "registryLiteAdmin");
		if (account != null && account.length() > 0) {
		    ret = true;
		}   
		return ret;
	}	
	
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
	
	protected void setNSPrefix(Model m) {
		try {
			m.setNsPrefix("dcterms", "http://purl.org/dc/terms/");
			m.setNsPrefix("dctypes", "http://purl.org/dc/dcmitype/");
			m.setNsPrefix("dcreg", "http://dublincore.org/dcregistrylt/");
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	protected String getStylesheet(String s) {
	
		String stylesheet = null;
		
		try {
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "class");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "stylesheet");
			Resource r3 = null;
			Model tempModel = extensionsModel.query(new SimpleSelector(null, p3, s));
			ResIterator ri3 = tempModel.listSubjects();
			if (ri3.hasNext()) {
				r3 = (Resource) ri3.next();
			}
			tempModel = extensionsModel.query(new SimpleSelector(r3, p4, (Object) null));
			StmtIterator st4 = tempModel.listStatements();
			if (st4.hasNext()) {
				Statement stmt = (Statement) st4.next();
				stylesheet = (String) stmt.getLiteral().getLexicalForm();
			}
			tempModel.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	
		return stylesheet;
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
			logger = Logger.getLogger("org.dublincore.dcregistrylt.servlet");
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

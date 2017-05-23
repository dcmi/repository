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

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

import org.dublincore.dcregistrylt.tools.registryDES;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.security.spec.*;

public class adminLoginServlet extends registryServlet {

	String reqType = null;
	String account = null;
	String password = null;
	String uiLang = null;
	private static String ADMIN = null;
	private static String KEY = null;
	private static String PW_ENC = null;
	private static SecretKey key = null;
	
	public void init(ServletConfig config) throws ServletException {	
		
		super.init(config);	

		try {
			String rootdir = getServletContext().getRealPath("/");
			String propertyFile = rootdir + "WEB-INF/" + "registry.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);

			ADMIN = p.getProperty("ADMIN");
			KEY = p.getProperty("KEY");
			PW_ENC = rootdir + p.getProperty("PW_ENC");
			
			File keyfile = new File(rootdir + KEY);
			key = registryDES.readKey(keyfile);
	
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
				
	}

	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		HttpSession session = request.getSession(true);
		getInputParameters(request, response, session);

		if (reqType.equals("login")) {
			try {
				Model loginModel = ModelFactory.createDefaultModel();
				boolean loginOK = false;
				if ((account != null) && (password != null)) {
					if (account.equals(ADMIN) && registryDES.compare(key, PW_ENC, password) == true) {
						loginOK = true;
					}
				}
				
				if (loginOK) {
					setCookie(request, response, "registryLiteAdmin", account);
					String tmp = request.getRequestURL().toString();
					tmp = tmp.substring(0,tmp.lastIndexOf("/"));
					response.sendRedirect(tmp + "/adminServlet");
				} else {
					CharArrayWriter caw = new CharArrayWriter();
					loginModel.write(caw, "RDF/XML");
					loginModel.close();
	
					String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
					String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/admin-login.xsl\" ?>";
					String xmlparms = "<?params uiLang=\"" + uiLang + "\"" + " ?>";
					String xmlout = xmlheadr + xmlstyle + xmlparms + caw.toString();
					
					response.setContentType("text/xml; charset=UTF-8");               
					PrintWriter out = response.getWriter();
					//System.out.println(xmlout);
					out.write(xmlout);
					out.close();
				}
	
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}

		if (reqType.equals("start")) {
			
			try {			
				Model loginModel = ModelFactory.createDefaultModel();
				CharArrayWriter caw = new CharArrayWriter();
				loginModel.write(caw, "RDF/XML");
				loginModel.close();
				
				String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
				String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/admin-login.xsl\" ?>";
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
	}
	

	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, 
		HttpSession session) throws ServletException, IOException {

		reqType = null;
		account = null;
		password = null;
		
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		}

		uiLang = get_uiLang_Preference(request,session);		
		account = getCookie(request, "registryLiteAdmin");
		if (account != null) {
			gotoPage("/adminServlet", request, response);
		} else {
			account = request.getParameter("account");
			password = request.getParameter("password");	
		}
	}

}

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


public class preferenceServlet extends registryServlet {

	String uiLang = null;
	public static final int SECONDS_PER_YEAR = 60*60*24*365;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {

		HttpSession session = request.getSession(true);
		getInputParameters(request, response, session);
		
		try {
			logger.info(session.getId() + ", " + request.getRemoteAddr());
			gotoPage("/navigateServlet", request, response);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		uiLang = request.getParameter("uiLang");
		if (uiLang == null) {
			uiLang = (String) session.getAttribute("uiLang");
			if (uiLang == null) { 	
				uiLang = defaut_ui_lang;
			} 
		}
	
		session.setAttribute("uiLang", uiLang);
		
		try {
			setCookie(request, response, "uiLang", uiLang, SECONDS_PER_YEAR);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

}

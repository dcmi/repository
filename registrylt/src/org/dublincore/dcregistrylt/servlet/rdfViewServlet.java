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


public class rdfViewServlet extends registryServlet  {

	String item = null;
	String lang = null;
	String viewType = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + item + " " + lang + " " + viewType);

		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Model resultsModel = ModelFactory.createDefaultModel();
				 
			Resource r1 = resultsModel.createResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = registryModel.query(s1);
			StmtIterator sti = tempModel.listStatements();
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if (stmt.getObject() instanceof Literal) {								
					if ((stmt.getLanguage() == null) || (stmt.getLanguage().equals("")) ||
						(lang.equals("all"))) {
						resultsModel.add(stmt);
					} else {  	// check for language match
						if (stmt.getLanguage().equals(lang)) {
							resultsModel.add(stmt);
						}	
					}
				} else {
					resultsModel.add(stmt);
				}
			}
			
			tempModel.close();
						
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(resultsModel);
			resultsModel.write(caw, viewType);
			//System.out.println(caw);
			resultsModel.close();
		
			String tmpstr = new String(caw.toString().getBytes("UTF8"), "UTF8");
			if ((viewType.equals("N-TRIPLE")) || (viewType.equals("N3"))) {
				response.setContentType("text/plain; charset=UTF-8");
			} else {
				response.setContentType("text/xml; charset=UTF-8");
			}
			Writer out = response.getWriter();
			out.write(tmpstr);
			out.close();

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}	


	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		item = request.getParameter("item");
		lang = request.getParameter("lang");
		viewType = request.getParameter("viewType");
			if (viewType != null)
				if (viewType.equals(""))
					viewType = "RDF/XML";
		
	}
		
}

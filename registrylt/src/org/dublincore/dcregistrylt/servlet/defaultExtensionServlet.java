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


public class defaultExtensionServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiLang = null;
	String label = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr());

		try {
			Model summaryModel = ModelFactory.createDefaultModel();
			RDFNode obj = null;
			Resource r3 = null;
			Property prop = null;
			String stylesheet = null;	
			Model tempModel = extensionsModel.query(new SimpleSelector(null, RDFS.label, label));
			ResIterator ri3 = tempModel.listSubjects();
			if (ri3.hasNext()) {
				r3 = (Resource) ri3.next();
			}
			tempModel = extensionsModel.query(new SimpleSelector(r3, null, (Object) null));
			StmtIterator st4 = tempModel.listStatements();
			while (st4.hasNext()) {
				Statement stmt = (Statement) st4.next();
				String this_pro = (String) stmt.getPredicate().toString();
				String this_obj = (String) stmt.getObject().toString();
				
				if (this_pro.equals("http://dublincore.org/dcregistrylt/prop")) {
					prop = ResourceFactory.createProperty(this_obj);
				} else if (this_pro.equals("http://dublincore.org/dcregistrylt/prop_value")) {
					obj = summaryModel.createResource(this_obj);
				} else if (this_pro.equals("http://dublincore.org/dcregistrylt/stylesheet")) {
					stylesheet = (String) stmt.getLiteral().getLexicalForm();
				}
			}
			tempModel.close();			
			
			ArrayList rList = new ArrayList();
			String term = null;
			String termname = null;
			ResIterator ri = registryModel.listSubjectsWithProperty(prop, obj);
			while (ri.hasNext()) {
				term = ri.next().toString();
				termname = term.substring(term.lastIndexOf("/")+1);
				rList.add(termname + "," + term);
			}
			
			Collections.sort(rList);
			Bag refs = summaryModel.createBag("http://dublincore.org/dcregistrylt/terms/");
			int itemCount = 0;
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf(",")+1));
				refs.add(r1);
				itemCount++;
			}				
			
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(summaryModel);
			summaryModel.write(caw, "RDF/XML");
			modelSize = Integer.toString(itemCount);
			summaryModel.close();
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/" + stylesheet + "\" ?>";
			String xmlparms = "<?params modelSize=\"" + modelSize + "\"" + " uiLang=\"" + uiLang + "\"" + 
				" label=\"" + label + "\"" + " ?>";
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

	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		uiLang = get_uiLang_Preference(request,session);
		label = request.getParameter("label");
	}
		
}



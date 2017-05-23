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


public class summaryServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiLang = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr());

		try {
			Model summaryModel = ModelFactory.createDefaultModel();
			Model tempModel = ModelFactory.createDefaultModel();
			
			RDFNode ele = summaryModel.createResource("http://dublincore.org/usage/documents/principles/#element");
			RDFNode ref = summaryModel.createResource("http://dublincore.org/usage/documents/principles/#element-refinement");
			RDFNode enc = summaryModel.createResource("http://dublincore.org/usage/documents/principles/#encoding-scheme");
			RDFNode con = summaryModel.createResource("http://dublincore.org/usage/documents/principles/#vocabulary-term");
			RDFNode dc = summaryModel.createResource("http://purl.org/dc/elements/1.1/");
			RDFNode dcterms = summaryModel.createResource("http://purl.org/dc/terms/");
			RDFNode dctypes = summaryModel.createResource("http://purl.org/dc/dcmitype/");
			
			String term = null;
			String sortPhrase = null;
			int itemCount = 0;
			
			// get elements
			ArrayList rList = new ArrayList();
			ResIterator ri = registryModel.listSubjectsWithProperty(DC.type, ele);
			while (ri.hasNext()) {
				term = ri.next().toString();
				sortPhrase = term.substring(term.lastIndexOf("/")+1);
				rList.add(sortPhrase.toLowerCase() + "*" + term);
			}
			
			Collections.sort(rList);
			Bag elements = summaryModel.createBag("http://dublincore.org/dcregistrylt/elements/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				elements.add(r1);
				itemCount++;
			}
			
			// get refinements
			rList = new ArrayList();
			ri = registryModel.listSubjectsWithProperty(DC.type, ref);
			while (ri.hasNext()) {
				term = ri.next().toString();
				sortPhrase = term.substring(term.lastIndexOf("/")+1);
				rList.add(sortPhrase.toLowerCase() + "*" + term);
			}
			
			Collections.sort(rList);
			Bag refinements = summaryModel.createBag("http://dublincore.org/dcregistrylt/refinements/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				refinements.add(r1);
				itemCount++;
			}
			
			// get controlled vocabulary terms
			rList = new ArrayList();
			ri = registryModel.listSubjectsWithProperty(DC.type, con);
			while (ri.hasNext()) {
				term = ri.next().toString();
				sortPhrase = term.substring(term.lastIndexOf("/")+1);
				rList.add(sortPhrase.toLowerCase() + "*" + term);
			}
			
			Collections.sort(rList);
			Bag controlled = summaryModel.createBag("http://dublincore.org/dcregistrylt/controlled/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				controlled.add(r1);
				itemCount++;
			}
			
			// get encoding schemes
			rList = new ArrayList();
			ri = registryModel.listSubjectsWithProperty(DC.type, enc);
			while (ri.hasNext()) {
				term = ri.next().toString();
				sortPhrase = term.substring(term.lastIndexOf("/")+1);
				rList.add(sortPhrase.toLowerCase() + "*" + term);
			}
			
			Collections.sort(rList);
			Bag encoding = summaryModel.createBag("http://dublincore.org/dcregistrylt/encoding/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				encoding.add(r1);
				itemCount++;
			}
			
			// get other (miscellaneous) terms
			rList = new ArrayList();
			SimpleSelector s1 = new SimpleSelector(null, RDFS.isDefinedBy, dc);
			tempModel = registryModel.query(s1);
			tempModel.add(registryModel.query(new SimpleSelector(null, RDFS.isDefinedBy, dcterms)));
			tempModel.add(registryModel.query(new SimpleSelector(null, RDFS.isDefinedBy, dctypes)));
			
			ri = tempModel.listSubjects();
			while (ri.hasNext()) {
				boolean misc_item = true;
				Resource r3 = (Resource) ri.next();
				StmtIterator sti = registryModel.listStatements(r3, DC.type, ref);
				if (sti.hasNext()) {
					misc_item = false;
				} else {
					sti = registryModel.listStatements(r3, DC.type, ele);
					if (sti.hasNext()) {
						misc_item = false;
					} else {
						sti = registryModel.listStatements(r3, DC.type, con);
						if (sti.hasNext()) {
							misc_item = false;
						} else {
							sti = registryModel.listStatements(r3, DC.type, enc);
							if (sti.hasNext()) {
								misc_item = false;
							}
						}
					}
				}
							
				
				if (misc_item) {
					term = r3.toString();
					sortPhrase = term.substring(term.lastIndexOf("/")+1);
					rList.add(sortPhrase.toLowerCase() + "*" + term);
				}
			}
			
			Collections.sort(rList);
			Bag other = summaryModel.createBag("http://dublincore.org/dcregistrylt/other/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				other.add(r1);
				itemCount++;
			}

			String stylesheet = getStylesheet("summaryServlet");			
			
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(summaryModel);
			summaryModel.write(caw, "RDF/XML");
			modelSize = Integer.toString(itemCount);
			summaryModel.close();
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/" + stylesheet + "\" ?>";
			String xmlparms = "<?params modelSize=\"" + modelSize + "\"" + " uiLang=\"" + uiLang + "\"" + " ?>";
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
	}
		
}

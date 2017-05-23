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


public class searchServlet extends registryServlet  {

	String modelSize = "0";
	String searchTerm = null;
	String searchCase = null;
	String searchType = null;
	String uiLang = null;
	String action = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);	
		getInputParameters(request, response, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + searchTerm + " " + searchCase + " " + 
			searchType + " " + uiLang);
		
		if (action.equals("search")) {
			
			try {
				Model tempModel = ModelFactory.createDefaultModel();
				Model resultsModel = ModelFactory.createDefaultModel();
				
				if (searchTerm.length() > 0) {
					
					ResIterator arRI = registryModel.listSubjects();
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "nothing");
				
					if (searchType.equals("any term")) {
						BreakIterator bi = BreakIterator.getWordInstance();
						bi.setText(searchTerm);
		
						int start = bi.first();
						String word;
		
						for (int end = bi.next();
							end != BreakIterator.DONE;
							start = end, end = bi.next()) {
		
							if (Character.isLetterOrDigit(searchTerm.charAt(start))) {
								word = searchTerm.substring(start,end);
								SelectorSearch s1 = new SelectorSearch(word, searchCase, uiLang);
								resultsModel.add(registryModel.query(s1));
								
								//check for a match on resource name
								while (arRI.hasNext()) {
									Resource r1 = (Resource) arRI.next();
									String sr1 = r1.toString();
									String lcSearchTerm = word.toLowerCase();
									
									if (searchCase.equals("Y")) {
										if (sr1.endsWith(word))
											resultsModel.add(r1, p1, "nothing");
									} else {
										String lcSr1 = sr1.toLowerCase();
										if (lcSr1.endsWith(lcSearchTerm))
											resultsModel.add(r1, p1, "nothing");
									}
								}
								
							}
						}
											
					}
	
	
					if (searchType.equals("all terms")) {
						BreakIterator bi = BreakIterator.getWordInstance();
						bi.setText(searchTerm);
		
						int start = bi.first();
						boolean firstPass = true;
						String word = null;
		
						int wordCount = 0;
						for (int end = bi.next();
							end != BreakIterator.DONE;
							start = end, end = bi.next()) {
		
							if (Character.isLetterOrDigit(searchTerm.charAt(start))) {
								word = searchTerm.substring(start,end);
								wordCount++;
								SelectorSearch s1 = new SelectorSearch(word, searchCase, uiLang);
								if (firstPass) {
									firstPass = false;
									resultsModel = registryModel.query(s1);
								} else {
									resultsModel = resultsModel.intersection(registryModel.query(s1));
								}
							}
						}			
						
						if (wordCount == 1) {
							//check for a match on resource name
							while (arRI.hasNext()) {
								Resource r1 = (Resource) arRI.next();
								String sr1 = r1.toString();
								String lcSearchTerm = word.toLowerCase();
								
								if (searchCase.equals("Y")) {
									if (sr1.endsWith(word))
										resultsModel.add(r1, p1, "nothing");
								} else {
									String lcSr1 = sr1.toLowerCase();
									if (lcSr1.endsWith(lcSearchTerm))
										resultsModel.add(r1, p1, "nothing");
								}
							}
						}
					}
		
	
					if (searchType.equals("exact phrase")) {
						SelectorSearch s1 = new SelectorSearch(searchTerm, searchCase, uiLang);
						resultsModel = registryModel.query(s1);
						
						//check for a match on resource name
						while (arRI.hasNext()) {
							Resource r1 = (Resource) arRI.next();
							String sr1 = r1.toString();
							String lcSearchTerm = searchTerm.toLowerCase();
							
							if (searchCase.equals("Y")) {
								if (sr1.endsWith(searchTerm))
									resultsModel.add(r1, p1, "nothing");
							} else {
								String lcSr1 = sr1.toLowerCase();
								if (lcSr1.endsWith(lcSearchTerm))
									resultsModel.add(r1, p1, "nothing");
							}
						}
					}					
				
				}
				
				tempModel.close();
				CharArrayWriter caw = new CharArrayWriter();

				ArrayList sList = new ArrayList();
				Property np = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "nothing");
				StmtIterator sti = resultsModel.listStatements(new SimpleSelector(null, np, "nothing"));
				while (sti.hasNext()) {	
					sList.add(sti.nextStatement());
				}
				for (int i=0; i < sList.size(); i++) {
					Statement nstmt = (Statement) sList.get(i);
					resultsModel.remove(nstmt);
				}

				setNSPrefix(resultsModel);
				resultsModel.write(caw, "RDF/XML");
				modelSize = Long.toString(getModelCount(resultsModel));
				resultsModel.close();
	
				String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
				String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/searchResults.xsl\" ?>";
				String xmlparms = "<?params action=\"" + action + "\"" + " modelSize=\"" + modelSize + "\"" +
				" searchTerm=\"" + searchTerm + "\"" + " uiLang=\"" + uiLang + "\"" + 
				" searchCase=\"" + searchCase + "\"" + " searchType=\"" + searchType + "\"" + " ?>";
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

	protected long getModelCount(Model m)
		throws ServletException, IOException {

		long mCount = 0;
		try {
			ResIterator ri = m.listSubjects();
			while (ri.hasNext()) {
				ri.next();
				mCount++;
			}

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				m.close();
			} catch (Exception e2) { }
		}	

		return mCount;

	}

	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		searchTerm = null;
		searchCase = null;
		searchType = null;

		action = request.getParameter("action");
		if (action == null) { 
			action = "search";
			session.setAttribute("action", "search");
		}
			
		uiLang = get_uiLang_Preference(request,session);
		searchTerm = request.getParameter("searchTerm");
		searchCase = request.getParameter("searchCase");
		searchType = request.getParameter("searchType");

		if (searchCase == null)
			searchCase = "N";
		if (searchType == null)
			searchType = "exact phrase";
		
		session.setAttribute("searchCase", searchCase);
		session.setAttribute("searchType", searchType);
	}	
}



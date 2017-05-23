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

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

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


public class searchServlet extends registryServlet  {

	String modelSize = "0";
	String searchTerm = null;
	String searchCase = null;
	String searchType = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String action = null;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);	
		getInputParameters(request, response, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + searchTerm + " " + searchCase + " " + 
			searchType + " " + resultsLang);
		
		if (action.equals("search")) {
			
			try {
				Class.forName(JDBCDriver);
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				ModelRDB rdbModel = ModelRDB.open(conn, registry_model);
				Model tempModel = ModelFactory.createDefaultModel();
				Model resultsModel = ModelFactory.createDefaultModel();
				
				if (searchTerm.length() > 0) {
					
					ResIterator arRI = rdbModel.listSubjects();
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "nothing");
				
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
								resultsModel.add(rdbModel.query(s1));
								
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
									resultsModel = rdbModel.query(s1);
								} else {
									resultsModel = resultsModel.intersection(rdbModel.query(s1));
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
						resultsModel = rdbModel.query(s1);
						
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
				rdbModel.close();
				CharArrayWriter caw = new CharArrayWriter();
				resultsModel.write(caw, "RDF/XML");
				//System.out.println(caw);
				modelSize = Long.toString(getModelCount(resultsModel));
				resultsModel.close();
	
				transform(response, caw, searchResults_xsl);
		
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (Exception e2) { }
			}	
		}	// if action ...
			
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


	protected void setXSLTParms (Transformer transformer) {

		try {
			transformer.setParameter("reqType", "search");
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			transformer.setParameter("defaultResultsLang", defaut_rs_lang.replace('_', '-'));
			transformer.setParameter("provenance", provenance);
			if (searchTerm != null)
				transformer.setParameter("searchTerm", searchTerm);
			if (searchCase != null)
				transformer.setParameter("searchCase", searchCase);
			if (searchType != null)
				transformer.setParameter("searchType", searchType);
			transformer.setParameter("docRoot", rootdir);			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
		
	}


	public void getInputParameters (HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		searchTerm = null;
		searchCase = null;
		searchType = null;
		uiStyle = null;

		action = request.getParameter("action");
		if (action == null) { 
			action = "search";
			session.setAttribute("action", "search");
		}
			
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);

		searchTerm = request.getParameter("searchTerm");
		searchCase = request.getParameter("searchCase");
		searchType = request.getParameter("searchType");

		if (searchCase != null)
			session.setAttribute("searchCase", searchCase);
		if (searchType != null)
			session.setAttribute("searchType", searchType);
	}	
}



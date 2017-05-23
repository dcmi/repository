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


public class summaryServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;
	IDBConnection conn2 = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr());

		try {		
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB registryModel = ModelRDB.open(conn, registry_model);
			conn2 = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB collectionModel = ModelRDB.open(conn2, collection_model);
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
			
			// get documents
			String obj1 = "text/html";
			String obj2 = "Dublin Core Metadata Initiative";
			ResIterator ri = registryModel.listSubjectsWithProperty(DC.format, obj1);
			while (ri.hasNext()) {
				tempModel.add(registryModel.query(new SimpleSelector((Resource) ri.next(), DC.publisher, obj2, "en-US")));
			}
			
			ArrayList rList = new ArrayList();
			ri = tempModel.listSubjects();
			while (ri.hasNext()) {
				Resource subject = (Resource) ri.next();
				tempModel= registryModel.query(new SelectorSearch(subject, DC.title, resultsLang, (boolean) true));
				StmtIterator sti = tempModel.listStatements();
				if (sti.hasNext()) {
					String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
					rList.add(subject.toString() + "," + title);
				} else {
					tempModel= registryModel.query(new SelectorSearch(subject, DC.title, "en-US", (boolean) true));
					sti = tempModel.listStatements();
					if (sti.hasNext()) {
						String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
						rList.add(subject.toString() + "," + title);
					} else {
						tempModel= registryModel.query(new SimpleSelector(subject, DC.title, (String) null));
						sti = tempModel.listStatements();
						if (sti.hasNext()) {
							String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
							rList.add(subject.toString() + "," + title);
						}				
					}
				}
			}
			
			Collections.sort(rList);
			Bag docs = summaryModel.createBag("http://dublincore.org/dcregistry/documents/");
			for (int i=0; i < rList.size(); i++) {
				docs.add((String) rList.get(i));
				itemCount++;
			}
						
			// get elements
			rList = new ArrayList();
			ri = registryModel.listSubjectsWithProperty(DC.type, ele);
			while (ri.hasNext()) {
				term = ri.next().toString();
				sortPhrase = term.substring(term.lastIndexOf("/")+1);
				rList.add(sortPhrase.toLowerCase() + "*" + term);
			}
			
			Collections.sort(rList);
			Bag elements = summaryModel.createBag("http://dublincore.org/dcregistry/elements/");
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
			Bag refinements = summaryModel.createBag("http://dublincore.org/dcregistry/refinements/");
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
			Bag controlled = summaryModel.createBag("http://dublincore.org/dcregistry/controlled/");
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
			Bag encoding = summaryModel.createBag("http://dublincore.org/dcregistry/encoding/");
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
			Bag other = summaryModel.createBag("http://dublincore.org/dcregistry/other/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r1 = summaryModel.createResource(s.substring(s.lastIndexOf("*")+1));
				other.add(r1);
				itemCount++;
			}			
			
			// get collections
			rList = new ArrayList();
			//Property adminProperty = ResourceFactory.createProperty("http://dublincore.org/registry/", "collection");
			Resource r1 = collectionModel.getResource("_collection_");			
			s1 = new SimpleSelector(r1, DC.relation, (Object) null);
			tempModel = collectionModel.query(s1);
			StmtIterator iter = tempModel.listStatements();
			while (iter.hasNext()) {
				Statement stmt = (Statement) iter.next();         
				rList.add(stmt.getObject().toString());    	 
			}
			
			Collections.sort(rList);
			Bag coll = summaryModel.createBag("http://dublincore.org/dcregistry/collections/");
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				Resource r2 = summaryModel.createResource(s);
				coll.add(r2);
				itemCount++;
			}
			
			// get translations
			rList = new ArrayList();
			RDFNode v31 = summaryModel.createResource("http://dublincore.org/documents/dces/");
			RDFNode v30 = summaryModel.createResource("http://dublincore.org/documents/1998/09/dces/");
			
			ri = registryModel.listSubjectsWithProperty(DCTerms.isFormatOf, v30);
			while (ri.hasNext()) {
				Resource r2 = (Resource) ri.next();
				tempModel= registryModel.query(new SelectorSearch(r2, DC.title, resultsLang, (boolean) true));
				StmtIterator sti = tempModel.listStatements();
				if (sti.hasNext()) {
					String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
					rList.add(r2.toString() + "," + title);
				} else {
					tempModel= registryModel.query(new SelectorSearch(r2, DC.title, "en-US", (boolean) true));
					sti = tempModel.listStatements();
					if (sti.hasNext()) {
						String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
						rList.add(r2.toString() + "," + title);
					} else {
						tempModel= registryModel.query(new SimpleSelector(r2, DC.title, (String) null));
						sti = tempModel.listStatements();
						if (sti.hasNext()) {
							String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
							rList.add(r2.toString() + "," + title);
						}				
					}
				}
			}
			
			ri = registryModel.listSubjectsWithProperty(DCTerms.isFormatOf, v31);
			while (ri.hasNext()) {
				Resource r2 = (Resource) ri.next();
				tempModel= registryModel.query(new SelectorSearch(r2, DC.title, resultsLang, (boolean) true));
				StmtIterator sti = tempModel.listStatements();
				if (sti.hasNext()) {
					String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
					rList.add(r2.toString() + "," + title);
				} else {
					tempModel= registryModel.query(new SelectorSearch(r2, DC.title, "en-US", (boolean) true));
					sti = tempModel.listStatements();
					if (sti.hasNext()) {
						String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
						rList.add(r2.toString() + "," + title);
					} else {
						tempModel= registryModel.query(new SimpleSelector(r2, DC.title, (String) null));
						sti = tempModel.listStatements();
						if (sti.hasNext()) {
							String title = (String) ((Statement) sti.next()).getLiteral().getLexicalForm();
							rList.add(r2.toString() + "," + title);
						}				
					}
				}
			}
			
			Collections.sort(rList);
			Bag trans = summaryModel.createBag("http://dublincore.org/dcregistry/translations/");
			for (int i=0; i < rList.size(); i++) {
				trans.add((String) rList.get(i));
				itemCount++;	
			}
							
			registryModel.close();
			collectionModel.close();
			CharArrayWriter caw = new CharArrayWriter();
			summaryModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			modelSize = Integer.toString(itemCount);
			summaryModel.close();
			transform(response, caw, summary_xsl);
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				conn2.close();
			} catch (Exception e2) { }
		}
	}
	
					
	protected void setXSLTParms (Transformer transformer) {
		try {		
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			transformer.setParameter("docRoot", rootdir);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
	      }		
	}
	

	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
	}
		
}

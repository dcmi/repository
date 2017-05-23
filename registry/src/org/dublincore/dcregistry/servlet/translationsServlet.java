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


public class translationsServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		logger.info(session.getId() + ", " + request.getRemoteAddr());
		getInputParameters(request, session);
		int itemCount = 0;

		try {		
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB registryModel = ModelRDB.open(conn, registry_model);
			Model summaryModel = ModelFactory.createDefaultModel();
			Model tempModel = ModelFactory.createDefaultModel();
			
			// get translations
			ArrayList rList = new ArrayList();
			RDFNode v31 = summaryModel.createResource("http://dublincore.org/documents/dces/");
			RDFNode v30 = summaryModel.createResource("http://dublincore.org/documents/1998/09/dces/");
			
			ResIterator ri = registryModel.listSubjectsWithProperty(DCTerms.isFormatOf, v30);
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
			CharArrayWriter caw = new CharArrayWriter();
			summaryModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			modelSize = Integer.toString(itemCount);
			summaryModel.close();
			transform(response, caw, translations_xsl);
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
	}
	
	
	protected String getLanguage (Resource r1, Model registryModel) {

		String translation = null;
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Selector s1 = new SimpleSelector(r1, DC.language, (String) null);
			tempModel = registryModel.query(s1);
			StmtIterator sti = tempModel.listStatements();
			
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if ((stmt.getLanguage() == null) || (stmt.getLanguage().equals("")))
					translation = "[" + stmt.getObject().toString() + "]";
			}
			
			tempModel.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return translation;				
	}
	
					
	protected void setXSLTParms (Transformer transformer) {
		try {		
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("reqType", "translations");
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

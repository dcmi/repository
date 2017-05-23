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


public class documentsServlet extends registryServlet  {
	
	String modelSize = "0";
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr());
		int itemCount = 0;

		try {		
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB registryModel = ModelRDB.open(conn, registry_model);
			Model summaryModel = ModelFactory.createDefaultModel();
			Model tempModel = ModelFactory.createDefaultModel();
			
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
			
			registryModel.close();
			CharArrayWriter caw = new CharArrayWriter();
			summaryModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			modelSize = Integer.toString(itemCount);
			summaryModel.close();
			transform(response, caw, documents_xsl);
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
	}
	
					
	protected void setXSLTParms (Transformer transformer) {
		try {		
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("reqType", "documents");
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

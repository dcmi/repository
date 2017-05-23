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



public class canonicalServlet extends registryServlet  {

	String modelSize = "0";
	String action = null;
	String item = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	IDBConnection conn = null;


	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
			
		String canonicalLang = "en-US";
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + item);

		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, canonical_model);
			Model tempModel = ModelFactory.createDefaultModel();
			Model resultsModel = ModelFactory.createDefaultModel();
				 
			// get the language identifier of the canonical definition
			Resource r1 = resultsModel.createResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, DC.language, (String) null);
			tempModel = rdbModel.query(s1);
			StmtIterator sti = tempModel.listStatements();
			// if not found then assume the canonical language = en-US
			if (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				canonicalLang = (String) stmt.getObject().toString();
			}
			
			rdbModel.close();			
			rdbModel = ModelRDB.open(conn, registry_model);
			
			s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = rdbModel.query(s1);
			sti = tempModel.listStatements();
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if (stmt.getObject() instanceof Literal) {								
					if ((stmt.getLanguage() == null) || (stmt.getLanguage().equals(""))) {
						resultsModel.add(stmt);
					} else {  	// check for language match
						if (stmt.getLanguage().equals(canonicalLang)) {
							resultsModel.add(stmt);
						}	
					}
				} else {
					resultsModel.add(stmt);
				}
			}
														
			// get term refinements
			Property superProperty = ResourceFactory.createProperty("http://dublincore.org/registry/", "superPropertyOf");
			Property superClass = ResourceFactory.createProperty("http://dublincore.org/registry/", "superClassOf");
			
			ResIterator ri3 = tempModel.listSubjects();
			while (ri3.hasNext()) {
				Resource r3 = (Resource) ri3.next();
				Resource stmtType = instanceOf(r3, rdbModel);
				if (stmtType.equals(RDF.Property)) {
					resultsModel.add(getRefinements(r3, RDFS.subPropertyOf, rdbModel, superProperty));				
				} else if (stmtType.equals(RDFS.Class)) {
					resultsModel.add(getRefinements(r3, RDFS.subClassOf, rdbModel, superClass));
				}
			}
			
			resultsModel.add(getExamples(r1));		//get encoding examples
			resultsModel.add(getSchemes(r1, rdbModel));	//get related schemes
			
			//check if this is an encoding scheme
			//if yes, then look for controlled vocabulary terms for this scheme
			RDFNode o1 = resultsModel.createResource("http://dublincore.org/usage/documents/principles/#encoding-scheme");
			if (rdbModel.contains(r1, DC.type, o1)) {
				resultsModel.add(getControlledTerms(r1, rdbModel));
			}
			
			tempModel.close();
			rdbModel.close();
			
			CharArrayWriter caw = new CharArrayWriter();
			resultsModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			modelSize = Long.toString(getModelCount(resultsModel));
			resultsModel.close();
			transform(response, caw, detail_xsl);
	
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
	}	


	protected Model getRefinements (Resource r, Property sp, Model rdbModel, Property sp2) 
		throws ServletException, IOException {

		Model refinementModel = ModelFactory.createDefaultModel();
		Model tempModel = ModelFactory.createDefaultModel();
		
		try {
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "superItem");
			SimpleSelector s2 = new SimpleSelector(null, sp, r);
			tempModel = rdbModel.query(s2);		

			StmtIterator si2 = tempModel.listStatements();
			Statement newStmt;
			while (si2.hasNext()) {
				Statement refStmt = (Statement) si2.next();         		 	
				//newStmt = tempModel.createStatement(r, sp2, refStmt.getSubject());
				newStmt = tempModel.createStatement(r, p5, refStmt.getSubject());
				refinementModel.add(newStmt);
			}
			
			if (getModelCount(refinementModel) > 0)
				refinementModel.add(r, sp2, "use superItem nodes");

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				tempModel.close();
			} catch (Exception e2) { }
		}
		
		return refinementModel;
	}
	
	protected Model getExamples (Resource r1) throws ServletException, IOException {
		
		Model tempModel = null;
				
		try {
			tempModel = ModelFactory.createDefaultModel();
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "examples");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "example");
			String ln = r1.getLocalName();
			
			if (ln.length() > 0) {
				String rootdir = getServletContext().getRealPath("/");
				String examplesDir = rootdir + "examples/";
				File dir = new File(examplesDir);
				
				String[] examples = dir.list(new examplesFilter(ln));
				if (examples.length > 0)
					tempModel.add(r1, p1, "use example nodes");
				for (int i=0; i<examples.length; i++) {
					// Get filename of file or directory
					String filename = examples[i];
					tempModel.add(r1, p2, filename);
				}
			}

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model getSchemes (Resource r1, Model rdbModel) throws ServletException, IOException {

		Model resultsModel = null;
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			resultsModel = ModelFactory.createDefaultModel();
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "type");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "relatedSchemes");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "hasScheme");
			RDFNode o1 = tempModel.createResource("http://dublincore.org/registry/scheme");
			RDFNode o2 = tempModel.createResource(r1.toString());
			
			SimpleSelector s1 = new SimpleSelector(null, p1, o1);
			tempModel = rdbModel.query(s1);	
			StmtIterator si = tempModel.listStatements();
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();        		 	
				Resource r2 = (Resource) stmt.getSubject();
				if (rdbModel.contains(r2, DCTerms.references, o2)) {
					RDFNode o3 = tempModel.createResource(r2.toString());
					ResIterator ri = rdbModel.listSubjectsWithProperty(RDF.type, o3);
					while (ri.hasNext()) {
						Resource r4 = (Resource) ri.next();
						RDFNode o4 = tempModel.createResource(r4.toString());
						resultsModel.add(r1, p3, o4);
					}
					
				}
			}
			
			if (getModelCount(resultsModel) > 0)
				resultsModel.add(r1, p2, "use hasScheme nodes");
			
			tempModel.close();

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return resultsModel;
	}
	
	protected Model getControlledTerms (Resource r1, Model rdbModel) throws ServletException, IOException {

		Model resultsModel = null;
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			resultsModel = ModelFactory.createDefaultModel();
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "controlledTerms");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "controlledTerm");
			RDFNode o1 = tempModel.createResource(r1.toString());
			
			ResIterator ri = rdbModel.listSubjectsWithProperty(RDF.type, o1);
			while (ri.hasNext()) {
				Resource r2 = (Resource) ri.next();
				RDFNode o2 = tempModel.createResource(r2.toString());
				resultsModel.add(r1, p2, o2);
			}
			
			if (getModelCount(resultsModel) > 0)
				resultsModel.add(r1, p1, "use controlledTerm nodes");
			
			tempModel.close();

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return resultsModel;
	}

	
	protected Resource instanceOf(Resource r1, Model rdbModel) {

		Model tempModel = ModelFactory.createDefaultModel();
		Resource stmtType = tempModel.createResource("http://dublincore.org/registry/unknown");
		try {
			NodeIterator ni = rdbModel.listObjectsOfProperty(r1, RDF.type);
			while (ni.hasNext()) {
				Resource tType = (Resource) ni.next();
				if ((tType.equals(RDFS.Class)) ||  (tType.equals(RDF.Property))) {
					stmtType = tType;
				}
			}

		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				tempModel.close();
			} catch (Exception e2) { }
		}
		
		//System.out.println("instanceOf: " + stmtType);
		return stmtType;
	}
	

	protected long getModelCount(Model m) throws ServletException, IOException {

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
		} 

		return mCount;
	}

	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("action", action);
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			transformer.setParameter("defaultResultsLang", defaut_rs_lang.replace('_', '-'));
			transformer.setParameter("display_provenance_link", "N");
			transformer.setParameter("display_canonical_link", "N");
			if (item != null)
				transformer.setParameter("detailItem", item);
			transformer.setParameter("docRoot", rootdir);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
		
	}


	public void getInputParameters (HttpServletRequest request, HttpSession session) {
;
		item = null;
		uiStyle = null;
		
		action = (String) session.getAttribute("action");
		
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);

		item = request.getParameter("item");
		if (item != null)
			session.setAttribute("item", item);
	}
		
}



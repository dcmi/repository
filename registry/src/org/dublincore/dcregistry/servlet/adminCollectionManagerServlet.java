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
 *  M.Nagamori  <nagamori@slis.tsukuba.ac.jp>
 *
 * Modifications:
 * H.Wagner <wagnerh@oclc.org> 2004-06-15
 * Major revision
 *
 * Portions created by DCMI are Copyright (C) 2000.
 *
 */

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.db.impl.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.text.*;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;


/**
* This servlet is used to display a summary of the registry.
* This is called by adminServlet.
*/
public class adminCollectionManagerServlet extends registryServlet {
	
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String itemType = null;
	String item = null;
	String reqType = null;
	
	String gotoString = null;
	String styleSheet = null;
	IDBConnection conn = null;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, collection_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			gotoString = null;
			styleSheet = null;			

			if (reqType.equals("Add Collection")) {
				processAddCollectionRequest(rdbModel);
			} else if (reqType.equals("delete")) {
				styleSheet = "admin-collection-confirm.xsl";
			} else if (reqType.equals("Confirm Delete")) {
				processConfirmDeleteRequest(rdbModel);
			} else if (reqType.equals("Cancel")) {
				gotoString = "/adminServlet";
			} else {
				tempModel = processDetailRequest(rdbModel);
			}

			rdbModel.close();	
			if (gotoString != null) {
				tempModel.close();
				conn.close();
				gotoPage(gotoString, request, response);
			} else {
				CharArrayWriter caw = new CharArrayWriter();
				tempModel.write(caw, "RDF/XML");
				tempModel.close();
				//System.out.println(caw);
				transform(response, caw, styleSheet);
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}

	}
	
	
	protected void processAddCollectionRequest(ModelRDB rdbModel) {
		
		try {
			if (verifyScheme (item)) {
				Resource  col = rdbModel.createResource("_collection_");
				RDFNode newCol = rdbModel.createResource(item.trim());
				col.addProperty(DC.relation, newCol);
				
				/*
				conn.close();
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				rdbModel = ModelRDB.open(conn, registry_model);
				Resource r1 = rdbModel.createResource(item.trim());
				
				Calendar tDate = new GregorianCalendar();
				String issuedYear = Integer.toString(tDate.get(Calendar.YEAR));
				int im = tDate.get(Calendar.MONTH);
				String issuedMonth = null;
				if (im < 9) {
					issuedMonth = "0" + Integer.toString(im + 1);
				} else if (im == 9) {
					issuedMonth = "10";
				} else {
					issuedMonth = Integer.toString(im + 1);
				}
				String issuedDay = Integer.toString(tDate.get(Calendar.DATE));
				String issuedDate = issuedYear + "-" + issuedMonth + "-" + issuedDay;
				rdbModel.add(r1, DCTerms.created, issuedDate);
				*/
			}
			
			gotoString = "/adminServlet";
		
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	
	protected void processConfirmDeleteRequest(ModelRDB rdbModel) {
		
		try {
			if (item != null) {
				Resource  col = rdbModel.getResource("_collection_");
				RDFNode delItem = rdbModel.getResource(item.trim());
				Statement stmt = rdbModel.createStatement(col, DC.relation, delItem);
				rdbModel.remove(stmt);
			}
			
			gotoString = "/adminServlet";
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	
	protected Model processDetailRequest(ModelRDB rdbModel) {
		
		Model resultsModel = null;
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			resultsModel = ModelFactory.createDefaultModel();
				
			if (itemType.equals("other")) {
				Collection collections = new ArrayList();
				StmtIterator iter = rdbModel.listStatements();
				while (iter.hasNext()) {
					Statement stmt = (Statement) iter.next();         
					RDFNode object = stmt.getObject();    
					collections.add(object.toString());
				}
				
				conn.close();
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				rdbModel = ModelRDB.open(conn, registry_model);
				Resource resItem = resultsModel.createResource();
				Property defines = ResourceFactory.createProperty("http://dublincore.org/registry/", "defines");
						
				ResIterator ri = rdbModel.listSubjects();
				while (ri.hasNext()) {
					Resource r1 = (Resource) ri.next();
					if (!collections.contains(r1.toString())) {  	// it is not a collection
						 NodeIterator n1 = rdbModel.listObjectsOfProperty(r1, RDFS.isDefinedBy);
						 if (n1.hasNext()) {
							RDFNode o1 = (RDFNode) n1.nextNode();
							if (!collections.contains(o1.toString())) {
								resItem.addProperty(defines, r1);
							}
						} else {
							resItem.addProperty(defines, r1);
						}
					}
				}
						
			} else if (itemType.equals("all")) {
				conn.close();
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				rdbModel = ModelRDB.open(conn, registry_model);
				ArrayList rList = new ArrayList();
				ResIterator ri = rdbModel.listSubjects();
				while (ri.hasNext()) {
					rList.add(ri.next().toString());
				}
				
				Collections.sort(rList);
				Resource resItem = resultsModel.createResource();
				Property defines = ResourceFactory.createProperty("http://dublincore.org/registry/", "defines");
				for (int i=0; i < rList.size(); i++) {
					Resource r1 = tempModel.createResource((String) rList.get(i));
					resItem.addProperty(defines, r1);
				}
					
			} else {
				conn.close();
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				rdbModel = ModelRDB.open(conn, registry_model);
				Resource resItem = resultsModel.createResource(item);
				/*
				Resource r1 = rdbModel.getResource(item);
				SimpleSelector s2 = new SimpleSelector(r1, null, (Object) null);
				resultsModel = rdbModel.query(s2);
				
				Resource resItem = resultsModel.getResource(item);
				*/
				Property defines = ResourceFactory.createProperty("http://dublincore.org/registry/", "defines");
				SimpleSelector s1 = new SimpleSelector((Resource) null, RDFS.isDefinedBy, resItem);
				tempModel = rdbModel.query(s1);
				StmtIterator iter = tempModel.listStatements();
				while (iter.hasNext()) {
					Statement stmt = (Statement) iter.next();
					resItem.addProperty(defines, stmt.getSubject());
				}
			}
			
			tempModel.close();
			styleSheet = "admin-detail.xsl";
			return resultsModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return resultsModel;
		}
	}
	
	
	protected boolean verifyScheme (String uriSpec) {
		
                if (uriSpec == null || uriSpec.length() == 0) {
                        return false;
                }

                int colonIdx = uriSpec.indexOf(':');
                int slashIdx = uriSpec.indexOf('/');
                int queryIdx = uriSpec.indexOf('?');
                int fragmentIdx = uriSpec.indexOf('#');

                if ((colonIdx < 2)
                        || (colonIdx > slashIdx && slashIdx != -1)
                        || (colonIdx > queryIdx && queryIdx != -1)
                        || (colonIdx > fragmentIdx && fragmentIdx != -1)) {
			item = "uri:" + item;
		} 
		return true;
	}
					
		
	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("item", item);
			transformer.setParameter("itemType", itemType);			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
	}
	
	
	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
		
		item = request.getParameter("item");
		if (item != null)
			if (item.equals(""))
				item = null;
		
		itemType = request.getParameter("itemType");
		if (itemType != null) {
			if (itemType.equals(""))
				itemType = "collection";
		} else { 
			itemType = "collection";
		}
		
		reqType = request.getParameter("reqType");
		if (reqType != null)
			if (reqType.equals(""))
				reqType = "detail";
	}
}

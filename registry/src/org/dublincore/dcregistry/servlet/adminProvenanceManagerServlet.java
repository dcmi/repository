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



public class adminProvenanceManagerServlet extends registryServlet  {

	String modelSize = "0";
	String reqType = null;
	String item = null;
	String property = null;
	String resValue = null;
	String objValue = null;
	String objLang = null;
	String newValue = null;
	String newResValue = null;
	String lang = null;
	String propertyOther = null;
	String country = null;
	String language = null;
	String objType = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String p_item = null;
	String p_property = null;
	String p_lang = null;
	int itemCount = 0;
	
	String gotoString = null;
	String styleSheet = null;
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}

		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, provenance_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			gotoString = null;
			styleSheet = null;
			
			if (reqType.equals("start")) {
				tempModel = processStartRequest(rdbModel);	
			} else if (reqType.equals("property")) {
				tempModel = processPropertyRequest(rdbModel, session);
			} else if (reqType.equals("Add New Property")) {
				tempModel = processAddNewPropertyRequest(rdbModel);	
			} else if (reqType.equals("Add Property")) {
				tempModel = processAddPropertyRequest(rdbModel);	
			} else if (reqType.equals("Cancel Add Property")) {
				gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;					
			} else if (reqType.equals("Update")) {
				processUpdateRequest(rdbModel, session);					
			}  else if (reqType.equals("Delete")) {
				tempModel = processDeleteRequest(rdbModel, session);	
			} else if (reqType.equals("Confirm Delete")) {
				processConfirmDeleteRequest(rdbModel, session);	
			} else if (reqType.equals("Cancel")) {
				gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;
				//gotoString = "/adminProvenanceManagerServlet?reqType=property&item=" + item + "&property=" + property;
			} else if (reqType.equals("deleteResource")) {
				tempModel = processDeleteResourceRequest(rdbModel);	
			} else if (reqType.equals("Confirm Delete Resource")) {
				processConfirmDeleteResourceRequest(rdbModel);									
			} else if (reqType.equals("Cancel Delete Resource")) {
				gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;
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
				modelSize = Integer.toString(itemCount);
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
	
	protected Model processStartRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			RDFNode o1 = tempModel.createResource(item.trim());
			RDFNode o2 = tempModel.createResource(property.trim());
			SimpleSelector s1 = new SimpleSelector(null, RDF.subject, o1);
			tempModel = rdbModel.query(s1);
			ResIterator ri = tempModel.listSubjects();
			
			tempModel.close();
			tempModel = ModelFactory.createDefaultModel();
			while (ri.hasNext()) {
				Resource r2 = (Resource) ri.next();
				if (rdbModel.contains(r2, RDF.predicate, o2)) {
					if ((int) r2.toString().indexOf(new String("provenance_" + lang)) != -1) {
						SimpleSelector si = new SimpleSelector(r2, null, (Object) null);
						tempModel.add(rdbModel.query(si));
					}
				}
			}
			
			StmtIterator si = tempModel.listStatements();
			tempModel.close();
			tempModel = ModelFactory.createDefaultModel();
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				Resource r3 = (Resource) stmt.getSubject();
				Property p3 = (Property) stmt.getPredicate();
				// include only one of each predicate
				tempModel.add(r3, p3, " ");
				itemCount++;
			}
			
			styleSheet = "admin-provenanceManager-start.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected Model processAddNewPropertyRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Resource r1 = null;
			if (item.equals("new")) {
				r1 = createNewProvenanceItem(rdbModel);
			} else {
				r1 = rdbModel.getResource(item.trim());
			}
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = rdbModel.query(s1);
			
			styleSheet = "admin-provenanceManagerAddProperty.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected Model processAddPropertyRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			String errorMsg = validateNewPropertyInputForm();
			if (errorMsg == null) {
				Resource r1 = rdbModel.getResource(item.trim());
				Property p1 = null;
				if (property.equals("other"))
					p1 = ResourceFactory.createProperty("http://" + propertyOther);
				else
					p1 = ResourceFactory.createProperty(property);
				
				if (objType.equals("R")) {
					RDFNode n1 = tempModel.createResource(newValue);
					rdbModel.add(r1, p1, n1);
				} else if (objType.equals("N")) {
					RDFNode n1 = tempModel.createResource(newValue);
					rdbModel.add(r1, p1, newValue);
				} else {
					String lang = language + "-" + country;
					rdbModel.add(r1, p1, newValue, lang);
				}
				
				//System.out.println("p_item: " + p_item);
				//System.out.println("p_property: " + p_property);
				//System.out.println("p_lang: " + p_lang);

				gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;

			} else {
				Resource r1 = rdbModel.getResource(item.trim());
				SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
				tempModel = rdbModel.query(s1);
				r1 = tempModel.getResource(item.trim());
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "errorMsg");
				r1.addProperty(p1, errorMsg);
				styleSheet = "admin-provenanceManagerAddProperty.xsl";
			}
			
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	
	protected Model processPropertyRequest(ModelRDB rdbModel, HttpSession session) {
		
		Model tempModel = null;
		try {	
			ArrayList rList = new ArrayList();
			Resource r1 = rdbModel.getResource(item.trim());
			Property p1 = ResourceFactory.createProperty(property);
			SimpleSelector s1 = new SimpleSelector(r1, p1, (Object) null);
			StmtIterator si = rdbModel.listStatements(s1);
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				RDFNode object = (RDFNode) stmt.getObject();
				if (object instanceof Literal) {
					String literal = stmt.getLiteral().getLexicalForm();
					String lang = stmt.getLanguage();
					if (lang == null) {
						rList.add("xx-XX," + literal);
					} else if (lang.length() < 5) {
						rList.add("xx-XX," + literal);
					} else {
						rList.add(lang + "," + literal);
					}
				} else {
					rList.add("rr-RR," + object.toString());
				}
			}
				
			tempModel = ModelFactory.createDefaultModel();
			Map map = new HashMap();
			int mapCount = 0;
			Collections.sort(rList);
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				if (s.substring(0,5).equals("rr-RR")) {		//resource
					RDFNode n1 = tempModel.createResource(s.substring(6));
					tempModel.add(r1, p1, n1);
					map.put( new Integer( ++mapCount ), s.substring(6) );
				} else if (s.substring(0,5).equals("xx-XX")) {
					tempModel.add(r1, p1, s.substring(6));
					map.put( new Integer( ++mapCount ), s.substring(6) );
				} else {
					tempModel.add(r1, p1, s.substring(6), s.substring(0, 5));
					map.put( new Integer( ++mapCount ), s.substring(6) );
				}						
			}
			
			session.setAttribute("map", map);
			styleSheet = "admin-provenanceManager-property.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected void processUpdateRequest(ModelRDB rdbModel, HttpSession session) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Map map = (HashMap) session.getAttribute("map");
			Resource r1 = rdbModel.getResource(item.trim());
			Property p1 = ResourceFactory.createProperty(property.trim());
			SimpleSelector s1 = null;
			if (resValue != null) {
				RDFNode o1 = tempModel.createResource(resValue.trim());
				s1 = new SimpleSelector(r1, p1, o1);
			} else if (objValue != null) {
				String literal = (String) map.get(new Integer(Integer.parseInt(objValue)));
				if (objLang != null) {
					s1 = new SimpleSelector(r1, p1, literal, objLang);
				} else {
					s1 = new SimpleSelector(r1, p1, literal);
				}
			}

			StmtIterator si = rdbModel.listStatements(s1);
			if (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				if (resValue != null) {
					Resource r2 = rdbModel.createResource(newResValue.trim());
					stmt.changeObject(r2);
				} else {
					if (objLang != null) {
						stmt.changeObject(newValue, objLang);
					} else {
						stmt.changeObject(newValue);
					}
				}
				
			} else {
				System.out.println("*** error - object not found: " + r1.toString() + ", " + p1.toString());
				System.out.println(objValue + ", " + objLang);
				System.out.println(resValue.trim());
			}
				
			gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;
			tempModel.close();
	
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	protected Model processDeleteRequest(ModelRDB rdbModel, HttpSession session) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Map map = (HashMap) session.getAttribute("map");
			Resource r1 = rdbModel.getResource(item.trim());
			Property p1 = ResourceFactory.createProperty(property.trim());
			SimpleSelector s1 = null;
			if (resValue != null) {
				RDFNode o1 = tempModel.createResource(resValue.trim());
				s1 = new SimpleSelector(r1, p1, o1);
			} else if (objValue != null) {
				String literal = (String) map.get(new Integer(Integer.parseInt(objValue)));
				if (objLang != null) {
					s1 = new SimpleSelector(r1, p1, literal, objLang);
				} else {
					s1 = new SimpleSelector(r1, p1, literal);
				}
			}
			
			tempModel = rdbModel.query(s1);
			styleSheet = "admin-provenanceManager-delete.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}

	protected void processConfirmDeleteRequest(ModelRDB rdbModel, HttpSession session) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Map map = (HashMap) session.getAttribute("map");
			Resource r1 = rdbModel.getResource(item.trim());
			Property p1 = ResourceFactory.createProperty(property.trim());
			SimpleSelector s1 = null;
			//System.out.println("objLang: " + objLang);
			if (objLang.equals("N/A")) {
				String rtd = (String) map.get(new Integer(Integer.parseInt(objValue)));
				RDFNode o1 = tempModel.createResource(rtd);
				s1 = new SimpleSelector(r1, p1, o1);
			} else {
				String literal = (String) map.get(new Integer(Integer.parseInt(objValue)));
				//System.out.println("literal: " + literal);
				if (objLang != null) {
					s1 = new SimpleSelector(r1, p1, literal, objLang);
				} else {
					s1 = new SimpleSelector(r1, p1, literal);
				}
			}
			
			StmtIterator si = rdbModel.listStatements(s1);
			if (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				rdbModel.remove(stmt);
			}
			
			tempModel.close();
			
			/*				
			// are there any further values for this property?
			s1 = new SimpleSelector(r1, p1, (Object) null);
			si = rdbModel.listStatements(s1);
			if (si.hasNext()) {
				gotoString = "/adminProvenanceManagerServlet?reqType=property&item=" + item + "&property=" + property;
			} else {
				// are there any properties left for this resource?
				s1 = new SimpleSelector(r1, null, (Object) null);
				si = rdbModel.listStatements(s1);
				if (si.hasNext()) {	
					gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;
				} else {
					gotoString = "/adminResourceManagerServlet?reqType=property&item=" + item + "&property=" + property;
				}
			}	*/
			
			gotoString = "/adminProvenanceManagerServlet?reqType=start&item=" + p_item + "&property=" + p_property + "&lang=" + p_lang;
			
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	protected Model processDeleteResourceRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Resource r1 = rdbModel.getResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = rdbModel.query(s1);			
			
			styleSheet = "admin-provenanceManager-deleteResource.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected void processConfirmDeleteResourceRequest(ModelRDB rdbModel) {

		try {
			Resource r1 = rdbModel.getResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			StmtIterator si = rdbModel.listStatements(s1);
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				rdbModel.remove(stmt);
			}
			
			gotoString = "/adminResourceManagerServlet?reqType=property&item=" + p_item + "&property=" + p_property;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	protected Resource createNewProvenanceItem(ModelRDB rdbModel) {
		
		Resource r1 = null;
		try {
			Calendar tDate = new GregorianCalendar();
			String todaysDate = Integer.toString(tDate.get(Calendar.YEAR));
			if (tDate.get(Calendar.MONTH) < 9) {
				todaysDate = todaysDate + "0" + Integer.toString(tDate.get(Calendar.MONTH)+1);
			} else if (tDate.get(Calendar.MONTH) == 9) {
				todaysDate = todaysDate + "10";
			} else {
				todaysDate = todaysDate + Integer.toString(tDate.get(Calendar.MONTH)+1);
			}
			todaysDate = todaysDate + Integer.toString(tDate.get(Calendar.DATE));
			
			String sr1 = null;
			int iPound = p_item.lastIndexOf("#");
			int iSlash = p_item.lastIndexOf("/");
			
			sr1 = "http://dublincore.org/dcregistry/temp" + todaysDate + "/provenance_" + p_lang + "#";
			if (iPound > iSlash) {
				sr1 = sr1 + p_item.substring(iPound+1);
			} else {
				sr1 = sr1 + p_item.substring(iSlash+1);
			}
			
			iPound = p_property.lastIndexOf("#");
			iSlash = p_property.lastIndexOf("/");
			if (iPound > iSlash) {
				sr1 = sr1 + "_" + p_property.substring(iPound+1);
			} else {
				sr1 = sr1 + "_" + p_property.substring(iSlash+1);
			}
			
			//System.out.println("sr1: " + sr1);			
			r1 = rdbModel.createResource(sr1);
			r1.addProperty(RDF.type, RDF.Statement);
			Resource r2 = rdbModel.createResource(p_item);
			r1.addProperty(RDF.subject, r2);
			
			RDFNode r3 = rdbModel.createResource(p_property);
			r1.addProperty(RDF.predicate, r3);
			
			return r1;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return r1;
		}		
	}

	protected String validateNewPropertyInputForm() {
		String errorMsg = null;
		
		if (property.equals("other")) {
			if (propertyOther == null) {
				errorMsg = "ERROR: Property required";
			} else {
				propertyOther.trim();
			}
		}
		
		if (newValue == null) {
			errorMsg = "ERROR: Object value required.";
		}
		
		if (errorMsg == null) {
			newValue.trim();
			if (objType.equals("R"))
				if (!verifyScheme(newValue))
					errorMsg = "ERROR: Object value " + newValue + ": Not a valid URI";
		}
				
		return errorMsg;
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
			return false;
		} else {
			return true;
		}
	}

	
	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("reqType", reqType);
			transformer.setParameter("modelSize", modelSize);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			if (item != null)
				transformer.setParameter("item", item);
			if (property != null)
				transformer.setParameter("property", property);			
			
			if (lang != null) {
				transformer.setParameter("lang", lang);
			}
			
			if (resValue != null)
				transformer.setParameter("resValue", resValue);
			if (objValue != null)
				transformer.setParameter("objValue", objValue);
			if (objLang != null)
				transformer.setParameter("objLang", objLang);
			if (newValue != null)
				transformer.setParameter("newValue", newValue);
			if (newResValue != null)
				transformer.setParameter("newResValue", newResValue);
			if (propertyOther != null)
				transformer.setParameter("propertyOther", propertyOther);
			if (objType != null)
				transformer.setParameter("objType", objType);
			
			if (language != null) {
				transformer.setParameter("language", language);
			} else if (uiLang != null) {
				transformer.setParameter("language", uiLang.substring(0,2));
			} else {
				transformer.setParameter("language", "en");
			}
			
			if (country != null) {
				transformer.setParameter("country", country);
			} else if (uiLang != null) {
				transformer.setParameter("country", uiLang.substring(3));
			} else {
				transformer.setParameter("country", "US");
			}
			
			if (p_item != null)
				transformer.setParameter("p_item", p_item);
			if (p_property != null)
				transformer.setParameter("p_property", p_property);			
			if (p_lang != null)
				transformer.setParameter("p_lang", p_lang);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}


	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		try {
			uiStyle = "std";
			uiLang = get_uiLang_Preference(request,session);
			resultsLang = get_resultsLang_Preference(request,session);
	
			reqType = request.getParameter("reqType");
			if (reqType == null) {
				reqType = "start";
			} else if (reqType.equals("")) {
				reqType = "start";
			}
			
			item = request.getParameter("item");
			if (item != null)
				if (item.equals(""))
					item = null;
			
			property = request.getParameter("property");
			if (property != null)
				if (property.equals(""))
					property = null;
			
			//System.out.println("reqType: " + reqType);
			//System.out.println("item: " + item);
			//System.out.println("property: " + property);
			
			lang = request.getParameter("lang");
			if (lang != null)
				if (lang.equals(""))
					lang = null;
			
			resValue = request.getParameter("resValue");
			if (resValue != null)
				if (resValue.equals(""))
					resValue = null;
			
			objValue = request.getParameter("objValue");
			if (objValue != null)
				if (objValue.equals(""))
					objValue = null;
			
			objLang = request.getParameter("objLang");
			if (objLang != null)
				if (objLang.equals(""))
					objLang = null;
			
			newValue = request.getParameter("newValue");
			if (newValue != null)
				if (newValue.equals(""))
					newValue = null;
			
			newResValue = request.getParameter("newResValue");
			if (newResValue != null)
				if (newResValue.equals(""))
					newResValue = null;
			
			propertyOther = request.getParameter("propertyOther");
				if (propertyOther != null)
					if (propertyOther.equals(""))
						propertyOther = null;
				
			objType = request.getParameter("objType");
				if (objType != null)
					if (objType.equals(""))
						objType = null;
				
			country = request.getParameter("country");
			if (country != null)
				if (country.equals(""))
					country = null;
			
			language = request.getParameter("language");
			if (language != null)
				if (language.equals(""))
					language = null;
			
			if (reqType.equals("start")) {
				p_item = item;
				p_property = property;
				p_lang = lang;
				session.setAttribute("p_item", p_item);
				session.setAttribute("p_property", p_property);
				session.setAttribute("p_lang", p_lang);
			} else {
				p_item = (String) session.getAttribute("p_item");
				p_property = (String) session.getAttribute("p_property");
				p_lang = (String) session.getAttribute("p_lang");
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
}

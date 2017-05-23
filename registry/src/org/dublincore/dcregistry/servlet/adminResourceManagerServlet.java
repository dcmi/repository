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


public class adminResourceManagerServlet extends registryServlet  {

	String modelSize = "0";
	String reqType = null;
	String item = null;
	String itemType = null;
	String property = null;
	String propertyOther = null;
	String resValue = null;
	String objValue = null;
	String objLang = null;
	String newValue = null;
	String newResValue = null;
	String country = null;
	String language = null;
	String objType = null;
	String uiStyle = null;
	String uiLang = null;
	String canonical = null;
	String resultsLang = null;
	
	String newTerm = null;
	String label = null;
	String definition = null;
	String description = null;
	String rdfType = null;
	String termType = null;
	String termTypeOther = null;
	String refines = null;
	String version = null;
	String p_description = null;
	String p_title = null;
	String p_creator = null;
	String p_contributor1 = null;
	String p_contributor2 = null;
	String p_publisher_lit = null;
	String p_publisher_res = null;
	String p_source = null;
	String p_rights = null;

	String FQNewTerm = null;
	String issuedDate = null;
	String RFC3066Code = null;
	String gotoString = null;
	String styleSheet = null;
	
	IDBConnection conn = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		int itemCount = 0;
		
		// forward to the login page, if the user is not valid.
		if (!isAuthorized(request, response)){
			gotoPage("/adminLoginServlet?reqType=start", request, response);
		}

		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, registry_model);
			Model tempModel = ModelFactory.createDefaultModel();
				
			gotoString = null;
			styleSheet = null;
			
			if (reqType.equals("resource")) {
				tempModel = processResourceRequest(rdbModel);	
			} else if (reqType.equals("property")) {
				tempModel = processPropertyRequest(rdbModel, session);				
			} else if (reqType.equals("Add New Term")) {
				tempModel = processAddNewTermRequest(rdbModel);
			} else if (reqType.equals("Add Term")) {
				tempModel = processAddTermRequest(rdbModel);					
			} else if (reqType.equals("Cancel Add")) {			
				gotoString="/adminResourceManagerServlet?reqType=resource&item=" + item + "&itemType=" + itemType;
			} else if (reqType.equals("Add New Property")) {
				tempModel = processAddNewPropertyRequest(rdbModel);		
			} else if (reqType.equals("Add Property")) {
				tempModel = processAddPropertyRequest(rdbModel);	
			} else if (reqType.equals("Cancel Add Property")) {				
				gotoString = "/adminResourceManagerServlet?reqType=resource&item=" + item + "&itemType=" + itemType;
			} else if (reqType.equals("Update")) {
				tempModel = processUpdateRequest(rdbModel, session);					
			}  else if (reqType.equals("Delete")) {
				tempModel = processDeleteRequest(rdbModel, session);	
			} else if (reqType.equals("Confirm Delete")) {
				processConfirmDeleteRequest(rdbModel, session);					
			} else if (reqType.equals("Cancel")) {
				gotoString = "/adminResourceManagerServlet?reqType=property&item=" + item + "&property=" + property + "&itemType=" + itemType;
			} else if (reqType.equals("deleteResource")) {
				tempModel = processDeleteResourceRequest(rdbModel);
			} else if (reqType.equals("Confirm Delete Resource")) {
				processConfirmDeleteResourceRequest(rdbModel);
			} else if (reqType.equals("Cancel Delete Resource")) {
				gotoString = "/adminServlet";
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
	
	protected String validateNewTermInputForm() {
		String errorMsg = null;
		
		item.trim();
		if (itemType.equals("collection")) {
			FQNewTerm = item + newTerm;
		} else {
			FQNewTerm = newTerm;
		}
			
		if (newTerm == null) {
			errorMsg = "ERROR: term required.";
		} else if (label == null) {
			errorMsg = "ERROR: label required";
		} else if (definition == null) {
			errorMsg = "ERROR: definition required";
		} else if (description == null) {
			errorMsg = "ERROR: description required";
		} else if (version == null) {
			errorMsg = "ERROR: version required";
		} else if (termType.equals("other")) {
			if (termTypeOther == null) {
				errorMsg = "ERROR: term type required";
			} else {
				termTypeOther.trim();
			}
		}
		
		if (errorMsg == null) {
			newTerm.trim();
			label.trim();
			definition.trim();
			description.trim();
			version.trim();
		}
		
		if (!verifyScheme(FQNewTerm))
			errorMsg = "ERROR: Term value " + FQNewTerm + ": Not a valid URI";
		
		if (!verifyScheme(version))
			errorMsg = "ERROR: Version value " + version + ": Not a valid URI";
		
		if (termType.equals("other")) {
			if (!verifyScheme(termTypeOther))
				errorMsg = "ERROR: Term Type value " + termTypeOther + ": Not a valid URI";
		}
		
		return errorMsg;
	}	
	
	protected void processConfirmDeleteRequest(ModelRDB rdbModel, HttpSession session) {
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Map map = (HashMap) session.getAttribute("map");
			Resource r1 = rdbModel.getResource(item.trim());
			Property p1 = ResourceFactory.createProperty(property.trim());
			SimpleSelector s1 = null;
			if (objLang.equals("N/A")) {
				String rtd = (String) map.get(new Integer(Integer.parseInt(objValue)));
				RDFNode o1 = tempModel.createResource(rtd);
				s1 = new SimpleSelector(r1, p1, o1);
			} else {
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
				rdbModel.remove(stmt);
				
				//System.out.println("ready to delete: ");
				//System.out.println("subject: " + stmt.getSubject().toString());
				//System.out.println("predicate: " + stmt.getPredicate().toString());
				//System.out.println("object: " + stmt.getObject().toString());
			}
			
			// are there any further values for this property?
			s1 = new SimpleSelector(r1, p1, (Object) null);
			si = rdbModel.listStatements(s1);
			if (si.hasNext()) {
				gotoString = "/adminResourceManagerServlet?reqType=property&item=" + item + "&property=" + property + 
					"&itemType=" + itemType;
			} else {
				// are there any properties left for this resource?
				s1 = new SimpleSelector(r1, null, (Object) null);
				si = rdbModel.listStatements(s1);
				if (si.hasNext()) {	
					gotoString = "/adminResourceManagerServlet?reqType=resource&item=" + item + 
						"&itemType=" + itemType;
				} else {
					gotoString = "/adminResourceManagerServlet?reqType=start";
				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}	
	
	protected Model processUpdateRequest(ModelRDB rdbModel, HttpSession session) {
		
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
				
				if (canonical != null)
					setCanonical(r1, objLang);
			
			} else {
				System.out.println("*** error - object not found: " + r1.toString() + ", " + p1.toString());
				System.out.println(objValue + ", " + objLang);
				System.out.println(resValue.trim());
			}
				
			gotoString = "/adminResourceManagerServlet?reqType=property&item=" + item + "&property=" + property + 
				"&itemType=" + itemType;
			return tempModel;				
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected Model processAddNewTermRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			if (itemType.equals("collection")) {
				Resource r1 = rdbModel.getResource(item.trim());
				SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
				tempModel = rdbModel.query(s1);
			} else {
				Resource r1 = tempModel.createResource("http://dublincore.org/dcregistry/temp");
				tempModel.add(r1, DC.title, "temp");
			}
			
			styleSheet = "admin-addResource.xsl";
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
			Resource r1 = rdbModel.getResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = rdbModel.query(s1);
			
			styleSheet = "admin-addProperty.xsl";
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
								
				gotoString = "/adminResourceManagerServlet?reqType=resource&item=" + item + "&itemType=" + itemType;
				
			} else {
				
				Resource r1 = rdbModel.getResource(item.trim());
				SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
				tempModel = rdbModel.query(s1);
				r1 = tempModel.getResource(item.trim());
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "errorMsg");
				r1.addProperty(p1, errorMsg);
				
				styleSheet = "admin-addProperty.xsl";
			}
			
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}			
			

	protected Model processResourceRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Resource r1 = rdbModel.getResource(item.trim());
			StmtIterator si = r1.listProperties(); 
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				Resource subject = (Resource) stmt.getSubject();
				Property predicate = (Property) stmt.getPredicate();
				RDFNode object = (RDFNode) stmt.getObject();
				// include only one (of each predicate
				tempModel.add(subject, predicate, " ");
			}
			
			styleSheet = "admin-resourceManager-resource.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected Model processDeleteResourceRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Resource r1 = rdbModel.getResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			tempModel = rdbModel.query(s1);
			
			styleSheet = "admin-resourceManager-deleteResource.xsl";
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}

	protected void processConfirmDeleteResourceRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			Resource r1 = rdbModel.getResource(item.trim());
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			StmtIterator si = rdbModel.listStatements(s1);
			while (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				rdbModel.remove(stmt);
			}
			
			gotoString = "/adminServlet";
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
			styleSheet = "admin-resourceManager-delete.xsl";
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
			tempModel = ModelFactory.createDefaultModel();
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
			checkCanonical(r1);
					
			/*
			//iterate through mappings and print content
			Set mappings = map.entrySet();
			System.out.println("object \t\t\tkey\t\tvalue");
			for (Iterator i = mappings.iterator(); i.hasNext();) {
				Map.Entry me = (Map.Entry)i.next();
				Object ok = me.getKey();
				Object ov = me.getValue();
				System.out.print(me + "\t");
				System.out.print(ok + "\t");
				System.out.println(ov); 
			}  */
			
			styleSheet = "admin-resourceManager-property.xsl";
			return tempModel;
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}	
	
	protected Model processAddTermRequest(ModelRDB rdbModel) {
		
		Model tempModel = null;
		try {
			tempModel = ModelFactory.createDefaultModel();
			String errorMsg = validateNewTermInputForm();
			if (errorMsg == null) {
				addTerm(rdbModel);
				rdbModel.close();
				
				if ((p_description != null) || (p_title != null) || (p_creator != null) || 
					(p_contributor1 != null) || (p_contributor2 != null) || 
					(p_publisher_lit != null) || (p_publisher_res != null) ||
					(p_source != null) || (p_rights != null)) {
					
					rdbModel = ModelRDB.open(conn, provenance_model);
					addProvenance(rdbModel);
				}

				gotoString = "/adminCollectionManagerServlet?reqType=detail&item=" + item + "&itemType=" + itemType;
				
			} else {
				
				if (itemType.equals("collection")) {
					Resource r1 = rdbModel.getResource(item.trim());
					SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
					tempModel = rdbModel.query(s1);
					r1 = tempModel.getResource(item.trim());
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "errorMsg");
					r1.addProperty(p1, errorMsg);
				} else {
					Resource r1 = tempModel.createResource("http://dublincore.org/dcregistry/temp");
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "errorMsg");
					tempModel.add(r1, p1, errorMsg);
				}
				
				styleSheet = "admin-addResource.xsl";
			}
			
			return tempModel;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return tempModel;
		}
	}
	
	protected void addTerm(ModelRDB rdbModel) {
		try {
			//System.out.println("adding new term: " + FQNewTerm);
			Resource r1 = rdbModel.createResource(FQNewTerm);
			RDFNode ns = rdbModel.getResource(item);
			r1.addProperty(RDFS.isDefinedBy, ns);
			
			r1.addProperty(RDFS.label, label, RFC3066Code);
			r1.addProperty(RDFS.comment, definition, RFC3066Code);
			r1.addProperty(DC.description, description, RFC3066Code);
			
			RDFNode o1 = rdbModel.createResource(rdfType);
			r1.addProperty(RDF.type, o1);
			
			if (termType.equals("other")) {
				o1 = rdbModel.createResource(termTypeOther);
			} else {
				o1 = rdbModel.createResource(termType);
			}
			r1.addProperty(DC.type, o1);
			
			if (refines != null) {
				o1 = rdbModel.createResource("http://" + refines.trim());
				if (rdfType.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"))
					r1.addProperty(RDFS.subPropertyOf, o1);
				else 
					r1.addProperty(RDFS.subClassOf, o1);
			}
			
			o1 = rdbModel.createResource(version);
			r1.addProperty(DCTerms.hasVersion, o1);
			
			r1.addProperty(DCTerms.issued, issuedDate);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}	
	
	protected void addProvenance(ModelRDB rdbModel) {
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
			
			String sr1 = "http://dublincore.org/dcregistry/temp" + todaysDate + "/provenance_" + 
				RFC3066Code + "#" + newTerm + "_label";
			String sr2 = "http://dublincore.org/dcregistry/temp" + todaysDate + "/provenance_" + 
				RFC3066Code + "#" + newTerm + "_comment";
			String sr3 = "http://dublincore.org/dcregistry/temp" + todaysDate + "/provenance_" + 
				RFC3066Code + "#" + newTerm + "_description";
						
			Resource r1 = rdbModel.createResource(sr1);
			Resource r2 = rdbModel.createResource(sr2);
			Resource r3 = rdbModel.createResource(sr3);
			
			r1.addProperty(RDF.predicate, RDFS.label);
			r2.addProperty(RDF.predicate, RDFS.comment);
			r3.addProperty(RDF.predicate, DC.description);
			
			r1.addProperty(RDF.type, RDF.Statement);
			r2.addProperty(RDF.type, RDF.Statement);
			r3.addProperty(RDF.type, RDF.Statement);
			
			Resource rFQNT = rdbModel.createResource(FQNewTerm);
			r1.addProperty(RDF.subject, rFQNT);
			r2.addProperty(RDF.subject, rFQNT);
			r3.addProperty(RDF.subject, rFQNT);
			
			if (p_description != null) {
				r1.addProperty(DC.description, p_description, RFC3066Code);
				r2.addProperty(DC.description, p_description, RFC3066Code);
				r3.addProperty(DC.description, p_description, RFC3066Code);				
			}
				
			if (p_title != null) {
				r1.addProperty(DC.title, p_title, RFC3066Code);
				r2.addProperty(DC.title, p_title, RFC3066Code);
				r3.addProperty(DC.title, p_title, RFC3066Code);
			}
				
			if (p_creator != null) {
				r1.addProperty(DC.creator, p_creator, RFC3066Code);
				r2.addProperty(DC.creator, p_creator, RFC3066Code);
				r3.addProperty(DC.creator, p_creator, RFC3066Code);
			}
				
			if (p_contributor1 != null) {
				r1.addProperty(DC.contributor, p_contributor1, RFC3066Code);
				r2.addProperty(DC.contributor, p_contributor1, RFC3066Code);
				r3.addProperty(DC.contributor, p_contributor1, RFC3066Code);
			}
				
			if (p_contributor2 != null) {
				r1.addProperty(DC.contributor, p_contributor2, RFC3066Code);
				r2.addProperty(DC.contributor, p_contributor2, RFC3066Code);
				r3.addProperty(DC.contributor, p_contributor2, RFC3066Code);
			}
				
			if (p_publisher_lit != null) {
				r1.addProperty(DC.publisher, p_publisher_lit, RFC3066Code);
				r2.addProperty(DC.publisher, p_publisher_lit, RFC3066Code);
				r3.addProperty(DC.publisher, p_publisher_lit, RFC3066Code);
			}
				
			if (p_publisher_res != null) {
				RDFNode o5 = rdbModel.createResource("http://" + p_publisher_res);
				r1.addProperty(DC.publisher, o5);
				r2.addProperty(DC.publisher, o5);
				r3.addProperty(DC.publisher, o5);
			}
				
			if (p_source != null) {
				RDFNode o6 = rdbModel.createResource("http://" + p_source);
				r1.addProperty(DC.source, o6);
				r2.addProperty(DC.source, o6);
				r3.addProperty(DC.source, o6);
			}
				
			if (p_rights != null) {
				r1.addProperty(DC.rights, p_rights, RFC3066Code);
				r2.addProperty(DC.rights, p_rights, RFC3066Code);
				r3.addProperty(DC.rights, p_rights, RFC3066Code);
			}

			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
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
			if (item != null) {
				transformer.setParameter("item", item);
				if (itemType != null) {
					transformer.setParameter("itemType", itemType);
					if (itemType.equals("collection")) {
						int slash = item.lastIndexOf("/");
						int hash = item.lastIndexOf("#");
						if (slash > hash) {
							transformer.setParameter("itemBase", item.substring(0, slash+1));
						} else {
							transformer.setParameter("itemBase", item.substring(0, hash+1));
						}
					} else {
						transformer.setParameter("itemBase", item);
					}
				}
			}
			
			if (property != null)
				transformer.setParameter("property", property);
			if (propertyOther != null)
				transformer.setParameter("propertyOther", propertyOther);
			if (newValue != null)
				transformer.setParameter("newValue", newValue);
			if (reqType.equals("Delete"))
				transformer.setParameter("objValue", objValue);
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
			
			if (objLang != null)
				transformer.setParameter("objLang", objLang);
			if (canonical != null)
				transformer.setParameter("canonical", canonical);
			
			if (reqType.equals("Add Term")) {
				if (newTerm != null)
					transformer.setParameter("newTerm", newTerm);
				if (label != null)
					transformer.setParameter("label", label);
				if (definition != null)
					transformer.setParameter("definition", definition);
				if (description != null)
					transformer.setParameter("description", description);
				if (rdfType != null) {
					int i = rdfType.lastIndexOf("#");
					transformer.setParameter("rdfType", rdfType.substring(i+1));
				}
				if (termType != null) {
					if (termType.equals("other")) {
						transformer.setParameter("termType", "other");
					} else {
						int i = termType.lastIndexOf("#");
						transformer.setParameter("termType", termType.substring(i+1));
					}
				}
			
				if (termTypeOther != null)
					transformer.setParameter("termTypeOther", termTypeOther);
				if (refines != null)
					transformer.setParameter("refines", refines);
				if (version != null)
					transformer.setParameter("version", version);
				if (issuedDate != null) {
					transformer.setParameter("issuedYear", issuedDate.substring(0,4));
					transformer.setParameter("issuedMonth", issuedDate.substring(5,7));
					transformer.setParameter("issuedDay", issuedDate.substring(8));
				} else {
					// set to todays date
					Calendar tDate = new GregorianCalendar();
					transformer.setParameter("issuedYear", Integer.toString(tDate.get(Calendar.YEAR)));
					if (tDate.get(Calendar.MONTH) < 9) {
						transformer.setParameter("issuedMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
					} else if (tDate.get(Calendar.MONTH) == 9) {
						transformer.setParameter("issuedMonth", "10");
					} else {
						transformer.setParameter("issuedMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
					}
					transformer.setParameter("issuedDay", Integer.toString(tDate.get(Calendar.DATE)));
				}
			
				if (RFC3066Code != null) {
					transformer.setParameter("language", RFC3066Code.substring(0,2));
					transformer.setParameter("country", RFC3066Code.substring(3));
				} else if (uiLang != null) {
					transformer.setParameter("language", uiLang.substring(0,2));
					transformer.setParameter("country", uiLang.substring(3));
				} else {
					transformer.setParameter("language", "en");
					transformer.setParameter("country", "US");
				}
				
				if (p_description != null)
					transformer.setParameter("p_description", p_description);
				if (p_title != null)
					transformer.setParameter("p_title", p_title);
				if (p_creator != null)
					transformer.setParameter("p_creator", p_creator);
				if (p_contributor1 != null)
					transformer.setParameter("p_contributor1", p_contributor1);
				if (p_contributor2 != null)
					transformer.setParameter("p_contributor2", p_contributor2);
				if (p_publisher_lit != null)
					transformer.setParameter("p_publisher_lit", p_publisher_lit);
				if (p_publisher_res != null)
					transformer.setParameter("p_publisher_res", p_publisher_res);
				if (p_source != null)
					transformer.setParameter("p_source", p_source);
				if (p_rights != null)
					transformer.setParameter("p_rights", p_rights);
			} else {
				if (uiLang != null) {
					transformer.setParameter("language", uiLang.substring(0,2));
					transformer.setParameter("country", uiLang.substring(3));
				} else {
					transformer.setParameter("language", "en");
					transformer.setParameter("country", "US");
				}
				
				Calendar tDate = new GregorianCalendar();
				transformer.setParameter("issuedYear", Integer.toString(tDate.get(Calendar.YEAR)));
				if (tDate.get(Calendar.MONTH) < 9) {
					transformer.setParameter("issuedMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
				} else if (tDate.get(Calendar.MONTH) == 9) {
					transformer.setParameter("issuedMonth", "10");
				} else {
					transformer.setParameter("issuedMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
				}
				transformer.setParameter("issuedDay", Integer.toString(tDate.get(Calendar.DATE)));
			}
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
			
			itemType = request.getParameter("itemType");
			if (itemType != null)
				if (itemType.equals(""))
					itemType = null;
			
			property = request.getParameter("property");
			if (property != null)
				if (property.equals(""))
					property = null;
				
			propertyOther = request.getParameter("propertyOther");
			if (propertyOther != null)
				if (propertyOther.equals(""))
					propertyOther = null;
			
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
			
			if (reqType.equals("Add Term")) {
				newTerm = request.getParameter("newTerm");
				if (newTerm != null)
					if (newTerm.equals(""))
						newTerm = null;
				
				label = request.getParameter("label");
				if (label != null)
					if (label.equals(""))
						label = null;
				
				definition = request.getParameter("definition");
				if (definition != null)
					if (definition.equals(""))
						definition = null;
				
				description = request.getParameter("description");
				if (description != null)
					if (description.equals(""))
						description = null;
				
				rdfType = request.getParameter("rdfType");
				if (rdfType != null)
					if (rdfType.equals(""))
						rdfType = null;
			
				termType = request.getParameter("termType");
				if (termType != null)
					if (termType.equals(""))
						termType = null;
				
				termTypeOther = request.getParameter("termTypeOther");
				if (termTypeOther != null)
					if (termTypeOther.equals(""))
						termTypeOther = null;
				
				refines = request.getParameter("refines");
				if (refines != null)
					if (refines.equals(""))
						refines = null;
				
				version = request.getParameter("version");
				if (version != null)
					if (version.equals(""))
						version = null;
				
				String issuedYear = request.getParameter("issuedYear");
				if (issuedYear != null)
					if (issuedYear.equals(""))
						issuedYear = null;
				
				String issuedMonth = request.getParameter("issuedMonth");
				if (issuedMonth != null)
					if (issuedMonth.equals(""))
						issuedMonth = null;
				
				String issuedDay = request.getParameter("issuedDay");
				if (issuedDay != null)
					if (issuedDay.equals(""))
						issuedDay = null;
				
				if ((issuedYear != null) && (issuedMonth != null) && (issuedDay != null)) {
					issuedDate = issuedYear + "-" + issuedMonth + "-" + issuedDay;
				} else {
					issuedDate = null;
				}
			
				if ((country != null) && (language != null)) {
					RFC3066Code = language + "-" + country;
				} else {
					RFC3066Code = null;
				}
				
				p_description = request.getParameter("p_description");
				if (p_description != null)
					if (p_description.equals(""))
						p_description = null;
				
				p_title = request.getParameter("p_title");
				if (p_title != null)
					if (p_title.equals(""))
						p_title = null;
				
				p_creator = request.getParameter("p_creator");
				if (p_creator != null)
					if (p_creator.equals(""))
						p_creator = null;
				
				p_contributor1 = request.getParameter("p_contributor1");
				if (p_contributor1 != null)
					if (p_contributor1.equals(""))
						p_contributor1 = null;
				
				p_contributor2 = request.getParameter("p_contributor2");
				if (p_contributor2 != null)
					if (p_contributor2.equals(""))
						p_contributor2 = null;
				
				p_publisher_lit = request.getParameter("p_publisher_lit");
				if (p_publisher_lit != null)
					if (p_publisher_lit.equals(""))
						p_publisher_lit = null;
				
				p_publisher_res = request.getParameter("p_publisher_res");
				if (p_publisher_res != null)
					if (p_publisher_res.equals(""))
						p_publisher_res = null;
				
				p_source = request.getParameter("p_source");
				if (p_source != null)
					if (p_source.equals(""))
						p_source = null;
				
				p_rights = request.getParameter("p_rights");
				if (p_rights != null)
					if (p_rights.equals(""))
						p_rights = null;
	
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}	
	
	protected void checkCanonical(Resource r1) {

		IDBConnection conn2 = null;
		try {
			conn2 = new DBConnection(db_uri, db_user, db_password, db_type);
			Model canonicalModel = ModelRDB.open(conn2, canonical_model);
			
			Selector s1 = new SimpleSelector(r1, DC.language, (String) null);
			StmtIterator si = canonicalModel.listStatements(s1);
			if (si.hasNext()) {
				canonical = (String) ((Statement) si.next()).getLiteral().getLexicalForm();
			} else {
				canonical = "en-US";	
			}
			
			canonicalModel.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn2.close();
			} catch (Exception e2) { }
		}
	}
		
	protected void setCanonical(Resource r1, String lang) {

		IDBConnection conn2 = null;
		try {
			conn2 = new DBConnection(db_uri, db_user, db_password, db_type);
			Model canonicalModel = ModelRDB.open(conn2, canonical_model);
			
			Selector s1 = new SimpleSelector(r1, DC.language, (String) null);
			StmtIterator si = canonicalModel.listStatements(s1);
			if (si.hasNext()) {
				Statement stmt = (Statement) si.next();
				stmt.changeObject(lang);
			} else {
				canonicalModel.add(r1, DC.language, lang);	
			}
			
			canonicalModel.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn2.close();
			} catch (Exception e2) { }
		}
	}	
	
	// this method used for debugging...
	protected void writeFile(String saveFileName, String inFile) throws IOException {
		
		File rdfFile = new File(saveFileName);
		if (rdfFile.createNewFile()) {
			System.out.println("RDF file: " + saveFileName + " opened for output");
		} else {
			System.out.println("Failed to open RDF file: " + saveFileName);
		}

		FileOutputStream out = new FileOutputStream(rdfFile);
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeBytes(inFile);
	}
		
}

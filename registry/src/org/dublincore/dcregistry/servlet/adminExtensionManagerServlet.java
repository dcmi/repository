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



public class adminExtensionManagerServlet extends registryServlet  {

	String reqType = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String item = null;
	String type = null;
	String seqno = null;
	String label = null;
	String requires = null;
	String prevType = null;
	String prevSeqno = null;
	String prevLabel = null;
	String prevRequires = null;
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
			ModelRDB rdbModel = ModelRDB.open(conn, extensions_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			if (reqType.equals("start")) {
				SimpleSelector s1 = new SimpleSelector(null, null, (Object) null);
				tempModel = rdbModel.query(s1);				
			} else if (reqType.equals("Update")) {
				Resource r1 = rdbModel.getResource(item.trim());
				
				if (!prevType.equals(type)) {
					SimpleSelector s1 = new SimpleSelector(r1, DC.type, (String) null);
					StmtIterator si = rdbModel.listStatements(s1);
					if (si.hasNext()) {
						Statement stmt = (Statement) si.next();
						stmt.changeObject(type);
					}
				}
				
				if (!prevLabel.equals(label)) {
					SimpleSelector s1 = new SimpleSelector(r1, RDFS.label, (String) null);
					StmtIterator si = rdbModel.listStatements(s1);
					if (si.hasNext()) {
						Statement stmt = (Statement) si.next();
						String currentObj = stmt.getLiteral().getLexicalForm();
						
							stmt.changeObject(label);
					}
				}
				
				if (!prevRequires.equals(requires)) {
					SimpleSelector s1 = new SimpleSelector(r1, DCTerms.requires, (String) null);
					StmtIterator si = rdbModel.listStatements(s1);
					if (si.hasNext()) {
						Statement stmt = (Statement) si.next();
						String currentObj = stmt.getLiteral().getLexicalForm();
						if (!currentObj.equals(requires))
							stmt.changeObject(requires);
					}
				}
				
				if (!prevSeqno.equals(seqno)) {
					Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "seqno");
					SimpleSelector s1 = new SimpleSelector(r1, p1, (String) null);
					StmtIterator si = rdbModel.listStatements(s1);
					if (si.hasNext()) {
						Statement stmt = (Statement) si.next();
						String currentObj = stmt.getLiteral().getLexicalForm();
						
							stmt.changeObject(seqno);
					}
				}
				
				//gotoPage("/adminExtensionManagerServlet?reqType=start", request, response);
				SimpleSelector s1 = new SimpleSelector(null, null, (Object) null);
				tempModel = rdbModel.query(s1);	
				
			}  else if (reqType.equals("Add")) {
				Calendar tDate = new GregorianCalendar();
				StringBuffer td = new StringBuffer();
				td.append(tDate.get(Calendar.YEAR));
				td.append(tDate.get(Calendar.MONTH));
				td.append(tDate.get(Calendar.DATE));
				td.append(tDate.get(Calendar.HOUR_OF_DAY));
				td.append(tDate.get(Calendar.MINUTE));
				td.append(tDate.get(Calendar.SECOND));
				
				Resource r1 = rdbModel.createResource("http://dublincore.org/registry/" + td.toString());
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "seqno");
				r1.addProperty(DC.type, type);
				r1.addProperty(RDFS.label, label);
				r1.addProperty(DCTerms.requires, requires); 
				r1.addProperty(p1, seqno);
				
				//gotoPage("/adminExtensionManagerServlet?reqType=start", request, response);
				SimpleSelector s1 = new SimpleSelector(null, null, (Object) null);
				tempModel = rdbModel.query(s1);	
				
			}  else if (reqType.equals("Delete")) {
				Resource r1 = rdbModel.getResource(item.trim());
				SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
				tempModel = rdbModel.query(s1);	
								
			} else if (reqType.equals("Confirm Delete")) {
				Resource r1 = rdbModel.getResource(item.trim());
				Selector s1 = new SimpleSelector(r1, null, (Object) null);
				StmtIterator si = rdbModel.listStatements(s1);
				while (si.hasNext()) {
					Statement stmt = (Statement) si.next();
					rdbModel.remove(stmt);
				}
				
				//gotoPage("/adminExtensionManagerServlet?reqType=start", request, response);
				s1 = new SimpleSelector(null, null, (Object) null);
				tempModel = rdbModel.query(s1);	
								
			} else if (reqType.equals("Cancel")) {
				SimpleSelector s1 = new SimpleSelector(null, null, (Object) null);
				tempModel = rdbModel.query(s1);	
			}
			
			rdbModel.close();
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			tempModel.close();
			
			if (reqType.equals("Delete")) {
				transform(response, caw, "adminExtensionManager-delete.xsl");
			} else {
				transform(response, caw, "adminExtensionManager.xsl");
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
	

	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("reqType", reqType);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			if (item != null)
				transformer.setParameter("item", item);
			if (type != null)
				transformer.setParameter("type", type);
			if (seqno != null)
				transformer.setParameter("seqno", seqno);
			if (label != null)
				transformer.setParameter("label", label);
			if (requires != null)
				transformer.setParameter("requires", requires);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}		
		
	}


	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		reqType = null;
		try {
			uiStyle = "std";
			uiLang = get_uiLang_Preference(request,session);
			resultsLang = get_resultsLang_Preference(request,session);
	
			reqType = request.getParameter("reqType");
			if (reqType == null) {
				reqType = "start";
			} else {
				item = request.getParameter("item");
				type = request.getParameter("type");
				seqno = request.getParameter("seqno");
				label = request.getParameter("label");
				requires = request.getParameter("requires");
				prevType = request.getParameter("prevType");
				prevSeqno = request.getParameter("prevSeqno");
				prevLabel = request.getParameter("prevLabel");
				prevRequires = request.getParameter("prevRequires");
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
		
}

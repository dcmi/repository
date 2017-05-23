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
 *  M.Nagamori  <nagamorm@oclc.org>
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

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class importRDFServlet extends registryServlet {

	private String reqType = null;
	private String uiStyle = null;
	private String uiLang = null;
	private String resultsLang = null;
	private String schemaURL = null;
	private String dir = null;
	private String fileData = null;
	private String targetModel = null;
	private List filelist = new ArrayList();
	IDBConnection conn = null;


	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		if (!isAuthorized(request, response)){
		    //setNextPage("/importRDFServlet", request);
		    gotoPage("/adminLoginServlet", request, response);
		}
	
		HttpSession session = request.getSession(true);
		schemaURL = null;
		dir = null;
		fileData = null;
		targetModel = null;
		filelist = new ArrayList();
		getInputData(request, response, session);
	
		if (reqType.equals("start")) {
			try {
				Model tempModel = ModelFactory.createDefaultModel();		// empty model
				CharArrayWriter caw = new CharArrayWriter();
				tempModel.write(caw, "RDF/XML");
				tempModel.close();
				transform(response, caw, "admin-import.xsl");	
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			}
			
		} else {
			
			try {
				Class.forName(JDBCDriver);
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				ModelRDB rdbModel = ModelRDB.open(conn, targetModel);
				Model tempModel = ModelFactory.createDefaultModel();
				Property importProperty = 
					ResourceFactory.createProperty("http://dublincore.org/registry/", "displayMsg");
				
				String displayMsg = validateInputData();
				if (displayMsg != null) {
					Resource subject = tempModel.createResource();
					subject.addProperty(importProperty, displayMsg);
					
					CharArrayWriter caw = new CharArrayWriter();
					tempModel.write(caw, "RDF/XML");
					tempModel.close();
					transform(response, caw, "admin-import.xsl");
				} else {
					//System.out.println("importing data...");
					long bSize = rdbModel.size();
					JenaReader jr = new JenaReader();
					
					if (dir.length() > 0) {
						//System.out.println("processing directory...");
						for (int i=0; i < filelist.size(); i++) {
							String fileURL = "file://" + (String) filelist.get(i);
							//System.out.println("fileURL: " + fileURL);
							tempModel.close();
							tempModel = ModelFactory.createDefaultModel();
							jr.read(tempModel, fileURL);
							StmtIterator si = tempModel.listStatements();
							while (si.hasNext()) {
								Statement stmt = (Statement) si.next();
								Resource subject = (Resource) stmt.getSubject();
								Property predicate = (Property) stmt.getPredicate();
								RDFNode object = (RDFNode) stmt.getObject();
								//rdbModel.add(stmt);
								if (object instanceof Literal)
									rdbModel.add(subject, predicate, stmt.getLiteral().getLexicalForm().trim(), stmt.getLanguage());		
								else
									rdbModel.add(stmt);
							}
						}
							
					} else if (fileData.length() > 0) {
						InputStream is = new ByteArrayInputStream(fileData.getBytes());
						jr.read(tempModel, is, "");
						//jr.read(tempModel, is, "http://dublincore.org/dcregistry/");   //hrw 20040611
						
					} else if (schemaURL.length() > 0) {
						jr.read(tempModel, schemaURL);
					}
					
					StmtIterator si = tempModel.listStatements();
					while (si.hasNext()) {
						Statement stmt = (Statement) si.next();
						Resource subject = (Resource) stmt.getSubject();
						Property predicate = (Property) stmt.getPredicate();
						RDFNode object = (RDFNode) stmt.getObject();
						//rdbModel.add(stmt);
						if (object instanceof Literal)
							rdbModel.add(subject, predicate, stmt.getLiteral().getLexicalForm().trim(), stmt.getLanguage());		
						else
							rdbModel.add(stmt);
					}

					long eSize = rdbModel.size();
					displayMsg = new String(Long.toString(eSize - bSize) + " statements added.");
					
					tempModel.close();
					tempModel = ModelFactory.createDefaultModel();
					Resource subject = tempModel.createResource();
					subject.addProperty(importProperty, displayMsg);
					
					CharArrayWriter caw = new CharArrayWriter();
					tempModel.write(caw, "RDF/XML");
					tempModel.close();
					transform(response, caw, "admin-import.xsl");					
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
		
	}


    	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("reqType", reqType);
			if (schemaURL != null)
			    transformer.setParameter("schemaURL", schemaURL);
			if (dir != null)
			    transformer.setParameter("dir", dir);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} 		
	}

    
	private void getInputData (HttpServletRequest request, HttpServletResponse response, HttpSession session) 
		throws ServletException, IOException  {
			
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
		
		String c_type = request.getContentType();
		if (c_type == null || c_type.length() == 0) {
			reqType = "start";
		} else {	
			int ind = c_type.indexOf("boundary=");
			String boundary = c_type.substring(ind+9);
			MultiPart mp = new MultiPart();
			Hashtable ctt_tbl = mp.parse(boundary, request.getInputStream());
		
			reqType = getParameter(ctt_tbl, "reqType");
			schemaURL = getParameter(ctt_tbl, "schemaURL");
			fileData = getParameter(ctt_tbl, "fileData");
			dir = getParameter(ctt_tbl, "dir");
			targetModel = getParameter(ctt_tbl, "targetModel");
		} 
	}
    

    	private String validateInputData () {
	
		String msg = null;
		int i =0;
		
		if (schemaURL.length() > 0) 
			i++;
		if (fileData.length() > 0) 
			i++;
		if (dir.length() > 0) 
			i++;
		
		if (i > 1) {
			msg = "Invalid selection.  Please select exactly one, and only one, form of input.";
			return msg;
		} else if (i == 0) {
			msg = "Schema URL, local file or directory name required";
			return msg;
		}
		
		if (fileData.length() > 0) {
			//System.out.println("found a file");
			return msg;
		} else if (schemaURL.length() > 0) {
			try {
				//System.out.println("found a URL");
				URL url = new URL(schemaURL);
				URLConnection connect = url.openConnection();
				InputStream in = connect.getInputStream();				
			} catch (Exception e) {
				msg = "URL not found.  Please enter a valid URL.";
			}
		
			return msg;
		} else {		
			try {
				//System.out.println("found a directory");
				File fn = new File(getServletContext().getRealPath(dir));
				if(!fn.exists()) {
					msg = "Directory not found.  Please enter a valid directory name relative to your ServletContext.";
				} else if(fn.isDirectory()) {
					getFileList(fn);
				} else {
					msg = "The directory name entered is not a directory.  Please enter a directory, or use the File " + 
						"input field to specify a regular file.";
				}
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
				msg = "Error processing directory input request.";
			}
		}
	
		return msg;
	}
	
	private String getParameter(Hashtable tbl, String name) {
		//return ((ByteArrayOutputStream)tbl.get(name)).toString();
		return (String)tbl.get(name);
	}
	
	private void getFileList(File f) {
		if (f.isDirectory()) {			// recurse if a directory
			String entries[] = f.list();
			for (int i = 0; i < entries.length; i++) {
				getFileList(new File(f, entries[i]));
			}
		} else if (f.isFile()) {		// for plain files, add to list
			filelist.add(f.getAbsolutePath());
		}
	}
    
}

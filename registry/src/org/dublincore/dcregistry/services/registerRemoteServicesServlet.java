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

package org.dublincore.dcregistry.services;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.wsil.*;
import org.apache.wsil.extension.wsdl.*;

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

public class registerRemoteServicesServlet extends remoteRegistryServlet  {
			
		String modelSize = "0";
		String uiLang = null;
		String resultsLang = null;
		String reqType = null;
		String wsinspectionURL = null;
		String name = null;
		String wsdl = null;
		String port = null;
		String svcAbstract = null;
		String client = null;
		String msg = null;
		StringBuffer msgBuffer = null;
		IDBConnection conn = null;
   
		public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			StringBuffer msgBuffer = new StringBuffer();
			HttpSession session = request.getSession(true);
			getInputParameters(request, session);
			
			Description[] descriptions;
			Abstract[] abstracts;
			String serviceName;
			String svcsURI = "http://dublincore.org/dcregistry/services/";
			int serviceCount = 0;
  
			try {
				Class.forName(JDBCDriver);
				conn = new DBConnection(db_uri, db_user, db_password, db_type);
				ModelRDB remoteModel = ModelRDB.open(conn, remote_model);
				Model tempModel = ModelFactory.createDefaultModel();
				
				Property p1 = ResourceFactory.createProperty(svcsURI, "serviceName");
				Property p3 = ResourceFactory.createProperty(svcsURI, "wsdl");
				Property p4 = ResourceFactory.createProperty(svcsURI, "svcAbstract");
				Property p5 = ResourceFactory.createProperty(svcsURI, "status");
				Property p6 = ResourceFactory.createProperty(svcsURI, "definedIn");
				Property p7 = ResourceFactory.createProperty(svcsURI, "svcClient");
				
				if (reqType.equals("register")) {
					if (client.equals("")) {
						//System.out.println("null client - unregistering");
						Resource r1 =remoteModel.createResource(port);
						Selector s1 = new SimpleSelector(r1, null, (String) null);
						StmtIterator sti = remoteModel.listStatements(s1);
						while (sti.hasNext()) {
							Statement stmt = (Statement) sti.next();
							remoteModel.remove(stmt);
						}
					} else {
						Resource r1 =remoteModel.createResource(port);
						Statement stmt = remoteModel.createStatement(r1, p1, name);
						remoteModel.add(stmt);
						//stmt = remoteModel.createStatement(r1, p2, handle);
						//remoteModel.add(stmt);
						RDFNode remoteWSDL = remoteModel.createResource(wsdl);
						stmt = remoteModel.createStatement(r1, p3, remoteWSDL);
						remoteModel.add(stmt);
						stmt = remoteModel.createStatement(r1, p4, svcAbstract);
						remoteModel.add(stmt);
						stmt = remoteModel.createStatement(r1, p5, "registered");
						remoteModel.add(stmt);
						RDFNode remoteWSIL = remoteModel.createResource(wsinspectionURL);
						stmt = remoteModel.createStatement(r1, p6, remoteWSIL);
						remoteModel.add(stmt);
						
						// check for previously registered client and remove if found
						Selector s1 = new SimpleSelector(r1, p7, (String) null);
						StmtIterator sti = remoteModel.listStatements(s1);
						while (sti.hasNext()) {
							stmt = (Statement) sti.next();
							remoteModel.remove(stmt);
						}
						
						stmt = remoteModel.createStatement(r1, p7, client);
						remoteModel.add(stmt);
					}
					
					reqType = "inspect";
				}
				
				if (reqType.equals("inspect")) {
					WSILDocument document = WSILDocument.newInstance();	
					document.read(wsinspectionURL);
					Inspection inspection = document.getInspection();
					Service[] services = inspection.getServices();
									
					for (serviceCount = 0; serviceCount < services.length; serviceCount++) {
						descriptions = services[serviceCount].getDescriptions();
						serviceName = (services[serviceCount].getServiceNames().length == 0) ? 
							"[no service name]" : services[serviceCount].getServiceNames()[0].getText();
						
						for (int descCount = 0; descCount < descriptions.length; descCount++) {
							if (descriptions[descCount].getReferencedNamespace().equals(WSDLConstants.NS_URI_WSDL)) {										
								
								String remoteWSDLst = descriptions[descCount].getLocation();
								RDFNode remoteWSDL = tempModel.createResource(remoteWSDLst);
								Resource r1 = tempModel.createResource(remoteWSDLst.substring(0, (remoteWSDLst.length() - 5)));
								Statement stmt = tempModel.createStatement(r1, p1, serviceName);
								tempModel.add(stmt);
								stmt = tempModel.createStatement(r1, p3, remoteWSDL);
								tempModel.add(stmt);
															
								abstracts = services[serviceCount].getAbstracts();
								for (int abstractCount = 0; abstractCount < abstracts.length; abstractCount++) {
									stmt = tempModel.createStatement(r1, p4, (String) abstracts[abstractCount].getText());
									tempModel.add(stmt);
								}
								
								String remote_client = getRemoteServiceClient(remoteModel, r1, p7);
								if (remote_client == null) {
									stmt = tempModel.createStatement(r1, p5, "not registered");
									tempModel.add(stmt);
								} else {
									stmt = tempModel.createStatement(r1, p5, "registered");
									tempModel.add(stmt);
									stmt = remoteModel.createStatement(r1, p7, remote_client);
									tempModel.add(stmt);
								}
							}
						}
					}
				}
				
				msg = msgBuffer.toString();
				CharArrayWriter caw = new CharArrayWriter();
				tempModel.write(caw, "RDF/XML");
				modelSize = Integer.toString(serviceCount);
				tempModel.close();
				remoteModel.close();
				transform(response, caw, "registerRemoteServices.xsl");	

			} catch (org.apache.wsil.WSILException e1) {
				System.out.println("WSIL Exception");
				System.err.println(e1);
				e1.printStackTrace();
			} catch (Exception e2) {
				System.err.println(e2);
				e2.printStackTrace();
				e2.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (Exception e3) { }
			}
		}
		
		
		public String getRemoteServiceClient(Model remoteModel, Resource r1, Property p1) {
			String client_s = null;
			
			try {
				NodeIterator ni = remoteModel.listObjectsOfProperty(r1, p1);			
				while (ni.hasNext()) {
					RDFNode client_n = (RDFNode) ni.next();
					client_s = client_n.toString();
				}
			} catch (Exception e) {
				System.out.println("error checking status");
				System.err.println(e);
				e.printStackTrace();
			}	
			
			return client_s;
		}
		
		
		protected void setXSLTParms (Transformer transformer) {
			try {	
				transformer.setParameter("modelSize", modelSize);
				transformer.setParameter("uiLang", uiLang);
				transformer.setParameter("resultsLang", resultsLang);
				//transformer.setParameter("handle", handle);
				transformer.setParameter("wsinspectionURL", wsinspectionURL);
				transformer.setParameter("msg", msg);
			} catch (Exception e) {
				 System.err.println(e);
				 e.printStackTrace();
			}
		}
		
		public void getInputParameters (HttpServletRequest request, HttpSession session) {
			
			reqType = null;
			wsinspectionURL = null;
			msg = null;
			
			reqType = request.getParameter("reqType");
			if (reqType == null) {
				reqType = "start";
			} else if (reqType.equals("inspect")) {			
				//handle = request.getParameter("handle");
				wsinspectionURL = request.getParameter("wsinspectionURL");
			} else if (reqType.equals("register")) {
				//handle = request.getParameter("handle");
				wsinspectionURL = request.getParameter("wsinspectionURL");
				port = request.getParameter("port");
				name = request.getParameter("name");
				wsdl = request.getParameter("wsdl");
				svcAbstract = request.getParameter("svcAbstract");
				client = request.getParameter("client");
			} else {
				reqType = "start";
			}
			
			uiLang = (String) session.getAttribute("uiLang");
			if (uiLang == null) { 	
				uiLang = defaut_ui_lang;
			}
	
			resultsLang = (String) session.getAttribute("resultsLang");
			if (resultsLang == null) { 	
				resultsLang = defaut_rs_lang;
			}
		}
		
}

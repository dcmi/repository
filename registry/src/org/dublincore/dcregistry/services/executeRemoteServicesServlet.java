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

public class executeRemoteServicesServlet extends remoteRegistryServlet  {
			
		String modelSize = "0";
		String uiLang = null;
		String resultsLang = null;
		StringBuffer td = null;
		String servicePort = null;
		IDBConnection conn = null;
   
		public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
				
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
				Property p5 = ResourceFactory.createProperty(svcsURI, "status");
				
				Calendar tDate = new GregorianCalendar();
				td = new StringBuffer();
				td.append(tDate.get(Calendar.YEAR));
				td.append(tDate.get(Calendar.MONTH));
				td.append(tDate.get(Calendar.DATE));
				td.append(tDate.get(Calendar.HOUR_OF_DAY));
				td.append(tDate.get(Calendar.MINUTE));
				td.append(tDate.get(Calendar.SECOND));
				
				if (servicePort == null) {
					Selector s1 = new SimpleSelector(null, p5, "registered");
					Model tempModel2 = remoteModel.query(s1);
					StmtIterator sti = tempModel2.listStatements();
					while (sti.hasNext()) {
						Statement stmt = (Statement) sti.next();
						Resource port = stmt.getSubject();
						s1 = new SimpleSelector(port, null, (String) null);
						tempModel.add(remoteModel.query(s1));
					}
					tempModel2.close();
				} else {
					Resource port = remoteModel.getResource(servicePort);
					Selector s1 = new SimpleSelector(port, null, (String) null);
					tempModel.add(remoteModel.query(s1));
				}
				
				CharArrayWriter caw = new CharArrayWriter();
				tempModel.write(caw, "RDF/XML");
				//System.out.println(caw);
				modelSize = Integer.toString(serviceCount);
				tempModel.close();
				remoteModel.close();
				transform(response, caw, "executeRemoteRegistry.xsl");		

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
				transformer.setParameter("uiLang", uiLang);
				transformer.setParameter("resultsLang", resultsLang);
				transformer.setParameter("ts", td.toString());
			} catch (Exception e) {
				 System.err.println(e);
				 e.printStackTrace();
			}
		}
		
		public void getInputParameters (HttpServletRequest request, HttpSession session) {
			
			servicePort = request.getParameter("servicePort");
			
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

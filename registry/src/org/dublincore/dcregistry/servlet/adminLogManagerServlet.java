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

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

import org.w3c.dom.*;
import javax.xml.transform.dom.*;
import javax.xml.parsers.*;
import org.apache.xpath.*;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class adminLogManagerServlet extends registryServlet  {
	
	String reqType = null;
	String account = null;
	String password = null;
	String rollWeb = null;
	String rollRest = null;
	String rollAxis = null;
	IDBConnection conn = null;
   
	 public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
				
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		String displayMsg = null;
		if (!reqType.equals("start"))
			displayMsg = validateInput();
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Resource r1 = tempModel.createResource("http://dublincore.org/registry/appl_log");
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "hasStatus");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "currentLog");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "oldLog");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "displayMsg");
			
			if (reqType.equals("start")) {	
				if (lfn == null)
					r1.addProperty(p2, "not opened");
				else
					r1.addProperty(p2, lfn);
				
				//roll axis log
				org.dublincore.dcregistry.services.RecycleLogSoapBindingStub binding = null;
				binding = (org.dublincore.dcregistry.services.RecycleLogSoapBindingStub) 
					new org.dublincore.dcregistry.services.LogManagerServiceLocator().getrecycleLog();
					
				// Time out after a minute
				binding.setTimeout(60000);
					
				String value =  binding.getLogFileName();
				JenaReader jr = new JenaReader();
				InputStream is = new ByteArrayInputStream(value.getBytes());
				jr.read(tempModel, is, "");
				
				//roll rest log
				String reqURL = request.getRequestURL().toString();
				String restLogManagerURL = reqURL.substring(0, reqURL.lastIndexOf("/")) + 
					"/restLogManager?account=" + account + "&password=" + password + "&reqType=start";
				jr = new JenaReader();
				jr.read(tempModel, restLogManagerURL);
				
				if (displayMsg != null) {
					r1.addProperty(p4, displayMsg);
				}
				
			} else if (reqType.equals("roll")) {			
				boolean validAccount = validateAccount();
				if (validAccount) {
					if (rollAxis.equals("Y")) {
						//roll axis log
						org.dublincore.dcregistry.services.RecycleLogSoapBindingStub binding = null;
						binding = (org.dublincore.dcregistry.services.RecycleLogSoapBindingStub) 
							new org.dublincore.dcregistry.services.LogManagerServiceLocator().getrecycleLog();
							
						String value =  binding.recycleLog(account, password);
						JenaReader jr = new JenaReader();
						InputStream is = new ByteArrayInputStream(value.getBytes());
						jr.read(tempModel, is, "");
					}
					
					if (rollRest.equals("Y")) {
						//roll rest log
						String reqURL = request.getRequestURL().toString();
						String restLogManagerURL = reqURL.substring(0, reqURL.lastIndexOf("/")) + 
							"/restLogManager?account=" + account + "&password=" + password + "&reqType=roll";
						//System.out.println("restLogManagerURL: " + restLogManagerURL);
						JenaReader jr = new JenaReader();
						jr.read(tempModel, restLogManagerURL);
					}
					
					if (rollWeb.equals("Y")) {
						//roll application log
						r1.addProperty(p3, lfn);
						boolean recycleOK = newLogHandler();
						if (recycleOK) {
							//System.out.println("Application Log recycled.");
							r1.addProperty(p1, "complete");
							r1.addProperty(p2, lfn);
						} else {
							System.out.println("Application Log recycle failed!");
							r1.addProperty(p1, "failed");
						}
					}
				
				} else {
					System.out.println("Non-authorized attempt to recycle Application log file: " + account + 
						", " + password);
					r1.addProperty(p4, "not authorized");
				}			
			}
			
			CharArrayWriter caw = new CharArrayWriter();
			tempModel.write(caw, "RDF/XML");
			tempModel.close();
			//System.out.println(caw);
			transform(response, caw, "admin-logManager.xsl");
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	protected boolean validateAccount () {
		
		boolean validAccount = false;
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB accountModel = ModelRDB.open(conn, account_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			if ((account != null) && (password != null)) {
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "account");
				Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "password"); 
				Selector s1 = new SimpleSelector(null, p1, account);
		
				tempModel = accountModel.query(s1);
				StmtIterator sti = tempModel.listStatements();
				if (sti.hasNext()) {
					Statement stmt = (Statement) sti.next();
					Resource subject = stmt.getSubject();
					SimpleSelector s2 = new SimpleSelector(subject, p2, password);
					tempModel = accountModel.query(s2);
					StmtIterator sti2 = tempModel.listStatements();
					if (sti2.hasNext()) {
						Statement stmt2 = (Statement) sti2.next();
						String pw = stmt2.getLiteral().getLexicalForm();
						if (pw.equals(password)) {
							validAccount = true;
						}
					}
				}
			}
			
			accountModel.close();
			tempModel.close();
		
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
		
		return validAccount;
	}
	
	protected void setXSLTParms (Transformer transformer) {		}
	
	protected String validateInput () {
		
		String msg = null;
		if (account == null) {
			msg = "Account and password are required";
			reqType = "start";
		} else if (password == null) {
			msg = "Account and password are required";
			reqType = "start";
		} else if ((!rollWeb.equals("Y")) &&  (!rollRest.equals("Y")) && (!rollAxis.equals("Y"))) {
			msg = "Nothing to do!";
			reqType = "start";
		}
		
		return msg;
	}
			
	public void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else if (reqType.equals("")) {
			reqType = "start";
		}
			
		account = request.getParameter("account");
		if (account != null)
			if (account.equals(""))
				account = null;
		password = request.getParameter("password");
		if (password != null)
			if (password.equals(""))
				password = null;
		
		rollWeb = request.getParameter("rollWeb");
		if (rollWeb == null) {
			rollWeb = "N";
		} else if (rollWeb.equals("")) {
			rollWeb = "N";
		}
		
		rollRest = request.getParameter("rollRest");
		if (rollRest == null) {
			rollRest = "N";
		} else if (rollRest.equals("")) {
			rollRest = "N";
		}
		
		rollAxis = request.getParameter("rollAxis");
		if (rollAxis == null) {
			rollAxis = "N";
		} else if (rollAxis.equals("")) {
			rollAxis = "N";
		}
	}
	
}

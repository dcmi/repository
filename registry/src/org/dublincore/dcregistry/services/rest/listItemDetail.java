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

package org.dublincore.dcregistry.services.rest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.rpc.server.*;
import javax.xml.rpc.ServiceException;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.util.*;
import java.text.BreakIterator;
import java.sql.Connection;
import java.sql.DriverManager;  


public class listItemDetail extends remoteRestServlet {
	
	String item = null;
	String lang = null;
	IDBConnection conn = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CharArrayWriter caw = new CharArrayWriter();
		String tmpstr = null;
		//System.out.println("getItemDetail: " + item + " " + lang);
		getInputParameters(request);
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, registry_model);
			Model summaryModel = ModelFactory.createDefaultModel();
			Model resultsModel = ModelFactory.createDefaultModel();
			Model tempModel = ModelFactory.createDefaultModel();
			
			Calendar todaysDate = new GregorianCalendar();
			StringBuffer ts = new StringBuffer(); 
			ts.append(monthNames[todaysDate.get(Calendar.MONTH)]);
			ts.append(" " + todaysDate.get(Calendar.DATE));
			ts.append(" " + todaysDate.get(Calendar.HOUR_OF_DAY));
			ts.append(":" + todaysDate.get(Calendar.MINUTE));
			ts.append(":" + todaysDate.get(Calendar.SECOND));
			ts.append(" " + todaysDate.get(Calendar.YEAR));
			ts.append(" EST");
				
			Resource r1 = resultsModel.createResource(item.trim());
			Selector s1 = new SimpleSelector(r1, null, (String) null);
			tempModel = rdbModel.query(s1);
			
			StmtIterator sti = tempModel.listStatements();
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if (stmt.getObject() instanceof Literal) {
					if (lang == null) {					// default is to return all langs
						resultsModel.add(stmt);
					} else {
						if (stmt.getLanguage().equals(lang)) {		// language match
							resultsModel.add(stmt);
						}
					}
				} else {
					resultsModel.add(stmt);
				}
			}
				
			tempModel.close();
			rdbModel.close();
	
			resultsModel.write(caw, "RDF/XML");
			resultsModel.close();
			
			tmpstr = new String(caw.toString().getBytes("UTF8"), "UTF8");
			tmpstr = tmpstr.replaceAll("&#9;", "");
			tmpstr = tmpstr.replaceAll("&#xA;", "");
			tmpstr = escape(tmpstr);
			logger.info(request.getRemoteAddr() + ", " + item + " " + lang);
			
			response.setContentType("text/xml; charset=UTF-8");
			Writer out = response.getWriter();
			out.write(tmpstr);
			out.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
	}
	
	private void getInputParameters (HttpServletRequest request) {

		item = null;
		lang = null;

		item = request.getParameter("item");
		lang = request.getParameter("lang");
		
	}
	
}

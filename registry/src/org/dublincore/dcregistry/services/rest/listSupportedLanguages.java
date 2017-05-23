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


public class listSupportedLanguages extends remoteRestServlet {
	
	IDBConnection conn = null;
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CharArrayWriter caw = new CharArrayWriter();
		String tmpstr = null;	
		try {		
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
			Model summaryModel = ModelFactory.createDefaultModel();
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
			
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "rsSupport");			
			ArrayList rList = new ArrayList();
			SimpleSelector s1 = new SimpleSelector(null, p1, (boolean) true);
			StmtIterator sti = rdbModel.listStatements(s1);
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				String lang= new String((String) stmt.getSubject().toString());
				rList.add(lang);
			}
			
			Collections.sort(rList);
			Bag refs = summaryModel.createBag();
			int itemCount = 0;
			for (int i=0; i < rList.size(); i++) {
				String s = (String) rList.get(i);
				refs.add(s);
				itemCount++;
			}
		
			Resource subject = summaryModel.createResource("http://dublincore.org/dcregistry/");
			subject.addProperty(DCTerms.references, refs);
	
			rdbModel.close();
			tempModel.close();
			summaryModel.write(caw, "RDF/XML");
			summaryModel.close();
		
			tmpstr = new String(caw.toString().getBytes("UTF8"), "UTF8");
			logger.info(request.getRemoteAddr());
			
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
	
}

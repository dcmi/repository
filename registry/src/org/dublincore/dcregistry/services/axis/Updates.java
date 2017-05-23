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

package services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.rpc.server.*;
import javax.xml.rpc.ServiceException;
import org.apache.axis.MessageContext;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.util.*;
import java.text.BreakIterator;
import java.sql.Connection;
import java.sql.DriverManager;  


public class Updates extends remoteAxisServlet {

	protected MessageContext msgContext;
	IDBConnection conn = null;
	
	public void init(java.lang.Object context) throws ServiceException {
		super.init(context);
		ServletEndpointContext ctx = (ServletEndpointContext) context;
		msgContext = (MessageContext) ctx.getMessageContext();		
	}

	public String getTermUpdates (String dateIn, String langIn) {
		
		CharArrayWriter caw = new CharArrayWriter();
		String tmpstr = null;
		int iDateIn = 19570104;
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, registry_model);
			Model tempModel = ModelFactory.createDefaultModel();
			Model resultsModel = ModelFactory.createDefaultModel();
			
			if (dateIn == null) {
				return tmpstr;
			} else {
				iDateIn = Integer.parseInt(dateIn);
			}
			
			resultsModel.add(getNewOrModifiedTerms(DCTerms.issued, rdbModel, iDateIn, langIn));
			resultsModel.add(getNewOrModifiedTerms(DCTerms.modified, rdbModel, iDateIn, langIn));
				
			tempModel.close();
			rdbModel.close();
	
			resultsModel.write(caw, "RDF/XML");
			resultsModel.close();
			
			String IP = getClientIP(msgContext);
			logger.info(IP + ", " + dateIn + " " + langIn);
			
			tmpstr = new String(caw.toString().getBytes("UTF8"), "UTF8");
			tmpstr = tmpstr.replaceAll("&#9;", "");
			tmpstr = tmpstr.replaceAll("&#xA;", "");
			tmpstr = escape(tmpstr);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
		
		return tmpstr;
	}
	
	
	private Model getNewOrModifiedTerms (Property p1, Model rdbModel, int idate, String lang) {
		
		Model resultsModel = null;
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			resultsModel = ModelFactory.createDefaultModel();
			
			Selector s1 = new SimpleSelector(null, p1, (String) null);
			tempModel = rdbModel.query(s1);	
			StmtIterator sti = tempModel.listStatements();
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				String date_issued = stmt.getObject().toString();
				String dateIssued = date_issued.substring(0, 4) + date_issued.substring(5, 7) + date_issued.substring(8);
				int iDateIssued = Integer.parseInt(dateIssued);
				if (iDateIssued > idate) {
					Selector s2 = new SimpleSelector((Resource) stmt.getSubject(), null, (String) null);
					tempModel = rdbModel.query(s2);
					StmtIterator sti2 = tempModel.listStatements();
					while (sti2.hasNext()) {
						Statement stmt2 = (Statement) sti2.next();
						if (stmt2.getObject() instanceof Literal) {				
							if ((stmt2.getLanguage() == null) || (stmt2.getLanguage().equals(""))) {
								//non-natural language literal
								resultsModel.add(stmt2);
							} else {
								if (lang.equals("all")) {				
									//select any language
									resultsModel.add(stmt2);
								} else {
									//check for language match
									if (stmt2.getLanguage().equals(lang)) {		
										resultsModel.add(stmt2);
									}
								}
							}
						} else {
							resultsModel.add(stmt2);
						}
					}				//while...
				}				//if...
			}				//while...
		
			tempModel.close();
			
			return resultsModel;
		
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			return resultsModel;
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}		
	}
	
}

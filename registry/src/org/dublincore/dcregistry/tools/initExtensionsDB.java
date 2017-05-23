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
 
package org.dublincore.dcregistry.tools;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 


public class initExtensionsDB extends registryTools {        

	public static void main (String args[]) {
		
		try {
			getProperties();
			
		} catch (Exception e) {
			System.out.println("error reading properties file");
			System.err.println(e);
			e.printStackTrace();
		}
		
		IDBConnection conn = null;		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			System.out.println("connection established");
			
			ModelRDB rdbModel = ModelRDB.open(conn, extensions_model);
			System.out.println("model opened");
			
			Property seqno = ResourceFactory.createProperty("http://dublincore.org/registry/", "seqno");
			String TS = get_timestamp();
			Resource r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_000");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "overview");
			r1.addProperty(DCTerms.requires, "termsOverviewServlet"); 
			r1.addProperty(seqno, "001");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_001");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "elements");
			r1.addProperty(DCTerms.requires, "elementsServlet");
			r1.addProperty(seqno, "002");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_002");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "refinements");
			r1.addProperty(DCTerms.requires, "refinementsServlet");
			r1.addProperty(seqno, "003");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_003");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "controlledTerms");
			r1.addProperty(DCTerms.requires, "controlledTermsServlet");
			r1.addProperty(seqno, "004");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_004");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "encodingSchemes");
			r1.addProperty(DCTerms.requires, "encodingSchemesServlet");
			r1.addProperty(seqno, "005");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_005");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "summary");
			r1.addProperty(DCTerms.requires, "summaryServlet");
			r1.addProperty(seqno, "006");
			
			/*
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_005");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "documents");
			r1.addProperty(DCTerms.requires, "documentsServlet"); 
			r1.addProperty(seqno, "006");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_006");
			r1.addProperty(DC.type, "std");
			r1.addProperty(RDFS.label, "translations");
			r1.addProperty(DCTerms.requires, "translationsServlet");
			r1.addProperty(seqno, "007");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_007");
			r1.addProperty(DC.type, "rdf");
			r1.addProperty(RDFS.label, "classes");
			r1.addProperty(DCTerms.requires, "classesServlet"); 
			r1.addProperty(seqno, "001");
			
			r1 = rdbModel.createResource("http://dublincore.org/registry/" + TS + "_008");
			r1.addProperty(DC.type, "rdf");
			r1.addProperty(RDFS.label, "properties");
			r1.addProperty(DCTerms.requires, "propertiesServlet");
			r1.addProperty(seqno, "002");
			*/
			
			//CharArrayWriter caw = new CharArrayWriter();
			//rdbModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			rdbModel.close();
			System.out.println("model closed");
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("connection closed");
			} catch (Exception e2) { }
		}
	}
	
	
	public static String get_timestamp () {
		
		StringBuffer td = new StringBuffer();
		try {
			Calendar tDate = new GregorianCalendar();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append(tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return td.toString();		
		
	}
	
}

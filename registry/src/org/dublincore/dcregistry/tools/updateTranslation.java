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


public class updateTranslation extends registryTools {
   
	private static String translation_id;
	private static String uiSupport;
	private static String rsSupport;
	private static boolean supported = true;
	private static boolean notSupported = false;

	public static void main (String args[]) {
		
		if (args.length > 2) {
			translation_id = args[0];
			uiSupport = args[1];
			rsSupport = args[2];
			//System.out.println("updating translation: " + translation_id);
		} else {
			System.out.println("improper usage");
			usage();
			System.exit(-1);
		}
		
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
			//System.out.println("connection established");
			
			ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
			//System.out.println("model opened");
			
			String tlang = "http://dublincore.org/registry/" + translation_id;
			Resource r1 = rdbModel.getResource(tlang);
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "uiSupport");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "rsSupport");
			
			SimpleSelector s1 = new SimpleSelector(r1, null, (Object) null);
			StmtIterator sti = rdbModel.listStatements(s1);
			System.out.println(tlang + " previously configured as:");
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				Property prop = stmt.getPredicate();
				RDFNode object = (RDFNode) stmt.getObject();
				if (object instanceof Literal)
					System.out.println(prop.getLocalName()  + ": " + stmt.getLiteral().getLexicalForm());
				else
					System.out.println(prop.getLocalName()  + ": " + object.toString());					
			}
			
			s1 = new SimpleSelector(r1, p1, (Object) null);
			sti = rdbModel.listStatements(s1);		
			if (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if ((uiSupport.equals("y")) || (uiSupport.equals("Y")))
					stmt.changeObject(supported);
				else
					stmt.changeObject(notSupported);
			}
			
			s1 = new SimpleSelector(r1, p2, (Object) null);
			sti = rdbModel.listStatements(s1);
			if (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				if ((rsSupport.equals("y")) || (rsSupport.equals("Y")))
					stmt.changeObject(supported);
				else
					stmt.changeObject(notSupported);
			}
			
			s1 = new SimpleSelector(r1, null, (Object) null);
			sti = rdbModel.listStatements(s1);
			System.out.println("\n" + tlang + " now configured as:");
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				Property prop = stmt.getPredicate();
				RDFNode object = (RDFNode) stmt.getObject();
				if (object instanceof Literal)
					System.out.println(prop.getLocalName()  + ": " + stmt.getLiteral().getLexicalForm());
				else
					System.out.println(prop.getLocalName()  + ": " + object.toString());					
			}
					
			rdbModel.close();
			//System.out.println("model closed");
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				//System.out.println("connection closed");
			} catch (Exception e2) { }
		}
	}
	
	private static final void usage() {
		System.out.println("usage: updateTranslation <an ISO 639-1 two-letter language code and an ISO-3166 two-letter country " +
		" code (seperated by a hyphen)> <ui indicator> <rs indicator>. For example: de-DE Y Y");
	}

}

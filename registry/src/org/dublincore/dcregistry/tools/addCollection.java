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
 
package org.dublincore.dcregistry.tools;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 


/**
 *
 * @author  h.wagner
 */

public class addCollection extends registryTools {
   
	private static String collection_name;

	public static void main (String args[]) {
		if (args.length > 0) {
			collection_name = args[0];
			System.out.println("adding collection: " + collection_name);
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
		String dc = "http://purl.org/dc/elements/1.1/";
		String dcq = "http://purl.org/dc/terms/";
		String dctype = "http://purl.org/dc/dcmitype/";		
		
		try {
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			System.out.println("connection established");
			
			ModelRDB rdbModel = ModelRDB.open(conn, collection_model);
			System.out.println("model opened");
			
			if (collection_name.equals("default")) {
				Resource r1 = rdbModel.createResource("_collection_");
				r1.addProperty(DC.relation, rdbModel.createResource(dc));
				System.out.println("added collection: " + dc);
				r1.addProperty(DC.relation, rdbModel.createResource(dcq));
				System.out.println("added collection: " + dcq);
				r1.addProperty(DC.relation, rdbModel.createResource(dctype));
				System.out.println("added collection: " + dctype);
				System.out.println("default collections added");
			} else {
				Resource r1 = rdbModel.createResource("_collection_");
				r1.addProperty(DC.relation, rdbModel.createResource(collection_name));
				System.out.println("added collection: " + collection_name);
			}
		
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
	
	private static final void usage() {
		System.out.println("usage: addCollection <collection name>.  You can specify 'default' to add the default" + 
		"DCMI collections.");
	}
	
}

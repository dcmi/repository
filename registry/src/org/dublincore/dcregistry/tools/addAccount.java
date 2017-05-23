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

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 


public class addAccount extends registryTools {
	
	private static String admin_name;
	private static String admin_pw;
	private static String buildDir;
	
	public static void main (String args[]) {
		
		if (args.length > 1) {
			admin_name = args[0];
			admin_pw = args[1];
			System.out.println("adding account: " + admin_name);
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
			System.out.println("connection established");
			
			ModelRDB rdbModel = ModelRDB.open(conn, account_model);
			System.out.println("model opened");
			
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "account");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "password");
			
			Resource r1 = rdbModel.createResource();
			r1.addProperty(p1, admin_name);
			r1.addProperty(p2, admin_pw);
			System.out.println("account added");
		
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
		System.out.println("usage: addAccount <account name> <account password>");
	}
   
	
}

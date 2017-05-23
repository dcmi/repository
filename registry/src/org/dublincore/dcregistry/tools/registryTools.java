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

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;


public class registryTools {
	
	protected static String db_user;
	protected static String db_password;
	protected static String db_uri;
	protected static String JDBCDriver;
	protected static String registry_model;
	protected static String provenance_model;
	protected static String translations_model;
	protected static String collection_model;
	protected static String account_model;
	protected static String remote_model;
	protected static String canonical_model;
	protected static String extensions_model;
	protected static String db_type;
	protected static String logDir;
	protected static String logFilePrefix;


	public static void getProperties() {

		try {
			String propertyFile = "../../build/WEB-INF/jdbc.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);
	
			db_user = p.getProperty("db_user");
			db_password = "";
			db_uri = p.getProperty("db_uri");
			JDBCDriver = p.getProperty("JDBCDriver");
			registry_model = p.getProperty("registry_model");
			provenance_model = p.getProperty("provenance_model");
			collection_model = p.getProperty("collection_model");
			translations_model = p.getProperty("translations_model");
			account_model = p.getProperty("account_model");
			remote_model = p.getProperty("remote_model");
			canonical_model = p.getProperty("canonical_model");
			extensions_model = p.getProperty("extensions_model");
			db_type = p.getProperty("db_type");
			logDir = p.getProperty("logDir");
			logFilePrefix = p.getProperty("logFilePrefix");
	
		} catch (Exception e) {
			System.err.println(e);
		}
				
	}

}



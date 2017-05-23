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


public class initTranslationDB extends registryTools {
   
	private static boolean supported = true;
	private static boolean notSupported = false;
	private static String [][] translations = {
		{"ar-SA", "\u0627\u0644\u0639\u0631\u0628\u064a\u0629 \u0627\u0644\u0646\u0633\u062e\u0629/\u0639\u0631\u0628\u064a"},	
		{"ca-ES", "Catalan"},
		{"cs-CZ", "\u010cesky"},	
		{"cy-GB", "Cymraeg"},      
		{"da-DK", "Dansk"},
		{"de-DE", "Deutsch"},
		{"el-GR", "\u0395\u03bb\u03bb\u03b7\u03bd\u03b9\u03ba\u03ac"},
		{"en-US", "English"},	
		{"es-ES", "Espa\u00f1ol"},
		{"fi-FI", "Suomeksi"},	
		{"fr-FR", "Fran\u00e7ais"},
		{"it-IT", "Italiano"},   
		{"ja-JP", "\u65e5\u672c\u8a9e"},
		{"ko-KR", "\ud55c\uad6d\uc5b4"},
		{"mi-NZ", "Te Reo M\u0101ori"},
		{"mr-IN", "\u092e\u0930\u093e\u0920\u0940"},
		{"no-NO", "Norsk"},
		{"pl-PL", "Polski"},
		{"pt-PT", "Portugu\u00eas"},     
		{"ru-RU", "\u0420\u0443\u0441\u0441\u043a\u0438\u0439"},
		{"sv-SE", "Svenska"},
		{"th-TH", "\u0e44\u0e17\u0e22"},
		{"uk-UA", "\u0443\u043a\u0440\u0430\u0457\u043d\u0441\u044c\u043a\u0430"},
		{"zh-CN", "\u7b80\u4f53\u4e2d\u6587"},	
		{"zh-TW", "\u7e41\u9ad4\u4e2d\u6587"}			
	};
        

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
			
			ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
			System.out.println("model opened");
			
			Resource r1 = null;
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "uiSupport");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "rsSupport");

			for (int row = 0; row < translations.length; row++) {
				r1 = rdbModel.createResource("http://dublincore.org/registry/" + translations[row][0]);
				r1.addProperty(DC.description, rdbModel.createLiteral(translations[row][1], translations[row][0]));
				if (translations[row][0].equals("en-US")) {
					r1.addProperty(p1, supported);
					r1.addProperty(p2, supported);
				} else {
					r1.addProperty(p1, notSupported);
					r1.addProperty(p2, notSupported);
				}
				System.out.println("added translation: " + r1.toString());
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
	
}

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

package org.dublincore.dcregistry.bean;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

import java.sql.Connection;
import java.sql.DriverManager;  

import org.w3c.dom.*;
import javax.xml.transform.dom.*;
import javax.xml.parsers.*;
import org.apache.xpath.*;
import org.apache.xml.utils.WrappedRuntimeException;


public class languageBean {
	
	public static Node getLanguages(String langType, String rootdir) {
	
		IDBConnection conn = null;
		
		try {
			//System.out.println("rootdir: " + rootdir);
			String propertyFile = rootdir + "WEB-INF/" + "jdbc.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);
			
			String db_user = p.getProperty("db_user");
			String db_password = "";
			String JDBCDriver = p.getProperty("JDBCDriver");
			String db_uri = p.getProperty("db_uri");
			String translations_model = p.getProperty("translations_model");
			String db_type = p.getProperty("db_type");			
			
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB rdbModel = ModelRDB.open(conn, translations_model);
			//System.out.println("connection established");
			Model tempModel = ModelFactory.createDefaultModel();
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry#", "description");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry#", "type");
			
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			//Element root = doc.createElement("ui");
			Element root = doc.createElement(langType);
			//addChild(root, "lang", "en-USEnglish");

			ArrayList rList = new ArrayList();
			ResIterator ri = rdbModel.listSubjectsWithProperty(p3, langType);
			while (ri.hasNext()) {
				Resource r1 = (Resource) ri.next();
				Selector s1 = new SimpleSelector(r1, p2, (String) null);
				tempModel = rdbModel.query(s1);
				StmtIterator si = tempModel.listStatements();
				while (si.hasNext()) {
					Statement stmt = (Statement) si.next();
					String s = r1.toString() + stmt.getObject().toString();
					//addChild(root, "lang", s);
					rList.add(s);
				}
			}

			Collections.sort(rList);	
			for (int i=0; i < rList.size(); i++) {
				String ss = (String) rList.get(i);
				addChild(root, "lang", ss);
			}
	     
			rdbModel.close();
			tempModel.close();
			return root;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			throw  new WrappedRuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
				
	} 

  
	/**
	* utility method for adding text nodes.
	*/
	private static void addChild (Node parent, String name, String text) {
		Element child = parent.getOwnerDocument().createElement(name);
		child.appendChild(parent.getOwnerDocument().createTextNode(text));
		parent.appendChild(child);
	}
		
}



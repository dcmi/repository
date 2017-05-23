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


public class extensionsBean {
	
	public static Node getExtensions(String uiStyle, String rootdir) {
	
		IDBConnection conn = null;
		Element root = null;
		
		try {
			//System.out.println("rootdir: " + rootdir);
			String propertyFile = rootdir + "WEB-INF/" + "jdbc.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);
	
			String db_user = p.getProperty("db_user");
			String db_password = "";
			String db_uri = p.getProperty("db_uri");
			String JDBCDriver = p.getProperty("JDBCDriver");
			String extensions_model = p.getProperty("extensions_model");
			String db_type = p.getProperty("db_type");
			
			Class.forName(JDBCDriver);
			conn = new DBConnection(db_uri, db_user, db_password, db_type);
			ModelRDB extModel = ModelRDB.open(conn, extensions_model);
			Model tempModel = ModelFactory.createDefaultModel();
			
			String service = null;
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			root = doc.createElement("services");
			
			Property seqno = ResourceFactory.createProperty("http://dublincore.org/registry/", "seqno");
			//Bag services = tempModel.createBag("http://dublincore.org/dcregistry/services/");
			ResIterator ri = extModel.listSubjectsWithProperty(DC.type, uiStyle);
			while (ri.hasNext()) {
				Resource r1 = (Resource) ri.next();
				NodeIterator ni = extModel.listObjectsOfProperty(r1, seqno);
				if (ni.hasNext())
					service = ni.next().toString();
				ni = extModel.listObjectsOfProperty(r1, RDFS.label);
				if (ni.hasNext())
					service = service + ni.next().toString();
				service = service + ",";
				ni = extModel.listObjectsOfProperty(r1, DCTerms.requires);
				if (ni.hasNext())
					service = service + ni.next().toString();
				//services.add(service);
				addChild(root, "extension", service);
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) { }
		}
		
		return root;						
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



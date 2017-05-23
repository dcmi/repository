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

import org.apache.wsil.*;
import org.apache.wsil.extension.wsdl.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 


public class initRemoteDB extends registryTools {        

	public static void main (String args[]) {
		
		String wsinspectionURL;
		Description[] descriptions;
		Abstract[] abstracts;
		String serviceName;
		String svcsURI = "http://dublincore.org/dcregistry/services/";
		int serviceCount = 0;
		
		if (args.length > 0) {
			wsinspectionURL = args[0];	
		} else {
			wsinspectionURL = "http://dublincore.org/services/inspection.wsil";
		}
		System.out.println("Procesing WSIL document: " + wsinspectionURL);
		
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
			ModelRDB remoteModel = ModelRDB.open(conn, remote_model);
			System.out.println("model opened");
			
			Property p1 = ResourceFactory.createProperty(svcsURI, "serviceName");
			Property p3 = ResourceFactory.createProperty(svcsURI, "wsdl");
			Property p4 = ResourceFactory.createProperty(svcsURI, "svcAbstract");
			Property p5 = ResourceFactory.createProperty(svcsURI, "status");
			Property p6 = ResourceFactory.createProperty(svcsURI, "definedIn");
			Property p7 = ResourceFactory.createProperty(svcsURI, "svcClient");
						
			WSILDocument document = WSILDocument.newInstance();
			document.read(wsinspectionURL);
			Inspection inspection = document.getInspection();
			Service[] services = inspection.getServices();
			
			for (serviceCount = 0; serviceCount < services.length; serviceCount++) {
				descriptions = services[serviceCount].getDescriptions();
				serviceName = (services[serviceCount].getServiceNames().length == 0) ? 
					"[no service name]" : services[serviceCount].getServiceNames()[0].getText();
				
				for (int descCount = 0; descCount < descriptions.length; descCount++) {
					if (descriptions[descCount].getReferencedNamespace().equals(WSDLConstants.NS_URI_WSDL)) {										
						
						String remoteWSDLst = descriptions[descCount].getLocation();
						RDFNode remoteWSDL = remoteModel.createResource(remoteWSDLst);
						Resource r1 = remoteModel.createResource(remoteWSDLst.substring(0, (remoteWSDLst.length() - 5)));
						r1.addProperty(p1, serviceName);
						r1.addProperty(p3, remoteWSDL);
													
						abstracts = services[serviceCount].getAbstracts();
						for (int abstractCount = 0; abstractCount < abstracts.length; abstractCount++) {
							r1.addProperty(p4, (String) abstracts[abstractCount].getText());
						}
						
						r1.addProperty(p5, "registered");
						String service = r1.toString();
						String client = null;
						if (service.equals("http://dublincore.org/axis/services/elementSummary"))
							client = "remoteElementSummaryClient";
						if (service.equals("http://dublincore.org/axis/services/languagesSummary"))
							client = "remoteLanguageClient";
						if (service.equals("http://dublincore.org/axis/services/itemSummary"))
							client = "remoteItemSummaryClient";
						if (service.equals("http://dublincore.org/axis/services/termUpdates"))
							client = "remoteTermUpdatesClient";
						if (service.equals("http://dublincore.org/axis/services/itemDetail"))
							client = "remoteItemDetailClient";
						if (service.equals("http://dublincore.org/axis/services/refinementsSummary"))
							client = "remoteRefinementsSummaryClient";
						if (service.equals("http://dublincore.org/axis/services/vocabularyTermsSummary"))
							client = "remoteVocabularyTermsSummaryClient";
						if (service.equals("http://dublincore.org/axis/services/encodingSchemesSummary"))
							client = "remoteEncodingSchemesSummaryClient";	
						r1.addProperty( p7, client);
					}
				}
			}
			
			//CharArrayWriter caw = new CharArrayWriter();
			//rdbModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			remoteModel.close();
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

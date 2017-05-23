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

package org.dublincore.dcregistry.services;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

import org.w3c.dom.*;
import javax.xml.transform.dom.*;
import javax.xml.parsers.*;
import org.apache.xpath.*;  

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class remoteEncodingSchemesSummaryClient extends remoteRegistryServlet  {
			
		String port = null;
		String saveOption = "N";
		String localFileName = null;
   
		public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
			
				HttpSession session = request.getSession(true);
				getInputParameters(request, session);
				
        org.dublincore.dcregistry.services.EncodingSchemes binding = null;
				java.net.URL portAddress = new java.net.URL(port);
        try {
            binding = new org.dublincore.dcregistry.services.EncodingSchemesSummaryLocator().getencodingSchemesSummary(portAddress);
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
        }
				
				try {
					java.lang.String value = null;
					value = binding.listEncodingSchemes(port);
					if (saveOption.equals("Y")) {
						System.out.println("writing file: " + localFileName);
						writeFile(localFileName, value);
					}
					
					Document doc = null;
					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					doc = db.newDocument();
					Element root = (Element) doc.createElement("root");
					doc.appendChild(root);
					root.appendChild(doc.createTextNode(value));
					transform(response, doc, "displayRawRDF.xsl");

				} catch (Exception e) {
					System.out.println("error importing data");
					System.err.println(e);
					e.printStackTrace();
				}	
		}
		
		protected void setXSLTParms (Transformer transformer) {  }
			
		public void getInputParameters (HttpServletRequest request, HttpSession session) {		
			port = request.getParameter("port");
			saveOption = request.getParameter("saveOption");
			localFileName = request.getParameter("localFileName");
		}
		
}

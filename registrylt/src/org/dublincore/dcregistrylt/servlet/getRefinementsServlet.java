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

package org.dublincore.dcregistrylt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;
import java.util.regex.*;

public class getRefinementsServlet extends registryServlet  {
	
	private static String REGEX = "rdf:RDF";
	private static String REPLACE = "rdf:IEisStupid";

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
					
		try {
			Model summaryModel = ModelFactory.createDefaultModel();
			RDFNode obj = summaryModel.createResource("http://dublincore.org/usage/documents/principles/#element");
			
			ArrayList rList = new ArrayList();
			ResIterator ri = registryModel.listSubjectsWithProperty(DC.type, obj);
			while (ri.hasNext()) {
				String term = ri.next().toString();
				getRefinements (term, summaryModel);
			}
			
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(summaryModel);
			summaryModel.write(caw, "RDF/XML");
			summaryModel.close();
			
			//the following is needed because internet explorer is not very bright...
			String refsRDF = caw.toString();
			Pattern p = Pattern.compile(REGEX);
			Matcher m = p.matcher(refsRDF);
			refsRDF = m.replaceAll(REPLACE);
			
			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlout = xmlheadr + refsRDF;
			
			response.setContentType("text/xml; charset=UTF-8");               
			PrintWriter out = response.getWriter();
			//System.out.println(xmlout);
			out.write(xmlout);
			out.close();
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	private void getRefinements (String term, Model summaryModel) throws ServletException, IOException {		
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			RDFNode o1 = tempModel.createResource(term);
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/dcregistrylt/", "isRefinedBy");
			SimpleSelector s1 = new SimpleSelector(null, RDFS.subPropertyOf, o1);
			tempModel = registryModel.query(s1);		

			StmtIterator si1 = tempModel.listStatements();
			if (si1.hasNext()) {
				Resource r1 = summaryModel.createResource(term);
				while (si1.hasNext()) {
					Statement refStmt = (Statement) si1.next();
					r1.addProperty(p1, (RDFNode) refStmt.getSubject());
				}
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
}



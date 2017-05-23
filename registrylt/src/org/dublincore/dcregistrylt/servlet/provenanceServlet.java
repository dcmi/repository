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


public class provenanceServlet extends registryServlet  {

	String modelSize = "0";
	String reqType = null;
	String action = null;
	String item = null;
	String node = null;
	String uiLang = null;
	String xlang = null;

	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException  {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + item + " " + uiLang);
		
		try {
			Model tempModel = ModelFactory.createDefaultModel();
			Model resultsModel = ModelFactory.createDefaultModel();

			RDFNode o1 = tempModel.createResource(item.trim());
			RDFNode o2 = tempModel.createResource(node.trim());
			SimpleSelector s1 = new SimpleSelector(null, RDF.subject, o1);
			tempModel = provenanceModel.query(s1);
			ResIterator ri = tempModel.listSubjects();
			
			tempModel.close();
			tempModel = ModelFactory.createDefaultModel();
			while (ri.hasNext()) {
				Resource r2 = (Resource) ri.next();
				if (provenanceModel.contains(r2, RDF.predicate, o2)) {
					if ((int) r2.toString().indexOf(new String("provenance_" + xlang)) != -1) {
						SimpleSelector si = new SimpleSelector(r2, null, (Object) null);
						tempModel.add(provenanceModel.query(si));
					}
				}
			}

			StmtIterator sti = tempModel.listStatements();
			while (sti.hasNext()) {
				Statement stmt = (Statement) sti.next();
				resultsModel.add(stmt);
			}

			tempModel.close();
			CharArrayWriter caw = new CharArrayWriter();
			setNSPrefix(resultsModel);
			resultsModel.write(caw, "RDF/XML");
			modelSize = Long.toString(getModelCount(resultsModel));
			resultsModel.close();

			String xmlheadr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
			String xmlstyle = "<?xml-stylesheet type=\"text/xsl\" href=\"/dcregistrylt/xsl/" + provenance_xsl + "\" ?>";
			String xmlparms = "<?params reqType=\"" + reqType + "\"" + " action=\"" + action + "\"" +
				" modelSize=\"" + modelSize + "\"" + " uiLang=\"" + uiLang + "\"" + 
				" node=\"" + node + "\"" + " xlang=\"" + xlang + "\"" + 
				" item=\"" + item + "\"" + " ?>";
			String xmlout = xmlheadr + xmlstyle + xmlparms + caw.toString();
			
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
	
	
	protected String instanceOf(Resource r1, Model provenanceModel) {

		Model tempModel = ModelFactory.createDefaultModel();
		String stmtType = "unknown";
		try {
			NodeIterator ni = provenanceModel.listObjectsOfProperty(r1, RDF.type);
			while (ni.hasNext()) {
				stmtType = ni.next().toString();
				//System.out.println("instanceOf: " + stmtType);
			}

		} catch (Exception e) { 
			System.err.println(e);
			e.printStackTrace();
		}

		return stmtType;
	}


	protected long getModelCount(Model m) throws ServletException, IOException {

		long mCount = 0;
		try {
		
			ResIterator ri = m.listSubjects();
			while (ri.hasNext()) {
				ri.next();
				mCount++;
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}

		return mCount;
	}

	public void getInputParameters (HttpServletRequest request, HttpSession session) {

		reqType = null;
		item = null;
		node = null;
		xlang = null;
		String afterHash = null;
		
		action = (String) session.getAttribute("action");
		if (action == null)
			action = "navigate";
		
		uiLang = get_uiLang_Preference(request,session);
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else {
			item = request.getParameter("item");
			xlang = request.getParameter("xlang");
			node = request.getParameter("node");
			afterHash = request.getParameter("afterHash");
		}
		
		if (afterHash != null)
			node = node + "#" + afterHash;

		session.setAttribute("reqType", reqType);
		if (item != null)
			session.setAttribute("item", item);
	}
		
}



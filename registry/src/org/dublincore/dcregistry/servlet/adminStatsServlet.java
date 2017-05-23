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

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class adminStatsServlet extends registryServlet {

	String reqType = null;
	String uiStyle = null;
	String uiLang = null;
	String resultsLang = null;
	String dir = null;
	String appPfx = null;
	String restPfx = null;
	String soapPfx = null;
	String dateType = null;
	String bDate = null;
	String eDate = null;
	String method = null;
	String methodType = null;
	String sessionID = null;
	String IP = null;
	String page = null;

	static String Months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	static String abbrMonths[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	String styleSheet = null;
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		if (!isAuthorized(request, response)){
		    gotoPage("/adminLoginServlet", request, response);
		}
	
		HttpSession session = request.getSession(true);
		getInputData(request, response, session);
		Model statsModel =  ModelFactory.createDefaultModel();
		if (reqType.equals("start")) {
			try {
				File tFile = new File(axisLog);
				String slash = tFile.separator;
				
				dir = axisLog.substring(0, axisLog.lastIndexOf(slash) + 1);
				appPfx = appLog.substring(appLog.lastIndexOf(slash) + 1);
				restPfx = restLog.substring(restLog.lastIndexOf(slash) + 1);
				soapPfx = axisLog.substring(axisLog.lastIndexOf(slash) + 1);
				
				Property importProperty = 
					ResourceFactory.createProperty("http://dublincore.org/registry/", "displayMsg");
				Resource subject = statsModel.createResource();
				subject.addProperty(importProperty, " ");
				styleSheet = "admin-statsOverview.xsl";
				
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			}
			
		} else {	
			String msg = validateInput();
			if (msg != null) {
				Resource r1 = statsModel.createResource();
				Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "displayMsg");
				r1.addProperty(p1, msg);
			} else {
				statsModel.close();
				if (reqType.equals("overview")) {
					statsModel = prepareOverviewReport();
					styleSheet = "admin-statsOverview.xsl";
				} else if (reqType.equals("restSummary")) {
					statsModel = prepareAppInterfaceSummary(restPfx);
					styleSheet = "admin-statsAppSummary.xsl";
				} else if (reqType.equals("soapSummary")) {
					statsModel = prepareAppInterfaceSummary(soapPfx);
					styleSheet = "admin-statsAppSummary.xsl";
				} else if (reqType.equals("methodDetail")) {
					statsModel = prepareMethodDetail();
					styleSheet = "admin-statsMethodDetail.xsl";
				} else if (reqType.equals("IPDetail")) {
					statsModel = prepareIPDetail();
					styleSheet = "admin-statsIPDetail.xsl";
				} else if (reqType.equals("visitsSummary")) {
					statsModel = prepareVisitsSummary();
					styleSheet = "admin-statsVisitsSummary.xsl";
				} else if (reqType.equals("sessionDetail")) {
					statsModel = prepareSessionDetail();
					styleSheet = "admin-statsSessionDetail.xsl";
				} else if (reqType.equals("pageSummary")) {
					statsModel = preparePageSummary();
					styleSheet = "admin-statsPageSummary.xsl";
				} else if (reqType.equals("pageDetail")) {
					statsModel = preparePageDetail();
					styleSheet = "admin-statsPageDetail.xsl";
				} else if (reqType.equals("IPSummary")) {
					statsModel = prepareIPSummary();
					styleSheet = "admin-statsIPSummary.xsl";
				} else if (reqType.equals("appIPDetail")) {
					statsModel = prepareVisitsSummary();
					styleSheet = "admin-statsAppIPDetail.xsl";
				}
			}
		}
		
		try {
			CharArrayWriter caw = new CharArrayWriter();
			statsModel.write(caw, "RDF/XML");
			//System.out.println(caw);
			statsModel.close();
			transform(response, caw, styleSheet);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
			
	}
	
	protected Model prepareOverviewReport() {
		
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			
			//get web stats
			List IPList = new ArrayList();
			List visitsList = new ArrayList();
			List pageList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {	
						int end = logArray[8].indexOf(", ");
						String sessionID = logArray[8].substring(0, end);
						visitsList.add(sessionID);
						
						int beg = end + 2;
						end = logArray[8].indexOf(", ", beg);
						String IP = null;
						if (end > beg)
							IP = logArray[8].substring(beg, end);
						else
							IP = logArray[8].substring(beg);
						IPList.add(IP);
						
						String page = logArray[5].substring(logArray[5].lastIndexOf(".") +1);
						pageList.add(page + "," + logArray[0] + logArray[1]);
					}
				}	
			}
			
			//get rest stats
			List restList = new ArrayList();
			filelist = new ArrayList();
			getFileList(fn, filelist, restPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String IP = null;
						if (end > 0)
							IP = logArray[8].substring(0, end);
						else
							IP = logArray[8];
						restList.add(IP + "," + logArray[5] + logArray[0]);
					}
				}	
			}
							
			//get axis stats
			List soapList = new ArrayList();
			filelist = new ArrayList();
			getFileList(fn, filelist, soapPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String IP = null;
						if (end > 0)
							IP = logArray[8].substring(0, end);
						else
							IP = logArray[8];
						soapList.add(IP + "," + logArray[6] + logArray[0]);
					}
				}	
			}
			
			//dedup
			IPList = deDup(IPList);
			visitsList = deDup(visitsList);
			pageList = deDup(pageList);
			restList = deDup(restList);
			soapList = deDup(soapList);
			
			//evaluate web stats				
			Resource r1 = tempModel.createResource("http://dublincore.org/registry/webstats");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "totalVisits");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "totalPages");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "UniqueIPs");
			
			int uniqueVisitsCount = countUniqueItems(visitsList);			    
			r1.addProperty(p2, Integer.toString(uniqueVisitsCount));
			r1.addProperty(p3, Integer.toString(pageList.size()));
			
			int uniqueIPCount = countUniqueItems(IPList);			    
			r1.addProperty(p4, Integer.toString(uniqueIPCount));
			
			//evaluate application interface stats
			int totalMethodCount = soapList.size() + restList.size();
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/applstats");
			Resource r3 = tempModel.createResource("http://dublincore.org/registry/reststats");
			Resource r4 = tempModel.createResource("http://dublincore.org/registry/soapstats");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "methodCalls");
			
			r3.addProperty(p5, Integer.toString(restList.size()));
			uniqueIPCount = countUniqueIPs(restList);
			int totalUniqueIPs = uniqueIPCount;
			r3.addProperty(p4, Integer.toString(uniqueIPCount));
			
			r4.addProperty(p5, Integer.toString(soapList.size()));
			uniqueIPCount = countUniqueIPs(soapList);
			totalUniqueIPs = totalUniqueIPs + uniqueIPCount;
			r4.addProperty(p4, Integer.toString(uniqueIPCount));
			
			r2.addProperty(p4, Integer.toString(totalUniqueIPs));
			r2.addProperty(p5, Integer.toString(totalMethodCount));
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareAppInterfaceSummary(String pfx) {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List appList = new ArrayList();
			getFileList(fn, filelist, pfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String IP = null;
						if (end > 0)
							IP = logArray[8].substring(0, end);
						else
							IP = logArray[8];
						String method = null;
						if (pfx.equals(soapPfx))
							method = logArray[6];
						else
							method = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						
						appList.add(method + "," + IP + "," + logArray[0]);
					}
				}	
			}
			
			//dedup
			appList = deDup(appList);

			int methodCount = 0;
			int uniqueIPCount = 0;
			int totalUniqueIPs = 0;
			String lastMethod = null;
			String lastIP = null;
			Resource r1 = null;
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "UniqueIPs");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "methodCalls");
			
			for (int i=0; i < appList.size(); i++) {
				String Item = (String) appList.get(i);
				String method = Item.substring(0, Item.indexOf(","));
				String IP = Item.substring(Item.indexOf(",") + 1, Item.lastIndexOf(","));
				//System.out.println(method + "," + IP);
				if (lastMethod == null) {
					lastMethod = method;
					lastIP = IP;
					methodCount++;
					uniqueIPCount++;
					totalUniqueIPs++;
				} else if (method.equals(lastMethod)) {
					methodCount++;
					if (IP.equals(lastIP)) {
					} else {
						uniqueIPCount++;
						totalUniqueIPs++;
						lastIP = IP;
					}
				} else {
					r1 = tempModel.createResource("http://dublincore.org/registry/" + lastMethod);
					r1.addProperty(p4, Integer.toString(uniqueIPCount));
					r1.addProperty(p5, Integer.toString(methodCount));
					lastMethod = method;
					lastIP = IP;
					methodCount = 1;
					uniqueIPCount = 1;
					totalUniqueIPs++;
				}
			}
			r1 = tempModel.createResource("http://dublincore.org/registry/" + lastMethod);
			r1.addProperty(p4, Integer.toString(uniqueIPCount));
			r1.addProperty(p5, Integer.toString(methodCount));
			
			Resource r5 = tempModel.createResource("http://dublincore.org/registry/applstats");
			if (pfx.equals(soapPfx))
				r5.addProperty(DC.type, "SOAP");
			else
				r5.addProperty(DC.type, "REST");
			
			r5.addProperty(p4, Integer.toString(totalUniqueIPs));
			r5.addProperty(p5, Integer.toString(appList.size()));
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareMethodDetail() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List appList = new ArrayList();
			if (methodType.equals("SOAP"))
				getFileList(fn, filelist, soapPfx);
			else
				getFileList(fn, filelist, restPfx);
			
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						String thisMethod = null;
						if (methodType.equals("SOAP"))
							thisMethod = logArray[6];
						else
							thisMethod = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						
						if (thisMethod.equals(method)) {
							appList.add(logArray[8] + "," + logArray[0]);
						}
					}
				}	
			}
			
			//dedup
			appList = deDup(appList);

			int IPCount = 0;
			String lastIP = null;
			Resource r1 = null;
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "methodCalls");
			
			for (int i=0; i < appList.size(); i++) {
				String tIP = (String) appList.get(i);
				String IP = tIP.substring(0, tIP.indexOf(","));
				if (lastIP == null) {
					lastIP = IP;
					IPCount++;
				} else if (IP.equals(lastIP)) {
					IPCount++;
				} else {
					r1 = tempModel.createResource("http://dublincore.org/registry/" + lastIP);
					r1.addProperty(p5, Integer.toString(IPCount));
					lastIP = IP;
					IPCount = 1;
				}
			}
			r1 = tempModel.createResource("http://dublincore.org/registry/" + lastIP);
			r1.addProperty(p5, Integer.toString(IPCount));
			
			Resource r5 = tempModel.createResource("http://dublincore.org/registry/applstats");
			if (methodType.equals("SOAP"))
				r5.addProperty(DC.type, "SOAP");
			else
				r5.addProperty(DC.type, "REST");
			
			r5.addProperty(p5, Integer.toString(appList.size()));
			r5.addProperty(DC.subject, method);			
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareIPDetail() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List appList = new ArrayList();
			if (methodType.equals("SOAP"))
				getFileList(fn, filelist, soapPfx);
			else
				getFileList(fn, filelist, restPfx);
			
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						String thisMethod = null;
						if (methodType.equals("SOAP"))
							thisMethod = logArray[6];
						else
							thisMethod = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						
						if (thisMethod.equals(method)) {						
							int end = logArray[8].indexOf(", ");
							String thisIP = null;
							String tParms = " ";
							if (end > 0) {
								thisIP = logArray[8].substring(0, end);
								tParms = logArray[8].substring(end + 2);
							} else {
								thisIP = logArray[8];
							}
							
							if (thisIP.equals(IP)) {
								String tDate = logArray[0];
								appList.add(tDate + "," + tParms);
							}
						}
					}
				}	
			}
			
			//dedup
			appList = deDup(appList);
			
			Resource r1 = null;
			for (int i=0; i < appList.size(); i++) {
				String tran = (String) appList.get(i);
				String tDate = tran.substring(0, tran.indexOf(","));
				String tParms = tran.substring(tran.indexOf(",") + 1);
				r1 = tempModel.createResource("http://dublincore.org/registry/" + tDate);
				r1.addProperty(DCTerms.references, tParms);
			}
			
			Resource r5 = tempModel.createResource("http://dublincore.org/registry/applstats");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "methodCalls");
			if (methodType.equals("SOAP"))
				r5.addProperty(DC.subject, IP + " " + method + " (SOAP)");
			else
				r5.addProperty(DC.subject, IP + " " + method + " (REST)");
			
			r5.addProperty(p5, Integer.toString(appList.size()));			
				
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareVisitsSummary() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List visitsList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String sessionID = logArray[8].substring(0, end);
						
						String thisIP = null;
						int start = end + 2;						
						end = logArray[8].indexOf(", ", start);
						if (end > 0)
							thisIP = logArray[8].substring(start, end);
						else
							thisIP = logArray[8].substring(start);
						
						if ((thisIP.equals(IP)) || (IP.equals("all"))) {						
							String tDate = logArray[0];
							String page = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
							visitsList.add(sessionID + "," + tDate + "," + thisIP + "," + page);
						}
					}
				}	
			}
			
			//dedup
			visitsList = deDup(visitsList);

			//Collections.sort(visitsList);
			int visitCount = 0;
			int pageCount = 0;
			String lastSession = null;
			String lastIP = null;
			String startDate = null;
			String endDate = null;
			Resource r1 = null;
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "begDate");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "endDate");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "pages");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "visits");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "duration");
			
			for (int i=0; i < visitsList.size(); i++) {
				String Item = (String) visitsList.get(i);
				int start = 0;
				int end = Item.indexOf(",");
				String session = Item.substring(start, end);
				start = end + 1;
				end = Item.indexOf(",", start);
				String tDate = Item.substring(start, end);
				start = end + 1;
				end = Item.indexOf(",", start);
				String IP = Item.substring(start, end);
				start = end + 1;
				String page = Item.substring(start);
				
				if (lastSession == null) {
					lastSession = session;
					lastIP = IP;
					startDate = tDate;
					endDate = tDate;
					pageCount++;
				} else if (session.equals(lastSession)) {
					pageCount++;
					endDate = tDate;
				} else {
					r1 = tempModel.createResource("http://dublincore.org/registry/" + lastSession);
					r1.addProperty(p1, startDate);
					String duration = calculateDuration(startDate, endDate);
					r1.addProperty(p5, duration);
					r1.addProperty(p3, Integer.toString(pageCount));
					r1.addProperty(DCTerms.hasPart, lastIP);					
					visitCount++;
					lastSession = session;
					lastIP = IP;
					pageCount = 1;
					startDate = tDate;
					endDate = tDate;
				}
			}
			r1 = tempModel.createResource("http://dublincore.org/registry/" + lastSession);
			r1.addProperty(p1, startDate);
			String duration = calculateDuration(startDate, endDate);
			r1.addProperty(p5, duration);
			r1.addProperty(p3, Integer.toString(pageCount));
			r1.addProperty(DCTerms.hasPart, lastIP);
			visitCount++;
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/webstats");
			r2.addProperty(p3, Integer.toString(visitsList.size()));
			r2.addProperty(p4, Integer.toString(visitCount));
			if (!IP.equals("all"))
				r2.addProperty(DCTerms.hasPart, IP);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareSessionDetail() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List visitsList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String thisSession = logArray[8].substring(0, end);
						if (thisSession.equals(sessionID)) {						
							IP = null;
							String parms = null;
							int start = end + 2;						
							end = logArray[8].indexOf(", ", start);
							if (end > 0) {
								IP = logArray[8].substring(start, end);
								parms = logArray[8].substring(end + 2);
							} else {
								IP = logArray[8].substring(start);
							}
							
							String tDate = logArray[0];
							String page = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
							
							if (parms != null)
								visitsList.add(tDate + "," + page + "," + parms);
							else
								visitsList.add(tDate + "," + page);
						}
					}
				}	
			}
			
			//dedup
			visitsList = deDup(visitsList);

			//Collections.sort(visitsList);
			Resource r1 = null;
			
			for (int i=0; i < visitsList.size(); i++) {
				String Item = (String) visitsList.get(i);
				int start = 0;
				int end = Item.indexOf(",");
				String tDate = Item.substring(start, end);
				if (tDate.equals("2005-04-25T09:00:32"))
					System.out.println("Item: " + Item);
				start = end + 1;
				end = Item.indexOf(",", start);
				String page = null;
				String parms = null;
				if (end > 0) {
					page = Item.substring(start, end);
					parms = Item.substring(end + 1);
				} else {
					page = Item.substring(start);
				}
				
				r1 = tempModel.createResource("http://dublincore.org/registry/" + Integer.toString(i));
				r1.addProperty(DC.date, tDate);
				r1.addProperty(DC.subject, page);
				if (parms != null)
					r1.addProperty(DCTerms.references, parms);
			}
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/999999999");
			r2.addProperty(DC.subject, sessionID);
			r2.addProperty(DCTerms.references, IP);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model preparePageSummary() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List pageList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						String page = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						//pageList.add(page);
						pageList.add(page + "," + logArray[0] + logArray[1]);
					}
				}	
			}
			
			//dedup
			pageList = deDup(pageList);

			//Collections.sort(pageList);
			int pageCount = 0;
			int totalPageCount = 0;
			String lastPage = null;
			Resource r1 = null;
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "count");
			
			for (int i=0; i < pageList.size(); i++) {
				String tp = (String) pageList.get(i);
				String page = tp.substring(0, tp.indexOf(","));
				if (lastPage == null) {
					lastPage = page;
					pageCount++;
					totalPageCount++;
				} else if (page.equals(lastPage)) {
					pageCount++;
					totalPageCount++;
				} else {
					r1 = tempModel.createResource("http://dublincore.org/registry/" + lastPage);
					r1.addProperty(p1, Integer.toString(pageCount));
					lastPage = page;
					pageCount = 1;
					totalPageCount++;
				}
			}
			r1 = tempModel.createResource("http://dublincore.org/registry/" + lastPage);
			r1.addProperty(p1, Integer.toString(pageCount));
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/webstats");
			r2.addProperty(p1, Integer.toString(totalPageCount));
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model preparePageDetail() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List pageList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						String thisPage = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						if (thisPage.equals(page)) {
							int end = logArray[8].indexOf(", ");
							sessionID = logArray[8].substring(0, end);
							IP = null;
							String parms = null;
							int start = end + 2;						
							end = logArray[8].indexOf(", ", start);
							if (end > 0) {
								IP = logArray[8].substring(start, end);
								parms = logArray[8].substring(end + 2);
							} else {
								IP = logArray[8].substring(start);
							}
							
							String tDate = logArray[0];
							
							if (parms != null)
								pageList.add(tDate + "," + sessionID + "," + IP + "," + parms);
							else
								pageList.add(tDate + "," + sessionID + "," + IP);
						}
					}
				}	
			}
			
			//dedup
			pageList = deDup(pageList);

			//Collections.sort(pageList);
			int totalPageCount = 0;
			Resource r1 = null;
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "tDate");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "session");
			Property p3 = ResourceFactory.createProperty("http://dublincore.org/registry/", "IP");
			Property p4 = ResourceFactory.createProperty("http://dublincore.org/registry/", "parms");
			Property p5 = ResourceFactory.createProperty("http://dublincore.org/registry/", "count");
			Property p6 = ResourceFactory.createProperty("http://dublincore.org/registry/", "page");
			
			for (int i=0; i < pageList.size(); i++) {
				String Item = (String) pageList.get(i);
				int start = 0;
				int end = Item.indexOf(",");
				String tDate = Item.substring(start, end);
				start = end + 1;
				end = Item.indexOf(",", start);
				String session = Item.substring(start, end);
				start = end + 1;
				end = Item.indexOf(",", start);
				String IP = null;
				String parms = null;
				if (end > 0) {
					IP = Item.substring(start, end);
					parms = Item.substring(end + 1);
				} else {
					IP = Item.substring(start);
				}
				
				r1 = tempModel.createResource("http://dublincore.org/registry/" + Integer.toString(i));
				r1.addProperty(p1, tDate);
				r1.addProperty(p2, session);
				r1.addProperty(p3, IP);
				r1.addProperty(p4, parms);
				totalPageCount++;
			}
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/999999999");
			r2.addProperty(p5, Integer.toString(totalPageCount));
			r2.addProperty(p6, page);
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected Model prepareIPSummary() {
		Model tempModel = ModelFactory.createDefaultModel();
		try {
			File fn = new File(dir);
			List filelist = new ArrayList();
			List visitsList = new ArrayList();
			getFileList(fn, filelist, appPfx);
			for (int i=0; i < filelist.size(); i++) {
				String fileName = (String) filelist.get(i);
				Vector v = parseLogFile(fileName);
				
				ListIterator iter = v.listIterator();
				String[] logArray = new String[9];
				while (iter.hasNext()) {
					logArray = (String[]) iter.next();
					if (checkValidDate(logArray[0])) {
						int end = logArray[8].indexOf(", ");
						String sessionID = logArray[8].substring(0, end);
						
						String IP = null;
						int start = end + 2;						
						end = logArray[8].indexOf(", ", start);
						if (end > 0)
							IP = logArray[8].substring(start, end);
						else
							IP = logArray[8].substring(start);
						
						String page = logArray[5].substring(logArray[5].lastIndexOf(".") + 1);
						
						visitsList.add(IP + "," + sessionID + "," + "," + page);
					}
				}	
			}
			
			//dedup
			visitsList = deDup(visitsList);

			//Collections.sort(visitsList);
			int sessionCount = 0;
			int totalSessionCount = 0;
			int pageCount = 0;
			int totalPageCount = 0;
			String lastIP = null;
			String lastSession = null;

			Resource r1 = null;
			Property p1 = ResourceFactory.createProperty("http://dublincore.org/registry/", "sessions");
			Property p2 = ResourceFactory.createProperty("http://dublincore.org/registry/", "pages");
			
			for (int i=0; i < visitsList.size(); i++) {
				String Item = (String) visitsList.get(i);
				int start = 0;
				int end = Item.indexOf(",");
				String IP = Item.substring(start, end);
				start = end + 1;
				end = Item.indexOf(",", start);
				String session = Item.substring(start, end);
				start = end + 1;
				String page = Item.substring(start);
				
				if (lastIP == null) {
					lastIP = IP;
					lastSession = session;
					sessionCount++;
					pageCount++;
					totalPageCount++;
					totalSessionCount++;
				} else if (IP.equals(lastIP)) {
					pageCount++;
					totalPageCount++;
					if (session.equals(lastSession)) {
					} else {
						sessionCount++;
						totalSessionCount++;
						lastSession = session;
					}
				} else {
					r1 = tempModel.createResource("http://dublincore.org/registry/" + lastIP);
					r1.addProperty(p1, Integer.toString(sessionCount));
					r1.addProperty(p2, Integer.toString(pageCount));
					totalPageCount++;
					totalSessionCount++;
					lastIP = IP;
					lastSession = session;
					sessionCount = 1;
					pageCount = 1;
				}
			}
			r1 = tempModel.createResource("http://dublincore.org/registry/" + lastIP);
			r1.addProperty(p1, Integer.toString(sessionCount));
			r1.addProperty(p2, Integer.toString(pageCount));
			
			Resource r2 = tempModel.createResource("http://dublincore.org/registry/webstats");
			r2.addProperty(p1, Integer.toString(totalSessionCount));
			r2.addProperty(p2, Integer.toString(totalPageCount));
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return tempModel;
	}
	
	protected int countUniqueItems(List ItemList) {
		
		int uniqueItemCount = 0;
		try {
			//Collections.sort(ItemList);			    
			String lastItem = null;
			for (int i=0; i < ItemList.size(); i++) {
				String Item = (String) ItemList.get(i);
				if (lastItem == null) {
					lastItem = Item;
					uniqueItemCount++;
				} else if (Item.equals(lastItem)) {
				} else {
					lastItem = Item;
					uniqueItemCount++;
				}
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return uniqueItemCount;
	}
	
	protected int countUniqueIPs(List ItemList) {
		
		int uniqueIPCount = 0;
		try {		    
			String lastIP = null;
			for (int i=0; i < ItemList.size(); i++) {
				String tIP = (String) ItemList.get(i);
				String IP = tIP.substring(0, tIP.indexOf(","));
				if (lastIP == null) {
					lastIP = IP;
					uniqueIPCount++;
				} else if (IP.equals(lastIP)) {
				} else {
					lastIP = IP;
					uniqueIPCount++;
				}
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return uniqueIPCount;
	}
	
	protected List deDup(List ItemList) {
		
		List ddList = new ArrayList();
		try {
			Collections.sort(ItemList);			    
			String lastItem = null;
			String Item = null;
			for (int i=0; i < ItemList.size(); i++) {
				Item = (String) ItemList.get(i);
				//System.out.println("Item: " + Item);
				if (lastItem == null) {
					lastItem = Item;
					ddList.add(Item);
				} else if (Item.equals(lastItem)) {
				} else {
					lastItem = Item;
					ddList.add(Item);
				}
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return ddList;
	}
	
	protected Vector parseLogFile(String fileName) {
		
		Vector v = new Vector(300,300);
		String[] statArray = new String[9];
				
		try {
			Document doc = parseXmlFile(fileName, false);
			if (doc != null) {
				String xpath = "/log/record";
				NodeList nodelist = org.apache.xpath.XPathAPI.selectNodeList(doc, xpath);
				for (int i=0; i <  nodelist.getLength(); i++) {
					Node parent = nodelist.item(i);
					NodeList children = parent.getChildNodes();
					statArray = new String[9];
					int m = 0;
					for (int j=0; j <  children.getLength(); j++) {
						Node child = children.item(j);
						NodeList textNodes = child.getChildNodes();
						for (int k=0; k <  textNodes.getLength(); k++) {
							Node textNode = textNodes.item(k);
							statArray[m] = textNode.getNodeValue();
							m++;
						}
					}
					v.add(statArray);
				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return v;
	}
	
	protected Document parseXmlFile(String fileName, boolean validating) {
		try {
			// Create a builder factory
			//System.out.println("file: " + fileName);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(validating);
			
			// Create the builder and parse the file
			Document doc = factory.newDocumentBuilder().parse(new File(fileName));
			return doc;
		//} catch (org.xml.sax.SAXParseException e) {
		} catch (org.xml.sax.SAXException e) {
		} catch (ParserConfigurationException e) {
		} catch (IOException e) {
		} catch (IllegalStateException e) {
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		return null;
        }
	
	protected boolean checkValidDate(String logDate) {
		
		int tDate = Integer.parseInt(new String(logDate.substring(0,4) + logDate.substring(5,7) + logDate.substring(8,10)));
		int begDate = Integer.parseInt(bDate);
		int endDate = Integer.parseInt(eDate);
		
		if ((tDate >= begDate) && (tDate <= endDate))
			return true;
		else
			return false;
	}
	
	protected String calculateDuration(String tbDate, String teDate) {

		String elapsed_time = "00:00:00";
		try {
			int year = Integer.parseInt(tbDate.substring(0,4));
			int month = Integer.parseInt(tbDate.substring(5,7));
			int date = Integer.parseInt(tbDate.substring(8,10));
			int hour = Integer.parseInt(tbDate.substring(11,13));
			int minute = Integer.parseInt(tbDate.substring(14,16));
			int second = Integer.parseInt(tbDate.substring(17));
			Calendar tStart = new GregorianCalendar(year, (month - 1), date, hour, minute, second);
			Date d1 = tStart.getTime();
			long tStart_ms = d1.getTime();
			//System.out.println("tbDate: " + year + " " + month + " " + date + " " + hour + " " + minute + " " + second);
			
			year = Integer.parseInt(teDate.substring(0,4));
			month = Integer.parseInt(teDate.substring(5,7));
			date = Integer.parseInt(teDate.substring(8,10));
			hour = Integer.parseInt(teDate.substring(11,13));
			minute = Integer.parseInt(teDate.substring(14,16));
			second = Integer.parseInt(teDate.substring(17));
			Calendar tStop = new GregorianCalendar(year, (month - 1), date, hour, minute, second);
			Date d2 = tStop.getTime();
			long tStop_ms = d2.getTime();
			//System.out.println("teDate: " + year + " " + month + " " + date + " " + hour + " " + minute + " " + second);
			
			long tms = Math.abs(tStop_ms - tStart_ms);
			tms = tms / 1000;

			long hrs, min, sec;
			hrs = tms / 3600;
			tms = tms - (hrs * 3600);
			min = tms / 60;
			tms = tms - (min * 60);
			sec = tms;
			
			String s_hrs = Long.toString(hrs);
			if (hrs < 10)
				s_hrs = "0" + Long.toString(hrs);
			String s_min = Long.toString(min);
			if (min < 10)
				s_min = "0" + Long.toString(min);
			String s_sec = Long.toString(sec);
			if (sec < 10)
				s_sec = "0" + Long.toString(sec);
			
			elapsed_time = s_hrs + ":" + s_min + ":" + s_sec;
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return elapsed_time;
	}
	
	protected void setXSLTParms (Transformer transformer) {
		try {
			transformer.setParameter("reqType", reqType);
			transformer.setParameter("uiStyle", uiStyle);
			transformer.setParameter("uiLang", uiLang);
			transformer.setParameter("resultsLang", resultsLang);
			
			if (dir != null)
				transformer.setParameter("dir", dir);
			if (appPfx != null)
				transformer.setParameter("appPfx", appPfx);
			if (restPfx != null)
				transformer.setParameter("restPfx", restPfx);
			if (soapPfx != null)
				transformer.setParameter("soapPfx", soapPfx);
			if (dateType != null)
				transformer.setParameter("dateType", dateType);
			
			if (reqType.equals("start")) {
				Calendar tDate = new GregorianCalendar();
				transformer.setParameter("bYear", Integer.toString(tDate.get(Calendar.YEAR)));
				transformer.setParameter("eYear", Integer.toString(tDate.get(Calendar.YEAR)));
				if (tDate.get(Calendar.MONTH) < 9) {
					transformer.setParameter("bMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
					transformer.setParameter("eMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
				} else if (tDate.get(Calendar.MONTH) == 9) {
					transformer.setParameter("bMonth", "10");
					transformer.setParameter("eMonth", "10");
				} else {
					transformer.setParameter("bMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
					transformer.setParameter("eMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
				}
				
				if (tDate.get(Calendar.DATE) < 10) {
					transformer.setParameter("bDay", "0" + Integer.toString(tDate.get(Calendar.DATE)));
					transformer.setParameter("eDay", "0" + Integer.toString(tDate.get(Calendar.DATE)));
				} else {
					transformer.setParameter("bDay", Integer.toString(tDate.get(Calendar.DATE)));
					transformer.setParameter("eDay", Integer.toString(tDate.get(Calendar.DATE)));
				}	
				
			} else {
				if (bDate != null) {
					transformer.setParameter("bYear", bDate.substring(0,4));
					transformer.setParameter("bMonth", bDate.substring(4,6));
					transformer.setParameter("bDay", bDate.substring(6));
				} else {
					// set to todays date
					Calendar tDate = new GregorianCalendar();
					transformer.setParameter("bYear", Integer.toString(tDate.get(Calendar.YEAR)));
					if (tDate.get(Calendar.MONTH) < 9) {
						transformer.setParameter("bMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
					} else if (tDate.get(Calendar.MONTH) == 9) {
						transformer.setParameter("bMonth", "10");
					} else {
						transformer.setParameter("bMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
					}
					if (tDate.get(Calendar.DATE) < 10) {
						transformer.setParameter("bDay", "0" + Integer.toString(tDate.get(Calendar.DATE)));
					} else {
						transformer.setParameter("bDay", Integer.toString(tDate.get(Calendar.DATE)));
					}
				}
				
				if (eDate != null) {
					transformer.setParameter("eYear", eDate.substring(0,4));
					transformer.setParameter("eMonth", eDate.substring(4,6));
					transformer.setParameter("eDay", eDate.substring(6));
				} else {
					// set to todays date
					Calendar tDate = new GregorianCalendar();
					transformer.setParameter("eYear", Integer.toString(tDate.get(Calendar.YEAR)));
					if (tDate.get(Calendar.MONTH) < 9) {
						transformer.setParameter("eMonth", "0" + Integer.toString(tDate.get(Calendar.MONTH)+1));
					} else if (tDate.get(Calendar.MONTH) == 9) {
						transformer.setParameter("eMonth", "10");
					} else {
						transformer.setParameter("eMonth", Integer.toString(tDate.get(Calendar.MONTH)+1));
					}
					if (tDate.get(Calendar.DATE) < 10) {
						transformer.setParameter("eDay", "0" + Integer.toString(tDate.get(Calendar.DATE)));
					} else {
						transformer.setParameter("eDay", Integer.toString(tDate.get(Calendar.DATE)));
					}
				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	private void getInputData (HttpServletRequest request, HttpServletResponse response, HttpSession session) 
		throws ServletException, IOException  {
			
		uiStyle = "std";
		uiLang = get_uiLang_Preference(request,session);
		resultsLang = get_resultsLang_Preference(request,session);
		
		reqType = request.getParameter("reqType");
		if (reqType == null) {
			reqType = "start";
		} else if (reqType.equals("")) {
			reqType = "start";
		}
		
		dir = request.getParameter("dir");
		if (dir == null) {
			dir = (String) session.getAttribute("dir");
		}
		
		appPfx = request.getParameter("appPfx");
		if (appPfx == null) {
			appPfx = (String) session.getAttribute("appPfx");
		}
		
		restPfx = request.getParameter("restPfx");
		if (restPfx == null) {
			restPfx = (String) session.getAttribute("restPfx");
		}
		
		soapPfx = request.getParameter("soapPfx");
		if (soapPfx == null) {
			soapPfx = (String) session.getAttribute("soapPfx");
		}
		
		dateType = request.getParameter("dateType");
		if (dateType == null) {
			dateType = (String) session.getAttribute("dateType");
		}
		
		String bYear = request.getParameter("bYear");
		if (bYear == null) {
			bYear = (String) session.getAttribute("bYear");
		}
		
		String bMonth = request.getParameter("bMonth");
		if (bMonth == null) {
			bMonth = (String) session.getAttribute("bMonth");
		}
		
		String bDay = request.getParameter("bDay");
		if (bDay == null) {
			bDay = (String) session.getAttribute("bDay");
		}		
		
		if ((bYear != null) && (bMonth != null) && (bDay != null)) {
			bDate = bYear + bMonth + bDay;
		} else {
			bDate = null;
		}

		String eYear = request.getParameter("eYear");
		if (eYear == null) {
			eYear = (String) session.getAttribute("eYear");
		}
		
		String eMonth = request.getParameter("eMonth");
		if (eMonth == null) {
			eMonth = (String) session.getAttribute("eMonth");
		}
		
		String eDay = request.getParameter("eDay");
		if (eDay == null) {
			eDay = (String) session.getAttribute("eDay");
		}
		
		if ((eYear != null) && (eMonth != null) && (eDay != null)) {
			eDate = eYear + eMonth + eDay;
		} else {
			eDate = null;
		}
		
		method = request.getParameter("method");
		if (method != null) {
			if (method.equals("")) {
				method = "all";
			}
		} else {
			method = "all";
		}
		
		methodType = request.getParameter("methodType");
		if (methodType != null) {
			if (methodType.equals(""))
				methodType = null;
		}
		
		IP = request.getParameter("IP");
		if (IP != null) {
			if (IP.equals("")) {
				IP = "all";
			}
		} else {
			IP = "all";
		}
		
		sessionID = request.getParameter("sessionID");
		if (sessionID != null) {
			if (sessionID.equals("")) {
				sessionID = "all";
			}
		} else {
			sessionID = "all";
		}
		
		page = request.getParameter("page");
		if (page != null) {
			if (page.equals("")) {
				page = "all";
			}
		} else {
			page = "all";
		}
		
		if (reqType.equals("overview")) {
			session.setAttribute("dir", dir);
			session.setAttribute("appPfx", appPfx);
			session.setAttribute("restPfx", restPfx);
			session.setAttribute("soapPfx", soapPfx);
			session.setAttribute("dateType", dateType);
			session.setAttribute("bDay", bDay);
			session.setAttribute("bMonth", bMonth);
			session.setAttribute("bYear", bYear);
			session.setAttribute("eDay", eDay);
			session.setAttribute("eMonth", eMonth);
			session.setAttribute("eYear", eYear);
		}
	}
	
	private String validateInput () {
		
		String msg = null;
		try {
			File fn = new File(dir);	
			if(!fn.exists()) {
				msg = "Directory not found.  Please enter a valid directory name relative to your ServletContext.";
			} else if(!fn.isDirectory()) {
				msg = "The directory name entered is not a directory.  Please enter a directory.";
			}
			
			if (dateType.equals("4")) {
				int begDate = Integer.parseInt(bDate);
				int endDate = Integer.parseInt(eDate);
				if (endDate < begDate)
					msg = "End date cannot be earlier than begin date.";
			} else {
				calculateDateRange(dateType);
			}
			
			if (appPfx == null)
				msg = "Web log prefix required.";

			if (restPfx == null)
				msg = "REST log prefix required.";

			if (soapPfx == null)
				msg = "SOAP log prefix required.";
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return msg;
	}	
	
	private void getFileList(File f, List filelist, String filter) {
		if (f.isDirectory()) {			// recurse if a directory
			String entries[] = f.list();
			for (int i = 0; i < entries.length; i++) {
				getFileList(new File(f, entries[i]), filelist, filter);
			}
		} else if (f.isFile()) {
			if ((f.getName().startsWith(filter)) && (!f.getName().endsWith(".lck")))
				filelist.add(f.getAbsolutePath());
		}
	}
	
	protected void calculateDateRange(String dateType) {

		Calendar tDate = null;
		String tyr  = null;
		String tmo  = null;
		String tda  = null;
		
		try {
			tDate = new GregorianCalendar();
			tyr = Integer.toString(tDate.get(Calendar.YEAR));			
			if (tDate.get(Calendar.MONTH) < 9) {
				tmo = "0" + Integer.toString(tDate.get(Calendar.MONTH) + 1);
			} else if (tDate.get(Calendar.MONTH) == 9) {
				tmo = "10";
			} else {
				tmo = Integer.toString(tDate.get(Calendar.MONTH) + 1);
			}
			
			if (tDate.get(Calendar.DATE) < 10) {
				tda = "0" + Integer.toString(tDate.get(Calendar.DATE));
			} else {
				tda = Integer.toString(tDate.get(Calendar.DATE));
			}
		
			if (dateType.equals("1")) {		// last 30 days
				eDate = tyr + tmo + tda;
				if (tmo.equals("01")) {
					bDate = Integer.toString(tDate.get(Calendar.YEAR) - 1) + "12" + tda;
				} else if (tmo.equals("12")) {
					bDate = tyr + "11" + tda;
				} else if (tmo.equals("11")) {
					bDate = tyr + "10" + tda;
				} else {
					bDate = tyr + "0" + Integer.toString(tDate.get(Calendar.MONTH)) + tda;
				}
			} else if (dateType.equals("2")) {	//month-to-date
				eDate = tyr + tmo + tda;
				bDate = tyr + tmo + "01";
			} else if (dateType.equals("3")) {	//year-to-date
				eDate = tyr + tmo + tda;
				bDate = tyr + "01" + "01";
			}
			//System.out.println("dateType: " + dateType);
			//System.out.println("bDate: " + bDate);
			//System.out.println("eDate: " + eDate);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}	
}

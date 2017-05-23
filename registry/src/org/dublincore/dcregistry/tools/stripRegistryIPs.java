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

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class stripRegistryIPs {
	public static void main(String[] args) {
				    
		try {
			File fn = new File(args[0]);
			List filelist = new ArrayList();
			getFileList(fn, filelist, "registry_");
			
			for (int indx=0; indx < filelist.size(); indx++) {
				String fileName = (String) filelist.get(indx);
				//System.out.println("processing file: " + fileName);
				String newFileName = fileName + "_mod";
				Document doc = parseXmlFile(fileName, false);
				String xpath = "/log/record";
				NodeList nodelist = org.apache.xpath.XPathAPI.selectNodeList(doc, xpath);
				for (int i=0; i <  nodelist.getLength(); i++) {
					Node parent = nodelist.item(i);
					NodeList children = parent.getChildNodes();
					System.out.println(" ");
					for (int j=0; j <  children.getLength(); j++) {
						Node child = children.item(j);
						
						NodeList textNodes = child.getChildNodes();
						for (int k=0; k <  textNodes.getLength(); k++) {
							if (child.getNodeName().equals("message")) {
								Node textNode = textNodes.item(k);
								String tnv = textNode.getNodeValue();
								String newValue = parseNode(tnv, fileName); 
								textNode.setNodeValue(newValue);
								//System.out.println(tnv + " " + newValue + " " + newFileName);
								writeXmlFile(doc, newFileName);
							}
						}
					}
				}
			}
				
		} catch (Exception e) {
			System.out.println("**A parsing error occurred**");
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public static Document parseXmlFile(String filename, boolean validating) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(validating);
			Document doc = factory.newDocumentBuilder().parse(new File(filename));
			return doc;
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		return null;
        }
	
	public static String parseNode(String tnv, String filename) {
		
		String newValue = null;
		String appPfx = "web.log";
		String restPfx = "rest.log";
		String soapPfx = "axis.log";
		String IP = null;
		String maskedIP = null;
		int start = 0;
		int end = 0;
		
		try {
			if (filename.indexOf(appPfx) > 0) {	
				start = tnv.indexOf(", ") + 2;
				end = tnv.indexOf(", ", start);
				if (end > start) {
					IP = tnv.substring(start, end);
					maskedIP = maskIP(IP);
					newValue = tnv.substring(0, start) + maskedIP + tnv.substring(end);
				} else {
					IP = tnv.substring(start);
					maskedIP = maskIP(IP);
					newValue = tnv.substring(0, start) + maskedIP;
				}				
			} else if (filename.indexOf(soapPfx) > 0) {
				start = 0;
				end = tnv.indexOf(", ");
				if (end > start) {
					IP = tnv.substring(start, end);
					maskedIP = maskIP(IP);
					newValue = maskedIP + tnv.substring(end);
				} else {
					IP = tnv.substring(start);
					maskedIP = maskIP(IP);
					newValue = maskedIP;
				}				
			} else if (filename.indexOf(restPfx) > 0) {
				start = 0;
				end = tnv.indexOf(", ");
				if (end > start) {
					IP = tnv.substring(start, end);
					maskedIP = maskIP(IP);
					newValue = maskedIP + tnv.substring(end);
				} else {
					IP = tnv.substring(start);
					maskedIP = maskIP(IP);
					newValue = maskedIP;
				}			
			} else {
				System.out.println("none of the above... " + filename);	
			}
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		return newValue;
        }
	
	public static String maskIP(String IP) {
		
		/*
		The maskValues array that follows is used to mask the the digits 0-9 that are found in IP addresses.
		Change these values to reflect the way you want to mask IP addresses.  for example: 
		String maskValues[] = {"9","7","0","4","6","1","2","5","3","8"};
		will change all 0s to 9s, all 1s to 7s, all 3s to 0s, etc.
		*/
		String maskValues[] = {"0","1","2","3","4","5","6","7","8","9"};
		String maskedIP = null;
		StringBuffer buffer = new StringBuffer();
		int start = 0;
		int end = 0;
		
		//System.out.println("before: " + IP);	
		try {
			for (int i = 0; i < IP.length(); i++) {
				if (Character.isDigit(IP.charAt(i))) {
					String s = IP.substring(i,i+1);
					buffer.append(maskValues[Integer.parseInt(s)]);
				} else {
					buffer.append(IP.substring(i,i+1));
				}				
			}
		maskedIP = buffer.toString();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
		//System.out.println("after: " + maskedIP);
		return maskedIP;
        }
	
	public static void writeXmlFile(Document doc, String filename) {
		try {
		    Source source = new DOMSource(doc);
		    File file = new File(filename);
		    Result result = new StreamResult(file);
		    Transformer xformer = TransformerFactory.newInstance().newTransformer();
		    xformer.transform(source, result);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
    
	public static void getFileList(File f, List filelist, String filter) {
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
}


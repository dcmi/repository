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
import javax.xml.rpc.server.*;
import javax.xml.rpc.ServiceException;

import java.io.*;
import java.util.*;
import java.text.BreakIterator; 


public class exampleServlet extends registryServlet {
	
	String item = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		getInputParameters(request, session);
		logger.info(session.getId() + ", " + request.getRemoteAddr() + ", " + item);
		
		try {
			String rootdir = getServletContext().getRealPath("/");
			String examplesDir = rootdir + "examples/";
			File exampleFile = new File(examplesDir + item.trim());
			byte[] bytes = getBytesFromFile(exampleFile);
			
			String tmpstr = new String(bytes, "UTF8");
			tmpstr = tmpstr.replaceAll("&#9;", "");
			tmpstr = tmpstr.replaceAll("&#xA;", "");
			tmpstr = escape(tmpstr);
			
			response.setContentType("text/xml; charset=UTF-8");
			Writer out = response.getWriter();
			out.write(tmpstr);
			out.close();
			
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	protected String escape(String str) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (((int) str.charAt(i)) > 127 ) 
				buf.append("&#x").append(Integer.toString((int)(str.charAt(i)), 16)).append(";");
			else
				buf.append(str.charAt(i));
		}
		return buf.toString();
	}	
	
	private void getInputParameters (HttpServletRequest request, HttpSession session) {
		
		item = request.getParameter("item");
		if (item != null)
			if (item.equals(""))
				item = null;
	}
	
	// Returns the contents of the file in a byte array.
	public static byte[] getBytesFromFile(File file) throws IOException {
		
		InputStream is = new FileInputStream(file);
		long length = file.length();			// Get the size of the file
		byte[] bytes = null;
		
		if (length > Integer.MAX_VALUE) {
		   System.out.println("File is too large!");
		} else {		
			bytes = new byte[(int)length];
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
			    offset += numRead;
			}
			
			if (offset < bytes.length) {		// Ensure all the bytes have been read in
			    throw new IOException("Could not completely read file "+file.getName());
			}
	
			is.close();
		}
		
		return bytes;
    }
	
}

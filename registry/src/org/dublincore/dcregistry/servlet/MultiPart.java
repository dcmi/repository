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
 *  M.Nagamori    <nagamorm@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package org.dublincore.dcregistry.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.BreakIterator;

/**
 *
 * @author  M.Nagamori
 */


public class MultiPart {

    public MultiPart() {
    }

    public Hashtable parse(String bdry, ServletInputStream in) throws IOException{
	Hashtable tbl = new Hashtable();
	int buffer_size = 1024*1024*1;        
	byte[] b = new byte[buffer_size];
	String line =null;               
	String lowerline =null;          
	int len;                         
	String name = null;

	while((len =in.readLine(b,0,buffer_size)) != -1){
	    line = new String(b,0,len-2);
	    lowerline = line.toLowerCase();
	    if(lowerline.startsWith("content-disposition")){
		int s1 = lowerline.indexOf("name=\"");
		int e1 = lowerline.indexOf("\"",s1+7);
		if(s1 != -1 && e1 != -1){
		    len = in.readLine(b,0,len-2);
		    String content_type =getContentType(new String(b,0,len-2));
		    name = line.substring(s1+6,e1);

		    int s2 = lowerline.indexOf("filename=\"",e1+2);
		    int e2 = lowerline.indexOf("\"",s2+10);
		    String filename = null;
		    if(s2 != -1 && e2 != -1){
			filename = line.substring(s2+10,e2);
		    }

		    if (content_type != null && content_type.length() > 0 && filename != null && filename.length() > 0) {
			ByteArrayOutputStream content = new ByteArrayOutputStream(buffer_size);
			ByteArrayOutputStream content_cache = new ByteArrayOutputStream();
			in.readLine(b,0,len-2);
			while((len = in.readLine(b,0,buffer_size)) != -1){
			    if (len < 3) continue;
			    String buf = new String(b, 0, len-2);
			    if (buf.toLowerCase().indexOf(bdry) == -1){
				content_cache.write(b,0,len);
			    } else {
				break;
			    }
			}
			//content.write(content_cache.toByteArray(), 0, (content_cache.toByteArray()).length - ("--"+bdry+"--").length()-4);
			content.write(content_cache.toByteArray(), 0, (content_cache.toByteArray()).length - 0);
			tbl.put(name, content.toString());
			//System.err.println(content);
			content_cache.close();
			content.close();
		    } else {
			String s_cache=null;
			while(lowerline.indexOf(bdry) == -1){
			    s_cache = line;
			    len = in.readLine(b,0,buffer_size);
			    line = new String(b,0,len-2);
			    lowerline = line.toLowerCase();
			}
			tbl.put(name,s_cache);
		    }
		}
	    }
	}

	in.close();
	return tbl;
    }

    public String getContentType(String str) {
	String ret = null;
	String lower_line = str.toLowerCase();
	String pat = ": ";

	if (lower_line.startsWith("content-type:")) {
	    int pos = str.indexOf(pat);
	    if (pos != -1) {
		ret = str.substring(pos + pat.length()).trim();
	    }
	}
	return ret;
    }
}

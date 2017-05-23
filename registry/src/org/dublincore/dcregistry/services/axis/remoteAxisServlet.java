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
 *  M.Nagamori  <nagamorm@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 *
 */

package services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.rpc.server.*;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.Handler;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.transport.http.HTTPConstants;

import java.io.*;
import java.util.*;
import java.util.logging.*; 


public class remoteAxisServlet implements ServiceLifecycle {
	
	protected String db_user;
	protected String db_password;
	protected String db_uri;
	protected String JDBCDriver;
	protected String registry_model;
	protected String provenance_model;
	protected String translations_model;
	protected String collection_model;
	protected String account_model;
	protected String remote_model;
	protected String canonical_model;
	protected String extensions_model;
	protected String db_type;
	protected String defaut_ui_lang;
	protected String defaut_rs_lang;
	protected String provenance;
	protected String axisLog;
	protected static String lfn = null;
	protected static Logger logger;
	private static boolean logFileOpen = false;


	public void init(java.lang.Object context) throws ServiceException {
		
		try {
			ServletEndpointContext ctx = (ServletEndpointContext) context;
			ServletContext servletContext = ctx.getServletContext();
			
			String rootdir = servletContext.getRealPath("/");
			String propertyFile = rootdir + "WEB-INF/" + "jdbc.properties";
			Properties p = new Properties();
			InputStream pin = new FileInputStream(propertyFile);
			p.load(pin);
	
			db_user = p.getProperty("db_user");
			db_password = "";
			db_uri = p.getProperty("db_uri");
			JDBCDriver = p.getProperty("JDBCDriver");
			registry_model = p.getProperty("registry_model");
			provenance_model = p.getProperty("provenance_model");
			collection_model = p.getProperty("collection_model");
			translations_model = p.getProperty("translations_model");
			account_model = p.getProperty("account_model");
			remote_model = p.getProperty("remote_model");
			db_type = p.getProperty("db_type");
			defaut_ui_lang = p.getProperty("defaut_ui_lang");
			defaut_rs_lang = p.getProperty("defaut_rs_lang");
			provenance = p.getProperty("provenance");
			axisLog = p.getProperty("axisLog");
			
			if (!logFileOpen) {
				getAxisLogger();
				logFileOpen = true;
			}
	
		} catch (Exception e) {
	   	System.err.println(e);
		}
				
	}
	
	public void destroy()  {	}	
		
	protected void getAxisLogger() {
		
		try {
			Calendar tDate = new GregorianCalendar();
			StringBuffer td = new StringBuffer();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append("_" + tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
			lfn = new String(axisLog + "_" + td.toString());
					
			boolean append = true;
			FileHandler handler = new FileHandler(lfn, append);
			logger = Logger.getLogger("org.dublincore.dcregistry.services.axis");
			logger.addHandler(handler);
			System.out.println("Axis log file opened: " + lfn);
		
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	protected boolean newLogHandler() {
		try {
			String old_lfn = lfn;
			Calendar tDate = new GregorianCalendar();
			StringBuffer td = new StringBuffer();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append("_" + tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
			lfn = new String(axisLog + "_" + td.toString());
			
			boolean append = true;
			FileHandler newHandler = new FileHandler(lfn, append);
			
			java.util.logging.Handler[] handlerArray = logger.getHandlers();
			for (int i = 0; i < handlerArray.length; i++) {
				java.util.logging.Handler currentHandler = handlerArray[i];
				currentHandler.flush();
				currentHandler.close();
				logger.removeHandler(currentHandler); 
			}
			
			logger.addHandler(newHandler);
			System.out.println("Axis log file closed: " + old_lfn);
			System.out.println("Axis log file opened: " + lfn);
		
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	protected String getClientIP(MessageContext msgContext) throws AxisFault {
		
		String IP = null;
		try {
			HttpServletRequest req = (HttpServletRequest) msgContext.getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST);
			IP = req.getRemoteAddr();           
			
		} catch (Exception e) {
			throw AxisFault.makeFault(e);
		}
		
		return IP;
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

}

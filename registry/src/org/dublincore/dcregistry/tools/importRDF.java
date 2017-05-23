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
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager; 

/**
 *
 * @author  h.wagner
 */


public class importRDF extends registryTools {

	private static File logfile;
	private static FileOutputStream out;
	private static DataOutputStream dos;

	public static void main(String args[]) throws IOException {

		String [] logData = new String[2];
		String startdir = null;
		String model = null;
		long bSize = 0;
		long eSize = 0;
		List filelist = new ArrayList();

		if (args.length > 1) {
			startdir = args[0];
			System.out.println("processing all files in directory tree: " + startdir);
			model = args[1];
			System.out.println("loading model: " + model);
		} else {
			System.out.println("improper usage");
			usage();
			System.exit(-1);
		}

		try {
			getProperties();			
			createLog(logData);
	
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
			
			ModelRDB rdbModel = ModelRDB.open(conn, model);
			System.out.println("model opened");
			
			File fn = new File(startdir);
			if(!fn.isDirectory()) {
				System.out.println("directory not found: " + startdir);
			}

			bSize = rdbModel.size();
			System.out.println("importing data...");
			getFileList(fn, filelist);

			JenaReader jr = new JenaReader();
			for (int i=0; i < filelist.size(); i++) {
				String fileURL = "file://" + (String) filelist.get(i);
				logData = new String[] {"processing file: ", fileURL, "\n\n"};
				writeLog(logData);

				Model tempModel = ModelFactory.createDefaultModel();
				jr.read(tempModel, fileURL);
				StmtIterator si = tempModel.listStatements();
				while (si.hasNext()) {
 					Statement stmt = (Statement) si.next();
					Resource subject = (Resource) stmt.getSubject();
					Property predicate = (Property) stmt.getPredicate();
					RDFNode object = (RDFNode) stmt.getObject();
					//rdbModel.add(stmt);
					if (object instanceof Literal)
						rdbModel.add(subject, predicate, stmt.getLiteral().getLexicalForm().trim(), stmt.getLanguage());		
					else
						rdbModel.add(stmt);
					
					logData = new String[] {"subject: ",  subject.toString()};
					writeLog(logData);
					logData = new String[] {"predicate: ",  predicate.toString()};
					writeLog(logData);
					logData = new String[] {"object: ",  object.toString(), "\n\n"};
					writeLog(logData);
				}

				eSize = rdbModel.size();
				logData = new String[] {Long.toString(eSize - bSize), " statements added to datastore"};
				writeLog(logData);
				tempModel.close();
			}
  
			System.out.println("done!");
			System.out.println("a total of " + Long.toString(rdbModel.size()) + 
				" statements added to datastore");
			rdbModel.close();

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

   
	private static final void usage() {
		System.out.println("usage: importRDF <startdir> <model>");
	}


	private static void writeLog(String logData[ ]) throws IOException {
		StringBuffer ld = new StringBuffer();
		for (int i = 0; i < logData.length; i++) {
 		   ld.append(logData[i] + "  ");
		}

		dos.writeBytes(ld.toString() + "\n");
	}


	private static void createLog(String logData[ ]) throws IOException {
		try {
			Calendar tDate = new GregorianCalendar();
			StringBuffer td = new StringBuffer();
			td.append(tDate.get(Calendar.YEAR));
			td.append(tDate.get(Calendar.MONTH));
			td.append(tDate.get(Calendar.DATE));
			td.append("_" + tDate.get(Calendar.HOUR_OF_DAY));
			td.append(tDate.get(Calendar.MINUTE));
			td.append(tDate.get(Calendar.SECOND));
			
			File ld = new File(logDir);
			String slash = ld.separator;
			String lfn = new String(ld + slash + logFilePrefix + "_" + td.toString());
			logfile = new File(lfn);
			if (logfile.createNewFile()) {
				System.out.println("Log file: " + lfn + " opened for output");
			} else {
				System.out.println("Failed to open log file: " + lfn);
			}
			
			out = new FileOutputStream(lfn);
			dos = new DataOutputStream(out);
			
			String date_opened = Integer.toString(tDate.get(Calendar.YEAR)) +  "/" +
				Integer.toString(tDate.get(Calendar.MONTH)) + "/" + 
				Integer.toString(tDate.get(Calendar.DATE)) + " " +
				Integer.toString(tDate.get(Calendar.HOUR_OF_DAY)) + ":" + 
				Integer.toString(tDate.get(Calendar.MINUTE)) + ":" +
				Integer.toString(tDate.get(Calendar.SECOND));
			
			logData = new String[] {"Log file created:", date_opened};
			writeLog(logData);
	
		} catch (Exception e) {
			System.err.println(e);
		}
	}


	private static void getFileList(File f, List list) {
		if ((f.isDirectory()) && (!f.getName().equals(".svn"))) {	// recurse if a directory
			String entries[] = f.list();
			for (int i = 0; i < entries.length; i++) {
				getFileList(new File(f, entries[i]), list);
			}
		} else if (f.isFile()) {		// for plain files, add to list
			list.add(f.getAbsolutePath());
		}
	}

}



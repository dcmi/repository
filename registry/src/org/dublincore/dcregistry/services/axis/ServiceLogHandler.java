/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2001 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Axis" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package services;

import org.apache.axis.AxisFault;
import org.apache.axis.Handler;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.transport.http.HTTPConstants;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;

public class ServiceLogHandler extends BasicHandler {
	
	public void invoke(MessageContext msgContext) throws AxisFault
	{
		/** Log an access each time we get invoked.
		 */
		try {
			Handler serviceHandler = msgContext.getService();
			String filename = (String)getOption("filename");
			if ((filename == null) || (filename.equals("")))
				throw new AxisFault("Server.NoLogFile", "No log file configured for the LogHandler!", null, null);
			FileOutputStream fos = new FileOutputStream(filename, true);
			PrintWriter writer = new PrintWriter(fos);
			
			Integer numAccesses = (Integer)serviceHandler.getOption("accesses");
			if (numAccesses == null)
				numAccesses = new Integer(0);
				
			numAccesses = new Integer(numAccesses.intValue() + 1);
			
			Date date = new Date();
			HttpServletRequest req = (HttpServletRequest) msgContext.getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST);
			String clientIP = req.getRemoteAddr();
			String reqEnv = (String) msgContext.getRequestMessage().getSOAPPartAsString();
			String result = date + " - " + clientIP + " - " +
				msgContext.getTargetService() +
				" accessed " + numAccesses + " time(s).";             
			serviceHandler.setOption("accesses", numAccesses);
			
			writer.println(result);
			writer.close();
		} catch (Exception e) {
			throw AxisFault.makeFault(e);
		}
	}
}

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

package org.dublincore.dcregistrylt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

/**
 *
 * Expires a cookie which is used for admin servlets.
 *
 * @author  nagamorm@oclc.org
 */


public class adminLogoutServlet extends registryServlet {

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

	Cookie cookie = new Cookie("registryLiteAdmin", "");
	cookie.setMaxAge(0);
	response.addCookie(cookie);

	gotoPage("/", request, response);
   }
}

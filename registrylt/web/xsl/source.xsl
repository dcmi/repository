<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:dc="http://purl.org/dc/elements/1.1/"
	xmlns:reg="http://dublincore.org/dcregistrylt/"
	xmlns:java="java" >

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="footer.xsl"/>	
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="location" select="'about'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>

<xsl:template match="rdf:RDF">
	<html>
	<head>
		<title>The Open Metadata Registry</title>
		<link type="text/css" rel="stylesheet" href="/dcregistrylt/css/default.css" />
	</head>
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>

	<p/>
	<h1>Project Source Code</h1>
	<p/>
	
	<div align="left">
	<h3>Copyright</h3>
	<p/>       
	 The contents of these files, as updated from time to time by Dublin Core
	 Metadata Initiative (DCMI), are subject to the Dublin Core Public
	 License Version 1.0 (the "License"); you may not use these files except
	 in compliance with the License. You may obtain a current copy of the
	 License at <a href="http://dublincore.org/dcpl/">http://dublincore.org/dcpl/</a>.
	 <p />
	 Software distributed under this License is distributed on an "AS IS"
	 basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
	 the License for the specific language governing rights and
	 limitations under the License.
	 <p />
	 This software consists of voluntary contributions made by many
	 individuals on behalf of the Dublin Core Metadata Initiative. For
	 more information on the Dublin Core Metadata Initiative, please see
	 <a href="http://dublincore.org/">http://dublincore.org/</a>.
	<p /> 
	 This is Original Code.
	<p />
	 Portions created by DCMI are Copyright (C) 2000. 

	<p/>
	<h3>Source Repository</h3>
	<p/>

	The source code for the DCMI Metadata Registry is maintained in a <a href="http://subversion.tigris.org/">Subversion</a> 
	repository.  You can access the source code repository by following these simple steps:
	<ol>
	<li>Download and install a <a href="http://subversion.tigris.org/project_packages.html">Subversion client</a>.  A
	variety of clients are available, for almost evey operating system.  <a href="http://svnbook.red-bean.com/">
	Documentation for Subversion</a> is available here.</li>
	<li>Use the following command (unix systems) to checkout the project: 
	<i>svn checkout svn://svn.dublincore.org/registry/trunk regitry</i>.	
	This will create a local-copy of the project on your computer.  
	</li>
	</ol>
	<p/>
	Installation instructions are available <a href="/dcregistrylt/pageDisplayServlet?page=install.xsl">here</a>.
	<p/>
	Please let <a href="mailto:webmaster@dublincore.org">webmaster@dublincore.org</a> if you are interested in
	implemented a metadata registry.

	</div>

	<p/>
	
	<xsl:call-template name="footer" />

	</body>
	</html>
</xsl:template>

</xsl:stylesheet>



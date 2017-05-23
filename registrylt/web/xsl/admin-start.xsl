<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/dcregistrylt/">

<xsl:output method="html" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" />

<xsl:include href="banner.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:variable name="strs" select="document('../xml/translations.xml')/strings/lang[@RFC3066=$uiLang]"/>
<xsl:variable name="PI" select="processing-instruction('params')" />
<xsl:variable name="uiLang" select="substring-before(substring-after($PI, 'uiLang=&#034;'), '&#034;')" />

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>

<xsl:template match="/">
	<html>
	<head>
	<title>The Open Metadata Registry (Lite)</title>
	<link type="text/css" rel="stylesheet" href="/dcregistrylt/css/default.css" />
	</head>	
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="action" select="'administration'" />
	</xsl:call-template>
	
	<p/>
	<table cellspacing="0" width="50%" class="border">
	<tr><th>Registry Administration</th></tr>	
	<tr><td><a href="/dcregistrylt/adminExtensionManagerServlet">Manage Extensions</a></td></tr>
	<tr><td><a href="/dcregistrylt/adminLogManagerServlet">Manage Log Files</a></td></tr>
	<tr><td><a href="/dcregistrylt/adminStatsServlet">View Statistics</a></td></tr>	
	<tr><td><a href="/dcregistrylt/adminLogoutServlet">Logout</a></td></tr>
	</table>
	
	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

</xsl:stylesheet>

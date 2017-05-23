<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:reg="http://dublincore.org/dcregistrylt/">

<xsl:output method="html" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" />

<xsl:include href="banner.xsl"/>
<xsl:include href="footer.xsl"/>

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
	<form name="loginform" action="/dcregistrylt/adminLoginServlet" method="post">
		<input value="login" name="reqType" type="hidden" />
		<table cellspacing="0" class="border">
			<tr>
			<th style="text-align:right;">Account:</th>
			<td><input type="text" name="account" value="" size="30" /></td>
			</tr>
			<tr>
			
			<th style="text-align:right;">Password:</th>
			<td><input type="password" name="password" value="" size="30" /></td>
			</tr>
			<tr>
			<th style="text-align:right;">&#160;</th>
			<td><input type="submit" value="Login" class="button" /></td>
			</tr>
		</table>
	</form>
	
	<p/><xsl:call-template name="footer" />
		
	</body>
	</html>

</xsl:template>

</xsl:stylesheet>

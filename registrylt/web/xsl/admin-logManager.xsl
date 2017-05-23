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

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>

<xsl:variable name="strs" select="document('../xml/translations.xml')/strings/lang[@RFC3066=$uiLang]"/>
<xsl:variable name="uiLang" select="'en-US'"/>

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
	<h1>Manage The Registry Log File</h1>
	<p/>
	<form name="logManagerForm" action="/dcregistrylt/adminLogManagerServlet" method="post">
	<table cellspacing="0" class="border">
	
	<tr>
	<th style="text-align:right;">Log file:</th>
	<td>
	<input type="checkbox" name="rollWeb" value="Y"/>Web log:&#160;
	<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/appl_log']/reg:currentLog"/>
	</td>
	</tr>
	
	<tr>
	<th style="text-align:right;">&#160;</th>
	<td><input type="submit" value="Roll Log file" class="button" /></td>
	</tr>
	</table>
	<input type="hidden" name= "reqType" value="roll" />
	</form>
	
	<xsl:apply-templates select="//reg:displayMsg"/>
	<p/><xsl:apply-templates select="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/appl_log']/reg:hasStatus"/>
	
	<p/><xsl:call-template name="footer" />
		
	</body>
	</html>

</xsl:template>

<xsl:template match="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/appl_log']/reg:hasStatus">
		
	Web log recycle status:&#160;<b><xsl:value-of select="."/></b>
	<br/><xsl:value-of select="../reg:oldLog"/>&#160;<b>closed</b>
	<br/><xsl:value-of select="../reg:currentLog"/>&#160;<b>open</b>
	
</xsl:template>

<xsl:template match="//reg:displayMsg">
	<b><xsl:value-of select="."/></b>
</xsl:template>

</xsl:stylesheet>

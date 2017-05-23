<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" >

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="admin-loginForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="location" select="'administration'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>

<xsl:template match="/">
	<html>
	<head>
	<title>The Open Metadata Registry</title>
	<link type="text/css" rel="stylesheet" href="/dcregistry/css/default.css" />
	</head>	
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>

	<p/>
	<h1>Manage The Registry Log Files</h1>
	<p/>
	<form name="logManagerForm" action="/dcregistry/adminLogManagerServlet" method="post">
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
	<th style="text-align:right;">Log file:</th>
	<td>
	<input type="checkbox" name="rollWeb" value="Y"/>Web log:&#160;
	<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/registry/appl_log']/reg:currentLog"/>
	<br/><input type="checkbox" name="rollRest" value="Y"/>Rest log:&#160;
	<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/registry/rest_log']/reg:currentLog"/>
	<br/><input type="checkbox" name="rollAxis" value="Y"/>Axis log:&#160;
	<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/registry/axis_log']/reg:currentLog"/>
	</td>
	</tr>
	
	<tr>
	<th style="text-align:right;">&#160;</th>
	<td><input type="submit" value="Roll Logs" class="button" /></td>
	</tr>
	</table>
	<input type="hidden" name= "reqType" value="roll" />
	</form>
	
	<xsl:apply-templates select="//reg:displayMsg"/>
	<p/><xsl:apply-templates select="//rdf:Description[@rdf:about='http://dublincore.org/registry/appl_log']/reg:hasStatus"/>
	<p/><xsl:apply-templates select="//rdf:Description[@rdf:about='http://dublincore.org/registry/rest_log']/reg:hasStatus"/>
	<p/><xsl:apply-templates select="//rdf:Description[@rdf:about='http://dublincore.org/registry/axis_log']/reg:hasStatus"/>
	
	<p/><xsl:call-template name="footer" />
		
	</body>
	</html>

</xsl:template>

<xsl:template match="//rdf:Description[@rdf:about='http://dublincore.org/registry/appl_log']/reg:hasStatus">
		
	Web log recycle status:&#160;<b><xsl:value-of select="."/></b>
	<br/><xsl:value-of select="../reg:oldLog"/>&#160;<b>closed</b>
	<br/><xsl:value-of select="../reg:currentLog"/>&#160;<b>open</b>
	
</xsl:template>

<xsl:template match="//rdf:Description[@rdf:about='http://dublincore.org/registry/rest_log']/reg:hasStatus">
		
	Rest log recycle status:&#160;<b><xsl:value-of select="."/></b>
	<br/><xsl:value-of select="../reg:oldLog"/>&#160;<b>closed</b>
	<br/><xsl:value-of select="../reg:currentLog"/>&#160;<b>open</b>
	
</xsl:template>

<xsl:template match="//rdf:Description[@rdf:about='http://dublincore.org/registry/axis_log']/reg:hasStatus">
		
	Axis log recycle status:&#160;<b><xsl:value-of select="."/></b>
	<br/><xsl:value-of select="../reg:oldLog"/>&#160;<b>closed</b>
	<br/><xsl:value-of select="../reg:currentLog"/>&#160;<b>open</b>
	
</xsl:template>

<xsl:template match="//reg:displayMsg">
	<b><xsl:value-of select="."/></b>
</xsl:template>

</xsl:stylesheet>

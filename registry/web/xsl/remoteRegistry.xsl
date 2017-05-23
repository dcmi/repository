<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg">

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="''"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/preferenceServlet'"/>

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
		
	
	<form name="remoteRegistryForm" action="/dcregistry/remoteRegistryServlet" method="post">
	<table width="100%" cellspacing="0" cellpadding="0" border="1">
	<tr><td>
	<table width="100%" cellspacing="3" cellpadding="0" border="0">
	<tr><td>
	<table width="100%" cellspacing="0" cellpadding="3" border="0">	
	<tr><td width="30%" valign="top" bgcolor="#EEEEEE">
	instruction go here
	</td><td width="70%" bgcolor="EEEEEE">
	<table width="100%" cellspacing="0" cellpadding="3" border="0">	
	<tr><td align="left">
	http://wip.dublincore.org:8080/axis/services/languagesSummary
	</td><td align="left">
	<a href="/call">Call Service</a>&#160;&#160;
	<a href="/call">Remove Registry</a>
	</td></tr>
	
	<tr><td align="left">
	http://wip.dublincore.org:8080/axis/services/languagesSummary
	</td><td align="left">
	<a href="/call">Call Service</a>&#160;&#160;
	<a href="/call">Remove Registry</a>
	</td></tr>

	<tr><td align="left">
	</td></tr>
	</table>
	</td></tr>
	</table>
	</td></tr>
	</table>
	</td></tr>
	</table>
	</form>
	
	<xsl:apply-templates select="*"/>
	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="*">
	<b><xsl:value-of select="."/></b><br />	
</xsl:template>

</xsl:stylesheet>

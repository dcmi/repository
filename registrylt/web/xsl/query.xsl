<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:reg="http://dublincore.org/dcregistrylt/">

<xsl:output method="html" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" />

<xsl:include href="banner.xsl"/>
<xsl:include href="searchForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:variable name="strs" select="document('../xml/translations.xml')/strings/lang[@RFC3066=$uiLang]"/>
<xsl:variable name="PI" select="processing-instruction('params')" />
<xsl:variable name="reqType" select="substring-before(substring-after($PI, 'reqType=&#034;'), '&#034;')" />
<xsl:variable name="action" select="substring-before(substring-after($PI, 'action=&#034;'), '&#034;')" />
<xsl:variable name="uiLang" select="substring-before(substring-after($PI, 'uiLang=&#034;'), '&#034;')" />

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:template match="rdf:RDF">

	<html>
	<head>
		<title>The Open Metadata Registry (Lite)</title>
		<link type="text/css" rel="stylesheet" href="/dcregistrylt/css/default.css" />
	</head>
	<body>

	<xsl:call-template name="banner">
		<xsl:with-param name="action" select="$action" />
		<xsl:with-param name="uiLang" select="$uiLang" />
	</xsl:call-template>
	
	<xsl:call-template name="searchForm">
		<xsl:with-param name="action" select="$action" />
		<xsl:with-param name="reqType" select="$reqType" />
	</xsl:call-template>
	
	<p />
	<xsl:call-template name="footer" />

	</body>
	</html>
</xsl:template>

</xsl:stylesheet>



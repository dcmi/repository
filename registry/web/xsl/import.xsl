<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" >

<xsl:output method="html"/>

<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="importForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="reqType" select="''"/>
<xsl:param name="fileURL" select="''"/>
<xsl:param name="schemaURI" select="''"/>
<xsl:param name="title" select="''"/>
<xsl:param name="description" select="''"/>
<xsl:param name="publisher" select="''"/>
<xsl:param name="language" select="'en-US'"/>
<xsl:param name="relatedDoc" select="''"/>
<xsl:param name="year" select="''"/>
<xsl:param name="month" select="''"/>
<xsl:param name="day" select="''"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
<xsl:param name="location" select="'import'"/>


<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/importServlet'"/>

<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle($uiLang)"/>

<xsl:template match="/">
	<html>
	<head>
	<title>The Open Metadata Registry</title>
	</head>	
	<body>

	<xsl:call-template name="banner" />		
	<hr size="1" />

	<xsl:call-template name="navbar">
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>
	<hr size="1" />
	
	<!-- 	-->	
	<p />
	<xsl:call-template name="importForm">
		<xsl:with-param name="fileURL" select="$fileURL" />
		<xsl:with-param name="schemaURI" select="$schemaURI" />
		<xsl:with-param name="title" select="$title" />
		<xsl:with-param name="description" select="$description" />
		<xsl:with-param name="publisher" select="$publisher" />
		<xsl:with-param name="language" select="$language" />
		<xsl:with-param name="relatedDoc" select="$relatedDoc" />
		<xsl:with-param name="year" select="$year" />
		<xsl:with-param name="month" select="$month" />
		<xsl:with-param name="day" select="$day" />
	</xsl:call-template>

	<p /><xsl:apply-templates select="*"/>

	<p />
	<xsl:call-template name="footer" />
		
	</body>
	</html>

</xsl:template>

<xsl:template match="*">
	
	<xsl:value-of select="."/>
		
</xsl:template>

</xsl:stylesheet>

<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:xinfo="org.dublincore.dcregistry.bean.xinfoBean"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg xinfo dc dcq">

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="searchForm.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="dcLabels.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="modelSize" select="'0'"/>
<xsl:param name="reqType" select="' '"/>
<xsl:param name="action" select="''"/>
<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
<xsl:param name="defaultResultsLang" select="'en_US'"/>
<xsl:param name="provenance" select="'N'"/>
<xsl:param name="detailItem" select="' '"/>
<xsl:param name="searchTerm" select="''"/>
<xsl:param name="searchCase" select="'N'"/>
<xsl:param name="searchType" select="'exact phrase'"/>
<xsl:param name="location" select="'search'"/>
<xsl:param name="docRoot" select="''"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:variable name="bundle">
	<xsl:choose>
		<xsl:when test="$uiStyle='rdf'">			
			<xsl:value-of select="'rdf'"/>					
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="'labels'"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:variable>

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>
<xsl:variable name="label_names" select="java:util.ResourceBundle.getBundle($bundle, $locale)"/> 


<xsl:template match="rdf:RDF">

	<html>
	<head>
		<title>The Open Metadata Registry</title>
		<link type="text/css" rel="stylesheet" href="/dcregistry/css/default.css" />
	</head>
	<body>
	
	<xsl:call-template name="banner">
		<xsl:with-param name="location" select="$location" />
		<xsl:with-param name="action" select="$action" />
	</xsl:call-template>
	
	<xsl:call-template name="searchForm">
		<xsl:with-param name="action" select="$action" />
		<xsl:with-param name="searchTerm" select="$searchTerm" />
		<xsl:with-param name="searchCase" select="$searchCase" />
		<xsl:with-param name="searchType" select="$searchType" />
		<xsl:with-param name="reqType" select="$reqType" />
		<xsl:with-param name="uiLang" select="$uiLang" />
		<xsl:with-param name="language" select="$resultsLang" />
		<xsl:with-param name="uiStyle" select="$uiStyle" />
		<xsl:with-param name="docRoot" select="$docRoot" />
	</xsl:call-template>
	
	<p />
	<xsl:call-template name="footer" />

	</body>
	</html>
</xsl:template>

</xsl:stylesheet>



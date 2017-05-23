<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	xmlns:reg="http://dublincore.org/registry/"
	xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="preferenceForm.xsl"/> <!-- main -->
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'preferences'"/>
<xsl:param name="itemType" select="'unknown'"/>
<xsl:param name="itemTarget" select="'unknown'"/>
<xsl:param name="predicate" select="'unknown'"/>
<xsl:param name="sid" select="''"/>
<!-- <xsl:param name="reqType" select="' '"/> -->

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

	<!-- <xsl:apply-templates select="*"/> -->
	<xsl:call-template name="printDeleteForm">
	    <xsl:with-param name="itemType" select="$itemType"/>
	    <xsl:with-param name="itemTarget" select="$itemTarget"/>
	</xsl:call-template>

	<p/>

	[<a href="JavaScript:history.back()">Cancel</a>]
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]

	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template name="printDeleteForm">
    <xsl:param name="itemType"/>
    <xsl:param name="itemTarget"/>

    <xsl:variable name="encoded_item">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="$itemTarget"/>
	</xsl:call-template>
    </xsl:variable>

    <form method="post" action="/dcregistry/adminServlet">
	<input type="hidden" name="uiStyle" value="{$uiStyle}"/>
	<input type="hidden" name="uiLang" value="{$uiLang}"/>
	<input type="hidden" name="resultsLang" value="{$resultsLang}"/>
	<input type="hidden" name="itemType" value="{$itemType}"/>
	<input type="hidden" name="reqType" value="confirm"/>
	<input type="hidden" name="predicate" value="{$predicate}"/>
	<input type="hidden" name="sid" value="{$sid}"/>
	<!-- <input type="hidden" name="item" value="{$encoded_item}"/> -->
	<input type="hidden" name="item" value="{$itemTarget}"/>
	<table>
	<xsl:choose>
	    <xsl:when test="$itemType = 'collection'"> <!-- collection -->
		Do you really want to delete "<em><xsl:value-of select="$itemTarget"/></em>"?
	    </xsl:when>
	    <xsl:when test="$itemType = 'term'"> <!-- term / scheme -->
		Do you really want to delete "<em><xsl:value-of select="$itemTarget"/></em>"?
	    </xsl:when>
	    <xsl:when test="$itemType = 'property'"> <!-- property -->
		<h3>Term: <xsl:value-of select="$itemTarget"/></h3>
		<p>
		Do you really want to delete "<em><xsl:value-of select="$predicate"/></em>"?
		</p>
	    </xsl:when>
	    <xsl:otherwise>
		no such item type...
	    </xsl:otherwise>
	</xsl:choose>
	</table>
	<div>
	    <input type="submit" value="Confirm"/>
	    <!-- <input type="reset"/> -->
	</div>
    </form>
</xsl:template>

<!--
<xsl:template match="rdf:RDF">
</xsl:template>

<xsl:template match="reg:collection">
    <xsl:variable name="encoded_item">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="."/>
	</xsl:call-template>
    </xsl:variable>
        
    <li>
    	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/adminServlet?reqType=detail', '&amp;', 'item=', $encoded_item, '&amp;', 'itemType=0')"/></xsl:attribute><xsl:value-of select="."/></a>
    	[<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/adminServlet?reqType=edit', '&amp;', 'item=', $encoded_item, '&amp;', 'itemType=0')"/></xsl:attribute>Edit</a>]
    	[<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/adminServlet?reqType=delete', '&amp;', 'item=', $encoded_item, '&amp;', 'itemType=0')"/></xsl:attribute>Delete</a>]
    </li>
</xsl:template>
-->

<xsl:template match="*">
	<b><xsl:value-of select="."/></b><br />	
</xsl:template>

</xsl:stylesheet>

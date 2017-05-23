<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:langInfo="org.dublincore.dcregistry.bean.languageBean"
  xmlns:java="java" 
  exclude-result-prefixes="java rdf rdfs reg dc dcq langInfo">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="preferenceForm.xsl"/> <!-- main -->
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>
<xsl:include href="admin-common.xsl"/>

<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'administration'"/>
<xsl:param name="itemType" select="'unknown'"/>
<!-- <xsl:param name="reqType" select="' '"/> -->
<xsl:param name="docRoot"/>

<xsl:variable name="ui" select="'ui'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/preferenceServlet'"/>

<xsl:variable name="admin" select="'/dcregistry/adminServlet'"/>

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
	
	<h3>Edit: <xsl:value-of select="rdf:RDF/rdf:Description/@rdf:about"/></h3>

	<xsl:call-template name="printInputForm">
	    <xsl:with-param name="itemType" select="$itemType"/>
	</xsl:call-template>

	<p/>

	[<a href="{$admin}">Back to Top Page</a>]

	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template name="printInputForm">
    <xsl:param name="itemType"/>
    <form method="post" action="{$admin}">
	<!--
	    common parameters.
	-->
	<input type="hidden" name="uiStyle"     value="{$uiStyle}"/>
	<input type="hidden" name="uiLang"      value="{$uiLang}"/>
	<input type="hidden" name="resultsLang" value="{$resultsLang}"/>
	<input type="hidden" name="itemType"    value="{$itemType}"/>
	<input type="hidden" name="reqType"     value="insert"/>
	<table>
	<xsl:choose>
	    <xsl:when test="$itemType = 'collection'"> <!-- collection -->
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:identifier" />
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:title" />
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:publisher" />
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:description" />
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:language" />
		<xsl:apply-templates select="rdf:RDF/rdf:Description/dc:date" />
	    </xsl:when>
	    <xsl:otherwise>
		[error]
	    </xsl:otherwise>
	</xsl:choose>
	</table>
	<div>
	    <input type="submit" value="Modify"/>
	    <input type="reset"/>
	</div>
    </form>
</xsl:template>

<xsl:template name="get-predicate">
    <xsl:variable name="node" select="rdf:RDF/rdf:Description/*[position()=1]"/>
    <xsl:value-of select="concat(namespace-uri($node), local-name($node))"/>
</xsl:template>

<xsl:template match="rdf:*">
    <xsl:variable name="pname" select="concat('rdf_',local-name())"/>
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="$pname"/>
	<xsl:with-param name="value" select="."/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,$pname), ' :')"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="rdfs:*">
    <xsl:variable name="pname" select="concat('rdfs_',local-name())"/>
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="$pname"/>
	<xsl:with-param name="value" select="."/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,$pname), ' :')"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="dc:identifier">
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="'dc_identifier'"/>
	<xsl:with-param name="value" select="@rdf:resource"/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,'dc_identifier'),'(URI):')"/>
	<xsl:with-param name="type"  select="'resource'"/>
	<xsl:with-param name="readonly" select="'yes'"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="dc:language">
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="'dc_language'"/>
	<xsl:with-param name="value" select="."/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,'dc_language'),' :')"/>
	<xsl:with-param name="docRoot" select="$docRoot"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="dc:*">
    <xsl:variable name="pname" select="concat('dc_',local-name())"/>
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="$pname"/>
	<xsl:with-param name="value" select="."/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,$pname), ' :')"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="dcq:*">
    <xsl:variable name="pname" select="concat('dcq_',local-name())"/>
    <xsl:call-template name="printElement">
	<xsl:with-param name="name"  select="$pname"/>
	<xsl:with-param name="value" select="."/>
	<xsl:with-param name="label" select="concat(java:getString($label_names,$pname), ' :')"/>
    </xsl:call-template>
</xsl:template>

<xsl:template match="*">
    <b>
	<xsl:value-of select="."/>
    </b>
    <br />	
</xsl:template>

</xsl:stylesheet>

<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg dc dcq">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="preferenceForm.xsl"/> <!-- main -->
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:include href="admin-common.xsl"/>
<xsl:include href="admin-detail-common.xsl"/>

<xsl:param name="reqType" select="' '"/>
<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'administration'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/preferenceServlet'"/>

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
	    <script type="text/javascript" src="select_lang.js"/>
	</head>	
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>
	
	<p/>

	<xsl:apply-templates select="*"/>
		
	<p/>

	<!--
	[<a href="/dcregistry/adminServlet?reqType=detail&amp;itemType=collection&amp;item={rdf:RDF/rdf:Description/rdfs:isDefinedBy/@rdf:resource}">Back to the Collection</a>]
	-->
	[<a>
	    <xsl:attribute name="href">/dcregistry/adminServlet?reqType=detail&amp;itemType=collection&amp;item=<xsl:call-template name="_url_encode"><xsl:with-param name="url" select="rdf:RDF/rdf:Description/rdfs:isDefinedBy/@rdf:resource"/></xsl:call-template>
	    </xsl:attribute>Back to the Collection
	</a>]
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]

	<xsl:call-template name="footer"/>

	</body>
    </html>
</xsl:template>

<xsl:template match="rdf:Description[@rdf:about]">
    <h3><a href="{@rdf:about}"><xsl:value-of select="@rdf:about"/></a></h3>
    <p/>
    <h4>Metadata about the Term</h4>
    <table style="margin-left: 2em;">
	<tr>
	    <th bgcolor="#EEEEEE">Property</th>
	    <th bgcolor="#EEEEEE" width="50%" >Value</th>
	    <th bgcolor="#EEEEEE">xml:lang</th>
	    <th bgcolor="#EEEEEE">Functions</th>
	</tr>
	<xsl:apply-templates select="reg:bag"/>
	<tr>
	    <td/>
	    <td/>
	    <td/>
	    <td>
		<xsl:call-template name="printAddProperty"/>
	    </td>
	</tr>
    </table>
</xsl:template>

</xsl:stylesheet>

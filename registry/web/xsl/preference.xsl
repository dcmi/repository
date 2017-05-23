<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" exclude-result-prefixes="java rdf rdfs reg">


<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="docRoot"/>
<xsl:param name="location" select="'preferences'"/>

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
	<xsl:apply-templates select="rdf:RDF"/>
		
	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="rdf:RDF">
	<form name="preferenceForm" action="/dcregistry/preferenceServlet" method="post">
	<table cellspacing="0" class="border">
	
	<tr><th style="text-align:right;">
	<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'uiLang')"/>&#160;
	</th><td>
		<select name="uiLang">		
			<xsl:apply-templates select="rdf:Description">
				<xsl:with-param name="default_lang" select="$uiLang" />
				<xsl:with-param name="type" select="'uiSupport'" />
			</xsl:apply-templates>
		</select>		
	</td></tr>
	
	<tr><th style="text-align:right;">
	<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'returnStmts')"/>&#160;
	</th><td>
	<select name="resultsLang">
		<xsl:choose>
			<xsl:when test="$resultsLang='all'">
				<option selected="selected" value="all">All Translations</option>
			</xsl:when>
			<xsl:otherwise>
				<option value="all">All Translations</option>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:apply-templates select="rdf:Description">
			<xsl:with-param name="default_lang" select="$resultsLang" />
			<xsl:with-param name="type" select="'rsSupport'" />
		</xsl:apply-templates>
	</select>	
	</td></tr>

	<tr><th style="text-align:right;">&#160;</th>
	<td>
	<xsl:text disable-output-escaping='yes'>&lt;input class="button" value="</xsl:text>
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'submit')"/>
	<xsl:text disable-output-escaping='yes'>" type="submit" /&gt;</xsl:text>
	<xsl:text disable-output-escaping='yes'>&#160;&#160;&#160;</xsl:text>
	<xsl:text disable-output-escaping='yes'>&lt;input class="button" value="</xsl:text>
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'reset')"/>
	<xsl:text disable-output-escaping='yes'>" type="reset" /&gt;</xsl:text>	
	</td></tr>

	</table>
	<input type="hidden" name= "reqType" value="setPreferences" />
	</form>
	
</xsl:template>

<xsl:template match="rdf:Description">
	<xsl:param name="default_lang"/>
	<xsl:param name="type"/>

	<xsl:if test="substring(@rdf:about, 32)=$type">
		<xsl:apply-templates select="dc:description">
			<xsl:with-param name="default_lang" select="$default_lang" />
		</xsl:apply-templates>
	</xsl:if>
		
</xsl:template>

<xsl:template match="dc:description">
	<xsl:param name="default_lang"/>
	<xsl:variable name="RFCcode" select="substring(substring-after(., '['), 1, 5)" />

	<xsl:choose>
		<xsl:when test="$default_lang=$RFCcode"> 
			<option selected="selected" value="{$RFCcode}">
				<xsl:value-of select="."/>
			</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="{$RFCcode}">
				<xsl:value-of select="."/>
			</option>
		</xsl:otherwise>
	</xsl:choose>
		
</xsl:template>

</xsl:stylesheet>

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
<xsl:include href="footer.xsl"/>
<xsl:include href="languages.xsl"/>
<xsl:include href="countries.xsl"/>

<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'preferences'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>

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
		<xsl:with-param name="action" select="$location" />
	</xsl:call-template>
		
	<p/>
	<xsl:apply-templates select="rdf:RDF"/>
		
	<p />
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="rdf:RDF">
	
	<h1>Language Support</h1>
	<table cellspacing="0" width="100%" class="border">
	<tr>
	<th width="15%">RFC 3066 Code</th>	
	<th width="25%">Description</th>
	<th width="5%">UI</th>
	<th width="5%">Meta</th>
	<th width="15%" align="center">Action</th>
	<th width="35%" colspan="3">&#160;</th>
	</tr>
	
	<xsl:apply-templates select="rdf:Description">
		<xsl:sort select="@rdf:about"/>
	</xsl:apply-templates>
	
	</table>
	
	<form>
	<table cellspacing="0" width="100%" class="border">
	<tr><th width="60%" align="left">
	RFC 3066 Code
	</th><th width="40%" align="left" colspan="3">
	Language Support
	</th></tr>
	
	<tr><td width="60%" align="left">
	<xsl:call-template name="languages"/>-<xsl:call-template name="countries"/>
	</td><td width="10%" align="left">
	UI <input type="checkbox" name="uiSupport"/>
	</td><td width="15%" align="left">
	Metadata <input type="checkbox" name="rsSupport"/>
	</td><td width="15%" align="left">
	<input value="Add" type="submit" />
	</td></tr>
	
	<input type="hidden" name="reqType" value="add" />
	
	</table>
	</form>
	
</xsl:template>

<xsl:template match="rdf:Description">
	<xsl:variable name="xitem">
		<xsl:value-of select="./dc:description/@xml:lang"/>
	</xsl:variable>

	<tr>
	<form action="/dcregistry/adminTranslationsServlet" method="post">
	<td width="15%" align="left"><xsl:value-of select="./dc:description/@xml:lang"/></td>
	<td width="25%" align="left">
	<input size="25" maxlength="32" type="text" name="description" value="{./dc:description}" />
	</td>
	<td width="5%" align="left">
	<xsl:choose>
		<xsl:when test="./reg:uiSupport='true'">
			<input type="checkbox" checked="checked" name="uiSupport"/>
		</xsl:when>
		<xsl:otherwise>
			<input type="checkbox" name="uiSupport"/>
		</xsl:otherwise>
	</xsl:choose>	
	</td><td width="5%" align="center">
	<xsl:choose>
		<xsl:when test="./reg:rsSupport='true'">
			<input type="checkbox" checked="checked" name="rsSupport"/>
		</xsl:when>
		<xsl:otherwise>
			<input type="checkbox" name="rsSupport"/>
		</xsl:otherwise>
	</xsl:choose>
	
	</td><td width="15%" align="center">
	<input value="Update" type="submit" />
	&#160;&#160;
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/adminTranslationsServlet?reqType=delete', '&amp;', 'item=', $xitem)"/></xsl:attribute>
	Delete</a>
	
	</td><td width="35%" align="left">&#160;</td>
	<input type="hidden" name="reqType" value="update" />
	<input type="hidden" name="item" value="{$xitem}" />
	</form>
	</tr>		
</xsl:template>

</xsl:stylesheet>

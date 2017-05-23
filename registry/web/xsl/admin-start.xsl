<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" exclude-result-prefixes="java rdf rdfs reg">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="reqType" select="' '"/>
<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
<xsl:param name="location" select="'administration'"/>

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
	
	<h1>Registry Administration</h1>
	
	<table cellspacing="0" width="100%">
	<tr><td width="50%">
	
	<table cellspacing="0" width="100%" class="border">
	<tr><th colspan="2">Collection &amp; Resource Management</th></tr>
	<xsl:apply-templates select="*"/>
	</table>

	<table cellspacing="0" width="100%" class="border">
	<tr><th>Internationalization Support</th></tr>	
	<tr><td><a href="/dcregistry/adminTranslationsServlet">Manage Language Support</a></td></tr>
	<tr><td><a href="/dcregistry/propertyEditorServlet">Property File Editor</a></td></tr>
	</table>
	
	</td><td width="1%">&#160;</td><td width="49%" align="right">	
	
	<table cellspacing="0" width="100%" class="border">
	<tr><th>Inter-Registry Communication Support</th></tr>	
	<tr><td><a href="/dcregistry/registerRemoteServicesServlet">Register &amp; Manage Remote Services</a></td></tr>
	<tr><td><a href="/dcregistry/listRegisteredServicesServlet">Execute Remote Services</a></td></tr>
	</table>
	
	<table cellspacing="0" width="100%" class="border">
	<tr><th>Application Statistics</th></tr>	
	<tr><td><a href="/dcregistry/adminLogManagerServlet">Manage Log Files</a></td></tr>
	<tr><td><a href="/dcregistry/adminStatsServlet">View Statistics</a></td></tr>
	</table>
	
	<table cellspacing="0" width="100%" class="border">
	<tr><th>Other Tools</th></tr>	
	<tr><td><a href="/dcregistry/adminExtensionManagerServlet">Manage Extensions</a></td></tr>
	<tr><td><a href="/dcregistry/importRDFServlet">Import RDF</a></td></tr>
	<tr><td><a href="/dcregistry/logoutServlet">Logout</a></td></tr>
	</table>
	
	</td></tr>
	</table>
	
	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="rdf:RDF">

	<xsl:apply-templates select="rdf:Description/reg:collection">
	    <xsl:sort select="." />
	</xsl:apply-templates>
		
	<form method="post" action="/dcregistry/adminCollectionManagerServlet">
	<tr><td>
	<input name="itemType" type="hidden" value="collection" />
	<input name="item" size="50" maxlength="128" />
	</td><td align="right"><input name="reqType" type="submit" value="Add Collection" /></td></tr>
	</form>
	
	<tr><td colspan="2">
	<a class="label"><xsl:attribute name="href"><xsl:value-of select="'/dcregistry/adminCollectionManagerServlet?reqType=detail&amp;item=other&amp;itemType=other'"/>
	</xsl:attribute>Other Resources</a> (not part of any collection)
	</td></tr>
	
	<tr><td colspan="2">
	<a class="label"><xsl:attribute name="href"><xsl:value-of select="'/dcregistry/adminCollectionManagerServlet?reqType=detail&amp;item=all&amp;itemType=all'"/>
	</xsl:attribute>All Resources</a> (listed alphabetically)
	</td></tr>
		
</xsl:template>

<xsl:template match="reg:collection">
    <xsl:variable name="encoded_item">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="."/>
	</xsl:call-template>
    </xsl:variable>
        
	<tr><td>
	<a><xsl:attribute name="href">
	<xsl:value-of select="concat('/dcregistry/adminCollectionManagerServlet?reqType=detail', '&amp;', 'item=', $encoded_item, '&amp;', 'itemType=collection')"/>
	</xsl:attribute><xsl:value-of select="."/></a>
	</td><td align="right">
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/adminCollectionManagerServlet?reqType=delete', '&amp;', 'item=', $encoded_item)"/>
	</xsl:attribute>Delete Collection</a>
	</td></tr>
        
</xsl:template>

<xsl:template match="*">
	<b><xsl:value-of select="."/></b><br />	
</xsl:template>

</xsl:stylesheet>

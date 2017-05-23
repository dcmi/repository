<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" >

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="date-fmt2.xsl"/>
<xsl:include href="date-fmt3.xsl"/>
<xsl:include href="statsForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="reqType" select="''"/>
<xsl:param name="dir" select="''"/>
<xsl:param name="appPfx" select="''"/>
<xsl:param name="soapPfx" select="''"/>
<xsl:param name="restPfx" select="''"/>
<xsl:param name="bYear" select="''"/>
<xsl:param name="bMonth" select="''"/>
<xsl:param name="bDay" select="''"/>
<xsl:param name="eYear" select="''"/>
<xsl:param name="eMonth" select="''"/>
<xsl:param name="eDay" select="''"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
<xsl:param name="totalMethodCount" select="'0'"/>
<xsl:param name="uniqueIPCount" select="'0'"/>
<xsl:param name="restCount" select="'0'"/>
<xsl:param name="soapCount" select="'0'"/>
<xsl:param name="location" select="'administration'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="reg" select="'http://dublincore.org/registry/'"/>

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
	    
	<xsl:call-template name="statsForm">
		<xsl:with-param name="dir" select="$dir"/>
		<xsl:with-param name="appPfx" select="$appPfx"/>
		<xsl:with-param name="soapPfx" select="$soapPfx"/>
		<xsl:with-param name="restPfx" select="$restPfx"/>
		<xsl:with-param name="bYear" select="$bYear"/>
		<xsl:with-param name="bMonth" select="$bMonth"/>
		<xsl:with-param name="bDay" select="$bDay"/>
		<xsl:with-param name="eYear" select="$eYear"/>
		<xsl:with-param name="eMonth" select="$eMonth"/>
		<xsl:with-param name="eDay" select="$eDay"/>
		<xsl:with-param name="totalMethodCount" select="$totalMethodCount"/>
		<xsl:with-param name="uniqueIPCount" select="$uniqueIPCount"/>
	</xsl:call-template>
	
	<xsl:if test="not(//reg:displayMsg)">
		<table cellspacing="0" width="100%" class="border">
		<tr><th>
		Application Interface Summary:&#160;
		<xsl:value-of select="$totalMethodCount"/>&#160; total method calls, by <xsl:value-of select="$uniqueIPCount"/>&#160;
		<a><xsl:attribute name="href"><xsl:value-of select="'/dcregistry/statsOverviewServlet?reqType=IPSummary'"/>
		</xsl:attribute><xsl:value-of select="'unique IPs'"/></a>
		</th></tr>
		</table>
	
		<table cellspacing="0" width="100%" class="border">
		<tr><th colspan="2">
		REST Style Method Calls&#160;(<xsl:value-of select="$restCount"/>)
		</th></tr>
		<xsl:apply-templates select="//rdf:Description/dc:type[.='REST']">
			<xsl:sort order="descending" data-type="number" select ="../dcq:extent"/>
		</xsl:apply-templates>
		</table>
		
		<table cellspacing="0" width="100%" class="border">
		<tr><th colspan="2">
		SOAP Style Method Calls&#160;(<xsl:value-of select="$soapCount"/>)
		</th></tr>
		<xsl:apply-templates select="//rdf:Description/dc:type[.='SOAP']">
			<xsl:sort order="descending" data-type="number" select ="../dcq:extent"/>
		</xsl:apply-templates>
		</table>
	</xsl:if>
	
	<xsl:apply-templates select="//reg:displayMsg"/>

	<p />
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]
	<xsl:call-template name="footer" />
    </body>
</html>

</xsl:template>

<xsl:template match="rdf:Description/dc:type[.='REST']">
	<xsl:call-template name="print_methods">
		<xsl:with-param name="methodName" select="substring-after(../@rdf:about, $reg)"/>
		<xsl:with-param name="methodCount" select="../dcq:extent"/>
	</xsl:call-template>
</xsl:template>

<xsl:template match="rdf:Description/dc:type[.='SOAP']">
	<xsl:call-template name="print_methods">
		<xsl:with-param name="methodName" select="substring-after(../@rdf:about, $reg)"/>
		<xsl:with-param name="methodCount" select="../dcq:extent"/>
	</xsl:call-template>
</xsl:template>

<xsl:template name="print_methods">
	<xsl:param name="methodName"/>
	<xsl:param name="methodCount"/>
	
	<tr><td width="5%">
	<xsl:value-of select="$methodCount"/>
	</td><td width="95%">
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistry/statsOverviewServlet?reqType=methodDetail', '&amp;', 'method=', $methodName)"/>
	</xsl:attribute><xsl:value-of select="$methodName"/></a>
	</td></tr>
	
</xsl:template>

<xsl:template match="//reg:displayMsg">
	<b><xsl:value-of select="."/></b>
</xsl:template>

</xsl:stylesheet>

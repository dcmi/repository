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
<xsl:include href="date-fmt2.xsl"/>
<xsl:include href="date-fmt3.xsl"/>
<xsl:include href="admin-statsForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:variable name="strs" select="document('../xml/translations.xml')/strings/lang[@RFC3066=$uiLang]"/>
<xsl:variable name="PI" select="processing-instruction('params')" />
<xsl:variable name="reqType" select="substring-before(substring-after($PI, 'reqType=&#034;'), '&#034;')" />
<xsl:variable name="dir" select="substring-before(substring-after($PI, 'dir=&#034;'), '&#034;')" />
<xsl:variable name="appPfx" select="substring-before(substring-after($PI, 'appPfx=&#034;'), '&#034;')" />
<xsl:variable name="dateType" select="substring-before(substring-after($PI, 'dateType=&#034;'), '&#034;')" />
<xsl:variable name="bYear" select="substring-before(substring-after($PI, 'bYear=&#034;'), '&#034;')" />
<xsl:variable name="bMonth" select="substring-before(substring-after($PI, 'bMonth=&#034;'), '&#034;')" />
<xsl:variable name="bDay" select="substring-before(substring-after($PI, 'bDay=&#034;'), '&#034;')" />
<xsl:variable name="eYear" select="substring-before(substring-after($PI, 'eYear=&#034;'), '&#034;')" />
<xsl:variable name="eMonth" select="substring-before(substring-after($PI, 'eMonth=&#034;'), '&#034;')" />
<xsl:variable name="eDay" select="substring-before(substring-after($PI, 'eDay=&#034;'), '&#034;')" />
<xsl:variable name="uiLang" select="'en-US'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="reg" select="'http://dublincore.org/dcregistrylt/'"/>

<xsl:template match="/">
<html>
    <head>
	<title>The Open Metadata Registry (Lite)</title>
	<link type="text/css" rel="stylesheet" href="/dcregistrylt/css/default.css" />
    </head>	
    <body>
	<xsl:call-template name="banner">		
		<xsl:with-param name="action" select="'administration'" />
	</xsl:call-template>
	    
	<xsl:call-template name="admin-statsForm">
		<xsl:with-param name="dir" select="$dir"/>
		<xsl:with-param name="appPfx" select="$appPfx"/>
		<xsl:with-param name="dateType" select="$dateType"/>
		<xsl:with-param name="bYear" select="$bYear"/>
		<xsl:with-param name="bMonth" select="$bMonth"/>
		<xsl:with-param name="bDay" select="$bDay"/>
		<xsl:with-param name="eYear" select="$eYear"/>
		<xsl:with-param name="eMonth" select="$eMonth"/>
		<xsl:with-param name="eDay" select="$eDay"/>
	</xsl:call-template>
	
	<xsl:if test="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/webstats']">
		<table cellspacing="0" width="61%" class="border">
		<tr><th colspan="4">Web Interface Summary</th></tr>
		<tr><th width="40%">&#160;</th>
		<th width="15%">Count</th>
		<th width="45%">&#160;</th></tr>
		
		<tr><td width="40%">
		Total 
		<a><xsl:attribute name="href"><xsl:value-of select="'/dcregistrylt/adminStatsServlet?reqType=visitsSummary'"/></xsl:attribute>
		visits</a>
		</td><td width="15%">
		<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/webstats']/reg:totalVisits"/>
		</td><td width="45%">
		&#160;
		</td></tr>
		
		<tr><td width="40%">
		Total 
		<a><xsl:attribute name="href"><xsl:value-of select="'/dcregistrylt/adminStatsServlet?reqType=pageSummary'"/></xsl:attribute>
		pages</a> accessed
		</td><td width="15%">
		<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/webstats']/reg:totalPages"/>
		</td><td width="45%">
		&#160;
		</td></tr>
		
		<tr><td width="40%">
		Unique 
		<a><xsl:attribute name="href"><xsl:value-of select="'/dcregistrylt/adminStatsServlet?reqType=IPSummary'"/></xsl:attribute>
		visitors</a>
		</td><td width="15%">
		<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/dcregistrylt/webstats']/reg:UniqueIPs"/>
		</td><td width="45%">
		&#160;
		</td></tr>
		</table>
	</xsl:if>	

	<xsl:apply-templates select="//reg:displayMsg"/>

	<p />
	[<a href="/dcregistrylt/adminServlet">Back to Top Page</a>]
	<xsl:call-template name="footer" />
    </body>
</html>

</xsl:template>

<xsl:template match="//reg:displayMsg">
	<b><xsl:value-of select="."/></b>
</xsl:template>

</xsl:stylesheet>

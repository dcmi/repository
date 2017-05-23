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
<xsl:include href="admin-statsForm.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:param name="reqType" select="''"/>
<xsl:param name="dir" select="''"/>
<xsl:param name="appPfx" select="''"/>
<xsl:param name="soapPfx" select="''"/>
<xsl:param name="restPfx" select="''"/>
<xsl:param name="dateType" select="'1'"/>
<xsl:param name="bYear" select="''"/>
<xsl:param name="bMonth" select="''"/>
<xsl:param name="bDay" select="''"/>
<xsl:param name="eYear" select="''"/>
<xsl:param name="eMonth" select="''"/>
<xsl:param name="eDay" select="''"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
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
	    
	<xsl:call-template name="admin-statsForm">
		<xsl:with-param name="dir" select="$dir"/>
		<xsl:with-param name="appPfx" select="$appPfx"/>
		<xsl:with-param name="soapPfx" select="$soapPfx"/>
		<xsl:with-param name="restPfx" select="$restPfx"/>
		<xsl:with-param name="dateType" select="$dateType"/>
		<xsl:with-param name="bYear" select="$bYear"/>
		<xsl:with-param name="bMonth" select="$bMonth"/>
		<xsl:with-param name="bDay" select="$bDay"/>
		<xsl:with-param name="eYear" select="$eYear"/>
		<xsl:with-param name="eMonth" select="$eMonth"/>
		<xsl:with-param name="eDay" select="$eDay"/>
	</xsl:call-template>
	
	<table cellspacing="0" width="61%" class="border">
	<tr><th colspan="3">
	Method Detail:  
	<xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/registry/applstats']/dc:subject"/> 
	</th></tr>
	<tr><th width="15%">Date</th>
	<th width="15%">Time</th>
	<th width="70%">Parameters</th></tr>
	
	<tr>
	<xsl:apply-templates select="//rdf:Description">
		<xsl:sort select ="@rdf:about"/>
	</xsl:apply-templates>		
	</tr>
	
	<tr><td width="30%" colspan="2">
	<b>Total Method Calls</b>
	</td><td width="70%">
	<b><xsl:value-of select="//rdf:Description[@rdf:about='http://dublincore.org/registry/applstats']/reg:methodCalls"/></b>
	</td></tr>
	
	</table>	

	<xsl:apply-templates select="//reg:displayMsg"/>

	<p />
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]
	<xsl:call-template name="footer" />
    </body>
</html>

</xsl:template>

<xsl:template match="rdf:Description">

	<xsl:variable name="tran" select="substring-after(@rdf:about, $reg)"/>
	<xsl:if test="not($tran='applstats')">
		<xsl:call-template name="print_methods">
			<xsl:with-param name="tDate" select="substring-before($tran, 'T')"/>
			<xsl:with-param name="tTime" select="substring-after($tran, 'T')"/>
			<xsl:with-param name="tParms" select="./dcq:references"/>
		</xsl:call-template>
	</xsl:if>
</xsl:template>

<xsl:template name="print_methods">
	<xsl:param name="tDate"/>
	<xsl:param name="tTime"/>
	<xsl:param name="tParms"/>
	
	<tr><td width="15%">
	<xsl:value-of select="$tDate"/>
	</td><td width="15%">
	<xsl:value-of select="$tTime"/>
	</td><td width="70%">
	<xsl:value-of select="$tParms"/>
	</td></tr>
	
</xsl:template>

<xsl:template match="//reg:displayMsg">
	<b><xsl:value-of select="."/></b>
</xsl:template>

</xsl:stylesheet>

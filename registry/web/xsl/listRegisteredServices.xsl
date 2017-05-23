<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:svcs="http://dublincore.org/dcregistry/services/"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg">

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="footer.xsl"/>

<xsl:variable name="clientList" select="document('remoteServicesClients.xml')"/>

<xsl:param name="modelSize" select="'0'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'administration'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/preferenceServlet'"/>

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>

<xsl:template match="rdf:RDF">
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
	<table cellspacing="0" class="border">
	<tr><th>Registered Remote Services</th></tr>
	
	<xsl:apply-templates select="rdf:Description">
		<xsl:sort select="@rdf:about"/>
	</xsl:apply-templates>
	
	</table>
	
	<br/><br/>
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]
	
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="rdf:Description">

		<xsl:variable name="execLink">
			<xsl:value-of select="concat('/dcregistry/executeRemoteServicesServlet?servicePort=', @rdf:about)"/>
		</xsl:variable>
		
		<tr><td>
			<a href="{$execLink}"><xsl:value-of select="@rdf:about"/></a>
		</td></tr>
				
</xsl:template>

</xsl:stylesheet>

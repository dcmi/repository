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
<xsl:param name="handle" select="''"/>
<xsl:param name="wsinspectionURL" select="''"/>
<xsl:param name="ts" select="''"/>
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
	<xsl:apply-templates select="rdf:Description"/>
	</table>
	
	<br/><br/>
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]&#160;&#160;
	[<a href="/dcregistry/listRegisteredServicesServlet">Back to Previous Page</a>]
	
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

<xsl:template match="rdf:Description">
		<xsl:variable name="port" select="@rdf:about"/>
		<xsl:variable name="name" select="./svcs:serviceName"/>
		<xsl:variable name="wsdl" select="./svcs:wsdl/@rdf:resource"/>
		<xsl:variable name="svcAbstract" select="./svcs:svcAbstract"/>
		<xsl:variable name="status" select="./svcs:status"/>
		<xsl:variable name="svcClient" select="./svcs:svcClient"/>

		<tr><th colspan="2">
		<xsl:value-of select="$port"/>
		</th></tr>
		
		<tr><th width="25%" valign="top">
		Service Name
		</th><td width="75%" valign="top">
		<xsl:value-of select="$name"/>
		</td></tr>
		
		<tr><th width="25%" valign="top">
		WSDL URL
		</th><td width="75%" valign="top">
		<a href="{$wsdl}" terget="_blank"><xsl:value-of select="$wsdl"/></a>
		</td></tr>
		
		<tr><th width="25%" valign="top">
		Service Abstract
		</th><td width="75%" valign="top">
		<xsl:value-of select="$svcAbstract"/>
		</td></tr>
		
		<tr><th width="25%" valign="top">
		Client
		</th><td width="75%" valign="top">
		<xsl:value-of select="$svcClient"/>
		</td></tr>
		
		<xsl:variable name="clientProgram">
			<xsl:value-of select="concat('/dcregistry/',  $svcClient)"/>
		</xsl:variable>
		
		<form name="form1" action="{$clientProgram}" method="post">
		<xsl:for-each select="$clientList/remoteClients/client">
			<xsl:variable name="client" select="./name"/>
			<xsl:variable name="lfn" select="./localFile"/>
			<xsl:variable name="localFile">
				<xsl:value-of select="concat($lfn, '_', $ts, '.rdf')"/>
			</xsl:variable>
			<xsl:choose>
				<xsl:when test="$svcClient=$client">
					<xsl:for-each select="./inParm">
						<xsl:variable name="parmName" select="."/>
						<xsl:variable name="parmSize" select="./@size"/>
						<xsl:variable name="parmLabel" select="./@label"/>
						<tr><th width="25%" valign="top">
						<xsl:value-of select="$parmLabel"/>
						</th><td width="75%" valign="top">
						
						<input size="{$parmSize}" maxlength="{$parmSize}" type="text" name="{$parmName}" value="" />
						</td></tr>
					</xsl:for-each>
					
					<tr><th width="25%" valign="top">
					Local File
					</th><td width="75%" valign="top">
					<xsl:value-of select="$localFile"/>
					</td></tr>
					
					<tr><th width="25%" valign="top">
					Save Results To Local File?
					</th><td width="75%" valign="top">
					
					Yes <input type="radio" name="saveOption" value="Y" />&#160;&#160;
					No <input type="radio" name="saveOption" value="N" checked="checked" />
					
					</td></tr>
					<input type="hidden" name="localFileName" value="{$localFile}" />
				</xsl:when>
				<xsl:otherwise/>
			</xsl:choose>
		</xsl:for-each>	
		
		<tr><th width="25%" valign="top">
		&#160;
		</th><td width="75%" valign="top">
		<input type="submit" value="Call Service" />
		</td></tr>
		
		<input type="hidden" name="port" value="{$port}" />
		</form>
		
</xsl:template>

</xsl:stylesheet>

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
<xsl:param name="wsinspectionURL" select="''"/>
<xsl:param name="msg" select="''"/>
<xsl:param name="location" select="'administration'"/>
<!--
<xsl:param name="handle" select="''"/>
-->

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
	
	<h1>Register Remote Services</h1>	
	<form name="form1" action="/dcregistry/registerRemoteServicesServlet" method="post">
	<table cellspacing="0" class="border">
	
	<tr><th align="left" width="30%">
	WSIL Document URL
	</th><td align="left" width="70%">
	<input size="65" maxlength="128" type="text" name="wsinspectionURL" value="{$wsinspectionURL}" />
	</td></tr>
	
	<tr><th align="left" width="30%">
	&#160;
	</th><td align="left" width="70%">
	<input type="submit" value="Submit" />&#160;&#160;&#160;<input type="reset" value="Reset" />
	</td></tr>
	</table>
	
	<input type="hidden" name= "reqType" value="inspect" />
	</form>
	
	<p/>
	<xsl:variable name="msg2">
		<xsl:value-of select="translate($msg, '-', '')"/>
	</xsl:variable>
	
	<xsl:value-of select="$msg2"/>

	<table cellspacing="0" class="border">
	<xsl:apply-templates select="rdf:Description"/>
	</table>
	
	<br/><br/>
	[<a href="/dcregistry/adminServlet">Back to Top Page</a>]
	
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
		
		<tr><th width="15%" valign="top">
		Service Name
		</th><td width="85%" valign="top">
		<xsl:value-of select="$name"/>
		</td></tr>
		
		<tr><th width="15%" valign="top">
		WSDL
		</th><td width="85%" valign="top">
		<a href="{$wsdl}" terget="_blank"><xsl:value-of select="$wsdl"/></a>
		</td></tr>
		
		<tr><th width="15%" valign="top">
		Abstract
		</th><td width="85%" valign="top">
		<xsl:value-of select="$svcAbstract"/>
		</td></tr>
		
		<tr><th width="15%" valign="top">
		Status
		</th><td width="85%" valign="top">
		<xsl:value-of select="$status"/>
		</td></tr>
		
		<!--
		<xsl:for-each select="./*">
			<tr><td width="15%" valign="top">
			<xsl:value-of select="local-name()"/>:
			</td><td width="85%" valign="top">
			<xsl:value-of select="."/>
			<xsl:value-of select="@rdf:resource"/>
			</td></tr>
		</xsl:for-each>
		-->
		
		<form action="/dcregistry/registerRemoteServicesServlet" method="post">
			<tr><th width="15%" valign="top">
			<span>client</span>
			</th><td width="85%" valign="top">
				<select name="client">
					<xsl:for-each select="$clientList/remoteClients/client">
						<xsl:variable name="client" select="./name"/>
						<xsl:choose>
							<xsl:when test="$svcClient=$client">
								<option value="{$client}" selected="selected"><xsl:value-of select="$client"/></option>					
							</xsl:when>
							<xsl:otherwise>
								<option value="{$client}"><xsl:value-of select="$client"/></option>
							</xsl:otherwise>
						</xsl:choose>	
					</xsl:for-each>
				</select>
				&#160;&#160;&#160;
				<input type="submit" value="Register Service" />
				<input type="hidden" name="wsinspectionURL" value="{$wsinspectionURL}" />
				<!--
				<input type="hidden" name= "handle" value="{$handle}" />
				-->
				<input type="hidden" name= "port" value="{$port}" />
				<input type="hidden" name= "name" value="{$name}" />
				<input type="hidden" name= "wsdl" value="{$wsdl}" />
				<input type="hidden" name= "svcAbstract" value="{$svcAbstract}" />
				<input type="hidden" name= "reqType" value="register" />
			</td></tr>
		</form>
		
</xsl:template>

</xsl:stylesheet>

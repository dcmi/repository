<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:java="java" exclude-result-prefixes="java langInfo" >

<xsl:template name="banner">
	<xsl:param name="location" select="''"/>
	<xsl:param name="action" select="''"/>

<div class="header">
<table width="100%" cellspacing="0" cellpadding="0" bgcolor="#0066CC">
<tr><td width="350">
<a href="/index.shtml"><img src="images/logo_blue.gif" width="150" height="70" alt="Dublin Core Metadata Initiative logo" /></a><br />
<a href="/index.shtml"><img src="images/registry_blue.gif" width="350" height="50" alt="The Dublin Core Metadata Registry" /></a>
</td><td width="100%" style="padding: 10px 10px 0 0; text-align: right;">
<a href="/dcregistry/pageDisplayServlet?page=about.xsl" class="registry">
<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'about')"/></a><br />
<a href="/dcregistry/navigateServlet" class="registry">
<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'navigate')"/> |
<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search')"/></a><br />
<a href="/dcregistry/adminServlet" class="registry">
<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'login')"/></a><br />
<a href="/dcregistry/pageDisplayServlet?page=help_en-US.xsl" class="registry">
<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'help')"/></a><br /><br />
<span class="registry">v 3.3.8</span>
</td></tr>
</table>

<xsl:choose>
	<xsl:when test="$action='search'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td class="crumb">
		<a href="/dcregistry/navigateServlet">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'navigate')"/></a> 
		| <xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search')"/>
		</td><td class="crumb" style="text-align: right;">
		<a href="/dcregistry/preferenceServlet">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'language')"/></a>
		</td></tr></table>
	</xsl:when>
	<xsl:when test="$action='navigate'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td class="crumb">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'navigate')"/>
		| <a href="/dcregistry/queryServlet">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search')"/></a>
		</td><td class="crumb" style="text-align: right;">
		<a href="/dcregistry/preferenceServlet">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'language')"/></a>
		</td></tr></table>
	</xsl:when>
	<xsl:when test="$action='administration'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td class="crumb"><a href="/dcregistry/pageDisplayServlet?page=adminHelp.xsl">Help</a></td></tr>
		</table>
	</xsl:when>
	
	<xsl:otherwise/>
</xsl:choose>

</div>

</xsl:template>

</xsl:stylesheet>

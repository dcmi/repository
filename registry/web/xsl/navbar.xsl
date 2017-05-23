<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:java="java" 
	exclude-result-prefixes="java">


<xsl:template name="navbar">
	<xsl:param name="location"/>
	   
	<table width="100%" cellspacing="1" cellpadding="1" bgcolor="#99CCFF">
	<tr>

	<!--
	<td width="15%" align="center" valign="top" bgcolor="#99CCFF">
	<a class="navbar"><xsl:attribute name="href">
	<xsl:value-of select="concat('/dcregistry/help_', $uiLang, '.html')"/>
	</xsl:attribute>
	<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'help')"/>
	</a></td>
	-->
	
	<xsl:choose>
		<xsl:when test="$location='help'">
			<td width="15%" align="center" valign="top" bgcolor="#FFFFFF">
			<span class="navbar">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'help')"/>			
			</span></td>
		</xsl:when>
		<xsl:otherwise>
			<td width="15%" align="center" valign="top" bgcolor="#99CCFF">
			<a class="navbar" href="/dcregistry/helpServlet">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'help')"/>
			</a></td>	
			
		</xsl:otherwise>
	</xsl:choose>

	<xsl:choose>
		<xsl:when test="$location='preferences'">
			<td width="15%" align="center" valign="top" bgcolor="#FFFFFF">
			<span class="navbar">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'preferences')"/>			
			</span></td>
		</xsl:when>
		<xsl:otherwise>
			<td width="15%" align="center" valign="top" bgcolor="#99CCFF">
			<a class="navbar" href="/dcregistry/preferenceServlet">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'preferences')"/>
			</a></td>	
			
		</xsl:otherwise>
	</xsl:choose>

	<xsl:choose>
		<xsl:when test="$location='search'">
			<td width="15%" align="center" valign="top" bgcolor="#FFFFFF">
			<span class="navbar">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search')"/>
			</span></td>	
		</xsl:when>
		<xsl:otherwise>
			<td width="15%" align="center" valign="top" bgcolor="#99CCFF">
			<a class="navbar" href="/dcregistry/queryServlet">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search')"/>
			</a></td>			
		</xsl:otherwise>
	</xsl:choose>

	<xsl:choose>
		<xsl:when test="$location='administration'">
			<td width="15%" align="center" valign="top" bgcolor="#FFFFFF">
			<span class="navbar">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'login')"/>
			</span></td>	
		</xsl:when>
		<xsl:otherwise>
			<td width="15%" align="center" valign="top" bgcolor="#99CCFF">
			<a class="navbar" href="/dcregistry/adminServlet">
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'login')"/>
			</a></td>			
		</xsl:otherwise>
	</xsl:choose>

	</tr>

	</table>
	
</xsl:template>

</xsl:stylesheet>

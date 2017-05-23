<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
   xmlns:java="java" >


<xsl:template name="intro">
	<xsl:param name="uiLang"/>

	<p />The <a href='http://purl.org/dc/'>Dublin Core Metadata Initiative's</a> Open Metadata Registry
	<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'intro1')"/>
	<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'intro2')"/>
	<p />

	<b>Please note:</b> This project is currently in the prototype stage and is subject to change 
	without notice.

	
</xsl:template>

</xsl:stylesheet>

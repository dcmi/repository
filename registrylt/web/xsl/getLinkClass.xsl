<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
<xsl:template name="getLinkClass">
	<xsl:param name="HTMLLink"/>
	
	<xsl:choose>
		<xsl:when test="contains($HTMLLink, '/dcregistrylt/')">
			<xsl:value-of select="'local'"/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="'remote'"/>
		</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

</xsl:stylesheet>

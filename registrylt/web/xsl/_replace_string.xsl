<?xml version='1.0' encoding='UTF-8'?>

<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="_replace_string">
	<xsl:param name="string" select="''"/>
	<xsl:param name="find" select="''"/>
	<xsl:param name="replace" select="''"/>

	<xsl:choose>
		<xsl:when test="contains($string,$find)">
			<xsl:value-of select="concat(substring-before($string,$find),$replace)"/>
			<xsl:call-template name="_replace_string">
				<xsl:with-param name="string" select="substring-after($string,$find)"/>
				<xsl:with-param name="find" select="$find"/>
				<xsl:with-param name="replace" select="$replace"/>
			</xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$string"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>

</xsl:stylesheet>

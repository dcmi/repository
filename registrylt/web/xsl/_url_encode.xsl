<?xml version='1.0' encoding='UTF-8'?>

<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:include href="_replace_string.xsl"/>
<xsl:variable name="url-enc_search" select="document('_lookup.xml')/lookup/url-encoding/search"/>

<xsl:template name="_url_encode">
	<xsl:param name="url" select="''"/>
	<xsl:param name="search_element_nr" select="'1'"/>
	
	<xsl:variable name="url-enc_search" select="document('_lookup.xml')/lookup/url-encoding/search"/>

	<xsl:variable name="encoded_url">
		<xsl:call-template name="_replace_string">
			<xsl:with-param name="string" select="$url" />
			<xsl:with-param name="find" select="$url-enc_search[$search_element_nr]/@find"/>
			<xsl:with-param name="replace" select="$url-enc_search[$search_element_nr]/@replace"/>
		</xsl:call-template>
	</xsl:variable>

	<xsl:choose>
		<xsl:when test="$search_element_nr &lt;count($url-enc_search)">
			<xsl:call-template name="_url_encode">
				<xsl:with-param name="url" select="$encoded_url" />
				<xsl:with-param name="search_element_nr" select="$search_element_nr + 1" />
			</xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$encoded_url"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>

</xsl:stylesheet>

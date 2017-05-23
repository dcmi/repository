<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:java="java" 
	exclude-result-prefixes="java">

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:template name="getHREFLink">
	<xsl:param name="item"/>
	
	<xsl:variable name="encoded_item">
		<xsl:value-of select="java:net.URLEncoder.encode($item,'UTF8')" />
	</xsl:variable>
	   
	<xsl:choose>
		<xsl:when test="contains($item, $dc)">
			<xsl:choose>
				<xsl:when test="$item=$dc">
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>					
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:when test="contains($item, $dcq)">
			<xsl:choose>
				<xsl:when test="$item=$dcq">
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:when test="contains($item, $dctype)">
			<xsl:choose>
				<xsl:when test="$item=$dctype">
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>	
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistry/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$item"/>
		</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

</xsl:stylesheet>

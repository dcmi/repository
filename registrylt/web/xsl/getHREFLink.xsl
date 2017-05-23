<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template name="getHREFLink">
	<xsl:param name="item"/>
	
	<xsl:variable name="encoded_item">
		<xsl:call-template name="_url_encode">
			<xsl:with-param name="url" select="$item"/>
		</xsl:call-template>
	</xsl:variable>
	   
	<xsl:choose>
		<xsl:when test="contains($item, $dc)">
			<xsl:choose>
				<xsl:when test="$item=$dc">
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>					
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:when test="contains($item, $dcq)">
			<xsl:choose>
				<xsl:when test="$item=$dcq">
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:when test="contains($item, $dctype)">
			<xsl:choose>
				<xsl:when test="$item=$dctype">
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>	
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:when test="contains($item, 'http://www.sub.uni-goettingen.de/ssgfi/rdf/ssgfi#')">
			<xsl:choose>
				<xsl:when test="$item='http://www.sub.uni-goettingen.de/ssgfi/rdf/ssgfi#'">
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=sdetail', '&amp;', 'item=', $encoded_item)"/>	
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat('/dcregistrylt/detailServlet?reqType=detail', '&amp;', 'item=', $encoded_item)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$item"/>
		</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

</xsl:stylesheet>

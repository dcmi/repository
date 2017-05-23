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

<xsl:template name="getShortName">
	<xsl:param name="item"/>
	   
	<xsl:choose>
		<xsl:when test="contains($item, $dc)">
			<xsl:choose>
				<xsl:when test="$item=$dc">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, $dc)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>

		<xsl:when test="contains($item, $dcq)">
			<xsl:choose>
				<xsl:when test="$item=$dcq">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, $dcq)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>

		<xsl:when test="contains($item, $dctype)">
			<xsl:choose>
				<xsl:when test="$item=$dctype">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, $dctype)"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>

		<!-- start of dublin specific definitions -->
		<xsl:when test="contains($item, 'http://www.w3.org/1999/02/22-rdf-syntax-ns#')">
			<xsl:choose>
				<xsl:when test="$item='http://www.w3.org/1999/02/22-rdf-syntax-ns#'">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, 'http://www.w3.org/1999/02/22-rdf-syntax-ns#')"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>

		<xsl:when test="contains($item, 'http://www.w3.org/2000/01/rdf-schema#')">
			<xsl:choose>
				<xsl:when test="$item='http://www.w3.org/2000/01/rdf-schema#'">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, 'http://www.w3.org/2000/01/rdf-schema#')"/>				
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		
		<xsl:when test="contains($item, 'http://dublincore.org/usage/documents/principles/#')">
			<xsl:choose>
				<xsl:when test="$item='http://dublincore.org/usage/documents/principles/#'">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, 'http://dublincore.org/usage/documents/principles/#')"/>			
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>
		
		<xsl:when test="contains($item, 'http://dublincore.org/usage/terms/history/#')">
			<xsl:choose>
				<xsl:when test="$item='http://dublincore.org/usage/terms/history/#'">
					<xsl:value-of select="$item"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring-after($item, 'http://dublincore.org/usage/terms/history/#')"/>			
				</xsl:otherwise>
			</xsl:choose>
		</xsl:when>		
		<!-- end of dublin specific definitions -->
		
		<xsl:otherwise>
			<xsl:value-of select="$item"/>
		</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

</xsl:stylesheet>

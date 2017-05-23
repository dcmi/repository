<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:dcds="http://purl.org/dc/xmlns/2008/09/01/dc-ds-xml/"
        xmlns:dcam="http://purl.org/dc/dcam/"
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	version="1.0">

<!--
      dcds2rdfxml XSLT 1.0 Transform

      Created 2008-09-01

      Created by 

      Pete Johnston (pete.johnston@eduserv.org.uk)
      
-->

	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

	<xsl:template match="dcds:descriptionSet">
		<xsl:element name="rdf:RDF">
			<xsl:apply-templates select="dcds:description"/>
		</xsl:element>
	</xsl:template>

        <xsl:template match="dcds:description">
		<xsl:element name="rdf:Description">
			<xsl:apply-templates select="@dcds:resourceURI" />
			<xsl:apply-templates select="dcds:statement"/>
		</xsl:element>
        </xsl:template>

        <xsl:template match="dcds:description[@dcds:resourceId]">
		<xsl:element name="rdf:Description">
			<xsl:apply-templates select="@dcds:resourceId" />
			<xsl:variable name="resId" select="@dcds:resourceId" />
			<xsl:for-each select="/dcds:descriptionSet/dcds:description/dcds:statement[@dcds:valueRef=$resId]">
				<xsl:apply-templates select="@dcds:vesURI" />
				<xsl:apply-templates select="*" />
			</xsl:for-each>
			<xsl:apply-templates select="dcds:statement"/>
		</xsl:element>
        </xsl:template>

	<xsl:template match="@dcds:resourceURI">
		<xsl:attribute name="rdf:about">
			<xsl:value-of select="." />
		</xsl:attribute>
	</xsl:template>

	<xsl:template match="@dcds:resourceId">
		<xsl:attribute name="rdf:nodeID">
			<xsl:value-of select="." />
		</xsl:attribute>
	</xsl:template>

        <xsl:template match="dcds:statement[@dcds:propertyURI]">
        	<xsl:choose>
        	<xsl:when test="@dcds:propertyURI='http://purl.org/dc/elements/1.1/type' or @dcds:propertyURI='http://purl.org/dc/terms/type'">
			<xsl:element name="rdf:type">
				<xsl:call-template name="processNonLiteralValueSurrogate" />
			</xsl:element>
        	</xsl:when>
        	<xsl:otherwise>
	        	<xsl:variable name="localname">
				<xsl:call-template name="makeLocalNameFromURI">
					<xsl:with-param name="uri" select="@dcds:propertyURI" />
				</xsl:call-template>
		        </xsl:variable>
	        	<xsl:variable name="namespaceuri">
				<xsl:call-template name="makeNamespaceFromURI">
					<xsl:with-param name="uri" select="@dcds:propertyURI" />
				</xsl:call-template>
		        </xsl:variable>
			<xsl:element name="{$localname}" namespace="{$namespaceuri}">
				<xsl:call-template name="processValueSurrogate" />
			</xsl:element>
		</xsl:otherwise>
		</xsl:choose>
        </xsl:template>

	<xsl:template match="@dcds:valueRef">
		<xsl:attribute name="rdf:nodeID">
			<xsl:value-of select="." />
		</xsl:attribute>
	</xsl:template>

	<xsl:template match="@dcds:valueURI">
		<xsl:attribute name="rdf:about">
			<xsl:value-of select="." />
		</xsl:attribute>
	</xsl:template>

	<xsl:template match="@dcds:vesURI">
		<xsl:element name="dcam:memberOf">
			<xsl:attribute name="rdf:resource">
				<xsl:value-of select="." />
			</xsl:attribute>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="dcds:literalValueString">
		<xsl:for-each select="@xml:lang">
			<xsl:copy/>
		</xsl:for-each>
		<xsl:apply-templates select="@dcds:sesURI" />
		<xsl:apply-templates select="@dcds:sesPrefName" />
		<xsl:copy-of select="text()|*"/>
	</xsl:template>

	<xsl:template match="dcds:valueString">
		<xsl:element name="rdf:value">
			<xsl:for-each select="@xml:lang">
				<xsl:copy/>
			</xsl:for-each>
			<xsl:apply-templates select="@dcds:sesURI" />
			<xsl:apply-templates select="@dcds:sesPrefName" />
			<xsl:copy-of select="text()|*"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="@dcds:sesURI">
		<xsl:choose>
		<xsl:when test=".='http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral'">
			<xsl:attribute name="rdf:parseType">Literal</xsl:attribute>
		</xsl:when>
		<xsl:otherwise>
			<xsl:attribute name="rdf:datatype">
				<xsl:value-of select="." />
			</xsl:attribute>
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="processValueSurrogate">
	        <xsl:choose>
	        <xsl:when test="dcds:literalValueString">
			<xsl:call-template name="processLiteralValueSurrogate" />
		</xsl:when>
	        <xsl:when test="@dcds:valueRef">
	          	<xsl:apply-templates select="@dcds:valueRef" />
	        </xsl:when>
	        <xsl:otherwise>
			<xsl:call-template name="processNonLiteralValueSurrogate" />
	        </xsl:otherwise>
	        </xsl:choose>
	</xsl:template>

	<xsl:template name="processLiteralValueSurrogate">
		<xsl:apply-templates select="*" />
	</xsl:template>

	<xsl:template name="processNonLiteralValueSurrogate">
		<xsl:element name="rdf:Description">
			<xsl:apply-templates select="@dcds:valueURI" />
			<xsl:apply-templates select="@dcds:vesURI" />
			<xsl:apply-templates select="*" />
		</xsl:element>
	</xsl:template>

	<xsl:template name="makeLocalNameFromURI">
		<xsl:param name="uri" />
		<xsl:choose>
		<xsl:when test="contains($uri, '#')">
			<xsl:value-of select="substring-after($uri, '#')" />
		</xsl:when>
		<xsl:otherwise>
			<xsl:call-template name="substring-after-last">
				<xsl:with-param name="string" select="$uri"/>
				<xsl:with-param name="character" select="'/'"/>
			</xsl:call-template>
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="makeNamespaceFromURI">
		<xsl:param name="uri" />
		<xsl:choose>
		<xsl:when test="contains($uri, '#')">
			<xsl:value-of select="substring-before($uri, '#')" />
			<xsl:value-of select="'#'" />
		</xsl:when>
		<xsl:otherwise>
			<xsl:call-template name="substring-before-last">
				<xsl:with-param name="string" select="$uri"/>
				<xsl:with-param name="character" select="'/'"/>
			</xsl:call-template>
			<xsl:value-of select="'/'" />
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="substring-before-last">
		<xsl:param name="string"/>
		<xsl:param name="character"/>
		<xsl:choose>
			<xsl:when test="contains($string, $character)">
				<xsl:value-of select="substring-before($string, $character)"/>
			        <xsl:if test="contains( substring-after($string, $character), $character)">
					<xsl:value-of select="$character"/>
					<xsl:call-template name="substring-before-last">
						<xsl:with-param name="string" select="substring-after($string, $character)" />
     						<xsl:with-param name="character" select="$character" />
          				</xsl:call-template>
        			</xsl:if>
			</xsl:when>
      			<xsl:otherwise>
      				<xsl:value-of select="$string" />
      			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="substring-after-last">
		<xsl:param name="string"/>
		<xsl:param name="character"/>
		<xsl:choose>
			<xsl:when test="contains($string, $character)">
				<xsl:call-template name="substring-after-last">
					<xsl:with-param name="string" select="substring-after($string, $character)" />
					<xsl:with-param name="character" select="$character" />
       				</xsl:call-template>
			</xsl:when>
      			<xsl:otherwise>
      				<xsl:value-of select="$string" />
      			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

</xsl:stylesheet>
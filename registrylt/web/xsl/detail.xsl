<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:reg="http://dublincore.org/dcregistrylt/">

<xsl:output method="html" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" />

<xsl:include href="banner.xsl"/>
<xsl:include href="searchForm.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="dcLabels.xsl"/>
<xsl:include href="getShortName.xsl"/>
<xsl:include href="getHREFLink.xsl"/>
<xsl:include href="getLinkClass.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:variable name="strs" select="document('../xml/translations.xml')/strings/lang[@RFC3066=$uiLang]"/>
<xsl:variable name="PI" select="processing-instruction('params')" />
<xsl:variable name="reqType" select="substring-before(substring-after($PI, 'reqType=&#034;'), '&#034;')" />
<xsl:variable name="action" select="substring-before(substring-after($PI, 'action=&#034;'), '&#034;')" />
<xsl:variable name="uiLang" select="substring-before(substring-after($PI, 'uiLang=&#034;'), '&#034;')" />
<xsl:variable name="detailItem" select="substring-before(substring-after($PI, 'detailItem=&#034;'), '&#034;')" />
<xsl:variable name="display_canonical_link" select="substring-before(substring-after($PI, 'display_canonical_link=&#034;'), '&#034;')" />

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:variable name="examples" select="//reg:example" />
<xsl:variable name="schemes" select="//reg:hasScheme" />
<xsl:variable name="refinements" select="//reg:superItem" />
<xsl:variable name="cterms" select="//reg:controlledTerm" />

<xsl:template match="rdf:RDF">

	<html>
	<head>
		<title>The Open Metadata Registry</title>
		<link type="text/css" rel="stylesheet" href="/dcregistrylt/css/default.css" />
	</head>
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="action" select="$action" />
		<xsl:with-param name="uiLang" select="$uiLang" />
	</xsl:call-template>

	<xsl:call-template name="searchForm">
		<xsl:with-param name="action" select="$action" />
		<xsl:with-param name="reqType" select="$reqType" />
		<xsl:with-param name="uiLang" select="$uiLang" />
	</xsl:call-template>
		
	<xsl:apply-templates select="rdf:Description"/>

	<p />
	<xsl:call-template name="footer" />

	</body>
	</html>
</xsl:template>

<xsl:template match="rdf:Description">

	<xsl:variable name="encoded_about">
		<xsl:call-template name="_url_encode">
			<xsl:with-param name="url" select="@rdf:about"/>
		</xsl:call-template>
	</xsl:variable>
	
	<table cellspacing="0" width="100%" class="noborder">
	<tr><td width="90%" style="padding: 0;">
	<table cellspacing="0" width="100%" class="border">
	<tr><th colspan="2">
	<a><xsl:attribute name="href"><xsl:value-of select="@rdf:about"/></xsl:attribute>
	<xsl:value-of select="@rdf:about"/></a>
	</th></tr>
	
	<xsl:for-each select="descendant-or-self::node()">

		<xsl:apply-templates select="rdfs:label"/>
		<xsl:apply-templates select="rdfs:comment"/>
		<xsl:apply-templates select="dc:title"/>
		<xsl:apply-templates select="dc:description"/>
		<xsl:apply-templates select="rdfs:isDefinedBy"/>

		<xsl:apply-templates select="rdf:type"/>
		<xsl:apply-templates select="rdf:value"/>
		
		<xsl:apply-templates select="rdfs:range"/>
		<xsl:apply-templates select="rdfs:domain"/>
		<xsl:apply-templates select="rdfs:seeAlso"/>
		
		<xsl:apply-templates select="dc:creator"/>
		<xsl:apply-templates select="dc:contributor"/>	
		<xsl:apply-templates select="dc:publisher"/>
		<xsl:apply-templates select="dc:date"/>	
		<xsl:apply-templates select="dc:language"/>
		<xsl:apply-templates select="dc:relation"/>
		<xsl:apply-templates select="dc:subject"/>
		<xsl:apply-templates select="dc:type"/>
		<xsl:apply-templates select="dc:format"/>
		<xsl:apply-templates select="dc:identifier"/>
		<xsl:apply-templates select="dc:source"/>
		<xsl:apply-templates select="dc:coverage"/>
		<xsl:apply-templates select="dc:rights"/>

		<xsl:apply-templates select="dcq:abstract"/>
		<xsl:apply-templates select="dcq:alternative"/>
		<xsl:apply-templates select="dcq:available"/>
		<xsl:apply-templates select="dcq:conformsTo"/>
		<xsl:apply-templates select="dcq:created"/>
		<xsl:apply-templates select="dcq:extent"/>
		<xsl:apply-templates select="dcq:hasFormat"/>
		<xsl:apply-templates select="dcq:hasPart"/>
		<xsl:apply-templates select="dcq:hasVersion"/>
		<xsl:apply-templates select="dcq:isFormatOf"/>
		<xsl:apply-templates select="dcq:isPartOf"/>
		<xsl:apply-templates select="dcq:isReferencedBy"/>
		<xsl:apply-templates select="dcq:isReplacedBy"/>
		<xsl:apply-templates select="dcq:isRequiredBy"/>
		<xsl:apply-templates select="dcq:issued"/>
		<xsl:apply-templates select="dcq:isVersionOf"/>
		<xsl:apply-templates select="dcq:mediator"/>
		<xsl:apply-templates select="dcq:medium"/>
		<xsl:apply-templates select="dcq:modified"/>
		<xsl:apply-templates select="dcq:references"/>
		<xsl:apply-templates select="dcq:replaces"/>
		<xsl:apply-templates select="dcq:requires"/>
		<xsl:apply-templates select="dcq:spatial"/>
		<xsl:apply-templates select="dcq:tableOfContents"/>
		<xsl:apply-templates select="dcq:temporal"/>
		<xsl:apply-templates select="dcq:valid"/>

		<xsl:apply-templates select="rdfs:subPropertyOf"/>
		<xsl:apply-templates select="rdfs:subClassOf"/>
		<xsl:apply-templates select="reg:superPropertyOf"/>
		<xsl:apply-templates select="reg:superClassOf"/>
		<xsl:apply-templates select="reg:includes"/>                 
                <xsl:apply-templates select="reg:hasUsage"/>
		<xsl:apply-templates select="reg:relatedSchemes"/>
		<xsl:apply-templates select="reg:controlledTerms"/>
		<xsl:apply-templates select="reg:examples"/>
		
	</xsl:for-each>
	
	</table>
	</td>
	
	<td width="10%" style="padding: 0 0 0 5px;">
	<table cellspacing="0" width="100%" class="border">
	<tr><th><xsl:value-of select="$strs/str[@name='viewas']"/>:</th></tr>

	<xsl:if test="$display_canonical_link='Y'">
		<tr><td nowrap="nowrap">
		<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/canonicalServlet?item=', $encoded_about)"/></xsl:attribute>
		<xsl:value-of select="$strs/str[@name='canonical']"/></a>&#160;
		</td></tr>
	</xsl:if>
	
	<tr><td nowrap="nowrap">
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/rdfViewServlet?item=', $encoded_about, '&amp;', 'lang=', $uiLang, '&amp;', 'viewType=RDF/XML')"/></xsl:attribute>
	RDF/XML</a>
	</td></tr>
	
	<tr><td nowrap="nowrap">
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/rdfViewServlet?item=', $encoded_about, '&amp;', 'lang=', $uiLang, '&amp;', 'viewType=N-TRIPLE')"/></xsl:attribute>
	N-TRIPLE</a>
	</td></tr>
	
	<tr><td nowrap="nowrap">
	<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/rdfViewServlet?item=', $encoded_about, '&amp;', 'lang=', $uiLang, '&amp;', 'viewType=N3')"/></xsl:attribute>
	N3</a>
	</td></tr>

	</table>
	</td></tr>
	</table>
	
</xsl:template>


<xsl:template name="print_labels">
	<xsl:param name="label"/>
	<xsl:param name="uri"/>
	<xsl:param name="value"/>
	<xsl:param name="xitem"/>

	<tr><td width="15%" valign="top">
	<xsl:choose>
		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/superPropertyOf'">	
			<xsl:value-of select="$label"/>
		</xsl:when>
		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/superClassOf'">	
			<xsl:value-of select="$label"/>
		</xsl:when>
		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/includes'">
			<xsl:value-of select="$label"/>
		</xsl:when>

                 <xsl:when test="$uri='http://dublincore.org/dcregistrylt/hasUsage'">
                        <xsl:value-of select="$label"/>
                </xsl:when>
		
		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/relatedSchemes'">
                        <xsl:value-of select="$label"/>
                </xsl:when>
		
		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/controlledTerms'">
                        <xsl:value-of select="$label"/>
                </xsl:when>

		<xsl:when test="$uri='http://dublincore.org/dcregistrylt/examples'">
                        <xsl:value-of select="$label"/>
                </xsl:when>

		<xsl:otherwise>
			<a class="remote">
			<xsl:attribute name="href"><xsl:value-of select="$uri"/></xsl:attribute>
			<xsl:value-of select="$label"/></a>
		</xsl:otherwise>
	</xsl:choose>

	</td><td width="85%">
	<xsl:if test="$value!=''">
		<xsl:choose>
			<xsl:when test="$uri='http://dublincore.org/dcregistrylt/relatedSchemes'">
				<xsl:for-each select="$schemes">
					<xsl:sort select ="@rdf:resource"/>				
					<xsl:variable name="shortName">
						<xsl:call-template name="getShortName">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<xsl:variable name="HTMLLink">
						<xsl:call-template name="getHREFLink">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<a><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
					<xsl:value-of select="$shortName"/></a>&#160;&#160;
				</xsl:for-each>
			 </xsl:when>
			 
			 <xsl:when test="$uri='http://dublincore.org/dcregistrylt/controlledTerms'">
				<xsl:for-each select="$cterms">
					<xsl:sort select ="@rdf:resource"/>				
					<xsl:variable name="shortName">
						<xsl:call-template name="getShortName">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<xsl:variable name="HTMLLink">
						<xsl:call-template name="getHREFLink">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<a><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
					<xsl:value-of select="$shortName"/></a>&#160;&#160;
				</xsl:for-each>
			 </xsl:when>
			 
			 <xsl:when test="$uri='http://dublincore.org/dcregistrylt/superPropertyOf'">
				<xsl:for-each select="$refinements">
					<xsl:sort select ="@rdf:resource"/>
					<xsl:variable name="shortName">
						<xsl:call-template name="getShortName">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<xsl:variable name="HTMLLink">
						<xsl:call-template name="getHREFLink">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<a><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
					<xsl:value-of select="$shortName"/></a>&#160;&#160;
				</xsl:for-each>
			 </xsl:when>
			 
			 <xsl:when test="$uri='http://dublincore.org/dcregistrylt/superClassOf'">
				<xsl:for-each select="$refinements">
					<xsl:sort select ="."/>				
					<xsl:variable name="shortName">
						<xsl:call-template name="getShortName">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<xsl:variable name="HTMLLink">
						<xsl:call-template name="getHREFLink">
							<xsl:with-param name="item" select="@rdf:resource"/>
						</xsl:call-template>
					</xsl:variable>
					
					<a><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
					<xsl:value-of select="$shortName"/></a>&#160;&#160;
				</xsl:for-each>
			 </xsl:when>
			 
			<xsl:when test="$uri='http://dublincore.org/dcregistrylt/examples'">
				<xsl:variable name="encoded_item">
					<xsl:call-template name="_url_encode">
						<xsl:with-param name="url" select="$xitem"/>
					</xsl:call-template>
				</xsl:variable>
				
				<xsl:for-each select="$examples">
					<xsl:sort select ="."/>
					<xsl:variable name="anExample">
						<xsl:value-of select="." />
					</xsl:variable>
				
					<a>
					<xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/exampleServlet?item=', $anExample)"/></xsl:attribute>
					<xsl:value-of select="$anExample" />
					</a>
					&#160;&#160;
				</xsl:for-each>
				
			 </xsl:when>
			 <xsl:otherwise>
				<xsl:value-of select="$value"/>
				
				<xsl:call-template name="print_provenance_link">
					<xsl:with-param name="item" select="$xitem" />
					<xsl:with-param name="node" select="$uri" />
					<xsl:with-param name="xlang" select="@xml:lang" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:if>

	<xsl:if test="@rdf:resource">
		<xsl:call-template name="print-local-link">
			<xsl:with-param name="item" select="@rdf:resource"/>
			<xsl:with-param name="uri" select="$uri" />
		</xsl:call-template>
	</xsl:if>

	</td></tr>
	
</xsl:template>


<xsl:template name="print-local-link">
	<xsl:param name="item"/>
	<xsl:param name="uri"/>
	
	<xsl:variable name="shortName">
		<xsl:call-template name="getShortName">
			<xsl:with-param name="item" select="$item"/>
		</xsl:call-template>
	</xsl:variable>
	
	<xsl:variable name="HTMLLink">
		<xsl:call-template name="getHREFLink">
			<xsl:with-param name="item" select="$item"/>
		</xsl:call-template>
	</xsl:variable>
	
	<xsl:variable name="linkClass">
		<xsl:call-template name="getLinkClass">
			<xsl:with-param name="HTMLLink" select="$HTMLLink"/>
		</xsl:call-template>
	</xsl:variable>
	
	 <xsl:choose>
		<xsl:when test="$linkClass='remote'">
			<a class="remote"><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
			<xsl:value-of select="$shortName"/></a>
		</xsl:when>
		<xsl:otherwise>
			<a><xsl:attribute name="href"><xsl:value-of select="$HTMLLink"/></xsl:attribute>
			<xsl:value-of select="$shortName"/></a>			
		</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

<xsl:template name="print_provenance_link">
	<xsl:param name="item"/>
	<xsl:param name="node"/>
	<xsl:param name="xlang"/>
	
	<xsl:choose>
		<xsl:when test="$xlang">
			<xsl:variable name="xitem">
			<xsl:call-template name="_url_encode">
				<xsl:with-param name="url" select="$item"/>
			</xsl:call-template>
			</xsl:variable>
		
			<xsl:variable name="afterHash" select="substring-after($node, '#')" />
		
			<xsl:variable name="xnode">
				<xsl:call-template name="_url_encode">
					<xsl:with-param name="url" select="$node"/>
				</xsl:call-template>
			</xsl:variable>
		
			[
			<a><xsl:attribute name="href"><xsl:value-of select="concat('/dcregistrylt/provenanceServlet?reqType=xinfo', '&amp;', 'item=', $xitem, '&amp;', 'node=', $xnode, '&amp;', 'xlang=', $xlang)"/></xsl:attribute>
			<xsl:value-of select="$xlang"/>
			</a>
			]
						
		</xsl:when>				
		<xsl:otherwise/>
	</xsl:choose>
	
</xsl:template>

</xsl:stylesheet>



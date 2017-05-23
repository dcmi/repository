<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:html="http://www.w3.org/1999/xhtml"
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	version="1.0">

<!--
      dc-html2rdfxml XSLT 1.0 Transform: 
      GRDDL Profile Transformation for http://dublincore.org/documents/2008/08/04/dc-html/ meta data profile

      Created 2008-08-04

      Created by 

      Pete Johnston (pete.johnston@eduserv.org.uk)

      Borrows from 
      	Ian Davis http://research.talis.com/2005/erdf/extract-rdf.xsl and 
      	Dan Connolly http://www.w3.org/2000/06/dc-extract/dc-extract.xsl
      
-->

	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

	<xsl:param name="baseUri" />

	<xsl:variable name="authBaseUri">
		<xsl:choose>
			<xsl:when test="/html:html/html:head/html:base[@href]">
				<xsl:value-of select="/html:html/html:head/html:base[@href][1]/@href" />
			</xsl:when>
			<xsl:otherwise>
		      		<xsl:value-of select="$baseUri" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>


	<xsl:variable name="baseUriNoFragment">
		<xsl:call-template name="substring-before-last">
			<xsl:with-param name="string" select="$authBaseUri" />
			<xsl:with-param name="character" select="'#'" />
		</xsl:call-template>
	</xsl:variable>

	<xsl:variable name="uc">ABCDEFGHIJKLMNOPQRSTUVWXYZ</xsl:variable>
	<xsl:variable name="lc">abcdefghijklmnopqrstuvwxyz</xsl:variable>

	<xsl:template match="html:html">
		<xsl:element name="rdf:RDF">
			<xsl:if test="$baseUriNoFragment">
				<xsl:attribute name="xml:base"><xsl:value-of select="$baseUriNoFragment" /></xsl:attribute>
			</xsl:if>
			<xsl:element name="rdf:Description">
				<xsl:attribute name="rdf:about"><xsl:value-of select="$baseUriNoFragment" /></xsl:attribute>
				<xsl:apply-templates select="html:head/html:meta" />
				<xsl:apply-templates select="html:head/html:link[@rel]" />
			</xsl:element>
		</xsl:element>
	</xsl:template>

	<xsl:template match="html:meta">
		<xsl:call-template name="make-literalPropertyElt" >
			<xsl:with-param name="propPN" select="@name" />
			<xsl:with-param name="datatypePN" select="@scheme" />
			<xsl:with-param name="lang" select="@xml:lang" />
			<xsl:with-param name="litObj" select="@content" />
		</xsl:call-template>
	</xsl:template>

	<xsl:template match="html:link[@rel]">
		<xsl:if test="not(starts-with(@rel, 'schema.'))">
			<xsl:call-template name="make-resourcePropertyElts"  >
				<xsl:with-param name="propPN" select="@rel" />
				<xsl:with-param name="uriObj" select="@href" />
				<xsl:with-param name="lang" select="@xml:lang" />
				<xsl:with-param name="valueString" select="@title" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>

	<xsl:template name="make-literalPropertyElt">
		<xsl:param name="propPN" />
		<xsl:param name="datatypePN" />
		<xsl:param name="lang" />
		<xsl:param name="litObj" />

        	<xsl:variable name="localname">
        		<xsl:value-of select="substring-after($propPN, '.')" />
	        </xsl:variable>
		<xsl:variable name="prefix" select="substring-before($propPN, '.')"/>
        	<xsl:variable name="namespaceuri">
        		<xsl:call-template name="makeNamespaceURIfromPrefix">
				<xsl:with-param name="prefix" select="$prefix" />
			</xsl:call-template>
	        </xsl:variable>
	        
	        <xsl:if test="normalize-space($namespaceuri)">
			<xsl:element name="{$localname}" namespace="{$namespaceuri}">
				<xsl:choose>
				<xsl:when test="$datatypePN">
					<xsl:variable name="datatypeuri">
						<xsl:call-template name="makeURIfromPrefName">
							<xsl:with-param name="prefName" select="$datatypePN" />
						</xsl:call-template>
					</xsl:variable>
					<xsl:if test="normalize-space($datatypeuri)">
						<xsl:attribute name="rdf:datatype">
							<xsl:call-template name="makeURIfromPrefName">
								<xsl:with-param name="prefName" select="$datatypePN" />
							</xsl:call-template>
						</xsl:attribute>
					</xsl:if>
				</xsl:when>
				<xsl:when test="$lang">
					<xsl:attribute name="xml:lang"><xsl:value-of select="$lang" /></xsl:attribute>
				</xsl:when>
				<xsl:otherwise />
				</xsl:choose>
				<xsl:value-of select="$litObj" />
			</xsl:element>
		</xsl:if>
	</xsl:template>

	<xsl:template name="make-resourcePropertyElts">
		<xsl:param name="propPN" />
		<xsl:param name="uriObj" />
		<xsl:param name="lang" />
		<xsl:param name="valueString" />

		<xsl:choose>
		<xsl:when test="contains($propPN, ' ')">
			<xsl:call-template name="make-resourcePropertyElt">
				<xsl:with-param name="propPN" select="substring-before($propPN, ' ')" />
				<xsl:with-param name="uriObj" select="$uriObj" />
				<xsl:with-param name="lang" select="$lang" />
				<xsl:with-param name="valueString" select="$valueString" />
			</xsl:call-template>
			<xsl:call-template name="make-resourcePropertyElts">
				<xsl:with-param name="propPN" select="substring-after($propPN, ' ')" />
				<xsl:with-param name="uriObj" select="$uriObj" />
				<xsl:with-param name="lang" select="$lang" />
				<xsl:with-param name="valueString" select="$valueString" />
			</xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
			<xsl:call-template name="make-resourcePropertyElt">
				<xsl:with-param name="propPN" select="$propPN" />
				<xsl:with-param name="uriObj" select="$uriObj" />
				<xsl:with-param name="lang" select="$lang" />
				<xsl:with-param name="valueString" select="$valueString" />
			</xsl:call-template>
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="make-resourcePropertyElt">
		<xsl:param name="propPN" />
		<xsl:param name="uriObj" />
		<xsl:param name="lang" />
		<xsl:param name="valueString" />

        	<xsl:variable name="localname">
        		<xsl:value-of select="substring-after($propPN, '.')" />
	        </xsl:variable>
		<xsl:variable name="prefix" select="substring-before($propPN, '.')"/>
        	<xsl:variable name="namespaceuri">
        		<xsl:call-template name="makeNamespaceURIfromPrefix">
				<xsl:with-param name="prefix" select="$prefix" />
			</xsl:call-template>
	        </xsl:variable>
	        
	        <xsl:if test="normalize-space($namespaceuri)">
	        	<xsl:choose>
	        	<xsl:when test="$localname='type' and ($namespaceuri = 'http://purl.org/dc/elements/1.1/' or $namespaceuri='http://purl.org/dc/terms/')">
				<xsl:element name="rdf:type">
					<xsl:element name="rdf:Description">
						<xsl:attribute name="rdf:about"><xsl:value-of select="$uriObj" /></xsl:attribute>
						<xsl:if test="$valueString">
							<xsl:element name="rdf:value"><xsl:value-of select="$valueString" /></xsl:element>
						</xsl:if>
					</xsl:element>
				</xsl:element>
	        	</xsl:when>
	        	<xsl:otherwise>
				<xsl:element name="{$localname}" namespace="{$namespaceuri}">
					<xsl:element name="rdf:Description">
						<xsl:attribute name="rdf:about"><xsl:value-of select="$uriObj" /></xsl:attribute>
						<xsl:if test="$valueString">
							<xsl:element name="rdf:value"><xsl:value-of select="$valueString" /></xsl:element>
						</xsl:if>
					</xsl:element>
				</xsl:element>
			</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>

	<xsl:template name="makeNamespaceURIfromPrefix">
		<xsl:param name="prefix" />
		<xsl:variable name="prefixlow" select="translate($prefix, $uc, $lc)" />
		<xsl:variable name="namespaceuri">
			<xsl:for-each select="/html:html/html:head/html:link[translate(@rel, $uc, $lc)=concat('schema.', $prefixlow)]">
				<xsl:if test="position()=last()"> 
					<xsl:value-of select="@href" />
				</xsl:if>
			</xsl:for-each>
		</xsl:variable>
		<xsl:choose>
		<xsl:when test="$namespaceuri">
			<xsl:value-of select="$namespaceuri"/>
		</xsl:when>
		<xsl:otherwise>
		<!--
			<xsl:choose>
			<xsl:when test="$prefixlow = 'dc'">
				<xsl:text>http://purl.org/dc/elements/1.1/</xsl:text>
			</xsl:when>
			<xsl:when test="$prefixlow = 'dcterms'">
				<xsl:text>http://purl.org/dc/terms/</xsl:text>
			</xsl:when>
			<xsl:otherwise />
			</xsl:choose>
		-->
		</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="makeURIfromPrefName">
		<xsl:param name="prefName" />
		<xsl:variable name="prefix" select="substring-before($prefName,'.')"/>
		<xsl:variable name="namespaceuri">
			<xsl:call-template name="makeNamespaceURIfromPrefix">
				<xsl:with-param name="prefix" select="$prefix" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:if test="normalize-space($namespaceuri)">
			<xsl:value-of select="$namespaceuri" />
			<xsl:value-of select="substring-after($prefName,'.')"/>
		</xsl:if>
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

	<xsl:template match="text()|@*" />
		
</xsl:stylesheet>
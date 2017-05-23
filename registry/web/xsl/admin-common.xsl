<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:langInfo="org.dublincore.dcregistry.bean.languageBean"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg langInfo">

<!--
    this template adds a type attribute to the element.
    if you define "dc_language" element, "_type_dc_language"
    element will be added to the result html.

    type := ['literal' | 'resource']
-->


<xsl:template name="printElement">
    <xsl:param name="name" select="''"/>
    <xsl:param name="value" select="''"/>
    <xsl:param name="label" select="''"/>
    <xsl:param name="type" select="'literal'"/>
    <xsl:param name="readonly" select="''"/>
    <xsl:param name="docRoot"/>

    <tr>
        <td>
            <input
                name="{concat('_type_', $name)}"
                value="{$type}"
                type="hidden"
            />
            <xsl:value-of disable-output-escaping="yes" select="$label"/>
        </td>
        <td>
            <xsl:choose>
                <xsl:when test="$name = 'dc_language'">
                    <select name="dc_language">
			<xsl:choose>
			    <xsl:when test="string-length($value) &gt; 0">
				<xsl:apply-templates select="langInfo:getLanguages('ui', $docRoot)">
				    <xsl:with-param name="default_lang" select="$value"/>
				</xsl:apply-templates>
			    </xsl:when>
			    <xsl:otherwise>
				<xsl:apply-templates select="langInfo:getLanguages('ui', $docRoot)"/>
			    </xsl:otherwise>
			</xsl:choose>
                    </select>
                </xsl:when>
                <xsl:otherwise>
                    <input name="{$name}" size="50" value="{$value}">
			<xsl:if test="$readonly='yes'">
			    <xsl:attribute name="readonly">readonly</xsl:attribute>
			</xsl:if>
		    </input>
                </xsl:otherwise>
            </xsl:choose>
        </td>
    </tr>
</xsl:template>

<xsl:template match="reg:errorMsg">
    <div>[ERROR] <xsl:value-of select="."/></div>
</xsl:template>

<xsl:template name="literal-resource">
    <xsl:choose>
	<xsl:when test="@rdf:resource">
	    <xsl:value-of select="@rdf:resource"/>
	</xsl:when>
	<xsl:otherwise>
	    <xsl:value-of select="."/>
	</xsl:otherwise>
    </xsl:choose>
</xsl:template>

</xsl:stylesheet>

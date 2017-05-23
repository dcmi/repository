<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE xsl:stylesheet [
    <!ENTITY xsd "http://www.w3.org/2001/XMLSchema#" >
]>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:mods="http://www.loc.gov/mods/v3" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rda="http://RDVocab.info/Elements/" xmlns:frbr="http://purl.org/vocab/frbr/core#"
    xmlns:rdarole="http://RDVocab.info/roles/"
    xmlns:marcrelator="http://www.loc.gov/loc.terms/relators/"
    xmlns:dcterms="http://purl.org/dc/terms/" version="1.0">

    <xsl:template name="expression-contenttype">
        <!-- expect to be called in context of mods:mods element -->

        <!-- convenience variables -->
        <xsl:variable name="contenttype-uribase" select="'http://RDVocab.info/termList/RDAContentType/'"/>
        
        <!-- map mods:typeOfResource to RDA content type vocab -->
        <xsl:variable name="contenttype-uri">
            <xsl:choose>
                <xsl:when test="mods:typeOfResource='text'">
                    <xsl:value-of select="concat($contenttype-uribase, '1020')"/>
                </xsl:when>
                <xsl:otherwise>
                    <!-- TODO other content types -->
                    <xsl:value-of select="'UNKNOWN'"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>

        <xsl:if test="$contenttype-uri != 'UNKNOWN'">
            <rda:contentType rdf:resource="{$contenttype-uri}"/>
        </xsl:if>

    </xsl:template>

</xsl:stylesheet>

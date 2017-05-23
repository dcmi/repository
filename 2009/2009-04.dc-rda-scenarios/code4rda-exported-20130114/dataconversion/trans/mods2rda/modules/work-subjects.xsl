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
    
    
    <xsl:import href="../common/string-utils.xsl"/>


    <xsl:template name="work-subjects-topics">
        <!-- expect to be called in context of mods:mods element -->

        <xsl:for-each select="mods:subject[@authority='lcsh']/mods:topic[1]">
            <xsl:call-template name="topic-lcsh"/>
        </xsl:for-each>

    </xsl:template>
    
    
    <xsl:template name="topic-lcsh">
        <!-- expect to be called in context of mods:subject[@authority='lcsh']/mods:topic element -->
        
        <xsl:variable name="topic-uri">
            <xsl:call-template name="contruct-lcsh-uri"/>
        </xsl:variable>
        
        <frbr:subject rdf:resource="{$topic-uri}"/>
        <dcterms:subject rdf:resource="{$topic-uri}"/>
        
    </xsl:template>
    
    
    <xsl:template name="contruct-lcsh-uri">
        <!-- expect to be called in context of mods:subject[@authority='lcsh']/mods:topic element -->
    
        <!-- use a simple hash of the heading text for now (ideally would use official URIs constructed from heading lccn, but need a lookup table for that) -->
        <xsl:variable name="local-name">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="."/>
            </xsl:call-template>
        </xsl:variable>
        
        <xsl:value-of select="concat( 'lcsh/', $local-name )"/>        

    </xsl:template>

</xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE xsl:stylesheet [
    <!ENTITY xsd "http://www.w3.org/2001/XMLSchema#" >
]>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:mods="http://www.loc.gov/mods/v3" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:rda="http://RDVocab.info/Elements/" xmlns:frbr="http://purl.org/vocab/frbr/core#"
    xmlns:rdarole="http://RDVocab.info/roles/"
    xmlns:marcrelator="http://www.loc.gov/loc.terms/relators/"
    xmlns:rdakey="http://purl.org/net/rdakey/"
    xmlns:dcterms="http://purl.org/dc/terms/" version="1.0">


    <xsl:import href="../common/string-utils.xsl"/>
    
        
    <xsl:template name="persons">
        <!-- expect to be called in context of mods:mods element -->
    
        <xsl:for-each select="mods:name[@type='personal']">
            <xsl:call-template name="person"/>
        </xsl:for-each>

    </xsl:template>


    <xsl:template name="person">
        <!-- expect to be called in context of mods:name[@type='personal'] element -->
        
        <xsl:variable name="person-uri">
            <xsl:call-template name="construct-person-uri"/>
        </xsl:variable>
        
        <frbr:Person rdf:about="{$person-uri}">

            <xsl:if test="mods:namePart[1]">
                <rda:preferredNameForThePerson rdf:datatype="&xsd;string">
                    <xsl:value-of select="mods:namePart[1]"/>
                </rda:preferredNameForThePerson>
            </xsl:if>

            <xsl:if test="mods:namePart[@type='date']">
                <rda:dateAssociatedWithThePerson rdf:datatype="&xsd;string">
                    <xsl:value-of select="mods:namePart[@type='date']"/>
                </rda:dateAssociatedWithThePerson>        
            </xsl:if>
            
            <xsl:call-template name="person-name-simplehash"/>

        </frbr:Person>

    </xsl:template>


    <xsl:template name="construct-person-uri">
        <!-- expect to be called in context of mods:name element -->
        
        <xsl:variable name="lccn" select="../mods:identifier[@type='lccn']"/>
        <xsl:variable name="local-name">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="$lccn"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:variable name="index" select="position()"/>

        <!-- construct relative URI based on lccn, with spaces and non-alphanumeric characters stripped -->
        <xsl:value-of select="concat('person/', $local-name, '-', $index)"/>
        
    </xsl:template>


    <xsl:template name="work-persons">
        <!-- expect to be called in context of mods:mods element -->
        
        <xsl:for-each select="mods:name[@type='personal']">
            <xsl:call-template name="work-person"/>
        </xsl:for-each>
        
    </xsl:template>
    
    
    <xsl:template name="work-person">
        <!-- expect to be called in context of mods:name[@type='personal'] element -->
        
        <!-- convenience variables -->
        <xsl:variable 
            name="relator" 
            select="mods:role/mods:roleTerm[@authority='marcrelator' and @type='text']"/>        

        <!-- construct person URI -->
        <xsl:variable name="person-uri">
            <xsl:call-template name="construct-person-uri"/>
        </xsl:variable>
        
        <!-- just handle creator for now -->
        <xsl:if test="$relator='creator'">
            <marcrelator:CRE rdf:resource="{$person-uri}"/>
            <frbr:creator rdf:resource="{$person-uri}"/>
            <rdarole:author rdf:resource="{$person-uri}"/>
        </xsl:if>
        
        <!-- TODO other relators -->
        
    </xsl:template>
    
    
    <xsl:template name="person-name-simplehash">
        <!-- expect to be called in context of mods:name[@type='personal'] element -->
        
        <xsl:variable name="key">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="concat( mods:namePart[1], mods:namePart[@type='date'])"/>
            </xsl:call-template>
        </xsl:variable>
        
        <rdakey:personNameSimpleHash rdf:datatype="&xsd;string">
            <xsl:value-of select="$key"/>
        </rdakey:personNameSimpleHash>
        
    </xsl:template>
    
    
</xsl:stylesheet>

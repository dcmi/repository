<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE xsl:stylesheet [
    <!ENTITY xsd "http://www.w3.org/2001/XMLSchema#" >
]>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema#" xmlns:mods="http://www.loc.gov/mods/v3"
    xmlns:rda="http://RDVocab.info/Elements/" xmlns:frbr="http://purl.org/vocab/frbr/core#"
    xmlns:rdarole="http://RDVocab.info/roles/"
    xmlns:marcrelator="http://www.loc.gov/loc.terms/relators/"
    xmlns:rdakey="http://purl.org/net/rdakey/"
    xmlns:dcterms="http://purl.org/dc/terms/" version="1.0">


    <!-- main stylesheet for conversion from MODS XML to RDF using RDA and FRBR schemas -->
    

    <!-- ###################################
         # IMPORTS
         ################################### -->


    <!-- N.B. this stylesheet is modularised -->
    <xsl:import href="modules/manifestation-title.xsl"/>
    <xsl:import href="modules/manifestation-statementofresponsibility.xsl"/>
    <xsl:import href="modules/expression-contenttype.xsl"/>
    <xsl:import href="modules/work-title.xsl"/>
    <xsl:import href="modules/work-subjects.xsl"/>
    <xsl:import href="modules/work-keys.xsl"/>
    <xsl:import href="modules/persons.xsl"/>
    

    <!-- ###################################
         # GLOBAL VARIABLES AND SETUP
         ################################### -->


    <xsl:output indent="yes" encoding="UTF-8" method="xml" media-type="application/rdf+xml"/>
    
    <!-- base for URIs in this transformation -->
    <xsl:variable name="uribase">http://placeholder/</xsl:variable>


    <!-- ###################################
         # ROOT TEMPLATE
         ################################### -->


    <!-- root template, set up the output document -->
    <xsl:template match="/">
        <rdf:RDF xml:base="{$uribase}">
            <xsl:comment>RDF generated from MODS XML using mods2rda stylesheet, see
                http://code4rda.googlecode.com</xsl:comment>
            <xsl:apply-templates select="//mods:mods"/>
        </rdf:RDF>
    </xsl:template>


    <!-- ###################################
         # MAIN RECORD TEMPLATE
         ################################### -->


    <!-- main template for each mods record -->
    <xsl:template match="mods:mods">

        <!-- convenience variables -->
        
        <xsl:variable name="lccn" select="mods:identifier[@type='lccn']"/>

        <!-- construct URIs for FRBR group 1 entities -->

        <xsl:variable name="manifestation-uri">
            <xsl:call-template name="construct-manifestation-uri"/>
        </xsl:variable>

        <xsl:variable name="expression-uri">
            <xsl:call-template name="construct-expression-uri"/>
        </xsl:variable>
        
        <xsl:variable name="work-uri">
            <xsl:call-template name="construct-work-uri"/>
        </xsl:variable>

        <!-- call template for manifestation-level metadata -->
        <xsl:call-template name="manifestation">
            <xsl:with-param name="manifestation-uri" select="$manifestation-uri"/>
            <xsl:with-param name="expression-uri" select="$expression-uri"/>
        </xsl:call-template>

        <!-- call template for expression-level metadata -->
        <xsl:call-template name="expression">
            <xsl:with-param name="manifestation-uri" select="$manifestation-uri"/>
            <xsl:with-param name="expression-uri" select="$expression-uri"/>
            <xsl:with-param name="work-uri" select="$work-uri"/>
        </xsl:call-template>

        <!-- call template for work-level metadata -->
        <xsl:call-template name="work">
            <xsl:with-param name="expression-uri" select="$expression-uri"/>
            <xsl:with-param name="work-uri" select="$work-uri"/>
        </xsl:call-template>
        
        <!-- call template for persons -->
        <xsl:call-template name="persons"/>

    </xsl:template>


    <!-- ###################################
         # MAIN MANIFESTATION TEMPLATE
         ################################### -->


    <xsl:template name="manifestation">

        <!-- expected params -->
        <xsl:param name="manifestation-uri"/>
        <xsl:param name="expression-uri"/>
        
        <frbr:Manifestation rdf:about="{$manifestation-uri}">

            <!-- FRBR group 1 links -->
            <frbr:embodimentOf rdf:resource="{$expression-uri}"/>

            <!-- call importd templates -->
            <xsl:call-template name="manifestation-title"/>
            <xsl:call-template name="manifestation-statementofresponsibility"/>
            
        </frbr:Manifestation>
        
    </xsl:template>


    <!-- ###################################
         # MAIN EXPRESSION TEMPLATE
         ################################### -->


    <xsl:template name="expression">

        <!-- expected params -->
        <xsl:param name="manifestation-uri"/>
        <xsl:param name="expression-uri"/>
        <xsl:param name="work-uri"/>
        
        <frbr:Expression rdf:about="{$expression-uri}">

            <!-- FRBR group 1 links -->
            <frbr:embodiment rdf:resource="{$manifestation-uri}"/>
            <frbr:realizationOf rdf:resource="{$work-uri}"/>

            <!-- call importd templates -->
            <xsl:call-template name="expression-contenttype"/>
            
        </frbr:Expression>
        
    </xsl:template>


    <!-- ###################################
         # MAIN WORK TEMPLATE
         ################################### -->


    <xsl:template name="work">
        <xsl:param name="expression-uri"/>
        <xsl:param name="work-uri"/>
        <frbr:Work rdf:about="{$work-uri}">

            <!-- FRBR group 1 links -->
            <frbr:realization rdf:resource="{$expression-uri}"/>

            <!-- call importd templates -->
            <xsl:call-template name="work-title"/>
            <xsl:call-template name="work-persons"/>
            <xsl:call-template name="work-subjects-topics"/>
            <xsl:call-template name="work-title-simplehash"/>
            
        </frbr:Work>
    </xsl:template>


    <!-- ###################################
         # URI CONSTRUCTION TEMPLATES
         ################################### -->


    <xsl:template name="construct-manifestation-uri">
        <!-- expect to be called in the context of a mods:mods element -->

        <!-- convenience variables -->
        <xsl:variable name="lccn" select="mods:identifier[@type='lccn']"/>
        <xsl:variable name="local-name">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="$lccn"/>
            </xsl:call-template>
        </xsl:variable>
        
        <!-- construct relative URI based on lccn, with spaces and non-alphanumeric characters stripped -->
        <xsl:value-of select="concat('manifestation/', $local-name)"/>

    </xsl:template>


    <xsl:template name="construct-expression-uri">
        <!-- expect to be called in the context of a mods:mods element -->
        
        <!-- convenience variables -->
        <xsl:variable name="lccn" select="mods:identifier[@type='lccn']"/>
        <xsl:variable name="local-name">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="$lccn"/>
            </xsl:call-template>
        </xsl:variable>
        
        <!-- construct relative URI based on lccn, with spaces and non-alphanumeric characters stripped -->
        <xsl:value-of select="concat('expression/', $local-name)"/>
        
    </xsl:template>


    <xsl:template name="construct-work-uri">
        <!-- expect to be called in the context of a mods:mods element -->
        
        <!-- convenience variables -->
        <xsl:variable name="lccn" select="mods:identifier[@type='lccn']"/>
        <xsl:variable name="local-name">
            <xsl:call-template name="simple-hash">
                <xsl:with-param name="input" select="$lccn"/>
            </xsl:call-template>
        </xsl:variable>
        
        <!-- construct relative URI based on lccn, with spaces and non-alphanumeric characters stripped -->
        <xsl:value-of select="concat('work/', $local-name)"/>
        
    </xsl:template>
    
    
</xsl:stylesheet>

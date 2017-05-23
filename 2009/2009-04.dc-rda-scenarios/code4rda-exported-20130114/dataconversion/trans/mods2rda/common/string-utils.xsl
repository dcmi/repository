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


    <xsl:template name="lower-case">
        <xsl:param name="input"/>
        <xsl:value-of select="translate( $input, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz' )"/>
    </xsl:template>
    
    <xsl:template name="strip-symbols">
        <xsl:param name="input"/>
        <xsl:variable name="symbols"> `¬!"£$%^&amp;*()-_=+[{]};:'@#~\|,&lt;.&gt;/?</xsl:variable>
        <xsl:value-of select="translate( $input, $symbols, '' )"/>        
    </xsl:template>
    
    <xsl:template name="simple-hash">
        <xsl:param name="input"/>
        
        <xsl:variable name="intermediate">
            <xsl:call-template name="lower-case">
                <xsl:with-param name="input" select="$input"/>
            </xsl:call-template>
        </xsl:variable>       

        <xsl:call-template name="strip-symbols">
            <xsl:with-param name="input" select="$intermediate"/>
        </xsl:call-template>

    </xsl:template>
    
</xsl:stylesheet>

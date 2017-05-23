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


    <xsl:template name="manifestation-statementofresponsibility">
        <!-- expect to be called in context of mods:mods element -->

        <xsl:if test="mods:note[@type='statement of responsibility']">
            <rda:statementOfResponsibilityRelatingToTitle rdf:datatype="&xsd;string">
                <xsl:value-of select="mods:note[@type='statement of responsibility']"/>
            </rda:statementOfResponsibilityRelatingToTitle>
        </xsl:if>

    </xsl:template>

</xsl:stylesheet>

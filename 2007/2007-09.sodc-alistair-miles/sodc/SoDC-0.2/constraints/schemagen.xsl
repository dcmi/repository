<?xml version="1.0" encoding="UTF-8"?>
<!-- $Id: schemagen.xsl,v 1.1 2007/08/30 23:42:05 ajm65 Exp $ -->
<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:sch="http://www.ascc.net/xml/schematron"
  xmlns:cl="http://purl.org/net/sodc/cl"
  version="1.0">

  <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
  
  <xsl:template match="/cl:constraints">
    <sch:schema>
      <sch:ns uri="http://purl.org/net/sodc/xml" prefix="sodc"/>
      <sch:pattern name="{@name}">
        <xsl:apply-templates select="cl:profile"/>      
      </sch:pattern>
    </sch:schema>
  </xsl:template>
  
  <xsl:template match="cl:profile">
    <sch:rule context="//sodc:resource[sodc:profile='{@uri}']">
      <xsl:apply-templates select="cl:constraint/*"/>
    </sch:rule>
  </xsl:template>
  
  <xsl:template match="cl:cardinality">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:variable name="n" select="."/>
    <xsl:comment> exact cardinality constraint </xsl:comment>
    <sch:assert subject="." test="count(sodc:property[@uri='{$property}']) = {$n}">
      <xsl:text>The subject does not have exactly </xsl:text>
      <xsl:value-of select="$n"/> 
      <xsl:text> property with URI </xsl:text>
      <xsl:value-of select="$property"/>
    </sch:assert>
  </xsl:template>
  
  <xsl:template match="cl:maxcardinality">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:variable name="n" select="."/>
    <xsl:comment> maximum cardinality constraint </xsl:comment>
    <sch:assert subject="." test="count(sodc:property[@uri='{$property}']) &lt;= {$n}">
      <xsl:text>The subject does not have </xsl:text>
      <xsl:value-of select="$n"/> 
      <xsl:text> or less properties with URI </xsl:text>
      <xsl:value-of select="$property"/>
    </sch:assert>
  </xsl:template>
  
  <xsl:template match="cl:mincardinality">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:variable name="n" select="."/>
    <xsl:comment> minimum cardinality constraint </xsl:comment>
    <sch:assert subject="." test="count(sodc:property[@uri='{$property}']) >= {$n}">
      <xsl:text>The subject does not have </xsl:text>
      <xsl:value-of select="$n"/> 
      <xsl:text> or more properties with URI </xsl:text>
      <xsl:value-of select="$property"/>
    </sch:assert>
  </xsl:template>
  
  <xsl:template match="cl:value[cl:uri]">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:comment> URI-only value constraint </xsl:comment>
    <sch:assert subject="." test="sodc:property[@uri='{$property}']/sodc:value/sodc:uri">
      <xsl:text>The subject does not have only URI values for property with URI </xsl:text>
      <xsl:value-of select="$property"/>
    </sch:assert>
  </xsl:template>
  
  <xsl:template match="cl:value[cl:nodeid]">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:comment> Nodeid-only value constraint </xsl:comment>
    <sch:assert subject="." test="sodc:property[@uri='{$property}']/sodc:value/sodc:nodeid">
      <xsl:text>The subject does not have only blank node values for property with URI </xsl:text>
      <xsl:value-of select="$property"/>
    </sch:assert>
  </xsl:template>
    
  <xsl:template match="cl:value[cl:plainliteral]">
    <xsl:variable name="property" select="parent::cl:constraint/@property"/>
    <xsl:comment> Plain literal-only value constraint </xsl:comment>
    <xsl:choose>
      <xsl:when test="cl:plainliteral/cl:lang/@use = 'required'">
        <sch:assert subject="." test="sodc:property[@uri='{$property}']/sodc:value/sodc:plainliteral[@lang]">
          <xsl:text>The subject does not have only plain literal values with language tags for property with URI </xsl:text>
          <xsl:value-of select="$property"/>
        </sch:assert>
      </xsl:when>
      <xsl:otherwise>
        <sch:assert subject="." test="sodc:property[@uri='{$property}']/sodc:value/sodc:plainliteral">
          <xsl:text>The subject does not have only plain literal values for property with URI </xsl:text>
          <xsl:value-of select="$property"/>
        </sch:assert>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  
</xsl:stylesheet>
<!--  
$Log: schemagen.xsl,v $
Revision 1.1  2007/08/30 23:42:05  ajm65
Initial version.
  
-->
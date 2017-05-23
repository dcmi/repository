<?xml version="1.0" encoding="UTF-8"?>
<!-- $Id: turtlegen.xsl,v 1.3 2007/09/03 09:11:30 ajm65 Exp $ -->
<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:sodc="http://purl.org/net/sodc/xml"
  version="1.0">
  
  <xsl:output method="text" encoding="UTF-8" indent="no"/>
  
  <xsl:template match="/sodc:graph">
    <xsl:apply-templates select="sodc:resource"/>
  </xsl:template>

  <xsl:template match="sodc:resource">
    <xsl:variable name="subject">
      <xsl:choose>
        <xsl:when test="sodc:uri">
          <xsl:text>&lt;</xsl:text>
          <xsl:value-of select="sodc:uri"/>
          <xsl:text>&gt;</xsl:text>
        </xsl:when>
        <xsl:when test="sodc:nodeid">
          <xsl:text>_:</xsl:text>
          <xsl:value-of select="sodc:nodeid"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:text>[]</xsl:text>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
        
    <xsl:value-of select="$subject"/>
    <xsl:apply-templates select="sodc:property"/>
    
  </xsl:template>
  
  <xsl:template match="sodc:property">
    <xsl:text> &lt;</xsl:text>
    <xsl:value-of select="@uri"/>
    <xsl:text>&gt; </xsl:text>
    <xsl:apply-templates select="sodc:value"/>
    <xsl:choose>
      <xsl:when test="position() = last()">
        <xsl:text> .
</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text> ;
  </xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  
  <xsl:template match="sodc:value[sodc:uri]">
    <xsl:text>&lt;</xsl:text>
    <xsl:value-of select="sodc:uri"/>
    <xsl:text>&gt;</xsl:text>
  </xsl:template>
  
  <xsl:template match="sodc:value[sodc:nodeid]">
    <xsl:text>_:</xsl:text>
    <xsl:value-of select="sodc:nodeid"/>
  </xsl:template>

  <xsl:template match="sodc:value[sodc:plainliteral]">
    <xsl:text>"""</xsl:text>
    <xsl:value-of select="sodc:plainliteral"/>
    <xsl:text>"""</xsl:text>
    <xsl:if test="sodc:plainliteral/@lang != ''">
      <xsl:text>@</xsl:text>
      <xsl:value-of select="sodc:plainliteral/@lang"/>
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="sodc:value[sodc:typedliteral]">
    <xsl:text>"""</xsl:text>
    <xsl:value-of select="sodc:typedliteral"/>
    <xsl:text>"""^^&lt;</xsl:text>
    <xsl:value-of select="sodc:typedliteral/@datatype"/>
    <xsl:text>&gt;</xsl:text>
  </xsl:template>
  
  <xsl:template match="sodc:value[sodc:xmlliteral]">
    <xsl:text>"""</xsl:text>
    <!-- N.B. this is broken -->
    <xsl:copy-of select="sodc:xmlliteral/*"/>
    <xsl:text>"""^^&lt;@@TODO#XMLLiteral&gt;</xsl:text>
  </xsl:template>
  
  <xsl:template match="*">
  </xsl:template>
    
</xsl:stylesheet>
<!--  
$Log: turtlegen.xsl,v $
Revision 1.3  2007/09/03 09:11:30  ajm65
Almost complete implementation; broken for XML literal values.

Revision 1.2  2007/08/30 23:45:29  ajm65
Added comment about bug for totally anonymous resources.

Revision 1.1  2007/08/30 23:42:05  ajm65
Initial version.
  
-->
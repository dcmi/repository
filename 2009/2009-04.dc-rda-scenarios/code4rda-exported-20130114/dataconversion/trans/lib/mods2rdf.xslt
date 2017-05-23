<?xml version="1.0" encoding="UTF-8"?>

<!--+
    | This stylesheet converts MODS/XML data to MODS/RDF/XML 
    |
    |  Author: Stefano Mazzocchi 
    |  Date: 22 January 2006
    +-->

<!DOCTYPE xsl:stylesheet [    <!ENTITY xsl      'http://www.w3.org/1999/XSL/Transform'>	    <!ENTITY xlink    'http://www.w3.org/1999/xlink'>	    <!ENTITY mods     'http://www.loc.gov/mods/v3'>	
    <!ENTITY marc     'http://www.loc.gov/MARC21/slim'>    <!ENTITY xsd      'http://www.w3.org/2001/XMLSchema'>    <!ENTITY rdf      'http://www.w3.org/1999/02/22-rdf-syntax-ns#'>    <!ENTITY rdfs     'http://www.w3.org/2000/01/rdf-schema#'>
    <!ENTITY owl      'http://www.w3.org/2002/07/owl#'>    <!ENTITY dc       'http://purl.org/dc/elements/1.1/'>
    <!ENTITY dcterms  'http://purl.org/dc/terms/'>
    <!ENTITY modsrdf  'http://simile.mit.edu/2006/01/ontologies/mods3#'>
    <!ENTITY base     'http://simile.mit.edu/2006/01/'>
    <!ENTITY role     'http://simile.mit.edu/2006/01/roles#'>
    <!ENTITY barton   'http://libraries.mit.edu/barton/'>
]>

<xsl:stylesheet version="1.0"     xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xsd="&xsd;"    xmlns:xlink="&xlink;" 
    xmlns:mods="&mods;" 
    xmlns:marc="&marc;"    xmlns:rdf="&rdf;"
    xmlns:owl="&owl;"
    xmlns:dc="&dc;"
    xmlns:dcterms="&dcterms;"    xmlns:modsrdf="&modsrdf;"
    xmlns:role="&role;"
    exclude-result-prefixes="mods marc xlink xsd" 
>

    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <!-- ====================== Named Templates ============================== -->

    <xsl:template name="urify">
     <xsl:param name="dirty"/>
     <xsl:variable name="clean"><xsl:value-of select="translate(translate($dirty,':;.,-_()[]{}&gt;&lt;&amp;&quot;',''),' ','_')"/></xsl:variable>
     <xsl:value-of select='translate($clean,"&apos;","")'/>
    </xsl:template>

    <xsl:template name="normalize_element_name">
     <xsl:param name="dirty"/>
     <xsl:variable name="clean">
      <xsl:call-template name="urify">
       <xsl:with-param name="dirty" select="$dirty"/>
      </xsl:call-template>
     </xsl:variable>
     <xsl:variable name="start"><xsl:value-of select='substring($clean,1,1)'/></xsl:variable>
     <xsl:if test="$start = '0' or $start = '1' or $start = '2' or $start = '3' or $start = '4' or $start = '5' or $start = '6' or $start = '7' or $start = '8' or $start = '9'">
       <xsl:text>_</xsl:text>
     </xsl:if>
     <xsl:value-of select='$clean'/>
    </xsl:template>
    
    <xsl:template name="make_date">
      <modsrdf:Date modsrdf:value="{.}">
        <xsl:if test="@encoding"><xsl:attribute name="modsrdf:encoding"><xsl:value-of select="@encoding"/></xsl:attribute></xsl:if>
        <xsl:if test="@point"><xsl:attribute name="modsrdf:point"><xsl:value-of select="@point"/></xsl:attribute></xsl:if>
        <xsl:if test="@qualifier"><xsl:attribute name="modsrdf:qualifier"><xsl:value-of select="@qualifier"/></xsl:attribute></xsl:if>
      </modsrdf:Date>
    </xsl:template>
    
    <xsl:template name="get_entity_type">
      <xsl:choose>
        <xsl:when test="@type='personal'">Person</xsl:when>
        <xsl:when test="@type='corporate'">Corporation</xsl:when>
        <xsl:when test="@type='conference'">Conference</xsl:when>
        <xsl:otherwise>Entity</xsl:otherwise>
      </xsl:choose>
    </xsl:template>

    <xsl:template name="make_entity_uri">
      <xsl:choose>
        <xsl:when test="mods:namePart[@type='date' and @type='family' and @type='given']"><xsl:value-of select="mods:namePart[@type='family']"/><xsl:text>, </xsl:text><xsl:value-of select="mods:namePart[@type='given']"/><xsl:text> </xsl:text><xsl:value-of select="mods:namePart[@type='date']"/></xsl:when>
        <xsl:when test="mods:namePart[@type='family' and @type='given']"><xsl:value-of select="mods:namePart[@type='family']"/><xsl:text>, </xsl:text><xsl:value-of select="mods:namePart[@type='given']"/></xsl:when>
        <xsl:when test="mods:namePart[@type='date']"><xsl:value-of select="mods:namePart[not(@type)]"/><xsl:text> </xsl:text><xsl:value-of select="mods:namePart[@type='date']"/></xsl:when>
        <xsl:otherwise>
         <xsl:value-of select="mods:namePart[1]"/>
         <xsl:for-each select="mods:namePart[position() > 1]">
          <xsl:text>-</xsl:text><xsl:value-of select="."/>
         </xsl:for-each>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:template>

    <xsl:template name="get_title_type">
      <xsl:choose>
        <xsl:when test="@type='alternative'">AlternativeTitle</xsl:when>
        <xsl:when test="@type='uniform'">UniformTitle</xsl:when>
        <xsl:when test="@type='translated'">TranslatedTitle</xsl:when>
        <xsl:when test="@type='abbreviated'">AbbreviatedTitle</xsl:when>
        <xsl:otherwise>Title</xsl:otherwise>
      </xsl:choose>
    </xsl:template>
    

    <!-- ====================== Matched Templates ============================== -->

    <xsl:template match="/">
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="mods:modsCollection">
        <rdf:RDF xmlns:rdf="&rdf;" xmlns:modsrdf="&modsrdf;">
            <xsl:apply-templates/>
        </rdf:RDF>
    </xsl:template>

    <xsl:template match="mods:mods">

	  <xsl:variable name="valid_identifiers" select="mods:identifier[not(@invalid) and string-length() > 0]"/>
	  
	  <xsl:variable name="record_uri">
	   <xsl:choose>
	    <xsl:when test="mods:recordInfo/mods:recordIdentifier">
	     <xsl:value-of select="mods:recordInfo/mods:recordIdentifier/@source"/>/<xsl:value-of select="mods:recordInfo/mods:recordIdentifier"/>
	    </xsl:when>
	    <xsl:otherwise>
	     <xsl:value-of select="$valid_identifiers[1]/@type"/>/<xsl:value-of select="$valid_identifiers[1]"/>
	    </xsl:otherwise>
	   </xsl:choose>
	  </xsl:variable>
	  
	  <xsl:variable name="clean_record_uri">
	   <xsl:call-template name="urify"><xsl:with-param name="dirty" select="$record_uri"/></xsl:call-template>
	  </xsl:variable>
	  
      <!-- Process the Record -->
      <modsrdf:Record rdf:about="&barton;{$clean_record_uri}">
       <xsl:choose>
        <xsl:when test="mods:identifier">
         <xsl:for-each select="$valid_identifiers[1]">
          <modsrdf:records rdf:resource="info:{translate(@type,' ','_')}/{translate(.,' ','_')}"/>
         </xsl:for-each>
        </xsl:when>
        <xsl:otherwise>
         <modsrdf:records rdf:resource="info:marc:{$clean_record_uri}"/>
        </xsl:otherwise>
       </xsl:choose>
       <xsl:apply-templates select="mods:recordInfo/*"/>
      </modsrdf:Record>
      
      <!-- Process the Items -->
      <xsl:choose>
       <xsl:when test="mods:identifier">
	      <xsl:for-each select="$valid_identifiers">
	        <rdf:Description rdf:about="info:{@type}/{.}">
	          <xsl:apply-templates select="../mods:typeOfResource" mode="type"/>
	          <xsl:choose>
	            <xsl:when test="position() = 1">
	              <xsl:apply-templates select="../*"/>
	            </xsl:when>
	            <xsl:otherwise>
	              <owl:sameAs rdf:resource="info:{preceding-sibling::mods:identifier[position()=1]/@type}/{preceding-sibling::mods:identifier[position()=1]}"/>
	            </xsl:otherwise>
	          </xsl:choose>
	        </rdf:Description>
	      </xsl:for-each>
       </xsl:when>
       <xsl:otherwise>
        <rdf:Description rdf:about="info:marc:{mods:recordInfo/mods:recordIdentifier/@source}/{translate(mods:recordInfo/mods:recordIdentifier,' ','_')}">
          <xsl:apply-templates select="mods:typeOfResource" mode="type"/>
          <xsl:apply-templates/>
        </rdf:Description>
       </xsl:otherwise> 
      </xsl:choose>

      <!-- Process the People -->
      <xsl:for-each select="mods:name">
        <xsl:variable name="type">
          <xsl:call-template name="get_entity_type"/>
        </xsl:variable>
  
        <xsl:variable name="uri">
          <xsl:call-template name="make_entity_uri"/>
        </xsl:variable>
        
  	    <xsl:variable name="clean_uri">
	     <xsl:call-template name="urify"><xsl:with-param name="dirty" select="$uri"/></xsl:call-template>
	    </xsl:variable>
  
        <rdf:Description rdf:about="&base;Entity#{$clean_uri}">
          <rdf:type rdf:resource="&modsrdf;{$type}"/>
          <xsl:apply-templates/>
        </rdf:Description>
      </xsl:for-each>
    </xsl:template>

    <xsl:template match="mods:recordChangeDate">
      <modsrdf:changed>
       <xsl:call-template name="make_date"/>
      </modsrdf:changed>
    </xsl:template>
    
    <xsl:template match="mods:recordCreationDate">
      <modsrdf:created>
       <xsl:call-template name="make_date"/>
      </modsrdf:created>
    </xsl:template>

    <xsl:template match="mods:languageOfCataloging">
      <modsrdf:catalogingLanguage>
       <modsrdf:Language rdf:about="&base;language/{@authority}/{translate(.,' ','_')}" modsrdf:authority="{@authority}" modsrdf:value="{.}"/>
      </modsrdf:catalogingLanguage>
    </xsl:template>
    
    <xsl:template match="mods:recordContentSource">
      <modsrdf:origin rdf:resource="info:{@authority}/{translate(.,' ','_')}"/>
    </xsl:template>
    
    <xsl:template match="mods:typeOfResource" mode="type">
        <xsl:choose>
            <xsl:when test="text()='text'"><rdf:type rdf:resource="&modsrdf;Text"/></xsl:when>
            <xsl:when test="text()='cartographic'"><rdf:type rdf:resource="&modsrdf;Cartographic"/></xsl:when>
            <xsl:when test="text()='notated music'"><rdf:type rdf:resource="&modsrdf;NotatedMusic"/></xsl:when>
            <xsl:when test="text()='sound recording-nonmusical'"><rdf:type rdf:resource="&modsrdf;SoundRecordingNonMusical"/></xsl:when>
            <xsl:when test="text()='sound recording'"><rdf:type rdf:resource="&modsrdf;SoundRecording"/></xsl:when>
            <xsl:when test="text()='sound recording-musical'"><rdf:type rdf:resource="&modsrdf;SoundRecordingMusical"/></xsl:when>
            <xsl:when test="text()='still image'"><rdf:type rdf:resource="&modsrdf;StillImage"/></xsl:when>
            <xsl:when test="text()='moving image'"><rdf:type rdf:resource="&modsrdf;MovingImage"/></xsl:when>
            <xsl:when test="text()='three dimensional object'"><rdf:type rdf:resource="&modsrdf;3DObject"/></xsl:when>
            <xsl:when test="text()='software, multimedia'"><rdf:type rdf:resource="&modsrdf;SoftwareAndMultimedia"/></xsl:when>
            <xsl:when test="text()='mixed material'"><rdf:type rdf:resource="&modsrdf;MixedMaterial"/></xsl:when>
        </xsl:choose>
        <xsl:if test="@manuscript='yes'"><rdf:type rdf:resource="&modsrdf;Manuscript"/></xsl:if>
    </xsl:template>

    <!-- =============== Extracted Before Therefore Skipped =================== -->

    <xsl:template match="mods:recordIdentifier|mods:identifier|mods:typeOfResource"/>
    
    <!-- ====================== Semantic Containers ========================== -->

    <xsl:template match="mods:language|mods:originInfo|mods:subject">
       <xsl:apply-templates/>
    </xsl:template>
    
    <!-- ======================== Literal Values ============================== -->

    <xsl:template match="mods:abstract">
        <modsrdf:abstract><xsl:value-of select="."/></modsrdf:abstract>
    </xsl:template>

    <xsl:template match="mods:tableOfContents">
        <modsrdf:contents><xsl:value-of select="."/></modsrdf:contents>
    </xsl:template>

    <xsl:template match="mods:note">
        <modsrdf:note><xsl:value-of select="."/></modsrdf:note>
    </xsl:template>

    <xsl:template match="mods:accessCondition">
        <modsrdf:access><xsl:value-of select="."/></modsrdf:access>
    </xsl:template>

    <xsl:template match="mods:physicalDescription/mods:extent">
       <modsrdf:extent><xsl:value-of select="."/></modsrdf:extent>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:edition">
       <modsrdf:edition><xsl:value-of select="."/></modsrdf:edition>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:frequency">
       <modsrdf:frequency><xsl:value-of select="."/></modsrdf:frequency>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:issuance">
       <modsrdf:issuance><xsl:value-of select="."/></modsrdf:issuance>
    </xsl:template>

    <!-- ======================== Nested Values ========================== -->

    <xsl:template match="mods:genre">
      <modsrdf:genre>
        <modsrdf:Genre rdf:about="&base;genre/{@authority}/{translate(.,' ','_')}" modsrdf:authority="{@authority}" modsrdf:value="{.}"/>
      </modsrdf:genre>
    </xsl:template>

    <xsl:template match="mods:targetAudience">
      <modsrdf:audience>
        <modsrdf:Audience rdf:about="&base;audiece/{@authority}/{translate(.,' ','_')}" modsrdf:authority="{@authority}" modsrdf:value="{.}"/>
      </modsrdf:audience>
    </xsl:template>

    <xsl:template match="mods:languageTerm">
      <modsrdf:language>
       <modsrdf:Language rdf:about="&base;language/{@authority}/{translate(.,' ','_')}" modsrdf:authority="{@authority}" modsrdf:value="{.}"/>
      </modsrdf:language>
    </xsl:template>

    <xsl:template match="mods:classification">
      <modsrdf:classification>
        <modsrdf:Classification modsrdf:value="{.}">
         <xsl:if test="@edition"><xsl:attribute name="modsrdf:edition"><xsl:value-of select="@edition"/></xsl:attribute></xsl:if>
         <xsl:if test="@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="@authority"/></xsl:attribute></xsl:if>
        </modsrdf:Classification>
      </modsrdf:classification>
    </xsl:template>

     <xsl:template match="mods:physicalDescription/mods:form">
       <modsrdf:form>
         <modsrdf:Form rdf:about="&base;form/{@authority}/{translate(.,' ','_')}" modsrdf:value="{.}">
           <xsl:if test="@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="@authority"/></xsl:attribute></xsl:if>
         </modsrdf:Form>
       </modsrdf:form>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:copyrightDate">
      <modsrdf:copyrightDate>
        <xsl:call-template name="make_date"/>
      </modsrdf:copyrightDate>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:dateIssued">
      <modsrdf:dateIssued>
        <xsl:call-template name="make_date"/>
      </modsrdf:dateIssued>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:dateCreated">
      <modsrdf:dateCreated>
        <xsl:call-template name="make_date"/>
      </modsrdf:dateCreated>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:dateCaptured">
      <modsrdf:dateCaptured>
        <xsl:call-template name="make_date"/>
      </modsrdf:dateCaptured>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:dateValid">
      <modsrdf:dateValid>
        <xsl:call-template name="make_date"/>
      </modsrdf:dateValid>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:dateModified">
      <modsrdf:dateModified>
        <xsl:call-template name="make_date"/>
      </modsrdf:dateModified>
    </xsl:template>

    <!-- ============================ Complex Types ============================ -->

    <xsl:template match="mods:mods/mods:titleInfo">
      <xsl:variable name="type">
       <xsl:call-template name="get_title_type"/>
      </xsl:variable>
     
      <modsrdf:title>
       <rdf:Description>
        <rdf:type rdf:resource="&modsrdf;{$type}"/>
        <xsl:apply-templates/>
       </rdf:Description>
      </modsrdf:title>
    </xsl:template>
    
    <xsl:template match="mods:nonSort">
      <modsrdf:nonSort><xsl:apply-templates/></modsrdf:nonSort>
    </xsl:template>

    <xsl:template match="mods:title">
      <modsrdf:value><xsl:apply-templates/></modsrdf:value>
    </xsl:template>

    <xsl:template match="mods:subTitle">
      <modsrdf:sub><xsl:apply-templates/></modsrdf:sub>
    </xsl:template>

    <xsl:template match="mods:partName">
      <modsrdf:partName><xsl:apply-templates/></modsrdf:partName>
    </xsl:template>

    <xsl:template match="mods:partNumber">
      <modsrdf:partNumber><xsl:apply-templates/></modsrdf:partNumber>
    </xsl:template>

    <!-- these next two shouldn't happen but they do -->
    
    <xsl:template match="mods:title/mods:partName">
      <xsl:text> - </xsl:text><xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="mods:title/mods:partNumber">
      <xsl:text> - </xsl:text><xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="mods:name">
      <xsl:variable name="uri">
        <xsl:call-template name="make_entity_uri"/>
      </xsl:variable>
  	  <xsl:variable name="clean_uri">
	    <xsl:call-template name="urify"><xsl:with-param name="dirty" select="$uri"/></xsl:call-template>
	  </xsl:variable>

      <xsl:choose>
       <xsl:when test="string-length(mods:role/mods:roleTerm) > 0">
        <xsl:for-each select="mods:role/mods:roleTerm">
         <xsl:variable name="name">
          <xsl:call-template name="normalize_element_name">
            <xsl:with-param name="dirty" select="."/>
          </xsl:call-template>
         </xsl:variable>
         <xsl:element name="role:{$name}">
           <xsl:attribute name="rdf:resource">&base;Entity#<xsl:value-of select="$clean_uri"/></xsl:attribute>
         </xsl:element>
        </xsl:for-each>
       </xsl:when>
       <xsl:otherwise>
         <role:creator rdf:resource="&base;Entity#{$clean_uri}"/>
       </xsl:otherwise>
      </xsl:choose>
    </xsl:template>

    <xsl:template match="mods:namePart">
      <xsl:choose>
        <xsl:when test="@type='date'">
          <modsrdf:dates><xsl:apply-templates/></modsrdf:dates>
        </xsl:when>
        <xsl:when test="@type='family'">
          <modsrdf:familyName><xsl:apply-templates/></modsrdf:familyName>
        </xsl:when>
        <xsl:when test="@type='given'">
          <modsrdf:givenName><xsl:apply-templates/></modsrdf:givenName>
        </xsl:when>
        <xsl:when test="@type='termsOfAddress'">
          <modsrdf:address><xsl:apply-templates/></modsrdf:address>
        </xsl:when>
        <xsl:otherwise>
          <modsrdf:fullName><xsl:apply-templates/></modsrdf:fullName>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:template>

    <xsl:template match="mods:displayForm">
      <modsrdf:displayForm><xsl:apply-templates/></modsrdf:displayForm>
    </xsl:template>

    <xsl:template match="mods:affiliation">
      <modsrdf:affiliation><xsl:apply-templates/></modsrdf:affiliation>
    </xsl:template>

    <xsl:template match="mods:description">
      <modsrdf:description><xsl:apply-templates/></modsrdf:description>
    </xsl:template>

    <xsl:template match="mods:physicalDescription">
      <modsrdf:physicalDescription>
        <modsrdf:Description>
          <xsl:apply-templates/>
        </modsrdf:Description>
      </modsrdf:physicalDescription>
    </xsl:template>

    <xsl:template match="mods:originInfo/mods:publisher">
     <modsrdf:publisher>
  	  <xsl:variable name="clean_uri">
	    <xsl:call-template name="urify"><xsl:with-param name="dirty" select="."/></xsl:call-template>
	  </xsl:variable>
       <modsrdf:Publisher rdf:about="&base;publisher/{$clean_uri}" modsrdf:value="{.}">
       <xsl:if test="../mods:place">
        <xsl:choose>
         <xsl:when test="../mods:place/mods:placeTerm[@type='code' and @authority]">
          <xsl:variable name="code"><xsl:value-of select="../mods:place/mods:placeTerm/@authority"/>/<xsl:value-of select="../mods:place/mods:placeTerm[@authority]"/></xsl:variable>
          <xsl:variable name="name"><xsl:value-of select="../mods:place/mods:placeTerm[@type='text']"/></xsl:variable>
          <modsrdf:location>
           <modsrdf:Place rdf:about="&base;place/{translate($code,' ','_')}" modsrdf:name="{$name}"/>
          </modsrdf:location>
         </xsl:when>
         <xsl:otherwise>
          <xsl:variable name="name"><xsl:value-of select="../mods:place/mods:placeTerm"/></xsl:variable>
          <modsrdf:location>
           <modsrdf:Place rdf:about="&base;place/{translate($name,' ','_')}" modsrdf:name="{$name}"/>
          </modsrdf:location>
         </xsl:otherwise>
        </xsl:choose>
       </xsl:if>
       </modsrdf:Publisher>
     </modsrdf:publisher>
    </xsl:template>
    
    <xsl:template match="mods:subject/mods:name">
      <xsl:variable name="uri">
        <xsl:call-template name="make_entity_uri"/>
      </xsl:variable>
  	  <xsl:variable name="clean_uri">
	    <xsl:call-template name="urify"><xsl:with-param name="dirty" select="$uri"/></xsl:call-template>
	  </xsl:variable>
      <modsrdf:subject rdf:resource="&base;Entity#{$clean_uri}"/>
    </xsl:template>
    
    <xsl:template match="mods:subject/mods:topic">
     <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <modsrdf:Topic rdf:about="&base;topic/{translate(.,' ','_')}" modsrdf:name="{.}"/>
        <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:geographic">
     <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <modsrdf:Place rdf:about="&base;place/{translate(.,' ','_')}" modsrdf:name="{.}"/>
        <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:temporal">
     <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <modsrdf:Era rdf:about="&base;era/{translate(.,' ','_')}" modsrdf:value="{.}"/>
        <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:titleInfo">
      <xsl:variable name="type">
       <xsl:call-template name="get_title_type"/>
      </xsl:variable>
      <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <rdf:Description>
          <rdf:type rdf:resource="&modsrdf;{$type}"/>
          <xsl:apply-templates/>
         </rdf:Description>
        <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:geographicCode">
     <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <modsrdf:Place rdf:about="&base;place/{translate(.,' ','_')}" modsrdf:code="{.}"/>
        <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:occupation">
     <modsrdf:subject>
       <!-- modsrdf:Subject>
        <xsl:if test="../@authority"><xsl:attribute name="modsrdf:authority"><xsl:value-of select="../@authority"/></xsl:attribute></xsl:if>
        <modsrdf:part -->
         <modsrdf:Occupation rdf:about="&base;occupation/{translate(.,' ','_')}" modsrdf:name="{.}"/>
         <!-- /modsrdf:part>
       </modsrdf:Subject -->
     </modsrdf:subject>
    </xsl:template>

    <xsl:template match="mods:subject/mods:hierarchicalGeographic">
     <!-- to be done -->
    </xsl:template>

    <xsl:template match="mods:subject/mods:cartographics">
     <!-- to be done -->
    </xsl:template>

    <xsl:template match="mods:relatedItem">
     <xsl:variable name="name">
      <xsl:choose>
       <xsl:when test="@type = 'preceding'">preceding</xsl:when>
       <xsl:when test="@type = 'succeeding'">succeeding</xsl:when>
       <xsl:when test="@type = 'original'">original</xsl:when>
       <xsl:when test="@type = 'host'">host</xsl:when>
       <xsl:when test="@type = 'constituent'">consituent</xsl:when>
       <xsl:when test="@type = 'series'">series</xsl:when>
       <xsl:when test="@type = 'otherVersion'">otherVersion</xsl:when>
       <xsl:when test="@type = 'otherFormat'">otherFormat</xsl:when>
       <xsl:when test="@type = 'isReferencedBy'">isReferencedBy</xsl:when>
       <xsl:otherwise>relatedTo</xsl:otherwise>
      </xsl:choose>
     </xsl:variable>
     
     <xsl:element name="modsrdf:{$name}">
       <modsrdf:Item>
         <xsl:if test="mods:identifier">
           <xsl:attribute name="rdf:about">&base;<xsl:value-of select="mods:identifier/@type"/>/<xsl:value-of select="translate(mods:identifier,' ','_')"/></xsl:attribute>
         </xsl:if>
         <xsl:apply-templates/>
       </modsrdf:Item>
     </xsl:element>
    </xsl:template>

    <xsl:template match="mods:relatedItem/mods:identifier"/>
    
    <xsl:template match="mods:relatedItem/mods:titleInfo">
      <xsl:variable name="type">
       <xsl:call-template name="get_title_type"/>
      </xsl:variable>
      <modsrdf:title>
       <rdf:Description>
        <rdf:type rdf:resource="&modsrdf;{$type}"/>
        <xsl:apply-templates/>
       </rdf:Description>
      </modsrdf:title>
    </xsl:template>

    <xsl:template match="mods:relatedItem/mods:name">
      <xsl:variable name="uri">
        <xsl:call-template name="make_entity_uri"/>
      </xsl:variable>
  	  <xsl:variable name="clean_uri">
	     <xsl:call-template name="urify"><xsl:with-param name="dirty" select="$uri"/></xsl:call-template>
	  </xsl:variable>
      <modsrdf:name rdf:resource="&base;Entity#{$clean_uri}"/>
    </xsl:template>
 
    <!-- ======================================================================= -->

    <!--+
        | Don't know what to find here so skip it. If you know what to find
        | you should probably import this stylesheet and overload this template
        +-->
    <xsl:template match="mods:extension"/>

    <!--+
        | Anything that is not explicitly consumed is filtered out
        +-->
    <xsl:template match="*"/>

</xsl:stylesheet>
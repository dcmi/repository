<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template name="knownResources">
	<xsl:param name="property" select="''"/>
	<xsl:param name="propertyOther" select="''"/>

<select name="property">
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/terms/audience'">
			<option selected="selected" value="http://purl.org/dc/terms/audience">dcterms:audience</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/terms/audience">dcterms:audience</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/contributor'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/contributor">dc:contributor</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/contributor">dc:contributor</option>
		</xsl:otherwise>
	</xsl:choose>
			
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/coverage'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/coverage">dc:coverage</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/coverage">dc:coverage</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/creator'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/creator">dc:creator</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/creator">dc:creator</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/date'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/date">dc:date</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/date">dc:date</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/description'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/description">dc:description</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/description">dc:description</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/format'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/format">dc:format</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/format">dc:format</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/identifier'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/identifier">dc:identifier</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/identifier">dc:identifier</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/language'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/language">dc:language</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/language">dc:language</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/publisher'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/publisher">dc:publisher</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/publisher">dc:publisher</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/relation'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/relation">dc:relation</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/relation">dc:relation</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/rights'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/rights">dc:rights</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/rights">dc:rights</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/terms/rightsHolder'">
			<option selected="selected" value="http://purl.org/dc/terms/rightsHolder">dcterms:rightsHolder</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/terms/rightsHolder">dcterms:rightsHolder</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/source'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/source">dc:source</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/source">dc:source</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/subject'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/subject">dc:subject</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/subject">dc:subject</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://purl.org/dc/elements/1.1/title'">
			<option selected="selected" value="http://purl.org/dc/elements/1.1/title">dc:title</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://purl.org/dc/elements/1.1/title">dc:title</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/1999/02/22-rdf-syntax-ns#type'">
			<option selected="selected" value="http://www.w3.org/1999/02/22-rdf-syntax-ns#type">rdf:type</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/1999/02/22-rdf-syntax-ns#type">rdf:type</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#comment'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#comment">rdfs:comment</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#comment">rdfs:comment</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#domain'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#domain">rdfs:domain</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#domain">rdfs:domain</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#range'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#range">rdfs:range</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#range">rdfs:range</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#isDefinedBy'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#isDefinedBy">rdfs:isDefinedBy</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#isDefinedBy">rdfs:isDefinedBy</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#label'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#label">rdfs:label</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#label">rdfs:label</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#seeAlso'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#seeAlso">rdfs:seeAlso</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#seeAlso">rdfs:seeAlso</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#subClassOf'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#subClassOf">rdfs:subClassOf</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#subClassOf">rdfs:subClassOf</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='http://www.w3.org/2000/01/rdf-schema#subPropertyOf'">
			<option selected="selected" value="http://www.w3.org/2000/01/rdf-schema#subPropertyOf">rdfs:subPropertyOf</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="http://www.w3.org/2000/01/rdf-schema#subPropertyOf">rdfs:subPropertyOf</option>
		</xsl:otherwise>
	</xsl:choose>
	
	<xsl:choose>
		<xsl:when test="$property='other'">
			<option selected="selected" value="other">other</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="other">other</option>
		</xsl:otherwise>
	</xsl:choose>	
</select>
&#160;&#160;(if other:)&#160;http://<input size="64" maxlength="128" type="text" name="propertyOther" value="{$propertyOther}" />

</xsl:template>

</xsl:stylesheet>

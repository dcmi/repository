<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:langInfo="org.dublincore.dcregistry.bean.languageBean"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg langInfo">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>
<xsl:include href="admin-common.xsl"/>

<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en_US'"/>
<xsl:param name="resultsLang" select="'en_US'"/>
<xsl:param name="location" select="'administration'"/>
<xsl:param name="itemType" select="'unknown'"/>
<!-- <xsl:param name="reqType" select="' '"/> -->
<xsl:param name="itemTarget" select="'unknown'"/>
<xsl:param name="docRoot" />

<xsl:variable name="ui" select="'ui'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="service" select="'/registry/preferenceServlet'"/>

<xsl:variable name="admin" select="'/dcregistry/adminServlet'"/>

<xsl:variable name="bundle">
    <xsl:choose>
	<xsl:when test="$uiStyle='rdf'">
	    <xsl:value-of select="'rdf'"/>
	</xsl:when>
	<xsl:otherwise>
	    <xsl:value-of select="'labels'"/>
	</xsl:otherwise>
    </xsl:choose>
</xsl:variable>

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>
<xsl:variable name="label_names" select="java:util.ResourceBundle.getBundle($bundle, $locale)"/>

<xsl:template match="/">
    <html>
    <head>
	<title>The Open Metadata Registry</title>
	<link type="text/css" rel="stylesheet" href="/dcregistry/css/default.css" />
    </head>	
    <body>
	<xsl:call-template name="banner">		
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>
	
	<p/>

	<h3>
	    <xsl:choose>
		<xsl:when test="$itemType = 'collection'">
		    Create a New Collection
		</xsl:when>
		<xsl:when test="$itemType = 'term'">
		    Define a New Term for "<xsl:value-of select="$itemTarget"/>"
		</xsl:when>
		<xsl:when test="$itemType = 'property'">
		    Add a New Property for "<xsl:value-of select="$itemTarget"/>"
		</xsl:when>
	    </xsl:choose>
	</h3>

	<!--
	    create and print table according to XML and parameters.
	-->
	<xsl:call-template name="printAddForm">
	    <xsl:with-param name="itemType" select="$itemType"/>
	</xsl:call-template>

	<p/>

	<!--
	    print a link to the collection / the term.
	-->
	<!--
	<xsl:choose>
	    <xsl:when test="$itemType = 'term'">
		[<a>
		    <xsl:attribute name="href">
			<xsl:value-of select="$admin"/>?reqType=detail&amp;itemType=collection&amp;item=
			<xsl:call-template name="_url_encode">
			    <xsl:with-param name="url" select="$itemTarget"/>
			</xsl:call-template>
		    </xsl:attribute>Back to the Collection
		</a>]
	    </xsl:when>
	    <xsl:when test="$itemType = 'property'">
		[<a>
		    <xsl:attribute name="href">
			<xsl:value-of select="$admin"/>?reqType=detail&amp;itemType=term&amp;item=
			<xsl:call-template name="_url_encode">
			    <xsl:with-param name="url" select="$itemTarget"/>
			</xsl:call-template>
		    </xsl:attribute>Back to the Term
		</a>]
	    </xsl:when>
	</xsl:choose>
	-->
	[<a href="JavaScript:history.back()">Back to Previous Page</a>]

	<!--
	    print a link to the top page.
	-->
	[<a href="{$admin}">Back to Top Page</a>]

	<p />

	<xsl:call-template name="footer" />
	
    </body>
    </html>
</xsl:template>

<xsl:template name="printAddForm">
    <xsl:param name="itemType"/>
    <form method="post" action="{$admin}">
	<!--
	    common parameters
	-->
	<input type="hidden" name="uiStyle" value="{$uiStyle}"/>
	<input type="hidden" name="uiLang" value="{$uiLang}"/>
	<input type="hidden" name="resultsLang" value="{$resultsLang}"/>
	<input type="hidden" name="itemType" value="{$itemType}"/>
	<input type="hidden" name="reqType" value="insert"/>
	<table>
	<xsl:choose>
	    <!--
		for collection.
		each element has a label name, an input field and type of the element.
	    -->
	    <xsl:when test="$itemType = 'collection'">
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_identifier'"/>
		    <xsl:with-param name="type" select="'resource'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_identifier')" />(URI):
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_title'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_title')"/> :
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_publisher'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_publisher')"/> :
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_description'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_description')"/> :
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_language'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_language')"/> :
		    </xsl:with-param>
		    <xsl:with-param name="docRoot" select="$docRoot"/>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_date'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_date')"/> :
		    </xsl:with-param>
		</xsl:call-template>
	    </xsl:when>
	    <xsl:when test="$itemType = 'term'">
		<!--
		    for term / scheme
		-->
		<input name="rdfs_isDefinedBy" value="{$itemTarget}" type="hidden" />
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_identifier'"/>
		    <xsl:with-param name="type" select="'resource'"/>
		    <xsl:with-param name="label" select="'Name :'"/>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'rdfs_label'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'rdfs_label')"/>:
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'rdfs_comment'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'rdfs_comment')"/>:
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_description'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_description')"/>:
		    </xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_language'"/>
		    <xsl:with-param name="label">
			<xsl:value-of select="java:getString($label_names,'dc_language')"/> :
		    </xsl:with-param>
		    <xsl:with-param name="value" select="rdf:RDF/rdf:Description[@rdf:about]/dc:language"/>
		    <xsl:with-param name="docRoot" select="$docRoot"/>
		</xsl:call-template>
	    </xsl:when>
	    <xsl:when test="$itemType = 'property'">
		<!--
		    property
		-->
		<input type="hidden" name="item" value="{$itemTarget}"/>
		<tr>
		    <td>Property Name: </td>
		    <td>
			<!-- this 'apply-templates' generate pull down menu to select a name of element -->
			<xsl:apply-templates select="rdf:RDF/rdf:Description[@rdf:about]"/>
		    </td>
		</tr>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'new_value'"/>
		    <xsl:with-param name="label">Value :</xsl:with-param>
		</xsl:call-template>
		<xsl:call-template name="printElement">
		    <xsl:with-param name="name" select="'dc_language'"/>
		    <xsl:with-param name="label">Language of the Property :</xsl:with-param>
		    <xsl:with-param name="value" select="rdf:RDF/rdf:Description[@rdf:about]/dc:language" />
		    <xsl:with-param name="docRoot" select="$docRoot"/>
		</xsl:call-template>
		<tr>
		    <td>Type of this Property: </td>
		    <td>
			<input name="dc_type" type="radio" value="literal" checked="checked" />Literal
			<input name="dc_type" type="radio" value="resource"/>Resource
		    </td>
		</tr>
	    </xsl:when>
	    <xsl:otherwise>
		no such item type...
		(<xsl:value-of select="$itemType"/>)
	    </xsl:otherwise>
	</xsl:choose>
	</table>
	<div>
	    <input type="submit" value="Add"/>
	    <input type="reset"/>
	</div>
    </form>
</xsl:template>

<!-- 
    this template will be called only in the case of 'add a new property'.
-->
<xsl:template match="rdf:Description[@rdf:about]">
    <xsl:variable name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()/dcq:references/@rdf:nodeID]/*[not(local-name() = 'type')]"/>
    <select name="predicate">
	<xsl:for-each select="$target">
	    <option>
		<xsl:attribute name="value">
		    <xsl:value-of select="@rdf:resource"/>
		</xsl:attribute>
		<xsl:value-of select="@rdf:resource"/>
	    </option>
	</xsl:for-each>
    </select>

    <!--
    <select name="predicate">
	<xsl:for-each select="*[not(local-name() = 'language')]">
	    <xsl:sort select="local-name()"/>
	    <option>
		<xsl:attribute name="value">
		    <xsl:call-template name="replace-predicate"/>
		</xsl:attribute>
		<xsl:value-of disable-output-escaping='yes' select="java:getString($label_names,local-name())"/>(<xsl:value-of select="translate(local-name(), '_', ':')"/>)
	    </option>
	</xsl:for-each>
    </select>
    -->
</xsl:template>

<xsl:template name="replace-predicate">
    <xsl:variable name="rdf_uri" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'"/>
    <xsl:variable name="rdfs_uri" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
    <xsl:variable name="dc_uri" select="'http://purl.org/dc/elements/1.1/'"/>
    <xsl:variable name="dcq_uri" select="'http://purl.org/dc/terms/'"/>
    <xsl:choose>
	<xsl:when test="starts-with(local-name(), 'dc_')">
	    <xsl:value-of select="concat($dc_uri, substring-after(local-name(), 'dc_'))"/>
	</xsl:when>
	<xsl:when test="starts-with(local-name(), 'dcq_')">
	    <xsl:value-of select="concat($dcq_uri, substring-after(local-name(), 'dcq_'))"/>
	</xsl:when>
	<xsl:when test="starts-with(local-name(), 'rdf_')">
	    <xsl:value-of select="concat($rdf_uri, substring-after(local-name(), 'rdf_'))"/>
	</xsl:when>
	<xsl:when test="starts-with(local-name(), 'rdfs_')">
	    <xsl:value-of select="concat($rdfs_uri, substring-after(local-name(), 'rdfs_'))"/>
	</xsl:when>
	<xsl:otherwise>
	    <xsl:text>ERROR</xsl:text>
	</xsl:otherwise>
    </xsl:choose>
</xsl:template>

<!--
    this template adds a type attribute to the element.
    if you define "dc_language" element, "_type_dc_language"
    element will be added to the result html.

    type := ['literal' | 'resource']
-->
<!--
<xsl:template name="printElement">
    <xsl:param name="name" select="''"/>
    <xsl:param name="label" select="''"/>
    <xsl:param name="type" select="'literal'"/>
    <tr>
	<td>
	    <input
		name="{concat('_type_', $name)}"
		value="{$type}"
		type="hidden"
	    />
	    <xsl:value-of disable-output-escaping="yes" select="$label"/>
	</td>
	<td>
	    <xsl:choose>
		<xsl:when test="$name = 'dc_language'">
		    <select name="dc_language">
			<xsl:apply-templates select="langInfo:getLanguages($ui, $docRoot)"/>
		    </select>
		</xsl:when>
		<xsl:otherwise>
		    <input name="{$name}" size="50"/>
		</xsl:otherwise>
	    </xsl:choose>
	</td>
    </tr>
</xsl:template>
-->

<xsl:template match="*">
	<b><xsl:value-of select="."/></b><br />	
</xsl:template>

</xsl:stylesheet>

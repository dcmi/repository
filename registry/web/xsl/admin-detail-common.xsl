<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/Registry#"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcq="http://purl.org/dc/terms/"
  xmlns:java="java" 
	exclude-result-prefixes="java rdf rdfs reg dc dcq">

<xsl:variable name="registry_uri" select="'http://dublincore.org/Registry#'" />

<xsl:template match="rdf:RDF">
    <xsl:apply-templates select="rdf:Description[@rdf:about]"/>
</xsl:template>

<xsl:template match="reg:bag">
    <xsl:apply-templates select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()/@rdf:nodeID]"/>
</xsl:template>

<xsl:template match="rdf:Description[@rdf:nodeID]">
    <xsl:variable name="bag_uri" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#Bag'"/>
    <xsl:choose>
	<xsl:when test="rdf:type/@rdf:resource = $bag_uri">
	    <xsl:variable name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()/reg:element[position()=1]/@rdf:nodeID]"/>
	    <xsl:choose>
		<xsl:when test="count(reg:element) &gt; 1 and $target/*[@xml:lang]">
		    <xsl:call-template name="print_elements_using_lang_select"/>
		</xsl:when>
		<xsl:otherwise>
		    <xsl:call-template name="print_elements"/>
		</xsl:otherwise>
	    </xsl:choose>
	</xsl:when>
	<xsl:otherwise>
	    <xsl:message>[Error] check the template for rdf:Description[@rdf:nodeID]</xsl:message>
	</xsl:otherwise>
    </xsl:choose>
</xsl:template>

<xsl:template name="printAddProperty">
    <xsl:variable name="encoded_item">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="/rdf:RDF/rdf:Description/@rdf:about"/>
	</xsl:call-template>
    </xsl:variable>
    [<a>
	<xsl:attribute name="href">
	    <xsl:value-of select="concat('/dcregistry/adminServlet?reqType=add', '&amp;', 'itemType=property', '&amp;', 'item=', $encoded_item)"/>
	</xsl:attribute>
	Add a New Property
    </a>]
</xsl:template>

<xsl:template match="rdfs:*">
    <b><xsl:value-of disable-output-escaping='yes' select="java:getString($label_names,concat('rdfs_',local-name()))"/></b>
</xsl:template>

<xsl:template match="rdf:*">
    <b><xsl:value-of disable-output-escaping='yes' select="java:getString($label_names,concat('rdf_',local-name()))"/></b>
</xsl:template>

<xsl:template match="dc:*">
    <b><xsl:value-of disable-output-escaping='yes' select="java:getString($label_names,concat('dc_',local-name()))"/></b>
</xsl:template>

<xsl:template match="dcq:*">
    <b><xsl:value-of disable-output-escaping='yes' select="java:getString($label_names,concat('dcq_',local-name()))"/></b>
</xsl:template>

<xsl:template match="*">
    <b><xsl:value-of disable-output-escaping='yes' select="local-name()"/></b>
</xsl:template>

<xsl:template name="printEditDelete">
    <xsl:variable name="encoded_item">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="/rdf:RDF/rdf:Description[@rdf:about]/@rdf:about"/>
	</xsl:call-template>
    </xsl:variable>
    <xsl:variable name="encoded_predicate">
	<xsl:call-template name="_url_encode">
	    <xsl:with-param name="url" select="concat(namespace-uri(), local-name())"/>
	</xsl:call-template>
    </xsl:variable>

    <a>
	<xsl:attribute name="href">
	    <xsl:value-of select="concat('/dcregistry/adminServlet?reqType=edit', '&amp;', 'itemType=property', '&amp;', 'item=', $encoded_item, '&amp;', 'predicate=', $encoded_predicate, '&amp;', 'sid=', ../reg:sid)"/>
	</xsl:attribute>
	<img src="/dcregistry/images/admin-edit.gif" alt="[Edit]" border="0" />
    </a>

    <a>
	<xsl:attribute name="href">
	    <xsl:value-of select="concat('/dcregistry/adminServlet?reqType=delete', '&amp;', 'itemType=property', '&amp;', 'item=', $encoded_item, '&amp;', 'predicate=', $encoded_predicate, '&amp;', 'sid=', ../reg:sid)"/>
	</xsl:attribute>
	<img src="/dcregistry/images/admin-delete.gif" alt="[Delete]" border="0" />
    </a>
</xsl:template>

<xsl:template name="set-label">
    <xsl:param name="target" select="''"/>
    <xsl:apply-templates select="$target/*[namespace-uri()!=$registry_uri]"/>
</xsl:template>

<xsl:template name="set-value">
    <xsl:param name="target" select="''"/>
    <!--
    <xsl:for-each select="$target/*[local-name()!='sid']">
	<xsl:variable name="lg" select="translate(@xml:lang,'-','_')"/>
        <div id="{$target/reg:sid}">
            <xsl:if test="not($lg = $uiLang)">
                <xsl:attribute name="style">display:none;</xsl:attribute>
            </xsl:if>
            <xsl:call-template name="literal-resource"/>
        </div>
    </xsl:for-each>
    -->
    <xsl:for-each select="$target/*[namespace-uri()!=$registry_uri]">
        <div id="{$target/reg:sid}">
            <xsl:if test="not($target/reg:default)">
                <xsl:attribute name="style">display:none;</xsl:attribute>
            </xsl:if>
            <xsl:call-template name="literal-resource"/>
        </div>
    </xsl:for-each>
</xsl:template>

<xsl:template name="set-links">
    <xsl:param name="target" select="''"/>
    <!--
    <xsl:for-each select="$target/*[local-name()!='sid']">
	<xsl:variable name="lg" select="translate(@xml:lang,'-','_')"/>
        <div id="{$target/reg:sid}">
            <xsl:if test="not($lg = $uiLang)">
                <xsl:attribute name="style">display:none;</xsl:attribute>
            </xsl:if>
            <xsl:call-template name="printEditDelete"/>
        </div>
    </xsl:for-each>
    -->
    <xsl:for-each select="$target/*[namespace-uri()!=$registry_uri]">
        <div id="{$target/reg:sid}">
            <xsl:if test="not($target/reg:default)">
                <xsl:attribute name="style">display:none;</xsl:attribute>
            </xsl:if>
            <xsl:call-template name="printEditDelete"/>
        </div>
    </xsl:for-each>
</xsl:template>

<xsl:template name="set-xml-lang">
    <xsl:param name="target" select="''"/>
    <!--
    <xsl:for-each select="$target/*[local-name()!='sid']">
	<xsl:variable name="lg" select="translate(@xml:lang,'-','_')"/>
        <option value="{$target/reg:sid}">
            <xsl:if test="$lg = $uiLang">
		<xsl:attribute name="selected">selected</xsl:attribute>
	    </xsl:if>
	    <xsl:value-of select="@xml:lang"/>
	</option>
    </xsl:for-each>
    -->
    <xsl:for-each select="$target/*[namespace-uri()!=$registry_uri]">
        <option value="{$target/reg:sid}">
            <xsl:if test="$target/reg:default">
		<xsl:attribute name="selected">selected</xsl:attribute>
	    </xsl:if>
	    <xsl:value-of select="@xml:lang"/>
	</option>
    </xsl:for-each>
</xsl:template>

<xsl:template name="print_elements">
    <!-- 
	targets may be a node set.
    -->
    <xsl:variable name="targets" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()/reg:element/@rdf:nodeID]"/>
    <!--<xsl:for-each select="$targets/*[local-name()!='sid' and local-name()!='default']">-->
    <xsl:for-each select="$targets/*[namespace-uri()!=$registry_uri]">
        <tr>
            <td>
                <xsl:apply-templates select="."/>
            </td>
            <td>
                <xsl:call-template name="literal-resource"/>
            </td>
            <td>
                <xsl:choose>
                    <xsl:when test="@xml:lang">
                        <xsl:value-of select="@xml:lang"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:text>-</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </td>
            <td>
                <xsl:call-template name="printEditDelete"/>
            </td>
        </tr>
    </xsl:for-each>
</xsl:template>

<xsl:template name="print_elements_using_lang_select">
    <!--
    <xsl:variable name="nodeIDs" select="reg:element/@rdf:nodeID"/>
    <xsl:variable name="descs" select="/rdf:RDF/rdf:Description"/>
    -->
    <tr>
        <!-- Property Name -->
        <td>
            <xsl:call-template name="set-label">
                <xsl:with-param name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()/reg:element[position()=1]/@rdf:nodeID]"/>
            </xsl:call-template>
        </td>
        <!-- Value -->
        <td>
            <xsl:for-each select="reg:element/@rdf:nodeID">
                <xsl:call-template name="set-value">
                    <xsl:with-param name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()]"/>
                </xsl:call-template>
            </xsl:for-each>
        </td>
        <!-- xml:lang -->
        <td>
            <select onChange="select_lang(this)">
		<xsl:for-each select="reg:element/@rdf:nodeID">
                    <xsl:call-template name="set-xml-lang">
                        <xsl:with-param name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()]"/>
                    </xsl:call-template>
                </xsl:for-each>
            </select>
	    (<xsl:value-of select="count(reg:element)"/>)
        </td>
        <!-- edit/delete -->
        <td>
	    <xsl:for-each select="reg:element/@rdf:nodeID">
                <xsl:call-template name="set-links">
                    <xsl:with-param name="target" select="/rdf:RDF/rdf:Description[@rdf:nodeID=current()]"/>
                </xsl:call-template>
            </xsl:for-each>
        </td>
    </tr>
</xsl:template>

</xsl:stylesheet>

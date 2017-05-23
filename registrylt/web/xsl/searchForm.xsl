<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	xmlns:dc="http://purl.org/dc/elements/1.1/"
	xmlns:dcq="http://purl.org/dc/terms/"
	xmlns:dcreg="http://dublincore.org/dcregistrylt/">

<xsl:template name="searchForm">
	<xsl:param name="action"/>
	<xsl:param name="searchTerm" select="''"/>
	<xsl:param name="searchCase" select="'N'"/>
	<xsl:param name="searchType" select="'exact phrase'"/>
	<xsl:param name="reqType"/>
	
	<xsl:variable name="navigate" select="$strs/str[@name='navigate']" />
	<xsl:variable name="search" select="$strs/str[@name='search']" />
	<xsl:variable name="reset" select="$strs/str[@name='reset']" />
	<xsl:variable name="extensions" select="document('../RDF/extensions/extensions.rdf')/rdf:RDF"/>

	<xsl:if test="$action='search'">
		<h1><xsl:value-of select="$strs/str[@name='searchtheregistry']"/></h1>
		<p/>
		<form name="form1" action="/dcregistrylt/searchServlet" method="post">
		
		<table cellspacing="0" class="border">
		<tr>
		<th style="text-align:right;">
		<xsl:value-of select="$strs/str[@name='search_for']"/>&#160;
		</th>
		
		<td>
		<input size="40" maxlength="40" type="text" name="searchTerm" value="{$searchTerm}"/>
				
		
		</td></tr> 
		<tr><th style="text-align:right;">
		<xsl:value-of select="$strs/str[@name='case_sensitive']"/>
		</th>
		
		<td>
		<xsl:choose>
			<xsl:when test="$searchCase='Y'">
				<input type="radio" name="searchCase" value="N" /> <xsl:value-of select="$strs/str[@name='no']"/>			
				&#160;<input type="radio" name="searchCase" value="Y" checked="checked" /> <xsl:value-of select="$strs/str[@name='yes']"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchCase" value="N" checked="checked" /> <xsl:value-of select="$strs/str[@name='no']"/>
				&#160;<input type="radio" name="searchCase" value="Y" /> <xsl:value-of select="$strs/str[@name='yes']"/>	
			</xsl:otherwise>
		</xsl:choose>
		</td></tr> 
		<tr>
		<th style="text-align:right;">
		<xsl:value-of select="$strs/str[@name='display_results']"/>
		</th>
		
		<td>
		<xsl:choose>
			<xsl:when test="$searchType='all terms'">
				<input type="radio" name="searchType" value="exact phrase" /><xsl:value-of select="$strs/str[@name='exact_phrase']"/>
				&#160;<input type="radio" name="searchType" value="all terms" checked="checked" /><xsl:value-of select="$strs/str[@name='all_terms']"/>
				&#160;<input type="radio" name="searchType" value="any term" /><xsl:value-of select="$strs/str[@name='any_term']"/>
			</xsl:when>
			<xsl:when test="$searchType='any term'">
				<input type="radio" name="searchType" value="exact phrase" /><xsl:value-of select="$strs/str[@name='exact_phrase']"/>
				&#160;<input type="radio" name="searchType" value="all terms" /><xsl:value-of select="$strs/str[@name='all_terms']"/>
				&#160;<input type="radio" name="searchType" value="any term" checked="checked" /><xsl:value-of select="$strs/str[@name='any_term']"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchType" value="exact phrase" checked="checked" /><xsl:value-of select="$strs/str[@name='exact_phrase']"/>
				&#160;<input type="radio" name="searchType" value="all terms" /><xsl:value-of select="$strs/str[@name='all_terms']"/>
				&#160;<input type="radio" name="searchType" value="any term" /><xsl:value-of select="$strs/str[@name='any_term']"/>
			</xsl:otherwise>
		</xsl:choose>
		</td></tr>
		
		<tr><th style="text-align:right;">&#160;</th>
		<td>
		<input class="button2" type="submit" value="{$search}"/>&#160;<input class="button2" type="reset" value="{$reset}"/>
		</td></tr> 
		</table>
		<input type="hidden" name= "reqType" value="search" />
		</form>	
	</xsl:if>
	
	<xsl:if test="$action='navigate'">	
		<h1><xsl:value-of select="$strs/str[@name='browsetheregistry']"/></h1>	  
		<p/>
		<form name="form2" action="/dcregistrylt/navigateServlet" method="post">
		
		<table cellspacing="0" class="border">
		<tr><th style="text-align:right;">
		<xsl:value-of select="$strs/str[@name='display']"/>&#160;
		</th>
		
		<td>
		<select name="reqType">
			<xsl:for-each select="$extensions/rdf:Description">
				<xsl:sort select ="./dcreg:seq_number"/>
				<xsl:variable name="label" select="./rdfs:label" />
				<xsl:variable name="class" select="./dcreg:class" />
				<xsl:variable name="url" select="concat($class, '?label=', $label)" />
				<option value="{$url}"><xsl:value-of select="$strs/str[@name=$label]"/></option>
			</xsl:for-each>
		</select>
		
		&#160;
		<input class="button2" type="submit" value="{$navigate}"/>
				
		</td></tr>
		</table>
		<input type="hidden" name= "action" value="navigate" />
		</form>
	</xsl:if>

</xsl:template>

</xsl:stylesheet>

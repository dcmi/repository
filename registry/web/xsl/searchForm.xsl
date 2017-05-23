<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:dc="http://purl.org/dc/elements/1.1/"
	xmlns:dcq="http://purl.org/dc/terms/"
	xmlns:extInfo="org.dublincore.dcregistry.bean.extensionsBean"
	xmlns:java="java" >

<xsl:include href="getSupportedLanguages.xsl"/>

<xsl:template name="searchForm">
	<xsl:param name="action"/>
	<xsl:param name="searchTerm"/>
	<xsl:param name="searchCase"/>
	<xsl:param name="searchType"/>
	<xsl:param name="reqType"/>
	<xsl:param name="uiLang"/>
	<xsl:param name="language"/>
	<xsl:param name="rsLang"/>
	<xsl:param name="uiStyle"/>
	<xsl:param name="docRoot"/>

	<xsl:if test="$action='search'">
		<p/>
		<h1><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'searchtheregistry')"/></h1>
		<p/>
		<form name="form1" action="/dcregistry/searchServlet" method="post">
		
		<table cellspacing="0" class="border">
		<tr>
		<th style="text-align:right;">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'search_for')"/>&#160;
		</th>
		
		<td>
		<input size="40" maxlength="40" type="text" name="searchTerm" value="{$searchTerm}"/>
				
		
		</td></tr>
		<tr><th style="text-align:right;">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'case_sensitive')"/>
		</th>
		
		<td>
		<xsl:choose>
			<xsl:when test="$searchCase='N'">			
				<input type="radio" name="searchCase" value="N" checked="checked" /> <xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'no')"/>					
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchCase" value="N" /> <xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'no')"/>
			</xsl:otherwise>
		</xsl:choose>
	
		<xsl:choose>
			<xsl:when test="$searchCase='Y'">			
				<input type="radio" name="searchCase" value="Y" checked="checked" /> <xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'yes')"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchCase" value="Y" /> <xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'yes')"/>
			</xsl:otherwise>
		</xsl:choose>
		</td></tr>
		<tr>
		<th style="text-align:right;">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'display_results')"/>
		</th>
		
		<td>
		<xsl:choose>
			<xsl:when test="$searchType='exact phrase'">			
				<input type="radio" name="searchType" value="exact phrase" checked="checked" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'exact_phrase')"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchType" value="exact phrase" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'exact_phrase')"/>
			</xsl:otherwise>
		</xsl:choose>
	
		<xsl:choose>
			<xsl:when test="$searchType='all terms'">			
				<input type="radio" name="searchType" value="all terms" checked="checked" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'all_terms')"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchType" value="all terms" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'all_terms')"/>
			</xsl:otherwise>
		</xsl:choose>
	
		<xsl:choose>
			<xsl:when test="$searchType='any term'">			
				<input type="radio" name="searchType" value="any term" checked="checked" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'any_term')"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="searchType" value="any term" /><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'any_term')"/>
			</xsl:otherwise>
		</xsl:choose>
		</td></tr>
		
		<tr><th style="text-align:right;">&#160;</th>
		<td>
		<xsl:text disable-output-escaping='yes'>&lt;input class="button" value="</xsl:text>
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'submit')"/>
		<xsl:text disable-output-escaping='yes'>" type="submit" /&gt;</xsl:text>
		<xsl:text disable-output-escaping='yes'>&#160;&#160;&#160;</xsl:text>
		<xsl:text disable-output-escaping='yes'>&lt;input class="button" value="</xsl:text>
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'reset')"/>
		<xsl:text disable-output-escaping='yes'>" type="reset" /&gt;</xsl:text>	
		</td></tr>
		</table>
		<input type="hidden" name= "reqType" value="search" />
		</form>	
	</xsl:if>
	
	<xsl:if test="$action='navigate'">	
		<p/>
		<h1><xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'browsetheregistry')"/></h1>	  
		<p/>
		<form name="form2" action="/dcregistry/navigateServlet" method="post">
		
		<table cellspacing="0" class="border">
		<tr><th style="text-align:right;">
		<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'display')"/>&#160;
		</th>
		
		<td>
		<select name="reqType">
			<xsl:apply-templates select="extInfo:getExtensions($uiStyle, $docRoot)"/>
		</select>
		
		&#160;
		<xsl:text disable-output-escaping='yes'>&lt;input class="button" value="</xsl:text>
			<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,'navigate')"/>
		<xsl:text disable-output-escaping='yes'>" type="submit" /&gt;</xsl:text>
				
		</td></tr>
		</table>
		<input type="hidden" name= "reqType" value="search" />
		</form>
	</xsl:if>

</xsl:template>


<xsl:template match="services">

	<xsl:for-each select="extension">
		<xsl:sort select="."/>
		<xsl:variable name="display_value">
			<xsl:value-of select="substring(substring-before(., ','), 4)"/>
		</xsl:variable>
		
		<xsl:variable name="extension">
			<xsl:value-of select="substring-after(., ',')"/>
		</xsl:variable>
	
		<xsl:choose>
			<xsl:when test="$reqType=substring-before($extension, 'Servlet')">
				<option value="{$extension}" selected="selected">
					<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,$display_value)"/>
				</option>					
			</xsl:when>
			<xsl:otherwise>
				<option value="{$extension}">
					<xsl:value-of disable-output-escaping='yes' select="java:getString($resources,$display_value)"/>	
				</option>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:for-each>
	
</xsl:template>

</xsl:stylesheet>

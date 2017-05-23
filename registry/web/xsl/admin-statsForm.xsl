<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:java="java" exclude-result-prefixes="java langInfo" >

<xsl:template name="admin-statsForm">
	<xsl:param name="dir" select="''"/>
	<xsl:param name="appPfx" select="''"/>
	<xsl:param name="soapPfx" select="''"/>
	<xsl:param name="restPfx" select="''"/>
	<xsl:param name="dateType" select="'1'"/>
	<xsl:param name="bYear" select="''"/>
	<xsl:param name="bMonth" select="''"/>
	<xsl:param name="bDay" select="''"/>
	<xsl:param name="eYear" select="''"/>
	<xsl:param name="eMonth" select="''"/>
	<xsl:param name="eDay" select="''"/>
	
	<p/>
	<h1>View Registry Statistics</h1>
	<p />
	<form action="/dcregistry/adminStatsServlet" method="post">
	<table cellspacing="0" class="border">
	
	<tr>
	<th style="text-align:right;">Log Directory</th>
	<td><input size="64" maxlength="128" type="text" name="dir" value="{$dir}"/></td>
	</tr>
	
	<tr>
	<th style="text-align:right;">Web Log Prefix</th>
	<td><input size="32" maxlength="32" type="text" name="appPfx" value="{$appPfx}"/></td>
	</tr>
	
	<tr>
	<th style="text-align:right;">SOAP Log Prefix</th>
	<td><input size="32" maxlength="32" type="text" name="soapPfx" value="{$soapPfx}"/></td>
	</tr>
	
	<tr>
	<th style="text-align:right;">REST Log Prefix</th>
	<td><input size="32" maxlength="32" type="text" name="restPfx" value="{$restPfx}"/></td>
	</tr>
	
	<tr>
	<th style="text-align:right;">Reporting Period</th>
	<td>
	<table cellspacing="0" width="100%" class="noborder">
	<tr><td align="center" width="4%">
		<xsl:choose>
			<xsl:when test="$dateType='1'"> 
				<input type="radio" name="dateType" checked="checked" value="1"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="dateType" value="1"/>
			</xsl:otherwise>
		</xsl:choose>
	</td><td align="left" width="96%" colspan="2">
		Last 30 days
	</td></tr>
	<tr><td align="center" width="4%">
		<xsl:choose>
			<xsl:when test="$dateType='2'"> 
				<input type="radio" name="dateType" checked="checked" value="2"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="dateType" value="2"/>
			</xsl:otherwise>
		</xsl:choose>
	</td><td align="left" width="96%" colspan="2">
		Month-to-date
	</td></tr>
	<tr><td align="center" width="4%">
		<xsl:choose>
			<xsl:when test="$dateType='3'"> 
				<input type="radio" name="dateType" checked="checked" value="3"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="dateType" value="3"/>
			</xsl:otherwise>
		</xsl:choose>
	</td><td align="left" width="96%" colspan="2">
		Year-to-date
	</td></tr>
	<tr><td align="center" width="4%">
		<xsl:choose>
			<xsl:when test="$dateType='4'"> 
				<input type="radio" name="dateType" checked="checked" value="4"/>
			</xsl:when>
			<xsl:otherwise>
				<input type="radio" name="dateType" value="4"/>
			</xsl:otherwise>
		</xsl:choose>
	</td><td align="center" width="48%">
		<xsl:call-template name="date-fmt2">		
			<xsl:with-param name="bYear" select="$bYear" />
			<xsl:with-param name="bMonth" select="$bMonth" />
			<xsl:with-param name="bDay" select="$bDay" />
		</xsl:call-template>
		<br/><font size="1">Begin Date (yyyy-mm-dd)</font>
	</td><td align="center" width="48%">
		<xsl:call-template name="date-fmt3">		
			<xsl:with-param name="eYear" select="$eYear" />
			<xsl:with-param name="eMonth" select="$eMonth" />
			<xsl:with-param name="eDay" select="$eDay" />
		</xsl:call-template>
		<br/><font size="1">End Date (yyyy-mm-dd)</font>
	</td></tr>
	</table></td></tr>
	
	<tr>
	<th style="text-align:right;">&#160;</th>
	<td><input value="Submit" class="button" type="submit" />&#160;&#160;<input class="button" value="Reset" type="reset" /></td>
	</tr>

	</table>
	<input type="hidden" name="reqType" value="overview" />
	</form>
	
	<p />
	
</xsl:template>

</xsl:stylesheet>

<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >

<xsl:template name="banner">
<xsl:param name="action"/>
<xsl:param name="uiLang" select="'en-US'"/>

<div class="header">
<table width="100%" cellspacing="0" cellpadding="0" bgcolor="#6699CC">
	<tr><td width="350">
	<a href="/index.shtml"><img src="images/logo_registrylite.gif" width="150" height="70" alt="Dublin Core Metadata Initiative logo" /></a><br />
	<a href="/index.shtml"><img src="images/title_registrylite.gif" width="390" height="50" alt="The Dublin Core Metadata Registry" /></a>
	</td><td width="100%" style="padding: 10px 10px 0 0; text-align: right;">
	<a href="/dcregistrylt/pageDisplayServlet?page=about.xsl" class="registry">
	<xsl:value-of select="$strs/str[@name='about']"/></a><br />		
	<a href="/dcregistrylt/navigateServlet" class="registry">
	<xsl:value-of select="$strs/str[@name='navigate']"/> |
	<xsl:value-of select="$strs/str[@name='search']"/></a><br />
	<a href="/dcregistrylt/adminServlet" class="registry">
	<xsl:value-of select="$strs/str[@name='login']"/></a><br />
	<a href="/dcregistrylt/pageDisplayServlet?page=help_en-US.xsl" class="registry">
	<xsl:value-of select="$strs/str[@name='help']"/></a><br /><br />
	<span class="registry">v 1.0.0</span>
	</td></tr>
</table>

<xsl:choose>
	<xsl:when test="$action='search'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td>
		<a href="/dcregistrylt/navigateServlet">
		<xsl:value-of select="$strs/str[@name='navigate']"/></a> 
		| <xsl:value-of select="$strs/str[@name='search']"/>
		</td><td style="text-align: right;">
		<xsl:call-template name="print_language_prefs">
			<xsl:with-param name="action" select="$action" />
		</xsl:call-template>
		</td></tr></table>
	</xsl:when>
	<xsl:when test="$action='navigate'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td>
		<xsl:value-of select="$strs/str[@name='navigate']"/>
		| <a href="/dcregistrylt/queryServlet">
		<xsl:value-of select="$strs/str[@name='search']"/></a>
		</td><td style="text-align: right;">
		<xsl:call-template name="print_language_prefs">
			<xsl:with-param name="action" select="$action" />
		</xsl:call-template>		
		</td></tr></table>
	</xsl:when>
	<xsl:when test="$action='administration'">
		<table width="100%" cellspacing="0" cellpadding="6">
		<tr><td class="crumb"><a href="/dcregistrylt/pageDisplayServlet?page=adminHelp.xsl">Help</a></td></tr>
		</table>
	</xsl:when>
	
	<xsl:otherwise/>
</xsl:choose>
</div>

</xsl:template>

<xsl:template name="print_language_prefs">
	<xsl:param name="action"/>
	<xsl:variable name="submit" select="$strs/str[@name='submit']" />
	<form name="form2" action="/dcregistrylt/preferenceServlet" method="post">
		<xsl:value-of select="$strs/str[@name='language']"/>:&#160;
		<select name="uiLang">		
			<xsl:for-each select="document('../xml/supportedLanguages.xml')/languages/ui/lang">
				<xsl:choose>
					<xsl:when test="$uiLang=@RFC3066">
						<option selected="selected" value="{@RFC3066}">
							<xsl:value-of select="."/>
						</option>
					</xsl:when>
					<xsl:otherwise>
						<option value="{@RFC3066}">
							<xsl:value-of select="."/>
						</option>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</select>&#160;
		<input class="button2" type="submit" value="{$submit}"/>
		<input type="hidden" name="action" value="{$action}" />
	</form>
</xsl:template>

</xsl:stylesheet>

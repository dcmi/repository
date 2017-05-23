<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="importForm">
	<xsl:param name="fileURL"/>
	<xsl:param name="schemaURI"/>
	<xsl:param name="title"/>
	<xsl:param name="description"/>
	<xsl:param name="publisher"/>
	<xsl:param name="language"/>
	<xsl:param name="relatedDoc"/>
	<xsl:param name="year"/>
	<xsl:param name="month"/>
	<xsl:param name="day"/>

	<form action="/dcregistry/importServlet" method="post">
		<table width="60%" cellspacing="5" cellpadding="2" border="0" bgcolor="EEEEEE">
		<tr><td valign="left" width="25%">
		File URL<sup>*</sup>
		</td><td align="left" width="75%">
		<input size="65" maxlength="65" type="text" name="fileURL" value="{$fileURL}" />
		</td></tr>
	
		<tr><td valign="left" width="25%">
		Schema URI
		</td><td align="left" width="75%">
		<input size="65" maxlength="65" type="text" name="schemaURI" value="{$schemaURI}" />
		</td></tr>
		
		<tr><td valign="left" width="25%">
		Title<sup>*</sup>
		</td><td align="left" width="75%">
		<input size="65" maxlength="65" type="text" name="title" value="{$title}" />
		</td></tr>
		
		<tr><td valign="left" width="25%">
		Description<sup>*</sup>
		</td><td align="left" width="75%">
		<input size="65" maxlength="250" type="text" name="description" value="{$description}" />
		</td></tr>
		
		<tr><td valign="left" width="25%">
		Publisher<sup>*</sup>
		</td><td align="left" width="75%">
		<input size="65" maxlength="65" type="text" name="publisher" value="{$publisher}" />
		</td></tr>
	
		<tr><td valign="left" width="25%">
		Language
		</td><td align="left" width="75%">
		<select name="language">
			<xsl:choose>
				<xsl:when test="$language='en-US'">	
					<option selected="selected" value="en-US">en-US</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="en-US">en-US</option>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="$language='ja-JP'">	
					<option selected="selected" value="ja-JP">ja-JP</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="ja-JP">ja-JP</option>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="$language='de-DE'">	
					<option selected="selected" value="de-DE">de-DE</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="de-DE">de-DE</option>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="$language='ko-KR'">	
					<option selected="selected" value="ko-KR">ko-KR</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="ko-KR">ko-KR</option>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="$language='es-SP'">	
					<option selected="selected" value="es-SP">es-SP</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="es-SP">es-SP</option>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:choose>
				<xsl:when test="$language='zh-CN'">	
					<option selected="selected" value="zh-CN">zh-CN</option>
				</xsl:when>
				<xsl:otherwise>
					<option value="zh-CN">zh-CN</option>
				</xsl:otherwise>
			</xsl:choose>

		</select>  (use xml:lang attribute to override)
		</td></tr>
		
		<tr><td valign="left" width="25%">
		URI of Related Document
		</td><td align="left" width="75%">
		<input size="65" maxlength="65" type="text" name="relatedDoc" value="{$relatedDoc}" />
		</td></tr>
		
		<tr><td valign="left" width="25%">
		Date<sup>*</sup>
		</td><td align="left" width="75%">
		Year <input size="4" maxlength="4" type="text" name="year" value="{$year}" />
		Month <input size="2" maxlength="2" type="text" name="month" value="{$month}" />
		Day <input size="2" maxlength="2" type="text" name="day" value="{$day}" />
		</td></tr>
		
		<tr><td valign="left" width="25%">
		<xsl:text>  </xsl:text>
		</td><td align="left" width="75%">					
		<input value="Submit" type="submit" /><xsl:text>  </xsl:text><input value="Reset" type="reset" />
		</td></tr>
		</table>
		Note: * denotes required fields
		<input type="hidden" name="reqType" value="import" />
	</form>

</xsl:template>

</xsl:stylesheet>

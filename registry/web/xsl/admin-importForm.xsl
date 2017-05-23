<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:java="java" >

<xsl:template name="importForm">
    <xsl:param name="schemaURL"/>
    <xsl:param name="dir"/>

    <h1>Import Utility</h1>
    <form action="/dcregistry/importRDFServlet" method="post" enctype="multipart/form-data">
    	<table cellspacing="0" class="border">
	<tr><th align="left">
	URL
	</th><td align="left">
	<input size="64" maxlength="128" type="text" name="schemaURL" value="{$schemaURL}" />	
	</td></tr>

	<tr><th align="left">
	File
	</th><td align="left">
	<input name="fileData" type="file" size="64" maxlength="128" accept="text/rdf"/>
	</td></tr>
	
	<tr><th align="left">
	Directory
	</th><td align="left">
	<input size="64" maxlength="128" type="text" name="dir" value="{$dir}" />	
	</td></tr>
	
	<tr><th align="left" valign="top">
	Target Model
	</th><td align="left">
	<input name="targetModel" type="radio" value="registry" CHECKED="CHECKED"/>&#160;registry
	<br/><input name="targetModel" type="radio" value="provenance"/>&#160;provenance
	<br/><input name="targetModel" type="radio" value="account" DISABLED="DISABLED"/>&#160;account
	<br/><input name="targetModel" type="radio" value="translations" DISABLED="DISABLED"/>&#160;translations
	<br/><input name="targetModel" type="radio" value="collection" DISABLED="DISABLED"/>&#160;collection
	<br/><input name="targetModel" type="radio" value="remote" DISABLED="DISABLED"/>&#160;remote
	<br/><input name="targetModel" type="radio" value="canonical" DISABLED="DISABLED"/>&#160;canonical
	</td></tr>
	
	<tr><th align="left">
	&#160;
	</th><td align="left">
	<input value="Submit" type="submit" />&#160;&#160;<input value="Reset" type="reset" />
	</td></tr>
	</table>
	
	<input type="hidden" name="reqType" value="import" />
	</form>
    
</xsl:template>

</xsl:stylesheet>

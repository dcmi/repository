<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="loginForm">
	
<form name="loginform" action="/dcregistry/adminLoginServlet" method="post">
<input value="login" name="reqType" type="hidden" />
<table cellspacing="0" class="border">
<tr>
<th style="text-align:right;">Account:</th>
<td><input type="text" name="account" value="" size="30" /></td>
</tr>
<tr>

<th style="text-align:right;">Password:</th>
<td><input type="password" name="password" value="" size="30" /></td>
</tr>
<tr>
<th style="text-align:right;">&#160;</th>
<td><input type="submit" value="Login" class="button" /></td>
</tr>
</table>
</form>

</xsl:template>

</xsl:stylesheet>

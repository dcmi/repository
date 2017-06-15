
		<!--Versión en español-->
		
<html>
<head>
	<title>DC2005</title>	 
	<link rel="StyleSheet" type="text/css" href="estilos/estilos.css">
<script language="javaScript">
<!--
	function estaTodoBien()
	{
		if (document.f.email.value=='')
		{
			document.f.email.focus();			
			return false;
		}
		if (!esValidoEmail(document.f.email))
		{
			alert('Your email address is not valid');
			document.f.email.focus();
			return false;			
		}
		else if (document.f.email.value.indexOf('\'')!=-1 || document.f.email.value.indexOf('\"')!=-1)
		{
			alert('The characters \' and \" are not allowed. Please, change it.');
			document.f.email.focus();
			return false;
		}
		return true;		
	}
	
	function esValidoEmail(emailSt) 
	{
			var emailStr = emailSt.value;
			if (emailStr!="")
			{
					var emailPat=/^(.+)@(.+)$/
					var specialChars="\\(\\)<>@,;:\\\\\\\"\\.\\[\\]"
					var validChars="\[^\\s" + specialChars + "\]"
					var quotedUser="(\"[^\"]*\")"
					var ipDomainPat="/^\[(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})\]$/"
					var atom=validChars + '+'
					var word="(" + atom + "|" + quotedUser + ")"
					var userPat=new RegExp("^" + word + "(\\." + word + ")*$")
					var domainPat=new RegExp("^" + atom + "(\\." + atom +")*$")

					var matchArray=emailStr.match(emailPat)
					if (matchArray==null) 
					{
							emailSt.focus();
							return false
					}
					var user=matchArray[1]
					var domain=matchArray[2]
					if (user.match(userPat)==null)
					{
							emailSt.focus();
							return false
					}
					var IPArray=domain.match(ipDomainPat)
					if (IPArray!=null) 
					{
							for (var i=1; i<=4;i++) 
							{
								if (IPArray[i]>255) 
								{
										emailSt.focus();
										return false
								}
							}
							return true
					}
					var domainArray=domain.match(domainPat)
					if (domainArray==null) 
					{
							emailSt.focus();
							return false
					}
					var atomPat=new RegExp(atom,"g")
					var domArr=domain.match(atomPat)
					var len=domArr.length
					if ((domArr[domArr.length-1].length<2) || (domArr[domArr.length-1].length>3))
					{
							emailSt.focus();
							return false
					}
					if (len<2) 
					{

							emailSt.focus();
							return false
					}
			}
			return true;
	}
	function doSubmit()
	{
		if (estaTodoBien())
			document.f.submit();
	}
//-->
</script>
</head>

<body topmargin="0" leftmargin="0">
	<form name=f method=post action="forgotPassw.asp">
		<table border="0" width="100%" valign="top">
		<tr>
			<td valign="top" align="left" height="1"><a href="http://dc2005.uc3m.es/index.asp" border="0"><img src="images/logo_peq_admin.gif" border="0"></a></td>
		</tr>
		<tr>
			<th>Password forgotten: <br>You will receive an email indicating the user and password to access.</th>
		</tr>
		<tr>
			<th>
				<br><br>
				<table border="1" class="contenido">
               		<tr>
						<th class="contenido">Email</th>
						<td><input type="text" name="email" size="23" maxlength="100" style="width:250px"></td>
					</tr>
    	              	<tr>
						<th class="contenido" colspan=2>
							<input type="button" value="Send" onClick="doSubmit();">
						</th>
					</tr>	
	            </table>
			</th>
		</tr>
		<tr>
			<td align="center">
				<br>
				<input type="button" value="Back" onClick="history.back();">
			</td>
		</tr>
		</table>
		<br><br>                        
	</form>
</body>
</html>


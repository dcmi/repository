#!/bin/sh
echo 'Content-type: text/html'
echo ''
echo '<BODY BGCOLOR="#FFFFE7" TEXT="#000000" ALINK="#FFFFFF" LINK="#990000" VLINK="#000066">
<DIV ALIGN="CENTER">
<TABLE BORDER="0" WIDTH="86%" CELLSPACING="0" CELLPADDING="0">
<TR><TD>
<TABLE BORDER="0" WIDTH="100%" CELLSPACING="0" CELLPADDING="0">
<TR>
<TD WIDTH="2%" BGCOLOR="#FFFFCC">&nbsp;</TD><TD WIDTH="96%" VALIGN="TOP" BGCOLOR="#FFFFCC">
<BR>
<P><B><FONT FACE="Verdana, Arial, Helvetica, sans-serif" SIZE="-1">Thank you for your comments!</FONT></B></P>
<P><B><FONT FACE="Verdana, Arial, Helvetica, sans-serif" SIZE="-1"><A HREF="http://purl.org/dc/">return to the Dublin Core Metadata Initiative Home page</A></FONT></B></P>
</TD><TD WIDTH="2%" BGCOLOR="#FFFFCC">&nbsp;</TD></TR>
<TR><TD WIDTH="2%" BGCOLOR="#FFFFCC">&nbsp;</TD><TD WIDTH="96%" BGCOLOR="#FFFFCC">&nbsp;</TD><TD WIDTH="2%" BGCOLOR="#FFFFCC">&nbsp;</TD></TR>
</TABLE>
</TABLE>
</DIV>'

# Scriptor Name: Lance Osborne
# Form Name:  Dublin Core Metadata Initiative Feedback
# Date:  October 30, 1998
# Last Modified:  October 30, 1998

# Enable these lines if the network with email dropdown
# box is used by removing the pound sign. If these are
# used, add ${email} to the (email address here list), 
# and replace ${WWW_network} below with ${network}
#email =`echo ${WWW_prodname} | sed "s/--.*$//" `
#network =`echo ${WWW_prodname} | sed "s/^.*--//" `

/usr/ucb/mail -s "DC Feedback" dc@oclc.org << __EOF__
Dublin Core Metadata Initiative Feedback
--------------------------------------------------------------------

Contact Person:
${WWW_name}

E-Mail:
${WWW_email}

Questions or comments:
${WWW_comments}
 
__EOF__
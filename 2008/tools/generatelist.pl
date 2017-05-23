#!/usr/local/bin/perl -w
#
use DBI;

if (!-e "tools") {mkdir "tools", 0755 or warn "Cannot make tools directory: $!";}
open (OUT,">list.html") || die "Can't open file list.html for writing";
open (MENU,">menu.html") || die "Can't open file menu.html for writing";

print MENU "<small>For a definition of the terms see the 
<a href=\"/groups/tools/glossary.shtml\">DCMI Tools Glossary</a></small></a>
<table cellspacing=\"0\" cellpadding=\"2\" border=\"0\" class=\"menu\">
";

my $dbh1 = DBI->connect("dbi:CSV:;csv_eol=\n")
  || die "Can't connect to CSV Classes";
my $dbh2 = DBI->connect("dbi:CSV:;csv_eol=\n")
  || die "Can't connect to CSV Classes";

$sth1 = $dbh1->prepare("SELECT * FROM toolscl3\.csv")
  || die "Can't prepare";

$sth1 -> execute()
  || die "Can't execute";

while (@row = $sth1->fetchrow_array) {
  my $class=$row[0];
  my $classtext=$row[1];
  
  print OUT "<a id=\"$class\" name=\"$class\"></a>
  <h2>$classtext</h2>\n<dl>";
  print MENU "<tr><td class=\"item\"><a href=\"#$class\">$classtext</a></td></tr>\n";
  $sth2 = $dbh2->prepare("SELECT * FROM tools_db3\.csv WHERE Classification LIKE '%$class%' ORDER BY Title")
    || die "Can't prepare";
  $sth2 -> execute()
    || die "Can't execute";
  while (@row = $sth2->fetchrow_array) {
    my $id=$row[0];
    my $title=$row[1];
    my $url=$row[2];
    my $description=$row[3];
    my $freecom=$row[5];
    my $onlinedown=$row[6];
    my $country=$row[7];
    my $comment=$row[8];
    my $publisher=$row[9];
    my $language=$row[10];
    my $creator=$row[11];
    my $contributor=$row[12];
    my $rights=$row[13];
    my $rholder=$row[14];
    my $proglang=$row[15];
    my $op=$row[16];
    my $date=$row[17];
    
    if ($title eq "") {die "Object without title in DB...";}
    if ($title =~ /^#/) {next;}
    if ($url eq "") {next;}
    
    print OUT "
    <dt><strong>$title</strong>";
    if ($url) {print OUT " <a href=\"tools/$id.shtml\">$url</a>";}
    if ($country ne "" or $publisher ne "") {print OUT " (";}
    if ($publisher ne "") {print OUT "$publisher";}
    if ($country ne "" and $publisher ne "") {print OUT ", ";}
    if ($country ne "") {print OUT "$country";}
    if ($country ne "" or $publisher ne "") {print OUT ")";}

    if ($freecom eq "free") {$access="free"} 
      elsif ($freecom eq "com") {$access="commercial"}
      else {$access="";}
      
      if ($onlinedown =~ /online/) {$kind.="online tool"} 
      if ($onlinedown =~ /online.*download/ or $onlinedown =~ /online.*webservice/) {$kind.=", "} 
      if ($onlinedown =~ /download/) {$kind.="tool for download and local installation"}
      if ($onlinedown =~ /download.*webservice/) {$kind.=", "} 
      if ($onlinedown =~ /webservice/) {$kind.="SOAP, .net or other WebService"}

    if ($freecom ne "" or $onlinedown ne "") {print OUT " <b>$access $kind </b>";}
    if ($comment ne "") {print OUT " <em>$comment</em>";}
    if ($description) {print OUT "</dt><dd>$description</dd>";}
    print OUT "<br /><br />\n";
    
    open (DAT,">tools/".$id.".shtml") || die "Can't open file $id for writing";
    print DAT "
    <!--#include virtual=\"tool-head.shtml\" -->
    <!--#include virtual=\"/ssi/header.shtml\" -->
    <h1>$title</h1>
    <table cellspacing=\"0\" class=\"noborder\">\n";
    if ($url) {print DAT "<tr><td>Identifier:&nbsp;&nbsp;&nbsp;</td><td><a href=\"$url\">$url</a></td></tr>\n";}
    if ($description ne "") {print DAT "<tr><td>Description:&nbsp;&nbsp;&nbsp;</td><td>$description</td></tr>\n";}
    if ($freecom ne "" or $onlinedown ne "" or $rights ne "" or $rholder ne "") 
         {print DAT "<tr><td>Rights:&nbsp;&nbsp;&nbsp;</td><td>$access $kind";
	 if ($rights ne "") {print DAT ", under $rights";}
	 if ($rholder ne "") {print DAT ", rights hold by $rholder";}
	 print DAT "</td></tr>\n";
	 }
    if ($language ne "") {print DAT "<tr><td>Language:&nbsp;&nbsp;&nbsp;</td><td>$language (ISO 639-2)</td></tr>\n";}   
    if ($creator ne "") {print DAT "<tr><td>Creator:&nbsp;&nbsp;&nbsp;</td><td>$creator</td></tr>\n";}
    if ($contributor ne "") {print DAT "<tr><td>Contributor:&nbsp;&nbsp;&nbsp;</td><td>$contributor</td></tr>\n";}
    if ($publisher ne "") {print DAT "<tr><td>Publisher:&nbsp;&nbsp;&nbsp;</td><td>$publisher</td></tr>\n";}
    if ($country ne "") {print DAT "<tr><td>Location:&nbsp;&nbsp;&nbsp;</td><td>$country</td></tr>\n";}
    if ($date ne "") {print DAT "<tr><td>Date:&nbsp;&nbsp;&nbsp;</td><td>$date</td></tr>\n";}   
    if ($proglang ne "") {print DAT "<tr><td>Programming Language:&nbsp;&nbsp;&nbsp;</td><td>$proglang</td></tr>\n";}   
    if ($op ne "") {print DAT "<tr><td>Operating System:&nbsp;&nbsp;&nbsp;</td><td>$op</td></tr>\n";}   
    if ($comment ne "") {print DAT "<tr><td>Comment:&nbsp;&nbsp;&nbsp;</td><td><em>$comment</em></td></tr>\n";}
    print DAT "</table>
    <p><small>For an application profile see the <a href=\"/groups/tools/map.shtml\">DCMI Tools
    Application Profile</a></small>
    <!--#include virtual=\"/ssi/footer.shtml\" -->
    </body>
    </html>";
    close (DAT);
    
    $title="";
    $url="";
    $description="";
    $freecom="";
    $onlinedown="";
    $country="";
    $comment="";
    $publisher="";
    $language="";
    $creator="";
    $contributor="";
    $rights="";
    $rholder="";
    $proglang="";
    $op="";
    $date="";
    $kind="";
  }
  print OUT "</dl>\n";
  
}

$dbh2->disconnect   
  || die "Can't disconnect from CSV DB";
$dbh1->disconnect   
  || die "Can't disconnect from CSV Classes";

print MENU "</table>";

close (MENU);
close (OUT);

exit;

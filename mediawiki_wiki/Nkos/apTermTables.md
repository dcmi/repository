---
title: apTermTables
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Nkos/apTermTables.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 14 November 2014, at 14:07.  
This page has been accessed 43,224 times.

[<img alt="Community Specifications Committee logo" src="/archive/mediawiki_wiki/images/Specifications_logo.png" width="500" height="70">](/archive/mediawiki_wiki/images/Specifications_logo.png "Community Specifications Committee logo")

* * *

##### [Handbook](/archive/mediawiki_wiki/DCMI_Handbook "DCMI Handbook"): [Table of Contents](/archive/mediawiki_wiki/DCMI_Handbook/ "DCMI Handbook") 
<dl>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Governing_Board.md" title="DCMI Governing Board">Governing Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Governing_Board/finance.md" title="DCMI Governing Board/finance">Membership &amp; Finance</a> ◘ <a href="/mediawiki_wiki/DCMI_Governing_Board/nominations.md" title="DCMI Governing Board/nominations">Nominations &amp; Bylaws</a> 
</dd>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Technical_Board.md" title="DCMI Technical Board">Technical Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Technical_Board/usage.md" title="DCMI Technical Board/usage">Usage</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/standards.md" title="DCMI Technical Board/standards">Standards &amp; Liaisons</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/specifications.md" title="DCMI Technical Board/specifications">Community Specifications</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/infrastructure.md" title="DCMI Technical Board/infrastructure">Infrastructure Advisory Committee (IAC)</a>
</dd>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Advisory_Board.md" title="DCMI Advisory Board">Advisory Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Advisory_Board/meetings.md" title="DCMI Advisory Board/meetings">Conferences &amp; Meetings</a> ◘ <a href="/mediawiki_wiki/DCMI_Advisory_Board/documentation.md" title="DCMI Advisory Board/documentation">Education &amp; Outreach</a>
</dd>
<dd> ► <i>Management:</i> <a href="/mediawiki_wiki/Exec_Committee.md" title="Exec Committee">Executive</a> ◘ <a href="/mediawiki_wiki/Exec_Committee/directorate.md" title="Exec Committee/directorate">Directorate</a>
</dd>
</dl>

* * *

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1"><a href="#Handbook:_Table_of_Contents"><span class="tocnumber">1</span> <span class="toctext">Handbook: Table of Contents</span></a></li>
        <li class="toclevel-1 tocsection-1"><a href="#NKOS_AP_Property.2FClass_Tables"><span class="tocnumber">2</span> <span class="toctext">NKOS AP Property/Class Tables</span></a></li>
      </ul>
    </td>
  </tr>
</table>


* * *

[NKOS AP Homepage](/archive/mediawiki_wiki/DCMI_Technical_Board/specifications/nkos "DCMI Technical Board/specifications/nkos")

# NKOS AP Property/Class Tables 

1. General Notes
  1. [SS] The draft domain model (graphic) denotes/implies relationships of the <rdfs:domain> - <rdfs:range> or <schema:domainIncludes> - <schema:rangeIncludes> sort and yet some of the tables have such notations in their tables and others do not. We should walk through the properties and look at:
    1. whether total lack of either <rdfs:domain> or the ontologically looser <schema:domainIncludes> is intended; and 
    2. whether those property tables with "has range" really mean the formal inferencing of <rdfs:range>; or, whether the AP creators' intention is the ontologically "looser" notions of <schema:rangeIncludes> -- denoting classes from which the property may be expected to draw values but for which no formal inferencing of class is desired or intended.
2. Class tables - file: 4Classes-Word2014-11-06.docx (Dropbox)
  1. Notes
    - @@@
3. Property tables - file: 5Properties-Word2014-11-06 (Dropbox)
  1. Notes
    - [SS] There needs to be a table for every property _used_ in the AP. You should not collapse two properties into one table and then try to explain through usage note when to use which property. This will lead to confusion and misuse. For example, you should have a **single table** for the notion of creator as resource (thing - <dct:creator> (i.e., dcterms namespace)) and a **separate table** for the notion of creator as literal (string) - <dc:creator> (i.e., dc namespace). Each table then can have it's own usage note that clearly drives home when to use which one and the thing/string distinction.


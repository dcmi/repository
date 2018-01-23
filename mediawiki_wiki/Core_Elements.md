---
title: Core Elements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Core_Elements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 December 2014, at 22:12.  
This page has been accessed 228,931 times.

Back to DCMI/NKOS home [[[1]](/mediawiki_wiki/DCMI_NKOS_Task_Group.md)]

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#NKOS_AP_Domain_Model"><span class="tocnumber">1</span> <span class="toctext">NKOS AP Domain Model</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#NKOS_AP_Entity_Relationships"><span class="tocnumber">2</span> <span class="toctext">NKOS AP Entity Relationships</span></a></li>
        <li class="toclevel-1 tocsection-3">
          <a href="#NKOS_Attributes_and_Metadata_Elements_Overview"><span class="tocnumber">3</span> <span class="toctext">NKOS Attributes and Metadata Elements Overview</span></a>
          <ul>
            <li class="toclevel-2 tocsection-4"><a href="#Attributes_of_Work"><span class="tocnumber">3.1</span> <span class="toctext">Attributes of Work</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Attributes_of_Expression"><span class="tocnumber">3.2</span> <span class="toctext">Attributes of Expression</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Attributes_of_Manifestation"><span class="tocnumber">3.3</span> <span class="toctext">Attributes of Manifestation</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## NKOS AP Domain Model 

This is a domain model that help the group to sort out the entities and attributes. It is not the final model. [<img alt="NkosAPDomainModel.png" src="/mediawiki_wiki/images/NkosAPDomainModel.png" width="811" height="828">](/mediawiki_wiki/images/NkosAPDomainModel.png)

## NKOS AP Entity Relationships 

Updated 2013-05-12

Refer to KOS Relation-Type Vocabulary at [NKOS\_Vocabularies](/mediawiki_wiki/NKOS_Vocabularies.md) page

Note: These are identified relationships between Work, Expression, and Manifestation entities. For an example of a thesaurus, see: [KOS\_example](/mediawiki_wiki/KOS_example.md)

<table border="1" cellpadding="0" cellspacing="0" width="324" style="border-collapse: collapse;table-layout:fixed;width:324pt">
  <tr style="height:16.0pt">
    <td height="16" class="xl65" style="height:16.0pt">W<span style="mso-spacerun:yes">  </span>
    </td>
    <td class="xl65">E<span style="mso-spacerun:yes">  </span>
    </td>
    <td class="xl65">M<span style="mso-spacerun:yes">  </span>
    </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl65" style="height:15.0pt">(work)</td>
    <td class="xl65">(expression)</td>
    <td class="xl65">(manifestation)</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" colspan="3" style="height:15.0pt;mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt">1. based on (w)</td>
    <td>1. realizes (w)</td>
    <td>1. embodies (E)</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" colspan="3" style="height:15.0pt;mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt">2. part of (w)</td>
    <td>2. part of (E)</td>
    <td>2. part of (M)</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>
      <span style="mso-spacerun:yes"> </span>. outline</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. excerpt</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. fragment of</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" colspan="3" style="height:15.0pt;mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>3. based on (E)</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. translation of</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. abridgment of</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. extension of</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. version of</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" colspan="3" style="height:15.0pt;mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>4. other (E)</td>
    <td></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td>. aligned with</td>
    <td></td>
  </tr>
</table>


## NKOS Attributes and Metadata Elements Overview 

(The core elements were identified based on the previous studies of over 10 KOS registries and a survey of related researchers and implementors) Updated 2013-09-09: changed "size" to "sizeNote"; added "usedBy" to work level; added "#" to "audience"._See also_ [NKOS AP Elements](/mediawiki_wiki/NKOS_AP_Elements.md) Defined

Symbols used in the following tables:

- Requirement: \*:required \*\*:required, may occur in any level 
- Values: #:non literal; ##: both literal and non literal

(Note: the non literal constraint is inherited from the property defined by DCTerms. Those without marks have no clear definition of constraint.)

### Attributes of _Work_ 
<table border="1" cellpadding="0" cellspacing="0" width="468" style="border-collapse: collapse;table-layout:fixed;width:468pt">
  <tr style="height:15.0pt">
    <td height="15" class="xl90" width="141" style="height:15.0pt;width:141pt">Attributes
      of Work</td>
    <td class="xl90" width="36" style="border-left:none;width:36pt">*core</td>
    <td class="xl90" width="134" style="border-left:none;width:134pt">Metadata
      Elements</td>
    <td class="xl90" width="157" style="border-left:none;width:157pt">#:non-literal</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl91" style="height:15.0pt"> </td>
    <td class="xl90" style="border-top:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">##: both literal and
      non-literal<span style="mso-spacerun:yes"> </span>
    </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt"> </td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Title</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:title</td>
    <td class="xl90" style="border-top:none;border-left:none">##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Identifier</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:identifier</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Description</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:description</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Type of KOS</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl92" style="border-top:none;border-left:none">nkos:kosType</td>
    <td class="xl90" style="border-top:none;border-left:none">##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Creator</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:creator/dc:creator</td>
    <td class="xl90" style="border-top:none;border-left:none">#/##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Rights</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:rights</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Subject</td>
    <td class="xl90" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:subject</td>
    <td class="xl90" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Audience</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:audience</td>
    <td class="xl90" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Date</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:created</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Used by</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl89" style="border-top:none;border-left:none">nkos:usedBy</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
  </tr>
  <br>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">Relation</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:relation</td>
    <td class="xl90" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">is part of</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:isPartOf</td>
    <td class="xl90" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl90" style="height:15.0pt;border-top:none">is based on</td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">dct:relation</td>
    <td class="xl90" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl93" style="height:15.0pt;border-top:none">Supporting
      documentation</td>
    <td class="xl94" style="border-top:none"> </td>
    <td class="xl94" style="border-top:none">wdrs:describedBy</td>
    <td class="xl94" style="border-top:none">#</td>
  </tr>
</table>


### Attributes of _Expression_
<table border="1" cellpadding="0" cellspacing="0" width="466" style="border-collapse: collapse;table-layout:fixed;width:466pt">
  <tr style="height:15.0pt">
    <td height="15" width="140" style="height:15.0pt;width:140pt"></td>
    <td width="37" style="width:37pt"></td>
    <td width="133" style="width:133pt"></td>
    <td width="156" style="width:156pt"></td>
    <td width="0"></td>
    <td width="0"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl65" style="height:15.0pt">Attributes of Expression</td>
    <td class="xl65" style="border-left:none">*core</td>
    <td class="xl65" style="border-left:none">Metadata Elements</td>
    <td class="xl65" style="border-left:none">#:non-literal</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" style="height:15.0pt"></td>
    <td class="xl65" style="border-top:none"> </td>
    <td class="xl65" style="border-top:none;border-left:none"> </td>
    <td class="xl65" style="border-top:none;border-left:none">##: both literal and
      non-lit<span style="display:none">eral</span>
    </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt">Title</td>
    <td class="xl88" style="border-left:none">*</td>
    <td class="xl88" style="border-left:none">dct:title</td>
    <td class="xl88" style="border-left:none">##</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Identifier</td>
    <td class="xl88" style="border-top:none;border-left:none">*</td>
    <td class="xl88" style="border-top:none;border-left:none">dct:identifier</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Contact</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">adms:contactPoint</td>
    <td class="xl88" style="border-top:none;border-left:none">##</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Description</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:description</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Creator</td>
    <td class="xl88" style="border-top:none;border-left:none">*</td>
    <td class="xl88" style="border-top:none;border-left:none">dct:creator/dc:creator</td>
    <td class="xl88" style="border-top:none;border-left:none">#/##</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Language</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:language</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Size note</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl89" style="border-top:none;border-left:none">nkos:sizeNote</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Date</td>
    <td class="xl88" style="border-top:none;border-left:none">*</td>
    <td class="xl88" style="border-top:none;border-left:none">dct:created</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:modified</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Rights</td>
    <td class="xl88" style="border-top:none;border-left:none">*</td>
    <td class="xl88" style="border-top:none;border-left:none">dct:rights</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Used by</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl89" style="border-top:none;border-left:none">nkos:usedBy</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Frequency of
      update</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl89" style="border-top:none;border-left:none">nkos:updateFrequency</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Audience</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:audience</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Relation</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:relation</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">is realization
      of</td>
    <td class="xl88" style="border-top:none;border-left:none">*</td>
    <td class="xl88" style="border-top:none;border-left:none">frbrer:isRealizationOf</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">is part of</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">dct:isPartOf</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">sample<span style="mso-spacerun:yes"> </span>
    </td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">adms:sample</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl88" style="height:15.0pt;border-top:none">Supporting
      documentation</td>
    <td class="xl88" style="border-top:none;border-left:none"> </td>
    <td class="xl88" style="border-top:none;border-left:none">wdrs:describedby</td>
    <td class="xl88" style="border-top:none;border-left:none">#</td>
    <td colspan="2" style="mso-ignore:colspan"></td>
  </tr>
</table>


### Attributes of _Manifestation_
<table border="1" cellpadding="0" cellspacing="0" width="484" style="border-collapse: collapse;table-layout:fixed;width:484pt">
  <tr style="height:15.0pt">
    <td height="15" class="xl90" width="140" style="height:15.0pt;width:140pt">Attributes
      of Manifestation</td>
    <td class="xl90" width="37" style="border-left:none;width:37pt">*core</td>
    <td class="xl90" width="152" style="border-left:none;width:152pt">Metadata
      Elements</td>
    <td class="xl90" width="155" style="border-left:none;width:155pt">#:non-literal</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl91" style="height:15.0pt"> </td>
    <td class="xl90" style="border-top:none"><span style="mso-spacerun:yes"> </span></td>
    <td class="xl90" style="border-top:none;border-left:none"> </td>
    <td class="xl90" style="border-top:none;border-left:none">##: both literal and
      non-literal</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt">Title</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:title</td>
    <td class="xl95" style="border-top:none;border-left:none">##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Identifier</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:identifier</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Contact</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none">adms:contactPoint</td>
    <td class="xl95" style="border-top:none;border-left:none">##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Description</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none">dct:description</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Creator</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl90" style="border-top:none;border-left:none">dct:creator/dc:creator</td>
    <td class="xl95" style="border-top:none;border-left:none">#/##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Publisher</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:publisher/dc:publisher</td>
    <td class="xl95" style="border-top:none;border-left:none">#/##</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Format</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:format</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Rights</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:rights</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Date<span style="mso-spacerun:yes"> </span>
    </td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">dct:issued</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Services
      offered</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none">nkos:serviceOffered</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Relation</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none">dct:relation</td>
    <td class="xl95" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Is embodiment
      of</td>
    <td class="xl95" style="border-top:none;border-left:none">*</td>
    <td class="xl95" style="border-top:none;border-left:none">frbrer:isEmbodimentOf</td>
    <td class="xl95" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt;border-top:none">Is part of</td>
    <td class="xl95" style="border-top:none;border-left:none"> </td>
    <td class="xl95" style="border-top:none;border-left:none">dct:isPartOf</td>
    <td class="xl95" style="border-top:none;border-left:none">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl96" style="height:15.0pt">sample<span style="mso-spacerun:yes"> </span>
    </td>
    <td class="xl97"> </td>
    <td class="xl97">adms:sample</td>
    <td class="xl97">#</td>
  </tr>
  <tr style="height:15.0pt">
    <td height="15" class="xl95" style="height:15.0pt">Supporting documentation</td>
    <td class="xl95" style="border-left:none"> </td>
    <td class="xl95" style="border-left:none">wdrs:describedBy</td>
    <td class="xl95" style="border-left:none">#</td>
  </tr>
</table>


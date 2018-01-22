---
title: NKOS Vocabularies
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/NKOS_Vocabularies.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 4 October 2015, at 01:19.  
This page has been accessed 174,697 times.

Go back to [DCMI\_NKOS\_Task\_Group](/mediawiki_wiki/DCMI_NKOS_Task_Group "DCMI NKOS Task Group") Main Page

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#KOS_Relation_Vocabulary"><span class="tocnumber">1</span> <span class="toctext">KOS Relation Vocabulary</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Relationships_between_entities_of_different_types"><span class="tocnumber">1.1</span> <span class="toctext">Relationships between entities of different types</span></a></li>
            <li class="toclevel-2 tocsection-3">
              <a href="#Relationships_between_entities_of_the_same_type"><span class="tocnumber">1.2</span> <span class="toctext">Relationships between entities of the same type</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#dct:relation_sub-types"><span class="tocnumber">1.2.1</span> <span class="toctext">dct:relation sub-types</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-5"><a href="#KOS_Types_Vocabulary"><span class="tocnumber">2</span> <span class="toctext">KOS Types Vocabulary</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## KOS Relation Vocabulary 

Updated 2015-10-02

### Relationships between entities of different types 

1. Work (W)-to-Expression (E): (E) _realizes_ (W)

2. Expression (E)-to-Manifestation (M): (M) _embodies_ (E)

- Refer to [NKOS AP Elements](/mediawiki_wiki/NKOS_AP_Elements "NKOS AP Elements")

### Relationships between entities of the same type 

1. Work (W)-to-Work (W): _based on_ (W), _is part of_ (W)

2. Expression (E)-to-Expression (E): _based on_ (E), _is part of_ (E), other relation (E)

These are the sub-types of dct:relation and can be used as object property in describing relationships as needed.

#### dct:relation sub-types 

KOS Relation-Type Vocabulary -- Sub-types of dct:relation and examples  
_Note:_ _Specializations of relationships may only be applicable to specific entity types._

<table width="687" border="1" cellpadding="0" cellspacing="0">
  <tr>
    <td width="75" nowrap bgcolor="#CCFFFF">
      <p align="center" style="text-align:center"><b><span style='font-size:10pt; font-family:"Times New Roman"; "Times New Roman";color:#3F3F3F'>Relation Type</span></b></p>
    </td>
    <td width="106" nowrap bgcolor="#CCFFFF">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>Definition</span></b></p>
    </td>
    <td width="104" nowrap bgcolor="#CCFFFF">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>Element</span></b></p>
    </td>
    <td colspan="2" bgcolor="#CCFFFF">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>Example</span></b></p>
    </td>
  </tr>
  <tr>
    <td colspan="3" nowrap bgcolor="#FFCC99">
      <p><span class="GramE"><b><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>part</span></i></b></span><b><i><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F'>-of: </span></i></b></p>
    </td>
    <td width="183" nowrap bgcolor="#F3F3F3">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>A</span></b></p>
    </td>
    <td width="207" valign="bottom" nowrap bgcolor="#F3F3F3">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>B</span></b></p>
    </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'>is</span></b></span><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'> part of</span></b></p>
    </td>
    <td nowrap>
      <p><b><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F'> A is part of
            B.</span></b></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>dct:isPartOf</span></b></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>Class H - Social Sciences of <i>Library
            of Congress Classification (LCC)</i></span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>LCC</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><b><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F'> B has part A.</span></b></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>dct:hasPart</span></b></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>. <span class="GramE">outline</span> of</span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is outline of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isOutlineOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC Summaries</span></i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'> </span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has outline A</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:hasOutline</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>. <span class="GramE">excerpt</span> of</span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is excerpt of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isExerptOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>Table G (Geographic Notation) of the <i>National Library of Medicine (NLM) Classification</i></span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>NLM Classification</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has excerpt A</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:hasExcerpt</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>. <span class="GramE">fragment</span> of</span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is fragment of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isFragmentOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>entries</span></span><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F;'> from a scheme</span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>a</span></span><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F;'> scheme</span></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has fragment A</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:hasFragment</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>. <span class="GramE">sample</span> </span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is sample of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isSampleOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>a</span></span><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F;'> sample entry or a page from a
          scheme</span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>a</span></span><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F;'> scheme</span></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has sample A.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>adms:sample</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td colspan="3" nowrap bgcolor="#FFCC99">
      <p><span class="GramE"><b><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>based</span></i></b></span><b><i><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F'>-on:</span></i></b></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>A</span></b></p>
    </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3">
      <p align="center" style="text-align:center"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>B</span></b></p>
    </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'>is</span></b></span><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'> based on</span></b></p>
    </td>
    <td nowrap>
      <p><b><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F'> A is based on
            B.</span></b></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>nkos:isBasedOn</span></b></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>Canadian Subject
            Headings (CSH)</span></i></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>Library of
            Congress <span class="GramE">Classification(</span>LCSH)</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'>is</span></b></span><b><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F'> basis for</span></b></p>
    </td>
    <td nowrap>
      <p><b><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F'> B is basis for
            A.</span></b></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><b><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F'>nkos:isBasisFor</span></b></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>.translation</span></span><span style='font-size: 9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> of </span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is translation of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isTranslationOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>Dewey-<span class="SpellE">Dezimalklassifikation</span> <span class="GramE">22  </span></span></i></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC 22</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has translation A.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>adms:translation</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>.abridgment</span></span><span style='font-size: 9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> of </span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is abridgment of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isAbridgmentOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC Abridged
            Edition 15</span></i></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC 23</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has abridgment A.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:hasAbridgment</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>.extension</span></span><span style='font-size: 9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> of </span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is extension of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:isExtensionOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'>A localized version of <i>NLM
            Classification</i> </span></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>NLM Classification</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has extension A.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>nkos:hasExtention</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
  <tr>
    <td nowrap>
      <p><span class="GramE"><span style='font-size:9.0pt;font-family: "Times New Roman";color:#3F3F3F;'>.version</span></span><span style='font-size:9.0pt; font-family:"Times New Roman"; color:#3F3F3F;'> of</span></p>
    </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> A is version of B.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>dct:isVersionOf</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC 23 </span></i></p>
    </td>
    <td nowrap bgcolor="#F3F3F3">
      <p><i><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>DDC</span></i></p>
    </td>
  </tr>
  <tr>
    <td nowrap> </td>
    <td nowrap>
      <p><span style='font-size:9.0pt;font-family:"Times New Roman"; color:#3F3F3F;'> B has version A.</span></p>
    </td>
    <td nowrap>
      <p><span class="SpellE"><span class="GramE"><span style='font-size:9.0pt;font-family:"Times New Roman";"Times New Roman";color:#3F3F3F;'>dct:hasVersion</span></span></span></p>
    </td>
    <td bgcolor="#F3F3F3"> </td>
    <td valign="bottom" nowrap bgcolor="#F3F3F3"> </td>
  </tr>
</table>


* * *

## KOS Types Vocabulary 

(updated 2015-10-02)

- nkosType terms URI was proposed as: [http://purl.org/nkos/nkostype/xxx](http://purl.org/nkos/nkostype/xxx)

Now changed to permanent namespace xmlns:nkostype=" [http://w3id.org/nkos/nkostype](http://w3id.org/nkos/nkostype)"

- 
  - nkosType terms IRI has the pattern as: [http://w3id.org/nkos/nkostype#xxx](http://w3id.org/nkos/nkostype#xxx)

e.g., [http://w3id.org/nkos/nkostype#pick\_list](http://w3id.org/nkos/nkostype#pick_list)"

RDF/XML file available: [[1]](http://nkos.slis.kent.edu/nkostype/nkostype.rdf)

**KOS Types Vocabulary&nbsp;**

> (A value encoding scheme)
> 
> authority file: _see***name authority list**
> 
> **categorization**  **scheme** : loosely formed grouping scheme [1]
> 
> **classification**  **scheme** : schedule of concepts and pre-coordinated combinations of concepts, arranged by classification [2]
> 
> **dictionary**** :** a reference source containing words usually alphabetically arranged along with information about their forms, pronunciations, functions, etymologies, meanings, and syntactical and idiomatic uses [3]
> 
> **gazetteer** : geospatial dictionary of named and typed places [1]
> 
> **glossary**** :** a collection of textual glosses or of specialized terms with their meanings [3]
> 
> **list** : a limited set of terms arranged as a simple alphabetical list or in some other logically evident way; containing no relationships of any kind [4]
> 
> **name**  **authority list** : controlled vocabulary for use in naming particular entities consistently [2]
> 
> **ontology** : A formal model that allows knowledge to be represented for a specific domain. An ontology describes the types of things that exist (classes), the relationships between them (properties) and the logical ways those classes and properties can be used together (axioms). [5]
> 
> pick list: _see***list**
> 
> **semantic**  **network** : set of terms representing concepts, modeled as the nodes in a network of variable relationship types [1]
> 
> subject heading list: _see***subject heading scheme** &nbsp;&nbsp;
> 
> **subject**  **heading scheme** :&nbsp; structured vocabulary comprising terms available for subject indexing, plus rules for combining them into pre-coordinated strings of terms where necessary [2]
> 
> **synonym**  **ring** : set of synonymous or almost synonymous terms, any of which can be used to refer to a particular concept [2]
> 
> **taxonomy** : scheme of categories and subcategories that can be used to sort and otherwise organize items of knowledge or information [2]
> 
> **terminology** : set of designations belonging to one special language [ISO 1087-1:2000, definition 3.5.1][2]   
> (NOTE: The term “special language” is defined in ISO 1087 to mean a “language used in a subject field and characterized by the use of specific linguistic means of expression”; while a “designation” is defined therein as a “representation of a concept by a sign which denotes it”.)
> 
> **thesaurus** : controlled and structured vocabulary in which concepts are represented by terms, organized so that relationships between concepts are made explicit, and preferred terms are accompanied by lead-in entries for synonyms or quasi-synonyms [2]
> 
> [1] NKOS definitions. Based on KOS Taxonomy [[2]](http://nkos.slis.kent.edu/KOS_taxonomy.htm) [http://nkos.slis.kent.edu/KOS\_taxonomy.htm](http://nkos.slis.kent.edu/KOS_taxonomy.htm)
> 
> [2] ISO25964-2:2013. Information and documentation -- Thesauri and interoperability with other vocabularies. Part 2: Interoperability with other vocabularies.&nbsp;
> 
> [3] Merriam Webster online. Available at: [[3]](http://www.merriam-webster.com/)
> 
> [4] NKOS definitions. Based on ANSI/NISO Z39.19-2005 (R2010). Guidelines for the construction, format, and management of monolingual controlled vocabularies. ISBN: 1-880124-65-3. Available at: [[4]](http://www.niso.org/apps/group_public/project/details.php?project_id=46)
> 
> [5] W3C Linked Data Glossary. W3C Working Group Note 27 June 2013. Available at: [[5]](http://www.w3.org/TR/2013/NOTE-ld-glossary-20130627/)
> 
> **Reference list:**
> 
> ISO 25964-2:2013. _Information and documentation -- Thesauri and interoperability with other vocabularies -- Part 2: Interoperability with other vocabularies_. ISO (International Organization for Standardization) ISO TC 46/SC 9. Info: [[6]](http://www.niso.org/schemas/iso25964/)
> 
> KOS Taxonomy. NKOS (Networked Knowledge Organization Systems/Services/Structures),&nbsp; 2000-. (Web page).&nbsp; Available at: [[7]](http://nkos.slis.kent.edu/KOS_taxonomy.htm)
> 
> ANSI/NISO Z39.19-2005. _Guidelines for the construction, format, and management of monolingual controlled vocabularies_. Bethesda, MD: NISO Press. 2005, R2010. Available at: [[8]](http://www.niso.org/kst/reports/standards/)&nbsp;
> 
> _Merriam Webster online_. Available at: [[9]](http://www.merriam-webster.com/) <p style='text-autospace:none'>Linked Data Glossary. W3C Working Group Note 27 June 2013. (Web page). Available at: [[10]](http://www.w3.org/TR/2013/NOTE-ld-glossary-20130627/)


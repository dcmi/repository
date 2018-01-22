---
title: NKOS AP Elements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/NKOS_AP_Elements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 October 2015, at 00:57.  
This page has been accessed 161,383 times.

Go back to DCMI\_NKOS\_Task\_Group [[1]](/mediawiki_wiki/DCMI_NKOS_Task_Group) Main Page

[updated 2015-10-03]

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Networked_Knowledge_Organization_Systems_Application_Profile_.28NKOS_AP.29"><span class="tocnumber">1</span> <span class="toctext">Networked Knowledge Organization Systems Application Profile (NKOS AP)</span></a>
          <ul>
            <li class="toclevel-2"><a href="#Namespace"><span class="tocnumber">1.1</span> <span class="toctext">Namespace</span></a></li>
            <li class="toclevel-2 tocsection-2"><a href="#Scope"><span class="tocnumber">1.2</span> <span class="toctext">Scope</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Vocabulary_Terms_at_a_Glance"><span class="tocnumber">1.3</span> <span class="toctext">Vocabulary Terms at a Glance</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Namespaces_used_by_this_AP"><span class="tocnumber">1.4</span> <span class="toctext">Namespaces used by this AP</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Link_to_the_full_document"><span class="tocnumber">1.5</span> <span class="toctext">Link to the full document</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Networked Knowledge Organization Systems Application Profile (NKOS AP) 

- Title: Networked Knowledge Organization Systems Application Profile (NKOS AP) 
- Short Title: NKOS AP
- Description: This file specifies the set of RDF classes and properties used in NKOS AP 
- Date Created: 2014-04-03
- Date Modified: 2015-10-03 
- Creator: Marcia L. Zeng
- Creator: Maja Žumer 
- Contributor: DCMI NKOS Task Group
- Version: 0.2

- Available as: html [[2]](http://nkos.slis.kent.edu/nkos-ap.html) and RDF/XML [[3]](http://nkos.slis.kent.edu/nkos.rdf)

### Namespace

- The URI for this vocabulary is [http://w3id.org/nkos](http://w3id.org/nkos) [[4]](http://w3id.org/nkos)

- When abbreviating terms the suggested prefix is _nkos_
- Each class or property in the vocabulary has a URI constructed by appending a term name to the vocabulary URI. For example: [http://w3id.org/nkos#alignedWith](http://w3id.org/nkos#alignedWith)

## Scope

- This file specifies the set of RDF classes and properties used in the "Networked Knowledge Organization Systems Dublin Core Application Profile (NKOS AP)". The metadata schema can be used to describe knowledge organization systems/services (KOS) resources, such as thesauri, classification schemes, subject heading systems, taxonomies, and ontologies that are developed for organizing information and promoting knowledge management.[1] The information about a KOS, including its data model, type, protocol, status, responsible body, available format, affectivity, and other descriptive data are very important to terminology registries, service registries, vocabulary users (machine or human), and retrieval systems. At a minimum level, metadata for KOS resources will describe specific characteristics of a KOS, facilitate the discovery of KOS resources, assist in the evaluation of such resources for a particular application or use, and facilitate sharing, reusing, and collaboration of the KOS resources.

- This Dublin Core Application Profile for describing KOS resources is developed based on the work the Networked Knowledge Organization Systems (NKOS) group " [http://nkos.slis.kent.edu/](http://nkos.slis.kent.edu/)" [[5]](http://nkos.slis.kent.edu/) members have done since 1998.

[1] For the types of KOS resources, consult NKOS-Types vocabulary [[6]](/mediawiki_wiki/NKOS_Vocabularies).

## Vocabulary Terms at a Glance
<table width="98%" border="1" cellpadding="0" cellspacing="0">
  <tr>
    <td width="20%" valign="top">
      <p align="center" style="text-align:center"><b><span style="font-size:12.0pt;font-family:Calibri;">Classes</span></b>
      </p>
    </td>
    <td width="841" valign="top">
      <span class="SpellE"><span class="GramE">dct:Agent</span></span> , <span class="SpellE">dct:AgentClass</span> , <span class="SpellE">adms:Asset</span> , <span class="SpellE">frbrer:Expression</span> , <span class="SpellE">dct:LinguisticSystem</span> , <span class="SpellE">frbrer:Manifestation</span> , <span class="SpellE">dct:MediaTypeOrExtent</span>, <span class="SpellE">dct:RightsStatement</span> , <span class="SpellE">frsad:Thema</span> , <span class="SpellE">frbrer:Work</span>
    </td>
  </tr>
  <tr>
    <td valign="top">
      <p align="center" style="text-align:center"><b><span style="font-size:12.0pt; font-family:Calibri;">Properties</span></b></p>
      <p align="center" style="text-align:center"><b><span style="font-family:Calibri;">-<span class="SpellE"><span class="GramE">nkos</span></span> defined:</span></b></p>
    </td>
    <td width="841" valign="top">
      <p><span class="SpellE"><span class="GramE">nkos:alignedWith</span></span> , <span class="SpellE">nkos:basedOn</span> , <span class="SpellE">nkos:serviceOffered</span> , <span class="SpellE">nkos:sizeNote</span> , <span class="SpellE">nkos:updateFrequency</span> , <span class="SpellE">nkos:usedBy</span></p>
    </td>
  </tr>
  <tr>
    <td width="105" valign="top">
      <p align="center" style="text-align:center"><b><span style='font-family:Calibri;"Times New Roman";"Times New Roman"'>-<span class="GramE">reused</span>:</span></b></p>
    </td>
    <td width="841" valign="top">
      <p><span class="SpellE"><span class="GramE">dct:audience</span></span> , <span class="SpellE">dcat:contactPoint</span> , <span class="SpellE">dct:created</span> , <span class="SpellE">dct:creator</span> , <span class="SpellE">wdrs:describedBy</span> , <span class="SpellE">dct:description</span> , <span class="SpellE">dct:format</span> , <span class="SpellE">dct:identifier</span> , <span class="SpellE">frbrer:isEmbodimentOf</span> , <span class="SpellE">dct:isPartOf</span> , <span class="SpellE">frbrer:isRealizationOf</span> , <span class="SpellE">dct:issued</span> , <span class="SpellE">dct:language</span> , <span class="SpellE">dct:modified</span> , <span class="SpellE">dct:publisher</span> , <span class="SpellE">dct:relation</span> , <span class="SpellE">dct:rights</span> , <span class="SpellE">adms:sample</span> , <span class="SpellE">dct:subject</span> , <span class="SpellE">dct</span>: title , <span class="SpellE">dct:type</span> , <span class="SpellE">prov:wasDerivedFrom</span></p>
    </td>
  </tr>
</table>

## Namespaces used by this AP

**adms** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [http://www.w3.org/ns/adms#](http://www.w3.org/ns/adms#)

**dc** [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)

**dcat** [http://www.w3.org/ns/dcat#](http://www.w3.org/ns/dcat#)

**dct** [http://purl.org/dc/terms/](http://purl.org/dc/terms/)

**frbrer** [http://iflastandards.info/ns/fr/frbr/frbrer/](http://iflastandards.info/ns/fr/frbr/frbrer/)

**frsad** &nbsp; [http://iflastandards.info/ns/fr/frsad/](http://iflastandards.info/ns/fr/frsad/)

**nkos** [http://w3id.org/nkos#](http://w3id.org/nkos#)

**prov** [http://www.w3.org/ns/prov#](http://www.w3.org/ns/prov#)

**wdrs** [http://www.w3.org/2007/05/powder-s#](http://www.w3.org/2007/05/powder-s#)

## Link to the full document 

- html [http://nkos.slis.kent.edu/nkos-ap.html](http://nkos.slis.kent.edu/nkos-ap.html) [[7]](http://nkos.slis.kent.edu/nkos-ap.html)
- RDF/XML [http://nkos.slis.kent.edu/nkos.rdf](http://nkos.slis.kent.edu/nkos.rdf) [[8]](http://nkos.slis.kent.edu/nkos.rdf)


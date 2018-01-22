---
title: Item Properties
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCLib_AP/Item_Properties.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 9 September 2011, at 15:33.  
This page has been accessed 122,089 times.

Properties used with an Item

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Identifier"><span class="tocnumber">1</span> <span class="toctext">Identifier</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Holding_Location"><span class="tocnumber">2</span> <span class="toctext">Holding Location</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Description"><span class="tocnumber">3</span> <span class="toctext">Description</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#Provenance"><span class="tocnumber">4</span> <span class="toctext">Provenance</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#Exemplar_Of"><span class="tocnumber">5</span> <span class="toctext">Exemplar Of</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## Identifier 

**Name:** identifier

**URI:** [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

**Definition:** An unambiguous reference to the resource within a given context.

**Type of Term:** Property

**DCLIB-Comment:**

- _Unique-resource identifier:_ Provide identifiers assigned to one-of-a-kind resources (such as accession numbers assigned to items in a museum collection) if one or more of this class of identifiers have been assigned to the resource and are known to the metadata agency. Local identifiers should be expressed in a form that guarantee global uniqueness. For instance, local accession number should be expanded into NBN (which can be expressed as HTTP URI; for instance, in [http://urn.fi/URN:NBN:fi-fe201010142588](http://urn.fi/URN:NBN:fi-fe201010142588) NBN is fi-fe201010142588).

**Has Range:**

- dc:identifier may be used with literal or non-literal values. For further information see [**RDF Examples**](/mediawiki_wiki/User_Guide/Publishing_Metadata#dcIdentifier_RDF)..

**SES:**

- URI - [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI). 

**Obligation:** MA

**Occurence:** 0-n

## Holding Location 

**Name:** availability

**URI:** [http://www.agls.gov.au/agls/terms/availability](http://www.agls.gov.au/agls/terms/availability)

**Definition:** How the resource can be obtained or accessed, or contact information.

**Type of Term:** Property

**DCLIB-Comment:** Use for a physical location that allows the user to retrieve the item when a URI is not appropriate (e.g. for physical items not available electronically). This also facilitates access if the URI doesn't retrieve anything or only a poor substitute. Can also contain further identification within a location such as call number, accession number.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:** MARC Code list for Organizations - [http://www.loc.gov/marc/organizations/](http://www.loc.gov/marc/organizations/)

**Obligation:** MA

**Occurence:** 0-1

## Description 

**Name:** description

**URI:** [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**Definition:** An account of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

- It is permitted to link one or more external descriptions using a URI. (See [Guidelines for the creation of descriptions](/mediawiki_wiki/User_Guide/Creating_Metadata#Guidelines_for_the_creation_of_descriptions)) 

**Has Range:**

- dc:description may be used with literal or non-literal values. For further information see [**RDF Examples**](/mediawiki_wiki/User_Guide/Publishing_Metadata#dcDescription_RDF).

**SES:** Using a URL the Syntax Encoding [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI) should be used.

**Obligation:** O

**Occurence:** 0-n

## Provenance 

**Name:** Provenance

**URI:** [http://purl.org/dc/terms/provenance](http://purl.org/dc/terms/provenance)

**Definition:** A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation.

**Type of Term:** Property

**DCLIB-Comment:**

- Has to be used with non-literal values.You may link to a provenance statement by URI. If no URI exist use a blank node describing the provenance (See [Guidelines for the creation of content for provenance](/mediawiki_wiki/User_Guide/Creating_Metadata#Guidelines_for_the_creation_of_content_for_provenance))

**Has Range:** [http://purl.org/dc/terms/ProvenanceStatement](http://purl.org/dc/terms/ProvenanceStatement) (For further information see [**RDF Examples**](/mediawiki_wiki/User_Guide/Publishing_Metadata#dctermsProvenance_RDF))

**Obligation:** O

**Occurence:** 0-1

## Exemplar Of 

**Name:** isExemplarOf

**URI:** [http://iflastandards.info/ns/fr/frbr/frbrer/P2006](http://iflastandards.info/ns/fr/frbr/frbrer/P2006)

**Definition:** Relates an item to the manifestation that is exemplified by the item.

**Type of Term:** Property

**DCLIB-Comment:** The relation between an item and the bibliographicTextResouce.

**Has Range:** The "Manifestation" level of the bibliographicTextResource

**Has Domain:** Item

**Obligation:** M

**Occurence:** 1

* * *

Go back to [AP for Bibliographic Text Resources](/mediawiki_wiki/DCLib_AP#Description_Set_Profile_of_the_DC-Lib_AP_for_Bibliographic_Text_Resources)


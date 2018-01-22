---
title: Encoding Schemes
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCLib_AP/Encoding_Schemes.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 September 2011, at 07:48.  
This page has been accessed 119,446 times.

The DC-Lib AP recommends the usage of the following Encoding Schemes:

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Syntax_Encoding_Schemes_of_the_DC-Lib_AP"><span class="tocnumber">1</span> <span class="toctext">Syntax Encoding Schemes of the DC-Lib AP</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#DCMI_Box"><span class="tocnumber">1.1</span> <span class="toctext">DCMI Box</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#DCMI_Period"><span class="tocnumber">1.2</span> <span class="toctext">DCMI Period</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#DCMI_Point"><span class="tocnumber">1.3</span> <span class="toctext">DCMI Point</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#ISO_639-2"><span class="tocnumber">1.4</span> <span class="toctext">ISO 639-2</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#ISO_3166"><span class="tocnumber">1.5</span> <span class="toctext">ISO 3166</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#ISO_8601"><span class="tocnumber">1.6</span> <span class="toctext">ISO 8601</span></a></li>
            <li class="toclevel-2 tocsection-8"><a href="#RFC_5646"><span class="tocnumber">1.7</span> <span class="toctext">RFC 5646</span></a></li>
            <li class="toclevel-2 tocsection-9"><a href="#URI"><span class="tocnumber">1.8</span> <span class="toctext">URI</span></a></li>
            <li class="toclevel-2 tocsection-10"><a href="#W3C-DTF"><span class="tocnumber">1.9</span> <span class="toctext">W3C-DTF</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#Z_39.88"><span class="tocnumber">1.10</span> <span class="toctext">Z 39.88</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-12">
          <a href="#Vocabulary_Encoding_Schemes_of_the_DC-LIB_AP"><span class="tocnumber">2</span> <span class="toctext">Vocabulary Encoding Schemes of the DC-LIB AP</span></a>
          <ul>
            <li class="toclevel-2 tocsection-13"><a href="#AAT"><span class="tocnumber">2.1</span> <span class="toctext">AAT</span></a></li>
            <li class="toclevel-2 tocsection-14"><a href="#ISO_639-3"><span class="tocnumber">2.2</span> <span class="toctext">ISO 639-3</span></a></li>
            <li class="toclevel-2 tocsection-15"><a href="#MARC_Countries"><span class="tocnumber">2.3</span> <span class="toctext">MARC Countries</span></a></li>
            <li class="toclevel-2 tocsection-16"><a href="#DCMI_Type_Vocabulary"><span class="tocnumber">2.4</span> <span class="toctext">DCMI Type Vocabulary</span></a></li>
            <li class="toclevel-2 tocsection-17"><a href="#DDC"><span class="tocnumber">2.5</span> <span class="toctext">DDC</span></a></li>
            <li class="toclevel-2 tocsection-18"><a href="#Thesaurus_for_Graphic_Materials"><span class="tocnumber">2.6</span> <span class="toctext">Thesaurus for Graphic Materials</span></a></li>
            <li class="toclevel-2 tocsection-19"><a href="#MARC_Geoareas"><span class="tocnumber">2.7</span> <span class="toctext">MARC Geoareas</span></a></li>
            <li class="toclevel-2 tocsection-20"><a href="#IMT"><span class="tocnumber">2.8</span> <span class="toctext">IMT</span></a></li>
            <li class="toclevel-2 tocsection-21"><a href="#LCC"><span class="tocnumber">2.9</span> <span class="toctext">LCC</span></a></li>
            <li class="toclevel-2 tocsection-22"><a href="#LCSH"><span class="tocnumber">2.10</span> <span class="toctext">LCSH</span></a></li>
            <li class="toclevel-2 tocsection-23"><a href="#MARC_Genre_Terms"><span class="tocnumber">2.11</span> <span class="toctext">MARC Genre Terms</span></a></li>
            <li class="toclevel-2 tocsection-24"><a href="#MARC_Target_Audience"><span class="tocnumber">2.12</span> <span class="toctext">MARC Target Audience</span></a></li>
            <li class="toclevel-2 tocsection-25"><a href="#MeSH"><span class="tocnumber">2.13</span> <span class="toctext">MeSH</span></a></li>
            <li class="toclevel-2 tocsection-26"><a href="#TGN"><span class="tocnumber">2.14</span> <span class="toctext">TGN</span></a></li>
            <li class="toclevel-2 tocsection-27"><a href="#UDC"><span class="tocnumber">2.15</span> <span class="toctext">UDC</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Syntax Encoding Schemes of the DC-Lib AP 

## DCMI Box 

**Name:** Box

**URI:** [http://purl.org/dc/terms/Box](http://purl.org/dc/terms/Box)

**Definition:** The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://dublincore.org/documents/dcmi-box/](http://dublincore.org/documents/dcmi-box/)

## DCMI Period 

**Name:** Period

**URI:** [http://purl.org/dc/terms/Period](http://purl.org/dc/terms/Period)

**Definition:** The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://dublincore.org/documents/dcmi-period/](http://dublincore.org/documents/dcmi-period/)

## DCMI Point 

**Name:** Point

**URI:** [http://purl.org/dc/terms/Point](http://purl.org/dc/terms/Point)

**Definition:** The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://dublincore.org/documents/dcmi-point/](http://dublincore.org/documents/dcmi-point/)

## ISO 639-2 

**Name:** ISO639-2

**URI:** [http://purl.org/dc/terms/ISO639-2](http://purl.org/dc/terms/ISO639-2)

**Definition:** The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://www.loc.gov/standards/iso639-2/langhome.html](http://www.loc.gov/standards/iso639-2/langhome.html)

## ISO 3166 

**Name:** ISO3166

**URI:** [http://purl.org/dc/terms/ISO3166](http://purl.org/dc/terms/ISO3166)

**Definition:** The set of codes listed in ISO 3166-1 for the representation of names of countries.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html](http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html)

## ISO 8601 

**Name:** ISO8601

**URI:** [http://purl.org/dclib/terms/ISO8601](http://purl.org/dclib/terms/ISO8601)

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Comment:** Set of rules to present date and time values.

## [RFC 5646](http://tools.ietf.org/html/rfc5646) 

**Name:** RFC5646

**URI:** [http://purl.org/dc/terms/RFC5646](http://purl.org/dc/terms/RFC5646)

**Definition:** The set of tags constructed according to [RFC 5646](http://tools.ietf.org/html/rfc5646) for the identification of languages.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://www.ietf.org/rfc/rfc5646.txt](http://www.ietf.org/rfc/rfc5646.txt)

**Comment:** [RFC 5646](http://tools.ietf.org/html/rfc5646) obsoletes [RFC 4646](http://tools.ietf.org/html/rfc4646) and [RFC 3066](http://tools.ietf.org/html/rfc3066).

## URI 

**Name:** URI

**URI:** [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI)

**Definition:** The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**DCLIB-Comment:** see [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

## W3C-DTF 

**Name:** W3CDTF

**URI:** [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Definition:** The set of dates and times constructed according to the W3C Date and Time Formats Specification.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**DCLIB-Comment:** see [http://www.w3.org/TR/NOTE-datetime](http://www.w3.org/TR/NOTE-datetime)

## Z 39.88 

**Name:** Z39.88-2004

**URI:** [http://purl.org/dclib/terms/Z3988](http://purl.org/dclib/terms/Z3988)

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Comment:** OpenURL Framework for Context-Sensitive Services. To use Z39.88 with dcterms:bibliographicCitation see [Guidelines for Encoding Bibliographic Citation Information in Dublin Core Metadata](http://dublincore.org/documents/dc-citation-guidelines/index.shtml).

**See:** [http://www.openurl.info/registry/](http://www.openurl.info/registry/)

# Vocabulary Encoding Schemes of the DC-LIB AP 

## AAT 

**Name:** AAT

**URI:** [http://purl.org/dclib/terms/AAT](http://purl.org/dclib/terms/AAT)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Comment:** Art and Architecture Thesaurus

**See:** [http://www.getty.edu/research/conducting\_research/vocabularies/aat/](http://www.getty.edu/research/conducting_research/vocabularies/aat/)

## ISO 639-3 

**Name:** ISO639-3

**URI:** [http://purl.org/dc/terms/ISO639-3](http://purl.org/dc/terms/ISO639-3)

**Definition:** The set of three-letter codes listed in ISO 639-3 for the representation of names of languages.

**Type of Term:** [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**See:** [http://www.sil.org/iso639-3/](http://www.sil.org/iso639-3/)

## MARC Countries 

**Name:** countries

**URI:** [http://id.loc.gov/vocabulary/countries](http://id.loc.gov/vocabulary/countries)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Comment:** MARC Code List for Countries

**See:** [http://www.loc.gov/marc/countries/](http://www.loc.gov/marc/countries/)

## DCMI Type Vocabulary 

**Name:** DCMIType

**URI:** [http://purl.org/dc/terms/DCMIType](http://purl.org/dc/terms/DCMIType)

**Definition:** The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://dublincore.org/documents/dcmi-type-vocabulary/](http://dublincore.org/documents/dcmi-type-vocabulary/)

## DDC 

**Name:** DDC

**URI:** [http://purl.org/dc/terms/DDC](http://purl.org/dc/terms/DDC)

**Definition:** The set of conceptual resources specified by the Dewey Decimal Classification.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://www.oclc.org/dewey/](http://www.oclc.org/dewey/)

## Thesaurus for Graphic Materials 

**Name:** graphicMaterials

**URI:** [http://id.loc.gov/vocabulary/graphicMaterials](http://id.loc.gov/vocabulary/graphicMaterials)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

## MARC Geoareas 

**Name:** geoareas

**URI:** [http://id.loc.gov/vocabulary/geographicAreas](http://id.loc.gov/vocabulary/geographicAreas)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Comment:** MARC Code List for Geographic Areas

**See:** [http://www.loc.gov/marc/geoareas/](http://www.loc.gov/marc/geoareas/)

## IMT 

**Name:** IMT

**URI:** [http://purl.org/dc/terms/IMT](http://purl.org/dc/terms/IMT)

**Definition:** The set of media types specified by the Internet Assigned Numbers Authority.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://purl.org/NET/mediatypes/](http://purl.org/NET/mediatypes/)

## LCC 

**Name:** LCC

**URI:** [http://purl.org/dc/terms/LCC](http://purl.org/dc/terms/LCC)

**Definition:** The set of conceptual resources specified by the Library of Congress Classification.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html](http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html)

## LCSH 

**Name:** LCSH

**URI:** [http://purl.org/dc/terms/LCSH](http://purl.org/dc/terms/LCSH)

**Definition:** The set of labeled concepts specified by the Library of Congress Subject Headings.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

## MARC Genre Terms 

**Name:** marcgt

**URI:** [http://purl.org/dclib/terms/marcgt](http://purl.org/dclib/terms/marcgt)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Comment:** MARC List of Genre Terms

**See:** [http://www.loc.gov/standards/valuelist/marcgt.html](http://www.loc.gov/standards/valuelist/marcgt.html)

## MARC Target Audience 

**Name:** marctarget

**URI:** [http://purl.org/dclib/terms/marctarget](http://purl.org/dclib/terms/marctarget)

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Comment:** MARC Target Audience Term List

**See:** [http://www.loc.gov/standards/valuelist/marctarget.html](http://www.loc.gov/standards/valuelist/marctarget.html)

## MeSH 

**Name:** MESH

**URI:** [http://purl.org/dc/terms/MESH](http://purl.org/dc/terms/MESH)

**Definition:** The set of labeled concepts specified by the Medical Subject Headings.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://www.nlm.nih.gov/mesh/meshhome.html](http://www.nlm.nih.gov/mesh/meshhome.html)

## TGN 

**Name:** TGN

**URI:** [http://purl.org/dc/terms/TGN](http://purl.org/dc/terms/TGN)

**Definition:** The set of places specified by the Getty Thesaurus of Geographic Names.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** see [http://www.getty.edu/research/tools/vocabulary/tgn/index.html](http://www.getty.edu/research/tools/vocabulary/tgn/index.html)

## UDC 

**Name:** UDC

**URI:** [http://purl.org/dc/terms/UDC](http://purl.org/dc/terms/UDC)

**Definition:** The set of conceptual resources specified by the Universal Decimal Classification.

**Type of Term:** [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**See:** [http://www.udcc.org/](http://www.udcc.org/)

* * *

Go back to [AP for Bibliographic Text Resources](/mediawiki_wiki/DCLib_AP#Description_Set_Profile_of_the_DC-Lib_AP_for_Bibliographic_Text_Resources "DCLib AP")


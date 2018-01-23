---
title: Deliverable 1
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Deliverable_1.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 October 2014, at 13:05.  
This page has been accessed 66,627 times.

[<img alt="RDF AP TG logo" src="/mediawiki_wiki/images/RdfAP_tg.png" width="200" height="141">](/mediawiki_wiki/images/RdfAP_tg.png)

* * *

##### [Handbook](/mediawiki_wiki/DCMI_Handbook.md): [Table of Contents](/mediawiki_wiki/DCMI_Handbook/) 
<dl>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Governing_Board.md" title="DCMI Governing Board">Governing Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Governing_Board/finance.md" title="DCMI Governing Board/finance">Membership &amp; Finance</a> ◘ <a href="/mediawiki_wiki/DCMI_Governing_Board/nominations.md" title="DCMI Governing Board/nominations">Nominations &amp; Bylaws</a> 
</dd>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Technical_Board.md" title="DCMI Technical Board">Technical Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Technical_Board/usage.md" title="DCMI Technical Board/usage">Usage</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/standards.md" title="DCMI Technical Board/standards">Standards &amp; Liaisons</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/specifications.md" title="DCMI Technical Board/specifications">Community Specifications</a>
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
        <li class="toclevel-1 tocsection-1">
          <a href="#Report_on_the_current_state:_use_cases_and_validation_requirements"><span class="tocnumber">2</span> <span class="toctext">Report on the current state: use cases and validation requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Introduction"><span class="tocnumber">2.1</span> <span class="toctext">Introduction</span></a></li>
            <li class="toclevel-2 tocsection-3">
              <a href="#Case_studies_and_use_cases"><span class="tocnumber">2.2</span> <span class="toctext">Case studies and use cases</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#Europeana_Data_Model_.28EDM.29"><span class="tocnumber">2.2.1</span> <span class="toctext">Europeana Data Model (EDM)</span></a></li>
                <li class="toclevel-3 tocsection-5"><a href="#Digital_Public_Library_of_America_.28DPLA.29_MAPv3"><span class="tocnumber">2.2.2</span> <span class="toctext">Digital Public Library of America (DPLA) MAPv3</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#Deutsche_Digitale_Bibliothek_.28German_Digital_Library.2C_DDB.29"><span class="tocnumber">2.2.3</span> <span class="toctext">Deutsche Digitale Bibliothek (German Digital Library, DDB)</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#DM2E_model"><span class="tocnumber">2.2.4</span> <span class="toctext">DM2E model</span></a></li>
                <li class="toclevel-3 tocsection-8"><a href="#OER_World_Map_prototype"><span class="tocnumber">2.2.5</span> <span class="toctext">OER World Map prototype</span></a></li>
                <li class="toclevel-3 tocsection-9"><a href="#Using_RFC_6906_Profiles"><span class="tocnumber">2.2.6</span> <span class="toctext">Using RFC 6906 Profiles</span></a></li>
                <li class="toclevel-3 tocsection-10"><a href="#DINI_AG_KIM_-_RDF-Representation_of_Bibliographic_Data"><span class="tocnumber">2.2.7</span> <span class="toctext">DINI AG KIM - RDF-Representation of Bibliographic Data</span></a></li>
                <li class="toclevel-3 tocsection-11"><a href="#Reusing_CEN_EuroLMAI.2C_DC_In_Academia"><span class="tocnumber">2.2.8</span> <span class="toctext">Reusing CEN EuroLMAI, DC In Academia</span></a></li>
                <li class="toclevel-3 tocsection-12"><a href="#Tiny_Archive"><span class="tocnumber">2.2.9</span> <span class="toctext">Tiny Archive</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-13">
              <a href="#RDF_validation_database"><span class="tocnumber">2.3</span> <span class="toctext">RDF validation database</span></a>
              <ul>
                <li class="toclevel-3 tocsection-14"><a href="#Requirement_classification"><span class="tocnumber">2.3.1</span> <span class="toctext">Requirement classification</span></a></li>
                <li class="toclevel-3 tocsection-15"><a href="#Dublin_Core_validation_requirements"><span class="tocnumber">2.3.2</span> <span class="toctext">Dublin Core validation requirements</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-16"><a href="#RDF_Validator"><span class="tocnumber">2.4</span> <span class="toctext">RDF Validator</span></a></li>
            <li class="toclevel-2 tocsection-17"><a href="#Conclusion"><span class="tocnumber">2.5</span> <span class="toctext">Conclusion</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


# Report on the current state: use cases and validation requirements

**Creator:** [Evelyn Dröge](mailto:evelyn.droege@ibi.hu-berlin.de)

**Creator:** [Thomas Bosch](mailto:Thomas.Bosch@gesis.org)

**Creator:** Valentine Charles

**Creator:** Robina Clayphan

**Creator:** Mark Matienzo

**Creator:** Stefanie Rühle

**Creator:** Adrian Pohl

**Creator:** Miika Alonen

**Creator:** Lars Svensson

**Creator:** Karen Coyle

**Date Issued:** 2014-09-xx

**Identifier:** [/mediawiki_wiki/Deliverable\_1](/mediawiki_wiki/Deliverable_1.md)

**Replaces:** Not applicable

**Is Replaced By:** [/mediawiki_wiki/RDF\_Application\_Profiles/UCR\_Deliverable](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable.md)

**Latest Version:** [/mediawiki_wiki/RDF\_Application\_Profiles/UCR\_Deliverable](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable.md)

**Status of Document:** Draft

**Description of Document:** This document is the first deliverable of the "DCMI RDF Application Profiles Task Force" (DCMI RDF-AP). It reports on the current state of use cases and validation requirements in September 2014.

## Introduction 

This document describes the current state of the "DCMI RDF Application Profiles Task Force" (DCMI RDF-AP) in month 3 (September 2014). The DCMI RDF-AP aims at defining best practices for documenting application profiles, requests for handling RDF application profiles and for RDF constraints specification and validation. This deliverable focuses on reporting on the case studies collected in the task force, their use cases and their validation requirements (see section 2.2). The case studies of the task force are about the following models or representations (in alphabetical order): CEN EuroLMAI and DC reuse in academia, DINI AG KIM - RDF-Representation of Bibliographic Data, DM2E model, DPLA Metadata Application Profile version 3 (MAPv3), Europeana Data Model (EDM), EDM specialisation in the Deutsche Digitale Bibliothek (DDB), OER World Map prototype, [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles and Tiny Archive.

The full descriptions of case studies and use cases can be found in the [task force wiki](/mediawiki_wiki/RDF_Application_Profiles.md). Validation requirements and the corresponding use cases are collected in the [validation database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/). The links to the particular case studies, use cases and requirements can be found in each of the descriptions.

In addition to the case studies, the validation database including the Dublin Core validation requirements (see section 2.3) as well as an RDF validator (section 2.4) are presented.

## Case studies and use cases

A case study in the RDF-AP group refers to one model, application profile or any other specific way of reusing one or more vocabularies. A few case studies are divided into different validation use cases. These use cases are linked to general validation requirements from a requirement classification.

### Europeana Data Model (EDM) 

[Europeana](http://europeana.eu/) , the European digital library, provides access to more than 30 million library, archive, museum and audio-visual objects from 36 countries. The Europeana Data Model (EDM) was designed in order to insert diverse metadata about Cultural Heritage Objects (CHOs) into Europeana.

Full case study: [Wiki](/mediawiki_wiki/EDM.md) and [validation database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-4-EUROPEANA-DATA-MODEL-EDM)

Similar case studies: DPLA, DDB, DM2E

<table class="wikitable">
  <caption> Table 1: EDM use cases.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/337" class="external text" rel="nofollow">Data quality</a>
    </td>
    <td>No html tags and not leading or trailing white spaces in the metadata.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-5-MANDATORY-EDM-CLASSES" class="external text" rel="nofollow">Mandatory EDM classes</a>
    </td>
    <td>Every cultural heritage object is described by using the classes <i>edm:ProvidedCHO</i> and <i>ore:Aggregation</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/338" class="external text" rel="nofollow">Valid URIs</a>
    </td>
    <td>Europeana requires for all the classes and properties requiring references to have valid URIs.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/339" class="external text" rel="nofollow">URI uniqueness</a>
    </td>
    <td>
      <i>edm:ProvidedCHO</i> and <i>ore:Aggregation</i> instances need to have unique URIs across a dataset.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/340" class="external text" rel="nofollow">Dependency class-properties</a>
    </td>
    <td>Some EDM classes imply the use of properties. If the class is used these properties should be used.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341" class="external text" rel="nofollow">Property character chains match</a>
    </td>
    <td>Some EDM properties requires specific values (these value can come from a vocabulary). For instance, check that edm:type matches the value TEXT, VIDEO, SOUND, IMAGE, 3D.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory Properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/343" class="external text" rel="nofollow">Mandatory Properties with conditions</a>
    </td>
    <td>EDM provides a list of mandatory properties per classes. However, there are some conditions on certain classes requiring the use of at least one of the mandatory properties.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/344" class="external text" rel="nofollow">Property refinement</a>
    </td>
    <td>In EDM some properties have sub-properties which add more semantics to the information. If the general property is used more than once in the same records, the sub-properties should be used instead.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/378" class="external text" rel="nofollow">Dependency-reference-class</a>
    </td>
    <td>In EDM, the use of a reference in some properties triggers the creation of a new class.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/379" class="external text" rel="nofollow">Property Redundancy</a>
    </td>
    <td>In EDM, some properties also have sub-properties that should be used to add more semantic to the data. If the super property and its sub-properties are present, there is a risk of redundancy that could affect the quality of the data.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/380" class="external text" rel="nofollow">Property value occurrence</a>
    </td>
    <td>In EDM, some property should contain only one value/statement for data quality reasons.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/381" class="external text" rel="nofollow">Property comparison</a>
    </td>
    <td>In some cases literals values need to be compared to be validated. It is especially relevant for properties capturing time based information.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/382" class="external text" rel="nofollow">Class relationship</a>
    </td>
    <td>Some properties of EDM allows for the expression of relationships between entities. Most of the relationships are of type hierarchy, membership, sequence and therefore need to be validated.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/383" class="external text" rel="nofollow">Value validation across dataset</a>
    </td>
    <td>Europeana manages its data per dataset. Each record from a dataset come from the same provider. The value indicating the name of this provider should be the same across the whole dataset.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/387" class="external text" rel="nofollow">URI target validation</a>
    </td>
    <td>Some EDM properties should be used in combination with URI pointing to specific media. Some constraints might be defined for these medias (file type, size) .
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/390" class="external text" rel="nofollow">Property syntax match</a>
    </td>
    <td>Some EDM properties requires specific values using a specific syntax, e.g. check if the value for date matches ISO 8601 (starting with the year and hyphenating the day and month parts: YYYY-MM-DD).
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/391" class="external text" rel="nofollow">Ambiguous prefLabel values</a>
    </td>
    <td>EDM re-uses SKOS for describing contextual resources. Specific rules apply to SKOS properties, e.g. ideally all <i>skos:prefLabel</i> should have a language tag.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/392" class="external text" rel="nofollow">Presence of language tag</a>
    </td>
    <td>All EDM properties and SKOS properties requiring text value should ideally have a language tag.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/393" class="external text" rel="nofollow">Overlap in Disjoint Label Properties</a>
    </td>
    <td>
      <i>skos:prefLabel</i>, <i>skos:altlabel</i> and <i>skos:hiddenLabel</i> cannot have the same label.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/394" class="external text" rel="nofollow">Property-use-consistency</a>
    </td>
    <td>Two concepts cannot be mapped to each other by using both skos:exactMatch and skos:broadMatch or skos:relatedMatch.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/399" class="external text" rel="nofollow">Recommended properties</a>
    </td>
    <td>EDM recommends a set properties for improving the quality of the data.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/403" class="external text" rel="nofollow">Validation of EDM extensions</a>
    </td>
    <td>Europeana needs to be able to validate data using EDM extensions against the general EDM schema and schemas for EDM extensions.
    </td>
  </tr>
</table>

### Digital Public Library of America (DPLA) MAPv3 

The [Digital Public Library of America (DPLA)](http://dp.la/) provides access to digitized cultural heritage objects held by libraries, archives, museums, and historical societies throughout the United States. The DPLA Metadata Application Profile version 3 (MAPv3) builds on the Europeana Data Model.

Full case study: [Wiki](/mediawiki_wiki/DPLA_RDF_application_profile_use_cases.md) and [validation database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-1-DPLA-RDF-APPLICATION-PROFILE).

Similar case studies: EDM, DDB, DM2E

<table class="wikitable">
  <caption>Table 2: DPLA MAPv3 use cases.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-1-VALIDATION-FOLLOWING-DPLA-ENRICHMENT" class="external text" rel="nofollow">Validation following DPLA enrichment</a>
    </td>
    <td>If a set of statements that has passed the mapping and enrichment pipeline does not comply with MAPv3, it can be prevented from being saved to the production store.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-2-VALIDATION-USING-MAPV3-DATA-SUPPLIED-BY-PARTNERS" class="external text" rel="nofollow">Validation Using MAPv3 Data Supplied By Partners</a>
    </td>
    <td>A partner should be able to validate a set of statements to assure compliance against MAPv3 before submitting the data to DPLA for ingestion, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA). DPLA should be able to validate a set of statements for MAPv3 compliance.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-3-ESTABLISHING-MANDATORY-AND-RECOMMENDED-LEVELS-OF-VALIDATION" class="external text" rel="nofollow">Establishing Mandatory And Recommended Levels Of Validation</a>
    </td>
    <td>Some properties may not be mandatory, but may be recommended to indicate a "value-added" level of compliance with MAPv3.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-4-VALIDATION-OF-MAPV3-DATA-BY-API-CONSUMERS" class="external text" rel="nofollow">Validation Of MAPv3 Data By API Consumers</a>
    </td>
    <td>Developers should be able to validate sets of statements against MAPv3 when trying to diagnose issues with their applications, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA).
    </td>
  </tr>
</table>

### Deutsche Digitale Bibliothek (German Digital Library, DDB) 

The [German Digital Library](https://www.deutsche-digitale-bibliothek.de/content/about/) is a portal providing access to digital cultural and scientific objects from Germany. It is also a national contributor for Europeana. Therefore the DDB uses EDM as the model for the interlinking of objects in the DDB and the contribution of metadata to Europeana. But the use of EDM in the DDB requires an extension of properties used in EDM. Therefore - like DM2E - the DDB developed a specialization of EDM for the DDB domain.

Similar case studies: EDM, DM2E, DPLA

<table class="wikitable">
  <caption>Table 3: DDB use cases.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/357" class="external text" rel="nofollow">Uniqueness of URI</a>
    </td>
    <td>Resources used in the DDB must be represented by unique URIs.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-5-MANDATORY-EDM-CLASSES" class="external text" rel="nofollow">Mandatory EDM classes</a>
    </td>
    <td>Every cultural heritage object is described by using the classes <i>edm:ProvidedCHO</i> and <i>ore:Aggregation</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-10-WRONG-PROPERTY-DOMAINS" class="external text" rel="nofollow">Wrong Property Domains</a>
    </td>
    <td>Check if the (datatype or object) property is in the right domain.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/384" class="external text" rel="nofollow">Mandatory DDB Terms</a>
    </td>
    <td>In addition to the mandatory EDM terms in DDB more properties are mandatory, e.g., <i>dcterms:rights</i> and <i>edm:provider</i> to describe an <i>ore:Aggregation</i>
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/385" class="external text" rel="nofollow">Domain Dependent Mandatory Properties</a>
    </td>
    <td>Some properties are mandatory depending on the class of their domain. E. g., the use of <i>dc:type</i> to describe an <i>edm:WebResource</i> is mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/388" class="external text" rel="nofollow">Domain Dependent Non-repeatable Properties</a>
    </td>
    <td>Depending on their domain some properties are not repeatable. E.g., <i>dc:type</i> must not be repeated if it is used to describe an edm:WebResource.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341" class="external text" rel="nofollow">Property character chains match</a>
    </td>
    <td>Some EDM properties requires specific values (these value can come from a vocabulary). For instance, check that <i>edm:type</i> matches the value TEXT, VIDEO, SOUND, IMAGE, 3D.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/378" class="external text" rel="nofollow">Dependency-reference-class</a>
    </td>
    <td>In EDM, the use of a reference in some properties triggers the creation of a new class.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-12-OBJECT-PROPERTY-RANGE" class="external text" rel="nofollow">Object Property Range</a>
    </td>
    <td>Check if the object property range is correct, e.g. if <i>dm2e:painter</i> has range <i>foaf:Person</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/389" class="external text" rel="nofollow">Domain Dependent Value of the Property</a>
    </td>
    <td>Depending on their domain some properties have to be used with URIs of controlled vocabularies. E.g., if <i>dc:type</i> is used to describe an edm:WebResource its value has to be a URI from the DDB media type vocabulary
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/354" class="external text" rel="nofollow">Value dependency of property obligation</a>
    </td>
    <td>The obligation of a property depends on the value of another property.Ee.g., if dc:type is used with the value "Chapter", the use of <i>dcterms:isPartOf</i> is mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/356" class="external text" rel="nofollow">Value dependency of value use</a>
    </td>
    <td>The value allowed with a property depends on the value of another property, e.g., if <i>ddb:hierarchyType</i> is used with the value "htype_006", the value of <i>ddb:aggregationEntity</i> has to be "false".
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory Properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-16-RULES-FROM-REUSED-VOCABULARIES" class="external text" rel="nofollow">Rules from reused vocabularies</a>
    </td>
    <td>Application Profiles like the DM2E model or DDB's EDM Profile must fulfil the requirements of the underlying vocabularies. E.g., mandatory properties in EDM must also be mandatory in DM2E and DDB.
    </td>
  </tr>
</table>

### DM2E model 

The DM2E model is a specialisation of the EDM for the manuscript domain. It is used for mappings to Europeana and for publishing delivered metadata as LOD via the DM2E LOD API in the scope of the Digitised manuscripts to Europeana (DM2E) project.

Full case study: [Wiki](/mediawiki_wiki/DM2E.md) and [validation database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-3-DIGITISED-MANSCRIPTS-TO-EUROPEANA-DM2E).

Similar case studies: EDM, DDB, DPLA

<table class="wikitable">
  <caption>Table 4: DM2E model use cases.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-5-MANDATORY-EDM-CLASSES" class="external text" rel="nofollow">Mandatory EDM classes</a>
    </td>
    <td>Every cultural heritage object is described by using the classes <i>edm:ProvidedCHO</i> and <i>ore:Aggregation</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-6-MANDATORY-DM2E-PROPERTIES" class="external text" rel="nofollow">Mandatory DM2E properties</a>
    </td>
    <td>In addition to the mandatory EDM elements, the DM2E model requires some more properties. E.g., <i>dc:type</i> with the range of subclasses of <i>edm:PhysicalThing</i> or <i>skos:Concept</i> for <i>edm:ProvidedCHO</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-7-RECOMMENDED-DM2E-PROPERTIES" class="external text" rel="nofollow">Recommended DM2E Properties</a>
    </td>
    <td>Recommended properties in the DM2E model are for example: <i>edm:object</i> and <i>dm2e:hasAnnotatableVersionAt</i> in <i>ore:Aggregation</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-8-NON-REPEATABLE-DM2E-PROPERTIES" class="external text" rel="nofollow">Non-Repeatable DM2E Properties</a>
    </td>
    <td>The DM2E model has many non-repeatable properties, e.g. <i>edm:currentLocation</i> and <i>dm2e:holdingInstitution</i> for the provided object.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-9-WRONG-MIME-TYPES" class="external text" rel="nofollow">Wrong Mime Types</a>
    </td>
    <td>If you provide an <i>edm:object</i> it is mandatory to add an allowed MIME type with dc:format to the <i>edm:WebResource</i>, e.g. image/png or image/jpeg.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-10-WRONG-DATATYPES" class="external text" rel="nofollow">Wrong datatypes</a>
    </td>
    <td>Check whether a datatype property is used with the right datatype, e.g. the recommended use of <i>bibo:numPages</i> in DM2E is <i>xsd:unsignedInt</i>, the value of <i>dm2e:displayLevel</i> must be <i>xsd:boolean</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-10-WRONG-PROPERTY-DOMAINS" class="external text" rel="nofollow">Wrong Property Domains</a>
    </td>
    <td>Check if the (datatype or object) property is in the right domain.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-12-OBJECT-PROPERTY-RANGE" class="external text" rel="nofollow">Object Property Range</a>
    </td>
    <td>Check if the object property range is correct, e.g. dm2e:painter has range foaf:Person.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-13-ILLEGAL-URI-CHARACTERS" class="external text" rel="nofollow">Illegal URI characters</a>
    </td>
    <td>The use of <a href="http://tools.ietf.org/html/rfc3986" class="external mw-magiclink-rfc">RFC 3986</a> compliant URIs is obligatory and verified by generating FATAL errors for invalid URIs at validation time.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-14-RECOMMENDED-LANGUAGE-TAGS" class="external text" rel="nofollow">Recommended Language Tags</a>
    </td>
    <td>The DM2E model recommends using language tags and following the language representation standards RFC3066 and RFC5646 (use an ISO-639-1 2-character ; if it not exists, use a ISO-639-2 3-character code). Language tags should be used whenever language information is available, but they are not mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-15-UNSUPPORTED-PROPERTIES" class="external text" rel="nofollow">Unsupported Properties in DM2E</a>
    </td>
    <td>Properties or classes that are not part of the model are not accepted in the ingestion because they cannot be displayed in the Europeana portal or the DM2E search engines.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/340" class="external text" rel="nofollow">Dependency class-properties</a>
    </td>
    <td>Some EDM class imply the use of properties. If the class is used these properties should be used.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341" class="external text" rel="nofollow">Property character chains match</a>
    </td>
    <td>Some EDM properties requires specific values (these value can come from a vocabulary). For instance, check that <i>edm:type</i> matches the value TEXT, VIDEO, SOUND, IMAGE, 3D.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/357" class="external text" rel="nofollow">Uniqueness of URI</a>
    </td>
    <td>Resources used in the DDB must be represented by unique URIs.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/385" class="external text" rel="nofollow">Domain Dependent Mandatory Properties</a>
    </td>
    <td>Some properties are mandatory depending on the class of their domain. E. g., the use of <i>dc:type</i> to describe an <i>edm:WebResource</i> is mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/389" class="external text" rel="nofollow">Domain Dependent Value of the Property</a>
    </td>
    <td>Depending on their domain some properties have to be used with URIs of controlled vocabularies. E.g., if dc:type is used to describe an <i>edm:WebResource</i> its value has to be a URI from the DDB media type vocabulary
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/387" class="external text" rel="nofollow">URI target validation</a>
    </td>
    <td>Some EDM properties should be used in combination with URI pointing to specific media. Some constraints might be defined for these medias (file type, size) .
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory Properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-16-RULES-FROM-REUSED-VOCABULARIES" class="external text" rel="nofollow">Rules from reused vocabularies</a>
    </td>
    <td>Application Profiles like the DM2E model or DDB's EDM Profile must fulfil the requirements of the underlying vocabularies. E.g., mandatory properties in EDM must also be mandatory in DM2E and DDB.
    </td>
  </tr>
</table>

### OER World Map prototype 

The [hbz](http://www.hbz-nrw.de/) has built a [prototype for an Open Educational Resources (OER) world map](https://wiki1.hbz-nrw.de/x/tYGv). The data of the OER map prototype covers descriptions of organizations, persons, services and projects.

For the OER world map a read/write API was developed as well as an application (Drupal) for viewing, adding, deleting and editing the data (see the [image of the architecture](http://wiki1.hbz-nrw.de/download/attachments/10455419/OER-worldmap-arch4.png)). Both, API and application, need some specifications which should be expressed in an RDF application profile. While the API mainly needs information for validating incoming data, the application also needs information about presenting the data (result lists, single results, forms for editing the different resources).

Full case study: [Wiki](/mediawiki_wiki/OER-world-map.md) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-7-OER-WORLD-MAP-PROTOTYPE).

<table class="wikitable">
  <caption>Table 5: OER World Map prototype use case.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-17-OER-WORLDMAP-VALIDATION" class="external text" rel="nofollow">Validation following OER worldmap AP requirements</a>
    </td>
    <td>The read/write API should be able to validate submitted data against the application profile and report whether the data is valid with respect to the AP or should be adjusted.
    </td>
  </tr>
</table>


### Using [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles 

The case study is not about representing profiles, but rather about using them. Precisely, this use case does not depend on the representation of the profile, but on the profile having a URI for identification. In order to keep up with best practices, that URI SHOULD dereference to a representation, possibly using content negotiation to deliver human- and machine-readable interpretations.

Full case study: [Wiki](/mediawiki_wiki/RFC-6906-Profiles.md) and [validation database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-9-USING-RFC-6906-PROFILES-TO-SPECIFY-A-PROFILE-INDEPENDENTLY-OF-THE-MEDIA-TYPE).

<table class="wikitable">
  <caption>Table 6: <a href="http://tools.ietf.org/html/rfc6906" class="external mw-magiclink-rfc">RFC 6906</a> Profiles use case.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/378" class="external text" rel="nofollow">Dependency-reference-class</a>
    </td>
    <td>In EDM, the use of a reference in some properties triggers the creation of a new class.
    </td>
  </tr>
</table>


### DINI AG KIM - RDF-Representation of Bibliographic Data 

More and more members of the library network in German speaking countries publish their data as open "linked" data using different properties and classes and have different ideas what linked data really means. To harmonize this work some colleagues from library service centers, National Libraries etc. in Germany, Austria and Switzerland are working on a best practice guide.

If somebody wants to publish his data in compliance with the recommendation of the DINI AG KIM he starts with mapping his data to properties and classes listed in the best practice guide.

- First he needs a human readable documentation of the properties and classes he should use also describing the constraints concerning obligation, occurence and possible values of the properties. 
- For the technical mapping he could use a "template" describing what is needed in a machine-readable way. 
- During the mapping process he wants to automatically check the output for its compliance with the recommended properties, classes and constraints and needs a "schema" to do so.

Full case study: [Wiki](/mediawiki_wiki/KIM-recommendations.md) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-5-DINI-AG-KIM-RDF-REPRESENTATION-OF-BIBLIOGRAPHIC-DATA).

### Reusing CEN EuroLMAI, DC In Academia 

CSC is developing and maintaining national data model for the academia in the field of higher education and science. The use case for machine-readable application profile would be to support the whole lifecycle of development:

1. Development of application profiles using “semantic templates” which documents the vocabulary for both human and machine. Mix&Match classes and properties from appropriate vocabularies. Create extensions to existing application profiles, for example CEN MLO.
2. Validate the proper use of “semantic templates” (Validation of Application Profile)
3. Provide provenance information about lifecycle of the development process
4. Validate the instances against the developed application profile (Validation of Data)

Full case study: [Wiki](/mediawiki_wiki/CSC.md) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-8-REUSING-CEN-EUROLMAI-DC-IN-ACADEMIA).

### Tiny Archive 

Tiny archive has less than 10,000 total items. About 2/3 of these have been described in a spreadsheet, and each item is represented on the web as a web page. The descriptions contain commentary about their items in different languages. The archive wants to begin linking to other archives in its topic area, as well as to a database of terms that is now available in RDF.

Full case study: [Wiki](/mediawiki_wiki/TinyArchive.md).

## RDF validation database 

A database of requirements on RDF constraint formulation and validation, created by Thomas Bosch and Kai Eckert, is publicly accessible via [http://purl.org/net/rdf-validation](http://purl.org/net/rdf-validation). Currently, [199 validation requirements](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=requirements) have been collected. Sources have been (1) the 2013 W3C RDF Validation Workshop, (2) mailing list discussions from the W3C RDF Data Shapes Working Group, (3) the 2013 Semantic Web in Libraries conference, 4) discussions in the RDF Application Profiles Task Group, and (5) diverse research papers.

The idea of the extensible database is

1. to collect and describe case studies from experts (from theory and practice dealing with RDF validation problems) and the general public,
2. to extract common use cases from these case studies that illustrate particular problems,
3. to specify requirements to be fulfilled in order to adequately solve these problems and meet the use cases,
4. to investigate existing best-practices regarding these requirements, and
5. to evaluate existing approaches / tools to which extend specific requirements are fulfilled.

The database is extended by members of the task force.

The full source code of the system and the database with the current state of all requirements is available at [https://github.com/kaiec/reqbase](https://github.com/kaiec/reqbase).

There is a research paper about the RDF validation requirements database:

[Bosch, Eckert. Requirements on RDF Constraint Formulation and Validation (DC 2014)](https://github.com/boschthomas/PhD/tree/master/publications/Papers%20in%20Conference%20Proceedings).

### Requirement classification 

In order to structure the overall 199 requirements a classification system has been implemented. The most important top-level categories are

- Constraint Formulation (how to formulate constraints?) and
- Constraint Expressivity (what kind of constraints should be formulated?).

For the expressivity of constraints, we identified several sub-categories, such as:

- identification and uniqueness,
- cardinality restrictions,
- disjointness and equivalence, and
- constraints on RDF properties, objects, literals, and individuals.

The two top-level categories "Constraint Formulation" and "Constraint Expressivity" are the most important ones for the DC community, as

- the constraint languages should be concise, human-understandable, and intuitive (constraint formulation requirements) and 
- many of the already identified DC requirements are classified as constraint expressivity requirements.

### Dublin Core validation requirements 

When the capturing of RDF validation requirements from the W3C RDF Validation workshop was started in 2013, the intention and vision was to have one system which could be used to manage all RDF validation requirements as well as associated use cases, case studies, and tools which are relevant for different domains.

In order to support different views on requirements, use cases, and case studies for multiple domains like DC, views are introduced:

- Case studies may be tagged as DC case studies. As a consequence, these case studies are listed within the view on DC case studies: [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=case-studies/dc-case-studies](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=case-studies/dc-case-studies).
- Use cases which are associated with DC case studies are tagged as DC use cases automatically. DC use cases are displayed on a dedicated view: [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=use-cases/dc-use-cases](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=use-cases/dc-use-cases)
- RDF validation requirements that occur in DC use cases are classified as DC requirements automatically and can be accessed via [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=requirements/dc-requirements](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=requirements/dc-requirements). 

As a consequence each domain can browse the requirements, use cases, and case studies the domain is interested in, but also requirements, use cases, and case studies from other domains.

Overall, 32 requirements have been categorized as DC requirements.

So far, multiple (overall 12) OWL related RDF validation requirements are classified as DC requirements:

- object and data property domain and range
  - [R-25-OBJECT-PROPERTY-DOMAIN](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-25-OBJECT-PROPERTY-DOMAIN)
  - [R-26-DATA-PROPERTY-DOMAIN](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-26-DATA-PROPERTY-DOMAIN)
  - [R-28-OBJECT-PROPERTY-RANGE](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-28-OBJECT-PROPERTY-RANGE)
  - [R-35-DATA-PROPERTY-RANGE](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-35-DATA-PROPERTY-RANGE)
- object and data property cardinality restrictions
  - [R-76-MAXIMUM-QUALIFIED-CARDINALITY-RESTRICTIONS-ON-OBJECT-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/83)
  - [R-78-MINIMUM-QUALIFIED-CARDINALITY-RESTRICTIONS-ON-DATA-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/85)
  - [R-68-REQUIRED-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75)
  - [R-72-RECOMMENDED-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/79)
- disjoint data properties
  - [R-10-DISJOINT-DATA-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/17)
  - [R-11-DISJOINT-DATA-PROPERTIES-CLASS-SPECIFIC](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/18)
- subsumption
  - [R-100-SUBSUMPTION](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/120)
  - [R-64-SUB-DATA-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/71)

Additionally, multiple RDF validation requirements categorized as constraints on property occurrences (overall 6) have been tagged as DC-related requirements:

- required properties
  - [R-68-REQUIRED-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75)
- conditional properties
  - [R-71-CONDITIONAL-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/78)
- recommended properties
  - [R-72-RECOMMENDED-PROPERTIES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/79)

Very important for the DC community are requirements constraining RDF literals (overall 7):

- restrictions on language tags
  - [R-47-LANGUAGE-TAG-MATCHING](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/54)
  - [R-49-RDF-LITERALS-HAVING-AT-MOST-ONE-LANGUAGE-TAG](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56)
- allowed values
  - [R-37-ALLOWED-VALUES-FOR-RDF-LITERALS](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/44)
- ranges of RDF literal values
  - [R-45-RANGES-OF-RDF-LITERAL-VALUES](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/52)
- whitespace handling
  - [R-50-WHITESPACE-HANDLING-OF-RDF-LITERALS](http://http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/57)

## RDF Validator 

The RDF Validator can be used to validate constraints formulated with either [OWL 2](http://www.w3.org/TR/owl2-syntax/) or [DSP constructs](http://dublincore.org/documents/2008/03/31/dc-dsp/).

The RDF Validator can be accessed via [http://purl.org/net/rdfval-demo](http://purl.org/net/rdfval-demo).

[Mappings from OWL 2 and DSP to SPIN were implemented](https://github.com/dcmi/DSP-SPIN-Mapping) in order to execute RDF constraint validation automatically. The SPIN open source API is used for this purpose. The input of this Web application are constraints, data, and inference rules. The output are constraint violation triples.

The OWL 2 structural specification was used to define the SPIN mappings. The validation of OWL 2 constraints is based on closed world semantics. Reasoning may also be used to infer implicit triples which may affect the further validation of OWL 2 constraints.

The mappings from OWL 2 to SPIN can be found here: [https://github.com/boschthomas/OWL2-SPIN-Mapping](https://github.com/boschthomas/OWL2-SPIN-Mapping). A research paper about the approach behind the RDF validator and the SPIN mappings will be published: [Bosch, Eckert. Towards Description Set Profiles for RDF using SPARQL as Intermediate Language (DC 2014)](https://github.com/boschthomas/PhD/tree/master/publications/Papers%20in%20Conference%20Proceedings).

This demonstrator will be extended in order to validate further constraint languages.

## Conclusion 

The deliverable gave insight into the current state of the RDF-AP task group. Different case studies have been collected and some are connected to requirements from a validation database. It could be seen that especially case studies which build on the same datamodel (EDM) have some use cases and validation requirements in common. Still, every case study provides some unique use cases. All requirements that occur in the task group's case studies can be seen in the database in the "DC views" tab. The work on the database is ongoing and can be followed via the [mailing list](https://www.jiscmail.ac.uk/cgi-bin/webadmin?SUBED1=dc-architecture&A=1).


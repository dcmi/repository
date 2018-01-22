---
title: UCR Deliverable
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 27 August 2015, at 14:37.  
This page has been accessed 94,679 times.

[<img alt="RDF AP TG logo" src="/mediawiki_wiki/images/RdfAP_tg.png" width="200" height="141">](/mediawiki_wiki/images/RdfAP_tg.png)

* * *

##### [Handbook](/mediawiki_wiki/DCMI_Handbook "DCMI Handbook"): [Table of Contents](/mediawiki_wiki/DCMI_Handbook/) 
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
                <li class="toclevel-3 tocsection-11"><a href="#CSC_-_Reusing_CEN_EuroLMAI.2C_DC_in_Academia"><span class="tocnumber">2.2.8</span> <span class="toctext">CSC - Reusing CEN EuroLMAI, DC in Academia</span></a></li>
                <li class="toclevel-3 tocsection-12"><a href="#Tiny_Archive"><span class="tocnumber">2.2.9</span> <span class="toctext">Tiny Archive</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-13">
              <a href="#Database_on_case_studies.2C_use_cases.2C_requirements.2C_and_solutions_regarding_RDF_constraint_formulation_and_RDF_data_validation"><span class="tocnumber">2.3</span> <span class="toctext">Database on case studies, use cases, requirements, and solutions regarding RDF constraint formulation and RDF data validation</span></a>
              <ul>
                <li class="toclevel-3 tocsection-14"><a href="#DCMI_case_studies.2C_use_cases.2C_and_requirements"><span class="tocnumber">2.3.1</span> <span class="toctext">DCMI case studies, use cases, and requirements</span></a></li>
                <li class="toclevel-3 tocsection-15"><a href="#Research_papers"><span class="tocnumber">2.3.2</span> <span class="toctext">Research papers</span></a></li>
                <li class="toclevel-3 tocsection-16"><a href="#Sustainability_of_the_database_and_technical_details"><span class="tocnumber">2.3.3</span> <span class="toctext">Sustainability of the database and technical details</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-17"><a href="#Conclusion"><span class="tocnumber">2.4</span> <span class="toctext">Conclusion</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


**Deliverable 1**

# Report on the current state: use cases and validation requirements

**Creator:** [Evelyn Dröge](mailto:evelyn.droege@ibi.hu-berlin.de)

**Creator:** [Thomas Bosch](mailto:Thomas.Bosch@gesis.org)

**Creator:** Karen Coyle

**Creator:** Antoine Isaac

**Creator:** Valentine Charles

**Creator:** Robina Clayphan

**Creator:** Mark Matienzo

**Creator:** Stefanie Rühle

**Creator:** Adrian Pohl

**Creator:** Miika Alonen

**Creator:** Lars Svensson

**Date Issued:** 2015-07-27

**Identifier:** [/mediawiki_wiki/RDF\_Application\_Profiles/UCR\_Deliverable](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable)

**Replaces:** [http://wiki.dublincore.org/index.php?title=RDF\_Application\_Profiles/UCR\_Deliverable&oldid=9743](http://wiki.dublincore.org/index.php?title=RDF_Application_Profiles/UCR_Deliverable&oldid=9743)

**Is Replaced By:** Not applicable

**Latest Version:** [/mediawiki_wiki/RDF\_Application\_Profiles/UCR\_Deliverable](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable)

**Status of Document:** Draft

**Description of Document:** This document is the first deliverable of the "DCMI RDF Application Profiles Task Force" (DCMI RDF-AP). It reports on the current state of case stduies, use cases and validation requirements in July 2015 and replaces the first version of the document from October 2014.

**Note:** Validation requirements are described in the [Report on validation requirements](/mediawiki_wiki/RDF_Application_Profiles/Requirements).

## Introduction 

This document describes the RDF Application Profile case studies of the "DCMI RDF Application Profiles Task Force" (DCMI RDF-AP) in July 2015. It replaces the use case document from October 2014. The DCMI RDF-AP aims at defining best practices for documenting application profiles, requests for handling RDF application profiles and for RDF constraints specification and validation. This deliverable focuses on reporting on the case studies collected in the task force, their use cases and their validation requirements (see [Case Studies and Use Cases](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable#Case_studies_and_use_cases)). The case studies of the task force are about the following models or representations (in alphabetical order): CEN EuroLMAI and DC reuse in academia, DINI AG KIM - RDF-Representation of Bibliographic Data, DM2E model, DPLA Metadata Application Profile version 3 (MAPv3), Europeana Data Model (EDM), EDM specialisation in the Deutsche Digitale Bibliothek (DDB), OER World Map prototype, [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles and Tiny Archive.

The full descriptions of case studies and use cases can be found in the [task force wiki](/mediawiki_wiki/RDF_Application_Profiles). Validation requirements and the corresponding use cases are collected in the [DCMI RDF-AP database](http://purl.org/net/rdf-application-profiles) (see [DCMI RDF Application Profiles database on case studies, use cases, requirements, and solutions](/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable#DCMI_RDF_Application_Profiles_database_on_case_studies,_use_cases,_requirements,_and_solutions)). Validation requirements are described in [Deliverable 4](/mediawiki_wiki/RDF_Application_Profiles/Requirements).

## Case studies and use cases

The following case study descriptions have been created in the RDF-AP group:

1. Europeana Data Model (EDM)
2. Public Library of America (DPLA) MAPv3
3. Deutsche Digitale Bibliothek (German Digital Library, DDB)
4. DM2E model
5. OER World Map prototype
6. Using [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles
7. DINI AG KIM - RDF-Representation of Bibliographic Data
8. CSC - Reusing CEN EuroLMAI, DC In Academia
9. Tiny Archive

A case study in the RDF-AP group refers to one model, application profile or any other specific way of reusing one or more vocabularies. A few case studies are divided into different validation use cases. These use cases are linked to general validation requirements from a requirement classification.

### Europeana Data Model (EDM) 

[Europeana](http://europeana.eu/) , the European digital library, provides access to more than 30 million library, archive, museum and audio-visual objects from 36 countries. The Europeana Data Model (EDM) was designed in order to insert diverse metadata about Cultural Heritage Objects (CHOs) into Europeana.

Full case study: [Wiki](/mediawiki_wiki/EDM) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-4-EUROPEANA-DATA-MODEL-EDM)

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
    <td>No html tags and no leading or trailing white spaces in the metadata.
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/343" class="external text" rel="nofollow">Mandatory properties with conditions</a>
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/379" class="external text" rel="nofollow">Property redundancy</a>
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
    <td>Some properties of EDM allow for the expression of relationships between entities. Most of the relationships are of type hierarchy, membership, sequence and therefore need to be validated.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/383" class="external text" rel="nofollow">Value validation across dataset</a>
    </td>
    <td>Europeana manages its data per dataset. Each record from a dataset comes from the same provider. The value indicating the name of this provider should be the same across the whole dataset.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/387" class="external text" rel="nofollow">URI target validation</a>
    </td>
    <td>Some EDM properties should be used in combination with a URI pointing to specific media. Some constraints might be defined for these medias (file type, size) .
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/390" class="external text" rel="nofollow">Property syntax match</a>
    </td>
    <td>Some EDM properties require specific values using a specific syntax, e.g. check if the value for date matches ISO 8601 (starting with the year and hyphenating the day and month parts: YYYY-MM-DD).
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/393" class="external text" rel="nofollow">Overlap in disjoint label properties</a>
    </td>
    <td>
      <i>skos:prefLabel</i>, <i>skos:altlabel</i> and <i>skos:hiddenLabel</i> cannot have the same label.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/394" class="external text" rel="nofollow">Property-use-consistency</a>
    </td>
    <td>Two concepts cannot be mapped to each other by using both <i>skos:exactMatch</i> and <i>skos:broadMatch</i> or <i>skos:relatedMatch</i>.
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
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/446" class="external text" rel="nofollow">Property domain</a>
    </td>
    <td>In EDM, some properties must be used only within a specific domain. It is especially valid for the properties with the class <i>ore:Aggregation</i>.
    </td>
  </tr>
</table>

### Digital Public Library of America (DPLA) MAPv3 

The [Digital Public Library of America (DPLA)](http://dp.la/) provides access to digitized cultural heritage objects held by libraries, archives, museums, and historical societies throughout the United States. The DPLA Metadata Application Profile version 3 (MAPv3) builds on the Europeana Data Model.

Full case study: [Wiki](/mediawiki_wiki/DPLA_RDF_application_profile_use_cases) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-1-DPLA-RDF-APPLICATION-PROFILE).

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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-2-VALIDATION-USING-MAPV3-DATA-SUPPLIED-BY-PARTNERS" class="external text" rel="nofollow">Validation using MAPv3 data supplied by partners</a>
    </td>
    <td>A partner should be able to validate a set of statements to assure compliance against MAPv3 before submitting the data to DPLA for ingestion, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA). DPLA should be able to validate a set of statements for MAPv3 compliance.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-3-ESTABLISHING-MANDATORY-AND-RECOMMENDED-LEVELS-OF-VALIDATION" class="external text" rel="nofollow">Establishing mandatory and recommended levels of validation</a>
    </td>
    <td>Some properties may not be mandatory, but may be recommended to indicate a "value-added" level of compliance with MAPv3.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-4-VALIDATION-OF-MAPV3-DATA-BY-API-CONSUMERS" class="external text" rel="nofollow">Validation of MAPv3 data by API consumers</a>
    </td>
    <td>Developers should be able to validate sets of statements against MAPv3 when trying to diagnose issues with their applications, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA).
    </td>
  </tr>
</table>

### Deutsche Digitale Bibliothek (German Digital Library, DDB) 

The [German Digital Library](https://www.deutsche-digitale-bibliothek.de/content/about/) is a portal providing access to digital cultural and scientific objects from Germany. It is also a national contributor for Europeana. Therefore the DDB uses EDM as the model for the interlinking of objects in the DDB and the contribution of metadata to Europeana. But the use of EDM in the DDB requires an extension of properties used in EDM. Therefore - like DM2E - the DDB developed a specialization of EDM for the DDB domain.

Full case study: [Wiki](/mediawiki_wiki/DDB-EDM) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-6-USE-OF-EDM-IN-THE-DEUTSCHE-DIGITALE-BIBLIOTHEK-DDB).

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
    <td>Resources used in the DDB must be represented by unique URIs. Similar use case: <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/339" class="external text" rel="nofollow">UC-Europeana-3</a>.
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-10-WRONG-PROPERTY-DOMAINS" class="external text" rel="nofollow">Wrong property domains</a>
    </td>
    <td>Check if the (datatype or object) property is in the right domain.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/384" class="external text" rel="nofollow">Mandatory DDB terms</a>
    </td>
    <td>In addition to the mandatory EDM terms in DDB more properties are mandatory, e.g., <i>dcterms:rights</i> and <i>edm:provider</i> to describe an <i>ore:Aggregation</i>
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/385" class="external text" rel="nofollow">Domain dependent mandatory properties</a>
    </td>
    <td>Some properties are mandatory depending on the class of their domain. E.g., the use of <i>dc:type</i> to describe an <i>edm:WebResource</i> is mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/388" class="external text" rel="nofollow">Domain dependent non-repeatable properties</a>
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-12-OBJECT-PROPERTY-RANGE" class="external text" rel="nofollow">Object property range</a>
    </td>
    <td>Check if the object property range is correct, e.g. if <i>dm2e:painter</i> has range <i>foaf:Person</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/389" class="external text" rel="nofollow">Domain dependent value of the property</a>
    </td>
    <td>Depending on their domain some properties have to be used with URIs of controlled vocabularies. E.g., if <i>dc:type</i> is used to describe an edm:WebResource its value has to be a URI from the DDB media type vocabulary
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/354" class="external text" rel="nofollow">Value dependency of property obligation</a>
    </td>
    <td>The obligation of a property depends on the value of another property. E.g., if dc:type is used with the value "Chapter", the use of <i>dcterms:isPartOf</i> is mandatory.
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-16-RULES-FROM-REUSED-VOCABULARIES" class="external text" rel="nofollow">Rules from reused vocabularies</a>
    </td>
    <td>Application Profiles like the DM2E model or DDB's EDM Profile must fulfill the requirements of the underlying vocabularies. E.g., mandatory properties in EDM must also be mandatory in DM2E and DDB.
    </td>
  </tr>
</table>

### DM2E model 

The DM2E model is a specialisation of the EDM for manuscripts. It has been used for mappings to Europeana and for publishing delivered metadata as LOD via the DM2E LOD API in the scope of the _Digitised manuscripts to Europeana_ (DM2E) project.

Full case study: [Wiki](/mediawiki_wiki/DM2E) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-3-DIGITISED-MANSCRIPTS-TO-EUROPEANA-DM2E).

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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-7-RECOMMENDED-DM2E-PROPERTIES" class="external text" rel="nofollow">Recommended DM2E properties</a>
    </td>
    <td>Recommended properties in the DM2E model are, for example, <i>edm:object</i> and <i>dm2e:hasAnnotatableVersionAt</i> in <i>ore:Aggregation</i>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-8-NON-REPEATABLE-DM2E-PROPERTIES" class="external text" rel="nofollow">Non-repeatable DM2E properties</a>
    </td>
    <td>The DM2E model has many non-repeatable properties, e.g. <i>edm:currentLocation</i> and <i>dm2e:holdingInstitution</i> for the provided object (<i>edm:ProvidedCHO</i>).
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-9-WRONG-MIME-TYPES" class="external text" rel="nofollow">Wrong MIME types</a>
    </td>
    <td>If you provide an <i>edm:object</i> it is mandatory to add an allowed MIME type with <i>dc:format</i> to the instance of <i>edm:WebResource</i>. Allowed MIME types are, for example, image/png or image/jpeg.
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-10-WRONG-PROPERTY-DOMAINS" class="external text" rel="nofollow">Wrong property domains</a>
    </td>
    <td>Check if the (datatype or object) property is in the right domain.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-12-OBJECT-PROPERTY-RANGE" class="external text" rel="nofollow">Object property range</a>
    </td>
    <td>Check if the object property range is correct, e.g. if <i>dm2e:painter</i> has range <i>foaf:Person</i>.
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-14-RECOMMENDED-LANGUAGE-TAGS" class="external text" rel="nofollow">Recommended language tags</a>
    </td>
    <td>The DM2E model recommends using language tags and following the language representation standards RFC3066 and RFC5646 (use an ISO-639-1 2-character ; if it not exists, use a ISO-639-2 3-character code). Language tags should be used whenever language information is available, but they are not mandatory. Similar use case: <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/392" class="external text" rel="nofollow">UC-Europeana-18</a>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-15-UNSUPPORTED-PROPERTIES" class="external text" rel="nofollow">Unsupported properties in DM2E</a>
    </td>
    <td>Properties or classes that are not part of the model are not accepted in the ingestion because they cannot be displayed in the Europeana portal or the DM2E search engines.
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
    <td>Some EDM properties require specific values (these value can come from a vocabulary). For instance, check that <i>edm:type</i> matches the value TEXT, VIDEO, SOUND, IMAGE, 3D.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/357" class="external text" rel="nofollow">Uniqueness of URI</a>
    </td>
    <td>Resources used in the DDB must be represented by unique URIs. Similar use case: <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/339" class="external text" rel="nofollow">UC-Europeana-3</a>.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/385" class="external text" rel="nofollow">Domain dependent mandatory properties</a>
    </td>
    <td>Some properties are mandatory depending on the class of their domain. E.g., the use of <i>dc:type</i> to describe an <i>edm:WebResource</i> is mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/389" class="external text" rel="nofollow">Domain dependent value of the property</a>
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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/342" class="external text" rel="nofollow">Mandatory properties</a>
    </td>
    <td>The EDM schema lists a number of properties that are mandatory.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=UC-16-RULES-FROM-REUSED-VOCABULARIES" class="external text" rel="nofollow">Rules from reused vocabularies</a>
    </td>
    <td>Application Profiles like the DM2E model or DDB's EDM Profile must fulfill the requirements of the underlying vocabularies. E.g., mandatory properties in EDM must also be mandatory in DM2E and DDB.
    </td>
  </tr>
</table>

### OER World Map prototype 

The [hbz](http://www.hbz-nrw.de/) has built a [prototype for an Open Educational Resources (OER) world map](https://wiki1.hbz-nrw.de/x/tYGv). The data of the OER map prototype covers descriptions of organizations, persons, services and projects.

For the OER world map a read/write API was developed as well as an application (Drupal) for viewing, adding, deleting and editing the data (see the [image of the architecture](http://wiki1.hbz-nrw.de/download/attachments/10455419/OER-worldmap-arch4.png)). Both, API and application, need some specifications which should be expressed in an RDF application profile. While the API mainly needs information for validating incoming data, the application also needs information about presenting the data (result lists, single results, forms for editing the different resources).

Full case study: [Wiki](/mediawiki_wiki/OER-world-map) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/416).

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
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/419" class="external text" rel="nofollow">General AP requirements</a>
    </td>
    <td>High level requirements for RDF application profiles.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/420" class="external text" rel="nofollow">Requirements for validation</a>
    </td>
    <td>Identify element/class and its relation to AP; define object restrictions for properties; cardinality, X(OR) rules.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/421" class="external text" rel="nofollow">Requirements for building a web application</a>
    </td>
    <td>Requirements for presenting the data as HTML/RDFa and generating a web form for creating/editing/linking the data.
    </td>
  </tr>
</table>

### Using [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles 

The case study is not about _representing_ profiles, but rather about _using_ them. Precisely, this case study does not depend on the representation of the profile, but on the profile having a URI for identification. In order to keep up with best practices, that URI SHOULD dereference to a representation, possibly using content negotiation to deliver human- and machine-readable interpretations.

Full case study: [Wiki](/mediawiki_wiki/RFC-6906-Profiles) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-9-USING-RFC-6906-PROFILES-TO-SPECIFY-A-PROFILE-INDEPENDENTLY-OF-THE-MEDIA-TYPE).

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

Full case study: [Wiki](/mediawiki_wiki/KIM-recommendations) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-5-DINI-AG-KIM-RDF-REPRESENTATION-OF-BIBLIOGRAPHIC-DATA).

<table class="wikitable">
  <caption>Table 7: DINI AG KIM use case.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/452" class="external text" rel="nofollow">Use case for requirements concerning the AP on a meta-level</a>
    </td>
    <td>This Use Case is a container for requirements that do not concern the validation of metadata supported by an Application Profile but other use cases like documentation of an Application Profile, presentation of the metadata or wether terms (properties and classes) in the Application Profile are used compliant to the vocabularies they are taken from.
    </td>
  </tr>
</table>

### CSC - Reusing CEN EuroLMAI, DC in Academia 

CSC is developing and maintaining national data model for the academia in the field of higher education and science. The use case for machine-readable application profile would be to support the whole lifecycle of development:

1. Development of application profiles using “semantic templates” which documents the vocabulary for both human and machine. Mix&Match classes and properties from appropriate vocabularies. Create extensions to existing application profiles, for example CEN MLO.
2. Validate the proper use of “semantic templates” (Validation of Application Profile)
3. Provide provenance information about lifecycle of the development process
4. Validate the instances against the developed application profile (Validation of Data)

Full case study: [Wiki](/mediawiki_wiki/CSC) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=CS-8-REUSING-CEN-EUROLMAI-DC-IN-ACADEMIA).

<table class="wikitable">
  <caption>Table 8: CSC use cases.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/435" class="external text" rel="nofollow">User creates new application profile</a>
    </td>
    <td>User creates new application profile, including name, description, administrative information.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/436" class="external text" rel="nofollow">Define used vocabularies</a>
    </td>
    <td>In order to define reused classes and properties in the application profile user must first define used vocabularies.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/437" class="external text" rel="nofollow">Define class usage</a>
    </td>
    <td>New class usage is defined and added to the application profile.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/438" class="external text" rel="nofollow">Define property usage</a>
    </td>
    <td>A user can add property usages directly to the application profile and relate one property usage to many class usages.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/439" class="external text" rel="nofollow">Visualize class usage with class diagrams</a>
    </td>
    <td>Class usage is visualized automatically as class diagrams from machine readable RDF AP format.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/440" class="external text" rel="nofollow">Export and import application profiles</a>
    </td>
    <td>Application profiles can be exported and imported from different RDF formats.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/441" class="external text" rel="nofollow">Reusing existing application profiles</a>
    </td>
    <td>Machine readable application profiles can also be reused and extended in the profile editor by importing contents of an application profile to another profile.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/442" class="external text" rel="nofollow">Localize application profile</a>
    </td>
    <td>Application profiles can also be localized to different languages by translating literals, such as defined by title, description, comment, etc.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/443" class="external text" rel="nofollow">Language constraints</a>
    </td>
    <td>Datatype property usages that have plainLiteral as defined range, may be constrained to certain languages.
    </td>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/445" class="external text" rel="nofollow">SKOS Scheme usage</a>
    </td>
    <td>SKOS Concepts and Schemes can be used as fixed classifications for RDF data. It should be possible to state that some object property can only point to certain objects defined in some SKOS scheme.
    </td>
  </tr>
</table>

### Tiny Archive 

Tiny archive has less than 10,000 total items. About 2/3 of these have been described in a spreadsheet, and each item is represented on the web as a web page. The descriptions contain commentary about their items in different languages. The archive wants to begin linking to other archives in its topic area, as well as to a database of terms that is now available in RDF.

Full case study: [Wiki](/mediawiki_wiki/TinyArchive) and [database](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/413).

<table class="wikitable">
  <caption>Table 9: Tiny archive use case.
  </caption>
  <tr>
    <th>Use case
    </th>
    <th>Description
    </th>
  </tr>
  <tr>
    <td>
      <a href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/414" class="external text" rel="nofollow">Human readable documentation of properties</a>
    </td>
    <td>Provide a place to include human readable documentation of properties and what they mean, e.g. "title - the title of the resource being described".
    </td>
  </tr>
</table>

## Database on case studies, use cases, requirements, and solutions regarding RDF constraint formulation and RDF data validation 

We initiated a collaboratively curated database on case studies, use cases, requirements, and solutions regarding RDF constraint formulation and RDF data validation. This database contains the findings of the DCMI RDF Application Profiles Task Group based on various case studies provided by data institutions and the findings resulting from the collaboration with the W3C RDF Data Shapes Working Group. The database, which is publicly and online available via [http://purl.org/net/rdf-application-profiles](http://purl.org/net/rdf-application-profiles), is open for further contributions and connects requirements to use cases, case studies, and solutions.

The idea of the extensible database is

1. to collect and describe case studies from experts (from theory and practice dealing with RDF validation problems) and the general public,
2. to extract common use cases from these case studies that illustrate particular problems,
3. to specify requirements to be fulfilled in order to adequately solve these problems and meet the use cases,
4. to investigate existing best-practices regarding these requirements, and
5. to evaluate existing approaches / tools to which extend specific requirements are fulfilled.

Initial sources for this database have been (1) the 2013 W3C RDF Validation Workshop, (2) mailing list discussions from the W3C RDF Data Shapes Working Group, (3) the 2013 Semantic Web in Libraries conference, 4) discussions in the RDF Application Profiles Task Group, and (5) diverse research papers.

In the development of standards, as in software, case studies and/or use cases are usually taken as starting point. In case studies, the full background of a specific scenario is described, where the standard or the software is to be applied. Use cases are smaller units where a certain action or a typical user enquiry is described. They can be extracted from and thus linked to case studies, but often they are defined directly.

Requirements are extracted from use cases; they form the basis for development and are used to test the result. We specifically use the requirements to evaluate existing approaches for constraint formulation and validation. Via the requirements, the approaches get linked to use cases and case studies and it becomes visible which approaches can be used in a given scenario and what drawbacks might be faced.

We classify the requirements to provide a high-level view on different approaches and to facilitate a better understanding of the problem domain. Our database is openly available and can be extended with new case studies, use cases, requirements and approaches.

### DCMI case studies, use cases, and requirements 

When we started capturing RDF validation requirements from the W3C RDF Validation workshop in 2013, the intention and vision was to have one system which could be used to manage all requirements as well as associated use cases, case studies, and tools which are relevant for different domains.

In order to support different views on requirements, use cases, and case studies for multiple domains like the DCMI, views are introduced:

Case studies may be tagged as DCMI case studies. The database contains a dedicated view ( [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=case-studies/dc-case-studies](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=case-studies/dc-case-studies)) for these DCMI case studies which lists only the case studies which are classified as being DCMI case studies. Furthermore, case studies may be related to other case studies.

Case studies may be related to use cases and use cases may be connected with case studies. In case a DCMI case study is connected with a use case, this use case is automatically classified as DCMI use case as well. As a consequence, this use case is also shown in a dedicated view for all DCMI use cases ( [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=use-cases/dc-use-cases](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=use-cases/dc-use-cases)).

Requirements may have relationships to use cases and use cases to requirements. If DCMI use cases are related to a requirement, this requirements is automatically considered as a DCMI requirement and listed in the DCMI requirements view ( [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=requirements/dc-requirements](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=requirements/dc-requirements)). Requirements are uniquely identified in the database by an R and a number.

As a consequence each domain can browse the requirements, use cases, and case studies the domain is interested in, but also requirements, use cases, and case studies from other domains.

### Research papers 

[Bosch, T. & Eckert, K. (2014). Requirements on RDF Constraint Formulation and Validation. In Proceedings of the DCMI International Conference on Dublin Core and Metadata Applications (DC 2014) Austin, Texas, USA. http://dcevents.dublincore.org/IntConf/dc-2014/paper/view/257](http://dcevents.dublincore.org/IntConf/dc-2014/paper/view/257).

In this paper, we present the database of requirements obtained from various sources, including the use cases presented at the workshop as well as in the RDF-AP WG. The database, which is openly available and extendible, is used to evaluate and compare several existing approaches for constraint formulation and validation. We present a classification and analysis of the requirements, show that none of the approaches satisfy all requirements and aim at laying the ground for future work, as well as fostering discussions how to close existing gaps.

[Bosch, T., Nolle, A., Acar, E., & Eckert, K. (2015). RDF Validation Requirements - Evaluation and Logical Underpinning. Computing Research Repository (CoRR), abs/1501.03933. http://arxiv.org/abs/1501.03933](http://arxiv.org/abs/1501.03933).

Based on our work in the DCMI and in cooperation with the W3C working group, we published by today 81 requirements to validate RDF data and to formulate RDF constraints that are required by various stakeholders for data applications. Each of these requirements corresponds to a constraint type from which concrete constraints are instantiated to be checked on RDF data. Requirements are uniquely identified in the database by an R and a number. In this technical report, we explain each requirement/constraint type in detail and give examples for each represented by different constraint languages.

### Sustainability of the database and technical details 

The database is currently hosted at the University of Mannheim. It is implemented using a Drupal instance and a mysql database in the background. The full source code of the underlying Drupal instance and the database with the current state of all case studies, use cases, and requirements is available at [https://github.com/kaiec/reqbase](https://github.com/kaiec/reqbase) .

A backup of the mysql database is done automatically once a day and the last 10 backups are kept on the server. There is also a monthly separate backup. With the current setting and daily backups, we should not loose the database and in case of a server failure, we should be able to set it up again.

For long term preservation after work on the database has ended, we suggest to use some export format or a static HTML dump. Such static data can be hosted by DCMI. We provide multiple export functionalities like exports to XLS, CSV, XML, TXT, and DOC which can be used for archival purposes.

The actual location of the database at lelystad.informatik.uni-mannheim.de is not very sustainable, only the purl.org URI [http://purl.org/net/rdf-application-profiles](http://purl.org/net/rdf-application-profiles) should be used to reference the database.

The URIs of the database entries are not ideal, we suggest to not use them as URIs but always refer to the database via the purl.org URI and to the entries via the numbering scheme (UC-14 or UC-14-RECOMMENDED-LANGUAGE-TAGS).

The maintenance of the database as work environment is primarily done by Thomas Bosch with support by Kai Eckert.

The actual database dumps are also stored and can be made available publicly. It only requires an additional step to erase all user information and particularly the passwords as you don't want to have this in a public dump. But with this, you are able to setup your own Drupal system and continue to work with the database somewhere else or even locally on your laptop.

## Conclusion 

The deliverable gave insight into case studies regarding RDF constraint formulation, RDF data validation, and the formulation of RDF AP, associated use cases, as well as the DCMI RDF-AP database of the DCMI RDF-AP Task Group as of today (July 2015). The database, which is publicly and online available at [http://purl.org/net/rdf-application-profiles](http://purl.org/net/rdf-application-profiles), is open for further contributions and connects requirements to use cases, case studies, and solutions.

Different case studies have been collected by various stakeholders for data applications, whose use cases are connected to requirements from the DCMI RDF-AP database. It could be seen that especially case studies which build on the same data model (e.g., EDM) have some use cases and requirements in common. Still, every case study provides some unique use cases. All requirements that occur in the task group's case studies (DC requirements) are collected in the [Requirements Deliverable](/mediawiki_wiki/RDF_Application_Profiles/Requirements).


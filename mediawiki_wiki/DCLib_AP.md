---
title: DCLib AP
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 September 2011, at 07:40.  
This page has been accessed 152,045 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DC-Library_Application_Profiles"><span class="tocnumber">1</span> <span class="toctext">DC-Library Application Profiles</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#DC-Library_Application_Profile_for_Bibliographic_Text_Resources_.28September_2011.29"><span class="tocnumber">1.1</span> <span class="toctext">DC-Library Application Profile for Bibliographic Text Resources (September 2011)</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Objectives_and_Scope_of_DC-Lib_AP_for_Bibliographic_Text_Resources"><span class="tocnumber">1.2</span> <span class="toctext">Objectives and Scope of DC-Lib AP for Bibliographic Text Resources</span></a></li>
            <li class="toclevel-2 tocsection-4">
              <a href="#Functional_Requirements_of_DC-Lib_AP_for_Bibliographic_Text_Resources"><span class="tocnumber">1.3</span> <span class="toctext">Functional Requirements of DC-Lib AP for Bibliographic Text Resources</span></a>
              <ul>
                <li class="toclevel-3 tocsection-5"><a href="#Metadata_as_linked_data"><span class="tocnumber">1.3.1</span> <span class="toctext">Metadata as linked data</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#Simple_creation_of_bibliographic_metadata"><span class="tocnumber">1.3.2</span> <span class="toctext">Simple creation of bibliographic metadata</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#Discovery_of_library_resources"><span class="tocnumber">1.3.3</span> <span class="toctext">Discovery of library resources</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-8"><a href="#Entity-Relationship_Model_of_DC-Lib_AP_for_Bibliographic_Text_Resources"><span class="tocnumber">1.4</span> <span class="toctext">Entity-Relationship Model of DC-Lib AP for Bibliographic Text Resources</span></a></li>
            <li class="toclevel-2 tocsection-9"><a href="#Description_Set_Profile_of_the_DC-Lib_AP_for_Bibliographic_Text_Resources"><span class="tocnumber">1.5</span> <span class="toctext">Description Set Profile of the DC-Lib AP for Bibliographic Text Resources</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# DC-Library Application Profiles 

## DC-Library Application Profile for Bibliographic Text Resources (September 2011) 

This Application Profile is based on

- [Library Application Profile [2004-09-10](http://dublincore.org/documents/2004/09/10/library-application-profile/)]
- [The Singapore Framework for Dublin Core Application Profiles](http://dublincore.org/architecturewiki/SingaporeFramework/)
- [Criteria for the Review of Application Profiles](http://dublincore.org/documents/2009/03/02/profile-review-criteria/)
- [DCMI Abstract Model](http://dublincore.org/documents/abstract-model/)

## Objectives and Scope of DC-Lib AP for Bibliographic Text Resources 

According to Singapore Framework a Dublin Core Application Profile is a document, or set of documents, which describes a metadata application. In doing so it does not only declare which terms from which namespaces are used in a particular application or project (Description Set Profile), but also defines the entities that are described with these elements (Domain Model) and the functionalities the application needs considering the requirements of the users (Functional Requirements). Additionally an application profile can define rules for the usage of terms (Usage Guidelines) and for their syntactical encoding (Encoding syntax guidelines ).

Scope of this profile are the traditional librarian text materials - published or unpublished - like monographs, continuing publications (journals, yearbooks etc.), articles, preprints and postprints, as well as digitized or digital born versions of such material. We call this materials Bibliographic Text Resources, based on the following definitions:

- Dublin Core Metadata Term specification defines Bibliographic Resource as "a book, article, or other documentary resource".
- DCMI Type vocabulary defines Text as "a resource consisting primarily of words for reading".

Objective of this Application Profile is a Dublin Core Application Profile that meets the requirements of libraries to describe these Bibliographic Text Resources by metadata and supports the publication of these metadata as linked data.

For the description of non-textual Bibliographic Resources in libraries (e.g. maps, images, films, etc.) the DC-Lib AP Task Group would develop further Application Profiles as far as these are required and no appropriate profiles exist.

The application profile proposes how to use DCMI Metadata Terms in libraries and library-related applications and projects. It is not so granular and complex as the DCMI/RDA Application Profiles but is nevertheless adequate for the description of all sorts of text publications in- and outside the library world. Therefore it has the use:

- to support the publication of bibliographic metadata as linked data,
- to support the discovery of librarian resources in a semantic web, 
- to support simple creation of bibliographic metadata within a variety of systems,
- to combine bibliographic metadata with data from non-library communities using Dublin Core,
- to serve as an interchange format between various systems using different metadata standards/formats,
- to use for harvesting metadata from data sources within and outside of the library domain,

In this way the profile will support the interoperability of Dublin Core based librarian and non-librarian metadata applications with rules and formats of the librarian world.

In this regard the Profile will describe

- Functional Requirements - the functions that the DC-Library Application Profile is designed to support 
- Entity-Relationship Model - the basic entities described by the application profile and their fundamental relationships 
- Description Set Profile - the terms with their templates and constraints that are required to fulfil the Functional Requirements 
- [Properties2FRBR](/mediawiki_wiki/Properties2FRBR) - a mapping of the the properties of the Description Set Profile to FRBR-Entities. 

Target user groups of this profile are:

- Developers from the library and non-library world who want to build a simple metadata application for publications.
- Information providers who want to integrate bibliographic data into their metadata services.

This profile displaces the latest version of the [DC-Library Application Profile](http://dublincore.org/documents/2004/09/10/library-application-profile/), published 10. September 2004. It is a product of the "DCMI Library Application Profile Task Group" that is responsible for further changes and maintenance. The profile will be submited for review to the Dublin Core Usage Board.

## Functional Requirements of DC-Lib AP for Bibliographic Text Resources 

According to Singapore Framework the Functional Requirements describe the functions of an application with regard to the user needs. A similar statement we find at the Functional Requirements for Bibliographic Records (FRBR) which define the following four generic user tasks:

- find an entity
- identify an entity
- select an entity
- acquire or obtain an entity

In addition to these generic functionalities the DC Lib AP for Bibliographic Text Resources defines the following use cases as the specific functions this profile has to achieve:

### Metadata as linked data 

- **Use Case:** Metadata describing bibliographic text resources shall be used in a linked data context.
- **Requirements:** Use a linked data compatible syntax.

- **Use Case:** Metadata describing bibliographic text resources shall be combined with metadata from other sources.
- **Requirement:** Use a domain model which allows to join data from other domains.

- **Use Case:** Metadata describing bibliographic text resource shall be used to fix the relationships between these and other resources.
- **Requirement:** Use metadata terms supporting the usage of identifiers for citation and linking.

### Simple creation of bibliographic metadata 

- **Use Case:** A developer wants the simple and easy implementation of a cataloguing application.
- **Requirement:** Use a domain model as simple as possible.

- **Use Case:** A metadata provider wants to make specific assertions about his copy of a publication.
- **Requirement:** The domain model has to distinguish between a publication and its local copies.

- **Use Case:** A metadata provider wants the creation of metadata quickly and efficiently.
- **Requirement:** Support a standard description using a small number of mandatory metadata terms combined with a manageable number of optional terms.

- **Use Case:** A metadata provider wants to describe bibliographic text resources by non-librarian staff.
- **Requirement:** Support the creation of metadata by using plain and well defined metadata terms.

### Discovery of library resources 

- **Use Case:** A user searches for a particular publication of a work and knows the titel, persons and/or coporation responsible for it and/or the identifier.
- **Requirement:** Support the search of a particular publication by given titles, names (of a person or corporate body) and/or identifiers.

- **Use Case:** A user searches for all publications of a given person or coporate body.
- **Requirement:** Support the search of all publications for which a given person or coporate body is responsible.

- **Use Case:** A user searches for informations about a specific topic.
- **Requirement:** Support the search of all publications of a given topic.

- **Use Case:** A User wants to filter search results.
- **Requirement:** Support the filtering of search results by languages, formats, dates, names (of persons or coporate bodys), subjects, types of work and availabilities.

- **Use Case:** A user wants to identify relevant publications.
- **Requriement:** Support the identification of the relevance of a publication using titles, persons or coproate bodies responsible for the work, descriptions, dates, languages, subjects, relations and identifiers.

- **Use Case:** A user wants to get information about the life cycle of a particular publication.
- **Requirement:** Show the different dates of the life cycle of a particular publication.

- **Use Case:** A user wants to know what relationships exist between different publications.
- **Requirement:** Show the relations between publications and link one to another by these relations.

- **Use Case:** A user wants to identify all copies of a publication he can use.
- **Requirement:** Show the usability of a copy by the availiabilities and access conditions.

- **Use Case** : A user wants to obtain a specific copy.
- **Requirement:** Show the identifier and the availability and access conditions of a particular copy.

## Entity-Relationship Model of DC-Lib AP for Bibliographic Text Resources 

According to Singapore Framework an application profile must provide a domain model which defines the basic entities described by the profile and their fundamental relationships. Basis of this model are the Functional Requirements which in our case demand simplicity and feasibility on the one hand and linked data compatibility on the other. Furthermore the Functional Requirements demand a distinction between a publication and its single copies to describe availability and accessability of items in libraries. And finally metadata should be compliant with metadata of other library applications in the long run.

For these reasons we developed a non-FRBR model, aligning on the model of the Functional Requirements of Bibliographic Records (FRBR) in some ways.

- FRBR distinguishes the following Group 1 entities: work, expression, manifestation and item. Our model distinguishes on this level only two entities: bibliographic text resource and item.
- FRBR distinguishes the following Group 2 entities: person and corporate body. Our model uses on this level only one entity: agent.
- FRBR distingiushes the followong Group 3 entities: concept, object, event und place. Our model uses on this level only one entity: concept

The entity-relationship model represents the relations between these entities:

[<img alt="ClassesDCLAP v1.jpg" src="/mediawiki_wiki/images/ClassesDCLAP_v1.jpg" width="651" height="391">](/mediawiki_wiki/images/ClassesDCLAP_v1.jpg)

where

- any Bibliographic Text Resource is an instance of the class bibliographicTextResource, which is a subclass of dcterms:bibliographicResource. (For further definition of bibliographicTextResource see LibClasses) A Bibliographic Text Resource 
  - has to be exemplified by one or more items 
  - has to be created, contributed or published by one or more Agents 
  - may have one or more Concepts as a subject 
  - may have relations to one or more other Bibliographic Text Resources 

Instances of the class bibliographicTextResource shall be described using the terms of the DCLIB Bibliographic Text Resource Description Set Profile (see BibliographicResourceProperties).

- any Item is an instance of the class frbr:Item. An Item 
  - is an exemplar of one and only one Bibliographic Text Resource
  - is available at one and only one Agent
  - may be part of one or more Collections 

Instances of this class shall be described using the terms of the DCLIB Item Description Set Profile (see ItemProperties).

- any Collection is an instance of dcmitype:Collection. For describing instances of this class we recommend to use terms of the [Dublin Core Collections Application Profile](http://dublincore.org/groups/collections/collection-application-profile/2007-03-09/).

- any Agent is an instance of dcterms:Agent. For describing instances of this class we recommend to use terms of [FOAF vocabulary](http://xmlns.com/foaf/spec/).

- any Concept is an instance of skos:concept. For describing instances of this class we recommend to use terms of [SKOS vocabulary](http://www.w3.org/TR/skos-reference/).

The model defines the following classes:

- my:Collection rdf:type dcmitype:Collection .
- my:bibliographicTextResource rdfs:subClassOf dcterms:bibliographicResource .
- my:Item rdf:type frbr:Item .
- my:Agent rdf:type dcterms:Agent .
- my:Concept rdf:type skos:Concept .

where the Application profile provides Description Templates only for the entities my:bibliographicTextResource (see BibliographicResourceProperties and my:Item (see ItemProperties).

## Description Set Profile of the DC-Lib AP for Bibliographic Text Resources 

According to Singapore Framework the Description Set Profile defines

- the resources that may be described,
- the properties that may be used,
- and the ways a value may be referenced.

The Description Set Profile of the DC-Lib AP for Bibliographic Text Resources

- provides the [DCLib classes](/mediawiki_wiki/DCLib_AP/DCLib_Classes) - **classes** , whose instances are the subjects in subject-predicate-object triples describing these instances.
- declares the [properties of a Bibliographic Text Resource](/mediawiki_wiki/DCLib_AP/Bibliographic_Resource_Properties) - **properties** used as predicate of the subject-predicate-object triple describing instances of the class bibliographicTextResource.
- declares the [properties of an Item](/mediawiki_wiki/DCLib_AP/Item_Properties) - **properties** used as predicate of the subject-predicate-object triple describing instances of the class Item.
- defines [Encoding Schemes](/mediawiki_wiki/DCLib_AP/Encoding_Schemes) - **syntax encoding schemes** and **vocabulary encoding schemes** constraining values used as an object in the subject-predicate-object triple discribing instances of the class bibliographicTextResource or of the class Item. 

Terms used in this Application Profile are taken from the following **namespaces** :

- dc: < [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)> DCMI legacy namespace used for the 15 core properties
- dcterms: < [http://purl.org/dc/terms/](http://purl.org/dc/terms/)> DCMI terms namespace of the DCMI terms - properties, classes and datatypes
- aglsterms: < [http://www.agls.gov.au/agls/terms/](http://www.agls.gov.au/agls/terms/)> Metadata terms of the AGLS (Australian Government Locator Service) metadata set
- eprintterms: < [http://purl.org/eprint/terms/](http://purl.org/eprint/terms/)> Metadata terms of the Scholarly Works Application Profile (SWAP) 
- frbr: < [http://iflastandards.info/ns/fr/frbr/frbrer/](http://iflastandards.info/ns/fr/frbr/frbrer/)> Metadate Terms of the FRBR model

To specify the terms of the Description Set Profile the following **attributes** are used:

**Name** A token assigned to the term, unique within the term's namespace.

**URI** The Uniform Resource Identifier used to uniquely identify a term.

**Definition** A statement that represents the concept and essential nature of the term.

**Type of Term** The type of term as described in the DCMI Abstract Model.

**DCLIB-Comment** Additional information about the usage of the term in the DC Lib AP.

**Has Range** A Class of which a value described by the term has to be an instance.

**Has Domain** A Class of which the described resource has to be an instance.

**SES** A datatype appointing the syntax of the value string that has to be used with a property.

**VES** Identifies a controlled vocabulary which instances may be used as values with a property.

**Obligation** Indicates whether a property is required to always or sometimes be present. In this application profile the obligation can be: mandatory (M), mandatory if applicable (MA), strongly recommended (R) or optional (O).

**Occurence** Indicates any limit to the repeatability of a property.


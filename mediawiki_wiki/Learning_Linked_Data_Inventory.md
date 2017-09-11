---
title: Learning Linked Data Inventory
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Learning_Linked_Data_Inventory.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 31 Jan 2012, at 05:41.  
This page has been accessed 8,559 times.

Return to [Learning Linked Data Main Page](/archive/mediawiki_wiki/Learning_Linked_Data "Learning Linked Data")

Topics and skills related to Linked Data, the learning of which would be supported by the tool platform proposed in a deliverable of the Learning Linked Data Project.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Reading_Linked_Data_--_Grammar"><span class="tocnumber">1</span> <span class="toctext">Reading Linked Data -- Grammar</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Reading_Linked_Data_--_Vocabulary_.28.22Languages_of_Description.22.29"><span class="tocnumber">2</span> <span class="toctext">Reading Linked Data -- Vocabulary ("Languages of Description")</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Reading_Linked_Data_--_RDF_implementation_syntax"><span class="tocnumber">3</span> <span class="toctext">Reading Linked Data -- RDF implementation syntax</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#Querying_Linked_Data"><span class="tocnumber">4</span> <span class="toctext">Querying Linked Data</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#Composing_Linked_Data_--_Translation"><span class="tocnumber">5</span> <span class="toctext">Composing Linked Data -- Translation</span></a></li>
        <li class="toclevel-1 tocsection-6"><a href="#Composing_Linked_Data_--_Simple_composition"><span class="tocnumber">6</span> <span class="toctext">Composing Linked Data -- Simple composition</span></a></li>
        <li class="toclevel-1 tocsection-7"><a href="#Composing_Linked_Data_--_Application_profile_design"><span class="tocnumber">7</span> <span class="toctext">Composing Linked Data -- Application profile design</span></a></li>
        <li class="toclevel-1 tocsection-8"><a href="#Visualising_Linked_Data"><span class="tocnumber">8</span> <span class="toctext">Visualising Linked Data</span></a></li>
        <li class="toclevel-1 tocsection-9"><a href="#Publishing_Linked_Data"><span class="tocnumber">9</span> <span class="toctext">Publishing Linked Data</span></a></li>
        <li class="toclevel-1 tocsection-10"><a href="#Storing_and_manipulating_Linked_Data_programmatically"><span class="tocnumber">10</span> <span class="toctext">Storing and manipulating Linked Data programmatically</span></a></li>
      </ul>
    </td>
  </tr>
</table>

#### Reading Linked Data -- Grammar 

- Beginning
  - Elements of Linked Data (RDF) Grammar: Property and Class, Instance, Resource, Literal...
  - Abstract syntax of triples: Subject, Predicate, Object.
  - Reading triples.
- Intermediate
  - Merging triples.
  - Graphs.
  - Open-world assumption.
  - Critical reading: discovering logical errors.
- Advanced
  - Principles of inferencing.
  - Generating inferred triples.
  - Named Graphs

#### Reading Linked Data -- Vocabulary ("Languages of Description") 

- Beginning
  - Starter vocabulary of terms from Dublin Core, FOAF, SKOS, RDF, and OWL.
  - Looking up terms by "following one's nose" to RDF schemas.
- Intermediate
  - Discovery of "aligned" (mapped) vocabularies.
  - Creation of simple RDF vocabularies.
- Advanced
  - Aligning (mapping) local vocabularies to well-known vocabularies.
  - Creation of SKOS concept schemes and other "value vocabularies" in RDF and OWL

#### Reading Linked Data -- RDF implementation syntax 

- Beginning
  - N-Triples - individual triples.
  - Turtle - RDF graphs depicted readably (and machine-processably).
- Intermediate
  - RDF/XML - the most common serialization, using XML angle brackets.
- Advanced
  - TriG Named Graph and RDF Dataset Language

#### Querying Linked Data 

- Beginning
  - Pose simple queries to datasets (terms used, subject matter, size...).
- Intermediate
  - SPARQL Query Language
  - Construct complex SPARQL queries for datasets
- Advanced
  - Discover patterns of vocabulary use and statement type in a dataset.
  - Using SPARQL patterns to check the consistency of datasets.
  - Using reasoners to generate entailments and check conistency of datasets.

#### Composing Linked Data -- Translation 

- Beginning
  - Converting RDF/XML found "in the wild" into N-Triples or Turtle (e.g., using rapper).
- Intermediate
  - Converting freely among N-Triples, Turtle, and RDF/XML.
  - Converting an existing thesaurus or classification system into SKOS or RDF/OWL
- Advanced
  - Converting RDF to and from RDFa and (possibly) JSON.
  - Transforming data with XSLT.
  - Extracting triples from XML data using GRDDL and XSLT.

#### Composing Linked Data -- Simple composition 

- Beginning
  - Writing triples describing instances.
  - Common, best-practice triple patterns.
- Intermediate
  - Defining an RDF vocabulary and writing it in triples.
  - Defining a SKOS concept scheme and writing it in triples.
- Advanced
  - Simple application profiles specifying patterns of vocabulary use.
  - "Elements of Linked Data Style"
  - Composing triples graphically (do such tools exist?).

#### Composing Linked Data -- Application profile design 

- Beginning
  - Singapore Framework for Application Profiles
  - Identifying and expressing user requirements.
  - Formulating a Domain Model (classes of things to be described).
- Intermediate
  - Describing Domain Model entities with constrained patterns of and classes ("Description Set Profiles")
- Advanced
  - Rapidly prototyping an application based on an application profile.
  - Generating input forms for creating data.
  - Creating data, testing, and iteratively improving the application.
- Out of scope
  - Advanced ontology design (for the purposes of our tool platform)

### Visualising Linked Data 

- Beginning
  - Generating simple graphs from triples.
- Intermediate
  - Generating a "Linked Data cloud".
- Advanced
  - Using visualization tools to discover higher-level patterns in large datasets.

### Publishing Linked Data 

- Beginning
  - Publishing triples in RDF/XML on the Web.
- Intermediate
  - Publishing triples on the Web following principles of content negotiation.
- Advanced
  - Publishing triples embedded in Web documents using RDFa.
  - Publishing triples embedded in Web documents using Microdata.

### Storing and manipulating Linked Data programmatically 

- Beginning
  - Indexing triples for query.
- Intermediate
  - Implementing a simple triples store.
- Advanced
  - Use Java, Ruby, or Python to read and process triples.


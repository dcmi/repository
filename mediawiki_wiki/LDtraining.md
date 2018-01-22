---
title: LDtraining
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/LDtraining.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 September 2013, at 21:29.  
This page has been accessed 3,358 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Linked_Data_Training_Sessions"><span class="tocnumber">1</span> <span class="toctext">Linked Data Training Sessions</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Microformats_and_RDFa"><span class="tocnumber">1.1</span> <span class="toctext">Microformats and RDFa</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Creating_and_Extending_Vocabularies"><span class="tocnumber">1.2</span> <span class="toctext">Creating and Extending Vocabularies</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Serializations_of_RDF"><span class="tocnumber">1.3</span> <span class="toctext">Serializations of RDF</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#RDF_and_OWL"><span class="tocnumber">1.4</span> <span class="toctext">RDF and OWL</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#SPARQL"><span class="tocnumber">1.5</span> <span class="toctext">SPARQL</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#RDF_in_Databases:_Triple_Stores.2C_and_more"><span class="tocnumber">1.6</span> <span class="toctext">RDF in Databases: Triple Stores, and more</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Linked Data Training Sessions

Draft and as yet unorganized

### Microformats and RDFa

**Audience** : Web designers in particular, anyone interested in what these are and how they can be used.

**Prior skills** : Some knowledge of HTML, because it will be used in the exercises but not explained.

**Lesson**

- Overview; what they are
  - Microformats
  - RDFa, RDFa lite
- Show and explain a microformat example using schema.org
- Show and explain an RDFa lite example using schema.org

**Exercises**

- create and validate one microformat example and one RDFa example

Validation will use Google Rich Snippet tool, so explain what it does and what it means.

Provide the beginning HTML that has to be marked up.

View display of RDFa in WorldCat and discuss.

### Creating and Extending Vocabularies

**Audience** : Non-technical staff in libraries, and anyone who wants to know more about linked data.

**Prior knowledge** : Best if audience has some basic knowledge of linked data, triples, statements, but lesson should be designed to be conceptual so that technical knowledge isn't required.

**Lesson**

- Overview: 
  - short introduction to ontologies and vocabularies, OWL and SKOS. This lesson will concentrate on OWL.
  - define URIs and domains

- Creating a vocabulary 
  - best practices
    - http URI
    - information available at the URI location
    - labels (in different languages as needed)
    - definitions and comments

_Note:_ This lesson will state that there are many technical issues beyond these (e.g. domains and ranges), and those issues will be covered in a lesson (or two) on OWL.

- Extending a vocabulary
  - using Include
  - using super/sub relationships

**Exercise**

1. How would you add another property to this vocabulary? (Use " [http://example.com/](http://example.com/)" as your domain)
2. How would you link these two vocabularies?

### Serializations of RDF

**Audience** : Developers of metadata schemas and of applications that will use RDF

**Prior knowledge** : Should have basic knowledge of linked data (triples, URIs); should be familiar with at least one common serialization (XML, JSON, as examples).

**Lesson**

- Introduction: RDF and triples are the basis, but can be serialized in a number of ways. All of those ways must accurately represent the triples.

- Serializations
  - Triples
  - N3/Turtle
  - RDF/XML
  - JSON-LD

**Exercises**

Provide a simple test case that is in triple form. For Turtle and for RDF/XML, profile the headers with qname definitions, since that is just tedium. Select one or more online validation sites for validating the work.

1. Create Turtle for this example, and validate
2. Create RDF/XML for this example, and validate

### RDF and OWL

**Audience** : Application developers who expect to work with linked data using RDF and OWL.

**Prior skills** : Should have basic knowledge of linked data, triples, URIs.

**Lesson**

- Basic functions of RDF
- OWL for ontologies
  - Purpose of inferencing
  - Role of Classes and Properties in OWL

... look for some tutorials

### SPARQL

**Audience** : Application developers

**Prior skills** : Should have experience with database querying in SQL

**Lesson**

- Introduction
  - Use of triples in SPARQL
  - Most common query terms 
  - SPARQL end point
  - SPARQL query responses
  - More complex queries
  - SPARQL for update (probably just a mention)

**Exercises**

_Note:_ This lesson requires a robust SPARQL endpoint that one can use during the lesson that will not crash as multiple users submit queries.

- Range of exercises (3-5) varying in complexity from very simple to very complex

### RDF in Databases: Triple Stores, and more

**Audience** : Database developers

**Prior skills** : Must know how to develop and manage databases for non-RDF data.

**Lesson**

- Introduction
  - What is a triple store? How is it different from an RDBMS?
  - How does this relate to noSQL databases?
- Common triple-store software

**Exercises**

Not sure if there are exercises, but teacher can demonstrate developing a small database using a set of triples.


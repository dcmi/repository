---
title: DCAM Revision Tech
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision_Tech.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 7 March 2012, at 10:39.  
This page has been accessed 96,119 times.

_This is a draft based on DCAM and DC-RDF, with the results of the brainstorming session in Dagstuhl (Google Doc: [https://docs.google.com/document/d/1srMp9FNqdVadPzG9BZnxKVjNlJJsEe7wlrt7Z\_ov2QQ/edit](https://docs.google.com/document/d/1srMp9FNqdVadPzG9BZnxKVjNlJJsEe7wlrt7Z_ov2QQ/edit))._

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Reformulation_of_DCAM_in_RDF"><span class="tocnumber">1</span> <span class="toctext">Reformulation of DCAM in RDF</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Introduction"><span class="tocnumber">2</span> <span class="toctext">Introduction</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Summary_of_the_RDF_conceptual_model"><span class="tocnumber">3</span> <span class="toctext">Summary of the RDF conceptual model</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#Namespace_abbreviations"><span class="tocnumber">4</span> <span class="toctext">Namespace abbreviations</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#Terminology"><span class="tocnumber">5</span> <span class="toctext">Terminology</span></a></li>
        <li class="toclevel-1 tocsection-6">
          <a href="#Vocabulary"><span class="tocnumber">6</span> <span class="toctext">Vocabulary</span></a>
          <ul>
            <li class="toclevel-2 tocsection-7">
              <a href="#DCAM_Description_Set_Model"><span class="tocnumber">6.1</span> <span class="toctext">DCAM Description Set Model</span></a>
              <ul>
                <li class="toclevel-3 tocsection-8"><a href="#dcterms:type"><span class="tocnumber">6.1.1</span> <span class="toctext">dcterms:type</span></a></li>
                <li class="toclevel-3 tocsection-9"><a href="#Description"><span class="tocnumber">6.1.2</span> <span class="toctext">Description</span></a></li>
                <li class="toclevel-3 tocsection-10"><a href="#dcam:DescriptionSet"><span class="tocnumber">6.1.3</span> <span class="toctext">dcam:DescriptionSet</span></a></li>
                <li class="toclevel-3 tocsection-11"><a href="#dcam:Record"><span class="tocnumber">6.1.4</span> <span class="toctext">dcam:Record</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-12"><a href="#DCAM_Vocabulary_Set_Model"><span class="tocnumber">6.2</span> <span class="toctext">DCAM Vocabulary Set Model</span></a></li>
            <li class="toclevel-2 tocsection-13">
              <a href="#Value_surrogates"><span class="tocnumber">6.3</span> <span class="toctext">Value surrogates</span></a>
              <ul>
                <li class="toclevel-3 tocsection-14"><a href="#Non-literal_value_surrogates"><span class="tocnumber">6.3.1</span> <span class="toctext">Non-literal value surrogates</span></a></li>
                <li class="toclevel-3 tocsection-15"><a href="#Value_URIs"><span class="tocnumber">6.3.2</span> <span class="toctext">Value URIs</span></a></li>
                <li class="toclevel-3 tocsection-16"><a href="#Vocabulary_Encoding_Scheme_URIs"><span class="tocnumber">6.3.3</span> <span class="toctext">Vocabulary Encoding Scheme URIs</span></a></li>
                <li class="toclevel-3 tocsection-17"><a href="#Literal_value_surrogates"><span class="tocnumber">6.3.4</span> <span class="toctext">Literal value surrogates</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-18"><a href="#References"><span class="tocnumber">7</span> <span class="toctext">References</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## Reformulation of DCAM in RDF 

The goal is to clearly embed DCAM within the Semantic Web, without any ambiguities. There are several motivtions for DCAM:

- Provide a way to publish metadata on the Semantic Web.
- Provide an abstract model for metadata applications.
- Help to bridge the (terminological) gap between the Semantic Web and the metadata community (Dublin Core Community)
- ...

SKOS [1] could be seen as a guideline for the formulation of DCAM in RDF. What SKOS does for authority data, DCAM should do for metadata. The RDF notions used in this document are defined in the RDF Concepts and Abstract Syntax specification [RDF-CONCEPTS] and the RDF Vocabulary Description Language [RDF-SCHEMA].

_Caveat:_ This document provides RDF vocabulary elements that correspond to DCAM notions. Readers should be aware that these elements may be necessary only for specific cases, for example in relation to representing provenance of metadata. In other cases, the correspondence between DCAM and RDF may just recommend creating RDF data for DCAM descriptions, without the help of the classes and properties minted in this document (for example, dcam:DescriptionSet).

## Introduction 

From DC-RDF:

The RDF expression of the DCMI Abstract Model has a special status among the DCMI encoding specifications. As the semantics of the notions DCMI Abstract Model is based on the semantics of the corresponding notions in RDF (as defined by [RDF-SEMANTICS]), it is of fundamental importance that the RDF expression preserves any semantics of the DCAM. Also, any valid inferences that can be made using RDF semantics need to be valid when interpreted in terms of the DCMI Abstract Model. These requirements have not yet been formalized, but are thought to be reasonable and relatively straightforward. Among other things, formulating them would require defining a reverse mapping from RDF to the DCMI Abstract Model.

## Summary of the RDF conceptual model 

The RDF conceptual model is specified in the RDF Concepts and Abstract Syntax specification [RDF-CONCEPTS]. It is a relatively simple model, consisting of the following fundamentals:

- An RDF graph is a set of RDF triples
- An RDF triple has three components:
  - an RDF subject, which is an RDF URI reference or a blank RDF node
  - an RDF predicate, which is an RDF URI reference
  - an RDF object, which is an RDF URI reference, a blank RDF node or an RDF literal
- An RDF literal can be of two kinds:
  - an RDF plain literal is a character string with an optional associated language tag describing the language of the character string
  - an RDF typed literal is a character string with an associated RDF datatype URI. An RDF datatype defines the syntax and semantics of a set of character strings that represent data such as booleans, integers, dates, etc.

These RDF triples are connected into RDF graphs, so that a non-literal RDF object of one RDF triple may be the RDF subject of another triple.

## Namespace abbreviations 

The following namespace abbreviations will be used in this document:

- dc [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)
- dcterms [http://purl.org/dc/terms/](http://purl.org/dc/terms/)
- dcam [http://purl.org/dc/dcam/](http://purl.org/dc/dcam/)
- rdf [http://www.w3.org/1999/02/22-rdf-syntax-ns#](http://www.w3.org/1999/02/22-rdf-syntax-ns#)
- xsd [http://www.w3.org/2001/XMLSchema#](http://www.w3.org/2001/XMLSchema#)
- ex [http://www.example.org/ns#](http://www.example.org/ns#) (an example namespace)

See also the DCMI RDF Schemas for the DCMI terms [DCMI-SCHEMAS].

## Terminology 

- Graph container: Refers to the to-be-introduced concept in the upcoming RDF version that allows the definition of a set of statements, highly inspired by named graphs. For the sake of discussion, a graph container can be seen as a named graph.
- When terminology is used that has a defined meaning in RDF and/or OWL, we use them in the same way. The use of them should be encouraged, synonyms should be avoided (but can be used if it helps to bridge the gap).
- Statement: A statement is a triple! 

## Vocabulary 

### DCAM Description Set Model

Statement: A DCAM statement is a triple comprising:

- an subject that represents the DCAM resource
- an predicate that is the DCAM property URI
- an object that corresponds to the DCAM value surrogate. This node will be referred to below as the value node

#### dcterms:type 

From DC-RDF: “The property dcterms:type has semantics very similar to rdf:type. At the time of writing, the precise relationship between those properties remains undecided. It is recommended that RDF applications implementing this specification primarily use and understand rdf:type in place of dcterms:type when expressing Dublin Core metadata in RDF, as most RDF processors come with built-in knowledge of rdf:type.” Proposal:

- dcterms:type owl:equivalentProperty rdf:type .
- Deprecate dcterms:type?

#### Description 

A description is made up of one or more statements (about one, and only one, resource) and zero or one described resource URI (a URI that identifies the described resource).

**This is no RDF class as we don't want to confuse a Description with DescriptionSets and we want to avoid nested graphs.**

Descriptions can be identified via the subjects of a given set of statements:

<pre>select distinct ?s where { ?s ?p ?o . }
</pre>

From DC-RDF (has to be merged with this document):

- One or more statements about one, and only one, resource. 
- A DCAM description is represented using an RDF graph originating from a single RDF subject.
- A DCAM described resource is represented by the RDF subject at the root of this RDF graph.
- If a DCAM described resource URI is available in the description, it should be used as the RDF URI reference of the RDF subject at the root of the RDF graph. Otherwise, the RDF subject should be a blank RDF node. Syntaxes may choose to use anonymous identifiers (such as the rdf:nodeID construct) to implement this.
- Fom DC-RDF: A DCAM value can be further described in a separate DCAM description within the same DCAM description set. This is represented in RDF by letting the value RDF node be the root of an RDF graph representing any DCAM statements in the DCAM description of the value. Thus, the value RDF node will be the RDF subject of a set of triples representing the DCAM description of the value.

#### dcam:DescriptionSet 

A _description set_ is a set of one or more _descriptions_, each of which describes a single resource. A DCAM description set is represented as a **graph container** that includes one or more descriptions as described above.

1. instanceOf owl:Class.

A set of one or more descriptions, each of which describes a single resource.

#### dcam:Record 

An instantiation of a description set, created according to one of the DCMI encoding guidelines (for example, XHTML meta tags, XML and RDF/XML).

Comment: Is this needed? A record is the serialization of a description set. If we declare it as a class and use URIs to identify a record, how do we distinguish between the URI of the description set and the URI of the serialization. Or is **dcam:record rdfs:subClassOf dcam:DescriptionSet**? At least records and description sets should not be disjoint. Best practices could help here, this is basically the question how we will deal with graph containers in RDF. Might be related to the questions what you expect behind a graph container URI? Description of the URI or contents of the graph container?

### DCAM Vocabulary Set Model

Replace with SKOS?

### Value surrogates 

A value surrogate is either a literal value surrogate or a non-literal value surrogate:

- A literal value surrogate is a value surrogate for a literal value, and is made up of exactly one value string. The value string is a literal which encodes the literal value.
- A non-literal value surrogate is a value surrogate for a non-literal value, and is made up of zero or one value URI (a URI that identifies the non-literal value associated with the property), zero or one vocabulary encoding scheme URI (a URI that identifies the vocabulary encoding scheme of which the non-literal value is a member), and zero or more value strings. Each value string is a literal which represents the non-literal value.

A value string is either a plain value string or a typed value string

- A plain value string may have an associated value string language that is an ISO language tag (for example en-GB). Plain value strings are intended to be human-readable.
- A typed value string has an associated syntax encoding scheme URI that identifies a syntax encoding scheme.

#### Non-literal value surrogates 

When the DCAM value surrogate is a non-literal value surrogate, the value RDF node is an RDF URI refence or a blank RDF node, with the characteristics given below.

#### Value URIs 

A DCAM value URI is represented using the RDF URI Reference of the value RDF node. If no value URI is given, the value RDF node is a blank node.

#### Vocabulary Encoding Scheme URIs 

A DCAM vocabulary encoding scheme URI is represented using an RDF triple comprising:

- an RDF subject that is the value RDF node.
- an RDF predicate that is the RDF URI reference dcam:memberOf
- an RDF object with a corresponding RDF URI Reference being the DCAM vocabulary encoding scheme URI

Value Strings, Value String Languages and Syntax Encoding Scheme URIs A DCAM value string is represented using an RDF triple comprising:

- an RDF subject that is the value RDF node
- an RDF predicate that is the RDF URI reference rdf:value
- an RDF object that is an RDF Literal node (either an RDF plain literal or RDF typed literal), containing the DCAM value string.

A DCAM value string language is represented using a language tag associated with a RDF plain literal occurring as the RDF object of this RDF triple. The language tag is constructed as defined by RFC-3066, normalized to lowercase. A DCAM syntax encoding scheme URI is represented using the RDF datatype URI associated with a RDF typed literal occurring as the RDF object of this RDF triple.

#### Literal value surrogates 

When the DCAM value surrogate is a literal value surrogate, the value RDF node is an RDF literal node, with exactly the same chararacteristics as in the case of DCAM value strings above.

## References 

[1] SKOS Reference: [http://www.w3.org/TR/2009/REC-skos-reference-20090818/](http://www.w3.org/TR/2009/REC-skos-reference-20090818/)

ABSTRACT-MODEL DCMI Abstract Model < [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)>

DC-RDF-NOTES Notes on DCMI specifications for Dublin Core metadata in RDF < [http://dublincore.org/documents/2008/01/14/dc-rdf-notes/](http://dublincore.org/documents/2008/01/14/dc-rdf-notes/)>

DCMES-XML Expressing Simple Dublin Core in RDF/XML < [http://dublincore.org/documents/dcmes-xml/](http://dublincore.org/documents/dcmes-xml/)>

DCQ-RDF-XML Expressing Qualified Dublin Core in RDF / XML < [http://dublincore.org/documents/dcq-rdf-xml/](http://dublincore.org/documents/dcq-rdf-xml/)>

DCMI-TERMS DCMI Metadata Terms < [http://dublincore.org/documents/dcmi-terms/](http://dublincore.org/documents/dcmi-terms/)>

DCMI-SCHEMAS DCMI term declarations represented in RDF schema language < [http://dublincore.org/schemas/rdfs/](http://dublincore.org/schemas/rdfs/)>

DC-TEXT DC-TEXT: A Text Syntax for Dublin Core Metadata < [http://dublincore.org/documents/dc-text/](http://dublincore.org/documents/dc-text/)>

RDF-CONCEPTS Resource Description Framework (RDF): Concepts and Abstract Syntax < [http://www.w3.org/TR/rdf-concepts/](http://www.w3.org/TR/rdf-concepts/)>

RDF-SCHEMA RDF Vocabulary Description Language 1.0: RDF Schema < [http://www.w3.org/TR/rdf-schema/](http://www.w3.org/TR/rdf-schema/)>

RDF-VALIDATOR W3C RDF Validation Service < [http://www.w3.org/RDF/Validator/](http://www.w3.org/RDF/Validator/)>

RDF-SYNTAX-GRAMMAR RDF/XML Syntax Specification (Revised) < [http://www.w3.org/TR/rdf-syntax-grammar/](http://www.w3.org/TR/rdf-syntax-grammar/)>

RDF-SEMANTICS RDF Semantics < [http://www.w3.org/TR/rdf-mt/](http://www.w3.org/TR/rdf-mt/)>


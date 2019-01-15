---
title: "- DCAM-2.0"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCAM_2d2_2e0.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

## DCAM 2.0: Dublin Core Abstract Model, RDF-based version

Note: This is is work in progress.

### Introduction

This document defines the Dublin Core Abstract Model, which is the model underlying the Dublin Core syntax specifications and Dublin Core application profiles. The primary purpose of this document is to specify the components and constructs used in Dublin Core metadata. It defines the nature of the components used and describes how those components are combined to create information structures. It provides an information model which is independent of any particular encoding syntax. Such an information model allows us to gain a better understanding of the kinds of descriptions that we are encoding and facilitates the development of better mappings and cross-syntax translations.

This document is primarily aimed at the developers of software applications that support Dublin Core metadata, people involved in developing new syntax encoding guidelines for Dublin Core metadata and people developing metadata application profiles based on DCMI vocabularies or on other compatible vocabularies.

The Dublin Core Abstract Model builds on the structure and semantics of the RDF conceptual model. It serves as a grounding of historical Dublin Core grammatical principles in a formal specification.

The DCAM is defined as a set of abstractions on top of the RDF conceptual model. For use independently of RDF, an abstract syntax is also provided.

### Overview

The fundamental purpose of Dublin Core metadata is to describe things in the world.

In the language of this document, a resource is anything in the world - John Lennon, this document, the World Wide Web and the concept of love are all resources.

Resources may be described by making statements. A statement says something about a resource. "This document is created by Alistair Miles", "Alistair Miles lives in the United Kingdom", and "the United Kingdom is part of the European Union" are all examples of statements that can be made using the DCMI abstract syntax.

The underlying abstraction of the Dublin Core Abstract Model therefore builds on the notion of a subject resource and a value resource, and a property to describe the relationship between the two.

### Definitions

A DCAM **Syntax Encoding Scheme** is a set of strings and an associated set of rules that describe a mapping between that set of strings and a set of resources. The mapping rules may define how the string is structured (for example DCMI Box) or they may simply enumerate all the strings and the corresponding resources. A syntax encoding scheme is the same as an RDF data type.

A DCAM **Vocabulary Encoding Scheme** is an enumerated set of resources.

#### Values

A DCAM **Non-literal Value Surrogate** consists of:

- An RDF resource **V** (called the _value RDF node_)

- An optional RDF triple

<pre>V dcam:memberOf VES
</pre> where _VES_ is a URI of a DCAM Vocabulary encoding Scheme - Any number of triples of the form

<pre>V rdf:value LIT
</pre> where LIT is an RDF Literal 

If _V_ has a URI, the URI is called the DCAM **Value URI**.

LIT is called a DCAM **Value String**

#### Statements

A DCAM **Statement** consists of:

- An RDF triple

<pre>R property V
</pre> where the subject resource R is an RDF resource, and - if V is a non-literal RDF resource, a DCAM **Non-literal Value Surrogate** , with V as the value RDF node.

#### Descriptions

A DCAM **Description** is a set of DCAM Statements with the same subject resource.

#### Description sets

A DCAM **Description Set** is a set of DCAM Descriptions.

### An abstract syntax for the abstract model

The following equivalent abstract syntax without reference to the RDF model may also be used:

- a DCAM **Description Set** is made up of one or more DCAM Descriptions

- a DCAM **Description** is made up of

  - zero or one described resource URI and

  - one or more DCAM Statements

- a DCAM **Statement** is made up of

  - one property URI and either

    - an RDF Literal, or

    - a DCAM Non-Literal Value Surrogate

- a DCAM **Non-Literal Value Surrogate** is made up of

  - a reference to a separate DCAM description,

  - zero or one DCAM Value URIs

  - zero or one vocabulary encoding scheme URIs

  - zero or more DCAM Value Strings

The mapping to RDF triples is trivial based on the above definitions.

### Literals and Non-Literals

...

Last edited 2009-01-03 20:13:52 by MikaelNilsson (re-formatted 2019-01-15)


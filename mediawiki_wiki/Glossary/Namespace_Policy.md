---
title: Namespace Policy
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Glossary/Namespace_Policy.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 22 April 2011, at 22:35.  
This page has been accessed 128,058 times.

## Namespace Policy 

See also Namespace, DCMI Namespace, DCMI Namespace Policy

The DCMI Namespace Policy, in 2001 among the first such policies of its kind to be articulated for any vocabulary, declares the principles by which DCMI Metadata Terms are identified and published as an RDF vocabulary.

The DCMI Namespace Policy defines a DCMI Namespace as "a collection of DCMI term URIs where each term is assigned a URI that starts with the same 'base URI'. The 'base URI' is known as the DCMI namespace URI."[1] The policy defines the following four base URIs:

- [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/) for the original fifteen properties of the Dublin Core Metadata Element Set, Version 1.1
- [http://purl.org/dc/dcmitype/](http://purl.org/dc/dcmitype/) for classes in the DCMI Type Vocabulary 
- [http://purl.org/dc/dcam/](http://purl.org/dc/dcam/) for terms used in the DCMI Abstract Model (of which there are currently two)
- [http://purl.org/dc/terms/](http://purl.org/dc/terms/) for all other DCMI properties, classes, vocabulary encoding schemes, and datatypes

The policy explains how a DCMI namespace URI is used together with a name, such as "extent", to form the URI " [http://purl.org/dc/terms/extent](http://purl.org/dc/terms/extent)".

Like other notoriously polysemous terms, the term "namespace" has been a source of confusion. The Namespace Policy clarifies as follows:

- Even though a DCMI namespace URI is sometimes used in XML formats -- arguably incorrectly -- as an XML namespace URI, a DCMI namespace is not the same as an XML namespace [2]. Technically, an XML namespace is a collection of two-part "expanded names", often abbreviated as "qualified names", or XML QNames, in which the namespace name is bound to a abbreviated prefix. An XML component with the same expanded name or QName can be used in multiple XML formats in the context of substantially different content models. In contrast, an RDF property with a given URI is designed to be interpreted a consistent way independently of the contexts in which it may appear. In RDF syntaxes such as RDF/XML and Turtle, prefixing mechanisms merely provide a way to abbreviate these URIs.
- The grouping of term URIs into DCMI Namespaces is orthogonal to the grouping of terms into sets designed to meet other functional needs, as in various types of vocabularies and formats.

The DCMI Namespace Policy declares guidelines for maintenance changes to DCMI terms: The correction of editorial errata (e.g., updated URLs pointing to documentation external to DCMI) result in no changes to DCMI term URIs, while semantic changes judged likely to have a substantial impact on machine processing will trigger the creation of a new term with a new URI.

In one of the historically earliest illustrations of Linked Data principles, DCMI namespace and term URIs have since 2001 dereferenced to machine-processable DCMI term declarations, so that "clicking on" a URI in a browser will retrieve a term representation in RDF.

- [1] [http://dublincore.org/documents/dcmi-namespace/](http://dublincore.org/documents/dcmi-namespace/)
- [2] [http://www.w3.org/TR/xml-names/](http://www.w3.org/TR/xml-names/)

[DCMI Generic Namespace Policy](/mediawiki_wiki/Generic_Namespace_Policy "Generic Namespace Policy") agreed with the FOAF project.


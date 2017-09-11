---
title: RDF Validator
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RDF_Application_Profiles/RDF_Validator.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 October 2014, at 13:39.  
This page has been accessed 29,011 times.

The RDF Validator can be used to validate constraints formulated with either [OWL 2](http://www.w3.org/TR/owl2-syntax/) or [DSP constructs](http://dublincore.org/documents/2008/03/31/dc-dsp/).

The RDF Validator can be accessed via [http://purl.org/net/rdfval-demo](http://purl.org/net/rdfval-demo).

[Mappings from OWL 2 and DSP to SPIN were implemented](https://github.com/dcmi/DSP-SPIN-Mapping) in order to execute RDF constraint validation automatically. The SPIN open source API is used for this purpose. The input of this Web application are constraints, data, and inference rules. The output are constraint violation triples.

The OWL 2 structural specification was used to define the SPIN mappings. The validation of OWL 2 constraints is based on closed world semantics. Reasoning may also be used to infer implicit triples which may affect the further validation of OWL 2 constraints.

The mappings from OWL 2 to SPIN can be found here: [https://github.com/boschthomas/OWL2-SPIN-Mapping](https://github.com/boschthomas/OWL2-SPIN-Mapping). A research paper about the approach behind the RDF validator and the SPIN mappings will be published: [Bosch, Eckert. Towards Description Set Profiles for RDF using SPARQL as Intermediate Language (DC 2014)](https://github.com/boschthomas/PhD/tree/master/publications/Papers%20in%20Conference%20Proceedings).

This demonstrator will be extended in order to validate further constraint languages.


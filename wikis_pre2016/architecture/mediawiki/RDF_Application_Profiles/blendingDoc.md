---
title: blendingDoc
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/RDF_Application_Profiles/blendingDoc.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 15 June 2015, at 19:18.  
This page has been accessed 7,543 times.

# Blending DCAM, DCAP, DSP, & SHACL

## Discussion paper

**Authors:** Karen Coyle, Corey Harper, & Tom Johnson

**Date:** June 14, 2015

The DCMI RDF Application Profiles Task Group [1] has been closely following the SHACL specification being developed by the W3C RDF Data Shapes Working Group [2]. SHACL is focused on RDF Validation, and is largely being implemented in SPARQL. This note attempts to distinguish between issues relating to RDF Validation and those relating to DC Application Profiles (DCAP), contending that the first are a subset of the second.

RDF Validation takes a defined input Graph and determines whether it meets a particular set of well‐defined constraints. This is one of at least four functions of an Application Profile:

1. Define and assemble the triples that make up a Graph functioning as an information management entity in the context of an application;
2. Determine whether that specific Graph meets particular RDF validation criteria;
3. Validate related non‐RDF content referenced within that Graph according to external requirements (i.e Cryptographic Hash Function, XML Schema Validation, etc.);
4. Provide human readable documentation of the information management workflows related to the above three functions.

From a recent discussion on the W3C Group’s Mailing List[3], it appears that SHACL will not address the question of assembling triples from multiple sources into a coherent Graph during validation, instead taking the view that a validation accepts an arbitrary Graph as input. This approach has the benefit that validations may be defined as independent from any particular assumptions about Graph scope. However, it implies that _1_ above needs to be handled externally and prior to SHACL validation and other validation techniques.

We consider that the separation between RDF Validation and the other concerns is appropriate. Increasingly, we see a continued role for DCAP in providing a framework for managing selected Graphs as mutable information sources. In this view:

- Dublin Core adopts SHACL to specify and validate Graph contents, but not the sources or composition of Graphs themselves;
- SHACL subsumes the DSP notions of Description Templates and Statement Templates, handling the definition of constraints and validation against those constraints. This represents the majority of concepts defined in the DCMI DSP document;[4]
- The graph selection process is related to the Dublin Core Abstract Model (DCAM).[5] [6]

Much of the the ongoing gathering of DCMI RDF AP requirements[7] has been related to SHACL and validation, though some have addressed graph selection. We urge the DCMI Task Group take as a next step identifying which requirements address validation and can be covered by SHACL, and which are better understood as Application Profile functions. A gap analysis would build on ongoing work to map DC requirements to SHACL. Combined with a DCAM revised for RDF 1.1, this will clarify the role of Application Profiles and their relationship to SHACL.

## References

1 [/mediawiki_wiki/RDF‐Application‐Profiles](/mediawiki_wiki/RDF%E2%80%90Application%E2%80%90Profiles)

2 [https://www.w3.org/2014/data-shapes/wiki/Main\_Page](https://www.w3.org/2014/data-shapes/wiki/Main_Page)

3 [http://lists.w3.org/Archives/Public/public‐data‐shapes‐wg/2015Jun/0023.html](http://lists.w3.org/Archives/Public/public%E2%80%90data%E2%80%90shapes%E2%80%90wg/2015Jun/0023.html)

4 [http://dublincore.org/documents/dc‐dsp/](http://dublincore.org/documents/dc%E2%80%90dsp/)

5 [http://dublincore.org/documents/abstract‐model/](http://dublincore.org/documents/abstract%E2%80%90model/)

6 [/mediawiki_wiki/Review\_of\_DCMI\_Abstract\_Model](/mediawiki_wiki/Review_of_DCMI_Abstract_Model)

7 [http://lelystad.informatik.uni‐mannheim.de/rdf‐validation/?q=requirements/dc‐requirements](http://lelystad.informatik.uni%E2%80%90mannheim.de/rdf%E2%80%90validation/?q=requirements/dc%E2%80%90requirements)


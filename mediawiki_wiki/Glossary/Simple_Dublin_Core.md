---
title: Simple Dublin Core
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Glossary/Simple_Dublin_Core.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 31 August 2011, at 17:42.  
This page has been accessed 127,374 times.

## Simple Dublin Core and Qualified Dublin Core 

NOTE: THIS IS A ROUGH DRAFT...

Cross-reference from Qualified Dublin Core

With the invention of Qualifiers in 1997 (see glossary entry Terms), a distinction was made between Simple and Qualified Dublin Core. Qualified Dublin Core referred to metadata that used the Dublin Core with DCMI qualifiers. Simple Dublin Core was typically taken to refer to:

- a description of just one resource,
- using only the fifteen properties of the Dublin Core Metadata Element Set,
- all optionally and repeatably,
- with string values,
- and without qualifiers.

This pattern was the product of a time when the Dublin Core Metadata Element Set was widely understood, even within the Dublin Core community, as the specification of a record format. At the time, it was also assumed that metadata should consist of textual values indexed for retrieval. This pattern was widely deployed after 2000 in systems supporting the Open Archives Initiative Protocol for Metadata Harvesting (OAI-PMH), which requires that an OAI-PMH repository expose records using an XML format, oai\_dc [1], which may be seen as a serialization of Simple Dublin Core. Due to the popularity of such formats, many people still refer to the Dublin Core Metadata Element Set and Simple Dublin Core interchangeably.

Both Simple Dublin Core and Qualified Dublin Core are defined in XML schemas owned and maintained by DCMI [2] -- the latter following "Guidelines for implementing Dublin Core in XML" of 2003 [3]. While these formats have proven to be useful in numerous XML-based implementations over the years, such fixed formats show limitations in the heterogenous context of Linked Data. The availability of more flexible Semantic Web solutions cast Simple and Qualified Dublin Core into a different light:

- In a Semantic Web perspective, the Dublin Core Metadata Element Set -- i.e., the set of fifteen properties -- is understood as just one vocabulary, among many, available for use in data. The Simple Dublin Core pattern constrains the use of its properties in one particular way and can therefore be seen as an application profile that happens to be limited to properties from one DCMI namespace.

- The limitation of Simple Dublin Core to string values looks dated at a time when the Linked Data approach is emphasizing the use of URIs in order to make richly interlinked connections with other resources and metadata descriptions.

- In practice, implementers of Dublin-Core-based metadata more often create application profiles that use a sub-set of Dublin Core properties, or use Dublin Core properties together with properties from other vocabularies. In a Linked Data environment, and in accordance with an Open World Mindset, perfect agreement on fixed formats is not imperative, making the limitation to properties from one DCMI namespace seem a bit arbitrary. (See glossary entry on Open World Mindset.)

- Providing interoperable metadata as Linked Data, on the other hand, does not mean that data must be expressed natively using RDF. It may indeed be more practical to manage data in fixed XML formats on the backend and transform or convert the data for publication in a Linked Data context.

### References 

- [1] [http://www.openarchives.org/OAI/2.0/oai\_dc.xsd](http://www.openarchives.org/OAI/2.0/oai_dc.xsd)
- [2] [http://dublincore.org/schemas/xmls/](http://dublincore.org/schemas/xmls/)
- [3] [http://dublincore.org/documents/2003/04/02/dc-xml-guidelines/](http://dublincore.org/documents/2003/04/02/dc-xml-guidelines/)

### Material to integrate into above... 

[http://standards-catalogue.ukoln.ac.uk/index/Simple\_Dublin\_Core](http://standards-catalogue.ukoln.ac.uk/index/Simple_Dublin_Core)

Simple Dublin Core is a Dublin Core Application Profile (DCAP) in which the properties available are the 15 elements of the Dublin Core Metadata Element Set and in which values are represented by value strings. A description set conforming to the Simple Dublin Core DCAP contains only one description; within that description, a property may be referenced in multiple statements or in none; each statement must contain a value string; value URIs and rich representations are not permitted.

[http://efoundations.typepad.com/efoundations/2009/10/what-is-simple-dublin-core.html](http://efoundations.typepad.com/efoundations/2009/10/what-is-simple-dublin-core.html) [http://efoundations.typepad.com/efoundations/2009/11/simple-dc-revisited.html](http://efoundations.typepad.com/efoundations/2009/11/simple-dc-revisited.html)

As a "pattern", people have used the term in different, incompatible ways, e.g.:

- where the set of terms available is just DCMI-owned terms 
- where it is some open-ended set of DCMI-owned terms with any subproperties of DCMI terms, any VES/SES etc 
- where it is some open-ended set including properties which aren't subproperties of DCMI terms
- etc


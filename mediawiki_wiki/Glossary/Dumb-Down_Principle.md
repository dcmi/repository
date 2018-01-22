---
title: Dumb-Down Principle
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Glossary/Dumb-Down_Principle.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 20 November 2012, at 17:32.  
This page has been accessed 251,860 times.

## Dumb-Down Principle 

The Dumb-Down Principle, which entered Dublin Core discourse in 1998<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>, originally denoted a principled way of viewing a complex metadata description through the lens of a simpler representation, typically [Simple Dublin Core](/mediawiki_wiki/Glossary/Simple_Dublin_Core).

Dumb-Down was associated with the notion of a ["qualifier"](/mediawiki_wiki/Glossary/DCMI_Metadata_Terms) which, when introduced in 1997, was seen as a way to provide additional context to a metadata value -- clarifications of meaning, references to controlled vocabularies or to parsing rules, and the like. Such additional information could, in principle, be safely ignored by applications for which the extra context was either not understood, or unnecessary. As the document "Dublin Core Qualifiers" put it in 2000: "a client should be able to ignore any qualifier and use the value as if it were unqualified. While this may result in some loss of specificity, the remaining term value (minus the qualifier) must continue to be generally correct and useful for discovery."<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>

The original Dumb-Down algorithms involved following statements using the property rdf:value to resolve complex descriptions to a "simple default name" (or "default value") for a resource, that is, "to ignore all qualifiers that originate at structural nodes, and follow the chain of rdf:value arcs until a String is found. That string is returned as the value of the procedure."<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup> <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>

In 2005, the DCMI Abstract Model introduced a distinction between "Informed" and "Uninformed" Dumb-Down: "Informed dumb-down takes place where the software performing the dumb-down algorithm has knowledge built into it about the property relationships and values being used within a specific DCMI metadata application. Uninformed dumb-down takes place where the software performing the dumb-down algorithm has no prior knowledge about the properties and values being used." The notion of Informed Dumb-Down introduced the idea of using the sub-property relationships expressed in RDF schemas to infer statements using more-general properties from statements using more-specific properties.<sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup>

Converting metadata into plain-text forms for display remains an important issue in the Linked Data space, though in the absence of rdf:value, which is currently considered to be too poorly defined for such purposes, there is no clear default way to do so. As the notion of Simple Dublin Core (understood as "fifteen elements with text values") has become relatively less salient in the context of Linked Data, Dumb-Down is increasingly understood as referring to the more general notion of partial interoperability among imperfectly aligned data sets in an open Web environment on the basis of Semantic Web principles.

### References 

1. ↑ [http://dublincore.org/archives/1998/1998-09-24.decisions.html](http://dublincore.org/archives/1998/1998-09-24.decisions.html)
2. ↑ [http://dublincore.org/documents/2000/07/11/dcmes-qualifiers/](http://dublincore.org/documents/2000/07/11/dcmes-qualifiers/)
3. ↑ [http://dublincore.org/archives/1998/1998-09-24.decisions.html](http://dublincore.org/archives/1998/1998-09-24.decisions.html)
4. ↑ [http://dublincore.org/documents/dcq-rdf-xml/#sec3](http://dublincore.org/documents/dcq-rdf-xml/#sec3)
5. ↑ [http://dublincore.org/documents/2005/03/07/abstract-model/#sect-5](http://dublincore.org/documents/2005/03/07/abstract-model/#sect-5)


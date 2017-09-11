---
title: Metadata Harmonization
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Glossary/Metadata_Harmonization.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 17 January 2012, at 16:48.  
This page has been accessed 159,813 times.

## Metadata Harmonization 

In a [NISO/DCMI webinar of March 2011](http://dublincore.org/resources/training/NISO_Webinar_20110316/NISO-DCMI_Webinar_20110316.pdf), Mikael Nilsson defines "metadata interoperability" as:

<dl><dd>
<i><b>the ability of two or more systems or components to exchange descriptive data about things, and to interpret the descriptive data that has been exchanged in a way that is consistent with the interpretation of the creator of the data,</b></i>
</dd></dl>


and "metadata harmonization" as

<dl><dd>
<i><b>the ability of two or more systems or components to exchange "combined metadata" conforming to two or more metadata specifications, and to interpret the metadata that has been exchanged in a way that is consistent with the intentions of the creators of the metadata.</b></i>
</dd></dl>


Put more simply: Metadata is "interoperable" if you can exchange the metadata between two applications and both applications can interpret it correctly. Metadata is "harmonized" if you can take metadata that is based on two different specifications (e.g., DC and IEEE/LOM), combine it, and interpret the combined metadata correctly.

In other words, when things are done the same (or compatible) way, they are "interoperable". When things are done differently, but mapped to a common model, they are "harmonized".

Mikael Nilssons "recipe for harmonization":

1. Adopt a Core Model with support for machine-processable semantics (i.e., RDF)
2. Construct mappings of other standards to the Core Model -- mappings which preserve semantics.


---
title: Properties2FRBR
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Properties2FRBR.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 5 September 2011, at 20:14.  
This page has been accessed 123,068 times.

## Mapping of the Properties of the DC-Lib DescriptionSetProfile to FRBR-Entities 

Basis of the following is [Chapter 4 of FRBR](http://archive.ifla.org/VII/s13/frbr/frbr_current4.htm) and the [SWAP Description Set Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly_Works_Application_Profile).

If you want to assign the properties of the Description Set Profile of the DC-Lib AP for Bibliographic Text Resources to FRBR Entities,

- **we recomment to assign all ItemProperties to frbr:item**
<pre> dc:identifier rdfs:domain frbr:item .
</pre><pre> agls:availability rdfs:domain frbr:item .
</pre><pre> dc:description rdfs:domain frbr:item .
</pre><pre> dcterms:provenance rdfs:domain frbr:item .
</pre><pre> frbr:isExemplarOf rdfs:domain frbr:item .
</pre>

- **we recommend to assign the properties of Bibliographic Text Resource to the FRBR entities described as** rdfs:domain **in the following list**
<pre> dc:title rdfs:domain frbr:manifestation .
</pre><pre> dcterms:alternative rdfs:domain frbr:manifestation .
</pre><pre> dc:creator rdfs:domain frbr:work .
</pre><pre> dc:contributor rdfs:domain frbr:expression .
</pre><pre> dc:publisher rdfs:domain frbr:manifestation .
</pre><pre> dc:subject rdfs:domain frbr:work .
</pre><pre> dcterms:abstract rdfs:domain frbr:work .
</pre><pre> dcterms:tableOfContents rdfs:domain frbr:expression .
</pre><pre> dcterms:created rdfs:domain frbr:expression .
</pre><pre> dcterms:valid rdfs:domain frbr:manifestation .
</pre><pre> dcterms:available rdfs:domain frbr:expression .
</pre><pre> dcterms:issued rdfs:domain frbr:manifestation .
</pre><pre> dcterms:modified rdfs:domain frbr:manifestation .
</pre><pre> dcterms:dateCopyrighted rdfs:domain frbr:expression .
</pre><pre> dcterms:dateSubmitted rdfs:domain frbr:expression .
</pre><pre> dcterms:dateAccepted rdfs:domain frbr:expression .
</pre><pre> myex:dateOfReproduction rdfs:domain frbr:manifestation .
</pre><pre> dc:type rdfs:domain frbr:expression .
</pre><pre> dc:format rdfs:domain frbr:manifestation .
</pre><pre> dcterms:extent rdfs:domain frbr:manifestation .
</pre><pre> dcterms:medium rdfs:domain frbr:manifestation .
</pre><pre> dc:identifier rdfs:domain frbr:manifestation .
</pre><pre> dcterms:bibliographicCitation rdfs:domain frbr:expression .
</pre><pre> dc:source rdfs:domain frbr:manifestation .
</pre><pre> dc:language rdfs:domain frbr: expression .
</pre><pre> dcterms:isVersionOf rdfs:domain frbr:expression .
</pre><pre> dcterms:isFormatOf rdfs:domain frbr:manifestation .
</pre><pre> dcterms:hasFormat rdfs:domain frbr:manifestation .
</pre><pre> dcterms:isReplacedBy rdfs:domain frbr:expression .
</pre><pre> dcterms:replaces rdfs:domain frbr:expression .
</pre><pre> dcterms:isPartOf rdfs:domain frbr:manifestation .
</pre><pre> dcterms:hasPart rdfs:domain frbr:manifestation .
</pre><pre> dcterms:requires rdfs:domain frbr:manifestation .
</pre><pre> dcterms:isReferencedBy rdfs:domain frbr:expression .
</pre><pre> dcterms:references rdfs:domain frbr:expression .
 
 frbr:isATranslationExpressionOf rdfs:domain frbr:expression .
</pre><pre> dc:coverage rdfs:domain frbr:work .
</pre><pre> dcterms:spatial rdfs:domain frbr:work .
</pre><pre> dcterms:temporal rdfs:domain frbr:work .
</pre><pre> dc:rights rdfs:domain frbr:manifestation .
</pre><pre> dcterms:audience rdfs:domain frbr:work .
</pre><pre> eprint:version rdfs:domain frbr:expression .
</pre>
* * *

Go to [DCLib AP](/archive/mediawiki_wiki/DCLib_AP "DCLib AP")


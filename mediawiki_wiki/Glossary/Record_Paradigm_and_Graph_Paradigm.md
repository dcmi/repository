---
title: Record Paradigm and Graph Paradigm
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Glossary/Record_Paradigm_and_Graph_Paradigm.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 25 December 2012, at 11:27.  
This page has been accessed 179,604 times.

The XML tree mindset and the Resource Description Framework (RDF) graph mindset were present in the DC community almost from the start, causing the confusion and talking-past-each-other that still persists today.

At the first workshop in 1995, the task was seen as that of defining "elements" for "records" -- basically, the XML mindset. By saying that all elements were "optional and repeatable", a message was reinforced that the Dublin Core provided a "functional" vocabulary -- i.e., a set of terms intended to be used together to describe things of a certain type.

By the latest in 1999-2000, when the first set of "qualifiers" was prepared, it was clear that the resulting vocabulary lacked the functional coherence of the DC-15. By then, the notion that DCMI metadata terms were a "vocabulary" was in ascendance. That's also precisely when the notion of the application profile (AP) was put forth -- the idea being that DC-15 plus qualifiers provided a set of terms which could be used selectively, together with terms from other sources, themselves used selectively, to address specific requirements. The notion, then, that further uncontrolled expansion could make the DCMI metadata terms, as a whole, even more spotty, ad-hoc, amorphous, and unmaintainable, led in 2001 to the establishment of the DCMI Usage Board.

In the meantime, the XML-mindset notion that DCMI metadata terms -- qualifiers included -- constituted a functional vocabulary, lived on in the notion that the entire term set should form the basis of a "qualfied Dublin Core" format.

It was clear that people needed more precise, specialized descriptions, but it was also clear that trying to specialize in all directions at once would lead to an unmaintainable muddle. Hence the emphasis on APs.

XML defines purely syntactic elements. There is no general semantic interpretation for XML elements -- each XML schema defines its own tree structure. Attributes in XML, as far as can be seen, can hold pretty much any type of information one wants to package together at that point. There may exist an out-of-band specification (e.g., in a separate PDF or HTML document) to explain to humans what the information means, and one can use that specification to design applications that do meaningful things with the information, but the parser is just traversing the ad-hoc tree format assigning values to placeholders.

RDF, in contrast, uses terms with underlying grammatical categories in the context of meaningful statements -- categories that are recognizably similar to the nouns and verbs of natural language. RDF is a general-purpose language, designed by humans for use by humans and machines.

The problem is that we are in the middle of a sudden (20-year?) shift from a predominantly print world to a predominantly digital world. It is not scalable (in the present) or preservable (for the future) to invent new languages, such as XML formats, for every application in the absence of an RDF interpretation -- RDF being the only general-purpose grammar of data, with traction, that we currently have. The scale and speed of this transformation also virtually guarantees that any applications and user-facing interfaces we use today will at some point, probably soon, be superseded. Data that cannot "speak for itself" is vulnerable to becoming irrelevant.

Not only are applications increasingly expected to be "linkable" (in the present), but we hope they will be interpretable (in the future). Not that anyone needs to abandon XML, but arguably, to continue pouring culturally important information into ad-hoc data formats -- in the absence of well-defined interpretations as triples -- is like making statements without grammar, and creating data without URIs is like saying things without proper footnotes citing sources. Cultural memory institutions should live by the scholarly ethos, by which things like grammar and footnotes are essential, and the language of triples represents the application of that ethos to data itself.


---
title: Encoding Scheme
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Glossary/Encoding_Scheme.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 14 June 2012, at 01:54.  
This page has been accessed 152,301 times.

## Encoding Scheme 

The notion of "scheme" (also known as "encoding scheme") entered the discourse around Dublin Core at a [March 1997 Dublin Core workshop](http://www.dlib.org/dlib/june97/metadata/06weibel.html) in Canberra, Australia. As originally defined, a "scheme" was a "qualifier" which "specifie[d] a context for the interpretation of a given element". As described in the glossary entry for [DCMI Metadata Terms](/mediawiki_wiki/Glossary/DCMI_Metadata_Terms), the encoding scheme came by 2000 to be differentiated into "syntax encoding schemes" and "vocabulary encoding schemes".

Note that the word "scheme" is often confused with "schema," most commonly used to refer to the specification of a data format.

<dl>
<dt>syntax encoding scheme (<a href="http://www.w3.org/2000/01/rdf-schema#Datatype" class="external free" rel="nofollow">http://www.w3.org/2000/01/rdf-schema#Datatype</a>)
</dt>
<dd>Defined as "A set of strings and an associated set of rules that describe a mapping between that set of strings and a set of resources. The mapping rules may define how the string is structured (for example DCMI Box) or they may simply enumerate all the strings and the corresponding resources (for example ISO 3166)." The <a href="http://dublincore.org/documents/abstract-model/" class="external text" rel="nofollow">DCMI Abstract Model</a> of 2007 explicitly declared the notion of "syntax encoding scheme" to be formally equivalent to an <a href="http://www.w3.org/2000/01/rdf-schema#Datatype" class="external text" rel="nofollow">RDF Datatype</a>.
</dd>
</dl>
<dl>
<dt>vocabulary encoding scheme (<a href="http://purl.org/dc/dcam/VocabularyEncodingScheme" class="external free" rel="nofollow">http://purl.org/dc/dcam/VocabularyEncodingScheme</a>)
</dt>
<dd>Defined as "An enumerated set of resources." The Dublin Core notion of a (Vocabulary) Encoding Scheme influenced the notion of a <a href="http://www.w3.org/TR/2009/NOTE-skos-primer-20090818/#secscheme" class="external text" rel="nofollow">SKOS Concept Scheme</a>. While it is still open for discussion, there is arguably no difference between the DCAM notion of a <a href="http://purl.org/dc/dcam/VocabularyEncodingScheme" class="external text" rel="nofollow">Vocabulary Encoding Scheme</a> and the SKOS notion of a <a href="http://www.w3.org/TR/skos-reference/#vocab" class="external text" rel="nofollow">SKOS Concept Scheme</a>, or between the DCAM relationship <a href="http://purl.org/dc/dcam/memberOf" class="external text" rel="nofollow">memberOf</a> and the SKOS relationship <a href="http://www.w3.org/TR/skos-reference/#vocab" class="external text" rel="nofollow">inScheme</a>.
</dd>
</dl>


A simple example of how a Vocabulary Encoding Scheme may be used (which says: "Resource X has the topic: 'Textile design--China--History'. This topic is a member of the Vocabulary Encoding Scheme 'Library of Congress Subject Headings'."):

<pre>  :X dcterms:subject  :Y
     :Y rdf:value "Textile design--China--History"
     :Y dcam:memberOf &lt;<a href="http://purl.org/dc/terms/LCSH" class="external free" rel="nofollow">http://purl.org/dc/terms/LCSH</a>&gt; 
</pre>

The Vocabulary Encoding Scheme "dcterms:LCSH" was originally published in 2000. Note that in the meantime -- in this particular case -- the Library of Congress Subject Headings have been "semanticized", such that each subject heading now has its own URI. Today, therefore, one might simply use the following in metadata:

<pre>  :X dcterms:subject &lt;<a href="http://id.loc.gov/authorities/subjects/sh85134312" class="external free" rel="nofollow">http://id.loc.gov/authorities/subjects/sh85134312</a>&gt;
</pre>

The Vocabulary Encoding Scheme, in other words, is designed to put text values such as "Textile design--China--History" into a context that is citable by URI. The context for dcterms:LCSH at the time it was coined in 2000 was a stack of large red volumes near the Reference Desk in the library. Now that LCSH terms have URIs which themselves provide that sort of context, providing additional context with a Vocabulary Encoding Scheme is (in most cases) unnecessarily redundant.


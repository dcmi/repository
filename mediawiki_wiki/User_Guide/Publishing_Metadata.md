---
title: Publishing Metadata
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/User_Guide/Publishing_Metadata.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 8 January 2015, at 13:26.  
This page has been accessed 219,659 times.

- Contributor: Stefanie Rühle 
- Contributer: Tom Baker 
- Contributor: Pete Johnston

Go to [User Guide](/mediawiki_wiki/User_Guide) | [Creating Metadata](/mediawiki_wiki/User_Guide/Creating_Metadata)

**How to use DCMI Metadata as linked data**

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#About_the_linked_data_examples"><span class="tocnumber">1</span> <span class="toctext">About the linked data examples</span></a></li>
        <li class="toclevel-1 tocsection-2">
          <a href="#Properties_of_the_terms_namespace"><span class="tocnumber">2</span> <span class="toctext">Properties of the terms namespace</span></a>
          <ul>
            <li class="toclevel-2 tocsection-3">
              <a href="#Properties_of_the_terms_namespace_used_only_with_literal_values"><span class="tocnumber">2.1</span> <span class="toctext">Properties of the terms namespace used only with literal values</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#dcterms:alternative"><span class="tocnumber">2.1.1</span> <span class="toctext">dcterms:alternative</span></a></li>
                <li class="toclevel-3 tocsection-5"><a href="#dcterms:available"><span class="tocnumber">2.1.2</span> <span class="toctext">dcterms:available</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#dcterms:bibliographicCitation"><span class="tocnumber">2.1.3</span> <span class="toctext">dcterms:bibliographicCitation</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#dcterms:created"><span class="tocnumber">2.1.4</span> <span class="toctext">dcterms:created</span></a></li>
                <li class="toclevel-3 tocsection-8"><a href="#dcterms:date"><span class="tocnumber">2.1.5</span> <span class="toctext">dcterms:date</span></a></li>
                <li class="toclevel-3 tocsection-9"><a href="#dcterms:dateAccepted"><span class="tocnumber">2.1.6</span> <span class="toctext">dcterms:dateAccepted</span></a></li>
                <li class="toclevel-3 tocsection-10"><a href="#dcterms:dateCopyrighted"><span class="tocnumber">2.1.7</span> <span class="toctext">dcterms:dateCopyrighted</span></a></li>
                <li class="toclevel-3 tocsection-11"><a href="#dcterms:dateSubmitted"><span class="tocnumber">2.1.8</span> <span class="toctext">dcterms:dateSubmitted</span></a></li>
                <li class="toclevel-3 tocsection-12"><a href="#dcterms:identifier"><span class="tocnumber">2.1.9</span> <span class="toctext">dcterms:identifier</span></a></li>
                <li class="toclevel-3 tocsection-13"><a href="#dcterms:issued"><span class="tocnumber">2.1.10</span> <span class="toctext">dcterms:issued</span></a></li>
                <li class="toclevel-3 tocsection-14"><a href="#dcterms:modified"><span class="tocnumber">2.1.11</span> <span class="toctext">dcterms:modified</span></a></li>
                <li class="toclevel-3 tocsection-15"><a href="#dcterms:title"><span class="tocnumber">2.1.12</span> <span class="toctext">dcterms:title</span></a></li>
                <li class="toclevel-3 tocsection-16"><a href="#dcterms:valid"><span class="tocnumber">2.1.13</span> <span class="toctext">dcterms:valid</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-17">
              <a href="#Properties_of_the_terms_namespace_used_only_with_non-literal_values"><span class="tocnumber">2.2</span> <span class="toctext">Properties of the terms namespace used only with non-literal values</span></a>
              <ul>
                <li class="toclevel-3 tocsection-18"><a href="#dcterms:accrualMethod"><span class="tocnumber">2.2.1</span> <span class="toctext">dcterms:accrualMethod</span></a></li>
                <li class="toclevel-3 tocsection-19"><a href="#dcterms:accrualPeriodicity"><span class="tocnumber">2.2.2</span> <span class="toctext">dcterms:accrualPeriodicity</span></a></li>
                <li class="toclevel-3 tocsection-20"><a href="#dcterms:accrualPolicy"><span class="tocnumber">2.2.3</span> <span class="toctext">dcterms:accrualPolicy</span></a></li>
                <li class="toclevel-3 tocsection-21"><a href="#dcterms:accessRights"><span class="tocnumber">2.2.4</span> <span class="toctext">dcterms:accessRights</span></a></li>
                <li class="toclevel-3 tocsection-22"><a href="#dcterms:audience"><span class="tocnumber">2.2.5</span> <span class="toctext">dcterms:audience</span></a></li>
                <li class="toclevel-3 tocsection-23"><a href="#dcterms:conformsTo"><span class="tocnumber">2.2.6</span> <span class="toctext">dcterms:conformsTo</span></a></li>
                <li class="toclevel-3 tocsection-24"><a href="#dcterms:contributor"><span class="tocnumber">2.2.7</span> <span class="toctext">dcterms:contributor</span></a></li>
                <li class="toclevel-3 tocsection-25"><a href="#dcterms:coverage"><span class="tocnumber">2.2.8</span> <span class="toctext">dcterms:coverage</span></a></li>
                <li class="toclevel-3 tocsection-26"><a href="#dcterms:creator"><span class="tocnumber">2.2.9</span> <span class="toctext">dcterms:creator</span></a></li>
                <li class="toclevel-3 tocsection-27"><a href="#dcterms:educationLevel"><span class="tocnumber">2.2.10</span> <span class="toctext">dcterms:educationLevel</span></a></li>
                <li class="toclevel-3 tocsection-28"><a href="#dcterms:extent"><span class="tocnumber">2.2.11</span> <span class="toctext">dcterms:extent</span></a></li>
                <li class="toclevel-3 tocsection-29"><a href="#dcterms:format"><span class="tocnumber">2.2.12</span> <span class="toctext">dcterms:format</span></a></li>
                <li class="toclevel-3 tocsection-30"><a href="#dcterms:hasFormat"><span class="tocnumber">2.2.13</span> <span class="toctext">dcterms:hasFormat</span></a></li>
                <li class="toclevel-3 tocsection-31"><a href="#dcterms:hasPart"><span class="tocnumber">2.2.14</span> <span class="toctext">dcterms:hasPart</span></a></li>
                <li class="toclevel-3 tocsection-32"><a href="#dcterms:hasVersion"><span class="tocnumber">2.2.15</span> <span class="toctext">dcterms:hasVersion</span></a></li>
                <li class="toclevel-3 tocsection-33"><a href="#dcterms:instructionalMethod"><span class="tocnumber">2.2.16</span> <span class="toctext">dcterms:instructionalMethod</span></a></li>
                <li class="toclevel-3 tocsection-34"><a href="#dcterms:isFormatOf"><span class="tocnumber">2.2.17</span> <span class="toctext">dcterms:isFormatOf</span></a></li>
                <li class="toclevel-3 tocsection-35"><a href="#dcterms:isPartOf"><span class="tocnumber">2.2.18</span> <span class="toctext">dcterms:isPartOf</span></a></li>
                <li class="toclevel-3 tocsection-36"><a href="#dcterms:isReferencedBy"><span class="tocnumber">2.2.19</span> <span class="toctext">dcterms:isReferencedBy</span></a></li>
                <li class="toclevel-3 tocsection-37"><a href="#dcterms:isReplacedBy"><span class="tocnumber">2.2.20</span> <span class="toctext">dcterms:isReplacedBy</span></a></li>
                <li class="toclevel-3 tocsection-38"><a href="#dcterms:isRequiredBy"><span class="tocnumber">2.2.21</span> <span class="toctext">dcterms:isRequiredBy</span></a></li>
                <li class="toclevel-3 tocsection-39"><a href="#dcterms:isVersionOf"><span class="tocnumber">2.2.22</span> <span class="toctext">dcterms:isVersionOf</span></a></li>
                <li class="toclevel-3 tocsection-40"><a href="#dcterms:language"><span class="tocnumber">2.2.23</span> <span class="toctext">dcterms:language</span></a></li>
                <li class="toclevel-3 tocsection-41"><a href="#dcterms:license"><span class="tocnumber">2.2.24</span> <span class="toctext">dcterms:license</span></a></li>
                <li class="toclevel-3 tocsection-42"><a href="#dcterms:mediator"><span class="tocnumber">2.2.25</span> <span class="toctext">dcterms:mediator</span></a></li>
                <li class="toclevel-3 tocsection-43"><a href="#dcterms:medium"><span class="tocnumber">2.2.26</span> <span class="toctext">dcterms:medium</span></a></li>
                <li class="toclevel-3 tocsection-44"><a href="#dcterms:provenance"><span class="tocnumber">2.2.27</span> <span class="toctext">dcterms:provenance</span></a></li>
                <li class="toclevel-3 tocsection-45"><a href="#dcterms:publisher"><span class="tocnumber">2.2.28</span> <span class="toctext">dcterms:publisher</span></a></li>
                <li class="toclevel-3 tocsection-46"><a href="#dcterms:references"><span class="tocnumber">2.2.29</span> <span class="toctext">dcterms:references</span></a></li>
                <li class="toclevel-3 tocsection-47"><a href="#dcterms:relation"><span class="tocnumber">2.2.30</span> <span class="toctext">dcterms:relation</span></a></li>
                <li class="toclevel-3 tocsection-48"><a href="#dcterms:replaces"><span class="tocnumber">2.2.31</span> <span class="toctext">dcterms:replaces</span></a></li>
                <li class="toclevel-3 tocsection-49"><a href="#dcterms:requires"><span class="tocnumber">2.2.32</span> <span class="toctext">dcterms:requires</span></a></li>
                <li class="toclevel-3 tocsection-50"><a href="#dcterms:rights"><span class="tocnumber">2.2.33</span> <span class="toctext">dcterms:rights</span></a></li>
                <li class="toclevel-3 tocsection-51"><a href="#dcterms:rightsHolder"><span class="tocnumber">2.2.34</span> <span class="toctext">dcterms:rightsHolder</span></a></li>
                <li class="toclevel-3 tocsection-52"><a href="#dcterms:source"><span class="tocnumber">2.2.35</span> <span class="toctext">dcterms:source</span></a></li>
                <li class="toclevel-3 tocsection-53"><a href="#dcterms:spatial"><span class="tocnumber">2.2.36</span> <span class="toctext">dcterms:spatial</span></a></li>
                <li class="toclevel-3 tocsection-54"><a href="#dcterms:subject"><span class="tocnumber">2.2.37</span> <span class="toctext">dcterms:subject</span></a></li>
                <li class="toclevel-3 tocsection-55"><a href="#dcterms:temporal"><span class="tocnumber">2.2.38</span> <span class="toctext">dcterms:temporal</span></a></li>
                <li class="toclevel-3 tocsection-56"><a href="#dcterms:type"><span class="tocnumber">2.2.39</span> <span class="toctext">dcterms:type</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-57">
              <a href="#Properties_of_the_terms_namespace.2C_that_may_be_used_with_literal_and_non-literal_values"><span class="tocnumber">2.3</span> <span class="toctext">Properties of the terms namespace, that may be used with literal and non-literal values</span></a>
              <ul>
                <li class="toclevel-3 tocsection-58"><a href="#dcterms:abstract"><span class="tocnumber">2.3.1</span> <span class="toctext">dcterms:abstract</span></a></li>
                <li class="toclevel-3 tocsection-59"><a href="#dcterms:description"><span class="tocnumber">2.3.2</span> <span class="toctext">dcterms:description</span></a></li>
                <li class="toclevel-3 tocsection-60"><a href="#dcterms:tableOfContents"><span class="tocnumber">2.3.3</span> <span class="toctext">dcterms:tableOfContents</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-61">
          <a href="#Legacy_namespace"><span class="tocnumber">3</span> <span class="toctext">Legacy namespace</span></a>
          <ul>
            <li class="toclevel-2 tocsection-62">
              <a href="#Properties_of_the_legacy_namespace"><span class="tocnumber">3.1</span> <span class="toctext">Properties of the legacy namespace</span></a>
              <ul>
                <li class="toclevel-3 tocsection-63"><a href="#dc:contributor"><span class="tocnumber">3.1.1</span> <span class="toctext">dc:contributor</span></a></li>
                <li class="toclevel-3 tocsection-64"><a href="#dc:coverage"><span class="tocnumber">3.1.2</span> <span class="toctext">dc:coverage</span></a></li>
                <li class="toclevel-3 tocsection-65"><a href="#dc:creator"><span class="tocnumber">3.1.3</span> <span class="toctext">dc:creator</span></a></li>
                <li class="toclevel-3 tocsection-66"><a href="#dc:date"><span class="tocnumber">3.1.4</span> <span class="toctext">dc:date</span></a></li>
                <li class="toclevel-3 tocsection-67"><a href="#dc:description"><span class="tocnumber">3.1.5</span> <span class="toctext">dc:description</span></a></li>
                <li class="toclevel-3 tocsection-68"><a href="#dc:format"><span class="tocnumber">3.1.6</span> <span class="toctext">dc:format</span></a></li>
                <li class="toclevel-3 tocsection-69"><a href="#dc:identifier"><span class="tocnumber">3.1.7</span> <span class="toctext">dc:identifier</span></a></li>
                <li class="toclevel-3 tocsection-70"><a href="#dc:language"><span class="tocnumber">3.1.8</span> <span class="toctext">dc:language</span></a></li>
                <li class="toclevel-3 tocsection-71"><a href="#dc:publisher"><span class="tocnumber">3.1.9</span> <span class="toctext">dc:publisher</span></a></li>
                <li class="toclevel-3 tocsection-72"><a href="#dc:relation"><span class="tocnumber">3.1.10</span> <span class="toctext">dc:relation</span></a></li>
                <li class="toclevel-3 tocsection-73"><a href="#dc:rights"><span class="tocnumber">3.1.11</span> <span class="toctext">dc:rights</span></a></li>
                <li class="toclevel-3 tocsection-74"><a href="#dc:subject"><span class="tocnumber">3.1.12</span> <span class="toctext">dc:subject</span></a></li>
                <li class="toclevel-3 tocsection-75"><a href="#dc:title"><span class="tocnumber">3.1.13</span> <span class="toctext">dc:title</span></a></li>
                <li class="toclevel-3 tocsection-76"><a href="#dc:type"><span class="tocnumber">3.1.14</span> <span class="toctext">dc:type</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# About the linked data examples 

To present these examples in a concise form we use the [Turtle syntax for RDF](http://www.w3.org/TeamSubmission/2008/SUBM-turtle-20080114/). The examples therefore appear in code lines such as:

<pre> @prefix ex: &lt;<a href="http://www.example.com/" class="external free" rel="nofollow">http://www.example.com/</a>&gt;.
 ex:aResource ex:aProperty "An RDF Literal" .
</pre>

or

<pre> @prefix ex: &lt;<a href="http://www.example.com/" class="external free" rel="nofollow">http://www.example.com/</a>&gt;.
 ex:aResource ex:aProperty ex:anotherResource . 
 ex:anotherProperty "An RDF Literal"@en .
</pre>

Within the examples we use different namespaces. The following prefixes are used to specify the namespaces we use for our examples:

For the **Dublin Core namespaces** we use:

<pre> @prefix dc: &lt;<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>&gt; (DCMI legacy namespace used for the 15 core properties)
 @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; (DCMI terms namespace of the DCMI terms - properties, classes and datatypes)
 @prefix dctype: &lt;<a href="http://purl.org/dc/dcmitype/" class="external free" rel="nofollow">http://purl.org/dc/dcmitype/</a>&gt; (DCMI type namespace of the DCMI classes of types)
</pre>

**Further namespaces** used are:

<pre> @prefix ex: <a href="http://www.example.org/" class="external free" rel="nofollow">http://www.example.org/</a> (an exemplary namespace)
 @prefix xsd: <a href="http://www.w3.org/2001/XMLSchema#" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#</a> (namespace of the XML Schema language)
 @prefix rdf: <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a> (namespace of the rdf vocabulary)
 @prefix rdfs: <a href="http://www.w3schools.com/RDF/rdf-schema.xml" class="external free" rel="nofollow">http://www.w3schools.com/RDF/rdf-schema.xml</a> (namespace of the rdf schema vocabulary)
 @prefix foaf: <a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a> (namespace of the "Friend of a Friend" vocabulary)
 @prefix gnd: <a href="http://d-nb.info/gnd/" class="external free" rel="nofollow">http://d-nb.info/gnd/</a> (namespace of the authority files of the German National Library)
 @prefix mime: <a href="http://purl.org/NET/mediatypes/" class="external free" rel="nofollow">http://purl.org/NET/mediatypes/</a> (namespace for MIME media types vocabulary)
 @prefix skos: <a href="http://www.w3.org/2004/02/skos/core#" class="external free" rel="nofollow">http://www.w3.org/2004/02/skos/core#</a> (namespace of the SKOS vocabulary)
</pre>
# Properties of the terms namespace 

The main difference between the legacy namespace and the terms namespace is the definition of ranges for most terms of the last and the definition of a domain for some of them. The definition of a domain governs the entities for which a property may be used. The definition of a range governs the usage of literal and non-literal values in context with a property.

## Properties of the terms namespace used only with literal values 

### [dcterms:alternative](http://dublincore.org/documents/dcmi-terms/#terms-alternative) 

The range for dcterms:alternative is rdfs:Literal. So you can use dcterms:alternative only with literal values

<pre>ex:myBook dcterms:title "Passion for Pulses" ;
          dcterms:alternative "A Feast of Beans, Peas and Lentils from Around the World" .
</pre>

<pre>ex:myStuff dcterms:title "American Meteorological Association Newsletter" ;
           dcterms:alternative "AMA Newsletter" .
</pre>

<pre>ex:myDocument dcterms:title "EU Stability Programm of Belgium"@eng ;
              dcterms:alternative "Council Opinion on the Updated 
                                   Stability Programm of Belgium 2009 - 
                                   2010 "@eng ,
                                  "Stellungnahme des Rates zum 
                                   aktualisierten Stabilitätsprogramm 
                                   Belgiens für 2009 - 2012"@ger .
</pre>
### [dcterms:available](http://dublincore.org/documents/dcmi-terms/#terms-available) 

The range defined for dcterms:available is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myMusic dcterms:available "2006-07"^^dcterms:W3CDTF .
</pre>
### [dcterms:bibliographicCitation](http://dublincore.org/documents/dcmi-terms/#terms-bibliographicCitation) 

The range defined for dcterms:bibliographicCitation is the class of rdfs:Literal. Values used with dcterms:bibliographicCitation have to be instances of this class. Therefore this property can only be used with literal values.

Moreover a domain of the class dcterms:BibliographicResource is declard for dcterms:bibliographicCitation. Thus dcterms:bibliographicCitation may only be used describing bibliographic resources.

<pre>ex:myArticle dcterms:title "Prototyping Digital Library Technologies in zetoc" ;
             dcterms:bibliographicCitation "Lecture Notes in Computer Science 2458, 309-323 (2002)" .
</pre>

<pre>ex:myArticle dcterms:title "Prototyping Digital Library Technologies in zetoc" ;
             dcterms:bibliographicCitation "&amp;ctx_ver=Z39.88-2004&amp;rft_val_fmt=info:ofi/fmt:kev:mtx:journal
             &amp;rft.jtitle=Lecture Notes in Computer Science&amp;rft.volume=2458&amp;rft.spage=309"^^info:ofi/fmt:kev:mtx:ctx .
</pre>
### [dcterms:created](http://dublincore.org/documents/dcmi-terms/#terms-created) 

The range defined for dcterms:created is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myPicture dcterms:created "2003-04-10"^^dcterms:W3CDTF .
</pre>

<pre> ex:mySculpture dcterms:created "-500"^^xsd:gYear
</pre>

<pre> ex:myScript dcterms:created "1752"^^dcterms:W3CDTF ,
                             "probably after 1752" .
</pre>

<pre> ex:mySculpture dcterms:created "approx. 500 B.C."
</pre>

<pre>ex:myData dcterms:title "Population estimates in Scandinavia" ;
          dcterms:created "2004-07-19"^^dcterms:W3CDTF ;
          dcterms:source ex:oldData .

ex:oldData dcterms:title "World health report 2002 statistical annex" ;
           dcterms:created "2002-09-28"^^dcterms:W3CDTF .
</pre>
### [dcterms:date](http://dublincore.org/documents/dcmi-terms/#terms-date) 

The range defined for dcterms:date is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myManuscript dcterms:date "1633"^^dcterms:W3CDTF .
</pre>
### [dcterms:dateAccepted](http://dublincore.org/documents/dcmi-terms/#terms-dateAccepted) 

The range defined for dcterms:dateAccepted is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myThesis dcterms:dateAccepted "2010-05-07"^^dcterms:W3CDTF .
</pre>
### [dcterms:dateCopyrighted](http://dublincore.org/documents/dcmi-terms/#terms-dateCopyrighted) 

The range defined for dcterms:dateCopyrighted is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myFoto dcterms:dateCopyrightes "2009-04-03"^^dcterms:W3CDTF .
</pre>
### [dcterms:dateSubmitted](http://dublincore.org/documents/dcmi-terms/#terms-dateSubmitted) 

The range defined for dcterms:dateSubmitted is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myArticle dcterms:dateSubmitted "2011-07-09"^^dcterms:W3CDTF .
</pre>
### [dcterms:identifier](http://dublincore.org/documents/dcmi-terms/#terms-identifier) 

The range defined for dcterms:identifier is the class of rdfs:Literal. Values used with dcterms:identifier have to be instances of this class. Therefore this property can only be used with literal values.

<pre>ex:myWebsite dcterms:title "What's a URI and why does it matter?" ;
             dcterms:identifier "<a href="http://www.ltg.ed.ac.uk/~ht/WhatAreURIs/" class="external free" rel="nofollow">http://www.ltg.ed.ac.uk/~ht/WhatAreURIs/</a>"^^dcterms:URI .
</pre>

<pre>ex:myFile dcterms:title "Small and medium sized companies in Kathmandu" ;
          dcterms:identifier "03KTM147"^^ex:mylocalID .
</pre>

<pre>ex:myVideo dcterms:title "Medieval helpdesk with English subtitles" ;
           dcterms:created "2007"^^dcterms:W3CDTF ;
           dcterms:identifier "<a href="http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded" class="external free" rel="nofollow">http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded</a>"^^dcterms:URI .

ex:myMetadata dcterms:created "2010"^^dcterms:W3CDTF ;
              dcterms:identifier "013234098"^^ex:myDatabaseIdentifier .
</pre>
### [dcterms:issued](http://dublincore.org/documents/dcmi-terms/#terms-issued) 

The range defined for dcterms:issued is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myBook dcterms:issued "2009"^^dcterms:W3CDTF .
</pre>
### [dcterms:modified](http://dublincore.org/documents/dcmi-terms/#terms-modified) 

The range defined for dcterms:modified is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:mySoftware dcterms:modified "2009-12-22"^^dcterms:W3CDTF ,
                                "2010-01-08"^^dcterms:W3CDTF ,
                                "2010-02-15"^^dcterms:W3CDTF .
</pre>
### [dcterms:title](http://dublincore.org/documents/dcmi-terms/#terms-title) 

The range for dcterms:title is rdfs:Literal. So you can use dcterms:title only with literal values.

<pre>ex:myFurniture dcterms:title "Alvar Aalto Chair No. 66" .
</pre>

<pre>ex:mySong dcterms:title "Autumn Leaves",
                        "The Dead Leaves" .
</pre>

<pre>ex:myPainting dcterms:title "La Joconde"@fre ,
                            "Mona Lisa"@eng ,
                            "La Gioconda"@ita .
</pre>

<pre>ex:myData dcterms:title "Data from a survey about the usage of metadata" .
</pre>
### [dcterms:valid](http://dublincore.org/documents/dcmi-terms/#terms-valid) 

The range defined for dcterms:valid is the class of rdfs:Literal. Values used with this property therefore have to be literal values.

<pre> ex:myDraft dcterms:valid "2007-05-06/2007-07-15" .
</pre>
## Properties of the terms namespace used only with non-literal values 

### [dcterms:accrualMethod](http://dublincore.org/documents/dcmi-terms/#terms-accrualMethod) 

The range of dcterms:accrualMethod is the class dcterms:MethodOfAccrual. All values used with dcterms:accrualMethod have to be instances of this class. Therefore the property may only be used with non-literal values.

The domain of dcterms:accrualMethod is the class dcmitype:Collection. So dcterms:accrualMethod may be used only for the description of collections.

<pre>ex:myCollection dcterms:title "Pottery in Scandinavia in the second half of 19th century" ;
                dcterms:accrualMethod [rdfs:label "purchase"] .
</pre>
### [dcterms:accrualPeriodicity](http://dublincore.org/documents/dcmi-terms/#terms-accrualPeriodicity) 

The range of dcterms:accrualMethod is the class dcterms:Frequency. All values used with dcterms:accrualPeriodicity have to be instances of this class. Therefore the property may only be used with non-literal values.

The domain of dcterms:accrualPeriodicity is the class dcmitype:Collection. So dcterms:accrualPolicy may be used only for the description of collections.

<pre>ex:myCollection dcterms:title "Pottery in Scandinavia in the second half of 19th century" ;
                dcterms:accrualPeriodicity [rdfs:label "irregular"] .
</pre>
### [dcterms:accrualPolicy](http://dublincore.org/documents/dcmi-terms/#terms-accrualPolicy) 

The range of dcterms:accrualPolicy is the class dcterms:Policy. All values used with dcterms:accrualPolicy have to be instances of this class. Therefore the property may only be used with non-literal values.

The domain of dcterms:accrualPolicy is the class dcmitype:Collection. So dcterms:accrualPolicy may be used only for the description of collections.

<pre>ex:myCollection dcterms:title "Pottery in Scandinavia in the second half of 19th century" ;
                dcterms:accrualPolicy [ rdfs:label "Objects of this collection have to be 
                                       Scandinavian ceramics from 1940s to 1999s." ] .
</pre>
### [dcterms:accessRights](http://dublincore.org/documents/dcmi-terms/#terms-accessRights) 

The range of dcterms:accessRights is the class dcterms:RightsStatement. Values used with this property have to be instances of the class RightsStatement and therefore non-literal values.

<pre>ex:myDatabase dcterms:title "Data from my last evaluation" ;
              dcterms:accessRights [rdfs:label "My colleagues only"] .
</pre>
### [dcterms:audience](http://dublincore.org/documents/dcmi-terms/#terms-audience) 

dcterms:audience has a range of the class dcterms:AgentClass. Values used with this property therefore have to be non-literal values.

<pre>ex:myTutorial dcterms:title "Advanced physic" ;
              dcterms:audience [rdfs:label "elementary school pupils"] .
</pre>
### [dcterms:conformsTo](http://dublincore.org/documents/dcmi-terms/#terms-conformsTo) 

dcterms:conformsTo has a range of the class dcterms:Standard. Values used with this property therefore have to be non-literal values.

<pre>ex:myData dcterms:conformsTo &lt;<a href="http://www.w3.org/2001/XMLSchema" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema</a>&gt; .
</pre>
### [dcterms:contributor](http://dublincore.org/documents/dcmi-terms/#terms-contributor) 

The range for dcterms:contributor is dcterms:Agent. All values used with this property have to be instances of the class [dcterms:Agent] . **dcterms:contributor must not be used with literal values**.

You may use dcterms:contributor only with non-literal values.

<pre>ex:myMusic dcterms:contributor gnd:135066719 .

gnd:135066719 foaf:familyName "Elliott" ;
              foaf:givenName "Missy" ;
              foaf:nick "Missy E" .
</pre>
### [dcterms:coverage](http://dublincore.org/documents/dcmi-terms/#terms-coverage) 

dcterms:coverage has a range of the class dcterms:LocationPeriodJurisdication. All values used with dcterms:coverage have to be instances of this class. Therefore the property must only be used with non-literal values.

<pre>ex:myYearbook dcterms:title "Demographic Development in Australia" ;
              dcterms:coverage tgn:7000490 .

tgn:7000490 ex:lat "25 00 00 S degrees minutes" ;
            ex:long "135 00 00 E degrees minutes" ;
            ex:name "Australia" .
</pre>
### [dcterms:creator](http://dublincore.org/documents/dcmi-terms/#terms-creator) 

The range for dcterms:creator is dcterms:Agent. All values used with this property have to be instances of the class [dcterms:Agent] . **dcterms:creator must not be used with literal values**. You may use it only with non-literal values.

<pre>ex:myBook dcterms:creator _shakespearesName .

_:shakespearesName foaf:familyName "Shakespeare" ;
                   foaf:givenName "William" .
</pre>
### [dcterms:educationLevel](http://dublincore.org/documents/dcmi-terms/#terms-educationLevel) 

dcterms:educationLevel has a range of the class dcterms:AgentClass. Values used with this property therefore have to be non-literal values.

<pre>ex:myTutorial dcterms:title "Advanced physic" ;
              dcterms:educationLevel [rdfs:label "3rd - 4th grade"] ;
</pre>
### [dcterms:extent](http://dublincore.org/documents/dcmi-terms/#terms-extent) 

The range of dcterms:extent is the class dcterms:SizeOrDuration. All values used with dcterms:extent have to be instances of this class. Therefore the property may only be used with non-literal values.

<pre>ex:myVideo dcterms:extent [rdf:value "21 minutes"] .
</pre>

<pre>ex:myVideo dcterms:extent [rdf:value "PT21M"^^xsd:duration] .
</pre>
### [dcterms:format](http://dublincore.org/documents/dcmi-terms/#terms-format) 

The range of dcterms:format is the class dcterms:MediaTypeOrExtent. All values used with dcterms:format have to be instances of this class. Therefore the property may only be used with non-literal values.

<pre>ex:myPicture dcterms:format mime:jpeg .
</pre>
### [dcterms:hasFormat](http://dublincore.org/documents/dcmi-terms/#terms-hasFormat) 

This property is intended to be used with non-literal values.

<pre> ex:myBook dcterms:creator gnd:118529501 ;
           dcterms:title "Sachsenspiegel, Auffs newe vbersehen mit Summarijs vnd Additionen" ;
           dcterms:date "1563"^^dcterms:W3CDTF ;
           dcterms:hasFormat ex:myScan .
</pre>
### [dcterms:hasPart](http://dublincore.org/documents/dcmi-terms/#terms-hasPart) 

This property is intended to be used with non-literal values.

<pre>&lt;<a href="http://www.rijksmuseum.nl/meesterwerken" class="external free" rel="nofollow">http://www.rijksmuseum.nl/meesterwerken</a>&gt; dcterms:title "The Masterpieces special" ;
                                          dc:contributor "Rijksmuseum Amsterdam" ;
                                          dcterms:hasPart ex:myPainting .
</pre>
### [dcterms:hasVersion](http://dublincore.org/documents/dcmi-terms/#terms-hasVersion) 

This property is intended to be used with non-literal values.

<pre>ex:mySong1 dcterms:identifier "mySong1"
           dcterms:title "Candle in the wind" ;
           dcterms:issued "1973"^^dcterms:W3CDTF;
           dcterms:description "Portayal of the life of Marilyn Monroe" ;
           dcterms:hasVersion ex:mySong2
</pre>
### [dcterms:instructionalMethod](http://dublincore.org/documents/dcmi-terms/#terms-instructionalMethod) 

dcterms:instructionalMethod has a range of the class dcterms:MethodOfInstruction. Values used with this property therefore have to be non-literal values.

<pre>ex:myTutorial dcterms:title "Advanced physic" ;
              dcterms:InstructionalMethod [rdfs:label "experimental learning"] .
</pre>
### [dcterms:isFormatOf](http://dublincore.org/documents/dcmi-terms/#terms-isFormatOf) 

This property is intended to be used with non-literal values.

<pre>ex:myScan dcterms:issued "2009"^^dcterms:W3CDTF ;
          dcterms:isFormatOf [ rdfs:label "Eike von Repgow: Sachsenspiegel, Auffs newe vbersehen mit 
                             Summarijs vnd Additionen ...; Leipzig 1561/1563" ] .
</pre>
### [dcterms:isPartOf](http://dublincore.org/documents/dcmi-terms/#terms-isPartOf) 

This property is intended to be used with non-literal values.

<pre>ex:myPainting dcterms:title "Still Life" ;
              dc:creator "Mignon, Abraham" ;
              dcterms:isPartOf &lt;<a href="http://www.rijksmuseum.nl/meesterwerken" class="external free" rel="nofollow">http://www.rijksmuseum.nl/meesterwerken</a>&gt; .
</pre>
### [dcterms:isReferencedBy](http://dublincore.org/documents/dcmi-terms/#terms-isReferencedBy) 

This property is intended to be used with non-literal values.

<pre>ex:myData dc:creator "Black, Carl" ;
          dc:contributor "White, Stuart" ;
          dcterms:title "Black and White" ;
          dcterms:date "1988"^^dcterms:W3CDTF ;
          dcterms:isReferencedBy ex:myArticle .
</pre>
### [dcterms:isReplacedBy](http://dublincore.org/documents/dcmi-terms/#terms-isReplacedBy) 

This property is intended to be used with non-literal values.

<pre> ex:myBestPractice dcterms:title "How to catch a fish" ;
                   dc:creator "Fishermans Union, Pensicola" ;
                   dcterms:issued "2009"^^dcterms:W3CDTF ;
                   dcterms:isReplacedBy ex:myNewBestPractice .
</pre>
### [dcterms:isRequiredBy](http://dublincore.org/documents/dcmi-terms/#terms-isRequiredBy) 

This property is intended to be used with non-literal values.

<pre> ex:mySoftware dcterms:title "Dia Diagram Editor" ;
               dcterms:isRequiredBy ex:myDiagram .
 
 ex:myDiagram dcterms:title "Libraries Metadata Model" ;
              dcterms:requires ex:mySoftware .
</pre>
### [dcterms:isVersionOf](http://dublincore.org/documents/dcmi-terms/#terms-isVersionOf) 

This property is intended to be used with non-literal values.

<pre>ex:mySong2 dcterms:identifier "mySong2"
           dcterms:title "Candle in the wind" ;
           dcterms:alternative "Goodbye England's Rose" ;
           dcterms:issued "1997"^^dcterms:W3CDTF ;
           dcterms:description "Tribut to the dead princess of Wales" ;
           dcterms:isVersionOf ex:mySong1 .
</pre>
### [dcterms:language](http://dublincore.org/documents/dcmi-terms/#terms-language) 

The range of dcterms:language it the class dcterms:LinguisticSystem. All values used with dcterms:language have to be instances of this class. Therefore the property may only be used with non-literal values.

<pre>ex:myBook dcterms:title "A great deliverance" ;
          dcterms:language [rdf:value "eng"^^dcterms:RFC4646] .
</pre>

or

<pre>ex:myBook dcterms:title "A great deliverance" ;
          dcterms:language &lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt;
</pre>

<pre>ex:myVideo dcterms:title "Charlie Wilson's War" ;
           dcterms:language &lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt; ,
                            &lt;<a href="http://lexvo.org/id/iso639-3/hun" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/hun</a>&gt; ,
                            &lt;<a href="http://lexvo.org/id/iso639-3/tur" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/tur</a>&gt; .
</pre>

<pre>ex:myVideo1 dcterms:title "Medieval helpdesk with English subtitles" ;
            dcterms:identifier "<a href="http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded" class="external free" rel="nofollow">http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded</a>"^^dcterms:URI .
            dcterms:isVersionOf ex:myVideo2 ;
            dcterms:language &lt;<a href="http://lexvo.org/id/iso639-3/nor" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/nor</a>&gt; ,
                             &lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt; .
 
ex:myVideo2 dcterms:title "Book help (better verson)" ;
            dcterms:identifier "<a href="http://www.youtube.com/watch?v=UOorZQLsmuA&amp;feature=related" class="external free" rel="nofollow">http://www.youtube.com/watch?v=UOorZQLsmuA&amp;feature=related</a>"^^dcterms:URI .
            dcterms:hasVersion ex:myVideo1 ;
            dcterms:language &lt;<a href="http://lexvo.org/id/iso639-3/nor" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/nor</a>&gt; .
</pre>

<pre>ex:mySong dcterms:title "The Power of Orange Knickers"
          dcterms:language _:eng

_:eng rdfs:Label "English"
      ex:639-1 "en"
      ex:639-2 "eng"
</pre>
### [dcterms:license](http://dublincore.org/documents/dcmi-terms/#terms-license) 

The range of dcterms:license is the class dcterms:LicenseDocument. Values used with this property have to be instances of the class LicenseDocument and therefore non-literal values.

<pre>ex:mySoftware dcterms:title "GeoNetwork - Geographic Metadata Catalog" ;
              dcterms:license &lt;<a href="http://www.gnu.org/licenses/gpl.html" class="external free" rel="nofollow">http://www.gnu.org/licenses/gpl.html</a>&gt; .

&lt;<a href="http://www.gnu.org/licenses/gpl.html" class="external free" rel="nofollow">http://www.gnu.org/licenses/gpl.html</a>&gt; rdfs:label "GNU General Public License" .
</pre>
### [dcterms:mediator](http://dublincore.org/documents/dcmi-terms/#terms-mediator) 

dcterms:mediator has a range of the class dcterms:AgentClass. Values used with this property therefore have to be non-literal values.

<pre>ex:myTutorial dcterms:title "Advanced physic" ;
              dcterms:mediator [rdfs:label "schoolteacher"] ;
</pre>
### [dcterms:medium](http://dublincore.org/documents/dcmi-terms/#terms-medium) 

The range of dcterms:medium is the class dcterms:PhysicalMedium. All values used with dcterms:medium have to be instances of this class. Therefore the property may only be used with non-literal values.

The domain of dcterms:medium is the class dcterms:PhysicalResource. So dcterms:medium may be used only for the description of physical resources.

<pre>ex:myPainting dcterms:medium _:oilOnWood

_:oilOnWood rdfs:label "oil on wood"
            rdfs:label "oil"
            rdfs:label "wood"
</pre>
### [dcterms:provenance](http://dublincore.org/documents/dcmi-terms/#terms-provenance) 

The range of the provenance property is the class dcterms:ProvenanceStatement. So you may use this property only with non-literal values.

<pre>ex:myResource dcterms:title "Luxor Obelisk"
              dctems:provenance [ rdfs:label "Originally located at the entrance to the Luxor temple the 
                                 obelisk came to Paris in 1836 as a gift by Muhammad Ali Pasha." ] .
</pre>

<pre>ex:myBook dcterms:title "The flea circus" ;
          dcterms:provenance _:thisProvenance

_:thisProvenance ex:ownedBy "1829 - 1833; Jim Button" ,
                            "1833 - 1915; My Library" ,
                            "since 1915; Flea Academy" .
</pre>
### [dcterms:publisher](http://dublincore.org/documents/dcmi-terms/#terms-publisher) 

The range for dcterms:publisher is dcterms:Agent. All values used with this property have to be instances of the class [dcterms:Agent] . **dcterms:publisher must not be used with literal values**. You may use it only with non-literal values.

<pre>ex:myBook dcterms:publisher gnd: 2125990-2 ,
                           _:kniznajaPalata

gnd:2125990-2 foaf:name "Rossijskaja Gosudarstvennaja Biblioteka ;
              foaf:homepage "<a href="http://www.rsl.ru/" class="external free" rel="nofollow">http://www.rsl.ru/</a>" .
              
_:kniznajaPalata foaf:name "Knižnaja Palata"
</pre>
### [dcterms:references](http://dublincore.org/documents/dcmi-terms/#terms-references) 

This property is intended to be used with non-literal values.

<pre>ex:myArticle dcterms:references _:articlesReference .
_:articlesReference dc:creator "Black, Carl" ;
                    dc:contributor "White, Stuart" ;
                    dc:title "Black and White"
                    dc:date "1988"^^dcterms:W3CDTF
</pre>
### [dcterms:relation](http://dublincore.org/documents/dcmi-terms/#terms-relation) 

This property is intended to be used with non-literal values.

<pre> ex:myArticle dcterms:title "Computational Surface and Roundness Metrology" ;
              dc:creator "Muralikrishnan, Balasubramanian" , 
                         "Raja, Jayaraman" ;  
              dcterms:relation &lt;<a href="http://d-nb.info/1008973041" class="external free" rel="nofollow">http://d-nb.info/1008973041</a>&gt; .
</pre>
### [dcterms:replaces](http://dublincore.org/documents/dcmi-terms/#terms-replaces) 

This property is intended to be used with non-literal values.

<pre> ex:myNewBestPractice dcterms:title "How to catch a fish" ;
                      dc:creator "Fishermans Union, Pensicola" ;
                      dcterms:issued "2011"^^dcterms:W3CDTF ;
                      dcterms:replaces ex:myBestPractice .
</pre>
### [dcterms:requires](http://dublincore.org/documents/dcmi-terms/#terms-requires) 

This property is intended to be used with non-literal values.

<pre>ex:myGame dcterms:requires [rdfs:label "audio"] ,
                           [rdfs:label "video"].
</pre>
### [dcterms:rights](http://dublincore.org/documents/dcmi-terms/#terms-rights) 

The range of dcterms:rights is the class dcterms:RightsStatement. Values used with this property have to be instances of the class RightsStatement and therefore non-literal values.

<pre> ex:myPicture dcterms:title "You and me" ;
              dcterms:rights &lt;<a href="http://creativecommons.org/licenses/by/3.0/legalcode" class="external free" rel="nofollow">http://creativecommons.org/licenses/by/3.0/legalcode</a>&gt; .
</pre>

<pre>ex:myDocuments dcterms:title "Diaries of Juanita Ramirez"
               dcterms:rights _:accessConditions

_:accessConditions dcterms:title "Access to my stuff"
                   dcterms:description "Resources under this right can only be read, searched and 
                   used by members of the myProject" .
</pre>
### [dcterms:rightsHolder](http://dublincore.org/documents/dcmi-terms/#terms-rightsHolder) 

The range for dcterms:rightsHolder is dcterms:Agent. All values used with this property have to be instances of the class [dcterms:Agent] . **dcterms:rightsHolder must not be used with literal values**. You may use it only with non-literal values.

<pre>ex:myFilm dcterms:rightsHolder gnd:39454-3 .

gnd:39454-3 foaf:name "Bundesarchiv Koblenz" ;
            foaf:homepage "<a href="http://www.bundesarchiv.de/index.html.de" class="external free" rel="nofollow">http://www.bundesarchiv.de/index.html.de</a>" .
</pre>
### [dcterms:source](http://dublincore.org/documents/dcmi-terms/#terms-source) 

This property is intended to be used with non-literal values.

<pre>ex:myData dcterms:title "Australian Birth Rates 2000 - 2010" ;
          dcterms:source [rdfs:label "Yearbooks of Demographic Development in Australia"] .
</pre>
### [dcterms:spatial](http://dublincore.org/documents/dcmi-terms/#terms-spatial) 

dcterms:spatial has a range of the class dcterms:Location. All values used with dcterms:spatial have to be instances of this class. Therefore the property must only be used with non-literal values.

<pre>ex:myData dcterms:title "Analysis of rocks collected in Perth" ;
          dcterms:spatial _:thisPlace .

_:thisPlace ex:east "115.85717" ;
            ex:north "-31.95301" ;
            ex:name "Perth, W. A." .
</pre>

<pre>ex:myData dcterms:title "The growth of trees in the suptropical highlands" ;
          dcterms:spatial _:Cwb .

_:Cwb rdfs:label "Cwb"
      dc:source "Köppen-Geiger Climate Classification" ;
      ex:mainClimates "warm temperate" ;
      ex:precipitation "winter dry" ;
      ex:temperature "warmest month averaging below 22°C" .
</pre>
### [dcterms:subject](http://dublincore.org/documents/dcmi-terms/#terms-subject) 

This property is intended to be used with non-literal values.

<pre>ex:myBook dcterms:title "Inviato alla Biennale : Venezia, 1949 - 2009" ;
          dcterms:subject &lt;<a href="http://www.labiennale.org/en/Home.html" class="external free" rel="nofollow">http://www.labiennale.org/en/Home.html</a>&gt; .

&lt;<a href="http://www.labiennale.org/en/Home.html" class="external free" rel="nofollow">http://www.labiennale.org/en/Home.html</a>&gt; dcterms:title "La Biennale di Venezia"
</pre>

<pre>ex:myVideo dcterms:title "My Winter Wonderland" ;
           dcterms:subject &lt;<a href="http://id.loc.gov/authorities/sh88004323#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh88004323#concept</a>&gt; .

&lt;<a href="http://id.loc.gov/authorities/sh88004323#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh88004323#concept</a>&gt; rdfs:label "Cross-country skiing--Skating" .
</pre>

<pre>ex:myData dcterms:title: "Transports in Kazakhstan 2000 - 2010"
          dcterms:subject ex:W03_7 ,
          dcterms:subject ex:G06_3
                                         
ex:W03_7 rdf:type skos:Concept ;
         prefLabel "W03.7" ;
         skos:altLabel "Freight Transport" ;
         skos:broader ex:W03 ;
         skos:narrower ex:W03_72 ,
                       ex:W03_75 .

ex:G06_3 rdf:type skos:Concept ; 
         prefLabel "G06_3 ;
         skos:altLabel "Kazakhstan" ;
         skos:broader ex:G06 ;
         skos:narrower ex:G06_31 ,
                       ex:G06_35 .
</pre>

<pre>ex:myLaw dcterms:title "KONSTYTUCJA RZECZYPOSPOLITEJ POLSKIEJ"
         dcterms:subject _:polska

_:polska rdfs:label "Rzeczpospolita Polska"@pol ,
                     "Republic of Poland"@eng .
</pre>

<pre>ex:mySong dcterms:title "Candle in the wind" ;
          dcterms:subject gnd:118583549 .
gnd:118583549 foaf:_familyName "Monroe" ;
              foaf:_givenName "Marilyn" ;
              &lt;<a href="http://rdvocab.info/ElementsGr2/dateOfBirth" class="external free" rel="nofollow">http://rdvocab.info/ElementsGr2/dateOfBirth</a>&gt; "1926"^^dcterms:W3CDTF ;
              &lt;<a href="http://rdvocab.info/ElementsGr2/dateOfDeath" class="external free" rel="nofollow">http://rdvocab.info/ElementsGr2/dateOfDeath</a>&gt; "1962"^^dcterms:W3CDTF .
</pre>
### [dcterms:temporal](http://dublincore.org/documents/dcmi-terms/#terms-temporal) 

dcterms:temporal has a range of the class dcterms:PeriodOfTime. All values used with dcterms:temporal have to be instances of this class. Therefore the property must only be used with non-literal values.

<pre>ex:myData dcterms:title "Transports in Kazakhstan 2000 - 2010"
          dcterms:temporal _:thisPeriod .

_:thisPeriod ex:start "2000"^^dcterms:W3CDTF ;
             ex:end "2010"^^dcterms:W3cDTF .
</pre>

<pre>ex:myData dcterms:title "Analysis of rocks collected in Perth" ;
          dcterms:temporal _:thisPeriod .

_:thisPeriod ex:start "Cambrian period" ;
             ex:scheme "Geological timescale" ;
             ex:name "Phanerozoic Eon" .
</pre>
### [dcterms:type](http://dublincore.org/documents/dcmi-terms/#terms-type) 

The range of dcterms:type is rdfs:Class. Values used with dcterms:type may only be non-literal values.

<pre>ex:myPainting dcterms:type dctype:StillImage .

dctype:StillImage rdfs:label "Still Image" .
</pre>

<pre>ex:myStuff dcterms:type dctype:InteractiveResource , 
                        dctype:Text .

dctype:InteractiveResource rdfs:label "Interactive Resource" .

dctype:Text rdfs:label "Text" .
</pre>

<pre>ex:myStuff dcterms:type _:PCGameType ,
                        dctype:Software .

_:PCGameType rdfs:label "PC Game" .

dctype:Software rdfs:label "Software" .
</pre>

<pre>ex:myEvent dcterms:type _:conference .

_:conference rdfs:label "Conference"@eng ,
                        "Konferenz"@ger ,
                        "съезд"@rus .
</pre>
## Properties of the terms namespace, that may be used with literal and non-literal values 

### [dcterms:abstract](http://dublincore.org/documents/dcmi-terms/#terms-abstract) 

There is no range defined for dcterms:abstract. Therefore you can use it with literal values

<pre>ex:myBook dcterms:title "The Foundations of Programm Verification" ;
          dcterms:abstract "This revised edition provides a precise mathematical background to 
                           several program verification techniques. It concentrates on those 
                           verification methods that have now become classic, such as the 
                           inductive assertions method of Floyd, the axiomatic method of Hoare, 
                           and Scott's fixpoint induction. The aim of the book is to present these 
                           different verification methods in a simple setting and to explain their 
                           mathematical background. In particular the problems of correctness and 
                           completeness of the different methods are discussed in some detail and 
                           many helpful examples are included." .
</pre>

<pre>ex:myBook dcterms:title "Delvig and Kjuchelbeker"
          dcterms:abstract "The book is a collection of works of two poets - contemporaries 
                           and friends of Pushkin - A. A. Delvig and V. K. Kjuchelbeker. It 
                           includes poems and prosa by Kjuchelbeker, parts of his diary, the 
                           poem Jurij and Xenia and reviews by Delvig. The attachment presents 
                           some retrospections to Delvig and Kjuchelbeker. A detailed biographic 
                           description tells us something about the life of the poets"@eng ,
                           "Сборник впервые обединяет произведения двух поетов - современиков 
                           и друзей Пушкина - А. А. Дельвига и В. К. Кюхельбекера. Наряду со 
                           стихотворениями в книгу вклучены проза Кюхельбекера, фрагменты из его 
                           дневника, поема Юрий и Ксения, а также рецензии Дельвига. В Приложении 
                           печатаются воспоминания о Дельвиге и Кюхельбекерею. Подробные 
                           биографические очерки рассказывают о жизненном пути поэтов."@rus
</pre>

and with non-literal values.

<pre> ex:myBook dcterms:title "Computational Surface and Roundness Metrology" ;
           dcterms:abstract &lt;<a href="http://www.springerlink.com/content/M7V5444582756209/primary" class="external free" rel="nofollow">http://www.springerlink.com/content/M7V5444582756209/primary</a>&gt; .
</pre>
### [dcterms:description](http://dublincore.org/documents/dcmi-terms/#terms-description) 

There is no range defined for dcterms:description. Therefore you can use it with literal values

<pre>ex:myObjects dcterms:title "Bugs from New Zealand" ;
             dcterms:description "A box of ten bugs collected in New Zealand between 1845 and 1846" .
</pre>

and with non-literal values.

<pre>ex:myMusic dcterms:title "Thriller" ;
           dcterms:description &lt;<a href="http://en.wikipedia.org/wiki/Thriller_(album)" class="external free" rel="nofollow">http://en.wikipedia.org/wiki/Thriller_(album)</a>&gt; .
</pre>
### [dcterms:tableOfContents](http://dublincore.org/documents/dcmi-terms/#terms-tableOfContents) 

There is no range defined for dcterms:tableOfContents. Therefore you can use it with literal values.

<pre>ex:myFile dcterms:title "Remains of Claire Klawitter" ;
          dcterms:tableOfContents "Diary 1822 - 1824 -- 20 pictures of Indian farmers 
          -- 5 letters to Rudi Ratlos -- 1 map of North India" .
</pre>

and with non-literal values

<pre> ex:myJournal dcterms:title "Cäcilia ; eine Zeitschrift für die musikalische Welt" ;
              dcterms:tableOfContents &lt;<a href="http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000003.jpg" class="external free" rel="nofollow">http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000003.jpg</a>&gt; ,
                                      &lt;<a href="http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000004.jpg" class="external free" rel="nofollow">http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000004.jpg</a>&gt; ,
                                      &lt;<a href="http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000005.jpg" class="external free" rel="nofollow">http://www.digizeitschriften.de/content/PPN472885294_0020/800/0/00000005.jpg</a>&gt; .
</pre>
# Legacy namespace 

For properties of the legacy namespace neither domain nor range is defined. So all properties of the legacy namespace can be used either with literal values or with non-literal values.

## Properties of the legacy namespace 

### [dc:contributor](http://dublincore.org/documents/dcmi-terms/#elements-contributor) 

You may use dc:contributor with literal values

<pre>ex:myMusic dc:contributor "Snoop Dogg" .
</pre>

and with non-literal values.

<pre>ex:myMusic dc:contributor gnd:135066719 .

gnd:135066719 foaf:familyName "Elliott" ;
              foaf:givenName "Missy" ;
              foaf:nick "Missy E" .
</pre>
### [dc:coverage](http://dublincore.org/documents/dcmi-terms/#elements-coverage) 

You may use dc:coverage with literal values

<pre>ex:myData dc:title "Transports in Kazakhstan 2000 - 2010"
          dc:coverage "2000 - 2010" ,
                      "Kazakhstan" .
</pre>

<pre>ex:myData dc:title "Analysis of rocks collected in Perth" ;
          dc:coverage "Perth, W. A." .
</pre>

and with non-literal values.

<pre> ex:myYearbook dc:title "Demographic Development in Australia" ;
               dc:coverage tgn:7000490 .
 
 tgn:7000490 ex:lat "25 00 00 S degrees minutes" ;
             ex:long "135 00 00 E degrees minutes" ;
             ex:name "Australia" .
</pre>
### [dc:creator](http://dublincore.org/documents/dcmi-terms/#elements-creator) 

You may use dc:creator with literal values

<pre>ex:myBook dc:creator "Shakespeare, William" .
</pre>

and with non-literal values.

<pre> ex:myBook dc:creator _shakespearesName .
 
 _:shakespearesName foaf:familyName "Shakespeare" ;
                    foaf:givenName "William" .
</pre>
### [dc:date](http://dublincore.org/documents/dcmi-terms/#elements-date) 

You may use dc:date with literal values

<pre> ex:myManuscript dc:date "1633"^^dcterms:W3CDTF .
</pre>

and with non-literal values.

<pre>ex:myDraft dc:date _:thisValidity .

_:thisValidity ex:start "2007-05-06"^^dcterms:W3CDTF ;
               ex:end "2007-07-15"^^dcterms:W3CDTF .
</pre>

<pre> ex:mySculpture dc:date _:mySculptureDate .
 _mySculptureDate ex:year "500" ;
                  ex:qualifer "approx." ;
                  ex:epoch "B.C." .
</pre>
### [dc:description](http://dublincore.org/documents/dcmi-terms/#elements-description) 

You may use dc:description with literal values,

<pre>ex:myHerbs dc:title "Coriandrum sativum" ;
           dc:description "Coriandrum sativum or Coriander is a herb used in Europe, North Africa 
           and Asia. It belongs to the familiy of Apiaceae and ist growing to 20 inch." .
</pre>

and with non-literal values.

<pre>ex:myHerbs dc:title "Coriandrum sativum" ;
           dc:description &lt;<a href="http://en.wikipedia.org/wiki/Coriander" class="external free" rel="nofollow">http://en.wikipedia.org/wiki/Coriander</a>&gt; .

&lt;<a href="http://en.wikipedia.org/wiki/Coriander" class="external free" rel="nofollow">http://en.wikipedia.org/wiki/Coriander</a>&gt; dc:title "Coriander" ;
                                         dc:contributor "Wikipedia" .
</pre>
### [dc:format](http://dublincore.org/documents/dcmi-terms/#elements-format) 

You may use dc:format with literal values

<pre>ex:myPicture dc:format "40 x 512 pixels" .
</pre>

and with non-literal values.

<pre> ex:myPicture dc:format mime:jpeg .
</pre>
### [dc:identifier](http://dublincore.org/documents/dcmi-terms/#elements-identifier) 

You may use dc:identifier with literal values

<pre> ex:myVideo dc:title "My first article about metadata"
            dc:identifier "My Favorite Journal 3 (2), 14-25 (2010)" .
</pre>

and with non-literal values

<pre>ex:myVideo dc:title "My first article about metadata"
           dc:identifier _:myCitation .

_:myCitation ex:jtitle "My Favorite Journal"
             ex:volume "3"
             ex:issue "2"
             ex:spage "14"
             ex:date "2010" .
</pre>
### [dc:language](http://dublincore.org/documents/dcmi-terms/#elements-language) 

You may use dc:language with literal values

<pre>ex:mySong dc:title "The Power of Orange Knickers"
          dc:language "English"
</pre><pre>ex:mySong dc:title "The Power of Orange Knickers"
          dc:language "eng"^^dcterms:RFC4646 .
</pre>

and with non-literal values.

<pre> ex:myBook dc:title "A great deliverance" ;
           dc:language &lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt; .
</pre>
### [dc:publisher](http://dublincore.org/documents/dcmi-terms/#elements-publisher) 

You may use dc:publisher with literal values

<pre>ex:myData dc:creator "Hubble Telescope";
           dc:publisher "University of Nowhere" ,
                        "All Your Data Inc. .
</pre>

and with non-literal values.

<pre> ex:myBook dc:publisher gnd: 2125990-2 ,
                             _:kniznajaPalata
 
 gnd:2125990-2 foaf:name "Rossijskaja Gosudarstvennaja Biblioteka ;
               foaf:homepage "<a href="http://www.rsl.ru/" class="external free" rel="nofollow">http://www.rsl.ru/</a>" .
               
 _:kniznajaPalata foaf:name "Knižnaja Palata"
</pre>
### [dc:relation](http://dublincore.org/documents/dcmi-terms/#elements-relation) 

You may use dc:relation with literal values

<pre> ex:myArticle dc:title "Introduction to Fitting Substitute Geometry" ;
              dc:relation "Muralikrishnan, Balasubramanian and Raja, Jayaraman: Computational Surface and Roundness 
                          Metrology III, 2009" . 
</pre>

and with non-literal values

<pre> ex:myBook dc:title "Computational Surface and Roundness Metrology" ;
           dc:creator "Muralikrishnan, Balasubramanian" , 
                      "Raja, Jayaraman" ;  
           dc:relation &lt;<a href="http://d-nb.info/1008973041" class="external free" rel="nofollow">http://d-nb.info/1008973041</a>&gt; .
</pre>
### [dc:rights](http://dublincore.org/documents/dcmi-terms/#elements-rights) 

You may use dc:rights with literal values

<pre>ex:myVideo dc:rights "May be used only by members of the myProject" .
</pre><pre>ex:myBook dc:title "News from the South" ;
          dc:rights "<a href="http://creativecommons.org/licenses/by-nd/3.0/legalcode" class="external free" rel="nofollow">http://creativecommons.org/licenses/by-nd/3.0/legalcode</a>"^^dcterms:URI .
          dc:rights "Attribution-NoDerivs 3.0 Unported" .
</pre>

and with non-literal values.

<pre> ex:myPicture dc:title "You and me" ;
              dc:rights &lt;<a href="http://creativecommons.org/licenses/by/3.0/legalcode" class="external free" rel="nofollow">http://creativecommons.org/licenses/by/3.0/legalcode</a>&gt; .
</pre>
### [dc:subject](http://dublincore.org/documents/dcmi-terms/#elements-subject) 

There is no range defined for dc:subject. Therefore you can use it with literal values

<pre>ex:myManual dc:title "How to get an aircraft"
            dc:subject "aircraft" ;
                       "leasing" .
</pre>

and with non-literal values.

<pre> ex:myVideo dc:title "My Winter Wonderland" ;
            dc:subject &lt;<a href="http://id.loc.gov/authorities/sh88004323#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh88004323#concept</a>&gt; .
 
 &lt;<a href="http://id.loc.gov/authorities/sh88004323#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh88004323#concept</a>&gt; rdfs:label "Cross-country skiing--Skating" .
</pre>
### [dc:title](http://dublincore.org/documents/dcmi-terms/#elements-title) 

It is recommended to use for titles literal values. But there are important **uses with non-literal values** as well. To do so you have to use dc:title, because dc:title may be used with literal values

<pre> ex:myPainting dc:title "La Joconde"@fre ,
                        "Mona Lisa"@eng ,
                        "La Gioconda"@ita .
</pre>

and with non-literal values.

<pre>ex:myBook dc:title _:thisTitle .

_:thisTitle ex:greekAlphabet "Οιδίπους Τύραννος" ;
            ex:latinAlphabet "Oidipous Tyrannos" .
</pre>

<pre>ex:myScript1 dcterms:title "Nibelungenlied Handschrift B" ;
             dc:title _:nibelungenlied .
             
ex:myScript2 dcterms:title "Nibelungenlied Handschrift C" ;
             dc:title _:nibelungenlied

_:nibelungenlied skos:prefLabel "Der Nibelunge Not" ;
                 skos:altLabel "Nibelungenlied" ,
                               "Nibelungenklage" ,
                               "Nibelungensage" ;
                 dcterms:description "The Nibelungenlied exists of 39 aventiuren created between 1180 and 1210" .
</pre>
### [dc:type](http://dublincore.org/documents/dcmi-terms/#elements-type) 

You may use dc:type with literal values

<pre>ex:myEvent dc:type "Conference" .
</pre>

and with non-literal values.

<pre> ex:myEvent dcterms:type _:conference .
 
 _:conference rdfs:label "Conference"@eng ,
                         "Konferenz"@ger ,
                         "съезд"@rus .
</pre>

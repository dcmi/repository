---
title: BibframeAnalysis
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RDF_Application_Profiles/BibframeAnalysis.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 3 April 2015, at 11:58.  
This page has been accessed 13,640 times.

A short evaluation of Bibframe against selected requirements:

_Simple cardinality_ is covered by BIBFRAME:

<pre>
"propertyTemplate": [
         { ... },
         {
              "propertyURI": "http://bibframe.org/vocab/titleStatement",
              "propertyLabel": "Title",
              "mandatory": "true",
              "repeatable": "true",
              "type": "literal"
         },
         { ... }
      ]
</pre>

_Allowed values_ are not covered by BIBFRAME. They may be introduced for valueConstraints as follows:

<pre>
"propertyTemplates": [
         { ... },
         {
              "propertyURI": "http://bibframe.org/vocab/subject",
              "propertyLabel": "Subject",
              "type": "resource",
              "valueConstraint": {
                   "allowedValues": ["value 1","value 2","value 3"]
              }
         },
         { ... }
     ]
</pre>

_Valid datatypes_ may be covered by BIBFRAME as this is an implementation issue. One can state constraints on datatypes for literals in BIBFRAME:

<pre>
"propertyTemplates": [
         { ... },
         {
              "propertyURI": "http://bibframe.org/vocab/vra/beginDate",
              "propertyLabel": "Begin Date",
              "type": "literal",
              "valueConstraint": {
                   "valueDataType": {
                       "dataTypeURI": "http://bibframe.org/vocab/proposed/ISO8601",
                       "dataTypeLabel": "ISO 8601",
                       "dataTypeLabelHint": "ISO"
                   }
              }
         },
         { ... }
      ]
</pre>

What is needed here is to implement to check for each datatype if the literal is valid. Regular expressions may be used here in the background when SPARQL is used for the actual implementation.

_Property/class grouping_ (e.g. propertyX is used for classY) is covered by BIBFRAME, as property templates are referenced within resource templates:

<pre>
"resourceTemplate": [
    {
       "id": "bfp:Work:Book",
       "resourceLabel": "Book",
       "resourceURI": "http://bibframe.org/vocab/Text",
       "propertyTemplates": [
             { ... }
       ]
    }
</pre>

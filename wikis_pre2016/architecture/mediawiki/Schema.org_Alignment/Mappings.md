---
title: Mappings
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/Mappings.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 January 2012, at 05:11.  
This page has been accessed 140,431 times.

Raw mapping draft from DC2011 "unconference". -- [BernardVatant](/mediawiki_wiki/User:BernardVatant) 16:40, 7 October 2011 (KST)

This mapping draft has now been superseded by a [draft in Github](https://github.com/dcmi/schema.org/blob/master/mappings_schema.org.xml). -- [TomBaker](/mediawiki_wiki/User:TomBaker), 12 January 2012

## Used Prefixes

@prefix owl: < [http://www.w3.org/2002/07/owl#](http://www.w3.org/2002/07/owl#)>

@prefix rdfs: < [http://www.w3.org/2000/01/rdf-schema#](http://www.w3.org/2000/01/rdf-schema#)>

@prefix schema: < [http://schema.org/](http://schema.org/)>

@prefix dct: < [http://purl.org/dc/terms/](http://purl.org/dc/terms/)>

@prefix dc: < [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)>

@prefix dctype: < [http://purl.org/dc/dcmitype/](http://purl.org/dc/dcmitype/)>

## Classes 

schema:Organization rdfs:subClassOf dct:Agent

schema:Person rdfs:subClassOf dct:Agent

schema:Place owl:equivalentClass dct:Location

schema:Event owl:equivalentClass dctype:Event

schema:Language rdfs:subClassOf dct:LinguisticSystem

dct:BibliographicResource rdfs:subClassOf schema:CreativeWork

## Properties 

dct:title rdfs:subPropertyOf schema:name

schema:description owl:equivalentProperty dct:description

schema:caption rdfs:subPropertyOf dct:description

schema:author rdfs:subPropertyOf dct:creator

schema:about owl:equivalentProperty dct:subject

schema:publisher owl:equivalentProperty dct:publisher

schema:datePublished owl:equivalentProperty dct:issued

schema:inLanguage owl:equivalentProperty dc:language

schema:encodings rdfs:subPropertyOf dct:format

schema:duration rdfs:subPropertyOf dct:extent

schema:keywords rdfs:subPropertyOf dc:subject

schema:url rdfs:subPropertyOf dct:identifier

schema:contentLocation rdfs:subPropertyOf dct:coverage

schema:subEvents rdfs:subPropertyOf dct:hasPart

schema:superEvent rdfs:subPropertyOf dct:isPartOf

schema:contributor rdfs:subPropertyOf dct:contributor

schema:illustrator rdfs:subPropertyOf dct:contributor

schema:actors rdfs:subPropertyOf dct:contributor

schema:director rdfs:subPropertyOf dct:contributor

schema:musicBy rdfs:subPropertyOf dct:contributor

schema:producer rdfs:subPropertyOf dct:creator

schema:productionCompany rdfs:subPropertyOf dct:creator

schema:productId rdfs:subPropertyOf dct:identifier

schema:commentTime rdfs:subPropertyOf dct:date

schema:birthDate rdfs:subPropertyOf dct:date

schema:dateModified rdfs:subPropertyOf dct:modified

schema:mentions rdfs:subPropertyOf dct:related


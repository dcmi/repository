---
title: Drupal Linked Data
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Drupal_Linked_Data.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 21 April 2012, at 19:58.  
This page has been accessed 25,470 times.

## Linked Data Vocabularies and Drupal 

Proposal for a two-hour DC-2012 session (5-7 September 2012)

A number of the organizations likely to be represented at the DC-2012 use a Drupal platform (e.g., FAO and VIVO) or are planning such a migration (ZBW Labs and [DCMI](http://dublintodrupal.org/)). This special session would explore the relationship between Drupal and Linked Open Data (LOD) vocabularies - specifically, how Drupal systems can ingest and use LOD vocabularies and publish data using LOD vocabularies:

- Ingesting and displaying Linked Open Data from SPARQL endpoints using Drupal extensions such as views, sparql\_views, and rdfx (e.g., see [video by Lin Clark](http://lin-clark.com/blog/turning-cias-data-pretty-pictures-your-site-using-views).
- [Web Taxonomy](http://drupal.org/project/web_taxonomy), a Drupal module for integrating excerpts of terminologies from the LOD cloud as taxonomies for referencing in Drupal RDFa. It has been suggested that Agrovoc, with its large set of supported languages, might use the Web Taxonomy module to index in one language, then automagically update and display labels in all supported languages.
- [Economics Taxonomies](http://drupal.org/sandbox/jneubert/1447918), a Drupal plugin under development by ZBW Labs, which leverages JSON responses from external autosuggest Web services and SPARQL endpoints.
- [Neologism](http://drupal.org/project/neologism), a Drupal module from DERI, which pushes vocabularies into the LOD cloud.
- [AgrovocField](http://drupal.org/project/agrovocfield), a Drupal module that connects to the Agrovoc web services built on the [(Agrovoc VocBench](http://code.google.com/p/agrovoc-cs-workbench/wiki/VocBench) and provides a user-friendly widget with an autocomplete box. Valeria writes: In future, will support automatically [tagging a node field](http://aims.fao.org/community/agridrupal/pages/drupal-agrovoc-field-module-index-nodes-agrovoc) (textarea, file attachment or web URL) using the Agrotagger web services based on Agrovoc. The nice feature of this module is that it exploits the multilingual features of Agrovoc: users can select terms in their language when indexing, but the URIs are stored, together with the labels in all the languages enabled in the website. And when creating an XML / RDF view, the URIs can be exposed. Another nice feature is that it allows to temporarily use a local version of Agrovoc in case of bad connectivity or off-line use.
- [Autotagging](http://drupal.org/project/autotagging) and [Textmining\_API](http://drupal.org/project/textmining_api), early-beta Drupal modules that support using 3rd party services for automatic indexing and are designed to be extensible by plugging in other services.
- [Schemaorg](http://drupal.org/project/schemaorg), a Drupal 7 module.
- [schemaorg\_kickstarter](http://drupal.org/project/schemaorg_kickstarter), a Drupal 7 distribution that already includes content types with typical mappings to schema.org classes and properties.
- A generic SKOS browser module under development by AIMS, starting with a version for browsing Agrovoc, which is intended to provide an additional widget to the AgrovocField module: in addition to the auto-complete widget and the automatic indexing widget, an advanced search/browse widget exploiting relationships between concepts.

The session would begin with lightning talks about projects that use or are implementing any of the approaches above. These presentations would lead into "unconference"-style brainstorming to identify opportunities for sharing expertise, pooling efforts, or defining joint goals.


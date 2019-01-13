---
title: EDM
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/EDM.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 September 2014, at 06:40.  
This page has been accessed 40,453 times.

Machine readable validation specs for EDM. The EDM Schemas are at at [http://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu](http://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu)

We currently have two profiles, one for the data that is submitted by providers (external) and one that specifies the schema used internally after the data has been ingested and processed.

- EDM-EXTERNAL-MAIN.xsd at [https://github.com/europeana/corelib/blob/master/corelib-solr-definitions/src/main/resources/eu/EDM-EXTERNAL-MAIN.xsd](https://github.com/europeana/corelib/blob/master/corelib-solr-definitions/src/main/resources/eu/EDM-EXTERNAL-MAIN.xsd)

- EDM-INTERNAL-MAIN.xsd at [https://github.com/europeana/corelib/blob/master/corelib-solr-definitions/src/main/resources/eu/EDM-INTERNAL-MAIN.xsd](https://github.com/europeana/corelib/blob/master/corelib-solr-definitions/src/main/resources/eu/EDM-INTERNAL-MAIN.xsd)

Note that the data that complies with these XML schemas is actually valid RDF/XML, so that it can be loaded in a triple store for playing with it outside of the production environment.

- an OWL ontology [https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu/rdf](https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu/rdf)

In our production service only the XML schemas area used. The problem is that they do not capture all the constraints that we have in the human readable Guidelines, for example, mandatory properties. See [http://pro.europeana.eu/edm-documentation](http://pro.europeana.eu/edm-documentation).

There are two presentations that try to convey some of the issues we face at:

[http://www.slideshare.net/antoineisaac/europeana-rdf-validation](http://www.slideshare.net/antoineisaac/europeana-rdf-validation) and [http://www.slideshare.net/antoineisaac/validation-of-europeana-dataapplication-profile-owl-ontology-or-else](http://www.slideshare.net/antoineisaac/validation-of-europeana-dataapplication-profile-owl-ontology-or-else)

**Summary of current validation.**

**1. EDM schemas**

**a. EDM external schema** A first validation can be performed against the XML Schema for the Europeana Data Model. The schema declares the classes and properties as described in the EDM guidelines. Some classes and properties such as edm:Event are not yet implemented so not included in the schema. Data using such classes and properties can’t be validated using the schema. Not all the EDM constraints can be expressed in the Schema. To define more validation rules, the schema has been extended with rules following the Schematron2 approach. EDM external schema available at [https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu](https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu)

**b. EDM internal schema** This schema is meant for validation inside the Europeana ingestion workflow where data is reorganised to add proxies to distinguish provider data from Europeana data and certain properties are added to support the portal or the API. It is not meant to be used by data providers. The EDM internal schema is available at [https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu](https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu)

**c. The API output** There is a large body of legacy data in the Europeana database from the previous metadata format used (ESE). This does not conform to EDM because of missing mandatory fields so the generation of RDF/XML and JSON/LD for these records fails. The solution is to have a uniform way to generate RDF/XML and JSON/LD so there needs to be a third version of EDM that will not validate against any rules of EDM (schematron, This will enable the generation of these formats, for as long as we have obsolete data that do not conform to EDM-Internal in our repository. It will be dropped when this is not longer the case and initial plans state that this should be by the end of the year (2014).

**2. EDM validation for ingestion (external)**

**a. Schema-level validation**

_i. Check file validity_

-The validation with the XML schema requires that the classes and the properties follow a certain order (as defined in the schema)

-Check the syntax of classes and properties names e.g. edm:isRelated when it should be edm:isRelatedTo

_ii. check on cardinality constraints and occurrences_

- check for the presence of the mandatory EDM elements (most of which are inherited from ESE) shown in the table below. The xml schema checks for the mandatory properties and the Schematron rules check those that have alternatives.

Applicable class Mandatory Properties (or alternatives) Aggregation edm:dataProvider Aggregation edm:isShownAt or edm:isShownBy Aggregation edm:provider Aggregation edm:rights Aggregation edm:aggregatedCHO Aggregation edm:ugc (when applicable) ProvidedCHO dc:title or dc:description ProvidedCHO dc:language for text objects ProvidedCHO dc:subject or dc:type or dc:coverage or dcterms:spatial ProvidedCHO edm:type

_iii Check on Value types_

Some EDM properties are defined to accept literals or references, for example, dcterms:isPartOf or edm:isRelatedTo.

There is no hard consequence the value is coded as a literal: <dcterms:isPartOf> [http://arachne.uni-koeln.de/entity/1241241](http://arachne.uni-koeln.de/entity/1241241)</dcterms:isPartOf> instead of as a reference <dcterms:isPartOf rdf:resource=" [http://arachne.uni-koeln.de/entity/1241241](http://arachne.uni-koeln.de/entity/1241241)"/>.

However other EDM properties only accept references, for example, edm:IsRepresentationOf, edm:IsNextInSequence, meaning .

<edm:isRepresentationOf> [http://arachne.uni-koeln.de/entity/1241241](http://arachne.uni-koeln.de/entity/1241241)</edm:isRepresentationOf>

is incorrect coding and it should be

<edm:isRepresentationOf rdf:resource=" [http://arachne.uni-koeln.de/entity/1241241](http://arachne.uni-koeln.de/entity/1241241)"/>

**Future validation** Data providers in the Europeana network are now re-using EDM for their own applications and are developing EDM extensions or EDM application profile (see case study CS-6 ). Data providers will provide their data to Europeana using those profiles which won't be validated as the EDM schema for data ingestion doesn't define these extensions. There is two cases to take into account: - Europeana might not want to ingest the data as describe in the EDM extensions (for the portal) but would still need to be able to validate the data. - Europeana might want to ingest the extensions for domain specific portal or applications.

Europeana would therefore need for validation: - a schema for the the validation of properties and classes used in the main portal - schemas for the validation of properties and classes used only in the extensions


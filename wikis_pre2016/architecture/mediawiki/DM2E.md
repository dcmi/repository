---
title: DM2E
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DM2E.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 10 July 2014, at 12:59.  
This page has been accessed 38,812 times.

**Case study: Overview**

The DM2E model is a specialisation of the [EDM](/mediawiki_wiki/EDM.md) for the manuscript domain. It is used for mappings to Europeana and for publishing delivered metadata as LOD via the DM2E LOD API in the scope of the Digitised manuscripts to Europeana (DM2E) project. Before creating the fixed version of DM2E model that is used by data providers for their mappings, several modelling decisions had to be made including the method of reusing external resources, decisions on the granularity of the specialisation and instruments of documentation. The first step in the model creation was to analyse the metadata about manuscripts coming from different data providers and in different formats like TEI, METS/MODS, MARC21 or provider-specific schemas. It was also checked if the data meets the mandatory requirements of the EDM. Additional properties, classes, resource definitions, restrictions and recommendations that were needed to represent the manuscripts as adequately as possible were added to the EDM which resulted in the DM2E model. Special instructions for the data providers for mappings to the DM2E model were added via the property _dm2e:scopeNote_. We decided to create a new property for not mixing up different _skos:notes_ or similar properties that can be used for comments on a specific class or property and may also be used by others for the same resources. The first operational version of the model was created in April 2013 and since then iteratively refined. New functions of the model include e.g. the representation of uncertain timespans and hierarchical objects.

Short presentation of the model: [http://de.slideshare.net/DM2E/national-aggr-droege](http://de.slideshare.net/DM2E/national-aggr-droege)

**Documentation**

The model is documented in three different ways:

1. Resources in the DM2E namespace can be accessed via their URIs (see [http://onto.dm2e.eu/schemas/dm2e/](http://onto.dm2e.eu/schemas/dm2e/) for all resources). We used Neologism for that.
2. We do also publish an owl-file where resources in the DM2E namespace and resources from other namespaces are represented. This ontology was created with Protégé based on the EDM ontology ( [https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu/rdf](https://github.com/europeana/corelib/tree/master/corelib-solr-definitions/src/main/resources/eu/rdf)). It can be found here: [https://github.com/DM2E/dm2e-ontologies/blob/master/src/main/resources/dm2e-model/DM2Ev1.1.owl](https://github.com/DM2E/dm2e-ontologies/blob/master/src/main/resources/dm2e-model/DM2Ev1.1.owl)
3. Especially important for data providers in the project is a textual description of the model with mapping examples. Here, we list the original scope notes of reused resources as well as the DM2E description (if needed). The model specification of the latest stable version of the model (1.1) can be accessed here: [http://wiki.dm2e.eu/wiki/images/6/6a/DM2E\_Model\_V1.1\_Specification.pdf](http://wiki.dm2e.eu/wiki/images/6/6a/DM2E_Model_V1.1_Specification.pdf)

**Validation**

Data that is now in the DM2E model is not always completely represented in the way we have intended it to be. We need a way to validate the mappings directly and want to integrate this into our data ingestion tool OmNom (which is used to publish DM2E data as LOD). At one stage in the project, we have used Schematron for validation. It is planned to update this to the latest model version and use it to directly check if valid DM2E data was produced. Currently, the data is validated during the ingestion process via a Java tool written by Konstantin Baierer [[1]](https://github.com/DM2E/dm2e-ontologies/tree/d6af4a8858af83871bb86f905df55bc7e67567f8/src/test/java/eu/dm2e/validation/validator). The validator gives feedback to the data provider via the following notification:

- NOTICE (for things that are not a problem but may have eluded the mapper's attention)
- WARNING (for things that are not errors, but that contradict strong recommendations in the model)
- ERROR (for things that contradict strict assertions in the model, such as mandatory elements missing)
- FATAL (for errors that cripple the data to an extent where it can't be worked with sensibly)

If FATAL or ERROR occurs the data is not ingested.

**Validation use cases**

- Mandatory properties and classes in EDM
- Additional mandatory properties in DM2E
- Recommended properties
- Non-repeatable properties
- Wrong mime types (Web resources)
- Wrong datatypes (datatype property ranges)
- Property domains
- Object property ranges
- Illegal URI characters
- Mandatory language tags
- Unknown properties

See [[2]](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/128) and [[3]](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=use-cases) for use case descriptions.

**What we need**

A better way to mix&match resources from different namespaces and to better add comments or mapping instructions for the specific use case. Which would be the best way to reuse resources when we, for example, would like add restrictions to a resource like “Do not use this property twice” in our own context?


---
title: DDB-EDM
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DDB-EDM.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 13 February 2014, at 13:50.  
This page has been accessed 28,180 times.

# DDB - Deutsche Digitale Bibliothek

The German Digital Library is a portal providing access to digital cultural and scientific objects from Germany (see [https://www.deutsche-digitale-bibliothek.de/content/about/](https://www.deutsche-digitale-bibliothek.de/content/about/)). It is also a national contributor for Europeana. Therefore the DDB uses EDM as the model for the interlinking of objects in the DDB and the contribution of metadata to Europeana. But the use of EDM in the DDB requires an extension of properties used in EDM. Therefore - like DM2E - the DDB developed a specialisation of EDM for the DDB domain. Unfortunately the documentation of this specialisation is not publicly available.

**Use Case for an Application Profile = Validation**

The DDB gets data from different providers and is mapping them to EDM. For the mapping process they use human readable templates describing the properties and classes and their constraints used in DDB or in Europeana or for both. Doing the mapping the DDB team has to distinguish between:

- data provided to the DDB and from there to Europeana
- data provided to the DDB but not to Europana

Because of the different requirements for DDB or Europeana a validation process should be able to distinguish between collections that will be provided to Europena and those who are not. Therefore the DDB needs for the validation of data

- a schema for the the validation of properties and classes used in both applications in the same way
- a schema for the validation of properties and classes used only in DDB
- a schema for the validation of properties and classes used only in Europeana
- a machine readable description what schema is relevant on what circumstances

[RDF\_Application\_Profiles](/index.php?title=RDF_Application_Profiles&action=edit&redlink=1 "RDF\_Application\_Profiles (page does not exist)")


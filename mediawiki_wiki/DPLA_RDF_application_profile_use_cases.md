---
title: DPLA RDF application profile use cases
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DPLA_RDF_application_profile_use_cases.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 18 March 2014, at 17:16.  
This page has been accessed 34,675 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Overview"><span class="tocnumber">1</span> <span class="toctext">Overview</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#DPLA_Use_Case_1:_Validation_following_DPLA_enrichment"><span class="tocnumber">2</span> <span class="toctext">DPLA Use Case 1: Validation following DPLA enrichment</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#DPLA_Use_Case_2:_Validation_Using_MAPv3_data_supplied_by_partners"><span class="tocnumber">3</span> <span class="toctext">DPLA Use Case 2: Validation Using MAPv3 data supplied by partners</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#DPLA_Use_Case_3:_Establishing_mandatory_and_recommended_levels_of_validation"><span class="tocnumber">4</span> <span class="toctext">DPLA Use Case 3: Establishing mandatory and recommended levels of validation</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#DPLA_Use_Case_4:_Validation_of_MAPv3_data_by_API_consumers"><span class="tocnumber">5</span> <span class="toctext">DPLA Use Case 4: Validation of MAPv3 data by API consumers</span></a></li>
        <li class="toclevel-1 tocsection-6"><a href="#Preliminary_Investigations"><span class="tocnumber">6</span> <span class="toctext">Preliminary Investigations</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## Overview

DPLA maintains an access portal to digitized cultural heritage objects held by libraries, archives, museums, and historical societies throughout the United States, and provides bulk and programmatic access to this data. The [DPLA Metadata Application Profile version 3](http://dp.la/info/developers/map/) (MAPv3) builds on the [Europeana Data Model](http://pro.europeana.eu/edm-documentation). As such, our use case is somewhat similar to the [EDM](/mediawiki_wiki/EDM.md) and the [DDB-EDM](/mediawiki_wiki/DDB-EDM.md) use cases.

We harvest data using several different methods (file transfer, OAI-PMH, site-specific APIs, etc.) and process data in different formats (MODS, MARCXML, qualified and unqualified DC, and site-specific serializations). DPLA augments and normalizes data received from partners (_content hubs_ and _service hubs_) as an _enrichment_ pipeline that is part of our ingestion process. While MAPv3 builds on EDM, we currently use JSON-LD as our sole storage and serialization format. Currently, our primary concern relates to the need to check cardinality constraints and occurrences and (in limited cases) checking value types.

## DPLA Use Case 1: Validation following DPLA enrichment

- At this time, all partners provide us with data that requires mapping and enrichment.
- After fetching the records we pass them through the mapping and enrichment pipeline.
- At the end of the pipeline, we _should_ have a set of statements that complies with MAPv3.
- If that set of statements does not comply with MAPv3, we can prevent the record from being saved to the production store or otherwise indicate that additional remediation is necessary (e.g. generating a view on our document store that checks for a value of a specific key).
- In addition, we can provide feedback to the partner regarding data quality, or identify edge-case errors in our mapping and enrichment pipeline.

## DPLA Use Case 2: Validation Using MAPv3 data supplied by partners

- Some partners have expressed interest in developing their own enrichment workflows and have potentially offered to provide us with MAPv3 compliant data.
- A partner should be able to validate a set of statements to assure compliance against MAPv3 before submitting the data to DPLA for ingestion, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA).
- DPLA should be able to validate a set of statements for MAPv3 compliance.

## DPLA Use Case 3: Establishing mandatory and recommended levels of validation

- Some properties may not be mandatory, but may be recommended to indicate a "value-added" level of compliance with MAPv3.
- For example, we may require that a subject statement have an rdf:Label or a skos:prefLabel, but we may want to check for the presence of an identifier for that term

## DPLA Use Case 4: Validation of MAPv3 data by API consumers

- Developers should be able to validate sets of statements against MAPv3 when trying to diagnose issues with their applications, using commonly deployed tools (i.e. not necessarily using identical infrastructure to DPLA).

## Preliminary Investigations

One option that we have been investigating recently is using [JSON Schema](http://json-schema.org/), which is less than ideal since it takes a document-centric approach and is limited to a specific serialization.

- [Sample code in context of DPLA ingestion code](https://github.com/dpla/ingestion/compare/7289-jsonschema-validation)
- Endpoint allows a client to POST a MAPv3/JSON-LD instance document. If valid/invalid, sets a True/False value on admin.valid\_after\_enrich property.


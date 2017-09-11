---
title: Map of properties for frequency of a resource
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Map_of_properties_for_frequency_of_a_resource.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 6 August 2013, at 09:36.  
This page has been accessed 61,263 times.

This is a sufficient map between published UNIMARC, ISBD, FRBR, Dublin Core, MARC 21, and RDA element set properties for frequency of issue or updates of a resource.

Mappings not specified can be entailed: rdfs:subPropertyOf is transitive.

The following namespaces and properties are in development and not yet published:

1. The element set for UNIMARC Bibliographic format.
2. The element set for unconstrained ISBD properties with no domain.
3. The element set for unconstrained RDA properties with no domain or range.
4. The aggregate properties for MARC 21 m2100:M00FreCom, m2100:M00Fre. 

m2100:M00Fre aggregates the properties representing MARC 21 fixed field codes for frequency of specific types of resource.

The map can be used to process data triples using the properties with "intelligent dumb-down".

See the [Map of value vocabularies for frequency of issue of continuing resources](/archive/mediawiki_wiki/Map_of_value_vocabularies_for_frequency_of_issue_of_continuing_resources "Map of value vocabularies for frequency of issue of continuing resources") for vocabulary encoding schemes for potential values of these properties.

<pre>
#
# Map of properties for frequency of a resource.
#
# This map is not approved by the target vocabulary owners.
#
#
# Creator: Gordon Dunsire
# Date: 5 Aug 2013
#
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt;.
@prefix dct: &lt;http://purl.org/dc/terms/&gt;.
@prefix frbrer: &lt;http://iflastandards.info/ns/fr/frbr/frbrer/&gt;.
@prefix isbd: &lt;http://iflastandards.info/ns/isbd/elements/&gt;.
@prefix m2100: &lt;http://marc21rdf.info/elements/00/&gt;.
@prefix m2100X: &lt;http://marc21rdf.info/elements/00X/&gt;.
@prefix m213XX: &lt;http://marc21rdf.info/elements/3XX/&gt;.
@prefix m215XX: &lt;http://marc21rdf.info/elements/5XX/&gt;.
@prefix rdaGroup1: &lt;http://rdvocab.info/Elements/&gt;.
@prefix unimarcb: &lt;&gt;.
@prefix uncisbd: &lt;&gt;.
@prefix uncrda: &lt;&gt;.
#
# UNIMARC properties (in development) to unconstrained/RDA property.
# unimarcb:U110__a1 rdfs:label "Continuing Resource Coded Data: Frequency of issue"
# unimarcb:U326__a rdfs:label "FREQUENCY STATEMENT NOTE (CONTINUING RESOURCES): Frequency" .
#
unimarcb:U110__a1 rdfs:subPropertyOf uncrda:frequency .
unimarcb:U326__a rdfs:subPropertyOf uncrda:frequency .
#
# MARC 21 level 0 coded properties to higher aggregate MARC 21 coded properties (in development).
#
# Labels:
# m2100X:M006m01 rdfs:label "Frequency [OBSOLETE] of Computer file or Electronic resource" .
# m2100X:M006s01 rdfs:label "Frequency of Serial or Integrating resource" .
# m2100X:M008CF18 rdfs:label "Frequency [OBSOLETE] of Computer Files" .
# m2100X:M008CR18 rdfs:label "Frequency of Continuing Resources" .
#
# Isolate obsolete computer file properties.
#
m2100X:M006m01 rdfs:subPropertyOf m2100:M00FreCom .
m2100X:M008CF18 rdfs:subPropertyOf m2100:M00FreCom .
#
# If obsolete data required ...
# m2100:M00FreCom rdfs:subPropertyOf rdfs:subPropertyOf uncrda:frequency . .
#
m2100X:M006s01 rdfs:subPropertyOf m2100:M00Fre .
m2100X:M008CR18 rdfs:subPropertyOf m2100:M00Fre .
#
# Aggregate MARC 21 coded property to unconstrained/RDA property
# 
m2100:M00Fre rdfs:subPropertyOf uncrda:frequency .
#
# MARC 21 properties to unconstrained/RDA property
# m213XX:M310__a rdfs:label "Current publication frequency in Current Publication Frequency" .
# m213XX:M321__a rdfs:label "Former publication frequency in Former Publication Frequency" .
# m215XX:M533__712 rdfs:label "Fixed-length data elements of reproduction: Frequency in Reproduction Note" .
#
m213XX:M310__a rdfs:subPropertyOf uncrda:frequency .
m213XX:M321__a rdfs:subPropertyOf uncrda:frequency .
m215XX:M533__712 rdfs:subPropertyOf uncrda:frequency .
#
# FRBRer property to unconstrained/RDA property.
# frbrer:P3066 rdfs:label "has expected frequency of issue (serial)" .
#
frbrer:P3066 rdfs:subPropertyOf uncrda:frequency .
#
# RDA properties to unconstrained/RDA properties.
#
rdaGroup1:frequencyManifestation rdfs:subPropertyOf uncrda:frequency .
rdaGroup1:noteOnfrequencyManifestation rdfs:subPropertyOf uncrda:noteOnfrequency .
uncrda:frequency rdfs:subPropertyOf uncrda:noteOnfrequency .
#
# ISBD property to unconstrained/ISBD property (in development).
# isbd:P1065 rdfs:label "has note on frequency" .
#
isbd:P1065 rdfs:subPropertyOf uncisbd:P1065 .
#
# Unconstrained/ISBD property to unconstrained/RDA property.
#
uncisbd:P1065 rdfs:subPropertyOf uncrda:noteOnFrequencyManifestation .
#
# DC terms to unconstrained/RDA property.
#
dct:accrualPeriodicity rdfs:subPropertyOf uncrda:frequency .

</pre>

[Maps between bibliographic element sets](/archive/mediawiki_wiki/Maps_between_bibliographic_element_sets "Maps between bibliographic element sets")


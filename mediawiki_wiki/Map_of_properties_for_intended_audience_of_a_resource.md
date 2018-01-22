---
title: Map of properties for intended audience of a resource
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Map_of_properties_for_intended_audience_of_a_resource.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 5 August 2013, at 16:20.  
This page has been accessed 64,639 times.

This is a sufficient map between published UNIMARC, ISBD, FRBR, Dublin Core, MARC 21, and RDA element set properties for intended audience of a resource.

Mappings not specified can be entailed: rdfs:subPropertyOf is transitive.

The following namespaces and properties are in development and not yet published:

1. The element set for UNIMARC Bibliographic format.
2. The element set for unconstrained ISBD properties with no domain.
3. The element set for unconstrained RDA properties with no domain or range.
4. The aggregate property for MARC 21 m2100:M00Aud.

m2100:M00Aud aggregates the properties representing MARC 21 fixed field codes for audience of specific types of resource.

isbd:P1091 has a broader coverage which includes use as well as audience.

The map can be used to process data triples using the properties with "intelligent dumb-down".

<pre>
#
# Map of properties for intended audience of a resource.
#
# This map is not approved by the target vocabulary owners.#
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
@prefix rdaGroup1: &lt;http://rdvocab.info/Elements/&gt;.
@prefix uncisbd: &lt;&gt;.
@prefix uncrda: &lt;&gt;.
@prefix unimarcb: &lt;&gt;.
#
# UNIMARC level 0 property (in development) to higher aggregate UNIMARC property (in development).
# unimarcb:U100__a17 rdfs:label "GENERAL PROCESSING DATA: Target Audience Code: 1" .
# unimarcb:U100__a18 rdfs:label "GENERAL PROCESSING DATA: Target Audience Code: 2" .
# unimarcb:U100__a19 rdfs:label "GENERAL PROCESSING DATA: Target Audience Code: 3" .
#
unimarcb:U100 __a17 rdfs:subPropertyOf unimarcb:U100__ a17-19 .
unimarcb:U100 __a18 rdfs:subPropertyOf unimarcb:U100__ a17-19 .
unimarcb:U100 __a19 rdfs:subPropertyOf unimarcb:U100__ a17-19 .
#
# Aggregate UNIMARC property to unconstrained/RDA property (in development).
# unimarcb:U100__a17-19 rdfs:label "GENERAL PROCESSING DATA: Target Audience Code" .
# 
unimarcb:U100__a17-19 rdfs:subPropertyOf uncrda:intendedAudience .
#
# UNIMARC note property to unconstrained/ISBD property (in development).
# unimarcb:U333__a rdfs:label "USERS/INTENDED AUDIENCE NOTE: Text of Note" .
# 
unimarcb:U333__a rdfs:subPropertyOf uncisbd:P1091 .
#
# MARC 21 level 0 property to higher aggregate MARC 21 property (in development).
# m2100X:M006a05 rdfs:label "Target audience of Language material" .
# m2100X:M006c05 rdfs:label "Target audience of Notated music" .
# m2100X:M006d05 rdfs:label "Target audience of Manuscript notated music" .
# m2100X:M006g05 rdfs:label "Target audience of Projected medium" .
# m2100X:M006i05 rdfs:label "Target audience of Nonmusical sound recording" .
# m2100X:M006j05 rdfs:label "Target audience of Musical sound recording" .
# m2100X:M006k05 rdfs:label "Target audience of Two-dimensional nonprojectable graphic" .
# m2100X:M006m05 rdfs:label "Target audience of Computer file or Electronic resource" .
# m2100X:M006o05 rdfs:label "Target audience of Kit" .
# m2100X:M006r05 rdfs:label "Target audience of Three-dimensional artifact or naturally occurring 

object" .
# m2100X:M006t05 rdfs:label "Target audience of Manuscript language material" .
# m2100X:M008BK22 rdfs:label "Target audience of Books" .
# m2100X:M008CF22 rdfs:label "Target audience of Computer Files" .
# m2100X:M008MU22 rdfs:label "Target audience of Music" .
# m2100X:M008VM22 rdfs:label "Target audience of Visual Materials" .
#
m2100X:M006a05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006c05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006d05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006g05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006i05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006j05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006k05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006m05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006o05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006r05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M006t05 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M008BK22 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M008CF22 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M008MU22 rdfs:subPropertyOf m2100:M00Aud .
m2100X:M008VM22 rdfs:subPropertyOf m2100:M00Aud .
#
# Aggregate MARC 21 property to unconstrained/RDA property.
# m2100:M00Aud rdfs:label "Target audience" .
# 
m2100:M00Aud rdfs:subPropertyOf uncrda:intendedAudience .
#
# RDA property to unconstrained/RDA property.
#
rdaGroup1:intendedAudienceWork rdfs:subPropertyOf uncrda:intendedAudience .
#
# FRBRer to unconstrained/RDA property.
# frbrer:P3006 rdfs:label "has intended audience" .
#
frbrer:P3006 rdfs:subPropertyOf uncrda:intendedAudience .
#
# DC terms to unconstrained/RDA property.
#
dct:audience rdfs:subPropertyOf uncrda:intendedAudience .
#
# ISBD property to unconstrained/ISBD property (in development).
# isbd:P1091 rdfs:label "has note on use or audience" .
#
isbd:P1091 rdfs:subPropertyOf uncisbd:P1091 .
#
# Unconstrained/RDA property to unconstrained/ISBD property.
#
uncrda:intendedAudience rdfs:subPropertyOf uncisbd:P1091 .

</pre>

[Maps between bibliographic element sets](/mediawiki_wiki/Maps_between_bibliographic_element_sets "Maps between bibliographic element sets")


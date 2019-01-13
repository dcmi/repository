---
title: DCAM Revision High Level Example Resource Descriptions
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 7 June 2012, at 23:01.  
This page has been accessed 100,703 times.

The ISBD documentation defines "resource" as "An entity, tangible or intangible, that comprises intellectual and/or artistic content and is conceived, produced and/or issued as a unit, forming the basis of a single bibliographic description." In the ISBD namespace, Resource is a class, and is the domain of all properties based on ISBD attributes and aggregated statements.

The ISBD documentation also says "One change [in the consolidated edition] is the use of the term resource rather than item or publication. This decision was taken in order to avoid confusion, because the use of the term item in the former ISBDs is different from the term item as used in FRBR."

The FRBR documentation refers to resources, e.g. "… users may make use of bibliographic records for a variety of purposes, for example: to determine what information resources exist …", but does not offer any definition.

FRBR identifies four entities as "the products of intellectual or artistic endeavour that are named or described in bibliographic records: work, expression, manifestation, and item." In the FRBRer namespace, Work, Expression, Manifestation, and Item are classes, and are the domains of properties based on FRBR attributes assigned to the entities and the domains and ranges of properties based on relationships between the entities.

The FRBR documentation describes the relationships between these entities as "a work may be realized through one or more than one expression ... An expression, on the other hand, is the realization of one and only one work ... An expression may be embodied in one or more than one manifestation; likewise a manifestation may embody one or more than one expression. A manifestation, in turn, may be exemplified by one or more than one item; but an item may exemplify one and only one manifestation." The usage of "may" and "is" is informal. The FRBR Review Group has clarified this in discussion (but not yet formally recorded anything):

- An Item must exemplify one and only one Manifestation.
- A Manifestation must embody at least one Expression.
- An Expression must realize one and only one Work.
- A Work may be realized through one or more Expressions.
- An Expression may be embodied in one or more Manifestations.
- A Manifestation may exemplify one or more Items.

These semantic constraints are currently expressed in OWL; e.g. An Expression must realize one and only one Work:

- frbrer:C1002 rdfs:subClassOf
- [
- rdf:type owl:Restriction;
- owl:onProperty frbrer:P2002;
- owl:onClass frbrer:C1001;
- owl:qualifiedCardinality "1"^^xsd:nonNegativeInteger
- ] .
- frbrer:C1002 rdfs:label “Expression” .
- frbrer:C1001 rdfs:label “Work” .
- frbrer:P2002 rdfs:label “is realization of” .

The three FRBR "primary" relationships for realized, embodied, and exemplified are represented as pairs of properties in the namespace, with the relevant classes as domains and ranges.

A FRBR "record" of instance data will usually comprise instances of one of each of the four entities:

"Resource" (record or description) = Work + Expression + Manifestation + Item.

This "record" is related to a graph of ISBD triples with an instance of Resource as their subject (disregarding relationships between lower-granularity properties in the ISBD and FRBRer namespaces).

#### Notes 

ISBD’s Resource and FRBR’s Work, Expression, Manifestation, and Item classes may be more appropriately considered to be sub-classes of the "Named graph" class (without needing the alter their basic semantics). Each graph is a set of properties whose domain is the class.

Back to [DCAM revision design patterns](/mediawiki_wiki/DCAM_Revision_Design_Patterns.md)


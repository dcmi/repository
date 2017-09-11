---
title: "- SpecificOrGenericProperties"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/SpecificOrGenericProperties.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [SpecificOrGenericProperties](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=fullsearch&value=SpecificOrGenericProperties&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties "View")
- [Diffs](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/SpecificOrGenericProperties">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="SpecificOrGenericProperties_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="SpecificOrGenericProperties_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Specific Properties or Generic Properties

### Introduction

This document is intended as a contribution to the discussion of the proposed "accessibility" property, but also to highlight some general issues relating to design choices in the construction of RDF properties.

### Background

RDF Schema is principally "property-centric"

### Two Approaches

#### Example: Representing the characteristics of a physical material

Suppose we want a simple RDF vocabulary to represent some subset of the physical characteristics of a material e.g.

- Flammability [http://en.wikipedia.org/wiki/Flammability](http://en.wikipedia.org/wiki/Flammability)

- Toxicity [http://en.wikipedia.org/wiki/Toxicity](http://en.wikipedia.org/wiki/Toxicity)

- Melting Point [http://en.wikipedia.org/wiki/Melting\_point](http://en.wikipedia.org/wiki/Melting_point)

- Boiling Point [http://en.wikipedia.org/wiki/Boiling\_point](http://en.wikipedia.org/wiki/Boiling_point)

- Heat of Fusion [http://en.wikipedia.org/wiki/Heat\_of\_fusion](http://en.wikipedia.org/wiki/Heat_of_fusion)

- Heat of Vaporisation [http://en.wikipedia.org/wiki/Heat\_of\_vaporization](http://en.wikipedia.org/wiki/Heat_of_vaporization)

That's a somewhat random set of characteristics, and on their own they probably don't address much in the way of a real world requirement, but I chose them because they illustrate a combination of

- properties for which values are typically drawn from classification schemes (flammability, toxicity) - and the values could be identified by URIs

- properties for which values are typically drawm from a (potentially open) set of measurements/quantities (the other four) - and the values are typically not identified by URIs

In reality, things are more complex because there might be combinations of measurements/quantities involved, and I've also simplified the toxicity classification, but I think this simple version suffices for the purposes of this discussion.

#### Single Generic Property with "Broad" Range

With this approach a single property ( [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">hasCharacteristic](http://dublincore.org/usageboardwiki/InterWiki "Prop")) is defined, with a range of the class of Characteristics,

<pre>Prop:hasCharacteristic rdfs:range Class:Characteristic .
</pre>

where a Characteristic is something like "An aspect of a substance that can be measured or perceived." So individual examples of a characteristic would be "a boiling point of 100 degrees Celsius" or a "a density of 958.4 kilograms per cubic metre".

There's a difference between

- the characteristic ("a boiling point of 100 degrees Celsius"); and

- a statement/assertion that some particular substance has that characteristic ("Water has a a boiling point of 100 degrees Celsius" or "Water has the characteristic that it has a boiling point of 100 degrees Celsius")

So to express the information that some particular substance has six characteristics, we use multiple triples, each with the same predicate:

<pre>Thing:T12 Prop:hasCharacteristic Flammability:A1 ;
          Prop:hasCharacteristic Toxicity:T2 ;
          Prop:hasCharacteristic [Prop:celsius "100"^^xsd:decimal] ;
          Prop:hasCharacteristic [Prop:kJoules "150"^^xsd:decimal] ;
          Prop:hasCharacteristic [Prop:celsius "200"^^xsd:decimal] ;
          Prop:hasCharacteristic [Prop:kJoules "250"^^xsd:decimal] .

Thing:T34 Prop:hasProperty Flammability:B1 ;
          Prop:hasProperty Toxicity:T4 ;
          Prop:hasProperty [Prop:celsius "300"^^xsd:decimal] ;
          Prop:hasProperty [Prop:kJoules "350"^^xsd:decimal] ;
          Prop:hasProperty [Prop:celsius "400"^^xsd:decimal] ;
          Prop:hasProperty [Prop:kJoules "450"^^xsd:decimal] .
</pre>

From that information alone, a consumer can't distinguish the specific type of characteristic e.g. boiling points from melting points, and even distinguishing flammability from toxicity requires that the consumer has prior knowledge of the resources identified by those URIs.

So a query like "list all things that have a flammability of A1" can be satisfied:

<pre>SELECT ?thing WHERE {
  ?thing Prop:hasCharacteristic Flammability:A1
}
</pre>

But queries like "list all things with a boiling point over 200 degrees Celsius" can not be satisfied without additional information.

An RDFS-aware application can infer only that the values are characteristics.

The distinction between the different types of characteristic is provided as additional triples, e.g. to provides types for the values:

<pre>Thing:T12 Prop:hasCharacteristic Flammability:A1 ;
          Prop:hasCharacteristic Toxicity:T2 ;
          Prop:hasCharacteristic [a Class:MeltingPoint ; Prop:celsius "100"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:HeatOfFusion ; Prop:kJoules "150"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:BoilingPoint ; Prop:celsius "200"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:HeatOfVaporisation ; Prop:kJoules "250"^^xsd:decimal] .

Flammability:A1 a Class:Flammability .
Toxicity:T2 a Class:Toxicity .

Thing:T34 Prop:hasCharacteristic Flammability:B1 ;
          Prop:hasCharacteristic Toxicity:T4 ;
          Prop:hasCharacteristic [a Class:MeltingPoint ; Prop:celsius "300"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:HeatOfFusion ; Prop:kJoules "350"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:BoilingPoint ; Prop:celsius "400"^^xsd:decimal] ;
          Prop:hasCharacteristic [a Class:HeatOfVaporisation ; Prop:kJoules "450"^^xsd:decimal] .

Flammability:B1 a Class:Flammability .
Toxicity:T4 a Class:Toxicity .
</pre>

Now the characteristic-type-specific queries like "list all things with a boiling point over 200 degrees Celsius" can be satisfied:

<pre>SELECT ?thing ?c WHERE {
  ?thing Prop:hasCharacteristic ?char .
  ?char a Class:BoilingPoint .
  ?char Prop:celsius ?c .
  FILTER (?c &gt; 200)
}
}
</pre>

So, although this approach is based on the definition of the single property [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">hasCharacteristic](http://dublincore.org/usageboardwiki/InterWiki "Prop"), support for many typical queries requires the definition and use of a set of classes in addition to that property.

##### Examples

#### Multiple Specific Properties, each with Specified Range

With this approach multiple properties are defined, one for each of the distinct types of characteristics ( [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">flammability](http://dublincore.org/usageboardwiki/InterWiki "Prop"), [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">toxicity](http://dublincore.org/usageboardwiki/InterWiki "Prop"), [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">boilingPoint](http://dublincore.org/usageboardwiki/InterWiki "Prop"), [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">meltingPoint](http://dublincore.org/usageboardwiki/InterWiki "Prop"), [<img src="SpecificOrGenericProperties_files/moin-inter.png" alt="[Prop]" height="16" width="16">heatOfFusion](http://dublincore.org/usageboardwiki/InterWiki "Prop"), ), each with a specified range:

<pre>Prop:flammability rdfs:range Class:Flammability . 
Prop:toxicity rdfs:range Class:Toxicity .
Prop:meltingPoint rdfs:range Class:MeltingPoint . 
Prop:boilingPoint rdfs:range Class:BoilingPoint . 
Prop:heatOfFusion rdfs:range Class:HeatOfFusion .
Prop:heatOfVaporisation rdfs:range Class:HeatOfVaporisation .
</pre>

So to express the information that some particular substance has six characteristics, we use six triples, each with a different predicate:

<pre>Thing:T12 Prop:flammability Flammability:A1 ;
          Prop:toxicity Toxicity:T2 ;
          Prop:meltingPoint [Prop:celsius "100"^^xsd:decimal] ;
          Prop:heatOfFusion [Prop:kJoules "150"^^xsd:decimal] ;
          Prop:boilingPoint [Prop:celsius "200"^^xsd:decimal] ;
          Prop:heatOfVaporisation [Prop:kJoules "250"^^xsd:decimal] .

Thing:T34 Prop:flammability Flammability:B1 ;
          Prop:toxicity Toxicity:T4 ;
          Prop:meltingPoint [Prop:celsius "300"^^xsd:decimal] ;
          Prop:heatOfFusion [Prop:kJoules "350"^^xsd:decimal] ;
          Prop:boilingPoint [Prop:celsius "400"^^xsd:decimal] ;
          Prop:heatOfVaporisation [Prop:kJoules "450"^^xsd:decimal] .
</pre>

From that information alone, a consumer can already distinguish e.g. boiling points from melting points, and flammability from toxicity. e.g. this is sufficient information to support simple queries like "list all things that have a flammability of A1":

<pre>SELECT ?thing WHERE {
  ?thing Prop:flammability Flammability:A1
}
</pre>

and also characteristic-type-specific queries like "list all things with a boiling point over 200 degrees Celsius":

<pre>SELECT ?thing ?c WHERE {
  ?thing Prop:boilingPoint ?char .
  ?char Prop:celsius ?c .
  FILTER (?c &gt; 200)
}
}
</pre>

The formal inferences made by an RDFS-aware application, based on the rdfs:range assertions for the different properties, generates more specific information about the values.

And as in the previous approach, that typing information can also be explicitly provided

<pre>Thing:T12 Prop:flammability Flammability:A1 ;
          Prop:toxicity Toxicity:T2 ;
          Prop:meltingPoint [a Class:Temperature ; Prop:celsius "100"^^xsd:decimal] ;
          Prop:heatOfFusion [a Class:AmountOfEnergy ; Prop:kJoules "150"^^xsd:decimal] ;
          Prop:boilingPoint [a Class:Temperature ; Prop:celsius "200"^^xsd:decimal] ;
          Prop:heatOfVaporisation [a Class:AmountOfEnergy ; Prop:kJoules "250"^^xsd:decimal] .

Flammability:A1 a Class:Flammability .
Toxicity:T2 a Class:Toxicity .

Thing:T34 Prop:flammability Flammability:B1 ;
          Prop:toxicity Toxicity:T4 ;
          Prop:meltingPoint [a Class:Temperature ; Prop:celsius "300"^^xsd:decimal] ;
          Prop:heatOfFusion [a Class:AmountOfEnergy ; Prop:kJoules "350"^^xsd:decimal] ;
          Prop:boilingPoint [a Class:Temperature ; Prop:celsius "400"^^xsd:decimal] ;
          Prop:heatOfVaporisation [a Class:AmountOfEnergy ; Prop:kJoules "450"^^xsd:decimal] .

Flammability:B1 a Class:Flammability .
Toxicity:T4 a Class:Toxicity .
</pre>

 [RefreshCache](http://dublincore.org/usageboardwiki/SpecificOrGenericProperties?action=refresh&arena=Page.py&key=SpecificOrGenericProperties.text_html) for this page (cached 2012-12-08 05:33:19)  

Immutable page (last edited 2009-08-20 13:44:54 by PeteJohnston)


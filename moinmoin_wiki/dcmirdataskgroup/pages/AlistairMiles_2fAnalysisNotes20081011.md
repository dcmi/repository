---
title: "- AlistairMiles/AnalysisNotes20081011"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/AlistairMiles_2fAnalysisNotes20081011.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AlistairMiles/AnalysisNotes20081011](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=fullsearch&value=%2FAnalysisNotes20081011&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/AlistairMiles "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081011_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081011_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Notes on RDA work, 2008-10-11.*** 

Task: To revise the RDF expression of the cataloguer scenarios [http://dublincore.org/dcmirdataskgroup/Scenarios](http://dublincore.org/dcmirdataskgroup/Scenarios) using a FRBR vocabulary in conjunction with the RDA vocabulary.

Looking at [http://metadataregistry.org/schema/list.html](http://metadataregistry.org/schema/list.html) I find a "FRBR Entities" schema [http://metadataregistry.org/schema/show/id/5.html](http://metadataregistry.org/schema/show/id/5.html) but no declared classes or properties.

Looking at the sandbox [http://sandbox.metadataregistry.org/](http://sandbox.metadataregistry.org/) schemas I find nothing related to FRBR, in vocabularies I find

- [1] FRBR Entities [http://sandbox.metadataregistry.org/vocabulary/show/id/49.html](http://sandbox.metadataregistry.org/vocabulary/show/id/49.html)

- [2] FRBR Relationships [http://sandbox.metadataregistry.org/vocabulary/show/id/90.html](http://sandbox.metadataregistry.org/vocabulary/show/id/90.html)

- [3] FRBR Relationships (as concepts) [http://sandbox.metadataregistry.org/vocabulary/show/id/64.html](http://sandbox.metadataregistry.org/vocabulary/show/id/64.html)

- [4] FRBR User Tasks [http://sandbox.metadataregistry.org/vocabulary/show/id/69.html](http://sandbox.metadataregistry.org/vocabulary/show/id/69.html)

To express cataloguer scenarios, I need FRBR entities and relationships expressed as RDFS classes and properties (i.e. a schema).

From Ian Davis et al I find

- [5] Expression of Core FRBR Concepts in RDF [http://vocab.org/frbr/core](http://vocab.org/frbr/core)

- [6] Expression of Extended FRBR Concepts in RDF [http://vocab.org/frbr/extended](http://vocab.org/frbr/extended)

Probably worthwhile doind a comparison between [1]+[2] (Gordon's FRBR, interpreted as classes and properties) and [5] (IanD's FRBR), to compare naming conventions and to see if any properties have been missed.

On initial impression, IanD's FRBR [5] looks very clean, nice naming conventions and at a glance looks very complete in terms of semantics.

### Comparison of FRBR Schemas by Gordon and Ian Davis

Began comparison, published at [http://spreadsheets.google.com/pub?key=pWXJnkpaKdGk4kKVbATNgGg](http://spreadsheets.google.com/pub?key=pWXJnkpaKdGk4kKVbATNgGg)

#### Classes

Both have classes for group 1 entities: Work, Expression, Manifestation, Item.

Aside, consult [http://dublincore.org/dcmirdataskgroup/analysisTask1](http://dublincore.org/dcmirdataskgroup/analysisTask1) for information on FRBR.

Both have classes for group 2 entities: Person, [CorporateBody](http://dublincore.org/dcmirdataskgroup/CorporateBody).

Both have classes for group 3 entities: Concept, Event, Object, Place

In addition, Ian's vocab has a class Endeavour which is the superclass of each of the group 1 classes, and is also equivalent to the union of the group 1 classes. N.B. in Karen's analysis [http://dublincore.org/dcmirdataskgroup/analysisTask1](http://dublincore.org/dcmirdataskgroup/analysisTask1) this looks like it corresponds to [BibliographicResource](http://dublincore.org/dcmirdataskgroup/BibliographicResource).

In addition, Ian's vocab has a class [ResponsibleEntity](http://dublincore.org/dcmirdataskgroup/ResponsibleEntity), which is the superclass of [CorporateBody](http://dublincore.org/dcmirdataskgroup/CorporateBody), and is also equivalent to the union of [CorporateBody](http://dublincore.org/dcmirdataskgroup/CorporateBody) and Person; I expected [ResponsibleEntity](http://dublincore.org/dcmirdataskgroup/ResponsibleEntity) to also be a superclass of Person, maybe this an oversight on Ian's part. I.e. it makes sense for something like [ResponsibleEntity](http://dublincore.org/dcmirdataskgroup/ResponsibleEntity) to be the superclass of the group 2 classes. N.B. in Karen's analysis [http://dublincore.org/dcmirdataskgroup/analysisTask1](http://dublincore.org/dcmirdataskgroup/analysisTask1) this is called Agent.

In addition, Ian's vocab has a class Subject, which is the superclass of each of the group 3 classes, and is also equivalent to the union of the group 3 classes. This also appears in Karen's analysis [http://dublincore.org/dcmirdataskgroup/analysisTask1](http://dublincore.org/dcmirdataskgroup/analysisTask1) .

N.B. Ian's vocab also includes lots of connections to other vocabularies, e.g. frbr:Concept is a subclass of skos:Concept; frbr:Person is equivalent to foaf:Person.

Suggestions (I guess to IFLA):

- that a FRBR schema be declared with the following classes: Work, Expression, Manifestation, Item, [CorporateBody](http://dublincore.org/dcmirdataskgroup/CorporateBody), Person, Concept, Object, Place, Event.

- that the schema also declare a class which is the superclass of the group 1 classes, named either Endeavour or [BibliographicResource](http://dublincore.org/dcmirdataskgroup/BibliographicResource).

- that the schema also declare a class which is the superclass of the group 2 classes, named either [ResponsibleEntity](http://dublincore.org/dcmirdataskgroup/ResponsibleEntity) or Agent.

- that the schema also declare a class which is the superclass of the group 3 classes, named Subject.

- I suggest following a minimum commitment approach to semantics, which means \*not\* declaring any of the equivalent class assertions, at least for now

For now, I will work from the classes declared in Ian's FRBR core vocabulary [5].

#### Properties

Using Gordon's FRBR relationships vocabulary [http://sandbox.metadataregistry.org/concept/list/vocabulary\_id/90.html](http://sandbox.metadataregistry.org/concept/list/vocabulary_id/90.html) [2]...

Comparison, published at [http://spreadsheets.google.com/pub?key=pWXJnkpaKdGk4kKVbATNgGg](http://spreadsheets.google.com/pub?key=pWXJnkpaKdGk4kKVbATNgGg)

Ian's vocab has properties for all FRBR relationships, i.e. complete coverage. For each FRBR relationship Ian has two properties (inverses), with the exception of frbr:subject (Ian has no frbr:subject).

In addition, Ian has three generalisation properties: frbr:relatedEndeavour, frbr:responsibleEntity and frbr:responsibleEntityOf.

Ian has applied a concise, consistent naming convention for properties. This makes coding the scenarios much simpler.

Gordon has hasAnimation and isAnimation of, which I can't find FRBR relationships for.

For the scenarios, I will use Ian's vocabulary.

I suggest IFLA use the same design principles and naming conventions as Ian has established, as these make the vocabulary easy to work with.

I.e. I suggest IFLA declare a FRBR schema with properties as named in Ian's FRBR Core schema. I also suggest IFLA state domain and range assertions as in Ian's FRBR Core.

N.B. Ian has also declared a FRBR extended vocabulary [http://vocab.org/frbr/extended](http://vocab.org/frbr/extended) ... from a quick glance, looks like refinements of classes and properties given in FRBR core. For now, I won'y use any of Ian's FRBR extended vocabulary, only the FRBR core.

### Cataloguer Scenario 1

Using [http://metadataregistry.org/schemaprop/list/schema\_id/1.html](http://metadataregistry.org/schemaprop/list/schema_id/1.html) ...

Published updated RDF expression at [Scenarios/1](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1).

Issues...

- Should rdarole:author be a sub-property of frbr:creator ?

- What vocabulary to use for the form of work?

- Found both originalLanguageOfTheWork and languageOfWork, appear identical function.

- What vocabulary to use for language of work?

Found [http://downlode.org/Code/RDF/ISO-639/](http://downlode.org/Code/RDF/ISO-639/) .. ? Old dublin core patterns for RFC1766 or ISO639-2, e.g. [http://dublincore.org/documents/dcq-rdf-xml/](http://dublincore.org/documents/dcq-rdf-xml/)? New dublin core patterns [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/) using dcterms:ISO639-2 as a datatype? Options at [http://esw.w3.org/topic/Languages\_as\_RDF\_Resources](http://esw.w3.org/topic/Languages_as_RDF_Resources) ? Given that LOC is registration authority for ISO 639-2, can we ask them to declare URIs for languages?

See also [http://dublincore.org/documents/dcmi-terms/#ses-ISO639-2](http://dublincore.org/documents/dcmi-terms/#ses-ISO639-2)

- What vocabulary to use for properties of a person? FOAF? VCARD? FRAD? ...

- What's the difference between languageOfExpression and contentLanguage?

- What vocabulary to use to describe properties of place? GEO...

- Found rda:Publisher as property, expected lower case initial letter for property names.

- What vocabulary to use to describe corporate bodies, e.g. publishers?

- For extent, use extentOfText, with literal?

- Found both identifierOfWork and identifierForTheWork.

- No need for different properties for identifier for each type of entity, e.g. identifierForTheWork, identifierForTheManifestation etc., only need single identifier property.

- What properties to use in authority record for a person?

- Strange that rda:title says associated with manifestation.

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011?action=refresh&arena=Page.py&key=AlistairMiles_2fAnalysisNotes20081011.text_html) for this page (cached 2012-12-24 10:12:39)  

Immutable page (last edited 2008-10-11 15:29:42 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


---
title: "- AMDraftUpdate"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AMDraftUpdate.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AMDraftUpdate](http://dublincore.org/architecturewiki/AMDraftUpdate?action=fullsearch&value=AMDraftUpdate&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AMDraftUpdate?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AMDraftUpdate "View")
- [Diffs](http://dublincore.org/architecturewiki/AMDraftUpdate?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AMDraftUpdate?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AMDraftUpdate?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AMDraftUpdate?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AMDraftUpdate?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AMDraftUpdate?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AMDraftUpdate?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AMDraftUpdate?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AMDraftUpdate?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AMDraftUpdate?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AMDraftUpdate?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AMDraftUpdate">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AMDraftUpdate_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AMDraftUpdate_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DCMI Abstract Model - DRAFT Update

**IMPORTANT** : This document and the associated UML diagrams are draft. They are under discussion on the [dc-architecture@jiscmail.ac.uk](mailto:dc-architecture@jiscmail.ac.uk) mailing list. Comments on this work should be sent to that list.

See [AbstractModelChanges](http://dublincore.org/architecturewiki/AbstractModelChanges) for a list of major changes to the current DCMI recommendation.

### 1. Introduction

This document specifies an abstract model for Dublin Core metadata. The primary purpose of this document is to specify the components and constructs used in Dublin Core metadata. It defines the nature of the components used and describes how those components are combined to create information structures. It provides a reference model which is independent of any particular encoding syntax. Such a reference model allows us to gain a better understanding of the kinds of descriptions that we are trying to encode and facilitates the development of better mappings and cross-syntax translations.

This document is primarily aimed at the developers of software applications that support Dublin Core metadata, people involved in developing new syntax encoding guidelines for Dublin Core metadata and people developing metadata application profiles based on DCMI vocabularies or on other compatible vocabularies.

The DCMI Abstract Model builds on work undertaken by the World Wide Web Consortium (W3C) on Resource Description Framework (RDF) [RDF, RDFS]. The use of concepts from RDF is summarized below in Section 5, on DCMI Abstract Model semantics.

The DCMI Abstract Model is represented here using UML class diagrams [UML]. Readers that are not familiar with UML class diagrams should note that lines ending in a block-arrow should be read as 'is' or 'is a' (for example, "a _value_ is a _resource_") and that lines starting with a block-diamond should be read as 'contains a' or 'has a' (for example, "a _statement_ contains a _property URI_"). Other relationships are labeled appropriately. Note that the UML modeling used here shows the abstract model but is not intended to form a suitable basis for the development of software applications. In this document, words and phrases in italics are defined in Section 7, Terminology.

### 2. DCMI abstract model

The abstract model of the _resources_ described by _descriptions_ is as follows:

- Each _described resource_ may be described using one or more _property-value pairs_.

- Each _property-value pair_ is made up of one _property_ and one _value_.

- Each _value_ is a _resource_ - the physical or conceptual entity that is associated with a _property_ when a _property-value pair_ is used to describe a _resource_.

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="AMDraftUpdate_files/AMDraftUpdate_002.jpg" alt="resource-model.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 1 - the DCMI resource model</strong>
      </td>
    </tr>
  </tbody>
</table>


The abstract model of DC metadata _descriptions_ is as follows:

- A _description set_ is a set of one or more _descriptions_, each of which describes a single _resource_.

- A _description_ is made up of one or more _statements_ (about one, and only one, _described resource_) and zero or one _resource URI_ (a _URI_ that identifies the _described resource_).

- Each _statement_ instantiates a _property-value pair_ and is made up of a _property URI_ (a _URI_ that identifies a _property_), zero or one _value URI_ (a _URI_ that identifies the _value_ associated with the _property_), zero or one _vocabulary encoding scheme URI_ (a _URI_ that identifies the _vocabulary encoding scheme_ of which the _value_ is a member), and zero or more _value representations_.

- The _value representation_ may take the form of a _value string_ or a _rich representation_.

- Each _value string_ is a string which represents the _resource_. _Value strings_ are intended to be human-readable.

- Each _value string_ may have either an associated _syntax encoding scheme URI_ that identifies a _syntax encoding scheme_ or an associated _value string language_ that is an ISO language tag (for example en-GB) but not both.

- Each _rich representation_ is a sequence of octets that represents the _value_ (a _resource_) - for example, some marked-up text, an image, a video, some audio, or some combination thereof.

- Each _rich representation_ must have an associated _media type_ (a MIME Media Type).

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="AMDraftUpdate_files/AMDraftUpdate.jpg" alt="description-model.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 2 - the DCMI description model</strong>
      </td>
    </tr>
  </tbody>
</table>


The abstract model of the vocabularies used in DC metadata _descriptions_ is as follows:

- Each _property_ may be related to one or more _classes_ by a _has domain_ relationship. Where it is stated that a _property_ has such a relationship with a _class_ and a _described resource_ is related to a _value_ by that _property_, it follows that the _described resource_ is an instance of that _class_.

- Each _property_ may be related to one or more _classes_ by a _has range_ relationship. Where it is stated that a _property_ has such a relationship with a _class_ and a _described resource_ is related to a _value_ by that _property_, it follows that the _value_ is an instance of that _class_.

- Each _resource_ may be an _instance of_ one or more _classes_.

- Each _resource_ may be a _member of_ one or more _vocabulary encoding schemes_.

- Each _class_ may be related to one or more other _classes_ by a _sub-class of_ relationship (where the two _classes_ are defined such that all _resources_ that are instances of the sub-class are also instances of the related _class_).

- Each _property_ may be related to one or more other _properties_ by a _sub-property of_ relationship. Where it is stated that such a relationship exists, the two _properties_ are defined such that whenever a _resource_ is related to a _value_ by the sub-property, it follows that the _resource_ is also related to that same _value_ by the _property_.

- Each _syntax encoding scheme_ is a _class_ (of strings).

- A _vocabulary_ is a set of one or more _terms_. Each _term_ is a member of one or more _vocabularies_.

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="AMDraftUpdate_files/AMDraftUpdate_003.jpg" alt="vocabulary-model-tb.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 3 - the DCMI vocabulary model</strong>
      </td>
    </tr>
  </tbody>
</table>


A number of things about the model are worth noting:

- Each _value_ may be the _described resource_ in a separate _description_ within the same description set - for example, a separate _description_ may provide metadata about the person that is the creator of the _described resource_.

- The description model does not provide an explicit mechanism for indicating the _classes_ of the _described resource_ or the _classes_ of any given _value_. _Classes_ of the _described resource_ can either be indicated explicitly using one or more _statements_ in the _description_ or be inferred from the _domains_ of the _properties_ used in the _description_. _Classes_ of any given _value_ can either be indicated explicitly using one or more _statements_ in a separate _description_ about that _value_ or be inferred from the _range_ of the _property_.

### 3. Descriptions, description sets and records

The abstract model presented above indicates that each DC metadata _description_ describes one, and only one, _described resource_. This is commonly referred to as the one-to-one principle.

However, real-world metadata applications tend to be based on loosely grouped sets of _descriptions_ (where the _described resources_ are typically related in some way), known here as _description sets_. For example, a _description set_ might comprise _descriptions_ of both a painting and the artist. Furthermore, it is often the case that a _description set_ will also contain a _description_ about the _description set_ itself (sometimes referred to as 'admin metadata' or 'meta-metadata').

_Description sets_ are instantiated, for the purposes of exchange between software applications, in the form of metadata _records_, according to one of the DCMI encoding guidelines (for example, XHTML meta tags, XML and RDF/XML) [DCMI-ENCODINGS].

### 4. Values

A DC metadata _value_ is the physical or conceptual entity that is associated with a _property_ when a _property-value pair_ is used to describe a _resource_. For example, a _value_ associated with the Dublin Core Creator _property_ is a person, organization or service - a physical entity. A _value_ associated with the Dublin Core Date _property_ is a point (or range) in time - a conceptual entity. A _value_ associated with the Dublin Core Coverage _property_ is a geographic region or country - a physical entity. A _value_ associated with the Dublin Core Subject _property_ is a concept (a conceptual entity) or a physical object or person (a physical entity). Each of these entities is a _resource_.

The _value_ may be identified using a _value URI_. The _value_ may be represented by one or more _value strings_ and/or _rich representations_. The _value_ may described by a separate _description_. In each case, the _value_ is a _resource_.

### 5. DCMI Abstract Model semantics

Some of the concepts in the DCMI Abstract Model are taken from the Resource Description Framework (RDF) and RDF Schema (RDFS) as follows:

<table>
  <tbody>
    <tr>
      <td>
        <strong>DCMI Abstract Model</strong> </td>
      <td>
        <strong>RDF/RDFS</strong> </td>
    </tr>
    <tr>
      <td>
        <em>resource</em> </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#Resource">http://www.w3.org/2000/01/rdf-schema#Resource</a> class </td>
    </tr>
    <tr>
      <td>
        <em>property</em> or <em>element</em> </td>
      <td>
        <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property">http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</a> class </td>
    </tr>
    <tr>
      <td>
        <em>class</em> </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#Class">http://www.w3.org/2000/01/rdf-schema#Class</a> class </td>
    </tr>
    <tr>
      <td>
        <em>syntax encoding scheme</em> </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#Datatype">http://www.w3.org/2000/01/rdf-schema#Datatype</a> class </td>
    </tr>
    <tr>
      <td>
        <em>has domain</em> relationship </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#domain">http://www.w3.org/2000/01/rdf-schema#domain</a> property </td>
    </tr>
    <tr>
      <td>
        <em>has range</em> relationship </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#range">http://www.w3.org/2000/01/rdf-schema#range</a> property </td>
    </tr>
    <tr>
      <td>
        <em>sub-property of</em> relationship </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#subPropertyOf">http://www.w3.org/2000/01/rdf-schema#subPropertyOf</a> property </td>
    </tr>
    <tr>
      <td>
        <em>sub-class of</em> relationship </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema#subClassOf">http://www.w3.org/2000/01/rdf-schema#subClassOf</a> property </td>
    </tr>
  </tbody>
</table>


<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <strong>Table 1 - DCMI Abstract Model semantics</strong>
      </td>
    </tr>
  </tbody>
</table>


### 6. Encoding guidelines

Particular encoding guidelines (HTML meta tags, XML, RDF/XML, etc.) [DCMI-ENCODINGS] do not need to encode all aspects of the abstract model described above. However, they should refer to the DCMI Abstract Model and indicate which parts of the model are encoded and which are not.

Encoding guidelines should indicate how a _value_ can be treated as a _described resource_ in a separate _description_ in those cases where there is no _value URI_.

### 7. Terminology

This document uses the following terms:

_class_ ( [http://www.w3.org/2000/01/rdf-schema#Class](http://www.w3.org/2000/01/rdf-schema#Class))

 A group containing members that have attributes, behaviours, relationships or semantics in common; a kind of category. 

_described resource_

 A _resource_ that is described by a _description_. 

_described resource URI_

 A _URI_ that identifies the _described resource_. 

_description_

 One or more _statements_ about one, and only one, _described resource_. 

_description set_

 A set of one or more _descriptions_. 

_element_

 A synonym for _property_. It should be noted that the word element is also commonly used to refer to a structural markup component within an XML document. 

_has domain_ ( [http://www.w3.org/2000/01/rdf-schema#domain](http://www.w3.org/2000/01/rdf-schema#domain))

 A relationship between a _property_ and a _class_ which indicates that if a _described resource_ is related to a _value_ by the _property_, then it follows that the _described resource_ is an instance of that _class_. 

_has range_ ( [http://www.w3.org/2000/01/rdf-schema#range](http://www.w3.org/2000/01/rdf-schema#range))

 A relationship between a _property_ and a _class_ which indicates that if a _described resource_ is related to a _value_ by the _property_, then it follows that the _value_ is an instance of that _class_. 

_instance of_

 A relationship between a _resource_ and a _class_ which indicates a _class_ of which the _resource_ is an instance. 

_media type_

 A MIME Media Type (as defined by RFC 2045 and RFC 2046). 

_member of_ ( [http://purl.org/dc/dcam/memberOf](http://purl.org/dc/dcam/memberOf))

 A relationship between a _resource_ and a _vocabulary encoding scheme_ which indicates that the _resource_ is a member of a set. 

_property_ ( [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property))

 A specific aspect, characteristic, attribute, or relation used to describe _resources_. 

_property URI_

 A _URI_ that identifies a single _property_. 

_property-value pair_

 The combination of a _property_ and a _value_, used to describe a _resource_. 

_record_

 An instantiation of a _description set_, created according to one of the DCMI encoding guidelines (for example, XHTML meta tags, XML and RDF/XML). 

_resource_ ( [http://www.w3.org/2000/01/rdf-schema#Resource](http://www.w3.org/2000/01/rdf-schema#Resource))

 Anything that might be identified. Familiar examples include an electronic document, an image, a service (for example, "today's weather report for Los Angeles"), and a collection of other _resources_. Not all _resources_ are network "retrievable"; for example, human beings, corporations, concepts and bound books in a library can also be considered _resources_. 

_rich representation_

 A sequence of octets that represents the _value_ -- for example, some marked-up text, an image, a video, some audio, or some combination thereof. 

_statement_

 An instantiation of a _property-value pair_ made up of a _property URI_ (a _URI_ that identifies a _property_), zero or one _value URI_ (a _URI_ that identifies the _value_ associated with the _property_), zero or one _vocabulary encoding scheme URI_ (a _URI_ that identifies the _vocabulary encoding scheme_ of which the _value_ is a member), and zero or more _value representations_ of the _value_. 

_sub-class of_ ( [http://www.w3.org/2000/01/rdf-schema#subClassOf](http://www.w3.org/2000/01/rdf-schema#subClassOf))

 A relationship between two _classes_ which indicates that the two _classes_ are defined such that all _resources_ that are instances of the sub-_class_ are also instances of the related _class_). 

_sub-property of_ ( [http://www.w3.org/2000/01/rdf-schema#subPropertyOf](http://www.w3.org/2000/01/rdf-schema#subPropertyOf))

 A relationship between two _properties_ which indicates that the two _properties_ are defined such that whenever a _resource_ is related to a _value_ by the sub-_property_, it follows that the _resource_ is also related to that same _value_ by the _property_. 

_syntax encoding scheme_ ( [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype))

 A set of strings and an associated set of rules that describe a mapping between that set of strings and a set of _resources_. The mapping rules may define how the string is structured (for example DCMI Box) or they may simply enumerate all the strings and the corresponding resources (for example ISO 3166). 

_syntax encoding scheme URI_

 A _URI_ that identifies a _syntax encoding scheme_. 

_term_

 A _property_ (_element_), _class_, _vocabulary encoding scheme_, or _syntax encoding scheme_. 

_URI_

 A Uniform Resource Identifier (URI) or Internationalized Resource Identifier (IRI). 

_value_

 The physical or conceptual entity (a _resource_) that is associated with a _property_ when a _property-value pair_ is used to describe a _resource_. 

_value URI_

 A _URI_ that identifies the _value_. 

_value representation_

 A surrogate for (i.e. a representation of) the _value_. 

_value string_

 A string, optionally associated with either a _syntax encoding scheme URI_ or a _value string language_, which represents the _value_. 

_value string language_

 An ISO language tag that indicates the language of the _value string_. 

_vocabulary_

 A set of one or more _terms_. 

_vocabulary encoding scheme_ ( [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme))

 An enumerated set of _resources_. 

_vocabulary encoding scheme URI_

 A _URI_ that identifies a _vocabulary encoding scheme_. 
### Appendix A - Relationship to legacy DCMI Grammatical Principles

The underlying model for Dublin Core metadata has evolved since first formalisms were proposed in the late 1990s. The following table presents rough terminological equivalences between earlier versions of DCMI _grammatical principles_ and the current DCMI Abstract Model.

<table>
  <tbody>
    <tr>
      <td>
        <strong>DCMI Grammatical Principles</strong> </td>
      <td>
        <strong>DCMI Abstract Model</strong> </td>
    </tr>
    <tr>
      <td>
        vocabulary term </td>
      <td>
        <em>resource</em> </td>
    </tr>
    <tr>
      <td>
        element </td>
      <td>
        <em>property</em> or <em>element</em> </td>
    </tr>
    <tr>
      <td>
        element refinement </td>
      <td>
        <em>property</em> with <em>sub-property of</em> relation</td>
    </tr>
    <tr>
      <td>
        encoding scheme </td>
      <td>
        <em>syntax encoding scheme</em> or <em>vocabulary encoding scheme</em>
      </td>
    </tr>
    <tr>
      <td>
        syntax encoding scheme </td>
      <td>
        <em>syntax encoding scheme</em>
      </td>
    </tr>
    <tr>
      <td>
        qualifier </td>
      <td>
        <em>property</em>, <em>syntax encoding scheme</em>, or <em>vocabulary encoding scheme</em>
      </td>
    </tr>
    <tr>
      <td>
        vocabulary encoding scheme </td>
      <td>
        <em>vocabulary encoding scheme</em> (<a href="http://purl.org/dc/dcam/VocabularyEncodingScheme">http://purl.org/dc/dcam/VocabularyEncodingScheme</a>)</td>
    </tr>
  </tbody>
</table>


<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <strong>Table 2 - DCMI Grammatical Principles and DCMI Abstract Model</strong>
      </td>
    </tr>
  </tbody>
</table>


### Bibliography

[IRI] Duerst, M, M. Suignard, Internationalized Resource Identifiers, [http://www.ietf.org/rfc/rfc3987.txt](http://www.ietf.org/rfc/rfc3987.txt)

[RDF] Klyne, Graham and Jeremy Carroll, editors. Resource Description Framework: Concepts and Abstract Syntax, [http://www.w3.org/TR/rdf-concepts/](http://www.w3.org/TR/rdf-concepts/)

[RDFS] Brickley, Dan and R.V. Guha, editors. RDF Vocabulary Description Language 1.0: RDF Schema, [http://www.w3.org/TR/rdf-schema/](http://www.w3.org/TR/rdf-schema/)

[URI] Berners-Lee, T., R. Fielding, L. Masinter, Uniform Resource Identifier (URI): Generic Syntax, [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

* * *

These links provide access to the three UML class diagrams shown above in a form suitable for loading into [<img src="AMDraftUpdate_files/moin-www.png" alt="[WWW]" height="11" width="11">UMLet](http://www.umlet.com/) (the tool that was used to create them).

- [resource-model.uxf](http://dublincore.org/architecturewiki/AMDraftUpdate?action=AttachFile&do=get&target=resource-model.uxf)

- [dcam-description-model.uxf](http://dublincore.org/architecturewiki/AMDraftUpdate?action=AttachFile&do=get&target=dcam-description-model.uxf)

- [vocabulary-model-tb.uxf](http://dublincore.org/architecturewiki/AMDraftUpdate?action=AttachFile&do=get&target=vocabulary-model-tb.uxf)

 [RefreshCache](http://dublincore.org/architecturewiki/AMDraftUpdate?action=refresh&arena=Page.py&key=AMDraftUpdate.text_html) for this page (cached 2013-01-03 17:20:58)  

Immutable page (last edited 2007-03-23 15:23:09 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


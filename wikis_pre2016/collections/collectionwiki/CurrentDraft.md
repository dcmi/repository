---
title: "- CurrentDraft"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/collectionwiki/pages/CurrentDraft.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CurrentDraft](http://dublincore.org/collectionwiki/CurrentDraft?action=fullsearch&value=CurrentDraft&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/collectionwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/collectionwiki/FrontPage)
- [RecentChanges](http://dublincore.org/collectionwiki/RecentChanges)
- [FindPage](http://dublincore.org/collectionwiki/FindPage)
- [HelpContents](http://dublincore.org/collectionwiki/HelpContents)

Page

- [Edit](http://dublincore.org/collectionwiki/CurrentDraft?action=edit "Edit")
- [View](http://dublincore.org/collectionwiki/CurrentDraft "View")
- [Diffs](http://dublincore.org/collectionwiki/CurrentDraft?action=diff "Diffs")
- [Info](http://dublincore.org/collectionwiki/CurrentDraft?action=info "Info")
- [Subscribe](http://dublincore.org/collectionwiki/CurrentDraft?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/collectionwiki/CurrentDraft?action=raw "Raw")
- [Print](http://dublincore.org/collectionwiki/CurrentDraft?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/collectionwiki/CurrentDraft?action=AttachFile)
- [DSP2XML](http://dublincore.org/collectionwiki/CurrentDraft?action=DSP2XML)
- [DeletePage](http://dublincore.org/collectionwiki/CurrentDraft?action=DeletePage)
- [LikePages](http://dublincore.org/collectionwiki/CurrentDraft?action=LikePages)
- [LocalSiteMap](http://dublincore.org/collectionwiki/CurrentDraft?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/collectionwiki/CurrentDraft?action=SpellCheck)

Search

<form method="POST" action="/collectionwiki/CurrentDraft">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CurrentDraft_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CurrentDraft_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Dublin Core Collections Application Profile

<table>
  <tbody>
    <tr>
      <td>
        <strong>Creator:</strong> </td>
      <td>
        Dublin Core Collection Description Working Group</td>
    </tr>
    <tr>
      <td>
        <strong>Date Issued:</strong>
      </td>
      <td>
        2007-03-08 </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Replaces:</strong>
      </td>
      <td>
        <a href="http://dublincore.org/groups/collections/collection-application-profile/2006-08-24/">http://dublincore.org/groups/collections/collection-application-profile/2006-08-24/</a>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Is Replaced By:</strong>
      </td>
      <td>
        Not applicable</td>
    </tr>
    <tr>
      <td>
        <strong>Latest Version:</strong>
      </td>
      <td>
        <a href="http://dublincore.org/groups/collections/collection-application-profile/">http://dublincore.org/groups/collections/collection-application-profile/</a>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Status of Document:</strong>
      </td>
      <td>
        This is a Dublin Core Application Profile.</td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong>
      </td>
      <td>
        This document describes the application profile for collection-level 
        description developed by the Dublin Core Collection Description Working 
        Group.</td>
    </tr>
  </tbody>
</table>


### Contents

- Introduction

- Vocabularies/Namespaces Used in this DCAP

- Describing a Collection

- Describing a Catalogue or Index

- Vocabulary Encoding Schemes Uses

- Syntax Encoding Schemes Used

- Administrative Metadata

### Introduction

Note: This document presents full details of the application profile. For a summary view, see the Dublin Core Collections Application Profile Summary [APS].

**A Note on Dublin Core Application Profiles**

A Dublin Core Application Profile (DCAP) specifies how some class of DC metadata description sets is constructed, typically the class of description sets which are deployed within a metadata application or within a set of applications and services operating within some domain or community. A DCAP describes:

- The set of terms used in a class of DC metadata description sets.

- How the terms in this set are deployed in this class of DC metadata description sets. This includes the types of resources described by descriptions within these description sets,

- the properties referenced in statements in those descriptions, and how those properties are used to describe resources of the specified type.

- requirements for the the occurrence of statements using a specified property,

- constraints on the sets of values which are referenced in a statement using a specified property (vocabulary encoding schemes), and

\* constraints on the datatypes of the value strings occurring in a statement using a specified property (syntax encoding schemes).

The terms description set, description, property, value, vocabulary encoding scheme, value representation, rich representation, value string, syntax encoding scheme, and related description are used in the sense they are used in the DCMI Abstract Model [DCAM].

This document is not a description of an XML format. There may be multiple bindings of this DCAP, to XML and to other syntaxes.

### Purpose and Scope

This document describes a DC Application Profile for describing:

- a collection

- a catalogue or index, i.e. an aggregation of metadata that describes a collection

In the context of this work, a collection is any aggregation of physical and/or digital resources. The DC Collections AP is intended to provide a means of creating simple descriptions of collections suitable for a broad range of collections, as well as simple descriptions of catalogues and indexes.

### Collections and collection-level description

The term "collection" can be applied to any aggregation of physical and/or digital resources. Those resources may be of any type, so examples might include aggregations of natural objects, created objects, "born-digital" items, digital surrogates of physical items, and the catalogues of such collections (as aggregations of metadata records). The criteria for aggregation may vary: e.g. by location, by type or form of the items, by provenance of the items, by source or ownership, and so on. Collections may contain any number of items and may have varying levels of permanence.

A "collection-level description" provides a description of the collection as a unit: the resource described by a collection-level description is the collection, rather than the individual items within that collection. Collection-level descriptions are referred to in Michael Heaney's An Analytical Model of Collections and their Catalogues as "unitary finding-aids" [AMCC]. The DC Collections AP specifies how to construct a DC metadata description set that provides a collection level description.

Collection-level description enables a collection provider to

- disclose information about the content and availability of collections to users where item-level metadata does not exist or is not available, or where the provision of item-level detail is not required or appropriate

It enables a user to

- discover and locate collections of interest

- select collections to explore on the basis of a summary description

- compare collections as broadly similar objects, even where items (and/or item-level metadata) are heterogeneous

- understand conditions of access and use

- interpret collections (and items within collections)

Increasingly, many of these functions - notably the discovery, location, selection and comparison of collections - are being carried out by software acting on behalf of a human user, perhaps in accordance with user preferences or with parameters describing the scope of a particular service.

### Functional Requirements of the DC Collections AP

The DC Collections AP is intended to provide a means of creating simple descriptions of collections and catalogues or indices suitable for a broad range of collections. It is designed primarily to support the discovery and selection of collections, though it may be used to support other functions such as collection management too. It is not intended to describe every possible characteristic of every type of collection.

The aim is that the DC Collections AP should support:

- the discovery of collections and catalogues or indices of potential interest, by enabling searching on various attributes of the collection including:

  - the name or title of the collection or catalogue or index

  - the subject and coverage of the collection

  - the nature or genre of the items within the collection or catalogue or index

  - the media type or format of the items within the collection or catalogue or index

  - the entity that created the collection or catalogue or index

  - the entity that owns the collection or catalogue or index

  - relationships between collections, between catalogues or indices and between collections and catalogues or indices

- the identification of a known collection or catalogue or index, by enabling the capture and disclosure of identifying attributes such as

  - the formal identifier(s) the collection or catalogue or index

  - the name or title of the collection or catalogue or index

  - a textual description of the collection or catalogue or index

- the selection of one or more collections or catalogues or indices from amongst a number of discovered collections or catalogues or indices, by enabling the capture and disclosure of attributes such as

  - a textual description of the collection or catalogue or index

  - a description of rights held in/over the collection or catalogue or index and conditions of access and use

  - a description of the custodial history of the collection or catalogue or index

  - a description of the way in which items are added to the collection or catalogue or index

- the identification of the location of the collection or catalogue or index

- the identification of the services that provide access to the collection or catalogue or index

### Data Model

The DC Collections AP is based on a data model which is derived from that described in Michael Heaney's An Analytical Model of Collections and their Catalogues [AMCC] and Users and Information Resources: An Extension of the Analytical Model of Collections and their Catalogues into Usage and Transactions [EAMCC]. The model used here is both a subset and a simplification of that model. The entity type which in that model is referred to as "Resource Mediator" is referred to here as "Service".

Figure 1 illustrates the primary entity types and their relationships:

Fig 1: The DC Collections AP Data Model

The following definitions are used (adapted from the Analytic Model):

Collection An aggregation of Items.

Item A physical or digital resource.

Location A place where a Collection is held.

Service A system that provides access to the Items within the Collection

Catalogue or Index A resource which describes a Collection.

In the Analytic Model relationships may carry attributes; in the DC Collections AP, relationships are represented as simple properties and do not themselves carry attributes, so some of the expressivity of the model is lost in the metadata schema.

The DC Collections AP describes the use of properties to represent attributes of the collection and of the catalogue or index, and relationships between collections, between collections and catalogues or indices, and between collections, catalogue or indices, and other entities. It does not describe how to represent attributes of other entities in the model.

More specifically, the DC Collections AP supports the description of catalogues or indices. These are types of collection-description that are themselves collections. I.e. they are aggregations of items (metadata) which are descriptions of other resources.

Figure 2 summarises the relationship between a collection and catalogue or index and their constituent items. The relationship between an item in the catalogue or index and an item in the (described) collection varies depending on the nature of the catalogue or index. In some cases, there may be fairly simple correspondences between items in the catalog or index and items in the described collection; in other cases the metadata items in the catalog or index may describe groupings of items within the described collection as well as individual items, or indeed the individual items may not be described at all. Further, a catalog or index which is itself a collection may be described by a second catalogue or index. For a more detailed discussion of the nature of collection-descriptions, see the Analytical Model [AMCC]

Fig 2: Collections and Catalogues

### The Dublin Core Collections Application Profile (DC Collections AP)

The DC Collections AP specifies how to construct a DC metadata description set that includes:

- a description of one or more collections (aggregations of items)

- a description of zero or more catalogues or indices (resources which describe collections) (N.B. a collection-description is not necessarily a DC metadata description)

A description set conforming to this DCAP must contain at least one description of a collection. It may contain descriptions only of collections and catalogues or indices, or it may also include descriptions of resources of other types, related to those collections or catalogues or indices, which are referred to as values in statements about the collections or catalogues or indices. Such other resources might include the location of a collection, the services that provide access to a collection, concepts that are the subject of a collection, and agents related to the collection or catalogue or index. While this DCAP permits the inclusion of descriptions of those related resources in a description set, it does not specify the terms to be referenced in descriptions of resources other than collections and catalogues or indices.

The metadata terms referenced in the DC Collections AP are drawn from the DCMI metadata vocabularies and also from other metadata vocabularies owned by other agencies.

The DC Collections AP is independent of any particular syntax for representing description sets. Description sets conforming to the DC Collections AP may be represented using any of the conventions recommended by DCMI for expressing DC metadata based on the DCMI Abstract Model.

 [RefreshCache](http://dublincore.org/collectionwiki/CurrentDraft?action=refresh&arena=Page.py&key=CurrentDraft.text_html) for this page (cached 2012-12-21 22:39:12)  

Immutable page (last edited 2007-03-08 15:52:38 by SarahShreeves)


---
title: "- InteroperabilityLevels"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/InteroperabilityLevels.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [InteroperabilityLevels](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=fullsearch&value=InteroperabilityLevels&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

<img src="InteroperabilityLevels_files/alert.png" alt="/!\" height="15" width="15">**Redirected from page " [InteroperabilityFramework](http://dublincore.org/architecturewiki/InteroperabilityFramework?action=show)"**

[Clear message](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=show)

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/InteroperabilityLevels "View")
- [Diffs](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/InteroperabilityLevels">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="InteroperabilityLevels_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="InteroperabilityLevels_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Interoperability levels for Dublin Core metadata

Mikael Nilsson, Thomas Baker, Pete Johnston

The evolving assumptions which over the past decade have led from [<img src="InteroperabilityLevels_files/moin-www.png" alt="[WWW]" height="11" width="11">fifteen elements](http://www.ietf.org/rfc/rfc2413.txt) to the [<img src="InteroperabilityLevels_files/moin-www.png" alt="[WWW]" height="11" width="11">Singapore Framework](http://dublincore.org/documents/2008/01/14/singapore-framework/) can be captured in a layered model of interoperability. The model of levels presented here addresses the need felt in many communities to position various projects with various degrees of interoperability with Dublin Core but lacking an appropriate terminology.

The intention is to provide a "ladder of interoperability", specifying the choices, costs, and benefits involved in designing applications for increased levels interoperability.

This document describes the possible levels of interoperability with Dublin Core metadata of a specification (or application). These levels are helpful for determining the scope of a project that wants to be "Dublin Core-compatible" and to set expectations for users of "Dublin Core-compatible" specifications.

The levels come with simple litmus tests that serve as guidelines for determining the level of interoperability. The levels build on each other, so a level 3 conforming specification automatically conforms to level 1 and 2, etc.

At this point there is no wider consensus on these levels. Therefore, this document is for discussion purposes only.

[attachment:InteroperabilityLevelsDiagram.jpg](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=AttachFile&do=get&target=InteroperabilityLevelsDiagram.jpg)

### Level 1: Shared term definitions

The fifteen-element Dublin Core (as in the NISO, ISO, and IETF standards) provides a vocabulary of concepts with natural-language definitions. Leaving aside considerations of machine-processability ("formal" semantics), such vocabularies provide a basis for sharing meanings within and between groups of people -- an "informal" interoperability which does not require the use of URIs to reference terms, formally specified domains and ranges, or higher-order constructs such as the DCMI Abstract Model. For example, the reuse of DCMI term definitions and mappings to DCMI terms provided by IEEE Learning Object Metadata could be seen as providing "informal conformance" with Simple Dublin Core.

This level corresponds to using Dublin Core terms together with their natural language definitions.

- The use of the term URIs is not a requirement - terms may be referenced in any way.

- Conformance with the specified domains and ranges of the terms is not a requirement.

- Conformance with the DCAM is not a requirement.

- Historically speaking, informal interoperability with "Dublin Core" has meant use of the fifteen elements, though the concept of informal interoperability is applicable in principle to any metadata terms defined in natural language.

#### Test

- Is there a partial mapping to Simple Dublin Core, defined as "the legacy 15 elements, repeatable, used with literal strings"? If yes, the specification is informally interoperable with Dublin Core metadata.

#### Examples

- IEEE LOM reuses the DC term definition and provides a mapping to Simple Dublin Core.

### Level 2: Formal semantic interoperability

"Semantic" interoperability is based on a precise and correct use of the formal RDF semantics embodied in the RDF graph data model and in RDF-based vocabularies such as DCMI Metadata Terms. "Semantics" in this sense does not refer to well-formed natural-language definitions (which is how the word "semantics" has traditionally been used in the Dublin Core community). Rather, it refers to formally stated relationships between terms and rules for using such statements to draw automatic conclusions (logical inferences). This includes use (or inferrability) of URIs and conformance with formally specified domains, ranges, and sub-property relations. Regardless of its native encoding format, a specification could be said to be "semantically interoperable" if it were to supply a complete mapping to RDF triples, for example via a GRDDL transform.

This level corresponds to implicit or explicit use of the RDF semantics underlying DCMI terms. Thus, any usage of the terms needs to be precise in its conformance with the RDF model and the domains and ranges of terms.

- While the specification/application need not explicitly encode data using URIs, it must be possible to infer the term URIs.

- Conformance with the specified domains and ranges of the terms is a requirement.

- Conformance with the sub-property semantics of the used properties.

- Conformance with the DCAM is not a requirement.

#### Test

- Is there a **complete** mapping to RDF, that is consistent with the specified domains and ranges of the used terms? If yes, the specification is semantically interoperable with Dublin Core metadata.

#### Examples

- All RDF data is per definition semantically interoperable with Dublin Core metadata.

- All data with GRDDL transforms to RDF is semantically interoperable with Dublin Core metadata.

- (Question: what about lossy transforms?)

- Data using the 2008 specification "Expressing Dublin Core metadata in XHTML and HTML meta tags" is semantically interoperable with Dublin Core metadata.

### Level 3: Description Set syntactic interoperability

On top of the unbounded graphs specified by RDF, the DCMI Abstract Model layers the notions of bounded Descriptions and Description Sets, providing a basis for the validation and exchange of metadata records. Metadata structured according to the DCMI Abstract Model -- for example, data creating using recent syntax guidelines from DCMI -- could be said to be "DCAM-interoperable". Over and above the RDF abstract syntax, DCAM provides:

- The notion of a "description set" as a bounded entity with a specific identity -- as in the library- and repository-community notion of a "record" that can be managed.

- The notion of a "description" as a bounded entity with a specific identity, even if the description is embedded in a record.

- An extended model of "statements" as graphs using various combinations of Value URIs, Value Strings, and Vocabulary Encoding Scheme URIs. (The formal notion of Vocabulary Encoding Scheme is specific to DCAM.)

- Conventions for distinguishing between the "representation" of a described resource and the "identification" of that resource with a URI.

- Conventions for "representing" one single value resource with multiple value strings.

This level corresponds to explicit use of the DCMI Abstract Model in the metadata.

- The metadata must be structured using the DCAM notions of Descriptions and Description Sets.

- The Statements in a Description must use the structure defined by the DCAM.

#### Test

- Is there a **complete** mapping to DC-TEXT? If yes, the specification is DCAM-compatible.

#### Examples

- All data using the DCAM-compatible metadata expressions published by DCMI.

### Level 4: Description Set Profile interoperability

The specification [<img src="InteroperabilityLevels_files/moin-www.png" alt="[WWW]" height="11" width="11">Description Set Profiles: A constraint language for Dublin Core Application Profiles](http://dublincore.org/documents/dc-dsp) provides an information model and XML expression of structural constraints on a Description Set. An application such as the Scholarly Works (Eprints) Application Profile can be said to be "DSP-interoperable" if it provides formal constraints on a Description Set that are compatible with those in the Description Set Profile specification.

A related specification, Singapore Framework for Dublin Core Application Profiles outlines a package of documentation elements needed in order to present a metadata application for maximum interoperability and reusability -- elements such as Functional Requirements, a Domain Model, and a Description Set Profile covering the complete metadata set.

#### Test

- Is there a **complete** Description Set profile? If yes, the specification is interoperable on the level of the Description Set Profile specification.

#### Examples

- Eprints/SWAP (in progress).

 [RefreshCache](http://dublincore.org/architecturewiki/InteroperabilityLevels?action=refresh&arena=Page.py&key=InteroperabilityLevels.text_html) for this page (cached 2012-12-21 17:38:13)  

Immutable page (last edited 2008-10-30 17:01:06 by TomBaker)


---
title: "- DCTermsChanges"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/DCTermsChanges.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCTermsChanges](http://dublincore.org/usageboardwiki/DCTermsChanges?action=fullsearch&value=DCTermsChanges&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/DCTermsChanges?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/DCTermsChanges "View")
- [Diffs](http://dublincore.org/usageboardwiki/DCTermsChanges?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/DCTermsChanges?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/DCTermsChanges?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/DCTermsChanges?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/DCTermsChanges?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/DCTermsChanges?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/DCTermsChanges?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/DCTermsChanges?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/DCTermsChanges?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/DCTermsChanges?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/DCTermsChanges?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/DCTermsChanges">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCTermsChanges_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCTermsChanges_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Editorial changes to terms in the DCTERMS namespace

2007-03-13

In Barcelona, we have the opportunity to finalize a batch of changes to terms in the DCTERMS namespace. Attached is a draft decision text showing "before" and "after" versions of term declarations, along with an introductory section describing categories of change.

* * *

## 1. About this decision text

In 2006, the DCMI Usage Board undertook an editorial revision of terms in the Dublin Core Metadata Element Set (DCMES) in order to clarify intended semantics and bring the wording of their definitions and usage comments into line with the language of the DCMI Abstract Model [DCAM]. After a Public Comment period, these changes were finalized as a Usage Board decision [DCMES-CHANGES].

The changes reflected in this document follow the change categories used to revise terms of the Dublin Core Metadata Element Set and apply them to terms of DCTERMS namespace. In addition to these "systematic" changes, other editorial corrections or updates have been undertaken, as noted below.

The wordings recorded here are reflected in revised versions of the documents "DCMI Metadata Terms" [DCTERMS], and "DCMI Metadata Terms: A complete historical record" [DCTERMS-HISTORY].

All of the changes recorded here were evaluated by the DCMI Usage Board in light of the DCMI Namespace Policy [NAMESPACE]. The namespace policy says that DCMI terms are identified using Uniform Resource Identifiers (URIs). In accordance with the principle that distinct URIs should be assigned to distinct resources, the policy sets limits on the range of editorial changes that may allowably be made to the official labels, definitions, and usage comments associated with DCMI terms. By policy, any changes of meaning judged "likely to have a substantial impact on either machine processing of DCMI terms or the functional semantics of the terms" must trigger the creation of a new, distinct term with a new, distinct URI.

In the opinion of the Usage Board, the changes described in this document are unlikely to have a substantial impact on either machine processing of DCMI terms or the functional semantics of the terms -- i.e., they fall within the allowable range of editorial change. The changes constitute clarifications of term semantics in light of improved theoretical understanding, user feedback, and implementation experience. They provide the final twist of the lens that brings intended meanings more sharply into focus.

- [DCMES-CHANGES] [http://dublincore.org/usage/decisions/2006/2006-03.dcmes-changes.shtml](http://dublincore.org/usage/decisions/2006/2006-03.dcmes-changes.shtml)

- [DCTERMS] [http://dublincore.org/documents/dcmi-terms/](http://dublincore.org/documents/dcmi-terms/)

- [DCTERMS-HISTORY] [http://dublincore.org/usage/terms/history/](http://dublincore.org/usage/terms/history/)

- [NAMESPACE] [http://dublincore.org/documents/dcmi-namespace/](http://dublincore.org/documents/dcmi-namespace/)

## General categories of change

### Free-standing descriptive labels

[Two or three sentences may be needed here on why "qualifiers" were named as adjectives in the first place?]

This change is relevant to the definitions of:

- dcterms:alternative: "Alternative" to "Alternative title"

- dcterms:available: "Date available"

- dcterms:created: "Date created"

- dcterms:issued: "Date issued"

- dcterms:modified: "Date modified"

- dcterms:valid: "Date valid"

- dcterms:spatial: "Spatial coverage"

- dcterms:temporal: "Temporal coverage"

### Replacement of "content of the resource" with just "the resource"

This change is relevant to the definitions of:

- dcterms:abstract

- dcterms:tableOfContents

- dcterms:isFormatOf - CHECK

- dcterms:hasFormat - CHECK

- dcterms:spatial

- dcterms:temporal

- dcterms:DCMIType

### Replacement of "reference to a resource" with just "a resource"

This change is relevant to the definitions of:

- dcterms:conformsTo

- Note, however, dcterms:bibliographicCitation.

### "Use a controlled vocabulary"

Replacement of phrases such as "use a value from an encoding scheme" and "select a value from a controlled vocabulary" with "use a controlled vocabulary". NOTE: REMOVED THESE!!

- This change is relevant to the comments for:

  - dcterms:accrualMethod

  - dcterms:accrualPeriodicity

  - dcterms:accrualPolicy

### "Qualifies" statements

In the DCMI Abstract Model, the only connection between a property (e.g., dcterms:subject) and a Vocabulary Encoding Scheme is

Thus, if it's a collection of Dates, they fit as values of dc:date, etc, all according to the range of the relevant property.

The set of terms itself does not say anything about their usefulness for a given property. Naturally, the documentation of a VES might say that the terms are all useful as values of dc:subject etc, but we have no formal way of saying that (and should not have I think).

### Subproperty relations between terms in the /1.1/ namespace

Is this the time to add those relations to the copied terms in the /terms/ namespace?

- dcterms:creator rdfs:subPropertyOf dcterms:contributor

- dcterms:coverage rdfs:subPropertyOf dcterms:subject

- dcterms:source rdfs;subPropertyOf dcterms;relation

- Justification: clarifies semantics.

## Changes term-by-term

### http://purl.org/dc/terms/creator

- Sub-Property-Of: [http://purl.org/dc/terms/contributor](http://purl.org/dc/terms/contributor) @OK

### http://purl.org/dc/terms/source

- Sub-Property-Of: [http://purl.org/dc/terms/relation](http://purl.org/dc/terms/relation) @OK

### http://purl.org/dc/terms/audience

- Label: Audience

- Definition: A class of entity for whom the resource is intended or useful.

- Comment: A class of entity may be determined by the creator or the publisher or by a third party.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

After:

- Definition: A class of entity for whom the resource is intended or useful.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Comment deleted. @OK

### http://purl.org/dc/terms/alternative

- Label: Alternative

- Definition: Any form of the title used as a substitute or alternative to the formal title of the resource.

- Comment: This qualifier can include Title abbreviations as well as translations.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/title](http://purl.org/dc/elements/1.1/title)

**After:**

- Label: Alternative Title

- Definition: An alternative name for the resource.

- Comment: The distinction between titles and alternative titles is application-specific.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/title](http://purl.org/dc/elements/1.1/title)

**Changes:**

- Clearer label and comment. @OK

### http://purl.org/dc/terms/tableOfContents

- Label: Table Of Contents

- Definition: A list of subunits of the content of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**After:**

- Definition: A list of subunits of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**Changes:**

- Issue "content of the resource". @OK

### http://purl.org/dc/terms/abstract

- Label: Abstract

- Definition: A summary of the content of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**After:**

- Definition: A summary of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**Changes:**

- Issue "content of the resource". @OK

### http://purl.org/dc/terms/created

- Label: Created

- Definition: Date of creation of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Label: Date Created

- Definition: Date of creation of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/valid

- Label: Valid

- Definition: Date (often a range) of validity of a resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Label: Date Valid

- Definition: Date (often a range) of validity of a resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/available

- Label: Available

- Definition: Date (often a range) that the resource will become or did become available.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Label: Date Available

- Definition: Date (often a range) that the resource became or will become available.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/issued

- Label: Issued

- Definition: Date of formal issuance (e.g., publication) of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Label: Date Issued

- Definition: Date of formal issuance (e.g., publication) of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/modified

- Label: Modified

- Definition: Date on which the resource was changed.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Label: Date Modified

- Definition: Date on which the resource was changed.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/extent

- Label: Extent

- Definition: The size or duration of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**After:**

- Definition: The size or duration of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**Changes:**

- Issue "freestanding descriptive labels" @OK

### http://purl.org/dc/terms/medium

- Label: Medium

- Definition: The material or physical carrier of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**After:**

- Definition: The material or physical carrier of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**Changes:**

- No changes. @OK

### http://purl.org/dc/terms/isVersionOf

- Label: Is Version Of

- Definition: The described resource is a version, edition, or adaptation of the referenced resource. Changes in version imply substantive changes in content rather than differences in format.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource of which the described resource is a version, edition, or adaptation.

- Comment: Changes in version imply substantive changes in content rather than differences in format.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource".

- Part of definition turned into a comment. @OK

### http://purl.org/dc/terms/hasVersion

- Label: Has Version

- Definition: The described resource has a version, edition, or adaptation, namely, the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is a version, edition, or adaptation of the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

 @OK 
### http://purl.org/dc/terms/isReplacedBy

- Label: Is Replaced By

- Definition: The described resource is supplanted, displaced, or superseded by the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that supplants, displaces, or supersedes the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/replaces

- Label: Replaces

- Definition: The described resource supplants, displaces, or supersedes the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is supplanted, displaced, or superseded by the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/isRequiredBy

- Label: Is Required By

- Definition: The described resource is required by the referenced resource, either physically or logically.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that requires the described resource to support its function, delivery, or coherence.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/requires

- Label: Requires

- Definition: The described resource requires the referenced resource to support its function, delivery, or coherence of content.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is required by the described resource to support its function, delivery, or coherence.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource".

- @@@ Dropped reference to "content" @OK

### http://purl.org/dc/terms/isPartOf

- Label: Is Part Of

- Definition: The described resource is a physical or logical part of the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource in which the described resource is physically or logically included.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/hasPart

- Label: Has Part

- Definition: The described resource includes the referenced resource either physically or logically.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is included either physically or logically in the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/isReferencedBy

- Label: Is Referenced By

- Definition: The described resource is referenced, cited, or otherwise pointed to by the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that references, cites, or otherwise points to the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/references

- Label: References

- Definition: The described resource references, cites, or otherwise points to the referenced resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is referenced, cited, or otherwise pointed to by the described resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/isFormatOf

- Label: Is Format Of

- Definition: The described resource is the same intellectual content of the referenced resource, but presented in another format.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is substantially the same as the described resource, but in another format.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/hasFormat

- Label: Has Format

- Definition: The described resource pre-existed the referenced resource, which is essentially the same intellectual content presented in another format.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: A related resource that is substantially the same as the pre-existing described resource, but in another format.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/conformsTo

- Label: Conforms To

- Definition: A reference to an established standard to which the resource conforms.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: An established standard to which the resource conforms.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Changes:**

- Issue "reference to a resource". @OK

### http://purl.org/dc/terms/spatial

- Label: Spatial

- Definition: Spatial characteristics of the intellectual content of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

**After:**

- Label: Spatial Coverage

- Definition: Spatial characteristics of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

**Changes:**

- Issue "freestanding property label".

- Issue "content of the resource". @OK

### http://purl.org/dc/terms/temporal

- Label: Temporal

- Definition: Temporal characteristics of the intellectual content of the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

**After:**

- Label: Temporal Coverage

- Definition: Temporal characteristics of the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

**Changes:**

- Issue "freestanding property label".

- Issue "content of the resource". @OK

### http://purl.org/dc/terms/mediator

- Label: Mediator

- Definition: A class of entity that mediates access to the resource and for whom the resource is intended or useful.

- Comment: The audiences for a resource are of two basic classes: (1) an ultimate beneficiary of the resource, and (2) frequently, an entity that mediates access to the resource. The mediator element refinement represents the second of these two classes.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

**After:**

- Definition: A class of entity that mediates access to the resource and for whom the resource is intended or useful.

- Comment: In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

**Changes:**

- Comment is a list. @OK

### http://purl.org/dc/terms/dateAccepted

- Definition: Date of acceptance of the resource (e.g. of thesis by university department, of article by journal, etc.).

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Definition: Date of acceptance of the resource.

- Comment: Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Issue "moving parts of definitions to comments". @OK

### http://purl.org/dc/terms/dateCopyrighted

- Definition: Date of a statement of copyright.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Definition: Date of copyright.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Definition. @OK

### http://purl.org/dc/terms/dateSubmitted

- Label: Date Submitted

- Definition: Date of submission of the resource (e.g. thesis, articles, etc.).

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**After:**

- Definition: Date of submission of the resource.

- Comment: Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal).

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Changes:**

- Better comment. @OK

### http://purl.org/dc/terms/educationLevel

- Label: Audience Education Level

- Definition: A general statement describing the education or training context. Alternatively, a more specific

 statement of the location of the audience in terms of its progression through an education or training context. - Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

**After:**

- Definition: A class of entity, defined in terms of progression through an educational or training context, for whom the resource is intended.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

**Changes:**

- A special case, see: [http://stage.dublincore.org/usage/meetings/2006/09/manzanillo/domains-ranges/2006-04-30.educationLevel.txt](http://stage.dublincore.org/usage/meetings/2006/09/manzanillo/domains-ranges/2006-04-30.educationLevel.txt)

- Changed definition: replaced "audience" with "a class of entity" and remove "its". Justification: parallel construction. @OK

### http://purl.org/dc/terms/accessRights

- Label: Access Rights

- Definition: Information about who can access the resource or an indication of its security status.

- Comment: Access Rights may include information regarding access or restrictions based on privacy, security or other regulations.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

**After:**

- Definition: Information about who can access the resource or an indication of its security status.

- Comment: Access Rights may include information regarding access or restrictions based on privacy, security, or other policies.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

**Changes:**

- Changed comment (substitutes policies for regulations). @OK

### http://purl.org/dc/terms/bibliographicCitation

- Label: Bibliographic Citation

- Definition: A bibliographic reference for the resource.

- Comment: Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible, whether or not the citation is in a standard form.

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

**After:**

- Definition: A bibliographic reference for the resource.

- Comment: Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

**Changes:**

- No changes. @OK

### http://purl.org/dc/terms/license

- Label: License

- Definition: A legal document giving official permission to do something with the resource.

- Comment: Recommended best practice is to identify the license using a URI. Examples of such licenses can be found at [http://creativecommons.org/licenses/](http://creativecommons.org/licenses/).

- Type of term: [http://dublincore.org/usage/documents/principles/#element-refinement](http://dublincore.org/usage/documents/principles/#element-refinement)

- subPropertyOf: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

**After:**

- Definition: A legal document giving official permission to do something with the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

- subPropertyOf: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

**Changes:**

- Removed comment: we don't say anything about value URI in any other comment AND it's an application profile issue as to whether or not a value has a URI, therefore we don't need the Creative Commons example. @OK

### http://purl.org/dc/terms/rightsHolder

- Label: Rights Holder

- Definition: A person or organization owning or managing rights over the resource.

- Comment: Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: A person or organization owning or managing rights over the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Removed comment: Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity. @OK

### http://purl.org/dc/terms/provenance

- Label: Provenance

- Definition: A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity and interpretation.

- Comment: The statement may include a description of any changes successive custodians made to the resource.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation.

- Comment: The statement may include a description of any changes successive custodians made to the resource.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- No change. @OK

### http://purl.org/dc/terms/instructionalMethod

- Label: Instructional Method

- Definition: A process, used to engender knowledge, attitudes and skills, that the resource is designed to support.

- Comment: Instructional Method will typically include ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support.

- Comment: Instructional Method will typically include ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Issue "described resource". @OK

### http://purl.org/dc/terms/accrualMethod

- Label: Accrual Method

- Definition: The method by which items are added to a collection.

- Comment: Recommended best practice is to use a value from a controlled vocabulary.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: The method by which items are added to a collection.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Issue "use a controlled vocabulary" removed. @OK

### http://purl.org/dc/terms/accrualPeriodicity

- Label: Accrual Periodicity

- Definition: The frequency with which items are added to a collection.

- Comment: Recommended best practice is to use a value from a controlled vocabulary.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: The frequency with which items are added to a collection.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Issue "use a controlled vocabulary" removed. @OK

### http://purl.org/dc/terms/accrualPolicy

- Label: Accrual Policy

- Definition: The policy governing the addition of items to a collection.

- Comment: Recommended best practice is to use a value from a controlled vocabulary.

- Type of term: [http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)

**After:**

- Definition: The policy governing the addition of items to a collection.

- Type of term: [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property)

**Changes:**

- Issue "use a controlled vocabulary" removed. @OK

### http://purl.org/dc/terms/LCSH

- Label: LCSH

- Definition: Library of Congress Subject Headings

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by Library of Congress Subject Headings.

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "The set of concepts..." @OK

### http://purl.org/dc/terms/MESH

- Label: MeSH

- Definition: Medical Subject Headings

- See: [http://www.nlm.nih.gov/mesh/meshhome.html](http://www.nlm.nih.gov/mesh/meshhome.html)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by Medical Subject Headings.

- See: [http://www.nlm.nih.gov/mesh/meshhome.html](http://www.nlm.nih.gov/mesh/meshhome.html)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "The set of concepts..." @OK

### http://purl.org/dc/terms/DDC

- Label: DDC

- Definition: Dewey Decimal Classification

- See: [http://www.oclc.org/dewey/](http://www.oclc.org/dewey/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by Dewey Decimal Classification.

- See: [http://www.oclc.org/dewey/](http://www.oclc.org/dewey/)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "The set of concepts..." @OK

### http://purl.org/dc/terms/LCC

- Label: LCC

- Definition: Library of Congress Classification

- See: [http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html](http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by Library of Congress Classification.

- See: [http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html](http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "The set of concepts..." @OK

### http://purl.org/dc/terms/UDC

- Label: UDC

- Definition: Universal Decimal Classification

- See: [http://www.udcc.org/](http://www.udcc.org/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by Universal Decimal Classification.

- See: [http://www.udcc.org/](http://www.udcc.org/)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "The set of concepts..." @OK

### http://purl.org/dc/terms/DCMIType

- Label: DCMI Type Vocabulary

- Definition: A list of types used to categorize the nature or genre of the content of the resource.

- See: [http://dublincore.org/documents/dcmi-type-vocabulary/](http://dublincore.org/documents/dcmi-type-vocabulary/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/type](http://purl.org/dc/elements/1.1/type)

**After:**

- Definition: A set of concepts used to categorize the nature or genre of the resource.

- See: [http://dublincore.org/documents/dcmi-type-vocabulary/](http://dublincore.org/documents/dcmi-type-vocabulary/)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "A set of concepts..."

- Content of the resource @OK

### http://purl.org/dc/terms/IMT

- Label: IMT

- Definition: The Internet media type of the resource.

- See: [http://www.iana.org/assignments/media-types/](http://www.iana.org/assignments/media-types/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**After:**

- Definition: A set of concepts defined by IANA used to indicate the media type of the resource.

- See: [http://www.iana.org/assignments/media-types/](http://www.iana.org/assignments/media-types/)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- "Set of concepts" @OK

### http://purl.org/dc/terms/ISO639-2

- Label: ISO 639-2

- Definition: ISO 639-2: Codes for the representation of names of languages.

- See: [http://lcweb.loc.gov/standards/iso639-2/langhome.html](http://lcweb.loc.gov/standards/iso639-2/langhome.html)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/language](http://purl.org/dc/elements/1.1/language)

**After:**

- Definition: The set of three-letter codes listed in ISO639-2 for the representation of names of languages.

- See: [http://lcweb.loc.gov/standards/iso639-2/langhome.html](http://lcweb.loc.gov/standards/iso639-2/langhome.html)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- "Set of codes".

- Note: we recognize a set of concepts for language, however, interpreting the ISO639-2 as a set of concepts would break the namespace policy because ISO639-2 is a set of strings (defined by ISO and us). @OK

### http://purl.org/dc/terms/RFC1766

- Label: RFC 1766

- Definition: Internet RFC 1766 'Tags for the identification of Language'

 specifies a two letter code taken from ISO 639, followed optionally by a two letter country code taken from ISO 3166. - See: [http://www.ietf.org/rfc/rfc1766.txt](http://www.ietf.org/rfc/rfc1766.txt)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/language](http://purl.org/dc/elements/1.1/language)

**After:**

- Definition: The set of tags, constructed according to RFC 1766, for the identification of languages.

- See: [http://www.ietf.org/rfc/rfc1766.txt](http://www.ietf.org/rfc/rfc1766.txt)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- "Set of tags." @OK

### http://purl.org/dc/terms/URI

- Label: URI

- Definition: A URI Uniform Resource Identifier

- See: [http://www.ietf.org/rfc/rfc2396.txt](http://www.ietf.org/rfc/rfc2396.txt)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

- Qualifies: [http://purl.org/dc/elements/1.1/source](http://purl.org/dc/elements/1.1/source)

- Qualifies: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**After:**

- Definition: The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as defined by the IETF.

- See: [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- RFC 2396 has been obsoleted by RFC 3986.

- Removed "qualifies"

- "Set of identifiers" @OK

### http://purl.org/dc/terms/Point

- Label: DCMI Point

- Definition: The DCMI Point identifies a point in space using its geographic coordinates.

- See: [http://dublincore.org/documents/dcmi-point/](http://dublincore.org/documents/dcmi-point/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial)

**After:**

- Definition: The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme.

- See: [http://dublincore.org/documents/dcmi-point/](http://dublincore.org/documents/dcmi-point/)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies" @OK

### http://purl.org/dc/terms/ISO3166

- Label: ISO 3166

- Definition: ISO 3166 Codes for the representation of names of countries

- See: [http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html](http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial)

**After:**

- Definition: The set of codes listed in ISO 3166-1 for the representation of names of countries.

- See: [http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html](http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- "Set of codes" @OK

### http://purl.org/dc/terms/Box

- Label: DCMI Box

- Definition: The DCMI Box identifies a region of space using its geographic limits.

- See: [http://dublincore.org/documents/dcmi-box/](http://dublincore.org/documents/dcmi-box/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial)

**After:**

- Definition: The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme.

- See: [http://dublincore.org/documents/dcmi-box/](http://dublincore.org/documents/dcmi-box/)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- "Set of regions in space" @OK

### http://purl.org/dc/terms/TGN

- Label: TGN

- Definition: The Getty Thesaurus of Geographic Names

- See: [http://www.getty.edu/research/tools/vocabulary/tgn/index.html](http://www.getty.edu/research/tools/vocabulary/tgn/index.html)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial)

**After:**

- Definition: The set of places defined by the Getty Thesaurus of Geographic Names.

- See: [http://www.getty.edu/research/tools/vocabulary/tgn/index.html](http://www.getty.edu/research/tools/vocabulary/tgn/index.html)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- Set of @OK

### http://purl.org/dc/terms/Period

- Label: DCMI Period

- Definition: A specification of the limits of a time interval.

- See: [http://dublincore.org/documents/dcmi-period/](http://dublincore.org/documents/dcmi-period/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

- Qualifies: [http://purl.org/dc/terms/temporal](http://purl.org/dc/terms/temporal)

**After:**

- Definition: The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme.

- See: [http://dublincore.org/documents/dcmi-period/](http://dublincore.org/documents/dcmi-period/)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- Set of @OK

### http://purl.org/dc/terms/W3CDTF

- Label: W3C-DTF

- Definition: W3C Encoding rules for dates and times - a profile based on ISO 8601

- See: [http://www.w3.org/TR/NOTE-datetime](http://www.w3.org/TR/NOTE-datetime)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

- Qualifies: [http://purl.org/dc/terms/temporal](http://purl.org/dc/terms/temporal)

**After:**

- Definition: The set of dates and times constructed according to the W3C Date and Time Formats Specification.

- See: [http://www.w3.org/TR/NOTE-datetime](http://www.w3.org/TR/NOTE-datetime)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- Set of @OK

### http://purl.org/dc/terms/RFC3066

- Label: RFC 3066

- Definition: Internet RFC 3066 'Tags for the Identification of Languages' specifies a primary subtag which is a two-letter code taken from ISO 639 part 1 or a three-letter code taken from ISO 639 part 2, followed optionally by a two-letter country code taken from ISO 3166. When a language in ISO 639 has both a two-letter and three-letter code, use the two-letter code; when it has only a three-letter code, use the three-letter code. This RFC replaces RFC 1766.

- See: [http://www.ietf.org/rfc/rfc3066.txt](http://www.ietf.org/rfc/rfc3066.txt)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/language](http://purl.org/dc/elements/1.1/language)

**After:**

- Definition: The set of tags, constructed according to RFC 3066, for the identification of languages.

- Comment: RFC 3066 has been obsoleted by RFC 4646.

- See: [http://www.ietf.org/rfc/rfc3066.txt](http://www.ietf.org/rfc/rfc3066.txt)

- Type of term: [http://www.w3.org/2000/01/rdf-schema#Datatype](http://www.w3.org/2000/01/rdf-schema#Datatype)

**Changes:**

- Removed "qualifies"

- Added comment @OK

### http://purl.org/dc/terms/NLM

- Label: NLM

- Definition: National Library of Medicine Classification

- See: [http://wwwcf.nlm.nih.gov/class/](http://wwwcf.nlm.nih.gov/class/)

- Type of term: [http://dublincore.org/usage/documents/principles/#encoding-scheme](http://dublincore.org/usage/documents/principles/#encoding-scheme)

- Qualifies: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**After:**

- Definition: The set of concepts defined by the National Library of Medicine Classification.

- See: [http://wwwcf.nlm.nih.gov/class/](http://wwwcf.nlm.nih.gov/class/)

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- Set of @OK

### http://purl.org/dc/terms/RFC4646
**After:**
- Label: RFC 4646

- Definition: The set of tags, constructed according to RFC 4646, for the identification of languages.

- Comment: RFC 4646 obsoletes RFC 3066.

- Type of term: [http://purl.org/dc/dcam/VocabularyEncodingScheme](http://purl.org/dc/dcam/VocabularyEncodingScheme)

**Changes:**

- Removed "qualifies"

- Set of @OK

REFERENCES

- [DC-GENERAL] [http://www.jiscmail.ac.uk/lists/dc-general.html](http://www.jiscmail.ac.uk/lists/dc-general.html)

- [DCAM] [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)

- [DCMES-CHANGES] [http://dublincore.org/usage/decisions/2006/2006-03.dcmes-changes.shtml](http://dublincore.org/usage/decisions/2006/2006-03.dcmes-changes.shtml)

- [DCMITERMS] [http://dublincore.org/documents/2005/06/13/dcmi-terms/](http://dublincore.org/documents/2005/06/13/dcmi-terms/)

- [DCTERMS-HISTORY] [http://dublincore.org/usage/terms/history/](http://dublincore.org/usage/terms/history/)

- [DCTERMS] [http://dublincore.org/documents/dcmi-terms/](http://dublincore.org/documents/dcmi-terms/)

- [MANZANILLO-DECISIONS] [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0611&L=dc-usage&P=1110](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0611&L=dc-usage&P=1110)

- [MANZANILLO] [http://dublincore.org/usage/meetings/2006/09/manzanillo/dcmes-changes/html/](http://dublincore.org/usage/meetings/2006/09/manzanillo/dcmes-changes/html/)

- [NAMESPACE] [http://dublincore.org/documents/dcmi-namespace/](http://dublincore.org/documents/dcmi-namespace/)

- [PUBLIC-COMMENT] [http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/](http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/)

 [RefreshCache](http://dublincore.org/usageboardwiki/DCTermsChanges?action=refresh&arena=Page.py&key=DCTermsChanges.text_html) for this page (cached 2013-01-05 01:37:27)  

Immutable page (last edited 2007-06-23 15:30:09 by TomBaker)


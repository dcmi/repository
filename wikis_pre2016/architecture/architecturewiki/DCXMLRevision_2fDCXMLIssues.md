---
title: "- DCXMLRevision/DCXMLIssues"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLIssues.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLIssues](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=fullsearch&value=%2FDCXMLIssues&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLIssues">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLIssues_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLIssues_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Issues in the current draft

### Issue 1: Functionality/Scope

#### Problem

The proposed format supports the whole of the "description model" described by the DCAM. Often implementers require only a subset of that model (e.g. they require the capacity to specify only a single value string as value representation in each statement). As the proposed format supports the whole of the DCAM, it supports any subset, but at the cost of some complexity/"verbosity" in the syntax which may be perceived as redundant by implementers interested only in some subset.

#### Solutions

- Design "shortcut" features within a single format? But then processors/consumers have to handle multiple ways of encoding single construct

- Offer alternate formats for full DCAM and subset of DCAM? But what subset? Also challenge of documenting/managing/disseminating multiple formats, parallel schemas etc. Processors/consumers have to handle multiple formats

#### Proposal

Circulate "full description model" proposal for comment in first instance.

### Issue 2: URIs and XML QNames

#### Problem

The proposed format allows the representation of some URIs **only** as QNames (property URIs), some URIs either in full or as QNames (vocabulary and syntax encoding scheme URIs), and some URIs only in full (resource and value URIs). This may be perceived as inconsistent.

The capacity to encode URIs in full is required as not all URIs can be represented as QNames.

Metadata creators/providers may prefer the convenience/flexibility of using QNames for URIs, but allowing both full URI and URI-as-QName encodings increases complexity for the metadata processor/consumer.

Also limitations in processing XML QNames in XSLT 1.0.

#### Solutions

- Adopt current version

- Remove option for QName representation for Vocab/Syntax Encoding Scheme URIs

- Allow QNames representations and URIs for resource URIs and value URIs (though additional XML attributes)

- Allow QNames representations and URIs for resource URIs, value URIs and property URIs (using XML attributes for property URIs rather than XML element names)

#### Proposal

Circulate current proposal for comment; revise in response to coomments if necessary.

### Issue 3: Names of XML elements/attributes

#### Problem

Some of the XML element type names/XML attribute names are quite long. While this may make individual names more comprehensible to a human reader, it makes XML instances longer.

#### Solutions

- Abbreviate element/attribute names (e.g. dcx:vesURI etc)

#### Proposal

Circulate current proposal for comment; revise in response to coomments if necessary.

### Issue 4: Relationship of new specification to ''Guidelines for implementing Dublin Core in XML''

#### Problem

The XML format described by _Guidelines for implementing Dublin Core in XML_ was not based on the DCMI Abstract Model, but rather on a simpler model. That simpler model is not a subset of the DCAM, and there is no unambiguous mapping of that format to the DCAM.

#### Solutions

- Explanation of rationale for DC-XML

#### Proposal

### Issue 5: GRDDL

#### Problem

DC-XML -> RDF/XML XSLT transform is still work-in-progress. Needs to be updated in line with work on DC in RDF.

Can associate transform with instance via "namespace document" rather than embedding reference in each instance. Probably better solution once XML Namespace Names confirmed/stable etc.

#### Solutions

\* Complete XSLT transform to reflect DC in RDF spec; and set up GRDDL from "namespace document" - implementers can choose whether to refer to transform in instance.

#### Proposal

Note to readers that current examples incomplete. May change once specs complete/stable.

### Issue 6: Validation Issues

#### Problem

XML Schema validation: Default content models permissive. Tighter validation requires creation of derived complexTypes. Then either

- (in schema) declare new element (using derived complexType); or

- (in instance) reference derived complexType using xsi:type

Have to do second where XML element name fixed by format. Results in lots of complexType definitions; lots of xsi:type attributes in instance. Could use xs:redefine (in schema)?

Schematron validation: XPath-based, more flexibility etc

RELAX NG: Pattern-based

#### Solutions

#### Proposal

### Issue 7: Use of xs:appinfo for "term descriptions"

#### Problem

DC-XML applications requiring "Schema Model" information about DCMI terms have to obtain that information from elsewhere (e.g. by de-referencing the "term URI" or from a metadata registry service). Is it possible/useful to embed that information in the XML Schemas?

#### Solutions

Could include RDF/XML descriptions of the properties in the corresponding XML element declarations using <tt>xs:annotation/xs:appinfo</tt>? Even so, would not be included as part of PSVI, so application still has to access/parse XML Schema.

#### Proposal

Omit from first draft, but discuss and include if required.

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLIssues?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLIssues.text_html) for this page (cached 2012-12-21 18:22:34)  

Immutable page (last edited 2006-05-22 12:02:46 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


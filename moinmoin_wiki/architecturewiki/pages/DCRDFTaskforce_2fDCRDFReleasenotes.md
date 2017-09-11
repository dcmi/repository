---
title: "- DCRDFTaskforce/DCRDFReleasenotes"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFTaskforce_2fDCRDFReleasenotes.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFTaskforce/DCRDFReleasenotes](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=fullsearch&value=%2FDCRDFReleasenotes&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCRDFTaskforce "Up")
- [Edit](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
* * *

## New Dublin Core RDF encoding guidelines released for public comment

On May 29, 2006, the DCMI released for public comment the Working Draft _Expressing Dublin Core metadata in the Resource Description Framework (RDF)_.

This Working Draft is intended to replace and deprecate the following RDF related specifications from DCMI:

- _[<img src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Simple Dublin Core in RDF/XML](http://dublincore.org/documents/dcmes-xml/)_ - DCMI Recommendation (2002-07-31)

- _[<img src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Qualified Dublin Core in RDF / XML](http://dublincore.org/documents/dcq-rdf-xml/)_ - DCMI Proposed recommendation (2002-05-15)

DCMI is seeking comments from affected communities, and the final content of a new Recommendation, if any, will ultimately depend on any feedback received from these communities.

These release notes are intended to serve as a guide for implementers to the changes introduced with the new specification.

### Background

Since 1997, the "Dublin Core data model" has evolved in a process of mutual influence with W3C's Resource Description Framework (RDF). This process has resulted in the DCMI Abstract Model (DCAM), which was published in 2005 as a DCMI Recommendation ( [<img src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-www.png" alt="[WWW]" height="11" width="11">(1)](http://dublincore.org/documents/abstract-model/). The DCMI Abstract Model now provides a reference model on the basis of which particular Dublin Core encoding guidelines ([WWW](2)) can be defined.

The new specification represents a significant step in the evolution of the Dublin Core RDF encodings. Historically, Dublin Core metadata expressed in RDF has suffered from a number of problems, including:

- the existence of two incompatible DC-in-RDF documents, one Recommendation and one Proposed Recommendation

- conflicting recommendations in the above documents for using literal strings in Dublin Core metadata

- implementation complexity due to a large number of idiosyncrasies

- difficulties in providing formal ranges and domains for Dublin Core properties

The old RDF encoding documents, having been developed before the DCAM, also contains several constructs that are incompatible with the concepts in the DCAM.

The new specification has been designed to address these issues. The result is a radical refactoring of the current recommendations, and the changes are explained in this document.

For further information, we refer to:

- the Working Draft itself

- the DCMI Architecture working group and the [<img src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-www.png" alt="[WWW]" height="11" width="11">DC-ARCHITECTURE](http://jiscmail.ac.uk/lists/DC-ARCHITECTURE.html) mailing list

### Support for domains and ranges in the new specification

The most significant change introduced by the new specification is the addition of support for domains and ranges of properties in general, and of DCMI-defined properties in particular. At the time of writing these notes, the definitions of the Dublin Core properties are in the process of being supplemented with explicit specifications of domains and ranges that were previously implicit in the wording of their definitions.

DCMI metadata terms have hitherto been defined entirely in natural language; the RDF expression of the DCMI term set (e.g., [WWW](6)) served essentially to convey these English-language definitions in a form ingestable by RDF applications. As part of the process of clarifying the RDF expression for Dublin Core metadata, it has become evident that that DCMI would benefit from supplementing these English-language definitions with machine-understandable definitions of the domain and range of DCMI metadata terms ( [<img src="DCRDFTaskforce_2fDCRDFReleasenotes_files/moin-www.png" alt="[WWW]" height="11" width="11">(5)](http://dublincore.org/architecturewiki/DCPropertyDomainsRanges)). Such additional, machine-understandable precision is necessary as Dublin Core is deployed in the context of inference engines and ontology-based solutions.

#### Deprecating Literal values of properties that do not have Literal range

For most DCMI metadata terms, the process of clarifying domains and ranges machine-understandably is straightforward and unambiguous. However, one problem with regard to legacy metadata usage is serious enough to bear closer consideration. In the early years, the Dublin Core community distinguished between Simple and Qualified Dublin Core -- a distinction which was reflected in the difference between the specifications "Expressing Simple Dublin Core in RDF/XML" and the "Expressing Qualified Dublin Core in RDF / XML".

The two legacy specifications differ with regard to whether properties such as dc:creator and dc:date have values that are non-literal resources (e.g., a Person or a Date, seen as entities), or strings representing the resources (i.e., a value string). In "Expressing Simple Dublin Core in RDF/XML", a dc:creator is a name:

< [http://www.example.com>](http://www.example.com%3E/) dc:creator "John Smith".

In "Expressing Qualified Dublin Core in RDF / XML", in contrast, a dc:creator is an entity, as in:

< [http://www.example.com>](http://www.example.com%3E/) dc:creator < [http://www.example.org/person32>](http://www.example.org/person32%3E)

or

< [http://www.example.com>](http://www.example.com%3E/) dc:creator \_:xxx. \_:xxx rdf:type foaf:Person \_:xxx dcrdf:valueString "John Smith"

The new specification follows the latter approach -- dc:creator refers to an entity which can be identified (e.g., in an authority file) and described in its own right (e.g., with a name, an affiliation, and a birth date). The English-language definitions of these terms bear out this interpretation; dc:creator is "an entity primarily responsible for making the content of the resource", examples being "a person, an organization, or a service". However, the usage comments associated with these definitions also reflect the ambiguity: "Typically, the name of a Creator should be used to indicate the entity".

In accordance with the current approach, the DCMI Usage Board is assigning a range of "Agent" to dc:creator and dc:contributor, where "Agent" would be defined as "the class of all things that are a Person, Organization, or Service". If it is used at all, the range "Literal" would apply only to metadata terms which are typically associated with value strings, such as dc:title. In most cases, the ranges to be defined are reasonably obvious given usage patterns in practice.

Due to the ambiguous usage of dc:creator and dc:contributor over the years, however, the assignment of any range would make one or another part of the legacy metadata appear invalid in the context of machine processing. Declaring "Agent" as the range of dc:creator will mean that inferencing applications will expect to treat the value of the dc:creator property as a non-literal entity. Where legacy metadata represents names as literal values for dc:creator, applications will need to treat these as "special cases" in order to merge them with metadata which associate those names with the expected non-literal entity constructs.

The existing specifications from the DCMI have not taken these applications into account, which has resulted in an unknown amount of Dublin Core-based RDF data that is inconsistent with the definitions of the Dublin Core properties. The mentioned changes have been judged necessary, albeit painful, to ensure the long-term viability of Dublin Core in RDF.

See also below for a further discussion on RDF Datatypes.

#### Impact on legacy Dublin Core metadata

As mentioned above, the addition of domains and ranges to DCMI properties has important implications for the interpretation of legacy Dublin Core metadata expressed in RDF. The expression of Dublin Core metadata in the other recommended formats recommended by DCMI -- i.e., "Expressing Dublin Core in HTML/XHTML meta and link elements" ([WWW] [http://dublincore.org/documents/dcq-html](http://dublincore.org/documents/dcq-html)) and the existing "Guidelines for implementing Dublin Core in XML" ([WWW] [http://dublincore.org/documents/dc-xml-guidelines](http://dublincore.org/documents/dc-xml-guidelines)) -- would not be negatively affected by these developments. The rules for interpreting metadata in these syntaxes in terms of the DCAM are simpler than for RDF, as they are not bound by the semantics of RDF.

The addition of domains and ranges helps clarify the formal semantics of DCMI properties. Metadata creators will need to add a few extra constructs to ensure that RDF-consuming applications correctly interpret value strings attached to values. The generation of Dublin Core metadata in RDF will become slightly more complex for anyone producing metadata by hand. However, these measures will eliminate the current ambiguity, enabling metadata that is mappable more consistently to the DCAM and improved support by tools thanks to machine-processable restrictions. And metadata consumers might need to "special-case" the processing of legacy metadata containing value strings associated directly with the affected Dublin Core properties (i.e., without intervening non-literal nodes).

### Other changes

There a a number of other changes in the new specification worth mentioning.

#### Support for multiple value strings

The DCAM specifies that each value can be represented in a DCAM statement by several value strings. The new RDF expression supports this construct, using the dcrdf:valueString property, a sub-property of rdf:value. This allows value strings in different languages and/or using different syntax encoding schemes to be used for representing a single value.

### Deprecate use of rdfs:label and rdf:value

Value strings are now expressed using the new property <tt>dcrdf:valueString</tt> with a range of <tt>rdfs:Literal</tt>, and which is a sub-property of <tt>rdf:value</tt>. The use of <tt>rdfs:label</tt> and/or <tt>rdf:value</tt> for expressing value strings is no longer supported, as their definitions do not fit this purpose. Of course, the use of those properties is not forbidden - they just do not have any special interpretation in terms of the DCAM.

### Support for RDF datatypes

RDF datatypes can now be used with value strings, corresponding to the notion of Syntax Encoding Schemes. For value strings occuring as the object of a dcrdf:valueString property, this is a simple matter.

The new specification also allows the use of datatyped literals as direct values of properties under a specific set of conditions, namely:

- ### Deprecate the use of RDF Containers

The RDF Container constructs <tt>rdf:Bag</tt>, <tt>rdf:Alt</tt> and <tt>rdf:Seq</tt> are no longer provided as an alternative for constructing ordered and unordered sets. They have no correspondence in the DCAM, and except in the case when the range of a property includes one of these classes, they can no longer be used.

### Reification no longer part of the guidelines

The use of reification has been judged to fall outside the scope of the guidelines, and is therefore no longer part of the text. As it does not interfer with the metadata itself, reification can still be used in accordance with the RDF specifications.

### Deprecate "poor man's structured values"

The recursive use of <tt>rdf:value</tt> for structured values has been deprecated. It has no correspondance in the DCAM, and does not lend itself very well to automated processing. The use of this construct is therefore no longer supported.

Note that the property used for value strings, dcrdf:valueString, has a range of rdfs:Literal, and cannot therefore be used recursively.

### Clarification of use of dc:identifier

In the deprecated recommenedations, there is some ambiguity regarding the use of the dc:identifier property. As the value of the dc:identifier property is the actual identifier, the identifier should be referenced literally, i.e. using a literal string, as in

<tt>&lt;http://example.org&gt; dc:identifier "doi:blabla"^^&lt;http://purl.org/dc/terms/URI&gt;</tt>

or similar.

### Removal of DumbDown from text

The [DumbDown](http://dublincore.org/architecturewiki/DumbDown) algorithm is independent of the particular expression of Dublin Core that is used, and is therefore defined in the DCMI Abstract Model. It has therefore been removed from the text.

### Deprecate "poor mans language qualification"

The use of "poor mans language qualification" in the old specifications does not fit the DCAM, and does not recognize the existence of language tagging of plain literals in RDF. It is no longer supported.

### Remove schemas from text

The RDF schemas for DCMI properties and classes are part of the definitions of these terms and do not belong specifically to the RDF expression of Dublin Core metadata. They have thus been removed from the specification, and are now to be found <here>.

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFReleasenotes?action=refresh&arena=Page.py&key=DCRDFTaskforce_2fDCRDFReleasenotes.text_html) for this page (cached 2012-12-21 19:49:04)  

Immutable page (last edited 2006-05-24 10:56:28 by MikaelNilsson)


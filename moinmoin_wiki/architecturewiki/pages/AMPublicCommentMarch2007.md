---
title: "- AMPublicCommentMarch2007"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AMPublicCommentMarch2007.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AMPublicCommentMarch2007](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=fullsearch&value=AMPublicCommentMarch2007&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007 "View")
- [Diffs](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AMPublicCommentMarch2007">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AMPublicCommentMarch2007_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AMPublicCommentMarch2007_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Report from public comment period on DCMI Abstract Model

Period: 5 February - 5 March 2007

This document summarises the principal comments received during the public comment period on the [<img src="AMPublicCommentMarch2007_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model (Version 2007-02-05) Proposed Recommendation](http://dublincore.org/documents/2007/02/05/abstract-model/), a revised version of the [<img src="AMPublicCommentMarch2007_files/moin-www.png" alt="[WWW]" height="11" width="11">current DCMI Recommendation (Version 2005-03-07)](http://dublincore.org/documents/2005/03/07/abstract-model/).

Proposals for moving forward are presented in the sections below.

### Literal Values and Non-Literal Values

Emerging in part from discussion of the DCAM and in part from the concurrent discussion of the document proposing the assignment of domains and ranges for DCMI properties, and in particular issues surrounding OWL-DL compatability, it is necessary to distinguish clearly between values that are literals and values that are non-literals.

For example, given the following statement (using [DC-Text 2006-05-24](http://dublincore.org/architecturewiki/DCText_2f2006_2d05_2d24))

<pre>Description (
  Statement (
    Property URI ( some:prop )
    ValueString ( "foo" Lang ( en ) )
    )
  )
</pre>

does that map to the single RDF triple

<pre>_:x some:prop "foo"@en .
</pre>

or to two RDF triples

<pre>_:x some:prop _:blank .
_:blank rdf:value "foo"@en .
</pre>

Options available include:

1. 

Use knowledge of the range of the property to infer value type

2. 

Use knowledge of the value type (either from a statement in a description of the value or from a new statement component used to specify the value type)

3. 

Statement carries explicit indication of whether value is literal or non-literal

For option 1, to determine the range of the property, the processor requires that information about each property, either "built-in" or obtained at run-time.

Having obtained a URI for the value type, either from the property range (option 1) or from the description set (option 2), the processor still has to determine whether that URI identifies a subclass of rdfs:Literal, so needs additional information about the class, either "built-in" or obtained at run-time.

Option 3 seems a more scalable and dependable approach, but requires a significant change to the DCAM description model.

Further, if the value is a literal, the statement

- must contain exactly one value string (= the literal value itself)

- must not contain a value URI

- must not contain a vocabulary encoding scheme URI

#### Proposals

- Introduce concepts of value surrogate, literal value surrogate and non-literal value surrogate into DCAM description set model, where each allows different set of components.

#### References

### Rich Representations

Various questions were asked about rich representations

- how rich representations are mapped to RDF graphs

- whether rich representations should support language tags

It became clear during discussion that representing rich representations usefully requires describing them as resources in their own right, with MIME type, language, encoding, etc. From the one-to-one principle, it therefore follows that they are better treated as separate resources in the model, instead of making them part of a single statement.

#### Proposals

- Extend the concept of value string to include XML Literals and remove the concept of rich representation from the DCAM description set model.

#### References

- Comment: Douglas Campbell, 2007-02-07 (3) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Pete Johnston, 2007-02-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=5241](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=5241)

- Comment: Douglas Campbell, 2007-02-07 (4) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Mikael Nilsson, 2007-02-22 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6422](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6422)

- Comment: Mikael Nilsson, 2007-03-05 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=491](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=491)

- Reply: Thomas Fischer, 2007-03-05 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=814](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=814)

### Abstract Syntax

Alistair Miles requested a clearer separation of syntax and semantics and suggested that the DCAM should be replaced by a specification focusing only on describing an abstract syntax for DC metadata, while defining semantics by specifying a mapping to RDF graphs and referring to the [<img src="AMPublicCommentMarch2007_files/moin-www.png" alt="[WWW]" height="11" width="11">RDF Semantics](http://www.w3.org/TR/rdf-mt/). Further, it was suggested that rules for merging DC description sets should be defined in terms of merging RDF graphs, and inferencing rules for DC description sets should be defined in terms of RDF/S inferencing.

#### Proposals

- The DCAM does contain an abstract syntax, and also a domain-specific semantics. It describes a "domain model", the DCMI community's view of the world, supported by RDF semantics. The DCAM describes that domain model, including its semantics.

- Merging should be defined, but not in the abstract model itself.

- Inference should be defined, using RDF semantics, but not in the abstract model itself.

#### References

- Comment: Alistair Miles, 2007-02-26 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=10720](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=10720)

- Reply: Mikael Nilsson, 2007-02-26 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=11846](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=11846)

- Comment: Alistair Miles, 2007-03-19 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1384](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1384)

- Reply: Mikael Nilsson, 2007-03-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1514](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1514)

- Comment: Alistair Miles, 2007-03-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1639](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&P=1639)

### DCAM and RDF

Several questions related to the relationship between DCAM and RDF, and the representation of specific DCAM constructs using the RDF model.

#### Proposals

- The [<img src="AMPublicCommentMarch2007_files/moin-www.png" alt="[WWW]" height="11" width="11">revised draft of Expressing DC using RDF](http://dublincore.org/documents/2007/04/02/dc-rdf/) will describe the mapping of each of the concepts/constructs in the DCAM to the RDF model. The DCAM might be viewed as a kind of "modeling style" or "design principle" for metadata, an abstraction living on top of RDF.

#### References

- Comment: Douglas Campbell, 2007-02-07 (6) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Mikael Nilsson, 2007-02-22 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6795](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6795)

### URI Comparison

Some questions were raised about how to determine when URIs occurring in DC description sets are treated as equivalent. It should me made clear that the DCAM uses the same rules for comparing URIs as RDF.

#### Proposals

- State that DCAM treats URIs in same way as RDF when comparing/merging

#### References

- Comment: Thomas Fischer, 2007-02-27 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=12693](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=12693)

- Reply: Mikael Nilsson, 2007-02-27 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=12854](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=12854)

### Reference Model/Information Model etc

The term "reference model" is undefined and its use is unclear. Also clarify relationships between DCAM and three models in section 2.

#### Proposals

- Use "information model" (as defined by Wikipedia) instead of "reference model".

- DCAM-as-whole = information model, with three sub-models (each an information model).

- Also restructure section 2 to highlight use of three sub-models and clarify naming.

#### References

- Comment: Jon Mason, 2007-02-06 (3, 4) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318)

- Reply: Mikael Nilsson, 2007-02-22 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=8403](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=8403)

- Reply: Mikael Nilsson, 2007-02-22 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=8562](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=8562)

- Comment: Jon Mason, 2007-02-06 (9) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318)

- Reply: Pete Johnston, 2007-02-07 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1989](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1989)

- Comment: Douglas Campbell, 2007-02-07 (13) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Pete Johnston, 2007-02-07 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=2880](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=2880)

### Editorial changes to several definitions

Some definitions suffer from an element of repetition/circularity, particularly in the use of the words "describe", "described", "description".

Definitions of "has domain" and "has range" should be based on "property/value pair" notion used in resource model.

#### Proposals

- Tidy up definition of description

- Change definition of "has range" to "A relationship between a property and a class which indicates that when the property is part of a property/value pair, the corresponding value is always an instance of that class."

- Change definition of "has domain" to "A relationship between a property and a class which indicates that when the property is part of a property/value pair, the described resource is always an instance of that class."

- Change definition of "property/value pair" in Terminology from: "The combination of a property and a value, used to describe a resource." to "The combination of a property and a value, used to describe a characteristic of a resource."

- Change reference in section 2 to "resource URI" to "described resource URI"

- Also "Each described resource is described using one or more property-value pairs"

#### References

- Comment: Jon Mason, 2007-02-06 (5, 10) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1318)

- Reply: Pete Johnston, 2007-02-16 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=4935](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=4935)

- Comment: Douglas Campbell, 2007-02-07 (8, 9) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Mikael Nilsson, 2007-02-22 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6974](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=6974)

- Comment: Douglas Campbell, 2007-02-07 (10) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Comment: Douglas Campbell, 2007-02-07 (12) [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=1543)

- Reply: Pete Johnston, 2007-02-07 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=2701](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=2701)

 [RefreshCache](http://dublincore.org/architecturewiki/AMPublicCommentMarch2007?action=refresh&arena=Page.py&key=AMPublicCommentMarch2007.text_html) for this page (cached 2012-12-31 00:37:30)  

Immutable page (last edited 2007-04-15 09:05:31 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


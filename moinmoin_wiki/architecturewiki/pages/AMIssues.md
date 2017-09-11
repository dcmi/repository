---
title: "- AMIssues"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AMIssues.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AMIssues](http://dublincore.org/architecturewiki/AMIssues?action=fullsearch&value=AMIssues&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AMIssues?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AMIssues "View")
- [Diffs](http://dublincore.org/architecturewiki/AMIssues?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AMIssues?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AMIssues?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AMIssues?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AMIssues?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AMIssues?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AMIssues?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AMIssues?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AMIssues?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AMIssues?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AMIssues?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AMIssues">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AMIssues_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AMIssues_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Issues with (and suggested changes to) the DCMI Abstract Model

This page contains a list of possible issues with (and suggested changes to) the [<img src="AMIssues_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/abstract-model/).

### Definition of 'term'

_Various people, 2005-02-08_

The wording of the definition of 'term' needs to be improved. The current definition is:

- The generic name for a _property_ (i.e. _element_ or _element refinement_), _vocabulary encoding scheme_, _syntax encoding scheme_ or concept taken from a controlled vocabulary (concept space).

and the suggested improvement is as follows:

- A _property_ (i.e. _element_ or _element refinement_), _vocabulary encoding scheme_, s_yntax encoding scheme_ or concept taken from a controlled vocabulary (concept space).

Note that "The generic name for" should probably be removed from the start of all of the current definitions in which it appears.

### Usage of "Resource URI" and "Value URI"

_Tom Baker, 2006-02-25_

The DCAM terminology of Resource URI / Value URI feels slightly inconsistent:

1. 

\_ Resource URI - doesn't say what kind of resource

2. 

Value \_ URI - doesn't say it is a resource

Confusingly, a Value URI would seem to be a resource URI (in a general sense) but not a Resource URI (in a DCAM sense).

This could be corrected by consistently specifying

1. 

Subject Resource URI

2. 

Value Resource URI

Or, more concisely, by specifying

1. 

Subject URI

2. 

Value URI

### Usage of "Resource"

_Tom Baker, 2006-04-04_

Related to the above, there is an entity labeled "Resource" in DCAM, Figure 4, but the definition offered in the Glossary is generic ("anything with identity"). The modeling entities Property and Value are "resources", but it doesn't really sound right to say "the Resource is a resource". Renaming "Resource" to "Subject" consistently in the DCAM would solve this problem (e.g., "the Subject is a resource").

Either that, or make it all very explicit by calling everything a resource, i.e.: Subject Resource, Property Resource, Value Resource.

### "Is a URI"
_Mikael Nilsson, 2005-04-29_ 

I see the following texts in the DCAM:

"It should be noted that all the values that are encoded in this syntax are represented by value strings, even those that look, to the human reader, as though they are URIs."

"Again, it should be noted that the value of the DC Identifier property represented in this encoding syntax is denoted by a value string, even though it looks, to the human reader, as though it is a URI."

I now think this is a bit confusing. They \*are\* URIs. It should be said instead that they "do not fill the conceptual role of a value URI, even though they are URIs" or something to that effect.

### DCAM and rich representations
_Pete Johnston 2005-08-17_ 

According to the DCAM, a statement in a DC description can contain a rich representation of a resource.

So that rich representation could be

- a chunk of XML in any XML format or

- a blob of binary data

Now I know you can encode binary data as text (base 64 encoding) so we can get our rich representation into XML and other text-based serialisation formats. That's fine.

But what the DCAM doesn't provide is a means of telling me what XML format that chunk of XML is an instance of, or what binary format I'm dealing with once I decode my base 64 stuff from text back to binary. (I think this works in XML applications only because the XML language dictates that that element content which is a base64 string is an encoding of a GIF, or whatever, so the knowledge is built in to the application?)

But in the wild, an application gets a hint about what to do with some unknown bitstream from a MIME type, right? So shouldn't the DCAM say that a rich representation is (or can be) associated with a MIME type?

I don't think this is a serialisation/binding issue - the base 64 encoding is a serialisation/binding issue, yes - but once an application has decoded the base64 string to get back to a binary blob, it needs to know what binary format that binary blob is in: the rich representation is useless without this. Strictly speaking I think the same applies for XML formats, but in that case I guess applications get hints from XML Namespace Names and root element names and so on....

### Conforming to the DCAM
_Various people, 2005-09-19_ 

What does "conformance" mean for the DCAM? Is FOAF DCAM compliant? Are all RDF applications DCAM conformant?

- There is a notion of conformance of single terms to the DCAM

- There is a notion of conformance of \*applications\* to the DCAM - that is, that it treats properties/subproperties correctly (or at least sanely). I think a LOM application using DC properties included as LOM extensions would probably \*not\* be comforming, but most RDF applications would. There are probably levels of conformance ("supports only value strings", etc).

- There is a notion of conformance of \*syntaxes\* to the DCAM, which is really similar to application conformance.

- There is also a notion of "compatibility" of abstract models. I don't think this is the same as conformance. FOAF and RDF are compatible with the DCAM, LOM is not. Exactly what this means is unclear, of course. It could possibly mean that, for example, RDF applications and RDF vocabularies will automatically be conformant to the DCAM, thus delegating the definition of "compatibility" to be defined in terms of the "conformance" of the applications and vocabularies. Does this make sense or not???

### SES and Language tags
_Pete Johnston 2005-08-23_ 

In RDF, plain (non-datatyped) literals can have a language tag; typed literals have a datatype but do not have a language tag

i.e. a literal can not have both a language tag and a datatype.

The DCAM currently says

- Each value string may have an associated syntax encoding scheme URI that identifies a syntax encoding scheme.

- Each value string may have an associated value string language that is an ISO language tag (e.g. en-GB).

i.e. it permits a value string to be associated with both a language tag and a syntax encoding scheme URI.

Should that be tightened up in the DCAM to say a value string may be associated with either a language tag or syntax encoding scheme URI, but not both?

### Blank nodes

Does the DCAM support statements with no value URI and no value strings? Can such a value be used as subject of a related description? This would be similar to "blank nodes" in RDF.

### Vocabulary encoding schemes and classes

_Alistair Miles, 2005-10-10_

I suggest that DCMI:

- drops the notion of allowing a 'subject scheme' to also be a 'class of values',

- drops the recommendation to use rdf:type to link a 'subject' to a 'subject scheme',

See [[<img src="AMIssues_files/moin-www.png" alt="[WWW]" height="11" width="11">the list posting](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0510&L=dc-rdf-taskforce&T=0&P=61)].

### Missing definitions for "sub-property" and "sub-class"

_Tom Baker, 2006-03-08_

DCAM [1] uses "sub-property" as an adjective (e.g., "sub-property relationships").

In Section 2, seventh bullet point, "sub-property" is used as a noun ("the sub-property"), and it is part of Figure 1. However, nowhere is "sub-property" actually defined.

"Sub-class" is also not defined.

Possible solution: instead of defining these as nouns, rephrase text so that used only for relationships. Dan suggests looking at [http://www.w3.org/TR/rdf-schema/#ch\_subpropertyof](http://www.w3.org/TR/rdf-schema/#ch_subpropertyof) .

See [[<img src="AMIssues_files/moin-www.png" alt="[WWW]" height="11" width="11">the list posting](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0603&L=dc-architecture&P=58)].

### Definition of Related Description

_Tom Baker, 2006-03-28_

A "related description" is really just another "description", albeit one that is seen from a certain standpoint.

 A related description is a description of a resource that is related to the resource being described. 

This is analogous to "sub-class" and "sub-property" being just "class" and "property" seen in a certain relationship. In such cases, one could perhaps remove them as named modeling entities and find ways to rephrase the text in order to emphasize the relationships between entities.

### Domain and range

_Pete Johnston, 2006-03-09_

Given that there are [<img src="AMIssues_files/moin-inter.png" alt="[Self]" height="16" width="16">suggestions](http://dublincore.org/architecturewiki/DCPropertyDomainsRanges "Self") for adding rdfs:domain/rdfs:range data to the descriptions of DCMI properties, should the concepts of property range and property domain be added to the DCAM?

### (Editorial) Description of Purpose of DCAM

_Pete Johnston, 2006-03-31_

The sentence

 The primary purpose of this document is to provide a reference model against which particular DC encoding guidelines can be compared. 

might be interpreted as saying that DC encoding guidelines and the formats they describe can be be created/designed without reference to the DCAM and then compared with each other through the reference model of the DCAM. This does not reflect how the DCAM should be used in relation to DC encoding guidelines: the DCAM provides the basis for the design of DC encoding guidelines. The creators/designers of those guidelines and the formats they describe must use the DCAM as the starting point, not as something to be referenced/compared with afterwards.

### Empty statements
_Alistair Miles, 2006-05-04_ 

Statement without either value strings, VES, rich descriptions or value URIs are not explicitly forbidden. Maybe they should be.

 [RefreshCache](http://dublincore.org/architecturewiki/AMIssues?action=refresh&arena=Page.py&key=AMIssues.text_html) for this page (cached 2012-12-28 19:42:50)  

Immutable page (last edited 2006-05-04 13:13:50 by MikaelNilsson)


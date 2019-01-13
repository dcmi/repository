---
title: "- AMPublicCommentApril2007"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AMPublicCommentApril2007.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AMPublicCommentApril2007](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=fullsearch&value=AMPublicCommentApril2007&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AMPublicCommentApril2007 "View")
- [Diffs](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AMPublicCommentApril2007">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AMPublicCommentApril2007_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AMPublicCommentApril2007_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Report from public comment period on DCMI Abstract Model

Period: 2 April - 30 April 2007

This document summarises the principal comments received during the public comment period on the [<img src="AMPublicCommentApril2007_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model (Version 2007-04-02) Proposed Recommendation](http://dublincore.org/documents/2007/04/02/abstract-model/), a revised version of the [<img src="AMPublicCommentApril2007_files/moin-www.png" alt="[WWW]" height="11" width="11">previous Proposed Recommendation (Version 2007-02-05)](http://dublincore.org/documents/2005/02/05/abstract-model/).

Proposals for moving forward are presented in the sections below.

### OWL-DL, datatype properties & object properties

OWL-DL will require properties to be declared as either datatype properties & object properties. If both literal and non-literal values are required, then may need two parallel properties.

This is being taken into account by the Usage Board in their consideration of the ranges of DCMI properties

#### Proposals

- No change required.

#### References

- Comment: Ivan Herman, 2007-04-27 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0704&L=dc-architecture&P=1308](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0704&L=dc-architecture&P=1308)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=424](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=424)

### Specification of which value string is intended for display

If statement has non-literal value surrogate with multiple value strings, how does application decide which string to display?

DCAM doesn't provide this, but can make use of description of value to differentiate "categories" of label e.g. using SKOS preferred/alternative label properties.

#### Proposals

- No change required.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Definition of literal

Provide fuller definition of literal rather than just referencing RDF Concepts.

#### Proposals

- Expand description/definition of literal in DCAM, based on RDF C&AS, XML Schema.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Requirement to use URI to reference VES & SES

The DCAM requires that properties, VES & SES are referred to in statements within DC metadata description sets using URIs.

#### Proposals

- No change required.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Distinction between Literal Value Surrogate ad Non-Literal Value Surrogate

Distinction is not based on number of value strings present in statement, but on type of value itself

#### Proposals

- No change required.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Language and Typed Value Strings/XML Literals

Typed literals can not carry language tags.

#### Proposals

- No change required (though maybe need to emphasise that typed value strings includes XML Literals?).

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### dcam:memberOf equivalent in RDF

RDF has no "built-in" equivalent of VES, so no built-in equivalent of dcam:memberOf.

#### Proposals

- No change required.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Definition of "term"

Definition of "term" should be part of bullet list in section 2.3

#### Proposals

- Add bullet defining term near start of list.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Set of resources (VES) v Set of literals (SES)

Not always clear when to use VES v when to use SES. A modelling choice. Depends on requirements of application. Usage Board choices for DCMI terms based on content of existing specifications.

#### Proposals

- No change required.

#### References

- Comment: Douglas Campbell, 2007-05-01 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=56)

- Reply: Pete Johnston, 2007-05-20 [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&P=700)

### Description of "subproperty"

Bullet on subproperty in 2.3 should use the phrasing "...and the property is part of a property/value pair" (rather than "...and a described resource is related to a value by that property")

#### Proposals

- Change phrasing of sixth bullet in section 2.3.

#### References

- (offlist comment by Pete Johnston)

### Error in 2.4

Erroneous reference to "syntax encoding string"

#### Proposals

- Change "syntax encoding string" to "syntax encoding scheme".

#### References

- (offlist comment by Pete Johnston)

### Abstract Syntax Required

Alistair Miles re-emphasised the points made in the previous comment period (the need to delineate an abstract syntax, to describe how to merge DC description sets, and to describe inference rules). He also suggested the need for use cases to specify the requirements that the DCAM is intended to meet.

#### Proposals

- In short term, move forward with current version; in longer term, gather requirements using current DCAM as input, and consider revision/restructuring along lines suggested.

#### References

- (Discussion during telecon, 2007-05-17)

### Definition of "vocabulary"

DCAM uses "vocabulary" to refer to set of "terms"; RDF Semantics uses "vocabulary" to refer to set of names (URIs/literals).

#### Proposals

- Current DCAM use is consistent across DCAM and Namespace Policy document; usage in W3C docs does vary. Retain current use in DCAM.

#### References

- (Discussion during telecon, 2007-05-17)

 [RefreshCache](http://dublincore.org/architecturewiki/AMPublicCommentApril2007?action=refresh&arena=Page.py&key=AMPublicCommentApril2007.text_html) for this page (cached 2012-12-31 00:37:20)  

Immutable page (last edited 2007-06-01 17:18:44 by MikaelNilsson)


---
title: "- SESandVES"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/SESandVES.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [SESandVES](http://dublincore.org/usageboardwiki/SESandVES?action=fullsearch&value=SESandVES&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/SESandVES?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/SESandVES "View")
- [Diffs](http://dublincore.org/usageboardwiki/SESandVES?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/SESandVES?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/SESandVES?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/SESandVES?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/SESandVES?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/SESandVES?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/SESandVES?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/SESandVES?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/SESandVES?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/SESandVES?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/SESandVES?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/SESandVES">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="SESandVES_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="SESandVES_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## SES and VES

Joe Tennis and Stuart Sutton

According to the DCAM:

- A vocabulary encoding scheme is an enumerated set of resources.

- A syntax encoding schemes is a set of strings and an associated set of rules that describe a mapping between that set of strings and a set of resources. The mapping rules may define how the string is structured (for example DCMI Box) or they may simply enumerate all the strings and the corresponding resources (for example ISO 3166).

_Problem 1_: Neither of these definitions is sufficient to identify a controlled vocabularies used for indexing resources. Why?

A controlled vocabulary is a list of terms that have been enumerated explicitly. This list is controlled by and is available from a controlled vocabulary registration authority. All terms in a controlled vocabulary must have an unambiguous, non-redundant definition.

NOTE: This is a design goal that may not be true in practice; it depends on how strict the controlled vocabulary registration authority is regarding registration of terms into a controlled vocabulary.

At a minimum, the following two rules must be enforced:

- 1. If the same term is commonly used to mean different concepts, then its name is explicitly qualified to resolve this ambiguity. NOTE: This rule does not apply to synonym rings.

- 2. If multiple terms are used to mean the same thing, one of the terms is identified as the preferred term in the controlled vocabulary and the other terms are listed as synonyms or aliases. [1]

As can be seen from this standard definition, we are not talking about resources, we are talking about terms and concepts these are not...:

_Problem 2_: These definitions are not clearly mutually exclusive. Why?

If we were to implement a controlled vocabulary in a metadata record, we not only would pick from a list (the implication of a VES), but we would need to put a set of strings in the record that was a mapping between that string and a resource (or resources) that had mapping rules.

_The Proposed Amelioration for Problem 2_: URIs are not Strings

The amelioration proposed for the problem stated above is that if the value is a URI it is a VES and if it is a string (not a URI) then it is a SES. However, this is a problem with modeling representation. The string and the URI are both stand-ins for the thing itself, and both have some form a representation at work (mapping from string to thing). The URI is a not an essential difference, and is one that may be important for syntax processing but is not true to the Standard or Application models of working with controlled vocabularies .

_Proposed action_: Add a controlled vocabularies encoding scheme to the Abstract Model that accounts for the definition in [1]. This CVES which would be a subset of VES.

[1] [http://www.niso.org/standards/resources/Z39-19-2005.pdf](http://www.niso.org/standards/resources/Z39-19-2005.pdf)

Notes from Barcelona and Singapore (added by Tom): The difference is basically String vs. Thing. Agreed: We need a deeper level of description and differentiation between VES and SES, including definitions. If you have a something already, how do you tell if it is VES or SES. If an Encoding Scheme tells you what a value string it it's a SES. If Encoding Scheme defines a class of values, then it is a VES (e.g., concepts). For example, if you develop a list of educational levels, and if you define a list of strings, then you're defining an SES. If you define a set of concepts and assign URIs to them (as best practice), then you're defining a VES. Best practice in this scenario is to define a set of concepts with URIs rather than a set of strings. Agreed that DC-Education is a great test-bed for these concepts. SES is a datatype in RDF. VES is like conceptScheme in SKOS, only not limited to concepts. For discussion: VES is a set of concepts that, once in metadata, allows editors to handle assertion by adding things to it. SES is a set of strings.

 [RefreshCache](http://dublincore.org/usageboardwiki/SESandVES?action=refresh&arena=Page.py&key=SESandVES.text_html) for this page (cached 2012-12-09 13:08:27)  

Immutable page (last edited 2007-12-13 08:59:32 by TomBaker)


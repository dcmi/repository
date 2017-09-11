---
title: "- ProfileModelArchitecture"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/ProfileModelArchitecture.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ProfileModelArchitecture](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=fullsearch&value=ProfileModelArchitecture&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/ProfileModelArchitecture "View")
- [Diffs](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/ProfileModelArchitecture">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ProfileModelArchitecture_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ProfileModelArchitecture_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

_A first attempt at structuring a profile model_ 

1. Guiding principles
2. Levels

  1. The Machine level
  2. The Documentation Level
  3. The Encoding level
  4. The Best practices level

## Guiding principles

- Must support multiple descriptions in a description set

- Must allow for some form of "profile module" à la Accessibility/Education

  - Thus - merging of APs necessary? Automatic/manual?

- Must support automatic validation of instance data to some degree

- Must support integrating human-readable documentation

- Must be encoding independent

## Levels
There are several layers of the model: 
### The Machine level
All the descriptions below are machine-processable (template ~= profile): 
- Statement templates, including constraints on all components of statements: SES, VES, value strings etc.

- Description templates, including essentially a set of statement templates. Cardinality, mandatory, open/closed etc.

- Description set templates, including essentially a set of description templates. Includes resource types etc.

Thus, we need syntaxes for these. **Fundamental question** : do we base it directly on the DCAM (leading to need for DCAM-specific syntax), or a concrete syntax, such as RDF or XML (letting us reuse SPARQL or XPath/XQuery).

### The Documentation Level

Human-readable documentation for each of the above templates.

Can be "use the full name of the publication in the title field" etc.

Needs to be linked directly to the relevant template (in case of several uses of "dc:title" etc.).

### The Encoding level

A profile specific syntax might be given. Do we need to support that in the model?

### The Best practices level

Understanding domain models/application models, vocabularies and all that.

 [RefreshCache](http://dublincore.org/architecturewiki/ProfileModelArchitecture?action=refresh&arena=Page.py&key=ProfileModelArchitecture.text_html) for this page (cached 2012-12-22 17:07:03)  

Immutable page (last edited 2007-03-13 12:44:24 by MikaelNilsson)


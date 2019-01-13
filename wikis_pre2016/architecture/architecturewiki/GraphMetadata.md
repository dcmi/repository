---
title: "- GraphMetadata"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/GraphMetadata.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [GraphMetadata](http://dublincore.org/architecturewiki/GraphMetadata?action=fullsearch&value=GraphMetadata&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/GraphMetadata?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/GraphMetadata "View")
- [Diffs](http://dublincore.org/architecturewiki/GraphMetadata?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/GraphMetadata?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/GraphMetadata?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/GraphMetadata?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/GraphMetadata?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/GraphMetadata?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/GraphMetadata?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/GraphMetadata?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/GraphMetadata?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/GraphMetadata?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/GraphMetadata?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/GraphMetadata">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="GraphMetadata_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="GraphMetadata_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Graph-based Metadata

This is an experimental area, discussing the feasibility and potential value of construction of a metadata architecture on top of a relatively simple graph-model.

Put simply, a _metadata graph_ describes how things are related to other things. It doesn't go any further than that.

### Syntactic Interoperability

A simple graph-model could provide an effective _abstraction_ of a number of different metadata syntaxes, allowing metadata to be _virtualised_ in a common, standard way.

In other words, a simple graph-model could be used as the basis for an _abstract metadata syntax_, providing a foundation for translation between various concrete metadata syntaxes.

On top of such an abstract syntax, application-specific constraints could be expressed, capturing the essential requirements of an "application profile".

### Semantic Interoperability

An abstract syntax based on a simple graph-model also provides a firm foundation for a precise semantics.

A semantics tells you how to merge graphs, i.e. how to merge metadata from different sources.

A semantics also provides the foundation for layers of application-specific semantics. These layers then allow metadata to be "dumbed-down" gracefully, to whatever level is required.

### Proof of Concept -- "Son of Dublin Core"

At DC-2007, [AlistairMiles](http://dublincore.org/architecturewiki/AlistairMiles) hacked up a proof of concept graph-based metadata architecture, building directly on the Resource Description Framework (RDF) abstract syntax. See the link below for more information:

- [http://purl.org/net/sodc/](http://purl.org/net/sodc/) -- Son of Dublin Core -- Encoding and Validating and Harvesting Graph-based (Meta)data

 [RefreshCache](http://dublincore.org/architecturewiki/GraphMetadata?action=refresh&arena=Page.py&key=GraphMetadata.text_html) for this page (cached 2013-01-01 07:27:50)  

Immutable page (last edited 2007-09-06 14:17:10 by AlistairMiles)


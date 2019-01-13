---
title: "- PropertiesToFrbr"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/librarieswiki/pages/PropertiesToFrbr.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [PropertiesToFrbr](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=fullsearch&value=PropertiesToFrbr&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/librarieswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/librarieswiki/FrontPage)
- [RecentChanges](http://dublincore.org/librarieswiki/RecentChanges)
- [FindPage](http://dublincore.org/librarieswiki/FindPage)
- [HelpContents](http://dublincore.org/librarieswiki/HelpContents)

Page

- [Edit](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=edit "Edit")
- [View](http://dublincore.org/librarieswiki/PropertiesToFrbr "View")
- [Diffs](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=diff "Diffs")
- [Info](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=info "Info")
- [Subscribe](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=raw "Raw")
- [Print](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=AttachFile)
- [DSP2XML](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=DSP2XML)
- [DeletePage](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=DeletePage)
- [LikePages](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=LikePages)
- [LocalSiteMap](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=SpellCheck)

Search

<form method="POST" action="/librarieswiki/PropertiesToFrbr">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="PropertiesToFrbr_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="PropertiesToFrbr_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Mapping of the Properties of the DC-Lib DescriptionSetProfile to FRBR-Entities

Basis of the following is [<img src="PropertiesToFrbr_files/moin-www.png" alt="[WWW]" height="11" width="11">Chapter 4 of FRBR](http://archive.ifla.org/VII/s13/frbr/frbr_current4.htm) and the [<img src="PropertiesToFrbr_files/moin-www.png" alt="[WWW]" height="11" width="11">SWAP Description Set Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly_Works_Application_Profile).

If you want to assign the properties of the Description Set Profile of the DC-Lib AP for Bibliographic Text Resources to FRBR Entities,

- **we recomment to assign all [ItemProperties](http://dublincore.org/librarieswiki/ItemProperties) to frbr:item**

 dc:identifier rdfs:domain frbr:item . 

agls:availability rdfs:domain frbr:item .

dc:description rdfs:domain frbr:item .

dcterms:provenance rdfs:domain frbr:item .

frbr:isExemplarOf rdfs:domain frbr:item .

- **we recommend to assign the properties of Bibliographic Text Resource to the FRBR entities described as** rdfs:domain **in the following list**

 dc:title rdfs:domain frbr:manifestation . 

dcterms:alternative rdfs:domain frbr:manifestation .

dc:creator rdfs:domain frbr:work .

dc:contributor rdfs:domain frbr:expression .

dc:publisher rdfs:domain frbr:manifestation .

dc:subject rdfs:domain frbr:work .

dcterms:abstract rdfs:domain frbr:work .

dcterms:tableOfContents rdfs:domain frbr:expression .

dcterms:created rdfs:domain frbr:expression .

dcterms:valid rdfs:domain frbr:manifestation .

dcterms:available rdfs:domain frbr:expression .

dcterms:issued rdfs:domain frbr:manifestation .

dcterms:modified rdfs:domain frbr:manifestation .

dcterms:dateCopyrighted rdfs:domain frbr:expression .

dcterms:dateSubmitted rdfs:domain frbr:expression .

dcterms:dateAccepted rdfs:domain frbr:expression .

myex:dateOfReproduction rdfs:domain frbr:manifestation .

dc:type rdfs:domain frbr:expression .

dc:format rdfs:domain frbr:manifestation .

dcterms:extent rdfs:domain frbr:manifestation .

dcterms:medium rdfs:domain frbr:manifestation .

dc:identifier rdfs:domain frbr:manifestation .

dcterms:bibliographicCitation rdfs:domain frbr:expression .

dc:source rdfs:domain frbr:manifestation .

dc:language rdfs:domain frbr: expression .

dcterms:isVersionOf rdfs:domain frbr:expression .

dcterms:isFormatOf rdfs:domain frbr:manifestation .

dcterms:hasFormat rdfs:domain frbr:manifestation .

dcterms:isReplacedBy rdfs:domain frbr:expression .

dcterms:replaces rdfs:domain frbr:expression .

dcterms:isPartOf rdfs:domain frbr:manifestation .

dcterms:hasPart rdfs:domain frbr:manifestation .

dcterms:requires rdfs:domain frbr:manifestation .

dcterms:isReferencedBy rdfs:domain frbr:expression .

dcterms:references rdfs:domain frbr:expression .

frbr:isA [TranslationExpressionOf](http://dublincore.org/librarieswiki/TranslationExpressionOf) rdfs:domain frbr:expression .

dc:coverage rdfs:domain frbr:work .

dcterms:spatial rdfs:domain frbr:work .

dcterms:temporal rdfs:domain frbr:work .

dc:rights rdfs:domain frbr:manifestation .

dcterms:audience rdfs:domain frbr:work .

eprint:version rdfs:domain frbr:expression .

 [RefreshCache](http://dublincore.org/librarieswiki/PropertiesToFrbr?action=refresh&arena=Page.py&key=PropertiesToFrbr.text_html) for this page (cached 2012-11-29 20:51:41)  

Immutable page (last edited 2010-12-03 13:22:26 by StefanieRuehle)


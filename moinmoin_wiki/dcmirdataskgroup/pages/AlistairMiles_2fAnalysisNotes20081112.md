---
title: "- AlistairMiles/AnalysisNotes20081112"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/AlistairMiles_2fAnalysisNotes20081112.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AlistairMiles/AnalysisNotes20081112](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=fullsearch&value=%2FAnalysisNotes20081112&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/AlistairMiles "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081112_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081112_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

Notes on RDA work, 2008-11-12. 

Previous session: [AlistairMiles/AnalysisNotes20081011](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081011)

Tasks: to produce RDF expression of cataloguer scenarios 2, 3, ...

### Initial Review

Initially, check RDA elements vocabularies in registry to see if any changes...

Check [<img src="AlistairMiles_2fAnalysisNotes20081112_files/moin-www.png" alt="[WWW]" height="11" width="11">RDA Elements](http://metadataregistry.org/schema/show/id/1.html)...

Looking at [<img src="AlistairMiles_2fAnalysisNotes20081112_files/moin-www.png" alt="[WWW]" height="11" width="11">the history of changes](http://metadataregistry.org/schemahistory/list/page/1/schema_id/1.html), looks like Karen's done work since 11 Oct mainly on descriptions and labels for existing elements; can't see any new or removed elements.

Need a good schema diff <img src="AlistairMiles_2fAnalysisNotes20081112_files/smile.png" alt=":)" height="15" width="15">

Published diff at [http://dublincore.org/dcmirdataskgroup/RdaElements](http://dublincore.org/dcmirdataskgroup/RdaElements)

Looks like only substantive changes are:

- Added rda:languageOfTheContent, removed rda:contentLanguage

- Deprecated rda:workTitle, in favour of rda:preferredTitleForTheWork ?

One difficulty with metadata registry, can't get overview of substantive changes (coarse grained), e.g. properties added, removed, deprecated.

Check [<img src="AlistairMiles_2fAnalysisNotes20081112_files/moin-www.png" alt="[WWW]" height="11" width="11">RDA Roles](http://metadataregistry.org/schema/show/id/4.html)...

No change since 2008-07-23.

Issue: need ability to create snapshot versions, rather than rolling, to work against?

### Review Scenario 1

Looking at [http://dublincore.org/dcmirdataskgroup/Scenarios\_2f1?action=recall&date=1223736433](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=recall&date=1223736433) .. really need to automate check if scenario is up to date with current vocabulary definition.

What is status of my earlier script to look for defined properties?

Updated script for scenario analysis, find following output...

All RDA Properties Required by This Scenario:

- contentType

- dateOfProduction

- editionStatement

- extentOfText

- formOfWork

- identifierForTheManifestation

- languageOfExpression

- languageOfWork

- placeOfProduction

- publisher

- title

- workTitle

RDA Properties Required by This Scenario, Not Defined in RDA Element Vocabulary:

- publisher

So what about workTitle? reg status 1008, what's that? deprecated! need check for use of deprecated properties...

Done, added check for deprecated props.

Properties Required by This Scenario, Deprecated in RDA Element Vocabulary:

- workTitle

scenario 1, fix publisher, fix workTitle

### Create RDF Expression for Scenario 2

Working from [<img src="AlistairMiles_2fAnalysisNotes20081112_files/moin-www.png" alt="[WWW]" height="11" width="11">2008-10-13 version of cataloger scenarios](http://dublincore.org/dcmirdataskgroup/Scenarios?action=raw&date=1223907887)...

update analysis script to check RDA roles too

Why preferred title for the work? Why not just workTitle ?

Subject heading: dcterms:subject ? Which system (controlled vocab)?

Honoree?

update analysis script to check FRBR types & properties too

parts of works, parts of expression -- redundant information? potential for inference?

completed expression, ran analysis

### Scenario 3 RDF Expression

Working from [<img src="AlistairMiles_2fAnalysisNotes20081112_files/moin-www.png" alt="[WWW]" height="11" width="11">2008-10-13 version of cataloger scenarios](http://dublincore.org/dcmirdataskgroup/Scenarios?action=raw&date=1223907887)...

date of availability? which property? different between date of production and date of publication and date of manufacture and date of first publication or release and date of work and date of expression and date of distribution... ?

media type? datatype?

properties to link works? adaptation?

dvd media type? controlled vocab or datatype?

adapter? use editor?

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081112?action=refresh&arena=Page.py&key=AlistairMiles_2fAnalysisNotes20081112.text_html) for this page (cached 2012-11-14 20:17:51)  

Immutable page (last edited 2008-11-12 18:04:12 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


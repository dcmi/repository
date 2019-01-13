---
title: "- AlistairMiles/AnalysisNotes20081222"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/AlistairMiles_2fAnalysisNotes20081222.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AlistairMiles/AnalysisNotes20081222](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=fullsearch&value=%2FAnalysisNotes20081222&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/AlistairMiles "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081222_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081222_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Notes on RDA Work 2008-12-22

### Email

Comment on use of blank nodes in scenario 4, as tentative.

### Check Scenarios 1-6

Get latest snapshot of RDA elements and RDA roles, do schema diffs.

Did schema diff on RDA elements schema between latest (2008-12-22) and previous snapshot (2008-11-29), published at [http://dublincore.org/dcmirdataskgroup/RdaElements](http://dublincore.org/dcmirdataskgroup/RdaElements)

Found changes...

- new property rda:statementOfResponsibility

- rda:placeOfPublication deprecated in favour of rda:placeOfPub ???

- URI fixes for rda:frequency, rda:titleProper

Did schema diff on RDA roles schema between latest (2008-12-22) and first snapshot used in analysis (2008-09-25), found no differences.

Begin scenario review. For each scenario, first check details of scenario haven't changed, then rerun scenario analysis.

Review changes to scenarios, via [http://dublincore.org/dcmirdataskgroup/Scenarios?action=diff&date2=0&date1=1227972097](http://dublincore.org/dcmirdataskgroup/Scenarios?action=diff&date2=0&date1=1227972097) ...

Find no substantive changes before line 374, i.e. find only changes to scenarios 7 and on (scenario 7 begins on line 372).

Rerun analysis of scenario RDF expressions...

Examine scenario 1... fine

Examine scenario 2... fine

Examine scenario 3... fine

Examine scenario 4... fine

Examine scenario 5... fine

Examine scenario 6... 2 rdarole props required, not defined in schema.

Edited scenario 6 to use defendant and reporter from a hypothetical 3rd party namespace, because probably not in scope for rda roles.

Upload all new analyses to wiki... done

### Scenario 7

pagination? use extentOfText?

size? can't find anything suitable.

### Scenario 8

pagination? use extentOfText?

title proper of series ... property of expression or manifestation? what about a series entity?

analysis shows nothing missing.

### Scenario 9

date of work? rda:dateOfFirstPublicationOrRelease ? rda:dateOfWork ?

aside, find that placeOfCapture is a sub-property of placeAndDateOfCapture, this doesn't look right;

run analysis, issues...

- only typo, fixed

no issues

### Scenario 10

looks ok

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081222?action=refresh&arena=Page.py&key=AlistairMiles_2fAnalysisNotes20081222.text_html) for this page (cached 2012-11-24 10:39:50)  

Immutable page (last edited 2008-12-22 16:38:23 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


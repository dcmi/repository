---
title: "- CancoreAccessForAllMetadataGuidelines/MinutesDec13"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/MinutesDec13](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=fullsearch&value=%2FMinutesDec13&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13 "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fMinutesDec13_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fMinutesDec13_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

Minutes for Cancore Meeting, December 13th, 2005 

6:00pm Atlantic

In Attendance

Anastasia Cheetam - ATRC, University of Toronto   
 Louis Guerette - LICEF [/CanCore](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13_2fCanCore)  
 Karin Lundgreen - LICEF [/CanCore](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13_2fCanCore)  
 Joseph Scheuhammer - ATRC, University of Toronto  
 Andy Powell - Sheffield Hallam University  
 Anthony Roberts (Toni) - [CanCore](http://dublincore.org/accessibilitywiki/CanCore)

Discussion re meeting on a weekly basis. It was agreed that we would meet every week during the month of January to get the work moving more quickly. January 10th at 6:30 pm Atlantic will be the first meeting, followed by January 17th, 24th and 31st. This seems to fit best for all.

Discussion re 1.8 has component. Toni asked about the use/implementation of 1.1 identifier, 1.1.1 catalog and 1.1.2 entry from the LOM in has component. It was decided that this was an appropriate implementation so that we are able to identify the catalog (URI, URL, ISBN, etc.) and also have an entry field. Alternatively, 1.8 has component, according to the ISO documentation is only an undefined URI. The value space and the datatype can be defined for this (Action item: Toni to look up the ISO standard for the value space and add it and add datatype as URI). Under technical implementation notes it was decided that we would explicitly claim that this, i.e., using 1.1., 1.1.1 and 1.1.3 from the LOM is one way of implementing and that other local implementations may choose to use a different approach and that these approaches will vary. Noted that for atomistic resources, i.e., undissolveable resources, that 1.8 should not be used. We should mention this in the technical implementation notes. Changes were made to the documentation on the wiki to reflect some of these changes above. Karin asked about the difference between the LOM relation element and has part (kind, relation, has part). Kind is defined as "Nature of the relationship between this learning object and the target learning object, identified by 7.2:Relation.Resource" and includes haspart as a vocbulary term. Noted that has component is intended for a different level of granularity, i.e., the components of a LO that may include an audio track, a video component, text, etc. These are the components of the LO, i.e., lower level. Chapters in a book, tutorials that are part of a larger LO, etc., are intended for the relation element of the LOM. Noted that we should make this distinction in the technical implementation notes.

Action Item: Toni to add the distinction between these on the wiki for this component.

Adjourned: 7:08pm Atlantic

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fMinutesDec13?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2fMinutesDec13.text_html) for this page (cached 2012-12-25 10:19:27)  

Immutable page (last edited 2005-12-27 23:10:53 by mctnnbsa30w-156034062234)


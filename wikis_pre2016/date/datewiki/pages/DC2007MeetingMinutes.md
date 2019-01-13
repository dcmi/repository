---
title: "- DC2007MeetingMinutes"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/datewiki/pages/DC2007MeetingMinutes.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DC2007MeetingMinutes](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=fullsearch&value=DC2007MeetingMinutes&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/datewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/datewiki/FrontPage)
- [RecentChanges](http://dublincore.org/datewiki/RecentChanges)
- [FindPage](http://dublincore.org/datewiki/FindPage)
- [HelpContents](http://dublincore.org/datewiki/HelpContents)

Page

- [Edit](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=edit "Edit")
- [View](http://dublincore.org/datewiki/DC2007MeetingMinutes "View")
- [Diffs](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=diff "Diffs")
- [Info](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=info "Info")
- [Subscribe](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=raw "Raw")
- [Print](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=AttachFile)
- [DSP2XML](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=DSP2XML)
- [DeletePage](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=DeletePage)
- [LikePages](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=LikePages)
- [LocalSiteMap](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=SpellCheck)

Search

<form method="POST" action="/datewiki/DC2007MeetingMinutes">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DC2007MeetingMinutes_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DC2007MeetingMinutes_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Dublin Core Date Encoding Task Force Session Minutes, DC-2007, Singapore, 29 August 2007

### Present

- Douglas Campbell - National Library of New Zealand, New Zealand (chair)

- Eric Childress - OCLC, USA

- Joycelyn Tay - National Library Board, Singapore

- ?? - National Library Board, Singapore

- Muriel Foulonneau - CNRS, France

- John Kunze - California Digital Library, USA

- Makx Dekker - DCMI

### Meeting Summary

- Discussion of the Task Force's two working drafts:

  - [<img src="DC2007MeetingMinutes_files/moin-inter.png" alt="[Self]" height="16" width="16">Date and Time Representation Requirements](http://dublincore.org/datewiki/DateRequirements "Self")

  - [<img src="DC2007MeetingMinutes_files/moin-www.png" alt="[WWW]" height="11" width="11">Date and Time Short Form](http://people.opera.com/charlesm/2006/shortdate/) Proposal

- Issues raised:

  - Consider scope - only include existing known DCMI requirements, or include wider requirements to make it relevant to more communities?

  - Consider who should create the required encoding format(s), eg. DCMI, ISO, W3C?

  - Investigate whether "dates as subjects" should be in scope

  - Determine whether the DCMI Libraries Application Profile requires more than just 'YYYYMMDD' in a short date format

- Presentation of the TEMPER date format

- Developed new workplan

### Workplan for 2007/2008

1. Short Date Format Note Proposal

- Complete Note

- Circulate to DC-General for comment

2. Date and Time Representation Requirements

- Investigate inclusion of dates as subject

- Complete requirements

- Prepare sample format proposal

- Circulate to DC-General for comment

3. Determine strategy to develop and formalise Date Encoding Format(s)

### Discussion notes

Short Format Note

- Working draft out 2005

- Two actions needed:

 a). Confirm document is OK 

b). Decide if want to pursue the note - working on this may take resources away from the wider requirements track work

- Format mostly OK, would need to make time zone optional (for MARC 005 tag)

- There are still outstanding issues noted in document

- Motivator was DC-Libraries Application Profile - need to confirm if the proposal meets their requirements

- Maybe put out to the DCMI community to decide if useful

- Process

  - Confirm requirements of DC-Libraries AP

  - Announce to DC-General thinking of putting proposal out for public comment (to get pre-comments from interested parties)

  - Public comment period

  - Identify W3C member to put out note

  - Identify namespace to use

Date and Time Representation Requirements

- Working draft out August 2007

- Clarification given - intention is "inline markup", ie. all date information is encoded within a single character string (unlike MODS which places some information in separate attributes such as qualifier="questionable")

- Need to decide if DCMI should do this date work or another agency like ISO, options:

  - DCMI develop requirements and encoding format

  - DCMI develop requirements and encoding format and seek ISO ratification

  - DCMI develop requirements (plus an encoding proposal) and pass to ISO

  - DCMI flag to ISO that work on dates is needed

- Risk that if DCMI put out a format it will be ignored (as considered only suitable for the DCMI community)

- W3CDTF’s main problem was its silence on whether ranges are supported. W3C may be interested in taking on dates work, but some DCMI requirements may not be of interest to them as considered of low value in their community, eg. non-Gregorian dates or questionable dates

- Noted ISO 8601's strength is dates for computer systems, not strong on cultural dates

- Are the use cases in the document real, or just potentially real? For example, elapsed time requirement may be of use to corporates encoding project timelines or oral history.

- Need to decide scope of the requirements, eg:

  - Limit to existing, known requirements

  - Or include anticipated requirements that would make the encoding format usable in more domains (which are not currently represented in the DC-Date Task Force)?

- Do "dates as subject" (eg. 1930s music) need sequencing? Needs further analysis

TEMPER presentation - John Kunze

- Enumerates points, lists, and ranges of timestamps

- Intention is for Kernel work

- Is currently an Internet Draft

 [RefreshCache](http://dublincore.org/datewiki/DC2007MeetingMinutes?action=refresh&arena=Page.py&key=DC2007MeetingMinutes.text_html) for this page (cached 2012-12-21 22:03:03)  

Immutable page (last edited 2007-09-26 23:17:30 by DouglasCampbell)


---
title: "- D-F"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/pages/D_2dF.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [D-F](http://dublincore.org/educationwiki/D_2dF?action=fullsearch&value=D-F&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/educationwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/educationwiki/FrontPage)
- [RecentChanges](http://dublincore.org/educationwiki/RecentChanges)
- [FindPage](http://dublincore.org/educationwiki/FindPage)
- [HelpContents](http://dublincore.org/educationwiki/HelpContents)

Page

- [Edit](http://dublincore.org/educationwiki/D_2dF?action=edit "Edit")
- [View](http://dublincore.org/educationwiki/D_2dF "View")
- [Diffs](http://dublincore.org/educationwiki/D_2dF?action=diff "Diffs")
- [Info](http://dublincore.org/educationwiki/D_2dF?action=info "Info")
- [Subscribe](http://dublincore.org/educationwiki/D_2dF?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/educationwiki/D_2dF?action=raw "Raw")
- [Print](http://dublincore.org/educationwiki/D_2dF?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/educationwiki/D_2dF?action=AttachFile)
- [DSP2XML](http://dublincore.org/educationwiki/D_2dF?action=DSP2XML)
- [DeletePage](http://dublincore.org/educationwiki/D_2dF?action=DeletePage)
- [LikePages](http://dublincore.org/educationwiki/D_2dF?action=LikePages)
- [LocalSiteMap](http://dublincore.org/educationwiki/D_2dF?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/educationwiki/D_2dF?action=SpellCheck)

Search

<form method="POST" action="/educationwiki/D_2dF">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="D_2dF_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="D_2dF_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### DC-Ed AP elements and element-refinements, D-F

[<img src="D_2dF_files/moin-www.png" alt="[WWW]" height="11" width="11">A-C](http://dublincore.org/educationwiki/A_2dC) | [<img src="D_2dF_files/moin-www.png" alt="[WWW]" height="11" width="11">G-L](http://dublincore.org/educationwiki/G_2dL)

**Date**

- Source Definition: A date associated with an event in the life cycle of the resource

- Source Comments: Typically, «date» will be associated with the creation or availability of the resource. Recommended best practice for encoding the date value is defined in a profile of ISO 8601 [W3CDTF] and follows the YYYY-MM-DD format

- DC-Ed Comments: Recommend use of an element refinement for type of Date. Recommend that dates be encoded:

1. 

using W3C-DTF (a profile of ISO 8601 structured with hyphens),

2. 

using ISO 8601:2004 (structured without hyphens), or

3. 

as free text of the form where the day and the year are numerals and the month is spelled out or uses a standard abbreviation (1 January 2005 or 1 Jan 2005)

 Avoid the use of potentially ambiguous date representations such as DD/MM/YY or MM/DD/YY (e.g., "04/05/05") 

Dates may be given as date-time if applicable. The preferred default time is UTC (Coordinated Universal Time).

OTHER COMMENT OR QUESTION: Since science educational contexts often use specimens (rocks, fossils, ice cores, plants, etc.), it may be useful to have a dateCollected or dateDiscovered element refinement. The actual age of the specimen is then described in the Coverage.Temporal element.

- Type of term: element

- Refined By: created; dateAccepted; dateCopyrighted; dateSubmitted; issued; modified; valid

- Has Encoding Scheme

- Obligation: Mandatory if applicable (MA)

- Occurrence

**[DateAccepted](http://dublincore.org/educationwiki/DateAccepted)**

- Source Definition: Date of acceptance of the resource (e.g. of thesis by university department, of article by journal, etc.

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: date

- Has Encoding Scheme

- Obligation: Optional (O)

- Occurrence

**[DateCopyrighted](http://dublincore.org/educationwiki/DateCopyrighted)**

- Source Definition: Date of a statement of copyright

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: date

- Has Encoding Scheme

- Obligation: Optional (O)

- Occurrence

**[DateSubmitted](http://dublincore.org/educationwiki/DateSubmitted)**

- Source Definition: Date of submission of the resource (e.g. thesis, article, etc

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: date

- Has Encoding Scheme

- Obligation: Optional (O)

- Occurrence

**Description**

- Source Definition: An account of the content of the resource

- Source Comments: Description may include but is not limited to: an abstract, table of contents, reference to a graphical representation of content or a free-text account of the content

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element

- Refined by: abstract; tableOfContents

- Has Encoding Scheme

- Obligation: R

- Occurrence

**[EducationLevel](http://dublincore.org/educationwiki/EducationLevel)**

- Source Definition: A general statement describing the education or training context. Alternatively, a more specific statement of the location of the audience in terms of its progression through an education or training context

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: audience

- Has Encoding Scheme

- Obligation

- Occurrence

**Extent**

- Source Definition: The size or duration of the resource.

- Source Comments: [none]

- DC-Ed Comments: Refers to the total size, duration or pagination of a resource. Recommend using ISO 8601:2004 for duration information Recommend using free text to complete total size or pagination information.

- Refines: format

- Has Encoding Scheme

- Obligation: Optional (O)

- Occurrence

**Format**

- Source Definition: The physical or digital manifestation of the resource

- Source Comments: Typically, Format may include the media-type or dimensions of the resource. Format may be used to determine the software, hardware or other equipment needed to display or operate the resource. Examples of dimensions include size and duration. Recommended best practice is to select a value from a controlled vocabulary (for example, the list of Internet Media Types [MIME] defining computer media formats.

- DC-Ed Comments: Use this element primarily for IMT. Recommended for electronic resources. Use element refinements for non-electronic or physical carriers of a resource.

- Type of term: element

- Refined by: medium; extent

- Has Encoding Scheme

- Obligation: Strongly recommended (R)

- Occurrence

[<img src="D_2dF_files/moin-www.png" alt="[WWW]" height="11" width="11">A-C](http://dublincore.org/educationwiki/A_2dC) | [<img src="D_2dF_files/moin-www.png" alt="[WWW]" height="11" width="11">G-L](http://dublincore.org/educationwiki/G_2dL)

 [RefreshCache](http://dublincore.org/educationwiki/D_2dF?action=refresh&arena=Page.py&key=D_2dF.text_html) for this page (cached 2012-12-08 16:51:52)  

Immutable page (last edited 2005-08-22 20:12:34 by dpc-evans)


---
title: "- DateRequirements"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/datewiki/pages/DateRequirements.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DateRequirements](http://dublincore.org/datewiki/DateRequirements?action=fullsearch&value=DateRequirements&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/datewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/datewiki/FrontPage)
- [RecentChanges](http://dublincore.org/datewiki/RecentChanges)
- [FindPage](http://dublincore.org/datewiki/FindPage)
- [HelpContents](http://dublincore.org/datewiki/HelpContents)

Page

- [Edit](http://dublincore.org/datewiki/DateRequirements?action=edit "Edit")
- [View](http://dublincore.org/datewiki/DateRequirements "View")
- [Diffs](http://dublincore.org/datewiki/DateRequirements?action=diff "Diffs")
- [Info](http://dublincore.org/datewiki/DateRequirements?action=info "Info")
- [Subscribe](http://dublincore.org/datewiki/DateRequirements?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/datewiki/DateRequirements?action=raw "Raw")
- [Print](http://dublincore.org/datewiki/DateRequirements?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/datewiki/DateRequirements?action=AttachFile)
- [DSP2XML](http://dublincore.org/datewiki/DateRequirements?action=DSP2XML)
- [DeletePage](http://dublincore.org/datewiki/DateRequirements?action=DeletePage)
- [LikePages](http://dublincore.org/datewiki/DateRequirements?action=LikePages)
- [LocalSiteMap](http://dublincore.org/datewiki/DateRequirements?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/datewiki/DateRequirements?action=SpellCheck)

Search

<form method="POST" action="/datewiki/DateRequirements">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DateRequirements_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DateRequirements_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DCMI Date and Time Representation Requirements

This document is part of the DCMI Date Format Task Force wiki.

IMPORTANT: Do not cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

This is a draft document, currently being worked on by the DCMI Date Format Task Force. Comments should be sent to the [DC-DATE@jiscmail.ac.uk](mailto:DC-DATE@jiscmail.ac.uk) mailing list or direct to the editor.

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong> </td>
      <td>
        <strong> DCMI Date and Time Representation Requirements </strong> </td>
    </tr>
    <tr>
      <td>
        <strong>Editor:</strong> </td>
      <td>
        Douglas Campbell, National Library of New Zealand &lt;<a href="mailto:douglas.campbell@natlib.govt.nz">douglas.campbell@natlib.govt.nz</a>&gt; </td>
    </tr>
    <tr>
      <td>
        <strong>Date Created:</strong> </td>
      <td>
        2007-08-22 (use the Wiki “Info” link on the right to see changes made since then) </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong> </td>
      <td>
        <a href="http://dublincore.org/datewiki/DateRequirements">http://dublincore.org/datewiki/DateRequirements</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong> </td>
      <td>
        This document captures the requirements and objectives for representing
        dates and times in a format for use by the Dublin Core Metadata 
        Initiative.</td>
    </tr>
    <tr>
      <td>
        <strong>Status:</strong> </td>
      <td>
        Initial Draft </td>
    </tr>
  </tbody>
</table>


## A. Introduction

This document captures the requirements and objectives for representing dates and times in a machine-readable encoding format. These requirements will be used to evaluate the suitability of existing date/time encoding formats and/or to develop one, or more, new encoding formats for use by the Dublin Core Metadata Initiative.

The requirements are grouped into encoding requirements (how to represent a date or time) and usage requirements (how a reader interacts with an encoded date or time). Each requirement is supported by a number of use cases that illustrate the requirement in real-world scenarios.

These requirements focus on Gregorian-style dates as this has the highest immediate need within the Initiative, it is the calendar supported by the Initiative’s currently preferred date formats (ISO 8601 and the W3C Date Time Format), and is the most common civil calendar in use. However, the intention is to also consider representing other calendars.

This document is an initial draft with many issues open for discussion and no attempt to prioritise the requirements.

If you wish to discuss issues raised below, or join the group drafting the requirements, please feel free to contact the document’s editor (see above).

## B. Background

### The need for a new date format

The Dublin Core metadata community has a need for machine-readable date and time information for metadata interchange.

Dates and times are used in the Date and Coverage elements of the [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">Dublin Core Metadata Terms](http://dublincore.org/documents/dcmi-terms/). Element refinements have also been defined – these give an indication of the types of dates that need to be represented: created, valid, available, issued, modified, dateAccepted, dateCopyrighted, dateSubmitted, spatial [coverage], and temporal [coverage].

The [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">W3C Date Time Note](http://www.w3.org/TR/NOTE-datetime) format (an application profile of ISO 8601) and the DCMI community’s own [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Period](http://dublincore.org/documents/dcmi-period/) format are used for encoding date information, but these have limitations in the types of dates and times that can be represented. The [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">ISO 8601](http://www.iso.org/iso/en/CatalogueDetailPage.CatalogueDetail?CSNUMBER=40874&ICS1=1&ICS2=140&ICS3=30) Standard provides more flexibility, but also has some limitations and is quite complex to implement due to its large number of possible permutations.

The DCMI community’s Date Format Task Force is now investigating alternative date and time formats.

### Discussion on dates and times

This document focuses on Gregorian dates but the longer-term intention is to also cater for non-Gregorian dates. This section takes a look at time keeping generally, highlighting wider issues that should be taken into consideration.

Dates and times are typically recorded so events can be compared for sequencing (ordering). Time is continuous so must be artificially segmented in order to have values to compare against for sequencing. It is this segmentation of time, and representing those segments, that calendars and clocks (and hence this document) are concerned with.

There are many ways to segment time; most typically a cyclic event in our environment is used as it is easy to observe and count. A “day” is a common, basic cycle used. The unit of a day is often used as the basis for measuring other cycles, for example, multiple days make up segments named months and years, while fractions of a day are named hours and minutes. However, even the definition of something as universally occurring as a day differs among cultures, for example, some cultures state a day begins at sunset, whereas others state it begins at an arbitrary time during the night (such as ‘midnight’).

Other cycles typically used include:

- Solar year – the time it takes a planet to rotate around its Sun star

- Lunar month – the time it takes a moon to rotate around its planet

A calendar defines a set of time segmentations (cycles) so that moments in time, in both the past and the future, can be accurately and consistently identified. These identified moments in time can then be sequenced.

The difficulty in designing a calendar is that many environmental cycles do not overlap conveniently. For example, currently the Earth’s moon rotates around the Earth every 29.53059 Earth days, while the Earth rotates around the Sun every 12.368 of those lunar rotations.

As a result, calendars often approximate natural cycles, but over long periods of time they then cease to represent those original cycles so need adjustments, such as ‘leap years’. What’s more, those adjustments to a calendar may be made differently in different countries at different times. For example, the switch from Julian to Gregorian calendar occurred in different countries at different times, resulting in a different number of catch-up days added in each country.

While the sequence of days and nights through the ages is constant, the ways of identifying each day varies, even within a single calendar. For example, if we count backwards using the Gregorian calendar, “0800-11-06” may actually have been Christmas Day in some countries.

The primary aim of a date encoding format for the DCMI is to identify each day consistently for comparing and sequencing events, even if the date representation doesn’t represent the day as it would have been experienced at the time, that may require a secondary translation.

### Discussion on a framework for date encoding formats

(At this stage, this section contains suggestions for requirements that need further discussion.)

This document’s scope is primarily the Gregorian calendar so it does not include requirements for non-Gregorian calendars. However, it is worth looking at a generic framework that might be applicable to other calendars as this may affect how this format is developed.

Calendars represent cycles of time. Often there are multiple overlapping cycles included in a calendar, eg. Gregorian has ‘year-month-day’, but also ‘day number with this whole year’ and the repeating seven day week.

A date encoding format should select one set of cycles and encode using those only. This set of cycles must identify each day uniquely. Typically these will be a hierarchical set of cycles where each cycle is of a shorter duration than its parent cycle, such as ‘year-month-day’. The additional cycles in the calendar can be derived separately.

Sequencing is easiest when using numbers. Where a cycle is not currently identified using numbers, numbers should be arbitrarily assigned, with the mapping documented for conversion to and from those numbers.

## C. Encoding Requirements

The requirements below are features or characteristics that the date format is expected to support when an agent wishes to represent a date or time. Use cases are provided as real-world examples to illustrate the requirements. They also indicate sample dates and times that are expected to be representable using the date format.

Only the scenario for each use case appears below, as there is only actually one generic use case that has multiple scenarios, i.e. “Encoder converts date or time to a machine-readable representation”.

### Scope: Dates of events only; dates as subjects is excluded
Dates are sometimes used as part of a label to indicate a theme or topic or genre that might be associated with that date or period, e.g. ‘1940s music’. 

The date encoding format documented in this document might be used to represent these labels in a way that can be used for sequencing. However, this usage is not a requirement of, nor intended to be supported by, this date encoding format. This document only includes dates and times of events.

### Scope: Absolute dates only
The primary purpose of this date encoding is for sequencing actual moments in time. Abstract dates or periods are excluded, e.g. “3 weeks”, “12 March”, “2pm”. Note that dates/times without the time zone specified are in scope. 
### 1. Gregorian dates
Encoding requirement: 
- Ability to represent dates from the Gregorian calendar

Comment:

- The Gregorian calendar is the most commonly used civil calendar, according to the [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">US Naval Observatory](http://aa.usno.navy.mil/faq/docs/calendars.html).

### 2. ISO 8601 and W3C Date Time Format compatibility
Encoding requirement: 
- Comply with ISO 8601 and W3C Date Time Format formats where possible

Comment:

- These date formats are already widely used and familiar. Ideally they would be incorporated where appropriate.

### 3. Precision available
Encoding requirement: 
- Ability to represent a date or time in a range of precision levels:

  - Millennium

  - Century

  - Year

  - Month

  - Day

  - Hour

  - Minute

  - Second

  - Fraction of a second, including multiple decimal places

  - Time zone (optional)

  - Week of year

  - Day of year

- Ability to specify midnight unambiguously

- Ability to specify the start or end of a precision component unambiguously

Issues:

- Should extension times be in scope, e.g. 26th hour of a day

Use case scenarios:

- 1 January 2000, 00:00 – midnight at the beginning of 1 January 2000

- 1 January 2000, 24:00 – midnight at the end of 1 January 2000

- T01:60:60 – the end of the hour beginning at 1am

- T02:00:00 – the beginning of the hour beginning at 2am

### 4. Short format
Requirement: 
- Ability to represent a date or time using only digits.

Comment:

- This may require a separate, special encoding format.

Source:

- DCMI Libraries Application Profile Task Group

User case scenario:

- MARC uses digit-only dates and times, e.g. field [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">005 Date and Time of Last Transaction](http://www.loc.gov/marc/bibliographic/ecbdcntr.html#mrcb005)

### 5. Approximate dates
Encoding requirement: 
- Ability to indicate that some, or all, of the date or time is conjecture (best guess), but that the event occurred within a known period.

Issues:

- Approximate dates imply that the event occurred during an undefined amount of time before or after a central point in time. The size of that period potentially may be inferred from the resolution of the central point in time, recognising that this inference may be incorrect however. For example, if just a year is supplied (e.g. circa 1880), it might be inferred that the known period is up to five years before or after that year; whereas if a year, month, and day is supplied (e.g. circa 14 May 1880), it might be inferred that the year and month are known, and that the event is known to have occurred five days before or after the supplied day. However, it should be noted that as the range is not specifically defined, the reader might incorrectly interpret the size of the amount of time before or after.

Source:

- DCMI Libraries Application Profile Task Group

Use case scenarios:

- Circa 1945 (sometime around about the year 1945)

- Ca. 1760-1790 (sometime between the years 1760 and 1790)

- On 12th March 2003 at around 14:00

- 1989-03-00 (Northern Hemisphere Spring-Summer 1989 magazine edition)

Resources:

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">MODS User Guide](http://www.loc.gov/standards/mods/v3/mods-userguide-generalapp.html) - date “qualifier” attribute

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">AACR2: Anglo-American Cataloguing Rules, Second Edition](http://www.aacr2.org/) – section 1.4F7

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">ISAD(G): General International Standard Archival Description, Second edition](http://www.ica.org/en/node/30000) – section 3.1.3 dates

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">EAD: Encoded Archival Description](http://www.loc.gov/ead/tglib/elements/date.html) – date “certainty” attribute

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">Rules for Archival Description](http://www.cdncouncilarchives.ca/archdesrules.html) – section 1.4B5 probable and uncertain dates

### 6. Questionable dates
Encoding requirement: 
- Ability to indicate that some, or all, of the date or time is unknown; or, that the stated period (that the event took place during) is conjecture (best guess).

Source:

- DCMI Libraries Application Profile Task Group

Use case scenarios:

- [195u] – In the 1950s decade

- [1880?] – The painting is undated and unsigned but depicts an event that occurred in 1880 and the painting style is similar to other paintings from the late 19th century

- [15 Sep? 19?8] – The document is dated, most of the date is readable except for the month and the third digit of the year, based on other similar documents it was likely to have been written between June and December.

- [Between 1965 and 1981] – The author is thought to have flourished between 1965 and 1981, but it is unknown when this particular book was published in their career.

Resources:

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">MARC 21 Format for Bibliographic Data](http://www.loc.gov/marc/bibliographic/ecbd008s.html) - Control field 008 Fixed-Length Data Element, character position 06, code “q”

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">MODS User Guide](http://www.loc.gov/standards/mods/v3/mods-userguide-generalapp.html) - date “qualifier” attribute

### 7. Date/time ranges
Encoding requirement: 
- Ability to specify a period of time by specifying the terminal points (start and end) of the period.

Comments:

- A period might specified to:

  - state that the event occurred over this period of time, or

  - define a period of time during which the event occurred, e.g. in an questionable date

- The start and end may not be specified to the same resolution, e.g. one terminal might be a specific day while the other may be a specific decade

- It is worth noting that a single date implies a range, eg. “May 1920” implies 1st to 31st of May, “14:30” implies the range of 60 seconds from 14:30 to 14:31

Issues:

- Should terminal dates or times be considered inclusive or exclusive? We could state they are always inclusive?

Source:

- DCMI Collection Description Application Profile Task Group

Use case scenarios:

- The period beginning in 1914 and ending in 1918 – World War 2

- 1940s – the decade beginning in 1940 and ending in 1949

- 19th century – the century beginning in 1800 and ending in 1899

- From 14:00 to 14:35 on 24 July 2005 – when a training course is scheduled

- 15th June 2003 to August 2003 – the race began on 15th June, the participants completed the race at various times throughout August

### 8. Broken date/time ranges
Encoding requirement: 
- Ability to indicate that multiple, individual dates or times are considered to be components of a single event.

Comment:

- Related, individual dates need to be kept together because placing them in separate elements implies that they are separate events

Use case scenarios:

- The hearing was held on the 3rd, 5th, and 9th-12th October 2002.

### 9. Elapsed date/time ranges
Encoding requirement: 
- Ability to indicate that the duration of the event is less than the total time between the termini (start and end points) of the specified period.

Comment:

- There are three pieces of information to convey – the elapsed time and the start and end boundaries it occurred between.

Issues:

- Is duration of a period really required from a date encoding format? It isn’t really necessary for sequencing events.

Use case scenarios:

- The machine was used for a total of 3 hours between 8am and 6pm on 12 June 1999.

- The suspect was online for a total of 3 hours between 8am and 6pm on 12 June 1999.

- The project task is scheduled to take 3.5 working days between the 4th and 21st of August 2006 (e.g. in a project GANTT chart).

### 10. Open-ended date/time ranges
Encoding requirement: 
- Ability to omit the specification of the start or end of a range because it is either not known, or it is considered to be irrelevant.

Comment:

- Open-ended ranges leave the reader to interpret whether there was an unstated, but intended, end point. For example was the intention of “painted before 1950” to include “10 million years ago” as a valid value?

Source:

- DCMI Collection Description Application Profile Task Group

Use case scenarios:

- Before 2005 – the activity had ceased by 2005 but it is unknown when it began

- Up until, and including, 2005 – the activity ceased in 2005, but it is unknown when it began

- After 600 – the activity began sometime after 600

- From May 1883 onwards, including May 1883 – the business began operations in May 1883 and continues operations to the present day

Resources:

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">Dublin Core Collections Application Profile](http://dublincore.org/groups/collections/collection-application-profile/#cldRKMS-ISO8601)

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">RKMS Extension for ISO8601](http://www.sims.monash.edu.au/research/rcrg/research/spirt/deliver/schemes.html#rkmsextension)

### 11. Range soft termini
Encoding requirement: 
- Ability to specify the terminal of a range using another range, because the terminal is known, or can be associated with a known period, but the exact boundaries of the terminal event are not known.

Use case scenarios:

- to do

### 12. Dates prior to 1582
Encoding requirement: 
- Ability to specify dates prior to the introduction of the Gregorian calendar in 1582.

Comment:

- ISO 8601 only permits dates prior to 1582 to be used under special agreement amongst users of the format.

Issues:

- This may be an artificial way of representing dates, as Gregorian dates do not coincide with dates from the Julian calendar in use at the time.

### 13. B.C.E. dates
Encoding requirement: 
- Ability to represent dates in both the ‘Current Era’ (also known as: C.E., Christian Era, Anno Domini, and A.D.) and ‘Before Common Era’ (also known as: B.C.E., Before Christian Era, Before Christ, and B.C.).

Source:

- DCMI Libraries Application Profile Task Group

- DCMI Collection Description Working Group

Use case scenarios:

- -0150 (ISO 8601 format with specific extension agreement) – A statue carved in 150 BCE.

- 1 CE

- 0 CE

- 0 BCE

- 1 BCE

Resources:

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">Wikipedia Common Era entry](http://en.wikipedia.org/w/index.php?title=Common_Era&oldid=72867259)

- [<img src="DateRequirements_files/moin-www.png" alt="[WWW]" height="11" width="11">The Non-Year Zero](http://www.merlyn.demon.co.uk/miscdate.htm#NY0)

### 14. Large dates
Encoding requirement: 
- Ability to represent years containing more than four digits.

Comment:

- Years containing more than 4 digits are only valid in ISO 8601 with special, prior agreement, and the number of digits must be fixed for ALL dates within that agreement.

Issues:

- Avoid mya (million years ago), kya (thousands of years ago), etc. notation as they are relative to a point in time (e.g. 2mya today would be 3mya in one million years time), unless the reference point is also specified.

- Are there any dates likely to be represented greater than 14 billion years ago (the current estimate of when the Big Bang occurred)?

Use case scenarios:

- Homo sapiens idaltu fossils dating from 160000 BCE

- A science fiction novel set in the future in the year 25002 CE

- The “Jurassic” period, 206mya - 144mya (206000000 - 144000000 BCE)

- The Big Bang, 13.7 billion years ago

### 15. Named periods
Encoding requirement: 
- Ability to identify a date range by one, or more, names, and the language of each name.

Comment:

- Sometimes the dates a period start and end are not known, or are not generally agreed upon, or are considered irrelevant, but have a name they are known by.

- The comment for the Dublin Core Coverage element states “Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges.”

Issues:

- Is this contravening the principal of absolute dates only?

Use case scenarios:

- Baroque

- Tang Dynasty

### 16. Non-Gregorian dates
Encoding requirement: 
- Follows an encoding structural framework that non-Gregorian dates can also be encoded in.

Comment:

- It is expected a separate encoding will be needed for each calendar, but that they may share common features in how they are encoded so they are compatible (knowledge can be re-used). For example the Mayan Long Count typically notated as "7.16.3.2.13" might be encoded as "MLC: 07-16-03-02-13".

Use case scenarios:

- The Quinkan (Australian Aboriginal) calendar, which divides the solar year into five seasons:

  - Kamba (proper wet time, December-May)

  - Kabakabada (under water time, April-May)

  - Buluriji (cold time, June-September)

  - Wungariji (hot time, October-November)

  - Jarramali (storm time, November-mid-December)

## D. Usage Requirements

The requirements below are objectives that the date format is expected to meet when an agent wishes to use an encoded date or time. Use cases are provided as real-world examples to illustrate the requirements.

Only the scenario for each use case appears below, as there is only actually one generic use case that has multiple scenarios, i.e. “Encoder uses machine-readable representation of a date or time”.

### 17. Human interpretable
Usage requirement: 
- Ability for a human reader, with the equivalent English reading ability of a 12 year old, to interpret and identify the intended date or time from an encoded date or time.

Comment:

- At times, raw Dublin Core metadata may be exposed to the reader, it should be possible for the reader to get a rough understanding of the date or time encoded without additional software (which may not be available).

Use case scenarios:

- The date and time components structure is familiar

- Each component (e.g. month, day) is identifiable, for example, using separators to indicate the boundaries between each component

- Familiar separators are used between date or time components

- Defaults to CE (uses an additional indicator for BCE)

- Comprehensible if date element refinements are ‘dumbed-down’ to dc:date

### 18. Filename friendly
Usage requirement: 
- Ability to use encoded dates or times in a filename or directory name in common operating systems.

Comment:

- The folllowing punctuation characters are not acceptable in filenames in Windows, Mac OS, or Unix operating systems: \ / : \* ? “ < > |

- ISO 8601:2004 provides for the solidus [/] to be replaced with a double hyphen in certain application areas

- Attaching metadata to digital files is an ongoing issue. This is an area of interest to heritage institutions that are concerned with the vast quantities of digital content now being created with very little discernable metadata (physical items often provide clues as to their creation date). Options include:

  - Setting Operating System attributes for the file, e.g. file creation date/time – these may be volatile, e.g. when the file is copied or moved file date attributes may be altered

  - Embedding metadata inside the file – this may be volatile, e.g. some image editing software does not preserve JPEG EXIF metadata when an image is resaved

  - Embedding metadata in the filename – this is relatively non-volatile as most operating systems will preserve the filename unless the user purposely alters it. While it may require the user to purposely insert the metadata, it first must be possible to insert it in a usable format.

Issues:

- Should the encoding format be limited to ASCII characters? Maybe a % encoding option?

Use case scenarios:

- A photographer extracts the date created from digital photos’ file metadata and inserts it in the filenames, allowing search by date using the operating system’s file search function

- Group image files into directories whose names include the date range the directory covers, e.g. 2-7 June 2005, 14-24 June 2005, and 30 June – 3 July 2005

### 19. ASCII sortable
Usage requirement: 
- Basic (left-anchored) ASCII text sorting of dates/times returns a “reasonable” ordering

Comment:

- Accurate ordering will likely require a specialist program that caters for the various nuances of date/time encodings. However many readers will not have access to programming skills, so they would appreciate getting 80% or more accuracy in the ordering by using a common ASCII text sort on the encoded dates/times

Issues:

- All the dates will need to be from the same calendar (e.g. Gregorian) for sorting to work

Use case scenarios:

- A photographer extracts the date created from digital photos’ file metadata and inserts it at the beginning of the filenames, so sorting by filename presents them in rough chronological order

- Dublin Core metadata is created in a spreadsheet; it can be sorted directly by date or time without requiring programming skills

 [RefreshCache](http://dublincore.org/datewiki/DateRequirements?action=refresh&arena=Page.py&key=DateRequirements.text_html) for this page (cached 2012-12-21 22:08:02)  

Immutable page (last edited 2007-08-23 22:50:27 by DouglasCampbell)


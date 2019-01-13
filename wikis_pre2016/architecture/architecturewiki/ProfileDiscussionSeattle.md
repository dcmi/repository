---
title: "- ProfileDiscussionSeattle"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/ProfileDiscussionSeattle.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ProfileDiscussionSeattle](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=fullsearch&value=ProfileDiscussionSeattle&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle "View")
- [Diffs](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/ProfileDiscussionSeattle">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ProfileDiscussionSeattle_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ProfileDiscussionSeattle_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Usage Board Discussion on Application Profiles

\* DCMI Usage Board Meeting, 29-30 April 2006, Seattle

How can we make it easy for users to prepare application profiles? These are extant documents that relate to application profiles:

Points of reference

- DCAP (CEN) documentation guidelines

 [http://dublincore.org/usage/documents/2005/09/03/profile-guidelines/](http://dublincore.org/usage/documents/2005/09/03/profile-guidelines/)- Term Decision Tree

 [http://www.ukoln.ac.uk/metadata/dcmi/term-decision-tree/](http://www.ukoln.ac.uk/metadata/dcmi/term-decision-tree/)- DCAP-in-RDF (CEN)

 [http://www.cenorm.be/isss/cwa15248/](http://www.cenorm.be/isss/cwa15248/)- DCMI Abstract Model (needs Profile Model)

 [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)

What is an application profile?

OLD: "list of terms"

NEW: "Statement of what set of things are being described, and a list of terms that going to be used to describe those things." If so, then we need an application profile for an application profile.

Is it:

- Rules by which you create a description set for an application?

- The makeup of a description set?

Agreed: Something like <tt>Rules by which a description set is "defined"</tt>.

### Outline of an Application Profile for an Application Profile

- Description of this DCAP

  - dc:creator = Samuel Adams

  - dc:title = My application profile

  - dc:description

- Model (e.g., entity-relationship model)

  - Model of Entity 1

    - Property 1

    - Property 2

    - Property 3

  - Model of Entity 2

    - Property 1

    - Property 2

    - Property 3

  - [DescriptionUsage](http://dublincore.org/architecturewiki/DescriptionUsage)

    - Description 1

      - Occurrence = 1

      - Class of described resources = collection (rdf:type, or new term?)

      - [PropertyUsage](http://dublincore.org/architecturewiki/PropertyUsage)

        - Uses Property

        - Label for this DCAP

        - Usage in this DCAP (something like "Usage Comments")

        - Constraint: Obligation

        - Constraint: Datatype

        - Constraint: Occurence

        - Constraint: Condition [text]

        - VES Usage

          - UsesVES

          - VESLabel for this DCAP

          - Usage in this DCAP

          - Constraint for VESUsage: Obligation

          - Constraint for VESUsage: Occurence

          - Constraint for VESUsage: Condition [text]

        - Value URI Usage

          - Constraint: Obligation

          - ...

        - SES Usage

          - ...

        - Rich Representation Usage

          - ...

        - Value String Usage

          - ...

      - [PropertyUsage](http://dublincore.org/architecturewiki/PropertyUsage)

    - Description 2

      - Occurrence = 1 or more

      - Class of entities = agent

      - [PropertyUsage](http://dublincore.org/architecturewiki/PropertyUsage)

      - [PropertyUsage](http://dublincore.org/architecturewiki/PropertyUsage)

ISSUES

- Need [QualifiedNameforProperty](http://dublincore.org/architecturewiki/QualifiedNameforProperty)?

- Need Qualified Name for Syntax Encoding Scheme?

- Need to serve properties from the property URI -- i.e., translations (Finnish) must come from DCMI namespace?

- Is an application profile used for instance metadata creation?

- Do property usages have URI`s?

- How do you say you must use LCSH? In Obligation?

- Do we need "condition" or does it go in "best practices" documents?

- Need to model Value String Usage and Obligation.

- RDF representation of the above

- Regarding "Local Definition": Definition is sacrosanct -- if you<tt>re using someone else</tt>s properties the definition should not be changed

- Simple DC defaults to describing resources -- so it does not require models of multiple entities.

DOCUMENTATIONAL VS FORMAL STYLE

- Do we need two styles (for property usages)? One for humans (documentational) and one for machines (formal)? For example, should the documentation include, as part of [PropertyUsage](http://dublincore.org/architecturewiki/PropertyUsage):

  - Source Label {for information only} [do these by reference]

  - Source Definition {for information only} [do these by reference]

  - Source Comment {for information only} [do these by reference]

DOCUMENTATION MAINTENANCE

\* How do we maintain a master copy of this AP of an AP? RDF/XML should be the master copy. Different scenarios:

- 1) NSDL Interface -> RDF/XML -> HTML or XML

- 2) Dctext -> RDF/XML-> HTML or XML

- 3) Schema Generation Tool -> RDF/XML-> HTML or XML

- 4) Human -> RDF/XML-> HTML or XML

- AGREED: RDF/XML should be complete enough to generate XML schemas.

AGREED: A separate list of vocabulary encoding schemes can be derived from Property Usage, so we do not need a separate list as part of an application profile.

 [RefreshCache](http://dublincore.org/architecturewiki/ProfileDiscussionSeattle?action=refresh&arena=Page.py&key=ProfileDiscussionSeattle.text_html) for this page (cached 2013-01-03 16:14:00)  

Immutable page (last edited 2007-02-21 15:07:27 by TomBaker)


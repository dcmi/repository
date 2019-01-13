---
title: "- Use Cases"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Use_20Cases.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Use Cases](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=fullsearch&value=Use+Cases&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Edit](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Use_20Cases "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Use_20Cases">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Use_20Cases_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Use_20Cases_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## RDA Vocabularies Use Cases

### Extension of RDA Vocabularies by Communities of Practice

**Purpose**

 A Community of Practice decides to use many or most of the core RDA elements and value vocabularies to describe their resources, but determines that their needs extend beyond those elements and value vocabularies already available in RDA. 

**Primary Actor(s)**

 Representative bodies authorized by the Community of Practice to act on their behalf. 

**Prerequisites**

1. 

Community of Practice must have achieved some consensus about requirements and needs

2. 

Community of Practice must have determined to use RDA as their base, including relationships to FRBR

**Sequence**

1. 

Representative body authorized by the Community of Practice develops a process to determine the required additional elements, value vocabulary additions (whether whole vocabularies or additions to existing vocabularies)

2. 

Representative body authorized by the Community of Practice determines an appropriate domain and registry where the extended elements and vocabularies will be exposed and maintained

3. 

Representative body authorized by the Community of Practice follows their process to the point where their extensions can be used by their community and discovered by others

4. 

Representative body authorized by the Community of Practice develops guidelines for the use of their extensions and makes their guidelines available to those desiring to use their extensions

5. 

Community of Practice determines maintenance policies and procedures for their extensions

**Result**

A formally expressed set of extensions to RDA based on the needs of a Community of Practice becomes available to others. These extended elements and vocabularies are now able to be used by the community for Application Profiles and can also be reused by other communities as well.

_Contributed by Diane Hillmann_

### RDA Online Product

In the past, library cataloging rules have been published in book form. Updates required a new publication and these were done infrequently due to the effort and cost. In the interim between new editions of the rules, awkward methods of either issuing new pages or issuing separate sets of instructions were employed.

RDA will be primarily an online product, although a printed product is envisioned. It will be possible to update the online product more frequently than the previous generation of print versions. It will also be possible to provide updates to definitions, entry vocabulary, and other aspects of the rules that will help catalogers find and use the instructions. This type of more "cosmetic" update was not easily available in the print environment, and at least had to wait until major changes warranted a new edition. The RDA online product has the potential to be kept up to date and to provide that up to date information to all users at the same time.

To facilitate updates, the RDA online product plans to link to the registered RDA Element Vocabularies and the RDA Value Vocabularies. Although elements and their related information may not be retrieved in "real time" by the online product, a method of scheduled update of the RDA Online database can be developed as part of the maintenance of the registered vocabularies.

_Contributed by Karen Coyle_

### Integrated Library Systems

There are dozens of vendors and many dozens of versions of Integrated Library Systems (ILSs) in libraries today. Each of these contains within it the definitions of the standard data elements in the library record (most commonly MARC21), as well as the authoritative lists for the approximately 200 code lists in the MARC record. These code lists are internal to the MARC standard and are updated through the MARC standards process. [Link to MARBI page.] Changes are currently sent out as email notices to various key mailing lists. The Library of Congress is currently working to define the value vocabularies of MARC in SKOS format in a registry. These vocabularies could potentially be accessed by ILS software so that updates to those vocabularies could be effected automatically.

There is considerable overlap between the MARC value vocabularies and the value vocabularies in RDA. Because initial implementations of RDA are expected to take place on systems using the MARC format, the RDA vocabularies will need to be integrated into these systems and potentially cross-walked from the MARC vocabularies. With both vocabularies formalized in Registries, this conversion may be amenable to partial or full automation.

_Contributed by Karen Coyle_

### Scholarly Works Application Profile (SWAP)

The Scholarly Works Application Profile is a newer name for the [<img src="Use_20Cases_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints Application Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Eprints_Application_Profile). SWAP bases its metadata structure on FRBR, and currently uses a partial implementation of the FRBR relationships between FRBR Group 1 entities. SWAP declares its own vocabulary for FRBR Group 1 and 2 entities, with significant changes in a couple of preferred terms. SWAP provides minimal guidelines on content creation for each attribute.

SWAP would potentially benefit from the application of the RDA entity and value vocabularies and RDA-related application profile, and the associated FRBR entity and relationship vocabularies. The [<img src="Use_20Cases_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Scholarly Communications Community](http://dublincore.org/groups/scholar/) includes a forum for discussion around SWAP.

_Contributed by Gordon Dunsire_

* * *

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Use_20Cases?action=refresh&arena=Page.py&key=Use_20Cases.text_html) for this page (cached 2012-12-28 12:36:16)  

Immutable page (last edited 2008-02-20 14:59:35 by GordonDunsire)


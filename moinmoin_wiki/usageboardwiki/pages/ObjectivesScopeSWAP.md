---
title: "- ObjectivesScopeSWAP"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/ObjectivesScopeSWAP.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ObjectivesScopeSWAP](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=fullsearch&value=ObjectivesScopeSWAP&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP "View")
- [Diffs](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/ObjectivesScopeSWAP">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ObjectivesScopeSWAP_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ObjectivesScopeSWAP_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### SWAP: Objectives and Scope, Functional Requirements, Domain Model

#### Objectives and Scope (Andrew and Akira, 20 August 2008)

The Scholarly Works Application Profile (SWAP) [1] was developed in order to provide a method for describing eprints, alternatively referred to as scholarly works, research papers or scholarly research texts. A <tt>Scholarly Work</tt> is a distinct intellectual or artistic scholarly creation. SWAP defines an eprint to be a scientific or scholarly research text , for example a peer-reviewed journal article, a preprint, a working paper, a thesis, a book chapter, a report, etc.

The purpose of the SWAP was to offer a solution to metadata issues identified in Eprints UK, a JISC funded research project, and to provide a richer metadata profile for the Intute repository search service [2] to use to aggregate content from digital repositories. [3]

The audience for the profile is described in the background statement [9] as the JISC repositories search service and other parts of the JISC repositories programme; and the eprints repositories community in the UK, especially those running live eprints repositories, and those about to establish such repositories. The target user group for SWAP is defined as: Implementers of UK Institutional Repositories search service; Managers and administrators of UK eprint repositories; Implementers of the Prospero interim repository. [4]

Use cases for the SWAP are set out in the description of each of the functional requirements for the profile -- they are too long to list here individually. [5]

#### Functional Requirements

The descriptions provided for in SWAP allow the description of the range of eprints/scholarly works typically produced by academics and researchers. While, the SWAP describes a large number of functional requirements, descriptions made using the profile are principally designed to [9]:

- Provide richer, more consistent metadata descriptions of eprints;

- Facilitate search, browse or filter by a range of elements, including journal, conference or publication title, peer-review status and resource type;

- Enable identification of the latest, or most appropriate, version and facilitate navigation between different versions of eprints;

- Support added-value services, particularly those based on the use of OpenURL [ContextObjects](http://dublincore.org/usageboardwiki/ContextObjects);

- Implement an unambiguous method of identifying the full text(s) of eprints;

- Enable identification of the research funder and project code;

- Facilitate identification of open access materials.

#### Domain Model

The domain model used by SWAP is based on the Functional Requirements for Bibliographic Records (FRBR) model, issued by the International Federation of Library Associations (IFLA) in 1998 [6]. FRBR models the bibliographic world using 4 key entities - 'Work', 'Expression', 'Manifestation' and 'Item' -- which are the subject of bibliographic descriptions. The SWAP model includes a fifth entity, <tt>agent</tt>, which embodies the FRBR supporting entities of <tt>person</tt> and <tt>corporate body</tt>.

The SWAP documentation includes both a diagrammatic description of the domain model and a natural language expression of the diagram [7]:

"A [ScholarlyWork](http://dublincore.org/usageboardwiki/ScholarlyWork) may be expressed as one or more Expressions. Each Expression may be manifested as one or more Manifestations. Each Manifestation may be made available as one or more Copies. Each [ScholarlyWork](http://dublincore.org/usageboardwiki/ScholarlyWork) may have one or more creators, funders and supervisors. Each Expression may be have one or more editors. Each Manifestation may have one or more publishers."

- [1] [http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile](http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile)

- [2] [http://www.intute.ac.uk/](http://www.intute.ac.uk/)

- [3] None of the SWAP documentation describes the objectives of SWAP itself, although the statement about the background to the development of the profile provided on the SWAP wiki [8] gives what are essentially the objectives of the profile [9]. The description above also uses information from an article in Ariadne [10], and a 2006 presentation by J. Allinson and A. Powell [11].

- [4] [http://www.ukoln.ac.uk/repositories/digirep/index/Functional\_Requirements#Stakeholders\_and\_designated\_community](http://www.ukoln.ac.uk/repositories/digirep/index/Functional_Requirements#Stakeholders_and_designated_community)

- [5] [http://www.ukoln.ac.uk/repositories/digirep/index/Functional\_Requirements#Functional\_Requirements\_Specification](http://www.ukoln.ac.uk/repositories/digirep/index/Functional_Requirements#Functional_Requirements_Specification)

- [6] [http://www.ifla.org/VII/s13/frbr/frbr.htm](http://www.ifla.org/VII/s13/frbr/frbr.htm)

- [7] [http://www.ukoln.ac.uk/repositories/digirep/index/Model](http://www.ukoln.ac.uk/repositories/digirep/index/Model)

- [8] [http://www.ukoln.ac.uk/repositories/digirep/index/SWAP](http://www.ukoln.ac.uk/repositories/digirep/index/SWAP)

- [9] [http://www.ukoln.ac.uk/repositories/digirep/index/SWAP#Background](http://www.ukoln.ac.uk/repositories/digirep/index/SWAP#Background)

- [10] [http://www.ariadne.ac.uk/issue50/allinson-et-al/](http://www.ariadne.ac.uk/issue50/allinson-et-al/)

- [11] [http://www.ukoln.ac.uk/ukoln/staff/j.allinson/eprints-ap-openscholarship.pdf](http://www.ukoln.ac.uk/ukoln/staff/j.allinson/eprints-ap-openscholarship.pdf)

## Questions asked of the SWAP for this part of the review

1. Is there a description of the context in which the application profile is used (or can be used)?

 Yes. 

2. Is the target user group for the application profile identified and described?

 Yes. 

3. Are the organizations and individuals who participated in the development of a profile identified and described?

 Yes. 

4. Are any arrangements, guidelines, or intentions regarding the future development and maintenance of the profile described?

 Yes. 

5. Are the functional requirements defined?

 Yes. 

6. Does the model depict the set of entities to be described and the relationships among those entities?

 Yes 

7. If an application profile uses an externally defined data model:

 FRBR is used as the basis 

8. Is the externally data model identified?

 Yes. 

9. Are deviations from the externally defined data model documented?

 Yes. 

 [RefreshCache](http://dublincore.org/usageboardwiki/ObjectivesScopeSWAP?action=refresh&arena=Page.py&key=ObjectivesScopeSWAP.text_html) for this page (cached 2012-12-09 11:43:38)  

Immutable page (last edited 2008-09-17 13:34:33 by TomBaker)


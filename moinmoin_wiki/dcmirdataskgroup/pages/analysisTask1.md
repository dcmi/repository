---
title: "- analysisTask1"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/analysisTask1.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [analysisTask1](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=fullsearch&value=analysisTask1&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Edit](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/analysisTask1 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/analysisTask1">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="analysisTask1_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="analysisTask1_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Task 1.1 Analysis of RDA data elements.

Summary: Analyse the RDA data model entities to identify those elements that will be included in the declared “RDA Element Vocabulary”.

### Useful RDA Files

- RDA Element Analysis (December 2007)

 [http://www.collectionscanada.gc.ca/jsc/docs/5rda-elementanalysisrev.pdf](http://www.collectionscanada.gc.ca/jsc/docs/5rda-elementanalysisrev.pdf)- RDA to FRBR mapping (December 2007)

 [http://www.collectionscanada.gc.ca/jsc/docs/5rda-frbrmappingrev.pdf](http://www.collectionscanada.gc.ca/jsc/docs/5rda-frbrmappingrev.pdf)- RDA to FRAD mapping (December 2007)

 [http://www.collectionscanada.gc.ca/jsc/docs/5rda-fradmapping.pdf](http://www.collectionscanada.gc.ca/jsc/docs/5rda-fradmapping.pdf)
### Very General Info on the RDA Elements

Based on the RDA Element Analysis of December, 2007 RDA contains:

1. 

Elements (eg. Title) (approx. 248)

2. 

Element sub-types (eg. Alternative title and Parallel title are sub-types of Title) (approx. 132)

3. 

Sub-elements (eg. Publication date is a sub-element of the element Publication Statement) (approx. 47)

Each of these belongs to one or more FRBR entity domains (eg. Work, Manifestation). Included in the list of elements are those for FRBR Group I entities (work, expression, manifestation, item), and Group II entities (person, corporate body) and Group III (concept, object, event, place). The Group III entities are not described in detail as they are outside of the immediate scope for RDA. However, it will be important to assure that Group III entities can be defined in the future in a way that is compatible with the vocabularies assigned by this project.

Note in particular that while RDA makes use of the FRBR entities and relationships, it is not 0ne-to-one with FRBR in its use of what FRBR calls "attributes." Some FRBR attributes are not found in RDA, and some RDA elements are not found among the FRBR attributes. (See RDA to FRBR mapping.) In addition, RDA defines what appears to be an additional Group II entity, "Family."

Some entities are defined as having values that are enumerated in specific vocabularies (eg. RDA carrier type). These will be dealt with in Task 2.

### Requirements

- Each RDA element needs to be defined as a relation between two entities. For example, a creator element is a relation between a Resource and a Person (or Agent, generally).

- Each RDA element must specify to which class of resources the element applies (the Domain of the property), and which class of resources the element can have as values (the Range of the property).

- Each RDA element must specify whether the value is a string, or whether it is a thing/entity (Person, Concept, Status, etc). Things/entities can be further described (in the same metadata record or elsewhere), while for string literals, no further description of the value is necessary or even possible.

### Primary Analysis Issues
**Issue #1: Relationship to FRBR Entities** 

How far is it necessary to go in associating RDA elements to FRBR entities in the formal representation? Some RDA elements are associated with more than one FRBR entity, so opting to go without the specific association we could be introducing both a measure of ambiguity and the possibility of hindering interoperability. Making the association firmly introduces some additional complexity in regards to sub-properties, however.

**Issue #2: RDA "Statements" as aggregations**

There are "statements" in RDA that consist of more than one possible element. They vary in how they are presented. The "Edition statement" is not subdivided in the RDA element table; the "Publication statement" is subdivided into Place, Publisher name, and Date of publication. Generally speaking, named elements like Place or Publisher will have their own place in the vocabulary; they can be combined to create a "Publication statement" based on their definition in the Application Profile. For statements like Edition, more analysis will be needed to determine if there are distinct elements that should be defined, or if the statement can only be expressed as a single string value.

**Issue #3: Sub-properties, general properties, and the "Dumb down" rule**

There are various places in the RDA element list where there are elements and element sub-types. The sub-types are specific elements under a more general element. As an example, "Date of Work" has sub-types "Date of Creation (of Work), Date of first Publication (of Work)," etc. In some cases (especially relating to non-book materials) there is an element called Layout, a sub-type of "general" and other sub-types qualified for specific material types. Layout Layout (general) Layout of map Layout of tactile music The heading element ("Layout" in this case) could be seen as redundant with "Layout (general)". Where possible we will define a general data element as the broader element, not a sub-type. Using the "dumb down princple" developed for Dublin Core qualifiers ("a client should be able to ignore any qualifier and use the information as if it were unqualified"), the vocabulary will be structured such that the broader term can be used when a qualified term is unneeded or undesired.

**Issue #4: About a Resource vs. about a description**

The RDA element list includes elements about the resource being described as well as elements about the descriptive metadata itself (e.g. annotations on the series statement). There is no doubt that "meta-metadata" will be essential in applications based on the RDA vocabulary. For the moment, however, we will concentrate on the data elements that are about the resource, and will tackle the data elements that describe the metadata in a later phase.

**Issue #5: Tension between transcription and cataloger “preferences”**

We are aware of the importance of transcribed data in the cataloging rules. Transcribed data, however, is not conducive to data processing due to being textual and unstructured. We will be keeping this in mind as we develop the vocabulary from the RDA element set, as well as keeping in mind the need to create meta-metadata to describe the source of data and terms of capture.

**Issue #6: Elements for specialized materials**

Much of what complicates the RDA text is the need to "digress" into rules for a variety of material types. This may be less problematic in the online version of RDA. We will probably initially present the vocabulary as oriented to general bibliographic description, and will treat rules for material types as qualifiers on the general. There should be discussion of how the use of a Registry could help the many specialist communities extend the vocabulary according to their needs.

**Issue #7: Use of elements for multiple purposes**

A key area of difficulty for the analysis of RDA data elements into a rigorously defined vocabulary is that many data elements have traditionally played multiple roles in library bibliographic data. It is common for a single string to be used for display, sorting, and retrieval. The recent changes to RDA and the acknowledgement that "access points" are not elements but uses of elements (alone or with other data) is a positive direction in breaking apart some of the purposes of single points of data. The development of the RDA vocabulary may surface areas where multiple uses have been assumed in the past. We will need to resolve these so that each element is clearly defined as a single "thing", and that how it is being used is moved to the Application Profile.

### Top Level Elements, by FRBR Group

#### FRBR Group 1 - Bibliographic Resource

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="analysisTask1_files/analysisTask1_003.png" alt="RDA_group1_v3.png">
      </td>
    </tr>
  </tbody>
</table>


#### FRBR Group 2 - Agents

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="analysisTask1_files/analysisTask1.png" alt="RDA_group2.png">
      </td>
    </tr>
  </tbody>
</table>


#### FRBR Group 3 - Subjects

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="analysisTask1_files/analysisTask1_002.png" alt="RDA_group3.png">
      </td>
    </tr>
  </tbody>
</table>


 [RefreshCache](http://dublincore.org/dcmirdataskgroup/analysisTask1?action=refresh&arena=Page.py&key=analysisTask1.text_html) for this page (cached 2012-12-29 09:52:33)  

Immutable page (last edited 2008-02-23 18:56:25 by KarenCoyle)


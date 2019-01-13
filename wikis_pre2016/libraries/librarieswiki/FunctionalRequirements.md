---
title: "- FunctionalRequirements"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/librarieswiki/pages/FunctionalRequirements.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [FunctionalRequirements](http://dublincore.org/librarieswiki/FunctionalRequirements?action=fullsearch&value=FunctionalRequirements&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/librarieswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/librarieswiki/FrontPage)
- [RecentChanges](http://dublincore.org/librarieswiki/RecentChanges)
- [FindPage](http://dublincore.org/librarieswiki/FindPage)
- [HelpContents](http://dublincore.org/librarieswiki/HelpContents)

Page

- [Edit](http://dublincore.org/librarieswiki/FunctionalRequirements?action=edit "Edit")
- [View](http://dublincore.org/librarieswiki/FunctionalRequirements "View")
- [Diffs](http://dublincore.org/librarieswiki/FunctionalRequirements?action=diff "Diffs")
- [Info](http://dublincore.org/librarieswiki/FunctionalRequirements?action=info "Info")
- [Subscribe](http://dublincore.org/librarieswiki/FunctionalRequirements?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/librarieswiki/FunctionalRequirements?action=raw "Raw")
- [Print](http://dublincore.org/librarieswiki/FunctionalRequirements?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/librarieswiki/FunctionalRequirements?action=AttachFile)
- [DSP2XML](http://dublincore.org/librarieswiki/FunctionalRequirements?action=DSP2XML)
- [DeletePage](http://dublincore.org/librarieswiki/FunctionalRequirements?action=DeletePage)
- [LikePages](http://dublincore.org/librarieswiki/FunctionalRequirements?action=LikePages)
- [LocalSiteMap](http://dublincore.org/librarieswiki/FunctionalRequirements?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/librarieswiki/FunctionalRequirements?action=SpellCheck)

Search

<form method="POST" action="/librarieswiki/FunctionalRequirements">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="FunctionalRequirements_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="FunctionalRequirements_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### Functional Requirements of DC-Lib AP for Bibliographic Text Resources

According to Singapore Framework the Functional Requirements describe the functions of an application with regard to the user needs. A similar statement we find at the Functional Requirements for Bibliographic Records (FRBR) which define the following four generic user tasks:

- find an entity

- identify an entity

- select an entity

- acquire or obtain an entity

In addition to these generic functionalities the DC Lib AP for Bibliographic Text Resources defines the following use cases as the specific functions this profile has to achieve:

#### Metadata as linked data

**Use Case:** Metadata describing bibliographic text resources shall be used in a linked data context.  
**Requirements:** Use a linked data compatible syntax. 

**Use Case:** Metadata describing bibliographic text resources shall be combined with metadata from other sources.  
**Requirement:** Use a domain model which allows to join data from other domains.

**Use Case:** Metadata describing bibliographic text resource shall be used to fix the relationships between these and other resources.  
**Requirement:** Use metadata terms supporting the usage of identifiers for citation and linking.

#### Simple creation of bibliographic metadata

**Use Case:** A developer wants the simple and easy implementation of a cataloguing application.  
**Requirement:** Use a domain model as simple as possible. 

**Use Case:** A metadata provider wants to make specific assertions about his copy of a publication.  
**Requirement:** The domain model has to distinguish between a publication and its local copies.

**Use Case:** A metadata provider wants the creation of metadata quickly and efficiently.  
**Requirement:** Support a standard description using a small number of mandatory metadata terms combined with a manageable number of optional terms.

**Use Case:** A metadata provider wants to describe bibliographic text resources by non-librarian staff.  
**Requirement:** Support the creation of metadata by using plain and well defined metadata terms.

#### Discovery of library resources

**Use Case:** A user searches for a particular publication of a work and knows the titel, persons and/or coporation responsible for it and/or the identifier.   
**Requirement:** Support the search of a particular publication by given titles, names (of a person or corporate body) and/or identifiers. 

**Use Case:** A user searches for all publications of a given person or coporate body.  
**Requirement:** Support the search of all publications for which a given person or coporate body is responsible.

**Use Case:** A user searches for informations about a specific topic.  
**Requirement:** Support the search of all publications of a given topic.

**Use Case:** A User wants to filter search results.  
**Requirement:** Support the filtering of search results by languages, formats, dates, names (of persons or coporate bodys), subjects, types of work and availabilities.

**Use Case:** A user wants to identify relevant publications.  
**Requriement:** Support the identification of the relevance of a publication using titles, persons or coproate bodies responsible for the work, descriptions, dates, languages, subjects, relations and identifiers.

**Use Case:** A user wants to get information about the life cycle of a particular publication.  
**Requirement:** Show the different dates of the life cycle of a particular publication.

**Use Case:** A user wants to know what relationships exist between different publications.  
**Requirement:** Show the relations between publications and link one to another by these relations.

**Use Case:** A user wants to identify all copies of a publication he can use.  
**Requirement:** Show the usability of a copy by the availiabilities and access conditions.

**Use Case** : A user wants to obtain a specific copy.   
**Requirement:** Show the identifier and the availability and access conditions of a particular copy.

* * *
**Back to [RevisionDraft](http://dublincore.org/librarieswiki/RevisionDraft)** 

 [RefreshCache](http://dublincore.org/librarieswiki/FunctionalRequirements?action=refresh&arena=Page.py&key=FunctionalRequirements.text_html) for this page (cached 2012-12-08 20:06:44)  

Immutable page (last edited 2010-11-07 18:05:01 by StefanieRuehle)


---
title: "- ResponseToUsageBoard"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/ResponseToUsageBoard.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ResponseToUsageBoard](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=fullsearch&value=ResponseToUsageBoard&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard "View")
- [Diffs](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/ResponseToUsageBoard">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ResponseToUsageBoard_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ResponseToUsageBoard_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The aim of this document is to: 
- briefly characterize and point to current work or position papers,

- summarize the reactions of WG members to the decision text, and

- summarize in a paragraph or so the discussion on Adaptation versus Accessibility.

## Usage Board Decision Components with Responses

### Changing the name of the element from "Accessibility" to "Adaptation"

The scope of the proposed element was originally everything to do with accessibility. In the light of the Usage Board's comments, and other considerations, it was decided to narrow the scope of the new element to be one that dealt only with the major aspect that was not already covered in Dublin Core, the adaptation characteristics of the resource, and to use it and re-use other Dublin Core elements in an accessibility application profile.

This change allowed the structure of the values for the new element to be significantly simplified and also allowed it to be more easily generalised for other applications, such as for device independence uses to do with mobility, and flexibility for e-learning. It also meant the name could be changed to disambiguate the element with access which seemed to cause some people problems. Instead of singling out accessibility, it acts to mainstream accessibility issues, satisfying another issue that caused concern to some.

### Changing the definition of the element

The definition of the proposed 'accessibility' term was:

 A statement describing characteristics of the resource that affect how it can be adapted so it can be perceived, understood or interacted with by users. 

With a narrower scope element about adaptation characteristics, the current proposal is for:

 A statement describing characteristics of the resource that affect how it can be sensed, understood, or interacted with by users or agents. 

There has been significant discussion of these changes. A couple of people commented on the DC-Accessibility mailing list that they were not sure about the changes, including one who was on the Task Group, but there has been a lot of informal discussion in the accessibility community in general and within the task group and the consensus is that adaptation is a better term and the narrow scope is more useful than the original wider 'accessibility'. All the work has been exposed on the DC-Accessibility Wiki for some time and it has been presented in major fora such as the W3C annual conference, accessibility conferences, standards organisations including ISO JTC1 SC36, and more.

UB members considered it necessary to put the changed proposal through the standard procedure of discussion and approval by the wider Accessibility/Adaptation community, along with a public comment period, before it could be approved by the Usage Board. This has been done. There was also discussion about a new working group for adaptation but that proposal has been withdrawn.

### Relationship between new element and DC Abstract Model

The Usage Board questioned how an Adaptation element fits into the DCMI Abstract Model. Work on this was undertaken by the Task group who have developed an abstract model for the new element and clarified how it complies with the DC Abstract Model. See [AccessForAllFramework](http://dublincore.org/accessibilitywiki/AccessForAllFramework).

#### Specific concerns of the Usage Board with respect to the abstract model:

- As proposed, the element is intended to hold several property-value pairs within a value string for a single element.

The need for structured values has been avoided with the new proposal.

- A basic requirement was pointing from a Dublin Core description to an "alternative description" of the same resource.

This has been avoided by the adoption of the narrower scope for the elemetn and the re-use of the existing relation element.

- The set of properties needed to describe a resource from the standpoint of accessibility seemed to overlap with the set of properties needed to describe a resource using Dublin Core itself (e.g., Type, Format, Language, and Relation). Accordingly, the alternative, accessibility-oriented description pointed to from a Dublin Core description could perhaps itself be an application profile of Dublin Core.

With the exception of the new narrow element, this is true as so this approach has been adopted. The new element provides information about a resource which is not appropriately expressed in any existing element. The final application profile is not yet developed, but there has been considerable work to ensure that the new term is necessary and if so, what the application profile would look like. This work is reported at [AccessForAllApplicationProfile](http://dublincore.org/accessibilitywiki/AccessForAllApplicationProfile).

 [RefreshCache](http://dublincore.org/accessibilitywiki/ResponseToUsageBoard?action=refresh&arena=Page.py&key=ResponseToUsageBoard.text_html) for this page (cached 2012-12-29 21:50:49)  

Immutable page (last edited 2005-09-07 06:45:58 by Liddy Nevile)


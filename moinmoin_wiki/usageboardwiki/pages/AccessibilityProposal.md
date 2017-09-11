---
title: "- AccessibilityProposal"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/AccessibilityProposal.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AccessibilityProposal](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=fullsearch&value=AccessibilityProposal&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/AccessibilityProposal "View")
- [Diffs](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/AccessibilityProposal">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AccessibilityProposal_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AccessibilityProposal_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## New Term Proposal: Accessibility

### Label: Accessibility

#### Definition

A characteristic of a resource that relates to the human capacity to perceive, operate, understand or otherwise engage with the resource.

#### Comment

Values for the accessibility property can be used to match a digital or physical resource to particular needs and preferences of a user resulting from the user's: choice of device; agents; circumstances; or disability.

#### Range

The class of accessibility characteristics.

#### Explanation

Metadata descriptions of resources (and a user's needs) can be used to provide the necessary information for a user to determine if a resource is one that they can access and use given limitations in their physical or virtual capacity to do so.

Because DC metadata is the base for many metadata systems, incorporation of an accessibility property into DC will encourage attention being paid to the needs of people with disabilities, among others, by a wide range of communities who provide valuable, described resources. As many significant resources are produced by content developers who are required to assess the accessibility characteristics of their resources, this term is designed to facilitate their re-use of this information as the value statement for the term.

DCMI cannot anticipate all the future uses of the accessibility property. However, DCMI encourages uptake and to this end recommends the use of the property with a controlled vocabulary of terms for describing the accessibility characteristics of resources. The recommended vocabulary will be maintained by the National Archives of Australia as part of the AGLS Metadata Standard (AS 5044). The URL for the vocabulary is [NB URL not yet allocated. AGLS will advise]

#### AfA.accessibility Vocabulary (copied for convenience from http://dublincore.org/accessibilitywiki/ElementsVocabularies)

auditoryOnly: Resource contains some significant content available as sounds only.

 e.g.: there is a significant content component with recorded speech with no alternative format. 

allTextual: Resource contains all significant content as transformable text.

 e.g.: although there is visual content, it is also available as transformable text. 

visualOnly: Resource contains some significant content available as images only.

 e.g.: there is some significant content that is available as an image with no alternative format. 

brailleOnly: Resource provides all significant content in Braille.

 e.g.: all the significant content of the resource, in whatever format, is also available as Braille or transformable text. 

tactileOnly: Resource contains some significant content as touchable components only.

 e.g.: there is a component of significant content that needs to be touched and has no alternative format. 

hapticOnly: Resource contains some significant content as kinesthetic components only.

 e.g.: there is a component of significant content that requires kinesthetic interaction with no alternative format. 

olfactoryOnly: Resource contains some significant content as smells only.

 e.g.: there is a component of significant content that offers odours that are not available in any alternative format. 

hazard: Resource contains potentially harmful content.

 e.g.: there is brief repetitive light or sound, or an odour, or motion simulation, that may be harmful to some people. 
* * *

### Context for Accessibility proposal
  
 Access For All is a framework designed to define and describe resource accessibility. Its goal is to provide a means whereby resources are matched to the individual accessibility needs and preferences of a particular person. The concepts behind the [AccessForAll](http://dublincore.org/usageboardwiki/AccessForAll) framework were originally developed by the Adaptive Technology Resource Center at the University of Toronto. The framework was worked on by the IMS Accessibility Working Group which developed the Accessibility for Learner Information Package Specification (AccLIP) for expressing learner accessibility preferences and needs. IMS added to this work with the development of the IMS [AccessForAll](http://dublincore.org/usageboardwiki/AccessForAll) Metadata Specification which defines metadata necessary to express a resource's ability to match the needs and preferences of a user's ACCLIP profile. Together the two specifications define what is currently the [AccessForAll](http://dublincore.org/usageboardwiki/AccessForAll) framework in an applied, XML-specific way that is suitable for users of IEEE LOM metadata. The framework deals with the following concepts which used together make possible the matching of resources to the specific accessiblity needs of a users: 
- a statement of the needs and preferences of the individual user, at the time and in the context they are in (called the personal needs and preferences profile - PNP)

- a statement of the relevant characteristics of a resource to be matched to the PNP (called a digital resource description DRD)

- alternative resources that can be swapped into or appended to a given resource, when it is missing what the user needs

Parallel work was undertaken by the W3C in developing its Web Content Accessibility Guidelines, version 2.0 of which was published as a W3C Recommendation in December 2008. The W3C Guidelines deal with a "wide range of recommendations for making Web content more accessible. Following these guidelines will make content accessible to a wider range of people with disabilities, including blindness and low vision, deafness and hearing loss, learning disabilities, cognitive limitations, limited movement, speech disabilities, photosensitivity and combinations of these." The W3C Accessibility activity has produced a number of components which work together to explain how to make Web content accessible to people with disabilities. These components are:

- Authoring Tools Accessibility Guidelines - addresses authoring toola

- Web Content Accessibility Guidelines - addresses Web content, and is used by developers, authoring tools, and accessibility evaluation tools

- User Agent Accessibility Guidelines - addresses Web browsers and media players, including some aspects of assistive technologies

While the WCAG do not define metadata requirements they assert that any claims to conformance with the Guidelines should be made in machine readable metadata statements.

* * *

### Summary of DC-USAGE List discussion on Accessibility proposal
The draft proposal was posted on 23 March and has generated a lot of discussion. The main issues that have been raised are summarised below. 

**1. Defining the range of the property**  
 This is the major issue - how to define a range (the value space) for the property. The range is some class of concepts but we need to narrow this down more precisely. Although the definition says "A characteristic of a resource...", the proposed terms seem to refer to the ability of a user to consume the resource. However, Liddy is quite definite that the property is not about the users' abilities/limitations but about a feature of the resource itself.

A major concern is that the range should express a type of relationship between two resources. We can accept a broad class of resources for the range but it still needs to express a relationship. The proposed property definition seems more like a range class definition. Tom suggested in late May that the range be either 'non-literal values' or <tt>AccessibilityCharacteristic</tt> (which would be defined using the proposed property definition - leaving open the question of how to define the property).  
  
**2. Vocabulary terms**  
 This issue is connected with the previous one, since the range of the property needs to be able to accommodate the terms. There is a view that the proposed term 'hazard' does not fit with the other terms since they all seem to be about the ability required to consume the resource, while hazard is in the nature of a warning. However, taking Liddy's view into account, all the terms are related to something in the resource that might affect or limit the ability of a user to consume the resource.

A common view is that the terms need to be declared as SKOS concepts, although this is up to AGLS, since AGLS will host the vocabulary.   
  
**3. Overlap with existing properties?**  
 There is a concern that the property is not clearly separate from an existing DCMI property such as <tt>dc:type</tt>. Pete J asked what is the difference between an RDF triple saying:

<tt>Resource:R dc:type dcmitype:Sound</tt>

and an RDF triple saying

<tt>Resource:R proposed:accessibility proposed:auditoryOnly</tt>

There is a clear difference in purpose, but although purpose is important in designing or selecting properties, the property semantics need to make clear _what_ is being said, not _why_ it is being said.

 [RefreshCache](http://dublincore.org/usageboardwiki/AccessibilityProposal?action=refresh&arena=Page.py&key=AccessibilityProposal.text_html) for this page (cached 2012-12-09 11:29:52)  

Immutable page (last edited 2009-08-19 12:32:07 by AndrewWilson)


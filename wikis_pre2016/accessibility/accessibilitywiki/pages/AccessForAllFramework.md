---
title: "- AccessForAllFramework"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/AccessForAllFramework.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AccessForAllFramework](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=fullsearch&value=AccessForAllFramework&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/AccessForAllFramework "View")
- [Diffs](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/AccessForAllFramework">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AccessForAllFramework_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AccessForAllFramework_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) Framework is a general framework to be implemented in a number of communities and this representation of it aims to be the general representation for such communities. There is a discussion list for those interested in AfA metadata. Any interested party is welcome to join that mailing list. To join or leave the dc-accessibility mailing list, please visit [http://www.jiscmail.ac.uk/lists/dc-accessibility.html](http://www.jiscmail.ac.uk/lists/dc-accessibility.html).

## AccessForAll (AfA): an Accessibility Framework

### Introduction

This document explains the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) accessibility framework. The intended audience of this document is anyone interested in accessibility and standards, especially those from the metadata community. A small proficiency in software design is assumed from the reader (for this document uses UML in some of its explanations), however the hope is that the concepts are explained clearly enough to be understood by readers of any technical skill-level.

### What is AccessForAll

[AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) is a framework designed to define and describe resource accessibility. Its goal is to provide a means whereby resources are matched to the individual accessibility needs and preferences of a particular person. The framework is divided into the following concepts, which, when used in conjunction, make possible the meeting of resources to needs and preferences and the description of resource accessibility:

- a statement of the needs and preferences of the individual user, at the time and in the context they are in (called the personal needs and preferences profile - PNP)

- a statement of the relevant characteristics of a resource to be matched to the PNP (called a digital resource description DRD)

- alternative resources that can be swapped into or appended to a given resource, when it is missing what the user needs

The main idea behind the AfA work is that while there are guidelines for making resources universally accessible, they are rarely used properly and they do not always solve all problems. AfA is about matching resources to an individual's requirements, even if it is not suitable for others. AfA anticipates the matching being done automatically but, if not, at least possible manually.

### History

The concepts behind the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) framework were originally developed by the Adaptive Technology Resource Center at the University of Toronto. They were then worked on by the IMS Accessibility Working Group.<sup><a href="#fndef-82fa28c2c5782f59e0a62c786bbb8d01beb9017d-0" id="fnref-82fa28c2c5782f59e0a62c786bbb8d01beb9017d-0">1</a></sup> The working group defined two specifications: the IMS Accessibility for Learner Information Package (AccLIP) and the IMS [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) Meta-data [sp] Specification (AccMD). Together they defined what is currently the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) framework in an applied, XML-specific way that is suitable for users of IEEE LOM metadata.

### Accessibility Description Set

An Accessibility Description Set is a set of metadata (statements) that describe in a machine-readable way the characteristics (Digital Resource Description - DRD) of the resource that affect how it can be sensed, understood, or interacted with by users or agents. Both resources, and the needs and preferences of persons, can have Accessibility Description Sets.

### Access mode

An access mode is the _human sense_ or _medium_ though which a person receives the output of a resource. The mode refers to either the perceptual system, or the cognitive faculty engaged by the person. An access mode is defined either as a sense, to reference a perceptual system, or as a medium to connect with a cognitive ability. Some examples will clarify:

Describing a resource's access mode as "visual" implies that a person will use their eyes (visual sense) to process it. Pictorial and video resources are examples of such resources.

Describing a resource's access mode as "textual" implies that a person will rely on their ability to read in order to understand the resource's content<sup><a href="#fndef-c7b899411c6c0a0a39da8ec09809a7a0468ba701-1" id="fnref-c7b899411c6c0a0a39da8ec09809a7a0468ba701-1">2</a></sup>.

### Alternative resource

A resource can be described as an alternative to another resource when the described resource is the same intellectual content of the referenced resource, but presented in another access mode.

### AfA User Needs and Preferences Description Set

A person may at different times have different needs and preferences for resource accessibility. Their needs and preferences form a set of functional requirements that are expressed as accessibility description statements in a Personal Needs and Preferences (PNP) description set. DRD statements may contain access mode information about the relevant accessibility characteristics of the resources the person wishes to interact with.

### Matching Resources to a User's Needs and Preferences

The main idea behind AfA is that if a user has a description of their accessibility needs and preferences, and is looking for resources that satisfy them, this can be done automatically by an application if those descriptions are expressed in a well-described metadata format. An example of how this might work is provided by The Inclusive Learning Exchange of the University of Toronto ( [http://www.barrierfree.ca/tile/](http://www.barrierfree.ca/tile/)).

### Guidelines

See [UserGuidelines](http://dublincore.org/accessibilitywiki/UserGuidelines)

### Relationship with Web Content Accessibility Guidelines (WCAG)

The Web Content Accessibility Guidelines (WCAG) are a set of principles and guidelines that define and explain the "requirements for making Web-based information and applications accessible to a wide range of people with disabilities."<sup><a href="#fndef-89546e3030001e08667f4dda26cc2bed0a487954-2" id="fnref-89546e3030001e08667f4dda26cc2bed0a487954-2">3</a></sup> The WCAG does not define new technologies, but rather techniques that can be applied to any type of content accessed through the Web. The [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) framework defines a complementary approach to resource accessibility: The [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) Framework _describes_ (via metadata on resources) the accessibility properties that are _recommended_ by the WCAG. This enables the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) Framework to provide a means whereby resources can be matched to the needs and preferences of persons.

### Acknowledgements

The following people have contributed to the development of AfA in a significant way:

- Anastasia Cheetham, Adaptive Technology Resource Centre, University of Toronto, Canada

- Martyn Cooper, Accessibility in Educational Media Team, Institute of Educational Technology, Open Univerity, UK

- Andy Heath, Sheffield-Hallam University, UK

- Pete Johnson, UKOLN, UK

- Liddy Nevile, Computer Science Department, La Trobe University, Australia

- Andy Powell, DCMI Usage Board, UKOLN, UK

- Madeleine Rothberg, WGBH-National Center for Accessible Media, USA

- Joseph Scheuhammer, Adaptive Technology Resource Centre, University of Toronto, Canada

- Jutta Treviranus, Faculty of Information Sciences, University of Toronto, Canada

- David Weinkauf, Adaptive Technology Resource Centre, University of Toronto, Canada

<div class="tags">tags technorati : <a href=" [http://technorati.com/tag/accessibility](http://technorati.com/tag/accessibility)" rel="tag">accessibility</a> <a href=" [http://technorati.com/tag/metadata](http://technorati.com/tag/metadata)" rel="tag">metadata</a> <a href=" [http://technorati.com/tag/AccessForAll](http://technorati.com/tag/AccessForAll)" rel="tag"> [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll)</a></div>

- 1 The Website for the IMS Accessibility Working Group is located at http://www.imsglobal.org/accessibility.
- 2 Textual content may be rendered into speech or Braille by a processing system, however these would not be considered the resource's (original) access modes.
- 3 From the Web Content Accessibility Guidelines 2.0 (http://www.w3.org/TR/WCAG20/).

 [RefreshCache](http://dublincore.org/accessibilitywiki/AccessForAllFramework?action=refresh&arena=Page.py&key=AccessForAllFramework.text_html) for this page (cached 2013-01-04 05:44:15)  

Immutable page (last edited 2008-08-18 21:54:18 by LiddyNevile)


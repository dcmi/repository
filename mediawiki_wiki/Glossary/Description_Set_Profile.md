---
title: Description Set Profile
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Glossary/Description_Set_Profile.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 17 May 2011, at 19:23.  
This page has been accessed 150,181 times.

## Description Set Profile Constraint Language (DC-DSP) 

The March 2008 specification "Description Set Profiles: a constraint language for Dublin Core application profiles" (hereafter DC-DSP) <sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup> provided a language for specifying constraints on a "description set" as defined by the [DCMI Abstract Model](/mediawiki_wiki/Glossary/DCMI_Abstract_Model "Glossary/DCMI Abstract Model"). The notion of "constraints" acknowledges that the set of possible ways that the slots defined by the Description Set Model may be filled is infinite, and that these infinite possibilities can be configured, or "constrained", in specific ways for specific content.

In the terminology of the DC-DSP specification, sets of constraints are expressed in "templates". Templates use constraints to specify community- or application-specific rules for the contents of a description set: first for individual descriptions in a description set (Description Templates); then within each description, for individual statements (Statement Templates); then for each component "slot" within each statement (Constraints). Conceptually, templates are like cookie cutters for mass-producing actual descriptions and statements in real instance metadata. Actual descriptions and statements in real instance metadata, in turn, are conceptualized as "matching" specific templates according to a matching algorithm.

The DC-DSP specification aimed at providing an initial set of simple constraint types of use for the structural validation of metadata records with the expectation that the set might be extended with additional constraint types in response to user feedback. Very broadly, this initial set included constraints on:

- Minimum and maximum allowable occurrences of actual descriptions matching a given Description Template within a Description Set.

- Whether descriptions matching a given Description Template may stand alone within a Description Set or whether their presence depends on the presence of descriptions matching another Description Template (example: "no stand-alone descriptions of authors in the absence of a description of the book they wrote"). 

- Minimum and maximum allowable occurrences of actual statements matching a given Statement Template within a Description.

- For slots designed to hold URIs -- such as Property URI, Value URI, and Value Encoding Scheme URI -- whether it is mandatory, optional, or disallowed that the given slot be filled in a given Statement Template, or a list of URIs that may be used in the given slot (as in: "the slot labeled Property URI must contain one of these URIs").

- For slots designed to hold character strings or language tags, whether it is mandatory, optional, or disallowed that the given slot be filled in a given Statement Template, or a list of character strings that may be used in the given slot.

### References 

1. ↑ [http://dublincore.org/documents/dc-dsp](http://dublincore.org/documents/dc-dsp)


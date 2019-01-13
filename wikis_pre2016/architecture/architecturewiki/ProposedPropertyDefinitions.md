---
title: "- ProposedPropertyDefinitions"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/ProposedPropertyDefinitions.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ProposedPropertyDefinitions](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=fullsearch&value=ProposedPropertyDefinitions&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions "View")
- [Diffs](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/ProposedPropertyDefinitions">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ProposedPropertyDefinitions_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ProposedPropertyDefinitions_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Proposed changes to DCMI property definitions

### Introduction

This document indicates some potential problems with the wording of some of the definitions in the DCMES and proposes some alternatives.

### Proposed changes

#### Coverage
<dl>

    <dt> Label</dt>
<dd>
<p>
Coverage 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
The extent or scope of the content of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
Coverage will typically include spatial location (a place name or 
geographic coordinates), temporal period (a period label, date, or date 
range) or jurisdiction (such as a named administrative entity). 
Recommended best practice is to select a value from a controlled 
vocabulary (for example, the Thesaurus of Geographic Names [TGN]) and 
that, where appropriate, named places or time periods be used in 
preference to numeric identifiers such as sets of coordinates or date 
ranges. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
The use of "extent" in the definition is potentially confusing w.r.t. 
the Format element and Extent element refinement. Furthermore, it's not
 totally clear what 'scope' means? 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
<strong>The spatial or temporal scope/topic(?) of the resource or the jurisdiction under which the resource is relevant.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Coverage includes spatial location (a named place or a location 
specified by its geographic coordinates), temporal period (a named 
period, date, or date range) or jurisdiction (a named administrative 
entity). Recommended best practice is to select a value from a 
controlled vocabulary (for example, the Thesaurus of Geographic Names 
[TGN]) and that, where appropriate, named places or time periods be used
 in preference to numeric identifiers such as sets of coordinates or 
date ranges.</strong> 
</p>
</dd>

    </dl>

#### Description
<dl>

    <dt> Label</dt>
<dd>
<p>
Description 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
An account of the content of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
Description may include but is not limited to: an abstract, table of 
contents, reference to a graphical representation of content or a 
free-text account of the content. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
The definition should not refer to the "content of the resource", simply
 to the "resource". The comment should not refer to "a reference to a 
graphical representation", simply to "a graphical representation". 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
<strong>An account of the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Description may include but is not limited to: an abstract, a 
table of contents, a graphical representation, or a free-text account of
 the resource.</strong> 
</p>
</dd>

    </dl>

#### Format
<dl>

    <dt> Label</dt>
<dd>
<p>
Format 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
The physical or digital manifestation of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
 Typically, Format may include the media-type or dimensions of 
</p>
</dd>

        <ul>

  the resource. Format may be used to identify the software, hardware, 
or other equipment needed to display or operate the resource. Examples
 of dimensions include size and duration. Recommended best practice is
 to select a value from a controlled vocabulary (for example, the list
 of Internet Media Types [MIME] defining computer media formats). 
        </ul>

    <dt> Problem</dt>
<dd>
<p>
The current definition implies that the value is a "manifestation 
</p>
</dd>

        <ul>

  of the resource", which is not the intention. This issue has 
previously been raised on one of the the DCMI lists (I forget when and
 where) which suggests that at least one real end-user has 
mis-interpretted this wording in this way. 
        </ul>

    <dt> Proposed definition</dt>
<dd>
<p>
<strong>The media-type or dimensions of the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Format may be used to identify the software, hardware, or other 
equipment needed to display or operate the resource. Examples of 
dimensions include size and duration. Recommended best practice is to 
select a value from a controlled vocabulary (for example, the list of 
Internet Media Types [MIME] defining computer media formats).</strong> 
</p>
</dd>

    </dl>

#### Language
<dl>

    <dt> Label</dt>
<dd>
<p>
Language 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
A language of the intellectual content of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
Recommended best practice is to use RFC 3066 [RFC3066], which, in 
conjunction with ISO 639 [ISO639], defines two- and three-letter primary
 language tags with optional subtags. Examples include "en" or "eng" for
 English, "akk" for Akkadian, and "en-GB" for English used in the United
 Kingdom. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
RFC3066 says that if both 2- and 3-letter codes exist, then the 2-letter
 code must be used. The en/eng example is therefore wrong. Change to 
'fr' to broaden number of examples ('en-GB' already appearing later in 
the sentence). Also, the use of "intellectual content of the" is 
unnecessary. 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
<strong>A language of the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Recommended best practice is to use RFC 3066 [RFC3066], which, 
in conjunction with ISO 639 [ISO639], defines two- and three-letter 
primary language tags with optional subtags. Examples include "fr" for 
French, "akk" for Akkadian and "en-GB" for English used in the United 
Kingdom.</strong> 
</p>
</dd>

    </dl>

#### Relation
<dl>

    <dt> Label</dt>
<dd>
<p>
 Relation 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
 A reference to a related resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
 Recommended best practice is to identify the referenced resource 
</p>
</dd>

        <ul>

  by means of a string or number conforming to a formal identification system. 
        </ul>

    <dt> Problem</dt>
<dd>
<p>
As per the DCAM, the value is the related resource, not a 
</p>
</dd>

        <ul>

  reference to the resource. 
        </ul>

    <dt> Proposed definition</dt>
<dd>
<p>
 <strong>A related resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
[Unchanged] <strong>Recommended best practice is to identify the 
referenced resource by means of a string or number conforming to a 
formal identification system.</strong> 
</p>
</dd>

    </dl>

#### Rights
<dl>

    <dt> Label</dt>
<dd>
<p>
 Rights Management 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
 Information about rights held in and over the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
 Typically, Rights will contain a rights management statement for 
</p>
</dd>

        <ul>

  the resource, or reference a service providing such information. 
Rights information often encompasses Intellectual Property Rights 
(IPR), Copyright, and various Property Rights. If the Rights element 
is absent, no assumptions may be made about any rights held in or over
 the resource. 
        </ul>

    <dt> Problem</dt>
<dd>
<p>
the comment refers both to a 'statement' and a reference to a 
</p>
</dd>

        <ul>

  service that provides a statement' This is an implementation issue 
and shouldn't be in the comment. Also, the explicit mention about 
what applications should do or not do if the Rights element is missing 
is innappropriate because it implies that the element can only be used 
(or not) as part of a particular set of properties. 
        </ul>

    <dt> Proposed definition</dt>
<dd>
<p>
[Unchanged] <strong>Information about rights held in and over the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
 <strong>Typically, Rights information includes a rights management 
statement for the resource. Rights information often encompasses 
Intellectual Property Rights (IPR), Copyright, and various Property 
Rights.</strong> 
</p>
</dd>

    </dl>

#### Source
<dl>

    <dt> Label</dt>
<dd>
<p>
 Source 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
 A Reference to a resource from which the present resource is 
</p>
</dd>

        <ul>

  derived. 
        </ul>

    <dt> Comment</dt>
<dd>
<p>
 The present resource may be derived from the Source resource in 
</p>
</dd>

        <ul>

  whole or in part. Recommended best practice is to identify the 
referenced resource by means of a string or number conforming to a 
formal identification system. 
        </ul>

    <dt> Problem</dt>
<dd>
<p>
Same as with Relation. Also, the use of "Source resource" is horrible. 
 Use of "described resource" is better than "present resource". 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
 <strong>A resource from which the described resource is derived.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>The described resource may be derived from the referenced 
resource in whole or in part. Recommended best practice is to identify 
the referenced resource by means of a string or number conforming to a 
formal identification system.</strong> 
</p>
</dd>

    </dl>

#### Subject
<dl>

    <dt> Label</dt>
<dd>
<p>
Subject and Keywords 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
The topic of the content of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
Typically, a Subject will be expressed as keywords, key phrases or 
classification codes that describe a topic of the resource. Recommended 
best practice is to select a value from a controlled vocabulary or 
formal classification scheme. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
Current label is misleading. Use of "content of the" in definition is 
inappropriate. "Better to use "represented using" rather than 
"expressed as" in the comment. Need to acknowledge use of Coverage for 
spatial or temporal topics. Depending on the agreed definition of 
Coverage, it may be appropriate to add "To describe the spatial or 
temporal topic of the resource, use the Coverage element" to the 
comment. 
</p>
</dd>
    <dt> Proposed label</dt>
<dd>
<p>
<strong>Subject</strong> 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
 <strong>The topic of the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Typically, a Subject will be represented using keywords, key 
phrases or classification codes that describe a topic of the resource. 
Recommended best practice is to select a value from a controlled 
vocabulary or formal classification scheme.</strong> 
</p>
</dd>

    </dl>

#### Type
<dl>

    <dt> Label</dt>
<dd>
<p>
 Resource Type 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
The nature or genre of the content of the resource. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
Type includes terms describing general categories, functions, genres, or
 aggregation levels for content. Recommended best practice is to select a
 value from a controlled vocabulary (for example, the DCMI Type 
Vocabulary [DCMITYPE]). To describe the physical or digital 
manifestation of the resource, use the Format element. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
The comment echos the current definition of Format. If the definition 
of Format is changed then this should be changed as well. Also, the 
comment refers to "content", rather than specifically to the resource. 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
<strong>The nature or genre of the resource.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
<strong>Type can be used to indicate the general category, function, 
genre, or aggregation level of the resource. Recommended best practice 
is to select a value from a controlled vocabulary (for example, the DCMI
 Type Vocabulary [DCMITYPE]). To describe the media-type or dimensions 
of the resource, use the Format element.</strong> 
</p>
</dd>

    </dl>

#### Conforms To
<dl>

    <dt> Label</dt>
<dd>
<p>
 Conforms To 
</p>
</dd>
    <dt> Definition</dt>
<dd>
<p>
A reference to an established standard to which the resource conforms. 
</p>
</dd>
    <dt> Comment</dt>
<dd>
<p>
None. 
</p>
</dd>
    <dt> Problem</dt>
<dd>
<p>
The use of "A reference to" in the definition is problematic. 
</p>
</dd>
    <dt> Proposed definition</dt>
<dd>
<p>
<strong>An established standard to which the resource conforms.</strong> 
</p>
</dd>
    <dt> Proposed comment</dt>
<dd>
<p>
[Unchanged] <strong>None.</strong> 
</p>
</dd>

    </dl>

### Use of "content of the resource" in definitions

A number of the current terms in the DCMES use "content of the resource" rather than just "resource" in their definitions (contributor, coverage, creator, description, subject and type). Furthermore, language uses "intellectual content of the resource". This appears to arise from an attempt to differentiate those terms that are used to describe the "work" from those that are used to describe the "manifestation". It is primarily a feature of the fact that DCMI was never very clear about what kinds of resources its terms are used to describe, either in the general case or in the specific case of particular descriptions.

I would recommend changing all usage of "[intellectual] content of the resource" to "resource" in the definitions (consider the case where DC is being used to describe abstract concepts, as we do oursleves, or natural objects for example). (Note that this document does not make explicit proposals for doing this, except where the definitions of terms are being changed for other reasons.) Coverage is problematical, becuase in this case the phrase "content of the resource" is used to indicate that the definition is referring to what the resource is about rather than where it is or when it was created. It might be helpful to consider using the same language in coverage as is used in subject (e.g. "the spatial or temporal topic of the resource") as suggested above?

 [RefreshCache](http://dublincore.org/architecturewiki/ProposedPropertyDefinitions?action=refresh&arena=Page.py&key=ProposedPropertyDefinitions.text_html) for this page (cached 2012-12-28 10:41:50)  

Immutable page (last edited 2005-12-23 13:48:35 by [AndyPowell](http://dublincore.org/architecturewiki/AndyPowell))


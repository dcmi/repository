---
title: "- ProfileReviewCriteriaNew"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/ProfileReviewCriteriaNew.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ProfileReviewCriteriaNew](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=fullsearch&value=ProfileReviewCriteriaNew&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew "View")
- [Diffs](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/ProfileReviewCriteriaNew">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ProfileReviewCriteriaNew_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ProfileReviewCriteriaNew_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Review of Application Profiles (rough draft)

Workflow

- 1. Id FR

- 2. DOmain model

- 3. Use or creation of vocabs

- 4. Build DSP

- 5. Make syntax

- 6. Explain everything

The mission of the Usage Board is to ensure an orderly evolution of the metadata terms maintained by the Dublin Core Metadata Initiative. The Usage Board evaluates proposals for new terms (or changes to existing terms) in light of grammatical principle, semantic clarity, usefulness, and overlap with existing terms. To proposals that are accepted, it assigns a specific status. The Usage Board also evaluates constructs that use DCMI terms, such as Application Profiles.

In order to do this the Usage Board must review proposals. Below is a set of guidelines for reviewing application profiles. There are four areas of evaluation and six criteria that can be applied to each area.

Four areas of evaluation: Application Functional Requirements, Application Domain Model, Description Set Profile, and Application Data Format

Six criteria are: Conform to the DCMI Abstract Model, Designed in non-conflict with grammatical principles (now DCMI description set profile), Internally consistent, Presented with semantic clarity, Useful to the community it serves, Does not introduce terms or other constructs that overlap with existing ones

All of these areas must be well documented.

## Areas of evaluation:

### Overarching criteria

Clarity, consistency, and well-documented.

### Organizational context (required)

- The documentation packet should describe the context in which the application profile will be used (or can be used).

- The documentation should identify the organizations and individuals who participated in the development of the profile, along with any agreements, guidelines, or intentions regarding the future development and maintenance of the profile.

### Functional Requirements (required)

- Are the purpose and scope of a profile described clearly?

- Are the functional requirements of the profile described?

- Are the limitations described (things out of scope)

- the target group that will use the profile;

- the resources that will be described with the profile, and

### Application Domain Model (required)

- An Application profile MUST provide an Domain Model, if only a simple one, which describes the entities and relationships amongst entities. The data model can be depicted in graphic form (e.g., as an UML class diagram) or in text.

  - Are the entities in the world and the relationships among them described?

  - Are the entities and relations consistent with the functional requirements?

  - If the application domain model is based on a Community Domain Model (e.g., FRBR), the Community Domain Model must be identified and used clearly and consistently.

  - If the Application Domain Model deviates from the Standard Domain Model, the deviations must be well documented.

### Determine terms (required)

- Properties

- Classes

- Syntax Encoding Schemes

- Vocabulary Encoding Schemes

For each of these: existing and new

### Description Set Profile (required)

- Is the DSP a faithful representation of the Domain Model?

  - Does it have Description Templates that correspond to model entities?

- Question: Does the Description Set Profile detail how to create a set of one or more descriptions, each of which describes a single [entity?} resource as set out in the Application Domain Model? [Redundant? And is this description set faithful to the Functional Requirements and Domain Model?]

- Question: Are newly declared terms documented?

- Questions: are vocabularies used in this AP clearly documented?

### User Guidelines (optional)

(Need to say what we mean by user guidelines)

- Are there user guidelines (optional)

- Consistency with way intended to be used

### Syntax Guidelines and Data Formats (optional)

- Question: Does the application profile clearly demonstrate what syntax encoding is to be used?

### Criteria for evaluating the four areas

#### Conform to DCMI Abstract Model

- Follows conventions of terminology

- Builds concepts of this model into the AP and its proposed use

#### Designed in non-conflict with Grammatical Principles

- One-to-one?, Dumb-down?

- Does the term usage in the AP represent a refinement and not a re-definition of the term used?

Terms used in an AP should refine and not re-define the semantics of the term used.

- Are the decisions in the AP to declare a new term as opposed to refining an existing term sensible? In creating an AP, developers are faced with the decision whether to refine an existing term through narrowed usage or to declare a new term that refines the original term. Where the AP-specific term usage solely restraints the term's value space, preference should be given to refining the original term through narrowed usage. Where the AP-specific term usage narrows the range of resources to which the term applies, the decision to create a new refining term or to use the original term restrained through a usage statement should be made based on the best interest of the community served.

- Are the AP-specific encoding schemes appropriate? {SAS NOTE: I am not sure what we mean by "appropriate" or how we operationalize it.}

- Are the terms in the AP-specific encoding schemes adequately defined, sensible and conformant? {SAS NOTE: I am not sure what "conformant" means in this context or how to operationalize it.} [2]

#### Internal Consistency (is the Application Profile internally consistent?)

- Does not contradict itself

- Does not leave concepts or constructs ambiguous

- Consistently cites outside sources where necessary, using their terminology if not purposefully and clearly changing it in the AP

#### Presented with semantic clarity

- Terms, concepts, constructs, and citations are presented clearly and meaningfully.

- Are the terms used in the profile well described? The elements used to describe the terms in the AP should conform to the CEN Guidelines in substance and labeling. The AP should use all appropriate descriptive elements to identify a term's definitional attributes, identifying attributes, relational attributes, and constraints.

- Are constraints used consistently across the AP terms? The AP should use obligation, condition, data type, and occurrence in a manner consistent with the functional requirements of the AP.

#### Useful to the community it serves

- Well documented record of community and how this profile will be useful to it. Demonstrated feedback and vetting.

#### Does not overlap with terms or constructs approved by the DCMI Usage Board

[1] [http://www.ukoln.ac.uk/repositories/digirep/index/Functional\_Requirements](http://www.ukoln.ac.uk/repositories/digirep/index/Functional_Requirements) [2] [http://dublincore.org/usageboardwiki/ProfileReviewCriteria](http://dublincore.org/usageboardwiki/ProfileReviewCriteria)

 [RefreshCache](http://dublincore.org/usageboardwiki/ProfileReviewCriteriaNew?action=refresh&arena=Page.py&key=ProfileReviewCriteriaNew.text_html) for this page (cached 2012-12-31 20:47:04)  

Immutable page (last edited 2007-08-25 08:47:10 by TomBaker)


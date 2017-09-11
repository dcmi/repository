---
title: "- AMChanges"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AMChanges.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AMChanges](http://dublincore.org/architecturewiki/AMChanges?action=fullsearch&value=AMChanges&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AMChanges?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AMChanges "View")
- [Diffs](http://dublincore.org/architecturewiki/AMChanges?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AMChanges?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AMChanges?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AMChanges?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AMChanges?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AMChanges?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AMChanges?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AMChanges?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AMChanges?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AMChanges?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AMChanges?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AMChanges">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AMChanges_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AMChanges_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Changes to DCAM based on 2007 Public Comment

See also [http://dublincore.org/architecturewiki/AMCommentSummary](http://dublincore.org/architecturewiki/AMCommentSummary) (summary of public comments)

### Revision of AMCommentSummary

- ACTION 2007-03-23 Pete to finalize Comment Summary by Tuesday March 27 and "freeze" -- announcements will point to this.

- ACTION 2007-03-23 Tom will prepare "Change summary" on the basis of the "comment summary" (cut and paste just those points that have changes)

### Revision of DCAM

- ACTION 2007-03-23 Pete to edit [http://dublincore.org/documents/2007/04/02/abstract-model/](http://dublincore.org/documents/2007/04/02/abstract-model/) on the basis of edits described in [http://dublincore.org/architecturewiki/AMCommentSummary](http://dublincore.org/architecturewiki/AMCommentSummary) by Wednesday 28 March

#### DCAM changes decided in 2007-03-23 telecon

- RESOLVED 2007-03-23 For issue "Reference model" - use "information model"

- RESOLVED 2007-03-23 For issue "Described resource" - change "may be" to "is"

  - In section 3, first sentence, "each DC metadata description describes one, and only one, described resource" - change to "only one, resource" (deleting "described").

  - In section 2, second bullet list, second point, change: "(about one, and only one, described resource) and zero or one resource URI" to "(about one, and only one, resource) and zero or one described resource URI".

  - In Terminology, change definition of "description" from: "One or more statements about one, and only one, described resource" to "One or more statements about one, and only one, resource."

  - ACTION 2007-03-23 Pete to confirm Andy's agreement to the above changes.

- RESOLVED 2007-03-23 For issue "Description model, description set, description": change "the Description model" to "the DCMI Description set model" in the following places:

  - caption of Figure 2

  - new sub-section heading under Section 2

  - bullet points, Section 2: from "The abstract model of the vocabularies used in DC metadata descriptions is as follows:" to "The abstract model of the vocabularies used in DCMI description sets is as follows:".

  - final bullet point, Section 2: should read: "The DCMI description set model does not provide..."

- RESOLVED 2007-03-23 For issue "Definition of description set": Change definition of Description Set in glossary to read "a set of one or more descriptions, each of which describes a single resource".

- RESOLVED 2007-03-23 For issue "Definitions of has range and has domain"

  - Change definition of "has range" to "A relationship between a property and a class which indicates that when the property is part of a property/value pair, the corresponding value is always an instance of that class."

  - Change definition of "has domain" to "A relationship between a property and a class which indicates that when the property is part of a property/value pair, the described resource is always an instance of that class."

  - First two bullet points of Vocabulary Model need to be changed accordingly

- RESOLVED 2007-03-23 For issue "Definitions of property/value pair". Douglas had suggested "The combination of a property and a value, used to describe [insert: one property of] a resource." Instead, we decided to change definition of "property/value pair" in Terminology from: "The combination of a property and a value, used to describe a resource." to "The combination of a property and a value, used to describe a characteristic of a resource."

- RESOLVED 2007-03-23 For issue "Resource URI" - see resolution to issue "Described Resource" above.

- RESOLVED 2007-03-23 For issue "Document structure" - add sub-headings to Section 2 as proposed

- RESOLVED 2007-03-23 For issue "Rich representation in RDF" - see issue ...

- RESOLVED 2007-03-23 For issue "Value representation and Value URI" - see OWL-DL compatibility discussion.

- RESOLVED 2007-03-23 For issue "Vocabulary Encoding Schemes": Joe was arguing that VES should always be a set of concepts. No change required.

- RESOLVED 2007-03-23 For issue "Abstract syntax required". Leave it open for now, see what comments come in for second Public Comment period. Add a note to Section 5 to the effect that semantics are not described in the DCAM document - rather, see DC-RDF (i.e., reference DC-RDF here). ("To be explicit that we are actually dodging the issue for now.")

- ACTION 2007-03-23 Mikael: Formulate a sentence for Section 5 saying DCAM does not deal with this level for now.

- RESOLVED 2007-03-23 For issue "Comparing URIs" - add reference to RDF treatment of URIs as an additional sentence after the definition of "URI".

- ACTION 2007-03-23 Mikael: Formulate a sentence on RDF treatment of URIs in the definition of "URI".

- RESOLVED 2007-03-23 For issue "VES and Rich Representations" - partly resolved by removing Rich Representation. Issue of Dewey versions is not a DCAM issue.

- RESOLVED 2007-03-23 For issue "Remove Rich Representations from Description Model".

- ACTION 2007-03-23 Mikael: Formulate an explanation of why we are removing Rich Representations (put directly into [http://dublincore.org/architecturewiki/AMCommentSummary](http://dublincore.org/architecturewiki/AMCommentSummary)).

- ACTION 2007-03-23 Pete - Update UML, deleting Rich Representation and adding a statement for literal values - run it by Andy, circulate for comment. Delete Value Representation - no longer necessary.

- RESOLVED 2007-03-23 In Introduction, delete the second-to-last sentence: "Note that the UML modeling used here shows the abstract model but is not intended to form a suitable basis for the development of software applications."

 [RefreshCache](http://dublincore.org/architecturewiki/AMChanges?action=refresh&arena=Page.py&key=AMChanges.text_html) for this page (cached 2013-01-03 09:54:30)  

Immutable page (last edited 2007-03-23 14:13:12 by TomBaker)


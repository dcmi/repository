---
title: "- AbstractModelChanges"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AbstractModelChanges.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AbstractModelChanges](http://dublincore.org/architecturewiki/AbstractModelChanges?action=fullsearch&value=AbstractModelChanges&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AbstractModelChanges?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AbstractModelChanges "View")
- [Diffs](http://dublincore.org/architecturewiki/AbstractModelChanges?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AbstractModelChanges?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AbstractModelChanges?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AbstractModelChanges?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AbstractModelChanges?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AbstractModelChanges?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AbstractModelChanges?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AbstractModelChanges?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AbstractModelChanges?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AbstractModelChanges?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AbstractModelChanges?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AbstractModelChanges">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AbstractModelChanges_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AbstractModelChanges_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Changes to the abstract model

See [AMDraftUpdate](http://dublincore.org/architecturewiki/AMDraftUpdate)

- Improved consistency of glossary definitions, e.g. for 'term'.

- Added Vocabulary Model including descriptions of types of terms and relationships between terms (based on RDF Schema).

- Removed Appendixes containing historical information (Appendix A on structured values) and encoding guidelines (Appendixes B, C, and D).

- Improved modelling of sub-property and sub-class in Vocabulary Model as relationships between properties and classes (i.e. as per RDF schema) and added definitions in glossary.

- Used "separate 'description' about the 'value'" (or similar) instead of 'separate description'.

- Used 'described resource' throughout (to remove confusion between 'value' and 'resource').

- Added domain and range to the Vocabulary model.

- Updated definition of VES.

- Moved definition of description set to first bullet point of description model to emphasise the importance of this structure.

- Updated statement of purpose in Introduction.

- Permit value string to be associated with either language tag or syntax encoding scheme, or neither, but not both.

- Added new definition for syntax encoding scheme.

- Updated definition of VES as agreed at UB meeting in Mexico.

- Removed section on Dumb-down.

- Updated the terminology section to consistently use phrases rather than sentences.

- Removed marked-up text and structured value string from the model.

- Updated definition of rich representation, adding the notion of 'media type'

- Improved wording of first line of description model.

- Edited section 6 about encoding guidelines.

- Took out specific reference to using dc:type to indicate class of the value. Added note about inferring this from domain and range.

- Improved description model diagram layout to improve readability.

- Added tabular mapping of concepts to RDF/RDFS (section 5) and to legacy DCAM terminology (Appendix).

- Removed use of 'alpha-numeric' from definition of value string.

- Added "A _vocabulary_ is a set of one or more _terms_. Each _term_ is a member of one or more _vocabularies_" to the vocabulary model description.

- Removed use of QNames throughout - replaced with full URIs.

 [RefreshCache](http://dublincore.org/architecturewiki/AbstractModelChanges?action=refresh&arena=Page.py&key=AbstractModelChanges.text_html) for this page (cached 2012-12-30 12:32:40)  

Immutable page (last edited 2007-02-01 16:10:50 by TomBaker)


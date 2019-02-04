---
title: "- devScenarios"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/devScenarios.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [devScenarios](http://dublincore.org/dcmirdataskgroup/devScenarios?action=fullsearch&value=devScenarios&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Edit](http://dublincore.org/dcmirdataskgroup/devScenarios?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/devScenarios "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/devScenarios?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/devScenarios?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/devScenarios?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/devScenarios?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/devScenarios?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/devScenarios?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/devScenarios?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/devScenarios?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/devScenarios?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/devScenarios?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/devScenarios?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/devScenarios">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="devScenarios_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="devScenarios_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Developer Scenarios

### Scenario: Linking to Authority Files

The catalog has both bibliographic records and authority records. Authority records contain valid values for particular fields. The authority records also contain additional information about the values, such as non-preferred forms of the value and instructions on usage. To integrate the non-preferred forms into the user interface, the developer must create a link between the value in the bibliographic record and the value in the authority record. This link must remain intact even if the preferred form of the value changes, and even if the metadata creator chooses to use a non-preferred form as the display form. _Karen Coyle_

### Scenario: Enrichment

The system obtains a search result record and wishes to obtain further information from ancillary Sources to enrich the record displayed to the user. Simple (existing) case is the addition of cover art to book records, utilizing a control number. More complex case is identifying where a copy of the retrieved work may be obtained (library loan, bookseller, online download, etc.), using various bib data. The authority link case you sketched out is a close cousin here. _Peter Noerr_

### Scenario: Other copies

Using various bits of the bib metadata try to discover other copies of the work at alternate locations. This is a function that comes up in federated search situations where a major part of the requirement is the "find the most available copy" function. This needs identified bib elements useful for discovery, and also some form of equivalence between the Source systems. This is regularly done now, but requires 'human intervention' and lots of maintenance in general. _Peter Noerr_

### Scenario: Duplicates

Sort of the opposite of 2). Determine from the available metadata whether two records are the same object - at some bibliographic level. Obvious candidates are the (relatively) simple manifestations -> work 'duplication'. But with no link it becomes quite a difficult operation if data equivalences are not available. If you work your Latvian translation scenario backwards you get the situation here, where only the author's name is the same. Now consider that is has been transliterated into Cyrillic in a Russian version. _Peter Noerr_

### Scenario: Sources

Simply discover Sources (databases, content services, OPACS, etc.) which have information about a particular topic, or in a given language, etc. This involves metadata about the Source, not the items within it (though they must, of course, be represented in aggregate by the Source) and hence is a level removed from the other scenarios. _Peter Noerr_

### Scenario: Publishers

I need to link bibliographic records to the publisher information that is in the acquisitions system. This will interact with purchasing and supplies for the acquisition of new copies. _Karen Coyle_

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/devScenarios?action=refresh&arena=Page.py&key=devScenarios.text_html) for this page (cached 2012-12-25 20:58:57)  

Immutable page (last edited 2008-05-07 15:31:33 by KarenCoyle)


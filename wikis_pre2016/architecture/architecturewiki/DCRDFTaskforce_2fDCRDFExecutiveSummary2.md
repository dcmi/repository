---
title: "- DCRDFTaskforce/DCRDFExecutiveSummary2"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFTaskforce_2fDCRDFExecutiveSummary2.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFTaskforce/DCRDFExecutiveSummary2](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=fullsearch&value=%2FDCRDFExecutiveSummary2&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCRDFTaskforce "Up")
- [Edit](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
* * *

### About this note

DCMI is currently considering the assignment of domains and ranges to DCMI metadata terms. Such a step would have important implications for the interpretation of legacy metadata. This note presents a high-level view of the issue and its implications. ***No such changes will be undertaken by DCMI until their impact has been well understood and discussed in a public comment period.*** Implementers with an opinion about the issues presented here are invited to participate in discussion on the DCMI Architecture Working Group mailing list ( [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.jiscmail.ac.uk/lists/dc-architecture.html](http://www.jiscmail.ac.uk/lists/dc-architecture.html)).

### Summary

DCMI is in the process of updating the existing guidelines for encoding Dublin Core in RDF ( [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">(1)](http://dublincore.org/documents/dcmes-xml/), [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">(2)](http://dublincore.org/documents/dcq-rdf-xml/)) in order to align them with the DCMI Abstract Model. As part of that work (a draft of which is available [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">(3)](http://dublincore.org/architecturewiki/DCRDFGuidelines)), changes have been made that are necessary for the integration of Dublin Core metadata into systems that implement the semantics of RDF, such as inference engines and ontology-based solutions.

The existing specifications from the DCMI have not taken these applications into account, which has resulted in an unknown amount of Dublin Core-based RDF data that is inconsistent with the definitions of the Dublin Core properties. The DC-RDF taskforce has judged that the mentioned changes are necessary, albeit painful, to ensure the long-term viability of Dublin Core in RDF.

For example, in order to state that "John Smith is the creator of [http://www.example.com](http://www.example.com/)", it is no longer valid to use the following RDF:

<pre>&lt;http://www.example.com&gt; dc:creator "John Smith".
</pre>The reason is in the DCMI definition of the dc:creator property, the value is described as "an entity primarily responsible...", and the string "John Smith" is not such an entity. Had the dc:creator property been defined to accept as values the _name_ of the entity, "John Smith" would have been an acceptable value. 

Instead, the value must be a properly typed resource, with "John Smith" available only as a value string attached to that resource. This is a dramatic tightening of the constrains of the Dublin Core RDF encoding, which as a consequence makes unknown amounts of Dublin Core metadata that uses the first form invalid. The release notes [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">(4)](http://dublincore.org/architecturewiki/DCRDFTaskforce/DCRDFReleasenotes) contain more information on these changes.

### References

1. 

[<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Simple Dublin Core in RDF/XML](http://dublincore.org/documents/dcmes-xml/), DCMI Recommendation, 2002-07-31

2. 

[<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Qualified Dublin Core in RDF / XML](http://dublincore.org/documents/dcq-rdf-xml/), DCMI Proposed Recommandation, 2002-05-15

3. 

[<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Dublin Core Metadata in RDF](http://dublincore.org/architecturewiki/DCRDFGuidelines), Working Draft

4. 

[<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary2_files/moin-www.png" alt="[WWW]" height="11" width="11">Release Notes](http://dublincore.org/architecturewiki/DCRDFTaskforce/DCRDFReleasenotes) for above draft.

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary2?action=refresh&arena=Page.py&key=DCRDFTaskforce_2fDCRDFExecutiveSummary2.text_html) for this page (cached 2012-12-21 19:49:24)  

Immutable page (last edited 2006-05-24 11:01:58 by MikaelNilsson)


---
title: "- DCRDFTaskforce/DCRDFExecutiveSummary"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFTaskforce_2fDCRDFExecutiveSummary.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFTaskforce/DCRDFExecutiveSummary](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=fullsearch&value=%2FDCRDFExecutiveSummary&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCRDFTaskforce "Up")
- [Edit](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFExecutiveSummary_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFExecutiveSummary_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
* * *

### Important changes in the new Dublin Core RDF Encoding

This is a summary of the most fundamental changes appearing in the new "Encoding Dublin Core in RDF" draft.

### About this note

DCMI is currently considering the assignment of domains and ranges to DCMI metadata terms. Such a step would have important implications for the interpretation of legacy metadata. This note presents a high-level view of the issue and its implications. ***No such changes will be undertaken by DCMI until their impact has been well understood and discussed in a public comment period.*** Implementers with an opinion about the issues presented here are invited to participate in discussion on the DCMI Architecture Working Group mailing list ( [<img src="DCRDFTaskforce_2fDCRDFExecutiveSummary_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.jiscmail.ac.uk/lists/dc-architecture.html](http://www.jiscmail.ac.uk/lists/dc-architecture.html)).

#### Support for the DCAM

The new recommendation is based on the DCMI Abstract model. Among the fundamental changes are that:

- a number of RDF idioms are no longer supported, such as Containers, Reification, "poor man's structured values", "poor mans language qualification", and more.

- the regularity of expression has been greatly increased. There are no longer a "simple" and "qualified" version of the RDF encoding.

#### Support for domains and ranges

The new recommendation supports the use of domains and ranges for properties. The definitions of the Dublin Core properties are being supplemented with explicit specifications of domains and ranges that were previously implicit in the wording of the definitions.

For this reason, plain RDF literal values of properties are now only allowed when the range of the property includes <tt>rdfs:Literal</tt>. This alone will make many current uses of Dublin Core in RDF invalid. For example, it is no longer valid to state

<pre>&lt;http://www.example.com&gt; dc:creator "John Smith".
</pre>The reason is in the definition of dc:creator, the value of the property is "an entity primarily responsible...", and the RDF Literal string "John Smith" is no such entity. Had the dc:creator property been defined to accept as values the _name_ of the entity, "John Smith" would have been an acceptable value. 

Instead, the RDF encoding now only allows the following forms of the RDF expression:

<pre>&lt;http://www.example.com&gt; dc:creator _:xxx.
_:xxx rdf:type foaf:Person
_:xxx dcrdf:valueString "John Smith"
</pre>

or

<pre>&lt;http://www.example.com&gt; dc:creator &lt;http://www.example.org/person32&gt;
</pre>

where <tt>http://www.example.org/person32</tt> is a resource of a valid type for entities. Note that the <tt>foaf:Person</tt> class is just an example of a possibly valid class, and that the dcrdf:valueString property might have a different name in the final version of the specification.

### Assessment

The above changes are necessary for the integration of Dublin Core metadata into systems that implement the semantics of RDF, such as inference engines and ontology-based solutions. Previous recommendations from the DCMI have not taken these applications into account, which has resulted in an unknown amount of Dublin Core-based RDF data that is actually inconsistent with the definitions of the Dublin Core properties. The DC-RDF taskforce has judged that the above changes are necessary, albeit painful, to ensure the long-term viability of Dublin Core in RDF.

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFExecutiveSummary?action=refresh&arena=Page.py&key=DCRDFTaskforce_2fDCRDFExecutiveSummary.text_html) for this page (cached 2012-12-22 07:12:52)  

Immutable page (last edited 2006-05-24 11:00:39 by MikaelNilsson)


---
title: "- DCRDFTaskforce/DCRDFIssues"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFTaskforce_2fDCRDFIssues.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFTaskforce/DCRDFIssues](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=fullsearch&value=%2FDCRDFIssues&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCRDFTaskforce "Up")
- [Edit](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFTaskforce_2fDCRDFIssues">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFIssues_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fDCRDFIssues_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
* * *

## Issues in the current draft

### Issue 1: Datatypes

Can we support ex:prop --> <tt>"blabla"^^ex:datatype</tt> ?

#### Problem

Using RDF datatypes on value strings (=SES) is unproblematic. However, using datatyped literals as values of DCAM properties is more challenging. The DCAM allows several value strings for a single statement. Using an RDF datatype would make that impossible. Related descriptions and rich values representations would also be impossible.

On the other hand, literal values is actually a perfect representation of a value, are very handy, and should therefore be supported if possible.

The same situation arises when plain literals are used, for example for dc:title.

#### Solutions

- Disallow literal values

- Allow literal values if certain specific criteria are met.

#### Proposal

When:

- The VES is an rdfs:Datatype or equals rdfs:Literal.

- There is only one value string

- There is no language tag on the value string

- The SES of the value string is a subClass or equals the VES of the value.

- There are no rich value representations

- There are no related descriptions.

a datatyped literal or plain literal can be used.

Plain literals correspond to VES=SES=rdfs:Literal.

### Issue 2: Value string property

#### Problem

Which property should be used for denoting value strings?

#### Solutions

- rdf:value <tt>"&lt;rdfs:comment&gt;Idiomatic property used for structured values.&lt;/rdfs:comment&gt;"</tt>

- rdfs:label <tt>"&lt;rdfs:comment&gt;A human-readable name for the subject.&lt;/rdfs:comment&gt;"</tt>

- dcrdf:valueString (or similar)

- others?

#### Proposal

The definition of rdfs:label does not really fit. rdf:value is better, albeit maybe too idiomatic...

A sub-property dcrdf:valueString of rdf:value with rdfs:Literal range and improved definition seems the best solution.

### Issue 3: Vocabulary encoding schemes should not be classes

See [<img src="DCRDFTaskforce_2fDCRDFIssues_files/moin-inter.png" alt="[Self]" height="16" width="16">DCAM Issues](http://dublincore.org/architecturewiki/AMIssues "Self").

#### Proposal

This is not an DCRDF issue, but a DCAM issue, as the DCAM is 100% clear on that VES=Class.

"VES" should possibly be renamed "Value class" or similar.

### Issue 4: Rich representations?

It's at this point very unclear what to do about rich representations. Do we use the same property as for value strings, but with a different value type? Or do we use a separate property?

#### Proposal

Use rdfs:seeAlso. Mention explicitly the use of XMLLiteral, otherwise recommend use of URI ref to separate resource.

### Issue 5: Related descriptions

How do we implement related descriptions?

#### Proposal

- Blank nodes within same RDF doc: no property necessary, RDF handles the case.

- URI ref to external description. Works when Value URI is used. Property needed, range is

dcrdf:Description or similar.

Property proposal: dcrdf:relatedDescription? Sub-property of dc:relation ... ?

## Editorial issues

### Editorial issue 1: dc:identifier

I'm thinking that we need to state somewhere that

<tt>&lt;http://example.org&gt; dc:identifier &lt;doi:blabla&gt;</tt>

is \*not\* the right way to do it (that form is used in DCQ/RDF). Instead, I think we all agree that

<tt>&lt;http://example.org&gt; dc:identifier "doi:blabla"^^&lt;dcterms:URI&gt;</tt>

or similar is right. How and where do we best say this?

### Editorial issue 2: Make sure diagrams reflect rich representation != value strings

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fDCRDFIssues?action=refresh&arena=Page.py&key=DCRDFTaskforce_2fDCRDFIssues.text_html) for this page (cached 2012-12-21 19:49:52)  

Immutable page (last edited 2006-05-24 11:02:41 by MikaelNilsson)


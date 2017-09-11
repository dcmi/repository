---
title: "- AccessForAllSchema"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/AccessForAllSchema.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AccessForAllSchema](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=fullsearch&value=AccessForAllSchema&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/AccessForAllSchema "View")
- [Diffs](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/AccessForAllSchema">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AccessForAllSchema_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AccessForAllSchema_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

Let's write the schema here ..... 
#### here goes ...
I have copied the first bits from the libraries schema - not sure if that helps? 

Liddy

* * *

#### <!-- header stuff - not relevant yet ... -->

<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE rdf:RDF

[

<!ENTITY rdfns ' [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.w3.org/1999/02/22-rdf-syntax-ns#](http://www.w3.org/1999/02/22-rdf-syntax-ns#)'>

<!ENTITY rdfsns ' [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.w3.org/2000/01/rdf-schema#](http://www.w3.org/2000/01/rdf-schema#)'>

<!ENTITY dcns ' [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)'>

<!ENTITY dctermsns ' [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/terms/](http://purl.org/dc/terms/)'>

<!ENTITY dctypens ' [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/dcmitype/](http://purl.org/dc/dcmitype/)'>

]>

<rdf:RDF xmlns:rdf=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.w3.org/1999/02/22-rdf-syntax-ns#](http://www.w3.org/1999/02/22-rdf-syntax-ns#)" xmlns:dcterms=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/terms/](http://purl.org/dc/terms/)" xmlns:dc="phttp://purl.org/dc/elements/1.1/]" xmlns:rdfs=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.w3.org/2000/01/rdf-schema#](http://www.w3.org/2000/01/rdf-schema#)">

<rdf:Description rdf:about=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/terms/](http://purl.org/dc/terms/)">

<dc:title xml:lang="en-US">The Dublin Core Terms Namespace providing access to its content by means of an RDF Schema.</dc:title>

<dc:publisher xml:lang="en-US">The Dublin Core Metadata Initiative</dc:publisher>

<dc:description xml:lang="en-US">The Dublin Core Terms namespace provides URIs for the Dublin Core Element Set Qualifier Vocabulary. Vocabulary terms are declared using RDF Schema language to support RDF applications. The Dublin Core qualifiers form a richer vocabulary, which is intended to facilitate discovery of resources. It will be updated according to dc-usage decisions.</dc:description>

<dc:language xml:lang="en-US">English</dc:language>

<dcterms:issued>2000-07-11</dcterms:issued>

<dcterms:modified>2002-05-24</dcterms:modified>

<dc:source rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.dublincore.org/documents/2000/07/11/dcmes-qualifiers/](http://www.dublincore.org/documents/2000/07/11/dcmes-qualifiers/)"/>

<dc:source rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.dublincore.org/usage/decisions/](http://www.dublincore.org/usage/decisions/)"/>

<dcterms:requires rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)"/>

<dcterms:references rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/dcmitype/](http://purl.org/dc/dcmitype/)"/>

</rdf:Description>

#### <!-- set of info about new properties to be repeated for each new property -->

<rdf:Property rdf:about=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/terms/???erm](http://purl.org/dc/terms/???erm)">

<rdfs:label xml:lang="en-US">???</rdfs:label>

<rdfs:comment xml:lang="en-US">???comment</rdfs:comment>

<dc:description xml:lang="en-US">???description</dc:description>

<rdfs:isDefinedBy rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://purl.org/dc/terms/](http://purl.org/dc/terms/)"/>

<dcterms:issued>???date</dcterms:issued>

<dc:type rdf:resource=" [<img src="AccessForAllSchema_files/moin-www.png" alt="[WWW]" height="11" width="11">http://dublincore.org/usage/documents/principles/#element](http://dublincore.org/usage/documents/principles/#element)"/>

</rdf:Property>

 [RefreshCache](http://dublincore.org/accessibilitywiki/AccessForAllSchema?action=refresh&arena=Page.py&key=AccessForAllSchema.text_html) for this page (cached 2012-12-22 20:10:34)  

Immutable page (last edited 2006-06-04 22:46:41 by proxy5-14)


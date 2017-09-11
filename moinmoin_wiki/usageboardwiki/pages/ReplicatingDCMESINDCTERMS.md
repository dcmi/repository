---
title: "- ReplicatingDCMESINDCTERMS"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/ReplicatingDCMESINDCTERMS.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ReplicatingDCMESINDCTERMS](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=fullsearch&value=ReplicatingDCMESINDCTERMS&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS "View")
- [Diffs](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/ReplicatingDCMESINDCTERMS">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ReplicatingDCMESINDCTERMS_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ReplicatingDCMESINDCTERMS_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Replicating DCMES properties in the DCTERMS namespace

This document is part of the [<img src="ReplicatingDCMESINDCTERMS_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Usage Board Wiki](http://dublincore.org/usageboardwiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

Please announce any significant changes to this Wiki via the [DC-USAGE@jiscmail.ac.uk](mailto:DC-USAGE@jiscmail.ac.uk) list.

To express a view on this proposal please complete the short [<img src="ReplicatingDCMESINDCTERMS_files/moin-www.png" alt="[WWW]" height="11" width="11">JISCMail survey](http://www.jiscmail.ac.uk/cgi-bin/surveys.cgi?A=hp&LMGT1=DC-ARCHITECTURE) by 2006-04-26.

### Proposal

- The 15 [<img src="ReplicatingDCMESINDCTERMS_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMES properties](http://dublincore.org/documents/dces/) that are currently assigned URIs in the DC namespace ( [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)) will be replicated in the DCTERMS namespace ( [http://purl.org/dc/terms/](http://purl.org/dc/terms/)), i.e. 15 new terms will be added to the DCTERMS namespace.

- The existing terms in the DC namespace will continue to be valid, however implementors will be encouraged to use the newer terms.

- The RDFS/OWL machine-readable declarations for the 15 existing terms will be modified to indicate the equivalences between the existing terms and the newer terms.

- The RDFS/OWL machine-readable declarations for the 15 new terms will indicate the equivalences between the newer terms and the existing terms.

- The human-readable declarations of both sets of terms will indicate the equivalences between the older and newer terms and will recommend usage of the newer terms.

- The DCMI namespace policy and the various encoding guidelines (XHTML, XML and RDF) will be updated to use the newer terms.

- The DCMI-maintained XML schemas that support the encoding of DC metadata in XML will be updated.

### Background

The [<img src="ReplicatingDCMESINDCTERMS_files/moin-www.png" alt="[WWW]" height="11" width="11">Namespace Policy for the Dublin Core Metadata Initiative (DCMI)](http://dublincore.org/documents/dcmi-namespace/) defines how term URIs are assigned to all DCMI metadata terms and what guarantees DCMI makes about their persistence.

The 15 terms (elements) that make up the "Dublin Core Metadata Element Set, Version 1.1" are assigned URIs in the DC namespace (i.e. they are assigned URIs that begin with [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)). All other DCMI terms (including new elements, element refinements, encoding schemes and terms in DCMI-maintained controlled vocabularies) are assigned URIs in the DCTERMS namespace, the DCMITYPE namespace or in a vocabulary-specific namespace.

Implementors of metadata systems using DC properties that go beyond the use of the 15 DCMES elements therefore need to build knowledge about two different namespaces into their applications. This causes some confusion about the correct URI for terms in the different namespaces. For example, there is some evidence of people using 'DC' URIs for terms in the DCTERMS namespace and vice versa. There is also some evidence that the perceived hurdle of having to deal with two namespaces rather than one is sufficient to cause implementors to ignore Dublin Core metadata in favour of their own (or third-party) solutions.

According to the current namespace policy, the following XHTML example use of two DCMI elements is correct:

<pre>&lt;link rel="schema.DC" href="http://purl.org/dc/elements/1.1/" /&gt;
&lt;link rel="schema.DCTERMS" href="http://purl.org/dc/terms/" /&gt;

&lt;meta name="DC.title" content="_the title_" /&gt;
&lt;meta name="DCTERMS.audience" content="_the audience_" /&gt;
</pre>

Under the proposed change, this would become:

<pre>&lt;link rel="schema.DC" href="http://purl.org/dc/terms/" /&gt;

&lt;meta name="DC.title" content="_the title_" /&gt;
&lt;meta name="DC.audience" content="_the audience_" /&gt;
</pre>

### Impact of this proposal

#### On metadata producers

Systems that expose metadata (e.g. for harvesting or in search results) will not need to be changed in any way, though the implementors of such systems will be encouraged to move to using the 15 new terms in the DCTERMS namespace rather than the older terms in the DC namespace.

#### On metadata consumers

Systems that consume metadata (e.g. by harvesting it or receiving it in search results) will need to be modified to treat the 15 new terms in the DCTERMS namespace as equivalents for the 15 older terms in the DC namespace. This may be done by hardwiring such knowledge into the software, or by extracting this knowledge automatically from the machine-readable schema declarations of the DCMI terms (i.e. the RDFS/OWL schemas that are available at the two namespace URIs).

#### On DCMI documentation

The DCMI namespace policy and the XHTML, XML and RDF encoding guidelines will all need to be updated.

The machine-readable RDFS/OWL schemas available at the DCMI namespace URIs will need to be updated.

The DCMI-maintained XML schemas will need to be updated.

### Arguments in favour of the proposal

- Replicating the 15 DCMES terms in the DCTERMS namespace means that implementors need only deal with a single namespace for all DC elements and element refinements.

### Arguments against the proposal

- Although in the long term this proposal should result in less confusion amoungst implementors, it may result in greater confusion in the short term.

- The use of separate DC and DCTERMS namespaces may be perceived to be helpful in highlighting the 'core' natures of the 15 DCMES properties.

### Note on the continued use of PURLs as metadata term identifiers

This proposal would result in the coining of fifteen new PURL-based identifiers for DCMI metadata terms. It should be noted that the continued use of PURLs as the base URI for DCTERMS identifiers will consolidate a situation in which DCMI cannot comply with a June 2005 [<img src="ReplicatingDCMESINDCTERMS_files/moin-www.png" alt="[WWW]" height="11" width="11">W3C TAG resolution](http://lists.w3.org/Archives/Public/www-tag/2005Jun/0039.html) on the use of http URIs for non-information resources such as metadata terms. As explained in the W3C Working Draft [<img src="ReplicatingDCMESINDCTERMS_files/moin-www.png" alt="[WWW]" height="11" width="11">Best Practice Recipes for Publishing RDF Vocabularies](http://www.w3.org/TR/2006/WD-swbp-vocab-pub-20060314/#purls):

 When the central PURL server was originally developed in the 1990s, the standard response of an HTTP to a request against a PURL was to return a response code of 302 ("temporarily moved"). Web architecture has evolved since then, and the Technical Architecture Group (TAG) of W3C has resolved that, for the purpose of such redirects, the response code 303 ("see other") should be returned. As PURL servers use a 302 response code and there is currently no way to configure them to use 303 response codes, existing vocabularies with [http://purl.org](http://purl.org/) slash namespaces servers do not strictly conform to the current TAG recommendations. 

If the PURL server were modified to support the selection of a response code by the maintainer of a PURL, this would solve the problem. However, it is unclear whether the maintainers of the PURL server software would want to do this.

 [RefreshCache](http://dublincore.org/usageboardwiki/ReplicatingDCMESINDCTERMS?action=refresh&arena=Page.py&key=ReplicatingDCMESINDCTERMS.text_html) for this page (cached 2012-12-09 13:36:21)  

Immutable page (last edited 2006-04-10 21:43:14 by AndyPowell)


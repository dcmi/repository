---
title: "- DcelementsValidated"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/DcelementsValidated.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DcelementsValidated](http://dublincore.org/usageboardwiki/DcelementsValidated?action=fullsearch&value=DcelementsValidated&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/DcelementsValidated?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/DcelementsValidated "View")
- [Diffs](http://dublincore.org/usageboardwiki/DcelementsValidated?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/DcelementsValidated?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/DcelementsValidated?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/DcelementsValidated?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/DcelementsValidated?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/DcelementsValidated?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/DcelementsValidated?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/DcelementsValidated?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/DcelementsValidated?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/DcelementsValidated?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/DcelementsValidated?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/DcelementsValidated">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DcelementsValidated_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DcelementsValidated_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The document as Notation 3 <pre>@prefix dcam: &lt;http://purl.org/dc/dcam/&gt; .
@prefix xml: &lt;http://www.w3.org/XML/1998/namespace&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/elements/1.1/&gt; dcterms:title "DCMI Namespace for the Dublin Core Metadata Element Set, Version 1.1"@en-US ;
        dcterms:publisher "The Dublin Core Metadata Initiative"@en-US ;
        dcterms:modified "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/title&gt; rdf:type rdf:Property ;
        rdfs:label "Title"@en-US ;
        rdfs:comment "A name given to the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#title-006&gt; .
&lt;http://purl.org/dc/elements/1.1/creator&gt; rdf:type rdf:Property ;
        rdfs:label "Creator"@en-US ;
        rdfs:comment "An entity primarily responsible for making the resource."@en-US ;
        dcterms:description "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#creator-006&gt; .
&lt;http://purl.org/dc/elements/1.1/subject&gt; rdf:type rdf:Property ;
        rdfs:label "Subject"@en-US ;
        rdfs:comment "The topic of the resource."@en-US ;
        dcterms:description "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#subject-006&gt; .
&lt;http://purl.org/dc/elements/1.1/description&gt; rdf:type rdf:Property ;
        rdfs:label "Description"@en-US ;
        rdfs:comment "An account of the resource."@en-US ;
        dcterms:description "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#description-006&gt; .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; rdf:type rdf:Property ;
        rdfs:label "Publisher"@en-US ;
        rdfs:comment "An entity responsible for making the resource available."@en-US ;
        dcterms:description "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#publisher-006&gt; .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; rdf:type rdf:Property ;
        rdfs:label "Contributor"@en-US ;
        rdfs:comment "An entity responsible for making contributions to the resource."@en-US ;
        dcterms:description "Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#contributor-006&gt; .
&lt;http://purl.org/dc/elements/1.1/date&gt; rdf:type rdf:Property ;
        rdfs:label "Date"@en-US ;
        rdfs:comment "A point or period of time associated with an event in the lifecycle of the resource."@en-US ;
        dcterms:description "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#date-006&gt; .
&lt;http://purl.org/dc/elements/1.1/type&gt; rdf:type rdf:Property ;
        rdfs:label "Type"@en-US ;
        rdfs:comment "The nature or genre of the resource."@en-US ;
        dcterms:description "Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#type-006&gt; .
&lt;http://purl.org/dc/elements/1.1/format&gt; rdf:type rdf:Property ;
        rdfs:label "Format"@en-US ;
        rdfs:comment "The file format, physical medium, or dimensions of the resource."@en-US ;
        dcterms:description "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#format-007&gt; .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; rdf:type rdf:Property ;
        rdfs:label "Identifier"@en-US ;
        rdfs:comment "An unambiguous reference to the resource within a given context."@en-US ;
        dcterms:description "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#identifier-006&gt; .
&lt;http://purl.org/dc/elements/1.1/source&gt; rdf:type rdf:Property ;
        rdfs:label "Source"@en-US ;
        rdfs:comment "A related resource from which the described resource is derived."@en-US ;
        dcterms:description "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#source-006&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; rdf:type rdf:Property ;
        rdfs:label "Language"@en-US ;
        rdfs:comment "A language of the resource."@en-US ;
        dcterms:description "Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#language-007&gt; ;
        rdfs:seeAlso &lt;http://www.ietf.org/rfc/rfc4646.txt&gt; .
&lt;http://purl.org/dc/elements/1.1/relation&gt; rdf:type rdf:Property ;
        rdfs:label "Relation"@en-US ;
        rdfs:comment "A related resource."@en-US ;
        dcterms:description "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#relation-006&gt; .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; rdf:type rdf:Property ;
        rdfs:label "Coverage"@en-US ;
        rdfs:comment "The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant."@en-US ;
        dcterms:description "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#coverage-006&gt; .
&lt;http://purl.org/dc/elements/1.1/rights&gt; rdf:type rdf:Property ;
        rdfs:label "Rights"@en-US ;
        rdfs:comment "Information about rights held in and over the resource."@en-US ;
        dcterms:description "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/elements/1.1/&gt; ;
        dcterms:issued "1999-07-02" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#rights-006&gt; .

      The underlying triples

&lt;http://purl.org/dc/elements/1.1/&gt; &lt;http://purl.org/dc/terms/title&gt; "DCMI Namespace for the Dublin Core Metadata Element Set, Version 1.1"@en-US .
&lt;http://purl.org/dc/elements/1.1/&gt; &lt;http://purl.org/dc/terms/publisher&gt; "The Dublin Core Metadata Initiative"@en-US .
&lt;http://purl.org/dc/elements/1.1/&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Title"@en-US .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A name given to the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/title&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#title-006&gt; .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Creator"@en-US .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity primarily responsible for making the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/creator&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#creator-006&gt; .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Subject"@en-US .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The topic of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://purl.org/dc/terms/description&gt; "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-US .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/subject&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#subject-006&gt; .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Description"@en-US .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An account of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://purl.org/dc/terms/description&gt; "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/description&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#description-006&gt; .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Publisher"@en-US .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity responsible for making the resource available."@en-US .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/publisher&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#publisher-006&gt; .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Contributor"@en-US .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity responsible for making contributions to the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/contributor&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#contributor-006&gt; .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date"@en-US .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A point or period of time associated with an event in the lifecycle of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://purl.org/dc/terms/description&gt; "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-US .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/date&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#date-006&gt; .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Type"@en-US .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The nature or genre of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element."@en-US .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/type&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#type-006&gt; .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Format"@en-US .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The file format, physical medium, or dimensions of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."@en-US .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/format&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#format-007&gt; .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Identifier"@en-US .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An unambiguous reference to the resource within a given context."@en-US .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-US .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/identifier&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#identifier-006&gt; .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Source"@en-US .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource from which the described resource is derived."@en-US .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://purl.org/dc/terms/description&gt; "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."@en-US .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/source&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#source-006&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Language"@en-US .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A language of the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646]."@en-US .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#language-007&gt; .
&lt;http://purl.org/dc/elements/1.1/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.ietf.org/rfc/rfc4646.txt&gt; .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Relation"@en-US .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "@en-US .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/relation&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#relation-006&gt; .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Coverage"@en-US .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant."@en-US .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://purl.org/dc/terms/description&gt; "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges."@en-US .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/coverage&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#coverage-006&gt; .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Rights"@en-US .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Information about rights held in and over the resource."@en-US .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://purl.org/dc/terms/description&gt; "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."@en-US .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/elements/1.1/&gt; .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://purl.org/dc/terms/issued&gt; "1999-07-02" .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/elements/1.1/rights&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#rights-006&gt; .

      Your original RDF/XML document

1 &lt;?xml version="1.0" encoding="UTF-8"?&gt;
2 &lt;!DOCTYPE rdf:RDF [
3 &lt;!ENTITY rdfns 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'&gt;
4 &lt;!ENTITY rdfsns 'http://www.w3.org/2000/01/rdf-schema#'&gt;
5 &lt;!ENTITY dcns 'http://purl.org/dc/elements/1.1/'&gt;
6 &lt;!ENTITY dctermsns 'http://purl.org/dc/terms/'&gt;
7 &lt;!ENTITY dctypens 'http://purl.org/dc/dcmitype/'&gt;
8 &lt;!ENTITY dcamns 'http://purl.org/dc/dcam/'&gt;
9 ]&gt;
10 &lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:dcam="http://purl.org/dc/dcam/" xmlns:dcterms="http://purl.org/dc/terms/" xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"&gt;
11 &lt;rdf:Description rdf:about="http://purl.org/dc/elements/1.1/"&gt;
12 &lt;dcterms:title xml:lang="en-US"&gt;DCMI Namespace for the Dublin Core Metadata Element Set, Version 1.1&lt;/dcterms:title&gt;
13 &lt;dcterms:publisher xml:lang="en-US"&gt;The Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
14 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
15 &lt;/rdf:Description&gt;
16 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/title"&gt;
17 &lt;rdfs:label xml:lang="en-US"&gt;Title&lt;/rdfs:label&gt;
18 &lt;rdfs:comment xml:lang="en-US"&gt;A name given to the resource.&lt;/rdfs:comment&gt;
19 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
20 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
21 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
22 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
23 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#title-006"/&gt;
24 &lt;/rdf:Property&gt;
25 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/creator"&gt;
26 &lt;rdfs:label xml:lang="en-US"&gt;Creator&lt;/rdfs:label&gt;
27 &lt;rdfs:comment xml:lang="en-US"&gt;An entity primarily responsible for making the resource.&lt;/rdfs:comment&gt;
28 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity.&lt;/dcterms:description&gt;
29 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
30 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
31 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
32 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
33 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#creator-006"/&gt;
34 &lt;/rdf:Property&gt;
35 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/subject"&gt;
36 &lt;rdfs:label xml:lang="en-US"&gt;Subject&lt;/rdfs:label&gt;
37 &lt;rdfs:comment xml:lang="en-US"&gt;The topic of the resource.&lt;/rdfs:comment&gt;
38 &lt;dcterms:description xml:lang="en-US"&gt;Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element.&lt;/dcterms:description&gt;
39 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
40 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
41 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
42 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
43 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#subject-006"/&gt;
44 &lt;/rdf:Property&gt;
45 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/description"&gt;
46 &lt;rdfs:label xml:lang="en-US"&gt;Description&lt;/rdfs:label&gt;
47 &lt;rdfs:comment xml:lang="en-US"&gt;An account of the resource.&lt;/rdfs:comment&gt;
48 &lt;dcterms:description xml:lang="en-US"&gt;Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.&lt;/dcterms:description&gt;
49 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
50 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
51 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
52 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
53 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#description-006"/&gt;
54 &lt;/rdf:Property&gt;
55 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/publisher"&gt;
56 &lt;rdfs:label xml:lang="en-US"&gt;Publisher&lt;/rdfs:label&gt;
57 &lt;rdfs:comment xml:lang="en-US"&gt;An entity responsible for making the resource available.&lt;/rdfs:comment&gt;
58 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity.&lt;/dcterms:description&gt;
59 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
60 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
61 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
62 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
63 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#publisher-006"/&gt;
64 &lt;/rdf:Property&gt;
65 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/contributor"&gt;
66 &lt;rdfs:label xml:lang="en-US"&gt;Contributor&lt;/rdfs:label&gt;
67 &lt;rdfs:comment xml:lang="en-US"&gt;An entity responsible for making contributions to the resource.&lt;/rdfs:comment&gt;
68 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity.&lt;/dcterms:description&gt;
69 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
70 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
71 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
72 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
73 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#contributor-006"/&gt;
74 &lt;/rdf:Property&gt;
75 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/date"&gt;
76 &lt;rdfs:label xml:lang="en-US"&gt;Date&lt;/rdfs:label&gt;
77 &lt;rdfs:comment xml:lang="en-US"&gt;A point or period of time associated with an event in the lifecycle of the resource.&lt;/rdfs:comment&gt;
78 &lt;dcterms:description xml:lang="en-US"&gt;Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].&lt;/dcterms:description&gt;
79 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
80 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
81 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
82 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
83 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#date-006"/&gt;
84 &lt;/rdf:Property&gt;
85 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/type"&gt;
86 &lt;rdfs:label xml:lang="en-US"&gt;Type&lt;/rdfs:label&gt;
87 &lt;rdfs:comment xml:lang="en-US"&gt;The nature or genre of the resource.&lt;/rdfs:comment&gt;
88 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element.&lt;/dcterms:description&gt;
89 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
90 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
91 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
92 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
93 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#type-006"/&gt;
94 &lt;/rdf:Property&gt;
95 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/format"&gt;
96 &lt;rdfs:label xml:lang="en-US"&gt;Format&lt;/rdfs:label&gt;
97 &lt;rdfs:comment xml:lang="en-US"&gt;The file format, physical medium, or dimensions of the resource.&lt;/rdfs:comment&gt;
98 &lt;dcterms:description xml:lang="en-US"&gt;Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].&lt;/dcterms:description&gt;
99 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
100 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
101 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
102 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
103 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#format-007"/&gt;
104 &lt;/rdf:Property&gt;
105 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/identifier"&gt;
106 &lt;rdfs:label xml:lang="en-US"&gt;Identifier&lt;/rdfs:label&gt;
107 &lt;rdfs:comment xml:lang="en-US"&gt;An unambiguous reference to the resource within a given context.&lt;/rdfs:comment&gt;
108 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. &lt;/dcterms:description&gt;
109 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
110 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
111 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
112 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
113 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#identifier-006"/&gt;
114 &lt;/rdf:Property&gt;
115 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/source"&gt;
116 &lt;rdfs:label xml:lang="en-US"&gt;Source&lt;/rdfs:label&gt;
117 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource from which the described resource is derived.&lt;/rdfs:comment&gt;
118 &lt;dcterms:description xml:lang="en-US"&gt;The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.&lt;/dcterms:description&gt;
119 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
120 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
121 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
122 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
123 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#source-006"/&gt;
124 &lt;/rdf:Property&gt;
125 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/language"&gt;
126 &lt;rdfs:label xml:lang="en-US"&gt;Language&lt;/rdfs:label&gt;
127 &lt;rdfs:comment xml:lang="en-US"&gt;A language of the resource.&lt;/rdfs:comment&gt;
128 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646].&lt;/dcterms:description&gt;
129 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
130 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
131 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
132 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
133 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#language-007"/&gt;
134 &lt;rdfs:seeAlso rdf:resource="http://www.ietf.org/rfc/rfc4646.txt"/&gt;
135 &lt;/rdf:Property&gt;
136 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/relation"&gt;
137 &lt;rdfs:label xml:lang="en-US"&gt;Relation&lt;/rdfs:label&gt;
138 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource.&lt;/rdfs:comment&gt;
139 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. &lt;/dcterms:description&gt;
140 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
141 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
142 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
143 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
144 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#relation-006"/&gt;
145 &lt;/rdf:Property&gt;
146 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/coverage"&gt;
147 &lt;rdfs:label xml:lang="en-US"&gt;Coverage&lt;/rdfs:label&gt;
148 &lt;rdfs:comment xml:lang="en-US"&gt;The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant.&lt;/rdfs:comment&gt;
149 &lt;dcterms:description xml:lang="en-US"&gt;Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges.&lt;/dcterms:description&gt;
150 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
151 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
152 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
153 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
154 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#coverage-006"/&gt;
155 &lt;/rdf:Property&gt;
156 &lt;rdf:Property rdf:about="http://purl.org/dc/elements/1.1/rights"&gt;
157 &lt;rdfs:label xml:lang="en-US"&gt;Rights&lt;/rdfs:label&gt;
158 &lt;rdfs:comment xml:lang="en-US"&gt;Information about rights held in and over the resource.&lt;/rdfs:comment&gt;
159 &lt;dcterms:description xml:lang="en-US"&gt;Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.&lt;/dcterms:description&gt;
160 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/elements/1.1/"/&gt;
161 &lt;dcterms:issued&gt;1999-07-02&lt;/dcterms:issued&gt;
162 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
163 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
164 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#rights-006"/&gt;
165 &lt;/rdf:Property&gt;
166 &lt;/rdf:RDF&gt;
167  
168  

This site is run by Joshua Tauberer &lt;http://razor.occams.info&gt;.
</pre>

 [RefreshCache](http://dublincore.org/usageboardwiki/DcelementsValidated?action=refresh&arena=Page.py&key=DcelementsValidated.text_html) for this page (cached 2012-12-09 12:46:27)  

Immutable page (last edited 2007-12-18 09:10:04 by TomBaker)


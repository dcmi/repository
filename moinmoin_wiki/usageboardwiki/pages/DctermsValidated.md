---
title: "- DctermsValidated"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/DctermsValidated.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DctermsValidated](http://dublincore.org/usageboardwiki/DctermsValidated?action=fullsearch&value=DctermsValidated&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/DctermsValidated?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/DctermsValidated "View")
- [Diffs](http://dublincore.org/usageboardwiki/DctermsValidated?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/DctermsValidated?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/DctermsValidated?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/DctermsValidated?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/DctermsValidated?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/DctermsValidated?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/DctermsValidated?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/DctermsValidated?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/DctermsValidated?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/DctermsValidated?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/DctermsValidated?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/DctermsValidated">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DctermsValidated_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DctermsValidated_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The document as Notation 3 <pre>@prefix dcam: &lt;http://purl.org/dc/dcam/&gt; .
@prefix xml: &lt;http://www.w3.org/XML/1998/namespace&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/&gt; dcterms:title "DCMI Namespace for metadata terms in the http://purl.org/dc/terms/ namespace"@en-US ;
        dcterms:publisher "The Dublin Core Metadata Initiative"@en-US ;
        dcterms:modified "2008-01-14" .
dcterms:title rdfs:label "Title"@en-US ;
        dcterms:description "A name given to the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#titleT-001&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:comment "In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/title&gt; .
dcterms:creator rdfs:label "Creator"@en-US ;
        rdfs:comment "An entity primarily responsible for making the resource."@en-US ;
        dcterms:description "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#creatorT-001&gt; ;
        rdfs:range dcterms:Agent ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/creator&gt; ,
                dcterms:contributor .
dcterms:subject rdfs:label "Subject"@en-US ;
        rdfs:comment "The topic of the resource."@en-US ;
        dcterms:description "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#subjectT-001&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/subject&gt; .
dcterms:description rdfs:label "Description"@en-US ;
        rdfs:comment "An account of the resource."@en-US ;
        dcterms:description "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#descriptionT-001&gt; ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/description&gt; .
dcterms:publisher rdfs:label "Publisher"@en-US ;
        rdfs:comment "An entity responsible for making the resource available."@en-US ;
        dcterms:description "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#publisherT-001&gt; ;
        rdfs:range dcterms:Agent ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/publisher&gt; .
dcterms:contributor rdfs:label "Contributor"@en-US ;
        rdfs:comment "An entity responsible for making contributions to the resource."@en-US ;
        dcterms:description "Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#contributorT-001&gt; ;
        rdfs:range dcterms:Agent ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/contributor&gt; .
dcterms:date rdfs:label "Date"@en-US ;
        rdfs:comment "A point or period of time associated with an event in the lifecycle of the resource."@en-US ;
        dcterms:description "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#dateT-001&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; .
dcterms:type rdfs:label "Type"@en-US ;
        rdfs:comment "The nature or genre of the resource."@en-US ;
        dcterms:description "Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#typeT-001&gt; ;
        rdfs:range rdfs:Class ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/title&gt; .
dcterms:format rdfs:label "Format"@en-US ;
        rdfs:comment "The file format, physical medium, or dimensions of the resource."@en-US ;
        dcterms:description "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#formatT-001&gt; ;
        rdfs:range dcterms:MediaTypeOrExtent ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/format&gt; .
dcterms:identifier rdfs:label "Identifier"@en-US ;
        rdfs:comment "An unambiguous reference to the resource within a given context."@en-US ;
        dcterms:description "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#identifierT-001&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/identifier&gt; .
dcterms:source rdfs:label "Source"@en-US ;
        rdfs:comment "A related resource from which the described resource is derived."@en-US ;
        dcterms:description "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#sourceT-001&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/source&gt; ,
                dcterms:relation .
dcterms:language rdfs:label "Language"@en-US ;
        rdfs:comment "A language of the resource."@en-US ;
        dcterms:description "Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646]."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#languageT-001&gt; ;
        rdfs:range dcterms:LinguisticSystem ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/language&gt; .
dcterms:relation rdfs:label "Relation"@en-US ;
        rdfs:comment "A related resource."@en-US ;
        dcterms:description "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#relationT-001&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; .
dcterms:coverage rdfs:label "Coverage"@en-US ;
        rdfs:comment "The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant."@en-US ;
        dcterms:description "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#coverageT-001&gt; ;
        rdfs:range dcterms:LocationPeriodOrJurisdiction ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/coverage&gt; .
dcterms:rights rdfs:label "Rights"@en-US ;
        rdfs:comment "Information about rights held in and over the resource."@en-US ;
        dcterms:description "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#rightsT-001&gt; ;
        rdfs:range dcterms:RightsStatement ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/rights&gt; .
dcterms:audience rdfs:label "Audience"@en-US ;
        rdfs:comment "A class of entity for whom the resource is intended or useful."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2001-05-21" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#audience-003&gt; ;
        rdfs:range dcterms:AgentClass .
dcterms:alternative rdfs:label "Alternative Title"@en-US ;
        rdfs:comment "An alternative name for the resource."@en-US ;
        dcterms:description "The distinction between titles and alternative titles is application-specific."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#alternative-003&gt; ;
        rdfs:comment "In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/title&gt; ,
                dcterms:title .
dcterms:tableOfContents rdfs:label "Table Of Contents"@en-US ;
        rdfs:comment "A list of subunits of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#tableOfContents-003&gt; ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/description&gt; ,
                dcterms:description .
dcterms:abstract rdfs:label "Abstract"@en-US ;
        rdfs:comment "A summary of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#abstract-003&gt; ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/description&gt; ,
                dcterms:description .
dcterms:created rdfs:label "Date Created"@en-US ;
        rdfs:comment "Date of creation of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#created-003&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:valid rdfs:label "Date Valid"@en-US ;
        rdfs:comment "Date (often a range) of validity of a resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#valid-003&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:available rdfs:label "Date Available"@en-US ;
        rdfs:comment "Date (often a range) that the resource became or will become available."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#available-003&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:issued rdfs:label "Date Issued"@en-US ;
        rdfs:comment "Date of formal issuance (e.g., publication) of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#issued-003&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:modified rdfs:label "Date Modified"@en-US ;
        rdfs:comment "Date on which the resource was changed."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#modified-003&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:extent rdfs:label "Extent"@en-US ;
        rdfs:comment "The size or duration of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#extent-003&gt; ;
        rdfs:range dcterms:SizeOrDuration ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/format&gt; ,
                dcterms:format .
dcterms:medium rdfs:label "Medium"@en-US ;
        rdfs:comment "The material or physical carrier of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#medium-003&gt; ;
        rdfs:domain dcterms:PhysicalResource ;
        rdfs:range dcterms:PhysicalMedium ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/format&gt; ,
                dcterms:format .
dcterms:isVersionOf rdfs:label "Is Version Of"@en-US ;
        rdfs:comment "A related resource of which the described resource is a version, edition, or adaptation."@en-US ;
        dcterms:description "Changes in version imply substantive changes in content rather than differences in format."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isVersionOf-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:hasVersion rdfs:label "Has Version"@en-US ;
        rdfs:comment "A related resource that is a version, edition, or adaptation of the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#hasVersion-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:isReplacedBy rdfs:label "Is Replaced By"@en-US ;
        rdfs:comment "A related resource that supplants, displaces, or supersedes the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isReplacedBy-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:replaces rdfs:label "Replaces"@en-US ;
        rdfs:comment "A related resource that is supplanted, displaced, or superseded by the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#replaces-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:isRequiredBy rdfs:label "Is Required By"@en-US ;
        rdfs:comment "A related resource that requires the described resource to support its function, delivery, or coherence."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isRequiredBy-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:requires rdfs:label "Requires"@en-US ;
        rdfs:comment "A related resource that is required by the described resource to support its function, delivery, or coherence."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#requires-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:isPartOf rdfs:label "Is Part Of"@en-US ;
        rdfs:comment "A related resource in which the described resource is physically or logically included."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isPartOf-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:hasPart rdfs:label "Has Part"@en-US ;
        rdfs:comment "A related resource that is included either physically or logically in the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#hasPart-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:isReferencedBy rdfs:label "Is Referenced By"@en-US ;
        rdfs:comment "A related resource that references, cites, or otherwise points to the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isReferencedBy-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:references rdfs:label "References"@en-US ;
        rdfs:comment "A related resource that is referenced, cited, or otherwise pointed to by the described resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#references-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:isFormatOf rdfs:label "Is Format Of"@en-US ;
        rdfs:comment "A related resource that is substantially the same as the described resource, but in another format."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#isFormatOf-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:hasFormat rdfs:label "Has Format"@en-US ;
        rdfs:comment "A related resource that is substantially the same as the pre-existing described resource, but in another format."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#hasFormat-003&gt; ;
        rdfs:comment "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:conformsTo rdfs:label "Conforms To"@en-US ;
        rdfs:comment "An established standard to which the described resource conforms."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2001-05-21" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#conformsTo-003&gt; ;
        rdfs:range dcterms:Standard ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/relation&gt; ,
                dcterms:relation .
dcterms:spatial rdfs:label "Spatial Coverage"@en-US ;
        rdfs:comment "Spatial characteristics of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#spatial-003&gt; ;
        rdfs:range dcterms:Location ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/coverage&gt; ,
                dcterms:coverage .
dcterms:temporal rdfs:label "Temporal Coverage"@en-US ;
        rdfs:comment "Temporal characteristics of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#temporal-003&gt; ;
        rdfs:range dcterms:PeriodOfTime ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/coverage&gt; ,
                dcterms:coverage .
dcterms:mediator rdfs:label "Mediator"@en-US ;
        rdfs:comment "An entity that mediates access to the resource and for whom the resource is intended or useful."@en-US ;
        dcterms:description "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2001-05-21" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#mediator-003&gt; ;
        rdfs:range dcterms:AgentClass ;
        rdfs:subPropertyOf dcterms:audience .
dcterms:dateAccepted rdfs:label "Date Accepted"@en-US ;
        rdfs:comment "Date of acceptance of the resource."@en-US ;
        dcterms:description "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#dateAccepted-002&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:dateCopyrighted rdfs:label "Date Copyrighted"@en-US ;
        rdfs:comment "Date of copyright."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#dateCopyrighted-002&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:dateSubmitted rdfs:label "Date Submitted"@en-US ;
        rdfs:comment "Date of submission of the resource."@en-US ;
        dcterms:description "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal)."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#dateSubmitted-002&gt; ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/date&gt; ,
                dcterms:date .
dcterms:educationLevel rdfs:label "Audience Education Level"@en-US ;
        rdfs:comment "A class of entity, defined in terms of progression through an educational or training context, for which the described resource is intended."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#educationLevel-002&gt; ;
        rdfs:range dcterms:AgentClass ;
        rdfs:subPropertyOf dcterms:audience .
dcterms:accessRights rdfs:label "Access Rights"@en-US ;
        rdfs:comment "Information about who can access the resource or an indication of its security status."@en-US ;
        dcterms:description "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2003-02-15" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#accessRights-002&gt; ;
        rdfs:range dcterms:RightsStatement ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/rights&gt; ,
                dcterms:rights .
dcterms:bibliographicCitation rdfs:label "Bibliographic Citation"@en-US ;
        rdfs:comment "A bibliographic reference for the resource."@en-US ;
        dcterms:description "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2003-02-15" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#bibliographicCitation-002&gt; ;
        rdfs:domain dcterms:BibliographicResource ;
        rdfs:range rdfs:Literal ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/identifier&gt; ,
                dcterms:identifier .
dcterms:license rdfs:label "License"@en-US ;
        rdfs:comment "A legal document giving official permission to do something with the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2004-06-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#license-002&gt; ;
        rdfs:range dcterms:LicenseDocument ;
        rdfs:subPropertyOf &lt;http://purl.org/dc/elements/1.1/rights&gt; ,
                dcterms:rights .
dcterms:rightsHolder rdfs:label "Rights Holder"@en-US ;
        rdfs:comment "A person or organization owning or managing rights over the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2004-06-14" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#rightsHolder-002&gt; ;
        rdfs:range dcterms:Agent .
dcterms:provenance rdfs:label "Provenance"@en-US ;
        rdfs:comment "A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation."@en-US ;
        dcterms:description "The statement may include a description of any changes successive custodians made to the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2004-09-20" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#provenance-002&gt; ;
        rdfs:range dcterms:ProvenanceStatement .
dcterms:instructionalMethod rdfs:label "Instructional Method"@en-US ;
        rdfs:comment "A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support."@en-US ;
        dcterms:description "Instructional Method will typically include ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2005-06-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#instructionalMethod-002&gt; ;
        rdfs:range dcterms:MethodOfInstruction .
dcterms:accrualMethod rdfs:label "Accrual Method"@en-US ;
        rdfs:comment "The method by which items are added to a collection."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2005-06-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#accrualMethod-002&gt; ;
        rdfs:domain dcterms:Collection ;
        rdfs:range dcterms:MethodOfAccrual .
dcterms:accrualPeriodicity rdfs:label "Accrual Periodicity"@en-US ;
        rdfs:comment "The frequency with which items are added to a collection."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2005-06-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#accrualPeriodicity-002&gt; ;
        rdfs:domain dcterms:Collection ;
        rdfs:range dcterms:Frequency .
dcterms:accrualPolicy rdfs:label "Accrual Policy"@en-US ;
        rdfs:comment "The policy governing the addition of items to a collection."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2005-06-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#accrualPolicy-002&gt; ;
        rdfs:domain dcterms:Collection ;
        rdfs:range dcterms:Policy .
dcterms:Agent rdfs:label "Agent"@en-US ;
        rdfs:comment "A resource that acts or has the power to act."@en-US ;
        dcterms:description "Examples of Agent include person, organization, and software agent."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ,
                dcterms:AgentClass ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Agent-001&gt; .
dcterms:AgentClass rdfs:label "Agent Class"@en-US ;
        rdfs:comment "A group of agents."@en-US ;
        dcterms:description "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#AgentClass-001&gt; ;
        rdfs:subClassOf dcterms:AgentClass .
dcterms:BibliographicResource rdfs:label "Bibliographic Resource"@en-US ;
        rdfs:comment "A book, article, or other documentary resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#BibliographicResource-001&gt; .
dcterms:FileFormat rdfs:label "File Format"@en-US ;
        rdfs:comment "A digital resource format."@en-US ;
        dcterms:description "Examples include the formats defined by the list of Internet Media Types."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#FileFormat-001&gt; ;
        rdfs:subClassOf dcterms:MediaType .
dcterms:Frequency rdfs:label "Frequency"@en-US ;
        rdfs:comment "A rate at which something recurs."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Frequency-001&gt; .
dcterms:Jurisdiction rdfs:label "Jurisdiction"@en-US ;
        rdfs:comment "The extent or range of judicial, law enforcement, or other authority."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Jurisdiction-001&gt; ;
        rdfs:subClassOf dcterms:LocationPeriodOrJurisdiction .
dcterms:LicenseDocument rdfs:label "License Document"@en-US ;
        rdfs:comment "A legal document giving official permission to do something with a Resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#LicenseDocument-001&gt; ;
        rdfs:subClassOf dcterms:RightsStatement .
dcterms:LinguisticSystem rdfs:label "Linguistic System"@en-US ;
        rdfs:comment "A system of signs, symbols, sounds, gestures, or rules used in communication."@en-US ;
        dcterms:description "Examples include written, spoken, sign, and computer languages."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#LinguisticSystem-001&gt; .
dcterms:Location rdfs:label "Location"@en-US ;
        rdfs:comment "A spatial region or named place."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Location-001&gt; ;
        rdfs:subClassOf dcterms:LocationPeriodOrJurisdiction .
dcterms:LocationPeriodOrJurisdiction rdfs:label "Location, Period, or Jurisdiction"@en-US ;
        rdfs:comment "A location, period of time, or jurisdiction."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#LocationPeriodOrJurisdiction-001&gt; .
dcterms:MediaType rdfs:label "Media Type"@en-US ;
        rdfs:comment "A file format or physical medium."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MediaType-001&gt; ;
        rdfs:subClassOf dcterms:MediaTypeOrExtent .
dcterms:MediaTypeOrExtent rdfs:label "Media Type or Extent"@en-US ;
        rdfs:comment "A media type or extent."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MediaTypeOrExtent-001&gt; .
dcterms:MethodOfInstruction rdfs:label "Method of Instruction"@en-US ;
        rdfs:comment "A process that is used to engender knowledge, attitudes, and skills."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MethodOfInstruction-001&gt; .
dcterms:MethodOfAccrual rdfs:label "Method of Accrual"@en-US ;
        rdfs:comment "A method by which resources are added to a collection."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MethodOfAccrual-001&gt; .
dcterms:PeriodOfTime rdfs:label "Period of Time"@en-US ;
        rdfs:comment "An interval of time that is named or defined by its start and end dates."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#PeriodOfTime-001&gt; ;
        rdfs:subClassOf dcterms:LocationPeriodOrJurisdiction .
dcterms:PhysicalMedium rdfs:label "Physical Medium"@en-US ;
        rdfs:comment "A physical material or carrier."@en-US ;
        dcterms:description "Examples include paper, canvas, or DVD."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#PhysicalMedium-001&gt; ;
        rdfs:subClassOf dcterms:MediaType .
dcterms:PhysicalResource rdfs:label "Physical Resource"@en-US ;
        rdfs:comment "A material thing."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#PhysicalResource-001&gt; .
dcterms:Policy rdfs:label "Policy"@en-US ;
        rdfs:comment "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Policy-001&gt; .
dcterms:ProvenanceStatement rdfs:label "Provenance Statement"@en-US ;
        rdfs:comment "A statement of any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#ProvenanceStatement-001&gt; .
dcterms:RightsStatement rdfs:label "Rights Statement"@en-US ;
        rdfs:comment "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#RightsStatement-001&gt; .
dcterms:SizeOrDuration rdfs:label "Size or Duration"@en-US ;
        rdfs:comment "A dimension or extent, or a time taken to play or execute."@en-US ;
        dcterms:description "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#SizeOrDuration-001&gt; ;
        rdfs:subClassOf dcterms:MediaTypeOrExtent .
dcterms:Standard rdfs:label "Standard"@en-US ;
        rdfs:comment "A basis for comparison; a reference point against which other things can be evaluated."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Standard-001&gt; .
dcterms:ISO639-2 rdfs:label "ISO 639-2"@en-US ;
        rdfs:comment "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#ISO639-2-003&gt; ;
        rdfs:seeAlso &lt;http://lcweb.loc.gov/standards/iso639-2/langhome.html&gt; .
dcterms:RFC1766 rdfs:label "RFC 1766"@en-US ;
        rdfs:comment "The set of tags, constructed according to RFC 1766, for the identification of languages."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#RFC1766-003&gt; ;
        rdfs:seeAlso &lt;http://www.ietf.org/rfc/rfc1766.txt&gt; .
dcterms:URI rdfs:label "URI"@en-US ;
        rdfs:comment "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#URI-003&gt; ;
        rdfs:seeAlso &lt;http://www.ietf.org/rfc/rfc3986.txt&gt; .
dcterms:Point rdfs:label "DCMI Point"@en-US ;
        rdfs:comment "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Point-003&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/dcmi-point/&gt; .
dcterms:ISO3166 rdfs:label "ISO 3166"@en-US ;
        rdfs:comment "The set of codes listed in ISO 3166-1 for the representation of names of countries."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#ISO3166-004&gt; ;
        rdfs:seeAlso &lt;http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html&gt; .
dcterms:Box rdfs:label "DCMI Box"@en-US ;
        rdfs:comment "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Box-003&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/dcmi-box/&gt; .
dcterms:Period rdfs:label "DCMI Period"@en-US ;
        rdfs:comment "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Period-003&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/dcmi-period/&gt; .
dcterms:W3CDTF rdfs:label "W3C-DTF"@en-US ;
        rdfs:comment "The set of dates and times constructed according to the W3C Date and Time Formats Specification."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#W3CDTF-003&gt; ;
        rdfs:seeAlso &lt;http://www.w3.org/TR/NOTE-datetime&gt; .
dcterms:RFC3066 rdfs:label "RFC 3066"@en-US ;
        rdfs:comment "The set of tags constructed according to RFC 3066 for the identification of languages."@en-US ;
        dcterms:description "RFC 3066 has been obsoleted by RFC 4646."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#RFC3066-002&gt; ;
        rdfs:seeAlso &lt;http://www.ietf.org/rfc/rfc3066.txt&gt; .
dcterms:RFC4646 rdfs:label "RFC 4646"@en-US ;
        rdfs:comment "The set of tags constructed according to RFC 4646 for the identification of languages."@en-US ;
        dcterms:description "RFC 4646 obsoletes RFC 3066."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#RFC4646-001&gt; ;
        rdfs:seeAlso &lt;http://www.ietf.org/rfc/rfc4646.txt&gt; .
dcterms:ISO639-3 rdfs:label "ISO 639-3"@en-US ;
        rdfs:comment "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Datatype ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#ISO639-3-001&gt; ;
        rdfs:seeAlso &lt;http://www.sil.org/iso639-3/&gt; .
dcterms:LCSH rdfs:label "LCSH"@en-US ;
        rdfs:comment "The set of labeled concepts specified by the Library of Congress Subject Headings."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#LCSH-003&gt; .
dcterms:MESH rdfs:label "MeSH"@en-US ;
        rdfs:comment "The set of labeled concepts specified by the Medical Subject Headings."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MESH-003&gt; ;
        rdfs:seeAlso &lt;http://www.nlm.nih.gov/mesh/meshhome.html&gt; .
dcterms:DDC rdfs:label "DDC"@en-US ;
        rdfs:comment "The set of conceptual resources specified by the Dewey Decimal Classification."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#DDC-003&gt; ;
        rdfs:seeAlso &lt;http://www.oclc.org/dewey/&gt; .
dcterms:LCC rdfs:label "LCC"@en-US ;
        rdfs:comment "The set of conceptual resources specified by the Library of Congress Classification."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#LCC-003&gt; ;
        rdfs:seeAlso &lt;http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html&gt; .
dcterms:UDC rdfs:label "UDC"@en-US ;
        rdfs:comment "The set of conceptual resources specified by the Universal Decimal Classification."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#UDC-003&gt; ;
        rdfs:seeAlso &lt;http://www.udcc.org/&gt; .
dcterms:DCMIType rdfs:label "DCMI Type Vocabulary"@en-US ;
        rdfs:comment "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#DCMIType-003&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/dcmi-type-vocabulary/&gt; .
dcterms:IMT rdfs:label "IMT"@en-US ;
        rdfs:comment "The set of media types specified by the Internet Assigned Numbers Authority."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#IMT-004&gt; ;
        rdfs:seeAlso &lt;http://www.iana.org/assignments/media-types/&gt; .
dcterms:TGN rdfs:label "TGN"@en-US ;
        rdfs:comment "The set of places specified by the Getty Thesaurus of Geographic Names."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#TGN-003&gt; ;
        rdfs:seeAlso &lt;http://www.getty.edu/research/tools/vocabulary/tgn/index.html&gt; .
dcterms:NLM rdfs:label "NLM"@en-US ;
        rdfs:comment "The set of conceptual resources specified by the National Library of Medicine Classification."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/terms/&gt; ;
        dcterms:issued "2005-06-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type dcam:VocabularyEncodingScheme ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#NLM-002&gt; ;
        rdfs:seeAlso &lt;http://wwwcf.nlm.nih.gov/class/&gt; .

      The underlying triples

&lt;http://purl.org/dc/terms/&gt; &lt;http://purl.org/dc/terms/title&gt; "DCMI Namespace for metadata terms in the http://purl.org/dc/terms/ namespace"@en-US .
&lt;http://purl.org/dc/terms/&gt; &lt;http://purl.org/dc/terms/publisher&gt; "The Dublin Core Metadata Initiative"@en-US .
&lt;http://purl.org/dc/terms/&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Title"@en-US .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://purl.org/dc/terms/description&gt; "A name given to the resource."@en-US .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#titleT-001&gt; .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options."@en-US .
&lt;http://purl.org/dc/terms/title&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/title&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Creator"@en-US .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity primarily responsible for making the resource."@en-US .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#creatorT-001&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Agent&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/creator&gt; .
&lt;http://purl.org/dc/terms/creator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/contributor&gt; .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Subject"@en-US .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The topic of the resource."@en-US .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://purl.org/dc/terms/description&gt; "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-US .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#subjectT-001&gt; .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/subject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/subject&gt; .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Description"@en-US .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An account of the resource."@en-US .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://purl.org/dc/terms/description&gt; "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-US .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#descriptionT-001&gt; .
&lt;http://purl.org/dc/terms/description&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/description&gt; .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Publisher"@en-US .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity responsible for making the resource available."@en-US .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#publisherT-001&gt; .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Agent&gt; .
&lt;http://purl.org/dc/terms/publisher&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/publisher&gt; .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Contributor"@en-US .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity responsible for making contributions to the resource."@en-US .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity."@en-US .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#contributorT-001&gt; .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Agent&gt; .
&lt;http://purl.org/dc/terms/contributor&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/contributor&gt; .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date"@en-US .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A point or period of time associated with an event in the lifecycle of the resource."@en-US .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://purl.org/dc/terms/description&gt; "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-US .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#dateT-001&gt; .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/date&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Type"@en-US .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The nature or genre of the resource."@en-US .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element."@en-US .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#typeT-001&gt; .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/title&gt; .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Format"@en-US .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The file format, physical medium, or dimensions of the resource."@en-US .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."@en-US .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#formatT-001&gt; .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; .
&lt;http://purl.org/dc/terms/format&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/format&gt; .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Identifier"@en-US .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An unambiguous reference to the resource within a given context."@en-US .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-US .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#identifierT-001&gt; .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/identifier&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/identifier&gt; .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Source"@en-US .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource from which the described resource is derived."@en-US .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://purl.org/dc/terms/description&gt; "The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system."@en-US .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#sourceT-001&gt; .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/source&gt; .
&lt;http://purl.org/dc/terms/source&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Language"@en-US .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A language of the resource."@en-US .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646]."@en-US .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#languageT-001&gt; .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/LinguisticSystem&gt; .
&lt;http://purl.org/dc/terms/language&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/language&gt; .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Relation"@en-US .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource."@en-US .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "@en-US .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#relationT-001&gt; .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/relation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Coverage"@en-US .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant."@en-US .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://purl.org/dc/terms/description&gt; "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges."@en-US .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#coverageT-001&gt; .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; .
&lt;http://purl.org/dc/terms/coverage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/coverage&gt; .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Rights"@en-US .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Information about rights held in and over the resource."@en-US .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://purl.org/dc/terms/description&gt; "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights."@en-US .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#rightsT-001&gt; .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/RightsStatement&gt; .
&lt;http://purl.org/dc/terms/rights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/rights&gt; .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Audience"@en-US .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A class of entity for whom the resource is intended or useful."@en-US .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://purl.org/dc/terms/issued&gt; "2001-05-21" .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#audience-003&gt; .
&lt;http://purl.org/dc/terms/audience&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/AgentClass&gt; .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Alternative Title"@en-US .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An alternative name for the resource."@en-US .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://purl.org/dc/terms/description&gt; "The distinction between titles and alternative titles is application-specific."@en-US .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#alternative-003&gt; .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options."@en-US .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/title&gt; .
&lt;http://purl.org/dc/terms/alternative&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/title&gt; .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Table Of Contents"@en-US .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A list of subunits of the resource."@en-US .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#tableOfContents-003&gt; .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/description&gt; .
&lt;http://purl.org/dc/terms/tableOfContents&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/description&gt; .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Abstract"@en-US .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A summary of the resource."@en-US .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#abstract-003&gt; .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/description&gt; .
&lt;http://purl.org/dc/terms/abstract&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/description&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Created"@en-US .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date of creation of the resource."@en-US .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#created-003&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/created&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Valid"@en-US .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date (often a range) of validity of a resource."@en-US .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#valid-003&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/valid&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Available"@en-US .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date (often a range) that the resource became or will become available."@en-US .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#available-003&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/available&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Issued"@en-US .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date of formal issuance (e.g., publication) of the resource."@en-US .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#issued-003&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/issued&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Modified"@en-US .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date on which the resource was changed."@en-US .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#modified-003&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/modified&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Extent"@en-US .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The size or duration of the resource."@en-US .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#extent-003&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/SizeOrDuration&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/format&gt; .
&lt;http://purl.org/dc/terms/extent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/format&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Medium"@en-US .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The material or physical carrier of the resource."@en-US .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#medium-003&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#domain&gt; &lt;http://purl.org/dc/terms/PhysicalResource&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/PhysicalMedium&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/format&gt; .
&lt;http://purl.org/dc/terms/medium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/format&gt; .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Version Of"@en-US .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource of which the described resource is a version, edition, or adaptation."@en-US .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://purl.org/dc/terms/description&gt; "Changes in version imply substantive changes in content rather than differences in format."@en-US .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isVersionOf-003&gt; .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isVersionOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Has Version"@en-US .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is a version, edition, or adaptation of the described resource."@en-US .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#hasVersion-003&gt; .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Replaced By"@en-US .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that supplants, displaces, or supersedes the described resource."@en-US .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isReplacedBy-003&gt; .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isReplacedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Replaces"@en-US .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is supplanted, displaced, or superseded by the described resource."@en-US .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#replaces-003&gt; .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/replaces&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Required By"@en-US .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that requires the described resource to support its function, delivery, or coherence."@en-US .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isRequiredBy-003&gt; .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isRequiredBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Requires"@en-US .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is required by the described resource to support its function, delivery, or coherence."@en-US .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#requires-003&gt; .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/requires&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Part Of"@en-US .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource in which the described resource is physically or logically included."@en-US .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isPartOf-003&gt; .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isPartOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Has Part"@en-US .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is included either physically or logically in the described resource."@en-US .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#hasPart-003&gt; .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/hasPart&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Referenced By"@en-US .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that references, cites, or otherwise points to the described resource."@en-US .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isReferencedBy-003&gt; .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isReferencedBy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "References"@en-US .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is referenced, cited, or otherwise pointed to by the described resource."@en-US .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#references-003&gt; .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/references&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Is Format Of"@en-US .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is substantially the same as the described resource, but in another format."@en-US .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#isFormatOf-003&gt; .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/isFormatOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Has Format"@en-US .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A related resource that is substantially the same as the pre-existing described resource, but in another format."@en-US .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#hasFormat-003&gt; .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-US .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/hasFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Conforms To"@en-US .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An established standard to which the described resource conforms."@en-US .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://purl.org/dc/terms/issued&gt; "2001-05-21" .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#conformsTo-003&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Standard&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/relation&gt; .
&lt;http://purl.org/dc/terms/conformsTo&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/relation&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Spatial Coverage"@en-US .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Spatial characteristics of the resource."@en-US .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#spatial-003&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Location&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/coverage&gt; .
&lt;http://purl.org/dc/terms/spatial&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/coverage&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Temporal Coverage"@en-US .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Temporal characteristics of the resource."@en-US .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#temporal-003&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/PeriodOfTime&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/coverage&gt; .
&lt;http://purl.org/dc/terms/temporal&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/coverage&gt; .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Mediator"@en-US .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An entity that mediates access to the resource and for whom the resource is intended or useful."@en-US .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://purl.org/dc/terms/description&gt; "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver."@en-US .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://purl.org/dc/terms/issued&gt; "2001-05-21" .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#mediator-003&gt; .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/AgentClass&gt; .
&lt;http://purl.org/dc/terms/mediator&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/audience&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Accepted"@en-US .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date of acceptance of the resource."@en-US .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."@en-US .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#dateAccepted-002&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/dateAccepted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Copyrighted"@en-US .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date of copyright."@en-US .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#dateCopyrighted-002&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/dateCopyrighted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Date Submitted"@en-US .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Date of submission of the resource."@en-US .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal)."@en-US .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#dateSubmitted-002&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/date&gt; .
&lt;http://purl.org/dc/terms/dateSubmitted&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/date&gt; .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Audience Education Level"@en-US .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A class of entity, defined in terms of progression through an educational or training context, for which the described resource is intended."@en-US .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#educationLevel-002&gt; .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/AgentClass&gt; .
&lt;http://purl.org/dc/terms/educationLevel&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/audience&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Access Rights"@en-US .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Information about who can access the resource or an indication of its security status."@en-US .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://purl.org/dc/terms/description&gt; "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies."@en-US .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://purl.org/dc/terms/issued&gt; "2003-02-15" .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#accessRights-002&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/RightsStatement&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/rights&gt; .
&lt;http://purl.org/dc/terms/accessRights&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/rights&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Bibliographic Citation"@en-US .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A bibliographic reference for the resource."@en-US .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://purl.org/dc/terms/description&gt; "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible."@en-US .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://purl.org/dc/terms/issued&gt; "2003-02-15" .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#bibliographicCitation-002&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#domain&gt; &lt;http://purl.org/dc/terms/BibliographicResource&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Literal&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/identifier&gt; .
&lt;http://purl.org/dc/terms/bibliographicCitation&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/identifier&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "License"@en-US .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A legal document giving official permission to do something with the resource."@en-US .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://purl.org/dc/terms/issued&gt; "2004-06-14" .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#license-002&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/LicenseDocument&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/elements/1.1/rights&gt; .
&lt;http://purl.org/dc/terms/license&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subPropertyOf&gt; &lt;http://purl.org/dc/terms/rights&gt; .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Rights Holder"@en-US .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A person or organization owning or managing rights over the resource."@en-US .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://purl.org/dc/terms/issued&gt; "2004-06-14" .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#rightsHolder-002&gt; .
&lt;http://purl.org/dc/terms/rightsHolder&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Agent&gt; .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Provenance"@en-US .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation."@en-US .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://purl.org/dc/terms/description&gt; "The statement may include a description of any changes successive custodians made to the resource."@en-US .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://purl.org/dc/terms/issued&gt; "2004-09-20" .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#provenance-002&gt; .
&lt;http://purl.org/dc/terms/provenance&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/ProvenanceStatement&gt; .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Instructional Method"@en-US .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support."@en-US .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://purl.org/dc/terms/description&gt; "Instructional Method will typically include ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback."@en-US .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://purl.org/dc/terms/issued&gt; "2005-06-13" .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#instructionalMethod-002&gt; .
&lt;http://purl.org/dc/terms/instructionalMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/MethodOfInstruction&gt; .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Accrual Method"@en-US .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The method by which items are added to a collection."@en-US .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://purl.org/dc/terms/issued&gt; "2005-06-13" .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#accrualMethod-002&gt; .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#domain&gt; &lt;http://purl.org/dc/terms/Collection&gt; .
&lt;http://purl.org/dc/terms/accrualMethod&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/MethodOfAccrual&gt; .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Accrual Periodicity"@en-US .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The frequency with which items are added to a collection."@en-US .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://purl.org/dc/terms/issued&gt; "2005-06-13" .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#accrualPeriodicity-002&gt; .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/2000/01/rdf-schema#domain&gt; &lt;http://purl.org/dc/terms/Collection&gt; .
&lt;http://purl.org/dc/terms/accrualPeriodicity&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Frequency&gt; .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Accrual Policy"@en-US .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The policy governing the addition of items to a collection."@en-US .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://purl.org/dc/terms/issued&gt; "2005-06-13" .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#accrualPolicy-002&gt; .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#domain&gt; &lt;http://purl.org/dc/terms/Collection&gt; .
&lt;http://purl.org/dc/terms/accrualPolicy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#range&gt; &lt;http://purl.org/dc/terms/Policy&gt; .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Agent"@en-US .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A resource that acts or has the power to act."@en-US .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of Agent include person, organization, and software agent."@en-US .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/terms/AgentClass&gt; .
&lt;http://purl.org/dc/terms/Agent&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Agent-001&gt; .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Agent Class"@en-US .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A group of agents."@en-US .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples of Agent Class include groups seen as classes, such as students, women, charities, lecturers."@en-US .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#AgentClass-001&gt; .
&lt;http://purl.org/dc/terms/AgentClass&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/AgentClass&gt; .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Bibliographic Resource"@en-US .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A book, article, or other documentary resource."@en-US .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/BibliographicResource&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#BibliographicResource-001&gt; .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "File Format"@en-US .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A digital resource format."@en-US .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include the formats defined by the list of Internet Media Types."@en-US .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#FileFormat-001&gt; .
&lt;http://purl.org/dc/terms/FileFormat&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/MediaType&gt; .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Frequency"@en-US .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A rate at which something recurs."@en-US .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Frequency&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Frequency-001&gt; .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Jurisdiction"@en-US .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The extent or range of judicial, law enforcement, or other authority."@en-US .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Jurisdiction-001&gt; .
&lt;http://purl.org/dc/terms/Jurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "License Document"@en-US .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A legal document giving official permission to do something with a Resource."@en-US .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#LicenseDocument-001&gt; .
&lt;http://purl.org/dc/terms/LicenseDocument&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/RightsStatement&gt; .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Linguistic System"@en-US .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A system of signs, symbols, sounds, gestures, or rules used in communication."@en-US .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include written, spoken, sign, and computer languages."@en-US .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/LinguisticSystem&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#LinguisticSystem-001&gt; .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Location"@en-US .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A spatial region or named place."@en-US .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Location-001&gt; .
&lt;http://purl.org/dc/terms/Location&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Location, Period, or Jurisdiction"@en-US .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A location, period of time, or jurisdiction."@en-US .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#LocationPeriodOrJurisdiction-001&gt; .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Media Type"@en-US .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A file format or physical medium."@en-US .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MediaType-001&gt; .
&lt;http://purl.org/dc/terms/MediaType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Media Type or Extent"@en-US .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A media type or extent."@en-US .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MediaTypeOrExtent-001&gt; .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Method of Instruction"@en-US .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A process that is used to engender knowledge, attitudes, and skills."@en-US .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/MethodOfInstruction&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MethodOfInstruction-001&gt; .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Method of Accrual"@en-US .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A method by which resources are added to a collection."@en-US .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/MethodOfAccrual&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MethodOfAccrual-001&gt; .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Period of Time"@en-US .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An interval of time that is named or defined by its start and end dates."@en-US .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#PeriodOfTime-001&gt; .
&lt;http://purl.org/dc/terms/PeriodOfTime&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/LocationPeriodOrJurisdiction&gt; .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Physical Medium"@en-US .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A physical material or carrier."@en-US .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include paper, canvas, or DVD."@en-US .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#PhysicalMedium-001&gt; .
&lt;http://purl.org/dc/terms/PhysicalMedium&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/MediaType&gt; .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Physical Resource"@en-US .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A material thing."@en-US .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/PhysicalResource&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#PhysicalResource-001&gt; .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Policy"@en-US .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters."@en-US .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Policy&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Policy-001&gt; .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Provenance Statement"@en-US .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A statement of any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation."@en-US .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/ProvenanceStatement&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#ProvenanceStatement-001&gt; .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Rights Statement"@en-US .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A statement about the intellectual property rights (IPR) held in or over a Resource, a legal document giving official permission to do something with a resource, or a statement about access rights."@en-US .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/RightsStatement&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#RightsStatement-001&gt; .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Size or Duration"@en-US .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A dimension or extent, or a time taken to play or execute."@en-US .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds."@en-US .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#SizeOrDuration-001&gt; .
&lt;http://purl.org/dc/terms/SizeOrDuration&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/terms/MediaTypeOrExtent&gt; .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Standard"@en-US .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A basis for comparison; a reference point against which other things can be evaluated."@en-US .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/terms/Standard&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Standard-001&gt; .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "ISO 639-2"@en-US .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages."@en-US .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#ISO639-2-003&gt; .
&lt;http://purl.org/dc/terms/ISO639-2&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://lcweb.loc.gov/standards/iso639-2/langhome.html&gt; .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "RFC 1766"@en-US .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of tags, constructed according to RFC 1766, for the identification of languages."@en-US .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#RFC1766-003&gt; .
&lt;http://purl.org/dc/terms/RFC1766&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.ietf.org/rfc/rfc1766.txt&gt; .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "URI"@en-US .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."@en-US .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#URI-003&gt; .
&lt;http://purl.org/dc/terms/URI&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.ietf.org/rfc/rfc3986.txt&gt; .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "DCMI Point"@en-US .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme."@en-US .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Point-003&gt; .
&lt;http://purl.org/dc/terms/Point&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/dcmi-point/&gt; .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "ISO 3166"@en-US .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of codes listed in ISO 3166-1 for the representation of names of countries."@en-US .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#ISO3166-004&gt; .
&lt;http://purl.org/dc/terms/ISO3166&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.iso.org/iso/en/prods-services/iso3166ma/02iso-3166-code-lists/list-en1.html&gt; .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "DCMI Box"@en-US .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme."@en-US .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Box-003&gt; .
&lt;http://purl.org/dc/terms/Box&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/dcmi-box/&gt; .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "DCMI Period"@en-US .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme."@en-US .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Period-003&gt; .
&lt;http://purl.org/dc/terms/Period&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/dcmi-period/&gt; .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "W3C-DTF"@en-US .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of dates and times constructed according to the W3C Date and Time Formats Specification."@en-US .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#W3CDTF-003&gt; .
&lt;http://purl.org/dc/terms/W3CDTF&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.w3.org/TR/NOTE-datetime&gt; .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "RFC 3066"@en-US .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of tags constructed according to RFC 3066 for the identification of languages."@en-US .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://purl.org/dc/terms/description&gt; "RFC 3066 has been obsoleted by RFC 4646."@en-US .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#RFC3066-002&gt; .
&lt;http://purl.org/dc/terms/RFC3066&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.ietf.org/rfc/rfc3066.txt&gt; .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "RFC 4646"@en-US .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of tags constructed according to RFC 4646 for the identification of languages."@en-US .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://purl.org/dc/terms/description&gt; "RFC 4646 obsoletes RFC 3066."@en-US .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#RFC4646-001&gt; .
&lt;http://purl.org/dc/terms/RFC4646&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.ietf.org/rfc/rfc4646.txt&gt; .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "ISO 639-3"@en-US .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages."@en-US .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Datatype&gt; .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#ISO639-3-001&gt; .
&lt;http://purl.org/dc/terms/ISO639-3&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.sil.org/iso639-3/&gt; .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "LCSH"@en-US .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of labeled concepts specified by the Library of Congress Subject Headings."@en-US .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/LCSH&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#LCSH-003&gt; .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "MeSH"@en-US .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of labeled concepts specified by the Medical Subject Headings."@en-US .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MESH-003&gt; .
&lt;http://purl.org/dc/terms/MESH&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.nlm.nih.gov/mesh/meshhome.html&gt; .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "DDC"@en-US .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of conceptual resources specified by the Dewey Decimal Classification."@en-US .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#DDC-003&gt; .
&lt;http://purl.org/dc/terms/DDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.oclc.org/dewey/&gt; .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "LCC"@en-US .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of conceptual resources specified by the Library of Congress Classification."@en-US .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#LCC-003&gt; .
&lt;http://purl.org/dc/terms/LCC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html&gt; .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "UDC"@en-US .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of conceptual resources specified by the Universal Decimal Classification."@en-US .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#UDC-003&gt; .
&lt;http://purl.org/dc/terms/UDC&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.udcc.org/&gt; .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "DCMI Type Vocabulary"@en-US .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource."@en-US .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#DCMIType-003&gt; .
&lt;http://purl.org/dc/terms/DCMIType&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/dcmi-type-vocabulary/&gt; .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "IMT"@en-US .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of media types specified by the Internet Assigned Numbers Authority."@en-US .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#IMT-004&gt; .
&lt;http://purl.org/dc/terms/IMT&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.iana.org/assignments/media-types/&gt; .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "TGN"@en-US .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of places specified by the Getty Thesaurus of Geographic Names."@en-US .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#TGN-003&gt; .
&lt;http://purl.org/dc/terms/TGN&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://www.getty.edu/research/tools/vocabulary/tgn/index.html&gt; .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "NLM"@en-US .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "The set of conceptual resources specified by the National Library of Medicine Classification."@en-US .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://purl.org/dc/terms/issued&gt; "2005-06-13" .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#NLM-002&gt; .
&lt;http://purl.org/dc/terms/NLM&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://wwwcf.nlm.nih.gov/class/&gt; .

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
11 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/"&gt;
12 &lt;dcterms:title xml:lang="en-US"&gt;DCMI Namespace for metadata terms in the http://purl.org/dc/terms/ namespace&lt;/dcterms:title&gt;
13 &lt;dcterms:publisher xml:lang="en-US"&gt;The Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
14 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
15 &lt;/rdf:Description&gt;
16 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/title"&gt;
17 &lt;rdfs:label xml:lang="en-US"&gt;Title&lt;/rdfs:label&gt;
18 &lt;dcterms:description xml:lang="en-US"&gt;A name given to the resource.&lt;/dcterms:description&gt;
19 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
20 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
21 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
22 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
23 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#titleT-001"/&gt;
24 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
25 &lt;rdfs:comment xml:lang="en-US"&gt;In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options.&lt;/rdfs:comment&gt;
26 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/title"/&gt;
27 &lt;/rdf:Description&gt;
28 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/creator"&gt;
29 &lt;rdfs:label xml:lang="en-US"&gt;Creator&lt;/rdfs:label&gt;
30 &lt;rdfs:comment xml:lang="en-US"&gt;An entity primarily responsible for making the resource.&lt;/rdfs:comment&gt;
31 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity.&lt;/dcterms:description&gt;
32 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
33 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
34 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
35 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
36 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#creatorT-001"/&gt;
37 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/Agent"/&gt;
38 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/creator"/&gt;
39 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/contributor"/&gt;
40 &lt;/rdf:Description&gt;
41 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/subject"&gt;
42 &lt;rdfs:label xml:lang="en-US"&gt;Subject&lt;/rdfs:label&gt;
43 &lt;rdfs:comment xml:lang="en-US"&gt;The topic of the resource.&lt;/rdfs:comment&gt;
44 &lt;dcterms:description xml:lang="en-US"&gt;Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element.&lt;/dcterms:description&gt;
45 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
46 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
47 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
48 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
49 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#subjectT-001"/&gt;
50 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
51 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/subject"/&gt;
52 &lt;/rdf:Description&gt;
53 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/description"&gt;
54 &lt;rdfs:label xml:lang="en-US"&gt;Description&lt;/rdfs:label&gt;
55 &lt;rdfs:comment xml:lang="en-US"&gt;An account of the resource.&lt;/rdfs:comment&gt;
56 &lt;dcterms:description xml:lang="en-US"&gt;Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.&lt;/dcterms:description&gt;
57 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
58 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
59 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
60 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
61 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#descriptionT-001"/&gt;
62 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/description"/&gt;
63 &lt;/rdf:Description&gt;
64 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/publisher"&gt;
65 &lt;rdfs:label xml:lang="en-US"&gt;Publisher&lt;/rdfs:label&gt;
66 &lt;rdfs:comment xml:lang="en-US"&gt;An entity responsible for making the resource available.&lt;/rdfs:comment&gt;
67 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity.&lt;/dcterms:description&gt;
68 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
69 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
70 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
71 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
72 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#publisherT-001"/&gt;
73 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/Agent"/&gt;
74 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/publisher"/&gt;
75 &lt;/rdf:Description&gt;
76 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/contributor"&gt;
77 &lt;rdfs:label xml:lang="en-US"&gt;Contributor&lt;/rdfs:label&gt;
78 &lt;rdfs:comment xml:lang="en-US"&gt;An entity responsible for making contributions to the resource.&lt;/rdfs:comment&gt;
79 &lt;dcterms:description xml:lang="en-US"&gt;Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity.&lt;/dcterms:description&gt;
80 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
81 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
82 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
83 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
84 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#contributorT-001"/&gt;
85 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/Agent"/&gt;
86 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/contributor"/&gt;
87 &lt;/rdf:Description&gt;
88 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/date"&gt;
89 &lt;rdfs:label xml:lang="en-US"&gt;Date&lt;/rdfs:label&gt;
90 &lt;rdfs:comment xml:lang="en-US"&gt;A point or period of time associated with an event in the lifecycle of the resource.&lt;/rdfs:comment&gt;
91 &lt;dcterms:description xml:lang="en-US"&gt;Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].&lt;/dcterms:description&gt;
92 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
93 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
94 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
95 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
96 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#dateT-001"/&gt;
97 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
98 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
99 &lt;/rdf:Description&gt;
100 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/type"&gt;
101 &lt;rdfs:label xml:lang="en-US"&gt;Type&lt;/rdfs:label&gt;
102 &lt;rdfs:comment xml:lang="en-US"&gt;The nature or genre of the resource.&lt;/rdfs:comment&gt;
103 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element.&lt;/dcterms:description&gt;
104 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
105 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
106 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
107 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
108 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#typeT-001"/&gt;
109 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
110 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/title"/&gt;
111 &lt;/rdf:Description&gt;
112 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/format"&gt;
113 &lt;rdfs:label xml:lang="en-US"&gt;Format&lt;/rdfs:label&gt;
114 &lt;rdfs:comment xml:lang="en-US"&gt;The file format, physical medium, or dimensions of the resource.&lt;/rdfs:comment&gt;
115 &lt;dcterms:description xml:lang="en-US"&gt;Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].&lt;/dcterms:description&gt;
116 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
117 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
118 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
119 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
120 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#formatT-001"/&gt;
121 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/MediaTypeOrExtent"/&gt;
122 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/format"/&gt;
123 &lt;/rdf:Description&gt;
124 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/identifier"&gt;
125 &lt;rdfs:label xml:lang="en-US"&gt;Identifier&lt;/rdfs:label&gt;
126 &lt;rdfs:comment xml:lang="en-US"&gt;An unambiguous reference to the resource within a given context.&lt;/rdfs:comment&gt;
127 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. &lt;/dcterms:description&gt;
128 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
129 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
130 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
131 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
132 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#identifierT-001"/&gt;
133 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
134 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/identifier"/&gt;
135 &lt;/rdf:Description&gt;
136 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/source"&gt;
137 &lt;rdfs:label xml:lang="en-US"&gt;Source&lt;/rdfs:label&gt;
138 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource from which the described resource is derived.&lt;/rdfs:comment&gt;
139 &lt;dcterms:description xml:lang="en-US"&gt;The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.&lt;/dcterms:description&gt;
140 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
141 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
142 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
143 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
144 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#sourceT-001"/&gt;
145 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
146 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/source"/&gt;
147 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
148 &lt;/rdf:Description&gt;
149 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/language"&gt;
150 &lt;rdfs:label xml:lang="en-US"&gt;Language&lt;/rdfs:label&gt;
151 &lt;rdfs:comment xml:lang="en-US"&gt;A language of the resource.&lt;/rdfs:comment&gt;
152 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646].&lt;/dcterms:description&gt;
153 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
154 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
155 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
156 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
157 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#languageT-001"/&gt;
158 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/LinguisticSystem"/&gt;
159 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/language"/&gt;
160 &lt;/rdf:Description&gt;
161 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/relation"&gt;
162 &lt;rdfs:label xml:lang="en-US"&gt;Relation&lt;/rdfs:label&gt;
163 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource.&lt;/rdfs:comment&gt;
164 &lt;dcterms:description xml:lang="en-US"&gt;Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. &lt;/dcterms:description&gt;
165 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
166 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
167 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
168 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
169 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#relationT-001"/&gt;
170 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
171 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
172 &lt;/rdf:Description&gt;
173 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/coverage"&gt;
174 &lt;rdfs:label xml:lang="en-US"&gt;Coverage&lt;/rdfs:label&gt;
175 &lt;rdfs:comment xml:lang="en-US"&gt;The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant.&lt;/rdfs:comment&gt;
176 &lt;dcterms:description xml:lang="en-US"&gt;Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges.&lt;/dcterms:description&gt;
177 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
178 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
179 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
180 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
181 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#coverageT-001"/&gt;
182 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/LocationPeriodOrJurisdiction"/&gt;
183 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/coverage"/&gt;
184 &lt;/rdf:Description&gt;
185 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/rights"&gt;
186 &lt;rdfs:label xml:lang="en-US"&gt;Rights&lt;/rdfs:label&gt;
187 &lt;rdfs:comment xml:lang="en-US"&gt;Information about rights held in and over the resource.&lt;/rdfs:comment&gt;
188 &lt;dcterms:description xml:lang="en-US"&gt;Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.&lt;/dcterms:description&gt;
189 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
190 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
191 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
192 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
193 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#rightsT-001"/&gt;
194 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/RightsStatement"/&gt;
195 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/rights"/&gt;
196 &lt;/rdf:Description&gt;
197 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/audience"&gt;
198 &lt;rdfs:label xml:lang="en-US"&gt;Audience&lt;/rdfs:label&gt;
199 &lt;rdfs:comment xml:lang="en-US"&gt;A class of entity for whom the resource is intended or useful.&lt;/rdfs:comment&gt;
200 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
201 &lt;dcterms:issued&gt;2001-05-21&lt;/dcterms:issued&gt;
202 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
203 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
204 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#audience-003"/&gt;
205 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/AgentClass"/&gt;
206 &lt;/rdf:Description&gt;
207 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/alternative"&gt;
208 &lt;rdfs:label xml:lang="en-US"&gt;Alternative Title&lt;/rdfs:label&gt;
209 &lt;rdfs:comment xml:lang="en-US"&gt;An alternative name for the resource.&lt;/rdfs:comment&gt;
210 &lt;dcterms:description xml:lang="en-US"&gt;The distinction between titles and alternative titles is application-specific.&lt;/dcterms:description&gt;
211 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
212 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
213 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
214 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
215 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#alternative-003"/&gt;
216 &lt;rdfs:comment xml:lang="en-US"&gt;In current practice, this term is used primarily with literal values; however, there are important uses with non-literal values as well. As of December 2007, the DCMI Usage Board is leaving this range unspecified pending an investigation of options.&lt;/rdfs:comment&gt;
217 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/title"/&gt;
218 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/title"/&gt;
219 &lt;/rdf:Description&gt;
220 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/tableOfContents"&gt;
221 &lt;rdfs:label xml:lang="en-US"&gt;Table Of Contents&lt;/rdfs:label&gt;
222 &lt;rdfs:comment xml:lang="en-US"&gt;A list of subunits of the resource.&lt;/rdfs:comment&gt;
223 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
224 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
225 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
226 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
227 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#tableOfContents-003"/&gt;
228 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/description"/&gt;
229 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/description"/&gt;
230 &lt;/rdf:Description&gt;
231 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/abstract"&gt;
232 &lt;rdfs:label xml:lang="en-US"&gt;Abstract&lt;/rdfs:label&gt;
233 &lt;rdfs:comment xml:lang="en-US"&gt;A summary of the resource.&lt;/rdfs:comment&gt;
234 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
235 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
236 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
237 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
238 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#abstract-003"/&gt;
239 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/description"/&gt;
240 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/description"/&gt;
241 &lt;/rdf:Description&gt;
242 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/created"&gt;
243 &lt;rdfs:label xml:lang="en-US"&gt;Date Created&lt;/rdfs:label&gt;
244 &lt;rdfs:comment xml:lang="en-US"&gt;Date of creation of the resource.&lt;/rdfs:comment&gt;
245 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
246 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
247 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
248 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
249 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#created-003"/&gt;
250 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
251 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
252 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/date"/&gt;
253 &lt;/rdf:Description&gt;
254 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/valid"&gt;
255 &lt;rdfs:label xml:lang="en-US"&gt;Date Valid&lt;/rdfs:label&gt;
256 &lt;rdfs:comment xml:lang="en-US"&gt;Date (often a range) of validity of a resource.&lt;/rdfs:comment&gt;
257 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
258 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
259 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
260 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
261 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#valid-003"/&gt;
262 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
263 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
264 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/date"/&gt;
265 &lt;/rdf:Description&gt;
266 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/available"&gt;
267 &lt;rdfs:label xml:lang="en-US"&gt;Date Available&lt;/rdfs:label&gt;
268 &lt;rdfs:comment xml:lang="en-US"&gt;Date (often a range) that the resource became or will become available.&lt;/rdfs:comment&gt;
269 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
270 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
271 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
272 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
273 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#available-003"/&gt;
274 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
275 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
276 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/date"/&gt;
277 &lt;/rdf:Description&gt;
278 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/issued"&gt;
279 &lt;rdfs:label xml:lang="en-US"&gt;Date Issued&lt;/rdfs:label&gt;
280 &lt;rdfs:comment xml:lang="en-US"&gt;Date of formal issuance (e.g., publication) of the resource.&lt;/rdfs:comment&gt;
281 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
282 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
283 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
284 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
285 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#issued-003"/&gt;
286 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
287 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
288 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/date"/&gt;
289 &lt;/rdf:Description&gt;
290 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/modified"&gt;
291 &lt;rdfs:label xml:lang="en-US"&gt;Date Modified&lt;/rdfs:label&gt;
292 &lt;rdfs:comment xml:lang="en-US"&gt;Date on which the resource was changed.&lt;/rdfs:comment&gt;
293 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
294 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
295 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
296 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
297 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#modified-003"/&gt;
298 &lt;rdfs:range rdf:resource="http://www.w3.org/2000/01/rdf-schema#Literal"/&gt;
299 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/date"/&gt;
300 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/date"/&gt;
301 &lt;/rdf:Description&gt;
302 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/extent"&gt;
303 &lt;rdfs:label xml:lang="en-US"&gt;Extent&lt;/rdfs:label&gt;
304 &lt;rdfs:comment xml:lang="en-US"&gt;The size or duration of the resource.&lt;/rdfs:comment&gt;
305 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
306 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
307 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
308 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
309 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#extent-003"/&gt;
310 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/SizeOrDuration"/&gt;
311 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/format"/&gt;
312 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/format"/&gt;
313 &lt;/rdf:Description&gt;
314 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/medium"&gt;
315 &lt;rdfs:label xml:lang="en-US"&gt;Medium&lt;/rdfs:label&gt;
316 &lt;rdfs:comment xml:lang="en-US"&gt;The material or physical carrier of the resource.&lt;/rdfs:comment&gt;
317 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
318 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
319 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
320 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
321 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#medium-003"/&gt;
322 &lt;rdfs:domain rdf:resource="http://purl.org/dc/terms/PhysicalResource"/&gt;
323 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/PhysicalMedium"/&gt;
324 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/format"/&gt;
325 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/format"/&gt;
326 &lt;/rdf:Description&gt;
327 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isVersionOf"&gt;
328 &lt;rdfs:label xml:lang="en-US"&gt;Is Version Of&lt;/rdfs:label&gt;
329 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource of which the described resource is a version, edition, or adaptation.&lt;/rdfs:comment&gt;
330 &lt;dcterms:description xml:lang="en-US"&gt;Changes in version imply substantive changes in content rather than differences in format.&lt;/dcterms:description&gt;
331 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
332 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
333 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
334 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
335 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isVersionOf-003"/&gt;
336 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
337 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
338 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
339 &lt;/rdf:Description&gt;
340 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/hasVersion"&gt;
341 &lt;rdfs:label xml:lang="en-US"&gt;Has Version&lt;/rdfs:label&gt;
342 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is a version, edition, or adaptation of the described resource.&lt;/rdfs:comment&gt;
343 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
344 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
345 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
346 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
347 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#hasVersion-003"/&gt;
348 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
349 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
350 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
351 &lt;/rdf:Description&gt;
352 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isReplacedBy"&gt;
353 &lt;rdfs:label xml:lang="en-US"&gt;Is Replaced By&lt;/rdfs:label&gt;
354 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that supplants, displaces, or supersedes the described resource.&lt;/rdfs:comment&gt;
355 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
356 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
357 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
358 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
359 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isReplacedBy-003"/&gt;
360 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
361 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
362 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
363 &lt;/rdf:Description&gt;
364 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/replaces"&gt;
365 &lt;rdfs:label xml:lang="en-US"&gt;Replaces&lt;/rdfs:label&gt;
366 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is supplanted, displaced, or superseded by the described resource.&lt;/rdfs:comment&gt;
367 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
368 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
369 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
370 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
371 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#replaces-003"/&gt;
372 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
373 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
374 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
375 &lt;/rdf:Description&gt;
376 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isRequiredBy"&gt;
377 &lt;rdfs:label xml:lang="en-US"&gt;Is Required By&lt;/rdfs:label&gt;
378 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that requires the described resource to support its function, delivery, or coherence.&lt;/rdfs:comment&gt;
379 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
380 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
381 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
382 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
383 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isRequiredBy-003"/&gt;
384 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
385 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
386 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
387 &lt;/rdf:Description&gt;
388 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/requires"&gt;
389 &lt;rdfs:label xml:lang="en-US"&gt;Requires&lt;/rdfs:label&gt;
390 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is required by the described resource to support its function, delivery, or coherence.&lt;/rdfs:comment&gt;
391 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
392 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
393 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
394 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
395 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#requires-003"/&gt;
396 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
397 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
398 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
399 &lt;/rdf:Description&gt;
400 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isPartOf"&gt;
401 &lt;rdfs:label xml:lang="en-US"&gt;Is Part Of&lt;/rdfs:label&gt;
402 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource in which the described resource is physically or logically included.&lt;/rdfs:comment&gt;
403 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
404 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
405 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
406 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
407 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isPartOf-003"/&gt;
408 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
409 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
410 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
411 &lt;/rdf:Description&gt;
412 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/hasPart"&gt;
413 &lt;rdfs:label xml:lang="en-US"&gt;Has Part&lt;/rdfs:label&gt;
414 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is included either physically or logically in the described resource.&lt;/rdfs:comment&gt;
415 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
416 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
417 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
418 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
419 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#hasPart-003"/&gt;
420 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
421 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
422 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
423 &lt;/rdf:Description&gt;
424 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isReferencedBy"&gt;
425 &lt;rdfs:label xml:lang="en-US"&gt;Is Referenced By&lt;/rdfs:label&gt;
426 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that references, cites, or otherwise points to the described resource.&lt;/rdfs:comment&gt;
427 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
428 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
429 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
430 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
431 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isReferencedBy-003"/&gt;
432 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
433 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
434 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
435 &lt;/rdf:Description&gt;
436 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/references"&gt;
437 &lt;rdfs:label xml:lang="en-US"&gt;References&lt;/rdfs:label&gt;
438 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is referenced, cited, or otherwise pointed to by the described resource.&lt;/rdfs:comment&gt;
439 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
440 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
441 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
442 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
443 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#references-003"/&gt;
444 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
445 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
446 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
447 &lt;/rdf:Description&gt;
448 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/isFormatOf"&gt;
449 &lt;rdfs:label xml:lang="en-US"&gt;Is Format Of&lt;/rdfs:label&gt;
450 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is substantially the same as the described resource, but in another format.&lt;/rdfs:comment&gt;
451 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
452 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
453 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
454 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
455 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#isFormatOf-003"/&gt;
456 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
457 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
458 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
459 &lt;/rdf:Description&gt;
460 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/hasFormat"&gt;
461 &lt;rdfs:label xml:lang="en-US"&gt;Has Format&lt;/rdfs:label&gt;
462 &lt;rdfs:comment xml:lang="en-US"&gt;A related resource that is substantially the same as the pre-existing described resource, but in another format.&lt;/rdfs:comment&gt;
463 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
464 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
465 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
466 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
467 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#hasFormat-003"/&gt;
468 &lt;rdfs:comment xml:lang="en-US"&gt;This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (http://dublincore.org/documents/abstract-model/). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration.&lt;/rdfs:comment&gt;
469 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
470 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
471 &lt;/rdf:Description&gt;
472 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/conformsTo"&gt;
473 &lt;rdfs:label xml:lang="en-US"&gt;Conforms To&lt;/rdfs:label&gt;
474 &lt;rdfs:comment xml:lang="en-US"&gt;An established standard to which the described resource conforms.&lt;/rdfs:comment&gt;
475 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
476 &lt;dcterms:issued&gt;2001-05-21&lt;/dcterms:issued&gt;
477 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
478 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
479 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#conformsTo-003"/&gt;
480 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/Standard"/&gt;
481 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/relation"/&gt;
482 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/relation"/&gt;
483 &lt;/rdf:Description&gt;
484 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/spatial"&gt;
485 &lt;rdfs:label xml:lang="en-US"&gt;Spatial Coverage&lt;/rdfs:label&gt;
486 &lt;rdfs:comment xml:lang="en-US"&gt;Spatial characteristics of the resource.&lt;/rdfs:comment&gt;
487 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/&gt;
488 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
489 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
490 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
491 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#spatial-003"/&gt;
492 &lt;rdfs:range rdf:resource="http://purl.org/dc/terms/Location"/&gt;
493 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/elements/1.1/coverage"/&gt;
494 &lt;rdfs:subPropertyOf rdf:resource="http://purl.org/dc/terms/coverage"/&gt;
495 &lt;/rdf:Description&gt;
496 &lt;rdf:Description rdf:about="http://purl.org/dc/terms/temporal"&gt;
497 &lt;rdfs:label xml:lang="en-US"&gt;Temporal Coverage&lt;/rdfs:label&gt;
498 &lt;rdfs:comment xml:lang="en-US"&gt;Temporal characteristics of the resource.&lt;/rdfs:comment&gt;
499 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/terms/"/</pre>

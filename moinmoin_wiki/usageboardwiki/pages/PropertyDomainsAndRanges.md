---
title: "- PropertyDomainsAndRanges"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/PropertyDomainsAndRanges.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [PropertyDomainsAndRanges](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=fullsearch&value=PropertyDomainsAndRanges&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges "View")
- [Diffs](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/PropertyDomainsAndRanges">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="PropertyDomainsAndRanges_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="PropertyDomainsAndRanges_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DC property domains and ranges

This document is part of the [<img src="PropertyDomainsAndRanges_files/moin-inter.png" alt="[Self]" height="16" width="16">Usage Board Wiki](http://dublincore.org/usageboardwiki/ "Self"). It is currently under development. Comments should be sent to the [<img src="PropertyDomainsAndRanges_files/moin-www.png" alt="[WWW]" height="11" width="11">dc-architecture@jiscmail.ac.uk](http://www.jiscmail.ac.uk/lists/DC-ARCHITECTURE.html) mailing list.

### Introduction

This document indicates the _domains_ and _ranges_ that apply to all DCMI _properties_. The relationships between _domains_, _ranges_ and _properties_ are as follows:

- Each _property_ may be related to one or more _classes_ by a domain relationship. Where it is stated that a _property_ has such a relationship with a _class_ and a _described resource_ is related to a _value_ by that _property_, it follows that the _described resource_ is an instance of that _class_.

- Each _property_ may be related to one or more _classes_ by a range relationship. Where it is stated that a _property_ has such a relationship with a _class_ and a _described resource_ is related to a _value_ by that _property_, it follows that the _value_ is an instance of that _class_.

In practice, this means that the _domain_ indicates the _class_ of _resources_ that the _property_ should be used to describe, while the _range_ indicates the _class_ of _resources_ that should be used as _values_ for that _property_.

### Classes

This section lists the _classes_ that are needed in order to assign _domains_ and _ranges_ to the existing DCMI _properties_.

<dl>

    <dt> AccrualMethod</dt>
<dd>
<p>
A method by which <strong>Resources</strong> are added to a <strong>Collection</strong>. 
</p>
</dd>
    <dt> Agent</dt>
<dd>
<p>
A <strong>Resource</strong> that acts or has the power to act (e.g. a person, organization or software agent). 
</p>
</dd>
    <dt> AgentClass</dt>
<dd>
<p>
A class of <strong>Agents</strong> (e.g. students, women, charities, lecturers). 
</p>
</dd>
    <dt> BibliographicResource</dt>
<dd>
<p>
A book, article or other published <strong>Resource</strong>. 
</p>
</dd>
    <dt> BibliographicReference</dt>
<dd>
<p>
Information which identifies a <strong>BibliographicResource</strong>. 
</p>
</dd>
    <dt> Class</dt>
<dd>
<p>
A group containing members that have attributes, behaviours, relationships or semantics in common; a kind of category. 
</p>
</dd>
    <dt> Collection</dt>
<dd>
<p>
An aggregation of <strong>Resources</strong>. (Note: this is the same as the DCMIType definition.) 
</p>
</dd>
    <dt> DigitalResource</dt>
<dd>
<p>
Something that is stored or transmitted as a sequence of discrete 
symbols from a finite set, usually binary data, represented using 
electronic or electromagnetic signals. 
</p>
</dd>
    <dt> Duration</dt>
<dd>
<p>
The time taken to view, play, execute, or interact with a <strong>DigitalResource</strong> or <strong>PhysicalResource</strong> (e.g. in hours/minutes/seconds). 
</p>
</dd>
    <dt> Extent</dt>
<dd>
<p>
A <strong>Size</strong> or <strong>Duration</strong>. 
</p>
</dd>
    <dt> FileFormat</dt>
<dd>
<p>
A <strong>DigitalResource</strong> format (e.g. as defined by the list of Internet Media Types). 
</p>
</dd>
    <dt> Frequency</dt>
<dd>
<p>
A rate at which something recurs. 
</p>
</dd>
    <dt> InstructionalMethod</dt>
<dd>
<p>
A process that is used to engender knowledge, attitudes and skills. 
</p>
</dd>
    <dt> Jurisdiction</dt>
<dd>
<p>
The extent or range of judicial, law enforcement, or other authority. 
</p>
</dd>
    <dt> Language</dt>
<dd>
<p>
A human language. 
</p>
</dd>
    <dt> License</dt>
<dd>
<p>
A legal document giving official permission to do something with a <strong>Resource</strong>. 
</p>
</dd>
    <dt> Location</dt>
<dd>
<p>
A place or geographical region. 
</p>
</dd>
    <dt> LocationPeriodOrJurisdiction</dt>
<dd>
<p>
A <strong>Location</strong>, <strong>Period</strong> or <strong>Jurisdiction</strong>. 
</p>
</dd>
    <dt> MediaType</dt>
<dd>
<p>
A <strong>FileFormat</strong> or <strong>PhysicalMedium</strong>. 
</p>
</dd>
    <dt> MediaTypeOrDimensions</dt>
<dd>
<p>
A <strong>MediaType</strong> or <strong>Dimensions</strong>. 
</p>
</dd>
    <dt> Period</dt>
<dd>
<p>
A date or date range. 
</p>
</dd>
    <dt> PhysicalMedium</dt>
<dd>
<p>
A material or physical carrier of a <strong>PhysicalResource</strong> (e.g. paper, canvas, etc.). 
</p>
</dd>
    <dt> PhysicalResource</dt>
<dd>
<p>
A material thing. 
</p>
</dd>
    <dt> Policy</dt>
<dd>
<p>
A plan or course of action, as of a government, political party, or 
business, intended to influence and determine decisions, actions, and 
other matters. 
</p>
</dd>
    <dt> ProvenanceStatement</dt>
<dd>
<p>
A statement of any changes in ownership and custody of a <strong>Resource</strong> since its creation that are significant for its authenticity, integrity and interpretation. 
</p>
</dd>
    <dt> Reference</dt>
<dd>
<p>
A <strong>Resource</strong> identifier that is unambiguous in a given context (e.g. a URI). 
</p>
</dd>
    <dt> Resource</dt>
<dd>
<p>
Anything. 
</p>
</dd>
    <dt> RightsStatement</dt>
<dd>
<p>
A statement about the intellectual property rights (IPR) held in or over a <strong>Resource</strong>, or a statement about access rights. 
</p>
</dd>
    <dt> Size</dt>
<dd>
<p>
The dimensions of a <strong>DigitalResource</strong> or <strong>PhysicalResource</strong> (e.g. length/width/breadth, number of pages, etc.). 
</p>
</dd>
    <dt> Standard</dt>
<dd>
<p>
A basis for comparison; a reference point against which things can be evaluated. 
</p>
</dd>

    </dl>

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="PropertyDomainsAndRanges_files/PropertyDomainsAndRanges_002.jpg" alt="class-hierarchy-new-3.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 1 - class diagram</strong>
      </td>
    </tr>
  </tbody>
</table>


The relationships between the classes associated with the DC Format property are particularly complex and are shown in more detail below.

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="PropertyDomainsAndRanges_files/PropertyDomainsAndRanges.jpg" alt="class-hierarchy-format-new.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 2 - classes related to DC Format</strong>
      </td>
    </tr>
  </tbody>
</table>


### Domains and ranges of DC properties

#### The Dublin Core Metadata Element Set

##### contributor
URI: [http://purl.org/dc/elements/1.1/contributor](http://purl.org/dc/elements/1.1/contributor) 

Definition: An entity responsible for making contributions to the resource.

Comment: Examples of a Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity.

Domain: **Resource**

Range: **Agent**

##### coverage
URI: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage) 

Definition: The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant.

Comment: Spatial topic may be a named place or a location specified by its geographic coordinates. Temporal period may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges.

References: [TGN] [http://www.getty.edu/research/tools/vocabulary/tgn/index.html](http://www.getty.edu/research/tools/vocabulary/tgn/index.html)

Domain: **Resource**

Range: **LocationPeriodOrJurisdiction**

##### creator
URI: [http://purl.org/dc/elements/1.1/creator](http://purl.org/dc/elements/1.1/creator) 

Definition: An entity primarily responsible for making the resource.

Comment: Examples of a Creator include a person, an organization, or a service. Typically, the name of a Creator should be used to indicate the entity.

Domain: **Resource**

Range: **Agent**

##### date
URI: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date) 

Definition: A point or period of time associated with an event in the lifecycle of the resource.

Comment: Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].

References: [W3CDTF] [http://www.w3.org/TR/NOTE-datetime](http://www.w3.org/TR/NOTE-datetime)

Domain: **Resource**

Range: **Period**

##### description
URI: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description) 

Definition: An account of the resource.

Comment: Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.

Domain: **Resource**

Range: **Resource**

##### format
URI: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format) 

Definition: The file format, physical medium, or dimensions of the resource.

Comment: Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].

References: [MIME] [http://www.iana.org/assignments/media-types/](http://www.iana.org/assignments/media-types/)

Domain: **Resource**

Range: **MediaTypeOrExtent**

##### identifier
URI: [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier) 

Definition: An unambiguous reference to the resource within a given context.

Comment: Recommended best practice is to identify the resource by means of a string conforming to a formal identification system.

Domain: **Resource**

Range: **Reference**

##### language
URI: [http://purl.org/dc/elements/1.1/language](http://purl.org/dc/elements/1.1/language) 

Definition: A language of the resource.

Comment: Recommended best practice is to use a controlled vocabulary such as RFC 3066 [RFC3066].

References: [RFC3066] [http://www.ietf.org/rfc/rfc3066.txt](http://www.ietf.org/rfc/rfc3066.txt)

References: [ISO639] [http://www.loc.gov/standards/iso639-2/](http://www.loc.gov/standards/iso639-2/)

Domain: **Resource**

Range: **Language**

##### publisher
URI: [http://purl.org/dc/elements/1.1/publisher](http://purl.org/dc/elements/1.1/publisher) 

Definition: An entity responsible for making the resource available.

Comment: Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity.

Domain: **Resource**

Range: **Agent**

##### relation
URI: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation) 

Definition: A related resource.

Comment: Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.

Domain: **Resource**

Range: **Resource**

##### rights
URI: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights) 

Definition: Information about rights held in and over the resource.

Comment: Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.

Domain: **Resource**

Range: **RightsStatement**

##### source
URI: [http://purl.org/dc/elements/1.1/source](http://purl.org/dc/elements/1.1/source) 

Definition: The resource from which the described resource is derived.

Comment: The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.

Domain: **Resource**

Range: **Resource**

##### subject
URI: [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject) 

Definition: The topic of the resource.

Comment: Typically, the topic will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element.

Domain: **Resource**

Range: **Resource**

##### title
URI: [http://purl.org/dc/elements/1.1/title](http://purl.org/dc/elements/1.1/title) 

Definition: A name given to the resource.

Comment: Typically, a Title will be a name by which the resource is formally known.

Domain: **Resource**

Range: **Resource**

##### type
URI: [http://purl.org/dc/elements/1.1/type](http://purl.org/dc/elements/1.1/type) 

Definition: The nature or genre of the resource.

Comment: Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element.

References: [DCMITYPE] [http://dublincore.org/documents/dcmi-type-vocabulary/](http://dublincore.org/documents/dcmi-type-vocabulary/)

Domain: **Resource**

Range: **Class**

#### Other Elements and Element Refinements

##### abstract
URI: [http://purl.org/dc/terms/abstract](http://purl.org/dc/terms/abstract) 

Definition: A summary of the content of the resource.

Refines: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

Domain: **Resource**

Range: **Resource**

##### accessRights
URI: [http://purl.org/dc/terms/accessRights](http://purl.org/dc/terms/accessRights) 

Definition: Information about who can access the resource or an indication of its security status.

Comment: Access Rights may include information regarding access or restrictions based on privacy, security or other regulations.

Refines: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

Domain: **Resource**

Range: **RightsStatement**

##### accrualMethod
URI: [http://purl.org/dc/terms/accrualMethod](http://purl.org/dc/terms/accrualMethod) 

Definition: The method by which items are added to a collection.

Comment: Recommended best practice is to use a value from a controlled vocabulary.

Domain: **Collection**

Range: **AccrualMethod**

##### accrualPeriodicity
URI: [http://purl.org/dc/terms/accrualPeriodicity](http://purl.org/dc/terms/accrualPeriodicity) 

Definition: The frequency with which items are added to a collection.

Comment: Recommended best practice is to use a value from a controlled vocabulary.

Domain: **Collection**

Range: **Frequency**

##### accrualPolicy
URI: [http://purl.org/dc/terms/accrualPolicy](http://purl.org/dc/terms/accrualPolicy) 

Definition: The policy governing the addition of items to a collection.

Comment: Recommended best practice is to use a value from a controlled vocabulary.

Domain: **Collection**

Range: **Policy**

##### alternative
URI: [http://purl.org/dc/terms/alternative](http://purl.org/dc/terms/alternative) 

Definition: Any form of the title used as a substitute or alternative to the formal title of the resource.

Comment: This qualifier can include Title abbreviations as well as translations.

Refines: [http://purl.org/dc/elements/1.1/title](http://purl.org/dc/elements/1.1/title)

Domain: **Resource**

Range: **Resource**

##### audience
URI: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience) 

Definition: A class of entity for whom the resource is intended or useful.

Comment: A class of entity may be determined by the creator or the publisher or by a third party.

Domain: **Resource**

Range: **AgentClass**

##### available
URI: [http://purl.org/dc/terms/available](http://purl.org/dc/terms/available) 

Definition: Date (often a range) that the resource will become or did become available.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### bibliographicCitation
URI: [http://purl.org/dc/terms/bibliographicCitation](http://purl.org/dc/terms/bibliographicCitation) 

Definition: A bibliographic reference for the resource.

Comment: Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible, whether or not the citation is in a standard form.

Refines: [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

Domain: **[BibliographicResource](http://dublincore.org/usageboardwiki/BibliographicResource)**

Range: **[BibliographicReference](http://dublincore.org/usageboardwiki/BibliographicReference)**

##### conformsTo
URI: [http://purl.org/dc/terms/conformsTo](http://purl.org/dc/terms/conformsTo) 

Definition: A reference to an established standard to which the resource conforms.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Standard**

##### created
URI: [http://purl.org/dc/terms/created](http://purl.org/dc/terms/created) 

Definition: Date of creation of the resource.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### dateAccepted
URI: [http://purl.org/dc/terms/dateAccepted](http://purl.org/dc/terms/dateAccepted) 

Definition: Date of acceptance of the resource (e.g. of thesis by university department, of article by journal, etc.).

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### dateCopyrighted
URI: [http://purl.org/dc/terms/dateCopyrighted](http://purl.org/dc/terms/dateCopyrighted) 

Definition: Date of a statement of copyright.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### dateSubmitted
URI: [http://purl.org/dc/terms/dateSubmitted](http://purl.org/dc/terms/dateSubmitted) 

Definition: Date of submission of the resource (e.g. thesis, articles, etc.).

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### educationLevel
URI: [http://purl.org/dc/terms/educationLevel](http://purl.org/dc/terms/educationLevel) 

Definition: A general statement describing the education or training context. Alternatively, a more specific statement of the location of the audience in terms of its progression through an education or training context.

Refines: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

Domain: **Resource**

Range: **AgentClass**

_Note: proposed range is in line with desire for educationLevel to be a sub-property of audience BUT it doesn't fit with the current wording of the definition._

Proposed definition: An audience, defined in terms of its progression through an educational or training context, for whom the resource is intended.

##### extent
URI: [http://purl.org/dc/terms/extent](http://purl.org/dc/terms/extent) 

Definition: The size or duration of the resource.

Refines: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

Domain: **Resource**

Range: **Extent**

##### hasFormat
URI: [http://purl.org/dc/terms/hasFormat](http://purl.org/dc/terms/hasFormat) 

Definition: The described resource pre-existed the referenced resource, which is essentially the same intellectual content presented in another format.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### hasPart
URI: [http://purl.org/dc/terms/hasPart](http://purl.org/dc/terms/hasPart) 

Definition: The described resource includes the referenced resource either physically or logically.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### hasVersion
URI: [http://purl.org/dc/terms/hasVersion](http://purl.org/dc/terms/hasVersion) 

Definition: The described resource has a version, edition, or adaptation, namely, the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### instructionalMethod
URI: [http://purl.org/dc/terms/instructionalMethod](http://purl.org/dc/terms/instructionalMethod) 

Definition: A process, used to engender knowledge, attitudes and skills, that the resource is designed to support.

Comment: Instructional Method will typically include ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.

Domain: **Resource**

Range: **InstructionalMethod**

##### isFormatOf
URI: [http://purl.org/dc/terms/isFormatOf](http://purl.org/dc/terms/isFormatOf) 

Definition: The described resource is the same intellectual content of the referenced resource, but presented in another format.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### isPartOf
URI: [http://purl.org/dc/terms/isPartOf](http://purl.org/dc/terms/isPartOf) 

Definition: The described resource is a physical or logical part of the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### isReferencedBy
URI: [http://purl.org/dc/terms/isReferencedBy](http://purl.org/dc/terms/isReferencedBy) 

Definition: The described resource is referenced, cited, or otherwise pointed to by the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### isReplacedBy
URI: [http://purl.org/dc/terms/isReplacedBy](http://purl.org/dc/terms/isReplacedBy) 

Definition: The described resource is supplanted, displaced, or superseded by the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### isRequiredBy
URI: [http://purl.org/dc/terms/isRequiredBy](http://purl.org/dc/terms/isRequiredBy) 

Definition: The described resource is required by the referenced resource, either physically or logically.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### issued
URI: [http://purl.org/dc/terms/issued](http://purl.org/dc/terms/issued) 

Definition: Date of formal issuance (e.g., publication) of the resource.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### isVersionOf
URI: [http://purl.org/dc/terms/isVersionOf](http://purl.org/dc/terms/isVersionOf) 

Definition: The described resource is a version, edition, or adaptation of the referenced resource. Changes in version imply substantive changes in content rather than differences in format.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### license
URI: [http://purl.org/dc/terms/license](http://purl.org/dc/terms/license) 

Definition: A legal document giving official permission to do something with the resource.

Comment: Recommended best practice is to identify the license using a URI. Examples of such licenses can be found at [http://creativecommons.org/licenses/](http://creativecommons.org/licenses/).

Refines: [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

Domain: **Resource**

Range: **License**

##### mediator
URI: [http://purl.org/dc/terms/mediator](http://purl.org/dc/terms/mediator) 

Definition: A class of entity that mediates access to the resource and for whom the resource is intended or useful.

Comment: The audiences for a resource are of two basic classes: (1) an ultimate beneficiary of the resource, and (2) frequently, an entity that mediates access to the resource. The mediator element refinement represents the second of these two classes.

Refines: [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

Domain: **Resource**

Range: **AgentClass**

##### medium
URI: [http://purl.org/dc/terms/medium](http://purl.org/dc/terms/medium) 

Definition: The material or physical carrier of the resource.

Refines: [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

Domain: **PhysicalResource**

Range: **PhysicalMedium**

##### modified
URI: [http://purl.org/dc/terms/modified](http://purl.org/dc/terms/modified) 

Definition: Date on which the resource was changed.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

##### provenance
URI: [http://purl.org/dc/terms/provenance](http://purl.org/dc/terms/provenance) 

Definition: A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity and interpretation.

Comment: The statement may include a description of any changes successive custodians made to the resource.

Domain: **Resource**

Range: **ProvenanceStatement**

##### references
URI: [http://purl.org/dc/terms/references](http://purl.org/dc/terms/references) 

Definition: The described resource references, cites, or otherwise points to the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### replaces
URI: [http://purl.org/dc/terms/replaces](http://purl.org/dc/terms/replaces) 

Definition: The described resource supplants, displaces, or supersedes the referenced resource.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### requires
URI: [http://purl.org/dc/terms/requires](http://purl.org/dc/terms/requires) 

Definition: The described resource requires the referenced resource to support its function, delivery, or coherence of content.

Refines: [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

Domain: **Resource**

Range: **Resource**

##### rightsHolder
URI: [http://purl.org/dc/terms/rightsHolder](http://purl.org/dc/terms/rightsHolder) 

Definition: A person or organization owning or managing rights over the resource.

Comment: Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity.

Domain: **Resource**

Range: **Agent**

##### spatial
URI: [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial) 

Definition: Spatial characteristics of the intellectual content of the resource.

Refines: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

Domain: **Resource**

Range: **Location**

##### tableOfContents
URI: [http://purl.org/dc/terms/tableOfContents](http://purl.org/dc/terms/tableOfContents) 

Definition: A list of subunits of the content of the resource.

Refines: [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

Domain: **Resource**

Range: **Resource**

##### temporal
URI: [http://purl.org/dc/terms/temporal](http://purl.org/dc/terms/temporal) 

Definition: Temporal characteristics of the intellectual content of the resource.

Refines: [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

Domain: **Resource**

Range: **Period**

##### valid
URI: [http://purl.org/dc/terms/valid](http://purl.org/dc/terms/valid) 

Definition: Date (often a range) of validity of a resource.

Refines: [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

Domain: **Resource**

Range: **Period**

* * *

The links below provide access to the UML class diagrams shown above in a form suitable for loading into [<img src="PropertyDomainsAndRanges_files/moin-www.png" alt="[WWW]" height="11" width="11">UMLet](http://www.umlet.com/) (the tool that was used to create them).

- [dcam-class-hierarchy-new-2.uxf](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=AttachFile&do=get&target=dcam-class-hierarchy-new-2.uxf)

- [dcam-class-hierarchy-format.uxf](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=AttachFile&do=get&target=dcam-class-hierarchy-format.uxf)

 [RefreshCache](http://dublincore.org/usageboardwiki/PropertyDomainsAndRanges?action=refresh&arena=Page.py&key=PropertyDomainsAndRanges.text_html) for this page (cached 2012-12-22 18:39:49)  

Immutable page (last edited 2007-02-05 14:26:10 by PeteJohnston)


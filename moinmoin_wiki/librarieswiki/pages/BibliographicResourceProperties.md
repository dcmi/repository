---
title: "- BibliographicResourceProperties"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/librarieswiki/pages/BibliographicResourceProperties.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [BibliographicResourceProperties](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=fullsearch&value=BibliographicResourceProperties&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/librarieswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/librarieswiki/FrontPage)
- [RecentChanges](http://dublincore.org/librarieswiki/RecentChanges)
- [FindPage](http://dublincore.org/librarieswiki/FindPage)
- [HelpContents](http://dublincore.org/librarieswiki/HelpContents)

Page

- [Edit](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=edit "Edit")
- [View](http://dublincore.org/librarieswiki/BibliographicResourceProperties "View")
- [Diffs](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=diff "Diffs")
- [Info](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=info "Info")
- [Subscribe](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=raw "Raw")
- [Print](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=AttachFile)
- [DSP2XML](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=DSP2XML)
- [DeletePage](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=DeletePage)
- [LikePages](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=LikePages)
- [LocalSiteMap](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=SpellCheck)

Search

<form method="POST" action="/librarieswiki/BibliographicResourceProperties">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="BibliographicResourceProperties_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="BibliographicResourceProperties_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

{{TOC right}} 
### Properties used with Bibliographic Text Resource

#### Title

**Name:** title 

**URI:** [http://purl.org/dc/elements/1.1/title](http://purl.org/dc/elements/1.1/title)

**Definition:** A name given to the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - A parallel/transliterated title is considered a main title, i.e. the title property is repeated.

  - If no title is available, best practice is to give a constructed title, derive a title from the resource or supply [no title].

  - Retain initial articles and use local sorting algorithms based on language. (For example, see: [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Initial Definite and Indefinite Articles](http://lcweb.loc.gov/marc/bibliographic/bdapp-e.html) for a list of articles in various languages).

  - A language qualifier may be used to indicate language of title if appropriate.(See [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for the Creation of Title Content](http://colab.mpdl.mpg.de/mediawiki/CreatingMetadata#Guidelines_for_the_creation_of_title_content))

**Has Range:**
  - dc:title may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**Obligation:** M 

**Occurence:** 1-n

#### Alternative Title

**Name:** alternative 

**URI:** [http://purl.org/dc/terms/alternative](http://purl.org/dc/terms/alternative)

**Definition:** An alternative name for the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Assigned title such as uniform or key title is Alternative. Best practice is to use this element for titles other than the main title.

  - Retain initial articles and use local sorting algorithms based on language. (For example, see: [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Initial Definite and Indefinite Articles](http://lcweb.loc.gov/marc/bibliographic/bdapp-e.html) for a list of articles in various languages)

  - A language qualifier may be used to indicate language of title if appropriate.(See [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for the Creation of Title Content](http://colab.mpdl.mpg.de/mediawiki/CreatingMetadata#Guidelines_for_the_creation_of_title_content))

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**Obligation:** R

**Occurence:** 0-n

#### Creator

**Name:** creator 

**URI:** [http://purl.org/dc/elements/1.1/creator](http://purl.org/dc/elements/1.1/creator)

**Definition:** An entity primarily responsible for making the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - If you want to describe the function resp. role of a person or corporate body more specific (e.g. author, colorist, Illustrator, Interviewer, etc.) use one of the terms of the [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">"MARC Code List for Relators"](http://id.loc.gov/vocabulary/relators.html) instead of Creator. URIs are available for every role code.

  - Structured values to provide more information about a creator could be provided by using a complex type definition (in XML Schema) or a [blank node] (in RDF). The DCMI Usage Board prefers the usage of a URI which is an interlinking between the description of a Bibliographic Text Resource and the description of an Agent as a creator.

**Has Range:**
  - dc:creator may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**Obligation:** O 

**Occurence** 0-n

#### Contributor

**Name:** contributor 

**URI:** [http://purl.org/dc/elements/1.1/contributor](http://purl.org/dc/elements/1.1/contributor)

**Definition:** An entity responsible for making contributions to the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - If you want to describe the function resp. role of a person or corporate body more specific (e.g. Editor, Book Designer, Translator, etc.) use one of the terms of the [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">"MARC Code List for Relators"](http://id.loc.gov/vocabulary/relators.html) instead of Contributor. URIs are available for every role code.

  - Structured values to provide more information about a contributor could be provide by using a complex type definition (in XML Schema) or a [blank node] (in RDF). The DCMI Usage Board prefers the usage of a URI which is an interlinking between the description of a Bibliographic Text Resource and the description of an Agent as a contributor.

**Has Range:**
  - dc:contributor may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**Obligation:** MA 

**Occurence** 0-n

#### Publisher

**Name:** publisher 

**URI:** [http://purl.org/dc/elements/1.1/publisher](http://purl.org/dc/elements/1.1/publisher)

**Definition:** An entity responsible for making the resource available.

**Type of Term:** Property

**DCLIB-Comment:**

  - Structured values to provide more information about a publisher could be provide by using a complex type definition (in XML Schema) or a [blank node] (in RDF). The DCMI Usage Board prefers the usage of a URI which is an interlinking between the description of a Bibliographic Text Resource and the description of an Agent as a publisher.

**Has Range:**
  - dc:publisher may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**Obligation:** O 

**Occurence:** 0-n

#### Subject

**Name:** subject 

**URI:** [http://purl.org/dc/elements/1.1/subject](http://purl.org/dc/elements/1.1/subject)

**Definition:** The topic of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - If a geographic or temporal topic is recorded use the element Coverage, Spatial or Temporal.

  - It is highly recommended to use controlled vocabulary with Subject. It is also recommended that terms of controlled vocabularies be specified by encoding scheme or by using a URI.

**Has Range:**
  - dc:subject may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**VES:** The following encoding schemes are currently listed by DCMI. Additional encoding schemes may be used, mainly those identified by a URI. 
  - Library of Congress Subject Headings - [http://purl.org/dc/terms/LCSH;](http://purl.org/dc/terms/LCSH;)

  - Medical Subject Headings - [http://purl.org/dc/terms/MESH;](http://purl.org/dc/terms/MESH;)

  - Dewey Decimal Classification - [http://purl.org/dc/terms/DDC;](http://purl.org/dc/terms/DDC;)

  - Library of Congress Classification - [http://purl.org/dc/terms/LCC;](http://purl.org/dc/terms/LCC;)

  - Universal Decimal Classification - [http://purl.org/dc/terms/UDC](http://purl.org/dc/terms/UDC).

**Obligation:** R 

**Occurence:** 0-n

#### Abstract

**Name:** abstract 

**URI:** [http://purl.org/dc/terms/abstract](http://purl.org/dc/terms/abstract)

**Definition:** A summary of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Use text (and not only a URL) to describe the resource.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:** [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI)

**Obligation:** R

**Occurence:** 0-n

#### Table Of Contents

**Name:** tableOfContents 

**URI:** [http://purl.org/dc/terms/tableOfContents](http://purl.org/dc/terms/tableOfContents)

**Definition:** A list of subunits of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Use text (and not only a URL) to describe the resource.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:** [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI)

**Obligation:** R

**Occurence:** 0-n

#### Date

**Name:** date 

**URI:** [http://purl.org/dc/elements/1.1/date](http://purl.org/dc/elements/1.1/date)

**Definition:** A point or period of time associated with an event in the lifecycle of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use dc:date only if none of the other date properties fit or if you want to describe a date with a non-literal value.

  - Dates should be encoded using W3C-DTF (a profile of ISO 8601 structured with hyphens)or ISO 8601 (structured without hyphens)

**Has Range:**
  - dc:date may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**SES:**
  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** MA 

**Occurence:** 0-n

#### Date Created

**Name:** created 

**URI:** [http://purl.org/dc/terms/created](http://purl.org/dc/terms/created)

**Definition:** Date of creation of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Use for the creation of the intellectual content.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** MA 

**Occurence:** 0-1

#### Date Valid

**Name:** valid 

**URI:** [http://purl.org/dc/terms/valid](http://purl.org/dc/terms/valid)

**Definition:** Date (often a range) of validity of a resource.

**Type of Term:** Property

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Date Available

**Name:** available 

**URI:** [http://purl.org/dc/terms/available](http://purl.org/dc/terms/available)

**Definition:** Date (often a range) that the resource became or will become available.

**Type of Term:** Property

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Date Issued

**Name:** issued 

**URI:** [http://purl.org/dc/terms/issued](http://purl.org/dc/terms/issued)

**Definition:** Date of formal issuance (e.g., publication) of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Use for the instantiation.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** MA 

**Occurence:** 0-1

#### Date Modified

**Name:** modified 

**URI:** [http://purl.org/dc/terms/modified](http://purl.org/dc/terms/modified)

**Definition:** Date on which the resource was changed.

**Type of Term:** Property

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-n

#### Date Copyrighted

**Name:** dateCopyrighted 

**URI:** [http://purl.org/dc/terms/dateCopyrighted](http://purl.org/dc/terms/dateCopyrighted)

**Definition:** Date of copyright.

**Type of Term:** Property

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Date Submitted

**Name:** dateSubmitted 

**URI:** [http://purl.org/dc/terms/dateSubmitted](http://purl.org/dc/terms/dateSubmitted)

**Definition:** Date of submission of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Recommended for theses and dissertations.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Date Accepted

**Name:** dateAccepted 

**URI:** [http://purl.org/dc/terms/dateAccepted](http://purl.org/dc/terms/dateAccepted)

**Definition:** Date of acceptance of the resource.

**Type of Term:** Property

**DCLIB-Comment:** Recommended for theses and dissertations.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Date of Reproduction

**Name:** dateOfReproduction 

**URI:** [http://my.ex/dclib/terms/dateOfReproduction](http://my.ex/dclib/terms/dateOfReproduction)

**Description:** Date of creation of an electronic reproduction, a reprint, a mirror of a website etc.

**Type of Term:** Property

**Narrower Than:** [http://purl.org/dc/terms/created](http://purl.org/dc/terms/created)

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:**

  - ISO 8601(without hyphens) - [http://purl.org/dc/terms/ISO8601;](http://purl.org/dc/terms/ISO8601;)

  - W3C-DTF (with hyphens) - [http://purl.org/dc/terms/W3CDTF](http://purl.org/dc/terms/W3CDTF)

**Obligation:** O 

**Occurence:** 0-1

#### Type

**Name:** type 

**URI:** [http://purl.org/dc/elements/1.1/type](http://purl.org/dc/elements/1.1/type)

**Definition:** The nature or genre of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use a controlled list and identify the source with a vocabulary encoding scheme.

  - Recommend to use a vocabulary which values are identified by proper URIs.

  - Recommended that at least one value from [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI-Type vocabulary](http://dublincore.org/documents/dcmi-type-vocabulary/) be supplied for a high level category.

  - Type may be repeated if values of different controlled vocabularies are used.

**Has Range:**
  - dc:type may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**VES:** The following VES could be used: 
  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI-Type vocabulary](http://dublincore.org/documents/dcmi-type-vocabulary/),

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">MARC Genre Term List](http://www.loc.gov/standards/valuelist/marcgt.html).

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Art & Architecture thesaurus](http://www.getty.edu/research/conducting_research/vocabularies/aat/)

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Thesaurus for graphic materials](http://id.loc.gov/vocabulary/graphicMaterials.html)

**Obligation:** O 

**Occurence:** 0-n

#### Format

**Name:** format 

**URI:** [http://purl.org/dc/elements/1.1/format](http://purl.org/dc/elements/1.1/format)

**Definition:** The file format, physical medium, or dimensions of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - dc:format may include the media-type or dimensions of the resource and may be used to determine the software, hardware or other equipment needed to display or operate the resource.

  - Recommended best practice is to select a value from a controlled vocabulary (for example, the list of Internet Media Types [MIME] defining computer media formats).

  - Use dc:format only if dcterms:extent or dcterms:medium don't fit or if you have to describe the information with a literal value.

**Has Range:**
  - May be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**VES:**
  - IMT - [http://purl.org/dc/terms/IMT](http://purl.org/dc/terms/IMT) - The Internet media type of the resource. See also: [http://www.isi.edu/in-notes/iana/assignments/media-types/media-types](http://www.isi.edu/in-notes/iana/assignments/media-types/media-types)

**Obligation:** R 

**Occurence:** 0-1

#### Extent

**Name:** extent 

**URI:** [http://purl.org/dc/terms/extent](http://purl.org/dc/terms/extent)

**Definition:** The size or duration of the resource.

**Type of Term:** Property

**DCLIB-Comment:** dc:extent has to be used with a non-literal value. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values)

**Has Range:** [http://purl.org/dc/terms/SizeOrDuration](http://purl.org/dc/terms/SizeOrDuration)

**Obligation:** O

**Occurence:** 0-1

#### Medium

**Name:** medium 

**URI:** [http://purl.org/dc/terms/medium](http://purl.org/dc/terms/medium)

**Definition:** The material or physical carrier of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Used to specify the medium of the physical carrier of a resource.

  - May only be used describing a physical resource.

  - Has to be used with a non-literal value. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values).

**Has Range:** [http://purl.org/dc/terms/PhysicalMedium](http://purl.org/dc/terms/PhysicalMedium)

**Has Domain:** [http://purl.org/dc/terms/PhysicalResource](http://purl.org/dc/terms/PhysicalResource)

**Obligation:** O

**Occurence:** 0-1

#### Identifier

**Name:** identifier 

**URI:** [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

**Definition:** An unambiguous reference to the resource within a given context.

**Type of Term:** Property

**DCLIB-Comment:**

  - _Standard identifier:_ Provide at least one standard identifier from a standard scheme (e.g., ISSN, ISBN, etc.) if such identifier / identifiers have been assigned to the resource and are known to the metadata agency. These identifiers should be expressed as HTTP URIs in order to make them actionable in the Web. For instance, [http://urn.fi/URN:ISBN:978-952-10-6454-8](http://urn.fi/URN:ISBN:978-952-10-6454-8) is an HTTP URI representation of ISBN 978-952-10-6454-8. Single identifier may have 1-n HTTP URI representations which provide persistent links to 1-n services relevant to the human or other users (such as a link to Amazon; link to open repository; link to the national library’s deposit collections).

  - _Citation:_ Provide a citation if no standard identifier is assigned and a formal citation is a common means of identifying the resource being described (e.g., a journal article). - Use the element Identifier on a more abstract level; identifier for local library holdings like call number could be put into the DC-Lib element Location. (OpenURL may be registered as an encoding scheme).

  - For _Unique-resource identifier_ see the term Identifier from the " [ItemProperties](http://dublincore.org/librarieswiki/ItemProperties)"

**Has Range:**
  - dc:identifier may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**SES:**
  - URI - [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI). If not expressed by URI, ISBN (International Standard Book Number), ISSN (International Standard Serial Number) and NBN can be expressed as Uniform resource names (see examples of ISBN and NBN above. Pleasde note that DOIs (Digital Object Identifiers) and other persistent identifiers such as URNs and ARKs are usually expressed as HTTP URIs.

**Obligation:** MA 

**Occurence:** 0-n

#### Bibliographic Citation

**Name:** bibliographicCitation 

**URI:** [http://purl.org/dc/terms/bibliographicCitation](http://purl.org/dc/terms/bibliographicCitation)

**Definition:** A bibliographic reference for the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - See [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for Encoding Bibliographic Citation Information in Dublin Core Metadata](http://dublincore.org/documents/dc-citation-guidelines/index.shtml)

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**Has Domain:** [http://purl.org/dc/terms/BibliographicResource](http://purl.org/dc/terms/BibliographicResource)

**Obligation:** O

**Occurence:** 0-1

#### Source

**Name:** source 

**URI:** [http://purl.org/dc/elements/1.1/source](http://purl.org/dc/elements/1.1/source)

**Definition:** A related resource from which the described resource is derived.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use only when the described resource is the result of digitization of non-digital originals. Otherwise, use Relation.

**Has Range:**
  - dc:source may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace)

**Obligation:** O 

**Occurence:** 0-n

#### Language

**Name:** language 

**URI:** [http://purl.org/dc/terms/language](http://purl.org/dc/terms/language)

**Definition:** A language of the resource.

**Type of Term:** Porperty

**DCLIB-Comment:**

  - Recommend usage of codes taken from [ISO 639-3] rather than text,

  - Recommend usage of ISO 639-3 URIs (see [http://www.lexvo.org/](http://www.lexvo.org/))

**Has Range:** dc:language may be used with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace). 

**SES:**

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">ISO 639-2](http://www.loc.gov/standards/iso639-2/): DCMI approved encoding scheme. The code list includes the mapping to ISO 639-1.

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">RFC 5646](http://purl.org/dc/terms/RFC5646)

**VES:**
  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">ISO 639-3](http://www.sil.org/iso639-3/codes.asp): The code list includes the mapping to ISO 639-1 and ISO 639-2. URIs are declared for ISO 639-3 codes by [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">lexvo.org](http://www.lexvo.org/).

**Obligation:** M 

**Occurence:** 1-n

#### Relation

**Name:** relation 

**URI:** [http://purl.org/dc/elements/1.1/relation](http://purl.org/dc/elements/1.1/relation)

**Definition:** A related resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use dc:relation only if non of the other relation properties fit or if you want to describe a relation with a literal value.

**Has Range:** dc:relation may be used further with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace)

**SES:**

  - URI: [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI)

  - Open URL Framework: [http://www.openurl.info/registry/](http://www.openurl.info/registry/)

**Obligation:** O 

**Occurence:** 0-n

#### Is Version Of

**Name:** isVersionOf 

**URI:** [http://purl.org/dc/terms/isVersionOf](http://purl.org/dc/terms/isVersionOf)

**Definition:** A related resource of which the described resource is a version, edition, or adaptation.

**Type of Term:** Property

**DCLIB-Comment** :

  - dcterms:isVersionOf has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** R

**Occurence:** 0-n

#### Is Format Of

**Name:** isFormatOf 

**URI:** [http://purl.org/dc/terms/isFormatOf](http://purl.org/dc/terms/isFormatOf)

**Definition:** A related resource that is substantially the same as the described resource, but in another format.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use only when the described resource references alternative physical formats (e.g. PDF, Postscript, etc.)

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** R

**Occurence:** 0-1

#### Has Format

**Name:** hasFormat 

**URI:** [http://purl.org/dc/terms/hasFormat](http://purl.org/dc/terms/hasFormat)

**Definition:** A related resource that is substantially the same as the pre-existing described resource, but in another format.

**Type of Term:** Property

**DCLIB-Comment** :

  - Use only when the described resource references alternative physical formats (e.g. PDF, Postscript, etc.)

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** R

**Occurence:** 0-n

#### Is Replaced By

**Name:** isReplacedBy 

**URI:** [http://purl.org/dc/terms/isReplacedBy](http://purl.org/dc/terms/isReplacedBy)

**Definition:** A related resource that supplants, displaces, or supersedes the described resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Used for succeeding version.

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** O

**Occurence:** 0-1

#### Replaces

**Name:** replaces 

**URI:** [http://purl.org/dc/terms/replaces](http://purl.org/dc/terms/replaces)

**Definition:** A related resource that is supplanted, displaced, or superseded by the described resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Used for preceding version.

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** O

**Occurence:** 0-n

#### Is Part Of

**Name:** isPartOf 

**URI:** [http://purl.org/dc/terms/isPartOf](http://purl.org/dc/terms/isPartOf)

**Definition:** A related resource in which the described resource is physically or logically included.

**Type of Term:** Property

**DCLIB-Comment:**

  - Recommended use when documents in hand are parts of "host documents" (e.g. journal, monographic series) and when there is no citation information in dc:identifier or dcterms:bibliographicCitation.

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** R

**Occurence:** 0-n

#### Has Part

**Name:** hasPart 

**URI:** [http://purl.org/dc/terms/hasPart](http://purl.org/dc/terms/hasPart)

**Definition:** A related resource that is included either physically or logically in the described resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** O

**Occurence:** 0-n

#### Requires

**Name:** requires 

**URI:** [http://purl.org/dc/terms/requires](http://purl.org/dc/terms/requires)

**Definition:** A related resource that is required by the described resource to support its function, delivery, or coherence.

**Type of Term:** Property

**DCLIB-Comment:**

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** R

**Occurence:** 0-n

#### Is Referenced By

**Name:** isReferencedBy 

**URI:** [http://purl.org/dc/terms/isReferencedBy](http://purl.org/dc/terms/isReferencedBy)

**Definition:** A related resource that references, cites, or otherwise points to the described resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** O

**Occurence:** 0-n

#### References

**Name:** references 

**URI:** [http://purl.org/dc/terms/references](http://purl.org/dc/terms/references)

**Definition:** A related resource that is referenced, cited, or otherwise pointed to by the described resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Has to be used with non-literal values. We recommend to use a URI to interlink between two resources. If no URI exist describe the other resource by using a blank node (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the relation by a literal value, you have to use dc:relation.

**Has Range:** This term is intended to be used with non-literal values as defined in the DCMI Abstract Model ( [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration. 

**Obligation:** O

**Occurence:** 0-n

#### Translation of

**Name:** isA [TranslationExpressionOf](http://dublincore.org/librarieswiki/TranslationExpressionOf)

**URI:** [http://iflastandards.info/ns/fr/frbr/frbrer/P2064](http://iflastandards.info/ns/fr/frbr/frbrer/P2064)

**Definition:** Relates an expression to a prior expression of the same work of which it represents a literal translation, in which the intent is to render the intellectual content of the previous expression as accurately as possible.

**Type of Term:** Property

**DCLIB-Comment:**

  - Relation between two bibliographic text resources where one resource is the translation of the other resource.

  - frbr:isA [TranlsatedExpressionOf](http://dublincore.org/librarieswiki/TranlsatedExpressionOf) may only be used with non-literal values. Best practice is to interlink the resources by a URI. If no URI exist describe the other resource by using a blank node.

 **[HasRange](http://dublincore.org/librarieswiki/HasRange):** The "Expression" level of the bibliographicTextResource 

**[HasDomain](http://dublincore.org/librarieswiki/HasDomain):** The "Expression" level of the bibliographicTextResource

**Obligation:** O

**Occurence:** 0-n

#### Coverage

**Name:** coverage 

**URI:** [http://purl.org/dc/elements/1.1/coverage](http://purl.org/dc/elements/1.1/coverage)

**Definition:** The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use dc:coverage only if dcterms:spatial or or dcterms:temporal don't fit or if you want to describe the information with a literal value.

  - Recommended best practice is to select a value from a controlled vocabulary

  - Where appropriate, next to numeric identifiers - such as sets of coordinates or date ranges - named places or time periods should be used.

**Has Range:**
  - dc:coverage may be used either with a literal or a non-literal value. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace)

**SES:**
  - DCMI Box - [http://purl.org/dc/terms/Box;](http://purl.org/dc/terms/Box;)

  - ISO 3166 - [http://purl.org/dc/terms/ISO3166](http://purl.org/dc/terms/ISO3166)

  - DCMI Period - [http://purl.org/dc/terms/Period](http://purl.org/dc/terms/Period)

  - DCMI Point - [http://purl.org/dc/terms/Point](http://purl.org/dc/terms/Point)

**Obligation:** O 

**Occurence:** 0-n

#### Spatial

**Name:** spatial 

**URI:** [http://purl.org/dc/terms/spatial](http://purl.org/dc/terms/spatial)

**Definition:** Spatial characteristics of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use this element for geographic coverage.

  - Recommend best practice is to select a value from a controlled vocabulary (for example, the [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Getty Thesaurus of Geographic Names](http://www.getty.edu/research/tools/vocabulary/tgn/index.html))

  - Where appropriate, use named places next to numeric identifiers such as sets of coordinates.

  - dcterms:spatial has to be used with non-literal values. We recommend to link to a controlled vocabulary value by using a URI. If no URI exist use a blank node describing the place (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the spatial characteristic by a literal value, you have to use dc:coverage.

**Has Range:** [http://purl.org/dc/terms/Location](http://purl.org/dc/terms/Location)

**VES:**

  - TGN - [http://purl.org/dc/terms/TGN;](http://purl.org/dc/terms/TGN;)

  - MARC Code List for Geographic Areas - [http://www.loc.gov/marc/geoareas/](http://www.loc.gov/marc/geoareas/)

  - MARC Code List for Countries - [http://www.loc.gov/marc/countries/](http://www.loc.gov/marc/countries/)

**Obligation:** MA 

**Occurence:** 0-n

#### Temporal

**Name:** temporal 

**URI:** [http://purl.org/dc/terms/temporal](http://purl.org/dc/terms/temporal)

**Definition:** Temporal characteristics of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Use this element to describe the temporal coverage.

  - Recommend best practice is to select a value from a controlled vocabulary

  - Where appropriate, use named time periods next to numeric identifiers.

  - dcterms:temporal has to be used with non-literal values. We recommend to link to a controlled vocabulary value by using a URI.. If no URI exist use a blank node describing the time period (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

  - If you want to describe the temporal characteristic by a literal value, you have to use dc:coverage.

**Has Range:** [http://purl.org/dc/terms/PeriodOfTime](http://purl.org/dc/terms/PeriodOfTime)

**Obligation:** MA

**Occurence:** 0-n

#### Rights

**Name:** rights 

**URI:** [http://purl.org/dc/elements/1.1/rights](http://purl.org/dc/elements/1.1/rights)

**Definition:** Information about rights held in and over the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Includes information as access rights, Intellectual Property Rights (IPR), copyrights, references to legal documents describing how to use a resource, etc.

  - We recommend to reference a service providing such information like [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">creative commons](http://creativecommons.org/).

**Has Range:**
  - dc:rights may be use with literal or non-literal values. For further information see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace)

**Obligation:** R 

**Occurence:** 0-1

#### Audience

**Name:** audience 

**URI:** [http://purl.org/dc/terms/audience](http://purl.org/dc/terms/audience)

**Definition:** A class of entity for whom the resource is intended or useful.

**Type of Term:** Property

**DCLIB-Comment:**

  - dcterms:audience has to be used with non-literal values where the value is an instance of the class [AgentClass](http://dublincore.org/librarieswiki/AgentClass). We recommend to link to a controlled vocabulary value by using a URI. If no URI exist use a blank node describing the audience (see [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values)).

**Has Range:** [http://purl.org/dc/terms/AgentClass](http://purl.org/dc/terms/AgentClass)

**VES:**

  - [<img src="BibliographicResourceProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">MARC Target Audience Term List](http://www.loc.gov/standards/valuelist/marctarget.html).

**Obligation:** O 

**Occurence:** 0-n

#### Edition

**Name:** version 

**URI:** [http://purl.org/eprint/terms/version](http://purl.org/eprint/terms/version)

**Definition:** A version number or version string associated with the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - Element should be included if necessary for identification.

  - Is not to be used for versions in the sense of different physical formats (e.g. the PDF version of a textual resource).

  - The version is described only by a text string (like "third edition", Version 1.4, etc). If you want to link to another version, use dcterms:isVersionOf

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal) - **Obligation:** R

**Occurence:** 0-1

* * *

Go back to [DescriptionSetProfile](http://dublincore.org/librarieswiki/DescriptionSetProfile)

 [RefreshCache](http://dublincore.org/librarieswiki/BibliographicResourceProperties?action=refresh&arena=Page.py&key=BibliographicResourceProperties.text_html) for this page (cached 2012-12-21 19:17:48)  

Immutable page (last edited 2011-09-05 15:05:42 by StefanieRuehle)


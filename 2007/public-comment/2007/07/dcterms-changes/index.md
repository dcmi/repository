---
title: Revisions to DCMI Metadata Terms
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/usage/public-comment/2007/07/dcterms-changes/index.shtml"
---

<!--#include virtual="/ssi/header.shtml" -->
<table class="docinfo" cellspacing="0">
  <tr>
    <th>Creator:</th>
    <td>
      <a href="mailto:tbaker@tbaker.de">Thomas Baker</a><br>
      DCMI</td>
  </tr>
  <tr>
    <th>Date Issued:</th>
    <td>2007-07-02</td>
  </tr>
  <tr>
    <th>Identifier:</th>
    <td><a href="/usage/public-comment/2007/07/dcterms-changes/">http://dublincore.org/usage/public-comment/2007/07/dcterms-changes/</a></td>
  </tr>
  <tr>
    <th>Description of Document:</th>
    <td>This set of proposed editorial clarifications to descriptions of DCMI metadata terms is proposed by the DCMI Usage Board for Public Comment.</td>
  </tr>
</table>

## Table of contents

1. About the proposed revisions
2. Types of revisions
3. Revisions, term by term
References  

* * *

## <a id="sect-1" name="sect-1">1. About the proposed revisions</a>

The document proposes a set of editorial revisions to terms in the set of DCMI Metadata Terms [DCTERMS]. The proposed changes are summarized in Section 2 and detailed, term by term, in Section 3. This proposal should be considered in conjunction with a separate but related proposal, "Domains and Ranges for DCMI Properties", which proposes a set of classes for assignment as domains and ranges of DCMI properties [DOMAINS].

This document follows on an earlier revision of terms in the Dublin Core Metadata Element Set (DCMES) [DCMES-CHANGES], which was undertaken in order to clarify intended semantics and bring the wording of definitions and usage comments into line with the language of the DCMI Abstract Model [DCAM].

After a Public Comment period, the changes described here will be finalized by the DCMI Usage Board, then published in revised versions of the Web documents "DCMI Metadata Terms" [DCTERMS] and "DCMI Metadata Terms: A complete historical record" [DCTERMS-HISTORY].

All of the changes proposed here have been evaluated by the DCMI Usage Board in light of the DCMI Namespace Policy [NAMESPACE]. The namespace policy says that DCMI terms are identified using Uniform Resource Identifiers (URIs). In accordance with the principle that distinct URIs should be assigned to distinct resources, the policy sets limits on the range of editorial changes that may allowably be made to the official labels, definitions, and usage comments associated with DCMI terms. By policy, any changes of meaning judged "likely to have a substantial impact on either machine processing of DCMI terms or the functional semantics of the terms" must trigger the creation of a new, distinct term with a new, distinct URI.

In the opinion of the Usage Board, the changes described in this document are unlikely to have a substantial impact on either machine processing of DCMI terms or the functional semantics of the terms -- i.e., they fall within the allowable range of editorial change. The changes constitute clarifications of term semantics in light of improved theoretical understanding, user feedback, and implementation experience. They are intended to provide the final twist of the lens that brings intended meanings more sharply into focus.

## <a id="sect-2" name="sect-2">2. Types of revisions</a>

### Free-standing descriptive labels

When terms such as dcterms:available were first coined as "Dublin Core qualifiers" in 2000 [QUALIFIERS], it was not yet entirely clear whether qualifiers were intended to be used like adjectives -- i.e., in conjunction with the Dublin Core elements they modified -- or as elements in their own right. The labels assigned at the time, such as "Available", suggest the former, but DCMI grammatical principles, and later the Abstract Model, clearly evolved to the latter. The terms dcterms:alternative, dcterms:available, dcterms:created, dcterms:issued, dcterms:modified, dcterms:valid, dcterms:spatial, and dcterms:temporal have been re-named with free-standing names such as "Date created" (instead of just "Created") and "Alternative Title" instead of just "Alternative").

### The phrase "content of the resource"

As described in [DCMES-CHANGES], wordings which distinguish the "content of" a resource have been revised to refer directly to a resource. In the current batch, this change is relevant to the definitions of: dcterms:abstract, dcterms:tableOfContents, dcterms:isFormatOf, dcterms:hasFormat, dcterms:spatial, dcterms:temporal, dcterms:DCMIType, and dcterms:requires.

### The phrase "reference to a resource"

Definitions which specify encoding practice with phrases such as "reference to a resource" have been revised as described in [DCMES-CHANGES]. This change is relevant to the definition of dcterms:conformsTo. Note, however, that the definition of dcterms:bibliographicCitation remains "A bibliographic reference for the resource".

### The phrase "use a controlled vocabulary"

It is now generally recommended that controlled vocabularies be used in metadata, so specific usage advice along these lines has been removed from the comments dcterms:accrualMethod, dcterms:accrualPeriodicity, and dcterms:accrualPolicy.

### Types of "encoding schemes"

The revised DCMI Abstract Model [DCAM] draws a clear distinction between Vocabulary Encoding Schemes and Syntax Encoding Schemes. Existing terms hitherto classified as "encoding schemes" have been designated in this batch of revisions, more specifically, as Vocabulary Encoding Schemes (dcterms:DCMIType, dcterms:DDC, dcterms:IMT, dcterms:LCC, dcterms:LCSH, dcterms:MESH, dcterms:NLM, dcterms:RFC4646, dcterms:TGN, and dcterms:UDC) or Syntax Encoding Schemes (dcterms:Box, dcterms:ISO3166, dcterms:ISO639-2, dcterms:Period, dcterms:Point, dcterms:RFC1766, dcterms:RFC3066, dcterms:URI, and dcterms:W3CDTF).

### Encoding scheme definitions

In accordance with the differentiation of encoding schemes into Vocabulary Encoding Schemes and Syntax Encoding Schemes, the Usage Board has revised their definitions to make clear how the encoding schemes are being seen and interpreted from a modeling point of view:

- as a set of concepts: dcterms:IMT, dcterms:LCSH, dcterms:MESH, dcterms:DDC, dcterms:LCC, dcterms:UDC, dcterms:DCMIType, dcterms:NLM
- as a set of codes: dcterms:ISO639-2, dcterms:ISO3166
- as a set of tags: dcterms:RFC1766
- as a set of identifiers: dcterms:URI
- as a set of regions in space: dcterms:Box
- as a set of places: dcterms:TGN
- as a set of time intervals: dcterms:Period
- as a set of dates and times: dcterms:W3CDTF

A thorough discussion of these interpretations is beyond the scope of this document and will be undertaken by the Usage Board in a separate note.

### Definitions versus Comments

Parts of some term Definitions have been moved into Comments, as with dcterms:isVersionOf, dcterms:dateAccepted, and dcterms:dateSubmitted.

### Relation of a property to a "described resource"

Some definitions have revised to make clear how a property relates to the "described resource" (dcterms:instructionalMethod, dcterms:isVersionOf, dcterms:isReplacedBy, dcterms:replaces, dcterms:isRequiredBy, dcterms:requires, dcterms:isPartOf, dcterms:hasPart, dcterms:isReferencedBy, dcterms:references, dcterms:isFormatOf, and dcterms:hasFormat).

### References to IETF Requests for Comment (RFCs)

Some term declarations make reference to "Request for Comment" (RFC) standards maintained by The Internet Engineering Task Force (IETF). When RFC standards are updated, their numbers change, and the newer standard (with a higher number) obsoletes the older standard. In this batch of revisions, references to RFCs have been updated:

- for dcterms:URI, RFC 3986 has obsoleted RFC 2396
- for dcterms:language, RFC 4646 has obsoleted RFC 3066

### DCMI encoding schemes that designate RFCs

Existing encoding schemes declared by DCMI in reference to specific RFCs -- dcterms:RFC1766 and dcterms:RFC3066 -- are interpreted in this batch of proposed changes as Syntax Encoding Schemes. Since RFC 3066 has been obsoleted by RFC 4646, however, this batch of revisions includes the proposal for a new DCMI encoding scheme, dcterms:RFC4646, which is interpreted to be a Vocabulary Encoding Scheme.

### Revisions in response to the five-year review for NISO Z39.85-2007

A five-year review of ANSI/NISO Z39.85 (The Dublin Core Metadata Element Set) was held, resulting in the revised standard ANSI/NISO Z39.85-2007 in May 2007 [NISOZ39-85]. This batch of revisions includes minor changes of wording undertaken in response to comments (dcterms:source, dcterms:subject, dcterms:language, and dcterms:coverage). In response to the comment that the Comment for dcterms:title was potentially misleading, the Usage Board decided to delete the comment altogether.

### The statement "qualifies:"

When "Dublin Core qualifiers" were first published in 2000 [QUALIFIERS], encoding schemes were associated with specific elements -- e.g., dcterms:LCSH with dc:subject. In light of subsequent work on the DCMI model, however, the association between a property and a Vocabulary Encoding Scheme or Syntax Encoding Scheme is seen as something more appropriately declared in an application profile than in the formal declaration of a vocabulary. "Qualifies:" statements have therefore been removed from the term descriptions for dcterms:DDC, dcterms:LCC, dcterms:UDC, dcterms:DCMIType, dcterms:IMT, dcterms:ISO639-2, dcterms:RFC1766, dcterms:URI, dcterms:Point, dcterms:ISO3166, dcterms:Box, dcterms:TGN, dcterms:Period, dcterms:W3CDTF, dcterms:RFC3066, dcterms:NLM, dcterms:LCSH, and dcterms:MESH. Methods for the formal expression of such an association in the RDF schemas published by DCMI were never finalized as a DCMI Recommendation [DCQ-RDF] and have since been superseded by new guidelines for expressing Dublin Core metadata in RDF [DC-RDF], as discussed in [DC-RDF-NOTES].

### SubjectScheme and other "undeclared" members of the TERMS namespace

It is worth noting that since March 2000, seven classes with URIs based on http://purl.org/dc/terms/ (the "TERMS" namespace) have been used in RDF schemas published by DCMI. These classes were dcterms:DateScheme, dcterms:FormatScheme, dcterms:IdentifierScheme, dcterms:LanguageScheme, dcterms:SpatialScheme, dcterms:SubjectScheme, and dcterms:TypeScheme. These classes were added to the RDF expressions on the basis of "qualfies:" statements (see above) as part of an automatic routine for generating updated documentation for DCMI terms. At the time, the classes served to associate a set of encoding schemes with a particular property (e.g., to associate dcterms:LCSH with dc:subject). Since the terms were never officially declared (outside of their undocumented use in the RDF schemas), DCMI does not consider them to fall under the DCMI Namespace Policy [NAMESPACE]. With the removal of the "qualifies:" statements and the revision of guidelines for expressing Dublin Core metadata in RDF (see above), these undeclared classes will cease to be used in DCMI term declarations.

### New terms related to the DCMI Abstract Model
As described in the revised DCMI Namespace Policy [NAMESPACE], a DCMI namespace has been created as the base URI for terms used in the DCMI Abstract Model (http://purl.org/dc/dcam/, here dcam:). Two new dcam: terms -- dcam:isMemberOf and dcam:VocabularyEncodingScheme -- have been created with the finalization of the revised DCMI Abstract Model as a DCMI Recommendation in June 2007 [DCAM].
### Addition of domains and ranges for existing properties and creation of new properties

A separate document, "Domains and ranges for DCMI properties" [DOMAINS], proposes a vocabulary of classes for use as formal domains and ranges of DCMI properties. Domains and ranges specify -- in a form usable for inferencing -- what kind of described resources and value resources are associated with a given property. The assignment of formal domains and ranges makes the meanings implicit in natural-language definitions available for machine processing. So as not to affect the conformance of existing implementations of Simple Dublin Core in RDF, domains and ranges will not be specified for the fifteen properties of the Dublin Core Metadata Element Set (DCMES), Version 1.1, which are identified by URIs in the DCMI namespace http://purl.org/dc/elements/1.1/ . Rather, the document proposes to define fifteen new properties, which will be identified by URIs in the DCMI namespace http://purl.org/dc/terms/ . Each of the fifteen new properties is to be a subproperty of the corresponding property of the DCMES, and is to be assigned domain and range as outlined in the proposal.

### Subproperty relations between terms in "the Dublin Core"

The original thirteen (later fifteen) elements of "the Dublin Core" were originally intended to serve as a self-contained template for simple descriptions. It was soon noticed that some of the fifteen elements semantically fit within the scope of others, but a typological distinction between "elements" and "qualifiers" made it seem confusing to declare some elements to be subproperties of others. The DCMI Abstract Model no longer makes such a typological distinction, so the current batch of revisions includes assertions of dcterms:creator as a sub-property of dcterms:contributor and of dcterms:source as a sub-property of dcterms:relation. As with the assignment of domains and ranges, so as not to affect the conformance of existing implementations, these assertions are made only for the newly created properties, identified by URIs in the DCMI namespace http://purl.org/dc/terms/ . No such assertions are made for the existing properties of the DCMES.

### Comments deleted

In addition to the Comment for dcterms:title, other Comments were found to be no longer useful and simply deleted (dcterms:audience, dcterms:license dcterms:rightsHolder, dcterms:accrualMethod, dcterms:accrualPeriodicity, dcterms:accrualPolicy).

### Special cases

Editorial revision has sometimes involved deciding among different possible interpretations (e.g., dcterms:educationLevel) and minor clarifications of wording too subtle to merit separate explanations (e.g., dcterms:accessRights). Section 3 lists old and new versions side-by-side so that readers may judge for themselves.

## <a id="sect-3" name="sect-3">3. Revisions, term by term</a>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#creator">http://purl.org/dc/terms/creator</a>
    </th>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/contributor</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#source">http://purl.org/dc/terms/source</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A resource from which the described resource is derived.</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource from which the described resource is derived.</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#coverage">http://purl.org/dc/elements/1.1/coverage</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Spatial topic may be a named place or a location specified by its geographic coordinates. Temporal period may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges. </td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges.</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#language">http://purl.org/dc/elements/1.1/language</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to use a controlled vocabulary such as RFC 3066 [RFC3066].</td>
  </tr>
  <tr>
    <td>Current see also</td>
    <td>http://www.ietf.org/rfc/rfc3066.txt</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646].</td>
  </tr>
  <tr class="new">
    <td>New see also</td>
    <td>http://www.ietf.org/rfc/rfc4646.txt</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#subject">http://purl.org/dc/elements/1.1/subject</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Typically, the topic will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element.</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#title">http://purl.org/dc/elements/1.1/title</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Typically, A Title will be a name by which the resource is formally known.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#audience">http://purl.org/dc/terms/audience</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>A class of entity may be determined by the creator or the publisher or by a third party.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#alternative">http://purl.org/dc/terms/alternative</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Alternative</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Any form of the title used as a substitute or alternative to the formal title of the resource.</td>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>This qualifier can include Title abbreviations as well as translations.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/title</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Alternative Title</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>An alternative name for the resource.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>The distinction between titles and alternative titles is application-specific.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/title</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#tableOfContents">http://purl.org/dc/terms/tableOfContents</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A list of subunits of the content of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/description</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A list of subunits of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/description</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#abstract">http://purl.org/dc/terms/abstract</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A summary of the content of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/description</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A summary of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/description</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#created">http://purl.org/dc/terms/created</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Created</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Date Created</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#valid">http://purl.org/dc/terms/valid</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Valid</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Date Valid</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#available">http://purl.org/dc/terms/available</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Available</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Date (often a range) that the resource will become or did become available.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Date Available</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Date (often a range) that the resource became or will become available.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#issued">http://purl.org/dc/terms/issued</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Issued</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Date Issued</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#modified">http://purl.org/dc/terms/modified</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Modified</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Date Modified</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#extent">http://purl.org/dc/terms/extent</a>
    </th>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/format</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/format</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#medium">http://purl.org/dc/terms/medium</a>
    </th>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/format</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/format</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isVersionOf">http://purl.org/dc/terms/isVersionOf</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is a version, edition, or adaptation of the referenced resource. Changes in version imply substantive changes in content rather than differences in format.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource of which the described resource is a version, edition, or adaptation.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Changes in version imply substantive changes in content rather than differences in format.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#hasVersion">http://purl.org/dc/terms/hasVersion</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource has a version, edition, or adaptation, namely, the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is a version, edition, or adaptation of the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isReplacedBy">http://purl.org/dc/terms/isReplacedBy</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is supplanted, displaced, or superseded by the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that supplants, displaces, or supersedes the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#replaces">http://purl.org/dc/terms/replaces</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource supplants, displaces, or supersedes the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is supplanted, displaced, or superseded by the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isRequiredBy">http://purl.org/dc/terms/isRequiredBy</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is required by the referenced resource, either physically or logically.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that requires the described resource to support its function, delivery, or coherence.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#requires">http://purl.org/dc/terms/requires</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource requires the referenced resource to support its function, delivery, or coherence of content.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is required by the described resource to support its function, delivery, or coherence.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isPartOf">http://purl.org/dc/terms/isPartOf</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is a physical or logical part of the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource in which the described resource is physically or logically included.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#hasPart">http://purl.org/dc/terms/hasPart</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource includes the referenced resource either physically or logically.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is included either physically or logically in the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isReferencedBy">http://purl.org/dc/terms/isReferencedBy</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is referenced, cited, or otherwise pointed to by the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that references, cites, or otherwise points to the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#references">http://purl.org/dc/terms/references</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource references, cites, or otherwise points to the referenced resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is referenced, cited, or otherwise pointed to by the described resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#isFormatOf">http://purl.org/dc/terms/isFormatOf</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource is the same intellectual content of the referenced resource, but presented in another format.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is substantially the same as the described resource, but in another format.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#hasFormat">http://purl.org/dc/terms/hasFormat</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The described resource pre-existed the referenced resource, which is essentially the same intellectual content presented in another format.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A related resource that is substantially the same as the pre-existing described resource, but in another format.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#conformsTo">http://purl.org/dc/terms/conformsTo</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A reference to an established standard to which the resource conforms.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>An established standard to which the resource conforms.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/relation</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#spatial">http://purl.org/dc/terms/spatial</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Spatial</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Spatial characteristics of the intellectual content of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/coverage</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Spatial Coverage</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Spatial characteristics of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/coverage</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#temporal">http://purl.org/dc/terms/temporal</a>
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Temporal</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Temporal characteristics of the intellectual content of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/coverage</td>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>Temporal Coverage</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Temporal characteristics of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/coverage</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#mediator">http://purl.org/dc/terms/mediator</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>The audiences for a resource are of two basic classes: (1) an ultimate beneficiary of the resource, and (2) frequently, an entity that mediates access to the resource. The mediator element refinement represents the second of these two classes.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#dateAccepted">http://purl.org/dc/terms/dateAccepted</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Date of acceptance of the resource (e.g. of thesis by university department, of article by journal, etc.).</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Date of acceptance of the resource.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Examples of resources to which a Date Accepted may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#dateCopyrighted">http://purl.org/dc/terms/dateCopyrighted</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Date of a statement of copyright.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Date of copyright.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#dateSubmitted">http://purl.org/dc/terms/dateSubmitted</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Date of submission of the resource (e.g. thesis, articles, etc.).</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>Date of submission of the resource.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Examples of resources to which a Date Submitted may be relevant are a thesis (submitted to a university department) or an article (submitted to a journal).</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/date</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#educationLevel">http://purl.org/dc/terms/educationLevel</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A general statement describing the education or training context. Alternatively, a more specific statement of the location of the audience in terms of its progression through an education or training context.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A class of entity, defined in terms of progression through an educational or training context, for whom the resource is intended.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#accessRights">http://purl.org/dc/terms/accessRights</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Access Rights may include information regarding access or restrictions based on privacy, security or other regulations.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/rights</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Access Rights may include information regarding access or restrictions based on privacy, security or other policies.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/rights</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#bibliographicCitation">http://purl.org/dc/terms/bibliographicCitation</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible, whether or not the citation is in a standard form.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/identifier</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/identifier</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#license">http://purl.org/dc/terms/license</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to identify the license using a URI. Examples of such licenses can be found at http://creativecommons.org/licenses/.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element-refinement</td>
  </tr>
  <tr>
    <td>Current subPropertyOf</td>
    <td>http://purl.org/dc/elements/1.1/rights</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
  <tr class="new">
    <td>New subPropertyOf</td>
    <td>http://purl.org/dc/terms/rights</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#rightsHolder">http://purl.org/dc/terms/rightsHolder</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#provenance">http://purl.org/dc/terms/provenance</a>
    </th>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#instructionalMethod">http://purl.org/dc/terms/instructionalMethod</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A process, used to engender knowledge, attitudes and skills, that the resource is designed to support.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#accrualMethod">http://purl.org/dc/terms/accrualMethod</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to use a value from a controlled vocabulary.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#accrualPeriodicity">http://purl.org/dc/terms/accrualPeriodicity</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to use a value from a controlled vocabulary.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#accrualPolicy">http://purl.org/dc/terms/accrualPolicy</a>
    </th>
  </tr>
  <tr>
    <td>Current comment</td>
    <td>Recommended best practice is to use a value from a controlled vocabulary.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#element</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>[comment deleted]</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#LCSH">http://purl.org/dc/terms/LCSH</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Library of Congress Subject Headings</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by Library of Congress Subject Headings.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#MESH">http://purl.org/dc/terms/MESH</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Medical Subject Headings</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by Medical Subject Headings.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#DDC">http://purl.org/dc/terms/DDC</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Dewey Decimal Classification</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by Dewey Decimal Classification.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#LCC">http://purl.org/dc/terms/LCC</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Library of Congress Classification</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by Library of Congress Classification.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#UDC">http://purl.org/dc/terms/UDC</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Universal Decimal Classification </td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by Universal Decimal Classification.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#DCMIType">http://purl.org/dc/terms/DCMIType</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A list of types used to categorize the nature or genre of the content of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/type</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A set of concepts used to categorize the nature or genre of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#IMT">http://purl.org/dc/terms/IMT</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The Internet media type of the resource.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/format</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>A set of concepts defined by IANA used to indicate the media type of the resource.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#ISO639-2">http://purl.org/dc/terms/ISO639-2</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>ISO 639-2: Codes for the representation of names of languages.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/language</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of three-letter codes listed in ISO639-2 for the representation of names of languages.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#RFC1766">http://purl.org/dc/terms/RFC1766</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Internet RFC 1766 'Tags for the identification of Language' specifies a two letter code taken from ISO 639, followed optionally by a two letter country code taken from ISO 3166.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/language</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of tags, constructed according to RFC 1766, for the identification of languages.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#URI">http://purl.org/dc/terms/URI</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A URI Uniform Resource Identifier</td>
  </tr>
  <tr>
    <td>Current see also</td>
    <td>http://www.ietf.org/rfc/rfc2396.txt</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/identifier</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/source</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/relation</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as defined by the IETF.</td>
  </tr>
  <tr class="new">
    <td>New see also</td>
    <td>http://www.ietf.org/rfc/rfc3986.txt</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#Point">http://purl.org/dc/terms/Point</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The DCMI Point identifies a point in space using its geographic coordinates.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/spatial</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#ISO3166">http://purl.org/dc/terms/ISO3166</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>ISO 3166 Codes for the representation of names of countries</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/spatial</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of codes listed in ISO 3166-1 for the representation of names of countries.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#Box">http://purl.org/dc/terms/Box</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The DCMI Box identifies a region of space using its geographic limits.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/spatial</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#TGN">http://purl.org/dc/terms/TGN</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>The Getty Thesaurus of Geographic Names</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/spatial</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of places defined by the Getty Thesaurus of Geographic Names.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#Period">http://purl.org/dc/terms/Period</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A specification of the limits of a time interval.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/temporal</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#W3CDTF">http://purl.org/dc/terms/W3CDTF</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>W3C Encoding rules for dates and times - a profile based on ISO 8601</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/date</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/terms/temporal</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of dates and times constructed according to the W3C Date and Time Formats Specification.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#RFC3066">http://purl.org/dc/terms/RFC3066</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>Internet RFC 3066 'Tags for the Identification of Languages' specifies a primary subtag which is a two-letter code taken from ISO 639 part 1 or a three-letter code taken from ISO 639 part 2, followed optionally by a two-letter country code taken from ISO 3166. When a language in ISO 639 has both a two-letter and three-letter code, use the two-letter code; when it has only a three-letter code, use the three-letter code. This RFC replaces RFC 1766.</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/language</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of tags, constructed according to RFC 3066, for the identification of languages.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>RFC 3066 has been obsoleted by RFC 4646.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      <a href="http://dublincore.org/documents/dcmi-terms/#NLM">http://purl.org/dc/terms/NLM</a>
    </th>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>National Library of Medicine Classification</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://dublincore.org/usage/documents/principles/#encoding-scheme</td>
  </tr>
  <tr>
    <td>Current "qualifies"</td>
    <td>http://purl.org/dc/elements/1.1/subject</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of concepts defined by the National Library of Medicine Classification.</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://purl.org/dc/dcam/VocabularyEncodingScheme</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      http://purl.org/dc/terms/RFC4646
    </th>
  </tr>
  <tr class="new">
    <td>New label</td>
    <td>RFC 4646</td>
  </tr>
  <tr class="new">
    <td>New definition</td>
    <td>The set of tags, constructed according to RFC 4646, for the identification of languages.</td>
  </tr>
  <tr class="new">
    <td>New comment</td>
    <td>RFC 4646 obsoletes RFC 3066.</td>
  </tr>
  <tr class="new">
    <td>New see also</td>
    <td>http://www.ietf.org/rfc/rfc4646.txt</td>
  </tr>
  <tr class="new">
    <td>New type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Datatype</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      http://purl.org/dc/dcam/memberOf
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Member Of</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set.</td>
  </tr>
  <tr>
    <td>Current see also</td>
    <td>http://dublincore.org/documents/2007/06/04/abstract-model/</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</td>
  </tr>
</table>
<table class="border new termdesc" cellspacing="0" summary="Term description">
  <tr>
    <th colspan="2">
      http://purl.org/dc/dcam/VocabularyEncodingScheme
    </th>
  </tr>
  <tr>
    <td>Current label</td>
    <td>Vocabulary Encoding Scheme</td>
  </tr>
  <tr>
    <td>Current definition</td>
    <td>An enumerated set of resources.</td>
  </tr>
  <tr>
    <td>Current see also</td>
    <td>http://dublincore.org/documents/2007/06/04/abstract-model/</td>
  </tr>
  <tr>
    <td>Current type of term</td>
    <td>http://www.w3.org/2000/01/rdf-schema#Class</td>
  </tr>
</table>

## <a id="ref" name="ref">References</a>
<a id="DCAM" name="DCAM"></a>

**[DCAM]**  
Powell, Andy, Mikael Nilsson, Ambjörn Naeve, Pete Johnston and Thomas Baker. DCMI Abstract Model. DCMI Proposed Recommendation. February 2007.  
< [http://dublincore.org/documents/2007/02/05/abstract-model/](http://dublincore.org/documents/2007/02/05/abstract-model/)>

<a id="DC-RDF" name="DC-RDF">[DC-RDF]</a>

[http://dublincore.org/documents/dc-rdf/](/documents/dc-rdf/)

<a id="DC-RDF-NOTES" name="DC-RDF-NOTES">[DC-RDF-NOTES]</a>

[http://dublincore.org/documents/dc-rdf-notes/](/documents/dc-rdf-notes/)

<a id="DCMES-CHANGES" name="DCMES-CHANGES">[DCMES-CHANGES]</a>

[http://dublincore.org/usage/decisions/2006/2006-03.dcmes-changes.shtml](/usage/decisions/2006/2006-03.dcmes-changes.shtml)

<a id="DCTERMS" name="DCTERMS">[DCTERMS]</a>

[http://dublincore.org/documents/dcmi-terms/](/documents/dcmi-terms/)

<a id="DCTERMS-HISTORY" name="DCTERMS-HISTORY">[DCTERMS-HISTORY]</a>

[http://dublincore.org/usage/terms/history/](/usage/terms/history/)

<a id="DCQ-RDF" name="DCQ-RDF">[DCQ-RDF]</a>

[http://dublincore.org/documents/2002/05/15/dcq-rdf-xml/](/documents/2002/05/15/dcq-rdf-xml/)

<a id="DOMAINS" name="DOMAINS">[DOMAINS]</a>

[http://dublincore.org/documents/2007/07/02/domain-range/](/documents/2007/07/02/domain-range/)

<a id="NAMESPACE" name="NAMESPACE">[NAMESPACE]</a>

[http://dublincore.org/documents/dcmi-namespace/](/documents/dcmi-namespace/)

<a id="NISOZ39-85" name="NISOZ39-85">[NISOZ39-85]</a>

[http://www.niso.org/standards/resources/Z39-85-2007.pdf](http://www.niso.org/standards/resources/Z39-85-2007.pdf)

<a id="QUALIFIERS" name="QUALIFIERS">[QUALIFIERS]</a> [http://dublincore.org/documents/2000/07/11/dcmes-qualifiers/](/documents/2000/07/11/dcmes-qualifiers/)

Errata 2007-11-20: corrected URI displayed as Identifier (was incorrectly shown as http://dublincore.org/usage/public-comment/documents/2007/07/dcterms-changes/; URI for href was already correct). Corrected broken "li" tags in section "Encoding scheme definitions".

<!--#include virtual="/ssi/footer.shtml" -->

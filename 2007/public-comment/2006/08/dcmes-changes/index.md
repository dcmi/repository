---
title: Public Comment on editorial changes to terms in the DCMES
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/usage/public-comment/2006/08/dcmes-changes/index.shtml"
---

<!--#include virtual="/ssi/header.shtml" --><pre>
Title: Public Comment on editorial changes to terms in 
              the Dublin Core Metadata Element Set (DCMES)
Identifier: <a href="/usage/public-comment/2006/08/dcmes-changes/">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/</a>
Date: 2006-08-28

In this document, the DCMI Usage Board proposes changes of
wording to labels, definitions, and comments of terms in the
Dublin Core Metadata Element Set (DCMES). These changes will
be posted for Public Comment from 28 August to 25 September
2006. Any comments received will be discussed at a Usage
Board meeting in Colima, Mexico, on 30 September 2006.

Originally formulated from 1994 to 1996 and revised in 1999 as
DCMES Version 1.1, this term set is the basis for the formal
standards NISO Z39.85-2001 [NISO] and ISO Standard 15836-2003
[ISO]. The base document used for the changes proposed here is
the consolidated DCMI terms document of June 2005 [DCMITERMS].

The changes proposed here reflect lessons learned from
many years of user feedback and implementation experience.
The Usage Board has edited definitions and comments to bring
their language into line with that of the DCMI Abstract Model,
which was published in March 2005 as a DCMI Recommendation
[DAM].

All of the changes were evaluated by the DCMI Usage Board in
light of the DCMI Namespace Policy [NAMESPACE]. The namespace
policy says that DCMI terms are identified using Uniform
Resource Identifiers (URIs). In accordance with the principle
that distinct URIs should be assigned to distinct resources,
the policy sets limits on the range of editorial changes that
may allowably be made to the official labels, definitions,
and usage comments associated with DCMI terms. By policy, any
changes of meaning judged "likely to have a substantial impact
on either machine processing of DCMI terms or the functional
semantics of the terms" must trigger the creation of a new,
distinct term with a new, distinct URI.

In the opinion of the Usage Board, the changes described in
this document are all unlikely to have a substantial impact
on either machine processing of DCMI terms or the functional
semantics of the terms -- i.e., they fall within the allowable
range of editorial change. Rather, the changes constitute
clarifications of term semantics in light of improved
theoretical understanding and implementation experience.
They provide the final twist of the lens that brings intended
meanings more sharply into focus.

1. General categories of change

1.1. Replacement of the phrase "the content of the
     resource" (or "intellectual content of the resource")
     with "the resource".
 
     Implementation experience has shown the semantic
     distinction between a resource and the "content of"
     a resource to be a source of confusion.
 
     According to the DCMI Abstract Model, a DCMI metadata
     description "describes one, and only one, resource"
     [DAM]. In the DCMI context, this principle dates
     back to 1997, when it was known as the "one-to-one
     principle". When the one-to-one principle is
     correctly followed, the semantic restriction to
     "the content of" a resource is in effect redundant.

     Moreover, Dublin Core elements are used to describe
     things other than document-like resources -- things such
     as physical objects and abstract concepts. For example,
     a stuffed animal has a Creator (perhaps a taxidermist, 
     or an artist) but that person is not specifically the 
     creator of "the content of" the stuffed animal. In light 
     of current usage, the meaning of the original distinction 
     between a resource and its content is no longer clear.

     In the opinion of the Usage Board, dropping the words
     "the content of" from definitions affirms the semantics of
     these terms as they have been understood in practice and
     with no significant practical impact on implementation.

     This change is relevant to the definitions of Contributor,
     Creator, Coverage, Description, Subject, Type, and
     Language.

1.2. Replacement of the phrase "a reference to a resource"
     with "a resource".

     In metadata, a related resource can be "referred to" only
     by means of a "reference", whether that reference is a
     text description or a formal identifier. The extra words
     are therefore redundant. The recommendation that formal
     identifiers be used is retained as part of the Comments.

     This change is relevant to the definitions of Source
     and Relation and to the comment for Description.

1.3. Replacement of the phrase "use a value from an
     encoding scheme" with "use an encoding scheme".

     The proposed wording is more concise and conforms more
     closely with the language of the DCMI Abstract Model.

     This change is relevant to the comments for Coverage,
     Format, Subject, and Type.

1.4. Replacement of the phrase "use a value from a controlled
     vocabulary" with "use a controlled vocabulary".

     The proposed wording is more concise and conforms more
     closely with the language of the DCMI Abstract Model.

     This change is relevant to the comments for Type, Format,
     and Coverage.

1.5. Replacement of the phrase "a string or number conforming
     to a formal identification system" with "a string conforming
     to a formal identification system".
 
     A number is also a string, so the words "or number"
     are redundant.
 
     This change is relevant to the comments for Identifier,
     Relation, and Source.

1.6. Deletion of word "Resource" from the labels "Resource 
     Type" and "Resource Identifier".

     In the DCMI context, the terms Type and Identifier are the
     only two to have used the qualifier "resource" in their
     labels. For example, Title is not called "Resource Title"
     and Date not "Resource Date". The Usage Board proposes
     to correct this by dropping the unnecessary reference to
     "resource" in the labels of Type and Identifier. This 
     change will also bring the labels of the elements ("Type" 
     and "Identifier") in line with their names ("type" and 
     "identifier").

2. Changes to specific elements

2.1. Format    

     The definition of Format as "The physical or digital
     manifestation of the resource" has been a source
     of confusion. For example, it is sometimes
     misinterpreted as referring to a related resource
     -- one that is a "manifestation" in the sense of
     Functional Requirements for Bibliographic Records
     (FRBR).

     The proposed wording -- "The file format, physical
     medium, or dimensions of the resource" -- moves
     words from the original comment for Format into
     the definition in order to describe the intended
     meaning more concretely.

2.2. Type      

     The definition of Type as "The nature or genre of
     the content of the resource" was found to be
     unhelpfully vague. As with Format, words from the 
     original comment were used to formulate the definition:
     "The genre, functional category, or aggregation level 
     of the resource.

     The Usage Board will be particularly interested
     to hear of implementations of Type that do not fit
     into the scope of "genres, functional categories,
     or aggregation levels".

2.3. Rights    

     As proposed, the definition remains unchanged as
     "Information about rights held in and over the resource".

     However, the Usage Board proposes that several
     long-recognized problems be corrected:

     -- That the label be changed from "Rights Management"
        to "Rights". The reference to "management" has more
        to do with possible uses of the element than with
        the substance of the element itself. This change
        also brings the label of the element ("Rights") in
        line with its name ("rights").

     -- The existing comment refers both to a "statement"
        and to a reference to a "service" that provides
        such a statement. The Usage Board sees this as an
        implementation issue best removed from the comment.
     
     -- The qualification that "no assumptions may be made"
        if the element is absent was removed from the comment.
        The point is inappropriate because it implies that 
        the element can only be used (or not) as part of a 
        fixed element set.

2.4. Coverage  

     The scope and purpose of Coverage has been a topic of
     much discussion and interpretation. The wordings proposed
     by the Usage Board address several issues:

     -- Use of the word "extent" in the definition.

        The use of "extent" in Coverage has caused confusion
        with respect to Format (the comment of which refers to
        "dimensions" such as "size" and "duration") and to
        the term Extent -- a refinement of Format defined as
        "The size or duration of the resource".

        The proposed definition replaces the ambiguous
        phrase "extent or scope of the content of the resource"
        with "spatial or temporal topic of the resource".

     -- Reference in the comment to "jurisdiction".

        The notion of "jurisdiction" entered into the
        scope of Coverage at an early date as part of the
        comment and has informed a significant number of
        implementations. The Usage Board proposes to make
        this meaning explicit by referring to "jurisdiction"
        in the definition itself, hence the definition:
        "The spatial or temporal topic of the resource, or
        the jurisdiction under which the resource is relevant".

2.5. Subject   

     Two changes are proposed:

     -- Change of label from "Subject and Keywords" to
        "Subject". It continues to be acknowledged in the
        comment that a subject may be expressed with keywords.
        This change also brings the label of the element 
        ("Subject") in line with its name ("subject").

     -- In the comment, advice that the Coverage element
        be used to describe the spatial or temporal topic
        of the resource.

2.6. Language  

     Six of the fifteen elements of DCMES -- Type, Format,
     Coverage, Subject, Language, and Date -- are recommended
     to be used with encoding schemes. Only in the cases of
     Language and Date, however, did the comments prescribe
     specific encoding schemes.

     In current DCMI practice, the prescription of encoding
     schemes is seen as being more properly the role of
     an application profile, not of a term declaration.
     The Usage Board therefore proposes to amend the comment to
     reflect this, while retaining references to two encoding
     schemes as examples. Hence: "Recommended best practice
     is to use an encoding scheme, such as RFC 3066 [RFC3066]
     or ISO 639-2 [ISO639]".

2.7. Date

     As for Language [see Section 2.6], the Usage Board
     proposes to change the reference to a specific encoding
     scheme in the comment from "recommended best practice"
     to the status of an example. Hence: "Recommended best
     practice is to use an encoding scheme, such as the W3CDTF
     profile of ISO 8601 [W3CDTF]".

     The intended scope of the Date element has been the object
     of much discussion in the DCMI community. In practice,
     Date has long been interpreted to include the notion of
     a date range. The release in July 2000 of a first set
     of "Dublin Core qualifiers", which included Available,
     defined as referring to a "date (often a range)",
     consolidated this interpretation. The Usage Board now
     proposes to bring the definition of Date into line
     with this long-standing practical interpretation by
     explicitly allowing date ranges. Hence: "A point or
     period of time associated with an event in the lifecycle
     of the resource."

[DAM] <a href="/documents/abstract-model/">http://dublincore.org/documents/abstract-model/</a>
[DCMITERMS] <a href="/documents/2005/06/13/dcmi-terms/">http://dublincore.org/documents/2005/06/13/dcmi-terms/</a>
[ISO] <a href="http://www.niso.org/international/SC4/n515.pdf">http://www.niso.org/international/SC4/n515.pdf</a>
[NAMESPACE] <a href="/documents/dcmi-namespace/">http://dublincore.org/documents/dcmi-namespace/</a>
[NISO] <a href="http://www.niso.org/standards/resources/Z39-85.pdf">http://www.niso.org/standards/resources/Z39-85.pdf</a>

3. Proposed changes

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/coverage">http://purl.org/dc/elements/1.1/coverage</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#coverage">http://dublincore.org/documents/2005/06/13/dcmi-terms/#coverage</a>

    OLD&gt; Label: Coverage
    OLD&gt; Definition: The extent or scope of the content of the 
    OLD&gt; resource.
    OLD&gt; Comment: Coverage will typically include spatial
    OLD&gt; location (a place name or geographic
    OLD&gt; coordinates), temporal period (a period label,
    OLD&gt; date, or date range) or jurisdiction (such as a
    OLD&gt; named administrative entity). Recommended best
    OLD&gt; practice is to select a value from a controlled
    OLD&gt; vocabulary (for example, the Thesaurus of
    OLD&gt; Geographic Names [TGN]) and that, where
    OLD&gt; appropriate, named places or time periods be
    OLD&gt; used in preference to numeric identifiers such
    OLD&gt; as sets of coordinates or date ranges.

    NEW&gt; Documented at: <a name="coverage" href="/usage/public-comment/2006/08/dcmes-changes/#coverage">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#coverage</a>

    NEW&gt; Label: Coverage
    NEW&gt; Definition: The spatial or temporal topic of the resource, or 
    NEW&gt; the jurisdiction under which the resource is relevant.
    NEW&gt; Comment: Spatial topic may be a named place or a location 
    NEW&gt; specified by its geographic coordinates. Temporal
    NEW&gt; period may be a named period, date, or date
    NEW&gt; range. A jurisdiction may be a named administrative
    NEW&gt; entity. Recommended best practice is to use a 
    NEW&gt; a controlled vocabulary such as the Thesaurus of
    NEW&gt; Geographic Names [TGN]). Where appropriate, named 
    NEW&gt; places or time periods can be used in preference
    NEW&gt; to numeric identifiers such as sets of coordinates
    NEW&gt; or date ranges.

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
    -- In comment, replaces "use a value from an encoding scheme" with "use an 
       encoding scheme" [see Section 1.3]
    -- In comment, replaces the phrase "use a value from a controlled 
       vocabulary" with "use a controlled vocabulary" [see Section 1.4]
    -- In definition, replaced ambiguous phrase "extent or scope of 
       the content of the resource" with "spatial or temporal topic of 
       the resource" [see Section 2.4]
    -- In definition, added reference to "jurisdiction", hitherto 
       mentioned only in the comment [see Section 2.4]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#description">http://dublincore.org/documents/2005/06/13/dcmi-terms/#description</a>

    OLD&gt; Label: Description
    OLD&gt; Definition: An account of the content of the resource.
    OLD&gt; Comment: Description may include but is not limited 
    OLD&gt; to: an abstract, table of contents, reference
    OLD&gt; to a graphical representation of content or a
    OLD&gt; free-text account of the content.

    NEW&gt; Documented at: <a name="description" href="/usage/public-comment/2006/08/dcmes-changes/#description">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#description</a>

    NEW&gt; Label: Description
    NEW&gt; Definition: An account of the resource.
    NEW&gt; Comment: Description may include but is not limited to:
    NEW&gt; an abstract, a table of contents, a graphical
    NEW&gt; representation, or a free-text account of
    NEW&gt; the resource.

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
    -- In comment, replaces "a reference to a resource" with "resource" 
       [see Section 1.2]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/contributor">http://purl.org/dc/elements/1.1/contributor</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#contributor">http://dublincore.org/documents/2005/06/13/dcmi-terms/#contributor</a>

    OLD&gt; Label: Contributor
    OLD&gt; Definition: An entity primarily responsible for making 
    OLD&gt; contributions to the content of the resource.
    OLD&gt; Comment: Examples of a Contributor include a person,
    OLD&gt; an organisation, or a service. Typically, the
    OLD&gt; name of a Contributor should be used to indicate
    OLD&gt; the entity.

    NEW&gt; Documented at: <a name="contributor" href="/usage/public-comment/2006/08/dcmes-changes/#contributor">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#contributor</a>

    NEW&gt; Label: Contributor
    NEW&gt; Definition: An entity primarily responsible for making
    NEW&gt; contributions to the resource.
    NEW&gt; Comment: Examples of a Contributor include a person,
    NEW&gt; an organisation, or a service. Typically, the
    NEW&gt; name of a Contributor should be used to indicate
    NEW&gt; the entity.

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#creator">http://dublincore.org/documents/2005/06/13/dcmi-terms/#creator</a>

    OLD&gt; Label: Creator
    OLD&gt; Definition: An entity primarily responsible for making 
    OLD&gt; the content of the resource.
    OLD&gt; Comment: Examples of a Creator include a person, an
    OLD&gt; organisation, or a service. Typically, the name
    OLD&gt; of a Creator should be used to indicate the entity.

    NEW&gt; Documented at: <a name="creator" href="/usage/public-comment/2006/08/dcmes-changes/#creator">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#creator</a>

    NEW&gt; Label: Creator
    NEW&gt; Definition: An entity primarily responsible for making 
    NEW&gt; the resource.
    NEW&gt; Comment: Examples of a Creator include a person, an
    NEW&gt; organisation, or a service. Typically, the name
    NEW&gt; of a Creator should be used to indicate the entity.

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#identifier">http://dublincore.org/documents/2005/06/13/dcmi-terms/#identifier</a>

    OLD&gt; Label: Resource Identifier
    OLD&gt; Definition: An unambiguous reference to the resource within
    OLD&gt; a given context.
    OLD&gt; Comment: Recommended best practice is to identify the
    OLD&gt; resource by means of a string or number conforming
    OLD&gt; to a formal identification system. Formal
    OLD&gt; identification systems include but are not
    OLD&gt; limited to the Uniform Resource Identifier (URI)
    OLD&gt; (including the Uniform Resource Locator (URL)),
    OLD&gt; the Digital Object Identifier (DOI) and the
    OLD&gt; International Standard Book Number (ISBN).

    NEW&gt; Documented at: <a name="identifier" href="/usage/public-comment/2006/08/dcmes-changes/#identifier">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#identifier</a>

    NEW&gt; Label: Identifier
    OLD&gt; Definition: An unambiguous reference to the resource within
    OLD&gt; a given context.
    NEW&gt; Comment: Recommended best practice is to identify the
    NEW&gt; resource by means of a string conforming
    NEW&gt; to a formal identification system. 

    Changes proposed:
    -- Definition unchanged.
    -- In comment, replaces "a string or number conforming to a formal 
       identification system" with "a string conforming to a formal 
       identification system" [see Section 1.5]
    -- In label, changed "Resource Identifier" to "Identifier" [see Section 1.6]
    -- In comment, changed punctuation [see also Relation and Source].
    -- In comment, deleted references to URI, URL, DOI, and ISBN

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#format">http://dublincore.org/documents/2005/06/13/dcmi-terms/#format</a>

    OLD&gt; Label: Format
    OLD&gt; Definition: The physical or digital manifestation of 
    OLD&gt; the resource.
    OLD&gt; Comment: Typically, Format may include the media-type 
    OLD&gt; or dimensions of the resource. Format may be
    OLD&gt; used to identify the software, hardware or
    OLD&gt; other equipment needed to display or operate
    OLD&gt; the resource. Examples of dimensions include
    OLD&gt; size and duration. Recommended best practice is
    OLD&gt; to select a value from a controlled vocabulary
    OLD&gt; (for example, the list of Internet Media Types
    OLD&gt; [MIME] defining computer media formats).

    NEW&gt; Documented at: <a name="format" href="/usage/public-comment/2006/08/dcmes-changes/#format">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#format</a>

    NEW&gt; Label: Format
    NEW&gt; Definition: The file format, physical medium, or dimensions
    NEW&gt; of the resource.
    NEW&gt; Comment: Examples of dimensions include
    NEW&gt; size and duration. Recommended best practice is
    NEW&gt; to use a controlled vocabulary such as the list
    NEW&gt; of Internet Media Types [MIME].

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
    -- In comment, replaces "use a value from an encoding scheme" with "use an 
       encoding scheme" [see Section 1.3]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#language">http://dublincore.org/documents/2005/06/13/dcmi-terms/#language</a>

    OLD&gt; Label: Language
    OLD&gt; Definition: A language of the intellectual content of 
    OLD&gt; the resource.
    OLD&gt; Comment: Recommended best practice is to use RFC 3066
    OLD&gt; [RFC3066], which, in conjunction with ISO 639
    OLD&gt; [ISO639], defines two- and three-letter primary
    OLD&gt; language tags with optional subtags. Examples
    OLD&gt; include "en" or "eng" for English, "akk" for
    OLD&gt; Akkadian, and "en-GB" for English used in the
    OLD&gt; United Kingdom.

    NEW&gt; Documented at: <a name="language" href="/usage/public-comment/2006/08/dcmes-changes/#language">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#language</a>

    NEW&gt; Label: Language
    NEW&gt; Definition: A language of the resource.
    NEW&gt; Comment: Recommended best practice is to use an encoding 
    NEW&gt; scheme, such as RFC 3066 [RFC3066] or ISO 
    NEW&gt; 639-2 [ISO639].

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
       Definitions of Contributor, Creator, Coverage, Description, Subject, Type, Language
    -- In comment, changed references to encoding schemes from "recommended 
       best practice" to the status of examples [see Section 2.6]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/relation">http://purl.org/dc/elements/1.1/relation</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#relation">http://dublincore.org/documents/2005/06/13/dcmi-terms/#relation</a>

    OLD&gt; Label: Relation
    OLD&gt; Definition: A reference to a related resource.
    OLD&gt; Comment: Recommended best practice is to identify the resource by means
    OLD&gt; of a string or number conforming to a formal identification
    OLD&gt; system. Formal identification systems include but are not
    OLD&gt; limited to the Uniform Resource Identifier (URI) (including the
    OLD&gt; Uniform Resource Locator (URL)), the Digital Object Identifier
    OLD&gt; (DOI) and the International Standard Book Number (ISBN).

    NEW&gt; Documented at: <a name="relation" href="/usage/public-comment/2006/08/dcmes-changes/#relation">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#relation</a>

    NEW&gt; Label: Relation
    NEW&gt; Definition: A related resource.
    NEW&gt; Comment: Recommended best practice is to identify the
    NEW&gt; related resource by means of a string conforming
    NEW&gt; to a formal identification system. 

    Changes proposed:
    -- In definition, replaces "a reference to a resource" with "resource" 
       [see Section 1.2]
    -- In comment, replaces "a string or number conforming to a formal 
       identification system" with "a string conforming to a formal 
       identification system" [see Section 1.5]
    -- In comment, changed punctuation [see also Identifier and Source].
    -- In comment, deleted references to URI, URL, DOI, and ISBN

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#rights">http://dublincore.org/documents/2005/06/13/dcmi-terms/#rights</a>

    OLD&gt; Label: Rights Management
    OLD&gt; Definition: Information about rights held in and 
    OLD&gt; over the resource.
    OLD&gt; Comment: Typically, Rights will contain a rights management
    OLD&gt; statement for the resource, or reference a service
    OLD&gt; providing such information. Rights information
    OLD&gt; often encompasses Intellectual Property Rights
    OLD&gt; (IPR), Copyright, and various Property Rights. If
    OLD&gt; the Rights element is absent, no assumptions may be
    OLD&gt; made about any rights held in or over the resource.

    NEW&gt; Documented at: <a name="rights" href="/usage/public-comment/2006/08/dcmes-changes/#rights">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#rights</a>

    NEW&gt; Label: Rights
    NEW&gt; Definition: Information about rights held in and 
    NEW&gt; over the resource.
    NEW&gt; Comment: Typically, rights information includes 
    NEW&gt; a statement about various property rights 
    NEW&gt; associated with the resource, including 
    NEW&gt; intellectual property rights.

    Changes proposed:
    -- Definition is unchanged
    -- Label changed from "Rights Management" to "Rights" [see Section 2.3]
    -- In comment, deleted reference to a "service providing information
       [see Section 2.3]
    -- In comment, deleted qualification that "no assumptions may be made"
       if the element is absent [see Section 2.3]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/source">http://purl.org/dc/elements/1.1/source</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#source">http://dublincore.org/documents/2005/06/13/dcmi-terms/#source</a>

    OLD&gt; Label: Source
    OLD&gt; Definition: A Reference to a resource from which the 
    OLD&gt; present resource is derived.
    OLD&gt; Comment: The present resource may be derived from 
    OLD&gt; the Source resource in whole or in part. 
    OLD&gt; Recommended best practice is to identify the
    OLD&gt; referenced resource by means of a string or number
    OLD&gt; conforming to a formal identification system.

    NEW&gt; Documented at: <a name="source" href="/usage/public-comment/2006/08/dcmes-changes/#source">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#source</a>

    NEW&gt; Label: Source
    NEW&gt; Definition: A related resource from which the described 
    NEW&gt; resource is derived.
    NEW&gt; Comment: The described resource may be derived from the
    NEW&gt; related resource in whole or in part. Recommended
    NEW&gt; best practice is to identify the related resource
    NEW&gt; by means of a string conforming to a formal
    NEW&gt; identification system.

    Applicable:
    -- In definition, replaces "a reference to a resource" with "resource" 
       [see Section 1.2]
    -- In comment, replaces "a string or number conforming to a formal 
       identification system" with "a string conforming to a formal 
       identification system" [see Section 1.5]
    -- In comment, changed punctuation [see also Identifier and Relation]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#subject">http://dublincore.org/documents/2005/06/13/dcmi-terms/#subject</a>

    OLD&gt; Label: Subject and Keywords
    OLD&gt; Definition: The topic of the content of the resource.
    OLD&gt; Comment: Typically, a Subject will be expressed as keywords,
    OLD&gt; key phrases or classification codes that describe
    OLD&gt; a topic of the resource. Recommended best practice
    OLD&gt; is to select a value from a controlled vocabulary
    OLD&gt; or formal classification scheme.

    NEW&gt; Documented at: <a name="subject" href="/usage/public-comment/2006/08/dcmes-changes/#subject">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#subject</a>

    NEW&gt; Label: Subject
    NEW&gt; Definition: The topic of the resource.
    NEW&gt; Comment: Typically, the topic will be represented using
    NEW&gt; keywords, key phrases, or classification codes.
    NEW&gt; Recommended best practice is to use an encoding
    NEW&gt; scheme such as a classification or a controlled
    NEW&gt; vocabulary. To describe the spatial or temporal 
    NEW&gt; topic of the resource, use the Coverage element.

    Changes proposed:
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
    -- In comment, replaces "use a value from an encoding scheme" with "use an 
       encoding scheme" [see Section 1.3]
    -- Label changed from "Subject and Keywords" to "Subject" [see 
       Section 2.5]
    -- In comment, added pointer to the Coverage element [see Section 2.5]
    -- In comment, "expressed as" reworded as "represented using".

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#type">http://dublincore.org/documents/2005/06/13/dcmi-terms/#type</a>

    OLD&gt; Label: Resource Type
    OLD&gt; Definition: The nature or genre of the content of the resource.
    OLD&gt; Comment: Type includes terms describing general categories,
    OLD&gt; functions, genres, or aggregation levels for
    OLD&gt; content. Recommended best practice is to select a
    OLD&gt; value from a controlled vocabulary (for example,
    OLD&gt; the DCMI Type Vocabulary [DCMITYPE]). To describe
    OLD&gt; the physical or digital manifestation of the
    OLD&gt; resource, use the Format element.

    NEW&gt; Documented at: <a name="type" href="/usage/public-comment/2006/08/dcmes-changes/#type">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#type</a>

    NEW&gt; Label: Type
    NEW&gt; Definition: The genre, functional category, or aggregation level 
    NEW&gt; of the resource.
    NEW&gt; Comment: Recommended best practice is to use a controlled
    NEW&gt; vocabulary such as the the DCMI Type Vocabulary
    NEW&gt; [DCMITYPE]). To describe the file format, physical
    NEW&gt; medium, or dimensions of the resource, use the
    NEW&gt; Format element.

    Changes proposed:
    -- In label, changed "Resource Type" to "Type" [see Section 1.6]
    -- In definition, replaces "content of the resource" with "resource" 
       [see Section 1.1]
    -- In comment, replaces "use a value from an encoding scheme" with "use an 
       encoding scheme" [see Section 1.3]
    -- In comment, replaces the phrase "use a value from a controlled 
       vocabulary" with "use a controlled vocabulary" [see Section 1.4]
    -- Definition reworded for concreteness [see Section 2.2]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#date">http://dublincore.org/documents/2005/06/13/dcmi-terms/#date</a>

    OLD&gt; Label: Date
    OLD&gt; Definition: A date associated with an event in the life cycle
    OLD&gt; of the resource.
    OLD&gt; Comment: Typically, Date will be associated
    OLD&gt; with the creation or availability of the
    OLD&gt; resource. Recommended best practice for encoding
    OLD&gt; the date value is defined in a profile of ISO 8601
    OLD&gt; [W3CDTF] and follows the YYYY-MM-DD format.

    NEW&gt; Documented at: <a name="date" href="/usage/public-comment/2006/08/dcmes-changes/#date">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#date</a>

    NEW&gt; Label: Date
    NEW&gt; Definition: A point or period of time associated with an 
    NEW&gt; event in the lifecycle of the resource.
    NEW&gt; Comment: Date may be used to express temporal information
    NEW&gt; at any level of granularity. Recommended best 
    NEW&gt; practice is to use an encoding scheme, such as 
    NEW&gt; the W3CDTF profile of ISO 8601 [W3CDTF].

    Changes proposed:
    -- In comment, changed the reference to an encoding scheme from 
       "recommended best practice" to the status of an example [see Section 2.7]
    -- In definition, explicitly allowed ranges [see Section 2.7]

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#publisher">http://dublincore.org/documents/2005/06/13/dcmi-terms/#publisher</a>

    OLD&gt; Label: Publisher
    OLD&gt; Definition: An entity responsible for making the resource 
    OLD&gt; available
    OLD&gt; Comment: Examples of a Publisher include a person, an
    OLD&gt; organisation, or a service. Typically, the name of
    OLD&gt; a Publisher should be used to indicate the entity.

    NEW&gt; Documented at: <a name="publisher" href="/usage/public-comment/2006/08/dcmes-changes/#publisher">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#publisher</a>

    NEW&gt; Label: Publisher
    NEW&gt; Definition: An entity responsible for making the resource 
    NEW&gt; available.
    NEW&gt; Comment: Examples of a Publisher include a person, an
    NEW&gt; organisation, or a service. Typically, the name of
    NEW&gt; a Publisher should be used to indicate the entity.

    Changes proposed:
    -- In definition, addition of missing full stop.

----------------------------------------------------------------------
URI: <a href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>

    OLD&gt; Documented at: <a href="/documents/2005/06/13/dcmi-terms/#title">http://dublincore.org/documents/2005/06/13/dcmi-terms/#title</a>

    OLD&gt; Label: Title
    OLD&gt; Definition: A name given to the resource.
    OLD&gt; Comment: Typically, a Title will be a name by which 
    OLD&gt; the resource is formally known.

    NEW&gt; Documented at: <a name="title" href="/usage/public-comment/2006/08/dcmes-changes/#title">http://dublincore.org/usage/public-comment/2006/08/dcmes-changes/#title</a>

    NEW&gt; Label: Title
    NEW&gt; Definition: A name given to the resource.
    NEW&gt; Comment: Typically, a Title will be a name by which 
    NEW&gt; the resource is formally known.

    No changes proposed.

Errata 2006-12-04: removed redundant URLs.
</pre>

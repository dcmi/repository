---
title: "- ProfileReviewCriteria"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/ProfileReviewCriteria.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ProfileReviewCriteria](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=fullsearch&value=ProfileReviewCriteria&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/ProfileReviewCriteria "View")
- [Diffs](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/ProfileReviewCriteria">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ProfileReviewCriteria_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ProfileReviewCriteria_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Profile Review Criteria

The following guidelines articulate the criteria by which the DCMI Usage Board reviews an Application Profile. As of March 2008, the main points of reference for these review criteria are the Singapore Framework [SINGAPORE-FRAMEWORK], DCMI Abstract Model [DC-AM], and a draft Description Set Profile specification [DC-DSP]. Best-practice examples of application profiles include Dublin Core Collections Application Profile [DC-CAP], which was reviewed by the Usage Board [DC-CAP-REVIEW] and Eprints Application Profile [EPRINTS].

## Object of evaluation

An application profile is a document (or package of documents) which describes a metadata application in order to facilitate broader reuse of its metadata. A good profile provides enough detail and context to be of use to

- information providers who may need to integrate metadata from multiple sources, and

- developers who may want to build applications using the same (or similar) metadata.

An application profile documents the following:

- objectives and scope of the application,

- functional requirements of the application,

- data model of the entities described by the application, and

- a description set profile detailing the classes and properties used in an application, together with constraints on their usage.

Some of these components are considered to be "required", while others are simply "recommended". There is an overriding requirement for documentation to be semantically clear and internally consistent.

## Areas of evaluation

### Objectives and scope of the application

The objectives and scope of an application MUST be described. The documentation MUST provide answers to the following:

- Is there a description of the context in which the application profile is used (or can be used)?

The documentation SHOULD provide answers to the following:

- Is the target user group for the application profile identified and described?

- Are the organizations and individuals who participated in the development of a profile identified and described?

- Are any arrangements, guidelines, or intentions regarding the future development and maintenance of the profile described?

### Functional requirements of the application

The documentation MUST describe the functions of an application with regard to user needs. These functional requirements should be defined as general functions such as "find", "identify", or "select" but may be more specific.

The following questions is required:

- Are the functional requirements defined?

### Domain model

An application profile MUST provide a data model, if only a simple one, which describes the entities and relationships among the entities. The data model can be depicted in graphic form (e. g., as an UML class diagram) or in text. An application profile can be based on an externally defined data model. With regard to the data model the following questions have to be answered:

- Does the model depict the set of entities to be described and the relationships among those entities?

- If an application profile uses an externally defined data model:

  - Is the externally data model identified?

  - Are deviations from the externally defined data model documented?

### Description set profile

A description set profile specifies a metadata record in terms of "templates" and "constraints" [DC-DSP]:

- A Description Template is a container for constraints on the described resource and for all of the statements made in a Description. (In the DCMI Abstract Model, a Description applies to about one, and only one, resource).

- A Statement Template is a container for all of the constraints that apply in a particular Statement. (In the DCMI Abstract Model, a Statement is comprised of a Property URI and a Value Surrogate.)

#### Description Templates for the entities of the Domain Model

If the Domain Model has only one type of resource (e.g., "book"), then all of the statements in the DSP document can be taken to be about that resource. In formal terms, the Description Template is implied and need not be explicitly labeled as such.

If the Domain Model has more than one described entity (e.g., "author" and "book"), the metadata needs to have separate Descriptions for each of those entities. Accordingly, the description set profile should provide separate, clearly delimited sections (Description Templates).

The header or introduction of a Description Template should provide the following information:

- [MANDATORY] The class (or classes) of which resources described in this description may be an instance (e.g., foaf:Person, or [http://xmlns.com/foaf/0.1/Person](http://xmlns.com/foaf/0.1/Person)) (_Resource Class Membership Constraint_).

- [OPTIONAL] A string used to identify the description in a metadata record.

- [OPTIONAL] An indication of whether descriptions based on the template are allowed to stand alone (e.g., "an author may not be described in the absence of a described book").

- [OPTIONAL] Minimum and maximum numbers of times this kind of description may appear in a metadata record.

#### Statement Templates within a Description Template

Statement Templates are typically presented as small tables for each of the "terms used" in the metadata, together with information on how those terms are used (with what cardinality, encoding schemes, and the like), along with "cataloguing rules" or usage guidelines.

These tables may include the following information:

- [OPTIONAL] Minimum and maximum numbers of times this kind of Statement may appear in the enclosing Description.

- [MANDATORY] The type of value surrogate (literal/non-literal) that is allowed in the statement. This distinction must be clear but may be inferred as follows.

- Property constraints

  - [OPTIONAL] Property List Constraint: The property used in the statement (to be given as a URI or abbreviated URI, e.g., <tt>dcterms:creator</tt> or <tt>http://purl.org/dc/terms/creator</tt>).

  - [OPTIONAL] Sub-Property Constraint: A set of allowable properties or a super-property of which any sub-property may be used; this constraint is rare.

**Statement Templates defining Literal Value Constraints** : If only strings (i.e., literals) are allowable as values, then the Statement may be defined as referring to a Literal Value, which is represented by a Literal Value Surrogate. Allowable constraints (on a _Literal Value Surrogate_) include:

- [OPTIONAL] A list of literals, such as "animal, vegetable, mineral..." (_Literal List Constraint_).

- [OPTIONAL] An indication whether language indicators for the literal are "mandatory", "optional", or "disallowed".

- [OPTIONAL] An indication of which languages are allowed for literals.

- [OPTIONAL] An indication whether Syntax Encoding Schemes for the literal are "mandatory", "optional", or "disallowed".

- [OPTIONAL] Syntax Encoding Scheme List Constraint: A list of allowed Syntax Encoding Schemes, identified by URI.

**Statement Templates defining Non-Literal Value Constraints** : Allowable constraints (on a _Non-Literal Value Surrogate_) include:

- [OPTIONAL] The identifier of a Description Template that may be used to describe the value (_Description Template Reference_).

- [OPTIONAL] Class membership constraint: A list of classes (identified by URI) of which the value may be an instance.

- [OPTIONAL] Constraints on value URIs: whether a value URI is "disallowed", "optional", or "mandatory".

- [OPTIONAL] Value URI List Constraint: a list of URIs that are allowed as value URIs.

- [OPTIONAL] Vocabulary encoding scheme occurrence constraint: whether a vocabulary encoding scheme is "disallowed", "optional", or "mandatory".

- [OPTIONAL] Vocabulary encoding scheme list constraint: a list of URIs that are allowed as Vocabulary Encoding Schemes.

- Value String Constraints

  - [OPTIONAL] Minimum occurrence constraints: the minimum number of times this kind of value string must appear in the enclosing Statement.

  - [OPTIONAL] Maximum occurrence constraints: the maximum number of times this kind of value string is allowed to appear in the enclosing Statement.

#### Templates and Constraints as a whole

About the templates and constraints (or their functional equivalents) as a whole, the reviewer should ask:

- Do the constraints presented in the Description Templates and Statement Templates reflect the content of the domain model?

- Are the constraints presented in the Statement Templates consistent with the definition of the property provided by its owner?

  - The reviewer should verify whether the property declared in a Property Constraint has been declared with a literal or non-literal range and flag any contradictions to usage in the DSP.

Not all of the information included in a Description Set Profile will fall into the typology delineated above. Any such information may be considered "annotations" -- user guidance falling outside the Description Set Profile in a formal sense. For these types of information, the reviewer should ask the following:

- Is the recommended use of the term consistent with the definition provided by the term owner?

- Is the usage of these terms in the description set profile consistent with their declared semantics?

### Metadata terms referenced in the Description Set Profile

The task of the reviewer is to identify the "terms used" in a description set profile and test whether the terms are suitable for use in metadata based on the DCMI Abstract Model. To be suitable, terms MUST be one of the four types of "metadata terms" with a defined role in the [<img src="ProfileReviewCriteria_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/2007/06/04/abstract-model/): Properties (also known as Elements), Classes, Vocabulary Encoding Schemes (VES), and Syntax Encoding Schemes (SES). The following questions test whether a given term fits this known typology:

1. 

The DCMI Abstract Model requires that instances of Property, Class, SES, and VES be identified with Uniform Resource Identifiers (URIs). Has the term been assigned a "proper" URI (see discussion below)? If not, the term is not citable in RDF statements and is therefore not usable in metadata based on the DCMI Abstract Model.

2. 

Has the term been explicitly declared, in an RDF schema or other forms of documentation, to be one of the following:

  1. 

an RDF Property, also known (in Dublin Core usage) as an Element (<tt>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</tt> or a subclass thereof). Used in: Property List Constraints, Sub-Property Constraints.

  2. 

a Class (<tt>http://www.w3.org/2000/01/rdf-schema#Class</tt> or a subclass thereof). Used in: Resource Class Membership Constraints, Class Membership Constraints.

  3. 

an RDF Datatype or (in Dublin Core usage) Syntax Encoding Scheme (<tt>http://www.w3.org/2000/01/rdf-schema#Datatype</tt> or a subclass thereof). Used in: Syntax Encoding Scheme List Constraints.

  4. 

a Vocabulary Encoding Scheme (<tt>http://purl.org/dc/dcam/VocabularyEncodingScheme</tt> or a subclass thereof). Used in: Vocabulary Encoding Scheme List Constraints.

If the term in question is not clearly defined as one of these four types, it has no recognized function in metadata based on the DCMI Abstract Model.

#### Discussion

**Declaration in an RDF schema**. RDF schemas state how a given terms fit into typologies defined by standard specifications such as "RDF Vocabulary Description Language 1.0: RDF Schema" [RDFS] and DCMI Abstract Model [DC-AM]. Example schemas include those of DCMI Metadata Terms [DCMI-TERMS], the SKOS vocabulary [SKOS-VOCABULARY], and the RDF Vocabulary Description Language (RDF Schema) itself [RDFS-VOCABULARY]. For example, the term "Publisher" is declared to be an "RDF property" in the RDF schema for DCMI Metadata Terms as follows:

<pre> &lt;rdf:Description rdf:about="http://purl.org/dc/terms/publisher"&gt;
  &lt;rdfs:label xml:lang="en-US"&gt;Publisher&lt;/rdfs:label&gt;
  &lt;rdfs:comment xml:lang="en-US"&gt;An entity responsible for making the 
  resource available.&lt;/rdfs:comment&gt;
  &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
  ...
  &lt;/rdf:Description&gt;
</pre>

**Best-practice RDF schemas**. Best practice examples of well-declared terms are DCMI Metadata terms [DCMI-TERMS], Dublin Core Collection Description Terms [DC-CDT], and Eprints Terms [EPRINTS-TERMS]. Terms must also be declared in RDF schemas (e. g. for DCMI metadata terms [DCMI-TERMS-RDF] and Dublin Core Collection Description Terms [DC-CDT-RDF].

**Making RDF schemas available**. The W3C note "Best Practice Recipes for Publishing RDF Vocabularies" [RECIPES] describes how HTTP redirects should be used to redirect from term URIs to the RDF schemas used to describe those terms. As described in the note, RDF schemas should ideally be made available on servers configured to provide HTML Web page or RDF schema representations of term declarations via content negotiation on the basis of browser preferences (<tt>text/html</tt> or <tt>application/rdf+xml</tt>).

**"Proper" URIs**. By convention, new terms coined during the creation of an application profile are often assigned temporary URIs using the domain name <tt>http://example.org</tt>. As <tt>http://example.org</tt> URIs cannot be made to resolve to term declarations, such provisional URIs should be replaced by proper URIs on which metadata can be based. "Proper" URIs are URIs under a domain in which the authors of the terms are authorized to coin such URIs.

**Types of terms and subclasses thereof**. Types of terms defined as subclasses of the classes listed above can be used in DC-AM-based metadata -- e.g., from the Web Ontology language [OWL]: <tt>http://www.w3.org/2002/07/owl#Class</tt> is a subclass of <tt>http://www.w3.org/2000/01/rdf-schema#Class</tt> and <tt>http://www.w3.org/2002/07/owl#ObjectProperty</tt> is a subproperty of <tt>http://www.w3.org/1999/02/22-rdf-syntax-ns#Property</tt>.

### Syntax Guidelines

Guidelines on syntax options and data formats may optionally be provided in an application profile. If such materials are provided, the reviewer should ascertain whether the syntax (or syntaxes) chosen support the constraints expressed in the Description Set Profile. For example, if a given encoding syntax does not support the DC-AM construct Vocabulary Encoding Scheme URIs, and constraints on Vocabulary Encoding Scheme URIs are defined in the Description Set Profile, then the reviewer should flag this inconsistency. Reviewers should consider the possibility that a Description Set Profile is not expressed in a data format directly, but by way of a transformation (e.g., GRDDL).

The reviewer should ask the following:

- Does the application profile provide guidance on syntax (whether in the form of schemas or of human-readable user guidelines)?

  - If yes, does the syntax clearly support the DC-AM entities used in the application profile?

## References

<table>
  <tbody>
    <tr>
      <td>
        [DC-CAP] </td>
      <td>
        <a href="http://dublincore.org/groups/collections/collection-application-profile/2007-03-09/">http://dublincore.org/groups/collections/collection-application-profile/2007-03-09/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DC-CAP-REVIEW] </td>
      <td>
        <a href="http://usage/reviews/2007/collections-ap/">http:///usage/reviews/2007/collections-ap/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DC-CDT] </td>
      <td>
        <a href="http://dublincore.org/groups/collections/collection-terms/2007-03-09/">http://dublincore.org/groups/collections/collection-terms/2007-03-09/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DC-CDT-RDF] </td>
      <td>
        <a href="http://dublincore.org/groups/collections/collection-terms/2007-03-09/cldterms.rdf">http://dublincore.org/groups/collections/collection-terms/2007-03-09/cldterms.rdf</a>
      </td>
    </tr>
    <tr>
      <td>
        [DC-DSP] </td>
      <td>
        <a href="http://dublincore.org/documents/2008/03/31/dc-dsp/">http://dublincore.org/documents/2008/03/31/dc-dsp/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DC-AM] </td>
      <td>
        <a href="http://dublincore.org/documents/2007/06/04/abstract-model/">http://dublincore.org/documents/2007/06/04/abstract-model/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DCMI-TERMS-RDF] </td>
      <td>
        <a href="http://dublincore.org/2008/01/14/dcterms.rdf">http://dublincore.org/2008/01/14/dcterms.rdf</a>
      </td>
    </tr>
    <tr>
      <td>
        [DCMI-TERMS] </td>
      <td>
        <a href="http://dublincore.org/documents/dcmi-terms/">http://dublincore.org/documents/dcmi-terms/</a>
      </td>
    </tr>
    <tr>
      <td>
        [DCTERMS-RDF] </td>
      <td>
        <a href="http://dublincore.org/2008/01/14/dcterms.rdf">http://dublincore.org/2008/01/14/dcterms.rdf</a>
      </td>
    </tr>
    <tr>
      <td>
        [EPRINTS-TERMS] </td>
      <td>
        <a href="http://www.ukoln.ac.uk/repositories/digirep/index/Eprints_Terms">http://www.ukoln.ac.uk/repositories/digirep/index/Eprints_Terms</a>
      </td>
    </tr>
    <tr>
      <td>
        [EPRINTS] </td>
      <td>
        <a href="http://www.ukoln.ac.uk/repositories/digirep/index/EPrints_Application_Profile">http://www.ukoln.ac.uk/repositories/digirep/index/EPrints_Application_Profile</a>
      </td>
    </tr>
    <tr>
      <td>
        [OWL] </td>
      <td>
        <a href="http://www.w3.org/TR/2003/WD-owl-ref-20030221/">http://www.w3.org/TR/2003/WD-owl-ref-20030221/</a>
      </td>
    </tr>
    <tr>
      <td>
        [RDFS-VOCABULARY] </td>
      <td>
        <a href="http://www.w3.org/2000/01/rdf-schema">http://www.w3.org/2000/01/rdf-schema</a>
      </td>
    </tr>
    <tr>
      <td>
        [RDFS] </td>
      <td>
        <a href="http://www.w3.org/TR/2004/REC-rdf-schema-20040210/">http://www.w3.org/TR/2004/REC-rdf-schema-20040210/</a>
      </td>
    </tr>
    <tr>
      <td>
        [RECIPES] </td>
      <td>
        <a href="http://www.w3.org/TR/swbp-vocab-pub/">http://www.w3.org/TR/swbp-vocab-pub/</a>
      </td>
    </tr>
    <tr>
      <td>
        [SINGAPORE-FRAMEWORK] </td>
      <td>
        <a href="http://dublincore.org/documents/2008/01/14/singapore-framework/">http://dublincore.org/documents/2008/01/14/singapore-framework/</a>
      </td>
    </tr>
    <tr>
      <td>
        [SKOS-VOCABULARY] </td>
      <td>
        <a href="http://www.w3.org/2004/02/skos/core">http://www.w3.org/2004/02/skos/core</a>
      </td>
    </tr>
  </tbody>
</table>


 [RefreshCache](http://dublincore.org/usageboardwiki/ProfileReviewCriteria?action=refresh&arena=Page.py&key=ProfileReviewCriteria.text_html) for this page (cached 2012-12-27 12:17:59)  

Immutable page (last edited 2009-01-05 20:41:27 by TomBaker)


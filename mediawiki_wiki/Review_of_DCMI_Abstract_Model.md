---
title: Review of DCMI Abstract Model
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Review_of_DCMI_Abstract_Model.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 13 May 2011, at 20:01.  
This page has been accessed 167,918 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#A_review_of_the_DCMI_Abstract_Model_with_scenarios_for_its_future"><span class="tocnumber">1</span> <span class="toctext">A review of the DCMI Abstract Model with scenarios for its future</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#About_this_review"><span class="tocnumber">1.1</span> <span class="toctext">About this review</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Early_efforts_to_define_a_data_model_for_Dublin_Core"><span class="tocnumber">1.2</span> <span class="toctext">Early efforts to define a data model for Dublin Core</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#The_rationale_for_the_DCMI_Abstract_Model"><span class="tocnumber">1.3</span> <span class="toctext">The rationale for the DCMI Abstract Model</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#The_DCMI_Abstract_Model_as_the_basis_for_formal_Application_Profiles"><span class="tocnumber">1.4</span> <span class="toctext">The DCMI Abstract Model as the basis for formal Application Profiles</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Relationship_of_the_DCMI_Abstract_Model_to_RDF"><span class="tocnumber">1.5</span> <span class="toctext">Relationship of the DCMI Abstract Model to RDF</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#The_Description_Set_Profile_constraint_language"><span class="tocnumber">1.6</span> <span class="toctext">The Description Set Profile constraint language</span></a></li>
            <li class="toclevel-2 tocsection-8"><a href="#DCAM_in_2010"><span class="tocnumber">1.7</span> <span class="toctext">DCAM in 2010</span></a></li>
            <li class="toclevel-2 tocsection-9">
              <a href="#Scenarios_for_the_future_of_DCAM"><span class="tocnumber">1.8</span> <span class="toctext">Scenarios for the future of DCAM</span></a>
              <ul>
                <li class="toclevel-3 tocsection-10"><a href="#Scenario_1._DCMI_carries_on_developing_DCAM_as_before"><span class="tocnumber">1.8.1</span> <span class="toctext">Scenario 1. DCMI carries on developing DCAM as before</span></a></li>
                <li class="toclevel-3 tocsection-11"><a href="#Scenario_2a._DCMI_develops_a_.22DCAM_2.22_spec_as_the_basis_for_new_work"><span class="tocnumber">1.8.2</span> <span class="toctext">Scenario 2a. DCMI develops a "DCAM 2" spec as the basis for new work</span></a></li>
                <li class="toclevel-3 tocsection-12"><a href="#Scenario_2b._DCMI_develops_.22DCAM_2.22_as_a_transitional_explanatory_document"><span class="tocnumber">1.8.3</span> <span class="toctext">Scenario 2b. DCMI develops "DCAM 2" as a transitional explanatory document</span></a></li>
                <li class="toclevel-3 tocsection-13"><a href="#Scenario_3._DCMI_deprecates_the_DCAM_abstract_syntax_and_embraces_RDF_abstract_syntax"><span class="tocnumber">1.8.4</span> <span class="toctext">Scenario 3. DCMI deprecates the DCAM abstract syntax and embraces RDF abstract syntax</span></a></li>
                <li class="toclevel-3 tocsection-14"><a href="#Scenario_4._DCMI_does_nothing_-_DCAM_is_simply_left_untouched"><span class="tocnumber">1.8.5</span> <span class="toctext">Scenario 4. DCMI does nothing - DCAM is simply left untouched</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-15">
              <a href="#General_issues_for_discussion"><span class="tocnumber">1.9</span> <span class="toctext">General issues for discussion</span></a>
              <ul>
                <li class="toclevel-3 tocsection-16"><a href="#DCAM_abstract_syntax_versus_the_RDF_abstract_syntax"><span class="tocnumber">1.9.1</span> <span class="toctext">DCAM abstract syntax versus the RDF abstract syntax</span></a></li>
                <li class="toclevel-3 tocsection-17"><a href="#Application_Profiles"><span class="tocnumber">1.9.2</span> <span class="toctext">Application Profiles</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-18"><a href="#Appendix_A._The_DCAM_family_of_specifications"><span class="tocnumber">1.10</span> <span class="toctext">Appendix A. The DCAM family of specifications</span></a></li>
            <li class="toclevel-2 tocsection-19">
              <a href="#Appendix_B._Relationship_of_the_Description_Set_Model_to_RDF"><span class="tocnumber">1.11</span> <span class="toctext">Appendix B. Relationship of the Description Set Model to RDF</span></a>
              <ul>
                <li class="toclevel-3 tocsection-20"><a href="#Grouping_constructs_in_the_Description_Set_Model"><span class="tocnumber">1.11.1</span> <span class="toctext">Grouping constructs in the Description Set Model</span></a></li>
                <li class="toclevel-3 tocsection-21"><a href="#Slots_in_the_Description_Set_Model"><span class="tocnumber">1.11.2</span> <span class="toctext">Slots in the Description Set Model</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-22"><a href="#References"><span class="tocnumber">1.12</span> <span class="toctext">References</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# A review of the DCMI Abstract Model with scenarios for its future 

Creator &nbsp;: Tom Baker  
Creator &nbsp;: Pete Johnston  
Identifier: [/archive/mediawiki_wiki/Review\_of\_DCMI\_Abstract\_Model](/archive/mediawiki_wiki/Review_of_DCMI_Abstract_Model)  
Originally written: 2010-10-15  
Revised: 2011-05-12

### About this review 

This paper:

- contextualizes the DCMI Abstract Model (DCAM) within the history of DCMI and Web standards
- describes the DCAM approach with reference to Resource Description Framework (RDF)
- proposes alternative scenarios for the future development of DCAM
- assesses the impact of alternative scenarios on specifications that depend on DCAM

The paper was produced for discussion on 22 October at a Joint Meeting of the DCMI Architecture Forum and the W3C Library Linked Data Incubator Group <sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>. One objective of the meeting was to try to determine a realistic way forward for DCAM.

### Early efforts to define a data model for Dublin Core 

The Dublin Core community began in 1995 by defining twelve (later fifteen) "elements". These elements were supplemented in 1997 by the addition of "qualifiers" (originally called "Canberra qualifiers"<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>). In July 2000, with the publication of a DCMI Recommendation, "Dublin Core Qualifiers", qualifiers were differentiated into "element refinements" and "element encoding schemes"<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>.

This "typology of terms" formed the basis of a 2003 guide for DCMI Usage Board vocabulary maintenance decisions--"DCMI Grammatical Principles"-- which further differentiated "encoding schemes" into "vocabulary encoding schemes" and "syntax encoding schemes" <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>.

In addition to the development of a "typology of terms", and specific sets of terms based on that typology, an effort was made to specify a format-independent abstract data structure--an "abstract syntax" within which references to those terms were made. This work was summarized in a 2000 D-Lib Magazine article "A Grammar of Dublin Core", which articulated a "grammar" of "statements" comprised of several components<sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup>:

- an implicit reference to a thing being described
- a reference to one of the fifteen "properties" or "elements" of the Dublin Core Metadata Element Set
- a "property value" (characterized as "an appropriate literal")
- optional references to one or more "qualifiers"

DCMI's first specification for a concrete syntax for Dublin Core metadata, " [RFC 2731](http://tools.ietf.org/html/rfc2731): Encoding Dublin Core Metadata in HTML" of 1999, was based at least informally on this model <sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[6]</a></sup>.

Starting in 1997, the development of a metadata model in DCMI was paralleled by W3C's push to define a generic Resource Description Framework (RDF)--an effort that culminated in a first W3C Recommendation, "RDF Model and Syntax Specification" of February 1999 <sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[7]</a></sup> and, following an extensive review process, a second W3C Recommendation "RDF Concepts and Syntax" in February 2004 <sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[8]</a></sup>. Following up on the standardization of RDF, DCMI developed "encoding guidelines" specifying two slightly different conventions for using Dublin Core terms with RDF:

- "Expressing Simple Dublin Core in RDF/XML" of 2002, which specified the use of Dublin Core properties exclusively with literal values <sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[9]</a></sup>
- "Expressing Qualified Dublin Core in RDF" of 2002--a wider set of conventions that specified the use of object values and of Bag, Seq, and Alt constructs and discussed the use of subproperty relations for the principled simplification ("dumb-down") of complex descriptions <sup id="cite_ref-9" class="reference"><a href="#cite_note-9">[10]</a></sup>.

### The rationale for the DCMI Abstract Model 

By the early 2000s there was a growing number of "Dublin Core metadata" implementations, most of which lacked any sort of reference to a common abstract syntax. The result was a landscape of applications among which interoperability was problematic. The RDF abstract syntax was recognized by parts of the Dublin Core community as a crucial development -- and the "grammar of Dublin Core" model was intended in part to popularize its notion of "statement-based" metadata -- but RDF was seen by a large part of the Dublin Core community as a research project of dubious practical value. RDF was seen less as a fundamentally different way of conceptualizing metadata and more as an alternative XML format for metadata -- and one that compared unfavorably to apparently simpler and more readable XML formats.

Given the difficulty of directly promoting the RDF abstract syntax as a common basis for metadata, work began in 2003 on a DCMI Abstract Model in an attempt:

- to clarify and formalize the "home-grown" model of metadata that had emerged from early Dublin Core workshops and formed the basis of the DCMI Grammatical Principles; and
- increasingly, over time, to align that model with that of the RDF abstract syntax and RDF semantics.

This effort resulted in a first "DCMI Abstract Model" as a DCMI Recommendation in March 2005 <sup id="cite_ref-10" class="reference"><a href="#cite_note-10">[11]</a></sup> and a second, revised model in June 2007 <sup id="cite_ref-11" class="reference"><a href="#cite_note-11">[12]</a></sup>. The 2007 revision moved closer to RDF terminology by de-emphasizing the word "element" in favor of "RDF property", explicitly defining "element refinements" as "RDF sub-properties" and Syntax Encoding Schemes as RDF datatypes, and further de-emphasizing the generic designations "encoding scheme" and the even more generic term "qualifier"<sup id="cite_ref-12" class="reference"><a href="#cite_note-12">[13]</a></sup>.

The DCMI Abstract Model defined an abstract syntax based on a data structure it called the "description set". The specification "Expressing Dublin Core metadata using the Resource Description Framework (RDF)" of 2008 explained how the "description set" model mapped to the abstract syntax of RDF<sup id="cite_ref-13" class="reference"><a href="#cite_note-13">[14]</a></sup>. The revised DCMI Abstract Model of 2007 became the basis for the revised concrete syntax specifications "Expressing Dublin Core metadata using HTML/XHTML meta and link elements" (aka "DC-HTML") <sup id="cite_ref-14" class="reference"><a href="#cite_note-14">[15]</a></sup>, "Expressing Dublin Core Description Sets using XML (DC-DS-XML)" <sup id="cite_ref-15" class="reference"><a href="#cite_note-15">[16]</a></sup>, and "Expressing Dublin Core metadata using the DC-Text format"<sup id="cite_ref-16" class="reference"><a href="#cite_note-16">[17]</a></sup>.

In 2009, Mikael Nilsson outlined a potential "RDF-based version" of the DCMI Abstract Model as a dramatic simplification of the 2007 model <sup id="cite_ref-17" class="reference"><a href="#cite_note-17">[18]</a></sup>. The proposed revision would have dropped two of the three component models of the 2007 model: the DCMI Resource Model (to be replaced by a simple reference to RDF) and the DCMI Vocabulary Model (to be replaced by a simple reference to the RDF Vocabulary Description Language, also known as RDF Schema). The motivation for this proposed revision, never developed into a full specification, was to define the abstract model entirely in terms of RDF while maintaining the "interface" to constructs defined in the third component of the 2007 model, the Description Set Model.

### The DCMI Abstract Model as the basis for formal Application Profiles 

The notion of an "application profile" was introduced at the DC-2000 conference in Ottawa and quickly became a central point of reference for the Dublin Core community. As originally proposed, an application profile was the specification of how a set of Dublin Core elements and encoding schemes were to be "used" in the context of a particular application or to describe a particular type of resource. The application profile introduced the notion of "mixing-and-matching" Dublin Core elements with elements from related vocabularies.

In practice, this very general conceptualization was interpreted in a multiplicity of ways, resulting in a wide range of incompatible constructs. The DCMI Abstract Model, with its formalization of an abstract syntax, provided the basis for a number of specifications which sought to formalize the notion of a "Dublin Core application profile":

- A formal constraint language, "Description Set Profiles"<sup id="cite_ref-18" class="reference"><a href="#cite_note-18">[19]</a></sup>
- "Singapore Framework for Dublin Core Application Profiles"<sup id="cite_ref-19" class="reference"><a href="#cite_note-19">[20]</a></sup> (2007)
- Application profile review criteria used by the DCMI Usage Board <sup id="cite_ref-20" class="reference"><a href="#cite_note-20">[21]</a></sup>
- "Interoperability Levels for Dublin Core Metadata"<sup id="cite_ref-21" class="reference"><a href="#cite_note-21">[22]</a></sup>

A user-oriented document, "Guidelines for Dublin Core Application Profiles"<sup id="cite_ref-22" class="reference"><a href="#cite_note-22">[23]</a></sup>, was written to guide users through the process of designing and creating application profiles on the basis of the DCMI Abstract Model.

In addition to the XML syntax and RDF representations specified in the Description Set Profile document itself, a wiki syntax <sup id="cite_ref-23" class="reference"><a href="#cite_note-23">[24]</a></sup> was also developed, together with a MoinMoin extension <sup id="cite_ref-24" class="reference"><a href="#cite_note-24">[25]</a></sup> which generated both a tabular human-readable view and an XML representation of an application profile. The Description Set Profile was intended to be used for applications such as the automatic configuration of metadata editing tools and the generation of schemas for document validation.

Other approaches to "structural constraints" and "validation" have been explored within the Dublin Core and Semantic Web communities:

- In 2005, Dan Brickley put forward a proposal for a pluralistic notion of Dublin Core application profiles as encompassing human-readable and machine-processable documentary methods ranging from lists of namespaces used to Web pages, exemplars, and example queries <sup id="cite_ref-25" class="reference"><a href="#cite_note-25">[26]</a></sup><sup id="cite_ref-26" class="reference"><a href="#cite_note-26">[27]</a></sup>.

- In 2007, Alistair Miles proposed "Son of Dublin Core", a draft approach for encoding and validating "graph-based metadata" using a concrete XML syntax and language for expressing application-specific syntax constraints over a metadata graph<sup id="cite_ref-27" class="reference"><a href="#cite_note-27">[28]</a></sup>.

- In 2009, the firm Clark & Parsia put forward an "integrity constraint validator", Pellet, treating OWL "as a schema or validation language for RDF data via auto-generated SPARQL queries that can be executed on any SPARQL-enabled RDF store" by interpreting OWL ontologies with closed-world assumptions in order to detect constraint violations<sup id="cite_ref-28" class="reference"><a href="#cite_note-28">[29]</a></sup>.

### Relationship of the DCMI Abstract Model to RDF 

While the 2009 draft "RDF-based" revision of the DCMI Abstract Model was never developed beyond the outline stage, this discussion paper uses its basic ideas as a starting point. Specifically, this paper ignores the Resource Model and Vocabulary Model defined in the 2007 Abstract Model and focuses exclusively on its centerpiece: the Description Set Model. As a guide to how the constructs of this model translate into RDF, this paper additionally follows the 2008 guidelines, "Expressing Dublin Core metadata using the Resource Description Framework"] (referred to hereafter by its short name, "DC-RDF") <sup id="cite_ref-29" class="reference"><a href="#cite_note-29">[30]</a></sup>.

The Description Set Model specifies both a set of syntactic elements (things found in data) and a set of referents in the real world (things to which the syntactic elements may be interpreted to refer). If the DCMI Abstract Model is to be based on the RDF abstract syntax, we can limit our analysis here to the syntactic elements. These include grouping constructs (Description Set, Description, Statement, Non-Literal Value Surrogate, and Literal Value Surrogate) and slots for URIs and character strings (Described Resource URI, Property URI, Value URI, Vocabulary Encoding Scheme URI, Syntax Encoding Scheme URI, Value String Language, Plain Value String, and Typed Value String). One might think of these slots as components of the DCAM abstract syntax that can be tested or validated. In the DCMI Abstract Model, these syntactic elements are described using UML, but they are more popularly depicted in the form of a nested metadata template, as in Figure 1 below.

 [<img alt="Figure 1: Description Set Model (part of DCMI Abstract Model)" src="/archive/mediawiki_wiki/images/DescriptionSetModel75.jpg" width="494" height="389">](/archive/mediawiki_wiki/images/DescriptionSetModel75.jpg "Figure 1: Description Set Model (part of DCMI Abstract Model)")

**Figure 1: Description Set Model (part of DCMI Abstract Model)**

As an illustration of how the syntactic elements of the Description Set Model are used, Figure 2 shows a set of example information values in the placeholders corresponding to those shown in Figure 1.

 [<img alt="Figure 2: Description Set Model slots with example URIs and character strings" src="/archive/mediawiki_wiki/images/DescriptionSetModelValues75.jpg" width="530" height="370">](/archive/mediawiki_wiki/images/DescriptionSetModelValues75.jpg "Figure 2: Description Set Model slots with example URIs and character strings")

**Figure 2: Description Set Model slots with example URIs and character strings**

How the elements of the Description Set Model relate to RDF is depicted in Figure 3 and described in more detail in Appendix B below.

 [<img alt="Figure 3: Relationship of Description Set Profile components to RDF graphs" src="/archive/mediawiki_wiki/images/DcamAndRdfGraph.jpg" width="579" height="437">](/archive/mediawiki_wiki/images/DcamAndRdfGraph.jpg "Figure 3: Relationship of Description Set Profile components to RDF graphs")

**Figure 3: Relationship of Description Set Profile components to RDF graphs**

### The Description Set Profile constraint language 

The March 2008 specification "Description Set Profiles: a constraint language for Dublin Core application profiles" (hereafter DC-DSP) <sup id="cite_ref-30" class="reference"><a href="#cite_note-30">[31]</a></sup> provided a language for specifying constraints on a "description set" as defined by the DCMI Abstract Model. The notion of "constraints" acknowledges that the set of possible ways that the slots defined by the Description Set Model may be filled is infinite, and that these infinite possibilities can be configured, or "constrained", in specific ways for specific content.

In the terminology of the DC-DSP specification, sets of constraints are expressed in "templates". Templates use constraints to specify community- or application-specific rules for the contents of a description set: first for individual descriptions in a description set (Description Templates); then within each description, for individual statements (Statement Templates); then for each component "slot" within each statement (Constraints). Conceptually, templates are like cookie cutters for mass-producing actual descriptions and statements in real instance metadata. Actual descriptions and statements in real instance metadata, in turn, are conceptualized as "matching" specific templates according to a matching algorithm.

Very broadly, DC-DSP provides a language for specifying things such as:

- Minimum and maximum allowable occurrences of actual descriptions matching a given Description Template within a Description Set.

- Whether descriptions matching a given Description Template may stand alone within a Description Set or whether their presence depends on the presence of descriptions matching another Description Template (example: "no stand-alone descriptions of authors in the absence of a description of the book they wrote"). 

- Minimum and maximum allowable occurrences of actual statements matching a given Statement Template within a Description.

- For slots designed to hold URIs -- such as Property URI, Value URI, and Value Encoding Scheme URI -- whether it is mandatory, optional, or disallowed that the given slot be filled in a given Statement Template, or a list of URIs that may be used in the given slot (as in: "the slot labeled Property URI must contain one of these URIs").

- For slots designed to hold character strings or language tags, whether it is mandatory, optional, or disallowed that the given slot be filled in a given Statement Template, or a list of character strings that may be used in the given slot.

### DCAM in 2010 

It is difficult to track the use of freely available specifications once they are released on the Web, but as of 2010, DCMI is not aware that any of the Abstract-Model-related specifications, with the possible exception of specific syntax guidelines, have been widely implemented.

Rather than building a bridge from more traditional metadata communities to the Semantic Web, the Abstract Model appears to have fallen between two stools -- its use of the "description set" abstraction perplexing to users more accustomed to metadata specifications defined in terms of a concrete syntax, and its added layer of Dublin-Core-specific terminology confusing to users comfortable with the RDF model.

Since 2006, however, the rapid success of Linked Data has given the notion of Semantic Web, based on Resource Description Framework (RDF), wider visibility and acceptance. If Linked Data is crossing the chasm to widespread deployment, and the conceptual model of RDF is reaching a wider community, is there still a need for the bridge that the DCMI Abstract Model was intended to be?

As of 2010, moreover, new Semantic Web specifications such as Simple Knowledge Organization System (SKOS) address issues that overlap with those of the DCMI Abstract Model. Discussions in the Semantic Web community about a new version of RDF ("RDF 2") point towards further developments in the core Semantic Web standards, such as Named Graphs, that parallel some of the more innovative features of the DCMI Abstract Model <sup id="cite_ref-31" class="reference"><a href="#cite_note-31">[32]</a></sup>. To what extent can the DCMI Abstract Model already be expressed in terms of newly-mainstream Linked Data concepts? If aspects of the DCMI Abstract Model still cannot be expressed with more mainstream concepts, what are the prospects for being able to do so in the foreseeable future and, more to the point, what steps should be taken in the meantime to revise, deprecate, or replace the DCMI Abstract Model?

The question does not affect just the Abstract Model, but the suite of related specifications, syntax guidelines, and user documentation built on the Abstract Model. What requirements are reflected in this considerable body of work, which of these requirements now appear to be most important, and how should we best proceed to address those requirements?

### Scenarios for the future of DCAM 

#### Scenario 1. DCMI carries on developing DCAM as before 

- DCMI carries on developing DCAM as before, incrementally improving the DCAM and Description Set Profile specifications, with a work plan for developing further concrete syntaxes based on DCAM.
- Questions:
  - Is there a demonstrated interest? 
  - Who would edit the specs?
  - How would testing and review be managed?

#### Scenario 2a. DCMI develops a "DCAM 2" spec as the basis for new work 

- DCMI develops a "DCAM 2" specification -- simplified and better aligned with RDF 
- In Variant 2a, the improved DCAM 2 specification would be taken as the new basis
  - for the Description Set Profile language of structural constraints for application profiles
  - for a workplan to develop new and improve existing concrete syntaxes on the basis of "DCAM 2".
- Questions:
  - Is there a demonstrated interest in "DCAM 2"?
  - As in #1 above: Who would edit the specs? How would review and testing be managed?
  - What would be the impact of "DCAM 2" on specifications in the existing "DCAM family of specifications"?

#### Scenario 2b. DCMI develops "DCAM 2" as a transitional explanatory document 

- DCMI develops "DCAM 2" as an explanation for how the legacy DCAM model relates to RDF 
- In Variant 2b, "DCAM 2" would serve the purposes of:
  - Clarification, for the Dublin Core community generally and for users of DCAM in particular, of how DCAM relates to RDF and Linked Data
  - Role of a "transitional" specification, to be deprecated over time in favor of RDF
- No workplan for new concrete syntaxes would be undertaken.
- Questions
  - Is there interest in the clarification that a "DCAM 2" spec would provide?
  - Who would edit "DCAM 2"?
  - What should be done with the existing "DCAM family" of specifications? (Currently, most are DCMI Recommendations or DCMI Recommended Resources.)
  - What is an "application profile"? Is it based on DCAM/DSP or on the RDF abstract syntax?

#### Scenario 3. DCMI deprecates the DCAM abstract syntax and embraces RDF abstract syntax 

- Rather than explain in any detail how the legacy DCAM model relates to RDF, DCMI simply depicts DCAM as a "product of its time" and henceforth promotes the RDF abstract syntax.
- Questions
  - Are there current users of DCAM who would be negatively impacted?
  - What should be done with the existing "DCAM family" of specifications (e.g., in terms of status as DCMI Recommendations or Recommended Resources)?
  - What explanation would DCMI provide, particularly with regard to application profiles -- hitherto a central aspect of the DCMI message? What is an "application profile" if it is not based on DCAM, DSP, and the Singapore Framework?

#### Scenario 4. DCMI does nothing - DCAM is simply left untouched 

- DCMI does nothing to change the statuses of DCAM-related specifications.
- DCAM and DSP are in effect "frozen" and de-emphasized, with no particular explanation.
- Scenario 4 is the most "economical" in terms of (human) resources.
- Questions
  - If DCMI does not, in fact, stand behind specifications that continue to bear the status of DCMI Recommendations, what would be the cost to DCMI in terms of credibility?

### General issues for discussion 

#### DCAM abstract syntax versus the RDF abstract syntax 

- Should DCAM dissolve into mainstream RDF? For example:
  - Are Descriptions and Description Sets expressible as Named Graphs?
  - Are there significant differences between Vocabulary Encoding Schemes and SKOS Concept Schemes?
  - Do aspects of the DCAM mapping to RDF need to be revisited (e.g., the rdf:value for value strings associated with object nodes, as opposed to skos:prefLabel, rdfs:label, foaf:name, skos:notation, or dcterms:title).

#### Application Profiles 

- Does RDF need a notion of Application Profiles? 
- If so, what are the requirements?
- Do application profiles need to express constraints?
  - If not with DCAM, how should patterns of constraints at the level of RDF graphs be expressed?
    - Using syntax pattern checks (patterns "in the graph" rather than "in the world") along the lines of the Description Set Profile constraint language? Or might it be enough to use SPARQL query patterns?
    - Using OWL applied with closed-world Assumptions?
- Is it useful, as in the Singapore Framework, to distinguish strongly between declared vocabularies and declared vocabularies as used and constrained in data formats?
  - Should constraints be wired into the formal specifications of vocabularies?
  - Or should constraints be expressed as patterns matched to the data?

### Appendix A. The DCAM family of specifications 

- [DCMI Abstract Model](http://dublincore.org/documents/abstract-model/)
- [Description Set Profiles: A constraint language for Dublin Core Application Profiles](http://dublincore.org/documents/dc-dsp/)
- [Singapore Framework for Dublin Core Application Profiles](http://dublincore.org/documents/singapore-framework/)
- [DCMI Usage Board Criteria for the Review of Application Profiles](http://dublincore.org/documents/profile-review-criteria/)
- [Interoperability Levels for Dublin Core Metadata](http://dublincore.org/documents/interoperability-levels/)
- [Guidelines for Dublin Core Application Profiles](http://dublincore.org/usage/documents/profile-guidelines/)
- [DC-TEXT: A text syntax for Dublin Core metadata](http://dublincore.org/documents/dc-text/)
- [Expressing Dublin Core metadata using the Resource Description Framework (RDF)](http://dublincore.org/documents/dc-rdf/)
- [Expressing Dublin Core Description Sets using XML (DC-DS-XML)](http://dublincore.org/documents/dc-ds-xml/)
- [Expressing Dublin Core metadata using HTML/XHTML meta and link elements (DC-HTML)](http://dublincore.org/documents/dc-html/)
- [Guidelines for implementing Dublin Core in XML (DC-XML)](http://dublincore.org/documents/dc-xml/)

### Appendix B. Relationship of the Description Set Model to RDF 

It is worth noting that the Dublin Core "grammar" for "statements" of circa 2000, pictured in Figure 4, was in part an early attempt to popularize the notion of metadata as being based on meaningful "statements" by way of analogy to commonly understood notions of natural-language grammar.

 [<img alt='Figure 4: Early "grammar" of Dublin Core "statements" (circa 2000)' src="/archive/mediawiki_wiki/images/Grammar2000.jpg" width="547" height="358">](/archive/mediawiki_wiki/images/Grammar2000.jpg "Figure 4: Early "grammar" of Dublin Core "statements" (circa 2000)")

**Figure 4: Early "grammar" of Dublin Core "statements" (circa 2000)**

As part of the model, a rough mapping of the Dublin Core "grammar" to RDF "statements" was provided, as pictured in Figure 5.

 [<img alt='Figure 5: Mapping of early Dublin Core "grammar" to RDF statements (circa 2000)' src="/archive/mediawiki_wiki/images/GrammarAndRDF.jpg" width="568" height="358">](/archive/mediawiki_wiki/images/GrammarAndRDF.jpg "Figure 5: Mapping of early Dublin Core "grammar" to RDF statements (circa 2000)")

**Figure 5: Mapping of early Dublin Core "grammar" to RDF statements (circa 2000)**

This appendix examines how the syntactic elements of the Description Set Model, the central component of the DCMI Abstract Model of 2005-2007, relate to RDF -- both as it currently exists and as it is likely to evolve in the medium term. Note that the 2007 abstract model defines these elements both as syntactic elements and in terms of the "things in the world" to which these elements refer. For simplicity of exposition, this analysis focuses exclusively on the syntactic elements.

#### Grouping constructs in the Description Set Model 

The grouping constructs in the Description Set Model are:

- Description Set: A set of one or more Descriptions.
- Description: A set of statements about one, and only one, resource. Syntactically, the Description consists of an optional Description Resource URI plus one or more Statements.
- Statement: A Property URI slot plus a set of slots grouped either in a Non-Literal Value Surrogate or a Literal Value Surrogate.
- Non-Literal Value Surrogate: A set of slots consisting of any combination of zero to one Value URIs, zero to one Vocabulary Encoding Scheme URIs, zero to many Value Strings, each of which may be a Plain Value String (with an optional Value String Language), or a Typed Value String (with a Syntax Encoding Scheme URI).
- Literal Value Surrogate: A slot or set of slots consisting of either a Plain Value String (with an optional Value String Language), or a Typed Value String (with a Syntax Encoding Scheme URI).

#### Slots in the Description Set Model 

The slots in the Description Set Model map to constructs in the RDF abstract syntax <sup id="cite_ref-32" class="reference"><a href="#cite_note-32">[33]</a></sup>. Following the [DC-RDF guidelines](http://dublincore.org/documents/dc-rdf/) [18], these slots may be characterized in terms of the RDF abstract syntax as follows:

- Described Resource URI: In RDF terms, the URI in the Described Resource URI slot identifies the resource that is the subject of a Description. When a URI is present in this slot, that URI is the subject of triples about the described resource. In the absence of a Described Resource URI (i.e., the slot is empty), a blank node is the subject of triples about the described resource.
- Property URI: A URI identifying a property that is the predicate of an RDF triples about the described resource.
- Value URI: A URI identifying a resource that is the object of an RDF triple about the described resource. In the absence of a Value URI (i.e., the slot is empty), the object is a blank node. 
- Vocabulary Encoding Scheme URI: A URI identifying an enumerated set of resources ("Vocabulary Encoding Scheme") to which the object of the RDF triple about the described resource belongs. This is expressed with a triple in which the subject is a reference (whether a blank node or URI) to the value resource, the predicate is the property "dcam:memberOf", and the object is the URI in the Vocabulary Encoding Scheme URI slot.
- Plain Value String: A character string with an optional language tag, an RDF plain literal. For a Value String within a Literal Value Surrogate, the plain literal is directly the object of an RDF triple about the described resource. For a Value String within a Non-Literal Value Surrogate, the plain literal is the object of an RDF triple in which the predicate is the property "rdf:value", and the subject is a reference (whether a blank node or URI) to the value resource.
- Value String Language: The language tag used together with the character string in the Plain Value String slot to form an RDF literal.
- Typed Value String: A character string associated with exactly one URI in the Syntax Encoding Scheme URI slot, an RDF typed literal. For a Value String within a Literal Value Surrogate, the typed literal is directly the object of an RDF triple about the described resource. For a Value String within a Non-Literal Value Surrogate, the typed literal is the object of an RDF triple in which the predicate is the property "rdf:value", and the subject is a reference (whether a blank node or URI) to the value resource.
- Syntax Encoding Scheme URI: A URI identifying an RDF datatype, which for legacy reasons is known in the DCMI Abstract Model as a "syntax encoding scheme".

### References 

1. ↑ [http://www.w3.org/2001/sw/wiki/JointMeeting2010](http://www.w3.org/2001/sw/wiki/JointMeeting2010)
2. ↑ [http://www.dlib.org/dlib/june97/metadata/06weibel.html](http://www.dlib.org/dlib/june97/metadata/06weibel.html)
3. ↑ [http://dublincore.org/documents/2000/07/11/dcmes-qualifiers/](http://dublincore.org/documents/2000/07/11/dcmes-qualifiers/)
4. ↑ [http://dublincore.org/usage/documents/2003/02/07/principles/](http://dublincore.org/usage/documents/2003/02/07/principles/)
5. ↑ [http://www.dlib.org/dlib/october00/baker/10baker.html](http://www.dlib.org/dlib/october00/baker/10baker.html)
6. ↑ [http://www.ietf.org/rfc/rfc2731.txt](http://www.ietf.org/rfc/rfc2731.txt)
7. ↑ [http://www.w3.org/TR/1999/REC-rdf-syntax-19990222/](http://www.w3.org/TR/1999/REC-rdf-syntax-19990222/)
8. ↑ [http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/](http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/)
9. ↑ [http://dublincore.org/documents/2002/07/31/dcmes-xml/](http://dublincore.org/documents/2002/07/31/dcmes-xml/)
10. ↑ [http://dublincore.org/documents/2002/05/15/dcq-rdf-xml/](http://dublincore.org/documents/2002/05/15/dcq-rdf-xml/)
11. ↑ [http://dublincore.org/documents/2005/03/07/abstract-model/](http://dublincore.org/documents/2005/03/07/abstract-model/)
12. ↑ [http://dublincore.org/documents/2007/06/04/abstract-model/](http://dublincore.org/documents/2007/06/04/abstract-model/)
13. ↑ [http://dublincore.org/documents/abstract-model/#app-a](http://dublincore.org/documents/abstract-model/#app-a)
14. ↑ [http://dublincore.org/documents/2008/01/14/dc-rdf/](http://dublincore.org/documents/2008/01/14/dc-rdf/)
15. ↑ [http://dublincore.org/documents/2008/08/04/dc-html/](http://dublincore.org/documents/2008/08/04/dc-html/)
16. ↑ [http://dublincore.org/documents/2008/09/01/dc-ds-xml/](http://dublincore.org/documents/2008/09/01/dc-ds-xml/)
17. ↑ [http://dublincore.org/documents/2007/12/03/dc-text/](http://dublincore.org/documents/2007/12/03/dc-text/)
18. ↑ [http://dublincore.org/architecturewiki/DCAM-2.0](http://dublincore.org/architecturewiki/DCAM-2.0)
19. ↑ [http://dublincore.org/documents/dc-dsp/](http://dublincore.org/documents/dc-dsp/)
20. ↑ [http://dublincore.org/documents/singapore-framework/](http://dublincore.org/documents/singapore-framework/)
21. ↑ [http://dublincore.org/documents/2009/03/02/profile-review-criteria/](http://dublincore.org/documents/2009/03/02/profile-review-criteria/)
22. ↑ [http://dublincore.org/documents/interoperability-levels/](http://dublincore.org/documents/interoperability-levels/)
23. ↑ [http://dublincore.org/usage/documents/profile-guidelines/](http://dublincore.org/usage/documents/profile-guidelines/)
24. ↑ [http://dublincore.org/documents/2008/10/06/dsp-wiki-syntax/](http://dublincore.org/documents/2008/10/06/dsp-wiki-syntax/)
25. ↑ [http://dublincore.org/documents/2008/10/06/dsp-wiki-syntax/DescriptionSetProfile-dist.zip](http://dublincore.org/documents/2008/10/06/dsp-wiki-syntax/DescriptionSetProfile-dist.zip)
26. ↑ [http://lists.w3.org/Archives/Public/public-lld/2010Nov/0114.html](http://lists.w3.org/Archives/Public/public-lld/2010Nov/0114.html)
27. ↑ [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0509&L=DC-RDF-TASKFORCE&P=R2034&I=-3](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0509&L=DC-RDF-TASKFORCE&P=R2034&I=-3)
28. ↑ [http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html](http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html)
29. ↑ [http://clarkparsia.com/pellet/icv/](http://clarkparsia.com/pellet/icv/)
30. ↑ [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)
31. ↑ [http://dublincore.org/documents/dc-dsp](http://dublincore.org/documents/dc-dsp)
32. ↑ [http://www.w3.org/2001/sw/wiki/RDF/NextStepWorkshop](http://www.w3.org/2001/sw/wiki/RDF/NextStepWorkshop)
33. ↑ [http://www.w3.org/TR/rdf-concepts/](http://www.w3.org/TR/rdf-concepts/)


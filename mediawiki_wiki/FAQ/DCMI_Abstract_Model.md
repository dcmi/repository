---
title: DCMI Abstract Model
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/FAQ/DCMI_Abstract_Model.html"
---

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#What_is_the_DCMI_Abstract_Model.2C_and_what_is_its_current_status.3F"><span class="tocnumber">1</span> <span class="toctext">What is the DCMI Abstract Model, and what is its current status?</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#A_technical_summary_of_DCAM"><span class="tocnumber">1.1</span> <span class="toctext">A technical summary of DCAM</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#History_of_DCAM"><span class="tocnumber">1.2</span> <span class="toctext">History of DCAM</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Future_development_of_DCAM"><span class="tocnumber">1.3</span> <span class="toctext">Future development of DCAM</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#References"><span class="tocnumber">1.4</span> <span class="toctext">References</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>
<script>if (window.showTocToggle) { var tocShowText = "show"; var tocHideText = "hide"; showTocToggle(); } </script>
## What is the DCMI Abstract Model, and what is its current status? 

The DCMI Abstract Model (DCAM)<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup> is a specification which defines an abstract syntax for metadata records that is independent of, but mappable to, a diversity of concrete implementation syntaxes such as HTML/XHTML, XML, and any of the concrete syntaxes defined for RDF. The DCAM was developed as a basis for defining validatable metadata records, in a variety of popular implementation syntaxes, whose contents could straightforwardly be exposed as RDF triples.

### A technical summary of DCAM 

Most of the components of DCAM's abstract syntax correspond unambiguously to components of the RDF abstract syntax <sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>. However, the DCAM and RDF were designed for different purposes. Whereas the purpose of RDF is to "describe reality", the purpose of DCAM is to specify metadata record structures. To do this, DCAM defines several grouping constructs not covered by the RDF standards as of 2011, notably:

- Description Sets - the basis for "records" describing more than one resource
- Descriptions - sets of statements about a single resource
- DCAM Statements - like an RDF statement with additional context about the statement's value
- Value Surrogates - alternative slots for information describing string values versus values identified by URIs or blank nodes

These grouping constructs are used to cluster, at various levels of granularity, sets of syntactic slots holding the URIs and string literals used in instance metadata -- the URIs used for identifying described resources, values, properties, vocabulary encoding schemes, or RDF datatypes, and the literals used as language tags or text strings -- in short, the components of a metadata record that can be tested or validated.

The DCMI Abstract Model was designed to be used together with a constraint language <sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup> for specifying the contents of application-specific metadata record formats in a form independent of particular concrete encoding syntaxes, as exemplified in an application profile <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>. The record formats thus specified were intended to be implemented using concrete encoding syntaxes. Two concrete syntaxes for the representation of DCAM description sets were defined: an HTML/XHTML metadata profile <sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup> and an XML format <sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[6]</a></sup>. In addition, a mapping between the DCAM abstract syntax and the RDF abstract syntax was defined, allowing DCAM to be used with any concrete syntax for RDF <sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[7]</a></sup>.

### History of DCAM 

The DCMI Abstract Model and its family of related applications <sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[8]</a></sup> were in active development between 2003 and 2008. Work on the DCAM was originally undertaken in response to a proliferation of "Dublin Core" implementations among which interoperability was problematic due to an uncontrolled diversity of underlying models and syntaxes, negating many of the potential advantages of using a common vocabulary.

RDF, standardized by W3C with a more robust second version in 2004, was recognized by the DCAM authors as an obvious basis for their abstract model. At the time, however, RDF was seen by a large part of the Dublin Core community as a research project -- less as a fundamentally new way of conceptualizing metadata than as an ordinary XML format, though one perceived as over-complex. Instead of adopting RDF, therefore, its authors defined the DCAM project as one of clarifying and formalizing the native-DCMI model of metadata that had emerged from early Dublin Core workshops <sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[9]</a></sup> in a form that could be aligned with RDF over time.

By the late 2000s, the technological landscape had significantly changed. The idea of Linked Data, introduced in 2006 as a more accessible and focused variant of the Semantic Web vision of 2000, had acquired significant momentum -- a trend which validated DCAM's grounding in RDF. However, new developments in the mainstream Semantic Web community overlapped with some of the more innovative aspects of the DCAM approach. Notable examples include the notion of a SKOS Concept Scheme in W3C's Simple Knowledge Organization System, which provided a widely understood near-equivalent to the DCMI-specific notion of a Vocabulary Encoding Scheme <sup id="cite_ref-9" class="reference"><a href="#cite_note-9">[10]</a></sup>; the renewed effort to clarify the semantics of Named Graphs, which as of 2011 promises eventually to provide an RDF construct analogous to the Description Set <sup id="cite_ref-10" class="reference"><a href="#cite_note-10">[11]</a></sup>; and the development by W3C of RDFa, a specification for embedding RDF metadata unobtrusively into normal Web pages, which provided an alternative to the DCAM-based HTML/XHTML encoding guidelines <sup id="cite_ref-11" class="reference"><a href="#cite_note-11">[12]</a></sup><sup id="cite_ref-12" class="reference"><a href="#cite_note-12">[13]</a></sup>.

### Future development of DCAM 

It is difficult to track the use of freely available specifications once they are released on the Web, but as of 2010, the DCAM-related specifications, with the possible exception of specific syntax guidelines, appear not to have been widely implemented. Rather than building a bridge from more traditional metadata communities to the Semantic Web, the Abstract Model seems to have fallen between two stools -- its use of the Description Set abstraction perplexing to users more accustomed to metadata specifications defined in terms of a concrete syntax, and its added layer of DCMI-specific terminology confusing to users already comfortable with RDF.

In 2010, DCMI undertook a critical review of the DCAM approach <sup id="cite_ref-13" class="reference"><a href="#cite_note-13">[14]</a></sup>. Discussion of the review at a joint meeting of the DCMI Architecture Forum and the W3C Library Linked Data Incubator Group at DC-2010 <sup id="cite_ref-14" class="reference"><a href="#cite_note-14">[15]</a></sup> revealed a striking lack of consensus about the meaning -- and value -- of the DCAM approach. Some discussants agreed with its authors in seeing the DCAM as an abstract syntax for metadata records based on, and thus mappable to, RDF. Others, however, saw the potential value of DCAM as a "meta-model" describing the components of metadata descriptions at a high level of abstraction, independently of any basis in RDF <sup id="cite_ref-15" class="reference"><a href="#cite_note-15">[16]</a></sup>.

As written, the DCAM is clearly framed as the former -- i.e., as the basis for automating the creation of validatable metadata records whose contents can straightforwardly be exposed as RDF triples. Attaining such degrees of interoperability and automation implies a well-defined modeling basis, and the authors of DCAM saw RDF as the only candidate model with any traction.

Proponents of the "DCAM as meta-model" view, in contrast, felt that the model had value independently of RDF -- i.e., that the notion of "statements" grouped into "descriptions" and enclosed within a "description set" are valid in the absence of RDF's grammar of properties, classes, datatypes, and statements. Whatever the merits of this latter view, it was clear that to define DCAM as a meta-model independently of RDF, the base specification would need to be extensively re-written.

As of 2011, the DCMI Abstract Model retains the status of a DCMI Recommendation, reflecting the process of public comment periods and revisions through which it has passed. However, interest in the DCAM and the family of specifications stemming from it remains high. Whether that interest will focus on revision of the DCAM has yet to be determined.

***Disclaimer: the following is still under discussion by DCMI.***

In the absence of a strong set of reference implementations, the DCAM should be viewed as a largely theoretical specification. Regaining momentum on the DCAM as a basis for specifying RDF-compatible metadata records would require more resources -- authors, editors, and implementors with clear requirements. Re-casting the DCAM as a meta-model on a higher level of abstraction, on the other hand, would require equally as much effort, together with a well-grounded story for the function and value of such a meta-model in today's metadata landscape. For now, DCMI has chosen to leave the specifications in place -- both for their value as historical contributions and potentially as sources of requirements for future projects -- with the clarifications offered here.

### References 

1. ↑ [http://dublincore.org/documents/abstract-model](http://dublincore.org/documents/abstract-model)
2. ↑ [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)
3. ↑ [/mediawiki_wiki/Glossary/Description\_Set\_Profile](/mediawiki_wiki/Glossary/Description_Set_Profile)
4. ↑ [/mediawiki_wiki/Glossary/Application\_Profile](/mediawiki_wiki/Glossary/Application_Profile)
5. ↑ [http://dublincore.org/documents/dc-html/](http://dublincore.org/documents/dc-html/)
6. ↑ [http://dublincore.org/documents/dc-ds-xml/](http://dublincore.org/documents/dc-ds-xml/)
7. ↑ [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)
8. ↑ [/mediawiki_wiki/Glossary/DCAM\_Family\_of\_Specifications](/mediawiki_wiki/Glossary/DCAM_Family_of_Specifications)
9. ↑ [/mediawiki_wiki/Glossary/Dublin\_Core\_Grammatical\_Principles](/mediawiki_wiki/Glossary/Dublin_Core_Grammatical_Principles)
10. ↑ [http://www.w3.org/TR/skos-reference/](http://www.w3.org/TR/skos-reference/)
11. ↑ [http://w3.org/2011/rdf-wg/](http://w3.org/2011/rdf-wg/)
12. ↑ [http://www.w3.org/TR/rdfa-syntax/](http://www.w3.org/TR/rdfa-syntax/)
13. ↑ [http://dublincore.org/documents/dc-html/](http://dublincore.org/documents/dc-html/)
14. ↑ [/mediawiki_wiki/Review\_of\_DCMI\_Abstract\_Model](/mediawiki_wiki/Review_of_DCMI_Abstract_Model)
15. ↑ [http://www.w3.org/2005/Incubator/lld/wiki/F2F\_Pittsburgh](http://www.w3.org/2005/Incubator/lld/wiki/F2F_Pittsburgh)
16. ↑ [http://lists.w3.org/Archives/Public/public-lld/2010Oct/0098.html](http://lists.w3.org/Archives/Public/public-lld/2010Oct/0098.html)
<!-- 
NewPP limit report
Preprocessor node count: 309/1000000
Post-expand include size: 0/2097152 bytes
Template argument size: 0/2097152 bytes
Expensive parser function count: 0/100
-->

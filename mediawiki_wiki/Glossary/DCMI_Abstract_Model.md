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
- "/mediawiki_wiki/Glossary/DCMI_Abstract_Model.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 13 May 2011, at 22:16.  
This page has been accessed 135,138 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DCMI_Abstract_Model"><span class="tocnumber">1</span> <span class="toctext">DCMI Abstract Model</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Early_efforts_to_define_a_data_model_for_Dublin_Core"><span class="tocnumber">1.1</span> <span class="toctext">Early efforts to define a data model for Dublin Core</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#The_rationale_for_the_DCMI_Abstract_Model"><span class="tocnumber">1.2</span> <span class="toctext">The rationale for the DCMI Abstract Model</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Relationship_of_DCAM.27s_Description_Set_Model_to_RDF"><span class="tocnumber">1.3</span> <span class="toctext">Relationship of DCAM's Description Set Model to RDF</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Future_development_of_DCAM"><span class="tocnumber">1.4</span> <span class="toctext">Future development of DCAM</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#References"><span class="tocnumber">1.5</span> <span class="toctext">References</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## DCMI Abstract Model 

The DCMI Abstract Model<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup> (DCAM) specifies an abstract syntax for metadata records independent of particular concrete encoding syntaxes. The components of DCAM's abstract syntax map unambiguously to components of the RDF abstract syntax. In addition, DCAM's abstract syntax provides several grouping constructs not present in RDF -- notably "description sets" (mappable in principle to a named graph instantiated as a "metadata record"), "descriptions" (mappable in principle to a sub-graph of RDF triples about a single subject), "DCAM statements" (mappable to a sub-graph composed of an RDF statement plus contextual information about the value of that statement), and "value surrogates" (mappable to the different sets of statements used to describe values directly encoded as literal string values as opposed to values identified by URIs or blank nodes). These constructs are used to group syntactic "slots" for holding the URIs and string literals used in instance metadata. URIs (for identifying described resources, values, properties, vocabulary encoding schemes, or RDF datatypes) and literals (language tags or text strings) are the components of the DCAM abstract syntax that can be tested or validated. The DCMI Abstract Model was designed to be used together with a constraint language for specifying the contents of application-specific metadata record formats in a form independent of particular concrete encoding syntaxes -- the function of a Dublin Core [application profile](/mediawiki_wiki/Glossary/Application_Profile "Glossary/Application Profile").

### Early efforts to define a data model for Dublin Core 

The Dublin Core community began in 1995 by defining twelve (later fifteen) "elements". These elements were supplemented in 1997 by the addition of "qualifiers" (originally called "Canberra qualifiers"<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>). In July 2000, with the publication of a DCMI Recommendation, "Dublin Core Qualifiers", qualifiers were differentiated into "element refinements" and "element encoding schemes"<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>. This typology of terms of [grammatical principles](/mediawiki_wiki/Glossary/Dublin_Core_Grammatical_Principles "Glossary/Dublin Core Grammatical Principles"), which evolved in a 2003 guide for DCMI Usage Board vocabulary maintenance decisions--"DCMI Grammatical Principles"--to further distinguish "encoding schemes" into "vocabulary encoding schemes" and "syntax encoding schemes" <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>.

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

### Relationship of DCAM's Description Set Model to RDF 

The centerpiece of DCAM is the Description Set Model, and the relationship of constructs of this model to RDF are described in the 2008 guidelines, "Expressing Dublin Core metadata using the Resource Description Framework"] (DC-RDF) <sup id="cite_ref-18" class="reference"><a href="#cite_note-18">[19]</a></sup>.

The Description Set Model specifies both a set of syntactic elements (things found in data) and a set of referents in the real world (things to which the syntactic elements may be interpreted to refer). Ignoring the semantic element of the Description Set Model, which has been justifiably criticized as "confusing", it is possible to view the Description Set Model strictly in terms of its syntactic elements. These include grouping constructs (Description Set, Description, Statement, Non-Literal Value Surrogate, and Literal Value Surrogate) and slots for URIs and character strings (Described Resource URI, Property URI, Value URI, Vocabulary Encoding Scheme URI, Syntax Encoding Scheme URI, Value String Language, Plain Value String, and Typed Value String). One might think of these slots as components of the DCAM abstract syntax that can be tested or validated. In the DCMI Abstract Model, these syntactic elements are described using UML, but they are more popularly depicted in the form of a nested metadata template, as in Figure 1 below.

[<img alt="Figure 1: Description Set Model (part of DCMI Abstract Model)" src="/mediawiki_wiki/images/DescriptionSetModel75.jpg" width="494" height="389">](/mediawiki_wiki/images/DescriptionSetModel75.jpg "Figure 1: Description Set Model (part of DCMI Abstract Model)")  
**Figure 1: Description Set Model (part of DCMI Abstract Model)**

As an illustration of how the syntactic elements of the Description Set Model are used, Figure 2 shows a set of example information values in the placeholders corresponding to those shown in Figure 1.

[<img alt="Figure 2: Description Set Model slots with example URIs and character strings" src="/mediawiki_wiki/images/DescriptionSetModelValues75.jpg" width="530" height="370">](/mediawiki_wiki/images/DescriptionSetModelValues75.jpg "Figure 2: Description Set Model slots with example URIs and character strings")  
**Figure 2: Description Set Model slots with example URIs and character strings**

How the elements of the Description Set Model relate to RDF is depicted in Figure 3 and described in more detail in Appendix B below.

[<img alt="Figure 3: Relationship of Description Set Profile components to RDF graphs" src="/mediawiki_wiki/images/DcamAndRdfGraph.jpg" width="579" height="437">](/mediawiki_wiki/images/DcamAndRdfGraph.jpg "Figure 3: Relationship of Description Set Profile components to RDF graphs")  
**Figure 3: Relationship of Description Set Profile components to RDF graphs**

### Future development of DCAM 

It is difficult to track the use of freely available specifications once they are released on the Web, but as of 2010, DCMI was not aware that any of the DCAM-related specifications, with the possible exception of specific syntax guidelines, had been widely implemented. Rather than building a bridge from more traditional metadata communities to the Semantic Web, the Abstract Model appeared to have fallen between two stools -- its use of the "description set" abstraction perplexing to users more accustomed to metadata specifications defined in terms of a concrete syntax, and its added layer of Dublin-Core-specific terminology confusing to users already comfortable with the RDF model. Faced with a lack of uptake of the DCAM-based approach to application profiles, DCMI undertook a critical review of the DCAM specification stack<sup id="cite_ref-19" class="reference"><a href="#cite_note-19">[20]</a></sup> as the basis for a discussion at a joint meeting of the DCMI Architecture Forum and the W3C Library Linked Data Incubator Group in October 2010<sup id="cite_ref-20" class="reference"><a href="#cite_note-20">[21]</a></sup>. ***INSERT CONCLUSIONS HERE***.

### References 

1. ↑ [http://dublincore.org/documents/abstract-model](http://dublincore.org/documents/abstract-model)
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
19. ↑ [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)
20. ↑ [/mediawiki_wiki/Review\_of\_DCMI\_Abstract\_Model](/mediawiki_wiki/Review_of_DCMI_Abstract_Model)
21. ↑ [http://www.w3.org/2005/Incubator/lld/wiki/F2F\_Pittsburgh](http://www.w3.org/2005/Incubator/lld/wiki/F2F_Pittsburgh)


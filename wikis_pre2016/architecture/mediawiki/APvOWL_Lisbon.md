---
title: APvOWL Lisbon
date: 2013-08-12
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/APvOWL_Lisbon.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 August 2013, at 14:27.  
This page has been accessed 69,872 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Application_Profiles_as_an_alternative_to_OWL_Ontologies"><span class="tocnumber">1</span> <span class="toctext">Application Profiles as an alternative to OWL Ontologies</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#FRBRer_Ontology"><span class="tocnumber">1.1</span> <span class="toctext">FRBRer Ontology</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Open_Annotation_Data_Model_as_an_Application_Profile"><span class="tocnumber">1.2</span> <span class="toctext">Open Annotation Data Model as an Application Profile</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Europeana"><span class="tocnumber">1.3</span> <span class="toctext">Europeana</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-5"><a href="#Discussion"><span class="tocnumber">2</span> <span class="toctext">Discussion</span></a></li>
        <li class="toclevel-1 tocsection-6"><a href="#References"><span class="tocnumber">3</span> <span class="toctext">References</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## Application Profiles as an alternative to OWL Ontologies

**Discussion Paper for DC2013 Session**

Convenors: Tom Baker & Karen Coyle

Day/Time: Wednesday, 14:30-18:00

Since 2000, much of the research and development in the Dublin Core community has focused on the concept of «Application Profile» <sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>. The «Singapore Framework for Dublin Core Application Profiles» <sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup> and the related «Description Set Profile Constraint Language» <sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>, both based on the «DCMI Abstract Model» <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>, describe a method for expressing metadata patterns in platform-independent templates. Application Profiles describe the structure and contents of data. By definition, Application Profiles use RDF vocabularies declared elsewhere and merely specify how the terms of those vocabularies are constrained and packaged in matching sets of instance data.

Ontologies expressed using the Web Ontology Language (OWL), in contrast, typically define an (inevitably reductionist) model of the world by declaring what classes of things are found in that world, their properties, and their relationships. These can be leveraged to infer additional information about things that are described using the ontology.

In Application Profiles, constraints specify how RDF vocabularies are used in data without changing how those RDF vocabularies are defined. Classes and properties can be reused in different application profiles without changing their underlying definition or affecting how they are used elsewhere. OWL Ontologies, in contrast, typically define constraints as an integral part of the vocabulary itself. To describe something using vocabulary from an OWL Ontology is to implicitly accept its underlying model of the universe.

This session examines how the dual requirements of (data-oriented) quality control and (Web-oriented) interoperability are addressed using these two approaches. This topic is particularly timely in light of interest in RDF validation in the W3C community and of the role of community profiles in the data model of the «Bibliographic Framework Transition Initiative». <sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup>

Whether patterns are expressed using constraints on data or as constraints on a model of reality can have unintended consequences when data is consumed in the Linked Data environment. The choice between Application Profiles and OWL Ontologies depends on how particular data is intended to be used.

The session will try to achieve a common view on the strengths and weaknesses of the two approaches and identify next steps in the development of simple and practical conventions for Application Profiles.

We intend to stimulate discussion of by presenting real-life examples.

### FRBRer Ontology

Gordon Dunsire will present a short discussion of issues around the ontological expression of FRBR<sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[6]</a></sup> and RDA<sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[7]</a></sup>, the thinking behind the proposal for generalized properties (with an update on its status), and the role of application profiles for RDA (one of the 2007 "London Meeting" resolutions). To contain what could be a lengthy discussion, we propose to focus on properties such as the following:

[<img alt="P3056reduced.jpg" src="/mediawiki_wiki/images/P3056reduced.jpg" width="500" height="265">](/mediawiki_wiki/images/P3056reduced.jpg)

### Open Annotation Data Model as an Application Profile

We will examine a W3C Community draft, Open Annotation Data Model (OA). Two specifications -- the Open Annotation Ontology<sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[8]</a></sup> and the Open Annotation Data Model <sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[9]</a></sup> -- demonstrate a separation between an open ontology and constraints on instance data. The OA Ontology contains few constraints, creating a flexible base for the constraints in the specification.

[<img alt="Oaeg.png" src="/mediawiki_wiki/images/Oaeg.png" width="500" height="262">](/mediawiki_wiki/images/Oaeg.png)

The OA specification, which we interpret to be an Application Profile, then describes the usage of the ontology, with constraints and preferred practices, as in the following example from Section 2.2:

> There MAY be exactly 1 oa:serializedAt property per Annotation, and MUST NOT be more than 1. The datetime MUST be expressed in the xsd:dateTime format, and SHOULD have a timezone specified.

The OA Ontology puts no constraints on the range of Annotation bodies or targets, so these default to rdfs:Resource. This allows OA to annotate any resource with any resource.

Although the OA Model is complex, with features such as selectors, states, and serialization, the core of the model is quite simple. The problem of describing annotations has been addressed many times and there are existing specifications and applications from a number of communities. The openness of the OA Ontology should make it possible to develop interoperability between these models so that annotations can be shared.

### Europeana

At the beginning of the second session, Antoine Isaac of Europeana will discuss design considerations for the Europeana Data Model<sup id="cite_ref-9" class="reference"><a href="#cite_note-9">[10]</a></sup> and how this model might inform the thinking around Application Profiles.

## Discussion

We propose the following questions for discussion:

1. Inference schemas, such as OWL Ontologies, specify a simplified, "cartoon" universe that can be leveraged to infer additional knowledge based on what is already known. The more tightly that cartoon universe is defined, the more information one will be able to infer.

<dl><dd>
<dl><dd> For what purposes is it most appropriate to define an ontology, or inference schema, using strong semantic constraints? What advantages do such a schema offer to a community of practice?
</dd></dl>

</dd></dl>


2. Validation schemas, such as Application Profiles, are designed to ensure the quality and consistency of data by specifying constraints on the structure and content of that data.

<dl><dd>
<dl><dd> For what purposes is it most appropriate to specify a validation schema such as an Application Profile? If a given dataset was created using a validation schema, such as an Application Profile, how can the creators of data advertise, and consumers of the data discover, the schema or profile used? Might datasets describe themselves using a property for this purpose?
</dd></dl>

</dd></dl>


3. To make use of existing vocabularies in a linked environment, it is important that users can understand the semantics of the elements they are re-using and to be able to use these correctly.

<dl><dd>
<dl><dd> When is it desirable to define properties strongly linked to specific data models, and when is it better to anticipate that they be used with other models? What are the implications of strongly versus weakly constrained vocabularies for their uptake and consumption by users who do not know (or understand) a given data model?
</dd></dl>

</dd></dl>

* * *

## References

1. ↑ [http://www.ariadne.ac.uk/issue25/app-profiles](http://www.ariadne.ac.uk/issue25/app-profiles)
2. ↑ [http://dublincore.org/documents/singapore-framework/](http://dublincore.org/documents/singapore-framework/)
3. ↑ [http://dublincore.org/documents/dc-dsp/](http://dublincore.org/documents/dc-dsp/)
4. ↑ [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)
5. ↑ [http://bibframe.org/](http://bibframe.org/)
6. ↑ [http://www.ifla.org/publications/functional-requirements-for-bibliographic-records](http://www.ifla.org/publications/functional-requirements-for-bibliographic-records)
7. ↑ [http://dlib.org/dlib/january10/hillmann/01hillmann.html](http://dlib.org/dlib/january10/hillmann/01hillmann.html)
8. ↑ [http://www.w3.org/ns/oa.rdf](http://www.w3.org/ns/oa.rdf)
9. ↑ [http://www.openannotation.org/spec/core/](http://www.openannotation.org/spec/core/)
10. ↑ [http://europeana.eu/schemas/edm/](http://europeana.eu/schemas/edm/)


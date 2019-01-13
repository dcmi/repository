---
title: DSPanalysis
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/RDF_Application_Profiles/DSPanalysis.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 17 October 2014, at 15:25.  
This page has been accessed 76,150 times.

Karen Coyle, [your name here]

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Introduction"><span class="tocnumber">1</span> <span class="toctext">Introduction</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#DSP_Primary_Structure"><span class="tocnumber">2</span> <span class="toctext">DSP Primary Structure</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Default_values"><span class="tocnumber">3</span> <span class="toctext">Default values</span></a></li>
        <li class="toclevel-1 tocsection-4">
          <a href="#DSP_for_RDF"><span class="tocnumber">4</span> <span class="toctext">DSP for RDF</span></a>
          <ul>
            <li class="toclevel-2 tocsection-5"><a href="#Problems.2C_issues"><span class="tocnumber">4.1</span> <span class="toctext">Problems, issues</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Missing_capabilities"><span class="tocnumber">4.2</span> <span class="toctext">Missing capabilities</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-7">
          <a href="#A_Friendly_DSP_Interface"><span class="tocnumber">5</span> <span class="toctext">A Friendly DSP Interface</span></a>
          <ul>
            <li class="toclevel-2 tocsection-8"><a href="#Terminology_Comparison"><span class="tocnumber">5.1</span> <span class="toctext">Terminology Comparison</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Introduction

The Description Set Profile (DSP) as originally developed was based on the Dublin Core Abstract Model (DCAM), not on RDF. In addition, it was developed as an XML schema, which had some effect on its design. This page takes a look at the DSP some 8 years later, and with new use cases.

The DSP provides something resembling a record structure, and does make use of a hierarchy. The upper level is the Description Set, basically analogous to a record or a single but full description of a resource. Below that are individual descriptions, each of which represents an entity or thing that is to be part of the full description. In a bibliographic description set, for example, there can be descriptions for published resources, for people, for places. In a business personnel system there would be descriptions for departments and employees.

The third level of the DSP is that of statements. Within each description there is a list of the individual properties that can be used to describe the description entity.

In terms of constraints, the DSP's "literal statement" and "non-literal statement" are property types that describe the property in the statement template based on its value. These correspond approximately to OWL dataProperty and objectProperty. The next level of the diagram below those two are constraints on the valid values for the property. These latter extend beyond the RDF concept of ranges. Where ranges describe a value type, validation functions require a method to define actual value contents.

In the current DSP there are constraint properties assigned to descriptions and statements. In addition to the expected cardinality constraints, there are constraints such as "stand-alone" (binary), language requirements (required, forbidden, optional), etc. Because the DSP was never implemented (except a few experimentations), this page is structured to develop a new view of the DSP starting with the simplest structure, and at least initially separates the constraints from the structural elements.

Note that the DSP attempts to fulfill a number of different requirements:

1. Delineate the components of a full description, aka a record
2. Describe the vocabulary terms being used, allowing a mix'n'match approach
3. Describe requirements that are specific for validation of records and data sets

## DSP Primary Structure

The original DSP has components that are based on the DCAM. [<img alt="Dsp-uml.png" src="/mediawiki_wiki/images/Dsp-uml.png" width="250" height="213">](/mediawiki_wiki/images/Dsp-uml.png)

The main levels of the DSP are:

- Description set profile
  - Description template
    - Statement template

The top two levels have unique identifiers. The statement template, as originally defined, does not have an identifier of its own: the property identifier is used instead. This has proven problematic, and is an area that will probably need to change.

The remainder of the DSP consists of qualifiers on the statement template.

## Default values

- min/max = The default in all cases for "minimum occurrence" constraints is "0", meaning that the element is not required. The default in all cases for maximum occurrence constraint is "infinity" meaning that there are no limits on the number of occurrences.
- standalone = "both"
- ResourceClass = no constraint
- type = both literal and non-literal are allowed
- literalOption = no constraint
- LanguageOccurrence = "optional"
- Language = no constraint
- SyntaxEncodingSchemeOccurrence = "optional"
- SyntaxEncodingSchema = no constraint
- descriptionTemplateRef = related description not allowed
- ValueClass = no constraint
- ValueURIOccurrence = "optional"
- ValueURI = no constraint
- VocabularyEncodingSchemeOccurrence = "optional"
- VocabularyEncodingScheme = no constraint

## DSP for RDF

### Problems, issues

1. Statement template may need an identifier (IRI). This needs to be tested: IRI vs. blank node.

### Missing capabilities

To be discussed

_(currently in no particular order)_

1. Define domain and/or range: the DSP does not have a way to define (or re-define) domain and range constraints. If the AP can define domain and range, consideration must be given to how this interacts with the domain/range as defined in the underlying vocabulary.
2. Statement template identifier: the DSP does not assign an identifier to the statement template, but uses instead the identifier for the property. This was noted in a Usage Board review of the SWAP profile { [http://dublincore.org/usage/reviews/2009/swap/](http://dublincore.org/usage/reviews/2009/swap/)]. Without an identifier, re-use of statement templates is not possible, and it may also make it impossible to use the same property more than once in the same Description Set.
3. An equivalent to owl:annotationProperty.
4. Exclusive "OR": to be able to indicate "A or B" for description templates and statement templates. (With the exception of description templates marked "standAlone=no" all other templates are inclusive OR.) One way to do this would be to add more levels of structure to the DSP so that "OR"d templates would be in a group. Another would be to add a property that says: cannot be used with B. Yet another would be to somehow combine DSP with ShEx to express these constraints.
5. Property groups: In some cases, like foaf:familyName foaf:firstName, you want to bind some properties as group that must be used together. These might be defined as descriptions on their own, but we should think also if there's another way to do this, such as a property "must be used with..."
6. Order of statements or values: the ability to say that these statements must be in this order, or that the values from a value list must be in a particular order.

## A Friendly DSP Interface

It is known that the DC Abstract Model (DCAM) is often considered confusing, perhaps primarily because of its terminology. DSP is based on DCAM, and thus suffers the same terminology problems. DSP was developed before W3C developed OWL, and has many of the same concepts, just expressed differently. As many vocabulary developers are becoming familiar with OWL, it may be useful to align the DSP, at least in a user interface, with OWL terminology.

Thus, a "literal statement template" corresponds to owl:dataProperty, and "non-literal statement template" corresponds to owl:objectProperty. In addition, OWL defines a owl:annotationProperty which has no defined range and is exempted from reasoning. In practice, owl:annotationProperties tend to be used for administrative metadata and and common in RDF (non-OWL) vocabularies. This would need to be added to the DSP if it is to be included in validation.

My attempt to diagram this is:

[<img alt="DSP.jpg" src="/mediawiki_wiki/images/DSP.jpg" width="405" height="524">](/mediawiki_wiki/images/DSP.jpg)

### Terminology Comparison

This is a comparison of terminology between the DCAM-based DSP and a suggestion for friendlier terminology (which could be considered "labels").

<table class="wikitable">
  <caption> Terminology Comparison
  </caption>
  <tr>
    <th>DCAM-based term
    </th>
    <th>Suggested term
    </th>
    <th>Constraints
    </th>
  </tr>
  <tr>
    <td>Description set profile
    </td>
    <td>Description set profile [URI]
    </td>
    <td>
    </td>
  </tr>
  <tr>
    <td>Description template
    </td>
    <td>Description template
    </td>
    <td>cardinality; standalone; resource class
    </td>
  </tr>
  <tr>
    <td>Statement template
    </td>
    <td>Statement
    </td>
    <td>cardinality; type;
    </td>
  </tr>
  <tr>
    <td>Literal statement template
    </td>
    <td>Literal property template(owl:dataProperty)
    </td>
    <td>
    </td>
  </tr>
  <tr>
    <td>
    </td>
    <td>Literal property
    </td>
    <td>literal list; sub-property; language
    </td>
  </tr>
  <tr>
    <td>Syntax Encoding scheme
    </td>
    <td>Typed data property
    </td>
    <td>
    </td>
  </tr>
</table>


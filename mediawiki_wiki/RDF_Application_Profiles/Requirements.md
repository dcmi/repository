---
title: Requirements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RDF_Application_Profiles/Requirements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 27 August 2015, at 15:36.  
This page has been accessed 84,376 times.

[<img alt="RDF AP TG logo" src="/archive/mediawiki_wiki/images/RdfAP_tg.png" width="200" height="141">](/archive/mediawiki_wiki/images/RdfAP_tg.png "RDF AP TG logo")

* * *

##### [Handbook](/archive/mediawiki_wiki/DCMI_Handbook "DCMI Handbook"): [Table of Contents](/archive/mediawiki_wiki/DCMI_Handbook/ "DCMI Handbook") 
<dl>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Governing_Board" title="DCMI Governing Board">Governing Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Governing_Board/finance" title="DCMI Governing Board/finance">Membership &amp; Finance</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Governing_Board/nominations" title="DCMI Governing Board/nominations">Nominations &amp; Bylaws</a> 
</dd>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Technical_Board" title="DCMI Technical Board">Technical Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/usage" title="DCMI Technical Board/usage">Usage</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/standards" title="DCMI Technical Board/standards">Standards &amp; Liaisons</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/specifications" title="DCMI Technical Board/specifications">Community Specifications</a>
</dd>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Advisory_Board" title="DCMI Advisory Board">Advisory Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Advisory_Board/meetings" title="DCMI Advisory Board/meetings">Conferences &amp; Meetings</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Advisory_Board/documentation" title="DCMI Advisory Board/documentation">Education &amp; Outreach</a>
</dd>
<dd> ► <i>Management:</i> <a href="/archive/mediawiki_wiki/Exec_Committee" title="Exec Committee">Executive</a> ◘ <a href="/archive/mediawiki_wiki/Exec_Committee/directorate" title="Exec Committee/directorate">Directorate</a>
</dd>
</dl>

* * *

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1"><a href="#Handbook:_Table_of_Contents"><span class="tocnumber">1</span> <span class="toctext">Handbook: Table of Contents</span></a></li>
        <li class="toclevel-1 tocsection-1">
          <a href="#Report_on_validation_requirements"><span class="tocnumber">2</span> <span class="toctext">Report on validation requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Introduction"><span class="tocnumber">2.1</span> <span class="toctext">Introduction</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-3">
          <a href="#Meta-Requirements"><span class="tocnumber">3</span> <span class="toctext">Meta-Requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-4"><a href="#R-208_Human-readable_documentation_of_usage_of_all_elements_from_the_perspective_of_the_application_profile"><span class="tocnumber">3.1</span> <span class="toctext">R-208 Human-readable documentation of usage of all elements from the perspective of the application profile</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#R-214_Application_Profile_administrative_information"><span class="tocnumber">3.2</span> <span class="toctext">R-214 Application Profile administrative information</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#R-34_Available_Class_Definition"><span class="tocnumber">3.3</span> <span class="toctext">R-34 Available Class Definition</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#R-224_Use_sub-super_relations_in_validation"><span class="tocnumber">3.4</span> <span class="toctext">R-224 Use sub-super relations in validation</span></a></li>
            <li class="toclevel-2 tocsection-8"><a href="#R-117_Define_context_of_constraints"><span class="tocnumber">3.5</span> <span class="toctext">R-117 Define context of constraints</span></a></li>
            <li class="toclevel-2 tocsection-9"><a href="#R-129_Machine_Understandable_Syntaxes"><span class="tocnumber">3.6</span> <span class="toctext">R-129 Machine Understandable Syntaxes</span></a></li>
            <li class="toclevel-2 tocsection-10"><a href="#R-220_Define_used_vocabulary"><span class="tocnumber">3.7</span> <span class="toctext">R-220 Define used vocabulary</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#R-115_Closed_World_Assumption_.28CWA.29"><span class="tocnumber">3.8</span> <span class="toctext">R-115 Closed World Assumption (CWA)</span></a></li>
            <li class="toclevel-2 tocsection-12"><a href="#R-205_Varying_levels_of_.22error.22"><span class="tocnumber">3.9</span> <span class="toctext">R-205 Varying levels of "error"</span></a></li>
            <li class="toclevel-2 tocsection-13"><a href="#R-206_Define_allowed_namespaces_in_a_profile"><span class="tocnumber">3.10</span> <span class="toctext">R-206 Define allowed namespaces in a profile</span></a></li>
            <li class="toclevel-2 tocsection-14"><a href="#R-207_Support_multiple_levels_of_description"><span class="tocnumber">3.11</span> <span class="toctext">R-207 Support multiple levels of description</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-15">
          <a href="#General_requirements"><span class="tocnumber">4</span> <span class="toctext">General requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-16"><a href="#Validate_for_uniqueness_of_IRIs"><span class="tocnumber">4.1</span> <span class="toctext">Validate for uniqueness of IRIs</span></a></li>
            <li class="toclevel-2 tocsection-17"><a href="#R-10_Define_Disjoint_Properties"><span class="tocnumber">4.2</span> <span class="toctext">R-10 Define Disjoint Properties</span></a></li>
            <li class="toclevel-2 tocsection-18"><a href="#R-171_Validate_IRIs_by_Dereferencing"><span class="tocnumber">4.3</span> <span class="toctext">R-171 Validate IRIs by Dereferencing</span></a></li>
            <li class="toclevel-2 tocsection-19"><a href="#R-171bis_Validate_resource_.28media.29_type_returned_from_dereferencing"><span class="tocnumber">4.4</span> <span class="toctext">R-171bis Validate resource (media) type returned from dereferencing</span></a></li>
            <li class="toclevel-2 tocsection-20"><a href="#R-98_Check_Validity_Of_IRIs"><span class="tocnumber">4.5</span> <span class="toctext">R-98 Check Validity Of IRIs</span></a></li>
            <li class="toclevel-2 tocsection-21"><a href="#R-211_Cardinality_constraints"><span class="tocnumber">4.6</span> <span class="toctext">R-211 Cardinality constraints</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-22">
          <a href="#Class_requirements"><span class="tocnumber">5</span> <span class="toctext">Class requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-23"><a href="#R-209_Define_valid_classes"><span class="tocnumber">5.1</span> <span class="toctext">R-209 Define valid classes</span></a></li>
            <li class="toclevel-2 tocsection-24"><a href="#R-7_Disjoint_Classes"><span class="tocnumber">5.2</span> <span class="toctext">R-7 Disjoint Classes</span></a></li>
            <li class="toclevel-2 tocsection-25"><a href="#R-225_Validation_of_associated_classes_in_one_Description_Set"><span class="tocnumber">5.3</span> <span class="toctext">R-225 Validation of associated classes in one Description Set</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-26">
          <a href="#Property_requirements"><span class="tocnumber">6</span> <span class="toctext">Property requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-27"><a href="#R-210_Define_exclusively_allowed_properties_for_a_context"><span class="tocnumber">6.1</span> <span class="toctext">R-210 Define exclusively allowed properties for a context</span></a></li>
            <li class="toclevel-2 tocsection-28"><a href="#R-67_Boolean_property_patterns"><span class="tocnumber">6.2</span> <span class="toctext">R-67 Boolean property patterns</span></a></li>
            <li class="toclevel-2 tocsection-29"><a href="#R-68_Required_Properties"><span class="tocnumber">6.3</span> <span class="toctext">R-68 Required Properties</span></a></li>
            <li class="toclevel-2 tocsection-30"><a href="#R-69_Optional_Properties"><span class="tocnumber">6.4</span> <span class="toctext">R-69 Optional Properties</span></a></li>
            <li class="toclevel-2 tocsection-31"><a href="#R-70_Repeatable_Properties"><span class="tocnumber">6.5</span> <span class="toctext">R-70 Repeatable Properties</span></a></li>
            <li class="toclevel-2 tocsection-32"><a href="#R-71_Conditional_Properties"><span class="tocnumber">6.6</span> <span class="toctext">R-71 Conditional Properties</span></a></li>
            <li class="toclevel-2 tocsection-33"><a href="#R-72_Recommended_Properties"><span class="tocnumber">6.7</span> <span class="toctext">R-72 Recommended Properties</span></a></li>
            <li class="toclevel-2 tocsection-34"><a href="#R-25_Property_Domain"><span class="tocnumber">6.8</span> <span class="toctext">R-25 Property Domain</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-35">
          <a href="#Value_Requirements"><span class="tocnumber">7</span> <span class="toctext">Value Requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-36"><a href="#R-35_Property_Range"><span class="tocnumber">7.1</span> <span class="toctext">R-35 Property Range</span></a></li>
            <li class="toclevel-2 tocsection-37"><a href="#R-43_Literal_Value_Comparison"><span class="tocnumber">7.2</span> <span class="toctext">R-43 Literal Value Comparison</span></a></li>
            <li class="toclevel-2 tocsection-38"><a href="#R-44_Pattern_Matching_on_RDF_Literals"><span class="tocnumber">7.3</span> <span class="toctext">R-44 Pattern Matching on RDF Literals</span></a></li>
            <li class="toclevel-2 tocsection-39"><a href="#R-47_Specify_and_validate_language_tags"><span class="tocnumber">7.4</span> <span class="toctext">R-47 Specify and validate language tags</span></a></li>
            <li class="toclevel-2 tocsection-40"><a href="#R-49_Property_occurs_once_per_language_tag"><span class="tocnumber">7.5</span> <span class="toctext">R-49 Property occurs once per language tag</span></a></li>
            <li class="toclevel-2 tocsection-41"><a href="#R-30_Define_value_lists"><span class="tocnumber">7.6</span> <span class="toctext">R-30 Define value lists</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-42"><a href="#Requirements_Classification"><span class="tocnumber">8</span> <span class="toctext">Requirements Classification</span></a></li>
      </ul>
    </td>
  </tr>
</table>


# Report on validation requirements

**Creator:** DCMI Task Group on RDF Application Profiles

**Date Issued:** 2015-08-11

**Identifier:** [http://wiki.dublincore.org/index.php?title=RDF\_Application\_Profiles/Requirements](http://wiki.dublincore.org/index.php?title=RDF_Application_Profiles/Requirements)

**Replaces:** [/archive/mediawiki_wiki/Deliverable\_1](/archive/mediawiki_wiki/Deliverable_1)

**Is Replaced By:** Not applicable

**Latest Version:** [/archive/mediawiki_wiki/RDF\_Application\_Profiles/Requirements](/archive/mediawiki_wiki/RDF_Application_Profiles/Requirements)

**Status of Document:** Draft

**Description of Document:** This document is the first deliverable of the "DCMI RDF Application Profiles Task Force" (DCMI RDF-AP). It reports on the current state of validation requirements in August 2015.

**Note:** Items with titles in bold are considered by the group to be **core** validation requirements.

**Note:** These are requirements based on [these Use Cases](/archive/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable)

## Introduction

This report supplements the Report on Use Cases [these Use Cases](/archive/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable). Requirements are derived from the use cases and specific case studies. See that report for the list of projects that submitted data for this study.

The full descriptions of case studies and use cases can be found in the [task force wiki](/archive/mediawiki_wiki/RDF_Application_Profiles). Case studies and the corresponding use cases are collected in the [DCMI RDF-AP database](http://purl.org/net/rdf-application-profiles) (see [DCMI RDF Application Profiles database on case studies, use cases, requirements, and solutions](/archive/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable#DCMI_RDF_Application_Profiles_database_on_case_studies,_use_cases,_requirements,_and_solutions)).

# Meta-Requirements

## **[R-208 Human-readable documentation of usage of all elements from the perspective of the application profile](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/415)**

**Description:** Provide human-readable documentation for first order elements of an application profile (especially, properties, classes). Taking properties as example: the goal is to provide a documentation or comments area that is intended for human readers where a description of the property can be made. This could both define the property ("title - the title of the resource being described") as well as include other information ("date of publication - in most cases the date of publication is a four-digit year, however there are other dates used, such as month and year. As dates on the items may not be in any standard format, this is a simple text field.")

**Related W3C requirement:** [Annotations](https://www.w3.org/2014/data-shapes/wiki/Requirements#Annotations) [Property Labels at Shape](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Labels_at_Shape) [Property Comment in a Shape](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Comment_in_a_Shape)

## **[R-214 Application Profile administrative information](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/428)**

**Description:** The application profile must self-describe (e.g. there must be an available ontology for APs), and must have administrative information like creator, date of creation, version, and rights.

**Related W3C requirement:** [Annotations](https://www.w3.org/2014/data-shapes/wiki/Requirements#Annotations)

## [R-34 Available Class Definition](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/41)

**Description:**

- if a type is used in constraints then the definition of the type have to be available
- Type Dependency

## [R-224 Use sub-super relations in validation](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451)

**Description:** Validation of instances data (direct or indirect) exploiting the subclass or sub-property link in a given ontology. This validation can indicate when the data is verbose (redundant) or expressed at a too general level, and could be improved.

## **[R-117 Define context of constraints](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/148)**

**Description:** Elements from vocabularies (as defined in namespace) can be re-used across many datasets and applications. Examples are:

- application profiles vs vocabulary-level axioms: distinguish between constraints that apply to everything in a specified namespace (e.g. FOAF) and constraints that apply to specific contexts
- application profiles documentation: describe the specific purpose (application) of a set of constraints
- ability to select an appropriate AP based on some information in the data, such as the provider, the genre, etc.
- validate a dataset against one (or more) application-specific profiles (sets of constraints), allowing multiple perspectives on validation of the same data

**Related W3C requirement: [Named Shapes](https://www.w3.org/2014/data-shapes/wiki/Requirements#Named_Shapes) [Association of Class with Shape](https://www.w3.org/2014/data-shapes/wiki/Requirements#Association_of_Class_with_Shape) (maybe)**

## **[R-129 Machine Understandable Syntaxes](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/160)**

**Description:**

- discoverable by programs
- machine readable

## [R-220 Define used vocabulary](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/444)

**Description:** Used vocabularies must be defined properly in the application profile. Defining vocabulary usage (Class) makes it easier to validate if the used vocabulary uri is dereferenceable. Defining vocabulary prefix for the vocabulary usage makes it easier to write application profiles.

## [R-115 Closed World Assumption (CWA)](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/146)

**Description:** For validating data one should be able to require the closed world assumption ( [http://en.wikipedia.org/wiki/Closed-world\_assumption](http://en.wikipedia.org/wiki/Closed-world_assumption)): a statement that is true is also known to be true. What is not currently known to be true, is false. I.e. the data to be validated represents the entirety of the knowledge available.

## **[R-205 Varying levels of "error"](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/408)**

**Description:** There is a need to assign error codes to each validation test so that varying levels of "error" can be returned (informational, warning, error, fail). The creation of the list of codes needs needs to be part of the Application Profile.

**Related W3C requirements:** [Severity Levels](https://www.w3.org/2014/data-shapes/wiki/Requirements#Severity_Levels) [Human-readable Violation Messages](https://www.w3.org/2014/data-shapes/wiki/Requirements#Human-readable_Violation_Messages)

## [R-206 Define allowed namespaces in a profile](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/410)

**Description:** Set a limit on the number of namespaces, and which namespaces, can be used in a profile.

**Action:**

## **[R-207 Support multiple levels of description](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/412)**

**Description:** The Description Set Profile in an Application Profile may have one or more Description Templates, describing instances of different classes. (see: [http://dublincore.org/documents/profile-guidelines/#sect-6](http://dublincore.org/documents/profile-guidelines/#sect-6))

# General requirements

## [Validate for uniqueness of IRIs](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/1R-1)

**Description:** Validate that each incoming IRI is unique within the data store.

**Action:** Compare incoming IRIs with stored IRIs; duplicate IRIs must trigger an error of type&nbsp;?

## [R-10 Define Disjoint Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/17)

**Description:** Define properties that are disjoint to the listed property.

**Action:** If properties in the incoming graph have a "disjoint" relationship, signal an error.

## [R-171 Validate IRIs by Dereferencing](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286)

**Description:** Note IRIs that must be validated through dereferencing.

**Action:** For each IRI with this validation requirement, dereference the IRI. The value must return a resource that anything other than an http error code. If an http error code is returned, signal an error.

## [R-171bis Validate resource (media) type returned from dereferencing](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455)

**Description:** A dereferenced IRI must return a resource of the stated (media) type.

**Action:** For each IRI with this validation requirement, dereference the IRI. The value must return a resource that matches the defined resource (media) type. Note this is about content type, for example, "JPEG", not the RDF type of a resource (for example, foaf:Person). If the resource type is not a match, signal an error.

## [R-98 Check Validity Of IRIs](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/118)

**Description:** Check that incoming IRIs are structurally valid.

**Action:** Check that each incoming IRI has the structure "http://" followed by a domain name... and&nbsp;?? (Do we want to be able to require hash/slash IRIs?

## **[R-211 Cardinality constraints](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424)**

**Description:** Allow classes and properties in the profile to be given minimum and maximum cardinality constraints. This may be presented to users as "mandatory/optional" "repeatable/not repeatable".

**Action:** Signal an error for any properties or classes that violated the defined cardinality.

**Related W3C requirement:** [Property Min/Max Cardinality](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Min.2FMax_Cardinality)

# Class requirements

## [R-209 Define valid classes](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/422)

**Description:** Define which classes are valid for the graph.

**Action:** Classes that are not defined as valid for the graph may be ignored or dropped, as per the preference of the application.

## [R-7 Disjoint Classes](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-7-DISJOINT-CLASSES)

**Description:** Define classes that are disjoint within the graph.

**Action:** If disjoint classes are encountered in the same graph, signal error&nbsp;?

## [R-225 Validation of associated classes in one Description Set](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453)

**Description:** A Description Set with a Description of an instance of class A must also have a Description of an instance of class B.

**Example:** When describing an edm:ProvidedCHO in a Description there must be at least another Description in the same Description Set which has to be an instance of ore:Aggregation (for wording see [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)).

**Related W3C requirement:** [Expressivity: Basic Graph Patterns](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Basic_Graph_Patterns)

# Property requirements

## **[R-210 Define exclusively allowed properties for a context](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/423)**

**Description:** What properties can be used within this context? Context can be a class or node, a data receipt function, data creation function, API, etc.

## [R-67 Boolean property patterns](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/74)

**Description:** Descriptions and constraints may employ boolean combinations of properties, such as "propA xor propB xor propC"

**Related W3C requirement:** [Expressivity: Logical Operators](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Logical_Operators) [Expressivity: Non-Existence of Patterns](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Non-Existence_of_Patterns)

## **[R-68 Required Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75)**

**Description:** Resources of a given type sometimes must be accompanied by a specified property expected properties for resources of specific classes ('propD if type=X')

**Related W3C requirement:** [Property Min/Max Cardinality](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Min.2FMax_Cardinality)

## [R-69 Optional Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/76)

**Description:** Properties that are optional, not required. I.e. properties with minimum=0.

**Related W3C requirement:** [Property Min/Max Cardinality](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Min.2FMax_Cardinality)

## **[R-70 Repeatable Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/77)**

**Description:** Properties that are repeatable, i.e. with maximum > 1.

**Related W3C requirement:** [Property Min/Max Cardinality](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Min.2FMax_Cardinality)

## **[R-71 Conditional Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/78)**

**Description:**

- various conditions possible
- condition: universal quantification on object and data properties
- condition: existential quantification on object and data properties
- condition: if specific properties are present, then specific other properties also have to be present

For instance EDM defines that if the class edm:ProvidedCHO is present, at least one dc:title or dc:description should be present and at least one dc:subject or dc:type or dc:coverage or dcterms:spatial and edm:type should be present.

**Related W3C requirement:** [Expressivity: Basic Graph Patterns](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Basic_Graph_Patterns) [Expressivity: Non-Existence of Patterns](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Non-Existence_of_Patterns) [Expressivity: Logical Operators](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Logical_Operators)

**Antoine [15-02-17]: this requirement has not really been discussed at [https://etherpad.wikimedia.org/p/requirements\_analysis](https://etherpad.wikimedia.org/p/requirements_analysis) . It seems to be slightly redundant with R-67 and all the cardinality requirements.**

## [R-72 Recommended Properties](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/79)

**Description:** This can be noted in the human-readable descriptive information. It should also be possible to return a message when such a property is not included in a data set.

## **[R-25 Property Domain](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-25-OBJECT-PROPERTY-DOMAIN)**

**Description:** Proposed new definition by Antoine, 14-09-15

An Object Property Domain constraint specifies that a property should be used in statements where the subject is an instance of a specific class.

A Data Property Domain constraint applies only to datatype properties, i.e. properties which are used in statements where the object is a value (for example an RDF literal, i.e. a string).

# Value Requirements

## **[R-35 Property Range](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=R-35-DATA-PROPERTY-RANGE)**

Description: Defines the range of a property - either a class, a datatype, or a literal.

**Examples:**

- the value of the property dbo:certificationDate must be of type xsd:date
- the value of the property dbo:isPeerReviewed must be of type xsd:boolean
- the value of the property dct:creator must be of type dct:Agent
- the dbo:birthPlace of a dbo:Person must be a dbo:Place

**Related W3C requirement:** [Property type](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Type) [Property Datatype](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Datatype)

## **[R-43 Literal Value Comparison](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50)**

**Description:** Some constraints or property semantics require to compare literal values, based on order and/or (in)equality.

- operators: <, <=, >, >=, =,&nbsp;!=

**Related W3C requirement:** [Expressivity: Literal Value Comparison](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Literal_Value_Comparison)

## **[R-44 Pattern Matching on RDF Literals](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51)**

**Description:**

- lexical form validation
- restrict literals of multiple datatypes according to patterns (regular expressions)
- restrictions on the form of a literal value
- The literal value of a resource matches/does not match a certain regex pattern (for instance avoid whitespaces in literals or leading nor trailing white spaces)
- data property we need to check against the regular expression
- it is also possible to check whether a regular expressions is not matched by a specific literal value for a specific data property
- perform whitespace processing, e.g. remove leading/trailing spaces; remove all whitespace characters
- test the length of values (requires the regex language to have look-ahead)

**Related W3C requirement:** [Datatype Property Facets](https://www.w3.org/2014/data-shapes/wiki/Requirements#Datatype_Property_Facets) [Expressivity: Non-Existence of Patterns](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Non-Existence_of_Patterns) [Expressivity: String Operations](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_String_Operations)

## [R-47 Specify and validate language tags](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/54)

**Description:**

- suggested (KC): Check all literals for language tags. If none, give "error message" X to communicate back to provider.
- description: does a literal for a specific data property within the context of a specific class have a specific language tag? Language tags are not required but are highly recommended for all literals.

**Related W3C requirement:** [Expressivity: Language Tags](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Language_Tags)

## **[R-49 Property occurs once per language tag](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56)**

**Description:** resources of a given type must have at most 1 value of a specific language for a given data property

**Related W3C requirement:** [Expressivity: Language Tags](https://www.w3.org/2014/data-shapes/wiki/Requirements#Expressivity:_Language_Tags)

## **[R-30 Define value lists](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/37)**

**Description:** One needs to check that values for statements come from a (controled) "list". This list of allowed values may come from

- explicit, flat enumeration of literals (as for edm:type in UC-8 [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341))
- a 'vocabulary' or 'space' of literals (ISO codes, MIME types...) - which is eventually defined as flat list of strings
- explicit, flat enumeration of resources (URIS), as for edm:rights in UC-8 [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/341)
- a URI pattern, like 'all URIs starting with [http://example.org/example/\*'](http://example.org/example/*'). This may not be best practice (as replaces the other recipes) but is likely to be convenient.
- concepts (URIs) that are defined by their belonging to a (SKOS) concept scheme, as in Data Cube code lists expressed as SKOS ( [http://www.w3.org/TR/vocab-data-cube/#schemes](http://www.w3.org/TR/vocab-data-cube/#schemes))
- resources that belong to a given (OWL) class, as also possible in Data Cube [http://www.w3.org/TR/vocab-data-cube/#schemes](http://www.w3.org/TR/vocab-data-cube/#schemes)
- list of results of querying a SPARQL endpoint (Cf R-219 [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/432](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/432))

**Related W3C requirement:** [Property Value Enumerations](https://www.w3.org/2014/data-shapes/wiki/Requirements#Property_Value_Enumerations)

# Requirements Classification 

In order to structure the requirements, we propose a classification system. The most important top-level categories are

- Constraint Formulation (how to formulate constraints?) and
- Constraint Expressivity (what kind of constraints should be formulated?).

For the expressivity of constraints, we identified several sub-categories, such as:

- identification and uniqueness,
- cardinality restrictions,
- disjointness and equivalence, and
- constraints on RDF properties, objects, literals, and individuals.

The two top-level categories "Constraint Formulation" and "Constraint Expressivity" are the most important ones for the DCMI community, as

- the constraint languages should be concise, human-understandable, and intuitive (constraint formulation requirements) and 
- many of the already identified DCMI requirements are classified as constraint expressivity requirements.


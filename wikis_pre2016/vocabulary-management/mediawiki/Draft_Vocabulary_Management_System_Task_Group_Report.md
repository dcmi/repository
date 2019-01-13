---
title: Draft Vocabulary Management System Task Group Report
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Draft_Vocabulary_Management_System_Task_Group_Report.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 20 February 2013, at 14:17.  
This page has been accessed 120,506 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Introduction"><span class="tocnumber">1</span> <span class="toctext">Introduction</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Guiding_Principles"><span class="tocnumber">2</span> <span class="toctext">Guiding Principles</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Initial_Goals"><span class="tocnumber">3</span> <span class="toctext">Initial Goals</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#Next_Steps"><span class="tocnumber">4</span> <span class="toctext">Next Steps</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#Resources"><span class="tocnumber">5</span> <span class="toctext">Resources</span></a></li>
      </ul>
    </td>
  </tr>
</table>

#### Introduction 

The Architecture Forum/Registry Community Joint Task Group <sup id="cite_ref-task_group_0-0" class="reference"><a href="#cite_note-task_group-0">[1]</a></sup> was charged at DC 2011 to “(1) develop evaluation criteria for a DCMI vocabulary management system (VMS) that will meet current and future needs of DCMI; (2) assess existing candidate VMS applications based on the developed criteria; and (3) report its analysis to the Oversight Committee and Advisory Board along with its recommendation of one or two viable VMS candidates for replacing the current DCMI vocabulary management environment. The TG will also propose a community-driven approach to transition from the current to a new environment in light of its recommendations.”

As input to the process, the task group was presented with a set of functional requirements <sup id="cite_ref-functional_1-0" class="reference"><a href="#cite_note-functional-1">[2]</a></sup>, and developed its own set of core requirements <sup id="cite_ref-general_2-0" class="reference"><a href="#cite_note-general-2">[3]</a></sup>, many of which draw upon the experiences and recommendations of the DCMI Registry Community, and the more recently formed DCMI Vocabulary Management Community.

After investigation, the Task Group chairs feel that the initial functional requirements provided by the Executive and Advisory board, while useful, are wide-ranging enough as to disqualify any currently available systems. More significantly, the Task Group leadership has come to feel that seeking “a” single “Vocabulary Management System” unnecessarily limited the available options. There is a variety of vocabulary management needs and tasks, and limited value in requiring that all processes be managed in a single, monolithic system. A series of “Software as a Service” components could easily meet the requirements, while allowing for a suite of applications that could be extended, built upon, and even replaced component by component.

Due to this, the recommended approach is for an iterative design phase, where one or more sets of management infrastructure can be used on a trial basis for particular aspects of the Dublin Core’s vocabulary management needs. This will allow the Vocabulary Maintenance Officer and the Chief Information Officer to identify their short term needs, and try a variety of different tools and approaches to meeting these needs. It is expected that needs will continue to evolve, and that the Officers will keep a balance between experimentation and operations while respecting the guiding principles given below.

#### Guiding Principles 

Having failed to identify a specific VMS to replace the current environment, the Task Group feels that it is tremendously important to ensure that certain criteria are met by any suite of tools or processes that become part of the production DCMI Vocabulary Management workflow:

1. _Portability:_ This is the top priority for systems under consideration for managing DCMI vocabularies. It should be demonstrable that a system can ingest the current RDF representations of DCMI vocabularies, manage versions, and export an exact copy of whatever was ingested as well as a copy of comparable data at any point in the subsequent revision chain.
2. _Version Control:_ This is a requirement for “social responsibility” of a trusted vocabulary publisher. A system needs to show it can support transparent development of DCMI vocabularies by extended communities and evolving methods by logging and publishing provenance information at the finest level of granularity. 
3. Use of open / established infrastructure: This is another requirement for social responsibility and trust. A system must allow the DCMI vocabularies to be published and maintained in a transparent and public way.
4. _Support for multiple languages & scripts:_ A system must be able to meet the needs of DCMI’s extended communities using internationalization and multilingual aspects of RDF and related Web standards.
5. _Use of existing URIs / PURLs for all DC properties, classes, and value vocabularies:_ This is another requirement for social responsibility and trust. A system must use persistent identifiers taken from the DCMI vocabulary namespaces.
6. _Ease of maintenance & revision_, simplicity of managing current DCMI Documents, by one of two approaches:
  1. Allowing existing URIs to connect directly to pages within VMS component (without redirects), or, 
  2. Allowing easy export of updated documents for loading to current DCMI website 
A system must support operation at effective cost in time and manpower during a period of change of the wider context of DCMI’s vocabularies.
7. _Interoperability - RESTful APIs, etc._: A system must support the requirements of the current and future expectations of Web and Semantic Web communities interoperating with DCMI vocabularies.

#### Initial Goals 

1. _Export of existing documentation_: Building on already established efforts to provide content negotiation and system generated HTML with embedded RDFa, a reference implementation will need to be able to ingest the current RDF representations of the canonical, English Language RDF files and generate content negotiable documentation in both human and machine readable formats.
2. _Elimination of any backlogs of amendments_: Pending updates for clarifications and corrections can be used to test implementations. Where possible, on-going development of vocabularies should also be used to test support for transparency, version control, etc. 
3. _Support for translations of all documents._
4. _Support for managing alignments between DCMI vocabularies and other emerging ontologies and terminologies:_ Pilot cases might be the ongoing work of the Schema.org Alignment Task Group <sup id="cite_ref-schemaorg_3-0" class="reference"><a href="#cite_note-schemaorg-3">[4]</a></sup>, expanding the DCMI vocabularies, and of external library communities related to DCMI such as IFLA, MARC, and RDA who are developing RDF maps to DCMI vocabularies, effectively extending and refining them.

#### Next Steps 

DCMI’s Vocabulary Maintenance Officer and the Chief Information Officer, and others as appropriate, should carry out the steps necessary to identify, select, and implement one or more tools to meet the initial goals, as a priority, bearing in mind the guiding principles. DCMI should undertake a review of the situation after a year of operation, based on feedback from the Officers and service users and any new requirements identified at that point. Essentially, the Officers should be able to move data from one tool to another with minimal disruption to operations and services.

#### Resources 

1. ↑ [Vocabulary Management System Task Group](/mediawiki_wiki/Vocabulary_Management_System_Task_Group.md)
2. ↑ [Vocabulary Management System Functional Requirements](/mediawiki_wiki/Vocabulary_Management_System_Functional_Requirements.md)
3. ↑ [Vocabulary Management System General Requirements](/mediawiki_wiki/Vocabulary_Management_System_General_Requirements.md)
4. ↑ [Schema.org Alignment](/mediawiki_wiki/Schema.org_Alignment.md)


---
title: Charter
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RDF_Application_Profiles/Charter.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 June 2014, at 08:38.  
This page has been accessed 52,561 times.

[<img alt="RDF AP TG logo" src="/archive/mediawiki_wiki/images/RdfAP_tg.png" width="200" height="141">](/archive/mediawiki_wiki/images/RdfAP_tg.png "RDF AP TG logo")

* * *

##### [Handbook](/archive/mediawiki_wiki/DCMI_Handbook "DCMI Handbook"): [Table of Contents](/archive/mediawiki_wiki/DCMI_Handbook/ "DCMI Handbook") 
<dl>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Governing_Board.md" title="DCMI Governing Board">Governing Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Governing_Board/finance.md" title="DCMI Governing Board/finance">Membership &amp; Finance</a> ◘ <a href="/mediawiki_wiki/DCMI_Governing_Board/nominations.md" title="DCMI Governing Board/nominations">Nominations &amp; Bylaws</a> 
</dd>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Technical_Board.md" title="DCMI Technical Board">Technical Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Technical_Board/usage.md" title="DCMI Technical Board/usage">Usage</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/standards.md" title="DCMI Technical Board/standards">Standards &amp; Liaisons</a> ◘ <a href="/mediawiki_wiki/DCMI_Technical_Board/specifications.md" title="DCMI Technical Board/specifications">Community Specifications</a>
</dd>
<dd> ► <i><a href="/mediawiki_wiki/DCMI_Advisory_Board.md" title="DCMI Advisory Board">Advisory Board</a> committees:</i> <a href="/mediawiki_wiki/DCMI_Advisory_Board/meetings.md" title="DCMI Advisory Board/meetings">Conferences &amp; Meetings</a> ◘ <a href="/mediawiki_wiki/DCMI_Advisory_Board/documentation.md" title="DCMI Advisory Board/documentation">Education &amp; Outreach</a>
</dd>
<dd> ► <i>Management:</i> <a href="/mediawiki_wiki/Exec_Committee.md" title="Exec Committee">Executive</a> ◘ <a href="/mediawiki_wiki/Exec_Committee/directorate.md" title="Exec Committee/directorate">Directorate</a>
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
          <a href="#Charter_of_the_DCMI_RDF_Application_Profiles_Task_Group"><span class="tocnumber">2</span> <span class="toctext">Charter of the DCMI RDF Application Profiles Task Group</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Background"><span class="tocnumber">2.1</span> <span class="toctext">Background</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Task"><span class="tocnumber">2.2</span> <span class="toctext">Task</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Deliverables"><span class="tocnumber">2.3</span> <span class="toctext">Deliverables</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Organisation"><span class="tocnumber">2.4</span> <span class="toctext">Organisation</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


# Charter of the DCMI RDF Application Profiles Task Group 

_Approved June 10, 2014_

This draft charter defines the tasks and deliverables of the DCMI RDF Application Profiles Task Group (RDF-AP).

## Background 

Without a doubt, the Semantic Web has changed the way we think about metadata. The vision of linked resource descriptions is appealing, especially as boundaries between formats and (element) vocabularies dissolve in favour of an open, distributed, Web-based, representation of metadata.

The open world where anyone can say anything about anything, and where linkable data come from a great variety of sources, is best approached with data that has minimal semantic constraints. At the same time, the creation and use of data in specific communities may require restrictions that enable validation rules to ensure that the data supports certain functions. Such validation rules facilitate data creation and serve internal system functions but may be overly constraining in the open Web. The goal, therefore, is to define a base ontology with the minimum semantic constraints that will serve open world functionality, and yet permit a data provider to define and document the data definitions used in the specific context of a closed data space.

The Linked Data principles assume that the exact (global) definition of an element can be found by dereferencing its URI, without specific distinction between one's own data, trusted data, or any other data. However, as just discussed, definitions of elements may be different in a global context or in local environments where different existing vocabularies are reused, mixed and matched with new restrictions.

Local vs. global vocabularies is only one issue where data providers seek advice and ask for best-practice recommendations. Other questions arise when it comes to the specification of constraints for local data and subsequently the validation of data regarding these constraints.

With the increasing use of Linked Data and the Semantic Web, including enterprise use, the management of different data “flavours” for different consumers becomes more important for data providers. When machine-executable crosswalks between different element vocabularies exist, views of the data can be generated on-the-fly using these vocabularies. To date, however, there is neither a mechanism that allows a data consumer to request data expressed using a certain profile, nor a consensus on how a data provider could offer data using different vocabularies with documentation of its specific data practices.

Many of these questions are addressed within DCMI by [Dublin Core Application Profiles (DCAP)](http://dublincore.org/documents/profile-guidelines/). A DCAP allows the creation of a new vocabulary by both reusing and extending existing vocabularies and defining patterns of use. It also provides a mechanism to define constraints (using [Description Set Profiles (DSP)](http://dublincore.org/documents/dc-dsp/)) that only apply within a specific application. The formal description of DCAP and its constraints is defined in the [Singapore Framework](http://dublincore.org/documents/singapore-framework/), which is agnostic to underlying technologies, formats and serialisations. Specific details related to RDF or Linked Data are therefore not addressed, such as dedicated HTTP request headers or actual methods to link instance data to an application profile.

The Dublin Core Metadata Terms community provides an interesting use case around which to develop a solution. The terms are among the most widely used terms in current linked data. The Dublin Core community would greatly benefit from best practice recommendations that would allow metadata developers to specify and combine vocabularies.

## Task 

The RDF Application Profile Task Group will:

1. gather experts from theory and practice dealing with the problem areas sketched in the introduction,
2. collect and describe case studies from these experts and the general public,
3. extract common use cases from these case studies that illustrate particular problems,
4. specify requirements to be fulfilled in order to adequately solve these problems and meet the use cases,
5. investigate existing best-practices regarding these requirements,
6. identify gaps and recommend best-practices to close them,
7. test the proposed solution on selected relevant profiles.

The task group will take into account existing approaches wherever possible to avoid duplication of effort. It will also coordinate, where feasible, with related activities such as that of Resource Shapes, Shape Expressions, SPIN, and [Bibframe profiles](http://www.loc.gov/bibframe/docs/bibframe-profiles.html). This will not only reduce the work of the task group, it should also prevent the proliferation of solutions in the problem space. Ideally, inclusive solutions will be developed that allow a smooth transition for as many existing implementations as possible.

Related groups outside DCMI, particularly within W3C, will be actively approached to avoid parallel work and reach consensus as early as possible.

Preliminary fields of work are:

1. Definition of an RDF Application Profile,
2. Best practices for documenting the intention behind application profiles,
3. RDF Constraint Specification and Validation,
4. Request handling for RDF APs and data.

## Deliverables 

1. Report on the current state, based on use cases gathered - first draft September 2014
2. One or more recommended approaches for the development of solutions - month 12
3. One or more worked-out examples of the proposed solutions - month 12

## Organisation 

Planned duration: 1 year

Beginning from: June 10, 2014

Chair/Co-Chair: Antoine Isaac and Karen Coyle

Liaison with technical board and community spec committee: Kai Eckert and Valentine Charles

Editorial board: Evelyn Dröge and Thomas Bosch

Form: DCMI Task Group, reporting to the Community Specifications Committee


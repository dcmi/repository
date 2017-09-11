---
title: ISO Part2
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 March 2014, at 13:03.  
This page has been accessed 38,278 times.

[<img alt="Standards Committee logo" src="/archive/mediawiki_wiki/images/Standards_logo.png" width="300" height="50">](/archive/mediawiki_wiki/images/Standards_logo.png "Standards Committee logo")

* * *

##### [Handbook](/archive/mediawiki_wiki/DCMI_Handbook "DCMI Handbook"): [Table of Contents](/archive/mediawiki_wiki/DCMI_Handbook/ "DCMI Handbook") 
<dl>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Governing_Board" title="DCMI Governing Board">Governing Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Governing_Board/finance" title="DCMI Governing Board/finance">Membership &amp; Finance</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Governing_Board/nominations" title="DCMI Governing Board/nominations">Nominations &amp; Bylaws</a> 
</dd>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Technical_Board" title="DCMI Technical Board">Technical Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/usage" title="DCMI Technical Board/usage">Usage</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/standards" title="DCMI Technical Board/standards">Standards &amp; Liaisons</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/specifications" title="DCMI Technical Board/specifications">Community Specifications</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/infrastructure" title="DCMI Technical Board/infrastructure">Infrastructure Advisory Committee (IAC)</a>
</dd>
<dd> ► <i><a href="/archive/mediawiki_wiki/DCMI_Advisory_Board" title="DCMI Advisory Board">Advisory Board</a> committees:</i> <a href="/archive/mediawiki_wiki/DCMI_Advisory_Board/meetings" title="DCMI Advisory Board/meetings">Conferences &amp; Meetings</a> ◘ <a href="/archive/mediawiki_wiki/DCMI_Advisory_Board/documentation" title="DCMI Advisory Board/documentation">Education &amp; Outreach</a>
</dd>
<dd> ► <i>Management:</i> <a href="/archive/mediawiki_wiki/Exec_Committee" title="Exec Committee">Executive</a> ◘ <a href="/archive/mediawiki_wiki/Exec_Committee/directorate" title="Exec Committee/directorate">Directorate</a>
</dd>
</dl>

* * *

# ISO 15836-2: Part 2 Fast-Track 
<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1"><a href="#Handbook:_Table_of_Contents"><span class="tocnumber">1</span> <span class="toctext">Handbook: Table of Contents</span></a></li>
        <li class="toclevel-1 tocsection-1">
          <a href="#ISO_15836-2:_Part_2_Fast-Track"><span class="tocnumber">2</span> <span class="toctext">ISO 15836-2: Part 2 Fast-Track</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Abstract"><span class="tocnumber">2.1</span> <span class="toctext">Abstract</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Goals_of_Part_2"><span class="tocnumber">2.2</span> <span class="toctext">Goals of Part 2</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#What.27s_in_and_what.27s_out.3F"><span class="tocnumber">2.3</span> <span class="toctext">What's in and what's out?</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Process"><span class="tocnumber">2.4</span> <span class="toctext">Process</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Activity_Schedule"><span class="tocnumber">2.5</span> <span class="toctext">Activity Schedule</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


## Abstract 

DCMI is in the process of developing a fast-track proposal as an ISO A-Liaison Organization to designate the current ISO [ISO Standard 15836:2009](http://www.iso.org/iso/search.htm?qt=15836&published=on&active_tab=standards) as Part 1 of a two-part standard. If successful, Part 2 of the revised standard will be based in our [dcterms namespace](http://dublincore.org/documents/dcmi-terms/). The [preliminary proposal](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=DC-AB;640b769b.1209) was presented to the Advisory Board for comment on 14 September 2012 and was warmly received.

## Goals of Part 2 

- Provide a fuller set of terms than the fifteen "elements" of ISO 15836
- Explicitly declare those terms as properties and classes, as defined by RDF.
- Identify the properties and classes with URIs citable in RDF and Linked Data applications.

## What's in and what's out? 

Working Title: "ISO 15836-2 Part 2: DCMI Properties and Classes"

Introduction

- This set of properties and classes is "Semantic Web-enabled", i.e., it is an "RDF vocabulary" and as such, may be used in Linked Data.
- "RDF property" and "RDF class" are defined in W3C's RDF Schema specification.
- URIs are an essential feature of Semantic Web-enabled vocabularies inasmuch as they provide globally scoped names for things being described and globally scoped names for the properties and classes used to describe those things.
- This standard uses CURIEs as abbreviations for URIs (and explains the concept of a CURIE) as a shorthand way to write URIs. The concept of identification by URI is part of the core standard even if the actual URIs for DCMI properties and class are not (because they are referenced by CURIEs mapped to URIs as described in a non-normative appendix).]

Scope

- ISO 15836-2 Part 2 is a sub-set of DCMI's own [DCMI Metadata Terms](http://dublincore.org/documents/dcmi-terms/) document:
  - includes \_all\_ of the properties and classes in the /terms/ namespace
  - excludes:
    - properties in the /elements/1.1/ namespace
    - vocabulary encoding schemes in the /terms/ namespace
    - syntax encoding schemes in the /terms/ namespace
    - classes in the /dcmitype/ namespace
    - one vocabulary encoding scheme and one class in the /dcam/ namespace

Properties and Classes

- Core Properties (the DC-15)
- Other Properties (40)
- Classes (22)

Annex (informational): Mappings of CURIEs to URIs

Explains that the prefix "dcterms:" maps to to [http://purl.org/dc/terms/](http://purl.org/dc/terms/).

## Process 
<dl><dd>
<dl><dd> <em>"If a document with a certain degree of maturity is available at the start of a standardization project, for example a standard developed by another organization, it is possible to omit certain stages. In the so-called 'Fast-track procedure', a document is submitted directly for approval as a draft International Standard (DIS) to the ISO member bodies (stage 4) or, if the document has been developed by an international standardizing body recognized by the ISO Council, as a final draft International Standard (FDIS, stage 5), without passing through the previous stages."</em> --<a href="http://www.iso.org/iso/home/standards_development/resources-for-technical-work/stages_of_the_development_of_international_standards.htm" class="external text" rel="nofollow">ISO: <em>Stages of development of International Standards</em></a>
</dd></dl>

</dd></dl>


The fast-track process was created by ISO as a way of allowing standards organizations to submit one of their existing standards for approval as an ISO standard. This can only happen with something that has already been reviewed and approved as a standard by that organization. When the organization decides to submit the standard, it starts at the DIS stage (Draft International Standard).

## Activity Schedule 
<dl><dd> <a href="/archive/mediawiki_wiki/DCMI_Technical_Board/standards/ISO_Part2/schedule" title="DCMI Technical Board/standards/ISO Part2/schedule">Schedule</a>
</dd></dl>


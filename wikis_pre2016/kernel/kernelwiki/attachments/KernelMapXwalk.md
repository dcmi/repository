---
title: 'DCMI Kernel Metadata Task Group: Mapping and Crosswalk: Kernel Metadata to
  Dublin Core, MARC21, MODS, and VRA Core'
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/attachments/KernelMapXwalk.htm"
---

<table summary="layout" border="0" cellpadding="0" cellspacing="0" width="66%">
  <tbody>
    <tr>
      <td>
        <table summary="layout" border="0" cellpadding="2" cellspacing="1" width="100%">
          <tbody>
            <tr>
              <td class="header">DCMI Kernel Metadata Task Group</td>
              <td class="header">J. Kunze</td>
            </tr>
            <tr>
              <td class="header"> </td>
              <td class="header">A. Turner</td>
            </tr>
            <tr>
              <td class="header"> </td>
              <td class="header">California Digital Library</td>
            </tr>
            <tr>
              <td class="header"> </td>
              <td class="header">September 2007 <span class="style1">DRAFT</span> </td>
            </tr>
          </tbody>
        </table></td>
    </tr>
  </tbody>
</table>

### Mapping and Crosswalk: Kernel Metadata to Dublin Core, MARC21, MODS, and VRA Core 

Each Kernel element label has a coded synonym (the SYN column below) that consists of the letter 'h' followed by a number, such as h1, h2, h3, etc. The following table, organized by "story", summarizes the rough correspondence between Kernel elements to Dublin Core elements, and approximate crosswalks to Machine-Readable Cataloging (MARC21), Metadata Object Description Schema (MODS), and Visual Resources Association (VRA) Core encoding schemes. For more information, see the [Kernel Metadata and Electronic Resource Citations (ERCs)](http://dot.ucop.edu/home/jak/erc2.html) specification.

&nbsp;

<table border="1" cellpadding="0" cellspacing="0">
  <colgroup>
    <col width="64">
    <col width="131">
    <col width="64">
    <col width="244">
    <col width="184">
    <col width="306">
    <col width="143">
  </colgroup>
  <tbody>
    <tr height="32">
      <td height="32" width="64"><strong>STORY</strong></td>
      <td width="131"><strong>KERNEL LABEL </strong></td>
      <td width="64"><strong>SYN</strong></td>
      <td width="244"><strong>DUBLIN CORE Mapping </strong></td>
      <td width="184"><strong>DUBLIN CORE RDF/XML Crosswalk</strong></td>
      <td width="184"><strong>MARC21 Crosswalk </strong></td>
      <td width="306"><strong>MODS Crosswalk </strong></td>
      <td width="143"><strong>VRA CORE Crosswalk </strong></td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131"></td>
      <td width="64"></td>
      <td width="244"></td>
      <td width="184"></td>
      <td width="184"></td>
      <td width="306"></td>
      <td width="143"></td>
    </tr>
    <tr height="64">
      <td height="64" width="64">erc:</td>
      <td width="131">* who</td>
      <td width="64">h1</td>
      <td width="244">Creator/Contributor/Publisher</td>
      <td width="184">&lt;creator&gt;<br>
        &lt;contributor&gt;<br>
        &lt;publisher&gt;</td>
      <td width="184">1XX<br>
        7XX<br>
        260</td>
      <td width="306">&lt;name&gt;<br>
        <br>
        &lt;originInfo&gt;<br>
             &lt;publisher&gt;</td>
      <td width="143">&lt;agent&gt;</td>
    </tr>
    <tr height="48">
      <td height="48" width="64"></td>
      <td width="131">* what</td>
      <td width="64">h2</td>
      <td width="244">Title</td>
      <td width="184">&lt;title&gt;<br>
        &lt;alternative&gt;<br>
      </td>
      <td width="184">210<br>
        24X</td>
      <td width="306">&lt;titleInfo&gt;<br>
             &lt;title&gt;<br>
                  &lt;subtitle&gt;</td>
      <td width="143">&lt;title&gt;</td>
    </tr>
    <tr height="128">
      <td height="128" width="64"></td>
      <td width="131">* when</td>
      <td width="64">h3</td>
      <td width="244">Date</td>
      <td width="184">&lt;date&gt;<br>
        &lt;created&gt;<br>
        &lt;valid&gt;<br>
        &lt;available&gt;<br>
        &lt;issued&gt;<br>
        &lt;modified&gt;<br>
        &lt;dateAccepted&gt;<br>
        &lt;dateSubmitted&gt;<br>
      </td>
      <td width="184">008/07-14<br>
        26X subfield $c<br>
        245 subfield $f</td>
      <td width="306">&lt;originInfo&gt;<br>
             &lt;dateCreated&gt;<br>
        <br>
        &lt;originInfo&gt;<br>
             &lt;dateOther&gt;<br>
        <br>
        &lt;publicationInfo&gt;<br>
              &lt;dateIssued&gt;</td>
      <td width="143">&lt;date&gt;</td>
    </tr>
    <tr height="64">
      <td height="64" width="64"></td>
      <td width="131">* where</td>
      <td width="64">h4</td>
      <td width="244">Identifier (permanent)</td>
      <td width="184">&lt;identifier&gt;</td>
      <td width="184">856<br>
        01X<br>
        02X</td>
      <td width="306">&lt;location&gt;<br>
             &lt;url&gt;<br>
        <br>
        &lt;identifier&gt;</td>
      <td width="143">&lt;textref&gt;</td>
    </tr>
    <tr height="112">
      <td height="112" width="64"></td>
      <td width="131">how</td>
      <td width="64">h5</td>
      <td width="244">(reserved Type restriction)</td>
      <td width="184">&lt;type&gt;</td>
      <td width="184"></td>
      <td width="306">&lt;typeOfResource&gt;</td>
      <td width="143">&lt;work&gt;<br>
        &lt;collection&gt;<br>
        &lt;image&gt;<br>
        &lt;workType&gt;</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131"></td>
      <td width="64"></td>
      <td width="244"></td>
      <td width="184"></td>
      <td width="184"></td>
      <td width="306"></td>
      <td width="143"></td>
    </tr>
    <tr height="80">
      <td height="80" width="64">about-erc:</td>
      <td width="131">about-who</td>
      <td width="64">h11</td>
      <td width="244">Subject (personage)</td>
      <td width="184">&lt;subject&gt;</td>
      <td width="184">600<br>
        61X</td>
      <td width="306">&lt;subject&gt;<br>
             &lt;name&gt;</td>
      <td width="143">&lt;subject&gt;</td>
    </tr>
    <tr height="64">
      <td height="64" width="64"></td>
      <td width="131">about-what</td>
      <td width="64">h12</td>
      <td width="244">Subject   </td>
      <td width="184">&lt;subject&gt;</td>
      <td width="184">650</td>
      <td width="306">&lt;subject&gt;<br>
              &lt;topic&gt;</td>
      <td width="143">&lt;subject&gt;</td>
    </tr>
    <tr height="96">
      <td height="96" width="64"></td>
      <td width="131">about-when</td>
      <td width="64">h13</td>
      <td width="244">Coverage (temporal)</td>
      <td width="184">&lt;temporal&gt;</td>
      <td width="184">045<br>
        650</td>
      <td width="306">&lt;subject&gt;<br>
             &lt;topic&gt;</td>
      <td width="143">&lt;culturalContext&gt;<br>
        &lt;date&gt;<br>
        &lt;stylePeriod&gt;</td>
    </tr>
    <tr height="64">
      <td height="64" width="64"></td>
      <td width="131">about-where</td>
      <td width="64">h14</td>
      <td width="244">Coverage (spatial)</td>
      <td width="184">&lt;spatial&gt;</td>
      <td width="184">651</td>
      <td width="306">&lt;temporal&gt;</td>
      <td width="143">&lt;location&gt;</td>
    </tr>
    <tr height="80">
      <td height="80" width="64"></td>
      <td width="131">about-how</td>
      <td width="64">h15</td>
      <td width="244">Description</td>
      <td width="184">&lt;description&gt;<br>
        &lt;tableOfContents&gt;<br>
        &lt;abstract&gt;</td>
      <td width="184">520</td>
      <td width="306">&lt;abstract&gt;<br>
        <br>
        &lt;tableOfContents&gt;<br>
        <br>
        &lt;note&gt;</td>
      <td width="143">&lt;description&gt;</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131"></td>
      <td width="64"></td>
      <td width="244"></td>
      <td width="184"></td>
      <td width="184"></td>
      <td width="306"></td>
      <td width="143"></td>
    </tr>
    <tr height="32">
      <td height="32" width="64">support-erc</td>
      <td width="131">support-who</td>
      <td width="64">h21</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">852 subfields $a, $b</td>
      <td width="306">&lt;physicalLocation&gt;</td>
      <td width="143">&lt;location&gt;</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131">support-what</td>
      <td width="64">h22</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="306">(no equivalent)</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131">support-when</td>
      <td width="64">h23</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="306">(no equivalent)</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131">support-where</td>
      <td width="64">h24</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="306">(no equivalent)</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131"></td>
      <td width="64"></td>
      <td width="244"></td>
      <td width="184"></td>
      <td width="184"></td>
      <td width="306"></td>
      <td width="143"></td>
    </tr>
    <tr height="80">
      <td height="80" width="64">meta-erc</td>
      <td width="131">meta-who</td>
      <td width="64">h31</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">008/39<br>
        040</td>
      <td>&lt;recordContentSource&gt;</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131">meta-what</td>
      <td width="64">h32</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">001</td>
      <td>&lt;recordIdentifier&gt;</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="112">
      <td height="112" width="64"></td>
      <td width="131">meta-when</td>
      <td width="64">h33</td>
      <td width="244">(no equivalent)</td>
      <td>(no equivalent)</td>
      <td>008/00-05</td>
      <td width="306">&lt;recordCreationDate&gt;<br>
        <br>
        &lt;recordChangeDate&gt;</td>
      <td width="143">(no equivalent)</td>
    </tr>
    <tr height="16">
      <td height="16" width="64"></td>
      <td width="131">meta-where</td>
      <td width="64">h34</td>
      <td width="244">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="184">(no equivalent)</td>
      <td width="306">(no equivalent)</td>
      <td width="143">(no equivalent)</td>
    </tr>
  </tbody>
</table>


&nbsp;

Where Kernel elements map to Dublin Core (DC) elements, the map is roughly one-to-one, but with a few notable exceptions.

1. "who" maps to DC Creator, but if no Creator use Publisher, and if no Publisher, use Contributor; "who" resembles what was once considered in DCMI to be an "agent" element 
2. "about-when" maps to the temporal aspect of DC Coverage and "about-where" maps to the spatial aspect of DC Coverage. 
3. The Kernel assumes that most values, especially personal names given in "who", will be given in "sort-friendly" manner, for example, "lastname, firstname" for western names and natural word order for Chinese names. 
4. The Kernel assumes [[TEMPER] (Blair, C. and J. Kunze, “Temporal Enumerated Ranges,” August&nbsp;2007.)](http://dot.ucop.edu/home/jak/erc2.html#TEMPER) format for dates in order to express date ranges, lists, approximate dates, and BC dates (not possible, for example, with [[W3CDTF] (, “Date and Time Formats (W3C profile of ISO8601),” .)](http://dot.ucop.edu/home/jak/erc2.html#W3CDTF)). 

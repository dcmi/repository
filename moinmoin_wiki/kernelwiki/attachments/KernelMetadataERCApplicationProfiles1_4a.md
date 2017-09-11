---
title: Kernel Metadata/ERC and Dublin Core Application Profiles
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/attachments/KernelMetadataERCApplicationProfiles1_4a.htm"
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
              <td class="header">February 20, 
                2008 - <span class="style1">DRAFT V1.4A</span>
              </td>
            </tr>
          </tbody>
        </table></td>
    </tr>
  </tbody>
</table>

# Kernel Metadata/ERC Application Profile 

### &nbsp;

### Introduction

Kernel metadata ([KSPEC]) is a small prescriptive vocabulary designed to support highly uniform but minimal object descriptions for the purpose of orderly collection management. The Kernel vocabulary, based on a subset of Dublin Core (DC) properties as defined by the DC Abstract Model [DCAM], aims to describe objects of any form or category, but its reach is limited to a small number of fundamental questions such as who, what, when, and where. The Electronic Resource Citation (ERC) specifies requirements for representing Kernel metadata in any given object description.

### Functional Requirements and Domain Model 

Kernel metadata is designed to assist orderly collection management by supporting the creation of brief but highly uniform object descriptions that can be listed, surveyed, and searched efficiently during normal collection maintenance and trouble-shooting activities. These descriptions serve as object surrogates that are convenient for automated sorting and filtering operations and are also eye-readable without specialized display software. The goal of Kernel metadata is to balance the needs for expressive power, very simple machine processing, and direct human manipulation of metadata records.

Kernel metadata is based on DC metadata [RFC5013] maintained by the Dublin Core Metadata Initiative [DCMI]. Kernel elements are descriptors that identify various object properties. In principle they apply to any object in the universe, whether digital, physical, or abstract, following in the tradition of [RFC3986]. This extreme diversity of objects is approached with the hypothesis that highly variable and rich object descriptions can be directly comparable at the level of about four fundamental elements — who, what, when, and where — as applied to the expression (i.e., publication, installation, performance, discovery) of the object. This sequence is a recurring theme in the Kernel. In anticipation of future extensions to "how" and "why", we refer to the first four elements as "the four h's" (what they all have in common is an initial aspirated "h" sound, which is also shorter to say than "w").

Kernel-based descriptions make it possible to compare an extremely diverse set of objects. Comparison is possible even when many other elements co-exist with Kernel elements, or when a minor amount of information in other elements overlaps with Kernel element information. Regardless of whether an object is smoked, worn, navigated, or in any other way, interacted with, its Kernel based description ensures the presence of a few predictable points of commonality in the form of easily isolatable Kernel elements. Kernel elements provide a concise intersection of interoperable (or at least comparable) elements across a broad range of object descriptions.

### Syntax and Usage Guidelines 

The Kernel specification defines both metadata elements and how particular data values should be structured within the elements. These rules may be complemented by other conventions (e.g., [AACR2]), although this is not required. As with most vocabularies, ultimate responsibility for creating coherent and sensible descriptions lies with the metadata creator.

Standard encoding methods such as [RDF] and [XML] may be used to format ERCs and Kernel metadata. It is also possible to encode modified forms of Kernel element values using other methods, such as [MARC] or [MODS], although some granularity of information may be lost in the process. For specific syntax and usage guidelines, refer to the Kernel metadata specification [KSPEC] and crosswalk to other encoding schemes [KMAP].

### Description Set Profile 

All four Kernel elements "who", "what", "when", and "where" must be present with no missing values; these four h's each have the coded synonyms h1, h2, h3, and h4, respectively. These four Kernel elements roughly correspond to Dublin Core elements, as described in the table below. If a best effort to supply a value fails, in its place must be given a standardized value based on the Kernel specification [KSPEC] indicating the reason for the missing value.

<pre>KERNEL ELEMENT SYNONYM DUBLIN CORE ELEMENT APPROXIMATION

* who h1 Creator/Contributor/Publisher
* what h2 Title
* when h3 Date
* where h4 Identifier (permanent)

about-who h11 Subject (personage)
about-what h12 Subject
about-when h13 Coverage (temporal)
about-where h14 Coverage (spatial)
about-how h15 Description

* A complete record requires a non-missing value for this element.

</pre>

Some Kernel elements should contain values formatted in a particular manner:

- The Kernel assumes that most values, especially personal names given in "who", will be given in "sort-friendly" manner, for example, "lastname, firstname" for western names and natural word order for Chinese names.
- The Kernel assumes [TEMPER] format for dates in order to express date ranges, lists, approximate dates, and BC dates (not possible, for example, with [W3CDTF]. 

#### &nbsp;

#### Who

* * *

[http://n2t.info/ark:/99152/h1](http://n2t.info/ark:/99152/h1)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A responsible person or party.</dd>
</dl>
<dl>
  <dt>
<strong>Comment</strong> </dt>

<dd>
  The Kernel assumes that most values, especially personal names given
 in "who", will be given in "sort-friendly" manner, for example,   
"lastname, firstname" for western names and natural word order for 
Chinese names.</dd>
<p><strong>For example:</strong> </p>
<pre>Statement (
  Property URI ( who )
  Value String ( "Miller, Alice" )
)
</pre>
</dl>

#### &nbsp;

#### What

* * *

[http://n2t.info/ark:/99152/h2](http://n2t.info/ark:/99152/h2)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A name or other human-oriented identifier. </dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( what )
  Value String ( "The Decline and Fall of the Roman Empire" )
)
</pre>
### &nbsp;

#### When

* * *

[http://n2t.info/ark:/99152/h3](http://n2t.info/ark:/99152/h3)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A date important in the object's lifecycle. </dd>
  </dl>
<dl>
  <dt>
<strong>Comment</strong> </dt>
  <dd>The Kernel assumes the <a href="#TEMPER">[TEMPER]</a> format for dates in order to express date ranges, lists, approximate dates, and BC dates (not possible, for example, with <a href="#W3CDTF">[W3CDTF]</a>). </dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( when )
  Value String ( "1952~, 1958-1967"
    Syntax Encoding Scheme URI ( TEMPER )
  )
</pre>
#### &nbsp;

#### Where

* * *

[http://n2t.info/ark:/99152/h4](http://n2t.info/ark:/99152/h4)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A location or system-oriented identifier. </dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( where )
  Value String ( "http://profiles.nlm.nih.gov/BB/AA/TT/tt.pdf"
  )
</pre>
### &nbsp;

#### About-Who

* * *

[http://n2t.info/ark:/99152/h11](http://n2t.info/ark:/99152/h11)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A person or party figuring in the information content.</dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( about-who )
  Value String ( "van Gogh, Vincent"
  )
</pre>
### &nbsp;

#### About-What

* * *

[http://n2t.info/ark:/99152/h12](http://n2t.info/ark:/99152/h12)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A subject or topic figuring in the information content.</dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( about-what )
  Value String ( "Nonlinearity"
  )
</pre>
### &nbsp;

#### About-When

* * *

[http://n2t.info/ark:/99152/h13](http://n2t.info/ark:/99152/h13)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A time period covered by the information content.</dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( about-when )
  Value String ( "1781"
  )
</pre>
### &nbsp;

#### About-Where

* * *

[http://n2t.info/ark:/99152/h14](http://n2t.info/ark:/99152/h14)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A location or region covered by the information content.</dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( about-where )
  Value String ( "Podunk, VT"
  )
</pre>
### &nbsp;

#### About-How

* * *

[http://n2t.info/ark:/99152/h15](http://n2t.info/ark:/99152/h15)

<dl>
  <dt>
<strong>Definition</strong>   
  </dt>
<dd>A description of the information content.</dd>
</dl>


**For example:**

<pre>Statement (
  Property URI ( about-how )
  Value String ( "Cocktail Napkin Drawing #2, destroyed during spill of 19690401"
  )
</pre>
### &nbsp;

### References 
<table border="0" width="99%">
  <tbody>
    <tr>
      <td valign="top"><a name="AACR2">[AACR2]</a></td>
      <td>American Library Association, “<a href="http://www.aacr2.org/">Anglo-American Cataloguing Rules</a>,” 2007 (<a href="http://www.aacr2.org/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="DCAM">[DCAM]</a></td>
      <td>Powell A. and M. Nilsson et al., “<a href="http://dublincore.org/documents/abstract-model/">DCMI Abstract Model</a>”, June 2007 (<a href="http://dublincore.org/documents/abstract-model/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="DCMI">[DCMI]</a></td>
      <td>Dublin Core Metadata Initiative, “<a href="http://dublincore.org/documents/dcmi-terms/">DCMI Metadata Terms</a>”, December 2006 (<a href="http://dublincore.org/documents/dcmi-terms/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="KMAP">[KMAP]</a></td>
      <td>Kunze, J. and A. Turner, “<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelMapXwalk.htm">Mapping and Crosswalk: Kernel Metadata to Dublin Core, MARC21, MODS, and VRA Core</a>”, September 2007 (<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelMapXwalk.htm">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="KSPEC">[KSPEC]</a></td>
      <td>Kunze, J. and A. Turner, “<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=Kernel1_1.html">Kernel Metadata and Electronic Resource Citations (ERCs)</a>”, October 2007 (<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=Kernel1_1.html">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="MARC">[MARC]</a></td>
      <td>Library of Congress, “<a href="http://www.loc.gov/marc/">Machine Readable Cataloguing</a>,” 2007 (<a href="http://www.loc.gov/marc/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="MODS">[MODS]</a></td>
      <td>Library of Congress, “<a href="http://www.loc.gov/standards/mods/">Metadata Object Description Schema</a>,” June 2006 (<a href="http://www.loc.gov/standards/mods/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="RDF">[RDF]</a></td>
      <td>W3C, “<a href="http://www.w3.org/RDF/">Resource Description Framework</a>”, 2004 (<a href="http://www.w3.org/RDF/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="RFC5013">[RFC5013]</a></td>
      <td>Kunze, J. and T. Baker, “<a href="ftp://ftp.isi.edu/in-notes/rfc5013.txt">The Dublin Core Metadata Element Set</a>,” RFC 5013, August 2007 (<a href="ftp://ftp.isi.edu/in-notes/rfc5013.txt">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="TEMPER">[TEMPER]</a></td>
      <td>Blair, C. and J. Kunze, “<a href="http://www.cdlib.org/inside/diglib/ark/temperspec.pdf">Temporal Enumerated Ranges</a>,” August 2007 (<a href="http://www.cdlib.org/inside/diglib/ark/temperspec.pdf">PDF</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="W3CDTF">[W3CDTF]</a></td>
      <td>W3C, “<a href="http://www.w3.org/TR/NOTE-datetime">Date and Time Formats (W3C profile of ISO8601)</a>”, September 1997 (<a href="http://www.w3.org/TR/NOTE-datetime">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="XML">[XML]</a></td>
      <td>W3C, “<a href="http://www.w3.org/TR/REC-xml/">Extensible Markup Language (XML) 1.0 (Fourth Edition)</a>,” August 2006 (<a href="http://www.w3.org/TR/REC-xml/">HTML</a>).</td>
    </tr>
  </tbody>
</table>


&nbsp;


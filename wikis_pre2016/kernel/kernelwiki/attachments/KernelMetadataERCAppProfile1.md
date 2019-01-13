---
title: KernelMetadataERCAppProfile - DCWiki
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/attachments/KernelMetadataERCAppProfile1.htm"
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
              <td class="header">November 15, 
                2007 - <span class="style1">DRAFT V1.0 </span>
              </td>
            </tr>
          </tbody>
        </table></td>
    </tr>
  </tbody>
</table>

# Kernel Metadata/ERC Application Profile for Dublin Core 

### &nbsp;

### Introduction

Kernel metadata ([KSPEC]) is a small prescriptive vocabulary designed to support highly uniform but minimal object descriptions for the purpose of orderly collection management. The Kernel vocabulary, based on a subset of the Dublin Core (DC) metadata element set, aims to describe objects of any form or category, but its reach is limited to a small number of fundamental questions such as who, what, when, and where. The Electronic Resource Citation (ERC) is a profile specifically designed to express Kernel metadata elements and values.

This document comprises an application profile for representing Kernel metadata and ERC requirements, using Dublin Core Abstract Model [DCAM]-based application profiles.

### Functional Requirements and Domain Model 

Kernel metadata is designed to assist orderly collection management by supporting the creation of brief but highly uniform object descriptions that can be listed, surveyed, and searched efficiently during normal collection maintenance and trouble-shooting activities. These descriptions serve as object surrogates that are convenient for automated sorting and filtering operations and are also eye-readable without specialized display software. The goal of Kernel metadata is to balance the needs for expressive power, very simple machine processing, and direct human manipulation of metadata records.

Kernel metadata is based on the Dublin Core (DC) metadata element set [RFC5013] maintained by the Dublin Core Metadata Initiative [DCMI]. Kernel elements are descriptors that identify various object properties. In principle they apply to any object in the universe, whether digital, physical, or abstract, following in the tradition of [RFC3986]. This extreme diversity of objects is approached with the hypothesis that highly variable and rich object descriptions can be directly comparable at the level of about four fundamental elements — who, what, when, and where — as applied to the _expression_ of the object. This sequence is a recurring theme in the Kernel. In anticipation of future extensions to "how" and "why", we refer to the first four elements as "the four h's" (what they all have in common is an initial aspirated "h" sound, which is also shorter to say than "w").

Kernel-based descriptions make it possible to compare an extremely diverse set of objects. Comparison is possible even when many other elements co-exist with Kernel elements, or when a minor amount of information in other elements overlaps with Kernel element information. Regardless of whether an object is smoked, worn, navigated, or in any other way, interacted with, its Kernel based description ensures the presence of a few predictable points of commonality in the form of easily isolatable Kernel elements. Kernel elements provide a concise intersection of interoperable (or at least comparable) elements across a broad range of object descriptions.

### Syntax and Usage Guidelines 

Standard encoding methods such as [RDF] and [XML] may be used to format ERCs and Kernel metadata. It is also possible to encode modified forms of Kernel element values using other methods, such as [MARC] or [MODS], although some granularity of information may be lost in the process. For specific syntax and usage guidelines, refer to the Kernel metadata specification [KSPEC] and crosswalk to other encoding schemes [KMAP].

### Description Set Profile 

ERC requirements can be roughly mapped to Dublin Core Abstract Model [DCAM]-based application profiles -- such as the Simple Dublin Core application profile [SIMPLEDC] -- as outlined in the tables below. In principle, however, the ERC profile may be expressed through any formal Dublin Core application profile, with the following conditions:

- All four Kernel elements "who", "what", "when", and "where" must be present with no missing values; these four h's each have the coded synonyms h1, h2, h3, and h4, respectively. These four Kernel elements roughly correspond to Dublin Core elements, as described in the tables below. If a best effort to supply a value fails, in its place must be given a standardized value based on the Kernel specification [KSPEC] indicating the reason for the missing value.
- Some Kernel elements should contain values formatted in a particular manner. This formatting should carry over into any representation of the values in Dublin Core elements. 
  - The Kernel assumes that most values, especially personal names given in "who", will be given in "sort-friendly" manner, for example, "lastname, firstname" for western names and natural word order for Chinese names.
  - The Kernel assumes [TEMPER] format for dates in order to express date ranges, lists, approximate dates, and BC dates (not possible, for example, with [W3CDTF]. 

### &nbsp;

#### Creator

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>DC Property</td>
      <td><a class="http" href="http://purl.org/dc/terms/creator">http://purl.org/dc/terms/creator</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>No</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>An entity primarily responsible for making the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A responsible person or party</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>who (h1) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>If no value is provided for Creator, use Publisher, and if no Publisher, use Contributor<br>
        <br>
        The Kernel assumes that most values, especially personal names
        given in "who", will be given in "sort-friendly" manner, for example,
        "lastname, firstname" for western names and natural word order for 
        Chinese names.</td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>
                <td width="78">
                  <p><strong>Occurrence</strong></p>
                </td>
                <td width="184">
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>2</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Title

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="209">DC Property</td>
      <td width="528"><a class="http" href="http://purl.org/dc/terms/title">http://purl.org/dc/terms/title</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>Yes</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>A name given to the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A name or other human-oriented identifier </td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>what (h2) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p>Value (Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Syntax Encoding Scheme:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Language Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>mandatory</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Date

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="106">DC Property</td>
      <td width="633"><a class="http" href="http://purl.org/dc/terms/date">http://purl.org/dc/terms/date</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>Yes</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>A point or period of time associated with an event in the lifecycle of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A date important in the object's lifecycle </td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>when (h3) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr>
      <td>Comment</td>
      <td>The Kernel assumes <a href="#TEMPER">[TEMPER]</a> format for dates in order to express date ranges, lists, approximate dates, and BC dates (not possible, for example, with <a href="#W3CDTF">[W3CDTF]</a>. </td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p>Value (Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Syntax Encoding Scheme:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Language Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>mandatory</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <p> </p>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Identifier

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="106">DC Property</td>
      <td width="633"><a class="http" href="http://purl.org/dc/terms/identifier">http://purl.org/dc/terms/identifier</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>Yes</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>An unambiguous reference to the resource within a given context</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A location or system-oriented identifier </td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>where (h4) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p>Value (Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Syntax Encoding Scheme:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Language Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>mandatory</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Subject (Personage) 

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td width="124">DC Property</td>
      <td width="618"><a class="http" href="http://purl.org/dc/terms/subject">http://purl.org/dc/terms/subject</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td>Literal?</td>
      <td>No</td>
    </tr>
    <tr>  
      <td>
        DC Definition</td>
      <td>The topic of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A person or party figuring in the information content</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>about-who (h11) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">  
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Subject

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="124">DC Property</td>
      <td width="618"><a class="http" href="http://purl.org/dc/terms/subject">http://purl.org/dc/terms/subject</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>No</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>The topic of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A subject or topic figuring in the information content</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>about-who (h12) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Coverage (Temporal) 

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="124">DC Property</td>
      <td width="616"><a class="http" href="http://purl.org/dc/terms/temporal">http://purl.org/dc/terms/temporal</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>No</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>Temporal characteristics of the intellectual content of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A time period covered by the information content</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>about-when (h13) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Coverage (Spatial) 

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">
      <td width="124">DC Property</td>
      <td width="616"><a class="http" href="http://purl.org/dc/terms/spatial">http://purl.org/dc/terms/spatial</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">
      <td>
        Literal?</td>
      <td>No</td>
    </tr>
    <tr>
      <td>
        DC Definition</td>
      <td>Spatial characteristics of the intellectual content of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A location or region covered by the information content</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>about-where (h14) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


&nbsp;

#### Description

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td width="106">DC Property</td>
      <td width="638"><a class="http" href="http://purl.org/dc/terms/description">http://purl.org/dc/terms/description</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td>Literal?</td>
      <td>Yes</td>
    </tr>
    <tr>  
      <td>
        DC Definition</td>
      <td>An account of the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A description of the information content</td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>about-how (h15) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr style="background-color: skyBlue;">  
      <td>
        <p>Value (Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Syntax Encoding Scheme:</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Language Constraint:</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <p> </p>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Publisher

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td>DC Property</td>
      <td><a class="http" href="http://purl.org/dc/terms/publisher">http://purl.org/dc/terms/publisher</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td>Literal?</td>
      <td>No</td>
    </tr>
    <tr>  
      <td>
        DC Definition</td>
      <td>An entity responsible for making the resource available</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A responsible person or party </td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>who (h1) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>If no value is provided for Creator, use Publisher, and if no Publisher, use Contributor.<br>
        <br>
        The Kernel assumes that most values, especially personal names given
        in "who", will be given in "sort-friendly" manner, for example, 
        "lastname, firstname" for western names and natural word order for 
        Chinese names.</td>
    </tr>
    <tr style="background-color: skyBlue;">  
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


### &nbsp;

#### Contributor

* * *

<table frame="border">
  <tbody>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td width="124">DC Property</td>
      <td width="639"><a class="http" href="http://purl.org/dc/terms/contributor">http://purl.org/dc/terms/contributor</a></td>
    </tr>
    <tr style="background-color: rgb(255, 255, 153);">  
      <td>
        DC Literal?</td>
      <td>No</td>
    </tr>
    <tr>  
      <td>
        <p> Definition </p>
      </td>
      <td>An entity primarily responsible for making contributions to the resource</td>
    </tr>
    <tr>
      <td>Kernel Definition </td>
      <td>A responsible person or party </td>
    </tr>
    <tr>
      <td>Kernel Mapping </td>
      <td>who (h1) </td>
    </tr>
    <tr>
      <td>Kernel Property </td>
      <td><a href="http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary">http://www.cdlib.org/inside/diglib/ark/ercspec.html#vocabulary</a></td>
    </tr>
    <tr>
      <td>
        <p> Comment </p>
      </td>
      <td>If no value is provided for Creator, use Publisher, and if no Publisher, use Contributor.<br>
        <br>
        The Kernel assumes that most values, especially personal names given
        in "who", will be given in "sort-friendly" manner, for example, 
        "lastname, firstname" for western names and natural word order for 
        Chinese names.</td>
    </tr>
    <tr style="background-color: skyBlue;">  
      <td>
        <p> Value (Non-Literal) </p>
      </td>
      <td>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value URI Constraint</strong>: </p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p> disallowed </p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Vocabulary Encoding Scheme Constraint</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table frame="border">
            <tbody>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><strong>Value String Constraint:</strong></p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p>Max occurrence</p>
                </td>
                <td>
                  <p>1</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Syntax Encoding Syntax Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong>: </p>
                </td>
                <td>
                  <p>disallowed</p>
                </td>
              </tr>
              <tr>  
                <td colspan="2" style="text-align: center;">
                  <p><em>Language Constraint</em>:</p>
                </td>
              </tr>
              <tr>  
                <td>
                  <p><strong>Occurrence</strong></p>
                </td>
                <td>
                  <p>optional</p>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>


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
      <td>Dublin Core Metadata Initiative, “<a href="http://dublincore.org/documents/abstract-model/">DCMI Abstract Model</a>” (<a href="http://dublincore.org/documents/abstract-model/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="DCMI">[DCMI]</a></td>
      <td>Dublin Core Metadata Initiative, “<a href="http://dublincore.org/documents/dcmi-terms/">DCMI Metadata Terms</a>” (<a href="http://dublincore.org/documents/dcmi-terms/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="KMAP">[KMAP]</a></td>
      <td>Kunze, J. and A. Turner, “<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelMapXwalk.html">Mapping and Crosswalk: Kernel Metadata to Dublin Core, MARC21, MODS, and VRA Core</a>” (<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelMapXwalk.html">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="KSPEC">[KSPEC]</a></td>
      <td>Kunze, J. and A. Turner, “<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelSpecDraft2.html">Kernel Metadata and Electronic Resource Citations (ERCs)</a>” (<a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelSpecDraft2.html">HTML</a>).</td>
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
      <td>W3C, “<a href="http://www.w3.org/RDF/">Resource Description Framework</a>” (<a href="http://www.w3.org/RDF/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="SIMPLEDC">[SIMPLEDC]</a></td>
      <td>Enoksson, Fredrik , “<a href="http://knowware.nada.kth.se/DCWiki/SimpleDublinCore">Simple Dublin Core: an Application Profile</a>,” September 2007 (<a href="http://knowware.nada.kth.se/DCWiki/SimpleDublinCore">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="TEMPER">[TEMPER]</a></td>
      <td>Blair, C. and J. Kunze, “<a href="http://www.cdlib.org/inside/diglib/ark/temperspec.pdf">Temporal Enumerated Ranges</a>,” August 2007 (<a href="http://www.cdlib.org/inside/diglib/ark/temperspec.pdf">PDF</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="W3CDTF">[W3CDTF]</a></td>
      <td>“<a href="http://www.w3.org/TR/NOTE-datetime">Date and Time Formats (W3C profile of ISO8601)</a>” (<a href="http://www.w3.org/TR/NOTE-datetime">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="XML">[XML]</a></td>
      <td>W3C, “<a href="http://www.w3.org/TR/REC-xml/">Extensible Markup Language (XML) 1.0 (Fourth Edition)</a>,” August 2006 (<a href="http://www.w3.org/TR/REC-xml/">HTML</a>).</td>
    </tr>
    <tr>
      <td valign="top"><a name="RFC5013">[RFC5013]</a></td>
      <td>Kunze, J. and T. Baker, “<a href="ftp://ftp.isi.edu/in-notes/rfc5013.txt">The Dublin Core Metadata Element Set</a>,” RFC 5013, August 2007.</td>
    </tr>
    <tr>
      <td valign="top"><a name="RFC3986">[RFC3986]</a></td>
      <td>
        <a href="mailto:timbl@w3.org">Berners-Lee, T.</a>, <a href="mailto:fielding@gbiv.com">Fielding, R.</a>, and <a href="mailto:LMM@acm.org">L. Masinter</a>, “<a href="ftp://ftp.isi.edu/in-notes/rfc3986.txt">Uniform Resource Identifier (URI): Generic Syntax</a>,” STD 66, RFC 3986, January 2005 (<a href="ftp://ftp.isi.edu/in-notes/rfc3986.txt">TXT</a>, <a href="http://xml.resource.org/public/rfc/html/rfc3986.html">HTML</a>, <a href="http://xml.resource.org/public/rfc/xml/rfc3986.xml">XML</a>).</td>
    </tr>
  </tbody>
</table>


### Notes on Draft V1.0 

- Check value constraints vis-a-vis Simple Dublin Core application profile [SIMPLEDC]
- Ongoing discussion points: 
  - Bill reiterated that we need to clarify whether we are creating an application profile for the ERC or the Kernel or both. Discussion resulted in an understanding that the mapping must comprehend constraint and/or prescription from both; the Kernel dictates value rules for any Kernel elements that appear while the ERC dictates that "this object description will contain four specific Kernel elements at a minimum"; it is not yet clear what impact this has on this document or on naming (eg, should we be working on an "ERC application profile " instead of a "Kernel Application profile"?)

&nbsp;


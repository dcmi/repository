---
title: Recommendation
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Recommendation.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 27 May 2017, at 12:29.  
This page has been accessed 2,767 times.

- Return to [Dublin to Drupal Top](/mediawiki_wiki/DublinToDrupal_Project.md)
- Return to [Dublin to Drupal Content Types Index](/mediawiki_wiki/DublinToDrupal_Project#Content_Types.md)

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Content_Type:_Formatted_Specification"><span class="tocnumber">1</span> <span class="toctext">Content Type: Formatted Specification</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Fields_.28DRAFT.21.21.21.29"><span class="tocnumber">2</span> <span class="toctext">Fields (DRAFT!!!)</span></a></li>
        <li class="toclevel-1 tocsection-3">
          <a href="#Example_Headers_from_Existing_Data"><span class="tocnumber">3</span> <span class="toctext">Example Headers from Existing Data</span></a>
          <ul>
            <li class="toclevel-2 tocsection-4"><a href="#EXAMPLE_.231"><span class="tocnumber">3.1</span> <span class="toctext">EXAMPLE #1</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#EXAMPLE_.232"><span class="tocnumber">3.2</span> <span class="toctext">EXAMPLE #2</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#EXAMPLE_.233"><span class="tocnumber">3.3</span> <span class="toctext">EXAMPLE #3</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


## Content Type: Formatted Specification 

The Formatted Specification content type is used for all documents issued by DCMI and its various groups that require adherence to DCMI provenance controls (versioning etc.). On the current website, Formatted Specifications are all those documents that include the yellow-backgrounded header. For example:

[<img alt="Formatted Specification Header" src="/mediawiki_wiki/images/Formatted_Specification.png" width="800" height="363">](/mediawiki_wiki/images/Formatted_Specification.png)

The current index page on the DCMI document repository website for resources needing to conform to the Formatted Specification content type is [http://dublincore.org/documents/](http://dublincore.org/documents/).

In addition to other metadata fields set out below, an instance of a Formatted Specification has: (1) an authority, source or context ((see, [Groups taxonomy](/index.php?title=DublinToDrupal_Project/EntityTypes&action=edit&redlink=1 "DublinToDrupal Project/EntityTypes (page does not exist)")); (2) a specific document type (genre) (see [Resource Type taxonomy](/index.php?title=DublinToDrupal_Project/ResourceType&action=edit&redlink=1 "DublinToDrupal Project/ResourceType (page does not exist)")); and (3) a status defining position in the resource life-cycle (see, [Document Status taxonomy](/mediawiki_wiki/DublinToDrupal_Project/ResourceStatus.md)).

The current header for Formatted Specifications above in yellow includes a number of fields referencing earlier versions of the same specification. It illustrates the current mechanism of linking these versions in the manner of linked lists using "Replaces", "Replaced By" and "Latest Version". We want to change that with the Drupal implementation and include instead a History block as part of the header that includes references to earlier versions of the resource.

## Fields (DRAFT!!!) 

- Document Header
  1. Title
  2. Creator (1-n authenticated users) - Tom: can we associate a creator, editor, or contributor with an affiliation?
  3. Editor (1-n authenticated users)
  4. Contributor (1-n authenticated users)
  5. Date Issued
  6. Document Identifier (Node URI of this version)
  7. Description (abstract)
  8. Subject (taxonomy? keywords?)
  9. History (list of references to earlier versions as well as the "Lastest Version"))
  10. Latest Version (unless this is handled by History)
  11. Document Type (genre) (taxonomy: [Resource Type taxonomy](/index.php?title=DublinToDrupal_Project/ResourceType&action=edit&redlink=1 "DublinToDrupal Project/ResourceType (page does not exist)"))
  12. DCMI Context (taxonomy: [Groups taxonomy)](/index.php?title=DublinToDrupal_Project/EntityTypes&action=edit&redlink=1 "DublinToDrupal Project/EntityTypes (page does not exist)")
  13. Status (taxonomy: [Document Status taxonomy](/mediawiki_wiki/DublinToDrupal_Project/ResourceStatus.md))
  14. Language (ISO language code selection) 
  15. Translation Of: (Node URI of document translated)
- Document Body
  1. Body - Tom: could an entire HTML document from the SVN site be pasted here, "as is" (after expanding header and footer includes)?
  2. References
  3. Acknowledgement
  4. Notes
  5. Errata

## Example Headers from Existing Data 

### EXAMPLE #1
<pre> -- Illustrates use of "This document" in History
 -- Long development cycle
 -- Many working drafts &amp; proposed recommendation versions
 -- Stable recommendation
 -- No forking; no merger
</pre>

+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+ H E A D E R +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=

***Title:*** DCMI Abstract Model

***Description:*** This document describes an abstract model for Dublin Core metadata.

***Subject:*** abstract model

***Creator:***

<dl>
<dd> Andy Powell, Eduserv Foundation, UK
</dd>
<dd> Mikael Nilsson, KMR Group, CID, NADA, KTH (Royal Institute of Technology), Sweden
</dd>
<dd> Ambjörn Naeve, KMR Group, CID, NADA, KTH (Royal Institute of Technology), Sweden
</dd>
<dd> Pete Johnston, Eduserv Foundation, UK
</dd>
<dd> Thomas Baker, DCMI
</dd>
</dl>


***Date Issued:*** 2004-09-28

***Document Identifier:*** [http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-28/](http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-28/)

***Document Type:*** Recommendation

***DCMI Context:*** Architecture Forum

***Status:*** Draft

***Language:*** en

* * *

***History:***

<pre> -- Current: 2007-06-04 &lt;<a href="http://dublincore.org/documents/2007/06/04/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2007/06/04/abstract-model/</a>&gt;
 -- Proposed: 2007-04-02 &lt;<a href="http://dublincore.org/documents/2007/04/02/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2007/04/02/abstract-model/</a>&gt;
 -- Proposed: 2007-02-05 &lt;<a href="http://dublincore.org/documents/2007/02/05/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2007/02/05/abstract-model/</a>&gt;
 -- Proposed: 2005-03-07 &lt;<a href="http://dublincore.org/documents/2005/03/07/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2005/03/07/abstract-model/</a>&gt;
 -- Proposed: 2005-01-31 &lt;<a href="http://dublincore.org/documents/2005/01/31/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2005/01/31/abstract-model/</a>&gt;
 -- Draft: 2004-12-08 &lt;<a href="http://dublincore.org/documents/2004/12/08/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/2004/12/08/abstract-model/</a>&gt;
 -- Draft: 2004-11-24 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-11-24/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-11-24/</a>&gt;
 <i><b>&gt;&gt;&gt; Draft: 2004-09-18: &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-28/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-28/</a>&gt;</b></i>
 -- Draft: 2004-09-18 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-18/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-18/</a>&gt;
 -- Draft: 2004-09-04 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-04/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-09-04/</a>&gt;
 -- Draft: 2004-02-04 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-02-04/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-02-04/</a>&gt;
 -- Draft: 2004-01-16 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-01-16/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2004-01-16/</a>&gt;
 -- Draft: 2003-12-18 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2003-12-18/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2003-12-18/</a>&gt;
 -- Draft: 2003-08-11 &lt;<a href="http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2003-08-11/" class="external free" rel="nofollow">http://www.ukoln.ac.uk/metadata/dcmi/abstract-model/2003-08-11/</a>&gt;
</pre>

=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+

### EXAMPLE #2 
<pre> -- Stable recommendation
 -- No forking; no merger
 -- Supersedes separate, earlier recommendations
</pre>

+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+ H E A D E R +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=***Title:*** Expressing Dublin Core metadata using the Resource Description Framework (RDF)

***Description:*** This document provides recommendations for expressing Dublin Core metadata using RDF, the Resource Description Framework.

***Subject:*** RDF/XML; RDF serialization

***Creator:***

<dl>
<dd> Mikael Nilsson, KMR Group, NADA, KTH (Royal Institute of Technology), Sweden
</dd>
<dd> Andy Powell, Eduserv Foundation, UK
</dd>
<dd> Pete Johnston, Eduserv Foundation, UK
</dd>
<dd> Ambjörn Naeve, KMR Group, NADA, KTH (Royal Institute of Technology), Sweden
</dd>
</dl>


***Date Issued:*** 2008-01-14

***Document Identifier:*** [http://dublincore.org/documents/2008/01/14/dc-rdf/](http://dublincore.org/documents/2008/01/14/dc-rdf/)

***Document Type:*** Recommendation

***DCMI Context:*** Architecture Forum

***Status:*** Current

***Language:*** en

* * *

***History:***

<pre> <i><b>&gt;&gt;&gt; Current: 2008-01-14 &lt;<a href="http://dublincore.org/documents/2008/01/14/dc-rdf/" class="external free" rel="nofollow">http://dublincore.org/documents/2008/01/14/dc-rdf/</a>&gt;</b></i>
 -- Proposed: 2007-06-04 &lt;<a href="http://dublincore.org/documents/2007/06/04/dc-rdf/" class="external free" rel="nofollow">http://dublincore.org/documents/2007/06/04/dc-rdf/</a>&gt;
 -- Proposed: 2007-04-02 &lt;<a href="http://dublincore.org/documents/2007/04/02/dc-rdf/" class="external free" rel="nofollow">http://dublincore.org/documents/2007/04/02/dc-rdf/</a>&gt;
 -- Draft: 2006-05-29 &lt;<a href="http://dublincore.org/documents/2006/05/29/dc-rdf/" class="external free" rel="nofollow">http://dublincore.org/documents/2006/05/29/dc-rdf/</a>&gt;
 -- Superseded: 2002-07-29 &lt;<a href="http://dublincore.org/documents/2002/07/31/dcmes-xml/" class="external free" rel="nofollow">http://dublincore.org/documents/2002/07/31/dcmes-xml/</a>&gt;
 -- Superseded: 2002-05-15 &lt;<a href="http://dublincore.org/documents/2002/05/15/dcq-rdf-xml/" class="external free" rel="nofollow">http://dublincore.org/documents/2002/05/15/dcq-rdf-xml/</a>&gt;
</pre>

=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+

### EXAMPLE #3 
<pre> -- Succeeding versions of a recommendation
 -- No forking; no merger
</pre>

+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+ H E A D E R +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=***Title:*** DCMI Box Encoding Scheme: specification of the spatial limits of a place, and methods for encoding this in a text string

***Description:*** The DCMI Box encoding scheme is a method for identifying a region of space using its geographic limits and representing that information as a value string. Components of the value string correspond to the bounding coordinates in north, south, east and west directions, plus optionally up and down, and also allow the coordinate system and units to be specified, and a name if desired. A method for encoding DCMI Box in a text string using the DCSV syntax is described. This notation is intended for representing a value of the DCMES element Coverage, particularly when using HTML meta elements.

***Subject:*** box encoding scheme

***Creator:***

<dl><dd> Simon Cox
</dd></dl>


***Contributor:***

<dl>
<dd> Andy Powell
</dd>
<dd> Andrew Wilson
</dd>
<dd> Pete Johnston
</dd>
</dl>


***Date Issued:*** 2006-04-10

***Document Identifier:*** [http://dublincore.org/documents/2006/04/10/dcmi-box/](http://dublincore.org/documents/2006/04/10/dcmi-box/)

***Document Type:*** Recommendation

***DCMI Context:*** Architecture Forum

***Status:*** Current

***Language:*** en

* * *

***History:***

<pre> <i><b>&gt;&gt;&gt; Current: 2006-04-10 &lt;<a href="http://dublincore.org/documents/2006/04/10/dcmi-box/" class="external free" rel="nofollow">http://dublincore.org/documents/2006/04/10/dcmi-box/</a>&gt;</b></i>
 -- Superseded: 2000/07/28 &lt;<a href="http://dublincore.org/documents/2000/07/28/dcmi-box/" class="external free" rel="nofollow">http://dublincore.org/documents/2000/07/28/dcmi-box/</a>&gt;
 -- Superseded: 2000/07/11 &lt;<a href="http://dublincore.org/documents/2000/07/11/dcmi-box/" class="external free" rel="nofollow">http://dublincore.org/documents/2000/07/11/dcmi-box/</a>&gt;
 -- Original text unavailable: &lt;<a href="http://www.ned.dem.csiro.au/research/visualisation/metadata/dcbox/NOTE-DCBOX-20000128.html" class="external free" rel="nofollow">http://www.ned.dem.csiro.au/research/visualisation/metadata/dcbox/NOTE-DCBOX-20000128.html</a>&gt;
</pre>

=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+


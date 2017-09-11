---
title: "- CancoreAccessForAllMetadataGuidelines/hasComponent"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2fhasComponent.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/hasComponent](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=fullsearch&value=%2FhasComponent&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.8: has component

<table bgcolor="#AFAFFF" width="50%">
  <tbody>
    <tr>
      <td>
        <em>Explanation</em>
      </td>
      <td>
        <em>Size</em>
      </td>
      <td>
        <em>Order</em>
      </td>
      <td>
        <em>Value Space</em>
      </td>
      <td>
        <em>Datatype</em>
      </td>
    </tr>
    <tr>
      <td>
        Identifies a resource that is a component of the described resource.  
        For example, a web page can consist of text and a number of images.  
        Each image is a <strong>component</strong> of the resource.</td>
      <td>
        0..*</td>
      <td>
        Unspecified</td>
      <td>
        Repertoire of ISO/IEC 10646-1:2000</td>
      <td>
        Character-String</td>
    </tr>
  </tbody>
</table>


#### Technical Implementation Notes
This element differs from the Relation element in that it is intended to address accessibility information. The Relation element was not designed to address or accomodate accessibility requirements. The Relation element within IEEE-LOM is intended for a higher level of granularity, for example, to define the relationship between a chapter and a book of which it is a part. <tt>Has component</tt> is intended to identify different components such as an audio track, an image and text within the same compound learning object or learning resource to address or accomodate accessibility requirements. 

Formally, a character string is expected as an entry for this element.

It is expected that there will be local implementations of this element that invoke or use subelements that may use a nested approach. For example, one implementation using IEEE-LOM may use, 1.1 identifier, 1.1.1 catalog and 1.1.2 entry as a unique way to identify has component:

- hasComponent

  - 1.1 identifier

    - 1.1.1 catalog

    - 1.1.2 entry

Such an implementation may look like the following:

<identifier>  
 <catalog>URL</catalog>  
 <entry> [http://www.cancore.ca](http://www.cancore.ca/)</entry>  
 </identifier>

A Dublin Core implementation would use the definition of identifier as, "An unambiguous reference to the resource within a given context". An example may look like, <dc:identifier rdf:resource=" [http://www.cancore.ca"/>](http://www.cancore.ca%22/%3E)

If the described resource is _atomic_, then it cannot have any parts, and this element should not be used.

It is possible that a resource can decompose into a number of sub-components; thus, this element can occur multiple times.

#### Vocabulary Recommendations
 [CanCore](http://dublincore.org/accessibilitywiki/CanCore) recommends that the vocabulary values for this element include, but not be limited to, URI, URL, URN, PURL and DOI. 

The recommended values are as follows:

**URI Uniform Resource Identifier** [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/) A character string used to identify a resource (such as a file) from anywhere on the Internet by type and location (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://www.ibm.com](ftp://www.ibm.com/)). The document "RFC2396" defines the generic syntax of URI, and provides guidelines for their use (see [http://www.ietf.org/rfc/rfc2396.txt](http://www.ietf.org/rfc/rfc2396.txt)).

**URL Uniform Resource Locator** [http://www.w3.org/Addressing/URL/Overview.html](http://www.w3.org/Addressing/URL/Overview.html) An informal name for addresses associated with the Web and other common Internet protocols (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://129.128.193.212](ftp://129.128.193.212/)).

**URN Uniform Resource Name** [http://www.ietf.org/rfc/rfc2141.txt](http://www.ietf.org/rfc/rfc2141.txt) "A particular scheme, urn:, specified by RFC2141 and related documents, intended to serve as persistent, location-independent, resource identifiers." (See [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/)). ISBNs may be incorporated or included here, for example, urn:isbn:xxx-xxx-xxx.

**PURL Persistent Uniform Resource Locator** [http://purl.oclc.org/](http://purl.oclc.org/) Functionally, a PURL is a URL. However, instead of pointing directly to the location of an Internet resource, a PURL points to an intermediate resolution service. The PURL resolution service associates the PURL with the actual URL and returns that URL to the client. The client can then complete the URL transaction in the normal fashion. In other words, this is a standard HTTP redirect. PURLs satisfy many of the requirements of URNs, but they do not allow for complete location independence.

**DOI Digital Object Identifier** [http://www.doi.org/](http://www.doi.org/) A system for identifying and exchanging intellectual property in a distributed, digital environment, developed in part by the Association of American Publishers. DOIs have been widely implemented in some contexts, including publishing and government, and are being considered by some educational infrastructure initiatives. DOI systems also provide some digital rights management features. Their use, however, may involve some upfront costs.

#### Text Example
This shows a case where the described resource indicates that it contains two components, an image of a cat and one of a dog: 

<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/dog.html" alt="http://www.somewhere.org/dog.jpg"> <img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/cat.html" alt="http://www.somewhere.org/cat.gif">

#### XML Example
The following markup indicates that the described resource contains two components: <accmd:hasComponent> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/dog.jpg</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasComponent>

<accmd:hasComponent>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LO]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LO") < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/cat.gif/>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasComponent>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2fhasComponent_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2FhasComponent) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent) Please only edit things below this line 
* * *

I suggest:

This element is used to identify components of a resource such as images, audio files, etc. embedded within it.

Note: Typically components in different access modes will be identified and described separately, even where they are part of the composite resource, because they may need to be replaced or augmented individually.

Liddy

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasComponent?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2fhasComponent.text_html) for this page (cached 2012-12-21 20:49:04)  

Immutable page (last edited 2006-02-09 11:30:54 by axelrod)


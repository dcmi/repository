---
title: "- CancoreAccessForAllMetadataGuidelines/isComponentOf"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2fisComponentOf.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/isComponentOf](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=fullsearch&value=%2FisComponentOf&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.12: is component of

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
        the described resource is a resource component of the referenced resource</td>
      <td>
        0..1</td>
      <td>
        Unspecified</td>
      <td>
        Repertoire of ISO/IEC 10646-1:2000 </td>
      <td>
        Character-String</td>
    </tr>
  </tbody>
</table>


#### Technical Implementation Notes
No subelements. 

This element differs from the Relation element in that it is intended to address accessibility information. The Relation element was not designed to address or accomodate accessibility requirements. The Relation element within IEEE-LOM is intended for a higher level of granularity, for example, to define the relationship between a chapter and a book of which it is a part. <tt>Is component of</tt> is intended to identify different components such as an audio track, an image and text within the same compound learning object or learning resource to address or accomodate accessibility requirements.

#### Vocabulary Recommendations
 [CanCore](http://dublincore.org/accessibilitywiki/CanCore) recommends that the vocabulary values for this element include, but not be limited to, URI, URL, URN, PURL and DOI. 

The recommended values are as follows:

**URI Uniform Resource Identifier** [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/) A character string used to identify a resource (such as a file) from anywhere on the Internet by type and location (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://www.ibm.com](ftp://www.ibm.com/)). The document "RFC2396" defines the generic syntax of URI, and provides guidelines for their use (see [http://www.ietf.org/rfc/rfc2396.txt](http://www.ietf.org/rfc/rfc2396.txt)).

**URL Uniform Resource Locator** [http://www.w3.org/Addressing/URL/Overview.html](http://www.w3.org/Addressing/URL/Overview.html) An informal name for addresses associated with the Web and other common Internet protocols (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://129.128.193.212](ftp://129.128.193.212/)).

**URN Uniform Resource Name** [http://www.ietf.org/rfc/rfc2141.txt](http://www.ietf.org/rfc/rfc2141.txt) "A particular scheme, urn:, specified by RFC2141 and related documents, intended to serve as persistent, location-independent, resource identifiers." (See [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/)). ISBNs may be incorporated or included here, for example, urn:isbn:xxx-xxx-xxx.

**PURL Persistent Uniform Resource Locator** [http://purl.oclc.org/](http://purl.oclc.org/) Functionally, a PURL is a URL. However, instead of pointing directly to the location of an Internet resource, a PURL points to an intermediate resolution service. The PURL resolution service associates the PURL with the actual URL and returns that URL to the client. The client can then complete the URL transaction in the normal fashion. In other words, this is a standard HTTP redirect. PURLs satisfy many of the requirements of URNs, but they do not allow for complete location independence.

**DOI Digital Object Identifier** [http://www.doi.org/](http://www.doi.org/) A system for identifying and exchanging intellectual property in a distributed, digital environment, developed in part by the Association of American Publishers. DOIs have been widely implemented in some contexts, including publishing and government, and are being considered by some educational infrastructure initiatives. DOI systems also provide some digital rights management features. Their use, however, may involve some upfront costs.

#### Text Example
 [http://www.url.to.compound.resource.com](http://www.url.to.compound.resource.com/) 
#### XML Example
<accmd:iscomponentof> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.url.to.resource.being.described.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:iscomponentof>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2fisComponentOf_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2FisComponentOf) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf) Please only edit things below this line 
* * *

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fisComponentOf?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2fisComponentOf.text_html) for this page (cached 2013-01-04 10:12:45)  

Immutable page (last edited 2006-02-09 11:40:39 by axelrod)


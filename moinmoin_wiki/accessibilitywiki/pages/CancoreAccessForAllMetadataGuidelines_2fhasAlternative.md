---
title: "- CancoreAccessForAllMetadataGuidelines/hasAlternative"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2fhasAlternative.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/hasAlternative](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=fullsearch&value=%2FhasAlternative&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.7: has alternative

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
        The references resource presents the intellectual content of all or part
        of the described resource, often in another access mode.</td>
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

It is possible that a number of alternative resources exist that can substitute for all or some of the described resource, and, also, that one alternative substitutes in a different way than another. If a resource has more than one alternative, the element should be repeated. For example, one alternative may possess captions (for people with hearing impairments), whereas another contains described video (for people with visual impairments). Three alternatives for a digital video about Marshall Mcluhan, one with English captions, one with French, and one with French described video would each have a separate entry and element.

Formally, a character string is expected as an entry for this element.

It is expected that there will be local implementations of this element that invoke or use subelements that may use a nested approach. For example, one implementation using IEEE-LOM may use, 1.1 identifier, 1.1.1 catalog and 1.1.2 entry as a unique way to identify has resource:

- has alternative

  - 1.1 identifier

    - 1.1.1 catalog

    - 1.1.2 entry

Such an implementation may look like the following:

<identifier>  
 <catalog>URL</catalog>  
 <entry> [http://www.cancore.ca](http://www.cancore.ca/)</entry>  
 </identifier>

A Dublin Core implementation would use the definition of identifier as, "An unambiguous reference to the resource within a given context". An example may look like, <dc:identifier rdf:resource=" [http://www.cancore.ca"/>](http://www.cancore.ca%22/%3E) may look like, <dc:identifier rdf:resource=" [http://www.hasalternative.com"/>](http://www.hasalternative.com%22/%3E)

If this element is absent, then the resource has no alternatives.

#### Vocabulary Recommendations
 [CanCore](http://dublincore.org/accessibilitywiki/CanCore) recommends that the vocabulary values for this element include, but not be limited to, URI, URL, URN, PURL and DOI. 

The recommended values are as follows:

**URI Uniform Resource Identifier** [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/) A character string used to identify a resource (such as a file) from anywhere on the Internet by type and location (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://www.ibm.com](ftp://www.ibm.com/)). The document "RFC2396" defines the generic syntax of URI, and provides guidelines for their use (see [http://www.ietf.org/rfc/rfc2396.txt](http://www.ietf.org/rfc/rfc2396.txt)).

**URL Uniform Resource Locator** [http://www.w3.org/Addressing/URL/Overview.html](http://www.w3.org/Addressing/URL/Overview.html) An informal name for addresses associated with the Web and other common Internet protocols (e.g., [http://www.cancore.ca](http://www.cancore.ca/), [ftp://129.128.193.212](ftp://129.128.193.212/)).

**URN Uniform Resource Name** [http://www.ietf.org/rfc/rfc2141.txt](http://www.ietf.org/rfc/rfc2141.txt) "A particular scheme, urn:, specified by RFC2141 and related documents, intended to serve as persistent, location-independent, resource identifiers." (See [http://www.w3.org/Addressing/](http://www.w3.org/Addressing/)). ISBNs may be incorporated or included here, for example, urn:isbn:xxx-xxx-xxx.

**PURL Persistent Uniform Resource Locator** [http://purl.oclc.org/](http://purl.oclc.org/) Functionally, a PURL is a URL. However, instead of pointing directly to the location of an Internet resource, a PURL points to an intermediate resolution service. The PURL resolution service associates the PURL with the actual URL and returns that URL to the client. The client can then complete the URL transaction in the normal fashion. In other words, this is a standard HTTP redirect. PURLs satisfy many of the requirements of URNs, but they do not allow for complete location independence.

**DOI Digital Object Identifier** [http://www.doi.org/](http://www.doi.org/) A system for identifying and exchanging intellectual property in a distributed, digital environment, developed in part by the Association of American Publishers. DOIs have been widely implemented in some contexts, including publishing and government, and are being considered by some educational infrastructure initiatives. DOI systems also provide some digital rights management features. Their use, however, may involve some upfront costs.

#### Text Example
Three alternatives for a digital video about Marshall Mcluhan, one with English captions, one with French and one with French described video: 

[http://www.somewhere.org/captions\_en/mcluhan.mov](http://www.somewhere.org/captions_en/mcluhan.mov) [http://www.somewhere.org/captions\_fr/mcluhan.mov](http://www.somewhere.org/captions_fr/mcluhan.mov) [http://www.somewhere.org/dv\_fr/mcluhan.mov](http://www.somewhere.org/dv_fr/mcluhan.mov)

#### XML Example
Three alternatives for a digital video about Marshall Mcluhan, one with English captions, one with French and one with French described video: <accmd:hasAlternative> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/captions\_en/mcluhan.mov</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasAlternative>

<accmd:hasAlternative>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/captions\_fr/mcluhan.mov</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasAlternative>

<accmd:hasAlternative>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/dv\_fr/mcluhan.mov</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasAlternative>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2fhasAlternative_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2FhasAlternative) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative) Please only edit things below this line 
* * *
 NOTE: 'alternative' is to be changed to adaptation'. 

I suggest:

This element is used to identify any alternative versions or adaptations of the content of a resource that may be substituted or used to augment it for a user, including content that can augment or replace only part of the content.

Note: Typically such additional content will be in another access mode but it may be in another language, reduced or enhanced literary forms, etc. Adaptations should be identified separately and, where possible, described as individual resources, including where they are components of a composite resource.

Liddy

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2fhasAlternative?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2fhasAlternative.text_html) for this page (cached 2012-12-21 20:48:54)  

Immutable page (last edited 2006-02-09 11:29:37 by axelrod)


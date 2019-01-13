---
title: "- ResourceIdentifierGuidelines"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/ResourceIdentifierGuidelines.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ResourceIdentifierGuidelines](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=fullsearch&value=ResourceIdentifierGuidelines&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines "View")
- [Diffs](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/ResourceIdentifierGuidelines">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ResourceIdentifierGuidelines_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ResourceIdentifierGuidelines_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Guidelines for using resource identifiers in Dublin Core metadata

This document is part of the [<img src="ResourceIdentifierGuidelines_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Architecture Wiki](http://dublincore.org/architecturewiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td align="left">
        <strong>Creator</strong>: </td>
      <td>
        Andy Powell, Eduserv Foundation</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Creator</strong>: </td>
      <td>
        Pete Johnston, Eduserv Foundation</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Creator</strong>: </td>
      <td>
        Lorna Campbell, CETIS</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Creator</strong>: </td>
      <td>
        Phil Barker, CETIS</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Date Issued</strong>: </td>
      <td>
        2006-06-21</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Identifier</strong>: </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines">http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines</a>
      </td>
    </tr>
    <tr>
      <td align="left">
        <strong>Replaces</strong>: </td>
      <td>
        <a href="http://www.ukoln.ac.uk/metadata/dcmi/identifiers/">http://www.ukoln.ac.uk/metadata/dcmi/identifiers/</a>
      </td>
    </tr>
    <tr>
      <td align="left">
        <strong>Is Replaced By</strong>: </td>
      <td>
        Not applicable</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Latest Version</strong>: </td>
      <td colspan="2" align="center">
      </td>
    </tr>
    <tr>
      <td align="left">
        <strong>Status of Document</strong>: </td>
      <td>
        DRAFT DCMI Recommended Resource</td>
    </tr>
    <tr>
      <td align="left">
        <strong>Description of Document</strong>: </td>
      <td>
        This document provides guidelines for using a number of widely adopted 
        identification systems in Dublin Core (DC) metadata descriptions.</td>
    </tr>
  </tbody>
</table>


### 1. Introduction

This document provides guidelines for using a number of widely adopted identification systems in Dublin Core (DC) metadata [DCMI].

### 2. Definitions

In the Dublin Core Metadata Element Set defintion [DCMES], the Dublin Core Metadata Initiative (DCMI) defines an identifier as:

_An unambiguous reference to [a] resource within a given context._

and goes on to note that:

_Recommended best practice is to identify the resource by means of a string or number conforming to a formal identification system. Example formal identification systems include the Uniform Resource Identifier (URI) (including the Uniform Resource Locator (URL)), the Digital Object Identifier (DOI) and the International Standard Book Number (ISBN)._

In DC metadata, identifiers are typically used with the Identifier, Source and Relation elements, though they may also be used elsewhere, for example with the Rights element as a reference to a service providing a rights statement.

The Uniform Resource Identifier (URI): Generic Syntax Internet-Draft [URI] defines an identifier as:

_An identifier embodies the information required to distinguish what is being identified from all other things within its scope of identification._

URIs are a fundamental building block of the semantic Web [SW], the Resource Description Framework [RDF] and the Dublin Core Abstract Model [DCAM]. The Architecture of the World Wide Web [WEBARCH] contains the following principle:

_To benefit from and increase the value of the World Wide Web, agents should provide URIs as identifiers for resources._
### 3. General guidelines

All formal identifiers used in DC metadata should be URIs. The phrase 'formal identifier' is used here to mean an identifier that conforms to a widely recognised identifier scheme. URIs provide a simple, extensible and widely deployed mechanism for identifying resources that supports the use (through mapping) of existing identification schemes including the common Uniform Resource Locator (URL) [URI-CLARIFICATION]. In DC metadata (with the exception of simple DC), the 'URI' encoding scheme should be indicated if appropriate, in accordance with the DCMI encoding guidelines [DCMI-ENCODINGS]. For example: [DC/XHTML-ENCODING]

<pre>&lt;meta name="DC.identifier" scheme="DCTERMS.URI" content="http://www.ukoln.ac.uk/" /&gt;
&lt;link rel="DC.relation" href="http://www.bath.ac.uk/" /&gt;
...
</pre>

[DC/XML-ENCODING]

<pre>&lt;metadata ...&gt;
  &lt;dc:identifier xsi:type="dcterms:URI"&gt;http://www.ukoln.ac.uk/&lt;/dc:identifier&gt;
  &lt;dc:relation xsi:type="dcterms:URI"&gt;http://www.bath.ac.uk/&lt;/dc:relation&gt;
  ...
&lt;/metadata&gt;
</pre>

[DC/RDF-ENCODING]

<pre>&lt;rdf:RDF ...&gt;
  &lt;rdf:Description rdf:about="http://www.ukoln.ac.uk/"&gt;
    &lt;dc:relation rdf:resource="http://www.bath.ac.uk/" /&gt;
    ...
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

Recommended best practice is to use URIs that conform to a registered URI scheme, since this helps to ensure that the URIs are unique. A list of registered URI schemes is maintained by IANA [URI-SCHEMES].

A URL is simply a type of URI that identifies a resource via a representation of its primary access mechanism (e.g., its network "location"), rather than by some other attributes it may have. Thus, an 'http' URL is a URI (or to put it another way, 'http' is a URI scheme).

A Uniform Resource Name (URN) is a URI that uses the 'urn' URI scheme and that is intended to 'name' a resource in a persistent way. The URN defines sub-spaces, called 'namespaces', which are assigned namespace identifiers. Thus, 'ISBN' is a URN namespace identifier (see below):

<pre>&lt;link rel="DC.source" href="urn:ISBN:1-56592-149-6" /&gt;
</pre>

A list of registered URN namespace identifiers is maintained by IANA [URN-NIDS].

The 'info' URI scheme [INFO-URI] [INFO-REG] has been developed from within the library and publishing communities to expedite the referencing by URIs of information assets that have identifiers in public namespaces but have no representation within the URI allocation. However, at the time of writing, the 'info' URI scheme had not been registered with IANA.

### 4. Specific identifier scheme guidelines

The following sections show how identifiers from specific identification systems can be used. An example of each is shown, using the DC/XHTML encoding.

These guidelines are based on the following decision tree:

1. 

If the identifier is an 'http' URI, use it as is

2. 

else, if the identifier is, or can be mapped to, a URI using a registered URI scheme, use that

3. 

else, if the identifier is, or can be mapped to, a URI using a registered URN namespace, use that

4. 

else, if the identifier is, or can be mapped to, an unregistered URI scheme or an unregistered URN namespace use that.

#### 4.1 ARK

The ARK (Archival Resource Key) naming scheme is designed to facilitate the high-quality and persistent identification of information objects [ARK]. An ARK is a special kind of URL that connects users to three things: the named object, its metadata, and the provider's promise about its persistence. An ARK has five components: an optional and mutable Name Mapping Authority Hostport, the "ark:" label, the Name Assigning Authority Number (NAAN), the assigned Name, and an optional and possibly mutable Qualifier supported by the NMA.

Map ARKs to 'http' URIs, using the Name Mapping Authority Hostport component. For example:

<pre>&lt;link rel="DC.relation"
      href="http://loc.gov/ark:/12025/654xz321" /&gt;
</pre>

#### 4.2 DOI

The Digital Object Identifier [DOI] is a persistent identifier of intellectual property entities. DOIs are most commonly mapped to 'http' URIs using the [http://dx.doi.org/](http://dx.doi.org/) prefix or to URIs using the 'doi' URI scheme [DOI-HANDBOOK]. For example:

<tt>http://dx.doi.org/10.1000/182</tt>  
<tt>doi:10.1000/182</tt>

However, they may also be mapped to 'info' URIs [INFO-URI] [INFO-REG]. For example:

<tt>info:doi/10.1000/182</tt>

Note: at the time of writing, the 'doi' and 'info' URI schemes had not been registered with IANA.

For example:

<pre>&lt;link rel="DC.relation" href="http://dx.doi.org/10.1000/182" /&gt;
</pre>

Note: software applications that consume metadata should accept and understand the other forms of DOIs shown above.

#### 4.3 Handle

The Handle System [HANDLE] is a comprehensive system for assigning, managing, and resolving persistent identifiers, known as "handles," for digital objects and other resources on the Internet. Handles are most commonly mapped to 'http' URIs using the [http://hdl.handle.net/](http://hdl.handle.net/) prefix or to URIs using the 'hdl' URI scheme. For example:

<tt>http://hdl.handle.net/4263537/4069</tt>  
<tt>hdl:4263537/4069</tt>

Note: at the time of writing, the 'hdl' URI scheme had not been registered with IANA.

For example:

<pre>&lt;link rel="DC.relation" href="http://hdl.handle.net/4263537/4069" /&gt;
</pre>

Note: software applications that consume metadata should accept and understand the 'hdl' URI form of Handles shown above.

#### 4.4 ISBN

An International Standard Book Number (ISBN) identifies an edition of a monographic work and is defined by the standard NISO/ANSI/ISO 2108:1992. RFC-3187 [RFC3187] defines the mechanism for mapping an ISBN to a URN.

Map ISBNs to URNs, using the 'ISBN' URN namespace identifier. For example:

<pre>&lt;link rel="DC.relation" href="urn:ISBN:1-56592-149-6" /&gt;
</pre>

Note that the hyphens in the ISBN are optional (and should be removed before comparing two ISBN URNs) and that the 'ISBN' URN namespace identifier is case-insensitive.

#### 4.5 ISSN

The International Standard Serial Number (ISSN) is an eight-digit number which identifies periodical publications, including electronic serials [ISSN]. RFC-3044 [RFC3044] defines the mechanism for mapping an ISSN to a URN.

Map ISSNs to URNs, using the 'ISSN' URN namespace identifier. For example:

<pre>&lt;link rel="DC.relation" href="urn:ISSN:1361-3200" /&gt;
</pre>

Note that the hyphens in the ISSN are optional (and should be removed before comparing two ISSN URNs) and that the 'ISSN' URN namespace identifier is case-insensitive.

#### 4.6 PURL

A PURL is a Persistent Uniform Resource Locator [PURL]. Functionally, a PURL is a URL. However, instead of pointing directly to the location of an Internet resource, a PURL points to an intermediate resolution service. Because PURLs conform to the URI specification, they can be used unmodified in DC metadata. For example:

<pre>&lt;link rel="DC.relation"
      href="http://purl.org/net/ukoln" /&gt;
</pre>

##### 4.6.1 POI

The PURL-based Object Identifier (POI) provides a simple specification for resource identifiers based on the PURL system [POI]. Because POIs conform to the URI specification, they can be used unmodified in DC metadata. For example:

<pre>&lt;link rel="DC.relation"
      content="http://purl.org/poi/xtcat.oclc.org/OCLCNo/ocm41020136" /&gt;
</pre>

#### 4.7 SICI

The Serial Item and Contribution Identifier (SICI) standard defines a variable length code that provides unique identification of serial items (e.g., issues) and the contributions (e.g., articles) contained in a serial title. SICI is specified in NISO/ANSI Z39.56-1996. The 'info' URI Scheme Internet-Draft [INFO-URI] provides a mechanism for mapping a SICI to an 'info' URI.

Note: at the time of writing, the 'info' URI scheme had not been registered with IANA.

Map SICIs to 'info' URIs. For example:

<pre>&lt;link rel="DC.relation"
      href="info:sici/1046-8188(199501)13:1%3C69:FTTHBI%3E2.0.TX;2-4" /&gt;
</pre>

### References

[DCMI] Dublin Core Metadata Initiative [http://dublincore.org/](http://dublincore.org/)

[DCMES] Dublin Core Metadata Element Set, Version 1.1: Reference Description [http://dublincore.org/documents/dces/](http://dublincore.org/documents/dces/)

[DCQ] Dublin Core Qualifiers [http://dublincore.org/documents/dcmes-qualifiers/](http://dublincore.org/documents/dcmes-qualifiers/)

[URI] Uniform Resource Identifiers (URI): Generic Syntax [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

[SW] Semantic Web [http://www.w3.org/2001/sw/](http://www.w3.org/2001/sw/)

[RDF] Resource Description Framework [http://www.w3.org/RDF/](http://www.w3.org/RDF/)

[DCAM] Dublin Core Abstract Model [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)

[WEBARCH] Architecture of the World Wide Web, First Edition [http://www.w3.org/TR/webarch/](http://www.w3.org/TR/webarch/)

[URI-CLARIFICATION] URIs, URLs, and URNs: Clarifications and Recommendations 1.0 [http://www.w3.org/TR/uri-clarification/](http://www.w3.org/TR/uri-clarification/)

[DCMI-ENCODINGS] DCMI Encoding Guidelines [http://dublincore.org/resources/expressions/](http://dublincore.org/resources/expressions/)

[DC/XHTML-ENCODING] Expressing Dublin Core in HTML/XHTML meta and link elements [http://dublincore.org/documents/dcq-html/](http://dublincore.org/documents/dcq-html/)

[DC/XML-ENCODING] Guidelines for implementing Dublin Core in XML [http://dublincore.org/documents/dc-xml-guidelines/](http://dublincore.org/documents/dc-xml-guidelines/)

[DC/RDF-ENCODING] Expressing Simple Dublin Core in RDF/XML [http://dublincore.org/documents/dcmes-xml/](http://dublincore.org/documents/dcmes-xml/)

[URI-SCHEMES] Uniform Resource Identifier (URI) SCHEMES [http://www.iana.org/assignments/uri-schemes](http://www.iana.org/assignments/uri-schemes)

[URN-NIDS] URN Namespaces [http://www.iana.org/assignments/urn-namespaces](http://www.iana.org/assignments/urn-namespaces)

[ARK] The ARK Persistent Identifier Scheme [http://www.ietf.org/internet-drafts/draft-kunze-ark-09.txt](http://www.ietf.org/internet-drafts/draft-kunze-ark-09.txt)

[DOI] The Digital Object Identifier System [http://www.doi.org/](http://www.doi.org/)

[DOI-HANDBOOK] DOI Handbook [http://www.doi.org/hb.html](http://www.doi.org/hb.html)

[INFO-URI] The "info" URI Scheme for Information Assets with Identifiers in Public Namespaces [http://info-uri.info/registry/drafts.html](http://info-uri.info/registry/drafts.html)

[INFO-REG] "info" URI scheme registry [http://info-uri.info/registry/](http://info-uri.info/registry/)

[HANDLE] The Handle System [http://www.handle.net/>](http://www.handle.net/%3E)

[RFC3187] RFC-3187: Using International Standard Book Numbers as Uniform Resource Names [http://www.ietf.org/rfc/rfc3187.txt](http://www.ietf.org/rfc/rfc3187.txt)

[ISSN] International Standard Serial Number [http://www.issn.org/](http://www.issn.org/)

[RFC3044] RFC-3044: Using The ISSN (International Serial Standard Number) as URN (Uniform Resource Names) within an ISSN-URN Namespace [http://www.ietf.org/rfc/rfc3044.txt](http://www.ietf.org/rfc/rfc3044.txt)

[PURL] Persistent Uniform Resource Locator [http://purl.org/](http://purl.org/)

[POI] The PURL-based Object Identifier (POI) [http://www.ukoln.ac.uk/distributed-systems/poi/](http://www.ukoln.ac.uk/distributed-systems/poi/)

 [RefreshCache](http://dublincore.org/architecturewiki/ResourceIdentifierGuidelines?action=refresh&arena=Page.py&key=ResourceIdentifierGuidelines.text_html) for this page (cached 2013-01-04 22:18:25)  

Immutable page (last edited 2006-06-21 16:18:51 by [AndyPowell](http://dublincore.org/architecturewiki/AndyPowell))


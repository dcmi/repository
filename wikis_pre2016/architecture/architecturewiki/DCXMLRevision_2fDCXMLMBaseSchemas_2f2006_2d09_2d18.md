---
title: "- DCXMLRevision/DCXMLMBaseSchemas/2006-09-18"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLMBaseSchemas/2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=fullsearch&value=%2F2006-09-18&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DC-XML-Min: Example Base W3C XML Schemas

Note: These XML schemas are presently made available as attachments to this Wiki page. This is a temporary measure, and, when stable, they will be assigned persistent URIs on the DCMI Web site.

- Schema: [dcxm.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=AttachFile&do=get&target=dcxm.xsd)  
Target XML Namespace: <tt>http://dublincore.org/xml/dc-xml-min/2006/09/18/</tt>

  - declares the elements <tt>dcx:descriptionSet</tt>, <tt>dcx:description</tt>

  - defines a set of named complex types that describe the default content models for these elements and for a Statement Element

  - declares the attributes <tt>dcx:resourceURI</tt>, <tt>dcx:valueURI</tt>, <tt>dcx:vocabEncSchemeURI</tt>, <tt>dcx:valueClassURI</tt>, <tt>dcx:syntaxEncSchemeURI</tt>, <tt>dcx:descriptionId</tt>, <tt>dcx:descriptionRef</tt>

- Schema: [dc.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=AttachFile&do=get&target=dc.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/elements/1.1/</tt>

  - declares a set of Statement Elements to represent _statements_ referring to the 15 _properties_ of the DCMES

  - defines a complex type <tt>dc:DescriptionElement</tt> as a convenience for schema authors who need to define a Description Element allowing all of these Statement Elements as child elements

- Schema: [dcterms.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=AttachFile&do=get&target=dcterms.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/terms/</tt>

  - declares a set of Statement Elements to represent _statements_ referring to the _properties_ of the DC Terms vocabulary

  - defines a complex type <tt>dcterms:DescriptionElement</tt> as a convenience for schema authors who need to define a Description Element allowing all of these Statement Elements as child elements

- Schema: [dcmitype.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=AttachFile&do=get&target=dcmitype.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/dcmitype/</tt>

  - defines a set of named simple types which specify an enumerated lists of strings and URIs for referring to the classes of the DCMI Type Vocabulary

See also

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min 2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2006-09-18 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min DCAP Schemas 2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMDCAPSchemas/2006-09-18 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min Instances 2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMInstances/2006-09-18 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min XSLT 2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMXSLT/2006-09-18 "Self")

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLMBaseSchemas_2f2006_2d09_2d18.text_html) for this page (cached 2012-12-21 22:13:16)  

Immutable page (last edited 2006-09-21 15:15:45 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


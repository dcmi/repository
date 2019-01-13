---
title: "- DCXMLRevision/DCXMLDCAPSchemas/2006-05-29"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLDCAPSchemas/2006-05-29](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=fullsearch&value=%2F2006-05-29&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Example DCAP W3C XML Schemas

Note: These XML schemas are presently made available as attachments to this Wiki page. This is a temporary measure, and, when stable, they will be assigned persistent URIs on the DCMI Web site.

- Schema: [simpledc.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile&do=get&target=simpledc.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/xml/simple/</tt>

  - defines a named complex type which restricts the content of the Description Set Element to a single Description Element with the name <tt>dcx:description</tt>

  - defines a named complex type which restricts the content of the Description Element to a set of Statement Elements with names corresponding to the URIs of the 15 _properties_ of the DCMES

- Schema: [qualifieddc.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile&do=get&target=qualifieddc.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/xml/qualified/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcx:description</tt>

  - defines a named complex type which restricts the content of the Description Elements to a set of Statement Elements with names corresponding to the URIs of the _properties_ defined by DCMI

- Schema: [mydcap.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile&do=get&target=mydcap.xsd)  
Target XML Namespace: <tt>http://example.org/my/dc/xml/myap/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcx:description</tt>

  - defines named complex types which restrict the content of Description Elements to Statement Elements with names corresponding to specified lists of _properties_

- Schema: [yourdcap.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile&do=get&target=yourdcap.xsd)  
Target XML Namespace: <tt>http://example.org/your/dc/xml/yourap/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcap:fooDescription</tt> followed by at least one Description Element with the name <tt>dcap:barDescription</tt>

  - defines named complex types which restrict the content of the <tt>dcap:fooDescription</tt> Description Element and the <tt>dcap:barDescription</tt> Description Element to Statement Elements with names corresponding to specified lists of _properties_

- Schema: [theirdcap.xsd](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=AttachFile&do=get&target=theirdcap.xsd)  
Target XML Namespace: <tt>http://example.org/their/dc/xml/theirap/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcx:description</tt>

  - defines named complex types which restrict the content of Description Elements to Statement Elements with names corresponding to specified lists of _properties_

  - defines a complex type which restricts the content of the Statement Element for the <tt>dcterms:isReferencedBy</tt> _property_

  - defines a complex type which restricts the content of the Value String Element for the <tt>dc:type</tt> _property_

  - defines a complex type which restricts the content of the XML Representation Element for the <tt>dc:description</tt> _property_

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLDCAPSchemas_2f2006_2d05_2d29.text_html) for this page (cached 2013-01-05 08:58:48)  

Immutable page (last edited 2006-05-25 13:15:22 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


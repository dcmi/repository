---
title: "- DCXMLRevision/DCXMLMBaseSchemas/2007-06-19"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLMBaseSchemas/2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=fullsearch&value=%2F2007-06-19&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DC-XML-Min: Example Base XML Schemas

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcxm.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcxm.xsd)  
Target XML Namespace: <tt>http://dublincore.org/xml/dc-xml-min/2007/06/19/</tt>

  - declares the elements <tt>dcxm:descriptionSet</tt>, <tt>dcxm:description</tt>

  - defines a set of named complex types that describe the default content models for these elements and for a Statement Element

  - declares the attributes <tt>dcxm:resourceURI</tt>, <tt>dcxm:valueURI</tt>, <tt>dcxm:vocabEncSchemeURI</tt>, <tt>dcxm:valueClassURI</tt>, <tt>dcxm:syntaxEncSchemeURI</tt>, <tt>dcxm:resourceId</tt>, <tt>dcxm:valueRef</tt>, <tt>dcxm:valueType</tt>

- RELAX NG Schema: [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcxm.rng](http://www.incognitum.net/petej/projects/dc-xml/min/relax/2007/06/19/dcxm.rng)

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dc.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dc.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/elements/1.1/</tt>

  - declares a set of Statement Elements to represent _statements_ referring to the 15 _properties_ of the DCMES

  - defines a complex type <tt>dc:DescriptionElement</tt> as a convenience for schema authors who need to define a Description Element allowing all of these Statement Elements as child elements

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcterms.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcterms.xsd)  
Target XML Namespace: <tt>http://purl.org/dc/terms/</tt>

  - declares a set of Statement Elements to represent _statements_ referring to the _properties_ of the DC Terms vocabulary

  - defines a complex type <tt>dcterms:DescriptionElement</tt> as a convenience for schema authors who need to define a Description Element allowing all of these Statement Elements as child elements

See also

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min Constraint Schemas 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMConstraintSchemas/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min Instances 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMInstances/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min GRDDL XSLT 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMXSLT/2007-06-19 "Self")

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLMBaseSchemas_2f2007_2d06_2d19.text_html) for this page (cached 2012-12-30 01:33:50)  

Immutable page (last edited 2007-07-18 12:31:19 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


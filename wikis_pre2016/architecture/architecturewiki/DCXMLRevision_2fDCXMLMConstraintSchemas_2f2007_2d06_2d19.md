---
title: "- DCXMLRevision/DCXMLMConstraintSchemas/2007-06-19"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLMConstraintSchemas/2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=fullsearch&value=%2F2007-06-19&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Example DCAP XML Schemas

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap1.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcap1.xsd)  
Target XML Namespace: <tt>http://example.org/my/dc/xml/dcap1/</tt>

  - defines a named complex type which restricts the content of the Description Set Element to a single Description Element with the name <tt>dcxm:description</tt>

  - defines a named complex type which restricts the content of the Description Element to a set of Statement Elements with names corresponding to the URIs of the 15 _properties_ of the DCMES

- RELAX NG Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap1.rng](http://www.incognitum.net/petej/projects/dc-xml/min/relax/2007/06/19/dcap1.rng)

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap2.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcap2.xsd)  
Target XML Namespace: <tt>http://example.org/my/dc/xml/dcap2/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcxm:description</tt>

  - defines a named complex type which restricts the content of the Description Elements to a set of Statement Elements with names corresponding to the URIs of the _properties_ with URIs in the "dcterms" DCMI Namespace

- RELAX NG Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap2.rng](http://www.incognitum.net/petej/projects/dc-xml/min/relax/2007/06/19/dcap2.rng)

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap3.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcap3.xsd)  
Target XML Namespace: <tt>http://example.org/my/dc/xml/dcap3/</tt>

  - defines a named complex type which requires that the content of the Description Set Element is at least one Description Element with the name <tt>dcx:description</tt>

  - defines named complex types which restrict the content of Description Elements to Statement Elements with names corresponding to specified lists of _properties_

- RELAX NG Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap2.rng](http://www.incognitum.net/petej/projects/dc-xml/min/relax/2007/06/19/dcap2.rng)

- W3C XML Schema: [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-www.png" alt="[WWW]" height="11" width="11">dcap1.xsd](http://www.incognitum.net/petej/projects/dc-xml/min/xsd/2007/06/19/dcap4.xsd)  
Target XML Namespace: <tt>http://example.org/my/dc/xml/dcap4/</tt>

  - defines a named complex type which restricts the content of the Description Set Element to a single Description Element with the name <tt>dcxm:description</tt>

  - defines a named complex type which restricts the content of the Description Element to a set of Statement Elements with names corresponding to the URIs of the 15 _properties_ of the DCMES

  - defines a named complex type which restricts the content of the Value String Element to a single child element from the XHTML XML Namespace

- RELAX NG Schema:

See also

- [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min Base Schemas 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMBaseSchemas/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min Instances 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMInstances/2007-06-19 "Self")

- [<img src="DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML-Min GRDDL XSLT 2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMXSLT/2007-06-19 "Self")

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLMConstraintSchemas_2f2007_2d06_2d19.text_html) for this page (cached 2012-12-07 16:55:21)  

Immutable page (last edited 2007-07-18 12:44:52 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


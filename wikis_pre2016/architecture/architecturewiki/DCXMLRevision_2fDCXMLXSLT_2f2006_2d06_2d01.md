---
title: "- DCXMLRevision/DCXMLXSLT/2006-06-01"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLXSLT/2006-06-01](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=fullsearch&value=%2F2006-06-01&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## XSLT transforms for DC-XML

- GRDDL XSLT 1.0: [dcx2rdfxml.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=AttachFile&do=get&target=dcx2rdfxml.xsl)

  - This transform reads a DC-XML instance and outputs RDF/XML

    - Note: this transform is incomplete/work-in-progress and does not currently reflect all the features of the _Expressing Dublin Core metadata using RDF_ document [DC-RDF]

- GRDDL XSLT 2.0: [dcx2rdfxml2.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=AttachFile&do=get&target=dcx2rdfxml2.xsl)

  - This transform reads a DC-XML instance and outputs RDF/XML

    - Note: this transform is incomplete/work-in-progress and does not currently reflect all the features of the _Expressing Dublin Core metadata using RDF_ document [DC-RDF]

- oaidc2dcx.xsl XSLT 1.0: [oaidc2dcx.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=AttachFile&do=get&target=oaidc2dcx.xsl)

  - This transform reads an oai\_dc XML instance and outputs a DC-XML instance.

### References

<a id="DC-XML"></a>**[DC-XML]**  
Expressing DC metadata using XML  
 [http://dublincore.org/documents/dc-xml/2006-05-29](http://dublincore.org/documents/dc-xml/2006-05-29)

<a id="DC-RDF"></a>**[DC-RDF]**  
Expressing DC metadata using RDF  
 [http://dublincore.org/documents/dc-rdf/2006-05-29](http://dublincore.org/documents/dc-rdf/2006-05-29)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Team Submission 16 May 2005  
 [http://www.w3.org/TeamSubmission/grddl/](http://www.w3.org/TeamSubmission/grddl/)

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLXSLT_2f2006_2d06_2d01.text_html) for this page (cached 2012-12-21 21:51:08)  

Immutable page (last edited 2006-06-15 10:16:22 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


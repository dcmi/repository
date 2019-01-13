---
title: "- DCXMLRevision/DCXMLFXSLT/2006-09-18"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLFXSLT/2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=fullsearch&value=%2F2006-09-18&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## XSLT transforms for DC-XML-Full

- GRDDL XSLT 1.0: [dcxf2rdfxml.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=AttachFile&do=get&target=dcxf2rdfxml.xsl)

  - This transform reads a DC-XML-Full instance and outputs RDF/XML

    - Note: this transform is incomplete/work-in-progress and does not currently reflect all the features of the _Expressing Dublin Core metadata using RDF_ document [DC-RDF]

- GRDDL XSLT 2.0: (to follow)

- oaidc2dcxf.xsl XSLT 1.0: [oaidc2dcxf.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=AttachFile&do=get&target=oaidc2dcxf.xsl)

  - This transform reads an oai\_dc XML instance and outputs a DC-XML-Full instance.

- valsimpdcap.xsl XSLT 1.0 (to follow)

  - This transform checks a DC-XML-Full instance against the Simple DC DCAP.

### References

<a id="DC-XML-Full"></a>**[DC-XML-Full]**  
Expressing DC metadata using XML (DC-XML-Full)  
 [http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2006-09-18)

<a id="DC-RDF"></a>**[DC-RDF]**  
Expressing DC metadata using RDF  
 [http://dublincore.org/documents/dc-rdf/2006-05-29](http://dublincore.org/documents/dc-rdf/2006-05-29)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Team Submission 16 May 2005  
 [http://www.w3.org/TeamSubmission/grddl/](http://www.w3.org/TeamSubmission/grddl/)

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLFXSLT_2f2006_2d09_2d18.text_html) for this page (cached 2012-12-21 22:06:53)  

Immutable page (last edited 2006-09-21 15:14:48 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


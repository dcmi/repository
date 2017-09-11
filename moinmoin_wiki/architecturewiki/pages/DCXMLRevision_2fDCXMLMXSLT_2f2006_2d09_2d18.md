---
title: "- DCXMLRevision/DCXMLMXSLT/2006-09-18"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLMXSLT/2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=fullsearch&value=%2F2006-09-18&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## XSLT transforms for DC-XML-Min

- GRDDL XSLT 1.0: [dcxm2rdfxml.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=AttachFile&do=get&target=dcxm2rdfxml.xsl)

  - This transform reads a DC-XML-Min instance and outputs RDF/XML

    - Note: this transform is incomplete/work-in-progress and does not currently reflect all the features of the _Expressing Dublin Core metadata using RDF_ document [DC-RDF]

- GRDDL XSLT 2.0: (to follow)

  - This transform reads a DC-XML-Min instance and outputs RDF/XML

    - Note: this transform is incomplete/work-in-progress and does not currently reflect all the features of the _Expressing Dublin Core metadata using RDF_ document [DC-RDF]

- oaidc2dcxm.xsl XSLT 1.0: [oaidc2dcxm.xsl](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=AttachFile&do=get&target=oaidc2dcxm.xsl)

  - This transform reads an oai\_dc XML instance and outputs a DC-XML-Min instance.

### References

<a id="DC-XML-Min"></a>**[DC-XML-Min]**  
Expressing DC metadata using XML (DC-XML-Min)  
 [http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2006-09-18](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2006-09-18)

<a id="DC-RDF"></a>**[DC-RDF]**  
Expressing DC metadata using RDF  
 [http://dublincore.org/documents/dc-rdf/2006-05-29](http://dublincore.org/documents/dc-rdf/2006-05-29)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Team Submission 16 May 2005  
 [http://www.w3.org/TeamSubmission/grddl/](http://www.w3.org/TeamSubmission/grddl/)

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLMXSLT_2f2006_2d09_2d18.text_html) for this page (cached 2012-12-21 22:14:07)  

Immutable page (last edited 2006-09-22 14:34:35 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


---
title: "- AdaptabilityApplicationProfile"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/AdaptabilityApplicationProfile.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AdaptabilityApplicationProfile](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=fullsearch&value=AdaptabilityApplicationProfile&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile "View")
- [Diffs](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/AdaptabilityApplicationProfile">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AdaptabilityApplicationProfile_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AdaptabilityApplicationProfile_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Example description based on the proposed Adaptability Application Profile

Andy Powell, Eduserv Foundation  
 February 2006

### Introduction

This document provides a simple example 'description set' based on the proposed Adaptability Application Profile that is currently under development within the [<img src="AdaptabilityApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">DC Accessibility Working Group](http://dublincore.org/accessibilitywiki/DiscussionOfFcd).

The example is documented in a syntax-neutral format, based on the constructs available in the [<img src="AdaptabilityApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model (DAM)](http://dublincore.org/documents/abstract-model/).

The 'description set' comprises several descriptions. Firstly, there is a brief description of a multimedia Web page that contains some text, images and a Flash animation. Secondly, there is a brief description of the Flash animation. Thirdly, there is a brief description of a plain-text adaptation of the multimedia Web page. Finally, there is a brief description of an MP3 audio file that is derived from the plain-text adaptation.

None of these descriptions is intended to be complete - their purpose is simply to show the use of the properties, encoding schemes and vocabularies used in the proposed adaptability application profile.

The issued raised by this example are discussed at the end.

### Example
<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt;
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt;
@prefix a4a: &lt;http://purl.org/a4a/terms/&gt;
@prefix a4aformat: &lt;http://purl.org/a4a/format/&gt;
@prefix a4atype: &lt;http://purl.org/a4a/type/&gt;
@prefix a4aaccessmode: &lt;http://purl.org/a4a/accessmode/&gt;
@prefix a4arole: &lt;http://purl.org/a4a/role/&gt;
@prefix a4aflexibility: &lt;http://purl.org/a4a/flexibility/&gt;
@prefix a4asupporttool: &lt;http://purl.org/a4a/supporttool/&gt;

Description Set (
  Description (
    Resource URI ( &lt;http://example.org/foo/bar.html&gt; )
    # the multimedia Web page
    Statement (
      Property URI ( dc:description ( )
      Value String ( "A resource comprising some text, images and a Flash animation..." )
    )
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "text/html" )
    )
    Statement (
      Property URI ( a4a:hasAdaptation )
      # Note: this would be better as a4a:hasTextualAdaptation (see Notes and issues section below)
      Value URI ( &lt;http://example.org/foo/bar.txt&gt; )
    )
    Statement (
      Property URI ( dcterms:hasPart )
      Value URI ( &lt;http://example.org/foo/bar.swf&gt; )
    )
  )

  Description (
    Resource URI ( &lt;http://example.org/foo/bar.swf&gt; )
    # the Flash animation embedded into the Web page above
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "application/x-shockwave-flash" )
    )
    Statement (
      Property URI ( dcterms:isPartOf )
      Value URI ( &lt;http://example.org/foo/bar.html&gt; )
    )
  )

  Description (
    Resource URI ( &lt;http://example.org/foo/bar.txt&gt; )
    # the plain text adaptation of the Web page above
    Statement (
      Property URI ( dc:format )
      Value URI ( a4aformat:AlternativeText )
      Vocabulary Encoding Scheme URI ( a4a:Format )
      Value String ( "Alternative Text" )
    )
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "text/plain" )
    )
    Statement (
      Property URI ( dc:type )
      Value URI ( a4atype:ReducedText )
      Vocabulary Encoding Scheme URI ( a4a:Type )
      Value String ( "Reduced Text" )
    )
    Statement (
      Property URI ( a4a:accessMode )
      Value URI ( a4aaccessmode:Textual )
      Vocabulary Encoding Scheme URI ( a4a:AccessMode )
      Value String ( "Textual" )
    )
    Statement (
      Property URI ( a4a:role )
      Value URI ( a4arole:ReplacesVisual )
      Vocabulary Encoding Scheme URI ( a4a:Role )
      Value String ( "Replaces Visual" )
      # note problems with this (see Notes and issues section below)
    )
    Statement (
      # this isn't really applicable for this example - included here as example only!
      Property URI ( a4a:flexibility )
      Value URI ( a4aflexibility:VariableFontSize )
      Vocabulary Encoding Scheme URI ( a4a:Flexibility )
      Value String ( "Variable Font Size" )
    )
    Statement (
      # this isn't really applicable for this example - included here as example only!
      Property URI ( a4a:supportTool )
      Value URI ( a4asupporttool:SpellChecker )
      Vocabulary Encoding Scheme URI ( a4a:SupportTool )
      Value String ( "Spell Checker" )
    )
    Statement (
      Property URI ( dc:language )
      Value String ( "en-GB" )
      Syntax Encoding Scheme URI ( dcterms:RFC3066 )
    )
    Statement (
      Property URI ( dcterms:educationLevel )
      Value String ( "elementary" )
    )
    Statement (
      Property URI ( a4a:isAdaptationOf )
      # Note: this would be better as a4a:isTextualAdaptationOf (see Notes and issues section below)
      Value URI ( &lt;http://example.org/foo/bar.html&gt; )
    )
    Statement (
      Property URI ( a4a:hasAdaptation )
      # Note: this would be better as a4a:hasAuditoryReplacement (see Notes and issues section below)
      Value URI ( &lt;http://example.org/foo/bar.mp3&gt; )
    )
  )

  Description (
    Resource URI ( &lt;http://example.org/foo/bar.mp3&gt; )
    # an MP3 audio derivative of the plain text adaptation above
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "audio/mp3" )
    )
    Statement (
      Property URI ( a4a:readingRate )
      Value String ( "40 words/minute" )
    )
    Statement (
      Property URI ( a4a:isAdaptationOf )
      # Note: this would be better as a4a:isAuditoryReplacementFor (see Notes and issues section below)
      Value URI ( &lt;http://example.org/foo/bar.txt&gt; )
    )
    Statement (
      Property URI ( a4a:isAdaptationOf )
      # Note: this would be better as a4a:isAuditoryReplacementFor (see Notes and issues section below)
      Value URI ( &lt;http://example.org/foo/bar.html&gt; )
    )
  )
)
</pre>

### Notes and issues

- There are no alternative formats available in this example, so dcterms:hasFormat and dcterms:isFormatOf are not used.

- The proposed vocabularies for 'role', 'format', 'type', 'flexibility', 'access mode' and 'support tool' are shown here using both a 'value string' and a 'value URI'. They could be provided using only 'value strings' but it is good practice to assign URIs to all vocabulary terms (as per the [<img src="AdaptabilityApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">CORES resolution](http://www.cores-eu.net/interoperability/cores-resolution/cores-resolution.pdf)). Therefore, recommended best practice is to define and use 'value URIs' for all vocabulary terms. There is not widespread agreement (yet) about whether it is good practice to provide both a 'value string' **and** a 'value URI' or whether providing only a 'value URI' is sufficient.

- It is not clear where the semantics of the a4a properties and the various vocabulary terms are defined, so some of the examples shown here may be wrong? The semantics of a4a:supportTool appear to be particularly unclear.

- The proposed a4a:Format and a4a:Type vocabulary terms do **not** appear to conform to the semantics of dc:format and dc:type.

- a4a:readingRate (as used here) is **not** a refinement of either dcterms:educationLevel or dcterms:audience.

- The usage of a4a:role shown here does **not** fit well with the DAM, since it indicates a relationship between the described resource and another resource but doesn't offer a mechanism for identifying the other resource (the text file is only a 'visual replacement' w.r.t. the multimedia Web page - being a 'visual replacement' is not an inherent property of the text). It would therefore be better to model this property as a set of new refinements of dc:relation - e.g. a4a:isTextualAdaptationOf. This argument can also be made about some of the proposed terms within the a4a:Format and a4a:Type vocabularies - e.g. 'Caption' (a piece of text is only a caption w.r.t. something else) and 'Enhanced Text' (ditto).

[LiddyNevileResponses](http://dublincore.org/architecturewiki/LiddyNevileResponses) to the issues raised.

 [RefreshCache](http://dublincore.org/architecturewiki/AdaptabilityApplicationProfile?action=refresh&arena=Page.py&key=AdaptabilityApplicationProfile.text_html) for this page (cached 2012-12-26 14:59:43)  

Immutable page (last edited 2006-02-20 23:37:15 by dhcp5-171)


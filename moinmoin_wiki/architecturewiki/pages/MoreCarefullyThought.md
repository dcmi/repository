---
title: "- MoreCarefullyThought"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/MoreCarefullyThought.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [MoreCarefullyThought](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=fullsearch&value=MoreCarefullyThought&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/MoreCarefullyThought "View")
- [Diffs](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/MoreCarefullyThought">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="MoreCarefullyThought_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="MoreCarefullyThought_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### These comments (from LN) relate directly to the example provided by Andy - my comments and then my version of his example

 Statement ( 
 Property URI ( dc:description ( ) Value String ( "A resource comprising some text, images and a Flash animation..." ) 
 ) 

I think this is interesting but it is not really what we are after from an accessibility perspective. We want to know about the content in terms of sense that are used to perceive it, as we say. So we could live with this description being there, but it is not helpful for adaptability/accessibility. It would be possible to have a description that was useful but it would read differently - see below.

My comment if the same wrt the format property - we are assuming the usual metadata....

 Statement ( 
 Property URI ( a4a:hasAdaptation ) # Note: this would be better as a4a:hasTextualAdaptation (see Notes and issues section below) Value URI ( < [http://example.org/foo/bar.txt>](http://example.org/foo/bar.txt%3E) ) 
 ) 

I cannot find a note below that explains why you have the note here??? If it is to do with the rules about values and URIs etc, that is taken for granted and yes, will be done when there is a posposal for an app rpofile or a controlled vocab etc...

 Description ( 
 Resource URI ( < [http://example.org/foo/bar.swf>](http://example.org/foo/bar.swf%3E) ) # the Flash animation embedded into the Web page above Statement (.... 

Again, this is very interesting but not much use wrt adaptability. It is not the format that we don't know about, but what is of value in terms of content within that format, how it is to be perceived. So this is not an adaptability description of a Flash object ...

 Description ( 
 Resource URI ( < [http://example.org/foo/bar.txt>](http://example.org/foo/bar.txt%3E) ) # the plain text adaptation of the Web page above Statement ( 
 Property URI ( dc:format ) Value URI ( a4aformat: [AlternativeText](http://dublincore.org/architecturewiki/AlternativeText) ) Vocabulary Encoding Scheme URI ( a4a:Format ) Value String ( "Alternative Text" ) ) 

Yet again, this is not useful. We can already state that this is a text format resource and if it is just a different version of the same content we can easily say that already using standard DC terms.

Alternative text is not a useful description for this object as ALT is a well-known item in the Web workld and it is a particular type of encoded description of an imnage. It is not a term that we'd use for a different version of the same rsource. When what we want to say is that the component has or is ALT (alt text in the standard way) we want to say that this is the format of the thing being described and I fail to see why that is not correctly expressed using dc:format. Similarly, when I want to say that this text is symbolic or enhanced text I think that I am saying the same sort of thing as if I were saying one is an essay and one is a precis (as we used to have to do in school English classes)? Reduced text means precised and enhanced text means elaborated and so on ?????

 Statement ( 
 Property URI ( a4a:accessMode ) Value URI ( a4aaccessmode:Textual ) Vocabulary Encoding Scheme URI ( a4a: [AccessMode](http://dublincore.org/architecturewiki/AccessMode) ) Value String ( "Textual" ) ) 

In the same way as we goup DC terms using groupings such as IP, instantiation, etc, I have grouped some terms using the adaptability classes 'accessMode', 'role' and 'flexibility'. As I see it, these can probably all be values for a single element as they are all terms to describe properties of the resource that relate directly to its adaptability but do not fit well in other places. It may be that they need to be broken out so that the list is not long ... but this is something that would be decided when the vocab is determined, I think. For example, I imagined that we might have a single term adaptability and that we might have one, or more, A4A schemes for choosing from vocabs. I believe that is consistent with how DC does things???? The question for me is more how tidy and efficient it will be for the metadata creator.

 Statement ( 
 Property URI ( a4a:role ) Value URI ( a4arole: [ReplacesVisual](http://dublincore.org/architecturewiki/ReplacesVisual) ) Vocabulary Encoding Scheme URI ( a4a:Role ) Value String ( "Replaces Visual" ) # note problems with this (see Notes and issues section below) 
 ) 

OK. So now I see your comments re role etc. I do not agree, as shown above. And I think it is a metter of interpretation whether 'visualReplacement' is stand alone or not. I can buy repair kits for my bike and those are clearly what they are whether you know my bike or not??? This term intends to say that this is not a resource in itself. I think that is a reasonable description of an object??? It is also intended to say it is not a different format of a resource.

 Statement ( 
 Property URI ( a4a:isAdaptationOf ) # Note: this would be better as a4a:isTextualAdaptationOf (see Notes and issues section below) Value URI ( < [http://example.org/foo/bar.html>](http://example.org/foo/bar.html%3E) ) ) Statement ( 
 Property URI ( a4a:hasAdaptation ) # Note: this would be better as a4a:hasAuditoryReplacement (see Notes and issues section below) Value URI ( < [http://example.org/foo/bar.mp3>](http://example.org/foo/bar.mp3%3E) ) ) 
 ) 

OK - so we had many discussions about whether this should be hasReplacement and then another way to describe the type of replacement - in fact, I argued for just what is being propsed here. So there is no real issue here - just a matter fo choice, I think. It is a matter of logic how the components get pulled apart, analysed, replaced or augmented or transformed, and then re-assembled. It can be set up various ways.

 Statement ( 
 Property URI ( a4a:readingRate ) Value String ( "40 words/minute" ) ) 

This is to be used only when the resource is timed and may time out if a person does not read it fast enough. Yes - it is a new, A4A term and would be in that namespace. So it would only appear here as part of an app profile and I think would be OK???? It is NOT intended to qualify either education level or audience but to describe a property of a resource that has timing.

## Liddy's Version of Andy's Example description based on the proposed Adaptability Application Profile

### Introduction

This document provides a simple example 'description set' based on the proposed Adaptability Application Profile that is currently under development within the [<img src="MoreCarefullyThought_files/moin-www.png" alt="[WWW]" height="11" width="11">DC Accessibility Working Group](http://dublincore.org/accessibilitywiki/DiscussionOfFcd).

The example is documented in a syntax-neutral format, based on the constructs available in the [<img src="MoreCarefullyThought_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model (DAM)](http://dublincore.org/documents/abstract-model/).

The 'description set' comprises several descriptions. First, there is a brief description of a multimedia Web page that contains some text, images and a Flash animation. Secondly, there is a brief description of the Flash animation. Thirdly, there is a brief description of a plain-text adaptation of the multimedia Web page. Finally, there is a brief description of an MP3 audio file that is derived from the plain-text adaptation.

None of these descriptions is intended to be complete - their purpose is simply to show the use of the properties, encoding schemes and vocabularies used in the proposed adaptability application profile.

Note that in the following example, the A4A terms have been bundled into one group ie accessmode, role, flexibility, role and supportTool are all values for adaptability and the controlled vocabs for format and type have been so identified, as have the refinements for dc:relation.

### Example
<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt;
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt;
@prefix a4aformat: &lt;http://purl.org/a4a/format-vocab/&gt;
@prefix a4atype: &lt;http://purl.org/a4a/type-vocab/&gt;
@prefix a4arelation: &lt;http://purl.org/a4a/terms/dc-relation-refinements/&gt;
@prefix a4a: &lt;http://purl.org/a4a/terms/&gt;
@prefix a4aadaptability: &lt;http://purl.org/a4a/terms/adaptability/&gt;

Description Set (
  Description (
    Resource URI ( &lt;http://example.org/foo/bar.html&gt; )
    # the multimedia Web page
    Statement (
      Property URI ( dc:description ( )
      Value String ( "A resource in which there is content in textual, visual and auditory modes" )
    )
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "text/html" )
    )
    Statement (
      Property URI ( dc:terms:hasVersion)
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
    Statement (
      Property URI ( a4a:adaptability )
      Value URI ( &lt;"visual", "auditory", "keyboardOnly", "structuredPresentation", "peerInteraction"&gt; )
    )
# five values are written here, for convenience only. They describe properties of the Flash interactive that are relevant to its adaptability.

    Statement (
      Property URI ( a4a:hasPart)
      Value URI ( &lt;http://example.org/foo/captions.html&gt; )
    )
  )

  Description (
    Resource URI ( &lt;http://example.org/foo/bar.txt&gt; )
    # a plain text version of the Web page above
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( a4a:Format )
      Value String ( "talking book" )
    )
    Statement (
      Property URI ( dc:format )
      Vocabulary Encoding Scheme URI ( dcterms:IMT )
      Value String ( "text/plain" )
    )
    Statement (
      Property URI ( dc:type )
      Vocabulary Encoding Scheme URI ( a4a:Type )
      Value String ( "Reduced Text" )
    )
    Statement (
      Property URI ( a4a:adaptability )
      Vocabulary Encoding Scheme URI ( a4a:adaptability)
      Value String ( "Textual" )
    )
    Statement (
      Property URI ( a4a:adaptability)
      Vocabulary Encoding Scheme URI ( a4a:Role )
      Value String ( "Replaces Visual" )
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
      Property URI (dcterms:isVersionOf)
      Value URI ( &lt;http://example.org/foo/bar.html&gt; )
    )
    Statement (
      Property URI ( a4a:hasAdaptation )
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
      Property URI ( dc:type)
      Vocabulary encoding scheme (a4a:type)
      Value String ( "recorded" )
    )
    Statement (
      Property URI ( dc:isVersionOf )
      Value URI ( &lt;http://example.org/foo/bar.txt&gt; )
    )
  )
)
</pre>

 [RefreshCache](http://dublincore.org/architecturewiki/MoreCarefullyThought?action=refresh&arena=Page.py&key=MoreCarefullyThought.text_html) for this page (cached 2012-12-22 10:29:25)  

Immutable page (last edited 2006-02-22 03:04:18 by dhcp5-171)


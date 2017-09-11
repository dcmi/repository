---
title: "- CancoreAccessForAllMetadataGuidelines/representationform"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2frepresentationform.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/representationform](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=fullsearch&value=%2Frepresentationform&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2frepresentationform_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2frepresentationform_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.13.4: representation form

<table bgcolor="#AFAFFF" width="80%">
  <tbody>
    <tr>
      <td>
        <em>Explanation</em>
      </td>
      <td>
        <em>Size</em>
      </td>
      <td>
        <em>Order</em>
      </td>
      <td>
        <em>Value Space</em>
      </td>
      <td>
        <em>Datatype</em>
      </td>
    </tr>
    <tr>
      <td>
        Additional information about the adaptation type </td>
      <td>
        0...*</td>
      <td>
        unspecified</td>
      <td>
        enhances, verbatin, real-time, transcipt, alternative text, long 
        description, talking book, Daisy, image-based, symbolic, recorded, 
        sythesized, braille, haptic</td>
      <td>
        Vocabulary</td>
    </tr>
  </tbody>
</table>


#### Technical Implementation Notes

#### Vocabulary Recommendations
Choose from the following vocabulary entries:  

- verbatim - the alternative resource is a verbatim caption of audio in the referenced resource

- reduced - the described resource is a reduced reading level caption of the audio in the referenced resource.

- enhanced - the described resource is an enhanced caption of audio in the referenced resource; enhanced captions may contain or include images, graphics, links to external resources, etc. that helps communicate the content of the audio in greater detail

- real-time - the described resource is real-time audio, video, etc.

- transcript - the described resource is a verbatim textual representation of the speech in the referenced resource

- alternative text - the described resource is a short text description of an image, specifically ALT text

- long description - the described resource is a long textual description of an image, specifically LONGDESC

- talking book - the described resource is a recording of the contents of a book read aloud

- Daisy - the described resource is an electronic book that conforms to the Daisy specification (www.daisy.org)

- image-based - the described resource is an image-based representation of the intellectual content of the referenced resource, for example, graphs, pictures, photographs, etc.

- symbolic - the described resource is a symbolic representation of the intellectual content of the referenced resource, for example, musical notation, Bliss, etc.

- recorded - the described resource is recorded audio

- synthesized - the described resource is synthesized audio

- braille - the described resource is braille

- haptic - the described resource is tactile content that requires a sense of touch

#### Text Example
symbolic  
 verbatim 
#### XML Example
<accmd:representationform>symbolic</accmd:representationform>  
 <accmd:representationform>verbatim</accmd:representationform> 
#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2frepresentationform_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2Frepresentationform) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform) Please only edit things below this line 
* * *

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2frepresentationform?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2frepresentationform.text_html) for this page (cached 2012-12-25 22:14:10)  

Immutable page (last edited 2006-02-14 22:29:13 by ToniRoberts)


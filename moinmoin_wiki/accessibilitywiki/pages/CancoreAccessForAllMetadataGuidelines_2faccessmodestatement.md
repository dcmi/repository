---
title: "- CancoreAccessForAllMetadataGuidelines/accessmodestatement"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/accessmodestatement](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=fullsearch&value=%2Faccessmodestatement&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.1: Access Mode Statement

<table bgcolor="#AFAFFF" width="50%">
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
        A containter for a collection of information stating a resource's primary access mode and that mode's usage in the resource</td>
      <td>
        0...*</td>
      <td>
        Unspecified</td>
      <td>
        -</td>
      <td>
        -</td>
    </tr>
  </tbody>
</table>


#### Technical Implementations Notes
The subelements for this element are 1.1.1 original access mode and 1.1.2 access mode usage. 

The access mode statement describes the human sense, perceptual system, or cognitive faculty through which a user may process or perceive the content of a resource, that is, what human cognition or sense is required to access the resource. It also declares whether the mode's character is _informative_ vs. _ornamental_.

The access mode of a resource is not the same as the format of a resource. The format of a resource can be represented as a MIME type but its access mode will depend upon a combination of its format and its genre: an image of a poem in a tapestry will have a visual format but a text genre. A user viewing the image on a screen can read the text of the poem but a screen reader (an assistive technology) cannot access the text as it is locked in the image. The important information, from the viewpoint of a user with specific access needs and preferences, is which sensory modes are required to access the content of the resource.

The possibilities are based on the human computer interface modes of sight, sound, and touch, with an additional special mode, 'textual' to include text literacy. Text literacy is not the same as literacy in everyday parlance. In this context, text literacy may mean accessing the content of text by listening to an aural rendition of the text or viewing a transformation of it into symbolic or sign language, or feeling it as Braille. If an access mode is not suitable for a user, (including after any possible transformations), the content in that access mode should be adapted by an alternative.

As many resources contain multiple files (i.e., aggregate resources), adding the necessary metadata in order to deliver accessible resources may involve a dis-aggregation of the composite resource into a set of components. Once such components can be associated with their own access modes (as opposed to being represented in the aggregation of modes of the original resource), they can be individually matched to a statement of personal needs and preferences with access mode requirements. Matching individual components to personal needs and preferences ensures that a resource that is re-aggregated will also match the personal needs and preferences.

#### Vocabulary Recommendations

#### Text Example

auditory  
 informative

#### XML Example
<pre>&lt;accmd:accessmodestatement&gt;
  &lt;accmd:originalaccessmode&gt;auditory&lt;/accmd:originalaccessmode&gt;
  &lt;accmd:accessmodeusage&gt;informative&lt;/accmd:accessmodeusage&gt;
&lt;/accmd:accessmodestatement&gt;</pre>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2Faccessmodestatement) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement) Please only edit things below this line 
* * *

I am sure we should include olfactory in this list

Liddy

* * *

By all means, if the intellectual content can be conveyed via smell -- now there's a debate (that I don't want to get into). If so, then we should also include _taste_.

Nonetheless, these values do not belong here in the <tt>acccess mode statement</tt> element since it is merely a container. They belong one level down as a value of <tt>original acccess mode</tt>.

Finally, what's a "PNP"?

Joseph

* * *

Good catch, Joseph. PNP refers to the other part of the ISO standard, the Personal Needs and Preferences. The [CanCore](http://dublincore.org/accessibilitywiki/CanCore) guidelines should probably not use this acronym, but rather a more generic description of a statement of user needs and preferences.

Anastasia

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessmodestatement?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2faccessmodestatement.text_html) for this page (cached 2012-12-23 20:44:41)  

Immutable page (last edited 2006-02-21 22:19:39 by ToniRoberts)


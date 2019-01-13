---
title: "- CancoreAccessForAllMetadataGuidelines/alternative"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2falternative.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/alternative](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=fullsearch&value=%2Falternative&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2falternative_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2falternative_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.9: alternative

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
        A container that identifies a resource (hereafter the <em>described</em> resource) as an alternative to another <em>referenced</em>
        resource. The described resource presents all or some of the same 
        intellectual content as the referenced resource. The sub-elements are 
        used to identify the resource that the described resource is an 
        alternative to, and the extent to which it functions as a replacement 
        for the described resource.</td>
      <td>
        0..1</td>
      <td>
        Unspecified</td>
      <td>
        -</td>
      <td>
        -</td>
    </tr>
  </tbody>
</table>


#### Technical Implementation Notes
Subelements for alternative are as follows: 
- 1.9.1 is alternative to

- 1.9.2 covereage

If this element is absent, the described resource is not known to be an alternative to any other resource.

A resource is the alternative of at most one other resource.

#### Vocabulary Recommendations
None. 

#### Text Example

The following shows two cases. The first alternative is an example where the described resource is a captioned digital video, and can be used as a complete replacement of the same video that has no captions. The second alternative is a case where the described resource consists only of captions. It must describe itself as but a partial replacement for the full (uncaptioned) video.

Case where the described resource is a captioned version of a Mcluhan video:

is alternative to: [http://www.somewhere.org/mcluhan.mov](http://www.somewhere.org/mcluhan.mov) coverage: all

Case where resource is captions only, but for the Mcluhan video:

is alternative to: [http://www.somewhere.org/mcluhan.mov](http://www.somewhere.org/mcluhan.mov) coverage: part

#### XML Example
The following markup lists two cases. The first alternative is an example where the described resource is a captioned digital video, and can be used as a complete replacement of the same video that has no captions. The second alternative is a case where the described resource consists only of captions. It must describe itself as but a partial replacement for the full (uncaptioned) video. <pre>&lt;!-- Here is an IEEE-LOM example describing a captioned version of Mcluhan video --&gt; 
&lt;accmd:alternative&gt;
  &lt;accmd:isAlternativeTo&gt;
    &lt;LOM:identifier&gt;
      &lt;LOM:catalog&gt;URI&lt;/catalog&gt;
      &lt;LOM:entry&gt;http://www.somewhere.org/mcluhan.mov"&lt;/entry&gt;
    &lt;/identifier&gt;
  &lt;accmd:coverage&gt;all&lt;/coverage&gt;
&lt;/accmd:alternative&gt;

&lt;!-- Here is an IEEE-LOM example describing a resource captions only, but for the Mcluhan video --&gt;
&lt;accmd:alternative&gt;
  &lt;accmd:isAlternativeTo&gt;
    &lt;LOM:identifier&gt;
      &lt;LOM:catalog&gt;URI&lt;/catalog&gt;
      &lt;LOM:entry&gt;http://www.somewhere.org/mcluhan.mov&lt;/entry&gt;
    &lt;/identifier&gt;
  &lt;accmd:coverage&gt;part&lt;/coverage&gt;
&lt;/accmd:alternative&gt;</pre>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2falternative_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2Falternative) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative) Please only edit things below this line 
* * *
 In the Tech. notes listing the sub-elements, I think the sub-elements of <tt>is alternative to</tt> (i.e. <tt>identifier</tt>, <tt>catalog</tt> and <tt>entry</tt>) should **not** be included. They are not technically sub-elements, as <tt>is alternative to</tt> is described as a character string, with recommendation to use the Repertoire of ISO/IEC 10646-1:2000 for the vocab. (Anastasia Cheetham, ATRC) 

I don't know if this addresses your concern, but when I suggested we use the LOM Identifier structure, I was guided by the published [CanCore](http://dublincore.org/accessibilitywiki/CanCore) guidelines. For example, go to [http://www.cancore.ca/guidelines/CanCore\_Guidelines\_General\_2.0.pdf](http://www.cancore.ca/guidelines/CanCore_Guidelines_General_2.0.pdf), and scroll down to 1-5 where Identifier is documented. Identfier's value space and data type are unspecified, but both of Identifier's sub-elements, Catalog and Entry, have value space 'ISO/IEC 10646-1:2000', and data type 'character string'. I assumed that we are writing [CanCore](http://dublincore.org/accessibilitywiki/CanCore) guidelines for accessibility metadata; hence, I thought we should be consistent with its existing guidelines. Even so, there is an error in defining the value space and data type of <tt>is alternative to</tt> as ISO/IEC 10646-1:2000', and 'character string', since these are for the Identfier sub-elements, not for the <tt>is alternative to</tt> (nor <tt>alternative</tt>) containers. I suspect other elements we have been working on that use Identifier are also putting the 'ISO/IEC 10646-1:2000' value space, and 'character string' at the wrong level.

(Joseph Scheuhammer, ATRC)

* * *

NOTE: the term 'alternative' is due to be changed to 'adaptation'.

This element is used to identify resources for which this resource or component is an adaptation.

Note: Typically, a resource may have any number of adaptations. They should be identified separately and described separately as they may need to be used separately to adapt or augment a resource.

Liddy

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2falternative.text_html) for this page (cached 2012-12-21 20:49:13)  

Immutable page (last edited 2006-02-09 11:01:50 by axelrod)


---
title: "- CancoreAccessForAllMetadataGuidelines/accessibility"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2faccessibility.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/accessibility](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=fullsearch&value=%2Faccessibility&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

There are spacing issues with this page. View in Edit mode please! 
### 1. accessibility

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
        Root element that groups the accessibility information about the resource.</td>
      <td>
        1</td>
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
A container for the accessibility information as a whole. 

The sub-elements in this category are:

1.1 access mode statement

 1.1.1 original access mode 1.1.2 access mode usage 

1.2 control flexibility 1.3 has control flexibility 1.4 display transformability 1.5 has display transformability 1.6 hazard 1.7 has alternative 1.8 has component 1.9 alternative

 1.9.1 is alternative to 1.9.2 coverage 

1.10 is display transformability of 1.11 is control flexibility of 1.12 is component of 1.13 adaptation statement

 1.13.1 adaptation type 1.13.2 original access mode 1.13.3 coverage 1.13.4 representation form 1.13.5 language 1.13.6 reading rate 1.13.7 education level 

1.14 support tool

#### Text Example
Accessforall: 
 Accessmodestatement: 
 Originalaccessmode: 

auditory

 Accessmodeusage 

informative

 Controlflexibility 

full keyboard control

 Hascontrolflexibility 
 LOM identifier: 
 LOM catalog: URI LOM enrty: [http://www.hascontrolflexibilitystatement.com](http://www.hascontrolflexibilitystatement.com/) Displaytransformability 

font size

 Hasdisplaytransformability: 
 LOM identifier: 
 LOM catalog: URI LOM enrty: [http://www.hasdisplaytransformability.com](http://www.hasdisplaytransformability.com/) Hazard: 

flashing

 Hasalternative: 
 LOM: identifier 
 LOM catalog: URI LOM entry: [http://www.somewhere.org/captions\_en/mcluhan.mov](http://www.somewhere.org/captions_en/mcluhan.mov)
 Hascomponent: 
 LOM identifier: 
 LOM catalog: URI LOM entry :<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/dog.html" alt="http://www.somewhere.org/dog.jpg"> Alternative: 
 Isalternativeto: LOM: Identifier 
 LOM catalog: URI LOM entry: [http://www.somewhere.org/mcluhan.mov](http://www.somewhere.org/mcluhan.mov) Coverage: 

all

 Isdisplaytransformabilityof: 
 LOM: Identifier 
 LOM catalog: URI LOM entry: [http://www.url.to.resource.being.described.com](http://www.url.to.resource.being.described.com/) Iscontrolfexibilityof: 
 LOM: Identifier 
 LOM catalog: URI LOM entry: [http://www.url.to.resource.being.described.com](http://www.url.to.resource.being.described.com/) Iscomponentof: 
 LOM: Identifier 
 LOM catalog: URI LOM entry: [http://www.url.to.compound.resource.com](http://www.url.to.compound.resource.com/) Adaptationstatement: 
 Adaptationtype: 

audio representation

 Originalaccessmode: 

auditory

 Coverage: 

part

 Representationform: 

verbatim

 Language: 

eng-CA

 Readingrate: 

60

 Education level: 

undergraduate university

 Supporttool: 

spell checker

#### XML Example:

<accmd:accessforall>

 <accmd:accessmodestatement> 
 <accmd:originalaccessmode>auditory</originalaccessmode> <accmd:accessmodeusage>informative</accessmodeusage> </accmd:accessmodestatement> <accmd:controlflexibility>full keyboard control</controlflexibility> 

<accmd:hascontrolflexibility>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.hascontrolflexibilitystatement.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hascontrolflexibility>

 <accmd:displaytransformability>font size</displaytransformability> <accmd:hasdisplaytransformability> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.hasdisplaytransformability.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:hasdisplaytransformability>

 <accmd:hazard>flashing</hazard> <accmd:hasalternative> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/captions\_en/mcluhan.mov</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> </accmd:hasalternative> <accmd:hascomponent> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/dog.jpg"</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> </accmd:hascomponent> <accmd:alternative> 
 <accmd:isAlternativeTo> 
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.somewhere.org/mcluhan.mov"</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> <accmd:coverage>all</coverage> </accmd:alternative> 

<accmd:isdisplaytransformabilityof>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.url.to.resource.being.described.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:isdisplaytransformabilityof> <accmd:iscontrolfexibilityof>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.url.to.resource.being.described.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:iscontrolfexibilityof> <accmd:iscomponentof>

 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">identifier>](http://dublincore.org/accessibilitywiki/InterWiki "LOM")
 < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">catalog>URI</catalog>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") < [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-inter.png" alt="[LOM]" height="16" width="16">entry>http://www.url.to.resource.being.described.com</entry>](http://dublincore.org/accessibilitywiki/InterWiki "LOM") </identifier> 

</accmd:iscomponentof>

 <accmd:adaptationstatement> 
 <accmd:adaptationtype>audio representation</accmd:adaptationtype> <accmd:originalaccessmode>auditory</accmd:originalaccessmode> <accmd:coverage>part</accmd:coverage> <accmd:representationform>verbatim</accmd:representationform> <accmd:language>eng-CA</accmd:language> <accmd:readingrate>60</accmd:readingrate> <accmd:education level>undergraduate university</accmd:education level> </accmd:adaptationstatement> <accmd:supporttool>spell checker</accmd:supporttool> 

</accmd:accessforall>

#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2Faccessibility) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility) Please only edit things below this line 
* * *

why do we have the complicated URIs in our examples? surely we just want a straight URI of the kind [http://](http:///).....?

Liddy

* * *

Because you don't want to exclude ISBN, ISSN, DOI, etc. Strictly speaking those are not URIs. We want to be inclusive here and say that any standard way of referencing resources can be used. The LOM does this nicely by using a structure that allows one to explicitly state the referencing technique (_catalog_), and then the actual encoding of the identifier (_entry_). Dublin Core provides another standard way of accomplishing this, but I don't know the details.

However, this does raise an issue of how to reflect this in our examples. Maybe we should create a generic <tt>&lt;resourceReference&gt;</tt> element that indicates that lom.identifier, dc.identifier, etc. can be used here to reference a resource.

Joseph

* * *

A thought about the complete example of the <tt>accessibility</tt> element. The [<img src="CancoreAccessForAllMetadataGuidelines_2faccessibility_files/moin-www.png" alt="[WWW]" height="11" width="11">CanCore](http://www.cancore.ca/en/guidelines.html) LOM guidelines do _not_ actually list an example for the root element (<tt>lom</tt>). Instead, it provides a "chapter" for each of the major categories (General, Lifecyle, Technical, etc.).

There is wisdom in this since a full example can be quite lengthy and one can get lost in its complexity. Perhaps a similar approach could be used here in that the documentation of <tt>accessiblity</tt> simply state that it is a container of the other elements, and then list them to show a skeletal structure. The reader can then go to each of them for the details on that element.

Joseph

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2faccessibility?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2faccessibility.text_html) for this page (cached 2012-12-21 20:47:24)  

Immutable page (last edited 2006-02-09 11:05:01 by axelrod)


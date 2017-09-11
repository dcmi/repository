---
title: "- CancoreAccessForAllMetadataGuidelines/language"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/CancoreAccessForAllMetadataGuidelines_2flanguage.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [CancoreAccessForAllMetadataGuidelines/language](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=fullsearch&value=%2Flanguage&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Up](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines "Up")
- [Edit](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage "View")
- [Diffs](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2flanguage_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="CancoreAccessForAllMetadataGuidelines_2flanguage_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### 1.13.5: language

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
        Human language of the intellectual content of the resource.</td>
      <td>
        0...*</td>
      <td>
        unspecified</td>
      <td>
        LanguageID = Langcode ("-"Subcode) with Langcode a language code as 
        defined by the code set ISO 639:1988 and Subcode (which can occur an 
        arbitrary number of times) a country code from the code set ISO 
        3166-1:1997.</td>
      <td>
        Character-String</td>
    </tr>
  </tbody>
</table>


#### Technical Implementation Notes
Indicate all human languages use in the resource using the appropriate language code(s). If the resource is multilingual, list all languages that apply in any convenient order.  
 • Both two-letter language codes (ISO 639-1) and three-letter language codes (ISO 639-2) can be used for this element.  

 o Two-letter language codes are widely used in XML and LOM communities, and should be acceptable for implementations in many jurisdictions and for the description of materials in common languages.  
 o Some policies and official practices in Canada, the US, and elsewhere require three-letter language codes to be used to be able to accommodate indigenous and other languages. 

• Implementations using either predominantly one or the other of these language code sets in record creation should be able to accommodate both types.  
 • For listings of two- and three-letter language codes, see the Library of Congress (LOC, the official ISO 639-2 Registration Authority) at [http://lcweb.loc.gov/standards/iso639-2/langcodes.html](http://lcweb.loc.gov/standards/iso639-2/langcodes.html).   
 • Use the optional country code (ISO 3166) only if it provides information necessary to your community of users. Indication of country code is generally desirable, but not always practical. Identifying variations in written or spoken language use can be challenging. Further identifying regional variations (e.g., cockney English, Philadelphia English) may sometimes be desirable, but may introduce even further challenges.

#### Vocabulary Recommendations

#### Text Example
• eng-CA (English as used in Canada)  
 • fra-CA (French as used in Canada)  
 • iku (Inuktitut) 
#### XML Example
<accmd:language>eng-CA</accmd:language>  
 <accmd:language>fra-CA</accmd:language>  
 <accmd:language>iku</accmd:language> 
#### Discuss This Page
Add your comments below by following the link [Discuss This Page](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage_2fDiscuss) then editing and saving the page. Please identify yourself by adding your full name at the end of your comments in parenthesis and optionally, affiliation. Please do not edit comments from other participants. 

**Discussion so far:**

## [<img src="CancoreAccessForAllMetadataGuidelines_2flanguage_files/moin-edit.png" alt="Edit" align="right" height="12" width="12">](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage_2fDiscuss?action=edit&backto=CancoreAccessForAllMetadataGuidelines%2Flanguage) [](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage_2fDiscuss)

You can return to the main page after saving edits [by clicking here](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage) Please only edit things below this line 
* * *

Quick question: do the ISO and other language standards referenced include language values for sign language? Is that even required here? (Joseph Scheuhammer, ATRC)

 [RefreshCache](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2flanguage?action=refresh&arena=Page.py&key=CancoreAccessForAllMetadataGuidelines_2flanguage.text_html) for this page (cached 2012-12-26 14:43:03)  

Immutable page (last edited 2006-02-09 11:52:25 by axelrod)


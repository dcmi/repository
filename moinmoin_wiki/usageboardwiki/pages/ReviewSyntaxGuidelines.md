---
title: "- ReviewSyntaxGuidelines"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/ReviewSyntaxGuidelines.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ReviewSyntaxGuidelines](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=fullsearch&value=ReviewSyntaxGuidelines&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines "View")
- [Diffs](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/ReviewSyntaxGuidelines">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ReviewSyntaxGuidelines_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ReviewSyntaxGuidelines_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## SWAP review : syntax guidelines

Author: [TomBaker](http://dublincore.org/usageboardwiki/TomBaker), [StefanieRuehle](http://dublincore.org/usageboardwiki/StefanieRuehle)

This review: [http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines)

<table>
  <tbody>
    <tr>
      <td>
        DC-TEXT </td>
      <td>
        EPDCX </td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/usageboardwiki/DescriptionSet">DescriptionSet</a> </td>
      <td>
        epdcx:descriptionSet</td>
    </tr>
    <tr>
      <td>
        Description </td>
      <td>
        epdcx:description</td>
    </tr>
    <tr>
      <td>
        Statement </td>
      <td>
        epdcx:statement</td>
    </tr>
    <tr>
      <td>
        PropertyURI </td>
      <td>
        epdcx:propertyURI (attribute)</td>
    </tr>
    <tr>
      <td>
        VocabularyEncodingSchemeURI </td>
      <td>
        epdcx:vesURI (attribute)</td>
    </tr>
    <tr>
      <td>
        ValueURI </td>
      <td>
        epdcx:valueURI (attribute)</td>
    </tr>
    <tr>
      <td>
        ResourceURI </td>
      <td>
        epdcx:resourceURI (attribute)</td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/usageboardwiki/ResourceId">ResourceId</a> </td>
      <td>
        epdcx:resourceId</td>
    </tr>
    <tr>
      <td>
        ResourceURI </td>
      <td>
        epdcx:resourceURI</td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/usageboardwiki/ValueId">ValueId</a> </td>
      <td>
        epdcx:valueRef</td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/usageboardwiki/ValueString">ValueString</a> </td>
      <td>
        epdcx:valueString</td>
    </tr>
    <tr>
      <td>
        Language </td>
      <td>
        xml:lang (attribute)</td>
    </tr>
    <tr>
      <td>
        SyntaxEncodingSchemeURI </td>
      <td>
        epdcx:sesURI (attribute)</td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/usageboardwiki/LiteralValueString">LiteralValueString</a> </td>
      <td>
        see note below</td>
    </tr>
  </tbody>
</table>


Issues (to be elaborated):

- "Literal Value String" (sic) is used in [SWAP] (camelcase " [LiteralValueString](http://dublincore.org/usageboardwiki/LiteralValueString)", as in DC-TEXT, is probably intended) but not supported in EPDCX

- Supports deprecated DCAM notion of "rich representation" with epdcx:XMLRepresentation and epdcx:binaryRepresentation

Sources:

- EPRINTS-SYNTAX [http://www.ukoln.ac.uk/repositories/digirep/index/Eprints\_DC\_XML](http://www.ukoln.ac.uk/repositories/digirep/index/Eprints_DC_XML)

- CRITERIA [http://colab.mpdl.mpg.de/mediawiki/ApplicationProfiles/ProfileReviewCriteriaDe](http://colab.mpdl.mpg.de/mediawiki/ApplicationProfiles/ProfileReviewCriteriaDe)

- DC-TEXT [http://dublincore.org/documents/dc-text/](http://dublincore.org/documents/dc-text/)

- SWAP [http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly\_Works\_Application\_Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly_Works_Application_Profile)

- EPRINTS [http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile](http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile)

 [RefreshCache](http://dublincore.org/usageboardwiki/ReviewSyntaxGuidelines?action=refresh&arena=Page.py&key=ReviewSyntaxGuidelines.text_html) for this page (cached 2012-11-08 00:06:51)  

Immutable page (last edited 2008-08-06 10:07:53 by TomBaker)


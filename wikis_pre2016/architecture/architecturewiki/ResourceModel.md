---
title: "- ResourceModel"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/ResourceModel.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ResourceModel](http://dublincore.org/architecturewiki/ResourceModel?action=fullsearch&value=ResourceModel&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/ResourceModel?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/ResourceModel "View")
- [Diffs](http://dublincore.org/architecturewiki/ResourceModel?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/ResourceModel?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/ResourceModel?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/ResourceModel?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/ResourceModel?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/ResourceModel?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/ResourceModel?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/ResourceModel?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/ResourceModel?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/ResourceModel?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/ResourceModel?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/ResourceModel">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ResourceModel_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ResourceModel_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### DCMI resource model

The abstract model of the _resources_ described by _descriptions_ is as follows:

Section 2, abstract model of the resources described by descriptions:

- Each _described resource_ may have one or more _property/value pairs_.

- Each _property/value pair_ is made up of one _property_ and one _value_.

- Each _value_ is a _resource_ (the physical or conceptual entity that is associated with a _property_ when it is used to describe a _resource_).

- _Note that a "property" is also a "resource"._

<a id="Figure1"></a>

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="ResourceModel_files/ResourceModel.jpg" alt="resource-model-old.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 1 - the DCMI resource model (Dec 2006)</strong>
      </td>
    </tr>
  </tbody>
</table>


<a id="Figure2"></a>

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="ResourceModel_files/ResourceModel_003.jpg" alt="resource-model2.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 2 - Same message as Fig.1 except HAS-0..N replaced by DESCRIBED-USING</strong>
      </td>
    </tr>
  </tbody>
</table>


<a id="Figure3"></a>

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="ResourceModel_files/ResourceModel_004.jpg" alt="resource-model.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 3 - Same as Fig.2 except Property is now also a Resource - used in current draft</strong>
      </td>
    </tr>
  </tbody>
</table>


<a id="Figure4"></a>

<table width="100%">
  <tbody>
    <tr>
      <td align="center">
        <img src="ResourceModel_files/ResourceModel_002.jpg" alt="resource-model-new.jpg">
      </td>
    </tr>
    <tr>
      <td align="center">
        <strong>Figure 4 - Exactly the same as Fig.1 except HAS-0..N replaced by DESCRIBED-USING</strong>
      </td>
    </tr>
  </tbody>
</table>


Terminology

_property_ ( [http://www.w3.org/1999/02/22-rdf-syntax-ns#Property](http://www.w3.org/1999/02/22-rdf-syntax-ns#Property))

 A specific aspect, characteristic, attribute, or relation used to describe _resources_. _Note that a "property" is also a "resource"._

 [RefreshCache](http://dublincore.org/architecturewiki/ResourceModel?action=refresh&arena=Page.py&key=ResourceModel.text_html) for this page (cached 2012-12-22 19:09:41)  

Immutable page (last edited 2007-01-29 11:42:44 by TomBaker)


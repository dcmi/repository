---
title: "- KernelApplicationProfileDraft01"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/pages/KernelApplicationProfileDraft01.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [KernelApplicationProfileDraft01](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=fullsearch&value=KernelApplicationProfileDraft01&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/kernelwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/kernelwiki/FrontPage)
- [RecentChanges](http://dublincore.org/kernelwiki/RecentChanges)
- [FindPage](http://dublincore.org/kernelwiki/FindPage)
- [HelpContents](http://dublincore.org/kernelwiki/HelpContents)

Page

- [Edit](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=edit "Edit")
- [View](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01 "View")
- [Diffs](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=diff "Diffs")
- [Info](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=info "Info")
- [Subscribe](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=raw "Raw")
- [Print](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=AttachFile)
- [DSP2XML](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=DSP2XML)
- [DeletePage](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=DeletePage)
- [LikePages](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=LikePages)
- [LocalSiteMap](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=SpellCheck)

Search

<form method="POST" action="/kernelwiki/KernelApplicationProfileDraft01">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="KernelApplicationProfileDraft01_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="KernelApplicationProfileDraft01_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DRAFT 2 -- The DC Kernel Application Profile -- 2007.08.07

This document defines the DC Kernel Application Profile (KAP), specifying its elements and requirements. The DC KAP is designed for providers that need to support the orderly management of their information objects, and wish to do so with minimal overhead in reading and processing metadata descriptions.

The document begins by listing kernel metadata requirements in more detail and correlating them with specific characteristics as found in the kernel metadata specification [KSpec]. It then compares the core DC semantics and DCMI Abstract Model [AModel] with kernel metadata elements and the Electronic Resource Citation (ERC) record structure for holding kernel resource descriptions.

#### Requirements

The overall goal of low-overhead, orderly management includes the needs to reliably identify problem objects during troubleshooting, and to query collections to produce ordered object subsets for the purpose of collection surveying. Organizations that perform orderly management should also be able to report externally on their support commitments and policies. The KAP frames these needs in the context of the following more specific requirments.

**Reduction**

Beginning with the 15 basic DC elements, the DC Kernel Specification [KSpec] distills out a smaller subset of elements to produce a concise description for troubleshooting that can be grasped in a glance. The kernel borrows from the journalistic tradition that "boils down" the essence of a story into the "who, what when, where" of an expression of an information resource.

**Economy of Expression**

To minimize the visual bandwidth in that glance, a simple eye- and machine-readable ERC format is specified that has both a normal and extra concise format (allowing suppression of labels by relying on positional elements). Multi-valued dates and ranges are also allowed so as to avoid having to rely on additional date elements, especially those indicating starts and ends of open-ended ranges.

**Predictability**

To meet the need for determinism during troubleshooting, the above four elements are required. Some flexibility in that requirement is permitted if the value for the given label is one of nine well-known values for "empty":

<tt>:unkn, :unav, :unac, :unap, :unas, :none, :null, :unal, :tba</tt>

**Sort-Friendliness**

To be useful in orderly management, element values are encouraged to be entered in such a way that adjacent records in a collection survey can be meaningfully ordered by simple lexical sort on that element. The "sort-friendly" feature is not a requirement, i.e., providers can opt out if the expense is prohibitive.

**Economy of Interpretation**

To minimize burden of metadata interpretation by collection manager scripts, the ERC format is based on email headers [ANVL] and may be parsed in two lines of Perl (eg, without a DOM parser as required for XML).

#### Mapping from Kernel to Dublin Core Elements

Kernel elements are mapped to the 15 Dublin Core elements according to the "story" type.

<pre> erc: the story of the expression of a resource
    who from DC Creator, Contributor, or Publisher
    what from DC Title
    when from DC Date
    where from DC Identifier

 about-erc: the story of a resource's content
    about-who (not mapped from DC)
    about-what from DC Subject
    about-when from DC Coverage (temporal)
    about-where from DC Coverage (spatial)

 meta-erc: the story of the origin of the metadata record itself
    meta-who (not mapped from DC)
    meta-what (not mapped from DC)
    meta-when (not mapped from DC)
    meta-where (not mapped from DC)

 support-erc: the story of a support commitment made to an object
    support-who (not mapped from DC)
    support-what (not mapped from DC)
    support-when (not mapped from DC)
    support-where (not mapped from DC)
</pre>

#### The Abstract Model and DC Kernel Metadata Resource Descriptions

The following aspects of the DCMI abstract model are supported by the KAP:

- properties

- property URIs (base URL plus element name)

- value strings

- description sets

The KAP does not support the following aspects of the DCMI abstract model:

- value string languages

- encoding schemes

- encoding scheme URIs

- resource classes

- rich representations

- related descriptions

- property/sub-property relationships

URIs are not explicitly supported in the KAP, but may be implicit for:

- value URIs

- resource URIs

- resource class URIs

Each property may be repeated.

#### References

<table>
  <tbody>
    <tr>
      <td>
        [Spec] </td>
      <td>
        <a href="http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelSpec00.html">http://dublincore.org/kernelwiki/FrontPage?action=AttachFile&amp;do=get&amp;target=KernelSpec00.html</a>
      </td>
    </tr>
    <tr>
      <td>
        [Model] </td>
      <td>
        <a href="http://www.dublincore.org/documents/abstract-model/">http://www.dublincore.org/documents/abstract-model/</a>
      </td>
    </tr>
    <tr>
      <td>
        [ANVL] </td>
      <td>
        <a href="http://www.cdlib.org/inside/diglib/ark/anvlspec.pdf">http://www.cdlib.org/inside/diglib/ark/anvlspec.pdf</a>
      </td>
    </tr>
  </tbody>
</table>


 [RefreshCache](http://dublincore.org/kernelwiki/KernelApplicationProfileDraft01?action=refresh&arena=Page.py&key=KernelApplicationProfileDraft01.text_html) for this page (cached 2012-10-07 18:23:55)  

Immutable page (last edited 2007-08-07 22:28:12 by JohnKunze)


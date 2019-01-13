---
title: "- LinkingDCDescriptionsToODRLExpressions"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/LinkingDCDescriptionsToODRLExpressions.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [LinkingDCDescriptionsToODRLExpressions](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=fullsearch&value=LinkingDCDescriptionsToODRLExpressions&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions "View")
- [Diffs](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/LinkingDCDescriptionsToODRLExpressions">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="LinkingDCDescriptionsToODRLExpressions_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="LinkingDCDescriptionsToODRLExpressions_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Embedding licence URIs in Dublin Core descriptions

Andy Powell, Eduserv Foundation

February 2006

### Introduction

This document describes a mechanism for embedding licence URIs in [<img src="LinkingDCDescriptionsToODRLExpressions_files/moin-www.png" alt="[WWW]" height="11" width="11">Dublin Core (DC)](http://dublincore.org/) metadata descriptions. A licence URI is the URI for a licence under which a resource is made available. Such a URI uniquely identifies the licence.

It may or may not be possible to dereference (resolve) the licence URI. If it is, then a number of representations of the licence may be made available including human-readable texts that describe the features of the licence and machine-readable documents, encoded using DRM expression languages such as the [<img src="LinkingDCDescriptionsToODRLExpressions_files/moin-www.png" alt="[WWW]" height="11" width="11">Open Digital Rights Language (ODRL)](http://odrl.net/).

This document starts with a summary of the rights-related capabilities of DC metadata and then presents some potential use cases that show how the embedding licence URIs in DC descriptions may benefit the end-user.

Finally, it describes the embedding mechanism, using the constructs available in the [<img src="LinkingDCDescriptionsToODRLExpressions_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/abstract-model/).

### Summary of DCMI

DCMI provides a growing set of metadata terms (properties, encoding schemes and controlled vocabularies) and three encoding syntaxes (XHTML, XML and RDF) that allow those terms to be used in a wide variety of resource discovery applications. These are underpinned by the DCMI Abstract Model, which provides a description of the contructs that are used to make up DC metadata descriptions.

A number of DCMIs properties are applicable in the context of encoding rights-related information. These are summarised here:

<table>
  <tbody>
    <tr>
      <td colspan="2">
        <strong>Contributor</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/contributor">http://purl.org/dc/elements/1.1/contributor</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Contributor</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        An entity responsible for making contributions to the content of the resource.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Examples of a Contributor include a person, an organisation, or a 
        service. Typically, the name of a Contributor should be used to indicate
        the entity.</td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Creator</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Creator</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        An entity primarily responsible for making the content of the resource.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Examples of a Creator include a person, an organisation, or a service. 
        Typically, the name of a Creator should be used to indicate the entity.</td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Publisher</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Publisher</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        An entity responsible for making the resource available</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Examples of a Publisher include a person, an organisation, or a service.
        Typically, the name of a Publisher should be used to indicate the 
        entity.</td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Rights</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Rights Management</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        Information about rights held in and over the resource.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Typically, a Rights element will contain a rights management statement 
        for the resource, or reference a service providing such information. 
        Rights information often encompasses Intellectual Property Rights (IPR),
        Copyright, and various Property Rights. If the Rights element is 
        absent, no assumptions can be made about the status of these and other 
        rights with respect to the resource.</td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Access Rights</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/terms/accessRights">http://purl.org/dc/terms/accessRights</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Access Rights</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        Information about who can access the resource or an indication of its security status.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Access Rights may include information regarding access or restrictions based on privacy, security or other regulations.</td>
    </tr>
    <tr>
      <td>
        Refines</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Date Copyrighted</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/terms/dateCopyrighted">http://purl.org/dc/terms/dateCopyrighted</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Date Copyrighted</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        Date of a statement of copyright.</td>
    </tr>
    <tr>
      <td>
        Refines</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>License</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/terms/license">http://purl.org/dc/terms/license</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        License</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        A legal document giving official permission to do something with the resource.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Recommended best practice is to identify the license using a URI. Examples of such licenses can be found at <a href="http://creativecommons.org/licenses/">http://creativecommons.org/licenses/</a>.</td>
    </tr>
    <tr>
      <td>
        Refines</td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Provenance</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/terms/provenance">http://purl.org/dc/terms/provenance</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Provenance</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        A statement of any changes in ownership and custody of the resource 
        since its creation that are significant for its authenticity, integrity 
        and interpretation.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        The statement may include a description of any changes successive custodians made to the resource.</td>
    </tr>
    <tr>
      <td colspan="2">
        <strong>Rights Holder</strong>
      </td>
    </tr>
    <tr>
      <td>
        URI</td>
      <td>
        <a href="http://purl.org/dc/terms/rightsHolder">http://purl.org/dc/terms/rightsHolder</a>
      </td>
    </tr>
    <tr>
      <td>
        Label</td>
      <td>
        Rights Holder</td>
    </tr>
    <tr>
      <td>
        Definition</td>
      <td>
        A person or organization owning or managing rights over the resource.</td>
    </tr>
    <tr>
      <td>
        Comment</td>
      <td>
        Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity.</td>
    </tr>
  </tbody>
</table>


Of these, it is worth noting that Creator, Contributor and Publisher are used to indicate an entity (an 'agent' in DCMI terminology) that was responsible for creating the resource or making it available. However, there is no guarantee that the entity currently holds any rights in the resource, since the rights may have been sold, given away or simply revoked.

It is also worth noting that Date is defined very broadly and may not indicate a date that is relevant in the context of the rights associated with the resource.

Similarly, the Rights element is also defined very broadly and might be used to provide a variety of rights related information. For example, it might be used to convey a _value string_ containing a copyright statement such as "(c) University of Bath, 2005". Alternatively, it may be used to provide a _value URI_ corresponding to the URI of the licence under which the resource is made available.

Provenance will typically be used to provide a human-readable _value string_ description of the custodial history of the resource. This may be useful information to end-users wishing to trace the rights-holding parties associated with a resource, but is unlikely to be structured sufficiently well in order that it may be usefully parsed by software applications.

In recognition of these kinds of problems, DCMI created some additional rights-related terms that are more specific in nature - Rights Holder, Date Copyrighted and Licence. For example, by combining use of the Rights Holder, Date Copyrighted, Rights and Licence it is possible to encode (in a machine-readable way) information about who holds rights over as resource, when it was copyrighted and which licence it is made available under, as follows:

<pre>@prefix dcterms: http://purl.org/dc/terms/

Description Set (
  Description (
    Resoutce URI ( &lt;http://example.org/something/&gt; )
    Statement (
      Property URI ( dcterms:rightsHolder )
      Value String ( "University of Bath" )
    )
    Statement (
      Property URI (dcterms:dateCopyrighted )
      Value String ( "2005" )
    )
    Statement (
      Property URI ( dc:rights )
      Value String ( "(c) University of Bath, 2005" )
    )
    Statement (
      Property URI ( dcterms:license )
      Value String ( "Creative Commons Attribution 2.5 License" )
      Value URI ( &lt;http://creativecommons.org/licenses/by/2.0/&gt; )
    )
  )
)
</pre>

This description is presented using a syntax-neutral representation.

Note that there is some replication of information in the metadata above between the Rights and Rights Holder elements. This is because the Rights Holder element does not specifically indicate the copyright holder and therefore the Rights element has been used to provide a more 'traditional' copyright statement _value string_.

Finally, it is worth noting that although the Creative Commons URI used above identifies a particular CC license, there are no guarantees about what will be made available at such a URI – there may be a machine-readable version of the licence (encoded using ODRL, XrML or some other markup language), there may be a human-readable statement about the licence, there may be the full legal text of the licence or there may be nothing. In the context of a DC metadata description, a machine-readable description about the licence under which the resource is made available is known as a ‘related description’.

### Potential ‘use cases’

This section outlines some possible use cases where the combined use of DC metadata and ODRL might be used to provide an enhanced service to the end-user. Note that these use cases are somewhat aspirational and therefore may not reflect what is currently possible in the real-world!

1. 

A lecturer discovers a Web page using Google and wishes to use some of the information it contains as part of a distance-learning module that he is creating. The lecturer’s browser automatically downloads the ODRL licence under which the resource is made available and uses it to present a pop-up window containing a summary of what the lecturer is allowed to do with that particular resource.

2. 

A researcher uses their library meta-search engine to search a set of high-quality bibliographic services that are relevant to her area of research. The search engine uses Z39.50 and SRW to cross-search multiple targets. When displaying each of the search results, the meta-search engine examines the returned metadata record to see if there is an ODRL rights statement attached or embedded. In those cases where such a licence is available, the meta-search engine indicates this by placing an icon next to the search result. When the researcher clicks on the icon a summary of the licence is presented.

3. 

A public librarian uses an image search engine to discover images about his local area. The image search engine uses the OAI-PMH to harvest metadata from image archives around the world. Having discovered an image that looks to be of use, the librarian checks the copyright information in the OAI metadata record to determine the names of all the rights holders. These are used as a set of starting points for seeking permission to use the image in the library Web site.

4. 

A student is provided with a ‘resource list’ for one of her university course modules. The list is delivered through the university Learning Management System (LMS) and is based on the IMS Resource List Interoperability (RLI) specification. The LMS uses the ODRL licence that is linked to each list item to determine whether the student is allowed to re-use parts of the resource in their own work.

5. 

A journalist uses his favourite RSS aggregator to keep track of a number of media blogs and news feeds that are of interest to him. The aggregator looks for rights information in each item in these channels and uses this to indicate whether the journalist is allowed to re-purpose any of the resources that are available for use in his own stories.

### Issues

The encoding guidelines currently endorsed by the DCMI currently have different capabilities with respect to the DCMI Abstract Model, i.e. not all features of the model can be encoded in all the syntaxes. The RDF encoding can encode almost all aspects of the model and is therefore the richest. The XML and XHTML guidelines do not support all parts of the model. It is therefore the case that, currently, descriptions that can be encoded in one syntax may not be able to be encoded in the other syntaxes.

A very simple model of the key entities related to the combined use of DCMI metadata and ODRL may be represented as follows:

Figure 1

It is important to remember that the ‘value URI’ (the URI that identifies the value of a DCMI property) associated with the DC Licence property is the URI of the licence under which the resource is made available. This may or may not be the same URI as the URI of the ODRL encoding of that licence.

Finally it should be noted that these has been a recent thread on the dc-architecture mailing list about whether it is possible and/or sensible to simply merge together fragments of XML from non-DC XML applications such as ODRL with DC XML metadata records. The author is firmly of the view that it is not sensible to do this, unless the two XML fragments conform to the same underlying ‘model’, such as that provided by RDF.

Therefore, with the exception of those cases where both DC metadata and ODRL are encoded using RDF/XML, it seems more sensible consider how to link together, rather than merge, DC metadata description and ODRL documents.

### References

Embedding ODRL statements in Dublin Core Enric Peig and Jaime Delgado [http://odrl.net/workshop2005/program/paper-peig.pdf](http://odrl.net/workshop2005/program/paper-peig.pdf)

 [RefreshCache](http://dublincore.org/architecturewiki/LinkingDCDescriptionsToODRLExpressions?action=refresh&arena=Page.py&key=LinkingDCDescriptionsToODRLExpressions.text_html) for this page (cached 2012-12-21 22:29:38)  

Immutable page (last edited 2006-02-28 17:14:42 by [AndyPowell](http://dublincore.org/architecturewiki/AndyPowell))


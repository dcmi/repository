---
title: community namespaces
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCMI_Technical_Board/specifications/community_namespaces.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 4 October 2014, at 04:08.  
This page has been accessed 20,778 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Namespace_policy_for_community-developed_vocabularies_-_a_proposal"><span class="tocnumber">1</span> <span class="toctext">Namespace policy for community-developed vocabularies - a proposal</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#About_this_proposal"><span class="tocnumber">1.1</span> <span class="toctext">About this proposal</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#First_precedent:_Core_vocabularies_under_the_DCMI_Namespace_Policy"><span class="tocnumber">1.2</span> <span class="toctext">First precedent: Core vocabularies under the DCMI Namespace Policy</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Second_precedent:_Vocabularies_related_to_Dublin_Core_Collections_Application_Profile"><span class="tocnumber">1.3</span> <span class="toctext">Second precedent: Vocabularies related to Dublin Core Collections Application Profile</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Proposed_Namespace_Policy_for_DCMI-community-developed_vocabularies"><span class="tocnumber">1.4</span> <span class="toctext">Proposed Namespace Policy for DCMI-community-developed vocabularies</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Conclusion"><span class="tocnumber">1.5</span> <span class="toctext">Conclusion</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Namespace policy for community-developed vocabularies - a proposal 

Tom Baker  
2014-10-03

## About this proposal 

The DCMI Community Specifications Committee supports the development of "community-developed specifications, vocabularies, and best practices guidelines in support of resource description" [3]. Some of these activities produce RDF vocabularies that will need to be published by DCMI in machine-readable form and in accordance with Linked Data principles. There are two precedents for publishing RDF vocabularies in the DCMI context: the publication of DCMI Metadata Terms, which is governed by a DCMI Namespace Policy, and the publication in 2007 of terms related to the Collections Application Profile. This proposal describes the two precedents and proposes a policy for the publication by DCMI of community-developed RDF vocabularies.

## First precedent: Core vocabularies under the DCMI Namespace Policy 

The DCMI Namespace Policy [1], a document first drafted in 2001 and last revised in 2007, enumerates the URIs of four "DCMI namespaces" ("collections of term URIs managed by DCMI") and specifies the policies associated with the namespaces with regard to semantic stability and persistance. These four namespaces (Elements 1.1, DCMI Metadata Terms, the DCMI Type Vocabulary, and a small DCAM vocabulary) are vocabularies for which DCMI has declared a long-term maintenance commitment.

The DCMI namespaces are updated by editing XML source files and running a suite of scripts to generate representations of the namespaces in HTML, RDF/XML, and Turtle. The source for the the XML files and scripts is maintained and documented in a Github repository [2]. Whenever updated representations are generated, they are installed on the DCMI website and the PURL for each namespace is edited to point to the updated documentation. For example, the PURL:

> [http://purl.org/dc/terms/title](http://purl.org/dc/terms/title)

resolves by content negotiation to the following documentation:

> [http://dublincore.org/2012/06/14/dcterms.rdf](http://dublincore.org/2012/06/14/dcterms.rdf) [http://dublincore.org/2012/06/14/dcterms.ttl](http://dublincore.org/2012/06/14/dcterms.ttl) [http://dublincore.org/documents/2012/06/14/dcmi-terms/index.shtml](http://dublincore.org/documents/2012/06/14/dcmi-terms/index.shtml)

This process has worked reliably for over a decade, and the scripts are available in open source and could in principle be adapted to produce documentation for community-developed vocabularies. In practice, however, the process and related software are too complex to recommend for general use.

## Second precedent: Vocabularies related to Dublin Core Collections Application Profile 

The Dublin Core Collections Application Profile [4] cites terms coined under two PURL URIs:

> [http://purl.org/cld/terms/](http://purl.org/cld/terms/) [http://purl.org/cld/cdtype/](http://purl.org/cld/cdtype/)

These currently redirect to schemas at:

> [http://dublincore.org/groups/collections/collection-terms/2013-06-26/cldterms.rdf](http://dublincore.org/groups/collections/collection-terms/2013-06-26/cldterms.rdf) [http://dublincore.org/groups/collections/colldesc-type/2013-06-26/cdtype.rdf](http://dublincore.org/groups/collections/colldesc-type/2013-06-26/cdtype.rdf)
## Proposed Namespace Policy for DCMI-community-developed vocabularies 

Taking the Collections AP vocabularies as a precedent:

1. Use a new PURL domain, [http://purl.org/dcx/](http://purl.org/dcx/) as the basis for DCMI community-developed namespaces and term URIs. For example, if LRMI publishes a new RDF vocabulary, "LRMI Terms", one could use
> [http://purl.org/dcx/lrmiterms/](http://purl.org/dcx/lrmiterms/)

(or similar) as the namespace URI.

1. In parallel, create a new directory on the DCMI website, "/dcx", where documentation related to RDF vocabularies can reside. If we assume that communities will adopt different strategies for publishing their vocabularies -- using HTML webpages with embedded RDFa, RDF/XML, Turtle, or perhaps a combination of the above with content negotiation -- it would be realistic to take a rather broad view of what sorts of materials could be held in this directory. Ideally, a community would archive teleconference and meeting minutes separately, perhaps on wiki.dublincore.org, and reserve the dublincore.org/dcx directory for namespace documentation per se. In practice, however, such a distinction could be difficult to enforce, so it might be wisest to give communities some latitude in this regard.

Under this directory, a community-developed vocabulary could have a directory with a name similar to that used in the PURL, though technically speaking there is no requirement that the names be the same. For example, an LMRI vocabulary could reside under the directory with names such as

> [http://dublincore.org/dcx/lrmiterms](http://dublincore.org/dcx/lrmiterms)
1. In accordance with both precedents, representations of RDF vocabularies would be held in directories named using timestamps. For example, a Turtle representation of LRMI terms could be held in a file with the name:
> [http://dublincore.org/dcx/lrmiterms/2014-10-01/lrmiterms.ttl](http://dublincore.org/dcx/lrmiterms/2014-10-01/lrmiterms.ttl)
## Conclusion 

Communities developing RDF vocabularies will need guidance in how to publish their vocabularies on the Web, but DCMI need not commit to publication principles more specific than the requirement that a vocabulary be made available in one of the RDF serialization syntaxes. Indeed, best practice in this area continues to evolve, so DCMI should allow for and anticipate a variety of approaches.

This proposal could perhaps provide the first draft of a DCMI namespace policy for community-developed specifications. Such a policy could either be issued as a standalone policy document or possibly, in the interest of keeping related policies together in one place, as an amendment to the existing DCMI Namespace Policy itself.

[1] [http://dublincore.org/documents/dcmi-namespace/](http://dublincore.org/documents/dcmi-namespace/)   
[2] [http://github.com/dublincore/website](http://github.com/dublincore/website)   
[3] [/archive/mediawiki_wiki/DCMI\_Technical\_Board/specifications](/archive/mediawiki_wiki/DCMI_Technical_Board/specifications)   
[4] [http://dublincore.org/groups/collections/collection-application-profile/](http://dublincore.org/groups/collections/collection-application-profile/)


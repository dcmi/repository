---
title: MappingIssues
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/MappingIssues.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 9 April 2012, at 20:44.  
This page has been accessed 146,554 times.

## Issues Scratch Pad for Schema.org Alignments Task Group 

== New mapping proposals

- [File:Mapping schema.org-DC-sort by domain.rdf](/mediawiki_wiki/files/Mapping_schema.org-DC-sort_by_domain.rdf), sorted by domain
- [File:Mapping schema.org-DC-sort by id.rdf](/mediawiki_wiki/files/Mapping_schema.org-DC-sort_by_id.rdf), sorted by ID

### Immediate issues 

- Which source do we use as the basis for mappings: the (multiple) Web pages at Schema.org; the OWL expression at Schema.org<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>; or the flat lists of properties maintained by Schema.RDFS.org?
> In our discussion in The Hague on 22 September, it was pointed out that schema.rdfs.org was automatically created from and synchronized with Schema.org's Web pages, but it was unclear whether the OWL expression at schema.org<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup> was also intended to be synchronized. At the time, we noted that recent modifications such as those linked to rNews were not taken into account in the OWL schema -- in [http://schema.org/NewsArticle](http://schema.org/NewsArticle), for example, properties such as printColumn were not to be found in the OWL schema. On the assumption that the OWL schema is generated automatically and periodically refreshed, we plan to use it as the source.
- Where, and in what form, should the mappings be published? For example, should they be folded into the documentation for DCMI Metadata Terms, or kept separate but linked? Should they be published on the DCMI website; under schema.rdfs.org, like the SIOC mappings<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>; or on a Mercurial repository at W3C being set up for the Web Schemas Task Force?

- For simplicity, should mapping files fall under the CC0 license ("No Rights Reserved")<sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>?

- In what format should the mappings be published? In plain ntriples, with notes for humans in the wiki?

- Do we stick to "simple" direct mappings using owl:equivalentClass, owl:equivalentProperty, rdfs:subClassOf and rdfs:subPropertyOf, or do we consider more complex mapping rules (using OWL property chains, SPARQL CONSTRUCT, RIF ...)?

### Medium-term issues 

- How should the mappings be versioned - e.g., using Mercurial or Git?

- What guarantees or clarifications should DCMI make (or not make) about the semantic stability of mappings or their persistence over time? For example, in The Hague we figured it would be problematic to put mappings under the DCMI Namespace Policy because we cannot, in principle, control the semantic stability of what we map to (in many cases). DCMI has added an equivalent property declaration between dct:creator and foaf:maker in the formal DCMI terms documentation, but this should perhaps be more the exception than the rule.

- Is there a need to formalize the process of approving and reviewing the mappings, e.g. by a re-oriented DCMI Usage Board -- bearing in mind that the Schema.org mappings are (presumably) merely the first of many sets of mappings that DCMI may need to make?

1. ↑ [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl)
2. ↑ [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl)
3. ↑ [http://schema.rdfs.org/mappings/sioc](http://schema.rdfs.org/mappings/sioc)
4. ↑ [http://creativecommons.org/about/cc0](http://creativecommons.org/about/cc0)


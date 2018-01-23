---
title: Vocabulary Preservation discussion paper
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Vocabulary_Preservation_discussion_paper.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 23 July 2013, at 20:53.  
This page has been accessed 102,453 times.

### Sustainable governance for long-term preservation of RDF Vocabularies 

Discussion paper for a [session on Vocabulary Preservation](/mediawiki_wiki/Vocabulary_Preservation_session.md) at the DC-2013 conference in Lisbon<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>

Authors: Tom Baker, Bernard Vatant, Pierre-Yves Vandenbussche

As a foundation for data sources meant to be usable in the long term, the value of any given vocabulary depends on the perceived certainty that the vocabulary -- in both its machine-readable and human-readable forms -- will remain reliably accessible over time and that its URIs will not be sold, re-purposed, or simply forgotten. Vocabulary maintainers move on to other projects or retire. Resources owned by institutions may be neglected or become unavailable. As the givers of meaning to datasets, vocabularies are of vital importance to the scholarly record and cultural memory. However, their preservation will not happen automatically; it must be planned.

#### Requirements for long-term preservation of RDF vocabularies 

The requirements for long-term preservation must consider a timeframe that stretches beyond the planning horizon of any institution that exists today:

- **Institutional guarantees for the persistence of URIs.** One good first step is for owners of URI domains to publish a commitment that any URI coined for a term in a vocabulary will be used to refer to the same term in perpetuity and will not be repurposed. 
- **Persistence of documentation.** Each term URI should remain resolvable to "namespace documents" -- descriptive documentation in HTML and/or machine- readable representations such as RDF schemas. Note that “persistent” URIs may redirect to documentation held at non-persistent locations. URIs and the associated documentation remain “persistent” to the extent that the link between the two is maintained as documentation is moved between servers.
- **Appropriate versioning of vocabularies.** Vocabularies evolve over time and need to be appropriately versioned. One versioning approach commonly used on the Web is to assign a dedicated URI per resource version (time-specific URI) and support an additional URI from which at any moment in time the current resource version is available (time-generic URI). This approach can be used for vocabularies.

#### Towards a solution 

- **Cooperation among vocabulary maintainers.** Vocabulary maintainers can take some measures to address the problem in the form of mutual aid. The Friend of a Friend (FOAF) Project, for example -- a vocabulary maintained by two private individuals -- has a cooperation agreement with the Dublin Core Metadata Initiative (DCMI) whereby DCMI maintains an up-to-date snapshot of the FOAF Vocabulary, may temporarily host the vocabulary by redirecting FOAF URIs to the DCMI website if needed, and could assume maintenance responsibility for the vocabulary if the FOAF Project should cease its normal activity<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>. The intent of this agreement is in part to promote the idea of long-term planning in the vocabulary maintenance community and to affirm best-practice principles and policies for RDF Vocabularies. Other individual vocabulary publishers, or short-term projects, should be able to engage in similar agreements.
- **Cooperation between vocabulary maintainers and memory institutions.** Creative Commons took off, as an idea, when it provided a set of options for standard, well-understood contracts detailing bundles of legal choices related to copyright. Imagine a menu of commitments about rights and duties regarding rapid interventions (e.g., redirecting URIs if disaster strikes) and the transfer of Internet domain names and of maintenance responsibility in the long-term. The involvement of major players in the Vocabulary Ecosystem could help ensure, at a minimum, that the popular vocabularies have such mechanisms in place.
- **Flexible cooperation among memory institutions.** No institution on the planet can possibly guarantee, today, that it will able to honor a preservation commitment of decades -- even in the case of the most well-endowed and politically secure national libraries. Implementing a redundancy strategy for the long-term preservation of vocabularies implies a flexible form of governance among memory institutions. A robust preservation strategy would embrace memory institutions large and small, in countries rich and poor, from the politically guaranteed to the politically more fragile and provisional. 
- **The principle of "safety through redundancy".** The general principle is summarized in the acronym for the LOCKSS service: Lots Of Copies Keep Stuff Safe (Maniatis et al. 2005). This can be achieved by mirroring information caches among multiple repositories. This is analogous to how the Internet's Domain Name System itself is cached, or indeed how living organisms ensure the survival of their genes by copying their genetic information into new carriers rather than by defending a single, ultimately mortal, cache of information. 
- **Redundant caching of vocabularies.** Because the software used for LOCKSS provides an automated system for sharing caches of digital content within a secure, closed peer-to-peer network -- an idea that has already been implemented successfully to preserve digitally curated journal holdings -- it has been suggested that this software, or something like it, could be used to provide mirrored caches of vocabularies (Halpin and Baker, 2010). The LOCKSS system monitors the integrity of a local information cache by continually comparing the local cache to exact copies of that cache held within a closed system of partner institutions and sounding an alarm if discrepancies arise. It is mathematically very improbable that a even a fairly small number of independently maintained information caches, e.g., seven, should be compromised by server failures or deliberate manipulation in a way that precludes diagnosis and repair.
- **Access to historical versions**. Access to temporally appropriate versions of an RDF vocabulary can be supported by innovative approaches such as the Memento protocol, which access time-specific URIs given a time-generic URI and a datetime.

It could be argued that such a strategy should not be unique to the problem of preserving RDF vocabularies but should hold for many other types of information. This is true. However, compared to the much larger problem of preserving the human record as a whole, the problem of preserving several thousand RDF property-and-class vocabularies is comparatively more tractable. The goal is worthwhile and practical as a first step.

1. ↑ [http://dcevents.dublincore.org/index.php/IntConf/dc-2013](http://dcevents.dublincore.org/index.php/IntConf/dc-2013)
2. ↑ [http://dublincore.org/documents/dcmi-foaf/](http://dublincore.org/documents/dcmi-foaf/)


---
title: Vocabulary Management System Functional Requirements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Vocabulary_Management_System_Functional_Requirements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 17 February 2012, at 14:09.  
This page has been accessed 127,899 times.

The following functional requirements have been identified for the DCMI Vocabulary Management System.

[Currently based on [Vocabulary Management System Functional Requirements notes from DC-2011](/mediawiki_wiki/Vocabulary_Management_System_Functional_Requirements_notes_from_DC-2011.md) and [Taxonomy tools requirements and capabilities](http://conferences.infotoday.com/stats/documents/default.aspx?id=6044&lnk=http%3A%2F%2Fconferences.infotoday.com%2Fdocuments%2F141%2F1315_Busch.pptx)]

## Functional requirements 

- Vocabulary development and maintenance functions
  - Basic maintenance tasks: Create a vocabulary, add, edit, move, delete items, etc. (Diane to advise)
    - URI management
      - Aliases – Need to deal with synonyms, but also with alternative labels based on language or other factors.
    - Assign attributes/properties to an element or concept
    - Thesaurus capabilities/support
  - Mapping and inter-element/concept relations – Must be able to provide links that don’t follow hierarchy, and also go between vocabularies.
  - Maintenance of multilingual vocabularies
    - Secure management of translations
    - Status control of translations
  - Rules checking – Check conformance to style rules like length, use of ampersand, etc.
  - Version control – Enable the determination of what was the ‘valid’ version on dates in the past. Part of a set of strong requirements on provenance.
  - Assign or modify privileges to one or a group of items
  - Activity logging
- Vocabulary governance functions
  - Support policy decisions in the area of vocabulary management and use.
  - Support approval workflow for additions and changes
  - Tracking the handling of change requests, as well as the process of getting approvals for edits
  - Manage user roles and permissions
- User interface
  - Search and browse
  - Drag and drop
  - Multiple windows
- Reporting functions
  - Alphabetical, hierarchical and other views
  - Visualizations
  - Importing and exporting vocabularies
  - Support the development and publication of best practice guidelines for vocabulary management
- Application integration
  - APIs (WSDL, Scripts, Java, etc.)
  - Application integration (CMS, DMS, search engine, etc.)
    - Interaction with DCMI website
  - Ensure no dependencies between the data created and maintained by the system, and the system itself (e.g. URIs independent of any local system identifiers)

## Resources 

- [Vocabulary Management System Functional Requirements notes from DC-2011](/mediawiki_wiki/Vocabulary_Management_System_Functional_Requirements_notes_from_DC-2011.md)


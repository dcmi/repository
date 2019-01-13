---
title: XML Elements and RDF Elements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/FAQ/XML_Elements_and_RDF_Elements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 22 April 2011, at 18:30.  
This page has been accessed 24,104 times.

## Can I use an element from an XML format in RDF or Linked Data? 

Using a subelement from a given XML schema cannot be "used" in an RDF-compatible context -- at least, not directly (i.e., as an XML element). Rather, one would need to \_replicate\_ the element by creating an RDF property -- a property which could happen to have the same name and use the same definition as the XML element, but would have a URI declared as the identifier of an RDF property.

XML schemas and RDF schemas operate with fundamentally different conceptual models -- a nested tree structure on one side and a directed graph structure on the other. "Re-using" elements embedded in a tree structure as elements in an RDF graph involves re-inventing those elements as RDF properties.

XML formats describe the structure of a metadata record seen as a document. Linked Data applications are not set up to understand "document formats" (for each format one needs a schema, for starters), let alone try to guess what its components "mean". In order to expose a XML-format-based record as Linked Data, one would need to transform it into triples (e.g., using a GRDDL transform - in effect an actionable crosswalk).

The costs of migrating data to Linked-Data-friendly formats needs to be balanced against the long-term, ongoing costs of keeping data locked in frozen, non-Linked-Data-compatible formats -- and of creating yet more data in such formats.

"In my metadata, I would like to use Dublin Core elements together with elements from the XML-based Standard XYZ in my metadata format. How can I do this?"

An XML format is a binding for an information structure constructed according to a specified model. XML formats define an ad-hoc "language" of elements and attributes nested within a hierarchical structure. The meaning of these components is determined solely by their placement in the tree structure of the given XML language and the interpretation that the developers of that language define in accompanying documentation. Prefixes bound to "namespace" URIs are used to avoid name collision between like-named elements, but there is no notion of XML elements themselves being identified by URIs.

In RDF, "elements" -- which in RDF are called "properties" -- are identified and referenced using URIs, and there is no notion of element containment or nesting. In contrast, there is a notion of URIs as components of "statements". The meaning of properties is considered to be global in scope, independently of any specific information structure, such as a particular record format. Statements using those properties are designed to be interpretable beyond the context of a specific information structure.

Terms defined as RDF properties are therefore not directly usable as elements in XML formats, and vice versa -- the two types are like apples and oranges.

In practice, the two can be used together if RDF properties (or classes or datatypes) are created which correspond to -- are based on or map to -- XML elements and attributes, or vice versa. In very simple cases, mappings may be so obvious as to seem trivial. But complex, highly nested XML formats can be intellectually challenging to interpret in RDF, especially if the tree structures are at all ambiguous about how particular elements or attributes explicitly relate to resources described.

In short: To "use" an XML element in RDF statements, a corresponding RDF property with a compatible meaning must be coined and assigned a URI -- but then it is no longer an XML element. To "use" an RDF property in an XML format, an RDF property can be taken as the inspiration for an XML element of comparable meaning -- but then it is no longer an RDF property. In other words, because XML elements and RDF properties are fundamentally different, they cannot be "used" together directly, but only via translation from one model into the other. Both uses may base themselves on DCMI Metadata Terms -- seen as a set of concepts with (human-readable) definitions -- but only as RDF properties are DCMI Metadata Terms expressed in a form directly usable for interoperability in a Linked Data context.

The differences between the RDF and XML models, and their consequences for interoperability, are elaborated in a 2005 discussion paper by Pete Johnston [1].

- [1] [http://www.ukoln.ac.uk/metadata/dcmi/dc-elem-prop/](http://www.ukoln.ac.uk/metadata/dcmi/dc-elem-prop/)


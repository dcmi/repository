---
title: RDF
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Glossary/RDF.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 March 2012, at 12:14.  
This page has been accessed 155,760 times.

## Resource Description Framework (RDF) 

RDF is "a standard model for data interchange on the Web"<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>. First standardized as a W3C Recommendation in 1999 <sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>, RDF was re-released as a revised W3C Recommendation in 2004<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>. RDF underpins current approaches to Semantic Web and Linked Data<sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup>.

The Dublin Core approach to metadata, which began in 1995 -- two years before work started on RDF -- has evolved in close interaction with the RDF community. DCMI Metadata Terms are defined as RDF Properties, Classes, and Datatypes (plus a DCMI-specific type of term, the Vocabulary Encoding Scheme), and DCMI properties are currently among the most widely used properties in Linked Data. (See glossary entry [DCMI Metadata Terms](/archive/mediawiki_wiki/Glossary/DCMI_Metadata_Terms "Glossary/DCMI Metadata Terms").)

Metaphorically, RDF may be seen as a "grammar" for a "language of data". Uniform Resource Identifiers (URIs) -- in essence, Web addresses used as unique identifiers for things real or conceptual -- constitute the "words" of that language. Like natural-language words, the words of Dublin Core -- i.e., their URIs -- belong to grammatical categories, where "properties" (e.g., "references" or "isReferencedBy") are a bit like verbs or "predicates"; "classes" are a bit like nouns; "vocabulary encoding schemes" a bit like proper nouns; and "datatypes" a bit like adjectives.

Aside from being "words" in this data language, URIs double as "footnotes" indicating ownership and maintenance responsibility for the words by way of ownership of the domain names under which the "words" (URIs) are coined, as recorded in the globally managed Domain Name Service (DNS). For example, the subdomain [http://purl.org/dc/](http://purl.org/dc/) is "owned" (in the sense of "controlled") by the organization Dublin Core Metadata Initiative. Inasmuch URIs resolve to official representations of "words" (see glossary entry on [Namespace](/archive/mediawiki_wiki/Glossary/Namespace_Policy "Glossary/Namespace Policy")), this globally managed space of unique identifiers functions as a continually updated "dictionary" of the RDF data language. For example, the URI [http://purl.org/dc/terms/title](http://purl.org/dc/terms/title) resolves (by redirection) to an RDF schema ( [http://dublincore.org/2010/10/11/dcterms.rdf](http://dublincore.org/2010/10/11/dcterms.rdf) at the time of writing) which says in a machine-understandable way that dcterms:title is an RDF property.

In its early years, the fifteen-element Dublin Core was likened to a "pidgin" -- a lexicon of generic predicates good enough for the sort of rough but serviceable communication one hears from intermediate-level speakers of foreign languages. As in natural languages, "sentences" make no sense without a shared sentence grammar which gives them meaning as complete thoughts, such as "Book A is a translation of Book B". The grammar of RDF statements follows a simple and consistent three-part grammar of "subject", "predicate", and "object". Statements all have the form: "Resource A is related to Resource B", where the "is related to" part is a predicate from an RDF vocabulary such as DCMI Metadata Terms.

Taken individually, an RDF statement does not say much, but when sentences are aggregated into "paragraphs" (RDF "graphs"), the statements can convey just about any kind of the information one might express using spreadsheets, databases, Web tags, or Web links. Just as pidgin vocabularies go only so far when expressing more specialized knowledge, a healthy ecosystem of RDF vocabularies needs to include both specialized lexicons -- e.g., for use by biologists, manufacturers, or library catalogers among themselves -- and generic lexicons for rough communication with the world in general.

RDF is a language designed by humans for processing by machines. RDF -- the grammar together with its vocabularies -- does not itself engineer a solution to the inherent problems of human communication any more than the English language guarantees world understanding. Like English, RDF is not "perfect" in a theoretical sense, but it is what we currently have, and it serves its purpose well. RDF supports the process of connecting dots -- creating "knowledge" -- by providing a shared basis for expressing information. So too as English provides a basis for communicating among non-native English speakers, RDF provides an idiom for coherently merging or linking data among systems which may not be based on RDF natively but can export or expose data on the basis of the RDF grammar using known RDF vocabularies.

By expressing knowledge in a generic form using a meaningful grammar, RDF in principle supports the longevity of information -- assuming that society can find robust methods for preserving the parts of the Web where its dictionaries and resource identifiers are defined. Aside from supporting data interchange in the here and now, RDF provides a response to the ongoing and inevitable obsolescence of our computer applications and customized data formats.

1. ↑ [http://www.w3.org/RDF/](http://www.w3.org/RDF/)
2. ↑ [http://www.w3.org/TR/1999/REC-rdf-syntax-19990222/](http://www.w3.org/TR/1999/REC-rdf-syntax-19990222/)
3. ↑ [http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/](http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/)
4. ↑ [http://linkeddata.org/](http://linkeddata.org/)


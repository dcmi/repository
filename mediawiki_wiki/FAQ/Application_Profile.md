---
title: Application Profile
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/FAQ/Application_Profile.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 26 December 2011, at 23:03.  
This page has been accessed 123,831 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#What_does_.22Dublin_Core_application_profile.22_mean_today.3F"><span class="tocnumber">1</span> <span class="toctext">What does "Dublin Core application profile" mean today?</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Application_profiles_based_on_the_DCMI_Abstract_Model"><span class="tocnumber">1.1</span> <span class="toctext">Application profiles based on the DCMI Abstract Model</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#The_Singapore_Framework_for_Dublin_Core_Application_Profiles"><span class="tocnumber">1.2</span> <span class="toctext">The Singapore Framework for Dublin Core Application Profiles</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#The_future_of_Dublin_Core_application_profiles"><span class="tocnumber">1.3</span> <span class="toctext">The future of Dublin Core application profiles</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#References"><span class="tocnumber">1.4</span> <span class="toctext">References</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## What does "Dublin Core application profile" mean today? 

The notion of an "application profile" was first introduced at a Dublin Core workshop in October 2000. The basic idea was that maintenance organizations would "declare" element sets, while implementers would merely "use" the elements, so declared, in their metadata. Elements could be drawn from multiple vocabularies, "mixing-and-matching" as required, and constrained, encoded, or interpreted to meet application-specific needs <sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>.

This very general conceptualization of application profiles soon came to be interpreted in a variety of incompatible ways, with the result that many "Dublin Core" implementations could not interoperate despite sharing a common vocabulary. It was recognized, early on, that making application profiles interoperable among themselves would require a common modeling basis, and that machine-processable expressions of profiles "based on data models such as RDF" could provide a solid basis for such interoperability <sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup>. In 2003, work began on a DCMI Abstract Model <sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>, leading eventually to a re-definition of the notion of "Dublin Core application profile" on the basis of a formal model.

### Application profiles based on the DCMI Abstract Model 

The DCMI Abstract Model, first published as a DCMI Recommendation in 2005 and revised in 2007, formalized the notion of a Description Set. A companion specification of 2008, "Description Set Profile: a constraint language for Dublin Core Application Profiles" <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup> <sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup>, described how the general abstract model of a Description Set could be "profiled" with the set of constraints required for a specific application.

A Description Set Profile groups application-specific sets of structural constraints into "templates" for Descriptions and Statements, the main components of a Description Set. The constraints specify how the "slots" of a template are to be filled with URIs or text strings in a metadata record based on the template. For example, a Property Constraint in the template for a Book might specify that the topic of a book be described with a statement using dcterms:subject, and a Vocabulary Encoding Scheme List Constraint might specify that the object of that statement, a URI, be contextualized with a Vocabulary Encoding Scheme URI for the Library of Congress Subject Headings. The specification aimed at providing an initial set of simple constraint types of use for the structural validation of metadata records with the expectation that the set might be extended with additional constraint types in response to user feedback.

### The Singapore Framework for Dublin Core Application Profiles 

The Description Set Profile construct formed the centerpiece of the "Singapore Framework for Dublin Core Application Profiles" of 2007 <sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[6]</a></sup>. The Singapore Framework conceptualized application profiles as sets of specifications documenting, however simply, the decisions underpinning a particular metadata design -- specifications documenting how Functional Requirements informed a Domain Model of entities to be described, as the basis for a Description Set Profile detailing vocabularies used and with what constraints, in turn providing the basis for constructing concrete metadata formats.

An Application Profile, under this model, was seen not just as a schema, but as a packet of specifications and usage guidelines documenting the metadata model of an application in a form maximally re-usable by other implementors. More generally, the Singapore Framework was designed to illustrate how a specific metadata model could be grounded in "domain standards" -- Community Domain Models, Metadata Vocabularies, and the DCAM with its related syntax guidelines -- and how the domain standards were themselves grounded in the "foundation standards" of RDF.

A primer for creating application profiles on this basis, "Guidelines for Dublin Core Application Profiles", was published in 2009 <sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[7]</a></sup>, and the DCMI Usage Board developed and tested criteria for evaluating the conformance of application profiles to the guidelines and principles articulated in the Singapore Framework <sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[8]</a></sup>.

The Singapore Framework approach to application profiles was intended to guide the design of RDF-compatible instance metadata -- records based on application-specific formats, using RDF vocabularies, templated according to the Description Set Profile constraint language, and expressed in concrete syntaxes with a defined relationship to the DCAM (such as HTML, XML, and RDF/XML). DCAM's basis in RDF was intended to ensure that the contents of DCAM-based instance metadata would be straightforwardly expressible as RDF triples and thus as Linked Data.

More fundamentally, the Singapore Framework approach to application profiles was intended to bridge the gap between traditional data-management approaches, grounded in metadata records with defined document structures, and new Semantic Web approaches, based on the notion of theoretically boundless data graphs.

In order to do this, the authors of DCAM defined constructs not provided by RDF itself -- specifically, the notion of a bounded Description Set (roughly analogous to the RDF notion, ambiguously defined at the time, of a Named Graph). DCAM also constrained the infinite possibilities of an RDF graph to a specific set of patterns intended to capture the Dublin Core community's "style" of metadata, with its particular use of URIs, text labels, Syntax Encoding Schemes (datatypes), and Vocabulary Encoding Schemes. In the text "Interoperability Levels for Dublin Core Metadata" of 2008, shared application profiles were seen as the highest level of interoperability in a four-tiered hierarchy ranging from the human but non-machine-actionable interoperability of shared natural-language definitions, to interoperability on the basis of formal semantics (RDF), and culminating in interoperability on the basis of the Singapore Framework: shared natural-language definitions, a shared formal-semantic basis, and a shared model for metadata records using the same terms with the same constraints<sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[9]</a></sup>.

### The future of Dublin Core application profiles 

The DCAM-based approach to application profiles has been widely cited, used as a basis for some software development <sup id="cite_ref-9" class="reference"><a href="#cite_note-9">[10]</a></sup>, and has served as a source of inspiration to metadata designers in its broad outline if not in its details. Notable implementations included the Dublin Core Collections Application Profile <sup id="cite_ref-10" class="reference"><a href="#cite_note-10">[11]</a></sup>, the Scholarly Works Application Profile (SWAP) <sup id="cite_ref-11" class="reference"><a href="#cite_note-11">[12]</a></sup>, and the Achievement Standards Network profile <sup id="cite_ref-12" class="reference"><a href="#cite_note-12">[13]</a></sup>. As of 2012, however, the lack of a clearly defined user and software community makes it difficult to get an overview of implementation.

In the meantime, alternative approaches to expressing structural constraints for the purpose of validating RDF-based metadata have been explored within the Dublin Core and Semantic Web communities. In 2007, for example, Alistair Miles proposed "Son of Dublin Core" -- an approach for encoding and validating "graph-based metadata" using a concrete XML syntax together with language for expressing application-specific syntax constraints over a metadata graph <sup id="cite_ref-13" class="reference"><a href="#cite_note-13">[14]</a></sup>. The company Clark & Parsia has developed an "integrity constraint validator", Pellet, which treats OWL "as a schema or validation language for RDF data via auto-generated SPARQL queries that can be executed on any SPARQL-enabled RDF store" by interpreting OWL ontologies with closed-world assumptions in order to detect constraint violations <sup id="cite_ref-14" class="reference"><a href="#cite_note-14">[15]</a></sup>. Dan Brickley advocates a more pluralistic and eclectic approach to application profiles encompassing a wide range of human-readable and machine-processable methods for documenting metadata patterns, from simple lists of namespaces used to Web documents, metadata exemplars, and example queries <sup id="cite_ref-15" class="reference"><a href="#cite_note-15">[16]</a></sup>.

***Disclaimer: the following paragraphs are under discussion by DCMI.***

As of 2011, the DCMI Abstract Model retains the status of a DCMI Recommendation, the Description Set Profile specification continues to carry the status of DCMI Working Draft, and the Singapore Framework itself has the status of a DCMI Recommended Resource. In all cases, their authors have moved on to other projects, and active development of the documents has ceased. Regaining momentum on the DCAM-based approach to application profiles would require more resources -- authors, editors, and implementors with clear requirements -- than DCMI can currently bring to bear.

For now, DCMI has chosen to leave the specifications in place, with their current statuses, both for their value as historical contributions and potentially as sources of requirements for future projects. However, DCMI recognizes the emergence of validation and quality control as a critical problem for producers of Linked Data.

The DCAM-based approach to application profiles as outlined in the Singapore Framework was an attempt to elucidate the cycle of development from functional requirements through the development of a domain model, the description of entities in that domain model following defined constraints, and the generation of metadata record formats on their basis -- all in a form compatible with RDF. Even in the absence of a formal notion of Description Set Profiles, key aspects of the framework arguably retain their validity as general principles of good metadata design. For example, the "declaration" of metadata terms in vocabularies versus their "re-use" in application profiles remains a useful distinction. The idea of non-RDF formats with defined mappings to RDF remains important in the context of publishing Linked Data. Basing domain models and descriptive models on functional requirements remains a solid design principle. A generic vocabulary for expressing constraints remains a worthy goal, for example as a basis for automating the generation of metadata input forms and validators.

More generally, the idea of expressing application-specific constraints in syntactic terms -- as components that can be validated in order to ensure the quality of instance metadata -- presents a valid and important alternative to the "semantic" style of constraint modeling used in OWL ontologies. OWL ontologies describe an ideal universe of related entities "in the world". In accordance with the "open world assumption", the semantic constraints of an ontology refine the description of that ideal world as a license for inferring additional knowledge on the basis of knowledge at hand.

These syntactic and semantic notions of "constraints" have significantly different uses. For example, if an application profile says that the description of a book has only one subject heading -- a URI -- and a description with two subject headings is encountered, a validator will report an error in the record. If an OWL ontology says that a book has only one subject heading, and a description with two subject headings is encountered, an OWL reasoner will infer that the two subject-heading URIs identify the same subject <sup id="cite_ref-16" class="reference"><a href="#cite_note-16">[17]</a></sup>. The application profile approach is good for flagging data that is inconsistent with the structure of a metadata record as a document, while OWL ontologies are good for flagging logical inconsistencies with respect to an ideal construct.

With the growing momentum of Linked Data, legacy record formats are being adapted for use in Linked Data -- sometimes by translating their constraints into OWL, and this is sometimes based on a misunderstanding of the nature of OWL. OWL ontologies define constraints by refining the conceptualization of a world, whereas application profiles merely refine the contents of a record. OWL ontologies, in other words, introduce semantic constraints that will be inherited by users of the ontology downstream, while application profiles merely control the consistency of data in a syntactic sense, leaving semantics untouched. If quality of control of metadata records at the moment of their creation, or at the moment of ingest, remains on ongoing concern, metadata designers may wish to revisit some of the Singapore Framework's ideas in future standardization efforts.

### References 

1. ↑ [http://www.ariadne.ac.uk/issue25/app-profiles/](http://www.ariadne.ac.uk/issue25/app-profiles/)
2. ↑ [http://dublincore.org/usage/documents/profiles/](http://dublincore.org/usage/documents/profiles/)
3. ↑ [/mediawiki_wiki/Glossary/DCMI\_Abstract\_Model](/mediawiki_wiki/Glossary/DCMI_Abstract_Model)
4. ↑ [/mediawiki_wiki/Glossary/Description\_Set\_Profile](/mediawiki_wiki/Glossary/Description_Set_Profile)
5. ↑ [http://dublincore.org/documents/dc-dsp/](http://dublincore.org/documents/dc-dsp/)
6. ↑ [http://dublincore.org/documents/singapore-framework/](http://dublincore.org/documents/singapore-framework/)
7. ↑ [http://dublincore.org/documents/profile-guidelines/](http://dublincore.org/documents/profile-guidelines/)
8. ↑ [http://dublincore.org/documents/profile-review-criteria/](http://dublincore.org/documents/profile-review-criteria/)
9. ↑ [http://dublincore.org/documents/interoperability-levels/](http://dublincore.org/documents/interoperability-levels/)
10. ↑ [http://portal.acm.org/citation.cfm?id=1875719](http://portal.acm.org/citation.cfm?id=1875719)
11. ↑ [http://dublincore.org/groups/collections/collection-application-profile/2007-03-09](http://dublincore.org/groups/collections/collection-application-profile/2007-03-09)
12. ↑ [http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly\_Works\_Application\_Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Scholarly_Works_Application_Profile)
13. ↑ [http://standards.jesandco.org/wiki/ASN\_Application\_Profile](http://standards.jesandco.org/wiki/ASN_Application_Profile)
14. ↑ [http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html](http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html)
15. ↑ [http://clarkparsia.com/pellet/icv/](http://clarkparsia.com/pellet/icv/)
16. ↑ [http://lists.w3.org/Archives/Public/public-lld/2010Nov/0114.html](http://lists.w3.org/Archives/Public/public-lld/2010Nov/0114.html)
17. ↑ [http://www.amberdown.net/2009/09/faq-using-rdfs-or-owl-as-a-schema-language-for-validating-rdf/](http://www.amberdown.net/2009/09/faq-using-rdfs-or-owl-as-a-schema-language-for-validating-rdf/)


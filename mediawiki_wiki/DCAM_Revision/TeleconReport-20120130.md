---
title: TeleconReport-20120130
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120130.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 February 2012, at 16:05.  
This page has been accessed 127,320 times.

<pre>2011-01-30 DCAM call - 11:00 EST

Attended: TomB (chair), DianeH, StuartS, AaronR, MichaelP, RichardU, CoreyH, GordonD,
             KaiE, JonP, AntoineI, MarkM
This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120130.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120130</a>

----------------------------------------------------------------------
Picking up on dc-architecture discussion

Tom: Two visions of DCAM on table. Are they compatible?
-- Kai: DCAM as SKOS-like thing for metadata - see
   <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Tech</a>
-- Jon: DCAM as more tightly coupled to application and Description Set Profiles.
   Expressing constraints.
Over to Kai...

Kai: My starting point: an RDF approach to DCAM -- creating something similar to SKOS.
     Classes, relations, properties, ontologies to explain what metadata is in the context of RDF.
     Explaining *what* Descriptions and Description Sets are.
     Makes clear that we're compatible with RDF, while also making it usable outside of RDF.
     Such a model can be used independently of RDF, just like the SKOS model is in principle 
     usable without RDF.  

Jon (irc): I think that Kai's notion is very useful, but I don't agree that SKOS is an 
     abstract thesaurus model.  
     
Jon: It's useful to work backwards from RDF, starting from two different ends.
     But it's also useful to work backwards from XML.
     DCAM is a mixture of semantic and constraint specifications, and that needs 
     to be formalized in a way that's broader than the current XML expression.

Corey (irc): +1 to having something that's also compatible with ability to express as a 
     flattened XML schema for validation purposes.

Antoine: Would like to flag that using SKOS as model is good but when people ask 
     about implementations of DC using SKOS, they might be less happy with the fact 
     that there's no official XML schema for SKOS data.

Aaron: Question for Kai. DCAM as an OWL spec for describing metadata, as parallel 
     to SKOS for describing thesauri and FOAF for people?

Kai: Yes. Obvious challenge is that this is dependent or interrelated to the next 
     version of RDF. Named Graphs ~= Description Sets.

Antoine: Maybe the next version of RDF will be stable enough by the time you need it?

Jon: The problem with being RDF-centric is that for much of the [world?] RDF is a fringe 
     technology.

Corey: This is one of the core roles that Dublin Core and DCAM can play. On
     the Provenance call [1], we discussed the notion of "records" -- in the XML sense -- 
     proliferating, being de-aggregated, then re-aggregated and used in new contexts.
     Break up and use in new context. Alot of systems will be XML-based and not RDF-aware.
     Express data in XML but still fitting in with the RDF data model -- that is missing 
     piece. People who work in records.

     Jon, Antoine, Kai, Aaron, Gordon: +1 to Corey.

     [1] <a href="http://wiki.bib.uni-mannheim.de/dc-provenance/doku.php?id=minutes_2012_01_15" class="external free" rel="nofollow">http://wiki.bib.uni-mannheim.de/dc-provenance/doku.php?id=minutes_2012_01_15</a>

Richard (irc): Named Graphs = Descriptions? Can Named Graphs nest? i.e. a Named
     Graph is itself a graph. Can another Named Graph point at a set of other
     Named Graphs (the concept of a Description Set)?

Kai: If we would adopt SKOS (probably another question), maybe we would have to provide an 
     XML schema for it?

Diane: Agree. Folks that I know who are transitioning from record-based world
     will definitely need that sort of support, maybe for a long while.

Antoine (irc): @richard: yes, NGs could correspond to Descriptions and DescriptionSets 
     (but there are some details to sort out).

Jon: RDF provides a way of disseminating and aggregating metadata records in a way that's 
     'format'-independent.

Corey: At my library, mix of MARC, MODS, EAD, DC - want to combine meaningful
     bits about one resource into a triple soup that I can dump into Primo.
     Normalized XML Record, etc. Want to draw the meaningful bits, disaggregate,
     reaggregate that presents discovery-level view.

Jon: XML provides a way of creating records that conform to a particular format.
     DCAM provides a way of defining a model that supports both representations of data.
     I think the differences in perspective -- differences between Kai's and my point 
     of view -- are very compatible.

     Corey (irc): compatible++ interoperable ++ Jon:++
     Antoine: +1 to Jon

Gordon: RDF provides a way of semantic mapping and entailment that can be
     very powerful when taking data from many different sources.
     Jon: +1 to Gordon

Kai: If we start from traditional DCAM and XML and end up with something that
     really fits into RDF, then I'm happy. If we start from XML and it also fits, 
     then I'm happy too.

     Antoine: +1 to Kai: let's have something concrete and figure it out.

Jon: For me it amounts to effective examples and test cases in at least RDF and XML.

     Kai: +1 for having working examples for both ends.

Antoine (irc): The effort of just trying it might be smaller than discussing it.
     (I mean I have nothing against discussion but it would be good if it happens 
     based on a first attempt.)

     Gordon, Jon: +1 to Antoine

Aaron: Serialization-neutral format. But practical implementations also useful. 
     Looking at RDF as a model, and perhaps not tying DCAM strictly to RDF.
     For me, RDF entailment (Gordon): look at RDF as a powerful model, not tying 
     DCAM necessarily but taking advantage of that framework.

Diane: Nothing like concrete examples to flush out the issues.

Jon: A test-driven approach to specification development.

Michael: Looking at RDF as very basic metadata model (which it is, in a way)
     and not trying to look at whole RDF tool stack (which is what people assume) -
     e.g., not RDF/XML. Would be helpful to do something like a gap analysis:
     what things in the current DCAM would not be expressible in RDF as a basic model.

     Aaron: +1 to Michael re: using RDFS/OWL as QA model

Antoine (irc): @michaelp: Isn't <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Scratchpad</a> 
     a good start for what you suggest? E.g., highlights some of the specifics of Vocabulary 
     Encoding Scheme. Description Set is not exressible directly.

Richard (irc): @michaelp Would it be helpful to indicate expressivity gaps? I.e., what can be 
     expressed using RDFS, OWL-Lite, OWL-Full, etc?

Tom:: DC-TEXT as an example of how to write out a DCAM description. Comparing some of the DCAM
     vocabulary (VocabularyEncodingScheme, memberOf) with SKOS (ConceptScheme, inScheme).
     Parts of the current DCAM might be better harmonized with SKOS. Is a DCAM VES different
     from a SKOS Concept Scheme? Comparison of terminology and constructs as a starting point.

     Jon: +1 to Tom

Antoine: I think we started that discussion on gap analysis already, with my trying to understand 
    these weird LiteralValueString constructs (with much help from PeteJ).

    Corey, Diane: +1 for gap analysis

Corey: I'd like to point out that some of what Tom is talking about sits right between Jon's and 
     Kai's proposals. See <a href="/mediawiki_wiki/DCAM_Revision/TeleconIRC-20111221.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconIRC-20111221</a>.
     It maps to our discussion on the December call about two documents: the Technical (hard mapping 
     to XML and DC-TEXT) and the Layman's document (Karen and, I think, Kai). What a Description 
     Set is, how it relates to RDF, etc.

     Antoine: +1 for a "DCAM Reference" and a "DCAM Primer"
     Aaron: +1 to Antoine on Reference and Primer

Richard: Some of the introductory material - we have stuff on Interoperability
     Levels, but the current draft does not link back to that.
     DCAM -- Levels of interoperability -- XML approach and RDF approach.
     Linking DCAM to RDF offers a higher level of interoperability.

Tom: The Description Set language component never got beyond draft status. 
     DC-DSP was an attempt at this. Jon's point that DCAM really only makes 
     sense as a data model for app profiles. That's where its significance 
     comes from. Notion of a constraint language. Jon suggested that DCAM 
     should be useable with many constraint languages.

Jon: Certainly, as Kai points out about SKOS, the DCAM without the DCAP is
     also useful.

Antoine: Regarding application profiles and constraints: having constraint 
     patterns is good but you must be ready to live with constraints specified 
     only at a "low level of interoperability" - i.e., only in an XML schema for an AP.
     I think that's the most difficult technical challenge.

Aaron: DCAM and DCAP -- not just constraints on an XML implementation. But 
     constraints on a variety of serializations.

     Richard, Jon, Mark: +1 @aaron

Jon (irc): But its primary function needs to be seen in the context of providing a 
     format-independent model for defining metadata for a DCAP.

     Antoine: +/- to Jon: it's good if it works, but there are some
     constraints in an XML schema for which it may be difficult to create a more
     general language. But again maybe we can just give it a try and see!

     Jon: +1 to Antoine

Jon (irc): Question: Does the DCAP/DCAM work in the complete absence of RDF?
     If it were an XML-only world (as many metadata domains are) is the DCAP/DCAM 
     still useful?

     Richard: @jon perhaps not unless DCMI is prepared to replace the formal
     models inherent in RDF. But might we also ask if DCAP/DCAM works in the
     absence of XML?

     Antoine: @Jon: data model or serialization?
     Jon: I'm making a distinction between the XML and RDF data models (they're different)
     Antoine: yes
     Jon: Within a model there will be many serializations.
     Corey: @jon -- so the real value here is a set of principles for mapping *between* 
             those data models over &amp; over &amp; over again...

Michael: Strongly advise against trying to create a new constraint language
     for RDF. RDF/XML has so many ways of exrpressing the same RDF graph.
     Complicated. We showed one way in Pittsburgh. One elegant way to
     constrain RDF by producing OWL or RDFS graph and interpreting against RDF
     knowledge base with closed world assumptions. Pellet 3 was released,
     then taken down (the reasoner). The work is in flux. But this is a very
     elegant way to express constraints without leaving RDFS/OWL. Would use
     this to create constraints for validation. Very elegant. Would have to
     test extensively to see where gaps are, comparing with DCAP. But
     promising.

     Antoine: @michaelp: certainly not try to represent constraints on RDF/XML
     syntactic level, I agree! Your Pittsburgh stuff was indeed much more
     promising, though a bit exotic in the RDF community.

Mark (irc): @Richard: @Jon: I believe DCAP/DCAM should work in absence of any
     serialization, at least ideally.

     Richard: @mark: but RDF isn't *just* a serialization
     Mark: @Richard: agreed

Kai: If I review these minutes, I think we much more agree than disagree. I
     wonder if the question where to start is not merely a detail. We need an
     abstract model, a formal ontology, use- and test-cases in various domains and
     syntaxes, with the requirement to be compatible with RDF and exist. DCAM as
     much as possible. Clashes have to be figured out.

Corey: Are we getting caught up...? Jon's idea of constraint language as
     entirely about validating RDF? Or metadata model for mapping RDF out to
     systems that only support XML.

     Richard: Well that's the point. If the DCAP/DCAM is intended to be as
     universally useful as DC itself, then it needs to be able to be useful in
     the absence of any particular data model.

     Jon: Corey, exactly

Richard: There also seems to be a difference between the objectives of
     XML and RDF. RDF semantics provide us a model of how some assertions
     refer to an entity. While it is possible to do this using XML, the
     ability of XML to do this by itself was not part of it's rationale.
     However, some of the debates here still have me wondering what we are
     introducing. But perhaps taking a crack at some text might help clarify
     that.

Jon: Suggest working on testable cases early in process. Sill help clarify goals.
     Corey: +1 for testable use cases

Aaron: I think kai_ in his last post has outlined a strong model for proceeding.

----------------------------------------------------------------------
Next calls

Tom: Propose that we have telecons weekly for awhile. Hard to sort out
     complex issues on list; helps to talk. (Attendees generally agree. Corey will
     be unavailable Feb 1-15. Mark does not like this time slot. Antoine likes
     the principle but will have trouble following the rythm.)

----------------------------------------------------------------------
Outstanding actions

ACTION (2012-01-04): Tom and Richard to put placeholder for introductory text into wiki document
at <a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Draft</a>.

ACTION (2012-01-04): Kai and Tom to work on technical part in wiki, e.g.:
    <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Tech</a>
    <a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Scratchpad</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Graphics.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Graphics</a>
</pre>

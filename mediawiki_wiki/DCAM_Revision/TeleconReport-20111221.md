---
title: TeleconReport-20111221
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20111221.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 21 December 2011, at 20:36.  
This page has been accessed 121,211 times.

<pre>Telecon on Future Directions for DCAM - 2011-12-21 Wed - Report

Report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20111221.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20111221</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20111221.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20111221</a>
IRC log: <a href="/mediawiki_wiki/DCAM_Revision/TeleconIRC-20111221.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconIRC-20111221</a>
Chair: Tom Baker
On call: Tom Baker, Stuart Sutton, Kai Eckert, Karen Coyle, Jon Phipps, Gordon Dunsire, 
              Corey Harper, Mark Matienzo (anarchivist), Michael Panzer, Jane Greenberg, 
              Richard Urban (musebrarian), Sebastian Heath
On IRC: Ed Summers

----------------------------------------------------------------------
Requirements for DCAM and its basis in RDF

Tom: Questions for discussion:
-- What requirement(s) does DCAM address? What is its purpose and audience?
   Can we formulate the purpose in a short statement?
-- Should it be based explicitly on RDF or formulated as more abstract?
Antoine's message [*] describes DCAM as presenting SemWeb-compatible data-modeling
at a more accessible level than RDF itself.
This ties into Jane's point about supporting SemWeb education in LIS context.

[*] <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1112&amp;L=dc-architecture&amp;P=20039" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1112&amp;L=dc-architecture&amp;P=20039</a>

Jon: DCAM provides a realistic bridge between the RDF and XML models and I'd
like to see that retained.

    Karen: Are there validation requirements?

Stuart: Framing DCAM with a "here's the way out of the wilderness" message is
misplaced. DCAM reflects evolution that began before RDF - basic grammatical
principles were originally not RDF. That hasn't gone away. Many people could
benefit from DCAM who do not (at least currently) intend to move to "promised
land" of RDF. Should not be apologetic about concepts such as one-to-one.
DCAM has applications beyond just in Linked Data.

Corey: Some of the history Stuart's describing was written up last year here:
<a href="/mediawiki_wiki/Review_of_DCMI_Abstract_Model.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/Review_of_DCMI_Abstract_Model</a>

Sebastian: Perhaps we can rephrase as "one goal of DCAM is to provide the
underpinning of the mapping of DC to RDF". I do not think DCAM should be
phrased originally in RDF. But there should be an RDF expression.
   Jon: +1
   Mark: I agree with Sebastian; but what are the clear downsides of an
   explicit basis?
   Karen: Yes, DCAM can be expressible in RDF without being based on RDF.

Tom: As Antoine pointed out, DCAM can be *based* on RDF while still being
useful in non-RDF and non-Linked-Data contexts.

Kai: I think using RDF as base is the easiest way to ensure that there is a
valid RDF expression.

Corey: DCAM can have examples in RDF. It should serve as a bridge between RDF
and XML models.

Michael: Kai and I are here because we were working on fitting
provenance-related data into a Dublin Core approach, and we were seeing this
should be part of the priimitives of DCAM. How to go about doing this?
Follow the UML-like approach, like original DCAM, then downstream application
in RDF?? Didn't seem to make alot of sense. DCAM provides more specific,
higher-level constructs than RDF. For Kai and me, made sense to think of DCAM
as grounded in RDF - like an RDF Plus. It has some constructs not in RDF, such
as Vocabulary Encoding Scheme. Another concept: Provenance, though this is
coming with the next-step RDF group, which is looking at more general concepts
of annotating data. It seems to make sense not to contradict the RDF effort.
In a way, RDF is coming around to DCAM. Now they realize RDF needs something
like Description Set -- something SPARQL introduced with notion of Named
Graph. For us, instead of working in DCAM vacuum, made sense to think of
Provenance stuff in RDF.
    Jon: +1 for extending DCAM to encompass an explicit way to model provenance

Jon: The DCAM model encompasses validation and semantics. Semantics are easy
in RDF, but validation hard. Validation easy in XML but semantics are hard.
    Corey: +1

Sebastian: DCAM can say that its current modelling/examples are RDF when
possible but that may change.

Kai: @jon Just an idea: If DCAM is expressable in RDF, the validation can be
based on DCAM. We don't have to validate arbitrary RDF, only RDF that is on
top of DCAM.
    Mark: +1

Kai: Distinguish validation from other aspects of DCAM. Feel strongly that DCAM
should be based on RDF. Can use specific extensions.

    Richard: @jon/karen are we talking about validation against an XML schema?

    Karen: @muse "like" a schema, but not necessarily against a schema.

    Jon: Richard, since everything is 'true' in an open world model, rdf validation
    has to take place in a specific domain. The description of what's 'valid' in a
    specific domain is what I'm talking about.

    Richard: @jon thanks for the clarification. Wanted to makes sure the two
    concepts were not being confused.

    Jon: DCAM esplicitly describes a domain model. So it works well for
    defining requirements for producing valid data which can then be published
    with appropriate semantics. The technical approach to validating and
    publishing needs to be documented with examples, and the examples might
    explicitly suggest an approach using schema-based validation and OWL-based
    semantics.

Tom: There *appear* to be two positions here about whether DCAM should be
"based" on RDF, but maybe we're not really disagreeing. I don't think anyone
is disagreeing that DCAM should conform to RDF; the disagreement is perhaps
more about presentation -- whether the model should put RDF up-front or more
in the background.

Stuart: Agree with Tom. It has alot to do with rhetorical positioning.

Corey: This will come out in the wash when we actually write it. Trend
towards graph-based data not based on RDF. DCAM is useful as bridge between
graph-based and record-based data. 
    Mark: +1
    Jon: +1 "DCAM is useful as bridge between graph-based and record-based data"
    Mark: +1 "DCAM is useful as bridge between graph-based and record-based data"
    Richard: +1 "DCAM is useful as bridge between graph-based and record-based data"

Corey: I ran into issues with XSD document for DCTERMS because it tries to 
enforce RDF stuff.

ACTION: Corey to post to the list re: XSD representation.

----------------------------------------------------------------------
Next steps

Tom: Next step: get a 2-3 person editorial group willing to sit down &amp; start
doing some writing. Goal is a strawman proposal for further discussion on
DC-ARCH List. Summary of what I'm hearing:
* Agreed that DCAM of value.
* Loosely based on / grounded in RDF, but maybe not "RDF up in lights".
* It will be easier to react to something once a draft exists.
We need Editorial Team volunteers: more than four would be unwieldy.

    Richard: Do we have a mapping that discusses what concepts are represented
    in DCAM that are NOT represented in RDF? i.e. the concept of description
    sets/named graphs, etc. Or maybe an account of those concepts, rather
    than a mapping.

    Corey: Richard, not cleanly / concisely, but many of these points exist in
    the Review doc I linked to earlier in the IRC and in Tom's background
    reading.
       
    Richard: Thanks Corey, a little behind on my reading -- will take a closer
    look at that.

Stuart: Not only substance of revision, but form of presentation. DCAM got
itself into trouble - hard to understand - because it distilled everything
down, addressed itself to technical people. Those of us who observed the
development of DCAM saw there were lots of examples. These examples were
distilled out of the end result. Misses the mark for people who are not
"initiated" in that kind of specification. Would really hope that we end up
with a revision of this approach.

    Mark: @Stuart: I have seen this problem in other communities/with other
    standards as well, e.g. the OAIS Reference Model.

Karen: I posted before the call suggesting, following what Creative Commons
has done. Background document covers technical detail, but their user
interface is simpler. Would be difficult to write a single document that
covers both needs. Technical document should be background.
    Mark: +1 to kcoylenet's proposal for background documentation
    Jon: +1 to kcoylenet's proposal for background documentation
    Kai: +1
    Gordon: +1 to present DCAM in ways appropriate to different audiences; e.g.
      library cataloguers should understand that an AP is like a minimum input
      standard for a record, or a display format for a "useful" set of triples, etc.
    Mark: @chrpr1 @kcoylenet Agreed. I think such documentation would also be
      valuable from perspective of educators

Richard: High up on this list is notion of Description Sets and a constraints
language.

Corey: W3C tries to do this with Primers.

Kai: I think the technical documentation is easier when we base it on RDF as
we don't have to replicate what already exists in RDF. We can focus on the
DCAM application.

Tom: Volunteers:
    Jane: Can contribute writing.
    Richard: I'll throw my hat in the ring. Two different paradigms. How to
    [translate?] btw the two paradigms.
    Kai: I volunteer as editor with a passion for RDF.

Stuart: Editors should include people who have a passion for teaching this.
Want to avoid making the same mistake again.

Mark: @Stuart Does that mean we need 2 editorial groups?

Tom: I propose:
* This group on call become DCMI Task group to hold regular calls to discuss document
* Within that group, have an editorial group to do the head-down writing.
   Gordon: +1 for Tom's proposal on Task Group
   Mark: +1 for Tom's proposal
   Kai: +1
   Sebastian: +1 for task group
   Richard: +1
   Jon: +1 for Tom's proposal on Task Group

Corey: Mark was asking whether we need two different editorial groups. Which
comes first? Do not want us to recreate the technical background from scratch.
Start from layman's document? Build towards more in-depth?

Karen: +1 for laymen's doc first.

Kai: I would start with both documentations at the same time, from both
directions, so that we can meet in the middle.
   Richard: +1 for meeting in the middle
   Gordon: +1 for parallel development

Corey: Request that discussion to be on Architecture list for as much open involvment as possible.
   Kai: +1 for open discussions and using the existing list

Stuart: Request that we avoid "Task Group" as a term.
I just want any working body to be nimbly created.

Corey: Yes, but we should announce, recruit more people.
   Stuart: Public, yes.

----------------------------------------------------------------------
Issues tracker

Tom: Do we need one?
    Sebastian: +1
    Jon: +1
    Richard: +1
    Kai: +1 for issue tracker
    Richard: +1 issues tracker

Jon: Assembla is free for open source / public.
Richard: I don't have much opinion on this, I'm only familiar with Bugzilla.
Jon: Github has very simple issues tracker, as does Google Code.

----------------------------------------------------------------------
Next call

Tom: Early January -- editors meet on Skype to discuss initial draft.
Late January, schedule another larger call for review and continuing discussion.
Indicate your availability in the Doodle poll:

    <a href="http://www.doodle.com/ztvxspfpqrei6faa" class="external free" rel="nofollow">http://www.doodle.com/ztvxspfpqrei6faa</a>
</pre>

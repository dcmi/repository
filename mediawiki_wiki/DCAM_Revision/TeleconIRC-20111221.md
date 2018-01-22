---
title: TeleconIRC-20111221
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconIRC-20111221.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 21 December 2011, at 17:09.  
This page has been accessed 128,771 times.

<pre>--&gt;| sebheath (~sfsh@pool-108-21-118-217.nycmny.east.verizon.net) has joined #dcmi
       tbaker Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20111221.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20111221</a>
tbaker Dial-in: +1-218-936-4141, Participant Access Code 334034,
sebheath tbaker: i'm somewhat lurking. i'm particularly interested in the schema.org/dcmi conversation and corey harper suggested i visit here.
sebheath edsu: hi. this is the sebastian heath from nyu. linked ancient world data...
tbaker Hi sebastian - welcome! Join the call if you'd like, but we'll try to take good notes here.
--&gt;| chrpr1 (~Corey_Har@pool-108-54-183-195.nycmny.fios.verizon.net) has joined #dcmi
chrpr1 alias chrpr
--&gt;| musebrarian (~Adium@c-68-84-28-247.hsd1.fl.comcast.net) has joined #dcmi
chrpr1 How the hell am I not a channel operator for a channel I created?!?! (heheh)
edsu sebheath: hey!
edsu sebheath: shoot, i have to run to a meeting, i'll be back in an hour though
--&gt;| jonphip__ (~textual@bas6-ottawa23-1176382657.dsl.bell.ca) has joined #dcmi
sebheath i'm muted
jonphip__ Jon is here but is mic challenged
musebrarian I might have been talking over Gordon, but Richard Urban is here too.
jonphip__ and listening
--&gt;| StuartSutton (~StuartSut@c-24-130-126-51.hsd1.ca.comcast.net) has joined #dcmi
tbaker Scribes: Corey and Tom
--&gt;| kcoylenet (~chatzilla@70-36-134-60.dsl.dynamic.sonic.net) has joined #dcmi
--&gt;| anarchivist (~anarchivi@unaffiliated/anarchivist) has joined #dcmi
--&gt;| kai_ (869b24b1@gateway/web/freenode/ip.134.155.36.177) has joined #dcmi
chrpr1 tbaker: 2 main questions:
chrpr1 * What requirements does dcam address / who's it's audience?
chrpr1 * Should it be based explicitly on RDF or formulated as more abstract?
chrpr1 Agenda, w/ links to the discussion points posted on list recently: <a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision</a>
jonphip__ DCAM provides a realistic bridge between the RDF and XML models and I'd like to see that retained
kcoylenet are there validation requirements?
chrpr1 Antoine's message describes DCAM as presenting SemWeb compatible data-modeling at a more accessible level than RDF itself.
chrpr1 Ties into Jane's point about supporting semweb education in LIS context.
--&gt;| Gordon_ (~Gordon@host-2-99-9-241.as13285.net) has joined #dcmi
tbaker Stuart: framing it as "here's the way out of the wilderness" is misplaced.
chrpr1 Some of the history Stuart's describing were written up last year here: <a href="/mediawiki_wiki/Review_of_DCMI_Abstract_Model.md" class="external free" rel="nofollow">/mediawiki_wiki/Review_of_DCMI_Abstract_Model</a>
tbaker ...DCAM reflects evolution that began before RDF - basic grammatical principles were originally not RDF. That hasn't gone away.
tbaker ...Many people could benefit from DCAM who do not (at least currently) intend to move to "promised land" of RDF.
tbaker ...Should not be apologetic about concepts such as one-to-one.
tbaker ...DCAM has applications beyond just in Linked Data.
sebheath Perhaps we can rephrase as "one goal of DCAM is to provide the underpinning of the mapping of DC to RDF"
kcoylenet Yes, DCAM can be expressible in RDF without being based on RDF
sebheath i do not think DCAM should be phrased originally in RDF. But there should be an RDF expression.
chrpr1 tbaker talking about how DCAM can be *based* on RDF while still being made applicable to other non-RDF &amp; even non-linked-data contexts.
anarchivist i agree with sebheath; but what are the clear downsides of an explicit basis?
jonphip__ sebheath: +1
jonphip__ I do
kai_ I think using RDF as base is the easiest way to ensure that there is a valid RDF expression
tbaker Corey: Examples in RDF - bridge between RDF and XML models.
tbaker Michael: Kai and I are here because we were working on fitting provenance-related data into a Dublin Core approach, and we were seeing this should be part of thge priimitives of DCAM.
tbaker ...How to go about doing this?
jonphip__ DCAM model encompasses validation and semantics. Semantics are easy in RDF, but validation hard. Validation easy in XML but semantics are hard
chrpr1 jonphip__++
sebheath i'm in a high background-noise environment so apologize for using irc.
tbaker ...Follow UML-like approach, like original DCAM? Then downstream application in RDF?? Didn't seem to make alot of sense.
tbaker ...DCAM provides more specific, higher-level constructs than RDF.
jonphip__ +1 for extending DCAM to encompass an explicit way to model provenance
tbaker ...For Kai and me, made sense to think of DCAM grounded in RDF - like an RDF+. Some constructs not in RDF: Vocabulary Encoding Scheme. This would be RDF Plus.
tbaker ...Another concept: Provenance. But this is coming. Next-step RDF group.
chrpr1 Next-steps RDF group also looking at more general concepts of annotating data.
tbaker ...Seems to make sense not to contradict RDF effort. RDF coming around to DCAM. Now they realize RDF needs something like Description Set. SPARQL introduced with notion of named Graph.
sebheath DCAM can say that its current modelling/examples are RDF when possible but that may change.
kai_ @jon Just an idea: If DCAM is expressable in RDF, the validation can be based on DCAM. We don't have to validate arbitrary RDF, only RDF that is on top of DCAM.
anarchivist kai_++
musebrarian @jon/karen are we talking about validation against an XML schema?
kcoylenet @muse "like" a schema, but not necessarily against a schema
tbaker ...For us, instead of working in DCAM vacuum, made sense to think of Provenance stuff in RDF
chrpr1 kai: discussing distinguising validation from other aspects.
chrpr1 kai also feels strongly that dcam should be based on rdf
tbaker Kai: distinguish validation part and other stuff in DCAM. I think DCAM should be based on RDF. Can use specific extensions.
jonphip__ musebrarian: Since everything is 'true' in an open world model, rdf validation has to take place in a specific domain. The description of what's 'valid' in a specific domain is what I'm talking about
tbaker Stuart: Alot around rhetorical positioning.
musebrarian @jon thanks for the clarification. Wanted to makes sure the two concepts were not being confused.
jonphip__ dcam esplicitly describes a domain model
tbaker Corey: This will come out in the wash when we write it.
tbaker ...DCAM is useful as bridge between graph-based and record-based data. Trend towards graph-based data not based on RDF.
anarchivist corey++
jonphip__ so it works well for defining requirements for producing valid data which can then be published with appropriate semantics
tbaker ...Run into issues with DCTERMS XSD document because it tries to enforce.
tbaker ACTION: Corey post to the list re: XSD representation.
jonphip__ …the technical approach to validating and publishing needs to be documented with examples, and the examples might explicitly suggest an approach using schema-based validation and owl-based semantics
jonphip__ +1 ".DCAM is useful as bridge between graph-based and record-based data"
anarchivist +1 ".DCAM is useful as bridge between graph-based and record-based data"
musebrarian +1 +1 ".DCAM is useful as bridge between graph-based and record-based data"
chrpr1 tbaker discussing next steps:
chrpr1 * Get a 2-3 person editorial group willing to sit down &amp; start doing some writing
chrpr1 * Goal is a strawman proposal for furhter discussion on DC-ARCH List
edsu is it still worth joining the call? i'm out of my conflicting meeting now
kai_ @edsu: yes, jane just joined, too.
chrpr1 edsu: we're talking a bit about next steps. I'd recommend joining as Tom's currently summarizing.
chrpr1 Summary from tbaker:
chrpr1 * Agreed that DCAM of value
chrpr1 * loosly based on / grounded in RDF, but maybe not "RDF up in lights"
chrpr1 * Easier to react to something once a draft exists
chrpr1 Editorial Team volunteers: more than 4 would be unwieldy
musebrarian Do we have a mapping that discusses what concepts are represented in DCAM that are NOT represented in RDF? i.e. the concept of description sets/named graphs, etc.
musebrarian or maybe an account of those concepts, rather than a mapping..
tbaker Stuart: Not only substance of revision, but form of presentation. DCAM got itself into trouble - hard to understand - because it distilled down, writing for technical people.
tbaker ...Those of us who observed the development of DCAM, there were lots of examples. Distilled out of the end result. Misses the mark for people who are not "initiated" in that kind of specification.
tbaker ...Would really hope that we end up with a revision.
anarchivist @Stuart: I have seen this problem in other communities/with other standards as well, e.g. the OAIS Reference Model
chrpr1 musebrarian: not cleanly / concisely, but many of these points exist in the Review doc I linked to earlier in the IRC &amp; in Tom's background reading.
tbaker Karen: I posted before the call suggesting, following what Creative Commons has done. Background document covers technical detail, but their user interface is simpler.
anarchivist +1 to kcoylenet's proposal for background documentation
jonphip__ +1 to kcoylenet's proposal for background documentation
tbaker ...Would be difficult to write a single document that covers both needs. Technical document should be background.
musebrarian thanks Corey, a little behind on my reading…will take a closer look at that.
kai_ +1
chrpr1 musebrarian: high up on this list is notion of Description Sets &amp; a constraints language.
Gordon_ +1 to present DCAM in ways appropriate to different audiences; e.g. library cataloguers should understand that an AP is like a minimum input standard for a record, or a display format for a "useful" set of triples, etc.
tbaker Corey: W3C try to do this with Primers.
chrpr1 Volunteers so far for editorial committee include tbaker &amp; Jane Greenberg.
kai_ And I think the technical documentation is easier when we base it on RDF as we don't have to replicate what already exists in RDF. We can focus on the DCAM application.
anarchivist @chrpr1 @kcoylenet Agreed. I think such documentation would also be valuable from perspective of educators
tbaker Jane: Can contribute writing.
tbaker Stuart: Editors should include people who have a passion for teaching this.
anarchivist q? @Stuart Does that mean we need 2 editorial groups?
tbaker ...Want to avoid making the same mistake again.
tbaker Richard: Throw my hat in the ring. Two different paradigms. How to [translate?] btw the two paradigms.
kai_ I volunteer as editor with a passion for RDF
chrpr1 tbaker proposal:
chrpr1 * This group on call become DCMI Task group to hold regular calls to discuss document
chrpr1 * Within that group, have an editorial group to do the head-down writing.
chrpr1 Richard, Kai, Jane &amp; Tom volunteered to be core Editorial Group.
Gordon_ +1 for Tom's proposal on Task Group
anarchivist +1 for tbaker's proposal
kai_ +1
sebheath +1 for task group
musebrarian +1
jonphip__ +1 for Tom's proposal on Task Group
tbaker Corey: Mark was asking whether we need two different editorial groups. Which comes first? Do not want us to recreate the technical background from scratch. Start from layman's document? Build towards more in-depth.
kcoylenet +1 for laymen's doc first
kai_ I would start with both documentations at the same time, from both directions, so that we can meet in the middle
musebrarian +1 for meeting in the middle
Gordon_ +1 for parallel development
chrpr1 (My request for much discussion to be on Architecture list for as much open involvment as possible)
kai_ +1 for open discussions and using the existing list
tbaker Stuart: Request that we avoid "Task Group" as a term.
tbaker Corey: Yes, but we should announce, recruit more people.
StuartSutton I just want any working body to be nimbly created…public, yes.
sebheath +1
jonphip__ +1
chrpr1 tbaker: Early january -- editor's group have a couple of skype calls to work on initial draft
musebrarian +1
chrpr1 Late january, schedule another larger skype call for review and continuing discussion.
kai_ +1 for issue tracker
musebrarian +1 issues tracker
jonphip__ Assembla is free for open source / public
musebrarian I don't have much opinion on this, I'm only familiar with Bugzilla
jonphip__ github has very simple issues tracker, as does Google Code
sebheath glad to have been here.
Gordon_ @tbaker - thanks!
musebrarian thanks.
jonphip__ thanks Tom!!
anarchivist thanks!
kai_ thank Tom. Bye
jonphip__ bye all
&lt;--| anarchivist has left #dcmi
|&lt;-- Gordon_ has left freenode (Quit: Leaving)
chrpr1 Thanks for getthing this rolling, Tom!
|&lt;-- chrpr1 has left freenode (Quit: Leaving.)
&lt;--| musebrarian has left #dcmi
tbaker thank you all!
</pre>

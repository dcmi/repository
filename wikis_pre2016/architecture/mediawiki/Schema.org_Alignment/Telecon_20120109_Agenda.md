---
title: Telecon 20120109 Agenda
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/Telecon_20120109_Agenda.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 9 January 2012, at 17:03.  
This page has been accessed 28,620 times.

<pre>Schema.org Alignment Task Group *informal* telecon

This agenda: <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20120109_Agenda" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20120109_Agenda</a>
Chair: Tom
Date: Monday, 2012-01-09
Tom: 11:00 AM Eastern Std Time
Dial-in: +1-218-936-4141, participant Access Code 334034
IRC: <a href="irc://irc.freenode.net/#dcmi" class="external free" rel="nofollow">irc://irc.freenode.net/#dcmi</a>
Mailing list: <a href="http://www.jiscmail.ac.uk/lists/dc-architecture" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/lists/dc-architecture</a>

Note: This will be an informal call to discuss practical solutions that need
to be put into place before we can take a decision on Schema.org alignments.
On Monday's call, we will _not_ discuss issues of substance - only of process
and practice.

1. Publication of mappings

    Problem: we need a better set-up for collecting comments than wiki pages:
       <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings</a>
       <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
    
    Note:
    -- Posting comments on specifics to dc-architecture will not scale
    -- Comments should be part of what is published, and comments should continue
       to be collected after publication
    
    Jon has proposed to a way to put mappings, already in RDF, under version
    control with Git: <a href="https://github.com/jonphipps/Example-Map" class="external free" rel="nofollow">https://github.com/jonphipps/Example-Map</a>
    We could put these under: <a href="http://github.com/dublincore" class="external free" rel="nofollow">http://github.com/dublincore</a>

    How could we provide a human-readable view of these mappings (e.g., using Lode
    or Parrot)?

2. Process of deciding alignments

    The process of getting good-enough consensus on mappings does not need to
    be overly formal, e.g., with precise voting rules. However: we do need to be 
    clear about the informal process.

    Proposal:
    -- Basis for decision must be published with:
       Proposed alignment statements.
       Details of semantics of the properties and classes being aligned, as in:
       <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>

    -- A structured way to collect feedback and comments on mappings has been put 
       into place -- not not only in order to prepare the "vote" but also as a way 
       of collecting feedback after publication, i.e., as a way of identifying 
       alignments that may need to be revisited in the future.

    -- When the information and comment environment are in place, we hold a telecon
       in which we walk through the list, discuss any issues arising, and get approval 
       for the alignments among the attendees of the call.  
       
   -- We publish the telecon-approved alignments as a draft to the world, publicize 
       the draft for a comment period of, say, two weeks, before declaring them 
       officially "published".

3. Alignment "vote"

    Decide on a timetable for the above and set a rough date for a telecon in which
    we take a decision (which will be subject to a public comment period before publication
    as described above.

4. Issues tracker (time-permitting)

   See: wiki page about issue tracking at W3C [1].  
   -- Tracker is great, but it is only available for use by W3C working groups [2]
   -- Bugzilla: powerful, but said to require investment in time to learn [3]
   -- RoundUp [4], a ten-year-old Python project, used to track Python and IETF projects
   -- Assembla [5] -- a cloud-based service to which DCMI would need to subscribe
   -- Jira [6], subscription required - said to be good for "document-oriented" issues

   [1] <a href="http://www.w3.org/wiki/TrackingIssues" class="external free" rel="nofollow">http://www.w3.org/wiki/TrackingIssues</a>
   [2] <a href="http://www.w3.org/2005/06/tracker/" class="external free" rel="nofollow">http://www.w3.org/2005/06/tracker/</a>
   [3] <a href="http://www.bugzilla.org/" class="external free" rel="nofollow">http://www.bugzilla.org/</a>
   [4] <a href="http://roundup.sourceforge.net/" class="external free" rel="nofollow">http://roundup.sourceforge.net/</a>
   [5] <a href="http://www.assembla.com/" class="external free" rel="nofollow">http://www.assembla.com/</a>
   [6] <a href="http://www.atlassian.com/software/jira/" class="external free" rel="nofollow">http://www.atlassian.com/software/jira/</a>

 
 

&gt; Schema.org Alignment Task Group 2011-12-12 Telecon Report
&gt; 
&gt; Chair: Tom Baker
&gt; Attended: Tom Baker, Dan Brickley, Stuart Sutton, Bernard Vatant, Ahsan Morshed, Jon Phipps, 
&gt; Antoine Isaac, Kirsten Jeude, Corey Harper, Jane Greenberg, John Kunze, Ed Summers, 
&gt; Diane Hillmann
&gt; Date: 2011-12-12, Monday
&gt; Agenda: <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20111212" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20111212</a>
&gt; Note: This report integrates some follow-up discussion after the meeting.
&gt; 
&gt; ----------------------------------------------------------------------
&gt; Links
&gt; -- Wiki page for this Task Group
&gt; <a href="/mediawiki_wiki/Schema.org_Alignment" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment</a>
&gt; -- Bernard Vatant's proposal
&gt; <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings</a>
&gt; - Bernard's proposal with details added
&gt; <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
&gt; -- DC-ARCHITECTURE mailing list
&gt; <a href="http://www.jiscmail.ac.uk/lists/dc-architecture.html" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/lists/dc-architecture.html</a>
&gt; 
&gt; ----------------------------------------------------------------------
&gt; Background on Schema.org (Dan)
&gt; 
&gt; Dan: <a href="http://schema.org/" class="external free" rel="nofollow">http://schema.org/</a> is hosted at Google. Other search engines collaborate.
&gt; 
&gt; One recent extension is "jobs" vocabulary, and vocabularies are brewing for
&gt; medicine and television. Doing as much of this work in public as possible. We
&gt; have created a Web Schemas interest group at W3C [1], with tools like an issues
&gt; tracker, public mailing list, wiki. Trying to figure out the social process
&gt; for extensions.
&gt; 
&gt; [1] <a href="http://www.w3.org/2001/sw/interest/webschema.html" class="external free" rel="nofollow">http://www.w3.org/2001/sw/interest/webschema.html</a>
&gt; 
&gt; The vocabulary is maintained in a Google-specific format from which the OWL is
&gt; generated -- and now also RDFa. A machine-readable, versioned view may
&gt; eventually be made available, e.g., as a big RDFa Lite file, and probably in
&gt; Mercurial repository at W3C, even if the actual site continues to be driven by
&gt; the intermediary format. There are scraped-from-html views of the schema
&gt; extracted by the DERI+friends team over at schema.rdfs.org (a separate
&gt; project), and an OWL/RDFS description of the vocabulary which was
&gt; script-generated from the internal source files by Peter Mika. The basic
&gt; approach is essentially RDFish, but not very picky about the kind of details
&gt; that webmasters don't care about.
&gt; 
&gt; The strongest driver has been simplicity, and a focus on trying to make less
&gt; things webmasters might get wrong. So for example we pushed for the 'RDFa lite'
&gt; profile of RDFa, which removed complex RDF detail. In RDFa Lite publishers
&gt; aren't forced to think about the difference between rel="..." (for things)
&gt; and property="..." (for strings) since this is a common cause of confusion.
&gt; 
&gt; We also have a kind of semi-official mistakes tolerance strategy. For example
&gt; see <a href="http://schema.org/docs/datamodel.html" class="external free" rel="nofollow">http://schema.org/docs/datamodel.html</a>:
&gt; 
&gt; "While we would like all the markup we get to follow the schema, in
&gt; practice, we expect a lot of data that does not. We expect schema.org
&gt; properties to be used with new types. We also expect that often, where we
&gt; expect a property value of type Person, Place, Organization or some other
&gt; subClassOf Thing, we will get a text string. In the spirit of "some data is
&gt; better than none", we will accept this markup and do the best we can."
&gt; 
&gt; Schema.org does not try to document this flexibility formally in RDFS/OWL, but
&gt; it does reflect the practicalities of this kind of very broad-participation use
&gt; of structured data: lots of mistakes. This topic has somewhat haunted the
&gt; history of Dublin Core over the years: we've tended to agonize about the gap
&gt; between string-centric and thing-centric descriptions, and about how to move in
&gt; a fluid way between the two idioms.
&gt; 
&gt; Schema.org is using OWL instead of RDFS because of some properties require the
&gt; stronger semantics.
&gt; 
&gt; There are alot of things in the Schema.org vocabularies -- "Volcano",
&gt; "Hairdresser"... Integrating rNews. Philosophy is not to push multiple
&gt; namespaces onto authors, so the core is flat. Single flat NS overlaps with
&gt; other initiatives. But the intention is to avoid duplication. Want to say:
&gt; "This part is based on collaboration with X".
&gt; 
&gt; A possible model for collaboration with DC: "80% is already expressible." Couch
&gt; in terms of markup for particular types of information, such as "cultural
&gt; heritage". Perhaps point to particular Web sites whose markup could be improved
&gt; with these extensions/terms.
&gt; 
&gt; Mappings can serve different purposes:
&gt; 
&gt; 1. a social signal to those who don't 'live and breathe' standards that
&gt; the right people are talking to each other. So not to worry about
&gt; tabloid style "we shouldn't use DC because the search engines only
&gt; consume schema.org" too much. This is an issue, but we can do several
&gt; things to reduce the problem it causes.
&gt; 
&gt; 2. as a 'documention centre' resource for people working with data,
&gt; including machine tooling (e.g. we could write sparql CONSTRUCT
&gt; queries that map one idiom into another).
&gt; 
&gt; 3. as a "here, this might be useful" offering to search engine
&gt; engineers in case they are interested (no promises...) in going beyond
&gt; schema.org-only markup and also parsing equivalent triple patterns
&gt; e.g. from RDFa / Microdata, even when different namespaces are used.
&gt; 
&gt; 4. to help vocabulary development by identifying things expressible in
&gt; idioms from one community (eg. we could take Scholarly Works
&gt; scenarios, or cultural heritage examples...) and see how they look in
&gt; the other schema.
&gt; 
&gt; Since currently, the Schema.org sponsor search engines have committed only to
&gt; consume Schema.org markup, and not DC, SKOS etc., this could be considered an
&gt; unfortunate pressure on sites who are currently publishing Dublin Core. Getting
&gt; these mappings in place is one step we can take to making that a less painful
&gt; situation. It might be, for example, they choose to publish schema.org markup
&gt; in RDFa, and more detailed RDF/XML using DC+SKOS+FOAF as Linked Data in other
&gt; formats. Or maybe this time next year the search engines might be more
&gt; pluralistic and consume other idioms. It's not clear what will happen. What is
&gt; clear is that having search engines actually use structured data is making a
&gt; lot of sites pay attention who otherwise wouldn't.
&gt; 
&gt; If we channel use cases from DC -- working groups, workshops, conferences,
&gt; personal connections... -- into Schema.org via use cases and specific scenarios
&gt; that aren't currently addressed, could perhaps be picked up by search engines.
&gt; Rather than focusing on whether Schema.org's partner search engines consume
&gt; DC's namespace alongside schema.org.
&gt; 
&gt; ----------------------------------------------------------------------
&gt; Sources of the mappings
&gt; 
&gt; For Schema.org terms, there is an official RDFS/OWL export linked from
&gt; <a href="http://schema.org/docs/datamodel" class="external free" rel="nofollow">http://schema.org/docs/datamodel</a>, i.e.: <a href="http://schema.org/docs/schemaorg.owl" class="external free" rel="nofollow">http://schema.org/docs/schemaorg.owl</a>.
&gt; 
&gt; Another version is maintained at schema.rdfs.org, i.e.:
&gt; <a href="http://schema.rdfs.org/all.nt" class="external free" rel="nofollow">http://schema.rdfs.org/all.nt</a>.
&gt; 
&gt; Schema.org launched with expression in microdata. At some point, started to
&gt; publish OWL, which is kept up to date. Schema.rdfs.org scraped from HTML. The
&gt; rdfs.org version may go away as better machine-readable versions are made
&gt; available from Schema.org.
&gt; 
&gt; ----------------------------------------------------------------------
&gt; Publication of mappings.
&gt; 
&gt; Corey: Human-readable version important because people have deployed DC and
&gt; using related formats. Help people understand how that relates to Schema.org.
&gt; Antoine: +1
&gt; 
&gt; Dan: Related example: <a href="http://blog.schema.org/2011/11/using-rdfa-11-lite-with-schemaorg.html" class="external free" rel="nofollow">http://blog.schema.org/2011/11/using-rdfa-11-lite-with-schemaorg.html</a> ...
&gt; 
&gt; Jane: Educational aspect.
&gt; Stuart: +1
&gt; 
&gt; Antoine: Use out-of-box tool for visualizing vocabularies. Use simple HTML generator.
&gt; 
&gt; Bernard: Parrot? <a href="http://ontorule-project.eu/parrot/parrot" class="external free" rel="nofollow">http://ontorule-project.eu/parrot/parrot</a>
&gt; 
&gt; Dan: Publish in RDF/XML, NTriples, or RDFa.
&gt; 
&gt; Antoine: other visualizers:
&gt; -- <a href="http://pellet.owldl.com/ontology-browser/" class="external free" rel="nofollow">http://pellet.owldl.com/ontology-browser/</a>
&gt; -- <a href="http://lode.sourceforge.net/" class="external free" rel="nofollow">http://lode.sourceforge.net/</a>
&gt; 
&gt; Dan: See blog post in support of RDFa Lite (above). For mappings, not just
&gt; term-by-term, but use cases, e.g., Linked Library - here in DC, here in
&gt; Schema.org. People think in concrete terms.
&gt; 
&gt; Jane: Important message.
&gt; 
&gt; Dan: What's the easiest way to find, say, 15 mainstream but varied DC-based
&gt; examples? The only markup that search engines currently collectively agree to
&gt; parse is Schema.org namespace. "Here is a structure in Schema.org - here is how
&gt; to say it in DC". Here are the equivalent patterns - consume them if you'd
&gt; like. Could be useful to document how you 'say' schema.org things using other
&gt; namespaces like DC. Helpful to document the equivalences as we see them.
&gt; 
&gt; General consensus: Creative Commons license CC0 is a good way to go.
&gt; 
&gt; Tom: RDF page, embed the mapping, w/explanatory notes about not having to 
&gt; choose one-or-the-other?
&gt; 
&gt; Tom: This is a test balloon. If we were to do alignments on any sort of scale.
&gt; We can do the mappings, can't keep it all updated, can't make ambitious
&gt; promises regarding maintenance. Alignments are dynamic things. We can version.
&gt; We can surface the versioning so folks can find previous version of mapping.
&gt; We should not be too fussy about agreement.
&gt; 
&gt; ======================================================================
&gt; Mapping detals - <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
&gt; 
&gt; Tom: Wanted to see the two side-by-side. Wanted to see classes, sub-classes,
&gt; properties. Asking why the two are being maintained separately.
&gt; 
&gt; Dan: Schema.org tends to accept strings where things are called for.
&gt; 
&gt; Corey: Grounding in DCTERMS will set explicit ranges.
&gt; 
&gt; Dan: "Expect this to be messy".
&gt; 
&gt; Ed: Does that get reflected in OWL?
&gt; 
&gt; Dan: No, the formal descriptions are reasonably tidy. Suggest we not spend too
&gt; much time trying to anticipate things that could go wrong. Publishing
&gt; machine-readable data is more important than worrying about which we should
&gt; use.
&gt; 
&gt; Antoine: +1
&gt; 
&gt; General consensus: Consider these as mappings between "tidy representations"
&gt; ("tidy" from a formal-semantic point of view) but recognize and anticipate that
&gt; formal ranges may not be followed in practice.
&gt; 
&gt; Dan: Noting slight uncertainty re schema:Language rdfs:subClassOf
&gt; dct:LinguisticSystem but let's move along.
&gt; 
&gt; Corey: Open question about whether preference should be for equivalentClass /
&gt; Property vs. subClass / Property
&gt; 
&gt; Dan: I tried SELECT * WHERE {?x a &lt;<a href="http://purl.org/dc/terms/LinguisticSystem" class="external free" rel="nofollow">http://purl.org/dc/terms/LinguisticSystem</a>&gt;}
&gt; in <a href="http://lod.openlinksw.com/sparql" class="external free" rel="nofollow">http://lod.openlinksw.com/sparql</a>. I tried same query in
&gt; <a href="http://sparql.sindice.com/" class="external free" rel="nofollow">http://sparql.sindice.com/</a> ... found some more results. Would be good to have
&gt; such empirical data when deciding about mappings.
&gt; 
&gt; Corey: It depends on whether the subClass/Property represents a more narrowly
&gt; defined set in some way. Equivalence implies that the sets are the same. My
&gt; preference is to prefer Equivalent; it is more useful. 
&gt; 
&gt; Diane disagrees; subProperty relations may be more accurate. 
&gt; 
&gt; We agree to continue discussion on Equivalent vs subPropertyOf on the list.
&gt; 
&gt; Ed: Wonders if an authority record describing a person is a bibliographic
&gt; resource and if it's a creative work. Probably not worth worrying about right now.
&gt; Would be a fun conversation to have though; preferably over pints...
&gt; 
&gt; Tom: Propose that dct:title be subPropertyOf schema:name.
&gt; 
&gt; Dan: Aside: foaf:name has 
&gt; &lt;rdfs:subPropertyOf rdf:resource="<a href="http://www.w3.org/2000/01/rdf-schema#label" class="external free" rel="nofollow">http://www.w3.org/2000/01/rdf-schema#label</a>"/&gt; 
&gt; (which OWL DL people don't like btw).
&gt; 
&gt; Antoine: @danbri: btw what is the mapping of foaf:name in DC?
&gt; 
&gt; Dan: Don't think we documented one yet.
&gt; 
&gt; Corey: Issues coming up: schema:desc and dct:desc equivalence - restritive vs
&gt; open ranges.
&gt; 
&gt; Antoine: @danbri: that looks like an argument for dc:title equivalent to
&gt; schema:name ;_
&gt; 
&gt; Dan: Yeah, they're all basically short and often lossy labeling properties
&gt; 
&gt; Corey: What triggers assignmnet of subproperty versus equivalent?
&gt; 
&gt; ----------------------------------------------------------------------
&gt; Next steps
&gt; 
&gt; Will schedule another call -- spend whole call on the specific alignments.
&gt; Prepare for call w/ description of problems on the discussion list. Week of
&gt; January 9.
&gt; 
&gt; Request from Bernard that we look through the two schemas more closely to see
&gt; if the current mappings miss anything. Things in DC that are not in
&gt; Schema.org.
&gt; 
&gt; Dan: DC can be thought of as a vocabulary, but also as a community
&gt; well-grounded in practice. Most terms might be covered by Schema.org, but we
&gt; could point out use cases that are not addressed by Schema.org - reflect into
&gt; documentation work from the wider community. Thinking in particular of the
&gt; application-profile strand of DC thought.
&gt; 
&gt; Dan: eg. where "mapping from DC" might be more than DC terms:
&gt; <a href="http://www.ariadne.ac.uk/issue50/allinson-et-al/" class="external free" rel="nofollow">http://www.ariadne.ac.uk/issue50/allinson-et-al/</a> (or any later successor...)
</pre>

-- Tom Baker <tom@tombaker.org>


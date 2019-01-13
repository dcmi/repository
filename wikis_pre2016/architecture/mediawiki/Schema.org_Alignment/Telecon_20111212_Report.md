---
title: Telecon 20111212 Report
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/Telecon_20111212_Report.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 20 December 2011, at 16:39.  
This page has been accessed 175,936 times.

<pre>Schema.org Alignment Task Group 2011-12-12 Telecon Report

Chair: Tom Baker
Attended: Tom Baker, Dan Brickley, Stuart Sutton, Bernard Vatant, Ahsan Morshed, Jon Phipps, 
          Antoine Isaac, Kirsten Jeude, Corey Harper, Jane Greenberg, John Kunze, Ed Summers, 
          Diane Hillmann
Date: 2011-12-12, Monday
Agenda: <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20111212" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20111212</a>
Note: This report integrates some follow-up discussion after the meeting.

----------------------------------------------------------------------
Links
-- Wiki page for this Task Group
    <a href="/mediawiki_wiki/Schema.org_Alignment" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment</a>
-- Bernard Vatant's proposal
    <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings</a>
- Bernard's proposal with details added
    <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
-- DC-ARCHITECTURE mailing list
    <a href="http://www.jiscmail.ac.uk/lists/dc-architecture.html" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/lists/dc-architecture.html</a>

----------------------------------------------------------------------
Background on Schema.org (Dan)

Dan: <a href="http://schema.org/" class="external free" rel="nofollow">http://schema.org/</a> is hosted at Google. Other search engines collaborate.

One recent extension is "jobs" vocabulary, and vocabularies are brewing for
medicine and television. Doing as much of this work in public as possible. We
have created a Web Schemas interest group at W3C [1], with tools like an issues
tracker, public mailing list, wiki. Trying to figure out the social process
for extensions.

[1] <a href="http://www.w3.org/2001/sw/interest/webschema.html" class="external free" rel="nofollow">http://www.w3.org/2001/sw/interest/webschema.html</a>

The vocabulary is maintained in a Google-specific format from which the OWL is
generated -- and now also RDFa. A machine-readable, versioned view may
eventually be made available, e.g., as a big RDFa Lite file, and probably in
Mercurial repository at W3C, even if the actual site continues to be driven by
the intermediary format. There are scraped-from-html views of the schema
extracted by the DERI+friends team over at schema.rdfs.org (a separate
project), and an OWL/RDFS description of the vocabulary which was
script-generated from the internal source files by Peter Mika. The basic
approach is essentially RDFish, but not very picky about the kind of details
that webmasters don't care about.

The strongest driver has been simplicity, and a focus on trying to make less
things webmasters might get wrong. So for example we pushed for the 'RDFa lite'
profile of RDFa, which removed complex RDF detail. In RDFa Lite publishers
aren't forced to think about the difference between rel="..." (for things)
and property="..." (for strings) since this is a common cause of confusion.

We also have a kind of semi-official mistakes tolerance strategy. For example
see <a href="http://schema.org/docs/datamodel.html" class="external free" rel="nofollow">http://schema.org/docs/datamodel.html</a>:

    "While we would like all the markup we get to follow the schema, in
    practice, we expect a lot of data that does not. We expect schema.org
    properties to be used with new types. We also expect that often, where we
    expect a property value of type Person, Place, Organization or some other
    subClassOf Thing, we will get a text string. In the spirit of "some data is
    better than none", we will accept this markup and do the best we can."

Schema.org does not try to document this flexibility formally in RDFS/OWL, but
it does reflect the practicalities of this kind of very broad-participation use
of structured data: lots of mistakes. This topic has somewhat haunted the
history of Dublin Core over the years: we've tended to agonize about the gap
between string-centric and thing-centric descriptions, and about how to move in
a fluid way between the two idioms.

Schema.org is using OWL instead of RDFS because of some properties require the
stronger semantics.

There are alot of things in the Schema.org vocabularies -- "Volcano",
"Hairdresser"... Integrating rNews. Philosophy is not to push multiple
namespaces onto authors, so the core is flat. Single flat NS overlaps with
other initiatives. But the intention is to avoid duplication. Want to say:
"This part is based on collaboration with X".

A possible model for collaboration with DC: "80% is already expressible." Couch
in terms of markup for particular types of information, such as "cultural
heritage". Perhaps point to particular Web sites whose markup could be improved
with these extensions/terms.

Mappings can serve different purposes:

1. a social signal to those who don't 'live and breathe' standards that
   the right people are talking to each other. So not to worry about
   tabloid style "we shouldn't use DC because the search engines only
   consume schema.org" too much. This is an issue, but we can do several
   things to reduce the problem it causes.

2. as a 'documention centre' resource for people working with data,
   including machine tooling (e.g. we could write sparql CONSTRUCT
   queries that map one idiom into another).

3. as a "here, this might be useful" offering to search engine
   engineers in case they are interested (no promises...) in going beyond
   schema.org-only markup and also parsing equivalent triple patterns
   e.g. from RDFa / Microdata, even when different namespaces are used.

4. to help vocabulary development by identifying things expressible in
   idioms from one community (eg. we could take Scholarly Works
   scenarios, or cultural heritage examples...) and see how they look in
   the other schema.

Since currently, the Schema.org sponsor search engines have committed only to
consume Schema.org markup, and not DC, SKOS etc., this could be considered an
unfortunate pressure on sites who are currently publishing Dublin Core. Getting
these mappings in place is one step we can take to making that a less painful
situation. It might be, for example, they choose to publish schema.org markup
in RDFa, and more detailed RDF/XML using DC+SKOS+FOAF as Linked Data in other
formats. Or maybe this time next year the search engines might be more
pluralistic and consume other idioms. It's not clear what will happen. What is
clear is that having search engines actually use structured data is making a
lot of sites pay attention who otherwise wouldn't.

If we channel use cases from DC -- working groups, workshops, conferences,
personal connections... -- into Schema.org via use cases and specific scenarios
that aren't currently addressed, could perhaps be picked up by search engines.
Rather than focusing on whether Schema.org's partner search engines consume
DC's namespace alongside schema.org.

----------------------------------------------------------------------
Sources of the mappings

For Schema.org terms, there is an official RDFS/OWL export linked from
<a href="http://schema.org/docs/datamodel" class="external free" rel="nofollow">http://schema.org/docs/datamodel</a>, i.e.: <a href="http://schema.org/docs/schemaorg.owl" class="external free" rel="nofollow">http://schema.org/docs/schemaorg.owl</a>.

Another version is maintained at schema.rdfs.org, i.e.:
<a href="http://schema.rdfs.org/all.nt" class="external free" rel="nofollow">http://schema.rdfs.org/all.nt</a>.

Schema.org launched with expression in microdata. At some point, started to
publish OWL, which is kept up to date. Schema.rdfs.org scraped from HTML. The
rdfs.org version may go away as better machine-readable versions are made
available from Schema.org.

----------------------------------------------------------------------
Publication of mappings.

Corey: Human-readable version important because people have deployed DC and
using related formats. Help people understand how that relates to Schema.org.
Antoine: +1

Dan: Related example: <a href="http://blog.schema.org/2011/11/using-rdfa-11-lite-with-schemaorg.html" class="external free" rel="nofollow">http://blog.schema.org/2011/11/using-rdfa-11-lite-with-schemaorg.html</a> ...

Jane: Educational aspect.
Stuart: +1

Antoine: Use out-of-box tool for visualizing vocabularies. Use simple HTML generator.

Bernard: Parrot? <a href="http://ontorule-project.eu/parrot/parrot" class="external free" rel="nofollow">http://ontorule-project.eu/parrot/parrot</a>

Dan: Publish in RDF/XML, NTriples, or RDFa.

Antoine: other visualizers:
-- <a href="http://pellet.owldl.com/ontology-browser/" class="external free" rel="nofollow">http://pellet.owldl.com/ontology-browser/</a>
-- <a href="http://lode.sourceforge.net/" class="external free" rel="nofollow">http://lode.sourceforge.net/</a>

Dan: See blog post in support of RDFa Lite (above). For mappings, not just
term-by-term, but use cases, e.g., Linked Library - here in DC, here in
Schema.org. People think in concrete terms.

Jane: Important message.

Dan: What's the easiest way to find, say, 15 mainstream but varied DC-based
examples? The only markup that search engines currently collectively agree to
parse is Schema.org namespace. "Here is a structure in Schema.org - here is how
to say it in DC". Here are the equivalent patterns - consume them if you'd
like. Could be useful to document how you 'say' schema.org things using other
namespaces like DC. Helpful to document the equivalences as we see them.

General consensus: Creative Commons license CC0 is a good way to go.

Tom: RDF page, embed the mapping, w/explanatory notes about not having to 
choose one-or-the-other?

Tom: This is a test balloon. If we were to do alignments on any sort of scale.
We can do the mappings, can't keep it all updated, can't make ambitious
promises regarding maintenance. Alignments are dynamic things. We can version.
We can surface the versioning so folks can find previous version of mapping.
We should not be too fussy about agreement.

======================================================================
Mapping detals - <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>

Tom: Wanted to see the two side-by-side. Wanted to see classes, sub-classes,
properties. Asking why the two are being maintained separately.

Dan: Schema.org tends to accept strings where things are called for.

Corey: Grounding in DCTERMS will set explicit ranges.

Dan: "Expect this to be messy".

Ed: Does that get reflected in OWL?

Dan: No, the formal descriptions are reasonably tidy. Suggest we not spend too
much time trying to anticipate things that could go wrong. Publishing
machine-readable data is more important than worrying about which we should
use.

Antoine: +1

General consensus: Consider these as mappings between "tidy representations"
("tidy" from a formal-semantic point of view) but recognize and anticipate that
formal ranges may not be followed in practice.

Dan: Noting slight uncertainty re schema:Language rdfs:subClassOf
dct:LinguisticSystem but let's move along.

Corey: Open question about whether preference should be for equivalentClass /
Property vs. subClass / Property

Dan: I tried SELECT * WHERE {?x a &lt;<a href="http://purl.org/dc/terms/LinguisticSystem" class="external free" rel="nofollow">http://purl.org/dc/terms/LinguisticSystem</a>&gt;}
in <a href="http://lod.openlinksw.com/sparql" class="external free" rel="nofollow">http://lod.openlinksw.com/sparql</a>. I tried same query in
<a href="http://sparql.sindice.com/" class="external free" rel="nofollow">http://sparql.sindice.com/</a> ... found some more results. Would be good to have
such empirical data when deciding about mappings.

Corey: It depends on whether the subClass/Property represents a more narrowly
defined set in some way. Equivalence implies that the sets are the same. My
preference is to prefer Equivalent; it is more useful. 

Diane disagrees; subProperty relations may be more accurate. 

We agree to continue discussion on Equivalent vs subPropertyOf on the list.

Ed: Wonders if an authority record describing a person is a bibliographic
resource and if it's a creative work. Probably not worth worrying about right now.
Would be a fun conversation to have though; preferably over pints...

Tom: Propose that dct:title be subPropertyOf schema:name.

Dan: Aside: foaf:name has 
    &lt;rdfs:subPropertyOf rdf:resource="<a href="http://www.w3.org/2000/01/rdf-schema#label" class="external free" rel="nofollow">http://www.w3.org/2000/01/rdf-schema#label</a>"/&gt; 
(which OWL DL people don't like btw).

Antoine: @danbri: btw what is the mapping of foaf:name in DC?

Dan: Don't think we documented one yet.

Corey: Issues coming up: schema:desc and dct:desc equivalence - restritive vs
open ranges.

Antoine: @danbri: that looks like an argument for dc:title equivalent to
schema:name ;_

Dan: Yeah, they're all basically short and often lossy labeling properties

Corey: What triggers assignmnet of subproperty versus equivalent?

----------------------------------------------------------------------
Next steps

Will schedule another call -- spend whole call on the specific alignments.
Prepare for call w/ description of problems on the discussion list. Week of
January 9.

Request from Bernard that we look through the two schemas more closely to see
if the current mappings miss anything. Things in DC that are not in
Schema.org.

Dan: DC can be thought of as a vocabulary, but also as a community
well-grounded in practice. Most terms might be covered by Schema.org, but we
could point out use cases that are not addressed by Schema.org - reflect into
documentation work from the wider community. Thinking in particular of the
application-profile strand of DC thought.

Dan: eg. where "mapping from DC" might be more than DC terms:
<a href="http://www.ariadne.ac.uk/issue50/allinson-et-al/" class="external free" rel="nofollow">http://www.ariadne.ac.uk/issue50/allinson-et-al/</a> (or any later successor...)
</pre>

---
title: TeleconReport-20120515
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-20120515.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 25 May 2012, at 19:14.  
This page has been accessed 124,840 times.

<pre>DCAM 2012-05-15 telecon - Report

This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120515.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120515</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120515.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120515</a>

Present: Tom (chair), Jon, Karen, Richard, Corey, Antoine, Dan, Gordon, Kai
Regrets: Mark, Aaron

----------------------------------------------------------------------
Minutes of previous call on 9 April
    
    ACCEPTED <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120409.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120409</a>
    
----------------------------------------------------------------------
Report from London

Tom: IFLA, ISBD, etc - communities that need a common language for expressing
constraints at different (including higher) levels of granularity.

Gordon: Need for higher-level constructs, both for communicating among
communities but also within. Emerging concept of "families of APs" that can
be attached to each standard, not monolithic. One of the tasks from the
Bibliographic Metadata Task Group, now on the wiki: To contribute well-formed
use cases to DCAM and RDF WG Named Graph discussions. Interested members of
the group should join Architecture and Provenance. May to October for this
task. Result should be significant for DCAM/DCAP discussion.

ACTION: Gordon to put reference on wiki.

Karen: Caution against putting too much emphasis on ISBD - backward-looking.
Let's focus on RDA and FRBR - fewer gotchas.

Gordon: But ISBD AP is one of the simplest I can think of. And the only one
where there has been substantial work. The RDA AP will be almost as
complicated as FRBR. If we cannot solve the problem of ISBD AP, we might as well
give up now - a good test case.

----------------------------------------------------------------------
Turtle syntax

ACTION 2012-03-22: Antoine to look at the RDFWG extended Turtle syntax and post comments 
to the mailing list.

-- DONE <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1204&amp;L=dc-architecture&amp;P=7778" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1204&amp;L=dc-architecture&amp;P=7778</a>

Antoine: I found this Trig/Turtle syntax easy to use, but I had the sense that
it is not fully baked. We should express requirements if we see discussion
going in the wrong way. There is discussion about adding syntactic
complexity. My case was easy, but talking about ways to express this in more
complex way. If DCAM requires the simplest form of graph - basic reification
- we should be careful that RDF WG does not make too complex.

   Kai: +1 for advocating simplicity from DCMI
   Aaron: @kaiec +1

----------------------------------------------------------------------
Examples
    <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1203&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=55080" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1203&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=55080</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions</a>

Richard: Still feel we need some space for "dark patterns" - what do we see in
examples that are things that we wish to steer people away from.

Karen: working with concrete examples is good, but careful: if we take
real-life examples, there is alot of bad data. We want _good_ examples. How
to vet? Or do we want to be able to do "bad" metadata?

     Richard: +1 kcoyle

Jon: I think there's a case to made for taking a working example that may be
ummm, suboptimal and determining how to model that would be more than just a
useful exercise.

     Richard: @jon, yes showing roadmap between suboptimal to optimal would
     be useful

Karen: Jon, I can see that. It will be important that we understand what the
intention of the metadata is, and whether it achieves that.

Richard: Is that kind of mapping in the scope of what we're doing here?

Jon: It would help surface anti-patterns as well.

Dan: I wear many hats: DC, Schema.org... Vocabs are meeting grounds btw
publishers and consumers. Point yesterday in yesterday's Schema.org call: if
we ground things in concrete examples, natural to go beyond pile of text
files. What was the process by which this description came into Web?
Europeana re: Mona Lisa. Brings in Karen's concerns: there might be perfect
description, or less good. After 15 years DC, would like to be able to point
to examples, also where extension vocabularies used.

      Jon: @danbri +1 to being able to point to concrete examples (I think
      that's what you said)

TomB: we want to collect examples and translate them into some abstract
language.

Karen: Shold be fairly easy to pull examples out of library data. Gordon and
I could do this easily. But I'd like to think we could do scientific data.
Reach out to other communities. Not be too focused on just one part (the
library part).

     Gordon: @karen, +1

Jon: We currently have a reasonable definition of a DCAP and its components in
the Singapore framework. What we seem to be missing is a more completely
abstract definition of the constraint model.

Gordon: I'm thinking about a hybrid DCAP and schema.org use case.

Dan: How do we slip into looking at xsd, instead of at the instance data?
(xsd is meta...)

Jon: How about a survey of constraint languages? Xsd, owl, schematron,
json-schema, etc.

Dan: A survey of constraint languages is meta^meta^meta :) but interesting.

Antoine: Agree with Karen. We don't need alot of examples to start with. I
could provide Europeana. We have two application profiles, documented in
fairly ad-hoc way, but documents constraints and re-use of several
vocabularies.

Gordon: ISBD (notoriously) doesn't do headings/controlled access points, so
everything goes into notes in the descriptive metadata. It would be neat if
those notes themselves were marked up with schema.org/RDFa ...

Dan: Can't help thinking about <a href="http://worrydream.com/LadderOfAbstraction/" class="external free" rel="nofollow">http://worrydream.com/LadderOfAbstraction/</a> ...

   Jon: @danbri: I don't think it's that meta^meta since we're talking about
   not just an abstraction but a generalization. Sort of like designing an
   abstract class in Java that must be implemented in its entirety but the
   implementation details are almost entirely local to the class that extends
   it.

Dan: We have instance docs. They make claims about some book/person/situation.
We have schema language instances that make claims about classes of document
and their structure, and/or about the terms (classes/properties) used in those
docs. We have constraint languages that express classes of document in terms
of term occurance patterns. It is a *bit* meta :)

   Jon: @danbri but germaine :)
        @danbri And perhaps well within scope?

   Dan: yeah, I'd just like to ground it in a repository of use cases / examples /
   and human-level narrative.

Karen: We shouldn't start with gigantic XML schemas, but pull out significant
patterns. Not a good use of our time to dig through big schemas.

   Danbri nods.  

Gordon: I only put up 3 patterns of examples; there are probably many more.
Good to synthesize! Same patterns repeat over and over. ISBD (see link) has
a small number, synthesized by Gordon.

Dan: GordonD, do you have a link?

Gordon: When we discussed this a few weeks ago... If we want to pull out the
generic patterns, I have more. There's more than the three I isolated for
this discussion.

     Jon: nods

Karen: Synthesize before sending to group. I'm find with it being text. For
example, let's take Gordon's aggregated statement page. Go through and see
what pattern would be needed. Start with understanding the use case.

   Dan: I'm fine w/ text too.

Tom: Do we need a generic schema language?

Jon: It's important when describing things in text that we try to be clear
about the differences in expression between the relatively unique RDF data
model and say, XML.

Karen to Jon re: unique data model in XML?

Dan: Let's only do abstraction work once we've got a decent collection of
examples' (which maybe we already have).

Jon: The RDF Open World assumption requires a model that's quite different
from the domain-specific model used by for instance XML. An AP by definition
describes that closed-world model but in two contexts -- semantics for
publishing in an open world and syntax for validating in a closed domain
model. Karen, does that help explain at least my perspective on APs?

Karen: We need a place to collect these - need to see them all together.

Richard: can we articulate the difference between "patterns" and "examples"
here? (it seems to get used interchangablely)

    Jon: @musebrarian +1 for patterns vs. Examples

ACTION: Tom to create top-level Design page on wiki.

Corey: nextsteps++

Jon: Personally, I would very much like to end up with a formal
machine-actionable abstract model at some point

   Richard: @jon machine-actionable in what context (goes back to the
   open/closed world models)?

Tom: Next step: Meet in two weeks.

ACTION Tom to make Doodle poll for week after next.
</pre>

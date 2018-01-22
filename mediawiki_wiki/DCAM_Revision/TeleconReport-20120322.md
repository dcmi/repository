---
title: TeleconReport-20120322
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-20120322.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 March 2012, at 13:10.  
This page has been accessed 133,520 times.

<pre>2012-03-22 DCAM call - 11:00 EST - report

Present: TomB, MarkM, RichardU, AntoineI, GordonD, AaronR, KaiE, CoreyH
This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120322.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120322</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120322.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120322</a>
Previous: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120229.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120229</a>

Tom: We have had great discussions on telecons and the mailing list, but it is unclear
    where this is heading in terms of output. Richard, your ACTION?

Richard: No update. Agree with Tom. Hard to write introductory text when it is unclear
    where we are heading.

Kai: I have re-written the first draft. I still continue with the approach of providing 
    a full RDF ontology. We could consider this to be DCAM -- or just an RDF representation
    of DCAM. For the moment I don't really care. I'm rather aiming at completeness.
    I have personal interestin in this. Did some modifications on the parts about graphs
    and description sets.

Tom: We're in agreement that the work on formal representation isn't the core activity.
    We also appear to agree that DCAM should be one level of abstraction above the RDF 
    representation, but that what we have should map to RDF.
    
    Kai: @Tom: +1
    Mark: @tom: +1

Tom: We want something that is very rich with patterns and best practice examples.
    That should be our starting point. Only then maybe work towards the formal representation.
    Kai is rather working the other way round, from the formal representation. Maybe
    we can meet somewhere in the middle. I have put some design patterns into the wiki [1].
    Also some simple patterns w.r.t. VESes.

    [1] <a href="/mediawiki_wiki/DCAM_Revision_Design_Patterns.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Design_Patterns</a>

Gordon: In a vague way, we can FRBRize: DCAM is a Work (abstraction); RDF is
    an Expression of the Work; and a Turtle or RDF/XML representation is a
    Manifestation ...

Kai: I am quite positive that we meet.

Tom: are we making progress or turning in circles? Can we produce useful documents?

Antoine: I feel that we're moving forwards in a non-linear way.

Gordon: I've posted a higher-level "situation" that occurs in my work [2] -- higher-level
    than the design patterns that I've seen so far. Do any of these advanced patterns 
    have features that cannot be built from the basic patterns? Alistair's stuff on 
    constraints (constraint language) seems useful. I see the need for cardinality 
    constraints. Provide examples how these can be built up into higher-level granulity 
    patterns.

    [2] <a href="/mediawiki_wiki/DCAM_Revision_Design_Patterns#Examples_from_Gordon.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Design_Patterns#Examples_from_Gordon</a>

Gordon: Most obvious is the aggregated statement, which can be seen as a graph. It can be 
    seen as a whole but is composed of smaller elements. The classic example is a publication
    statement, comprised of: place of publication, date of publication, etc.
    A resource can have more than one publication statement, in which case we need some sort of 
    container. These models require the publication statement to exist as a whole, not just 
    as the sum of its component parts. Components need to be grouped together so their context 
    is understood. This is a simple higher-level pattern: Aggregated Statement. A Named Graph 
    that must contain components from a predefined set of components.
    In the ISBD application profile, we found at least three levels of such aggregations.

    Tom: +1
    
Tom: How could we represent such patterns? I've posted some suggestions from Dan
    proposing a notion for AP that ranges from text description of what metadata is 
    about to more formalized expressions. One way to express patterns could be as
    SPARQL queries. Would SPARQL be a good candidate?

Aaron: SPARQL would be ok, but maybe not effective as the only formal representation. 
    SPARQL works but requires a few leaps of imagination - how to translate into metadata. 
    Maybe Turtle, RDF/XML, or straight-up XML - different ways to express patterns.

Tom: There's consensus for seeing patterns expressed in different syntaxes,
    mapped to a more abstract level -- the DCAM we keep talking about.
    Another issue is whether DCAM should include a constraint language.
    Gordon's requirement can't be met with DCAM-plus-Named-Graphs alone.
    We'd need to express constraints such as cardinality.
    We know what we want but have not figured how to get there.
    We agree to get examples and work backwards from them. We must decide on
    a way to collect such examples, and we don't know the granularity.

    Aaron: @tbaker +1 "Ambivalence toward RDF due to fact that it's perceived as a
        concrete syntax (RDF/XML), not the formal model that it truly is."
    Mark: @tbaker: +1 for working backwards from examples; may be a lower barrier to participation.
    Antoine: +1 (and we have many examples already!)

Richard: Examples are drawn from a certain set of tasks with a modeling stance.
    Right now we're working towards RDF.

Antoine: RDF with closed world, that's a difference.

[Corey joins, Tom recaps.]

Tom: We could put some example up there in a concrete syntax (any) and map them to RDF.

   Tom +1: I completely agree that there is a goal to show the potential interoperability 
        of different concrete syntaxes.
   Mark: Would it make sense to "work backwards" from higher level examples like Gordon or 
        Karen have provided?
   Antoine: +1

Richard: I think the point of my question was missed. Do we need not only examples of 
    concrete syntax, but also examples of the abstractions that made the form of those 
    concrete syntaxes necessary. i.e. why ISBD publication statements are the way they are.
    Mark: +1 I think that your point is what I was getting at with my question.

Corey: how to deal with loosely defined framework like schema.org? How schema.org relates 
    to RDF - how to translate. See no problem with starting with existing DCAM.

Tom: the problem with starting with DCAM terminology is that it raises the bar.
   RDF only misses the notion of bounded description.

Richard: Can DCAM capture the objectives of those syntaxes, even if it can't
   model how they chose to create syntax representations?
   (Or maybe not "can't" but "chooses not to", or in keeping with DCMI's commitment 
   with simplicity?)

   Mark: +1

Corey: Could we use the terminology of the existing DCAM?

Tom: I suggest we take a step back from heavy terminology like "non-literal value 
    surrogate" for now. I believe the RDF group has made progress on an extended 
    Turtle for named graphs [3]. Can someone taken an action for seing how named graphs 
    are expressed in extended Turtle?

    [3] <a href="http://www.w3.org/TR/turtle/" class="external free" rel="nofollow">http://www.w3.org/TR/turtle/</a>
    [4] <a href="http://www.w3.org/2011/rdf-wg/wiki/TF-Turtle" class="external free" rel="nofollow">http://www.w3.org/2011/rdf-wg/wiki/TF-Turtle</a>
    [5] <a href="http://www.w3.org/TeamSubmission/turtle/" class="external free" rel="nofollow">http://www.w3.org/TeamSubmission/turtle/</a>

Antoine: I have to do something like that in the coming weeks anyway.

ACTION 2012-03-22: Antoine to look at the RDFWG extended Turtle syntax and post comments 
    to the mailing list.

Tom: For the next call, I propose that we aim at getting just five examples
    in the wiki. Maybe we should define a template for collecting those examples.
    Each example could be expressed in a concrete syntax and with an RDF expression,
    perhaps using extended Turtle -- with a commentary on what, if anything, is 
    missing from RDF to allow full expression of the example.

    Aaron: +1 for using Turtle as a starting point
    Mark: +1 for using Turtle as a starting point

Antoine: Are we looking for anything much different from 
    <a href="/mediawiki_wiki/DCAM_Revision_Design_Patterns.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Design_Patterns</a> (from the 
    DC-RDF specification)?

    Aaron: @aisaac, I think Tom's suggesting a more structured/formal environment for examples.
    Antoine: @aaron: I meant the first part of that wiki page -- the table.

Tom: The first section is actually a good example: an RDF expression next to a non-RDF 
    expression (which in this case happens to be DC-TEXT). One abstract formulation, 
    expressed in two syntaxes. Picture a template like that,
    along with slots for commentary. For now, we could put each example in a separate 
    wiki document, then use "transclusion" to pull them all together for viewing and printing.
    Might be easier than editing one huge document.

    Richard: +1 for examples as separate wiki docs
    Kai: @Tom: +1
    Mark, agreeing: -1 for RDF/XML 
    GordonD: ++1 for not using RDF/XML. +1 for Turtle.
    Tom and Antoine also agree on turtle -- whatever syntax has
       named graphs at the moment we need them.

ACTION: Gordon and Aaron to put examples into the wiki.

Mark: Aaron, i'm willing to help with the examples, but I may not be able to do much before the 
    next call. either email me, or i'll watch DC-ARCHITECTURE more closely.

    Aaron: Thanks @anarchivist!

Richard: And in the meantime we can aggregate links to individual examples on one of the 
    draft pages. Keeping the examples separate would allow us to track their changes independently.

    GordonD: ++1 Aaron and Gordon to create a separate wiki page per example, and then a template 
        could evolve from them. Suggest, therefore, that Aaron and Gordon supply the native syntax 
        and some notes, in the first instance.
    Aaron: GordonD +1

ISSUE TRACKING

Tom: A word on issue tracking? See github on the schema.org mapping discussion.

Corey: account creation is a barrier, but it's going to be a barrier for any system.
    If we want organization, we've got to use a tracker.
    I don't know any with public anonymous access.
    Creating an account on github is not really difficult.
    We need to find a way to assign people to issues.
    We can use diffs when resolving issues.
    We don't have to put all public comments on github.
    But for a smaller group of editors it makes sense.

Tom: ok, we have a doable next step for the schema.org activity.
    When should we have our next call?

Antoine: not during WWW (16-20 April in Lyon, France) [6]!

[6] <a href="http://www2012.wwwconference.org/" class="external free" rel="nofollow">http://www2012.wwwconference.org/</a>
</pre>

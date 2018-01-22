---
title: TeleconReport-20120229
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-20120229.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 March 2012, at 18:10.  
This page has been accessed 126,980 times.

<pre>2012-02-29 DCAM call - 11:00 EST - report

Present: TomB, JonP, StuartS, DianeH, RichardU, Michaelp, GordonD, DanielL (IRC), CoreyH
This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120229.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120229</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120229.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120229</a>
Previous: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120115.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120115</a>
 
Richard: Each of the encoding technologies we may want to use have different
    abilities. Some things are easier, some are harder, to express. Defining
    "mandatory/applicable" will depend on underlying capabilities of these encoding
    technologies.

Tom: The original motivation behind DCAM was to make comparisons -- specify
    which of DCAM's features can be expressed using this or that encoding syntax,
    and which cannot.

Richard: At an abstract level, not how DCAM can be expressed in XML, etc.
    Rather, looking at constraints. Is there some systematic way we could 
    look at Karen and Gordon's examples? For example, the idea of properties 
    being mandatory or not. How do we enable validation, assuming two different 
    kinds of validation - RDF-type and XML-type.

Corey: Richard, you have hit on the crux of the problem. That is why we
    separated out the constraint language. But this is very incomplete. I like
    thinking of DCAM/DSP as a single abstraction that talks about how to map
    graph-based metadata into constructs that are more validatable. Creating a new
    concrete syntax on top of RDF/XML that allows validation doesn't seem like a
    good goal. Rather, how to construct using RelaxNG, or Pellet (which I do not 
    fully understand).
    
Jon: The method of validation shouldn't matter. Not on top of RDF, but alongside RDF.
    should define a metadata record in the abstract: what is being described and what 
    properties describe it in a 'closed world'. What the constraints on those properties 
    are in a 'closed world'. And how to describe those 'closed world' things to the rest 
    of the world.
    
    Corey: jonphipps++

Richard: Harder in an XML environment to do ontology sorts of things.
    Different technologies have different types of validation. Syntactic versus
    ontological validation: very different things.

Diane: But isn't what you can do in a particular syntax part of how you choose
    what syntax to use?

Tom: DCAM is about the syntax bit. Describing "things in my metadata" versus 
    describing "things in the world".
    
Jon: Both XML schema and OWL ontology describe domain-specific knowledge, even 
    when that knowledge domain is based on a 'community domain'.

    Diane: I get that, I was responding more to the 'be everything to
        everybody' kind of requirement I seem to be hearing

Corey: Look at Singapore Framework Document to reinforce what Tom's saying: 
    <a href="http://dublincore.org/documents/2008/01/14/singapore-framework/singapore-framework.png" class="external free" rel="nofollow">http://dublincore.org/documents/2008/01/14/singapore-framework/singapore-framework.png</a>

    Diane: Corey ++

Richard: Perhaps this gets back to my original question about whether Karen's
    list is about DSP or DCAM? One-to-one is a core *constraint* of DCAM.

Corey: Jon was saying DCAM should define metadata record in the abstract - how
    it should look. If you look at SF, DCAM is the foundation for things on the
    right side of the diagram (diagrams). Ontology is defined to the left (domain
    model). DCAM used to convert ontology into record-like objects. Maybe this
    requires Pellet, maybe XML, etc. My big use cases are SOLR and Lucene. We want
    to be technology-agnostic.

Jon: You create and validate metadata as records, you distribute and aggregate
    it as either records (XML, marc21) or collections of statements (RDF, named
    graphs) or both. DCAM stradles those activities. That's its value.

Corey: Basically understanding the syntactic needs of a particular application
    (and whatever validations and linting tools you have in that environment) and
    mapping a domain model, defined in a domain model and ontology, into that
    application specific environment. In short it *has* to be implementation 
    syntax agnostic (but still based on the RDF data *model*).

Richard: Put "application profile" sorts of things into DCAM itself?

Jon: We should work hard at not conflating the requirements of creation/storage
    and the requirements of distribution/aggregation. RDF by definition exists in
    an 'open world'. This is intrinsic to the RDF model. DCAM describes a domain model, 
    a 'closed world' by definition. This is intrinsic to the DCAM model.

Diane: If you look back at what libraries traditionally done - cramming things
    instead of one-to-one. What Jon is saying about where records and aggregations
    fit into this is very important. I have used DCAM in teaching. It changes the
    way we think about what a record is, and makes it easier to explain. I like the 
    "nested boxes" diagram of DCAM.

Gordon: Different librarians have different ideas of what constitutes a
    "thing", so Richard's dark pattern example is actually widespread practice.

Richard: How are we using "open" and "closed" worlds here? My understanding of
    these terms is about completeability of reasoning about records, but it seems
    like there is a different sense here? Or rather about "representations" - it
    is so easy to slip into talking about "records".

Corey: See Roy Tennant's blog post at [1], and especially Ed Summers's response:
    "RDFa + Schema.org" versus "Microdata + Schema.org" is a false dichotomy.
    Conflating carrier with [carried]. Express things built on RDF graph, but publish 
    in microdata. If DCAM also supports this idea - "here's how to construct HTML5 
    microdata" - that's the kind of guidance we need.

    Jon: Corey++
    Aaron: Corey++
    Gordon: Maybe Microdata needs a DC application profile?
        Corey: @GordonD: I'd argue yes. But I'm not sure what that looks like...

    [1] <a href="http://www.thedigitalshift.com/2012/02/roy-tennant-digital-libraries/why-microdata-not-rdf-will-power-the-semantic-web/" class="external free" rel="nofollow">http://www.thedigitalshift.com/2012/02/roy-tennant-digital-libraries/why-microdata-not-rdf-will-power-the-semantic-web/</a>

Jon: It's also about 'validation'. We are talking about records when we talk about DCAM.

Jon: @chrpr Microdata vs. RDFa is an implementation detail to which the DCAM should be 
    agnostic.

Richard: Jon, validating an instance as conforming to some syntax seems closed,
    but I don't think this necessarily closes an "open" world for other kinds of
    reasoning. Microdata is just another example of representation.

Jon: Richard, metadata exists both within my world and outside my world. Within
    my world _I_ say what's syntactically valid and logically consistent.

Richard: Closed world also seems important to traditional IR and library practices. 
    I.e. being able to infer that if I don't get a search hit means there isn't a 
    resource that meets my query.

    Jon: Outside my world, others say that about metadata in their own context.
        My personal notion of consistent and valid _means nothing_ outside my
        domain, but it means everything to me.

    Richard: Jon, but isn't DCAM/DSP, etc. a way for you to tell me what you 
        think is valid? for the purposes of interoperability?

Tom: With "Dublin Core application profile", are we talking original Dublin Core fifteen? 
    Do these need an application profile of their own? A Microdata-based AP? That raises 
    the question: "are these the right 15"?

Diane: Corey, don't ask questions you don't want an answer to, eg 'the 15'.

Corey: What's the use case of a generic DC-15 application profile? Answer: OAI-PMH.

Diane: We've been talking about a separate AP for the 15 for a long time, should be separate 
    from DCMI Metadata Terms.

Richard: OAI-PMH seems dead.

    Diane: Richard, I don't think OAI-PMH is dead. It never was the ginzu knife
        people wanted anyway.

    Richard: Diane: , what I mean by that is there doesn't seem to be any new
        development going on. I think it will continue to be used for a long time
        out.

    Diane: In a coma maybe.

Corey: Schema.org microdata could use APs built on top. SOLR application
    profiles. Set of good practices how to map triples. Even EAD - how to extract
    triples from.

    Richard: i.e. corey's suggestion of updating the OAI-PMH DC schemas to include
        Qualified as part of the basic syntax.

Jon: Once we start sharing metadata, then both of us need to be able to apply
    our personal notion of valid and consistent to each others data.
    We either need to a priori agree (ancient practice) or be able to communicate 
    our domain knowledge about valid and consistent in order to reconcile differences.
    That communication is facilitated by a syntax-agnostic DCAM.

    Richard: Jon, true, but I'd rather not have to guess what you thought was
        valid, even if i apply my own notion.

Tom: Carrying forward the ACTION from Kai, who could not be here today:

        ACTION: Kai and Tom to work on technical part in wiki, e.g.:
            <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Tech</a>
            <a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision</a>
            <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Scratchpad</a>
            <a href="/mediawiki_wiki/DCAM_Revision_Graphics.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Graphics</a>

    What about the ongoing action on Richard?
        
        ACTION: Tom and Richard to put placeholder for introductory text into wiki document
            at <a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Draft</a>.

Richard: In order to write an introduction, we need a bit more consensus. We
need a better tie-in with Interoperability Levels.

ACTION: Tom distribute Doodle poll. 

    Note: ACTION completed 2012-02-29 - see poll for next DCAM call in the 12-23 March
        window: <a href="http://www.doodle.com/ikx4236dmd7bqdtn" class="external free" rel="nofollow">http://www.doodle.com/ikx4236dmd7bqdtn</a>

Jon: True. What's valid and consistent to me means nothing to you _even if_
    we've agreed on things like format. It's a matter of negotiation and
    reconciliation. Applying your notion of valid in your domain to data that may
    have been provided by me.

Corey: jonphipps++ negotiation_and_reconciliation++

Diane: Task-oriented stuff might be better in user documentation.
    In terms of examples in Karen's list, Gordon's too - but not the same as
    user tasks. These are more use cases for things we know we must be able to
    express.
    
Richard: Jon, it seems that trying to get everyone to use fixed approaches
    (i.e. everybody use Dublin Core) just leads to people applying their own
    understanding of DC that is opaque to me as an aggregator.
    Conversations about user tasks sometimes get bogged down.

    Jon: Diane, task orientation and use cases are a good way to drive
        requirements and to determine if the spec satisfies. You're usually the
        person complaining that practitioners don't have enough say in these
        'abstract models'.

    Diane: Jon, not sure we've identified who the 'users' are yet--I don't
        think they are who we normally think of as users.

Richard: Because a data provider's sense of valid isn't available to me, I need
    to do a lot of work to figure it out from patterns in the instance data.
    I'd like to see DCMI find ways to make it easier for data providers to share 
    their perspectives on metadata.

    Jon: Richard, that's why you need a DCAM from me expressed as a validation
        schema and an ontology.

    Diane: yup, agreed

    Richard: Jon, a DCAM? or an AP (which was built using DCAM)?

    Jon: Richard, I need a schema. You need an ontology. We both could use a single
        implementation-agnostic abstract model (DCAM) to define those things.

    Richard: Thank you, Jon, it seems like a hard task to be agnostic, but I
        appreciate the challenge of trying to think through this.
</pre>

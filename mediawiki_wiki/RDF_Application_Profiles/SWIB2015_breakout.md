---
title: SWIB2015 breakout
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RDF_Application_Profiles/SWIB2015_breakout.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 30 November 2015, at 14:25.  
This page has been accessed 8,754 times.

<pre>
Session name: RDF Application Profiles 
    **Important note:** This session has been conceived as a face-to-face meeting of a pre-existing task force. But **everyone at SWIB is welcome to discuss with us!**
    Two years ago, the SWIB conference has been instrumental in creating the "RDF Application Profiles" Task Group (/archive/mediawiki_wiki/RDF_Application_Profiles).
    With the recent publication of its reports on use cases and requirements, the task group has completed an important milestone of its charter. We suggest to regroup and think of most important options we may want to continue working on.
    We'd like to propose a somewhat directed discussion of the related W3C work, both SHACL and ShEx, with the goal of discussing: 
1) Do either of these replace the DCMI DSP? 
2) Are they compatible enough with the DCMI DSP that we can make connections? 
3) Do they fulfill our stated requirements for application profile functionality? 
3) Do we, as DCMI, want to put our support on one or both? 
4) Are there other developments that we should be watching? 
and finally 
5) What does this mean for the DCMI RDF AP group? Have we completed our task, or do we see more that we should do given our discussion? 
    
    Suggested Reading:
        [1] http://w3c.github.io/data-shapes/shacl/ SHACL working draft
        [2] http://arxiv.org/pdf/1510.05555v2 Shape Expressions Schemas

Attendants: Antoine Isaac, Stefanie Rühle, Karen Coyle, MJ Han, Lars G. Svensson, Valentine Charles, Kai Eckert, Marc-Antoine Nüssli, Tom Baker, Simeon Waerner,Enno Meijers, Christina Harlow, Jana Hentschke

Link to DCMI task group on RDF AP: /archive/mediawiki_wiki/RDF_Application_Profiles
Group deliverables: 
    /archive/mediawiki_wiki/RDF_Application_Profiles/UCR_Deliverable
    /archive/mediawiki_wiki/RDF_Application_Profiles/Requirements

======
History of work so far:
   Issue of how you validate RDF kept coming up
   W3C meeting on validation, Tom Baker and Karen Coyle discussed concept of DC Application Profile
      2 day meeting with people giving presentations, diff communities, environments
      Became impetus for W3C to start a standards path for RDF validation
   W3C group on RDF Shapes Began in 2014
      Karen is representing DC on that
      Other members tend not to be (only) cultural heritage
    
    SHeX was the first proposal from W3C. Its approach is that it validates a graph. ShEx is a W3C member submission and not on the standards path. 
    Notation like REGEX 
    There is a test annotation and there is a space where you can play with SHeX
    http://www.w3.org/2013/ShEx/FancyShExDemo
    And another one at http://rdfshape.herokuapp.com/
    
    SHACL - current RDF Validation proposal on W3C standards path 
    SHACL is written in SHACL and depends on SPARQL (elegant at the back end but ugly for the end user and rigorous in the application). and offers extension points
    The only implementation of SHACL so far is in Topbraid (proprietary )
    http://www.topquadrant.com/tools/modeling-topbraid-composer-standard-edition/
    
    Prior to those two, DSP constraint language (http://dublincore.org/documents/dc-dsp/), specification developed within DCMI but which has never been formalised as a machine readable language. 
        BIBFRAME profiles are based on this
        very simple metadata profiling implementation
        never got coded, but allows you to say these are my properties, constraints on properties, what metadata looks like
        fewer constraints than what you find in ShEx and SHACL
    
======

Question for DC and others: As cultural heritage community, should we throw weight to either of these, whether either will be useful
     At recent DC meeting, speakers/reporters came to conclusion it doesn’t make sense to have just 1 validation language. Having multiple for different use cases and that’s fine
     Another approach: DSP-CL could be front end on either SHACL and ShEx, presenting users a simplified view
    
As presented by Kai Eckert and Thomas Bosch at DCMI2015 we might not have to choose one language: http://dcevents.dublincore.org/IntConf/index/pages/view/abstracts-15#Bosch

=====

What should this breakout focus on?
    Dublin Core group would like to have of where they/we fit in - vote for one of existing options, develop something else
    DC group has been working to make sure their needs are covered

    Response: Questions like how do you link your data to such a profile - whichever language/method used - are open. Does this affect interoperability in choosing one language? 
        People have likened SHACL to XML Schema, it's not necessarily with same documentation/direction you’d have in an application profile - at least, as envisioned by DC. 
        Profile is meant to be something you present to people and it include the human explanation of that. SHACL is predominately code. There can be comments on shapes, but it doesn’t have same spirit of application profile. So idea of application profile front end, then data passed to something like SHACL engine to have heavy duty validation take place.

Kai: SHACL only tackles the constraint/validation part and not the broader context we are also interested in.
    There should be machine-readable links and actionable AP 
    Maybe we need additional tool to get the human readable version of a machine readable AP
    We need a mechanism to communicate about our data (validation errors but also other type of requirements) 
    Something perhaps missing from W3C groups. We’ve got perspective of communication here - balance data validation and telling people this is how our data works.
    
Question of requirements: how would a data consumer understand profiles? do we need to roll back to review this again, have this question inform going forward?

Valentine: we were discussing about ways (for data consumers) to discover the 'shape' of a specific dataset

Serving various flavours of data

Lars: negotiating shapes as we currently have for different serialisation
    HTTP negotiation, possible headers for Shape/Accept-shape
    different communities that use different profiles - when client says they want this resource, header negotiation can say ‘do you want bibframe, ld4l, etc’ which is orthogonal to ‘do you want rdf/xml, ntriples, etc’
    
There's the opposition between a language of validation and a language of 'this is how i want my data to look', more part of a social rather than a technical contract. 
Stefanie: Still, We need to check if SHACL or ShEx satisfy the validation requirements the group has put together (we have many)
Kai: Primary requirement is to have one URI for one profile and then it could include layers such as a validation layer handled by SHACL. 

Relationships between profiles:
   Hierarchical relationship vs a more generic notion of provenance

Problem of generating (and serving) presentation-focused 'flavours' of data:
    This could be one of the layers.
    Cf what happens with the IIIF presentation API that publishes some of the metadata for objects, for presentation presences

Side discussion: validation in SHACL:
    There is place where validation occurs: ‘shacl engine’. You feed data into that.
    so in a way there are 2 parts - data feed, validation.
    we want to be able to express data requirements, how the data gets validated.
    an example of 'meta' requirement tricky to handle: whether to validate open or closed
    (=SHACL vs SHeX in terms of approach; one is per default open, the other per default closed). 
        Example: say my profile has dc:title, dc:subject, then graph has dc:title, dc:subject, dc:creator, is this valid?
        open: yes (default in SHACL) = check if there's data that fits my profile + ignores rest
        closed: no (default in ShEx) = check if there's data that fits my profile + nothing else allowed
    This is one of differences showing need for interface to help users navigate such issues
    Yet only interface now for SHACL is Topbraid, which has form to fill out. 
    So question - what options do we want + want kind of interface do we need to have?

Want to document constraints on shapes as well as constraints on individual properties
SHACL has human representation of constraints and messages, as well as some metadata on shapes
    A recent win, from last week!
    But it's a bit tricky

The group would be right in investigating whether SHACL can be really leveraged to meet the community requirements in a workable way.
Kai: Using SHACL as an implementation layer.
On top of it we need something else. DSP or simpler.

Side discussion: SHACL &amp; RDFS
    If you’re using SHACL, you need to use SHACL, doesn’t fully comply with the semantics RDFS
    SHACL Turtle file: object-oriented validation in RDF
    In SHACL code, says something like example min-count is a property
    There is no place in SHACL to put something as simple as dc:title, because it all has to be done in SHACL

Kai: we need a (RDFS) description of classes and properties, and next to it expression of constraints (simpler than SHACL)

SHACL mechanism / extensions to create high level constraints?
    via SPARQL queries? 
    SHACL has templates (http://w3c.github.io/data-shapes/shacl/#template-constraints) - way to create new kind of constraint
    Q: Is it an extension to constraints at the same level, or to create higher-level of the constraints in the basic SHACL?
    A: not really clear is that its assumed you can name and share these, but karen doesn’t see mechanism in there.

[Antoine counting 21 participants after one hour]

=====
Recap of priorities

Use Cases:
- Negotiation
- Application Profiles identified - original idea, have application profile (bibframe, etc.), explains vocabs used, constraints, etc; but also need URI to identify, place to get resources - this is good use case for negotiation. 
- Next question: what is behind those application profile URIs? This could be the thing that you validate on (function is what kind of data you would exchange would drive what kind of validation document/language used at that URI)
- Idea of layers - a layered model, and what would be in different layers
-- one layer: SHACL engine that validates
-- what other layers between user and validation?
-- Do we also want some kind of provenance data in profiles to lead back to profiles that were made into/use to make other profiles
--- within profile provenance
--- perhaps (probably!) formal relationship between profiles or between profiles and vocabularies 
     ("this profile is seen as subset or specific form of more general vocabulary, and have those links available").
-- once you’ve validated data, how do you know what validated it? 
-- how to do you go between validation + instance data?
- User Interface
- Simple List properties/classes so can have some kind of local view of ontology, constraints 
--- something that is easy, that can be communicated, that can write on restraints that go beyond rdfs - and this is doable

To Do:
Continue doing the work discussed today in the DCMI group 
- 1. take DC requirements and see if languages from W3C group (SHACL and maybe also ShEx) can cover them
- 2. start working on dcmi/dsp to shacl implementation
-- for DC and other community, SHACL can be a black box, we don’t intend to interact directly with its internals
-- There is SHACL validation, we want to be able to send profiles against it and receive results
-- If the point of the SHACL initiative is being driven by ‘hard core SPARQL types’, we can translate everything into SPARQL. 
- 3. at same time, extend dsp as/if needed
</pre>

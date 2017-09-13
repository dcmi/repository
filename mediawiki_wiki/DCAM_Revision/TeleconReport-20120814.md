---
title: TeleconReport-20120814
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120814.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 14 August 2012, at 19:22.  
This page has been accessed 98,626 times.

<pre>DCAM 2012-08-14 telecon - report

Identifier: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120814.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120814</a>

Present: Tom, AaronR, MichaelP, MarkM, Antoine.

Tom: DC workshops started developing a metadata model before RDF
     existed and for awhile they developed for awhile in parallel. Schemes (1997)
     evolved into Encoding Schemes (2000), which came to be 
     distinguished as Vocabulary Encoding Schemes (something like SKOS
     Concept Schemes) and Syntax Encoding Schemes. DCAM 2007 said 
     Syntax Encoding Schemes are RDF Datatypes.

     Recently, the focus in this discussion has been on Syntax Encoding
     Schemes as things which can provide context, potentially, to things
     ranging from XML markup to ISBD strings formatted by punctuation, or
     to specify how they can be parsed.

     In RDF, datatypes are something more specific: they have a lexical space,
     the things of which (such as a date string formatted according to certain
     rules), map to exactly on value in a value space (e.g., a date seen as a
     conceptual entity). Some of the things we have been discussing, in my
     opinion, stretch the definition of RDF datatypes too far. What I'm
     hearing, though, are important requirements for being able to point to
     some kind of specification that says how to parse, generate, or interpret
     some bit of metadata.

Antoine: I don't like focusing on SES, given the examples. I see the motivation
     and requirements, but I am concerned that we are stretching things beyond what
     we should be doing in DCAM. It would be difficult to create specifications for
     parsing ISBD area strings. In general, I see the point for having simple SESes
     -- things with one or two components, but more complex things are difficult to
     handle.

     This reminds me of XML datatypes. You can create your own, just like you
     can create Syntax Encoding Schemes. But not many people are doing these
     because they are difficult to make.

Aaron: I agree with Antoine. I like the distinction between SES (which equals
     rdf:Datatype) and something a looser, maybe for mapping from one serialization
     to another such as from MARC to ISBD. I think this should be separated from the
     notion of an SES.

Tom: The ISBD case is interesting. A string created accorded to ISBD is a
     serialization, and it is based on rules. I can see a need for associating an
     ISBD publication statement with a URI that explains how to parse it. On the
     other hand I can also see the need to define a DSP, consisting of a set of RDF
     statements, which can be used to generate an ISBD publication statement string.
     I see a need to _encode_ from a DSP to an ISBD string, or vice versa to _decode_
     an ISBD string to a target DSP. However, I think the specifications that
     describe this relationship are far beyond the scope of RDF. Are we on the same page?

Antoine: Yes.

Tom: Do we see a requirement to be able to move between DCAM (RDF) statements
     and other serializations, and to be able to point to specification which says
     how a non-RDF piece of data can be decoded into RDF? And the other way around?

Aaron: I agree with the requirements - reference a profile that describes the relationship.

Antoine: I'm sceptical. It sounds like we're trying to take on the general mapping problem,
     which is impossibly complex.

Mark: I lean towards Antoine's view: it would be a very tricky problem to handle.

Tom: Mapping techniques are all over the map, indeed - by necessity very ad-hoc.  
     But what if we say that mapping techniques, per se, are out of scope of DCAM.
     Does there remain a need for a property which associates a blob of data to some 
     kind of mapping profile?

Aaron: I think the question is do we provide people with a space and syntax to
     describe these mappings where there is some basic agreement, being careful to
     segregate it from the DCAM data model.

Tom: Something like a documentation property.

Aaron: I agree with Antoine. We should be careful to separate this work from
    the Abstract Model. Trying to bake that into the model would be a nightmare.
    But it would be useful to have links. Tom, I liked your posting which
    re-framed the scope of DCAM instead of focusing on SES [1].

    [1] <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1208&amp;L=dc-architecture&amp;P=8494" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1208&amp;L=dc-architecture&amp;P=8494</a>

Antoine: Agree.

    Michael (IRC): Sorry I, got disconnected and cannot dial back in. I agree that this
        is not an RDF datatype / SES, but how about trying to deal with cases like ISBD
        as language subtags following BCP 47? E.g., "en-x-isbd"

        exstaff:85740 exterms:age "pumpkin"^^xsd:integer
        we could have ex:book isbd:published "pumpkin"^^isbd:pubStatementType
        Why not ex:book isbd:published "pumpkin"^^@en-x-isbd?
        Why not ex:book isbd:published "pumpkin"@en-x-isbd?

    Aaron (IRC): So then: ex:book isbd:published "pumpkin"^^xsd:string

Tom: I still want to come up with a solution for ISBD. Say we have some
    DCAM/RDF statements and there are rules for serializing them -- rules 
    that lie outside the scope of DCAM. However, DCAM could provide the 
    property used to link to the rules that give such guidance.

    It would be different from Antoine's example. It's not an RDF datatype.
    It's more like transformation rules that say what to do with something that
    follows a DSP. The details of this would not be in scope of DCAM.

Antoine: OK, what you want is a mapping to a graph? RDF datatypes map to
    values, but you want to map to a graph, the limitation of RDF datatypes being
    that they cannot map to graphs?

[Aaron and Michael rejoin after their calls dropped.]

Tom: An interesting way to put it. Take an ISBD Publication Statement.
    Let's say we want to be able to package the content of that statement as a
    set of statements in a Description Set Profile. Then we want to use that
    to serialize the publication statement as a string. We need to express
    this relationship between the string and the intellectual content -- to
    point to a specification, identified with a URI. We don't want to put that
    URI into the place where RDF datatypes are indicated in RDF serialization,
    because this would make them be seen as RDF datatypes. We might call it
    a mapping profile. DCAM need not say anything more about the nature of that
    mapping profile. It would be pointed to by a strictly documentational sort of
    property. That documentation property (for expressing the relationship)
    could be part of the DCAM vocabulary.

Aaron: I agree. Conceptually it makes sense. There could be some reference to
    mapping rules in the data itself, and that reference could be part of DCAM. But if you
    are combining several mapping rules, how do you tie specific specific mappings
    to a particular statement -- i.e., if you are combining several mapping rules
    in the same record? Maybe that is simply not good practice?

Antoine: It could be up to the implementer and the specification. ISBD tools to
    encode or decode. There could be an ISBD Publication Statement Mapping Profile,
    and then a general ISBD Mapping Profile.

Tom: DCAM's Description Set Profile (DSP) has generally been
    equated with the "Application Profile" -- i.e., the description of an Entire
    Record. The DSP is the core of an Application Profile, at any rate as defined
    by the Singapore Framework.

    But within a "record", there are record-like things at finer levels of
    granularity. The notion of DSP is applicable at different levels of
    granularity. One might have a DSP for a single string value such as an ISBD
    Publication Statement string. The DSP could be used as a mapping target
    for parsing a string out to a set of statements. Or a DSP could be used
    for serializing a set of statements as an ISBD Publication Statement
    string.

    What is perhaps needed is a way to express the relationship between that DSP
    and those various non-DCAM strings and serializations out there -- in a way
    that is different from an SES or VES. That is what we should be talking about.

Antoine: I think we all agree. Is there really a strong agreement for the term
    "mapping profile"? I would prefer something like "encoding profile" or
    "decoding profile" or "serialization profile".

Aaron: Yes, something that makes clear that it encompasses both "encoding" and
    "decoding"; which makes clear you have this point of departure and are
    serializing out.

Aaron: Agree and think we are making progress on scoping this. What can DCAM
    do and what does it provide? Some sort of "validation profile".

Antoine, Tom, Aaron: serialization profile++

Mark: Sounds good.
</pre>

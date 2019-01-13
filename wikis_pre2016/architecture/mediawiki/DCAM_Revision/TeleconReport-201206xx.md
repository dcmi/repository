---
title: TeleconReport-201206xx
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-201206xx.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 8 June 2012, at 18:02.  
This page has been accessed 126,080 times.

<pre>DCAM telecon - Report - 2012-06-08

This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-201206xx.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-201206xx</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-201206xx.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-201206xx</a>
Attended: Tom, Karen, Antoine, Aaron, Richard, Jon, Gordon, Mark, Corey

----------------------------------------------------------------------
Summary of actions taken

    ACTION 2012-06-08: Corey to put up Doodle poll for early July call.

    ACTION 2012-06-08: Aaron to propose archival example.

    ACTION 2012-06-08: Corey to push discussion on dc-architecture to consolidate
    the progress made on this call.

----------------------------------------------------------------------
Accepted minutes of previous call 

     2012-05-15 <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120515.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120515</a>

----------------------------------------------------------------------
Design patterns
    <a href="/mediawiki_wiki/DCAM_Revision_Design_Patterns.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Design_Patterns</a>    

Gordon: Clarification on minutes: "ACTION: Gordon to put reference on wiki."
probably refers to ISBD. This is done.

Tom: Moving on to Design patterns. Does "order of elements" question in ISBD
make it out of scope for our goals? Unsure it does.

Karen: What is in DCAM and what is in Application Profile? Let's start with
the ISBD Publication Statement design pattern.

Gordon: In ISBD, we have parallel situation in MARC. We can anticipate the same
thing in RDA. Inidividual elements that have importance on their own, but for
various reasons librarians like to deal with combinations of these elements.
The variation in Karen's Name example is that elements need not be present, but
when present they are required. Aggregation statements are needed because it
is necessary to differentiate between two places of publication related to same
publication, versus two places related to different publishers. Need to
identify statements as well as separate instance components separately. Cannot
disentangle from the repeatability issue. If Publication Statement is repeated,
then you have two publishers. These aggregated statements generally needed to
be manipulated as a whole piece of metadata. But also need to be broken down
into component parts. When this repeats, will be necessary to identify
statements as well as constituent components. This example crops up all over
library MD schemas. And in ISBD, more than one level of granularity.

Tom: You stopped short of talking about presentation order.

Jon: See <a href="http://www.dlib.org/dlib/january10/hillmann/01hillmann.html" class="external free" rel="nofollow">http://www.dlib.org/dlib/january10/hillmann/01hillmann.html</a> "RDA
Vocabularies: Process, Outcome, Use", section titled "Aggregated Statements".

Corey: Nooooo! Please, we must stop relying on punctuation to have semantic
meaning!!! Please?

    Jon to Corey: It's the rules that require it. Aggregated statements are
    simply strings and the semantic meaning is in the aggregate.

Gordon: Sometimes the order is absolutely essential. In other cases, delimited
by punctuation. In traditional metadata schemas. Once we disaggregate, then
clearly the sequencing and order important. Place of publication comes first.
Sequencing is governed by cataloging rules. Cataloging tradition. This is
mainly display oriented. We are reaching back into the murky depths of card
catalogs. All you saw was the instance values. It was assumed that the users
would know where to look for place of publication first, then publisher.

Jon: Also ordering.

Gordon: No, these are not access points, just parts of descriptions. Mainly a
layout issue. So the order is important.

Karen: This is why I offered the other example - the enumeration statement for
a journal article - volume, number, date - taken together. But this is a purer
example because it is semantic but not display oriented.

    Aaron: @kcoyle +1 on not designing for display.

Jon: But despite the fact that it's not an 'access point' it's still very
similar and still representative of a syntax encoding scheme. It's a definition
for encoding a string.

Aaron: Name heading example? I mean this:
<a href="/mediawiki_wiki/DCAM_Revision_Example_Name_Heading.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Example_Name_Heading</a>

Karen: I proposed a pagination example, but nobody responded so I didn't write
up. Name has display issues but no algorithmically derived order.

    "I think that a better example would be the enumeration elements for a
    journal article citation: volume, number, date, pagination. These can be
    re-combined in various types of displays, e.g.  

        v. 1, n. 7, March/April, 1997. pp. 156-158 (1997)1:7&lt;156&gt;. 
        
    I could write this one up if people think it is useful."

    From: <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1205&amp;L=DC-ARCHITECTURE&amp;F=&amp;S=&amp;P=31694" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1205&amp;L=DC-ARCHITECTURE&amp;F=&amp;S=&amp;P=31694</a>

Gordon: Agree. The thinking in ISBD DSP is that display issues should be
handled by an AP. Second use cases for aggregated statements: that they are
repeatable. If they are dealt with individually we get the wrong assignments of
[??]. Traditional: surname first.

Gordon: [???what???] = place of publication with name of publisher in separate
statements.

Karen: Our goal? To me, in terms of DCAM: to decide whether a SES should include order.

Jon: SES is quite literally how to encode a string.

Karen: Date is a single string.

Jon: SES is a single string.

Gordon: Separate elements at one level of granularity, but at aggregate...
If we regard SES as single literal - the object of a triple - then for display
and punctuation issues this is purely an AP issue - you can for example
conceive of a perfectly useful literal coming out as a string. Nothing
intrinsic about order except syntax imposed by cataloging standard. But if we
look at repeats, then they need to be kept in box or bundle. Each element has
its own semantics. But in some instances these literals have to appear in a
certain order.

Richard: But a literal with meanings supplied by the encoding scheme? (i.e. ISO 8601).
Rather than meaning supplied by the metadata schema itself (i.e. Dublin Core)?

Jon: "Each syntax encoding scheme is a class (of literals)."
<a href="http://dublincore.org/documents/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/abstract-model/</a> Syntax encoding scheme =
<a href="http://www.w3.org/2000/01/rdf-schema#Datatype" class="external free" rel="nofollow">http://www.w3.org/2000/01/rdf-schema#Datatype</a> "A set of strings and an
associated set of rules that describe a mapping between that set of strings and
a set of resources. The mapping rules may define how the string is structured
(for example DCMI Box) or they may simply enumerate all the strings and the
corresponding resources (for example ISO 3166)."

    Richard: +1 jon

Gordon: See my recent blog post, which uses the publication statement example:
<a href="http://managemetadata.com/blog/2012/05/20/taggregations/" class="external free" rel="nofollow">http://managemetadata.com/blog/2012/05/20/taggregations/</a>

Corey: Bwahahahahah: "DCMI Box"....

Jon: Question: Does this need to be redfined, and if so why? If the definition
is ok, then how does it get expressed in a machine-processable way? Is the
class SES an equivalentClass or a subclass of rdfs:datatype? If it's a
sublass, what distinguishes it? -- I'd like to submit that we supply a way to
provide specific methods for encoding and decoding an SES. I don't think it's
useful to say that a dcam:ses is NOT a subclass of Rdfs:datatype

Aaron: Am I missing something here? Why create a special SES class? Why not
just use rdfs:Datatype?

Jon: Because I personally want machine-processable encoding and decoding
instructions attached to a dcam:ses. DCAM refines RDFS and doesn't mirror it.

    Gordon: @jon +1
    Richard: @jon +!

Aaron: Makes sense to make SES equivalent to rdfs:Datatype.

Jon: Disagree. DCAM value-added. Opportunity for people to define datatype with
specific [], without having to go through IETF guidelines.

Karen: Do you see part of DCAM work to define how to articulate that schema in
machine-actionable way?

Jon: Would like to see Perl/Java encoding scheme...

Karen: What form would they take? Program code?

Jon: Instructions for machines. Do you have XML schema for doing this?

Antoine: Jon +1 BUT THAT'S ALSO WHAT RDF DATATYPES ARE ABOUT. IT'S JUST THAT
NO ONE DOES IT.

    Aaon: @antoine, @chrpr +1

Corey: This is where we need DCAM as both best practices and technical
specification. E.g.: "Use XML schema here".

Gordon: Use case for decoding an SES literal: there are many library records
which are OCRd from catalog cards.

Jon: Why not sub-class it and provide specifics. An SES is an rdfs:Datatype,
but also has additional properties associated with it.

Richard: "In this specification, a datatype is a 3-tuple, consisting of a) a
set of distinct values, called its _value space_, b) a set of lexical
representations, called its _lexical space_, and c) a set of _facet_s that
characterize properties of the _value space_, individual values or lexical
items." <a href="http://www.w3.org/TR/xmlschema-2/#typesystem" class="external free" rel="nofollow">http://www.w3.org/TR/xmlschema-2/#typesystem</a>

Aaron: What different about an X Date? Corey's question is good: examples for
how an SES might look.

Jon?: Example of a piece of software that can encode and decode. Attach XML
schema to that property, for example...

    Corey: jonphipps++

Jon: want to provide some property that says there is some schema for decoding
it. If I want to encode or decode a date, I need to find some code that will do
it.

    Richard: @jon +1

Karen: Yet it sounds like dangerous territory.

Corey: That's awesome - I like this idea. Going back to ISBD example. Linters
that deal with MARC data - parse and verify - "here's code that works with this
SES" - a huge value-add.

Corey: SES notion doesn't contradict rdfs:datatype, but instead enriches it.
Properties around defining this more thoroughly. Building _on_top_ of rdf &amp;
rdfs.

Jon: When I define an SES. In my definition, I will provide .. for your
particular usage, to define a property to say how to encode or decode it. Have
a place you can go to reference them. Matter of having "in this data" that you
just collected, here is how to decode it. Or "here's a way to decode it".

Karen: This feels to me more of an application profile than an abstract model.

Jon: Encoding method and decoding method. What are the methodologies for each?
Dcam:encodingMethod Dcam:decodingMethod - properties pointing to...

Antoine: There is a knowledge structure in that string.

Jon: It's a datatype - an encoding scheme.

Antoine: Should we aim at doing something besides validating it?

Karen: We have moved into the application profile area. Different apps may
encode or decode in an application-specific way.

Richard: Are there examples of other datatypes that are as complex as our ISBD
examples? Existing XML datatypes seem more like simple primitives.

Corey: jonphipps++ (again) DCAM is foundation for DCAPs. Karen's exactly right,
and DCAM has to provide the functionality to make this work...

Jon: We are looking at how DCAM gets used in DCAP. We have a SES. When using a
SES in AP, attach properties to SES "these are my methods". The content of that
property is defined in context of AP.

Aaron: We are talking about subclassing...

Antoine: do not understand encoding/decoding the string to *what*...?

Corey: An application profile builds out data suitable for specific application
environments based on rules and principles defined in DCAM and its related
constructs (i.e., SES, etc).

Jon: [scribe missed]

Karen: Those methods are associated with Application Profiles.

Antoine: *anything* an XML schema, a particular RDBMS (or NoSQL) structure, a
more granular RDF-based format...

Antoine: @corey: I hate that. It's assuming that statements in DCAM are not
only represented by statements. (I mean, DCAM statements)

Jon: Can have my own encoding method. In canonical description of an SES.
Method not required for an SES. Should be defined, made available as part of
SES. Dublin Core SES has ability to associate encoding and decoding methods.

Karen: This brings DCAM closer to DCAP than it was before.

Jon: Providing properties useful for defining DCAP. DCAM/2007 leaves too many
things undefined.

Antoine: They are still statements. They work the same way when encoded to be
part of the RDF Graph. But the reality is, our implementation details are never
all going to be purely RDF based. We're defining a universal interchange
format, I think...

Jon: DCAM/2007 also does not differentiate itself from RDF. It provides a few
additional semantics but replicates alot. We should be looking at how existing
semantics fit in a "true" abstract model - how data gets expressed in different
models.

Antoine: @corey: RDF is about encoding as little information in the string as
possible. That's why datatypes are not used much. I don't think DCAM should
have a different approach.

Corey: This fits a usecase we have at NYU - subclassing BibliographicCitation -
preformatted for how they look in displays. Sits alongside unformatted.

Corey: Antoine, I agree, though I think the problem is that RDF basically
excludes those who have use cases too complicated to fit into that space.

Aaron: To bring this back to design patterns: how would this be used to
express ISBD examples?

Corey: DCAM is being designed to offer a _pragmatic_ layer on top of RDF and
the Semantic Web's idealism (which sometimes borders on dogma and pedantry...)

Jon: Looking at Pub Statement as SES - specific set of rules for creating that
statement - those rules could be expressed machine-actionable way. Like in RDA
aggregated statements. Components. Takes properties into single literal that
has specific order, punctuation - but only maybe. In MARC - things that are a
bear to decode.

Antoine: @corey, I agree, still it's about sending messages. To stretch a very
liberal approach to its limit, RDF/XML is a SES.

GordonD: ISBD follows the RDA approach: all components of an SES are RDF
properties.

Karen: The encoding is not really machine-actionable. Decoding is closer to
that.

Antoine: @corey (so we should put some boundaries to how liberal we can be).

Aaron: Only makes sense when the Publication Statement is a string, not when
broken up -- so it is a fairly specific usecase.

Karen: In every case where you have multiple things, but the whole can repeat.
You can have multiple titles with multiple subtitles. Alot of this stuff goes
away when we use identifiers for things, but not all. Alot of what we have
should be replaced with URIs.

Corey: I like that this is creating guidelines for people who need to do
complicated things. Really complicated things may not be best practice. Giving
an out for people who want to do crazy things in silos. Fine to explain how to
do this best, but this is not the best way to use RDF.

Jon: Part of question is whether we are just talking about RDF.

Gordon: We are not starting with a clean slate: these examples are what we
have, not what we want.

Antoine: @jon: we can replace RDF by XML in this example.

Karen: This is why I was wary of using ISBD as an example. Not a good use case
because this style is no longer best practice. Would like to think of more
defensible use cases for SES.

Antoine: @jon (or anything that conveys data through a string...).

Antoine: But it's like breaking a date atring into day/month/year, each of
which has it's own semantics and is a distinct data point and has an entirely
different meaning when expressed as month/day/year, both of which are perfectly
valid date datatypes.

Gordon: Support from DCAM/RDF/whatever is not going to stop ISBD, MARC, RDA
becoming better practices.

Karen: @Gordon I suspect that ISBD will die some time after MARC is put to rest.
    
Gordon: But it may encourage those communities to listen, learn, and do quicker
than might be otherwise.

Antoine: @Jon: yeah, it's about finding the right balance between what only a
couple of people would be interested in parsing/validating in a specific way,
and what one think is worth communicating as formal (DCAM) statements.

Gordon: These communities need evolution, not revolution: the past must be
secured before the future is explored.

Antoine: what I'm trying to get away from is having an SES 'defined' by a set
of written instructions (like taxonomies so often still are) and having the
ability to provide instructions to a machine to process it.

Jon: Antoine, RDF/XML is an SES in the broadest possible sense.

Antoine: Jon, yes, I think we'd need some example that are still on the "good"
side of the balance to strike.

    Aaron: +1 @antoine__

Antoine: @rubinsztajn: please no EAD as one SES

    Aaron: @antoine: Ha!

Jon: We have a bunch of SES examples in RDA too.

Corey: Thanks everyone! Super productive!!

ACTION 2012-06-08: Corey to put up Doodle poll for early July call.

ACTION 2012-06-08: Aaron to propose archival example.

ACTION 2012-06-08: Corey to push discussion on dc-architecture to consolidate
the progress made on this call.
</pre>

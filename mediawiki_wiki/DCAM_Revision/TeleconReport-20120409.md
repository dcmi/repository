---
title: TeleconReport-20120409
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120409.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 15 May 2012, at 03:47.  
This page has been accessed 132,591 times.

<pre>DCAM 2012-04-09 telecon - Report

This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120409.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120409</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120409.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120409</a>

Present: Tom (chair), Aaron, Stuart, Gordon, Diane, Michael, Corey, Karen

----------------------------------------------------------------------
Minutes of previous call on 22 March

ACCEPTED <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120322.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120322</a>

----------------------------------------------------------------------
DCAM Issue tracking
    
Tom: Premature to use GitHub for DCAM issues, but we have started to use it for 
    the Schema.org Alignment TG - see
    <a href="/mediawiki_wiki/Architecture_Forum_Issue_Tracker.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/Architecture_Forum_Issue_Tracker</a>

----------------------------------------------------------------------
Gordon's examples

Action was:
    ACTION: Gordon and Aaron to put examples into the wiki.

Links:
    <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1203&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=55080" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1203&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=55080</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements</a>
    <a href="/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions.md" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions</a>
    
Gordon: The three examples posted are compilations of things I had mailed to
list earlier. First, Publication Statement. Example of something quite
ubiquitous in library MD schema - a bunch of elements need to be brought
together and kept together to form a higher-level "statement". To catalogers,
these higher-level statements are just as real as sub-elements. Unless there
is some packaging mechanism, they can get [disaggregated] and be used to form
false data. These form units. It is important to ensure that elements get
kept together and do not get cross-linked.

Approach being taken by both ISBD and other namespaces - use aggregated
statement approach that Diane, Jon, Karen, and I published last year - is
based on DCAM. <a href="http://dlib.org/dlib/january10/hillmann/01hillmann.html" class="external free" rel="nofollow">http://dlib.org/dlib/january10/hillmann/01hillmann.html</a>
(actually Jan. two years ago!)

Tom: I want to flag that the use of the terms "element" and "statement" could
be confusing -- using terms at different level of granularity. Can the
Publication Statement be conceptualized as an Application Profile?

Diane: No, a Syntax Encoding Scheme.

Gordon: The ambiguity around "element" is deliberate - different schemas
define different levels of aggregation.

Tom: How does one specify a new Syntax Encoding Scheme? How is this different
than specifying the structure of statements as in an Application Profile?

Diane: If you were doing an application profile and using RDA, which already
has SESes... I don't know that it is inherently information that has to be in
an application profile. In RDA, we did it so each of the pieces that we are
using in an SES are declared separately - use together or separately. What we
specified is which pieces in what order.

Tom: Can application profiles be recursive? Can an application profile be used
at the record level but also at a lower level, for defining a Syntax Encoding
Scheme?

Gordon: It works the other way as well. CCDA is looking at the element Extent
in RDA. Outcome, if accepted, would be to increase the granularity and take
what is now a single element and subdivide it into components. There is a
continuum of granularity that will shift as metadata evolves. This will have
an impact on mapping exercises.

Tom speculates that APs could be used to express the aggregation of properties
done as SESes in RDVocab.

Stuart: Does the notion of defining an SES with an AP generalize to _any_ SES?
In effect, wherever you have an element aggregation - an aggregate with
component parts?

Tom: Yes, for aggregates. Maybe not for SESs that are just lists of language tags.

Diane: If you were doing an AP for, say, someone using RDA, you would need to
make a choice between whether you wanted to express those particular
aggregations of data as aggregations, or express them separately and let
people further down the chain aggregate them as they wish. It is like the
basic choice of whether one is using a "string" or a "thing". You are making
a decision and recording it in an AP.

Stuart: Does that negate the notion of conceptualizing an SES as an AP?

Diane: If you are going to aggregate something that is not usually aggregated
by its creators, you could do in an AP, but...

Corey: I'm confused by this conversation. An AP is when you are deviating from
how an Element Set is defined. We should have an Application Profile for DCMI
Metadata Terms.

Karen: Not necessarily deviation -- it could be about adding more constraints,
becoming more specific.

Corey: kcoylenet++ #Yes, adding constraints as well as modifying.

Tom: Prefer to distinguish sharply between underlying vocabularies and the APs
that use those vocabularies. What is the use case for taking an entire data
dictionary (e.g., DCMI Metadata Terms) and turning it into a record schema --
as opposed to making a selection of data elements needed for a specific type
of information? What is the use case for a record format that happens to have
all the properties and classes of DCMI Metadata Terms? Turning
data-dictionary vocabularies into record schemas, one-to-one, unhelpfully
blurs the line between vocabularies and application profiles that use
vocabularies.

Corey: I see three possibilities:

-- My application profile declares that I use a particular term, and any SES
   that is defined in that term.

-- I'm not really using an AP, I'm just using a "default" flat version of
   dcterms, with its included SESs.

-- I'm using a dcterms element, but I'm *declaring* that I want to use a
   different SES, or add one where dcterms does not declare one.

Diane: Corey +1

Karen: People create ontologies. What is the difference?

Aaron: AP outlines specific usage for an institution or project, right? In a
way, the metaphor is: you have a schema and you create an extension schema
that adds elements or constrain existing rules. In an ontology, you are
defining concepts - a different paradigm. Someone wants to use Bibo, Foaf,
DC, and the AP defines how they put them together.

Karen: Except that's exactly what BIBO does. It takes some elements from DC,
etc - what I'm trying to understand is the difference.

Michael: BIBO is not an AP, because it doesn't tell you how a description set
will be formed. It gives a bunch of vocabulary terms and non-normative
documentation, but it doesn't say what is repeatable, what is necessary for a
complete record, etc.

Karen: Simply selecting terms (Ontology) versus adding constraints (AP) - is
that the contrast? An AP doesn't declare new terms -- it's more about reuse?
An ontology can be used for declaring the new terms?

Tom: The difference is that an Ontology describes something in the open world
context; it creates a cartoon vision of things in the world -- a conceptual
universe. An Application Profile describes the Description Set, in a closed
world sense, defining constraints that can be validated.

Stuart: If we go back to original 2000 definition, an application profile does
not necessarily define additional constraints. When you say Application
Profile, you mean the Description Set Profile part, right? 

Corey: A Description Set is a part of an Application Profile. The notion of
Application Profile subsumes the notion of Description Set Profile.  

Tom: Yes, in the sense defined by the Singapore Framework, a Description Set
Profile is the core of a larger set of specifications and user guides that
constitute an application profile. With Gordon's examples -- both RDA Extent
and Publication Statement -- we see examples of things that one group views as
aggregated and another as disaggregated. As Gordon says, the proper level of
granularity is bound to evolve. There is no one right answer. I'm saying
that if the notion of Description Set Profile describes a bounded aggregate of
statements, one could think of defining Description Set Profiles not just for
specifying a record format, but for specifying a Syntax Encoding Scheme. In a
sense, SESs are formats too, only they are serialized (to take the case of
ISBD) as text elements in a precisely defined sequence and separated in a
precisely defined way by punctuation. One could define Description Set
Profiles, potentially, at different levels of granularity.

Diane: Let's try to avoid confusing the issue by saying this. How can we make
the distinction real for people. Difficult to teach.

GordonD: There is only one Turtle - the one that the disc of the world sits on
(with 4 elephants, etc.)

Corey: Tom, you are saying that it is turtles all the way down?

Tom: Well maybe not hundreds of turtles, but between the disaggregated
sub-components of RDA Extent, at one extreme, and statements aggregated into
one Publication Statement, at the other, there are indeed a few turtles, sure.
One person's element is the other person's aggregate, and vice versa. It's
good we are having this discussion because that's the way it is, and saying
there is just one turtle cannot explain it away.

Karen: We need to go back and see why we want to have APs. E.g., to define a
finite world we are working with. I do not want my User Interface spec to be
infinite. Also: to explain ourselves.

Diane: Articulate expectations for people using our data.

Aaron: Is the goal of DCAM to create a paradigm that doesn't limit creativity?

Tom: More to specify bounded metadata record structures that are amenable to
validation. The range of things called "ontologies" is very wide -- arguably,
DCMI Metadata Terms is an ontology. Ontologies are not designed for
validating records, though as Michael pointed out in Pittsburgh, the language
of ontologies can be re-interpreted with closed-world assumptions for such
purposes (the example of Pellett). The boundary between open-world ontologies
and closed-world applications may appear fuzzy. But to bring it back to
DCAM... If DCAM has a purpose, it is (in my opinion) to provide a
syntax-independent expression to the notion of bounded metadata records
validatable in a closed-world way according to specified constraints.

Corey: Of more practical concern: the VIVO ontology is done in OWL. Built
natively on RDF and OWL approach. Doesn't need XML Schema.

Karen: I said Bibo, but let's look at Vivo.

Corey: dc_oai as an AP on dc/dct?

Tom: The DC-15 are often used as a record format (e.g., dc_oai) and they are
defined as a vocabulary. Record formats based on the DC-15 are, in this
sense, implicitly based on application profiles.

Stuart asks Gordon to summarize...

Gordon: In Pittsburgh, I presented: OWL for FRBR and DCAM for ISBD - what are
the differences between the approaches? I think we're restarting a discussion
that began in Pittsburgh and we have a long way to go.
    
Tom: Gordon's examples are a great start. As a next step, we said we'd try to
express the examples using Turtle plus Named Graphs (under discussion in RDF
WG). This would help us define what can be expressed in RDF (plus Named
Graphs), but also what cannot be expressed -- where the RDF abstract model
stops and "DCAM" might start. Then we might try expressing the example using
a schema language that expresses constraints, such as repeatability (e.g., XML
Schema).

Corey: tbaker++ # Where does rdf stop as an abstract model and dcam start...  

GordonD: @aaron, it would be really useful if there were an archives community
example for hierarchical/fonds/collection-level structures.
    
Aaron: I will put up more examples.
</pre>

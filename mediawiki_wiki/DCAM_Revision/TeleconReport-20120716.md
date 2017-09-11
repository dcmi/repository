---
title: TeleconReport-20120716
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120716.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 19 February 2013, at 03:27.  
This page has been accessed 103,978 times.

<pre>DCAM telecon - Report - 2012-07-16

This report: <a href="/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120716" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120716</a>
Agenda: <a href="/archive/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120716" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120716</a>
Attended: Richard, Corey, Antoine, Karen, Mark, Jon, Aaron, Gordon

---------------------------------------------------------------------- 
Summary of actions taken
 
    ACTION 2012-07-16: Corey to put up Doodle poll for August call
     
---------------------------------------------------------------------- 
Accepted minutes of previous call 

     2012-06-08: <a href="/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-201206xx" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-201206xx</a>

---------------------------------------------------------------------- 
Design patterns 
   <a href="/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns</a>
   - SES &amp; "Strings" versus "things"
   - SES vs. rdfs:Datatype

Karen: Pre-question, goals of dcam.

Richard: +1 what are the goals of DCAM?

Corey: Describing best-practices, vs something that can be used for really
cruddy data.

Jon: +1 for goals of dcam, but that's a large discussion seems to me

Jon: What were the original goals? How would we revise/refine those? Or are
there entirely new goals?

Corey: Relationship to the Interoperability levels. Do we account for all
levels, or just the top few?
<a href="http://dublincore.org/documents/interoperability-levels/" class="external free" rel="nofollow">http://dublincore.org/documents/interoperability-levels/</a>

Richard: Original goal seems to have been very similar to the discussion we're
still having now. Syntax for DC within context of an OAI record. Relationship
to RDF. Support for legacy data. DCAM as a bridge between XML world &amp; Graphy
world.

Karen: looking at levels of interop.

Jon: So, from my limited pespective: DCAM *should* represent an attempt to
refine the RDF data model to enhance syntactic interoperability with non-RDF
data models (what chrpr just siad) "On top of the unbounded graphs specified by
RDF, the DCMI Abstract Model layers the notions of bounded Descriptions and
Description Sets, providing a basis for the validation and exchange of metadata
records." emphasis: "providing a basis for the validation and exchange of
metadata *records*"

Richard: desc. sets &amp; level 3 interop as *in addition* to acceptance of /
commitment to RDF...

Jon: RDF has no notion of record, or of validation. DCAM tries to provide a
layer on *top* of RDF to do this.

Corey: Level 3 = DCAM compat; Level 4 = DCAP compat.

Aaron: interested in Level 2, formal semantic interop... if 3 provides bridge
between 2 diff serialization formats, than 2 privileges [scribe missed] 

Jon: implicit vs. explicit support of semantics &amp; RDF graph. Other kinds of
grammatical languages, some of which might lack "record" concept, that we could
build higher level interop on *top* of.

Aaron: ""Semantics" in this sense does not refer to well-formed
natural-language definitions (which is how the word "semantics" has
traditionally been used in the Dublin Core community)." 

Jon: Also, the test therein...

Corey: So, level 2 is all about being able to map TO rdf.

Richard making important point about how much of this predates the RDF named
graphs and provenance work

Aaron: Diff between level 2 &amp; 3 is the open vs. closed world discussion...

Corey: Can best practices also provide a framework for automating the movement
of metadata up an interoperability level?

Karen: agrees, so long as it's not part of the model itself. It's training &amp;
documentation.

Mark: What do we mean by "part of the model"

Corey: Perhaps what we need to do is just let the model acknowledge the "ugly"
practices (anti-patterns), and reference out to other documentation

Richard: DCAP seems to be super heavy weight. Practice seems to be "make a
dcap, then follow it", which leads to lots of consensus building &amp;
specifications before you can do anything. Instead, think of DCAP as a way to
express context of MD records that have been created...
 
Corey: Richard++

Corey: Recognition of constraints &amp; including in the documentation.

Jon: both dcam &amp; dcap as ways to provide documentation that is data-model
neutral. can be used regardless of your data model to provide what constitutes a
valid record. What makes description valid in context of your community.
Communicates this to anyone using any data model to understand your description
of those objects. Once MD from 2 distinct sets expressed as open world, they
should be compatible.

Karen: <a href="http://efoundations.typepad.com/efoundations/2009/10/what-is-simple-dublin-core.html" class="external free" rel="nofollow">http://efoundations.typepad.com/efoundations/2009/10/what-is-simple-dublin-core.html</a>

Karen: Pete's description

Richard: but is RDF a "data model" ? it seems to be a specification of the
formal semantics. I may store expressions that in many different data formats.
(triplestrore based in a RDMS; a JSON document, etc.)

Jon: DCAM represents refine on RDF to support "multi-dimensional interop" --
expressing an rdf compatible model in non-rdf terms. This is what alistair was
tring to do with Son of DC...

Aaron: is dcam (&amp; dcap) really just a set of documentation to help understand
how to express your metadata in a way that could be converted into and out of
RDF.

Jon: Current DCAP gets ~95% of the way there, then gets lost in expressing
constraints in terms of XSD.

Richard: goal of dcap is to provide that documentation.

Jon: goal of dcaM is to allow data from an RDF graph to be validated as a
record. DCAP gives specifics of how to do that: cardinality, record type,
requiredness, other validation points--defined in a language &amp; translatable to
other languages...

Karen: 2 Qs: diff between dca[mp?] &amp; a named graph.

Aaron: thinking about movement in RDF to start incorporating named-graph stuff
into RDF model. We need to look more closely at this.

---------------------------------------------------------------------- 
Shifting topics: SES vs. datatype.

Corey: @Jon SES is narrower than rdfs:datatype?

Richard: SES as a subclass of rdfs:datatype still seems hard to me.

Jon: SES can be an equivalentClass, but I would very much like it to be a
distinct class that allows for additional properties

Richard: +1 Jon; but I am curious about how such classes are defined -
especially in a way that can be easily "validated" or tested. This seems to be
a useful feature of existing datatypes.

Aaron: <a href="http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#section-Datatypes" class="external free" rel="nofollow">http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/#section-Datatypes</a>.
How would an SES be different?

Richard: @aaron right, but this seems different to me than the kinds of "rules"
that ISBD provides. These are formal rules, not rules that provide guidance to
complicated situations

Karen: @Rcihard I think SES *is* an rdf:datatype. the addition of rules for
decoding would be an addition that doesn't change its definition as a datatype

Aaron: I guess I'm still having some trouble conceptualizing what an SES class
would be/do...

Karen: I actually think SES is rdf:datatype + rules

Richard: I'm also going to take a stab at higher levels of doing things in the
RDF environment. i.e. Does DCAP provides a similar mechanism to OWL?

Karen: not a subclass or superclass

Corey: So, an SES is an RDF datatype, but (for example) with the addition of a
parser.

Jon: I think the difference between rdfs:datatype and dcam:ses would be
explicit support for a comain-specific datatype -- the ISBD use case

Corey: (I'm still looking for example code that will parse (even some of) ISBD.

Richard: @Karen, that may be true. The question is whether ISBD rules are
equivalent to the kinds of *axioms* one might declare in an OWL ontology.

Richard: see <a href="http://imlsdcc.grainger.uiuc.edu/docs/wickett_ischoolsPoster.pdf" class="external free" rel="nofollow">http://imlsdcc.grainger.uiuc.edu/docs/wickett_ischoolsPoster.pdf</a>

Aaron: So wait, the datatype would provide a link to a parser?

Jon: the problem with owl ontology is that the SES is explicitly concerned with
*syntax*

Corey: The thing that I don't understand is why ISBD? Why not do the same
thing, but for the equivalent MARC field, which has parsers available for doing
same thing.

Karen: @Richard unfortunatley i thik isbd is particularly difficult because it
is a display markup, not data

Aaron: "some isbd string" ^^:parserURI

Karen: @Aaron: yes. So it's just a bunch of code, or a set of rules

Corey: Aaron: or it would have that link in the machine readable documentation
for the datatype.

Karen: but few if any constraints

Richard: @Jon is the goal of the ISBD/RDF group not to provide the semantics
for that syntax?

---------------------------------------------------------------------- 
Call itself ended here, but conversation carried on in IRC for another 30 minutes.

(12:04:26 PM) jonphipps: my wish for the definition of the SES class would
enclude ses.encoding and ses.decoding properties that could be extended for
specific languages

(12:04:29 PM) karencoyle: the other thing about isbd is that almost no one
actually creates data in it, AFAIK

(12:04:42 PM) karencoyle: it defines the display of data that is stored in a
variety of formats

(12:04:59 PM) musebrarian: @karen that's why I've been wondering why it's
become an important use case here

(12:05:00 PM) chrpr: So a DCAP will say, "Hi, I'm using property
&lt;myap:publisher&gt;, which has a range of &lt;isbd:publicationStatement&gt;, which is a
class and is defined with properties &lt;documentation&gt;--uri,
&lt;referenceParsingCode&gt;--uri, etc.

(12:05:28 PM) jonphipps: @misebrarian not specific syntax, but the ability for
the creator of an SES to define specific syntax

(12:05:37 PM) karencoyle: but MARC is even worse, because MARC is markup that
has grown like a rube goldberg machine over time, only one that is broken in
various places

(12:05:53 PM) jonphipps: @chrpr yes

(12:06:23 PM) karencoyle: @muse i think it isn't a good case, myself

(12:06:53 PM) jonphipps: @karencoyle and much of that markup (like the access
points) has been carried into RDA

(12:07:02 PM) karencoyle: RDA might be an interesting case, although we don't
have any actual users yet. but the data elements are more sensible than ISBD

(12:07:06 PM) chrpr: I'm increasingly agreeing with @karencoyle about problems
with isbd as a use case. Would almost make more sense to use MARC as a damn use
case, but again, I think we need to work on graph-&gt;record before we work on
record-&gt;graph...

(12:07:14 PM) karencoyle: @jon, isbd does not have access point

(12:07:26 PM) rubinsztajn: @chrpr +1

(12:07:32 PM) jonphipps: @karencoyle No, but RDA does

(12:07:35 PM) karencoyle: isbd represents only the body (description) part of
cataloging

(12:07:49 PM) karencoyle: yes, RDA is "description + access"

(12:07:53 PM) karencoyle: D and A of RDA

(12:08:23 PM) karencoyle: some of the description comes from ISBD, other comes
from AACR which was developed before and aside from ISBD

(12:08:24 PM) jonphipps: And the access points in RDA have an explicit,
non-random syntax

(12:08:39 PM) karencoyle: @jon, not entirely

(12:09:02 PM) jonphipps: jeez, karen. often enough :-)

(12:09:03 PM) chrpr: jonphipps: but has anyone ever tried to write a parser for
that syntax? It may be non-random, but I'm not positive it's completely
predictable.

(12:09:11 PM) karencoyle: it is explicit in terms of decoding it for display,
but not so for creation

(12:09:46 PM) karencoyle: @chrpr look at article in code4lib journal about
trying to parse the title -- i'll find it

(12:09:59 PM) jonphipps: the access points define an *ordered* string literal

(12:10:39 PM) chrpr: @karencoyle: yes, I've read that (I think...) But access
points are another bit entirely, no? This is actually the good thing about MARC,
is that those strings become more parsable...

(12:10:48 PM) karencoyle: <a href="http://journal.code4lib.org/articles/3832" class="external free" rel="nofollow">http://journal.code4lib.org/articles/3832</a>

(12:11:08 PM) jonphipps: the *order* represents an explicit syntax encoding

(12:11:24 PM) musebrarian: I'd still like to see some examples of
non-bibliographic datatypes that are as complex as the ISBD case. I can
understand testing "is this an integer," I have a harder time understanding
aggregated statements as the same kinds of things.

(12:11:32 PM) karencoyle: no, access points have some of these same problems,
AFAIK. there are lots of options in cataloging; it's not an algorithmic activity

(12:11:41 PM) jonphipps: That's why we defined them as SES classes

(12:11:59 PM) karencoyle: @jon the order can vary

(12:12:29 PM) karencoyle: in other words, once a string is created, it must be
kept in that order; but the elements can be in different orders in different
strings

(12:12:43 PM) jonphipps: @karencoyle please show me an example of varying order
in an access point

(12:12:45 PM) karencoyle: so decoding is possible, but re-encoding is not
unless you have retained the order

(12:12:51 PM) karencoyle: i put some in the wiki

(12:12:53 PM) chrpr: @musebrarian: The one that I see most often is the XML
structured data (or even XHMTML markup) as valid in object position.

(12:13:52 PM) musebrarian: @chrpr but that's been given it's own class in rdf
that is different from datatypes

(12:13:55 PM) karencoyle: @jon see:
<a href="/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns</a>

(12:13:57 PM) chrpr: @karencoyle: either retained the order *or* created URIs
(or even blanknodes) for entities that cary that order...

(12:14:01 PM) chrpr: s/cary/carry

(12:14:05 PM) musebrarian: XMLLiteral is not a subclass of datatype

(12:14:43 PM) chrpr: @musebrarian: yes, this is (part of) why I almost think
dcam:SES is broader than rdfs:Datatype

(12:15:07 PM) rubinsztajn: I'm getting disillusioned with this idea. Full
round-trippability might just be too complicated. We're trying to jam into a
formal model something (i.e. data migration automation) that might be better
suited to a network of shared tools, docs, etc...

(12:15:07 PM) karencoyle: order patterns there: a/c, a/q, a/c/d, a/c/d/c, a/d/c

(12:15:30 PM) musebrarian: @chpr +1 though this seems different than what
@jon is arguing. (and what Diane has done for RDA - which seems to be the basis
for the ISBD modeling)

(12:15:42 PM) karencoyle: @rubin it might be more reasonable if we stick to
data rather than marked-up text

(12:15:57 PM) rubinsztajn: I agree.

(12:16:01 PM) jonphipps: @karencoyle you're talking about isbd?

(12:16:06 PM) karencoyle: @jon yes

(12:17:01 PM) karencoyle: @jon the text existed first; ISBD was developed as a
way to mark up the text so that it could be OCR'd

(12:17:30 PM) rubinsztajn: I need to go too. Looking forward to more of this on
the listserv.

(12:17:33 PM) karencoyle: it came along at least 50 and maybe 100 years after
the text format was solidified
 
(12:17:53 PM) jonphipps: We should also take into consideration RDF 1.1:
<a href="http://www.w3.org/TR/rdf11-concepts/#section-Datatypes" class="external free" rel="nofollow">http://www.w3.org/TR/rdf11-concepts/#section-Datatypes</a>

(12:18:15 PM) karencoyle: me, too. is there a way to copy this into a mail? it 
might be interesting for others to see

(12:18:18 PM) jonphipps: @karencoyle But I'm not talking about ISBD, I'm
talking about RDA

(12:23:21 PM) jonphipps: Note that the RDF1.1 datatypes section is
significantly different from
<a href="http://www.w3.org/TR/rdf-concepts/#section-Datatypes-intro" class="external free" rel="nofollow">http://www.w3.org/TR/rdf-concepts/#section-Datatypes-intro</a>

(12:30:12 PM) karencoyle: @jon yes, current def of rdf datatypes seems to be
very loose -- if you define it as a datatype it is a datatype

(12:30:18 PM) karencoyle: at least, that's how i interpret it
</pre>

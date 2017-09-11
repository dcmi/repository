---
title: TeleconReport-20120809
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120809.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 9 August 2012, at 20:30.  
This page has been accessed 91,765 times.

<pre>DCAM 2012-08-09 telecon - report

Identifier: <a href="/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120809" class="external free" rel="nofollow">/archive/mediawiki_wiki/DCAM_Revision/TeleconReport-20120809</a>
See also follow-up posting by Tom at <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=dc-architecture;e0aaaea8.1208" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=dc-architecture;e0aaaea8.1208</a>

Present: Tom, Karen, Richard, Jon (IRC)

Chair: Tom

Tom: Short, informal call today.

Tom: let's pick apart the concept of a syntax encoding scheme. In RDF a
datatype is a mapping between a string and a conceptual resource. RDF SES: a
set of strings and a mapping to conceptual resources.

Tom: Not sure that ISBD Publication Statements, for example, are really SESs --
they stretch the notion of datatype. However, I like what Jon and Corey are 
seeking.

E.g., see <a href="http://www.w3.org/TR/rdf11-concepts/#section-Datatypes" class="external free" rel="nofollow">http://www.w3.org/TR/rdf11-concepts/#section-Datatypes</a>: "Each member
of the lexical space is paired with (maps to) exactly one member of the value
space." The date "July 4, 1776" (i.e. the day) maps to the string "July 4,
1776".

Some motivations for defining App Profiles were: to encourage good modeling
consistent with RDF. Conversion and expression of metadata expressed in
non-RDF languages.

Tom: What Jon is calling a SES one might call an Application Profile or a
Mapping Profile -- a specification of how some local piece of metadata maps to
an ideal model of metadata based on DCAM, based on RDF.
One might write XSLT or heuristics for encoding and decoding metadata between local and linked data representations.

I agree with where the discussion has been going but we are overloading the
notion of SES (datatype). (Quotes Jon from June 22 e-mail). So as not to
overload the definition of SES, we can refer to App Profiles/Mapping Profiles.

With ISBD, there is a notion that individual elements of ISBD are compiled into
a string which represents a Publication Statement. The string is just another
serialization format. One reason for having a DCAM was to define DC-HTML,
DC-XML, etc. To have a well defined mapping from HTML to DCAM, so that it
could conform to RDF. Generating an ISBD statement as a string is conceptually
the same thing only the implementation syntax is plain text with punctuation
rules.

Karen: My concern is that DCAM/SES is too low of a level for mapping, since different
mapping choices should be available.

Jon: I think my notion of SES conforms more closely to the RDF11 definition of
datatype than the RDF1.0 definition did.

Karen: My concern with defining these aggregates in DCAM, it makes it harder to disaggregate.

Tom: So this becomes a discussion of the line of separation between dcam and
dcap. DCAM provides vocabulary for expressing a DCAP.

Jon: The main reason for defining SES as a different class is to add value to
RDF:datatype and refine it in a way that allows for a non-RDF expression where
needed.

Tom: should DCAM differentiate literal/non-literal types? Part of what we should
be discussing.

Karen: Do we consider DCAM to be anything other than RDF? In other words, is
DCAM more than RDF?

Tom: RDF doesn't yet have a standard notion of a Description Set. Doesn't put
boundaries around thing. RDF doesn't have way to express cardinality.

Karen: Where is the DSP in relation to DCAM?

    Jon: IF DCAM/DCAP is limited to RDF then the DCAM2 discussion that basically
    said that DCAM _is_ RDF would also mean that DCAP _is_ OWL and we call it a day
    and go home.

    Richard: @jon that doesn't seem to account for mappings from non-RDF metadata?

Tom: DCAM provides the basic constructs and the vocabularies. What happens
when you want to create an AP? The DSP language is intended as a way to define
templates.

Karen: we're talking about DCAP/DCAM, but what we're talking about are the
rules in the DSP.

    Jon: @musebrarian It doesn't and I'm not suggesting we call it a day
    (despite the appeal at the moment)

Karen: We talk about DCAP, but we mean DSP.

    Richard: @jon part of the struggle seems to be a constraint that we have one
    recommendation. Perhaps the reality calls for more paths to accommodate
    different scenarios.

    Jon: I'm just saying that we should be looking at DCAM as a value-add to
    RDF in the context of non-RDF data models

Karen: Defining what syntax you have and how you map it is outside the DSP.

Tom: Mapping is a step beyond dsp. The right-hand box in Singapore Framework.
DSP can be an ideal "target" for decoding metadata. The DSP is the template,
used along with mapping rules to create the encoding. If you have ISBD as
string blocks and you want to express them as linked data, it is the reverse
problem. You want to decode the metadata and map it to an ideal target (DSP).
The DSP can be either a template for encoding metadata or a mapping target for
decoding metadata.

Karen: Trouble defining the separation of DCAP/DSP and the actual application.

Tom: ...

Richard: Can DCAP be used simply to document existing metadata? 

Tom: Yes, definitely.

Richard: Fits with my notion that a DCAP can also document "as built" metadata.

Karen: DCAP is way of expressing information about shared metadata.

    Jon: I think Karen just described a DCAP. DCAM is most useful as a model
    rather than a document.

Karen: DCAM builds on RDF, DSP gets us to a point where we actually define data
we have in an application.

    Jon: DCAM refines RDF in ways that are useful to moving data in and out of
    RDF for records-based systems

    Richard: +1 @jon

Karen: this will hard to write up.

    Jon: If your model 'conforms' to DCAM, then your model supports moving data
    in/out of XML (just as a for instance)

Tom: between the instance metadata and the DSP might be some pretty messy heuristics.

Karen: Once we get this settled, we need to put another layer around it. How we
think that DSP or DCAP what you go through to expose that data in a triple
store.

Tom: if we see DSP as extension on top of RDF that describe a description set
(not part of RDF). We want DSP to be machine processable, but also readable by
people.

Karen: Not necessarily natively - should be able to be transformed into
readable documentation.

    Jon: The question wrt SES is: Is there a specific refinement(s) of
    RDF:datatype that helps encode/decode data that isn't XML. For instance the
    RDF:XMLLiteral datatype allows for anything an SES can do but it requires
    that the data be expressed as XML and the syntax defined by an XSD

Tom: One approach was Mikael's syntax for embedding XML representations in MoinMoin

    Jon: What's the non-XML equivalent, for say MARC21 or ISBD or RDA?
    
    Richard: @jon it seems like it would be up to us to define that - or rather, up to a DCAP?

    Jon: @musebrarian could you point out to Tom/Karen that I'm tring to contribute via IRC?

    Richard: @jon trying to imagine what the "XSLT" or machine-understandable processing/mapping rules are for ISBD
             @jon not sure there's ever been a formal specification at that level

    Jon: Well, that's the point

Tom: there are strict notions of what an SES is, but what we're talking about
is more pragmatic. Not sure these conform to the RDF notion of datatype. Want
to include sets of heuristics that are more complicated than [datatype
mappings?].

    Jon: There's a need to be able to describe a string as having a distinct
    syntax and has been created using a specific 'scheme'

Karen: bibliographic rules are much more open. Very little you can do to
"validate" a MARC record.

    Jon: Can the contents of a MARC tag be defined in any way?
    I can write a program that 'decodes' a marc21 tag, no? It has a syntax.

    Richard: @jon tags are not context-free. May require reading values in a
    leader or by looking at other tags

    Jon: But it's not, or I wouldn't be able to 'decode' it

    Richard: i.e. if the material type (in leader) is x, use rule y. if the
    material is b, use rule z.

    Jon: I recognize that there are rules that govern content and influences
    validation. But that's different from defining the structural syntax.

Karen: MARC is a markup of a display for humans. What can be put into that
markup is flexible.

    Jon: But it's still 'markup'. Are we still talking about SES?

Tom: The inconsistencies were not a problem because people would use their
brains to interpret.

    Richard: @jon I think we're talking about MARC

Karen: Interesting article by a MARC newbie - how hard it is to interpret
"title"... What people who write programs around MARC data find: programmers
skip alot because not designed to be validatable. I see that we are struggling
with this as a community, but not the best example of DSP because it is not
algorithmically manageable.

Richard: <a href="http://journal.code4lib.org/articles/3832" class="external free" rel="nofollow">http://journal.code4lib.org/articles/3832</a>

    Jon: MARC yes, but can the contents of a literal be encoded/decoded as MARC
    and can that be described as a specific syntax? Well then let's go back to ISBD.
    A MARC record is a _record_.

    Richard: @jon What is a _record_? That seems to be at the heart of what
    DCAM is trying to do.

    Jon: And we're talking about the utility of DCAM to express _records_ as
    statements. Discrete sets of statements

Karen: There is no way to say {rules} for ISBD.

    Jon: And I think that applies to MARC just as much as it applies to XML.

    Richard: @jon a set for what purpose? If a record = a set then what makes
    it different from other sets of data?

    Jon: It's an encoded record expressed as a single literal value

Tom: the utility of the DSP is to express records. DCAM is the extended
vocabulary needed to write that DSP.

    Jon: @tbaker: That works for me

Tom: starting with MARC, you want to extract triples from MARC or ISBD. You
create a mapping profile that is the target of the mapping. That mapping
profile conforms to DCAM. You could write more than one mapping profile for
different purposes. A given mapping may require human intervention to
complete. You could create many DSPs around one set of data.

Karen: schema.org or RDFa for OCLC records as an example. Could you write a
DSP for that?

    Jon: OCLC implementation is a good example

Tom: What do we want to express in a DSP? Is the vocabulary already there in
RDF or what else is needed that we want to express in a DSP? That's DCAM.
DCAM closes the gap between RDF triples and.... Gordon's need for "mandatory
if applicable" kinds of rules.

Karen: <a href="http://kcoyle.blogspot.com/2012/05/frbr-frad-isbd-in-ld-by-bne.html" class="external free" rel="nofollow">http://kcoyle.blogspot.com/2012/05/frbr-frad-isbd-in-ld-by-bne.html</a>

Tom: We've been calling it a SES, but it's really a DSP.

Karen: Extraction of bib data using ISBD

Tom: It provides the ability to provide constraints. We're interested in not
just DCAM, but DSP constraints.

Karen: The two work together.

    Jon: <a href="https://docs.google.com/presentation/d/1NAwBKgoOhCjzQmR9ENECV1AVmNI9-dt0Akf93NF5N2g/edit" class="external free" rel="nofollow">https://docs.google.com/presentation/d/1NAwBKgoOhCjzQmR9ENECV1AVmNI9-dt0Akf93NF5N2g/edit</a>

Tom: The DSP template stands between DCAM(?) and instance metadata.

    Jon: That presentation shallowly looks at the OCLC schema.org implementation.
    It's titled 'Mapping'

    Richard: @jon, yes, but i'm not sure that it is going to work for all fields

Tom: will try to write up what I said about the layers between RDF and instance metadata.

    Karen: @jon the fields there are the ones that work

    Jon: Still think that DSP and SES are different.

    Karen: @jon so what about tom's idea of a mapping profile?

    Jon: XSD for a single literal value == SES
</pre>

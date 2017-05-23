Son of DC 
=========

2014-10-25 svn export http://aliman.googlecode.com/svn/trunk/sodc aliman.googlecode.com_svn_trunk_sodc

Alistair Miles wrote some code during DC-2007 for "Son of DC", an alternative to 
the DCMI Abstract Model.  

URLs (at the time):
* http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/constraints/index.html
* http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html
* http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/release/SoDC-0_2.zip
* http://isegserv.itd.rl.ac.uk/sodc/SODC-0_2/constraints/ - 404 in 2011 
* http://purl.org/net/sodc/

Related mailing list postings:
* 2007-02-26 https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0702&L=dc-architecture&P=52629 - DCMI needs an "Abstract Syntax"
* 2007-03-20 https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=DC-ARCHITECTURE&P=10743
* 2007-03-20 https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=DC-ARCHITECTURE&P=11331
* 2007-03-20 https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0703&L=dc-architecture&F=&S=&P=9976


----------------------------------------------------------------------
Subject: The difference between syntax and semantics
From: "Miles, AJ (Alistair)" <A.J.Miles@RL.AC.UK>
Reply-To: DCMI Architecture Forum <DC-ARCHITECTURE@JISCMAIL.AC.UK>
Date: Tue, 20 Mar 2007 19:01:02 -0000
Content-Type: text/plain

Tom B asked me to write up some notes on syntax and semantics in RDF, so
here goes ...

This is an informative note, based on my understanding of the RDF
semantics [1], which I strongly recommend reading in its entirety,
equally because it is an excellent document and because I am at best an
amateur logician and mathematician (proofs in appendix A may be
skipped).

RDF makes a crucial distinction between its abstract syntax (defined at
[2]) and its semantics (defined at [1]). 

The abstract syntax [2] talks about graphs, triples (statements), URIs
and literals. 

The semantics [1] talks about the *interpretation* of the abstract
syntax. It tells you how to work out what graphs, triples, URIs and
literals *denote*. It provides an explanation of the *meaning* of RDF
triples, and of the RDF and RDFS vocabularies. Crucially, this
explanation is *extremely minimal*. All it gives you are *valid
inferences*. I.e. given a set of statements, *if* those statements are
all true, the semantics tells you which other statements must also be
true - are *entailed*. 

The notions of "properties", "classes", "sub-properties", "sub-classes",
"domains" and "ranges" are all part of the RDF semantics - they have
nothing to do with the abstract syntax whatsoever.

So, for example, if I assume that the following statements are true:

dc:creator rdfs:range ex:Agent.
ex:foo dc:creator ex:Alistair.

... then I can be sure that the following statement is also true - I.e.
I can *infer* it:

ex:foo rdf:type ex:Agent.

This is crucial to the understanding of "domains" and "ranges" in RDF.
Domains and ranges do not provide "constraints", rather they support
certain inferences.

Now notice that, if I assume the following:

dc:title rdfs:range rdfs:Literal.
ex:foo dc:title ex:bar.

... then I can infer:

ex:bar rdf:type rdfs:Literal.

This is *all you get* from declaring the range of the property dc:title
to be rdfs:Literal. I.e. there was nothing wrong with the first
statement - nothing *inconsistent* at all. And this statement won't ever
be inconsistent, unless you start to use the OWL vocabulary to make some
additional statements. It is virtually impossible, using the RDF and
RDFS vocabularies, to make an *inconsistent statement* in RDF, i.e. a
statement which cannot possibly be true. 

If you want to perform "validation" of RDF data, this is best achieved
at the *syntactic level*. I.e. you could state a set of *syntactic
constraints* over the RDF abstract syntax, and then check a graph to see
if it conforms.

You could do this semi-formally, using keywords "MUST", "SHOULD" etc.
[3], e.g. you could state in a specification that:

"Plain literals MUST be used in the object position of RDF triples where
dc:title is in the predicate position."

... or conversely that:

"URIs MUST NOT be used in the object position of RDF triples where
dc:title is in the predicate position."

However, note that if you stated:

"Blank nodes MUST NOT be used in the object position of RDF triples
where dc:title is in the predicate position."

... you would get into trouble, because:

ex:foo dc:title "Bar".

... entails:

ex:foo dc:title _:nnn.

... where _:nnn is a new blank node assigned by the inference process.

This is a subtle point, but very obvious when you get it. This can be
read as: if "Bar" is the title of foo, then it must be true to say that
*something* is the title of foo.

Sorry, best I can do for now.

Cheers,

Alistair.

[1] http://www.w3.org/TR/2004/REC-rdf-mt-20040210/
[2] http://www.w3.org/TR/2004/REC-rdf-concepts-20040210/
[3] http://www.faqs.org/rfcs/rfc2119.html

--
Alistair Miles
Research Associate
CCLRC - Rutherford Appleton Laboratory
Building R1 Room 1.60
Fermi Avenue
Chilton
Didcot
Oxfordshire OX11 0QX
United Kingdom
Web: http://purl.org/net/aliman
Email: a.j.miles@rl.ac.uk
Tel: +44 (0)1235 445440 

----------------------------------------------------------------------
Erratum...

> So, for example, if I assume that the following statements are true:
> 
> dc:creator rdfs:range ex:Agent.
> ex:foo dc:creator ex:Alistair.
> 
> ... then I can be sure that the following statement is also true -
I.e.
> I can *infer* it:
> 
> ex:foo rdf:type ex:Agent.

This should be:

ex:Alistair rdf:type ex:Agent.

Sorry, it was the end of a long day :)


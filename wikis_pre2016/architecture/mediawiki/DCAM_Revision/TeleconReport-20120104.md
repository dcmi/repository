---
title: TeleconReport-20120104
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-20120104.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 4 January 2012, at 18:13.  
This page has been accessed 129,219 times.

<pre>2011-01-04 DCAM editors' call - 9:00 EST

Attended: Tom, Stuart, Richard, Kai, Michael, Jane
This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120104.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120104</a>

----------------------------------------------------------------------
Summary of actions

ACTION: Tom and Richard to put placeholder for introductory text into wiki document
at <a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Draft</a>.

ACTION: Kai and Tom to work on technical part in wiki, e.g.:
    <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Tech</a>
    <a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Scratchpad</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Graphics.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Graphics</a>

----------------------------------------------------------------------
Discussion

Tom: Substantive discussion occurs on the DC-Architecture list unless there are
complaints about the traffic. We can start writing at
<a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Draft</a>. Need to start
builing a structure for the revised document(s). Need to give something to
general readers, but technical documentation for more in-depth information.
General document provides examples, rationale, and uses of DCAM. What are
DCAM's functional requirements?

Stuart: Premature to decide whether one or two documents? Nothing wrong with
the original goals, but it missed the mark with audiences. Range of readers --
continuum from expert to beginners. Onion layers. If we look at Website data,
people coming for metadata basics. Could be documentation in layers. Every
term linked to glossary.

Jane: I want to be able to understand it at different levels, when struggling
to "get it". People need to find their access points.

Stuart: Again, web statistics; bounce rate on those pages is high.

Jane: I like Stuart's onion metaphor - want to understand at different levels
in order to convey. Not just for teaching, but people in research looking.
Existing documentation is basically okay, but hard for people to read without
investing alot of time.

Stuart: People don't have time, so they give up.

Kai: Way we document DCAM. We want to base it on RDF, but maybe want to hide
details. I like the idea of more abstract docucmentation for the user. Still
not entirely sure what we want to do with DCAM. When I approached this task,
may have seen it in overly simple terms. I thought we could just rewrite what
is there. But I see we need to address potential issues.

Tom: Introduction should describe function of DCAM; what are the requirements?
See <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Scratchpad</a>: mapping of
concepts. Pete Johnston's work on DC-Text makes some things that are implicit
in DCAM more explicit. Also important to see what is happening in the RDF
Working Group. Notion of "Description Sets" may be clearer for general readers
-- easier to explain -- than "Named Graphs". What is DCAM good for? What is
its purpose? Needs to be part of an introduction. Current introduction is a
good part of the current specification, but some of the requirements that have
come up are not articulated there.

Stuart: Pedagogical functions will be layered on top of what DCAM is. First
task is to determine what's wrong with current DCAM, what needs to happen
(i.e., on technical level) -- then address the pedagogical piece, how
presentation is layered on top of this. Pedagogical functions don't drive what
the DCAM is, how it is presented may be influenced by the pedagogic concerns.

Michael: Structure of specification and primer, like W3C, could work well.
Primer must be heavily edited, but would be built on specification.

Richard: Role for bridge to RDF. The "Is it based on RDF?" discussion reflects
this.

Stuart: Richard, you nail the pedagogical point. We use in teaching. What DCAM
did for me: provided a principled way for thinking that opened the door. This
is how it is used. Helps people go from where they are into a new space.

Tom: These are useful points that need to be written up. Put a placeholder in
the wiki with an introduction. Use the introduction as a place to collect text.

ACTION: Tom and Richard to put placeholder for introductory text into wiki document
at <a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Draft</a>.

Richard: Continue looking at other DCMI documentation (like the "using dublin
core" revisions) to make sure that everything aligns and can lead users through
concepts.

Stuart: DCMI Metadata Terms, Glossary, DCAM, User Guide - moving forward, these
documents need to be tightly coupled. Definitions linked to examples, etc.

Tom: Technical issues: Value Strings that are in different places in the Model
(literals used as the object a RDF statement as opposed literals used to
annotate the object of an RDF statement with a label). I want to keep the core
model, but simplify the structure somewhat. We need to address mappings to the
evolving RDF standards. Important question: Should DCAM revisions be kept
backwards compatible with the earlier DCAM? Or do we have an opportunity to
create a simpler model that preserves the essence of the old model? As one of
the original authors, having someone take a critical look at it with fresh eyes
would be helpful. If we do not have more owners of the technical part (besides
me), the result may not be scrutinized the way it should be. I'd some
co-editors -- people who will take a close look at the details.

Kai: I volunteer to help with the technical issues. Start DCAM from scratch,
based on RDF?

Tom: OK with me.

ACTION: Kai and Tom to work on technical part in wiki, e.g.:
    <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Tech</a>
	<a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Scratchpad</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Graphics.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Graphics</a>

Kai: How would we define these concepts with RDF?

Tom: See also "Son of DC" by Allistair Miles
<a href="http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html" class="external free" rel="nofollow">http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/index.html</a>. Don't want to
start with constraint language (DC-DSP), that will come later.

Richard: We are in a different place than where we were when DCAM started. RDF
is more palatable today. RDF semantics are the way they are because of their
goals. Would it be helpful to bring these out in documentation? Some of the
push-back was about "additional complexity" - people wanting simple records.
Levels of interoperability. People may say: "I'll just stick with my simple
structures" (on Level 1). If purpose is to translate...

Michael: We share most of the same premises of RDF - that metadata is
description-based, description of something, and not just a set of key-value
pairs packed into a record. This also bridges, opens door to formal
knowledge-representation languages. But people do not necessarily want to
represent their bibliographic data in RDF, RDFS, and OWL.

Tom: We need to get the general introductory stuff, information about
audiences, etc. up on the mailing list. We will have a larger DCAM discussion
in the next three weeks. Meeting adjourned.
</pre>

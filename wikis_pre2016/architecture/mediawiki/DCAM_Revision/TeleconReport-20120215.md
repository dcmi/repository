---
title: TeleconReport-20120215
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision/TeleconReport-20120215.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 March 2012, at 18:09.  
This page has been accessed 129,053 times.

<pre>2012-02-15 DCAM call - 11:00 EST - report

Attended: TomB (chair), Kai, Jane, Gordon, MichaelP, Aaron, Diane, Mark (IRC), Jon, Antoine
This report: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120215.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120215</a>
Agenda: <a href="/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120215.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconAgenda-20120215</a>
Previous: <a href="/mediawiki_wiki/DCAM_Revision/TeleconReport-20120130.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision/TeleconReport-20120130</a>

----------------------------------------------------------------------
ACTIONs carried forward

ACTION: Tom and Richard to put placeholder for introductory text into wiki document
at <a href="/mediawiki_wiki/DCAM_Revision_Draft.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Draft</a>.

ACTION: Kai and Tom to work on technical part in wiki, e.g.:
    <a href="/mediawiki_wiki/DCAM_Revision_Tech.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Tech</a>
    <a href="/mediawiki_wiki/DCAM_Revision.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Scratchpad.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Scratchpad</a>
    <a href="/mediawiki_wiki/DCAM_Revision_Graphics.md" class="external free" rel="nofollow">/mediawiki_wiki/DCAM_Revision_Graphics</a>

----------------------------------------------------------------------
Discussion of Tom's proposed "general message"
   <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;P=19582" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;P=19582</a>

   [[
   Seen as data artifacts, Metadata Records consist of slots holding
   information items in a defined structure. A Metadata Record may describe a
   single Thing of interest (such as a Book) or a cluster of closely related
   Things (such as a Book and its Author). More abstractly, a Metadata Record
   may be seen as a Description Set encompassing just one Description (i.e.,
   about the Book) or multiple Descriptions (about both the Book and the
   Author).  
   
   A Description consists of one or more Statements about the Thing Described
   (e.g., stating the Name and Birthdate of an Author). The Thing Described
   by a Description may be identified using a URI. A Statement about the
   Thing Described has one slot for an Attribute (Property) and one slot for a
   Value. Attribute slots are filled with names of attributes (properties);
   in DCAM, attributes are "named" using URIs. Value slots are filled with
   Value Strings, URIs, or blank Value Placeholders. A Value String may be
   stated as belonging to a named set of strings (known as a Syntax Encoding
   Scheme). A Value URI may be stated as belonging to a named set of URIs
   (known as a Vocabulary Encoding Scheme). In practice, Statements may be
   viewed in the context of Statement Sets. Statement Sets may follow common
   patterns.

   The Dublin Core Abstract Model (DCAM) provides a language for representing
   the structure of specific Metadata Records -- put more abstractly, to
   specify a Description Set Profile -- in a form that is independent of
   particular Concrete Encoding Technologies such as XML Schema, RDF/XML,
   RelaxNG, relational databases, Schematron, or JSON.  
   
   In order to provide compatibility with Semantic Web and Linked Data
   applications, however, DCAM is fully aligned with the Model and Abstract
   Syntax of RDF. (Note that the RDF abstract model is the basis for -- thus
   distinct from -- concrete RDF encoding technologies such as RDF/XML,
   N-Triples, and Turtle.) Knowledge of RDF is not a prerequisite for
   understanding DCAM on an informal level.

   DCAM provides a language for expressing common patterns of Statements --
   patterns that may be partially or fully encoded using specific Concrete
   Encoding Technologies. Indeed, some readers may find the example patterns
   used in designing DCAM more accessible and useful, as models and templates
   for implementation, than the formal specification of DCAM itself.
   ]]

 Jon: "The Dublin Core Abstract Model (DCAM) provides a language for
     representing the structure of Metadata Records in a form that is independent of
     particular Concrete Encoding Technologies such as XML Schema, RDF/XML, RelaxNG,
     relational databases, Schematron, or JSON. That looks like 100% of it to me.
     The rest is commentary."

     GordonD: +1 for Jon's suggestion of a one-liner ...
     Diane: +1 for concise statement first

 Antoine: A bit long, but clear. Problem with terminology - we should be ready
     to change depending on alignment with RDF. "Slots" for example. Put disclaimer 
     next to text. Would expect to see reference to "grammar".
     Re: mixing reference to syntactic things (slots) and semantic (things
     described): not a problem - need to make the connection between the
     syntactic stuff and things described.

 Diane: "A Description consists of one or more Statements about the Thing Described
     (e.g., stating the Name and Birthdate of an Author). " This sentence
     needs to say: "A description about an author...". Otherwise very
     confusing, particularly for those schooled in MARC.

 Jon: I agree with the need for the DCAM to be able to be used to create an
     RDFS/OWL specification, and in that sense 'alignment' is necessary.
     I think that one paragraph is feature-complete and represents the 'pitch' 
     fairly effectively. I think it's useful to keep specific grammar, such 
     as "description set" out of it if possible.

 Aaron: Looking at implied distinctions in this first pass - maybe make more
     explicit. I think there is a difference between alignment with RDF and
     dependence on RDF/XML, etc. Do we imply that RDF/XML must be used?

 Jon: For me, providing a specific methodology for expressing a DCAM-compatible 
     spec in RDFS/OWL is a requirement. If we can't do that then it won't be useful.
     GordonD: +1 Jon - this is what I'm looking for ...

 Jon: But if that's all we can do then we limit ourselves to simply solving an edge case.

 Aaron: Maybe the abstract model of RDF can provide a linguistic guide for how we do 
     that. The terms we use, we would use in DCAM as well. Jon, in RFC, agrees with 
     need for DCAM alignment with RDF needed. Aaron: use RDF abstract syntax.

 Diane: I understand the traction for trying to use another spec as a basis for this, 
     but I'm coming at this from perspective of a non-technical reader.
     I'm not sure the value carries through. The current DCAM is very difficult. We need
     a "DCAM for Dummies" - something more accessible. Concerned we might be going down
     road of complexity.
     Jon: @dih1 +1 for an expanded description

 Jon: One more time - this is perfect from my perspective: "The Dublin Core
     Abstract Model (DCAM) provides a language for representing the structure of
     Metadata Records in a form that is independent of particular Concrete
     Encoding Technologies." I would love to see the DCAM be this well-implemented 
     across _modeling_ technologies and this simply expressed: <a href="http://mustache.github.com/" class="external free" rel="nofollow">http://mustache.github.com/</a>
     
 Diane: Jon's one-sentence could be a very good introduction. But these five paragraphs 
     could be broken up under headings as additional headings. But try not to cram it all. 
     Pretty dense.

 Jane: Like Diane's idea of chunking what has been written. Going in a good direction. 
     This seems digestible and helpful. Important to keep the "DCAM for Dummies" idea 
     on the front burner.

 GordonD: We actually need DCAM for librarians, etc. ...
     Jon: @GordonD++
     Diane: Gordon +1, but maybe we need a translation
     Jon: Aaron, librarians should learn DCAM

 Aaron: Librarians should learn RDF
     Kai: Aaron +1

 GordonD: I mean a librarian's translation of "slot", "description", "statement", etc.
     That is, if we can translate the proposed text into the vocabularies familiar to 
     different groups like librarians, then we know the text is a good distillation of 
     the abstract ... Librarians already know DCAM - they just use a different terminology.
     Jon: @GordonD exactly

 Diane: Aaron, maybe techies need to learn more about where librarians are, in order 
     to help move them in a useful direction.

 Aaron: Agreed, though we shouldn't be afraid to bring librarians into the wider community 
    as well. From someone who inhabits both worlds.

 Diane: Some of us have been doing that for some time, but it ain't easy, and we need to 
     pay more attention to their needs

 Tom: Are we talking about translations of DCAM into French, Chinese... and Librarianese?
     Aaron: +1 @tbaker

 Diane: Gordon, yes, Andy once told me that he'd used some library ideas in DCAM.

 Tom: Instead of "DCAM for Dummies", how about "DCAM for Librarians" and "DCAM
     for Data Modelers".

 GordonD: @Tom, we need to ensure the (familiar) concepts expressed in DCAM
     are seen to be familiar by Librarians, archivists, and anybody who knows
     about relational databases ...
     Tom: @GordonD Understood
     Diane: DCAM for non-technical users.
</pre>

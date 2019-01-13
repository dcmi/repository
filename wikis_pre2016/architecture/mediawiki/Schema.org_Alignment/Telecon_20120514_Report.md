---
title: Telecon 20120514 Report
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/Telecon_20120514_Report.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 28 May 2012, at 04:57.  
This page has been accessed 64,961 times.

<pre>Schema.org Alignment Task Group telecon - 2012-05-14 - report

This report: <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20120514_Report" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20120514_Report</a>
Agenda: <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20120514" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20120514</a>
Chair: Tom
Date: Monday, 2012-05-14
Time: 11:00 AM Eastern Daylight Time
Mailing list: <a href="http://www.jiscmail.ac.uk/lists/dc-architecture" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/lists/dc-architecture</a>
Github: <a href="https://github.com/dcmi/schema.org" class="external free" rel="nofollow">https://github.com/dcmi/schema.org</a>
Attended: Tom, Antoine, Stuart, Karen, Dan, Bernard, Kirsten, Corey, Gregg Kellogg
IRC: Jon, Gordon

======================================================================
Documenting and publishing mappings

     Antoine has started work on an RDFa representation [1] of the 
     mappings in [2]. We will discuss this approach and address
     Kirsten's question [3,4] of how best we should incorporate new
     mappings into the set of mappings under consideration.

     Off-list, Dan has suggested that we approach mappings in the context of 
     usage patterns (application profiles). He points out that with better 
     online documentation of both DCMI Metadata Terms and Schema.org, it should
     not be necessary to compile wiki pages such as [2] by hand and suggests that
     publication of mappings could therefore be simplified.

     [1] <a href="https://github.com/dcmi/schema.org/blob/master/mappings.html" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/blob/master/mappings.html</a>
     [2] <a href="/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
     [3] <a href="https://github.com/dcmi/schema.org/issues/3" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/issues/3</a>
     [4] <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=14738" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=14738</a>

Tom: Question about how to represent the mappings. Affects whole workflow.
Need to represent while working, then publish.

Antoine: <a href="http://dcmi.github.com/schema.org/mappings.html" class="external free" rel="nofollow">http://dcmi.github.com/schema.org/mappings.html</a>

Corey: FYI, the page Antoine references is also directly editable in github:
<a href="https://github.com/dcmi/schema.org/blob/master/mappings.html" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/blob/master/mappings.html</a>. It uses github "pages"...

Tom: mappings.html is hand-edited. Antoine saved wiki page as HTML and edited.
Time-consuming, but not much more than creating human-readable documentation.

Bernard: Starting from requirement for HTML version, there's not much added
cost for hand-editing a page like this.

Tom: Need for both human- &amp; machine-readable versions. RDFa approach provides
single document for editing. Re: requirements: one early requirement - have
human and machine-readable versions. Some people in this call would be happy
with Turtle, but others want HTML. For handling one requirement on
human-readable version.  

Antoin: Github issue tracking allows reference to part of a document. Started
to refer to changes by referring to line in mapping file (RDF version).
<a href="http://dcmi.github.com/schema.org/mappings.html#schema:Organization_rdfs:subClassOf_dct:Agent" class="external free" rel="nofollow">http://dcmi.github.com/schema.org/mappings.html#schema:Organization_rdfs:subClassOf_dct:Agent</a>
This has problem that line numbers change when editing. Ability to target one
mapping without referring to line numbers in text. When we started to use
github for issue tracking, uses line numbers. We started to refer to changes
in mapping file. Problem: if you change the mapping files, line numbers
change. RDFa allows to use HTML to refer to mappings. Stable pointer to
specific mapping.

Jon: Just an FYI... The referenced line number in GitHub issues won't change
if you reference a line number in a specific commit.

     Corey: +1 to referencing specific commits

Jon: This looks like a good approach, but we still have the issue of
referencing a specific mapping statement in issues and comments don't we?

Antoine: We could have <a href="http://dcmi.github.com/schema.org/mappings.html#schema:Organization" class="external free" rel="nofollow">http://dcmi.github.com/schema.org/mappings.html#schema:Organization</a>

      Jon: Ah. Ok

Gregg: We have a way of generating RDFa from Turtle using
templates/stylesheets. The problem is that if you want to represent
human-readable information other than mapping triples, you have to do it in
static way, or represent it in RDF (so that the templates can generate the
appropriate HTML).

   Antoine: Thanks a lot for the input, Gregg!
   Jon: Gkellog++

Corey: Gregg, is the email you referred to something you sent offline? I'm not
finding anything on any of my lists.

Gregg: The perm link: <a href="http://lists.w3.org/Archives/Public/public-rdfa/2012May/0025.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-rdfa/2012May/0025.html</a>

Jon: The Open Metadata Registry has a vocabulary for status
   <a href="http://metadataregistry.org/concept/list/vocabulary_id/31.html" class="external free" rel="nofollow">http://metadataregistry.org/concept/list/vocabulary_id/31.html</a>

   Karen: +1, and maybe use the OMR vocab, or extend it
   Antoine: +1 (also for re-using the OMR voc!)
   Gordon: ++1 for adding definitions to the OMR vocab!

Gregg: If I can be of any help with the mapping document, let me know.

Jon: Is there a possibility to generate the HTML/RDFa from turtle using a script?

Corey: Gregg's done the tweaking of the DCMI XSLT to generate HTML with
Embedded RDFa output. # gkellogg++

Gregg: Glad to help. Off now.

======================================================================
Issue tracking

    We decided to use the Github issue tracker [6] but its use has not yet
    gained traction.

    Dan proposes that we do our work, at least in part, in the W3C Web Schemas
    Task Force [1,2]. Specifically, we could continue to use the dc-architecture
    mailing list, but track our issues on the Web Schemas issue tracker [3] (defining
    DC as a "product" with its own thread [4]) and occasionally report on progress to the 
    public-vocabs mailing list [5].

    [1] <a href="http://www.w3.org/wiki/WebSchemas" class="external free" rel="nofollow">http://www.w3.org/wiki/WebSchemas</a>
    [2] <a href="http://www.w3.org/2001/sw/interest/webschema.html" class="external free" rel="nofollow">http://www.w3.org/2001/sw/interest/webschema.html</a>
    [3] <a href="http://www.w3.org/2011/webschema/track/" class="external free" rel="nofollow">http://www.w3.org/2011/webschema/track/</a>
    [4] <a href="http://www.w3.org/2011/webschema/track/products" class="external free" rel="nofollow">http://www.w3.org/2011/webschema/track/products</a>
    [5] <a href="http://lists.w3.org/Archives/Public/public-vocabs/" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-vocabs/</a>
    [6] <a href="/mediawiki_wiki/Schema.org_Alignment/GithubIssueTracker" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/GithubIssueTracker</a>

Dan: see <a href="http://www.w3.org/wiki/WebSchemas" class="external free" rel="nofollow">http://www.w3.org/wiki/WebSchemas</a> ... trackers mentioned.
<a href="http://www.w3.org/2011/webschema/track/" class="external free" rel="nofollow">http://www.w3.org/2011/webschema/track/</a>

Corey: Danbri suggests that we engage the W3C Web Schema's task force efforts.

Antoine: On issue tracking in Github: well, now we can use whatever anchor we
want (and not only line numbers) we'd be in a better situation! But of course
I've got no objection to W3C issue tracker.

[Discussion of porting issues over into w3c issue tracker.]

Dan: The way the w3c group is framed, is a group within which 'schema.org as a
project' listens and participates.

Corey: Link to the feedback to schema.org set of issues:
<a href="http://www.w3.org/2011/webschema/track/products/1" class="external free" rel="nofollow">http://www.w3.org/2011/webschema/track/products/1</a>

Dan: We didn't make a working group to standardize Schema.org. Proprietary.
Web Schemas is not a standardization body for Schema.org, but way to collect
feedback. We use it for TODOs for FOAF. Would be happy if we could use for DC
too. Various semantic Web vocabularies - existence of schema.org has forced
the issue of better communication between vocabularies.
<a href="http://www.w3.org/wiki/WebSchemas" class="external free" rel="nofollow">http://www.w3.org/wiki/WebSchemas</a>

Corey: I always thought the Issues tracker in W3C had W3C membership as a
barrier. Need authentication, but as non-W3C affiliate, would this be a
barrier?

Dan: public w3c account should enable us to do this. I believe you can get a
public W3C account that will let you log in - see link. Public account for
wiki, too. Believe the issue tracker understands people being "in the group"?
<a href="http://www.w3.org/Help/Account/Request/Public" class="external free" rel="nofollow">http://www.w3.org/Help/Account/Request/Public</a>

    Corey: danbri, thanks. just applied for a w3c public account.

Jon: Part of the question is: Is the requirement for a W3C login a higher bar
for participation than a GitHub login? Is there enough additional value in
the W3C issue tracker for the broader population of participants to change
trackers and wikis at this point?

Karen: As a non-programmer, github is more foreign to me than the w3c site.

Dan: Hmm I've had same w3c account since 1997, let me make a new one and see
how the tools work as a newcomer!

First show of hands re: using W3C issue tracker and reporting to public-vocabs
list.

   danbri: +1
   kcoylenet: +1
   bvatant: +1
   chrpr: +1 to using w3c issue tracker. -1 to moving discussion off dc-architecture.
   danbri: dc-arch is fine for mail
   jonphipps: -1
   antoine__: +0. I'm ok with W3C issue tracker but I'm a bit reluctant to have only the issue tracking there...
   chrpr: +1 to reporting to public_vocabs list. Call minutes, agendas, &amp; major milestones.
        Antoine: corey++

Jon: Like you said it's a matter of personal comfort

Kirsten: Instructions for non-Members (<a href="http://www.w3.org/2004/08/invexp.html" class="external free" rel="nofollow">http://www.w3.org/2004/08/invexp.html</a>)
for me seems to be more a barrier than joining github

   StuartSutton: +1

Dan: Jon, can you live w/ the w3c option? I'm not promising w3c tools will be
all happyness and joy, ... but it seems the right community to connect to. So
... this is scoped to 'DC's mappings w.r.t. schema.org', right? Not all of
DC's arch work forever.

Jon: GitHub's markdown syntax in the issues automatically hyperlinks
GitHub-related references as well.

Dan: I'm fine w/ it staying in DC's github; it's not a major issue.

Jon: But that's a minor technical matter.

Corey: To put my concern into the record: requiring github login for
contributing to mappings _and_ w3c login for contributing to issue discussion
provides double barrier to login.

Karen: It's awkward, but if it works for most I'm not opposed.

Antoine: @Dan: how easy would it be for us to use <a href="https://dvcs.w3.org/hg/webschema/summary" class="external free" rel="nofollow">https://dvcs.w3.org/hg/webschema/summary</a> ?

Corey: Additionally, folks who land on the github mappings would then have to
go to a separate site to see the corresponding discussions.

Dan: No strong opinion either, all tools are annoying unless you use them daily
   Corey: +1 all_tools_are_annoying. (at least I now know how to get more
   involved in W3C with a public account)

Stuart: I have no strong opinion.

RESOLVED: Continue using Github for issue tracking.

======================================================================
Source of mappings: Schema.org or Rdfs.org?

    Bernard raised this as Issue 9: schemaorg type-properties and rdfs:domain.
    On our telecon of 5 April, resolved to use rdfs.org as the basis of our
    mappings [2]. However, Dan Brickley (of Schema.org) and Michael
    Hausenblas (of Rdfs.org) _both_ think this is the wrong decision. We
    should therefore reconsider on Monday's call. Dan will be on the call to
    discuss his reasons.

    [1] <a href="https://github.com/dcmi/schema.org/issues/9" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/issues/9</a>
    [2] <a href="/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405_Report" class="external free" rel="nofollow">/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405_Report</a>

-- From the 2012-04-05 agenda:

    Do we base our discussions on formal semantics declared at schema.rdfs.org
    (RDFS classes and properties) which interprets the not-so-formal semantics of
    schema.org with the following rules
    
    type &gt; rdfs:Class
    type hierarchy &gt; rdfs:subClassOf
    property &gt; rdfs:Property
    type has property &gt; rdfs:domain (the highest type in the type hierarchy having the property)
    property expected type &gt; rdfs:range
    
    The owl schema at <a href="http://schema.org/docs/schemaorg.owl" class="external free" rel="nofollow">http://schema.org/docs/schemaorg.owl</a> has the same interpretation.
    
    The prose at <a href="http://schema.org/docs/datamodel.html" class="external free" rel="nofollow">http://schema.org/docs/datamodel.html</a> seems to be quite loose
       1. each property may have one or more types as its domains. The property may
          be used for instances of any of these types.
       2. each property may have one or more types as its ranges. The value(s)
          of the property should be instances of at least one of these types.
    
    The "may" and "should" are not as hard declarations as the formal rdfs:range
    and rdfs:domain ...

Tom: Item1: Source of mappings: Schema.org or Rdfs.org?

Karen: If we go for schema.org, do we have to re-invent the RDFS semantics in
rdfs.org? If we use Schema.org, won't we have to invent the type of thing
that is in schema.rdfs.org. How can we hook things on this when so vague.

Dan: Schema.org is vague, it has some mistakes. Vague in many senses - put
together quickly - mistakes... Hidden in the prose. In Schema, you don't
notice problems in the other documentation.

Dan: Classes give place in structure but you can't express everything
machine-readably. We do use RDF Schema to describe Schema.org - comment,
label, hierarchy, definition, etc. Differences around constraints - which
properties go with which. Example: awards property - can attach to person or
to a creative work. If you say domain is Person... In RDF Schema, people come
up with "awardable thing" as superclass. Schema.org does not encourage this
way of modeling. For the moment, these things are more like documentational
hints than hard-and-fast. The documentation pages make a difference. Let's go
back to focusing on the text.

Dan: Latest schema.org RDFS:
<a href="https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html" class="external free" rel="nofollow">https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html</a>

Karen: Not sure it answers my question... To what extent will basing the DC
mapping to Schema.org - is DC more similar to Schema.org or to Rdfs.org?
Are there significant differences that would affect mappings?

Jon: So we're not comparing <a href="http://schema.rdfs.org/all.rdf" class="external free" rel="nofollow">http://schema.rdfs.org/all.rdf</a> with
<a href="http://schema.org/docs/schemaorg.owl" class="external free" rel="nofollow">http://schema.org/docs/schemaorg.owl</a> ?

Dan: Having gone through creation of schema.rdfs.org, highlighted a way we
could make Schema.org closer to RDF. Discussions behind us. Work of Rdfs.org
is more or less done now. Was important in its time.

Jon: I think at one time, the schema.org RDFS/OWL lagged behind the published
schema.org. Is this no longer the case? Since schema.rdfs.org says "We
automatically scrape the Schema.org terms on a daily basis"

Dan: OWL was updated as of last week. Need to write software. Right now not up-to-date.
Intent is that the OWL should be up to date. Right now, there is some lag.
<a href="https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html" class="external free" rel="nofollow">https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html</a>
 
</pre><pre>
        &lt;div typeof="rdf:Property" about="http://schema.org/awards"&gt;
        &lt;span class="h" property="rdfs:label"&gt;awards&lt;/span&gt;
        &lt;span property="rdfs:comment"&gt;Awards won by this person or for this creative work.&lt;/span&gt;
        &lt;span&gt;Domain: &lt;a property="http://schema.org/domain" href="http://schema.org/CreativeWork"&gt;CreativeWork&lt;/a&gt;&lt;/span&gt;
        &lt;span&gt;Domain: &lt;a property="http://schema.org/domain" href="http://schema.org/Person"&gt;Person&lt;/a&gt;&lt;/span&gt;
        &lt;span&gt;Range: &lt;a property="http://schema.org/range" href="http://schema.org/Text"&gt;Text&lt;/a&gt;&lt;/span&gt;
        &lt;/div&gt;
 </pre><pre>Bernard: I think it is misleading to talk about Domain and Range in this
context. When Rdfs.org said it was scraping daily, interpreting Domain, but
just uses these Union constructs. Still very uneasy.

Tom: <a href="http://rdf.greggkellogg.net/distiller?format=turtle&amp;in_fmt=rdfa&amp;uri=https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html" class="external free" rel="nofollow">http://rdf.greggkellogg.net/distiller?format=turtle&amp;in_fmt=rdfa&amp;uri=https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html</a>

Karen: If what bernard says is the case, then it does sound problematic

Dan: "Domain" is overloaded - need to resolve Schema.org "domain" to documentation.

Antoin: At least it's schemaorg:domain, not rdfs:domain. So from that
perspective the RDFa is more correct that schema.rdf.org! Except that
semantics of <a href="http://schema.org/domain" class="external free" rel="nofollow">http://schema.org/domain</a> is written nowhere. That's the point.

Dan: Our discussions get bogged down in infrastructure, methodology. Since
Schema.org and DC are loosey-goosey, try to get working dataset of real world
DC examples.

Antoin: @Bernard: in fact your mail was a quite good definition for
schemaorg:domain (informal) semantics.

Dan: Semantics of schema:domain/range are in <a href="http://schema.org/docs/datamodel.html" class="external free" rel="nofollow">http://schema.org/docs/datamodel.html</a>

Karen: Maybe not either/or. I like Dan's idea of working with examples to see
where they take us. Then we can go back and look at more structural/technical
issues. But find it hard to talk about structural/technical issues without
having examples.

    GordonD: +1 for working with examples AND assuming domain/range are compatible/same
    kcoylenet: +1 use cases
   antoine: +1

Dan: Antoine, to push on examples a bit. One of the motvations for doing this
work, so people don't have to agonize about whether to use Microdata or RDFa,
etc.

Karen: How do we move from examples to use cases?

Dan: Sort of an interview-like model. Blog-like questionnaire: what are you
[trying to do] with the metadata? What do your stakeholders think of lighter
or heavier metadata?

Antoine: Publish data in as many channels as possible.

Dan:: would it be at all possible to get anchor links into the rdfa here:
<a href="https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html" class="external free" rel="nofollow">https://dvcs.w3.org/hg/webschema/raw-file/default/schema.org/drafts/alpha/rdfa.html</a>,
similar to what antoine__'s done here:
view-source:<a href="http://dcmi.github.com/schema.org/mappings.html#schema:Organization_rdfs:subClassOf_dct:Agent" class="external free" rel="nofollow">http://dcmi.github.com/schema.org/mappings.html#schema:Organization_rdfs:subClassOf_dct:Agent</a>

Karen: I now understand better why Dan was asking for examples. The examples I
gave were for stand-alone records. Maybe should be looking for examples of
embedded DC? Would be useful for commenting, and could also help people
reference the documentation with more specificity outside of commenting
process...

Gordon: schema.org and dc may end up in same document if doc is assembled from different sources ...

Dan: if there is a database of this somewhere - not sure where line is drawn.

Karen: In my experience, DC used to described resources, not being used
internally to resources - what I encounter is stand-alone records. Does that
make a difference in terms of use cases? May not be a viable use case for
what we are talking about here.

Dan: Antoine, do you have a better Mona Lisa than
<a href="http://www.europeana.eu/portal/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F.html" class="external free" rel="nofollow">http://www.europeana.eu/portal/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F.html</a> ?

Antoine:
<a href="http://www.europeana.eu/resolve/record/92037/25F9104787668C4B5148BE8E5AB8DBEF5BE5FE03" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/92037/25F9104787668C4B5148BE8E5AB8DBEF5BE5FE03</a>
was the link I was about to post, but it's clearly not Mona Lisa.

Jon: This may be a naïve question but shouldn't we be mapping to the
schema.org URIs regardless? For instance dct:BibliographicResource to
<a href="http://schema.org/CreativeWork" class="external free" rel="nofollow">http://schema.org/CreativeWork</a> ?

Dan: (yes please re mapping)

GordonD: Merging/interoperating metadata standalone docs (records) is a
different use-case from merging metadata embedded in texts

Dan: view-source:<a href="http://www.europeana.eu/portal/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F.html" class="external free" rel="nofollow">http://www.europeana.eu/portal/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F.html</a>

Jon: Both schema.rdfs.org and schema.org reference the same URIs, but describe
them slightly differently.

   Corey: jonphipps++ re: mapping URIs

       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:language" content="de-DE"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:rights" content="Deutsche Fotothek"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:source" content="SLUB/Deutsche Fotothek"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:subject" content="Malerei"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:subject" content="Bild"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:subject" content="Fotos"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:subject" content="Ortskatalog zur Kunst und Architektur"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:title" content="Mona Lisa - 2000"/&gt;
       &lt;meta about="<a href="http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/01004/AC2B3AA843934B18E804DD40BF6E7BDD9C04067F</a>" 
           property="dc:type" content="image"/&gt;

Dan: How many of those properties could usefully have schema:keywords
schema:name etc added too? (then this group is the group working out such
details)

Jon: It seems to me that the <a href="http://schema.org" class="external free" rel="nofollow">http://schema.org</a> URIs MUST be what we use for canonical definitions

Antoine: @danbri: <a href="http://www.europeana.eu/resolve/record/03919/FCD38BDE7A03579F24BEDA5D157943B75BB36F11" class="external free" rel="nofollow">http://www.europeana.eu/resolve/record/03919/FCD38BDE7A03579F24BEDA5D157943B75BB36F11</a> is the one

Dan: The One. <a href="http://www.europeana.eu/portal/record/08502/91B9F52D5EE11B19F0C09C7B5FEA194B31B7049D.html" class="external free" rel="nofollow">http://www.europeana.eu/portal/record/08502/91B9F52D5EE11B19F0C09C7B5FEA194B31B7049D.html</a> is another.

Tom: suggest raising this in DCAM meeting tomorrow/tuesday

Jon: schema.rdfs.org has no ability to 'define' URIs that don't exist in a
domain that it controls, only to provide an alternative description

       GordonD: +1 for continuing/merging some aspects of this discussion with the DCAM call tomorrow
       Corey: +1 re: tomorrow, and I have to run soon. Also, I may have to cut off the DCAM call a little bit early tomorrow.
       Antoine: +1 but I'm not sure I understand there is common ground!
       GordonD: Would be good to confirm that there is no common ground!

Karen: Difference btw saying I'm describing something over there as to
describing something within the resource. Library md is about describing
something out there. But if you are inside the thing, provide information for
people using

Dan: rediscovers 2001 DC8 slides, <a href="http://dublincore.org/workshops/dc8/DCMIArchitecture2/sld001.html" class="external free" rel="nofollow">http://dublincore.org/workshops/dc8/DCMIArchitecture2/sld001.html</a>
Re examples.

Jon: This may apply: <a href="http://www.jenitennison.com/blog/node/170" class="external free" rel="nofollow">http://www.jenitennison.com/blog/node/170</a>
</pre>

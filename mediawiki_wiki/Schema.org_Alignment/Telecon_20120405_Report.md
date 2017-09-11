---
title: Telecon 20120405 Report
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405_Report.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 5 April 2012, at 22:55.  
This page has been accessed 28,166 times.

<pre>Schema.org Alignment Task Group - 2012-04-05 telecon - report

Agenda: <a href="/archive/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405" class="external free" rel="nofollow">/archive/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405</a>
This report: <a href="/archive/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405_Report" class="external free" rel="nofollow">/archive/mediawiki_wiki/Schema.org_Alignment/Telecon_20120405_Report</a>

Present: Tom (chair), Karen, Gordon, Antoine, Bernard, Kai (IRC)

Tom: We have:
    * wiki pages with information we need for comparing terms to be mapped (e.g., [1])
    * pages on issues raised (e.g., <a href="https://github.com/dcmi/schema.org/issues/9" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/issues/9</a>)
    * the draft mappings themselves, in RDF/XML format, on GitHub (<a href="https://github.com/dcmi/schema.org" class="external free" rel="nofollow">https://github.com/dcmi/schema.org</a>)
    * the mailing list, with a bit of everything.

    The information and comments we need to consider in order to make the
    mappings is spread all over and poorly linked. It is tedious even to pull these together
    into an agenda.

    Information about the properties and classes we are considering had to be
    laboriously cut-and-paste into [1] -- and we will have no way of knowing if
    the sources have changed if not by manually clicking on the links.

    Finally, the RDF/XML format on GitHub is nice, because it is already in a
    machine-readable form, but it is not friendly for users, so we would have
    to find some way to generate a Web page from these mappings that people can
    read and use. The RDF/XML format is also not ideal for citing in the
    GitHub issue tracker, because URIs with line references will be thrown out
    of sync as soon as we make edits.

    Finally, it is still unclear how we will be able to collect comments on the
    mappings on an ongoing basis.

    Antoine, you suggested we might move the mappings from RDF/XML into RDFa [2]?

    [1] <a href="/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>
    [2] <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1204&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=2541" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1204&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=2541</a>

Antoine: we could put these mappings into RDFa and point off to the discussion threads.
    For example, we could have an HTML representation of URL above - plus pointers to GitHub 
    issue tracker and mailing list. We could add RDFa markup into the head of that section.
	We could use the HTML of the wiki page as a starting point.

    [3] <a href="/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details#schema:Organization_rdfs:subClassOf_dct:Agent" class="external free" rel="nofollow">/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details#schema:Organization_rdfs:subClassOf_dct:Agent</a>

ACTION: Antoine and Tom to put wiki document Mappings_Details into RDFa.

----------------------------------------------------------------------
Issue 9: schemaorg type-properties and rdfs:domain (Bernard)
    <a href="https://github.com/dcmi/schema.org/issues/9" class="external free" rel="nofollow">https://github.com/dcmi/schema.org/issues/9</a>

Bernard: The Schema at RDFS.org is Michael Hausenblas's interpretation. It is
    more or less endorsed by schema.org itself, because there is a link. But there
    is also a rather inconspicuous schemaorg.owl schema, which is not in sync with
    the larger schema.org activity. DanBri says that the implicit semantics at 
    schema.org are not as specific as at rdfs.org. He suggests we use schema.org. 
    I am perplexed; am unsure we can rely on something that is not explicit.
	Issue: how will people use mappings that we publish? I just spoke with someone 
    who is using schema.org for a newspaper in French; they transform existing DC 
    into schema.org markup. Do we rely on something pragmatic? Turn DC into 
    Schema.org markup? Or do we say clearly we are using RDFS.org because schema.org 
    does not make available the equivalent?

Karen: It seems like a coin toss because we don't know which will be more stable.
    We should pick the one we think is more stable.

Bernard: If you go to schema.org itself, there are no formal definitions, but
    "types" and "properties" and "expected values", etc. but as DanBri explains,
    these are not the formal semantics of RDFS domain and range.
    These semantics are not expressed formally anywhere - except by Dan. I think 
    this is a shaky foundation to build on.
    Some properties are defined with a domain of Person _or_ Organization, for 
    example. If you want to express this "or", it translates into OWL union.
    
Antoine: Agree, but Dan seems to be saying we should not consider these domain
    statements, etc, as stable. Sceptical about the value of really precise 
    semantics in the DC context, because alot of properties are loosely defined - 
    just like Schema.org.

Bernard: But URIs used on both sides are the same (at schema.org and rdfs.org).
    If you assert any equivalence between DC and Schema.org property, the URI you 
    use as subject of the triple is something that has a weird status now.  
    Schema.org does not provide a description, because the URI is not dereferenceable. 
    The only dereferenceable definition is given by Schema.org. If we make mappings, 
    we have to be explicit about where the semantics are defined. If not at rdfs.org,
    where is there a formal definition?

Antoine: Okay with me to use rdfs.org. I will flag it if I see an rdfs.org definition 
    that is overcommitted - with semantics that are more constrained than the schema.org
    version.

GordonD: +1 for using rdfs.org

Karen: I'm not sure how we could do this otherwise. How could we express equivalence
    between things in RDF and things not in RDF?

Antoine: If equivalence is asserted between DC and non-RDF terms, implies that the 
    target propertiy "is a property" - an analogous problem.

Bernard: Antoine, this relates to HTTP Range-14. If the owner of the URI at
    Schema.org does not declare the semantics of the URI, someone else will, and
    this is exactly what is happening. Giving semantics to URIs not owned is
    what is happening now. The other users of the URI will rely on the first
    formal definition provided by whomever - not necessarily the publisher of
    the URI. Of course, if Schema.org publishes formal definitions, we should
    use them, but until then no choice.

Tom: If we were to decide otherwise, we would have to change the contents of [4], 
    which uses the formal definitions at rdfs.org.

    [4] <a href="/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details" class="external free" rel="nofollow">/archive/mediawiki_wiki/Schema.org_Alignment/Mappings_Details</a>

RESOLVED Use rdfs.org as basis of the mapping.

RESOLVED To Kirsten's question [5] -- how to add new proposals for mappings
    -- the response is to wait until the RDFa file is done, then fold in new 
    proposals there.

    [5] <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=14738" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&amp;L=dc-architecture&amp;F=&amp;S=&amp;P=14738</a>
</pre>

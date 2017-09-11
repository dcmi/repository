---
title: Ideas
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCMI_FOAF_Cooperation/Ideas.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 23 October 2011, at 21:38.  
This page has been accessed 112,427 times.

## Idea of a SPARQL service recording key namespaces 

From [http://lists.w3.org/Archives/Public/public-rdf-wg/2011Apr/0420.html](http://lists.w3.org/Archives/Public/public-rdf-wg/2011Apr/0420.html)&nbsp;:

<pre>Let me offer a practical use case: the evolving RDF graphs served from
FOAF and Dublin Core namespace URIs.

For the FOAF case xmlns="<a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a>", the RDF
available (via conneg, link rel or sometimes embedded in HTML) can be
found in our Subversion server at
<a href="http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/index.rdf" class="external free" rel="nofollow">http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/index.rdf</a>
... you can fetch any version going back to ~2002 via public SVN.

For the Dublin Core case, xmlns="<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>" and
others nearby are documented in <a href="http://dublincore.org/schemas/rdfs/" class="external free" rel="nofollow">http://dublincore.org/schemas/rdfs/</a>
including links to each version of the schema file, and with
social/process documentation of those changes at
<a href="http://dublincore.org/usage/terms/history/" class="external free" rel="nofollow">http://dublincore.org/usage/terms/history/</a>

Consider a SPARQL service devoted to keeping record of what key
namespaces have said about themselves over the years. They could take
each of these snapshot RDF files and put the corresponding triples in
a different named graph. (Maybe we should prepare N-Quads/Trig dumps
of the data for testing?).

We should be able to queries such as "when did foaf:givenName change
from Unstable status" or "when did DCMI begin to mention dc:audience
?". If we use the URI we 'GET'd for the graph name, these sort of
historically minded queries won't be possible as the graphs will get
mixed up.

All this talk of HTTP response codes is great and nice and practical,
... so long as we're crystal clear that the Web gives back different
things over time, and often we'll want to be explicit about that.
Eventually we'll also want to be a bit more clear about security
properties, such as which copies of a schema check out as having been
signed by such-and-so key.

cheers,

Dan

ps. for the foaf case, revisions are available via: svn log
<a href="http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/index.rdf" class="external free" rel="nofollow">http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/index.rdf</a>
...then you can pull them (per directory) eg. with: svn co -r r186
<a href="http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/" class="external free" rel="nofollow">http://svn.foaf-project.org/foaf/trunk/xmlns.com/htdocs/foaf/0.1/</a> ...
so you can see that
&lt;<a href="http://xmlns.com/foaf/0.1/homepage" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/homepage</a>&gt;
&lt;<a href="http://www.w3.org/2000/01/rdf-schema#domain" class="external free" rel="nofollow">http://www.w3.org/2000/01/rdf-schema#domain</a>&gt;
&lt;<a href="http://xmlns.com/foaf/0.1/Person" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/Person</a>&gt; .
...used to be in there, before we broadened it. Question to my mind
is, how do we elevate the tooling so you can find this out using
SPARQL and RDF instead of SVN and grep?
</pre>

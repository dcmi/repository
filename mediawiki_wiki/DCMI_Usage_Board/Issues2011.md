---
title: Issues2011
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCMI_Usage_Board/Issues2011.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 8 September 2011, at 20:23.  
This page has been accessed 58,572 times.

## Usage Board issues - 2011 

### 2011-06-23: [http://is.gd/v7hCfz](http://is.gd/v7hCfz) 
<pre>Prompted by answering a query about URIs for languages (and this is actually
an issue which I've wrangled with myself in some recent projects)...

DCMI says the range of the dcterms:language property is the class dcterms:LinguisticSystem

In the examples at

<a href="/mediawiki_wiki/User_Guide/Publishing_Metadata#dcterms:language.md" class="external free" rel="nofollow">/mediawiki_wiki/User_Guide/Publishing_Metadata#dcterms:language</a>

we have examples of lexvo.org URIs like

<a href="http://www.lexvo.org/page/iso639-3/eng" class="external free" rel="nofollow">http://www.lexvo.org/page/iso639-3/eng</a>

for individual languages 

&lt;aside&gt;
Oh, actually, I've just noticed a problem there that wasn't what I intended to
comment on. That is actually the URI of the document which describes the
language; the URI of the language itself is

<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>

So basically all those examples need to use the <a href="http://lexvo.org/id/iso639-3/%7Btag%7D" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/{tag}</a> pattern.
&lt;/aside&gt;

So lets assume those examples are corrected. We have

ex:myBook dcterms:language &lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt; .

And lexvo.org tells me that

&lt;<a href="http://lexvo.org/id/iso639-3/eng" class="external free" rel="nofollow">http://lexvo.org/id/iso639-3/eng</a>&gt; a lvont:Language .

And that class

&lt;<a href="http://lexvo.org/ontology#Language" class="external free" rel="nofollow">http://lexvo.org/ontology#Language</a>&gt; rdfs:subClassOf dcterms:LinguisticSystem .

So it's all good, as they say: both lexvo.org and DCMI say that the thing is an instance of dcterms:LinguisticSystem.

The question I was asked (and had asked myself earlier) was 

What about the LoC URIs like <a href="http://id.loc.gov/vocabulary/iso639-2/eng" class="external free" rel="nofollow">http://id.loc.gov/vocabulary/iso639-2/eng</a> ? Can I say

ex:myBook dcterms:language &lt;<a href="http://id.loc.gov/vocabulary/iso639-2/eng" class="external free" rel="nofollow">http://id.loc.gov/vocabulary/iso639-2/eng</a>&gt; .

Looking at what LoC says about <a href="http://id.loc.gov/vocabulary/iso639-2/eng" class="external free" rel="nofollow">http://id.loc.gov/vocabulary/iso639-2/eng</a> it's
an skos:Concept but AFAICT there is no information about any relationship with
the dcterms:LinguisticSystem class.

Now, I _think_ the intent is that these URIs are usable directly with
dcterms:language (as above). That would be "saying" the thing identified by
that URI is both an skos:Concept (from what LoC say) and a
dcterms:LinguisticSystem (from what DCMI say about dcterms:language). And that
seems fine: a Linguistic System is a "conceptual thing".

An alternative perspective would be that the thing defined by LoC is not
itself a Linguistic System but a concept which in some way "relates
to"/"refers to" a Linguistic System as a distinct entity i.e. what I tend to
think of as the "foaf:focus" case 

<a href="http://xmlns.com/foaf/spec/#term_focus" class="external free" rel="nofollow">http://xmlns.com/foaf/spec/#term_focus</a>

(It's probably a bit easier to think of the example of an entry for, say, a
place, where LCSH says that the LCSH entry for Africa

<a href="http://id.loc.gov/authorities/sh85001531#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh85001531#concept</a>

was created in 1986 and modified in 1999, but that wouldn't apply to the
actual physical continent itself - so foaf:focus allows you to treat them as
two distinct things and make a foaf:focus relation between the two) 

Applying this model to the language case, then, there might - I'm only saying
"might"! - be an argument that it would then be better to say

ex:myBook dcterms:language &lt;some-other-uri&gt; .

&lt;<a href="http://id.loc.gov/vocabulary/iso639-2/eng" class="external free" rel="nofollow">http://id.loc.gov/vocabulary/iso639-2/eng</a>&gt; foaf:focus &lt;some-other-uri&gt; .

(and that some-other-uri could be a lexvo.org URI)

I must admit that this seems to me to be making things rather more
subtle/complex than necessary!

But either way, I can see that this is almost certainly going to be an FAQ,
and I think it might be good to

(a) try and get some guidance from LoC on their intent - essentially: is it OK
to say <a href="http://id.loc.gov/vocabulary/iso639-2/eng" class="external free" rel="nofollow">http://id.loc.gov/vocabulary/iso639-2/eng</a> is a
dcterms:LinguisticSystem?
</pre><pre>(b) based on that answer, include some explicit examples of using the
id.loc.gov URIs alongside the lexvo.org URIs in our docs
</pre>
### 2011-07-23: [http://lists.w3.org/Archives/Public/public-lld/2011Jul/0044.html](http://lists.w3.org/Archives/Public/public-lld/2011Jul/0044.html) 
<pre>Hi Richard, all,

I am putting also the library linked data list into the loop, since many
people here are involved in dublin core, also specifically Tom Baker.

Best,

Felix

2011/7/23 Richard Ishida &lt;ishida@w3.org&gt;

&gt; I hope I'm addressing this to the right people. If not, please let me know
&gt; where to send.
&gt;
&gt; While reviewing the HTML5 Metaextensions registry I came across the entry
&gt; for dcterms.language. There are two issues with that that I'd like to bring
&gt; to your attention:
&gt;
&gt; [1] The description "A language of the resource. Recommended best practice
&gt; is to use a controlled vocabulary such as <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> [RFC4646]." is referring
&gt; to an out of date specification. <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> was obsoleted by <a href="http://tools.ietf.org/html/rfc5646" class="external mw-magiclink-rfc">RFC 5646</a>.
&gt;
&gt; It would be much better to refer to BCP 47 <a href="http://www.rfc-editor.org/rfc/*" class="external free" rel="nofollow">http://www.rfc-editor.org/rfc/*</a>
&gt; *bcp/bcp47.txt &lt;<a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt" class="external free" rel="nofollow">http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>&gt;. BCP 47 is
&gt; an unchanging name created specifically to refer to the latest version of
&gt; the specs related to tags for identifying languages.
&gt;
&gt;
&gt; [2] The 4th column contains the following text:
&gt;
&gt; "Redundant with the lang attribute on the html element. (Browsers pay
&gt; attention to the lang attribute but not dcterms.language)"
&gt;
&gt; It's not clear to me who wrote that, but it appears to be misleading.
&gt;
&gt; The lang (or xml:lang) attribute on the html element defines the default or
&gt; primary language of the *text* inside the html element (and is used by such
&gt; text-processing applications as spell-checking, style choices, voice browser
&gt; settings, etc. which need a clear indication of which (one) language they
&gt; are dealing with), whereas an indication of the language of 'the resource'
&gt; is presumably intended to be metadata about the intended audience of the
&gt; *resource as a whole*, as described in the HTTP specification referring to
&gt; the Content-Language header (<a href="http://tools.ietf.org/html/ **" class="external free" rel="nofollow">http://tools.ietf.org/html/** </a>
&gt; rfc2616#section-14.12 &lt;<a href="http://tools.ietf.org/html/rfc2616#section-14.12" class="external free" rel="nofollow">http://tools.ietf.org/html/rfc2616#section-14.12</a>&gt;).
&gt;
&gt; Note that the lang attribute can take only one language tag at a time as
&gt; its value, since the text it is referring to can only be in one language at
&gt; a time. The Content-Language header, however, can use as many language tags
&gt; as are appropriate to describe the intended audience of the resource.
&gt;
&gt; This makes the lang attribute and the Content-Language header like chalk
&gt; and cheese.
&gt;
&gt; Note also that the use of http-equiv=Content-Language on the meta element
&gt; was recently declared non-conformant in HTML5, due to the confusion that has
&gt; surrounded its use over the years. I'd hate to revive that confusion with
&gt; name=dcterms.language, and so I think it would be good to clarify the
&gt; intended usage.
&gt;
&gt; The loss of http-equiv=Content-Language of course means that there is no
&gt; in-document way of signalling language metadata for the resource. I'm
&gt; guessing that the intent of dcterms.language is to provide such a thing.
&gt;
&gt; If so, I think its usage needs to be described more clearly as metadata
&gt; about the intended audience of the resource, and linked to the HTTP
&gt; Content-Language header. It also has to allow for a comma-separated list of
&gt; language tags (using BCP 47 rules).
&gt;
&gt; If my assumptions are incorrect, I think it should be removed from the
&gt; metaextensions registry.
&gt;
&gt; I hope this is of some help. Please let me know your thoughts.
&gt;
&gt; Best regards,
&gt; Richard.
&gt;
&gt;
&gt; --
&gt; Richard Ishida
&gt; Internationalization Activity Lead
&gt; W3C (World Wide Web Consortium)
&gt;
&gt; <a href="http://www.w3.org/ **International/" class="external free" rel="nofollow">http://www.w3.org/** International/</a> &lt;<a href="http://www.w3.org/International/" class="external free" rel="nofollow">http://www.w3.org/International/</a>&gt;
&gt; <a href="http://rishida.net/" class="external free" rel="nofollow">http://rishida.net/</a>
&gt;
&gt;
&gt; Register for the W3C MultilingualWeb Workshop!
&gt; Limerick, 21-22 September 2011
&gt; <a href="http://multilingualweb.eu/ **register" class="external free" rel="nofollow">http://multilingualweb.eu/** register</a> &lt;<a href="http://multilingualweb.eu/register" class="external free" rel="nofollow">http://multilingualweb.eu/register</a>&gt;
&gt;
&gt;
</pre>

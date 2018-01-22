---
title: Issues2010
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCMI_Usage_Board/Issues2010.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 25 October 2011, at 22:50.  
This page has been accessed 96,993 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DCMI_Usage_Board_issues"><span class="tocnumber">1</span> <span class="toctext">DCMI Usage Board issues</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#URI_for_DCMI"><span class="tocnumber">1.1</span> <span class="toctext">URI for DCMI</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Corrections_to_DCAP_Guidelines"><span class="tocnumber">1.2</span> <span class="toctext">Corrections to DCAP Guidelines</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Well-known_URIs"><span class="tocnumber">1.3</span> <span class="toctext">Well-known URIs</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Property_for_.22Status.22"><span class="tocnumber">1.4</span> <span class="toctext">Property for "Status"</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#DCMI_Metadata_Terms_in_RDFa"><span class="tocnumber">1.5</span> <span class="toctext">DCMI Metadata Terms in RDFa</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#Definition_of_http:.2F.2Fpurl.org.2Fdc.2Fterms.2Flanguage"><span class="tocnumber">1.6</span> <span class="toctext">Definition of http://purl.org/dc/terms/language</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-8"><a href="#XML_Namespaces_in_DC-DS-XML_and_RDF.2FXML"><span class="tocnumber">2</span> <span class="toctext">XML Namespaces in DC-DS-XML and RDF/XML</span></a></li>
        <li class="toclevel-1 tocsection-9">
          <a href="#DC_terms_in_OWL"><span class="tocnumber">3</span> <span class="toctext">DC terms in OWL</span></a>
          <ul>
            <li class="toclevel-2 tocsection-10"><a href="#Legacy_usage_comments_implying_the_use_of_string_values"><span class="tocnumber">3.1</span> <span class="toctext">Legacy usage comments implying the use of string values</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#RDF_schema_issues"><span class="tocnumber">3.2</span> <span class="toctext">RDF schema issues</span></a></li>
            <li class="toclevel-2 tocsection-12"><a href="#Getting_access_to_purl.org.27d_RDF.2FXML_from_Javascript_via_CORS_headers"><span class="tocnumber">3.3</span> <span class="toctext">Getting access to purl.org'd RDF/XML from Javascript via CORS headers</span></a></li>
            <li class="toclevel-2 tocsection-13"><a href="#DC_in_OWL_-_Jeff_Young_input"><span class="tocnumber">3.4</span> <span class="toctext">DC in OWL - Jeff Young input</span></a></li>
            <li class="toclevel-2 tocsection-14"><a href="#DC_alignment_with_FOAF"><span class="tocnumber">3.5</span> <span class="toctext">DC alignment with FOAF</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-15">
          <a href="#Douglas_Campbell_suggestions"><span class="tocnumber">4</span> <span class="toctext">Douglas Campbell suggestions</span></a>
          <ul>
            <li class="toclevel-2 tocsection-16"><a href="#MARC_Relators"><span class="tocnumber">4.1</span> <span class="toctext">MARC Relators</span></a></li>
            <li class="toclevel-2 tocsection-17"><a href="#Inverse_properties"><span class="tocnumber">4.2</span> <span class="toctext">Inverse properties</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## DCMI Usage Board issues 

### URI for DCMI 

DCMI has coined a URI to identify itself (i.e., the organization Dublin Core Metadata Initiative Ltd) [1]. The URIs [1,2] return the response code 302 and redirect to [3].

- [1] [http://purl.org/dc/aboutdcmi#DCMI](http://purl.org/dc/aboutdcmi#DCMI)
- [2] [http://purl.org/dc/aboutdcmi](http://purl.org/dc/aboutdcmi)
- [3] [http://dublincore.org/DCMI.rdf](http://dublincore.org/DCMI.rdf)

The following responses suggest a need to coin URIs for many of the ideas and concepts that DCMI stands for (in addition to its communities and task groups, as we have already discussed). It raises the question of how much we should try to say with triples? And using URIs, how could we leverage such URIs and triples in our most basic user-oriented materials, such as a (completely revamped) FAQ and Glossary?

Reactions from pedantic-web@googlegroups.com.

- On Tue, Mar 09, 2010, Stuart A. Yeates wrote: "I think the obvious thing missing from this is a clear distinction between DCMI (the organisation) and DC (the metadata schema). Since confusion between these two is likely, I'd be very tempted to include information about DCMI as publisher of DC in there."
- Richard Cyganiak suggests:
  - The documentation for foaf:nick states:&nbsp;?The nick property relates a Person to a short (often abbreviated) nickname, such as those use in IRC chat, online accounts, and computer logins.? The property's range is undeclared in the RDFS file, so this should be considered a buglet in FOAF. But till it's resolved, it's perhaps better to avoid the property's use for non-foaf:Persons.
  - I would prefer if the dct:created literal was a typed literal with datatype xsd:date, although a plain literal is correct as well.
  - An addition of foaf:logo to the description would be a nice touch.
  - There should be some metadata about the \*file\* that describes the DCMI as well, that is, some statements about < [http://dublincore.org/](http://dublincore.org/) DCMI.rdf>. I would recommend to state values for the properties dct:title, dct:created, dct:modified, dct:license, dct:creator, foaf:primaryTopic.
    - Note: We're getting into recursion, or at least into a discussion on metametadata. Should we think of creating a file [http://dublincore.org/DCMI.rdf.rdf](http://dublincore.org/DCMI.rdf.rdf) with information about [http://dublincore.org/DCMI.rdf](http://dublincore.org/DCMI.rdf)?
  - A human-readable variant of the RDF file, served via content negotiation, would be quite nice. On Apache, this can be done quite easily by enabling the multi\_views module, and adding a </DCMI.html> file. Apache turns </DCMI> into a generic content-negotiated document.
  - As Stuart already said, DCMI is perhaps best known for the DC Element Set. You could state that DCMI created it, perhaps both in the dct:description and explicitly in RDF triples. This would help pinning down the referent of the URI.

### Corrections to [DCAP Guidelines](http://dublincore.org/documents/profile-guidelines/) 

- ACTION 2009-10-16: Tom to make correction in DCAP guidelines regarding ISO639-2 as proposed in consultation with co-author Karen Coyle.
  - Pete on 2009-07-23: On a related note, I see that in the ["Guidelines for Dublin Core Application Profiles"](http://dublincore.org/documents/2009/05/18/profile-guidelines/):
  - In the text in section 5, dcterms:ISO639-2 is (correctly) referred to as a SES, but in the XML version of the DSP in Appendix B, firstly the reference is to dcterms:ISO639-3, and secondly it is referred to as a VES.

- ACTION 2009-10-16: Tom to add resource class constraint to DCAP guidelines as proposed in consultation with co-author Karen Coyle.
  - Also I think in that example, each Description Template should have a Resource Class constraint, for the classes Book and Person respectively. As it stands at the moment (without those constraints), I think a description of a resource of any type will be bound to both templates, which fails the requirement in DSP section 3 that a description should be bound to exactly one DT. We should make this clearer in section 5 too, I think.

- Thread in dc-architecture:
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=2064](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=2064)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=2835](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=2835)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=3526](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=3526)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=4460](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=4460)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=5242](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=5242)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=5859](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=5859)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=6532](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=6532)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=7355](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=7355)
  - [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=8107](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&L=DC-ARCHITECTURE&P=8107)

### Well-known URIs 
<pre>* <a href="http://www.rfc-editor.org/rfc/rfc5785.txt" class="external free" rel="nofollow">http://www.rfc-editor.org/rfc/rfc5785.txt</a>
</pre><pre> * It is increasingly common for Web-based protocols to require the discovery
 of policy or other information about a host ("site-wide metadata") before
 making a request. For example, the Robots Exclusion Protocol
 &lt;<a href="http://www.robotstxt.org/" class="external free" rel="nofollow">http://www.robotstxt.org/</a>&gt; specifies a way for automated processes to obtain
 permission to access resources; likewise, the Platform for Privacy
 Preferences [W3C.REC-P3P-20020416] tells user-agents how to discover privacy
 policy beforehand. While there are several ways to access per-resource
 metadata (e.g., HTTP headers, WebDAV's PROPFIND [RFC4918]), the perceived
 overhead (either in terms of client-perceived latency and/or deployment
 difficulties) associated with them often precludes their use in these
 scenarios. When this happens, it is common to designate a "well-known
 location" for such data, so that it can be easily located. However, this
 approach has the drawback of risking collisions, both with other such
 designated "well-known locations" and with pre-existing resources. To
 address this, this memo defines a path prefix in HTTP(S) URIs for these
 "well-known locations", "/.well-known/". Future specifications that need to
 define a resource for such site-wide metadata can register their use to avoid
 collisions and minimise impingement upon sites' URI space.
</pre>
### Property for "Status" 
<pre>* <a href="http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&amp;L=DC-ARCHITECTURE&amp;P=12781" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&amp;L=DC-ARCHITECTURE&amp;P=12781</a>
* <a href="http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&amp;L=DC-ARCHITECTURE&amp;P=18257" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1004&amp;L=DC-ARCHITECTURE&amp;P=18257</a>
</pre><pre>* Two issues:
</pre><pre> * a property to relate a resource to its status, such as the dcterms:status that Bernard was looking for
</pre><pre> * a set of corresponding status values. As the draft [1] acknowledges, the
 statuses could be modeled using URI values rather than strings, which is what
 Bernard (and I) are looking for. As it is likely that "the exact meaning of
 stable/unstable/testing/archaic will vary from project to project," URIs
 could help sort that out. Some URIs, such as the status "DCMI
 Recommendation", would be completely context-specific. The property itself
 does seem like a pretty obvious piece of low-hanging fruit...
</pre>
### DCMI Metadata Terms in RDFa 
<pre>* <a href="http://ivan-herman.name/2010/05/28/self-documenting-vocabularies-using-rdfa/" class="external free" rel="nofollow">http://ivan-herman.name/2010/05/28/self-documenting-vocabularies-using-rdfa/</a>
</pre>
### Definition of [http://purl.org/dc/terms/language](http://purl.org/dc/terms/language) 
<pre>The range of dcterms:language is the class
<a href="http://purl.org/dc/terms/LinguisticSystem" class="external free" rel="nofollow">http://purl.org/dc/terms/LinguisticSystem</a>. On the other
hand the comment says "Recommended best practice is to use a
controlled vocabulary such as <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a>". But <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> does not
define languages as resources, only language codes. URIs from
<a href="http://lingvoj.org" class="external free" rel="nofollow">http://lingvoj.org</a> can be used as values of dcterms:language,
which is consistent since lingvoj.org ontology defined its
main class "Lingvo" as a subclass of dcterms:LinguisticSystem,
and lingvoj.org URIs for languages are built upon codes
conformant to BCP 47 (including <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a>).

Why <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> is recommended is probably a
legacy issue, because <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> obsoleted <a href="http://tools.ietf.org/html/rfc3066" class="external mw-magiclink-rfc">RFC 3066</a>, which in turn
obsoleted <a href="http://tools.ietf.org/html/rfc1766" class="external mw-magiclink-rfc">RFC 1766</a>, and <a href="http://tools.ietf.org/html/rfc1766" class="external mw-magiclink-rfc">RFC 1766</a> was recommended for use with
the "language element" in the original Dublin Core <a href="http://tools.ietf.org/html/rfc2413" class="external mw-magiclink-rfc">RFC 2413</a> of
1998 [3]. Nobody has ever raised an issue with this usage
comment, that I am aware.
   
 * [1] <a href="http://dublincore.org/documents/dcmi-terms/#ses-RFC4646" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/#ses-RFC4646</a>
 * [2] <a href="http://dublincore.org/documents/dc-rdf/" class="external free" rel="nofollow">http://dublincore.org/documents/dc-rdf/</a>
 * [3] <a href="http://www.ietf.org/rfc/rfc2413.txt" class="external free" rel="nofollow">http://www.ietf.org/rfc/rfc2413.txt</a>
 * [4] <a href="http://www.jiscmail.ac.uk/lists/dc-architecture.html" class="external free" rel="nofollow">http://www.jiscmail.ac.uk/lists/dc-architecture.html</a>

As of 2010-10-11, <a href="http://tools.ietf.org/html/rfc5646" class="external mw-magiclink-rfc">RFC 5646</a> has obsoleted <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a>.
</pre>
## XML Namespaces in DC-DS-XML and RDF/XML 
<pre>The RDF/XML "namespace documents" currently say things like:

dc:title rdfs:isDefinedBy &lt;<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>&gt; .

And

&lt;<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>&gt; dcterms:title "DCMI
Namespace for the Dublin Core Metadata Element Set, Version
1.1"@en-US .

(and so on)

There is arguably a contradiction being introduced between what
XML Namespaces says the URI <a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>
identifies and what the RDF data says it identifies. The
RDF data doesn't explicitly type that resource, and doesn't
say it's a member of a class which is disjoint with the
class of XML Namespaces - though the text in the Namespace
Policy document does say pretty much that. Arguably it
makes no sense to say that an RDF property is in any way
"defined by" an XML Namespace, which sort of implies that
<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a> must identify something
other than an XML Namespace.

The other issue is whether there is a distinction between
what the XML Namespaces spec means by "identifies" and what
RDF means by "denotes". Can a single URI "identify" an XML
Namespace but also "denote" something else?

This is the "pig farm" question that Patrick Stickler raised
back in 2004. Basically he was saying there were two options:

(i) ignore that the use of <a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>
as an XML Namespace name might imply any sense of what that
URI _denotes_ (in the RDF sense), and go ahead and say what
we want it to denote (or what the community has been using
it to denote). A hardline version of "namespaces are just
punctuation", if you like.

(ii) acknowledge that the use of
<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a> as an XML Namespace name
means that that involves, or might involve, some sense of
denotation, or some other constraints, "surrender" the use
of that URI for that purpose, and actively steer clear of
using that URI for some other purpose.

Patrick was perhaps arguing that while there was an argument
for doing (i), it would be wiser to do (ii) (recognise that
the pig farm exists and build elsewhere). See e.g.

<a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0409&amp;L=DC-ARCHITECTURE&amp;P=23827" class="external free" rel="nofollow">https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0409&amp;L=DC-ARCHITECTURE&amp;P=23827</a>

We ended up ignoring Patrick's advice and doing (i).
Can perhaps be justified by saying that there is nothing in
XML Namespaces which carries any sense of denotation in the
RDF sense.
</pre>
## DC terms in OWL 
<pre>Should DCMI Metadata Terms be specified more strongly using OWL? 

From: <a href="http://groups.google.com/group/pedantic-web/msg/24d8eaaebca1d3b2" class="external free" rel="nofollow">http://groups.google.com/group/pedantic-web/msg/24d8eaaebca1d3b2</a>

{{{
 On Wed, Mar 03, 2010 at 08:39:37AM -0800, Jonathan Rees wrote:
 &gt; &gt; On Wed, Feb 24, 2010 at 05:27:19PM +0000, Antoine Zimmermann wrote:
 &gt; &gt; &gt; Another slight problem of owl:equivalentProperty, though arguably
 &gt; &gt; &gt; minor, is that it is not part of the RDF/RDFS vocabulary. So, a pure
 &gt; &gt; &gt; RDFS reasoner or RDFS tool would simply ignore the two implicit
 &gt; &gt; &gt; rdfs:subPropertyOf. Â There is no reason to assume that all RDFS tool
 &gt; &gt; &gt; support the OWL vocabulary.
 &gt; &gt;
 &gt; &gt; Antoine raises another point on which I would appreciate feedback
 &gt; &gt; on DCMI's work.
 &gt; &gt;
 &gt; &gt; DCMI Metadata Terms [e.g., 1] are currently defined entirely
 &gt; &gt; using RDF and RDFS. Â Domains and ranges were assigned to most
 &gt; &gt; DCMI properties in 2007, as discussed in [2], but every DCMI
 &gt; &gt; property is still declared simply to be of type rdf:Property --
 &gt; &gt; not of type owl:DatatypeProperty, owl:ObjectProperty, or
 &gt; &gt; owl:InverseFunctionalProperty, etc, as in FOAF [3].
 &gt; &gt;
 &gt; &gt; DCMI metadata terms started to be coined in 1995, two years
 &gt; &gt; before RDF even began as a project, so much of DCMI's efforts
 &gt; &gt; have been about evolving with the times. Â Though we have
 &gt; &gt; certainly noticed the rising use of OWL for defining
 &gt; &gt; vocabularies, nobody has ever proposed that we revisit DCMI's
 &gt; &gt; RDF-based style for declaring terms. Â Indeed, Antoine's point
 &gt; &gt; above makes me wonder whether there might in fact be good
 &gt; &gt; reasons to continue along this current path - or, if we were to
 &gt; &gt; start using OWL vocabulary, to preserve compatibility with RDFS
 &gt; &gt; tools by using it only in addition to RDFS vocabulary.
 &gt; &gt;
 &gt; &gt; I would be very interested to hear views from members of this
 &gt; &gt; list on this question. Â As always, DCMI tries to promote
 &gt; &gt; solutions that can straightforwardly be imitated by others,
 &gt; &gt; so the general question is whether it is still good practice to
 &gt; &gt; declare such a vocabulary using just RDF and RDFS, or whether
 &gt; &gt; the use of OWL significantly enhances its usability, and if so,
 &gt; &gt; in what ways.
 &gt; 
 &gt; The DC terms are very popular, and in particular many users of OWL
 &gt; (and OWL-DL in particular) use them or adapt data sources that use
 &gt; them. The practice is generally to make a copy of DC and then edit it
 &gt; to turn it into an OWL or OWL-DL file. The popular ontology editor
 &gt; Protege even provides such a DC variant as part of its distribution.
 &gt; 
 &gt; I think users would be served better by having a common OWL-DL version
 &gt; of DC, whether provided by DCMI or by someone else. Protege's is close
 &gt; to being such (although it is based on dc: elements instead of dct:
 &gt; terms). One problem is the question of whether the properties should
 &gt; be annotation properties or object/data properties, which matters for
 &gt; DL. IIUC Protege takes the position that the dc: properties are all
 &gt; annotation properties, while Bibo says that the dct: properties are
 &gt; object/data properties. I could fully sympathize if DCMI didn't want
 &gt; to get into the middle of this feud.
 &gt; 
 &gt; Best
 &gt; Jonathan
 &gt; 
 &gt; <a href="http://groups.google.com/group/bibliographic-ontology-specification-group/browse_thread/thread/55e19fa2a18e8fdf?hl=en" class="external free" rel="nofollow">http://groups.google.com/group/bibliographic-ontology-specification-group/browse_thread/thread/55e19fa2a18e8fdf?hl=en</a>
 &gt; <a href="http://protege.stanford.edu/plugins/owl/dc/protege-dc.owl" class="external free" rel="nofollow">http://protege.stanford.edu/plugins/owl/dc/protege-dc.owl</a>
}}}

See also <a href="http://bloody-byte.net/rdf/dc_owl2dl/index.html" class="external free" rel="nofollow">http://bloody-byte.net/rdf/dc_owl2dl/index.html</a>.

See also <a href="http://lists.w3.org/Archives/Public/public-xg-lld/2010Nov/0109.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-xg-lld/2010Nov/0109.html</a> -
Jeff Young arguing that DCMI should upgrade vocabulary to distinguish
DatatypeProperty and ObjectProperty.
</pre>
### Legacy usage comments implying the use of string values 
<pre>* Pete, 2009-03-19, <a href="https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0903&amp;L=DC-USAGE&amp;P=2467" class="external text" rel="nofollow">points out on dc-usage</a>:
</pre><pre> * [<a href="http://dublincore.org/documents/dcmi-terms/#terms-coverage" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/#terms-coverage</a>
  dcterms:coverage]: "Where appropriate, named places or time periods can be
  used in preference to numeric identifiers such as sets of coordinates or
  date ranges." 
</pre><pre> * [<a href="http://dublincore.org/documents/dcmi-terms/#terms-relation" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/#terms-relation</a>
  dcterms:relation] and
  <a href="http://dublincore.org/documents/dcmi-terms/#terms-source" class="external text" rel="nofollow">dcterms:source</a>:
  "Recommended best practice is to identify the related resource by means of a
  string conforming to a formal identification system."
</pre><pre> * Pete, 2009-04-22, Maybe comment for dcterms:coverage should read: "Where
  appropriate, named places or time periods can be used in preference to sets
  of coordinates or date ranges."
</pre>
### RDF schema issues 
<pre>* <a href="http://dublincore.org/2008/01/14/dcterms.rdf#MESH" class="external free" rel="nofollow">http://dublincore.org/2008/01/14/dcterms.rdf#MESH</a> should not contain "#" sign? Some diagnostics get this as an error message.
</pre><pre>* ^^xsd:date for dates. 
</pre><pre>* English as "en" or "en-US"?
</pre><pre>* <a href="http://dublincore.org/schemas/dcterms.rdf" class="external free" rel="nofollow">http://dublincore.org/schemas/dcterms.rdf</a> or so, redirecting to the latest
version - like SKOS and FOAF - redirect or just internal URL rewrite
</pre><pre>* <a href="http://dublincore.org/documents/2008/01/14/dcmi-terms/#terms-abstract" class="external free" rel="nofollow">http://dublincore.org/documents/2008/01/14/dcmi-terms/#terms-abstract</a> - a
click on the Refines value (<a href="http://purl.org/dc/terms/description" class="external free" rel="nofollow">http://purl.org/dc/terms/description</a>) jumps to RDF
schema. Expected: jump in the document to the definition of
dcterms:description.
</pre><pre>* Use "in-range-of" as FOAF does: <a href="http://xmlns.com/foaf/spec/#term_Document" class="external free" rel="nofollow">http://xmlns.com/foaf/spec/#term_Document</a>.
E.g.: &lt;a href="#terms-description"&gt;<a href="http://purl.org/dc/terms/description" class="external free" rel="nofollow">http://purl.org/dc/terms/description</a>&lt;/a&gt;
</pre><pre>* Need prominent link to RDF schemas in dcmi-terms
</pre><pre>* URI subject of triples in the RDF representation is the same as the
namespace URI, e.g., <a href="http://purl.org/dc/dcam/" class="external free" rel="nofollow">http://purl.org/dc/dcam/</a>
<a href="http://purl.org/dc/terms/publisher" class="external free" rel="nofollow">http://purl.org/dc/terms/publisher</a> <a href="http://purl.org/dc/aboutdcmi#DCMI" class="external free" rel="nofollow">http://purl.org/dc/aboutdcmi#DCMI</a>. This is
consistent with <a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a>
<a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#type" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#type</a>
<a href="http://www.w3.org/2002/07/owl#Ontology" class="external free" rel="nofollow">http://www.w3.org/2002/07/owl#Ontology</a>, but not with
<a href="http://www.w3.org/2004/02/skos/core" class="external free" rel="nofollow">http://www.w3.org/2004/02/skos/core</a>
<a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#type" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#type</a>
<a href="http://www.w3.org/2002/07/owl#Ontology" class="external free" rel="nofollow">http://www.w3.org/2002/07/owl#Ontology</a>. What is current best practice, and
should we change the RDF schema accordingly?
</pre><pre>* Related to the above, should the RDF representation include a triple with "rdf:type owl:Ontology"?
</pre>
### Getting access to purl.org'd RDF/XML from Javascript via CORS headers 
<pre><a href="http://groups.google.com/group/persistenturls/browse_thread/thread/d4c5d9880b4fb5fb" class="external free" rel="nofollow">http://groups.google.com/group/persistenturls/browse_thread/thread/d4c5d9880b4fb5fb</a>
See <a href="http://enable-cors.org" class="external free" rel="nofollow">http://enable-cors.org</a> for a bit more info. The idea is that it
allows javascript apps to read DC schemas. Whether they need to is up
for discussion of course.

Getting the Dublic Core schemas exposed to JS involves adding a single CORS header, details below - Tom Dehn would need to cover the purl.org side of things.

Instructions (and discussion thread) at: <a href="http://lists.w3.org/Archives/Public/public-lod/2010Oct/0181.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-lod/2010Oct/0181.html</a>
</pre>
### DC in OWL - Jeff Young input 
<pre>Also: notion of shortcut properties.
</pre><pre>* <a href="http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0024.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0024.html</a>
* <a href="http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0023.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0023.html</a>
* <a href="http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0025.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0025.html</a>
* <a href="http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0027.html" class="external free" rel="nofollow">http://lists.w3.org/Archives/Public/public-xg-lld/2010Dec/0027.html</a>
</pre>
### DC alignment with FOAF 
<pre>{{{
&lt;owl:Ontology rdf:about="<a href="http://www.geonames.org/ontology" class="external free" rel="nofollow">http://www.geonames.org/ontology</a>"&gt;
  &lt;dcterms:isReferencedBy rdf:resource="<a href="http://www.geonames.org/ontology/documentation.html" class="external free" rel="nofollow">http://www.geonames.org/ontology/documentation.html</a>"/&gt;
  &lt;foaf:isPrimaryTopicOf rdf:resource="<a href="http://www.geonames.org/ontology/documentation.html" class="external free" rel="nofollow">http://www.geonames.org/ontology/documentation.html</a>"/&gt;
}}}
</pre><pre>How redundant are the two properties? Could
foaf:isPrimaryTopicOf be declared as subproperty of
dcterms:isReferencedBy?

Dan says: There may be some linked meaning, but 'being referenced by'
something doesn't imply that the former's topic is the latter, much less
primary topic. He has wondered about 'mentions' as a milder-than-topic link
type useful for named entity recognition tools to output. On the other side,
perhaps something can even be primarily about something without even
specifically referencing it. Images and audio for example are doc forms that
don't have explicit referencing mechanisms. Not sure how far dc can be
stretched there...
</pre><pre>foaf:Agent equivalentClass dct:Agent (FOAF already says this)
* one might reasonably define the terms "agent", "org" and "project" in a way that makes them not disjoint
* re mapping dc and foaf, whether to use class machinery to talk about sets of people (eg, dct:AgentClass)
* foaf:membershipClass for a foaf:Group as dct:AgentClass?
  * awkward straddling of the schema / instance data divide
* <a href="http://wiki.foaf-project.org/w/VocabMapping" class="external free" rel="nofollow">http://wiki.foaf-project.org/w/VocabMapping</a>
</pre>
## Douglas Campbell suggestions 
<pre>DCMI owl:sameAs-ing (or similar) alignments, eg:
foaf:name -&gt; dc:title.
skos:prefLabel -&gt; dc:title.
foaf:Person -&gt; dcmitype:Entity.
skos:Concept -&gt; dcmitype:Concept.
Note <a href="http://dublincore.org/documents/dcmi-terms/#classes-Agent" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/#classes-Agent</a>, which only happens not to be part
of the DCMI Type Vocabulary.
</pre>
### MARC Relators 
<pre>* 2005 <a href="http://dublincore.org/documents/dc-elem-refine/" class="external free" rel="nofollow">http://dublincore.org/documents/dc-elem-refine/</a>
* 2005 <a href="http://dublincore.org/documents/usageguide/appendix_roles.shtml" class="external free" rel="nofollow">http://dublincore.org/documents/usageguide/appendix_roles.shtml</a>
* 2005 <a href="http://dublincore.org/usage/documents/relators/" class="external free" rel="nofollow">http://dublincore.org/usage/documents/relators/</a>
* 2005 <a href="http://www.loc.gov/loc.terms/relators/dc-contributor.html" class="external free" rel="nofollow">http://www.loc.gov/loc.terms/relators/dc-contributor.html</a>
* 2005 <a href="http://www.loc.gov/loc.terms/relators/dc-relators.html" class="external free" rel="nofollow">http://www.loc.gov/loc.terms/relators/dc-relators.html</a>
* 2005 <a href="http://www.loc.gov/loc.terms/relators/dc-relators.xml" class="external free" rel="nofollow">http://www.loc.gov/loc.terms/relators/dc-relators.xml</a>
* <a href="http://id.loc.gov" class="external free" rel="nofollow">http://id.loc.gov</a>
* MARC properties are subproperties of dc:contributor - what about dcterms:contributor, etc
</pre>
### Inverse properties 
<pre>* dct:isReplacedBy owl:inverseOf dct:replaces
</pre>

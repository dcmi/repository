---
title: RFC-6906-Profiles
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/RFC-6906-Profiles.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 10 March 2014, at 12:35.  
This page has been accessed 27,939 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Using_RFC_6906_Profiles_to_specify_a_profile_independently_of_the_media_type"><span class="tocnumber">1</span> <span class="toctext">Using RFC 6906 Profiles to specify a profile independently of the media type</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Introduction"><span class="tocnumber">1.1</span> <span class="toctext">Introduction</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Proposed_solution"><span class="tocnumber">1.2</span> <span class="toctext">Proposed solution</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Implementation"><span class="tocnumber">1.3</span> <span class="toctext">Implementation</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Other_possibility:_specify_the_profile_in_the_Accept-Header"><span class="tocnumber">1.4</span> <span class="toctext">Other possibility: specify the profile in the Accept-Header</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Using [RFC 6906](http://tools.ietf.org/html/rfc6906) Profiles to specify a profile independently of the media type 

## Introduction 

This use case is not about _representing_ profiles, but rather about _using_ them. Precisely, this use case does not depend on the representation of the profile, but on the profile having a URI for identification. In order to keep up with best practices, that URI SHOULD dereference to a representation, possibly using content negotiation to deliver human- and machine-readable interpretations.

There are cases, when it is necessary to deliver information about the same entity in several formats. As long as the formats can be mapped to media types – e. g. X(HTML), PDF, RDF/XML or Turtle – this can be handled through Content Negotiation on the http Accept-Header; in that case the Client specifies in the request a list of Content-Types (a.k.a. Mime-Types) that it can handle and the server answers with contents in one of the requested formats or with http Status Code <tt>406 (Not acceptable)</tt> if it doesn’t support either of the media types. Sometimes the client wants not require only a particular media type, but also needs the data according to a particular application profile.

## Proposed solution 

In addition to the content type in the Accept-header, the client can specify a profile using the Link-header. [RFC 6906](http://www.ietf.org/rfc/rfc6906.txt) specifies profiles as a possibility "to include additional [i. e. more than the accept header can convey] information about the nature of the resource. This would allow a client understanding this additional information to react in a way specific to that specialization of the resource, where the specialization can be about constraints, conventions, extensions, or any other aspects that do not alter the basic media type semantics." Particularly the possibility to send information on conventions and extensions is relevant for this use case. Thus the proposed solution is to let the client use the Link-header to specify a profile and tell the server if it wants standard RDF or if it requests the data to adhere to a specific application profile.

## Implementation 

In addition to the Accept-Header, the http request contains a Link-Header specifying the requested profile:

<pre>Accept: application/rdf+xml
Link: &lt;http://example.com/profiles/foo&gt;; rel="profile"
</pre>

If the server cannot deliver content in the specified profile, it can use one of two possibilities:

1. Return <tt>http 406 (Not Acceptable)</tt>
2. Return the data in a default profile

## Other possibility: specify the profile in the Accept-Header 

Theoretically, the profile can be part of the Accept-Header:

<pre>Accept: application/rdf+xml;profile=&lt;http://d-nb.info/standards/profile/DINI-KIM&gt;
</pre>

The use of profiles in the accept header depends on the media type. In the IANA Media Type Registry only two media types relevant to linked data are designed to use profiles:

1. XHTML (application/xhtml+xml) [RFC 3236](http://www.rfc-editor.org/rfc/rfc3236.txt)
2. JSON-LD (application/ld+json) [IANA-Registry](https://www.iana.org/assignments/media-types/application/ld+json)

The following do not mention the use of profile

1. RDF/XML (application/rdf+xml) [RFC 3870](http://www.ietf.org/rfc/rfc3870.txt)
2. Turtle (text/turtle) [IANA-Registry](https://www.iana.org/assignments/media-types/text/turtle)
3. html (text/html) [IANA-Registry](https://www.iana.org/assignments/media-types/text/html)

Thus the link-header seems to be the only possibility.


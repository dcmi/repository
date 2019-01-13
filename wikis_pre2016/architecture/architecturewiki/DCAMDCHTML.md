---
title: "- DCAMDCHTML"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCAMDCHTML.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCAMDCHTML](http://dublincore.org/architecturewiki/DCAMDCHTML?action=fullsearch&value=DCAMDCHTML&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCAMDCHTML?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCAMDCHTML "View")
- [Diffs](http://dublincore.org/architecturewiki/DCAMDCHTML?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCAMDCHTML?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCAMDCHTML?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCAMDCHTML?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCAMDCHTML?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCAMDCHTML?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCAMDCHTML?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCAMDCHTML?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCAMDCHTML?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCAMDCHTML?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCAMDCHTML?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCAMDCHTML">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCAMDCHTML_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCAMDCHTML_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Notes on expressing Dublin Core metadata in HTML and XHTML

### Introduction

This document discusses the use of the <tt>meta</tt> and <tt>link</tt> elements of HTML/XHTML for expressing Dublin Core metadata. More specifically, it focuses on the use of these elements to represent a DC metadata _description set_, as defined by the "Description Set Model" of the DCMI Abstract Model [DCAM]. In terms of the draft _Interoperability levels for Dublin Core metadata_ [DC-LEVELS], it focuses on "DCAM-based syntactic interoperability" ("Level 3" interoperabilty) , with some reference to "Semantic interoperability" ("Level 2" interoperabilty), based on the RDF model.

In order for applications to store or exchange DC metadata _description sets_, instances of those information structures must be represented in some concrete digital form according to the rules of a format or syntax. The DCMI Abstract Model itself does not define any such concrete formats or syntaxes for representing a DC metadata _description set_; DCMI defers that role to the family of specifications it refers to as "encoding guidelines".

Such a specification performs three functions:

- it defines the subset of the features of the DCAM description set model which the syntax supports

- it describes how each of the supported constructs and components of the DCAM _description set_ are "encoded" in the concrete format

- (conversely) it describes how features of the format are to be interpreted or "decoded" as representing constructs and components of the DCAM _description set_

The role of "encoding guidelines" and their relationship to the DCAM is illustrated graphically in the introduction to the tutorial on "Basic Syntax" presented at the DC-2007 conference [SYNTAXTUT].

### Encoding DC metadata using HTML/XHTML

For encoding DC metadata in an HTML/XHTML document, the constructs of a DC metadata _description set_ are represented in the document header as HTML/XHTML elements and attributes and as element content and attribute values. The conventions used for defining these <tt>meta</tt> and <tt>link</tt> elements and their attributes are described in what the HTML specification calls a "meta data profile" [HTML-PROFILE]. This "meta data profile" is identified by a URI and specifically declared in the document header using a 'profile' element, as in:

<pre>&lt;head profile="http://dublincore.org/documents/2007/11/05/dc-html/"&gt;
</pre>

The presence of this URI in the profile attribute indicates that the meta data profile should be applied in order to interpret the given HTML or XHTML instance.

DCMI currently defines two such meta data profiles:

- a profile defined by the document _Expressing Dublin Core in HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ [DC-HTML-2003] and identified by the URI <tt>http://dublincore.org/documents/dcq-html/</tt>, and

- a profile defined by the document _Expressing Dublin Core using HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ [DC-HTML-2008] and identified by the URI <tt>http://dublincore.org/documents/2008/mm/dd/dc-html/</tt>.

Documents encoded using HTML/XHTML can make use of one or more meta data profiles, and it discloses the URIs of the profile(s) used as the value of the <tt>profile</tt> attribute of the HTML/XHTML <tt>head</tt> element.

### Comparison between the DC-HTML-2003 and DC-HTML-2008 HTML/XHTML meta data profiles

The DC-HTML-2003 profile and the DC-HTML-2008 profile are two **different** HTML meta data profiles. The DC-HTML-2008 profile is specified in terms of the DCAM description set model and all features of the profile have a well-defined mapping to the constructs of the DCAM _description set_. The DC-HTML-2003 profile was not defined in terms of the DCAM description set model, which did not exist in today's form. Although a retrospective mapping to the DCAM _description set_ can be constructed, only some features of the profile have a mapping to the constructs of the _description set_. (For a full explanation of how the DCAM interpretation of the DC-HTML-2003 profile is constructed, see Appendix A.)

The features of the DCAM description set supported by the two meta data profiles are summarised in the following table:

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>DCAM Description Model feature</strong> </td>
      <td>
        <strong>Supported in DC-HTML-2003</strong> </td>
      <td>
        <strong>Supported in DC-HTML-2008</strong> </td>
    </tr>
    <tr>
      <td>
        <em>description set</em> </td>
      <td>
        One description set </td>
      <td>
        One description set </td>
    </tr>
    <tr>
      <td>
        <em>description</em> </td>
      <td>
        One description </td>
      <td>
        One description </td>
    </tr>
    <tr>
      <td>
        <em>described resource URI</em> </td>
      <td>
        Document URI/Base URI </td>
      <td>
        Document URI/Base URI </td>
    </tr>
    <tr>
      <td>
        <em>statement</em> </td>
      <td>
        Multiple statements </td>
      <td>
        Multiple statements </td>
    </tr>
    <tr>
      <td>
        <em>property URI</em> </td>
      <td>
        Supported </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>literal value surrogate</em> </td>
      <td>
        Partly supported </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>literal value surrogate / value string</em> </td>
      <td>
        Supported </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>literal value surrogate / value string language</em> </td>
      <td>
        Supported </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>literal value surrogate / SES URI</em> </td>
      <td>
        <strong>Not supported</strong> </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate</em> </td>
      <td>
        Partly supported </td>
      <td>
        Partly supported </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate / value string</em> </td>
      <td>
        <strong>Not supported</strong> </td>
      <td>
        Max one value string supported </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate / value string language</em> </td>
      <td>
        <strong>Not supported</strong> </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate / SES URI</em> </td>
      <td>
        <strong>Not supported</strong> </td>
      <td>
        <strong>Not supported</strong> </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate / value URI</em> </td>
      <td>
        Supported </td>
      <td>
        Supported </td>
    </tr>
    <tr>
      <td>
        <em>non-literal value surrogate / VES URI</em> </td>
      <td>
        <strong>Not supported</strong> </td>
      <td>
        <strong>Not supported</strong> </td>
    </tr>
  </tbody>
</table>


In terms of the features of the DCAM description set model supported, the differences between them are:

- The DC-HTML-2008 profile supports _syntax encoding schemes_ for _value strings_ in _literal value surrogates_; the DC-HTML-2003 profile does not support _syntax encoding schemes_ for _value strings_ in _literal value surrogates_

- The DC-HTML-2008 profile supports a single _value string_ in _non-literal value surrogates_; the DC-HTML-2003 profile does not support _value strings_ in _non-literal value surrogates_

Note that neither the DC-HTML-2003 profile nor the DC-HTML-2008 profile supports the encoding of _vocabulary encoding scheme URIs_.

There are also differences in the syntactic features themselves:

- The DC-HTML-2008 profile provides a mechanism for representing a _property URI_ as a "prefixed name"; the DC-HTML-2003 profile provides a similar, but slightly different, mechanism, and includes the use of what for the purposes of this discussion are referred to as "composite prefixed names" (e.g. "DC.date.created"). For these "composite prefixed names", a mapping to URIs requires that the mapping algorithm includes information about all the URIs involved, which is clearly not a scalable solution.

In any HTML/XHTML document, the value of the <tt>profile</tt> attribute of the <tt>head</tt> element specifies which meta data profiles are used in that document. A document with a <tt>profile</tt> value of <tt>http://dublincore.org/documents/dcq-html/</tt> is intended to be interpreted using the DC-HTML-2003 profile; and a document with a <tt>profile</tt> value of <tt>http://dublincore.org/documents/2008/mm/dd/dc-html/</tt> is intended to be interpreted using the DC-HTML-2008 profile. Note that the presence of the URI of a profile licenses the interpretation of the document in accordance with the rules of that profile.

If both DCMI profile URIs are present, then a processor may apply both interpretations. However, metadata providers should use this combination with caution. It is important to note that some of the conventions used in the DC-HTML-2003 profile will generate quite different sets of statements when interpreted using the DC-HTML-2008 profile. This is the case for "composite prefixed names", for example. Consider the following example:

<pre>&lt;!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
   "http://www.w3.org/TR/html4/strict.dtd"&gt;
&lt;html&gt;
&lt;head profile="xxx yyy"&gt;
&lt;title&gt;My Document&lt;/title&gt;
&lt;link rel="schema.DC" href="http://purl.org/dc/elements/1.1/" &gt;
&lt;meta name="DC.date.modified" content="2007-07-22" &gt;
&lt;/head&gt;
&lt;body&gt;
&lt;/body&gt;
&lt;/html&gt;
</pre>

According to the DC-XHTML-2003 profile, this should be interpreted as encoding a single _statement_ with a _property URI_ <tt>http://purl.org/dc/terms/modified</tt> ; interpreted acording to the DC-XHTML-2008 profile, it generates a single _statement_ with a _property URI_ <tt>http://purl.org/dc/elements/1.1/date.modified</tt>. So if the document signals the use of both profiles, or if the value of the <tt>profile</tt> attribute is simply changed from <tt>http://dublincore.org/documents/dcq-html/</tt> to <tt>http://dublincore.org/documents/2008/mm/dd/dc-html/</tt> without changing the content of the <tt>meta/@name</tt> attribute, then unexpected interpretations of the data will result.

If neither DCMI profile URI is present, then no interpretation is licensed by DCMI specifications. An application may apply an interpretation of such a document as a DC _description set_, either as the result of the use of another profile defined by an agency other than DCMI, or as the result of some other agreement between provider and consumer.

The choice of profile depends on the requirements of the application: as the table above indicates, the DC-HTML-2008 profile supports some features of the DCAM _description set model_ which are not supported by the DC-HTML-2003 profile (_syntax encoding scheme URIs_ for _literal value surrogates_ and _value strings_ for _non-literal value surrogates_). It also simplifies the mechnism for encoding _property URIs_. The use of the profile attribute ensures that there is no question of ambiguity or confusion over how the provider of any document intends that it should be processed.

### Recommendations

A **provider** of DC _description sets_ encoded in the header of an HTML/XHTML document:

- **MAY** use one or more of the meta data profiles defined by DCMI or **MAY** use a meta data profile defined by another party.

- **MUST** indicate the meta data profile(s) in use by providing a suitable value for the profile attribute.

- **SHOULD** ensure that their encoded data is consistent with the semantics defined by the meta data profile(s) they specify. In particular, a consumer:

  - **SHOULD** provide "namespace declarations" (using the <tt>link/@rel="schema.xxx"</tt> convention) for the prefixes in prefixed names used as abbreviations for URIs, both in documents which use the DC-HTML-2003 profile and in documents which use the DC-HTML-2008 profile

  - **SHOULD NOT** use "composite prefixed names" (like "DC.date.created" as abbreviation for the URI <tt>http://purl.org/dc/terms/created</tt> ) in a document which uses the DC-HTML-2008 profile.

A **consumer** of DC _description sets_ encoded in the header of an HTML/XHTML document :

- **SHOULD** interpret the data in accordance with the meta data profile(s) specified in the value of the profile attribute. For "level 2"/"Semantic Interoperability", for the profiles provided by DCMI, this will be supported by the provision of GRDDL profile transformations available from the profile documents [GRDDL].

- **SHOULD NOT** apply an interpretation which is not licensed by the meta data profile(s) specified in the value of the profile attribute, unless there is some other agreement on interpretation between provider and consumer. In particular, a consumer:

  - **SHOULD** generate URIs from prefixed names using the rules specified in the profile(s) used in the document.

  - **SHOULD NOT** generate URIs from prefixed names using techniques other than those specified in the profile(s) used in the document.

  - **SHOULD NOT** interpret the <tt>scheme</tt> attribute of the <tt>meta</tt> element when interpreting a document using the DC-HTML-2003 profile.

### Appendix A: DC-HTML-2003 and the DCAM

#### Expressing Dublin Core in HTML/XHTML `meta` and `link` elements (2003)

The DCMI Recommendation, _Expressing Dublin Core in HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ [DC-HTML-2003] pre-dates the development of the DCAM, so it does not perform the functions described in the introduction to this document: it does not describe either how components of (a subset of) the DCAM description set model are to be "encoded", or how features of the format are to be interpreted as representing a DC metadata _description set_.

However, DC-HTML-2003 does broadly follow the general approach described above, of making a distinction between an information structure (which it calls a "DC record") and the way that record is represented. Essentially, it defines its own "description model", based on the concept of the "DC record", and describes how instances of that information structure are to be represented in HTML/XHTML documents. The DC-HTML-2003 concept of the "DC record" is not based on the DCAM description set model, and indeed it uses some of the same terminology used in the DCAM, but with different meanings.

So any attempt to provide an interpretation of the DC-HTML-2003 recommendation in terms of the DCAM description is - must be - a retrospective exercise. It depends on a two stage process:

- defining a mapping from the DC-HTML-2003 "DC record" information structure to the DCAM _description set_ information structure, in such a way that "what is said" by a DCAM _description set_ is consistent with "what is said" by a "DC record"

- based on that mapping between the two information structures, then establishing the mapping between the syntactic constructs used and the components of the DCAM _description set_

If the first step reveals that some components of a "DC record" can not be mapped to components of the DCAM _description set_, then there will be aspects of the syntax which, while they do have an interpretation as representing components of a "DC record", do not have an interpretation as representing components of the DCAM _description set_. And similarly, the first step may show that there are constructs and components of the DCAM _description set_ which have no correspondence in the "DC record", in which case there will be no syntactic representation of those constructs and components in the current (DC-HTML-2003) meta data profile.

#### Mapping the "DC record" to the ''description set''

Two approaches might be taken to constructing such a mapping

- an approach based on the interpretation of "what is said" in "informal" human-readable terms by a "DC record" and a DCAM _description set_;

- an approach based on examining the "formal" interpretation of "what is said" by a "DC record" represented in HTML/XHTML using the DC-HTML-2003 HTML/XHTML meta data profile in terms of the RDF model and then using the description of "what is said" by a DCAM _description set_ in terms of the RDF model, as defined by the DCMI Recommendation _Expressing Dublin Core using the Resource Description Framework_ [DCRDF], to derive a mapping between the "DC record" and the _description set_. While DCMI itself did not specify an RDF interpretation of the DC-HTML-2003 HTML/XHTML meta data profile, such interpretations have been provided by two other sources:

  - Dan Connolly (W3C) has provided an XSLT transform [DC-EXTRACT] which takes as input an instance of the DC-HTML-2003 profile and outputs RDF/XML

  - Ian Davis (Talis) defined a separate, more generic set of conventions for embeddimg RDF triples into HTML/XHTML called Embedded RDF [ERDF]. While there is no formal association between Embedded RDF and the DC-HTML-2003 profile, the documentation for Embedded RDF notes that it was designed to be compatible with the DC-HTML-2003 profile, so an Embedded RDF interpretation can be made for an instance of the DC-HTML-2003 profile.

The first thing to note is that, unfortunately, the concept of the "DC record" in the DC-HTML-2003 document is highly underspecified. The introduction refers to a "record" as

<pre> some structured metadata about a resource, comprising one or more properties and their associated values.
</pre>

In the context of DC-HTML-2003, the term "value" is used to refer to a literal. However the document goes on to discuss concepts such as "element", "element refinement", "encoding scheme" and "language", and how instances of these concepts should be represented using the HTML/XHTML profile without ever explaining how the relationship of these concepts to that of the "record". For the purpose of this discussion, we assume that (using these terms as they are used in DC-HTML-2003, not as they are used in the DCAM):

- an element is a property

- an element refinement is a property

- a value may be associated with a encoding scheme

- a value may be associated with a language

Such an interpretation seems consistent with the use of those terms in the DCMI Recommendation _Guidelines for implementing Dublin Core in XML_ [DC-XML-2003], which provides more explicit "abstract models" for the data being represented.

#### The "informal" approach

The following table is an attempt to specify a mapping between the "DC record" described by DC-HTML-2003 and the _description set_ described by the DCAM, such that the assertions made by the _description set_ correspond to - or at least do not contradict - the assertions made by the "DC record".

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>DC-HTML-2003</strong> </td>
      <td>
        <strong>DCAM</strong> </td>
    </tr>
    <tr>
      <td>
        "DC record"</td>
      <td>
        <em>description set</em> containing a single <em>description</em>
      </td>
    </tr>
    <tr>
      <td>
        "Property + Value"</td>
      <td>
        <em>statement</em>
      </td>
    </tr>
    <tr>
      <td>
        "URI of Property"</td>
      <td>
        <em>property URI</em>
      </td>
    </tr>
    <tr>
      <td>
        "Value"</td>
      <td>
        <em>literal value surrogate</em>/<em>value string</em> or <em>non-literal value surrogate</em>/<em>value URI</em>
      </td>
    </tr>
    <tr>
      <td>
        "Language"</td>
      <td>
        <em>value string language</em>
      </td>
    </tr>
  </tbody>
</table>


There are several points worth noting:

- The mapping of "value" to either _value string_ or _value URI_ is arguably stretching the original definitions, but the intent seems to be to support either a literal or a URI reference to a non-literal resource.

- No mapping is provided here for what DC-HTML-2003 calls "encoding schemes". From the model as described by DC-HTML-2003 alone, it is impossible to determine whether the target should be a _vocabulary encoding scheme_ or a _syntax encoding scheme_. From the syntactic permutations available, and the fact that the <tt>scheme</tt> attribute is available only on the <tt>meta</tt> element, it might be reasonable to suggest that the target should be a _syntax encoding scheme_, not a _vocabulary encoding scheme_. However, the examples include cases of where the <tt>scheme</tt> attribute value is a reference to a _vocabulary encoding scheme_. So a null mapping is chosen, on the basis that it is better to lose some information rather than to risk introducing assertions which were not made in the original data.

- At the syntactic level, the generation of a _property URI_ may be problematic in some cases. The convention permitted in the DC-HTML-2003 profile of allowing a "composite prefixed name" (e.g. "DC.Date.modified") as the value of the <tt>name</tt> attribute of the <tt>meta</tt> element makes it impossible to reliably generate a URI for the property without additional information.

Using this mapping in conjunction with the DC-HTML-2003 profile, the following DCAM interpretation for DC-HTML-2003 might be inferred.

* * *

An X/HTML document using the DC-HTML-2003 profile encodes a _description set_ containing

- a _description_ with _described resource URI_ = URI of document, where

  - <tt>meta</tt> element maps to _statement_ with _literal value surrogate_

    - <tt>meta/@name</tt> maps to _property URI_

    - <tt>meta/@content</tt> maps to _value string_

    - <tt>meta/@xml:lang</tt> maps to _value string language_

  - <tt>link</tt> element maps to one or more _statements_ with _non-literal value surrogate_

    - each token in <tt>link/@rel</tt> maps to _property URI_

    - <tt>link/@href</tt> maps to _value URI_

* * *

#### dc-extract.xsl

Dan Connolly of W3C produced an XSLT stylesheet which generates an RDF/XML representation of the encoded metadata from an XHTML document using the DC-HTML-2003 profile. In terms of the Interoperability Levels document, it supports "Level 2" "semantic interoperability" for the DC-HTML-2003 profile. It uses the following conventions:

- <tt>meta</tt> element maps to RDF triple with literal object

  - <tt>meta/@name</tt> maps to predicate

  - <tt>meta/@content</tt> maps to literal object

  - <tt>meta/@xml:lang</tt> maps to language of plain literal object

  - <tt>meta/@scheme</tt> maps to datatype of typed literal object

- <tt>link</tt> element maps to one or more RDF triples with RDF URI ref object

  - each token in <tt>link/@rel</tt> maps to predicate

  - <tt>link/@href</tt> maps to RDF URI ref object

- <tt>link/@hreflang</tt> maps to separate triple with dc:language predicate and plain literal object

If the resulting RDF graph is interpreted as a DCAM _description set_ using the conventions of the DC-RDF recommendation [DC-RDF], then this would correspond to a DCAM interpretation for DC-HTML-2003 as follows.

* * *

An X/HTML document using the DC-HTML-2003 profile encodes a _description set_ containing

- a _description_ with _described resource URI_ = URI of document, where

  - <tt>meta</tt> element maps to _statement_ with _literal value surrogate_

    - <tt>meta/@name</tt> maps to _property URI_

    - <tt>meta/@content</tt> maps to _value string_

    - <tt>meta/@xml:lang</tt> maps to _value string language_

    - <tt>meta/@scheme</tt> maps to _SES URI_

  - <tt>link</tt> element maps to one or more _statements_ with _non-literal value surrogate_

    - each token in <tt>link/@rel</tt> maps to _property URI_

    - <tt>link/@href</tt> maps to _value URI_

- for each <tt>link/@hreflang</tt> used, a _description_ with _described resource URI_ = <tt>link/@href</tt>

  - a _statement_ with literal value surrogate

    - _property URI_ = [http://purl.org/dc/elements/1.1/language](http://purl.org/dc/elements/1.1/language)

    - <tt>link/@hreflang</tt> maps to _value string_

* * *

#### Embedded RDF

Embedded RDF [ERDF], designed by Ian Davis (Talis), is a set of conventions for embeddimg RDF triples into HTML/XHTML. There is no formal association between Embedded RDF and the DC-HTML-2003 profile, but the documentation for Embedded RDF notes that it was designed to be compatible with the DC-HTML-2003 profile, so an Embedded RDF interpretation can be made for an instance of the DC-HTML-2003 profile. Again, in the terms of the Interoperability Levels document, it supports "Level 2" "semantic interoperability" for the DC-HTML-2003 profile. It uses the following conventions, which are a subset of those used by dc-extract.xsl:

- <tt>meta</tt> element maps to RDF triple with literal object

  - <tt>meta/@name</tt> maps to predicate (Note: Embedded RDF does not support the "composite prefixed name" convention used by DC-HTML-2003)

  - <tt>meta/@content</tt> maps to literal object

  - <tt>meta/@xml:lang</tt> maps to language of plain literal object

- <tt>link</tt> element maps to one or more RDF triples with RDF URI ref object

  - each token in <tt>link/@rel</tt> maps to predicate

  - <tt>link/@href</tt> maps to RDF URI ref object

If the resulting RDF graph is interpreted as a DCAM _description set_ using the conventions of the DC-RDF recommendation [DC-RDF], then this would correspond to a DCAM interpretation for DC-HTML-2003 as follows.

* * *

An X/HTML document using the DC-HTML-2003 profile encodes a _description set_ containing

- a _description_ with _described resource URI_ = URI of document, where

  - <tt>meta</tt> element maps to _statement_ with _literal value surrogate_

    - <tt>meta/@name</tt> maps to _property URI_

    - <tt>meta/@content</tt> maps to _value string_

    - <tt>meta/@xml:lang</tt> maps to _value string language_

  - <tt>link</tt> element maps to one or more statements with _non-literal value surrogate_

    - each token in <tt>link/@rel</tt> maps to _property URI_

    - <tt>link/@href</tt> maps to _value URI_

* * *

#### A DCAM interpretation of DC-HTML-2003

The following is a "conservative" DCAM interpretation of the DC-HTML-2003 profile which is supported by all three of the approaches above. Note that this interpretation does **not** provide a mapping for the <tt>scheme</tt> attribute.

* * *

An X/HTML document using the DC-HTML-2003 profile encodes a _description set_ containing

- a _description_ with _described resource URI_ = URI of document, where

  - <tt>meta</tt> element maps to _statement_ with _literal value surrogate_

    - <tt>meta/@name</tt> maps to _property URI_

    - <tt>meta/@content</tt> maps to _value string_

    - <tt>meta/@xml:lang</tt> maps to _value string language_

  - <tt>link</tt> element maps to one or more _statements_ with _non-literal value surrogate_

    - each token in <tt>link/@rel</tt> maps to _property URI_

    - <tt>link/@href</tt> maps to _value URI_

* * *

### Appendix B: DC-HTML-2008 and the DCAM

In contrast to the case of DC-HTML-2003, the Proposed DCMI Recommendation, _Expressing Dublin Core using HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ [DC-HTML-2008] is designed to support the encoding of a DC _description set_ and the document describes explicitly a mapping between a subset of the features of the DCAM description set model and the X/HTML <tt>meta</tt> and <tt>link</tt> elements

An X/HTML document using the DC-HTML-2008 profile encodes a _description set_ containing

- a _description_ with _described resource URI_ = URI of document, where

  - <tt>meta</tt> element maps to _statement_ with _literal value surrogate_

    - <tt>meta/@name</tt> maps to _property URI_

    - <tt>meta/@content</tt> maps to _value string_

    - <tt>meta/@xml:lang</tt> maps to _value string language_

    - <tt>meta/@scheme</tt> maps to _SES URI_

  - <tt>link</tt> element maps to one or more statements with _non-literal value surrogate_

    - each token in <tt>link/@rel</tt> maps to _property URI_

    - <tt>link/@href</tt> maps to _value URI_

    - <tt>link/@title</tt> maps to _value string_

    - <tt>link/@xml:lang</tt> maps to _value string language_

### References

<a id="DCAM"></a>**[DCAM]**  
_DCMI Abstract Model_ DCMI Recommendation. 2007-06-04  
 [http://dublincore.org/documents/2007/06/04/abstract-model/](http://dublincore.org/documents/2007/06/04/abstract-model/)

<a id="DC-XML-2003"></a>**[DC-XML-2003]**  
_Guidelines for implementing Dublin Core in XML_ DCMI Recommendation. 2003-04-02  
 [http://dublincore.org/documents/2003/04/02/dc-xml-guidelines/](http://dublincore.org/documents/2003/04/02/dc-xml-guidelines/)

<a id="DC-HTML-2003"></a>**[DC-HTML-2003]**  
_Expressing Dublin Core in HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ DCMI Recommendation. 2003-11-30  
 [http://dublincore.org/documents/2003/11/30/dcq-html/](http://dublincore.org/documents/2003/11/30/dcq-html/)

<a id="DC-HTML-2008"></a>**[DC-HTML-2008]**  
_Expressing Dublin Core using HTML/XHTML <tt>meta</tt> and <tt>link</tt> elements_ DCMI Proposed Recommendation. 2007-11-05  
 [http://dublincore.org/documents/2008/mm/dd/dc-html/](http://dublincore.org/documents/2008/mm/dd/dc-html/)

<a id="DC-EXTRACT"></a>**[DC-EXTRACT]**  
_Dublin Core Extraction Service_  
 [http://www.w3.org/2000/06/dc-extract/form.html](http://www.w3.org/2000/06/dc-extract/form.html)

<a id="DC-LEVELS"></a>**[DC-LEVELS]**  
_Interoperability levels for Dublin Core metadata_  
 [http://dublincore.org/architecturewiki/InteroperabilityLevels](http://dublincore.org/architecturewiki/InteroperabilityLevels)

<a id="DC-RDF"></a>**[DC-RDF]**  
_Expressing Dublin Core metadata using the Resource Description Framework (RDF)_ DCMI Recommendation. 2008-01-14  
 [http://dublincore.org/documents/2008/01/14/dc-rdf/](http://dublincore.org/documents/2008/01/14/dc-rdf/)

<a id="DC-TEXT"></a>**[DC-TEXT]**  
_Expressing Dublin Core metadata using the DC-Text format_ DCMI Recommended Resource. 2008-01-14  
 [http://dublincore.org/documents/2008/01/14/dc-rdf/](http://dublincore.org/documents/2008/01/14/dc-rdf/)

<a id="ERDF"></a>**[ERDF]**  
_Embedded RDF_  
 [http://purl.org/NET/erdf/profile](http://purl.org/NET/erdf/profile)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Recommendation 11 September 2007  
 [http://www.w3.org/TR/2007/REC-grddl-20070911/](http://www.w3.org/TR/2007/REC-grddl-20070911/)

<a id="HTML-PROFILE"></a>**[HTML-PROFILE]**  
_Meta data profiles_ in _HTML 4.01 Specification_ W3C Recommendation 24 December 1999.  
 [http://www.w3.org/TR/1999/REC-html401-19991224/struct/global.html#h-7.4.4.3](http://www.w3.org/TR/1999/REC-html401-19991224/struct/global.html#h-7.4.4.3)

<a id="RFC3986"></a>**[RFC3986]**  
_Uniform Resource Identifier (URI): Generic Syntax_.  
 [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

<a id="SYNTAXTUT"></a>**[SYNTAXTUT]**  
_DCMI Basic Syntaxes Tutorial_ DC-2007, Singapore  
 [http://www.dc2007.sg/T2-BasicSyntaxes.pdf](http://www.dc2007.sg/T2-BasicSyntaxes.pdf)

 [RefreshCache](http://dublincore.org/architecturewiki/DCAMDCHTML?action=refresh&arena=Page.py&key=DCAMDCHTML.text_html) for this page (cached 2012-12-21 18:19:24)  

Immutable page (last edited 2008-06-27 07:29:15 by TomBaker)


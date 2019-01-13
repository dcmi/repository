---
title: "- DCXMLRevision/DCXMLFGuidelines"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLFGuidelines.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLFGuidelines](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=fullsearch&value=%2FDCXMLFGuidelines&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLFGuidelines_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLFGuidelines_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Expressing Dublin Core metadata using XML (DC-XML-Full)

This document is part of the [<img src="DCXMLRevision_2fDCXMLFGuidelines_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Architecture Wiki](http://dublincore.org/architecturewiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong> </td>
      <td>
        <strong>Expressing Dublin Core metadata using XML (DC-XML-Full)</strong> </td>
    </tr>
    <tr>
      <td>
        <strong>Creator:</strong> </td>
      <td>
        Pete Johnston, Eduserv Foundation &lt;<a href="mailto:pete.johnston@eduserv.org.uk">pete.johnston@eduserv.org.uk</a>&gt; </td>
    </tr>
    <tr>
      <td>
        <strong>Creator:</strong> </td>
      <td>
        Andy Powell, Eduserv Foundation &lt;<a href="mailto:andy.powell@eduserv.org.uk">andy.powell@eduserv.org.uk</a>&gt; </td>
    </tr>
    <tr>
      <td>
        <strong>Date Issued:</strong> </td>
      <td>
        2008-07-23 </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2008-07-23">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2008-07-23</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Replaces:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2007-06-19">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines/2007-06-19</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Is Replaced By:</strong> </td>
      <td>
        Not applicable </td>
    </tr>
    <tr>
      <td>
        <strong>Latest Version:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLFGuidelines</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong> </td>
      <td>
        This document specifies an XML format for representing a Dublin Core 
        metadata description set. It supports all the features of the 
        description set described by the DCMI Abstract Model. The XML format is 
        known as "DC-XML-Full".</td>
    </tr>
  </tbody>
</table>


1. Expressing Dublin Core metadata using XML (DC-XML-Full)

  1. Contents
  2. 1. Introduction

    1. 1.1 Design Considerations
    2. 1.2 DC-XML-Full and GRDDL
  3. 2. The DCMI Abstract Model and DC-XML-Full
  4. 3. Features of the DC-XML-Full Syntax

    1. 3.1 URIs in DC-XML-Full
  5. 4. The DC-XML-Full Syntax

    1. 4.1 Encoding a Description Set: The Description Set Element
    2. 4.2 Encoding a Description: The Description Element

      1. 4.2.1 The Described Resource URI Attribute
    3. 4.4 Encoding a Statement: The Statement Element

      1. 4.4.1 The Property URI
    4. 4.4 Encoding a Value Surrogate

      1. 4.4.1 Encoding a Literal Value Surrogate

        1. 4.4.1.1 The Literal Surrogate Value String
      2. 4.4.2 Encoding a Non-Literal Value Surrogate

        1. 4.4.2.1 The Value URI Attribute
        2. 4.4.2.2 The Vocabulary Encoding Scheme URI Attribute
        3. 4.4.2.3 The Non-Literal Surrogate Value String
    5. 4.5 Encoding a Value String: The Value String Element

      1. 4.5.1 Encoding a Plain Value String

        1. 4.5.1.1 The Value String Language
      2. 4.5.2 Encoding a Typed Value String

        1. 4.5.2.1 The Syntax Encoding Scheme URI
        2. 4.5.2.2 XML data as a Typed Value String
    6. 4.7 Encoding Descriptions of Values
  6. Appendix A. DC-TEXT Representation of Examples

    1. A.1 Example 1
    2. A.2 Example 2
    3. A.3 Example 3
    4. A.4 Example 4
    5. A.5 Example 5
    6. A.6 Example 6
    7. A.7 Example 7
    8. A.8 Example 8
    9. A.9 Example 9
    10. A.10 Example 10
    11. A.11 Example 11
    12. A.12 Example 12
    13. A.13 Example 13
    14. A.14 Example 14
    15. A.15 Example 15
    16. A.16 Example 16
    17. A.17 Example 17
    18. A.18 Example 18
    19. A.19 Example 19
    20. A.20 Example 20
    21. A.21 Example 21
  7. Appendix B. RDF/XML Representation of Examples

    1. B.1 Example 1
    2. B.2 Example 2
    3. B.3 Example 3
    4. B.4 Example 4
    5. B.5 Example 5
    6. B.6 Example 6
    7. B.7 Example 7
    8. B.8 Example 8
    9. B.9 Example 9
    10. B.10 Example 10
    11. B.11 Example 11
    12. B.12 Example 12
    13. B.13 Example 13
    14. B.14 Example 14
    15. B.15 Example 15
    16. B.16 Example 16
    17. B.17 Example 17
    18. B.18 Example 18
    19. B.19 Example 19
    20. B.20 Example 20
    21. B.21 Example 21
  8. Notes
  9. References
  10. Changes in this version

### Contents

1. 

Introduction

2. 

The DCMI Abstract Model and DC-XML-Full

3. 

Some Features of the DC-XML-Full Syntax

4. 

The DC-XML-Full Syntax

  1. 

Encoding a Description Set: The Description Set Element

  2. 

Encoding Descriptions: Description Elements

  3. 

Encoding Statements: Statement Elements

  4. 

Encoding Value Surrogates

    1. 

Encoding Literal Value Surrogates

    2. 

Encoding Non-Literal Value Surrogates

  5. 

Encoding Value Strings: Value String Elements

  6. 

Encoding Descriptions of Values

5. 

Appendix A: Text Representation of Examples

6. 

Notes

7. 

References

<a id="Introduction"></a>

### 1. Introduction

This document specifies an XML format for representing a DC metadata _description set_. The XML format is known as "DC-XML-Full".

The "Description Set Model" of the DCMI Abstract Model [ABSTRACT-MODEL] describes the constructs that make up a DC metadata _description set_. In order to represent a DC metadata description set in an XML document those constructs have to be represented as components in that XML document, i.e. as XML elements and XML attributes, XML element names and XML attribute names, and as XML element content and XML attribute values.

<a id="Design-Considerations"></a>

#### 1.1 Design Considerations

The DC-XML-Full format described in this document was developed using the following design considerations:

- The format should provide a serialisation of all the features of the "Description Set Model" of the Abstract Model, i.e. it should be possible to represent all the constructs that make up a DC metadata _description set_. (See Note 1).

- The format is not required to address the features of the "Vocabulary Model" of the Abstract Model. For example, it is not required to express subproperty relationships between properties, subclass relationships between classes, etc.

- The format should be easily usable with XML-based specifications such as XPath, XPointer and XQuery, i.e. for each construct in the Abstract Model there should be a mapping to exactly one construct in the XML syntax.

- The format should not be dependent on features of a single XML Schema language.

- It should be possible to describe the format using W3C XML Schema [XMLSCHEMA], but it is not a requirement that when the format is used to serialise _description sets_ conforming to a DC Application Profile [DCAP], all the constraints expressed in the corresponding Description Set Profile [DC-DSP] are captured using W3C XML Schema.

<a id="DC-XML-Full-and-GRDDL"></a>

#### 1.2 DC-XML-Full and GRDDL

The W3C Recommendation _Gleaning Resource Descriptions from Dialects of Languages_ [GRDDL describes a set of conventions for associating an XML document with an algorithm for the extraction of a set of RDF triples from that document. One of the mechanisms defined by GRDDL is the association of a Namespace Transformation with an XML namespace.

A GRDDL Namespace Transformation is provided for the XML Namespace associated with the DC-XML-Full format. That transformation generates RDF graphs compatible with the recommendations of the DCMI Recommendation Expressing Dublin Core metadata using the Resource Description Framework (RDF) [DC-RDF].

<a id="The-DCMI-Abstract-Model-and-DC-XML-Full"></a>

### 2. The DCMI Abstract Model and DC-XML-Full

According to the "Description Set Model" of the DCMI Abstract Model [ABSTRACT-MODEL], a DC _description set_ has the following structure:

- a _description set_ is made up of one or more _descriptions_

- a _description_ is made up of

  - zero or one _described resource URI_ and

  - one or more _statements_

- a _statement_ is made up of

  - exactly one _property URI_ and

  - exactly one _value surrogate_

- a _value surrogate_ is either a _literal value surrogate_ or a _non-literal value surrogate_

  - a _literal value surrogate_ is made up of exactly one _value string_

  - a _non-literal value surrogate_ is made up of

    - zero or one _value URIs_

    - zero or one _vocabulary encoding scheme URIs_

    - zero or more _value strings_

- a _value string_ is either a _plain value string_ or a _typed value string_

  - a _plain value string_ may be associated with a _value string language_

  - a _typed value string_ is associated with a _syntax encoding scheme URI_

- a _non-literal value_ may be described by another _description_

The DC-XML-Full format described in this document implements all the features of the DCAM "description set model".

<a id="Features-of-the-DC-XML-Full-Syntax"></a>

### 3. Features of the DC-XML-Full Syntax

<a id="URIs-in-DC-XML-Full"></a>

#### 3.1 URIs in DC-XML-Full

The Abstract Model uses Uniform Resource Identifiers (URIs) [RFC3896] to refer both to the resources described within DC metadata _description sets_ and to metadata terms (_properties_, _classes_, _vocabulary encoding schemes_ and _syntax encoding schemes_) used in those _description sets_.

In DC-XML-Full, URIs are encoded as URI references, used as XML attribute values. A URI reference is either a URI or a relative reference [RFC3896]. Later sections of this document describe the use of those different XML attributes in detail. The purpose of this section is to make some general points about the representation of these URIs in DC-XML-Full.

The URI may be represented in full. The following example shows a URI as the value of the <tt>dcxf:propertyURI</tt> attribute:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet 
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt;
                                 &lt;!-- Property URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 1: URI as attribute value**

The representation of the URI may be abbreviated through the use of an XML entity reference as follows, for example:

<pre>&lt;?xml version="1.0"?&gt;
&lt;!DOCTYPE dcxf:descriptionSet [
  &lt;!ENTITY dcterms 'http://purl.org/dc/terms/'&gt;
]&gt;
&lt;dcxf:descriptionSet 
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt;
                                 &lt;!-- Property URI using XML entity reference --&gt;
    &lt;dcxf:statement dcxf:propertyURI="&amp;dcterms;title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 2: URI as attribute value (with XML entity reference)**

For all of the attributes in DC-XML-Full which have URIs as values, the value may also be a relative reference. The relative reference is resolved relative to a base URI, obtained either from the value of an <tt>xml:base</tt> attribute or from the URI of the document itself. In the following example, the value of the <tt>dcxf:propertyURI</tt> attribute is a relative reference. It is resolved relative to the base URI provided by the <tt>xml:base</tt> attribute to obtain a target URI of <tt>http://purl.org/dc/terms/title</tt>:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet 
  xml:base="http://purl.org/dc/terms/"
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt;
                                 &lt;!-- Property URI as relative reference --&gt;
    &lt;dcxf:statement dcxf:propertyURI="title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 3: Relative reference as attribute value**

<a id="The-DC-XML-Full-Syntax"></a>

### 4. The DC-XML-Full Syntax

<a id="Encoding-a-Description-Set-The-Description-Set-Element"></a>

#### 4.1 Encoding a Description Set: The Description Set Element

A _description set_ is a set of one or more _descriptions_.

In DC-XML-Full, a _description set_ is represented by an XML element known as a Description Set Element (See Note 2). A DC-XML-Full instance represents a single DC _description set_, so has exactly one Description Set Element.

A Description Set Element has an expanded name (XML Namespace Name/local name pair) with the XML Namespace Name <tt>http://dublincore.org/xmlns/2008/07/23/dc-xml-full/</tt> and local name <tt>descriptionSet</tt>.

In the examples presented in this document, the XML Namespace Name <tt>http://dublincore.org/xmlns/2008/07/23/dc-xml-full/</tt> is always associated with the prefix "dcxf". For convenience, after this point, the names of XML elements and XML attributes are presented in the text as XML QNames (e.g. <tt>dcxf:descriptionSet</tt>, <tt>dcxf:resourceURI</tt>), rather than as expanded names, but the prefix used is not significant.

<pre>&lt;?xml version="1.0"?&gt;
       &lt;!-- Description Set Element --&gt;
&lt;dcxf:descriptionSet 
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 4: the Description Set Element**

The Description Set Element must contain one or more Description Elements.

<a id="Encoding-a-Description-The-Description-Element"></a>

#### 4.2 Encoding a Description: The Description Element

A _description_ is a set of one or more _statements_ about a resource.

In DC-XML-Full, a _description_ is represented by an XML element known as a Description Element. A Description Element is a child element of a Description Set Element and has the name <tt>dcxf:description</tt>.

The following example shows a _description set_ consisting of a single _description_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt; &lt;!-- Description Element --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 5: the Description Element**

A _description set_ may contain multiple _descriptions_.

In DC-XML-Full, each _description_ is represented by a separate Description Element. The order of the Description Elements within a Description Set Element is not significant.

The following example shows a _description set_ consisting of two _descriptions_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description&gt; &lt;!-- 1st Description Element --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
  &lt;dcxf:description&gt; &lt;!-- 2nd Description Element --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;UKOLN Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 6: Multiple Description Elements**

The encoding of _description sets_ with multiple _descriptions_ is described further in the section on Encoding Descriptions of Values.

A Description Element may have a Described Resource URI attribute and must contain one or more Statement Elements.

<a id="The-Described-Resource-URI"></a>

##### 4.2.1 The Described Resource URI Attribute

A _description_ may have an associated _described resource URI_.

In DC-XML-Full, a _described resource URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxf:resourceURI</tt>.

The examples below show a _description_ with the _described resource URI_ <tt>http://dublincore.org/pages/home</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt; &lt;!-- described resource URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 7: the Described Resource URI Attribute**

Note that the representation of the _described resource URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="Encoding-a-Statement-The-Statement-Element"></a>

#### 4.4 Encoding a Statement: The Statement Element

A _description_ is made up of one or more _statements_.

In DC-XML-Full, each child XML element of a Description Element represents a single _statement_ and is known as a Statement Element. A Statement Element always has the name <tt>dcxf:statement</tt>.

The following example shows a _description set_ with a single _description_ consisting of a single _statement_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt; &lt;!-- Statement Element --&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 8: A Statement Element**

A _description_ may be made up of multiple _statements_.

In DC-XML-Full, each _statement_ is represented by a separate Statement Element. The order of the Statement Elements within a Description Element is not significant.

The following example shows a _description_ consisting of two _statements_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt; &lt;!-- Statement Element --&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"&gt; &lt;!-- Statement Element --&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 9: Multiple Statement Elements**

A Statement Element must have a Property URI attribute, it may have various other attributes and it may contain zero or more Value String Elements.

<a id="The-Property-URI"></a>

##### 4.4.1 The Property URI

A _statement_ must contain exactly one _property URI_.

In DC-XML-Full, a _property URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxf:propertyURI</tt>.

The examples below show a _description_ consisting of two _statements_ where the _property URIs_ are <tt>http://purl.org/dc/terms/title</tt> and <tt>http://purl.org/dc/terms/publisher</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
                                    &lt;!-- property URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
                                    &lt;!-- property URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 10: The Property URI Attribute**

Note that the representation of the _property URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="Encoding-a-Value-Surrogate"></a>

#### 4.4 Encoding a Value Surrogate

A _statement_ contains exactly one _value surrogate_.

A _value surrogate_ is either a _literal value surrogate_ or a _non-literal value surrogate_.

<a id="Encoding-a-Literal-Value-Surrogate"></a>

##### 4.4.1 Encoding a Literal Value Surrogate

A _literal value surrogate_ is made up of exactly one _value string_.

Note that a _literal value surrogate_ can not contain a _value URI_ or a _vocabulary encoding scheme URI_.

<a id="The-Literal-Surrogate-Value-String"></a>

###### 4.4.1.1 The Literal Surrogate Value String

In DC-XML-Full, a _value string_ within a _literal value surrogate_ is represented by an XML element known as a Value String Element. A Value String Element is a child element of a Statement Element and, for the case of the _literal value surrogate_, the Value String Element has the name <tt>dcxf:literalValueString</tt>. For the case of the _literal value surrogate_, a Statement Element must contain exactly one Value String Element with the name <tt>dcxf:literalValueString</tt>. It is an error for a Statement Element to contain multiple Value String Elements with the name <tt>dcxf:literalValueString</tt>.

The example below shows a _description_ consisting of a single _statement_ which includes a _literal value surrogate_ (with a _value string_).

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://example.org/agents/DCMI"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://my.example.org/terms/name"&gt;
      &lt;!-- value string in literal value surrogate --&gt;
      &lt;dcxf:literalValueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 11: The Value String Element (Literal Value Surrogate)**

For more details on representing _value strings_, see the section on Value String Elements.

<a id="Encoding-a-Non-Literal-Value-Surrogate"></a>

##### 4.4.2 Encoding a Non-Literal Value Surrogate

A _non-literal value surrogate_ is made up of

- zero or one _value URIs_

- zero or one _vocabulary encoding scheme URIs_

- zero or more _value strings_

<a id="The-Value-URI"></a>

###### 4.4.2.1 The Value URI Attribute

A _non-literal value surrogate_ may contain a _value URI_.

In DC-XML-Full, a _value URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxf:valueURI</tt>.

The examples below show a _description_ consisting of two _statements_ where the second _statement_ includes a _non-literal value surrogate_ with the _value URI_ <tt>http://example.org/agents/DCMI</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher" 
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt; &lt;!-- value URI --&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 12: The Value URI Attribute**

Note that the representation of the _value URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="The-Vocabulary-Encoding-Scheme-URI"></a>

###### 4.4.2.2 The Vocabulary Encoding Scheme URI Attribute

A _non-literal value surrogate_ may include a _vocabulary encoding scheme URI_.

In DC-XML-Full, a _vocabulary encoding scheme URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxf:vocabEncSchemeURI</tt>.

The examples below show a _description_ consisting of three _statements_ where the third _statement_ includes a _non-literal value surrogate_ with the _vocabulary encoding scheme URI_ <tt>http://purl.org/dc/terms/LCSH</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
                &lt;!-- vocabulary encoding scheme URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/subject"
                   dcxf:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;dcxf:valueString&gt;Metadata&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 13: The Vocabulary Encoding Scheme URI Attribute**

Note that the representation of the _vocabulary encoding scheme URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="The-Non-Literal-Surrogate-Value-String"></a>

###### 4.4.2.3 The Non-Literal Surrogate Value String

A _non-literal value surrogate_ may contain multiple _value strings_.

In DC-XML-Full, a _value string_ within a **non-literal value surrogate** is represented by an XML element known as a Value String Element. A Value String Element is a child element of a Statement Element and, for the case of the _non-literal value surrogate_, the Value String Element has the name <tt>dcxf:valueString</tt>.

The presence of a _value string_ in a _non-literal value surrogate_ within a _statement_ is optional. If no _value string_ is present, in DC-XML-Full, the Statement Element is empty.

The example below shows a _description_ consisting of four _statements_ where the fourth _statement_ includes a _non-literal value surrogate_ with a _value URI_ but no _value string_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/subject"
                   dcxf:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;dcxf:valueString&gt;Metadata&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;!-- statement with no value string --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/isPartOf"
                   dcxf:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 14: Empty Statement Element**

The example below shows a _description_ consisting of four _statements_ where the second and third _statements_ each include a _non-literal value surrogate_ containing a _value string_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;!-- non-literal value surrogate - value string --&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/subject" 
                   dcxf:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;!-- non-literal value surrogate - value string --&gt;
      &lt;dcxf:valueString&gt;Metadata&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/isPartOf"
                   dcxf:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 15: The Value String Element (Non-Literal Value Surrogate)**

A _non-literal value surrogate_ may contain multiple _value strings_.

So in DC-XML, a Statement Element representing a _statement_ with a _non-literal value surrogate_ may contain multiple Value String Elements. The order of the Value String Elements within a Statement Element is not significant.

The following example shows a _description_ in which the third _statement_ includes a _non-literal value surrogate_ containing two _value strings_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/sitemap/"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/subject" 
                   dcxf:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;!-- non-literal value surrogate - multiple value strings --&gt;
      &lt;dcxf:valueString&gt;Metadata&lt;/dcxf:valueString&gt;
      &lt;dcxf:valueString&gt;Métadonnées&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/isPartOf"
                   dcxf:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 16: Multiple Value String Elements (Non-Literal Value Surrogate)**

For more details on representing _value strings_, see the section on Value String Elements.

<a id="Encoding-a-Value-String-The-Value-String-Element"></a>

#### 4.5 Encoding a Value String: The Value String Element

A _value string_ may occur within either a _literal value surrogate_ or a _non-literal value surrogate_. A _literal value surrogate_ must contain exactly one _value string_. A _non-literal value surrogate_ may contain multiple _value strings_.

In DC-XML-Full, a _value string_ within a _value surrogate_ is represented by an XML element known as a Value String Element. A Value String Element is a child element of a Statement Element.

For the case of the _literal value surrogate_, the Value String Element has the name <tt>dcxf:literalValueString</tt> (see the section The Literal Surrogate Value String.

For the case of the _non-literal value surrogate_, the Value String Element has the name <tt>dcxf:valueString</tt> (see the section The Non-Literal Surrogate Value String).

A _value string_ is either a _plain value string_ or a _typed value string_.

<a id="Encoding-a-Plain-Value-String"></a>

##### 4.5.1 Encoding a Plain Value String

<a id="The-Value-String-Language"></a>

###### 4.5.1.1 The Value String Language

A _plain value string_ may be associated with a _value string language_

In DC-XML-Full, a _value string language_ is represented by an <tt>xml:lang</tt> attribute of the Value String Element. The values of the attribute are language identifiers as defined by IETF RFC 4646 RFC 4646 (or its successor).

The example below shows a _description_ consisting of three _statements_ where the first _statement_ has a _non-literal value surrogate_ containing a _plain value string_ "DCMI Home Page" associated with the _value string language_ "en-GB" :

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;!-- value string language --&gt;
      &lt;dcxf:literalValueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/date"&gt;
      &lt;dcxf:valueString&gt;2005-05-05&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 17: The Value String Language**

<a id="Encoding-a-Typed-Value-String"></a>

##### 4.5.2 Encoding a Typed Value String

<a id="The-Syntax-Encoding-Scheme-URI"></a>

###### 4.5.2.1 The Syntax Encoding Scheme URI

A _typed value string_ is associated with a _syntax encoding scheme URI_.

In DC-XML-Full, a _syntax encoding scheme URI_ is represented as the value of an XML attribute of the Value String Element. The attribute has the name <tt>dcxf:syntaxEncSchemeURI</tt>.

The examples below show a _description_ consisting of three _statements_ where the third _statement_ has a _non-literal value surrogate_ containing a _typed value string_ with the _syntax encoding scheme URI_ <tt>http://www.w3.org/2001/XMLSchema#date</tt>:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcxf:valueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/date"&gt;
                       &lt;!-- syntax encoding scheme URI --&gt;
      &lt;dcxf:valueString dcxf:syntaxEncSchemeURI="http://www.w3.org/2001/XMLSchema#date"&gt;2005-05-05&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 18: The Syntax Encoding Scheme URI Attribute**

Note that the representation of the _syntax encoding scheme URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="XML-data-as-a-Typed-Value-String"></a>

###### 4.5.2.2 XML data as a Typed Value String

A _typed value string_ may be an XML fragment, in which case it must be associated with the _syntax encoding scheme URI***[http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral](http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral)**

The example below shows a _description_ consisting of two _statements_ where the second _statement_ contains a _literal value surrogate_ which includes a _typed value string_ in the form of an XML fragment:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/description"&gt;
         &lt;!-- XML data as value string --&gt;
      &lt;dcxf:literalValueString dcxf:syntaxEncSchemeURI="http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral"&gt;
        &lt;div xmlns="http://www.w3.org/1999/xhtml"&gt;
          &lt;p&gt;The DCMI home page provides an overview of the content of the
          &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
          site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
        &lt;/div&gt;
      &lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 19: XML Data as Typed Value String**

<a id="Encoding-Descriptions-of-Values"></a>

#### 4.7 Encoding Descriptions of Values

As noted in the section on Encoding a Description, _description sets_ may contain multiple _descriptions_. Each _description_ is represented by a separate Description Element. The order of the Description Elements has no significance.

It may be that the _described resource_ of a _description_ is referred to as the _value_ of a _statement_ in another _description_ within the _description set_. If that resource has been assigned a URI, then that URI appears as the _value URI_ in the _statement_ where the resource is the _value_ and as a _described resource URI_ in the _description_ of that resource, as shown below:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
                                &lt;!-- value URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI" /&gt;
  &lt;/dcxf:description&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/althome"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:valueString&gt;DCMI Alternative Home Page&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
                                &lt;!-- value URI --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueURI="http://example.org/agents/DCMI" /&gt;
  &lt;/dcxf:description&gt;
                     &lt;!-- value URI used as resource URI in description of value --&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://example.org/agents/DCMI"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://my.example.org/terms/name"&gt;
      &lt;dcxf:literalValueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 20: Value as Described Resource**

In some cases the resource will not have a URI assigned, or the URI will not be known. Such a resource may still be a _value_ in a _statement_ in one _description_ and the _described resource_ of another _description_ in the same _description set_.

In such cases, the association between the _statement_ in the first _description_ and the second _description_ is made by using an identifier for the resource which is local to a DC-XML-Full instance. This local identifier is used as the value of a <tt>dcxf:valueRef</tt> XML attribute of one or more Statement Elements and as the value of a <tt>dcxf:resourceId</tt> XML attribute of a Description Element. Each value of a <tt>dcxf:valueRef</tt> XML attribute must match the value of a <tt>dcxf:resourceId</tt> attribute in the same DC-XML-Full instance.

Note that this is a syntactic mechanism for linking references to _values_ in _statements_ to the _descriptions_ of those _values_: the local identifier itself does not appear in the _description set_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:my="http://my.example.org/terms/"
  xmlns:dcxf="http://dublincore.org/xmlns/2008/07/23/dc-xml-full/"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:literalValueString&gt;DCMI Home Page&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;!-- Reference to value using local identifier --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueRef="DCMI" /&gt;
  &lt;/dcxf:description&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title"&gt;
      &lt;dcxf:valueString&gt;DCMI Alternative Home Page&lt;/dcxf:valueString&gt;
    &lt;/dcxf:statement&gt;
    &lt;!-- Reference to value using local identifier --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/publisher"
                   dcxf:valueRef="DCMI" /&gt;
  &lt;/dcxf:description&gt;
  &lt;!-- Description of value using local identifier --&gt;
  &lt;dcxf:description dcxf:resourceId="DCMI"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://my.example.org/terms/name"&gt;
      &lt;dcxf:literalValueString&gt;Dublin Core Metadata Initiative&lt;/dcxf:literalValueString&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 21: Value as Described Resource**

### Appendix A. DC-TEXT Representation of Examples

This appendix provides representations of all the examples provided in the main body of the document using the DC-Text syntax [DC-TEXT].

#### A.1 Example 1

The DC-XML-Full instance in Example 1 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.2 Example 2

The DC-XML-Full instance in Example 2 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.3 Example 3

The DC-XML-Full instance in Example 3 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.4 Example 4

The DC-XML-Full instance in Example 4 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.5 Example 5

The DC-XML-Full instance in Example 5 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.6 Example 6

The DC-XML-Full instance in Example 6 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; . 
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
  Description (
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "UKOLN Home Page" )
    )
  )
)
</pre>

#### A.7 Example 7

The DC-XML-Full instance in Example 7 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.8 Example 8

The DC-XML-Full instance in Example 8 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.9 Example 9

The DC-XML-Full instance in Example 9 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.10 Example 10

The DC-XML-Full instance in Example 10 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.11 Example 11

The DC-XML-Full instance in Example 11 represents the following description set:

<pre>@prefix my: &lt;http://my.example.org/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://example.org/agents/DCMI&gt; )
    Statement (
      PropertyURI ( my:name )
      LiteralValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.12 Example 12

The DC-XML-Full instance in Example 12 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.13 Example 13

The DC-XML-Full instance in Example 13 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:subject )
      VocabularyEncodingSchemeURI ( &lt;http://purl.org/dc/terms/LCSH&gt; )
      ValueString ( "Metadata" )
    )
  )
)
</pre>

#### A.14 Example 14

The DC-XML-Full instance in Example 14 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:subject )
      ValueClassURI ( &lt;http://example.org/terms/Concept&gt; )
      VocabularyEncodingSchemeURI ( &lt;http://purl.org/dc/terms/LCSH&gt; )
      ValueString ( "Metadata" )
    )
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.15 Example 15

The DC-XML-Full instance in Example 15 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:subject )
      ValueClassURI ( &lt;http://example.org/terms/Concept&gt; )
      VocabularyEncodingSchemeURI ( &lt;http://purl.org/dc/terms/LCSH&gt; )
      ValueString ( "Metadata" )
    )
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.16 Example 16

The DC-XML-Full instance in Example 16 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:subject )
      ValueClassURI ( &lt;http://example.org/terms/Concept&gt; )
      VocabularyEncodingSchemeURI ( &lt;http://purl.org/dc/terms/LCSH&gt; )
      ValueString ( "Metadata" )
      ValueString ( "Métadonnées" )
    )
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.17 Example 17

The DC-XML-Full instance in Example 17 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:date )
      ValueString ( "2005-05-05" )
    )
  )
)
</pre>

#### A.18 Example 18

The DC-XML-Full instance in Example 18 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" 
      )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:date )
      ValueString ( "2005-05-05"
        SyntaxEncodingSchemeURI ( &lt;http://www.w3.org/2001/XMLSchema#date&gt; )
      )
    )
  )
)
</pre>

#### A.19 Example 19

The DC-XML-Full instance in Example 19 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" 
      )
    )
    Statement (
      PropertyURI ( dcterms:description )
      LiteralValueString ( "&lt;div xmlns="http://www.w3.org/1999/xhtml"&gt;
          &lt;p&gt;The DCMI home page provides an overview of the content of the
          &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
          site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
        &lt;/div&gt;"
        SyntaxEncodingSchemeURI ( &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral&gt; )
      )
    )
  )
)
</pre>

#### A.20 Example 20

The DC-XML-Full instance in Example 20 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix my: &lt;http://my.example.org/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
    )
  )
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/althome&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      ValueString ( "DCMI Alternative Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
    )
  )
  Description (
    ResourceURI ( &lt;http://example.org/agents/DCMI&gt; )
    Statement (
      PropertyURI ( my:name )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.21 Example 21

The DC-XML-Full instance in Example 21 represents the following description set:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix my: &lt;http://my.example.org/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      LiteralValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueRef ( DCMI )
    )
  )
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/althome&gt; )
    Statement (
      PropertyURI ( dcterms:title )
      ValueString ( "DCMI Alternative Home Page" )
    )
    Statement (
      PropertyURI ( dcterms:publisher )
      ValueRef ( DCMI )
    )
  )
  Description (
    ResourceId ( DCMI )
    Statement (
      PropertyURI ( my:name )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

### Appendix B. RDF/XML Representation of Examples

#### B.1 Example 1

The DC-XML-Full instance in Example 1 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.2 Example 2

The DC-XML-Full instance in Example 2 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.3 Example 3

The DC-XML-Full instance in Example 3 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.4 Example 4

The DC-XML-Full instance in Example 4 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.5 Example 5

The DC-XML-Full instance in Example 5 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.6 Example 6

The DC-XML-Full instance in Example 6 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description&gt;
    &lt;dcterms:title&gt;UKOLN Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.7 Example 7

The DC-XML-Full instance in Example 7 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.8 Example 8

The DC-XML-Full instance in Example 8 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.9 Example 9

The DC-XML-Full instance in Example 9 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:parseType="Resource="&gt;
      &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
    &lt;/dcterms:publisher;&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.10 Example 10

The DC-XML-Full instance in Example 10 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:parseType="Resource"&gt;
      &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
    &lt;/dcterms:publisher&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.11 Example 11

The DC-XML-Full instance in Example 11 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:my="http://my.example.org/terms/" &gt;
  &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
    &lt;my:name&gt;Dublin Core Metadata Initiative&lt;/my:name&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.12 Example 12

The DC-XML-Full instance in Example 12 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.13 Example 13

The DC-XML-Full instance in Example 13 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:dcam="http://purl.org/dc/dcam/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:subject rdf:parseType="Resource"&gt;
      &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/LCSH" /&gt;
      &lt;rdf:value&gt;Metadata&lt;/rdf:value&gt;
    &lt;/dcterms:subject&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.14 Example 14

The DC-XML-Full instance in Example 14 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:dcam="http://purl.org/dc/dcam/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:subject rdf:parseType="Resource"&gt;
      &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/LCSH" /&gt;
      &lt;rdf:value&gt;Metadata&lt;/rdf:value&gt;
    &lt;/dcterms:subject&gt;
    &lt;dcterms:isPartOf rdf:resource="http://dublincore.org/site"&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.15 Example 15

The DC-XML-Full instance in Example 15 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:dcam="http://purl.org/dc/dcam/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:subject rdf:parseType="Resource"&gt;
      &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/LCSH" /&gt;
      &lt;rdf:value&gt;Metadata&lt;/rdf:value&gt;
    &lt;/dcterms:subject&gt;
    &lt;dcterms:isPartOf rdf:resource="http://dublincore.org/site"&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.16 Example 16

The DC-XML-Full instance in Example 16 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:dcam="http://purl.org/dc/dcam/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:subject rdf:parseType="Resource"&gt;
      &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/LCSH" /&gt;
      &lt;rdf:value&gt;Metadata&lt;/rdf:value&gt;
      &lt;rdf:value&gt;Métadonnées&lt;/rdf:value&gt;
    &lt;/dcterms:subject&gt;
    &lt;dcterms:isPartOf rdf:resource="http://dublincore.org/site" /&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.17 Example 17

The DC-XML-Full instance in Example 17 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:date&gt;2005-05-05&lt;/dcterms:date&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.18 Example 18

The DC-XML-Full instance in Example 18 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher&gt;
      &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
        &lt;rdf:value&gt;Dublin Core Metadata Initiative&lt;/rdf:value&gt;
      &lt;/rdf:Description&gt;
    &lt;/dcterms:publisher&gt;
    &lt;dcterms:date rdf:datatype="http://www.w3.org/2001/XMLSchema#date"&gt;2005-05-05&lt;/dcterms:date&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.19 Example 19

The DC-XML-Full instance in Example 19 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:description rdf:parseType="Literal"&gt;
      &lt;div xmlns="http://www.w3.org/1999/xhtml"&gt;
        &lt;p&gt;The DCMI home page provides an overview of the content of the
        &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
        site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
      &lt;/div&gt;
    &lt;/dcterms:description&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.20 Example 20

The DC-XML-Full instance in Example 20 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:my="http://my.example.org/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:resource="http://example.org/agents/DCMI" /&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/althome"&gt;
    &lt;dcterms:title&gt;DCMI Alternative Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:resource="http://example.org/agents/DCMI" /&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://example.org/agents/DCMI"&gt;
    &lt;my:name&gt;Dublin Core Metadata Initiative&lt;/my:name&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

#### B.21 Example 21

The DC-XML-Full instance in Example 21 represents the following RDF graph:

<pre>&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
        xmlns:dcterms="http://purl.org/dc/terms/"
        xmlns:my="http://my.example.org/terms/" &gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:nodeID="DCMI" /&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://dublincore.org/pages/althome"&gt;
    &lt;dcterms:title&gt;DCMI Alternative Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher rdf:nodeID="DCMI" /&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:nodeID="DCMI"&gt;
    &lt;my:name&gt;Dublin Core Metadata Initiative&lt;/my:name&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

### Notes

<a id="Note1"></a>**[1]** This document defines one XML format for representing DC metadata description sets in XML. Other formats may exist supporting other subsets of the DCMI Abstract Model. For example, the Open Archives Initiative Protocol for Metadata Harvesting [OAIPMH] defines a format, commonly known as oai\_dc, which supports the serialisation only of description sets containing a single description, with statements referencing only the fifteen properties of the DCMES, and using literal value surrogates only. oai\_dc is a different XML format from DC-XML-Full, but that does not change the value and usefulness of oai\_dc as a format for serialising that particular subset of DC metadata description sets.

<a id="Note2"></a>**[2]** In this document the term "element" is used to refer only to XML elements, and it should always be interpreted in that sense wherever it occurs. It is not used to refer to the properties of the DCMES.

### References

<a id="ABSTRACT-MODEL"></a>**[ABSTRACT-MODEL]**  
_DCMI Abstract Model_ DCMI Recommendation. 2007-06-04  
 [http://dublincore.org/2007/06/04/documents/abstract-model/](http://dublincore.org/2007/06/04/documents/abstract-model/)

<a id="DC-DSP"></a>**[DC-DSP]**  
_Description Set Profiles: A constraint language for Dublin Core Application Profiles_ DCMI Working Draft. 2008-03-31  
 [http://dublincore.org/documents/2008/03/31/dc-dsp/](http://dublincore.org/documents/2008/03/31/dc-dsp/)

<a id="DC-RDF"></a>**[DC-RDF]**  
_Expressing Dublin Core metadata using the Resource Description Framework (RDF)_ DCMI Recommendation. 2008-01-14  
 [http://dublincore.org/documents/2008/01/14/dc-rdf/](http://dublincore.org/documents/2008/01/14/dc-rdf/)

<a id="DC-TEXT"></a>**[DC-TEXT]**  
_Expressing Dublin Core metadata using the DC-Text format_ DCMI Recommended Resource. 2007-12-03  
 [http://dublincore.org/documents/2007/12/03/dc-text/](http://dublincore.org/documents/2007/12/03/dc-text/)

<a id="DCAP"></a>**[DCAP]**  
_The Singapore Framework for Dublin Core Application Profiles_ 2008-01-14  
 [http://dublincore.org/documents/2008/01/14/singapore-framework/](http://dublincore.org/documents/2008/01/14/singapore-framework/)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Recommendation 11 September 2007  
 [http://www.w3.org/TR/2007/REC-grddl-20070911/](http://www.w3.org/TR/2007/REC-grddl-20070911/)

<a id="OAIPMH"></a>**[OAIPMH]**  
_The Open Archives Initiative Protocol for Metadata Harvesting_ Protocol Version 2.0 of 2002-06-14.  
 [http://www.openarchives.org/OAI/openarchivesprotocol.html](http://www.openarchives.org/OAI/openarchivesprotocol.html)

<a id="RDFXML"></a>**[RDFXML]**  
_RDF/XML Syntax Specification (Revised)_ W3C Recommendation 10 February 2004  
 [http://www.w3.org/TR/2004/REC-rdf-syntax-grammar-20040210](http://www.w3.org/TR/2004/REC-rdf-syntax-grammar-20040210)

<a id="RFC3986"></a>**[RFC3986]**  
_RFC 3986: Uniform Resource Identifier (URI): Generic Syntax_. Internet Engineering Task Force (IETF). January 2005  
 [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

<a id="RFC4646"></a>**[RFC4646]**  
_RFC 4646: Tags for Identifying Languages_. Internet Engineering Task Force (IETF). September 2006.  
 [http://www.ietf.org/rfc/rfc4646.txt](http://www.ietf.org/rfc/rfc4646.txt)

<a id="XML"></a>**[XML]**  
_Extensible Markup Language (XML) 1.0 (Fourth Edition)_. W3C Recommendation 16 August 2006, edited in place 29 September 2006.  
 [http://www.w3.org/TR/2006/REC-xml-20060816/](http://www.w3.org/TR/2006/REC-xml-20060816/)

<a id="XMLSCHEMA"></a>**[XMLSCHEMA]**  
_XML Schema Part 0: Primer Second Edition_. W3C Recommendation 28 October 2004.  
 [http://www.w3.org/TR/2004/REC-xmlschema-0-20041028/](http://www.w3.org/TR/2004/REC-xmlschema-0-20041028/)

### Changes in this version

- Remove use of DC-XML-Full Prefixed Names.

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLFGuidelines?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLFGuidelines.text_html) for this page (cached 2012-12-22 00:25:45)  

Immutable page (last edited 2008-07-30 17:30:56 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


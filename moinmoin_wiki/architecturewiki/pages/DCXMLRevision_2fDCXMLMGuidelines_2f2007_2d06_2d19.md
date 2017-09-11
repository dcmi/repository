---
title: "- DCXMLRevision/DCXMLMGuidelines/2007-06-19"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLMGuidelines/2007-06-19](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=fullsearch&value=%2F2007-06-19&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Expressing Dublin Core metadata using XML (DC-XML-Min)

This document is part of the [<img src="DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Architecture Wiki](http://dublincore.org/architecturewiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong> </td>
      <td>
        <strong>Expressing Dublin Core metadata using XML (DC-XML-Min)</strong> </td>
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
        2007-06-19 </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2007-06-19">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2007-06-19</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Replaces:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2006-09-18">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines/2006-09-18</a> </td>
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
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLMGuidelines</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong> </td>
      <td>
        This document specifies an XML format for representing a Dublin Core 
        metadata description set. It supports all the features of the 
        description set described by the DCMI Abstract Model. The XML format is 
        known as "DC-XML-Min".</td>
    </tr>
  </tbody>
</table>


1. Expressing Dublin Core metadata using XML (DC-XML-Min)

  1. Contents
  2. 1. Introduction

    1. 1.1 Design Considerations
  3. 2. The DCMI Abstract Model and DC-XML-Min
  4. 3. Features of the DC-XML-Full Syntax

    1. 3.1 URIs in DC-XML-Min

      1. 3.1.1 URI references
      2. 3.1.2 URIs and XML QNames
  5. 4. The DC-XML-Min Syntax

    1. 4.1 Encoding a Description Set: The Description Set Element
    2. 4.2 Encoding a Description: The Description Element

      1. 4.2.1 The Described Resource URI
    3. 4.4 Encoding a Statement: The Statement Element

      1. 4.3.1 The Property URI
    4. 4.4 Encoding a Value Surrogate

      1. 4.4.1 Encoding a Literal Value Surrogate

        1. 4.4.1.1 The Literal Surrogate Value String
      2. 4.4.2 Encoding a Non-Literal Value Surrogate

        1. 4.4.2.1 The Value URI
        2. 4.4.2.2 The Vocabulary Encoding Scheme URI Attribute
        3. 4.4.2.3 The Non-Literal Surrogate Value String
    5. 4.5 Encoding a Value String

      1. 4.5.1 Encoding a Plain Value String

        1. 4.5.1.1 The Value String Language
      2. 4.5.2 Encoding a Typed Value String

        1. 4.5.2.1 The Syntax Encoding Scheme URI
        2. 4.5.2.2 XML data as a Typed Value String
    6. 4.6 Encoding Descriptions of Values
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
  7. Notes
  8. References
  9. Changes in this version

### Contents

1. 

Introduction

2. 

The DCMI Abstract Model and DC-XML-Min

3. 

Some Features of the DC-XML-Min Syntax

4. 

The DC-XML-Min Syntax

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

Encoding Value Strings

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

This document specifies an XML format for representing a DC metadata _description set_. The XML format is known as "DC-XML-Min".

The DCMI Abstract Model [DCAM] describes the constructs that make up a DC metadata _description set_. In order to represent a DC metadata description set in an XML document those constructs have to be represented as components in that XML document, i.e. as XML elements and XML attributes, XML element names and XML attribute names, and as XML element content and XML attribute values.

<a id="Design-Considerations"></a>

#### 1.1 Design Considerations

The DC-XML-Min format described in this document was developed using the following design considerations:

- The format should provide a serialisation of a subset of the features of the "Description Model" of the DCAM, i.e. it should be possible to represent a well-defined subset of the constructs that make up a DC metadata _description set_. Some DC metadata _description sets_ have no corresponding representation in this XML format. (See Note 1).

- The format is not required to address the features of the "Schema Model" of the DCAM. For example, it is not required to express subproperty relationships between properties, subclass relationships between classes, etc.

- The format should be easily usable with XML-based specifications such as XPath, XPointer and XQuery, i.e. for each construct in the DCAM there should be a mapping to exactly one construct in the XML syntax.

- The format should not be dependent on features of a single XML Schema language.

- It should be possible to describe the format using W3C XML Schema [XMLSCHEMA], but it is not a requirement that when the format is used to serialise _description sets_ conforming to a DC Application Profile, all the constraints expressed in a DC Application Profile are captured using W3C XML Schema.

<a id="The-DCMI-Abstract-Model-and-DC-XML-Min"></a>

### 2. The DCMI Abstract Model and DC-XML-Min

According to the DCAM description model:

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

The DC-XML-Min format described in this document implements the following subset of the features of the DCAM description model:

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

    - zero or one _value strings_

- a _value string_ is either a _plain value string_ or a _typed value string_

  - a _plain value string_ may be associated with a _value string language_

  - a _typed value string_ is associated with a _syntax encoding scheme URI_

- a _non-literal value_ may be described by another _description_

i.e. the DC-XML-Min format supports a maximum of one _value string_ per _value surrogate_.

<a id="Features-of-the-DC-XML-Full-Syntax"></a>

### 3. Features of the DC-XML-Full Syntax

<a id="URIs-in-DC-XML-Min"></a>

#### 3.1 URIs in DC-XML-Min

The DCAM uses Uniform Resource Identifiers (URIs) [RFC3896] to refer both to resources and to metadata terms (_properties_,_classes_, _vocabulary encoding schemes_ and _syntax encoding schemes_).

In DC-XML-Min, some URIs in a DC metadata description set are encoded as URI references in XML attribute values, and some URIs are represented as XML Qualified Names (QNames). Note that only some URIs are represented as XML QNames. The table below summarises the options available:

<table>
  <tbody>
    <tr>
      <td>
        <strong>URI</strong> </td>
      <td align="center">
        <strong>Represented as URI reference</strong> </td>
      <td align="center">
        <strong>Represented as QName</strong> </td>
    </tr>
    <tr>
      <td>
        Resource URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        No </td>
    </tr>
    <tr>
      <td>
        Value URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        No </td>
    </tr>
    <tr>
      <td>
        Property URI </td>
      <td align="center">
        No </td>
      <td align="center">
        Yes </td>
    </tr>
    <tr>
      <td>
        Vocabulary Encoding Scheme URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        No </td>
    </tr>
    <tr>
      <td>
        Value Class URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        No </td>
    </tr>
    <tr>
      <td>
        Syntax Encoding Scheme URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        No </td>
    </tr>
  </tbody>
</table>


Later sections of this document describe the encoding of the different URIs in detail. The purpose of this section is to make some general points about the representation of URIs in DC-XML-Min.

<a id="URI-references"></a>

##### 3.1.1 URI references

In DC-XML-Min, some URIs are encoded as URI references, used as XML attribute values. A URI reference is either a URI or a relative reference [RFC3896].

The URI may be represented in full. The following example shows a URI as the value of the <tt>dcxm:resourceURI</tt> attribute:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet 
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
    dcxm:resourceURI="http://dublincore.org/pages/home"&gt; &lt;!-- Resource URI --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 1: URI as attribute value**

The representation of the URI may be abbreviated through the use of an XML entity reference as follows, for example:

<pre>&lt;?xml version="1.0"?&gt;
&lt;!DOCTYPE dcxm:descriptionSet [
  &lt;!ENTITY dcmi 'http://dublincore.org/pages/'&gt;
]&gt;
&lt;dcxm:descriptionSet 
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
    dcxm:resourceURI="&amp;dcmi;home"&gt; &lt;!-- Resource URI using XML entity reference --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 2: URI as attribute value (with XML entity reference)**

For all of the attributes in DC-XML-Min which have URIs as values, the value may also be a relative reference. The relative reference is resolved relative to a base URI, obtained either from the value of an <tt>xml:base</tt> attribute or from the URI of the document itself. In the following example, the value of the <tt>dcxm:resourceURI</tt> attribute is a relative reference. It is resolved relative to the base URI provided by the <tt>xml:base</tt> attribute to obtain a target URI of <tt>http://dublincore.org/pages/home</tt>:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet 
  xml:base="http://dublincore.org/pages/"
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
    dcxm:resourceURI="home"&gt; &lt;!-- Resource URI as relative reference --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 3: Relative reference as attribute value**

<a id="URIs-and-XML-QNames"></a>

##### 3.1.2 URIs and XML QNames

In DC-XML-Min, some URIs are represented as XML Qualified Names (QNames). An XML QName is an abbreviation for an "expanded name", a pair consisting of an XML Namespace Name (a URI) and a local name. The prefix part of the XML QName is bound to an XML Namespace Name through an XML Namespace declaration; where an XML QName has no prefix, the XML Namespace Name is obtained from the default namespace declaration.

For a software application that is parsing a DC-XML-Min instance to construct a _description set_, where an XML QName is used to represent a URI, the URI is determined by appending the local name part of the QName to the XML Namespace Name. Note that only some XML QNames in a DC-XML-Min instance are mapped to URIs in this way: this specification indicates when that mapping is applied.

For a software application that is "encoding" a _description set_ by generating a DC-XML-Min instance, an XML QName is determined by

- dividing the URI into a pair consisting of a local name (the trailing characters of the URI, subject to the lexical constraints of the QName datatype) and a URI to be used as an XML Namespace Name (the preceding part of the URI),

- providing an XML Namespace declaration element for this XML Namespace Name, and

- deploying an XML QName using the local name and the prefix used in the namespace declaration (or omitting the prefix if a default namespace declaration was used).

Note that this means for a single URI there is more than one possible DC-XML-Min Qualified Name representation. For example, the URI <tt>http://purl.org/dc/terms/date</tt> might be represented using any of the following (XML Namespace Name, local name) pairs:

- <tt>{http://purl.org/dc/terms/}, date</tt>

- <tt>{http://purl.org/dc/terms/d}, ate</tt>

- <tt>{http://purl.org/dc/terms/da}, te</tt>

- <tt>{http://purl.org/dc/terms/dat}, e</tt>

Communities typically decide on a convention for the QName to be used, but in theory any of these four forms could be deployed without changing the interpretation of the instance. For all DCMI terms, the convention used by the DCMI community is to split the term URI into an expanded name at the right-most '/' (forward slash) character (as per the first example above).

In the three examples in section 3.1.1 above, the XML QName <tt>dcterms:title</tt> is used to represent the _property URI_ <tt>http://purl.org/dc/terms/title</tt>.

<a id="The-DC-XML-Min-Syntax"></a>

### 4. The DC-XML-Min Syntax

<a id="Encoding-a-Description-Set-The-Description-Set-Element"></a>

#### 4.1 Encoding a Description Set: The Description Set Element

A _description set_ is a set of one or more _descriptions_.

In DC-XML-Min, a _description set_ is represented by an XML element known as a Description Set Element (See Note 2). A DC-XML-Min instance represents a single DC _description set_, so has exactly one Description Set Element.

A Description Set Element has an expanded name (XML Namespace Name/local name pair) with the XML Namespace Name <tt>http://dublincore.org/xml/dc-xml-min/2007/06/19</tt> and local name <tt>descriptionSet</tt>.

In the examples presented in this document, the XML Namespace Name <tt>http://dublincore.org/xml/dc-xml-min/2007/06/19</tt> is always associated with the prefix "dcxm". For convenience, after this point, the names of XML elements and XML attributes are presented in the text as XML QNames (e.g. <tt>dcxm:descriptionSet</tt>, <tt>dcxm:resourceURI</tt>), rather than as expanded names, but they should be read as XML expanded names: the prefix used is not significant.

<pre>&lt;?xml version="1.0"?&gt;
       &lt;!-- Description Set Element --&gt;
&lt;dcxm:descriptionSet 
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 4: The Description Set Element**

A Description Set Element contains one or more Description Elements.

<a id="Encoding-a-Description-The-Description-Element"></a>

#### 4.2 Encoding a Description: The Description Element

A _description_ is a set of one or more _statements_ about a resource.

In DC-XML-Min, a _description_ is represented by an XML element known as a Description Element. Any XML element which is a child element of a Description Set Element is a Description Element.

The following example shows a _description set_ consisting of a single _description_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:my="http:example.org/myapplication/"&gt;
  &lt;my:webPageDescription&gt; &lt;!-- Description Element --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/my:webPageDescription&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 5: The Description Element**

In the remainder of this document, Description Elements are shown using an XML element with an expanded name with the XML Namespace Name <tt>http://dublincore.org/xml/dc-xml-min/2007/06/19</tt> and local name <tt>description</tt> (represented by the XML QName <tt>dcxm:description</tt>). However, a Description Element may have a different element name if such a name is useful or neceesary for the particular application.

A _description set_ may contain multiple _descriptions_.

In DC-XML-Min, each _description_ is represented by a separate Description Element. The order of the Description Elements within a Description Set Element is not significant.

The following example shows a _description set_ consisting of two _descriptions_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description&gt; &lt;!-- 1st Description Element --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcxm:description&gt;
  &lt;dcxm:description&gt; &lt;!-- 2nd Description Element --&gt;
    &lt;dcterms:title&gt;UKOLN Home Page&lt;/dcterms:title&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 6: Multiple Description Elements**

The encoding of _description sets_ with multiple _descriptions_ is described further in the section on Encoding Descriptions of Values.

<a id="The-Described-Resource-URI"></a>

##### 4.2.1 The Described Resource URI

A _description_ may have an associated _described resource URI_.

In DC-XML-Min, a _described resource URI_ is represented as the value of an XML attribute of the Description Element. The attribute has the name <tt>dcx:resourceURI</tt>.

The examples below show a _description_ with the _described resource URI_ <tt>http://dublincore.org/pages/home</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
    dcxm:resourceURI="http://dublincore.org/pages/home"&gt; &lt;!-- described resource URI --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 7: The Resource URI Attribute**

Note that the representation of the _described resource URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

A Description Element contains one or more [Encoding-a-Statement-The-Statement-Element Statement Elements].

<a id="Encoding-a-Statement-The-Statement-Element"></a>

#### 4.4 Encoding a Statement: The Statement Element

A _description_ is made up of one or more _statements_.

In DC-XML-Min, each child XML element of a Description Element represents a single _statement_ and is known as a Statement Element.

The following example shows a _description set_ with a single _description_ consisting of a single _statement_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt; &lt;!-- Statement Element --&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 8: A Statement Element**

A _description_ may be made up of multiple _statements_,

In DC-XML-Min, each _statement_ is represented by a separate Statement Element. The order of the Statement Elements within a Description Element is not significant.

The following example shows a _description_ consisting of two _statements_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt; &lt;!-- Statement Element --&gt;
    &lt;dcterms:publisher dcxm:valueType="NonLiteral"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt; &lt;!-- Statement Element --&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 9: Multiple Statement Elements**

A Statement Element may have various attributes.

<a id="The-Property-URI"></a>

##### 4.3.1 The Property URI

A _statement_ must contain exactly one _property URI_.

In DC-XML-Min, the _property URI_ is represented by the element name of the Statement Element (an XML QName). The _property URI_ is determined from the QName by applying the QName-URI mapping described in the section on URIs and XML QNames.

The example belows show a _description_ consisting of two _statements_ where the _property URIs_ are <tt>http://purl.org/dc/terms/title</tt> and <tt>http://purl.org/dc/terms/publisher</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
                 &lt;!-- property URI as QName of Statement Element --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
                 &lt;!-- property URI as QName of Statement Element --&gt;
    &lt;dcterms:publisher dcxm:valueType="NonLiteral"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 10: The Property URI**

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

In DC-XML-Min, a _value string_ within a _literal value surrogate_ is represented by the combination of the content of the Statement Element and the values of specified XML attributes of the Statement Element.

The example below shows a _description_ consisting of a single _statement_ which includes a _literal value surrogate_ (with a _value string_).

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
          &lt;!-- value string as element content --&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 11: The Statement Element (Value String in Literal Value Surrogate)**

For more details on representing _value strings_, see the section on #Encoding-a-Value-String.

<a id="Encoding-a-Non-Literal-Value-Surrogate"></a>

##### 4.4.2 Encoding a Non-Literal Value Surrogate

In the subset of the DCAM description model supported by DC-XML-Min, a _non-literal value surrogate_ is made up of

- zero or one _value URIs_

- zero or one _vocabulary encoding scheme URIs_

- zero or one _value strings_

The presence of a _non-literal value surrogate_ is indicated by the XML attributes of the Statement Element.

If the Statement Element has one or more of the following present

- an XML attribute with the name <tt>dcxm:valueURI</tt>

- an XML attribute with the name <tt>dcxm:vocabEncSchemeURI</tt>

- an XML attribute with the name <tt>dcxm:valueType</tt> and the value ' [NonLiteral](http://dublincore.org/architecturewiki/NonLiteral)'

then the Statement Element represents a _statement_ containing a _non-literal value surrogate_. The following sections explain when these different XML attributes are used.

<a id="The-Value-URI"></a>

###### 4.4.2.1 The Value URI

A _non-literal value surrogate_ may contain a _value URI_.

In DC-XML-Min, a _value URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcx:valueURI</tt>.

The example below shows a _description_ consisting of two _statements_ where the second _statement_ contains a _non-literal value surrogate_ which includes the _value URI_ <tt>http://example.org/agents/DCMI</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
                &lt;!-- value URI --&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 12: The Value URI Attribute**

Note that the representation of the _value URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI references).

<a id="The-Vocabulary-Encoding-Scheme-URI"></a>

###### 4.4.2.2 The Vocabulary Encoding Scheme URI Attribute

A _non-literal value surrogate_ may include a _vocabulary encoding scheme URI_.

In DC-XML-Min, a _vocabulary encoding scheme URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxm:vocabEncSchemeURI</tt>.

The example below shows a _description_ consisting of three _statements_ where the third _statement_ contains a _non-literal value surrogate_ which includes the _vocabulary encoding scheme URI_ <tt>http://purl.org/dc/terms/LCSH</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
                &lt;!-- vocabulary encoding scheme URI --&gt;
    &lt;dcterms:subject 
          dcxm:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;Metadata&lt;/dcterms:subject&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 13: The Vocabulary Encoding Scheme URI Attribute**

Note that the representation of the _vocabulary encoding scheme URI_ may be abbreviated through the use of an XML entity reference or a URI relative reference (see the section on URI References).

<a id="The-Non-Literal-Surrogate-Value-String"></a>

###### 4.4.2.3 The Non-Literal Surrogate Value String

In the subset of the DCAM description model supported by DC-XML-Min, a _non-literal value surrogate_ may contain a single _value string_.

In DC-XML-Min, a _value string_ within a _non-literal value surrogate_ is represented by the combination of the content of the Statement Element and the values of specified XML attributes of the Statement Element.

The presence of a _value string_ in a _non-literal value surrogate_ within a _statement_ is optional. If no _value string_ is present, in DC-XML-Min, the Statement Element is empty.

The example below shows a _description_ consisting of four _statements_ where the fourth _statement_ includes a _non-literal value surrogate_ with a _value URI_ but no _value string_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
    &lt;dcterms:subject 
          dcxm:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;Metadata&lt;/dcterms:subject&gt;
    &lt;!-- statement with no value string --&gt;
    &lt;dcterms:isPartOf
          dcxm:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 14: Empty Statement Element**

In the subset of the DCAM description model supported by DC-XML-Min, a _non-literal value surrogate_ may include a single _value string_.

The example below shows a _description_ consisting of five _statements_ where the lasst four _statements_ each include a _non-literal value surrogate_ with a _value string_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
          &lt;!-- value string as element content --&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
          &lt;!-- value string as element content --&gt;
    &lt;dcterms:subject 
          dcxm:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;Metadata&lt;/dcterms:subject&gt;
          &lt;!-- value string as element content --&gt;
    &lt;dcterms:audience dcxm:valueType="NonLiteral"&gt;Information managers&lt;/dcterms:audience&gt;
    &lt;dcterms:isPartOf
          dcxm:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 15: The Statement Element (Value String in Non-Literal Value Surrogate)**

The _non-literal value surrogates_ in the second and third _statements_ in the _description_ in the example above contain, respectively, a _value URI_ (represented by the <tt>dcxm:valueURI</tt> XML attribute) and a _vocabulary encoding scheme URI_ (represented by the <tt>dcxm:vocabEncSchemeURI</tt> XML attribute). The presence of these attributes is sufficient to indicate that the Statement Element represents a _statement_ containing a _non-literal value surrogate_.

In the _non-literal value surrogates_ in the fourth _statement_ in the _description_ in the example above, however, no _valueURI_ or _vocabulary encoding scheme URI_ are present. In this case, an XML attribute with the name <tt>dcxm:valueType</tt> with the value ' [NonLiteral](http://dublincore.org/architecturewiki/NonLiteral)' is required to indicate that the Statement Element represents a _statement_ containing a _non-literal value surrogate_. Where a _non-literal surrogate_ has a _value string_ but no_valueURI_ or _vocabulary encoding scheme URI_, this XML attribute is required.

For more details on representing _value strings_, see the section on Encoding a Value String.

<a id="Encoding-a-Value-String"></a>

#### 4.5 Encoding a Value String

A _value string_ may occur within either a _literal value surrogate_ or a _non-literal value surrogate_.

A _literal value surrogate_ must contain exactly one _value string_. In the subset of the DCAM description model supported by DC-XML-Min, a _non-literal value surrogate_ may contain a single _value string_.

In DC-XML-Min, a _value string_ within a _value surrogate_ is represented by the combination of the content of the Statement Element and the values of specified XML attributes of the Statement Element.

A _value string_ is either a _plain value string_ or a _typed value string_.

<a id="Encoding-a-Plain-Value-String"></a>

##### 4.5.1 Encoding a Plain Value String

<a id="The-Value-String-Language"></a>

###### 4.5.1.1 The Value String Language

A _plain value string_ may be associated with a _value string language_

In DC-XML-Min, a _value string language_ is represented by an <tt>xml:lang</tt> attribute of the Statement Element.

The example below shows a _description_ consisting of three _statements_ where the first _statement_ has a _non-literal value surrogate_ containing a _plain value string_ "DCMI Home Page" associated with the _value string language_ "en-GB" :

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
          &lt;!-- value string language --&gt;
    &lt;dcterms:title
          xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
    &lt;dcterms:subject 
          dcxm:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;Metadata&lt;/dcterms:subject&gt;
    &lt;dcterms:isPartOf
          dcxm:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 16: The Value String Language**

<a id="Encoding-a-Typed-Value-String"></a>

##### 4.5.2 Encoding a Typed Value String

<a id="The-Syntax-Encoding-Scheme-URI"></a>

###### 4.5.2.1 The Syntax Encoding Scheme URI

A _typed value string_ is associated with a _syntax encoding scheme URI_.

In DC-XML-Min, a _syntax encoding scheme URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcxm:syntaxEncSchemeURI</tt>.

The example below shows a _description_ consisting of three _statements_ where the third _statement_ has a _non-literal value surrogate_ containing a _typed value string_ with the _syntax encoding scheme URI_ <tt>http://www.w3.org/2001/XMLSchema#date</tt>:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title
          xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"&gt;Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
                       &lt;!-- syntax encoding scheme URI --&gt;
    &lt;dcterms:date 
          dcxm:syntaxEncSchemeURI="http://www.w3.org/2001/XMLSchema#date"&gt;2005-05-05&lt;/dcterms:date&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 17: The Syntax Encoding Scheme URI Attribute**

<a id="XML-data-as-a-Typed-Value-String"></a>

###### 4.5.2.2 XML data as a Typed Value String

A _typed value string_ may be an XML fragment, in which case it must be associated with the _syntax encoding scheme URI***[http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral](http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral)**

The example below shows a _description_ consisting of two _statements_ where the second _statement_ contains a _literal value surrogate_ which includes a _typed value string_ in the form of an XML fragment:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxf:descriptionSet
  xmlns:dcxf="http://dublincore.org/xml/dc-xml-full/2007/06/19"&gt;
  &lt;dcxf:description
    dcxf:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/title" xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcxf:statement&gt;
         &lt;!-- XML data as value string --&gt;
    &lt;dcxf:statement dcxf:propertyURI="http://purl.org/dc/terms/description" dcxf:syntaxEncSchemeURI="http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral"&gt;
      &lt;div xmlns="http://www.w3.org/1999/xhtml"&gt;
        &lt;p&gt;The DCMI home page provides an overview of the content of the
        &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
        site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
      &lt;/div&gt;
    &lt;/dcxf:statement&gt;
  &lt;/dcxf:description&gt;
&lt;/dcxf:descriptionSet&gt;
</pre>

**XML Example 18: XML Data as Typed Value String**

<a id="Encoding-Descriptions-of-Values"></a>

#### 4.6 Encoding Descriptions of Values

As noted in the section on Encoding a Description, _description sets_ may contain multiple _descriptions_. Each _description_ is represented by a separate Description Element. The order of the Description Elements has no significance.

It may be that the _described resource_ of a _description_ is referred to as the _value_ of a _statement_ in another _description_ within the _description set_. If that resource has been assigned a URI, then that URI appears as the _value URI_ in the _statement_ where the resource is the _value_ and as a _described resource URI_ in the _description_ of that resource, as shown below:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:my="http://my.example.org/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"/&gt;
  &lt;/dcxm:description&gt;
  &lt;dcxm:description
    dcxm:resourceURI="http://dublincore.org/pages/althome"&gt;
    &lt;dcterms:title&gt;DCMI Alternative Home Page&lt;/dcterms:title&gt;
    &lt;dcterms:publisher 
          dcxm:valueURI="http://example.org/agents/DCMI"/&gt;
  &lt;/dcxm:description&gt;
                     &lt;!-- value URI used as resource URI in description of value --&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://example.org/agents/DCMI"&gt;
    &lt;my:name&gt;Dublin Core Metadata Initiative&lt;/my:name&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 19: Value as Described Resource**

In some cases the resource will not have a URI assigned, or the URI will not be known. Such a resource may still be a _value_ in a _statement_ in one _description_ and the _described resource_ of another _description_ in the same _description set_.

In such cases, the association between the _statement_ in the first _description_ and the second _description_ is made by using an identifier for the resource which is local to a DC-XML-Full instance. This local identifier is used as the value of a <tt>dcxf:valueRef</tt> XML attribute of one or more Statement Elements and as the value of a <tt>dcxf:resourceId</tt> XML attribute of a Description Element. Each value of a <tt>dcxf:valueRef</tt> XML attribute must match the value of a <tt>dcxf:resourceId</tt> attribute in the same DC-XML-Full instance.

Note that this is a syntactic mechanism for linking references to _values_ in _statements_ to the _descriptions_ of those _values_: the local identifier itself does not appear in the _description set_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcxm:descriptionSet
  xmlns:my="http://my.example.org/terms/"
  xmlns:dcxm="http://dublincore.org/xml/dc-xml-min/2007/06/19"
  xmlns:dcterms="http://purl.org/dc/terms/"&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Home Page&lt;/dcterms:title&gt;
    &lt;!-- Reference to value using local identifier --&gt;
    &lt;dcterms:publisher 
          dcxm:descriptionRef="DCMI"/&gt;
  &lt;/dcxm:description&gt;
  &lt;dcxm:description
        dcxm:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dcterms:title&gt;DCMI Alternative Home Page&lt;/dcterms:title&gt;
    &lt;!-- Reference to value using local identifier --&gt;
    &lt;dcterms:publisher 
          dcxm:descriptionRef="DCMI"/&gt;
  &lt;/dcxm:description&gt;
  &lt;!-- Description of value using local identifier --&gt;
  &lt;dcxm:description dcxm:descriptionId="DCMI"&gt;
    &lt;my:name&gt;Dublin Core Metadata Initiative&lt;/my:name&gt;
  &lt;/dcxm:description&gt;
&lt;/dcxm:descriptionSet&gt;
</pre>

**XML Example 20: Value as Described Resource**

### Appendix A. DC-TEXT Representation of Examples

This appendix provides representations of all the examples provided in the main body of the document using the DC-Text syntax [DC-TEXT].

#### A.1 Example 1

The DC-XML-Min instance in Example 1 represents the following description set:

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

#### A.2 Example 2

The DC-XML-Min instance in Example 2 represents the following description set:

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

#### A.3 Example 3

The DC-XML-Min instance in Example 3 represents the following description set:

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

#### A.4 Example 4

The DC-XML-Min instance in Example 4 represents the following description set:

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

The DC-XML-Min instance in Example 5 represents the following description set:

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

The DC-XML-Min instance in Example 6 represents the following description set:

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

The DC-XML-Min instance in Example 7 represents the following description set:

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

The DC-XML-Min instance in Example 8 represents the following description set:

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

The DC-XML-Min instance in Example 9 represents the following description set:

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

The DC-XML-Min instance in Example 10 represents the following description set:

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

The DC-XML-Min instance in Example 11 represents the following description set:

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

#### A.12 Example 12

The DC-XML-Min instance in Example 12 represents the following description set:

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

The DC-XML-Min instance in Example 13 represents the following description set:

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

The DC-XML-Min instance in Example 14 represents the following description set:

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
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.15 Example 15

The DC-XML-Min instance in Example 15 represents the following description set:

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
    Statement (
      PropertyURI ( dcterms:audience )
      ValueString ( "Information managers" )
    )
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.16 Example 16

The DC-XML-Min instance in Example 16 represents the following description set:

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
      PropertyURI ( dcterms:subject )
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

#### A.17 Example 17

The DC-XML-Min instance in Example 17 represents the following description set:

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
      ValueString ( "2005-05-05"
        SyntaxEncodingSchemeURI ( &lt;http://www.w3.org/2001/XMLSchema#date&gt; )
      )
    )
  )
)
</pre>

#### A.18 Example 18

The DC-XML-Min instance in Example 18 represents the following description set:

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

#### A.19 Example 19

The DC-XML-Min instance in Example 19 represents the following description set:

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

#### A.20 Example 20

The DC-XML-Min instance in Example 20 represents the following description set:

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

### Notes

<a id="Note1"></a>**[1]** This document defines one XML format for representing DC metadata description sets in XML. Other formats may exist supporting other subsets of the DCMI Abstract Model. For example, the Open Archives Initiative Protocol for Metadata Harvesting [OAIPMH] defines a format, commonly known as oai\_dc, which supports the serialisation only of description sets containing a single description, with statements referencing only the fifteen properties of the DCMES, and using literal value surrogates only. oai\_dc is a different XML format from DC-XML-Full, but that does not change the value and usefulness of oai\_dc as a format for serialising that particular subset of DC metadata description sets.

<a id="Note2"></a>**[2]** In this document the term "element" is used to refer only to XML elements, and it should always be interpreted in that sense wherever it occurs. It is not used to refer to the properties of the DCMES.

### References

<a id="DCAM"></a>**[DCAM]**  
_DCMI Abstract Model_ DCMI Recommendation. 2007-06-04  
 [http://dublincore.org/2007/06/04/documents/abstract-model/](http://dublincore.org/2007/06/04/documents/abstract-model/)

<a id="XML"></a>**[XML]**  
_Extensible Markup Language (XML) 1.0 (Third Edition)_. W3C Recommendation 04 February 2004.  
 [http://www.w3.org/TR/REC-xml](http://www.w3.org/TR/REC-xml)

<a id="XMLSCHEMA"></a>**[XMLSCHEMA]**  
_XML Schema Part 0: Primer Second Edition_. W3C Recommendation 28 October 2004.  
 [http://www.w3.org/TR/xmlschema-0/](http://www.w3.org/TR/xmlschema-0/)

<a id="RFC3986"></a>**[RFC3986]**  
_Uniform Resource Identifier (URI): Generic Syntax_.  
 [http://www.ietf.org/rfc/rfc3986.txt](http://www.ietf.org/rfc/rfc3986.txt)

<a id="XMLNS"></a>**[XMLNS]**  
_Namespaces in XML (Second Edition)_. W3C Recommendation 16 August 2006.  
 [http://www.w3.org/TR/REC-xml-names](http://www.w3.org/TR/REC-xml-names)

<a id="RDFXML"></a>**[RDFXML]**  
_RDF/XML Syntax Specification (Revised)_ W3C Recommendation 10 February 2004.  
 [http://www.w3.org/TR/rdf-syntax-grammar/](http://www.w3.org/TR/rdf-syntax-grammar/)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Candidate Recommendation 2 May 2007  
 [http://www.w3.org/TR/2007/CR-grddl-20070502/](http://www.w3.org/TR/2007/CR-grddl-20070502/)

<a id="OAIPMH"></a>**[OAIPMH]**  
_The Open Archives Initiative Protocol for Metadata Harvesting_ Protocol Version 2.0 of 2002-06-14.  
 [http://www.openarchives.org/OAI/openarchivesprotocol.html](http://www.openarchives.org/OAI/openarchivesprotocol.html)

<a id="DC-TEXT"></a>**[DC-TEXT]**  
_DC-Text: A Text Syntax for Dublin Core Metadata_ Draft of 2007-04-02.  
 [http://dublincore.org/architecturewiki/DCText/2007-04-02](http://dublincore.org/architecturewiki/DCText/2007-04-02)

### Changes in this version

- Revise for 2007-06-04 version of DCAM

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLMGuidelines_2f2007_2d06_2d19.text_html) for this page (cached 2012-12-29 09:32:34)  

Immutable page (last edited 2007-07-05 15:21:41 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


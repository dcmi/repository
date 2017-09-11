---
title: "- DCXMLRevision/DCXMLGuidelines"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fDCXMLGuidelines.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/DCXMLGuidelines](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=fullsearch&value=%2FDCXMLGuidelines&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fDCXMLGuidelines">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLGuidelines_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fDCXMLGuidelines_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
## Expressing Dublin Core metadata using XML

This document is part of the [<img src="DCXMLRevision_2fDCXMLGuidelines_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Architecture Wiki](http://dublincore.org/architecturewiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong> </td>
      <td>
        <strong>Expressing Dublin Core metadata using XML</strong> </td>
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
        2006-05-29 </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-05-29">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-05-29</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Replaces:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-05-16">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-05-16</a> </td>
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
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines">http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong> </td>
      <td>
        This document specifies an XML format for representing a Dublin Core 
        metadata description set. The XML format is known as "DC-XML".</td>
    </tr>
  </tbody>
</table>


### Contents

1. 

Introduction

2. 

The DCMI Abstract Model and DC-XML

3. 

The DC-XML Syntax

4. 

GRDDL

5. 

Appendix A: Text Representation of Examples

6. 

Notes

7. 

References

### 1. Introduction

This document specifies an XML format for representing a DC metadata _description set_. The XML format is known as "DC-XML".

The DCMI Abstract Model [DCAM] describes the constructs that make up a DC metadata _description set_. In order to represent a DC metadata description set in an XML document those constructs have to be represented as components in that XML document, i.e. as XML elements and XML attributes, XML element names and XML attribute names, and as XML element content and XML attribute values.

#### 1.1 Design Considerations

The DC-XML format described in this document was developed using the following design considerations:

- The format should provide a serialisation of all the features of the "Description Model" of the DCAM, i.e. it should be possible to represent all the constructs that make up a DC metadata _description set_. (See Note 1).

- The format is not required to address the features of the "Schema Model" of the DCAM. For example, it is not required to express subproperty relationships between properties, subclass relationships between classes, etc.

- The format should be easily usable with XML-based specifications such as XPath, XPointer and XQuery, i.e. for each construct in the DCAM there should be a mapping to exactly one construct in the XML syntax.

- The format should not be dependent on features of a single XML Schema language.

- It should be possible to describe the format using W3C XML Schema [XMLSCHEMA], but it is not a requirement that when the format is used to serialise _description sets_ conforming to a DC Application Profile, all the constraints expressed in a DC Application Profile are captured using W3C XML Schema.

### 2. The DCMI Abstract Model and DC-XML

According to the DCAM:

- a _description set_ is made up of one or more _descriptions_

- a _description_ is made up of

  - zero or one _resource URI_ and

  - one or more _statements_

- a _statement_ is made up of

  - exactly one _property URI_ and

  - zero or one _reference to_ a value in the form of a _value URI_

  - zero or more _representations of_ a value, each in the form of a _value representation_

  - zero or one _vocabulary encoding scheme URI_

- a _value representation_ is either

  - a _value string_ or

  - a _rich representation_

- a _value string_ may have an associated _value string language_

- a _value string_ may have an associated _syntax encoding scheme URI_

- a _value_ may be the subject of a _related description_

The DC-XML format described in this document implements all the features of the DCAM.

### 3. The DC-XML Syntax

<a id="sec3.1"></a>

#### 3.1 URIs and XML Qualified Names

The DCAM uses URIs to refer both to resources and to metadata terms (properties, vocabulary encoding schemes and syntax encoding schemes). In DC-XML, URIs are sometimes represented as XML Qualified Names (QNames). An XML QName is an abbreviation for an "expanded name", a pair consisting of an XML Namespace Name (a URI, which is associated with the QName prefix in an XML Namespace declaration) and a local name.

For a software application that is parsing a DC-XML instance, the URI is determined from the XML QName by appending the local name part of the QName to the XML Namespace Name. Note that only some XML QNames in a DC-XML instance are mapped to URIs in this way: this specification indicates when that mapping is applied.

For a software application that is "encoding" a _description set_ by generating a DC-XML instance, the QName is determined by using the trailing characters of the URI as the local name of the QName, and the preceding part of the URI as the XML Namespace Name. Note that this means for a single URI there is more than one possible QName representation. For example, the URI <tt>http://purl.org/dc/elements/1.1/date</tt> might be represented using any of the following expanded names (XML Namespace Name, local name pairs):

- <tt>{http://purl.org/dc/elements/1.1/}, date</tt>

- <tt>{http://purl.org/dc/elements/1.1/d}, ate</tt>

- <tt>{http://purl.org/dc/elements/1.1/da}, te</tt>

- <tt>{http://purl.org/dc/elements/1.1/dat}, e</tt>

Communities typically decide on a convention for the QName to be used, but in theory any of these four forms could be deployed without changing the interpretation of the instance. For all DCMI terms, the convention used by the DCMI community is to split the term URI into an expanded name at the right-most '/' (forward slash) character (as per the first example above).

In DC-XML, only some URIs are represented as XML QNames; other URIs are represented in full. The table below summarises the options available:

<table>
  <tbody>
    <tr>
      <td>
        <strong>URI</strong> </td>
      <td align="center">
        <strong>May be represented as URI</strong> </td>
      <td align="center">
        <strong>May be represented as QName</strong> </td>
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
        Yes </td>
    </tr>
    <tr>
      <td>
        Syntax Encoding Scheme URI </td>
      <td align="center">
        Yes </td>
      <td align="center">
        Yes </td>
    </tr>
  </tbody>
</table>


#### 3.2 Encoding a Description Set: The Description Set Element

A _description set_ is a set of one or more _descriptions_.

In DC-XML, a _description set_ is represented by an XML element known as a Description Set Element (See Note 2). A DC-XML instance has exactly one Description Set Element.

A Description Set Element always has an expanded name with the XML Namespace Name <tt>http://purl.org/dc/xml/</tt> and local name <tt>descriptionSet</tt>. In the examples presented in this document, the XML Namespace Name <tt>http://purl.org/dc/xml/</tt> is always associated with the prefix "dcx".

<pre>&lt;?xml version="1.0"?&gt;
       &lt;!-- Description Set Element --&gt;
&lt;dcx:descriptionSet 
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 1: the Description Set Element**

#### 3.3 Encoding a Description: The Description Element

A _description_ is a set of one or more _statements_ about a resource.

In DC-XML, a _description_ is represented by an XML element known as a Description Element. Any XML element which is a child element of a Description Set Element is a Description Element.

The following example shows a _description set_ consisting of a single _description_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"
  xmlns:my="http:example.org/myapplication/"&gt;
  &lt;my:webPageDescription&gt; &lt;!-- Description Element --&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/my:webPageDescription&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 2: the Description Element**

In the remainder of this document, Description Elements are shown using an XML element with an expanded name with the XML Namespace Name <tt>http://purl.org/dc/xml/</tt> and local name <tt>description</tt> (represented by the XML QName <tt>dcx:description</tt>). However, it is important to remember that a Description Element may have a different element name if such a name is useful or neceesary for the particular application.

A _description set_ may contain multiple _descriptions_.

In DC-XML, each _description_ is represented by a separate Description Element. The order of the Description Elements within a Description Set Element is not significant.

The following example shows a _description set_ consisting of two _descriptions_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description&gt; &lt;!-- 1st Description Element --&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
  &lt;dcx:description&gt; &lt;!-- 2nd Description Element --&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;UKOLN Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 3: Multiple Description Elements**

The encoding of _description sets_ with multiple _descriptions_ is described further in section 3.6.

##### 3.3.1 The Resource URI

A _description_ may have an associated _resource URI_.

In DC-XML, a _resource URI_ must be encoded in full. The _resource URI_ is represented as the value of an XML attribute of the Description Element. The attribute has the name <tt>dcx:resourceURI</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt; &lt;!-- resource URI --&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 4: the Resource URI Attribute**

Note that the representation of the _resource URI_ may be abbreviated through the use of an XML entity reference, as follows:

<pre>&lt;?xml version="1.0"?&gt;
&lt;!DOCTYPE dcx:descriptionSet [
  &lt;!ENTITY dcmi 'http://dublincore.org/pages/'&gt;
]&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="&amp;dcmi;home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 5: the Resource URI Attribute (with XML entity reference)**

#### 3.4 Encoding Statements: Statement Elements

A _description_ is made up of one or more _statements_.

In DC-XML, each child XML element of a Description Element represents a single _statement_ and is known as a Statement Element.

The following example shows a _description_ consisting of a single _statement_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt; &lt;!-- Statement Element --&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 6: A Statement Element**

A _description_ may be made up of multiple _statements_, each represented by a separate Statement Element. The order of the Statement Elements within a Description Element is not significant.

The following example shows a _description_ consisting of two _statements_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt; &lt;!-- Statement Element --&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher&gt; &lt;!-- Statement Element --&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 7: Multiple Statement Elements**

##### 3.4.1 The Property URI

A _statement_ must contain exactly one _property URI_.

In DC-XML, the _property URI_ is represented by the element name of the Statement Element (an XML QName). The _property URI_ is determined from the QName by applying the QName-URI mapping described in section 3.1

The example below shows a _description_ consisting of two _statements_ where the _property URIs_ are <tt>http://purl.org/dc/elements/1.1/title</tt> and <tt>http://purl.org/dc/elements/1.1/publisher</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 8: The Property URI**

##### 3.4.2 The Value URI

A _statement_ may contain a _value URI_.

In DC-XML, the _value URI_ must be encoded in full. The _value URI_ is represented as the value of an XML attribute of the Statement Element. The attribute has the name <tt>dcx:valueURI</tt>.

The example below shows a _description_ consisting of two _statements_ where the second _statement_ includes the _value URI_ <tt>http://example.org/agents/DCMI</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt; &lt;!-- value URI --&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 9: The Value URI Attribute**

The representation of the _value URI_ may be abbreviated through the use of an XML entity reference, as follows:

<pre>&lt;?xml version="1.0"?&gt;
&lt;!DOCTYPE dcx:descriptionSet [
  &lt;!ENTITY agent 'http://example.org/agents/'&gt;
]&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="&amp;agent;DCMI"&gt; &lt;!-- entity reference --&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 10: the Value URI Attribute (using an XML entity reference)**

##### 3.4.3 The Vocabulary Encoding Scheme URI Attribute

A _statement_ may include a _vocabulary encoding scheme URI_.

In DC-XML, a _vocabulary encoding scheme URI_ may either be encoded in full or as an XML QName. In both cases it is represented as the value of an XML attribute of the Statement Element. If the _value URI_ appears in full, the attribute has the name <tt>dcx:vocabEncSchemeURI</tt>. If the _value URI_ is represented using an XML QName, the attribute has the name <tt>dcx:vocabEncSchemeQName</tt>.

The example below shows a _description_ consisting of three _statements_ where the third _statement_ includes the _vocabulary encoding scheme URI_ <tt>http://purl.org/dc/terms/LCSH</tt>.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
                &lt;!-- vocabulary encoding scheme URI --&gt;
    &lt;dc:subject dcx:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;dcx:valueString&gt;Metadata&lt;/dcx:valueString&gt;
    &lt;/dc:subject&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 11: The Vocabulary Encoding Scheme URI Attribute**

Where an XML QName is used, the _vocabulary encoding scheme URI_ is determined from the QName by applying the QName-URI mapping described in section 3.1.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
                &lt;!-- vocabulary encoding scheme QName --&gt;
    &lt;dc:subject dcx:vocabEncSchemeQName="dcterms:LCSH"&gt;
      &lt;dcx:valueString&gt;Metadata&lt;/dcx:valueString&gt;
    &lt;/dc:subject&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 12: the Vocabulary Encoding Scheme QName Attribute**

Note that the two examples above illustrate two alternate ways of representing the same information. A single Statement Element should not have both a <tt>dcx:vocabEncSchemeURI</tt> and a <tt>dcx:vocabEncSchemeQName</tt> attribute.

##### 3.4.4 Empty Statement Elements

The presence of a _value representation_ in a _statement_ is optional.

In DC-XML, the Statement Element may therefore be empty.

The example below shows a _description_ consisting of four _statements_ where the fourth _statement_ provides a _value URI_ but no _value representation_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dc:subject dcx:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;dcx:valueString&gt;Metadata&lt;/dcx:valueString&gt;
    &lt;/dc:subject&gt;
    &lt;!-- statement with no value representation --&gt;
    &lt;dcterms:isPartOf dcx:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 13: Empty Statement Element**

#### 3.5 Encoding Value Strings and Rich Representations: Value Representation Elements

A _statement_ may contain multiple _value representations_.

In DC-XML, the _value representations_ are represented by child elements of the Statement Element known as Value Representation Elements. The order of the Value Representation Elements within a Statement Element is not significant.

A value representation may take the form of a _value string_ or a _rich representation_

##### 3.5.1 The Value String

A _value string_ is represented by an XML element with the element name <tt>dcx:valueString</tt>.

The example below shows a _description_ consisting of four _statements_ where the first three _statements_ each include a _value string_.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;!-- value string --&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;!-- value string --&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dc:subject dcx:vocabEncSchemeURI="http://purl.org/dc/terms/LCSH"&gt;
      &lt;!-- value string --&gt;
      &lt;dcx:valueString&gt;Metadata&lt;/dcx:valueString&gt;
    &lt;/dc:subject&gt;
    &lt;dcterms:isPartOf dcx:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 14: The Value String**

A _statement_ may contain multiple _value strings_, each represented by a separate <tt>dcx:valueString</tt> child XML element.

The following example shows a _description_ in which the first _statement_ provides three _value strings_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcterms="http://purl.org/dc/terms/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/sitemap/"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;Site Map&lt;/dcx:valueString&gt; &lt;!-- three value strings --&gt;
      &lt;dcx:valueString&gt;Plan du site&lt;/dcx:valueString&gt;
      &lt;dcx:valueString&gt;Plan del sitio&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dcterms:isPartOf dcx:valueURI="http://dublincore.org/site" /&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 15: Multiple Value Strings**

###### 3.5.1.1 The Value String Language

A _value string_ may have an associated _value string language_.

In DC-XML, a _value string language_ is represented by an <tt>xml:lang</tt> attribute of the <tt>dcx:valueString</tt> XML element representing the _value string_.

The example below shows a _description_ consisting of three _statements_ where the first _statement_ has an associated _value string language_ "en-GB" with the _value string_ "DCMI Home Page":

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;!-- value string language --&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dc:date&gt;
      &lt;dcx:valueString&gt;2005-05-05&lt;/dcx:valueString&gt;
    &lt;/dc:date&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 16: The Value String Language**

###### 3.5.1.2 The Syntax Encoding Scheme URI

A _value string_ may have an associated _syntax encoding scheme URI_.

In DC-XML, a _syntax encoding scheme URI_ may be encoded in full or it may be represented as an XML QName. In both cases, the _syntax encoding scheme URI_ is represented as the value of an XML attribute of the <tt>dcx:valueString</tt> element. If the _syntax encoding scheme URI_ is encoded in full, the attribute has the name <tt>dcx:syntaxEncSchemeURI</tt>. If it is represented using an XML QName, the attribute has the name <tt>dcx:syntaxEncSchemeQName</tt>.

The example below shows a _description_ consisting of three _statements_ where the third _statement_ associates the _syntax encoding scheme URI_ <tt>http://www.w3.org/2001/XMLSchema#date</tt> with the _value string_ "2005-05-05":

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dc:date&gt;
                       &lt;!-- syntax encoding scheme URI --&gt;
      &lt;dcx:valueString dcx:syntaxEncSchemeURI="http://www.w3.org/2001/XMLSchema#date"&gt;2005-05-05&lt;/dcx:valueString&gt;
    &lt;/dc:date&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 17: The Syntax Encoding Scheme URI Attribute**

Where an XML QName is used, the _syntax encoding scheme URI_ is determined from the QName by applying the QName-URI mapping described in section 3.1.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"
  xmlns:xsd="http://www.w3.org/2001/XMLSchema#"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI"&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/dc:publisher&gt;
    &lt;dc:date&gt;
                       &lt;!-- syntax encoding scheme QName --&gt;
      &lt;dcx:valueString dcx:syntaxEncSchemeQName="xsd:date"&gt;2005-05-05&lt;/dcx:valueString&gt;
    &lt;/dc:date&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 18: the Syntax Encoding Scheme QName Attribute**

Note that these two examples illustrate two alternate ways of representing the same information. A single <tt>dcx:valueString</tt> XML element should not have both a <tt>dcx:syntaxEncSchemeURI</tt> and a <tt>dcx:syntaxEncSchemeQName</tt> attribute.

##### 3.5.2 Rich Representations

A _value_ may also be represented by a _rich representation_ - i.e. by some XML data or by a binary data object.

###### 3.5.2.1 XML Data

An XML data _rich representation_ may be provided in two ways. It may be provided "inline" within the DC-XML document or it may be provided as a separate XML document, the URI of which is provided as an attribute value.

Inline XML data is represented by the content of a Value Representation Element with the element name <tt>dcx:XMLRepresentation</tt>.

The example below shows a _description_ consisting of two _statements_ where the second _statement_ includes a _rich representation_ of the _value_ in the form of an XML fragment:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:description&gt;
      &lt;dcx:XMLRepresentation&gt; &lt;!-- inline XML data --&gt;
        &lt;div xmlns="http://www.w3.org/1999/xhtml"&gt;
          &lt;p&gt;The DCMI home page provides an overview of the content of the
          &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
          site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
        &lt;/div&gt;
      &lt;/dcx:XMLRepresentation&gt;
    &lt;/dc:description&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 19: Rich Representation - XML Data**

The URI of external XML data is encoded as the value of the <tt>dcx:representationURI</tt> attribute of the <tt>dcx:XMLRepresentation</tt> element, as follows:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:description&gt;
                                                   &lt;!-- external XML data --&gt;
      &lt;dcx:XMLRepresentation dcx:representationURI="http://example.org/docs/doc.xml" /&gt;
    &lt;/dc:description&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 20: Rich Representation - XML Data**

###### 3.5.2.2 Binary Data

A binary data _rich representation_ may be provided in two ways. It may be provided "inline" within the DC-XML document or it may be provided as a separate resource, the URI of which is provided as an attribute value.

Inline binary data is represented by the content of a Value Representation Element with the element name <tt>dcx:binaryRepresentation</tt>. The XML element content is a Base64 encoding of the binary object.

The example below shows a _description_ consisting of two _statements_ where the second _statement_ includes a _rich representation_ of the _value_ in the form of a binary data object:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:description&gt;
                                &lt;!-- inline binary data object --&gt;
      &lt;dcx:binaryRepresentation&gt;AABBCCDDEEFF&lt;/dcx:binaryRepresentation&gt;
    &lt;/dc:description&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 21: Rich Representation - Binary Data**

The URI of external binary data is encoded as the value of the <tt>dcx:representationURI</tt> attribute of the <tt>dcx:binaryRepresentation</tt> element:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:description&gt;
                                                     &lt;!-- external binary data object --&gt;   
      &lt;dcx:binaryRepresentation dcx:representationURI="http://example.org/imgs/img.png" /&gt;
    &lt;/dc:description&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 22: Rich Representation - Binary Data**

A _statement_ may contain multiple _rich representations_ in the form of separate <tt>dcx:XMLRepresentation</tt> or <tt>dcx:binaryRepresentation</tt> XML elements. Furthermore, a single _statement_ may provide both _value strings_ and _rich representations_.

The following example shows a _description_ in which the second _statement_ provides two _value strings_ and two _rich representations_:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;dc:description&gt;
      &lt;!-- two value strings --&gt;
      &lt;dcx:valueString xml:lang="en-GB"&gt;
        The home page provides an overview of the content of the
        DCMI Web site. It also displays current news items.
      &lt;/dcx:valueString&gt;
      &lt;dcx:valueString xml:lang="es-ES"&gt;
        El Home Page proporciona una descripci&amp;#243;n del contenido
        del sitio del Web de DCMI. Adem&amp;#225;s presenta noticias actuales.
      &lt;/dcx:valueString&gt;
      &lt;!-- two rich representations --&gt;
      &lt;dcx:XMLRepresentation&gt;
        &lt;div xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-GB"&gt;
          &lt;p&gt;The home page provides an overview of the content of the
          &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
          site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
        &lt;/div&gt;
      &lt;/dcx:XMLRepresentation&gt;
      &lt;dcx:XMLRepresentation&gt;
        &lt;div xmlns="http://www.w3.org/1999/xhtml" xml:lang="es-ES"&gt;
          &lt;p&gt;El Home Page proporciona una descripci&amp;#243;n del contenido
          del &lt;a title="El sitio del Web de DCMI" href="http://dublincore.org/"&gt;
          sitio del Web de DCMI&lt;/a&gt;. Adem&amp;#225;s se presentan noticias 
          actuales.&lt;/p&gt;
        &lt;/div&gt;
      &lt;/dcx:XMLRepresentation&gt;
    &lt;/dc:description&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 23: Multiple Value Strings and Multiple Rich Representations**

<a id="sec3.6"></a>

#### 3.6 Encoding Related Descriptions

As noted in section 3.3, _description sets_ may contain multiple _descriptions_. Each _description_ is represented by a separate Description Element. The order of the Description Elements has no significance.

In cases where a _description_ is about a resource which is the _value_ of a _statement_ in another _description_ within the _description set_, the _description_ is known as a _related description_. If that resource has been assigned a URI, then that URI appears as the _value URI_ in the _statement_ where the resource is the _value_ and as a _resource URI_ in the _description_ of that resource, as shown below:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:my="http://my.example.org/terms/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
                                &lt;!-- value URI --&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI" /&gt;
  &lt;/dcx:description&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/althome"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Alternative Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
                                &lt;!-- value URI --&gt;
    &lt;dc:publisher dcx:valueURI="http://example.org/agents/DCMI" /&gt;
  &lt;/dcx:description&gt;
  &lt;dcx:description
                     &lt;!-- value URI used as resource URI in related description --&gt;
    dcx:resourceURI="http://example.org/agents/DCMI"&gt;
    &lt;my:name&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/my:name&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 24: Related Description**

In some cases the resource will not have a URI assigned, or the URI will not be known. Such a resource may still be a _value_ in a _statement_ and the subject of another _description_ in the same _description set_ (a _related description_).

In such cases, the association between the _statement_ and the _related description_ is made by labelling the _related description_ using an XML attribute of the Description Element. The attribute has the name <tt>dcx:descriptionId</tt>. The attribute value may then be cited in the the value of a <tt>dcx:descriptionRef</tt> XML attribute of one or more Statement Elements elsewhere in the same _description set_. Each value of a <tt>dcx:descriptionRef</tt> XML attribute must match the value of a <tt>dcx:descriptionId</tt> attribute in the same DC-XML instance.

Note that this is a syntactic mechanism for linking references to _values_ to the _related descriptions_ of those _values_: the label itself does not appear in the DCAM.

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:my="http://my.example.org/terms/"
  xmlns:dcx="http://purl.org/dc/xml/"&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;!-- Reference to related description using label --&gt;
    &lt;dc:publisher dcx:descriptionRef="DCMI" /&gt;
  &lt;/dcx:description&gt;
  &lt;dcx:description
    dcx:resourceURI="http://dublincore.org/pages/home"&gt;
    &lt;dc:title&gt;
      &lt;dcx:valueString&gt;DCMI Alternative Home Page&lt;/dcx:valueString&gt;
    &lt;/dc:title&gt;
    &lt;!-- Reference to related description using label --&gt;
    &lt;dc:publisher dcx:descriptionRef="DCMI" /&gt;
  &lt;/dcx:description&gt;
  &lt;!-- Related description with label --&gt;
  &lt;dcx:description dcx:descriptionId="DCMI"&gt;
    &lt;my:name&gt;
      &lt;dcx:valueString&gt;Dublin Core Metadata Initiative&lt;/dcx:valueString&gt;
    &lt;/my:name&gt;
  &lt;/dcx:description&gt;
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 25: Related Description**

### 4. GRDDL

An XSLT transformation from DC-XML to RDF/XML [RDFXML] is available.

The GRDDL specification [GRDDL] defines a set of conventions for associating an XML instance document with a transformation.

One approach is to reference the transformation using an attribute of the root element, as follows:

<pre>&lt;?xml version="1.0"?&gt;
&lt;dcx:descriptionSet
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  xmlns:dcx="http://purl.org/dc/xml/"
  xmlns:data-view="http://www.w3.org/2003/g/data-view#"
  data-view:transformation="dcx2rdfxml.xsl"&gt;
  ...
&lt;/dcx:descriptionSet&gt;
</pre>

**XML Example 26: GRDDL**

The transformation can also be associated with a set of XML documents through information provided by the "namespace document".

### Appendix A. DC-TEXT Representation of Examples

This appendix provides representations of all the examples provided in the main body of the document using the DC-Text syntax [DC-TEXT].

#### A.1 Example 1

The DC-XML document in Example 1 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.2 Example 2

The DC-XML document in Example 2 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.3 Example 3

The DC-XML document in Example 3 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; . 
DescriptionSet (
  Description (
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
  Description (
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "UKOLN Home Page" )
    )
  )
)
</pre>

#### A.4 Example 4

The DC-XML document in Example 4 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.5 Example 5

The DC-XML document in Example 5 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcmi: &lt;http://dublincore.org/pages/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( dcmi:home )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.6 Example 6

The DC-XML document in Example 6 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
  )
)
</pre>

#### A.7 Example 7

The DC-XML document in Example 7 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.8 Example 8

The DC-XML document in Example 8 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; . 
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.9 Example 9

The DC-XML document in Example 9 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.10 Example 10

The DC-XML document in Example 10 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix agent: &lt;http://example.org/agents/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( agent:DCMI )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

#### A.11 Example 11

The DC-XML document in Example 11 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:subject )
      VocabularyEncodingSchemeURI ( &lt;http://purl.org/dc/terms/LCSH&gt; )
      ValueString ( "Metadata" )
    )
  )
)
</pre>

#### A.12 Example 12

The DC-XML document in Example 12 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix dcmi: &lt;http://dublincore.org/pages/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( dcmi:home )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:subject )
      VocabularyEncodingSchemeURI ( dcterms:LCSH )
      ValueString ( "Metadata" )
    )
  )
)
</pre>

#### A.13 Example 13

The DC-XML document in Example 13 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:subject )
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

#### A.14 Example 14

The DC-XML document in Example 14 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:subject )
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

The DC-XML document in Example 15 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/sitemap&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "Site Map" )
      ValueString ( "Plan du site" )
      ValueString ( "Plan del sitio" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dcterms:isPartOf )
      ValueURI ( &lt;http://dublincore.org/site&gt; )
    )
  )
)
</pre>

#### A.16 Example 16

The DC-XML document in Example 16 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:date )
      ValueString ( "2005-05-05" )
    )
  )
)
</pre>

#### A.17 Example 17

The DC-XML document in Example 17 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:date )
      ValueString ( "2005-05-05"
        SyntaxEncodingSchemeURI ( &lt;http://www.w3.org/2001/XMLSchema#date&gt; )
      )
    )
  )
)
</pre>

#### A.18 Example 18

The DC-XML document in Example 18 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcmi: &lt;http://dublincore.org/pages/&gt; .
@prefix agent: &lt;http://example.org/agents/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
DescriptionSet (
  Description (
    ResourceURI ( dcmi:home )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( agent:DCMI )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
    Statement (
      PropertyURI ( dc:date )
      ValueString ( "2005-05-05"
        SyntaxEncodingSchemeURI ( xsd:date )
      )
    )
  )
)
</pre>

#### A.19 Example 19

The DC-XML document in Example 19 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:description )
      RichRepresentation ( "&lt;div xmlns=\"http://www.w3.org/1999/xhtml\"&gt;
        &lt;p&gt;The DCMI home page provides an overview of the content of the 
        &lt;a title=\"DCMI Web Site\" href=\"http://dublincore.org/\"&gt;DCMI Web site&lt;/a&gt;.  
        It also displays current news items.&lt;/p&gt;&lt;/div&gt;" )
    )
  )
)
</pre>

#### A.20 Example 20

The DC-XML document in Example 20 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:description )
      RichRepresentation ( 
        RepresentationURI ( &lt;http://example.org/docs/doc.xml&gt; )
      )
    )
  )
)
</pre>

#### A.21 Example 21

The DC-XML document in Example 21 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:description )
      RichRepresentation ( 
        Base64 ( "AABBCCDDEEFF" )
      )
    )
  )
)
</pre>

#### A.22 Example 22

The DC-XML document in Example 22 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:description )
      RichRepresentation ( 
        RepresentationURI ( &lt;http://example.org/imgs/img.png&gt; )
      )
    )
  )
)
</pre>

#### A.23 Example 23

The DC-XML document in Example 23 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" 
        Language ( en-GB )
      )
    )
    Statement (
      PropertyURI ( dc:description )
      ValueString (
        "The home page provides an overview of the content of the
        DCMI Web site. It also displays current news items." 
        Language: ( en-GB )
      )
      ValueString (
        "El Home Page proporciona una descripción del contenido
        del sitio del Web de DCMI. Además presenta noticias actuales."
        Language: ( es-ES )
      )
      RichRepresentation ( 
        "&lt;div xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-GB"&gt;
        &lt;p&gt;The DCMI home page provides an overview of the content of the
        &lt;a title="DCMI Web Site" href="http://dublincore.org/"&gt;DCMI Web
        site&lt;/a&gt;. It also displays current news items.&lt;/p&gt;
        &lt;/div&gt;" 
      )
      RichRepresentation ( 
        "&lt;div xmlns="http://www.w3.org/1999/xhtml" xml:lang="es-ES"&gt;
        &lt;p&gt;El Home Page proporciona una descripción del contenido
        del &lt;a title="El sitio del Web de DCMI" href="http://dublincore.org/"&gt;
        sitio del Web de DCMI&lt;a/&gt;. Además se presentan noticias 
        actuales.&lt;/p&gt;
        &lt;/div&gt;"
      )
    )
  )
)
</pre>

#### A.24 Example 24

The DC-XML document in Example 24 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix my: &lt;http://my.example.org/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      ValueURI ( &lt;http://example.org/agents/DCMI&gt; )
    )
  )
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/althome&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Alternative Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
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

#### A.25 Example 25

The DC-XML document in Example 25 represents the following description set:

<pre>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix my: &lt;http://my.example.org/terms/&gt; .
DescriptionSet (
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/home&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      DescriptionRef ( descDCMI )
    )
  )
  Description (
    ResourceURI ( &lt;http://dublincore.org/pages/althome&gt; )
    Statement (
      PropertyURI ( dc:title )
      ValueString ( "DCMI Alternative Home Page" )
    )
    Statement (
      PropertyURI ( dc:publisher )
      DescriptionRef ( descDCMI )
    )
  )
  Description (
    DescriptionId ( descDCMI )
    Statement (
      PropertyURI ( my:name )
      ValueString ( "Dublin Core Metadata Initiative" )
    )
  )
)
</pre>

### Notes

<a id="Note1"></a>**[1]** This document defines one XML format for representing DC metadata description sets in XML. Other formats may exist supporting other subsets of the DCMI Abstract Model. For example, the Open Archives Initiative Protocol for Metadata Harvesting [OAIPMH] defines a format, commonly known as oai\_dc, which supports the serialisation only of description sets containing a single description, with statements referencing only the fifteen properties of the DCMES, and using value strings only. oai\_dc is a different XML format from DC-XML, but that does not change the value and usefulness of oai\_dc as a format for serialising that particular subset of DC metadata description sets.

<a id="Note2"></a>**[2]** In this document the term "element" is used to refer only to XML elements, and it should always be interpreted in that sense wherever it occurs. It is not used to refer to the properties of the DCMES.

### References

<a id="DCAM"></a>**[DCAM]**  
DCMI Abstract Model  
 [http://dublincore.org/documents/abstract-model/](http://dublincore.org/documents/abstract-model/)

<a id="XML"></a>**[XML]**  
_Extensible Markup Language (XML) 1.0 (Third Edition)_. W3C Recommendation 04 February 2004.  
 [http://www.w3.org/TR/REC-xml](http://www.w3.org/TR/REC-xml)

<a id="XMLSCHEMA"></a>**[XMLSCHEMA]**  
_XML Schema Part 0: Primer Second Edition_. W3C Recommendation 28 October 2004.  
 [http://www.w3.org/TR/xmlschema-0/](http://www.w3.org/TR/xmlschema-0/)

<a id="XMLNS"></a>**[XMLNS]**  
_Namespaces in XML_. W3C Recommendation 14 January 1999.  
 [http://www.w3.org/TR/REC-xml-names](http://www.w3.org/TR/REC-xml-names)

<a id="RDFXML"></a>**[RDFXML]**  
_RDF/XML Syntax Specification (Revised)_ W3C Recommendation 10 February 2004.  
 [http://www.w3.org/TR/rdf-syntax-grammar/](http://www.w3.org/TR/rdf-syntax-grammar/)

<a id="GRDDL"></a>**[GRDDL]**  
_Gleaning Resource Descriptions from Dialects of Languages (GRDDL)_ W3C Team Submission 16 May 2005  
 [http://www.w3.org/TeamSubmission/grddl/](http://www.w3.org/TeamSubmission/grddl/)

<a id="OAIPMH"></a>**[OAIPMH]**  
_The Open Archives Initiative Protocol for Metadata Harvesting_ Protocol Version 2.0 of 2002-06-14.  
 [http://www.openarchives.org/OAI/openarchivesprotocol.html](http://www.openarchives.org/OAI/openarchivesprotocol.html)

<a id="DC-TEXT"></a>**[DC-TEXT]**  
_DC-Text: A Text Syntax for Dublin Core Metadata_ Draft of 2006-05-24.  
 [http://dublincore.org/architecturewiki/DCText/2006-05-24](http://dublincore.org/architecturewiki/DCText/2006-05-24)

### Changes in this version

- Remove MIME type for rich representations

- Add DC-Text Examples 20, 22

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fDCXMLGuidelines?action=refresh&arena=Page.py&key=DCXMLRevision_2fDCXMLGuidelines.text_html) for this page (cached 2012-12-21 21:41:55)  

Immutable page (last edited 2006-05-25 12:21:27 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


---
title: "- DCXMLRevision/Comments"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCXMLRevision_2fComments.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCXMLRevision/Comments](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=fullsearch&value=%2FComments&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCXMLRevision "Up")
- [Edit](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments "View")
- [Diffs](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCXMLRevision_2fComments">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fComments_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCXMLRevision_2fComments_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Comments Received on "Expressing Dublin Core metadata using XML" Working Draft 2006-05-29

This document is part of the [<img src="DCXMLRevision_2fComments_files/moin-inter.png" alt="[Self]" height="16" width="16">DC Architecture Wiki](http://dublincore.org/architecturewiki/ "Self").

**IMPORTANT:** Do **not** cite materials in this Wiki other than for the purposes of collaborating on document creation. This Wiki is intended to be used to work on draft copies of documents. Finished documents will be published, in a persistent and citable form, on the dublincore.org Web site (or elsewhere in some cases).

<table bgcolor="#ffffcc" width="100%">
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong> </td>
      <td>
        <strong>Comments Received on "Expressing Dublin Core metadata using XML" Working Draft 2006-05-29</strong> </td>
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
        2006-06-30 </td>
    </tr>
    <tr>
      <td>
        <strong>Identifier:</strong> </td>
      <td>
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/Comments/2006-06-30">http://dublincore.org/architecturewiki/DCXMLRevision/Comments/2006-06-30</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Replaces:</strong> </td>
      <td>
        Not applicable </td>
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
        <a href="http://dublincore.org/architecturewiki/DCXMLRevision/Comments">http://dublincore.org/architecturewiki/DCXMLRevision/Comments</a> </td>
    </tr>
    <tr>
      <td>
        <strong>Description of Document:</strong> </td>
      <td>
        This document summarises comments on the 2006-05-29 Working Draft of 
        "Expressing Dublin Core metadata using XML" received during the public 
        comment period from 2006-05-30 to 2006-06-27.</td>
    </tr>
  </tbody>
</table>


* * *

### Issue 1: Resource URIs and Value URIs not representable as QNames

Ann Apps, 2006-06-12 1

#### Comment

If DC-XML allows the representation of other URIs as QNames, it should allow the representation of Resource URIs and Value URIs as QNames.

#### Response

The DC-XML format is probably inconsistent on allowing QName representations for VES and SES URIs but not for Resource URIs and Value URIs.

Note also that Property URIs can only be represented as QNames (so there are some Property URIs which can not be represented in DC-XML).

#### Resolution

See general discussion of using XML QNames as abbreviations for URIs.

* * *

### Issue 2: Use of XML entity references (1)

Ann Apps, 2006-06-12 1

#### Comment

The example illustrating the use of XML entity references to abbreviate URIs is confusing to a human reader.

#### Response

The use of XML entity references is part of the XML standard. Examples of their use were included to illustrate that there are mechanisms other than the QName-URI mapping that can be used to abbreviate URIs in XML content.

#### Resolution

No action required.

* * *

### Issue 3: Use of XML entity references (2)

Ann Apps, 2006-06-12 1

#### Comment

The use of XML entity references (where the entity declarations are in the internal subset) may not be acceptable to an XML Schema processor and/or the presence of a DOCTYPE declaration may imply a requirement for DTD validation.

#### Response

An XML processor must read the internal subset and use (some of) the declarations in it.

Also the presence of a DOCTYPE declaration is not a signal for DTD validation.

See

[http://www.xml.com/axml/notes/DoctypeMeans.html](http://www.xml.com/axml/notes/DoctypeMeans.html)

and

[http://marc2.theaimsgroup.com/?l=xerces-j-dev&m=111643969503776](http://marc2.theaimsgroup.com/?l=xerces-j-dev&m=111643969503776)

The XSV XML Schema processor correctly uses the entity declarations in the internal subset.

#### Resolution

No action required.

* * *

### Issue 4: Redundant duplicate example

Ann Apps, 2006-06-12 1

#### Comment

The content of example 7 and example 8 is the same. One could be removed.

#### Response

Example 7 is annotated to highlight particular constructs, but there is no need to duplicate the example.

#### Resolution

Remove one example and amend references in text accordingly.

* * *

### Issue 5: Separate attributes for URIs and QNames-representing-URIs

Ann Apps, 2006-06-12 1

Thomas Fischer, 2006-07-13 8

#### Comment

Are separate attributes required for URIs and QNames-representing-URIs?

#### Response

If DC-XML is to support both URIs in full and QNames-as-abbreviations of URIs, an application has to know the datatype of the text in order to process it correctly.

An attribute value "name" may be interpreted as

- a relative URI (to be resolved relative to the base URI of the document)

- an XML QName (mapped to an expanded name using the namespace declaration for the default name space - and from that to a URI if the DC-XML format specified that the mapping applied for that

attribute value)

In the attribute value "ppp:nnnn", the string "ppp" may be interpreted as

- a URI scheme prefix

- an XML Namespace Prefix

In the attribute value " [news:comp.infosystems.www.servers.unix](news:comp.infosystems.www.servers.unix)", the string "news" may be interpreted as

- a URI scheme prefix

- an XML Namespace Prefix

#### Resolution

No action required, though may be helpful to include examples of relative URIs and unprefixed QNames to emphasise point.

See general discussion of using XML QNames as abbreviations for URIs.

* * *

### Issue 6: Multiple statements v multiple value strings

Ann Apps, 2006-06-12 1

#### Comment

What is the difference between:

- using a single statement referencing the dc:title property and using multiple value strings

- using multiple statements referencing the dc:title property each using a single value string

#### Response

There are two different scenarios, depending on whether the value is

- a "natural language object", which can be represented by multiple value strings

- a literal

Whether both options are available for a property depends on the range of the property. If the range of dc:title is (rdfs:)Literal, then the first form would not be appropriate; if the range of dc:title is the class of "natural language objects", then it would be.

The Usage Board is working on clarifying the ranges of the DCMI properties; their decisions will be accompanied by guidance documentation.

#### Resolution

Add note indicating that example of dc:title with multiple value strings reflects an assumption that that is consistent with the range of the property.

* * *

### Issue 7: Multiple Value URIs

Thomas Fischer, 2006-07-13 8

#### Comment

How does DC-XML support the provision of multiple value URIs in a statement?

#### Response

The DCAM specifies that a statement can contain at most one value URI, and DC-XML reflects this.

#### Resolution

No action required.

* * *

### Issue 8: Rich Representations (1)

Ann Apps, 2006-06-12 1

#### Comment

Do rich representations include instances of non-XML text markup? Is a LaTeX text a rich representation or a value string? If the former then DC-XML does not accommodate it.

#### Response

In part, this requires clarification in the a DCAM to specify what constitutes a rich representation and what constitutes a value string. But it seems probable that the intent is that a LaTeX text should be treated as a rich representation.

If so, there remains the quesion of whether it is a requirement for DC-XML to support that (sub)class of rich representation.

#### Resolution

(To be decided)

* * *

### Issue 9: Rich Representations (2)

Thomas Fischer, 2006-07-13 8

#### Comment

How is the MIME type for a rich representation encoded?

#### Response

DC-XML does not support the provision of a MIME type for rich representations, because this is not currently specified by the DCAM. However this has been raised as a possible omission from the DCAM.

#### Resolution

This is a DCAM issue. If the DCAM is amended to support MIME types for rich representations, then DC-XML will be amemded accordingly.

* * *

### Issue 10: Name of descriptionRef attribute

Ann Apps, 2006-06-12 1

#### Comment

Would it be better to name the attribute descriptionIdRef, rather than descriptionRef (cf ID and IDREF datatypes)?

#### Response

#### Resolution

(To be decided)

* * *

### Issue 11: URI used for XML Namespace Name (1)

Tom Baker, 2006-06-15 2

#### Comment

If the URI [http://purl.org/dc/xml/](http://purl.org/dc/xml/) is being used purely as an XML Namespace Name and not as a "base URI" for a set of term URIs used in an RDF vocabulary, then it may be preferable to use a different form of URI, to avoid any potential for confusion on the part of human readers.

#### Response

The URI is an XML Namespace Name and there is no intent to suggest that there is a corresponding set of URIs with this URI as root. A different URI could be used.

#### Resolution

Use a [http://dublincore.org/](http://dublincore.org/)... URI as an XML Namespace Name

* * *

### Issue 12: URI used for XML Namespace Name (2)

Pete Johnston, 2006-06-15 3 4

#### Comment

Should the XML Namespace Name be "versioned"?

#### Response

It is quite possible that the XML format will evolve. If a change is backwards compatible (e.g. a new optional XML attribute), then there is probably no need to change the XML Namespace Name, but backwards incompatible changes probably should result in a change.

Implementers should always explicitly select the version they are using, so that backwards-imcompatible changes at the "namespace document" aren't introduced unexpectedly.

#### Resolution

Use a "date-stamped" [http://dublincore.org/](http://dublincore.org/)... URI as an XML Namespace Name

* * *

### Issue 13: Use of enumerated lists of in dcmitype.xsd

Stefan Farrenkopf, 2006-06-06 6

#### Comment

How to make use of the enumerations in dcmitype.xsd?

#### Response

The enumerations were part of earlier experimentation and are of limited usefulness for validation of attribute values given the current format and schema design, though see section 3.4.1 of [<img src="DCXMLRevision_2fComments_files/moin-inter.png" alt="[Self]" height="16" width="16">DC-XML and W3C XML Schema](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLSchema "Self") for an example of use with the Value String Element.

#### Resolution

Remove QName and URI enumerations for dcmitype.xsd?

See also general discussion of using XML QNames as abbreviations for URIs.

* * *

### Issue 14: XML Elements v XML Attributes

Thomas Fischer, 2006-07-13 8

#### Comment

In general in XML, attributes are used to provide data which is used to interpret or understand the content of the XML element. Is it appropriate to use XML attributes for value URIs and vocabulary encoding scheme URIs?

#### Response

In the context of "document-oriented" XML markup languages, there is sometimes a convention of using attributes for data which is considered to be "not part of the document content", particularly where the language is used as a markup language in the sense of "annotating" a pre-existing text.

However XML itself makes no distinction between the "semantics" of attributes and elements. Essentially wherever a format designer chose to use an XML attribute, an XML child element could have been used. The reverse is not true, because attributes of the same name can not be repeated on a single XML element and because there is no ordering of XML attributes - and obviously attribute values are "atomic" and if the child element itself has child elements that "sub-tree" structure can't be captured in a single attribute value.

So in DC-XML, the choices between using XML elements and XML attributes have been based only on the constraints on the structure of a DC description set specified by the DCAM. Where a sub-component occurs zero or one times (e.g. value URI or vocabulary encoding scheme URI in statement, syntax encoding scheme or language tag on value string), then an XML attribute has been used; where a sub-component is repeated (e.g. value string or rich representation within statement) then a child XML element has been used.

But the former set of components could equally well have been represented using child XML elements. It is largely a stylistic decision (though the features of schema languagers and query languages may also be a consideration.)

#### Resolution

No action required.

* * *

### Issue 15: GRDDL/XSLT

Dan Brickley, 2006-06-01 5

#### Comment

Can we set up namespace document with pointer to GRDDL transform?

#### Response

A nameaspace document with a suitable link to a transform will be set up when the DC-XML format is finalised, the DC-RDF mapping is finalised, the XML Namespace Name is confirmed, and the XSLT transform is complete.

#### Resolution

Finalise XSLT. Extended version(s) of transform for current DC-XML are now available for XSLT/XPath 1.0 and XSLT/XPath 2.0.

[http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLXSLT/2006-06-01](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLXSLT/2006-06-01)

Extended set of example instances at

[http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLInstances/2006-06-01](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLInstances/2006-06-01)

* * *

<a id="QNames"></a>

### Issue 16: XML QNames in content

Pete Johnston, 2006-06-14 7, referencing comments by Ian Davis on use of QNames in RDF/A

#### Comment

The Namespaces in XML specification describes the use of QNames as names of XML elements and XML attributes. It does not cover the use of XML QNames as XML element content or XML attribute values.

A "non-datatype-aware" XML processor (e.g. an XSLT transform) might handle XML Namespaces in such a way that the interpretation of QNames in XML attribute values or XML element content is not guaranteed to be preserved, and so the use of XML QNames in these contexts is probably best avoided.

#### Response

There are three possibilities

1. 

drop the URI abbreviation mechanism, and always represent URIs in full (bearing in mind that the use of XML entity references is always available

2. 

continue to support the use of XML QNames to represent URIs, but ensure that all uses are for the names of XML elements or XML attributes

3. 

introduce a namespace/qualified name mechanism for which the semantics is specified by the DC-XML format itself

#### Resolution

Suggest revising DC-XML to adopt the third approach and drop any use of XML QNames in XML element content and XML attribute values. See

[http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-07-04](http://dublincore.org/architecturewiki/DCXMLRevision/DCXMLGuidelines/2006-07-04)

Note that this also considerably simplifies the use of XML Schema for the format, though it also means that applications requiring extended validation of DC-XML content will require mechanisms other than XML Schema to accomplish that (e.g. XSLT, Schematron etc)

* * *

### Issue 17: Proposed changes to DCAM

#### Comment

The DC Architecture WG is discussing some changes to the DCAM, two of which would affect DC-XML

- separation of notion of VES from notion of Value Type

- change to definition of Value String, so that Value String can have Language Tag or SES, but not both

#### Response

DC-XML is based on DCAM so would need to be amended/extended to reflect DCAM changes (and also to ensure that examples reflect DCMI's intended use of URIs, e.g. for VES v Value Types).

#### Resolution

(If DCAM changes approved) add new attribute for Value Type; amend Value String description. Amend examples. Amend schemas. Amend XSLT.

* * *

<a id="1"></a>**[1]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=3254](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=3254)

<a id="2"></a>**[2]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4300](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4300)

<a id="3"></a>**[3]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4427](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4427)

<a id="4"></a>**[4]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4703](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=4703)

<a id="5"></a>**[5]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=252](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=252)

<a id="6"></a>**[6]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=622](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=622)

<a id="7"></a>**[7]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=3878](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&P=3878)

<a id="8"></a>**[8]** [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0607&L=dc-architecture&P=303](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0607&L=dc-architecture&P=303)

 [RefreshCache](http://dublincore.org/architecturewiki/DCXMLRevision_2fComments?action=refresh&arena=Page.py&key=DCXMLRevision_2fComments.text_html) for this page (cached 2012-12-21 18:20:38)  

Immutable page (last edited 2006-07-18 13:28:20 by [PeteJohnston](http://dublincore.org/architecturewiki/PeteJohnston))


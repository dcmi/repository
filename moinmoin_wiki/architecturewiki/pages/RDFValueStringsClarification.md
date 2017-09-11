---
title: "- RDFValueStringsClarification"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/RDFValueStringsClarification.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [RDFValueStringsClarification](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=fullsearch&value=RDFValueStringsClarification&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/RDFValueStringsClarification "View")
- [Diffs](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/RDFValueStringsClarification">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="RDFValueStringsClarification_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="RDFValueStringsClarification_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

***Note: The following text is retained here for historical purposes only. No further editing takes place here.*** 
* * *

## Clarification of the recommendations for encoding 'value strings' in DC RDF/XML

This document is currently under development. It is being worked on by the [<img src="RDFValueStringsClarification_files/moin-inter.png" alt="[Self]" height="16" width="16">DCRDFTaskforce](http://dublincore.org/architecturewiki/DCRDFTaskforce "Self"). Comments should be sent to the [<img src="RDFValueStringsClarification_files/moin-www.png" alt="[WWW]" height="11" width="11">dc-rdf-taskforce@jiscmail.ac.uk](http://www.jiscmail.ac.uk/lists/DC-RDF-TASKFORCE.html) mailing list.

### Introduction

DCMI has two documents concerning the use of Dublin Core metadata in RDF/XML. The first, [<img src="RDFValueStringsClarification_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Simple Dublin Core in RDF/XML](http://dublincore.org/documents/dcmes-xml/) is a 'recommendation' and describes how to encode simple DC in RDF/XML. The second, [<img src="RDFValueStringsClarification_files/moin-www.png" alt="[WWW]" height="11" width="11">Expressing Qualified Dublin Core in RDF/XML](http://dublincore.org/documents/dcq-rdf-xml/) is a 'proposed recommendation' and describes how to encode qualified DC in RDF/XML.

More recently, the DC Architecture WG has developed the [<img src="RDFValueStringsClarification_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/abstract-model/) which provides a reference model against which particular [<img src="RDFValueStringsClarification_files/moin-www.png" alt="[WWW]" height="11" width="11">DC encoding guidelines](http://dublincore.org/resources/expressions/) can be compared.

The Abstract Model defines a terminology that includes the following terms (the definitions are repeated here for clarity):

<dl>

    <dt> resource</dt>
<dd>
<p>
A resource is anything that has identity. Familiar examples include an 
electronic document, an image, a service (e.g., "today's weather report 
for Los Angeles"), and a collection of other resources. Not all 
resources are network "retrievable"; e.g., human beings, corporations, 
concepts and bound books in a library can also be considered resources. 
</p>
</dd>
    <dt> resource URI</dt>
<dd>
<p>
A resource URI is a URI that identifies a single resource. 
</p>
</dd>
    <dt> property</dt>
<dd>
<p>
A property is a specific aspect, characteristic, attribute, or relation used to describe resources. 
</p>
</dd>
    <dt> property URI</dt>
<dd>
<p>
A property URI is a URI that identifies a single property.  
</p>
</dd>
    <dt> value</dt>
<dd>
<p>
A value is the physical or conceptual entity that is associated with a property when it is used to describe a resource.  
</p>
</dd>
    <dt> value URI</dt>
<dd>
<p>
A value URI is a URI that identifies the value of a property. 
</p>
</dd>
    <dt> value string</dt>
<dd>
<p>
A value string is a simple string that represents the value of a property.  
</p>
</dd>

    </dl>


One issue with the two DCMI documents for encoding DC in RDF/XML is that they each recommend a different mechanism for encoding the value string that represents the value of a property. In the simple DC recommendation, a construct represented by the RDF graph in figure 1 is used. This construct uses a literal string as the value of the property. In the qualified DC proposed recommendation, a construct represented by the RDF graph in figure 2 is used. This construct represents the value of the property as an intermediate (often blank) node, allowing further properties to be used to describe the value resource, including a simple value string (using rdfs:label).

<table>
  <tbody>
    <tr>
      <td align="center">
        <img src="RDFValueStringsClarification_files/RDFValueStringsClarification_002.gif" alt="figure1.gif"> </td>
      <td align="center">
        <img src="RDFValueStringsClarification_files/RDFValueStringsClarification.gif" alt="figure2.gif"> </td>
    </tr>
    <tr>
      <td align="center">
        Figure 1 </td>
      <td align="center">
        Figure 2 </td>
    </tr>
  </tbody>
</table>


### Clarification

The graphs in figures 1 and 2 say different things, both in terms of the RDF Model and in terms of the DCMI Abstract Model (DCAM).

In terms of the RDF Model, figure 1 says:

<pre>_:resource a:property "value string" .
</pre>

i.e. some resource has a relationship of type indicated by the property <tt>a:property</tt> with the literal <tt>"value string"</tt>.

In RDF, a literal is a resource: it's an instance of the class called =rdfs:Literal=. Furthermore, <tt>rdfs:Literal</tt> is a subclass of <tt>rdfs:Resource</tt>. (Note: this is also true of the DCAM - in the DCAM, literals are resources.) <tt>rdfs:Literal</tt> is a class; therefore <tt>rdfs:Literal</tt> is a vocabulary encoding scheme (or can be used as a vocabulary encoding scheme).

So in terms of the DCAM, figure 1 might be represented as

<pre>Description:
  Statement:
    Property URI: a:property
    Value String: "value string"
    Vocabulary Encoding Scheme URI: rdfs:Literal
</pre>

In terms of the RDF Model, figure 2 says:

<pre>_:resource a:property _:x .
_:x rdfs:label "value string" .
</pre>

i.e. some resource has a relationship of type indicated by the property <tt>a:property</tt> with a second resource and that second resource has an <tt>rdfs:label</tt> relationship with the literal <tt>"value string"</tt>.

Assuming that the <tt>rdfs:label</tt> relationship maps to "is represented by value string" in the DCAM, then this maps to

<pre>Description:
  Statement:
    Property URI: a:property
    Value String: "value string"
</pre>

in terms of the DCAM.

Note the difference from figure 1: the figure 1 example had a vocabulary encoding scheme URI of <tt>rdfs:Literal</tt> - the figure 2 example doesn't.

Of course, if the <tt>_:x</tt> object node is typed in the figure 2 example then the corresponding DCAM representation gets a vocabulary encoding scheme. For example:

<pre>_:resource a:property _:x .
_:x rdfs:label "value string" .
_:x a foaf:Person .
</pre>

maps to:

<pre>Description:
  Statement:
    Property URI: a:property
    Value String: "value string"
    Vocabulary Encoding Scheme URI: foaf:Person
</pre>

in terms of the DCAM.

Note that DCMI properties are not being treated in a special way here: this works for any RDF property <tt>a:property</tt>, and the DCAM representation is completely consistent with the RDF representation: figure 1 says the value is a resource of type <tt>rdfs:Literal</tt>; figure 2 says the value is an untyped resource.

### Conclusion

This document shows that the two different constructs used in the current DCMI recommendation and draft recommendation for encoding simple and qualified DC in RDF/XML are consistent with the DCMI Abstract Model but that they make different assertions.

_What are DC-aware applications allowed to do in terms of transforming graphs between these two forms? Can they transform in both directions, in one direction or in neither direction?_

 [RefreshCache](http://dublincore.org/architecturewiki/RDFValueStringsClarification?action=refresh&arena=Page.py&key=RDFValueStringsClarification.text_html) for this page (cached 2012-12-21 19:48:30)  

Immutable page (last edited 2006-05-24 10:57:55 by MikaelNilsson)


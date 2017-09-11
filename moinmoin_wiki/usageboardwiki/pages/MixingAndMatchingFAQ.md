---
title: "- MixingAndMatchingFAQ"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/MixingAndMatchingFAQ.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [MixingAndMatchingFAQ](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=fullsearch&value=MixingAndMatchingFAQ&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ "View")
- [Diffs](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/MixingAndMatchingFAQ">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="MixingAndMatchingFAQ_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="MixingAndMatchingFAQ_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## DCMI Mixing and Matching FAQ

**Andy Powell, Eduserv Foundation**

This document attempts to answer some of the practical questions that implementors ask when faced with a desire to incorporate their existing XML metadata semantics into DCMI metadata applications.

**Question 1: My favorite XML schema contains an element type or attribute (e.g. my:price or my:currency) that I want to use in my Dublin Core metadata. How do I do it?**

The bad news is that an existing XML element type or attribute **cannot** be used as is in DCMI metadata applications. This is a very important point, but is sometimes hard for people to understand. Before you can use your favorite element or attribute you must declare it as a DCMI-compatible term. The good news is that doing so need not be an overly onerous task. Here's what you have to do:

1. 

Decide whether your XML element type or attribute corresponds to DCMI's notion of a 'property' or an 'encoding scheme'. These notions are defined in the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/abstract-model/) but, for convenience, the definitions are repeated here:

- _A property is a specific aspect, characteristic, attribute, or relation used to describe resources._

- _A syntax encoding scheme indicates that the value string is formatted in accordance with a formal notation, such as "2000-01-01" as the standard expression of a date._

- _A vocabulary encoding scheme is a class that indicates that the value of a property is taken from a controlled vocabulary (or concept-space), such as the Library of Congress Subject Headings._

- Next, check whether an equivalent property or encoding scheme has already been defined by the DCMI (or elsewhere), for use in DCMI metadata. A good place to start checking is the list of [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Metadata Terms](http://dublincore.org/documents/dcmi-terms/).

- Next, assign a URI to your new property or encoding scheme - see question 3 below.

- Finally, declare your new property or encoding scheme using the RDF Schema language (RDFS) and make this declaration available on the Web - see questions 4 and 5 below.

**Question 2: Why can't I just re-use my XML element type or attribute as is?**

Because XML element types and XML attributes are component parts of an XML language. Their meaning is determined solely by their placement in the XML tree structure of the given XML language and the semantics that the developers of that language chose to associate with that structure. On the other hand, DCMI properties and encoding schemes are conceptual entities within the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI Abstract Model](http://dublincore.org/documents/abstract-model/) - their meanings are defined by the model and by the semantic declarations that DCMI make available. Furthermore, XML element types and attributes are named using XML _expanded names_ (a pair comprising an _XML Namespace Name_ (which is a URI) and a _local name_). On the other hand, DCMI properties and encoding schemes are named using URIs.

So, although XML element types and DCMI properties may look superficially similar, for example <tt>lom:title</tt> looks similar to <tt>dc:title</tt> when the two are encoded in XML, in fact they are very different entities. For those who are interested, the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">XML, RDF and DCAPs](http://www.ukoln.ac.uk/metadata/dcmi/dc-elem-prop/) document provides a much more in-depth treatment of the differences between XML element types and RDF properties and the usage of both in the context of DCMI metadata.

**Question 3: How do I assign a URI to my 'element'?**

Unfortunately, there is little best-practice in this area to draw on at the time of writing. The [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for assigning identifiers to metadata terms](http://www.ukoln.ac.uk/metadata/dcmi/term-identifier-guidelines/) document lists some possible approaches.

One immediate issue to consider is whether to make the URI that is assigned to the new property or encoding scheme similar to the XML expanded name of the XML element or attribute. DCMI has chosen to keep the two things very similar. For example, the XML expanded name that is used to represent the DC Title property according to the Guidelines for encoding DC in XML recommendation is <tt>dc:title</tt> (correspoinding to the <tt>http://purl.org/dc/elements/1.1/</tt> XML namespace name and the <tt>title</tt> local name). The DC Title property is assigned the <tt>http://purl.org/dc/elements/1.1/title</tt> URI. Therefore, the property URI is simply a concatenation of the component parts of the XML expanded name.

On the other hand, the RDF encoding of the IEEE LOM (which has effectively made the LOM available for use with DCMI metadata because the DCMI Abstract Model is essentially the same as the RDF model) has chosen to keep the XML expanded names used in the LOM/XML encoding and the URIs assigned to the LOM/RDF properties completely separate. _Example to be provided_

Remember that your new property is likely to appear in the various DCMI encoding syntaxes using the name that is the final part of the URI you assign (usually the bit after the final '/' or '#'). For example, the URI <tt>http://example.com/my/terms#color</tt> is likely to appear as <tt>my:color</tt> (in XML syntaxes) or <tt>MY.color</tt> (in HTML syntaxes).

Finally, it is worth remembering that Semantic Web applications will rely to some extent on being able to obtain information about your new metadata term, and in particular about its relationships to other terms (see questions 4 and 5 below). URI schemes that do not have widely understood dereferencing mechanisms should therefore be used with caution. For example, "info" URIs cannot be resolved by the majority of currently deployed Internet technology (i.e. by using a simple HTTP GET request). Indeed, "info" URIs are designed to be non-dereferencable - i.e. it is not possible to dereference an "info" URI in order to retrieve a representation of the identified resource. Unfortunately, this has serious consequences on their utility for identifiying metadata terms. If it is not possible to easily obtain a representation of the identified term (typically some metadata about the term), then it is not possible to obtain any information about the relationships between the identified term and other terms. In the context of the Semantic Web, this means that the use of "info" URIs may prevent software applications from reasoning automatically about your term based on knowledge about the relationships between it and other metadata terms.

If in doubt, register with the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">PURL](http://purl.org/) system and assign a PURL to your new property or encoding scheme.

**Question 4: How do I declare my XML element type or attribute as a DCMI property?**

Use the RDF Schema language to do this. Take a look at the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI RDFS terms declarations](http://purl.org/dc/terms/) for inspiration! As a minimum, you'll need something like this:

<pre> &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 &lt;!DOCTYPE rdf:RDF&gt;
 &lt;rdf:RDF
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:dcterms="http://purl.org/dc/terms/"
   xmlns:dc="http://purl.org/dc/elements/1.1/"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"&gt;
 
   &lt;rdf:Property rdf:about="http://purl.org/my/terms/price"&gt;
     &lt;rdfs:label xml:lang="en-US"&gt;Price&lt;/rdfs:label&gt;
     &lt;rdfs:comment xml:lang="en-US"&gt;The amount of money needed to purchase the resource.&lt;/rdfs:comment&gt;
     &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/my/terms/"/&gt;
     &lt;dcterms:issued&gt;2004-12-03&lt;/dcterms:issued&gt;
     &lt;dcterms:modified&gt;2005-02-21&lt;/dcterms:modified&gt;
     &lt;dc:type rdf:resource="http://dublincore.org/usage/documents/principles/#element"/&gt;
   &lt;/rdf:Property&gt;
 &lt;/rdf:RDF&gt;
</pre>

Make sure that this RDF/XML document is available (in this case) at both <tt>http://purl.org/dc/terms/</tt> and <tt>http://purl.org/my/terms/price</tt>.

**Question 5: How do I declare my XML element type or attribute as a DCMI encoding scheme?**

Use the RDF Schema language to do this. Take a look at the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">DCMI RDFS terms declarations](http://purl.org/dc/terms/) for inspiration! As a minimum, you'll need something like this:

<pre> &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 &lt;!DOCTYPE rdf:RDF&gt;
 &lt;rdf:RDF
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:dcterms="http://purl.org/dc/terms/"
   xmlns:dc="http://purl.org/dc/elements/1.1/"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"&gt;
 
   &lt;rdfs:Class rdf:about="http://purl.org/my/terms/PoundsSterling"&gt;
     &lt;rdfs:label xml:lang="en-US"&gt;Pounds Sterling&lt;/rdfs:label&gt;
     &lt;rdfs:comment xml:lang="en-US"&gt;A price in UK pounds sterling, formatted in the following way: "P.pp"
     (where "P" representents one or more digits for the number of pounds and "pp" represents
     two digits for the number of pence).&lt;/rdfs:comment&gt;
     &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/my/terms/"/&gt;
     &lt;dcterms:issued&gt;2003-07-11&lt;/dcterms:issued&gt;
     &lt;dcterms:modified&gt;2004-06-15&lt;/dcterms:modified&gt;
     &lt;dc:type rdf:resource="http://dublincore.org/usage/documents/principles/#encoding-scheme"/&gt;
   &lt;/rdfs:Class&gt;
 &lt;/rdf:RDF&gt;
</pre>

The examples used in questions 4 and 5 would allow the following XML fragment to be used in a DC/XML document that conforms to the [<img src="MixingAndMatchingFAQ_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for implementing Dublin Core in XML](http://dublincore.org/documents/dc-xml-guidelines/) recommendation:

<pre> &lt;my:price xsi:type="my:PoundsSterling"&gt;2.99&lt;/my:price&gt;
</pre>

assuming that the appropriate namespace declarations are in place. Note that, by convention, the XML _local name_ for an encoding scheme starts with an uppercase letter.

**Question 6: I still don't understand! Do you have another example?**

OK. Let's say that I want to start using DC metadata to describe car parts, and that my company (ZZ Motors) already uses an XML schema that allows for XML fragments like this:

<pre> &lt;zz:carpart&gt;
   &lt;zz:engine&gt;
     &lt;zz:type&gt;petrol&lt;/zz:type&gt;
     &lt;zz:capacity&gt;2000cc&lt;/zz:capacity&gt;
   &lt;/zz:engine&gt;
   &lt;zz:fueltank&gt;
     &lt;zz:capacity&gt;25l&lt;/zz:capacity&gt;
   &lt;/zz:fueltank&gt;
 &lt;zz:carpart&gt;
</pre>

'zz' being associated with the <tt>http://zz.com/carparts/</tt> XML namespace name.

For the sake of argument, let's say that I want to start using a property in my DC metadata that indicates the engine capacity. Looking at my existing XML schema, I note that I already have an XML element type with the local name <tt>capacity</tt> (under <tt>zz:engine</tt>) that I might be able to use? But there's a problem! I also have an XML element type with the local name <tt>capacity</tt> elsewhere in my XML tree structure (under <tt>zz:fueltank</tt>). So I cannot simply use 'capacity' as the local name when I'm thinking about assigning a URI reference to my new property.

The semantics of my current XML element types called <tt>capacity</tt> are determined by the placement of those two element types in the XML tree. In fact I have two 'properties', which we'll call <tt>engineCapacity</tt> and <tt>fueltankCapacity</tt>. I'm interested in the first of these.

OK, so now I need to assign a URI to my new property called <tt>engineCapacity</tt>. I want this property to be widely used (because it'll make my supply chains work more smoothly if everyone else uses the same property) so I decide to name my new property using a PURL, rather than a URI somewhere under my company's DNS domain name. I choose:

<pre> http://purl.org/carparts/terms/engineCapacity
</pre>

Now I need to declare my new property using RDFS. I create a file on my company's Web site that contains the following:

<pre> &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 &lt;!DOCTYPE rdf:RDF&gt;
 &lt;rdf:RDF
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:dcterms="http://purl.org/dc/terms/"
   xmlns:dc="http://purl.org/dc/elements/1.1/"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"&gt;
 
   &lt;rdf:Property rdf:about="http://purl.org/carparts/terms/engineCapacity"&gt;
     &lt;rdfs:label xml:lang="en-US"&gt;Engine Capacity&lt;/rdfs:label&gt;
     &lt;rdfs:comment xml:lang="en-US"&gt;The total combustion chamber size of an engine in cubic centimetres.&lt;/rdfs:comment&gt;
     &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/my/terms/"/&gt;
     &lt;dcterms:issued&gt;2005-02-21&lt;/dcterms:issued&gt;
     &lt;dcterms:modified&gt;2005-02-21&lt;/dcterms:modified&gt;
     &lt;dc:type rdf:resource="http://dublincore.org/usage/documents/principles/#element"/&gt;
   &lt;/rdf:Property&gt;
 &lt;/rdf:RDF&gt;
</pre>

Finally, I register two PURLs, <tt>http://purl.org/carparts/terms/</tt> and <tt>http://purl.org/carparts/terms/engineCapacity</tt>, and configure them both so that they resolve to the RDF/XML document (above) on my Web server.

 [RefreshCache](http://dublincore.org/usageboardwiki/MixingAndMatchingFAQ?action=refresh&arena=Page.py&key=MixingAndMatchingFAQ.text_html) for this page (cached 2012-12-09 11:49:22)  

Immutable page (last edited 2006-04-26 11:38:49 by AndyPowell)


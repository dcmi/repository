---
title: "- ExamplesOfAccessibilityTermUsage"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/ExamplesOfAccessibilityTermUsage.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ExamplesOfAccessibilityTermUsage](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=fullsearch&value=ExamplesOfAccessibilityTermUsage&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage "View")
- [Diffs](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/ExamplesOfAccessibilityTermUsage">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ExamplesOfAccessibilityTermUsage_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ExamplesOfAccessibilityTermUsage_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## The term proposed for inclusion as a new Dublin Core term is DC Adaptability

## Examples of How to Use the DC:Adaptability Term

**Subject** : DC.Adapability

**Label** : Adaptability

**Element Description** : "A statement describing characteristics of the resource that affect how it can be perceived, understood or interacted with by users."

**Comment** : “An Adaptability description might be used to match a (digital or physical) resource to a description of user or user agent needs and preferences.”

The content of Adaptability is a structured value using the Dublin Core Structured Values (DCSV) scheme.

## Guidelines for Content Creation

### In HTML

If the resource is composed of multiple mixed adaptability features then multiple or repeated Adaptability elements should be used to describe the main components.

#### Examples

**Using free text:**

 <head> 
 <meta name="DC.description" content="HTML file with embedded video" /> 

<meta name="DC.adaptability" content="this resource has visual content" />

 </head> 

**Using controlled vocabulary:**

 <head> 
 <meta name="DC.description" content="HTML file with video" /> 

<meta name="DC.adaptability" scheme="IMS- [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll)" content="has modality; type=visual" />

 </head> 

**Using a pointer to an EARL statement:**

 <head> 
 <link rel="DC.adaptability controlFlexibility" href=" [http://www.example.org/flex.rdf](http://www.example.org/flex.rdf)" /> </head> 

**Other values taken from the controlled vocabulary that might be used:**

- Adaptability="has modality; type=audio"

- Adaptability ="has modality; type=visual"

- Adaptability ="sign language; lang=French-LSF"

- Adaptability ="caption track; lang=en; type=verbatim; rate=180 WPM"

- Adaptability ="audio description; type=standard"

- Adaptability ="alternative text; lang=de"

- Adaptability ="graphic alternative; lang=bliss"

- Adaptability ="color avoidance; colors=red,green"

**Note:** The simplest example recommended is a statement of the type “has modality; type=visual”.

This description will alert any application looking for standard format information to the need to investigate further the ways in which this resource can be presented to a user who requests it but at the time cannot use visual sensory perception.

Another free text example is “This resource may not be accessible if a user does not have auditory capabilities at the time but the publishers will supply captions and a transcript upon request to [help@publisher.com.](mailto:help@publisher.com.)”

Such an example contains some information that can be useful but, in general, it will not be useful for triggering machine actions such as the seeking of other equivalent resources. Controlled vocabularies are recommended to facilitate interoperability and machine-readability.

## Primary and Equivalent Relationships

In the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) information model, there is the concept of 'primary' and 'equivalent' resources. The primary resource is the original resource. It can contain a set of components from which a composition of the resource to be delivered is assembled. These components provide alternative access modalities and have their own adaptability properties. An equivalent resource is another resource used to provide a user with a version of the original resource they can use either by being substituted for the original resource or a component of it (alternative) or by augmenting the original resource or a component of it (supplementary).

Continuing with the DCSV format.

### Examples:
In the description of the primary resource where there is a known equivalent available: 
 Adaptability ="primary; equivalentResource= [http://www.example.org/equiv.txt](http://www.example.org/equiv.txt)" 

In the description of the equivalent resource:

 Adaptability ="equivalent; type=supplementary; primaryResource= [http://www.example.org/image.foo](http://www.example.org/image.foo)" 
## Using DC expressed in XML:
<?xml version="1.0"?> 

<metadata xmlns=" [http://example.org/myapp/](http://example.org/myapp/)"

 xmlns:xsi=" [http://www.w3.org/2001/XMLSchema-instance](http://www.w3.org/2001/XMLSchema-instance)" xsi:schemaLocation=" [http://example.org/myapp/](http://example.org/myapp/) [http://example.org/myapp/schema.xsd](http://example.org/myapp/schema.xsd)" xmlns:dc=" [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)" xmlns:dcterms=" [http://purl.org/dc/terms/">](http://purl.org/dc/terms/%22%3E)
 <dc:title>dc:adaptability Example</dc:title> <dc:description>Equivalent movie with captions </dc:description> 

<dc:adaptability xsi:type="dcterms:IMS- [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll)">

 caption track; lang=en; type=verbatim; rate=180 WPM </dc:adaptability > 

<dc:adaptability xsi:type="dcterms:IMS- [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll)">

 equivalent; primaryResource= [http://www.example.org/prim.mpg](http://www.example.org/prim.mpg) </dc:adaptability > 

</metadata>

## XML with a pointer to an EARL statement:
<?xml version="1.0"?> 

<metadata xmlns=" [http://example.org/myapp/](http://example.org/myapp/)"

 xmlns:dc=" [http://purl.org/dc/elements/1.1/">](http://purl.org/dc/elements/1.1/%22%3E)
 <dc:adaptability > 
 displayTransformability; scheme=IMS- [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll); location= [http://example.org/something.rdf](http://example.org/something.rdf) </dc.adaptability > 

</metadata>

### Specification conformance
DC Adaptability is not about conformance to an 'accessibility standard' (that would be a DC relation element value) but there are specifications that relate to aspects of what is relevant to DC Adaptability. In the case where there is a document that provides machine-readable information about conformance of a resource to such a specification, some or all of that machine-readable information may be of interest, as will be the case where the specifications are the W3C WCAG specifications. 
## DC metadata in RDF

#### Some IMS data included directly

<rdf:RDF xmlns:rdf=" [http://www.w3.org/1999/02/22-rdf-syntax-ns#](http://www.w3.org/1999/02/22-rdf-syntax-ns#)"

 xmlns:dc=" [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)" xmlns:dcterms=" [http://purl.org/dc/terms/](http://purl.org/dc/terms/)" xmlns:I=" [http://purl.org/dcterms/IMSAccessTerms/">](http://purl.org/dcterms/IMSAccessTerms/%22%3E)
 <rdf:Description> 
 <dc:adaptability > 
 <rdf:Description rdf:about="#desc1"> 
 <rdf:type rdf:resource=" [http://purl.org/dcterms/IMSAccessTerms/CaptionTrack](http://purl.org/dcterms/IMSAccessTerms/CaptionTrack)" /> <dc:language>en</dc:language> <I:captionType rdf:resource=" [http://purl.org/dcterms/IMSAccessTerms/Verbatim](http://purl.org/dcterms/IMSAccessTerms/Verbatim)" /> <I:speechrate rdf:datatype=" [http://purl.org/dcterms/IMSAccessTerms/WPM">180](http://purl.org/dcterms/IMSAccessTerms/WPM%22%3E180)</I:speechrate> </rdf:Description> </dc:adaptability > </rdf:Description> 

</rdf:RDF>

Note that this uses serious RDF, although it could be further simplified if there are formal Class/subClass definitions. (For example anything called type is likely to be a candidate for simplification using RDF Vocabulary Language.

#### RDF linking to an external resource

<rdf:RDF xmlns:rdf=" [http://www.w3.org/1999/02/22-rdf-syntax-ns#](http://www.w3.org/1999/02/22-rdf-syntax-ns#)"

 xmlns:dc=" [http://purl.org/dc/elements/1.1/">](http://purl.org/dc/elements/1.1/%22%3E)
 <rdf:Description> 
 <dc:adaptability rdf:resrouce=" [http://example.org/resultstore/someResult](http://example.org/resultstore/someResult)" /> </rdf:Description> 

</rdf:RDF>

### Text transformation
In the case where there is text, the ‘transformability’ of the text may be an issue. Determining this depends upon answering a series of questions about the text. There are already tools that automate the process. They are often used to determine conformance to accessibility specifications. These tools can produce EARL statements that contain information needed by machines to determine if they can do text transformation and how to do it. A pointer to such a statement would be used as the value for textTransformability of a resource or component. 

 [RefreshCache](http://dublincore.org/accessibilitywiki/ExamplesOfAccessibilityTermUsage?action=refresh&arena=Page.py&key=ExamplesOfAccessibilityTermUsage.text_html) for this page (cached 2013-01-03 04:51:49)  

Immutable page (last edited 2005-05-11 03:00:08 by i220-220-255-84)


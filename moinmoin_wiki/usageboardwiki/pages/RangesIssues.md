---
title: "- RangesIssues"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/RangesIssues.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [RangesIssues](http://dublincore.org/usageboardwiki/RangesIssues?action=fullsearch&value=RangesIssues&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/RangesIssues?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/RangesIssues "View")
- [Diffs](http://dublincore.org/usageboardwiki/RangesIssues?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/RangesIssues?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/RangesIssues?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/RangesIssues?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/RangesIssues?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/RangesIssues?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/RangesIssues?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/RangesIssues?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/RangesIssues?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/RangesIssues?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/RangesIssues?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/RangesIssues">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="RangesIssues_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="RangesIssues_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Issues Arising from Proposed Ranges for DCMI Properties 2007-07-02

This file: [http://dublincore.org/usageboardwiki/RangesIssues](http://dublincore.org/usageboardwiki/RangesIssues)

Refers to: _Domains and Ranges for DCMI Properties_ 2007-07-02  
 [http://dublincore.org/documents/2007/07/02/domain-range/](http://dublincore.org/documents/2007/07/02/domain-range/)

### Introduction

The recent revision of the DCMI Abstract Model [DCAM] added the RDF Schema concepts of domain and range to the DCAM Vocabulary Model.

The motivation for assigning domains and ranges to DCMI properties is to make accessible to applications (through machine-processable descriptions of those properties) more of the information which is available to humans through the existing human-readable descriptions of those properties [DCRDFNOTES]. So for example, if the human-readable definition conveys (to a human reader) that, whenever a property is referenced in a statement, the value is an agent, the creation of a corresponding range assertion for the property enables an application to infer that, whenever it encounters a statement referencing that property, the value is an instance of the class of agents.

In the initial draft proposal for domains and ranges for DCMI properties circulated in February 2007 [DOMRANG0207], suggestions were made for domains and ranges for all current DCMI properties. At this point, it was not considered critical to specify explicitly that the classes specified as ranges were classes of literals or classes of non-literals. And for some cases at least, the proposal was that for a single property, values might be either literals in some statements or non-literals in others.

During the public comment period on this draft proposal, a new question was raised, that of compatibility with OWL-DL [OWL-OVER]. It was highlighted that it is problematic to allow a single property to take either literal values or non-literal values. As a result, during their meeting in March 2007, the DCMI Usage Board tried to decide for each DCMI property whether it should take literal values or non-literal values. As part of this exercise, it was proposed to create a new class of "non-literal resources" and to use that class as the range of some DCMI properties.

However, subsequent discussion suggests that it is not clear that simply assigning a range to a property of a class called, say, dcterms: [NonLiteralResource](http://dublincore.org/usageboardwiki/NonLiteralResource) would satisfactorily address the problem:

- Using only the constructs of RDF Schema included in the DCAM Vocabulary Model, it is not possible to "say" in machine-processable form that the class dcterms: [NonLiteralResource](http://dublincore.org/usageboardwiki/NonLiteralResource) excludes literals; that would require some additional constructs provided by OWL.

- We need to be careful to distinguish between supporting inferencing (which is what rdfs:range provides) and checking for consistency (which requires some other mechanism, such as that which will be provided by the Description Set Profile work currently in progress [DC-DSP]

- Fully addressing the question of compatibility with OWL-DL will require the use of the property typing provided by OWL rather than simply the use of rdfs:range

In short, while the exercise of analysing the DCMI properties to decide whether they should be used with literal or non-literal values was a useful and indeed necessary one, it is not clear that seeking to reflect those conclusions through the use of rdfs:range is appropriate.

### Property: dcterms:title Proposed Range: rdfs:Literal

The proposal to assign a range for the property dcterms:title of the class rdfs:Literal means that when that property is referenced in a statement in a DC metadata description, the value is a literal, either plain or typed, and statements referencing this property should contain a literal value surrogate i.e. they should have the form (using the DC-Text syntax [DC-TEXT]):

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:title )
   LiteralValueString ( "Learning Biology" 
    Language ( "en" )
   )
  )
 )
)
</pre>

which, following the proposed guidelines for representing DC metadata descriptions using RDF [DC-RDF], would map to the single RDF triple:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

&lt;http://example.org/123&gt; dcterms:title "Learning Biology"@en .
</pre>

If a described resource is associated with other literals as titles, those literals form part of **separate** property-value pairs, and must be represented as **separate** statements in a DC metadata description.

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:title )
   LiteralValueString ( "Learning Biology" 
    Language ( "en" )
   )
  )
  Statement (
   PropertyURI ( dcterms:title )
   LiteralValueString ( "Aprender la Biologia" 
    Language ( "es" )
   )
  )
 )
)
</pre>

which would map to the two RDF triples:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

&lt;http://example.org/123&gt; dcterms:title "Learning Biology"@en ;
                         dcterms:title "Aprender la Biologia"@es ;
</pre>

No relationship between those two literal values is indicated.

This is the case even where the literals are distinct representations of the same title, as is common in cultures where parallel writing systems are used. For example, in Japanese, the same title represented using the Kana and Kanji representations would have to be represented as two statements:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:title )
   LiteralValueString ( "[Kanji character string]" )
  )
  Statement (
   PropertyURI ( dcterms:title )
   LiteralValueString ( "[Kana character string]" )
   )
  )
 )
)
</pre>

The other consequence of the literal-as-value approach is that the value can not be further described in its own right: it can not be the _described resource_ in a DC metadata description.

#### Range as "Sequence of Words"?

An alternative approach would be to assign a range for dcterms:title of some class other than the class of literals. One option would be to say that values of the property are "sequences of words". In this case the two Kana and Kanji literals could be treated in a DC metadata description as two different representations of a single non-literal value:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:title )
   ValueString ( "[Kanji character string]" )
   ValueString ( "[Kana character string]" )
  )
 )
)
</pre>

which would map to the three RDF triples:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .

&lt;http://example.org/123&gt; dcterms:title _:x .
_:x rdf:value "[Kanji character string]" ;
    rdf:value "[Kana character string]" .
</pre>

where the relationship between the two literals is made explicit, though it also results in a more complex graph.

With this range, however, the case of the English and Spanish titles would still require two separate statements, as they are different "sequences of words".

#### Range as "Abstract Title"?

A third option would be to assign a range of some class which allowed the **different** language literals to be treated as representations of the same "abstract title" in which case the English and Spanish titles could be treated in a DC metadata description as two different representations of a single non-literal value:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:title )
   ValueString ( "Learning Biology" 
    Language ( "en" )
   )
   ValueString ( "Aprender la Biologia" 
    Language ( "es" )
   )
  )
 )
)
</pre>

which would map to the three RDF triples:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .

&lt;http://example.org/123&gt; dcterms:title _:x .
_:x rdf:value "Learning Biology"@en ;
    rdf:value "Aprender la Biologia"@es .
</pre>

(This would probably be roughly equivalent to the way the [LangString](http://dublincore.org/usageboardwiki/LangString) datatype is used in the IEEE Learning Object Metadata standard.)

Which class to use for the range of the dcterms:property is a choice, determined essentially by what precisely are the intended semantics of the property and what requirements it is intended to meet.

(All the above considerations apply also to the property dcterms:alternative, a subproperty of dcterms:title.)

### Property: dcterms:date Proposed Range: rdfs:Literal

The proposal to assign a range for the property dcterms:date of the class rdfs:Literal means that when that property is referenced in a statement in a DC metadata description, the value is a literal, either plain or typed, and statements referencing this property should contain a literal value surrogate i.e. they should have the form:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:date )
   LiteralValueString ( "2007-07-02" 
    SyntaxEncodingSchemeURI ( xsd:date )
   )
  )
 )
)
</pre>

which would map to the single RDF triple:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .

&lt;http://example.org/123&gt; dcterms:date "2007-07-02"^^xsd:date .
</pre>

One of the advantages of this approach is that, as shown here, instances of the builtin XML Schema datatypes can be used as values.

As above for the case of dcterms:title, if a described resource is associated with other literals as dates, those literals form part of **separate** property-value pairs, and must be represented as **separate** statements in a DC metadata description. No relationship between those two literal values is indicated.

This is the case even where the literals are alternate notations for the same date (though datatype aware applications may be able to establish equivalences of the values represnted by different typed literals).

The other consequence of the literal-as-value approach is that the value can not be further described in its own right: it can not be the _described resource_ in a DC metadata description.

#### Range of dcterms:date and range of dcterms:temporal

With regard to this last point, it is probably important to highlight that the current proposal for the dcterms:temporal property is to assign as range the class dcterms: [PeriodOfTime](http://dublincore.org/usageboardwiki/PeriodOfTime), a class of "non-literal resources". This means that a statement referencing the dcterms:temporal property will contain a non-literal value surrogate, possibly with multiple value strings, whereas a statement referencing the dcterms:date property will contain a literal value surrogate, with a single value string, mapping to two different RDF graph "patterns". As a result, the same resource could not be the value in the case of a statement referencing the property dcterms:date and the case of a statement referencing the property dcterms:temporal.

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:date )
   LiteralValueString ( "start=2007-07-01; end=2007-07-02;" 
    SyntaxEncodingSchemeURI ( dcterms:Period )
   )
  )
  Statement (
   PropertyURI ( dcterms:temporal )
   ValueString ( "start=2007-07-01; end=2007-07-02;"  
    SyntaxEncodingSchemeURI ( dcterms:Period )
   )
  )
 )
)
</pre>

This description set would map to the RDF triples:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .

&lt;http://example.org/123&gt; dcterms:date "start=2007-07-01; end=2007-07-02;"^^dcterms:Period ;
                         dcterms:temporal _:x .
_:x rdf:value "start=2007-07-01; end=2007-07-02;"^^dcterms:Period .
</pre>

And, further, an application processing data containing statements referencing both properties will have to use these two **different** patterns when selecting/querying using the two different properties.

An alternative approach would be to assign a range for the dcterms:date property of some class of non-literal resources, e.g. the class of "dates or periods".

(All the above considerations apply also to all the subproperties of dcterms:date.)

### Property: dcterms:description Proposed Range: rdfs:Resource

The proposal for the property dcterms:description is not to assign a range, which is the equivalent of saying that the range is the class rdfs:Resource. This means that when that property is referenced in a statement in a DC metadata description, the value may be a resource of any type, and statements referencing this property may contain a literal value surrogate or may contain a non-literal value surrogate i.e. they may have the form (literal value surrogate case):

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:description )
   LiteralValueString ( "The textbook Learning Biology provides an introduction to the topic." 
    Language ( "en" )
   )
  )
 )
)
</pre>

which would map to the RDF triple:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

&lt;http://example.org/123&gt; dcterms:description "The textbook Learning Biology provides an introduction to the topic."@en .
</pre>

Or they may have the form (non-literal value surrogate case):

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

DescriptionSet (
 Description (
  ResourceURI ( &lt;http://example.org/123&gt; )
  Statement (
   PropertyURI ( dcterms:description )
   ValueURI ( &lt;http://example.org/123/description&gt; ) 
  )
 )
)
</pre>

which would map to the RDF triple:

<pre>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

&lt;http://example.org/123&gt; dcterms:description &lt;http://example.org/123/description&gt; .
</pre>

The choice to allow both literal and non-literal values reflects the definition of the dcterms:description property (which explicitly allows for values to be "graphical representations"), and for the existing use of the current dc:description property on which the new property is based, where values are often resources referenced by URIs.

#### OWL-DL compatibility

However, this use of the dcterms:description property with both literal and non-literal values does mean that this property and its subproperties (dcterms:abstract, dcterms:tableOfContents) would mean that it is problematic to use this property in OWL-DL. One possible solution to this would be to define two separate properties for use in that context, one an OWL datatypeProperty (with literal values) and the second an OWL objectProperty (with individuals as values).

### References

<a id="DCAM"></a>**[DCAM]**  
DCMI Abstract Model 2007-06-04  
 [http://dublincore.org/documents/2007/06/04/abstract-model/](http://dublincore.org/documents/2007/06/04/abstract-model/)

<a id="DC-RDF-NOTES"></a>**[DC-RDF-NOTES]**  
Notes on DCMI specifications for Dublin Core metadata in RDF 2007-04-02  
 [http://dublincore.org/documents/2007/04/02/dc-rdf-notes/](http://dublincore.org/documents/2007/04/02/dc-rdf-notes/)

<a id="DOMRANG0207"></a>**[DOMRANG0207]**  
Domains and Ranges for DCMI Properties 2007-02-05  
 [http://dublincore.org/documents/2007/02/05/domain-range/](http://dublincore.org/documents/2007/02/05/domain-range/)

<a id="OWL-OVER"></a>**[OWL-OVER]**  
 _OWL Web Ontology Language Overview_ W3C Recommendation 10 February 2004.  
 [http://www.w3.org/TR/2004/REC-owl-features-20040210/](http://www.w3.org/TR/2004/REC-owl-features-20040210/)

<a id="DC-TEXT"></a>**[DC-TEXT]**  
_DC-Text: A Text Syntax for Dublin Core Metadata_ Draft of 2007-04-02.  
 [http://dublincore.org/architecturewiki/DCText/2007-04-02](http://dublincore.org/architecturewiki/DCText/2007-04-02)

<a id="DC-DSP"></a>**[DC-DSP]**  
_DCMI Description Set Profile_ Working Draft.  
 [http://dublincore.org/architecturewiki/DescriptionSetProfile](http://dublincore.org/architecturewiki/DescriptionSetProfile)

 [RefreshCache](http://dublincore.org/usageboardwiki/RangesIssues?action=refresh&arena=Page.py&key=RangesIssues.text_html) for this page (cached 2012-12-29 10:54:57)  

Immutable page (last edited 2007-07-04 07:16:04 by TomBaker)


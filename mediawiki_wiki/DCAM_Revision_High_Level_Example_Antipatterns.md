---
title: DCAM Revision High Level Example Antipatterns
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Antipatterns.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 July 2012, at 18:37.  
This page has been accessed 87,911 times.

# Antipatterns

In the context of identifying patterns that provide useful examples for DCAM revisions, it is also helpful for us to collect examples of [antipatterns](http://en.wikipedia.org/wiki/Antipatterns%7C): "a pattern that is commonly used but is ineffective and/or counterproductive in practice." Antipatterns provide us an opportunity to identify common usage of Dublin Core, yet also identify how this usage may not conform to expectations of the DCAM (or may complicate the formalization of the DCAM, because observed patterns are incompatible with the model).

## 1:1 Principle Violations

An example of a Dublin Core antipattern are so-called violations of the Dublin Core 1:1 Principle. For example, the following snippet of an OAI-PMH record includes statements that refer to a physical object (the painting in the Louvre) and a digital object (a JPEG on the web). Examining 1:1 Principle violations can provide some insights into one of DCAM's core goals: to define what Dublin Core records/descriptionSets are, and how they function.

<pre style="white-space: pre-wrap; white-space: -moz-pre-wrap; word-wrap: break-word">
&lt;metadata&gt;
	&lt;title&gt;Mona Lisa&lt;/title&gt;
	&lt;title&gt; Portrait of Lisa Gherardini, wife of Francesco del Giocondo &lt;/title&gt;
	&lt;creator&gt;Leonardo da Vinci&lt;/creator&gt;
	&lt;publisher&gt;Musee du Louvre&lt;/publisher&gt;
	&lt;identifier&gt;Inv. 779&lt;/identifier&gt;
	&lt;identifier&gt;http://is.gd/fFbqI&lt;/identifier&gt;
	&lt;date&gt;1501-1519&lt;/date&gt;
	&lt;date&gt;2008&lt;/date&gt;
	&lt;source&gt;TIFF&lt;/source&gt;
	&lt;type&gt;image&lt;/type&gt;
	&lt;format&gt;oil on poplar board&lt;/format&gt;
	&lt;format&gt;H. 77 cm; W. 53 cm&lt;/format&gt;
	&lt;format&gt;image/jpeg&lt;/format&gt;
	&lt;format&gt;16781 bytes&lt;/format&gt;
	&lt;rights&gt;Copyright 2008 Musee du Louvre/A. Dequier - M. Bard&lt;/rights&gt;
&lt;metadata&gt;
</pre>

At first glance, DCAM provides an solution to the ambiguity present in this record by allowing the encoding of independent _DCAM:descriptions_ that are aggregated into a single _DCAM:descriptionSet_ (shortened for clarity)

<pre style="white-space: pre-wrap; white-space: -moz-pre-wrap; word-wrap: break-word">
&lt;dcds:descriptionSet&gt;
	&lt;dcds:description&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/title"&gt;
			&lt;dcds:literalValueString&gt;
				Mona Lisa
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/format"&gt;
			&lt;dcds:literalValueString&gt;
				oil on poplar board
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
	&lt;/dcds:description&gt;
	&lt;dcds:description dcds:resourceURI="http://is.gd/fFbqI"&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/format"&gt;
			&lt;dcds:literalValueString&gt;
				image/jpeg
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
	&lt;/dcds:description&gt;
&lt;/dcds:descriptionSet&gt;
</pre>
### Constraints on the Composition of Description Sets

While the relationship between _records,_ _descriptions,_ and _descriptionSets_ seems to capture our intuition about these kinds of bibliographic representations, the model may also allow things which do not match our intuitions to present themselves as DCAM concepts. For example, the following things would conform to DCAM"s definition of a _record:_

- A description set composed of all extant Dublin Core descriptions
- A description set that contains a description of the artwork _Mona Lisa_ and a description of the Agent _Herman Melville_
- All descriptions (sets of Dublin Core property/value pairs) represented in an OAI-PMH XML file. 

Nothing in the DCAM would prevent the composition of any of these descriptionSets and - barring storage constraints - instantiating them as a conformant _record._ Perhaps this generality is intended in the model, leaving the specific nature of _records_ to definition by an application profile. The [Scholarly Works Application Profile](http://www.ukoln.ac.uk/repositories/digirep/index/Eprints_Application_Profile%7C) introduces such a constraint into its definition:

<dl><dd>Each description set that complies with the Scholarly Works Application Profile is made up of a set of <i><b>related descriptions</b></i> about the entities listed above. [emphasis mine]
</dd></dl>


It may be appropriate that DCAM does not include such constraints in its generalized model, however some additional instructions on how such constraints are required when specifying a Application Profile may encourage the construction of appropriately scoped Description Sets. For example, a cultural heritage AP might require that we provide an explicit relationship between the two descriptions above if they are included in the same description Set (shown here as a hasVersion statement).

<pre style="white-space: pre-wrap; white-space: -moz-pre-wrap; word-wrap: break-word">
&lt;dcds:descriptionSet&gt;
	&lt;dcds:description&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/title"&gt;
			&lt;dcds:literalValueString&gt;
				Mona Lisa
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/format"&gt;
			&lt;dcds:literalValueString&gt;
				oil on poplar board
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/hasVersion" dcds:valueURI="http://is.gd/fFbqI" /&gt;
	&lt;/dcds:description&gt;
	&lt;dcds:description dcds:resourceURI="http://is.gd/fFbqI"&gt;
		&lt;dcds:statement dcds:propertyURI="http://purl.org/dc/terms/format"&gt;
			&lt;dcds:literalValueString&gt;
				image/jpeg
			&lt;/dcds:literalValueString&gt;
		&lt;/dcds:statement&gt;
	&lt;/dcds:description&gt;
&lt;/dcds:descriptionSet&gt;
</pre>

While unrestricted _dcam:description Sets_ seems a bit unlikely in design DCAM-compliant encoding syntax, it does present problems for sorting out legacy representations (especially those using the OAI-DC syntax, which precedes DCAM). In order to accomodate such syntaxes, DCAM allows the composition of _dcam:statements_ with "zero or one described resource URI." (and by extension, the creation of _descriptions_ with zero described resource URIs). While not requiring a URI allows descriptionSets like the first example, it does not provide sufficient semantics for us to infer when a set of property/value pairs are "about one, and only one resource." This introduces similar problems into the DCAM as are found with [RDF Blank Nodes](http://www.w3.org/TR/rdf-mt/#unlabel%7C).

(more to come after discussion)


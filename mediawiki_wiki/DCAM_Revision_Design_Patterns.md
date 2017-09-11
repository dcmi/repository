---
title: DCAM Revision Design Patterns
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 July 2012, at 16:57.  
This page has been accessed 120,032 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DCAM_design_patterns"><span class="tocnumber">1</span> <span class="toctext">DCAM design patterns</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2">
              <a href="#Publication_statement"><span class="tocnumber">1.1</span> <span class="toctext">Publication statement</span></a>
              <ul>
                <li class="toclevel-3"><a href="#Notes"><span class="tocnumber">1.1.1</span> <span class="toctext">Notes</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-3">
              <a href="#Resource_Descriptions"><span class="tocnumber">1.2</span> <span class="toctext">Resource Descriptions</span></a>
              <ul>
                <li class="toclevel-3"><a href="#Notes_2"><span class="tocnumber">1.2.1</span> <span class="toctext">Notes</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-4"><a href="#Name_heading"><span class="tocnumber">1.3</span> <span class="toctext">Name heading</span></a></li>
            <li class="toclevel-2 tocsection-5">
              <a href="#Core_elements"><span class="tocnumber">1.4</span> <span class="toctext">Core elements</span></a>
              <ul>
                <li class="toclevel-3"><a href="#Note"><span class="tocnumber">1.4.1</span> <span class="toctext">Note</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-6"><a href="#Antipatterns"><span class="tocnumber">1.5</span> <span class="toctext">Antipatterns</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1">
          <a href="#Antipatterns_2"><span class="tocnumber">2</span> <span class="toctext">Antipatterns</span></a>
          <ul>
            <li class="toclevel-2">
              <a href="#1:1_Principle_Violations"><span class="tocnumber">2.1</span> <span class="toctext">1:1 Principle Violations</span></a>
              <ul>
                <li class="toclevel-3"><a href="#Constraints_on_the_Composition_of_Description_Sets"><span class="tocnumber">2.1.1</span> <span class="toctext">Constraints on the Composition of Description Sets</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#ISBD_DSP"><span class="tocnumber">2.1.2</span> <span class="toctext">ISBD DSP</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## DCAM design patterns 

2012-05-25. Note: Previous contents of this page moved to [DCAM Revision Design Patterns Sources](/archive/mediawiki_wiki/DCAM_Revision_Design_Patterns_Sources "DCAM Revision Design Patterns Sources"). Re-purposing this page with transclusion links to examples as they are created.

* * *

### [Publication statement](/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement "DCAM Revision High Level Example Publication Statement") 

In ISBD there is a high-level element "Publication, production, distribution, etc area" (URI: isbd:P1162). The documentations says "including the place of publication, production and/or distribution; the name of publisher, producer, and/or distributor; the date of publication, production, and/or distribution; the place of printing or manufacture; the name of printer or manufacturer; and the date of printing or manufacture." The element is not repeatable, but constituent elements are repeatable:

- Place of publication, production and/or distribution statement (isbd:P1168)
- Name of publisher, producer and/or distributor statement (isbd:P1169)
- Date of publication, production and/or distribution (isbd:P1018)
- Place of printing or manufacture (isbd:P1019)
- Name of printer or manufacturer (isbd:P0120)
- Date of printing or manufacture (isbd:P1021)

Some attributes have internal structure, simplified here.

The syntax of ISBD is based on punctuation separating (and partially identifying) component elements.

Examples:

Simple: [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution]

Complex: [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution]&nbsp;; [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution] ([Place of printing or manufacture]&nbsp;: [Name of printer or manufacturer], [Date of printing or manufacture])

[] indicates an element and is not part of the syntax.

In MARC21 there is a high-level element "260 - Publication, Distribution, etc. (Imprint)" (m21:M260). This element is repeatable. The constituent elements are all repeatable:

- $a - Place of publication, distribution, etc. (m21:M260a)
- $b - Name of publisher, distributor, etc. (m21:M260b)
- $c - Date of publication, distribution, etc. (m21:M260c)
- $e - Place of manufacture (m21:M260e)
- $f – Manufacturer (m21:M260f)
- $g - Date of manufacture (m21:M260g)

Examples:

Simple: 260$aNew York, N.Y.&nbsp;:$bElsevier,$c1984.

Complex: 260$aLondon&nbsp;:$bArts Council of Great Britain,$c1976$e(Twickenham&nbsp;:$fCTD Printers,$g1974)

#### Notes 

ISBD and MARC21 have common origins, and often align (more or less).

ISBD elements [Place of publication, production and/or distribution statement] and [Name of publisher, producer and/or distributor statement] are themselves aggregations of more refined elements. The refined elements are not separately identified in MARC21.

[kc: It may not be obvious to those who have not taken a course in library cataloging... but the values for the elements here are, by definition and by their semantics, character strings. While the element is called "Place of publication" in fact the value is a transcription of the place of publication given on (in the case of a book) the title page. This string may or may not represent what one would consider a valid "place" entity. If the place given on the title page is wrong (e.g. "Nwe York") it is transcribed in that way, with the option of adding the correct place (if known) in the same string, using square brackets to indicate that it has been added by the cataloger and does not represent the title page itself. Thus:

<dl><dd>Nwe York [New York]
</dd></dl>


Ditto for the other elements in this example: they are transcriptions from the resource itself and serve as a detailed description of the information on the source. This makes more difference in older works and in ones that don't come from mainstream publishers. The purpose is to be able to identify two items, cataloged separately, as representing the exact same resource, same printing.

Also, if there is more than one place of publication but only one publisher, the two places are given in the "place" position in the resulting string:

<dl><dd>London ; Chicago
</dd></dl>
<dl><dd>London ; Chicago : Penguin, 2003
</dd></dl>


but if there is more than one publisher, then place _and_ publication are repeated:

<dl><dd>New York : Columbia University ; Boston : Computer Research Institute
</dd></dl>


I don't know if this changes the solution, but we should avoid assumptions such as thinking that a "place of publication" could be a string _or_ a URI. In this particular case they are all strings, and there are no controlled vocabularies. This could keep us from going off in a not very useful direction in our discussion.]

The URIs given for MARC21 elements are placeholders.

Back to **DCAM revision design patterns**

[kc: In MARC, at least, each "statement" must have at least one $a, one $b and one $c. If the information is missing (e.g. no place of publication), then you get a "$a no place of publication". In MARC, elements $a $b $c are repeatable, but the cataloging rules seem to require at least one of each: $a[S.l.&nbsp;:$bs.n.,$c15--?] .] [gd: In ISBD, place of publication uses the string "s.l." and name of publisher "s.n." if the information is missing. Note that the MARC example given by kc is using the Anglo-American Cataloguing Rules (not ISBD) which are generally being superseded by RDA; RDA also mandates the use of a default string for these two elements.]

* * *

### [Resource Descriptions](/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions "DCAM Revision High Level Example Resource Descriptions") 

The ISBD documentation defines "resource" as "An entity, tangible or intangible, that comprises intellectual and/or artistic content and is conceived, produced and/or issued as a unit, forming the basis of a single bibliographic description." In the ISBD namespace, Resource is a class, and is the domain of all properties based on ISBD attributes and aggregated statements.

The ISBD documentation also says "One change [in the consolidated edition] is the use of the term resource rather than item or publication. This decision was taken in order to avoid confusion, because the use of the term item in the former ISBDs is different from the term item as used in FRBR."

The FRBR documentation refers to resources, e.g. "… users may make use of bibliographic records for a variety of purposes, for example: to determine what information resources exist …", but does not offer any definition.

FRBR identifies four entities as "the products of intellectual or artistic endeavour that are named or described in bibliographic records: work, expression, manifestation, and item." In the FRBRer namespace, Work, Expression, Manifestation, and Item are classes, and are the domains of properties based on FRBR attributes assigned to the entities and the domains and ranges of properties based on relationships between the entities.

The FRBR documentation describes the relationships between these entities as "a work may be realized through one or more than one expression ... An expression, on the other hand, is the realization of one and only one work ... An expression may be embodied in one or more than one manifestation; likewise a manifestation may embody one or more than one expression. A manifestation, in turn, may be exemplified by one or more than one item; but an item may exemplify one and only one manifestation." The usage of "may" and "is" is informal. The FRBR Review Group has clarified this in discussion (but not yet formally recorded anything):

- An Item must exemplify one and only one Manifestation.
- A Manifestation must embody at least one Expression.
- An Expression must realize one and only one Work.
- A Work may be realized through one or more Expressions.
- An Expression may be embodied in one or more Manifestations.
- A Manifestation may exemplify one or more Items.

These semantic constraints are currently expressed in OWL; e.g. An Expression must realize one and only one Work:

- frbrer:C1002 rdfs:subClassOf
- [
- rdf:type owl:Restriction;
- owl:onProperty frbrer:P2002;
- owl:onClass frbrer:C1001;
- owl:qualifiedCardinality "1"^^xsd:nonNegativeInteger
- ] .
- frbrer:C1002 rdfs:label “Expression” .
- frbrer:C1001 rdfs:label “Work” .
- frbrer:P2002 rdfs:label “is realization of” .

The three FRBR "primary" relationships for realized, embodied, and exemplified are represented as pairs of properties in the namespace, with the relevant classes as domains and ranges.

A FRBR "record" of instance data will usually comprise instances of one of each of the four entities:

"Resource" (record or description) = Work + Expression + Manifestation + Item.

This "record" is related to a graph of ISBD triples with an instance of Resource as their subject (disregarding relationships between lower-granularity properties in the ISBD and FRBRer namespaces).

#### Notes 

ISBD’s Resource and FRBR’s Work, Expression, Manifestation, and Item classes may be more appropriately considered to be sub-classes of the "Named graph" class (without needing the alter their basic semantics). Each graph is a set of properties whose domain is the class.

Back to **DCAM revision design patterns**

* * *

### [Name heading](/archive/mediawiki_wiki/DCAM_Revision_Example_Name_Heading "DCAM Revision Example Name Heading") 

This example is similar to the publication statement, in that it is a grouping of elements in a particular order. It has some differences because the elements themselves are mostly not fixed and they are all optional except one. This type of heading is not part of ISBD, which is limited to description and does not include access.

A name heading is very complex, but we can reduce it down to a small elements for this discussion. For starters, we should consider the elements that are associated with a personal name:

- $a - Personal name (NR) - Surname and/or forename; letters, initials, abbreviations, phrases, or numbers used in place of a name; or a family name.

- $b - Numeration (NR) - Roman numeral or roman numeral and a subsequent part of a forename when the first indicator value is 0.

- $c - Titles and other words associated with a name (R)

- $d - Dates associated with a name (NR) - Dates of birth, death, or flourishing, or any other date associated with a name.

- $e - Relator term (R) - Relationship between a name and a work.

- $g - Miscellaneous information (NR) - Data element not more appropriately contained in another defined subfield.

- $j - Attribution qualifier (R) - Attribution information for names when the responsibility is unknown, uncertain, fictitious or pseudonymous.

- $q - Fuller form of name (NR) - More complete form of the name contained in subfield $a.

We can assume that only the $a (using the MARC subfield designation) is required. All other subfields are added if necessary, with necessity being defined by quite complex cataloging rules. (e.g. $b, $c are "mandatory if applicable"; $q, I believe, is required only if there are abbreviations or initialisms in $a (e.g. $a Smith, J $q John).

Some examples:

<dl><dd>$a Saur, Karl-Otto, $c Jr. 
</dd></dl>
<dl><dd>$a Kalashnikov, S. D. $q (Sergei Dmitrievich) 
</dd></dl>
<dl><dd>$a Black Foot, $c Chief, $d d. 1877 $c (Spirit) 
</dd></dl>
<dl><dd>$a Salisbury, James Cecil, $c Earl of, $d d. 1683 
</dd></dl>
<dl><dd>$a Gustaf $b V, $c King of Sweden, $d 1858-1950 
</dd></dl>


While the order of the subfields generally follows a pattern, as you can see in this example:

<dl><dd>$a Black Foot, $c Chief, $d d. 1877 $c (Spirit) 
</dd></dl>


there are exceptions. Therefore, the order must be assumed to be the order in which the elements are presented in the data, not an algorithmically determined one.

* * *

### [Core elements](/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements "DCAM Revision High Level Example Core Elements") 

The RDA documentation says "Certain elements in RDA are identified as core elements … As a minimum, a resource description … should include all the core elements that are applicable and readily ascertainable. The description should also include any additional elements that are required in a particular case to differentiate the resource from one or more other resources bearing similar identifying information."

Example (RDA elements for FRBR Work):

Core:

- Date of work (rda:dateOfWork)
- Form of work (rda:formOfWork)
- Key (rda:keyWork) [note a]
- Numeric designation of a musical work (rda:numericDesignationOfAMusicalWork) [note a]
- Equinox (rda:equinox) [note b]
- ...

Enhanced:

- Intended audience (rda:intendedAudienceWork)
- Nature of the content (rda:natureOfTheContentWork)
- Coordinates of cartographic content (rda:coordinatesOfCartographicContentWork [note b]
- ...

The ISBD documentation says "A small number of elements of the description, such as a title, are mandatory and must be included in any ISBD description. Other elements, such as an edition statement, are mandatory if the information is available. Elements are designated by the term Mandatory or Mandatory if available or Mandatory if applicable after the heading for the element."

Example:

Mandatory:

- Media type (isbd:P1003)
- Date of publication, production and/or distribution (isbd:P1018)
- ...

Mandatory if applicable:

- Statement of coordinates and equinox (isbd:P1049) [note b]
- Music format statement (Notated music) (isbd:P1014) [note a]
- ...

Not mandatory:

- Statement of equinox (isbd:P1052) [note b]
- Date of printing or manufacture (isbd:P1021)
- ...

#### Note 

- [a] Applies only to musical works.
- [b] Applies only to cartographic works.

Note the intersection of ISBD elements with [Publication statement example](/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement "DCAM Revision High Level Example Publication Statement").

Back to **DCAM revision design patterns**.

* * *

### [Antipatterns](/archive/mediawiki_wiki/DCAM_Revision_High_Level_Example_Antipatterns "DCAM Revision High Level Example Antipatterns") 

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

* * *

### [ISBD DSP](/archive/mediawiki_wiki/DCAM_Revision_ISBD_DSP "DCAM Revision ISBD DSP") 

All comments and queries about this draft description set profile for the International Standard Bibliographic Description (ISBD) are welcome. Please post to list or directly to [Gordon Dunsire](mailto:gordon@gordondunsire.com).

<pre style="white-space: pre-wrap; white-space: -moz-pre-wrap; word-wrap: break-word">
&lt;?xml version="1.0" encoding="UTF-8" ?&gt;
&lt;?xml-stylesheet type="text/xsl" href="isbd.xsl"?&gt;
&lt;DescriptionSetTemplate&gt; 
  &lt;!--&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14 descriptionSetTemplate.xsd"&gt;--&gt;
  &lt;!-- This is a working draft of a description set profile for the DC application profile of the International Standard Bibliographic Description (ISBD) consolidated edition, 2011. --&gt;
  &lt;!-- Creator: IFLA ISBD/XML Study Group --&gt;
  &lt;!-- Functional requirements and domain model are identified in International Standard Bibliographic Description (ISBD) consolidated edition, 2011. All metadata terms are from the namespace http://iflastandards.info/ns/isbd/ --&gt;
  &lt;!-- Description set profile --&gt;
  &lt;!-- ISBD record is mandatory and non-repeatable --&gt;
  &lt;DescriptionTemplate ID="Resource" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
    &lt;ResourceClass&gt;http://iflastandards.info/ns/isbd/elements/C2001&lt;/ResourceClass&gt;
    &lt;!-- Area 0 is mandatory and non-repeatable--&gt;        
    &lt;StatementTemplate ID="hasContentFormAndMediaTypeArea" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1158&lt;/Property&gt;
      &lt;!-- Area 0 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasContentFormAndMediaTypeArea"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2003&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 1 is mandatory and non-repeatable --&gt;        
    &lt;StatementTemplate ID="hasTitleAndStatementOfResponsibilityArea" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1159&lt;/Property&gt;
      &lt;!-- Area 1 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasTitleAndStatementOfResponsibilityArea"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2004&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 2 is non-repeatable --&gt;        
    &lt;StatementTemplate ID="hasEditionArea" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1160&lt;/Property&gt;
      &lt;!-- Area 2 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasEditionArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2005&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 3 --&gt;        
    &lt;StatementTemplate ID="hasMaterialOrTypeOfResourceSpecificArea" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1161&lt;/Property&gt;
      &lt;!-- Area 3 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasMaterialOrTypeOfResourceSpecificArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2006&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 4 is mandatory and non-repeatable --&gt;        
    &lt;StatementTemplate ID="hasPublicationProductionDistributionEtcArea" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1162&lt;/Property&gt;
      &lt;!-- Area 4 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasPublicationProductionDistributionEtcArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2007&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 5 --&gt;        
    &lt;StatementTemplate ID="hasMaterialDescriptionArea" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1163&lt;/Property&gt;
      &lt;!-- Area 5 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasMaterialDescriptionArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2008&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 6 --&gt;        
    &lt;StatementTemplate ID="hasSeriesAndMultipartMonographicResourceArea" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1164&lt;/Property&gt;
      &lt;!-- Area 6 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasSeriesAndMultipartMonographicResourceArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2009&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 7 --&gt;        
    &lt;StatementTemplate ID="hasNoteArea" minOccurs="0" type="nonliteral"&gt;
      &lt;!-- Area 7 is an aggregated statement with SES --&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1107&lt;/Property&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasNoteArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2010&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
    &lt;!-- Area 8 --&gt;        
    &lt;StatementTemplate ID="hasResourceIdentifierAndTermsOfAvailabilityArea" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1165&lt;/Property&gt;
      &lt;!-- Area 8 is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasResourceIdentifierAndTermsOfAvailabilityArea"&gt;            
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2011&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Description Templates for each Area --&gt;
  &lt;!-- Area 0: CONTENT FORM AND MEDIA TYPE AREA --&gt;
  &lt;DescriptionTemplate ID="DThasContentFormAndMediaTypeArea" standalone="no"&gt;
    &lt;!-- Content form and media type statement is mandatory --&gt;
    &lt;StatementTemplate ID="hasContentFormAndMediaTypeStatement" minOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1185&lt;/Property&gt;
      &lt;!-- Content form and media type statement is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasContentFormAndMediaTypeStatement"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2026&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;            
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 1: TITLE AND STATEMENT OF RESPONSIBILITY AREA --&gt;
  &lt;DescriptionTemplate ID="DThasTitleAndStatementOfResponsibilityArea" standalone="no"&gt;
    &lt;!-- Title property is a super-element and is not used in this application profile --&gt;
    &lt;!-- Title statement is mandatory --&gt;
    &lt;StatementTemplate ID="hasTitleStatement" minOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1170&lt;/Property&gt;
      &lt;!-- Title statement is one of a choice --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasTitleStatement"&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Parallel title property is a super-element and is not used in this application profile --&gt;
    &lt;StatementTemplate ID="hasParallelTitleStatement" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1172&lt;/Property&gt;
      &lt;!-- Parallel title statement is one of a choice --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasParallelTitleStatement"&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasOtherTitleInformation" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1006&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelOtherTitleInformation" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1140&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasStatementOfResponsibilityRelatingToTitle" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1007&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelStatementOfResponsibilityRelatingToTitle" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1141&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 2: EDITION AREA --&gt;
  &lt;DescriptionTemplate ID="DThasEditionArea" standalone="no"&gt;
    &lt;!-- Edition statement is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasEditionStatement" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1008&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelEditionStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1009&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasStatementOfResponsibilityRelatingToEdition" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1010&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelStatementOfResponsibilityRelatingToEdition" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1142&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasAdditionalEditionStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1011&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasStatementOfResponsibilityRelatingToAdditionalEditionStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1059&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelAdditionalEditionStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1143&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelStatementOfResponsibilityRelatingToAdditionalEditionStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1058&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 3: MATERIAL OR TYPE OF RESOURCE SPECIFIC AREA --&gt;
  &lt;DescriptionTemplate ID="DThasMaterialOrTypeOfResourceSpecificArea" standalone="no"&gt;
    &lt;!-- Mathematical data area is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasMathematicalDataArea" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1013&lt;/Property&gt;
      &lt;!-- Mathematical data area is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasMathematicalDataArea"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2012&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Music format statement is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasMusicFormatStatementArea" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1166&lt;/Property&gt;
      &lt;!-- Music format statement is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasMusicFormatStatementArea"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2013&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Numbering area is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNumberingArea" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1015&lt;/Property&gt;
      &lt;!-- Numbering area is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasNumberingArea"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2014&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 4: PUBLICATION, PRODUCTION, DISTRIBUTION, ETC., AREA --&gt;
  &lt;DescriptionTemplate ID="DThasPublicationProductionDistributionEtcArea" standalone="no"&gt;
    &lt;!-- Place of publication statement is mandatory --&gt;
    &lt;StatementTemplate ID="hasPlaceOfPublicationProductionDistributionStatement" minOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1168&lt;/Property&gt;
      &lt;!-- Place of publication statement is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasPlaceOfPublicationProductionDistributionStatement"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2018&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Name of publisher statement is mandatory --&gt;
    &lt;StatementTemplate ID="hasNameOfPublisherProducerDistributorStatement" minOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1169&lt;/Property&gt;
      &lt;!-- Name of publisher statement is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasNameOfPublisherProducerDistributorStatement"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2019&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Date of publication is mandatory --&gt;
    &lt;StatementTemplate ID="hasDateOfPublicationProductionDistribution" minOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1018&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Statement of printing is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasStatementOfPrintingOrManufacture" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1167&lt;/Property&gt;
      &lt;!-- Statement of printing is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasStatementOfPrintingOrManufacture"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2020&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 5: MATERIAL DESCRIPTION AREA --&gt;
  &lt;DescriptionTemplate ID="DThasMaterialDescriptionArea" standalone="no"&gt;
    &lt;!-- Specific material designation and extent is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasSpecificMaterialDesignationAndExtent" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1022&lt;/Property&gt;
      &lt;!-- Specific material designation and extent is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasSpecificMaterialDesignationAndExtent"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2015&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Other physical details is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasOtherPhysicalDetails" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1023&lt;/Property&gt;
      &lt;!-- Other physical details is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasOtherPhysicalDetails"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2016&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dimensions is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDimensions" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1024&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Bibliographic format is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasBibliographicFormatOfOlderMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1122&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Accompanying material statement is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasAccompanyingMaterialStatement" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1025&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 6: SERIES AND MULTIPART MONOGRAPHIC RESOURCE AREA --&gt;
  &lt;DescriptionTemplate ID="DThasSeriesAndMultipartMonographicResourceArea" standalone="no"&gt;
    &lt;!-- Title statement of series is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleStatementOfSeriesOrMultipartMonographicResource" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1173&lt;/Property&gt;
      &lt;!-- Title statement of series is one of a choice of elements --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasTitleStatementOfSeriesOrMultipartMonographicResource"&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;      
    &lt;StatementTemplate ID="hasParallelTitleStatementOfSeriesOrMultipartMonographicResource" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1174&lt;/Property&gt;
      &lt;!-- Parallel title statement of series is one of a choice of elements --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasParallelTitleStatementOfSeriesOrMultipartMonographicResource"&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Other title information is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasOtherTitleInformationOfSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1028&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelOtherTitleInformationOfSeriesOrMultipartMonographicResource" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1152&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasStatementOfResponsibilityOfSeriesOrMultipartMonographicResource" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1029&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelStatementOfResponsibilityOfSeriesOrMultipartMonographicResource" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1153&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- International standard number is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasInternationalStandardNumberOfSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1030&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Numbering is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNumberingWithinSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1031&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 7: NOTE AREA --&gt;
  &lt;DescriptionTemplate ID="DThasNoteArea" standalone="no"&gt;
    &lt;!-- All specific notes are sub-properties of hasNote --&gt;
    &lt;StatementTemplate ID="hasNote" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1045&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Area 8: RESOURCE IDENTIFIER AND TERMS OF AVAILABILITY AREA --&gt;
  &lt;DescriptionTemplate ID="DThasResourceIdentifierAndTermsOfAvailabilityArea" standalone="no"&gt;
    &lt;StatementTemplate ID="hasResourceIdentifierStatement" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1125&lt;/Property&gt;
      &lt;!-- Resource identifier is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasResourceIdentifierStatement"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2028&lt;/SyntaxEncodingScheme&gt;
         &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Key title is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasKeyTitle" minOccurs="0" maxOccurs= "1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1033&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasTermsOfAvailabilityStatement" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1093&lt;/Property&gt;
      &lt;!-- Terms of availability is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasTermsOfAvailabilityStatement"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2027&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Other Description Templates for aggregated statements --&gt;
  &lt;!-- Compound title of parallel title --&gt;
  &lt;DescriptionTemplate ID="DThasCompoundTitleOfParallelTitle" standalone="no"&gt;
    &lt;!-- Common title is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasCommonTitleOfParallelTitle" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1182&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleDesignationOfParallelTitle" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1184&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleOfParallelTitle" minOccurs="0" maxOccurs="1" type="literal"&gt;
     &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1183&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Compound title of title proper --&gt;
  &lt;DescriptionTemplate ID="DThasCompoundTitleOfTitleProper" standalone="no"&gt;
    &lt;!-- Common title is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasCommonTitleOfTitleProper" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1137&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleDesignationOfTitleProper" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1139&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleOfTitleProper" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1138&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Content form and media type statement --&gt;
  &lt;DescriptionTemplate ID="DThasContentFormAndMediaTypeStatement" standalone="no"&gt;
    &lt;!-- Content form is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasContentForm" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1001&lt;/Property&gt;
      &lt;!-- Content form has VES --&gt;
      &lt;NonLiteralConstraint&gt;
        &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/contentform&lt;/VocabularyEncodingSchemeURI&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasContentQualification" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1002&lt;/Property&gt;
      &lt;!-- Content qualification has several VES --&gt;
      &lt;NonLiteralConstraint&gt;
        &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/contentqualification/dimensionality&lt;/VocabularyEncodingSchemeURI&gt;
        &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/contentqualification/motion&lt;/VocabularyEncodingSchemeURI&gt;
        &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/contentqualification/sensoryspecification&lt;/VocabularyEncodingSchemeURI&gt;
        &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/contentqualification/type&lt;/VocabularyEncodingSchemeURI&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Media type is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasMediaType" minOccurs="1" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1003&lt;/Property&gt;
      &lt;!-- Media type has VES --&gt;
      &lt;NonLiteralConstraint&gt;
         &lt;VocabularyEncodingSchemeURI&gt;http://iflastandards.info/ns/isbd/terms/mediatype&lt;/VocabularyEncodingSchemeURI&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Mathematical data area --&gt;
  &lt;DescriptionTemplate ID="DThasMathematicalDataArea" standalone="no"&gt;
    &lt;!-- Statement of scale is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasStatementOfScale" minOccurs="0" maxOccurs="1" type="literal"&gt;
       &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1047&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Statement of projection is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasStatementOfProjection" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1048&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Statement of coordinates and equinox is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasStatementOfCoordinatesAndEquinox" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1049&lt;/Property&gt;
      &lt;!-- Statement of coordinates and equinox is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasStatementOfCoordinatesAndEquinox"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2017&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Music format statement area --&gt;
  &lt;DescriptionTemplate ID="DThasMusicFormatStatementArea" standalone="no"&gt;
    &lt;!-- Music format statement is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasMusicFormatStatement" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1014&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelMusicFormatStatement" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1119&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Name of publisher producer distributor statement --&gt;
  &lt;DescriptionTemplate ID="DThasNameOfPublisherProducerDistributorStatement" standalone="no"&gt;
    &lt;!-- Name of publisher is mandatory --&gt;
    &lt;StatementTemplate ID="hasNameOfPublisherProducerDistributor" minOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1017&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelNameOfPublisherProducerDistributor" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1121&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Numbering area --&gt;
  &lt;DescriptionTemplate ID="DThasNumberingArea" standalone="no"&gt;
    &lt;!-- Numerical designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNumericalDesignation" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1156&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Chronological designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasChronologicalDesignation" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1157&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelSystemOfNumbering" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1116&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Subsequent numbering system is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasSubsequentNumberingSystem" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1120&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Other physical details --&gt;
  &lt;DescriptionTemplate ID="DThasOtherPhysicalDetails" standalone="no"&gt;
    &lt;!-- Composition of material is non-repeatable --&gt;
    &lt;StatementTemplate ID="CompositionOfMaterial" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1056&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Presence of illustrations is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPresenceOfIllustrations" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1057&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Presence of colour is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPresenceOfColour" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1060&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Reduction ratio is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasReductionRatio" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1061&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Presence or absence of sound is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPresenceOrAbsenceOfSound" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1062&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Frame alignment is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasFrameAlignment" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1063&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Process or method of reproduction is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasProcessOrMethodOfReproductionOfStillImage" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1126&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Playing speed is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPlayingSpeed" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1127&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Recording method is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasRecordingMethod" minOccurs="0" maxOccurs="1" type="literal"&gt;
     &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1128&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Groove direction is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasGrooveDirection" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1129&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Groove size is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasGrooveSize" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1130&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Number of tape tracks is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNumberOfTapeTracks" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1131&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Track configuration is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTrackConfiguration" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1132&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Number of sound channels is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNumberOfSoundChannels" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1133&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Equalization is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasEqualization" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1134&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Noise reduction is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNoiseReduction" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1135&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Parallel title compound of series or multipart monographic resource --&gt;
  &lt;DescriptionTemplate ID="DThasParallelTitleCompoundOfSeriesOrMultipartMonographicResource" standalone="no"&gt;
  &lt;!-- Common title is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasParallelCommonTitleOfSeriesOrMultipartMonographicResource" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1178&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasParallelDependentTitleDesignationOfSeriesOrMultipartMonographicResource" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1180&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasParallelDependentTitleOfSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1179&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Parallel title statement --&gt;
  &lt;DescriptionTemplate ID="DThasParallelTitleStatement" standalone="no"&gt;
    &lt;StatementTemplate ID="hasParallelTitle" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1005&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasCompoundTitleOfParallelTitle" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1181&lt;/Property&gt;
      &lt;!-- Compound parallel title is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasCompoundTitleOfParallelTitle"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2025&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Parallel title statement of series or multipart monographic resource --&gt;
  &lt;DescriptionTemplate ID="DThasParallelTitleStatementOfSeriesOrMultipartMonographicResource" standalone="no"&gt;
    &lt;StatementTemplate ID="hasParallelTitleOfSeriesOrMultipartMonographicResource" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1027&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelTitleCompoundOfSeriesOrMultipartMonographicResource" minOccurs="0" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1177&lt;/Property&gt;
      &lt;!-- Parallel compound title of series is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasParallelTitleCompoundOfSeriesOrMultipartMonographicResource"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2024&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Place of publication production distribution statement --&gt;
  &lt;DescriptionTemplate ID="DThasPlaceOfPublicationProductionDistributionStatement" standalone="no"&gt;
    &lt;!-- Place of publication is mandatory --&gt;
    &lt;StatementTemplate ID="hasPlaceOfPublicationProductionDistribution" minOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1016&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasAdditionsToPlaceOfPublication" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1144&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasParallelPlaceOfPublicationProductionDistribution" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1145&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;StatementTemplate ID="hasAdditionsToParallelPlaceOfPublication" minOccurs="0" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1151&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Resource identifier statement --&gt;
  &lt;DescriptionTemplate ID="DThasResourceIdentifierStatement" standalone="no"&gt;
    &lt;!-- Identifier is mandatory and non-repeatable --&gt;
    &lt;!-- Standard identifier, Label name, Fingerprint are declared subproperties --&gt;
    &lt;StatementTemplate ID="hasResourceIdentifier" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1032&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Qualifier is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasQualificationToIdentifier" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1077&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Specific material designation and extent --&gt;
  &lt;DescriptionTemplate ID="DThasSpecificMaterialDesignationAndExtent" standalone="no"&gt;
    &lt;!-- Extent is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasExtent" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1053&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Specific material designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasSpecificMaterialDesignation" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1146&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Pagination is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPagination" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1054&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Playing time is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPlayingTime" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1055&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Statement of coordinates and equinox --&gt;
  &lt;DescriptionTemplate ID="DThasStatementOfCoordinatesAndEquinox" standalone="no"&gt;
    &lt;!-- Coordinates is non-repeatable --&gt;
    &lt;!-- Longitude and latitude, Right ascension and declination are declared subproperties --&gt;
    &lt;StatementTemplate ID="hasCoordinates" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1050&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Equinox is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasEquinox" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1052&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Statement of printing or manufacture --&gt;
  &lt;DescriptionTemplate ID="DThasStatementOfPrintingOrManufacture" standalone="no"&gt;
    &lt;!-- Place of printing is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasPlaceOfPrintingOrManufacture" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1019&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Name of printer is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasNameOfPrinterOrManufacturer" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1020&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Date of printing is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDateOfPrintingOrManufacture" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1021&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Terms of availability statement --&gt;
  &lt;DescriptionTemplate ID="DThasTermsOfAvailabilityStatement" standalone="no"&gt;
    &lt;!-- Terms is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTermsOfAvailability" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1034&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Qualifier is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasQualificationToTermsOfAvailability" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1150&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Title proper compound of series --&gt;
  &lt;DescriptionTemplate ID="DThasTitleProperCompoundOfSeries" standalone="no"&gt;
    &lt;!-- Common title is mandatory and non-repeatable --&gt;
    &lt;StatementTemplate ID="hasCommonTitleOfSeriesOrMultipartMonographicResource" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1147&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title designation is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleDesignationOfSeriesOrMultipartMonographicResource" minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1149&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Dependent title is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasDependentTitleOfSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1148&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Title statement --&gt;
  &lt;DescriptionTemplate ID="DThasTitleStatement" standalone="no"&gt;
    &lt;!-- Title proper is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleProper" minOccurs="0" maxOccurs="1" type="literal"&gt;
     &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1004&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Title proper compound is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasCompoundTitleOfTitleProper" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1171&lt;/Property&gt;
      &lt;!-- Title proper compound is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasCompoundTitleOfTitleProper"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2021&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Title of individual work by same author is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleOfIndividualWorkBySameAuthor" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1117&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Title of individual work by different author is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleOfIndividualWorkByDifferentAuthor" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1118&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;!-- Title statement of series or multipart monographic resource --&gt;
  &lt;DescriptionTemplate ID="DThasTitleStatementOfSeriesOrMultipartMonographicResource" standalone="no"&gt;
    &lt;!-- Title proper of series is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleProperOfSeriesOrMultipartMonographicResource" minOccurs="0" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1026&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
    &lt;!-- Title proper compound of series is non-repeatable --&gt;
    &lt;StatementTemplate ID="hasTitleProperCompoundOfSeries" minOccurs="0" maxOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;http://iflastandards.info/ns/isbd/elements/P1186&lt;/Property&gt;
      &lt;!-- Title proper compound of series is an aggregated statement with SES --&gt;
      &lt;NonLiteralConstraint descriptionTemplateRef="DThasTitleProperCompoundOfSeries"&gt;
        &lt;ValueStringConstraint&gt;
          &lt;SyntaxEncodingScheme&gt;http://iflastandards.info/ns/isbd/elements/C2022&lt;/SyntaxEncodingScheme&gt;
        &lt;/ValueStringConstraint&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;      
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

**Back to DCAM Revision Design Patterns**


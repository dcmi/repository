---
title: ExamplesFormalConstraints
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/RDF_Application_Profiles/ExamplesFormalConstraints.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 30 September 2014, at 11:14.  
This page has been accessed 24,373 times.

This presents formalized constraints for two 'easy' and 'hard' requirements as mentioned in this email. The two easy ones have some example and counter-example (data that is not ok according to the constraint). The two last ones have an alternative definition and examples.

The examples come in DSP and OWL (with a closed world assumption). Note that the last two ones may not have a DSP expression.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#R-28-OBJECT-PROPERTY-RANGE"><span class="tocnumber">1</span> <span class="toctext">R-28-OBJECT-PROPERTY-RANGE</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#R-68-REQUIRED-PROPERTIES"><span class="tocnumber">2</span> <span class="toctext">R-68-REQUIRED-PROPERTIES</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#R-25-OBJECT-PROPERTY-DOMAIN"><span class="tocnumber">3</span> <span class="toctext">R-25-OBJECT-PROPERTY-DOMAIN</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#R-26-DATA-PROPERTY-DOMAIN"><span class="tocnumber">4</span> <span class="toctext">R-26-DATA-PROPERTY-DOMAIN</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## R-28-OBJECT-PROPERTY-RANGE 

[http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/35](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/35)

"Natural" (RDF) language:

<pre>
The property oer:addressCountry should be used in statements with objects of type oer:Country.
</pre>

Constraint expression - DSP:

<table class="wikitable">
  <tr>
    <th>Antoine, DSP XML, 14-09-15
    </th>
    <th>Thomas, RDF/Turtle, for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
&lt;DescriptionTemplate ID="postalAddress" minOccur="1" maxOccur="1"&gt;
&lt;ResourceClass&gt;http://example.org/PostalAddress &lt;/ResourceClass&gt;
&lt;StatementTemplate type="nonliteral"&gt;
&lt;Property&gt;http://example.org/addressCountry&lt;/Property&gt;
&lt;NonLiteralConstraint descriptionTemplateRef="country"&gt;
&lt;ValueClass&gt;http://example.org/Country&lt;/ValueClass&gt;
&lt;/NonLiteralConstraint&gt;
&lt;/StatementTemplate&gt;
&lt;/DescriptionTemplate&gt;
</pre>
      <p>NB: it represents constraint only in the context of records that describes instances of oer:Address, not in general!
      </p>
    </td>
    <td>
      <pre>
    :postalAddress
        a dsp:DescriptionTemplate ;
        dsp:minOccur "1"^^xsd:nonNegativeInteger ; 
        dsp:maxOccur "infinity"^^xsd:string ; 
        dsp:resourceClass oer:PostalAddress ; 
        dsp:statementTemplate [
            a dsp:NonLiteralStatementTemplate ;
            dsp:minOccur "1"^^xsd:nonNegativeInteger ; 
            dsp:maxOccur "infinity"^^xsd:string ; 
            dsp:property oer:addressCountry ; 
            dsp:nonLiteralConstraint [ 
                a dsp:NonLiteralConstraint ;
                dsp:valueClass oer:Country ] ] .
</pre>
    </td>
  </tr>
</table>


Constraint expression - OWL, to be interpreted according to closed world assumption:

<pre>
oer:addressCountry a owl:ObjectProperty .
oer:addressCountry rdfs:range oer:Country .
</pre>

Data OK:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress rdf:type oer:PostalAddress .
ex:myAddress oer:addressCountry ex:netherlands .
ex:netherlands rdf:type oer:Country .
</pre>
    </td>
    <td>
      <pre>
ex:myAddress rdf:type owl:Thing .
ex:netherlands rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 1:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress rdf:type oer:PostalAddress .
ex:myAddress oer:addressCountry ex:amsterdam .
ex:amsterdam rdf:type oer:Locality . #the type is wrong
</pre>
    </td>
    <td>
      <pre>
ex:myAddress rdf:type owl:Thing .
ex:amsterdam rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 2:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress rdf:type oer:PostalAddress .
ex:myAddress oer:addressCountry ex:amsterdam . #there is no type!
</pre>
    </td>
    <td>
      <pre>
ex:myAddress rdf:type owl:Thing .
ex:amsterdam rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>

## R-68-REQUIRED-PROPERTIES 

[http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75)

Natural language:

<pre>
(OER) Organizations are required to have a name.
</pre>

Constraint expression - DSP:

<table class="wikitable">
  <tr>
    <th>Antoine, DSP XML, 14-09-15
    </th>
    <th>Thomas, RDF/Turtle, for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
&lt;DescriptionTemplate ID="organization" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
&lt;ResourceClass&gt;http://example.org/Organization&lt;/ResourceClass&gt;
&lt;StatementTemplate minOccurs="1" &gt;
&lt;Property&gt;http://example.org/name&lt;/Property&gt;
&lt;/StatementTemplate&gt;
&lt;/DescriptionTemplate&gt;
</pre>
    </td>
    <td>
      <pre>
    :organizationDescriptionTemplate
        a dsp:DescriptionTemplate ;
        dsp:minOccur "1"^^xsd:nonNegativeInteger ;
        dsp:maxOccur "infinity"^^xsd:string ;
        dsp:resourceClass oer:Organization ;
        dsp:statementTemplate [
            a dsp:NonLiteralStatementTemplate ;
            dsp:minOccur "1"^^xsd:nonNegativeInteger ;
            dsp:maxOccur "infinity"^^xsd:string ;
            dsp:property oer:name ] .
</pre>
    </td>
  </tr>
</table>


Constraint expression - OWL, to be interpreted according to closed world assumption:

<pre>
oer:Organization rdf:subClassOf [
rdf:type owl:Restriction .
owl:onProperty oer:name .
owl:minCardinality "1"^^xsd:nonNegativeInteger .
]
</pre>

Data OK:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:dcmi rdf:type oer:Organization .
ex:myAddress oer:name "Dublin Core Metadata Initiative" .
</pre>
    </td>
    <td>
      <pre>ex:dcmi rdf:type owl:Thing , owl2spin:ToInfer .</pre>
    </td>
  </tr>
</table>


Data not OK:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:dcmi rdf:type oer:Organization . #there is no name!
</pre>
    </td>
    <td>
      <pre>ex:dcmi rdf:type owl:Thing , owl2spin:ToInfer .</pre>
    </td>
  </tr>
</table>

## R-25-OBJECT-PROPERTY-DOMAIN 

[http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/32](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/32)

"Natural" (RDF/OWL) language:

<pre>The object property oer:addressCountry applies to resources of type oer:PostalAddress.</pre>

Constraint expression - DSP:

<pre>N/A (DSP doesn't seem to allow constraints for domains of properties, independently from constraints expressed on classes as per a Description Template)</pre>

Constraint expression - OWL, to be interpreted according to closed world assumption:

<pre>
oer:addressCountry rdf:type owl:ObjectProperty ;
oer:addressCountry rdfs:domain oer:PostalAddress .
</pre>

Data OK:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress rdf:type oer:PostalAddress .
ex:myAddress oer:addressCountry ex:netherlands .
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:netherlands rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 1:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:me rdf:type oer:Person .
ex:me oer:addressCountry ex:netherlands . #the type is wrong!
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:netherlands rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 2:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress oer:addressCountry ex:netherlands . #the type is missing!
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:netherlands rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>

## R-26-DATA-PROPERTY-DOMAIN 

[http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/33](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/33)

"Natural" (RDF/OWL) language:

<pre>The datatype property oer:addressStreet applies to resources of type oer:PostalAddress.</pre>

Constraint expression - DSP:

<pre>N/A (DSP doesn't seem to allow constraints for domains of properties, independently from constraints expressed on classes as per a Description Template)</pre>

Constraint expression - OWL, to be interpreted according to closed world assumption:

<pre>
oer:addressStreet rdf:type owl:DatatypeProperty ;
oer:addressStreet rdfs:domain oer:PostalAddress .
</pre>

Data OK:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress rdf:type oer:PostalAddress .
ex:myAddress oer:addressStreet "Prins Hendrikkade" .
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 1:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:me rdf:type oer:Person .
ex:me oer:addressStreet "Prins Hendrikkade" . #the type is wrong!
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


Data not OK - example 2:

<table class="wikitable">
  <tr>
    <th>Antoine, 14-09-15
    </th>
    <th>Thomas, triples needed for validation
    </th>
  </tr>
  <tr>
    <td>
      <pre>
ex:myAddress oer:addressStreet "Prins Hendrikkade" . #the type is missing!
</pre>
    </td>
    <td>
      <pre>ex:myAddress rdf:type owl:Thing .
ex:me rdf:type owl:Thing .
</pre>
    </td>
  </tr>
</table>


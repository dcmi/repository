---
title: OER-world-map
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/OER-world-map.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 28 October 2014, at 13:37.  
This page has been accessed 65,956 times.

_Use case submitted by Adrian Pohl ( [hbz](http://www.hbz-nrw.de))._

**This case study in the RDF validation database:** [http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/416](http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/416).

The hbz has built a prototype for an Open Educational Resources (OER) world map, see the [project report](https://wiki1.hbz-nrw.de/x/tYGv). The data of the OER map prototype covers descriptions of organizations, persons, services and projects. In this context efforts were made to develop a formal description of the application profile in RDF.

For the OER world map a read/write API was developed as well as an application (Drupal) for viewing, adding, deleting and editing the data. (See the [image of the architecture](http://wiki1.hbz-nrw.de/download/attachments/10455419/OER-worldmap-arch4.png).)

Both API and application need some specifications which we would like to express in an RDF application profile. While the API mainly needs information for validating incoming data, the application also needs information about presenting the data (result lists, single results, forms for editing the different resources). Below is a list of the specifications needed.

**Note:** The following overview heavily uses terms from RDF Schema and OWL, but does this somehow metaphorically as an application profile is 'not' an ontology or vocabulary. To make this clear, here an overview over the differences between ontologies/vocabs and application profiles.

- An ontology has a global scope, i.e. it applies to any use of the defined properties and classes. The scope of an application profile is limited to an application or a community. 
- An AP mixes different vocabs while a single vocabulary mainly defines terms in one namespace (and may import terms from other ontologies).
- Ontologies are created for reasoning/inferencing purposes, whereas APs are created for purposes of validation and/or data presentation.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Validation_.28API.29"><span class="tocnumber">1</span> <span class="toctext">Validation (API)</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Viewing_and_editing_.28application.29"><span class="tocnumber">2</span> <span class="toctext">Viewing and editing (application)</span></a></li>
        <li class="toclevel-1 tocsection-3">
          <a href="#Draft_RDF_application_profile_.26_requirements_for_an_RDF_AP"><span class="tocnumber">3</span> <span class="toctext">Draft RDF application profile &amp; requirements for an RDF AP</span></a>
          <ul>
            <li class="toclevel-2 tocsection-4"><a href="#Prefixes"><span class="tocnumber">3.1</span> <span class="toctext">Prefixes</span></a></li>
            <li class="toclevel-2 tocsection-5">
              <a href="#General_requirements_for_an_AP"><span class="tocnumber">3.2</span> <span class="toctext">General requirements for an AP</span></a>
              <ul>
                <li class="toclevel-3 tocsection-6"><a href="#Stating_the_document.27s_type_.28.22application_profile.22.29"><span class="tocnumber">3.2.1</span> <span class="toctext">Stating the document's type ("application profile")</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#Providing_information_about_the_AP_as_a_whole"><span class="tocnumber">3.2.2</span> <span class="toctext">Providing information about the AP as a whole</span></a></li>
                <li class="toclevel-3 tocsection-8"><a href="#Provide_human-readable_description_of_property.2Fclass_usage"><span class="tocnumber">3.2.3</span> <span class="toctext">Provide human-readable description of property/class usage</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-9">
              <a href="#Requirements_for_validation"><span class="tocnumber">3.3</span> <span class="toctext">Requirements for validation</span></a>
              <ul>
                <li class="toclevel-3 tocsection-10"><a href="#Identify_an_element.2Fclass_and_its_relation_to_AP.2C_indicate_the_refined_property.2Fclass"><span class="tocnumber">3.3.1</span> <span class="toctext">Identify an element/class and its relation to AP, indicate the refined property/class</span></a></li>
                <li class="toclevel-3 tocsection-11"><a href="#Define_object_restrictions_for_properties"><span class="tocnumber">3.3.2</span> <span class="toctext">Define object restrictions for properties</span></a></li>
                <li class="toclevel-3 tocsection-12"><a href="#Define_cardinality_restrictions_for_properties"><span class="tocnumber">3.3.3</span> <span class="toctext">Define cardinality restrictions for properties</span></a></li>
                <li class="toclevel-3 tocsection-13"><a href="#.28X.29OR_rules"><span class="tocnumber">3.3.4</span> <span class="toctext">(X)OR rules</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-14">
              <a href="#Requirements_for_building_a_web_application"><span class="tocnumber">3.4</span> <span class="toctext">Requirements for building a web application</span></a>
              <ul>
                <li class="toclevel-3 tocsection-15"><a href="#Define_types_of_resources_to_generate_web_forms_for"><span class="tocnumber">3.4.1</span> <span class="toctext">Define types of resources to generate web forms for</span></a></li>
                <li class="toclevel-3 tocsection-16"><a href="#Define_labels_for_presentation_of_properties_on_webpages.2Fweb_forms"><span class="tocnumber">3.4.2</span> <span class="toctext">Define labels for presentation of properties on webpages/web forms</span></a></li>
                <li class="toclevel-3 tocsection-17"><a href="#Define_order_of_properties_for_presentation.2Fweb_form"><span class="tocnumber">3.4.3</span> <span class="toctext">Define order of properties for presentation/web form</span></a></li>
                <li class="toclevel-3 tocsection-18"><a href="#Differentiate_between_text_boxes_and_small_input_fields"><span class="tocnumber">3.4.4</span> <span class="toctext">Differentiate between text boxes and small input fields</span></a></li>
                <li class="toclevel-3 tocsection-19"><a href="#Define_API_endpoints_to_be_queried_in_the_web_form_for_interlinking"><span class="tocnumber">3.4.5</span> <span class="toctext">Define API endpoints to be queried in the web form for interlinking</span></a></li>
                <li class="toclevel-3 tocsection-20"><a href="#Define_values_to_be_shown_for_a_linked_resource"><span class="tocnumber">3.4.6</span> <span class="toctext">Define values to be shown for a linked resource</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Validation (API) 

- _Classes_: What types of resources (rdf:type) can be submitted? - Answer: schema:Organization, schema:Person, schema:Service, foaf:Project
- _Properties_: What properties can be used?
- _Domain_: On which types can the properties be used?
- _Range_: What values are expected on the different properties? (Instances of which classes on object properties, what kind of data types or regex pattern on datatype properties, terms/concepts from what controlled vocabulary/concept scheme?)
- _Cardinality_: What is the cardinality of the different properties (which properties are obligatory, optional, repeatable)?
- ...?...

## Viewing and editing (application) 

- _Validation_: The application needs the above specifications for validating form input.
- _Labels_: What labels should be used for the different RDF properties?
- _Order_: What properties need to be shown on the different types in different contexts (result list, single result, web form etc.)?
- _Displaying links_: How should links to other resources be displayed (e.g. label + underlying link to the resource)?
- ...?...

# Draft RDF application profile & requirements for an RDF AP 

See [http://git.io/LD\_H9w](http://git.io/LD_H9w) for the current application profile that is already used to generate the Drupal forms. For the start, we implemented an OWL-based AP, quite similar to [this approach](http://clarkparsia.com/pellet/icv) and added information not covered by this approach with properties from the [http://example.org/](http://example.org/) namespace. Though we specified information needed both for the validation and the presentation of data, we realized one would better seperate these aspects in two different documents. Thus, people only interested in validating data wouldn't be bothered with all the additional information that is provided for presentation purposed. Also, different applications built on the same data provided by an API would each need a different AP.

Here is a list of all the functions an AP should fulfill (distinguished by genereal requirements and requirements for presentation and validation) and how we addressed the needs in the draft AP (if we did at all).

**Note:** As we had this prototype to get going quickly, we didn't immerse ourselves in long discussions about the best way to go but relied heavily on workarounds that we would not implement in a production system.

## Prefixes 

The examples below are written in [Turtle](http://www.w3.org/TR/2014/REC-turtle-20140225/) and the following prefixes are used:

<pre>
@prefix : &lt;#&gt; .
@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .
@prefix dct: &lt;http://purl.org/dc/terms/&gt; .
@prefix ex: &lt;http://example.org/&gt; .
@prefix foaf: &lt;http://xmlns.com/foaf/0.1/&gt; .
@prefix marcrel: &lt;http://id.loc.gov/vocabulary/relators/&gt; .
@prefix oo: &lt;http://purl.org/openorg/&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix owl: &lt;http://www.w3.org/2002/07/owl#&gt; .
@prefix schema: &lt;http://schema.org/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
@prefix gn: &lt;http://www.geonames.org/ontology#&gt; .
</pre>
## General requirements for an AP 

### Stating the document's type ("application profile")

Currently, no RDF type for application profiles exists. That's why we used the class ex:ApplicationProfile like this:

<pre> 
@prefix owl: &lt;http://www.w3.org/2002/07/owl#&gt; .
@prefix ex: &lt;http://example.org/&gt; .

:ap a owl:Ontology , ex:ApplicationProfile . </pre>
### Providing information about the AP as a whole 

E.g.:

<pre> ;
    dct:created "2014-02-24" ;
    dc:rights "This application profile is available under the Creative Commons Public Domain Dedication (CC0)" ;
    dct:rights &lt;http://creativecommons.org/publicdomain/zero/1.0/&gt; .
</pre>
### Provide human-readable description of property/class usage 

We used rdfs:comment for this. Example:

<pre>
:description
    rdfs:comment "In the context of this application profile the property schema:description is used to give a description of a person, organization, project, or service."@en .
</pre>
## Requirements for validation 

### Identify an element/class and its relation to AP, indicate the refined property/class 

A first [approach](https://wiki1.hbz-nrw.de/x/aIaf) was to use the OAI ORE proxy construct to identify a property/class and its relation to the property/class it refines as well as its relation to the AP. We then switched to only using OWL (see this [commit](https://github.com/hbz/oerworldmap/commit/907b99207aba4496b89246bcb20a84fa7ecf6168)) with document-relative IDs for the properties and rdfs:subPropertyOf to state their relationship to the refined property and rdfs:isDefinedBy to state the relationship to the AP. Example (in turtle):

<pre>
:description
    a rdf:Property ;
    rdfs:subPropertyOf schema:description ;
    rdfs:isDefinedBy :ap .
</pre><pre>
:Person
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    rdfs:subClassOf schema:Person .
</pre>
### Define object restrictions for properties 

One important function of an AP is to define what kind of object should be used with a specific property within an application: another resource (URI) (if yes, of which type) or a literal value (if yes, with what kind of restrictions). We used the combination of property type (owl:ObjectProperty, owl:DatatypeProperty) with rdfs:range for this. Examples:

<pre>
:description
    a owl:DatatypeProperty ;
    rdfs:range rdf:HTML .
</pre>

<pre>
:logo
    a owl:ObjectProperty ;
    rdfs:range foaf:Image .
</pre><pre>
:email
    a owl:DatatypeProperty ;
    rdfs:comment "In the context of this application profile the property schema:email is used to indicate the email address of a person, organization, project, or service. The literal should conform to this regular expression: [A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}"@en ;
    rdfs:subPropertyOf schema:email ;
    rdfs:isDefinedBy :ap ;
    rdfs:range [
      a rdfs:Datatype ;
      owl:onDatatype xsd:string ;
      owl:withRestrictions (
        [
            xsd:pattern "[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}"
        ]
      )
    ] .
</pre><pre>
:startDate
    a owl:DatatypeProperty ;
    rdfs:comment "In the context of this application profile the property schema:startDate is used to indicate the start date of a project using the xsd:gYearMonth datatype."@en ;
    rdfs:subPropertyOf schema:startDate ;
    rdfs:isDefinedBy :ap ;
    rdfs:label "Start date"@en ;
    rdfs:label "Beginn"@de ;
    rdfs:range xsd:gYearMonth .
</pre>

For some use cases (e.g. restricting range to members of specific controlled vocabulary) it would make sense to indicate a namespace allowed resource URIs should be from. We didn't need such a function in this prototypem though.

### Define cardinality restrictions for properties 

Cardinality restrictions are usually bound to the use of a property on an instance of a specified class. As frequently done, we used owl:Restriction for this. E.g. to say that a person should exactly have one name:

<pre>
:Person
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    rdfs:subClassOf schema:Person ,
    [ a owl:Restriction ;
        owl:onProperty :name ;
        owl:cardinality "1" ] .
</pre>

Or, e.g., to say that an organisation _can_ have a memberOf relation:

<pre>
:Organization
        rdfs:subClassOf schema:Organization ,
        [ a owl:Restriction ;
        owl:onProperty :memberOf ;
        owl:minCardinality "0" ] .
</pre>

### (X)OR rules 

At one point we would have liked to indicate cardinality relations between two elements like: a&nbsp;:PostalAddress has at least one&nbsp;:postOfficeBoxNumber statement OR at least one&nbsp;:streetAddress statement (actually, we had more an [XOR](http://en.wikipedia.org/wiki/Exclusive_or) rule in mind). We moved away from implementing this in the prototype as we couldn't think of an easy to implement workaround.

## Requirements for building a web application 

These include requirements for presenting the data as HTML/RDFa and generating a web form for creating/editing/linking the data.

### Define types of resources to generate web forms for 

The question here is how to indicate to an application how many different web forms for which different types of resources should be generated. We solved this by defining the range of the rdf:type property:

<pre>
:type
    a owl:ObjectProperty ;
    rdfs:comment "In the context of this application profile the property rdf:type is used to indicate the type of a resource (person, organization, project, or service)."@en ;
    rdfs:subPropertyOf rdf:type ;
    rdfs:isDefinedBy :ap ;
    rdfs:label "Type"@en ;
    rdfs:label "Typ"@de ;
    rdfs:range [
      a owl:Class ;
      owl:oneOf ( :Organization :Service :Person :Project )
</pre>

The **problem** with this approach is that it also forbids to provide other (more specific) type information which we sometimes would have liked to add.

### Define labels for presentation of properties on webpages/web forms 

We used rdfs:label with language tags for this. We applied this in two ways. If the same label is used for one property across the whole application we used it on the property, e.g.:

<pre>
:description
    rdfs:label "Description"@en ;
    rdfs:label "Beschreibung"@de .
</pre>

If one property was used in the context of different types of resources with different labels, we used a workaround, applying rdfs:label on the class restriction, e.g.:

<pre>
:Person
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    rdfs:subClassOf schema:Person ,
    [ a owl:Restriction ;
        owl:onProperty :alternateName ;
        rdfs:label "Nick name"@en ;
        owl:minCardinality "0" ] .
</pre>
### Define order of properties for presentation/web form 

The order should be adaptable seperately for each resource type. We didn't use a RDF-solution for this but just took the sequence as enumerated for each resource type in the Turtle document. (This, obviuously, couldn't workm if somebody transformed the AP to N-Triples or something else before implementation.) Example:

<pre>
:Service
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    ex:labelProperties ( :name ) ;
    rdfs:subClassOf schema:Service ,
    [ a owl:Restriction ;
        owl:onProperty :name ;
        owl:cardinality "1" ] ,
    [ a owl:Restriction ;
        owl:onProperty :alternateName ;
        owl:minCardinality "0" ] ,
    [ a owl:Restriction ;
        owl:onProperty :description ;
        owl:minCardinality "1" ] ,
    [ a owl:Restriction ;
        owl:onProperty :url ;
        owl:minCardinality "0" ] .
</pre>

--> This was inteprreted as the sequence of properties&nbsp;:name,&nbsp;:alternateName,&nbsp;:description,&nbsp;:url.

### Differentiate between text boxes and small input fields 

For the input form, one has to distinguish between small input fields (e.g. for name, phone number etc.) and larger text boxes (e.g. for description). We did this in the prorotype by applying different rdfs:range restrictions: rdfs:Literal for small input fields and rdf:HTML for bigger ones, e.g.:

<pre>
:description
    a owl:DatatypeProperty ;
    rdfs:range rdf:HTML .
</pre><pre>
:name
    a owl:DatatypeProperty ;
    rdfs:range rdfs:Literal .
</pre>
### Define API endpoints to be queried in the web form for interlinking 

A web form for creating linked data should include the possibility to query for resources to link to. These resources may reside within the same application or within third-party data sets. In our case both the lobid OER API as well as the GeoNames API are queried for interlinking. We created draft properties for this that met our specific requirements.

<pre>
&lt;http://api.geonames.org/search&gt;
    a ex:endpoint ;
    ex:queryParam "q" ;
    ex:offsetParam "startRow" ;
    ex:limitParam "maxRows" ;
    ex:additionalParam "username=literarymachine" , "type=rdf";
    ex:resultFormat "application/rdf+xml" ;
    ex:supplies :Locality , :Country .
</pre><pre>
&lt;http://api.lobid.org/oer&gt;
    a ex:endpoint ;
    ex:queryParam "q" ;
    ex:typeParam "t" ;
    ex:offsetParam "from" ;
    ex:limitParam "size" ;
    ex:resultFormat "application/rdf+xml" ;
    ex:supplies :Organization , :Service , :Person , :Project .
</pre>
### Define values to be shown for a linked resource 

If I present linked data in HTML I might not want to show the URI of a linked resource but the values of specific properties instead, e.g. show a name of an organisation rather than its URI. We indicated the properties to be shown with ex:labelProperties like this:

<pre>
:Person
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    ex:labelProperties ( :name ) .
</pre><pre>
:PostalAddress
    a owl:Class ;
    rdfs:isDefinedBy :ap ;
    ex:labelProperties ( :streetAddress :postalCode ) ;
</pre>

[RDF-Application-Profiles](/index.php?title=RDF_Application_Profiles&action=edit&redlink=1 "RDF\_Application\_Profiles (page does not exist)")


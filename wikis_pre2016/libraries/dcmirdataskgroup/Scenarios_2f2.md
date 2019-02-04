---
title: "- Scenarios/2"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f2.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/2](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=fullsearch&value=%2F2&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f2">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f2_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f2_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 2
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.2 $ by $Author: alimanfoo $ on $Date: 2008/11/29 13:33:07 $

# standard namespaces
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

# rda, frbr namespaces
@prefix rda: &lt;http://RDVocab.info/Elements/&gt; . 
@prefix rdarole: &lt;http://RDVocab.info/roles/&gt; .
@prefix frbr: &lt;http://purl.org/vocab/frbr/core#&gt; . # TODO replace with IFLA namespace when declared?

# placeholder for unknown vocabulary
@prefix v: &lt;http://example.com/unknown-vocabulary/&gt; . 

# example namespace for things described in this scenario
@prefix ex: &lt;http://www.example.com/rda-scenarios/2/&gt; .

# begin scenario #
##################

# ==== Scenario 2: A collected work ====

# ''Jane Cataloger selects a second item to catalog from her gift collection.  
# This item is a festschrift in honor of an environmental activist who died young, 
# containing contributions by a number of important writers in the field.  
# Jane begins by searching the library database and publisher databases for the 
# collection itself. She finds an existing record for the collection as a work, 
# from an ONIX record contributed by the publisher. She uses that record as a 
# basis for the work description, adding a subject heading for the collection 
# and a link to an existing authority record for the honoree and another to the 
# editor of the collection.''

ex:A rdf:type frbr:Work ;
    rdarole:editor ex:B ; # Editor: Ambrose Watts
    rda:preferredTitleForTheWork "Our collective environment: essays in honor of Pauline Warner"@en ; # Preferred Title for the Work
    dcterms:subject ex:C ; # Subject: Natural resources--Management
    rdarole:honouree ex:D ; # Honoree: Pauline Warner
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
.

ex:B rdf:type frbr:Person ;
    rdfs:label "Ambrose Watts" ;
.

ex:C rdf:type frbr:Subject ;
    rdfs:label "Natural resources--Management"@en ;
    # TODO this comes from a subject heading system? which one?
.

ex:D rdf:type frbr:Person ;
    rdfs:label "Pauline Warner" ;
.

# ''Since her institution has a strong environmental program, she also creates 
# work records for each of the contributions, and links them to the collection 
# using relationship links and identifiers to and from the individual 
# contributions. This allows the collected work to reflect the parts, and the 
# contribution records to relate to the collection. Example:''

ex:E frbr:part ex:F .

ex:F rdf:type frbr:Work ;    
    dcterms:creator ex:G ; # Author: Marcelline Probst
    rdarole:author ex:G ;
    rda:preferredTitleForTheWork "Some compelling biodiversity issues in natural resources management"@en ; # Preferred Title for the Work 
    dcterms:subject ex:C ; # Subject: Natural resources--Management
    rda:formOfWork v:Essay ; # Form of Work: Essay
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
.

ex:G rdf:type frbr:Person ;
    rdfs:label "Marcelline Probst" ;
.

# ''She creates an expression record for each work (including the collected 
# work), with language and content type elements. Example:''

ex:E frbr:realization ex:H . # Link from collected work to expression of collected work

ex:H rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

ex:F frbr:realization ex:I . # Link from work (part of collection) to expression 

ex:I rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

# TODO say that one expression is part of another, or redundant because already
# asserted part relationship between works?
# E.g. could say...
# ex:H frbr:part ex:I .

# ''She uses information in the ONIX record to create a manifestation record for 
# the collection (which will also be linked to and from the expression records 
# for the parts).''

ex:H frbr:embodiment &lt;urn:isbn:0723888560&gt; . # Link from expression of collection to manifestation

&lt;urn:isbn:0723888560&gt; rdf:type frbr:Manifestation ;
    rda:placeOfProduction ex:J ; # Place of Production: Boston
    rda:publisher ex:K ; # Publisher: Beacon Press
    rda:dateOfProduction "2006"^^xsd:year ; # Date of Production: 2006.
    rda:extentOfText "240 pages" ; # Extent: 240 pages
    rda:identifierForTheManifestation "ISBN:0723888560" ; # ISBN: 0723888560
.

# ''She creates authority records as required.''

ex:J rdf:type frbr:Place ;
    rdfs:label "Boston"@en ;
.

ex:K rdf:type frbr:CorporateBody ;
    rdfs:label "Beacon Press"@en ;
.</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfProduction

- rda:extentOfText

- rda:formOfWork

- rda:identifierForTheManifestation

- rda:languageOfExpression

- rda:languageOfWork

- rda:placeOfProduction

- rda:preferredTitleForTheWork

- rda:publisher

##### Properties Required by This Scenario, Not Defined in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


##### Properties Required by This Scenario, Deprecated in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


#### RDA Roles Vocabulary

##### All Properties Required by This Scenario

- rdarole:author

- rdarole:editor

- rdarole:honouree

##### Properties Required by This Scenario, Not Defined in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


##### Properties Required by This Scenario, Deprecated in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


#### FRBR Core Vocabulary

##### All Properties Required by This Scenario

- frbr:embodiment

- frbr:part

- frbr:realization

##### Properties Required by This Scenario, Not Defined in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


##### All Classes Required by This Scenario

- frbr: [CorporateBody](http://dublincore.org/dcmirdataskgroup/CorporateBody)

- frbr:Expression

- frbr:Manifestation

- frbr:Person

- frbr:Place

- frbr:Subject

- frbr:Work

##### Classes Required by This Scenario, Not Defined in Vocabulary

<table>
  <tbody>
    <tr>
      <td>
        [none] </td>
    </tr>
  </tbody>
</table>


* * *

### Scenario Metadata as RDF (RDF/XML Format)
<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;rdf:RDF
   xmlns:dcterms="http://purl.org/dc/terms/"
   xmlns:frbr="http://purl.org/vocab/frbr/core#"
   xmlns:rda="http://RDVocab.info/Elements/"
   xmlns:rdarole="http://RDVocab.info/roles/"
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/A"&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Our collective environment: essays in honor of Pauline Warner&lt;/rda:preferredTitleForTheWork&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/2/C"/&gt;
    &lt;rdarole:honouree rdf:resource="http://www.example.com/rda-scenarios/2/D"/&gt;
    &lt;rdarole:editor rdf:resource="http://www.example.com/rda-scenarios/2/B"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/F"&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/2/G"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/2/I"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Some compelling biodiversity issues in natural resources management&lt;/rda:preferredTitleForTheWork&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/2/C"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/Essay"/&gt;
    &lt;dcterms:creator rdf:resource="http://www.example.com/rda-scenarios/2/G"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="urn:isbn:0723888560"&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/2/J"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/2/K"/&gt;
    &lt;rda:extentOfText&gt;240 pages&lt;/rda:extentOfText&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:identifierForTheManifestation&gt;ISBN:0723888560&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:dateOfProduction rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2006&lt;/rda:dateOfProduction&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/E"&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/2/H"/&gt;
    &lt;frbr:part rdf:resource="http://www.example.com/rda-scenarios/2/F"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/B"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
    &lt;rdfs:label&gt;Ambrose Watts&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/J"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
    &lt;rdfs:label xml:lang="en"&gt;Boston&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/C"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Subject"/&gt;
    &lt;rdfs:label xml:lang="en"&gt;Natural resources--Management&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/H"&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;frbr:embodiment rdf:resource="urn:isbn:0723888560"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/K"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
    &lt;rdfs:label xml:lang="en"&gt;Beacon Press&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/G"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
    &lt;rdfs:label&gt;Marcelline Probst&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/D"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
    &lt;rdfs:label&gt;Pauline Warner&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/2/I"&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2?action=refresh&arena=Page.py&key=Scenarios_2f2.text_html) for this page (cached 2013-01-04 16:55:47)  

Immutable page (last edited 2008-12-22 12:48:00 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


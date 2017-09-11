---
title: "- Scenarios/5"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f5.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/5](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=fullsearch&value=%2F5&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f5">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f5_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f5_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 5
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.1 $ by $Author: alimanfoo $ on $Date: 2008/11/29 15:20:55 $

# standard namespaces
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix owl: &lt;http://www.w3.org/2002/07/owl#&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .

# rda, frbr namespaces
@prefix rda: &lt;http://RDVocab.info/Elements/&gt; . 
@prefix rdarole: &lt;http://RDVocab.info/roles/&gt; .
@prefix frbr: &lt;http://purl.org/vocab/frbr/core#&gt; . # TODO replace with IFLA namespace when declared?

# placeholder for unknown vocabulary
@prefix v: &lt;http://example.com/unknown-vocabulary/&gt; . 

# example namespace for things described in this scenario
@prefix ex: &lt;http://www.example.com/rda-scenarios/5/&gt; .

# begin scenario #
##################

# ==== Scenario 5: Musical score ====

# ''[Contributed by Kathy Glennan]''

# ''Jane Cataloger next picks up a musical score, an arrangement of Luigi 
# Boccherini's Concerto in D major op. 34 for violoncello and orchestra, edited, 
# with cadenzas and piano reduction by Luigi Silva.''

# ''She searches the library database for the original work and finds:''

ex:A rdf:type frbr:Work ;
    rdarole:author ex:B ; # Author: Luigi Boccherini
    rda:preferredTitleForTheWork "Concertos"@en ; # Preferred title for the work: Concertos
    rda:mediumOfPerformanceOfMusicalContent "violoncello"@en ; # Medium of performance: violoncello
    rda:mediumOfPerformanceOfMusicalContent "orchestra"@en ; # Medium of performance: orchestra
    rda:numericDesignation "G. 483"^^xsd:string ; # Numeric designation: G. 483
    rda:key "D major"@en ; # Key: D major
    rda:variantTitleForTheWork "Concertos, violoncello, orchestra, no. 10, D major"@en ; # Variant title
    rda:variantTitleForTheWork "Concertos, violoncello, orchestra, op. 34, D major"@en ; # Variant title
.

ex:B rdf:type frbr:Person ;
    rdfs:label "Luigi Boccherini"@en ;
.

# ''with links to the following expression information:''

ex:A frbr:realization ex:C .

ex:C rdf:type frbr:Expression ;
    rda:mediumOfPerformanceOfMusicalContent "violoncello"@en ; # Medium of performance: violoncello    
    rda:mediumOfPerformanceOfMusicalContent "piano"@en ; # Medium of performance: piano
    rda:contentType v:NotatedMusic ; # Content type: notated music
    rda:languageOfExpression "none"^^xsd:string ; # Language of expression: none
    rda:note "arranged"@en ; # Additional attribute: arranged
.

# ''and the following manifestation:''

ex:C frbr:embodiment ex:D .

ex:D rdf:type frbr:Manifestation ;
    rda:placeOfProduction ex:E ; # Place of production: New York
    rda:publisher ex:F ; # Publisher: Franco Colombo, Inc.
    rda:dateOfCopyright "1964"^^xsd:year ; # Copyright date: 1964
    rda:extentOfNotatedMusic "1 score (38 pages) &amp; 1 part (11 pages)"@en ; # Extent of notated music
    rda:plateNumber "N.Y. 1941"^^xsd:string ; # Resource identifier: Plate number: N.Y. 1941
    rda:statementOfResponsibility "Luigi Boccherini"@en ; # Statement of responsibility
    rda:statementOfResponsibility "edited, with cadenzas and piano reduction by Luigi Silva"@en ; # Statement of responsibility
.

ex:E rdf:type frbr:Place ;
    rdfs:label "New York"@en ;
.

ex:F rdf:type frbr:CorporateBody ;
    rdfs:label "Franco Colombo, Inc."@en ;
.

# ''(other manifestations in the library catalog include three separate ms. 
# versions of the above; a full score edited by Aldo Pais; a violoncello and 
# piano manifestation edited by Aldo Pais; a collection of 6 violoncello 
# concertos by Boccherini, of which this composition is #6, edited by James 
# Collorafi; a collection of 6 violoncello concertos by Boccherini, of which 
# this composition is #6, edited by James Nicholas)''

# ''Theoretically, the work record for G. 483 could have a link to the 
# following work; however, since Jane cannot identify the actual title assigned 
# to the two cadenzas written by Silva, she does not create this work record:''

ex:A
    frbr:relatedEndeavour [
        rdarole:author ex:G ; # Author: Luigi Silva
        rda:preferredTitleForTheWork """[unknown, but probably close to "Cadenzas for Boccherini's Concerto for violoncello, opus 34"]"""@en ; # Preferred title for the work
        rda:mediumOfPerformanceOfMusicalContent "violoncello"@en ; # Medium of performance: violoncello
    ] ;
.

ex:G rdf:type frbr:Person ;
    rdfs:label "Luigi Silva"@en ;
.

# ''The work record should also be linked to the following related work:''

ex:A frbr:relatedEndeavour ex:H .

ex:H rdf:type frbr:Work ;
    rdarole:author ex:I ; # Author: Jerome Kessler
    rda:preferredTitleForTheWork "Cadenzas to Boccherini D maj. concerto, op. 34 (1st, 3d mov'ts)"@en ; # Preferred title for the work
    rda:mediumOfPerformanceOfMusicalContent "violoncello"@en ; # Medium of performance: violoncello
    rda:key "D major [assumed; not stated]"@en ; # Key: D major [assumed; not stated]
.

ex:I rdf:type frbr:Person ;
    rdfs:label "Jerome Kessler"@en ;
.

# ''This is linked to the following expression:''

ex:H frbr:realization ex:J .

ex:J rdf:type frbr:Expression ;
    rda:contentType v:NotatedMusic ; # Content type: notated music
    rda:languageOfExpression "none"^^xsd:string ; # Language of expression: none
.

# ''This is linked to the following manifestation:''

ex:J frbr:embodiment ex:K .

ex:K rdf:type frbr:Manifestation ;
    rda:placeOfProduction ex:L ; # Place of production: Los Angeles, Calif.
    rda:publisher ex:M ; # Publisher: I Cellisti Publications
    rda:dateOfCopyright "1980"^^xsd:year ; # Copyright date: 1980
    rda:extentOfNotatedMusic "1 score: (2 leaves)"@en ; # Extent: 1 score: (2 leaves)
    rda:note "Reproduced from holograph"@en ; # Other attribute: Reproduced from holograph
.
</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfCopyright

- rda:extentOfNotatedMusic

- rda:key

- rda:languageOfExpression

- rda:mediumOfPerformanceOfMusicalContent

- rda:note

- rda:numericDesignation

- rda:placeOfProduction

- rda:plateNumber

- rda:preferredTitleForTheWork

- rda:publisher

- rda:statementOfResponsibility

- rda:variantTitleForTheWork

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

- frbr:realization

- frbr:relatedEndeavour

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
   xmlns:frbr="http://purl.org/vocab/frbr/core#"
   xmlns:rda="http://RDVocab.info/Elements/"
   xmlns:rdarole="http://RDVocab.info/roles/"
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/H"&gt;
    &lt;rda:key xml:lang="en"&gt;D major [assumed; not stated]&lt;/rda:key&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Cadenzas to Boccherini D maj. concerto, op. 34 (1st, 3d mov'ts)&lt;/rda:preferredTitleForTheWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/5/J"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/5/I"/&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;violoncello&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/K"&gt;
    &lt;rda:dateOfCopyright rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1980&lt;/rda:dateOfCopyright&gt;
    &lt;rda:note xml:lang="en"&gt;Reproduced from holograph&lt;/rda:note&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:extentOfNotatedMusic xml:lang="en"&gt;1 score: (2 leaves)&lt;/rda:extentOfNotatedMusic&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/5/L"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/5/M"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/G"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Luigi Silva&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:nodeID="ZcdAObDc2347"&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;[unknown, but probably close to "Cadenzas for Boccherini's Concerto for violoncello, opus 34"]&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/5/G"/&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;violoncello&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/E"&gt;
    &lt;rdfs:label xml:lang="en"&gt;New York&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/B"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Luigi Boccherini&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/J"&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;none&lt;/rda:languageOfExpression&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/5/K"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/NotatedMusic"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/D"&gt;
    &lt;rda:dateOfCopyright rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1964&lt;/rda:dateOfCopyright&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:extentOfNotatedMusic xml:lang="en"&gt;1 score (38 pages) &amp;amp; 1 part (11 pages)&lt;/rda:extentOfNotatedMusic&gt;
    &lt;rda:plateNumber rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;N.Y. 1941&lt;/rda:plateNumber&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/5/E"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/5/F"/&gt;
    &lt;rda:statementOfResponsibility xml:lang="en"&gt;Luigi Boccherini&lt;/rda:statementOfResponsibility&gt;
    &lt;rda:statementOfResponsibility xml:lang="en"&gt;edited, with cadenzas and piano reduction by Luigi Silva&lt;/rda:statementOfResponsibility&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/I"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Jerome Kessler&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/C"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/5/D"/&gt;
    &lt;rda:note xml:lang="en"&gt;arranged&lt;/rda:note&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/NotatedMusic"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;none&lt;/rda:languageOfExpression&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;violoncello&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;piano&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/A"&gt;
    &lt;rda:key xml:lang="en"&gt;D major&lt;/rda:key&gt;
    &lt;rda:variantTitleForTheWork xml:lang="en"&gt;Concertos, violoncello, orchestra, op. 34, D major&lt;/rda:variantTitleForTheWork&gt;
    &lt;rda:variantTitleForTheWork xml:lang="en"&gt;Concertos, violoncello, orchestra, no. 10, D major&lt;/rda:variantTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:numericDesignation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;G. 483&lt;/rda:numericDesignation&gt;
    &lt;frbr:relatedEndeavour rdf:nodeID="ZcdAObDc2347"/&gt;
    &lt;frbr:relatedEndeavour rdf:resource="http://www.example.com/rda-scenarios/5/H"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Concertos&lt;/rda:preferredTitleForTheWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/5/C"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/5/B"/&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;violoncello&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
    &lt;rda:mediumOfPerformanceOfMusicalContent xml:lang="en"&gt;orchestra&lt;/rda:mediumOfPerformanceOfMusicalContent&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/5/F"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Franco Colombo, Inc.&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5?action=refresh&arena=Page.py&key=Scenarios_2f5.text_html) for this page (cached 2012-12-29 18:21:34)  

Immutable page (last edited 2008-12-22 12:48:33 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


---
title: "- Scenarios/1"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f1.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/1](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=fullsearch&value=%2F1&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f1">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f1_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f1_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 1
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.6 $ by $Author: alimanfoo $ on $Date: 2008/11/29 13:33:08 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/1/&gt; .

# begin scenario #
##################

# Jane Cataloger is assigned to work on a gift collection. Her first selection 
# is a Latvian translation of Kurt Vonnegut's "Bluebeard: a novel." She searches 
# the library database for the original work, and finds:

ex:A rdf:type frbr:Work ;
    frbr:creator ex:B ; 
    rdarole:author ex:B ; # Author: Kurt Vonnegut
    rda:preferredTitleForTheWork "Bluebeard: a novel"@en ; # Preferred Title for the Work: Bluebeard: a novel.
    rda:formOfWork v:Novel ; # Form of Work: Novel
.

ex:B rdf:type frbr:Person ;
    rdfs:label "Kurt Vonnegut";
.

# with links to the following expression information:
ex:A frbr:realization ex:C .

ex:C rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

# and one manifestation:
ex:C frbr:embodiment &lt;urn:isbn:0385295901&gt; .

&lt;urn:isbn:0385295901&gt; rdf:type frbr:Manifestation ;
    rda:editionStatement "1st trade edition" ; # Edition Statement: 1st trade edition.
    rda:placeOfProduction ex:E ; # Place of Production: New York
    rda:publishersName ex:F ; # Publisher's Name: Delacorte Press
    rda:dateOfProduction "1987"^^xsd:year ; # Date of Production: 1987
    rda:extentOfText "300 pages" ; # Extent: 300 pages
    rda:identifierForTheManifestation "ISBN:0385295901" ; # Resource Identifier: ISBN:0385295901
.

ex:E rdf:type frbr:Place ;
    rdfs:label "New York" ;
.

ex:F rdf:type frbr:CorporateBody ;
    rdfs:label "Delacorte Press" ;
.

# Jane begins her description by linking to the existing Work entity.
ex:A frbr:realization ex:G .

# She then creates an expression description:
ex:G rdf:type frbr:Expression ;
    rda:languageOfExpression "lv"^^dcterms:ISO639-2 ; # Language of Expression: Latvian
    rdarole:translator ex:H ; # Translator: Arvida Grigulis
.

# She creates an authority record for the translator since none yet existed.  
ex:H rdf:type frbr:Person ;
    rdfs:label "Arvida Grigulis" ;
.

# She continues by creating a fuller description for the new manifestation, 
# linking to the authority record for the Latvian publisher (what luck, it 
# already existed!).''
ex:G frbr:embodiment ex:I .

ex:I rdf:type frbr:Manifestation ;
    rda:titleProper "[in Latvian]"@lv ; # Title Proper: [in Latvian]
    rda:placeOfProduction ex:J ; # Place of Production: Riga
    rda:publishersName ex:K ; # Publisher's Name: Liesma
    rda:dateOfProduction "1997"^^xsd:year ; # Date of Production: 1997
. 

ex:J rdf:type frbr:Place ;
    rdfs:label "Riga" ;
.

ex:K rdf:type frbr:CorporateBody ;
    rdfs:label "Liesma" ;
.

</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfProduction

- rda:editionStatement

- rda:extentOfText

- rda:formOfWork

- rda:identifierForTheManifestation

- rda:languageOfExpression

- rda:placeOfProduction

- rda:preferredTitleForTheWork

- rda:publishersName

- rda:titleProper

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

- rdarole:translator

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

- frbr:creator

- frbr:embodiment

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
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/B"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
    &lt;rdfs:label&gt;Kurt Vonnegut&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/F"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
    &lt;rdfs:label&gt;Delacorte Press&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="urn:isbn:0385295901"&gt;
    &lt;rda:extentOfText&gt;300 pages&lt;/rda:extentOfText&gt;
    &lt;rda:publishersName rdf:resource="http://www.example.com/rda-scenarios/1/F"/&gt;
    &lt;rda:dateOfProduction rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1987&lt;/rda:dateOfProduction&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/1/E"/&gt;
    &lt;rda:identifierForTheManifestation&gt;ISBN:0385295901&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:editionStatement&gt;1st trade edition&lt;/rda:editionStatement&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/I"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:titleProper xml:lang="lv"&gt;[in Latvian]&lt;/rda:title&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/1/J"/&gt;
    &lt;rda:publishersName rdf:resource="http://www.example.com/rda-scenarios/1/K"/&gt;
    &lt;rda:dateOfProduction rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1997&lt;/rda:dateOfProduction&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/C"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;frbr:embodiment rdf:resource="urn:isbn:0385295901"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/G"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;lv&lt;/rda:languageOfExpression&gt;
    &lt;rdarole:translator rdf:resource="http://www.example.com/rda-scenarios/1/H"/&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/1/I"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/E"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
    &lt;rdfs:label&gt;New York&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/K"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
    &lt;rdfs:label&gt;Liesma&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/J"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
    &lt;rdfs:label&gt;Riga&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/A"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/1/B"/&gt;
    &lt;frbr:creator rdf:resource="http://www.example.com/rda-scenarios/1/B"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/Novel"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/1/C"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/1/G"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Bluebeard: a novel&lt;/rda:preferredTitleForTheWork&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/1/H"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
    &lt;rdfs:label&gt;Arvida Grigulis&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1?action=refresh&arena=Page.py&key=Scenarios_2f1.text_html) for this page (cached 2012-11-20 16:35:59)  

Immutable page (last edited 2011-03-14 19:25:34 by DianeHillmann)


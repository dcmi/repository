---
title: "- Scenarios/9"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f9.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/9](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=fullsearch&value=%2F9&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f9">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f9_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f9_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 9
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.2 $ by $Author: alimanfoo $ on $Date: 2008/12/22 16:23:46 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/9/&gt; .

# begin scenario #
##################

# === Scenario 9: Series with separate catalog entry ===

# ''Janet Cataloger works in an academic library that carries many
# esteemed research materials that are issued in known and revered
# series. Today she is cataloging the following book:

# (From the cover:)''

# CURRENT TOPICS IN MICROBIOLOGY AND IMMUNOLOGY
# 
# Anireddy S. N. Reddy
# Maxim Golovkin
# Editors
#
# Nuclear pre-mRNA 
# Processing 
# in Plants
#
# Springer

# ''Inside the book, she finds:''

# c 2008
# 
# Berlin, Springer

# ''She thinks she recognizes the series title, and looks it up in the
# catalog. There is a record in the catalog treating the series as an
# ongoing serial (although the format is listed as Journal). It reads
# in part:''

# Title: Current topics in microbiology and immunology = Ergebnisse der Mikrobiologie und Immunitätsforschung
# 
# Publisher: Berlin ; New York : Springer-Verlag, 1967-
# 
# Description: v. : ill. ; 26 cm
# 
# Publishing History: Irregular
# 
# Note: German title dropped with 76
# 
# Some vols. have also distinctive titles, 40-129; each v. has also a distinctive title, 130-&lt;167&gt;
# 
# ISSN 0070-217X

# ''Janet creates a record for the volume:''

# Work:

ex:W1 rdf:type frbr:Work ;
      rda:preferredTitleForTheWork "Nuclear pre-mRNA processing in plants"@en ; # Title of the work: Nuclear pre-mRNA processing in plants
      rda:dateOfWork "2008"^^xsd:year ; # Date of work: 2008
      dcterms:subject ex:S1 ; # Subject: Plant genetic regulation
      rdarole:editor ex:P1 ; # Editor: Reddy, Anireddy S. N.
      rdarole:editor ex:P2 ; # Editor: Golovkin, Maxim
.

ex:S1 rdf:type frbr:Subject ;
      rdfs:label "Plant genetic regulation"@en ;
.

ex:P1 rdf:type frbr:Person ;
      rdfs:label "Reddy, Anireddy S. N."@en ;
.

ex:P2 rdf:type frbr:Person ;
      rdfs:label "Golovkin, Maxim"@en ;
.

# Expression:

ex:W1 frbr:realization ex:E1 .

ex:E1 rdf:type frbr:Expression ;
      rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of expression: English
      rda:contentType v:Text ; # Content type: Text
.

# Manifestation

ex:E1 frbr:embodiment ex:M1 .

ex:M1 rdf:type frbr:Manifestation ;
      rda:titleProper "Nuclear pre-mRNA processing in plants"@en ; # Title proper: Nuclear pre-mRNA processing in plants
      rda:statementOfResponsibilityRelatingToTitle "Anireddy S. N. Reddy, Maxim Golovkin, Editors"@en ; # Statement of responsibility relating to title
      rda:placeOfPublication ex:PL1 ; # Place of publication: Berlin
      rda:publishersName "Springer"@en ; # Publisher's name: Springer
      rda:dateOfCopyright "2008"^^xsd:year ; # Copyright date: 2008
      rda:titleProperOfSeries "Current topics in microbiology and immunology"@en ; # Title proper of series
      rda:parallelTitleOfSeries "Ergebnisse der Mikrobiologie und Immunitätsforschung"@de ; # Parallel title of series
      rda:issnOfSeries "0070-217X"^^xsd:string ; # ISSN of series: 0070-217X
      rda:numberingWithinSeries "v. 326"^^xsd:string ; # Numbering within series: v. 326
.

# ''Because the policy in her library is to analyze to the chapter
# level for aggregations in certain subjects, she also separate work
# records for each chapter and links them to the aggregate work, the
# expression and the manifestation records already created.''

ex:W1 frbr:part ex:W2 , ex:W3 , ex:W4 . # ...

ex:W2 rdf:type frbr:Work ;
      rdfs:comment "chapter 1 ..."@en ;
.

ex:W3 rdf:type frbr:Work ;
      rdfs:comment "chapter 2 ..."@en ;
.

ex:W4 rdf:type frbr:Work ;
      rdfs:comment "chapter 3 ..."@en ;
.

# ...
</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfCopyright

- rda:dateOfWork

- rda:issnOfSeries

- rda:languageOfExpression

- rda:numberingWithinSeries

- rda:parallelTitleOfSeries

- rda:placeOfPublication

- rda:preferredTitleForTheWork

- rda:publishersName

- rda:statementOfResponsibilityRelatingToTitle

- rda:titleProper

- rda:titleProperOfSeries

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

- rdarole:editor

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

- frbr:Expression

- frbr:Manifestation

- frbr:Person

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
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/P1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Reddy, Anireddy S. N.&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/W1"&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Nuclear pre-mRNA processing in plants&lt;/rda:preferredTitleForTheWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/9/E1"/&gt;
    &lt;rdarole:editor rdf:resource="http://www.example.com/rda-scenarios/9/P1"/&gt;
    &lt;rdarole:editor rdf:resource="http://www.example.com/rda-scenarios/9/P2"/&gt;
    &lt;frbr:part rdf:resource="http://www.example.com/rda-scenarios/9/W4"/&gt;
    &lt;frbr:part rdf:resource="http://www.example.com/rda-scenarios/9/W3"/&gt;
    &lt;frbr:part rdf:resource="http://www.example.com/rda-scenarios/9/W2"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:dateOfWork rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2008&lt;/rda:dateOfWork&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/9/S1"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/S1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Plant genetic regulation&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Subject"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/P2"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Golovkin, Maxim&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/W4"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;chapter 3 ...&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/E1"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/9/M1"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/M1"&gt;
    &lt;rda:placeOfPublication rdf:resource="http://www.example.com/rda-scenarios/9/PL1"/&gt;
    &lt;rda:titleProperOfSeries xml:lang="en"&gt;Current topics in microbiology and immunology&lt;/rda:titleProperOfSeries&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:numberingWithinSeries rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;v. 326&lt;/rda:numberingWithinSeries&gt;
    &lt;rda:dateOfCopyright rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2008&lt;/rda:dateOfCopyright&gt;
    &lt;rda:statementOfResponsibilityRelatingToTitle xml:lang="en"&gt;Anireddy S. N. Reddy, Maxim Golovkin, Editors&lt;/rda:statementOfResponsibilityRelatingToTitle&gt;
    &lt;rda:issnOfSeries rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;0070-217X&lt;/rda:issnOfSeries&gt;
    &lt;rda:parallelTitleOfSeries xml:lang="de"&gt;Ergebnisse der Mikrobiologie und Immunitätsforschung&lt;/rda:parallelTitleOfSeries&gt;
    &lt;rda:publishersName xml:lang="en"&gt;Springer&lt;/rda:publishersName&gt;
    &lt;rda:titleProper xml:lang="en"&gt;Nuclear pre-mRNA processing in plants&lt;/rda:titleProper&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/W3"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;chapter 2 ...&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/9/W2"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;chapter 1 ...&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9?action=refresh&arena=Page.py&key=Scenarios_2f9.text_html) for this page (cached 2012-12-25 14:15:37)  

Immutable page (last edited 2008-12-22 17:49:46 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


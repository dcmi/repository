---
title: "- Scenarios/7"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f7.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/7](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=fullsearch&value=%2F7&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f7">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f7_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f7_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 6
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.2 $ by $Author: alimanfoo $ on $Date: 2008/12/22 14:40:26 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/7/&gt; .

# begin scenario #
##################

# === Scenario 7, a typical best-seller ===

# ''James Cataloger works in a small public library that serves the
# leisure reading needs of the local population. His library does not
# use OCLC for cataloging. Instead, James creates records for each of
# the new books, often using the Library of Congress CIP that is found
# in the books, because they don't have a source of copy cataloging.''

# ''James is working through a box of new books, and pulls out "The
# Spy Who Came for Christmas"''

# ''The title page reads:''
#
# The Spy Who Came for Christmas
# David Morrell
# New York, Vanguard Press

# ''The verso has:''
# (c) Copyright 2008, David Morrell 

# ''Because there is no publication date on the title page, James will
# use the copyright date in his record.

# The ISBNs (both 10 and 13) are on the back cover by the barcode.

# The CIP shows the author's name as simply "Morell, David"

# Using this information, James sets up the work as:''

ex:W1 rdf:type frbr:Work ;
      rdarole:author ex:P1 ; # Author: Morell, David
      rda:preferredTitleForTheWork "The Spy Who Came for Christmas"@en ; # Title of the Work: The Spy who came for Christmas
.

ex:P1 rdf:type frbr:Person ;
      rdfs:label "Morrell, David"@en ;
.
      
# ''And the expression:''

ex:W1 frbr:realization ex:E1 .

ex:E1 rdf:type frbr:Expression ;
      rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of expression: English
      rda:contentType v:Text ; # Content type: Text
.

# ''And the manifestation:''

ex:E1 frbr:embodiment ex:M1 .

ex:M1 rdf:type frbr:Manifestation ;
      rda:titleProper "The Spy Who Came for Christmas"@en ; # Title proper: The Spy who came for Christmas
      rda:statementOfResponsibilityRelatingToTitle "David Morrell"@en ; # Statement of responsibility relating to title: David Morrell
      rda:placeOfPublication ex:PL1 ; # Place of publication: New York
      rda:publishersName "Vanguard Press"@en ; # Publisher's name: Vanguard Press
      rda:dateOfCopyright "2008"^^xsd:year ; # Copyright date: 2008
      rda:extentOfText "233 p."^^xsd:string ; # Pagination: 233 p.
      rda:size "20 cm"^^xsd:string ; # Size: 20 cm
      rda:identifierForTheManifestation "ISBN-10:1593154879"^^xsd:string ; # Identifier for the manifestation: ISBN-10:1593154879
      rda:identifierForTheManifestation "ISBN-13:978-1593154875"^^xsd:string ; # Identifier for the manifestation: ISBN-13:978-1593154875
.

ex:PL1 rdf:type frbr:Place ;
       rdfs:label "New York"@en ;
.

# ''He sticks a big "M" on the spine, and shelves the book in the
# mystery section.''
</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfCopyright

- rda:extentOfText

- rda:identifierForTheManifestation

- rda:languageOfExpression

- rda:placeOfPublication

- rda:preferredTitleForTheWork

- rda:publishersName

- rda:size

- rda:statementOfResponsibilityRelatingToTitle

- rda:titleProper

##### Properties Required by This Scenario, Not Defined in Vocabulary

<table>
  <tbody>
    <tr bgcolor="#ffaaaa">
      <td>
        rda:size </td>
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
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/7/W1"&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/7/P1"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;The Spy Who Came for Christmas&lt;/rda:preferredTitleForTheWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/7/E1"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/7/E1"&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/7/M1"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/7/P1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Morrell, David&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/7/PL1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;New York&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/7/M1"&gt;
    &lt;rda:placeOfPublication rdf:resource="http://www.example.com/rda-scenarios/7/PL1"/&gt;
    &lt;rda:dateOfCopyright rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2008&lt;/rda:dateOfCopyright&gt;
    &lt;rda:size rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;20 cm&lt;/rda:size&gt;
    &lt;rda:titleProper xml:lang="en"&gt;The Spy Who Came for Christmas&lt;/rda:titleProper&gt;
    &lt;rda:extentOfText rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;233 p.&lt;/rda:extentOfText&gt;
    &lt;rda:publishersName xml:lang="en"&gt;Vanguard Press&lt;/rda:publishersName&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;ISBN-10:1593154879&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;ISBN-13:978-1593154875&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:statementOfResponsibilityRelatingToTitle xml:lang="en"&gt;David Morrell&lt;/rda:statementOfResponsibilityRelatingToTitle&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7?action=refresh&arena=Page.py&key=Scenarios_2f7.text_html) for this page (cached 2012-12-20 13:40:07)  

Immutable page (last edited 2008-12-22 14:43:20 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


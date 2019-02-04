---
title: "- Scenarios/8"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f8.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/8](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=fullsearch&value=%2F8&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f8">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f8_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f8_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 8
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.1 $ by $Author: alimanfoo $ on $Date: 2008/12/22 15:11:03 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/8/&gt; .

# begin scenario #
##################

# === Scenario 8: Publisher's series ===

# ''Jane Cataloger's library receives a new copy of William Golding's
# "Lord of the Flies," replacing one that was returned with too many
# missing pages. The book is published by Penguin as part of their
# Penguin Great Books of the 20th Century series. The basic
# information for the manifestation is:''

ex:M1 rdf:type frbr:Manifestation ;
      rda:titleProper "Lord of the Flies"@en ; # Title proper: Lord of the flies
      rda:publishersName "Penguin"@en ; # Publisher's name: Penguin
      rda:dateOfPublication "1999"^^xsd:year ; # Date of publication: 1999
      rda:placeOfPublication ex:PL1 ; # Place of publication: New York
      rda:extentOfText "192 p."^^xsd:string ; # Pagination: 192 p.
      rda:identifierForTheManifestation "ISBN-10:0140283331"^^xsd:string ; # Identifier for the manifestation: ISBN-10:0140283331
      rda:identifierForTheManifestation "ISBN-13:978-0140283334"^^xsd:string ; # Identifier for the manifestation: ISBN-13:978-0140283334
.

# ''Jane knows (or at least assumes) that the original work was
# written in English and the title was Lord of the Flies, so she has
# the beginning of a work record:''

ex:W1 rdf:type frbr:Work ;
      rdarole:author ex:P1 ; # * Author: Golding, William ''(Jane finds an authority record in the catalog for "Golding, William, 1911-1993" and uses this form in her record.)''
      rda:preferredTitleForTheWork "Lord of the Flies"@en ; # Title of the work: Lord of the flies
      rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
.

# ''She doesn't know the date of the work and doesn't want to take the
# time to look it up. The only thing she has for the expression is:''

ex:W1 frbr:realization ex:E1 .

ex:E1 rdf:type frbr:Expression ;
      rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
      rda:contentType v:Text ; # Content Type: Text
.

ex:E1 frbr:embodiment ex:M1 .

# ''There is one last thing: The book is part of the "Penguin Great
# Books of the 20th Century" series. This is a publisher series, so
# she knows that her library will not have a separate record for
# it. However, she knows that the series is popular among her readers,
# and she wants them to be able to search on the series and see which
# ones the library owns. She adds a series field to the record:''

ex:M1 rda:titleProperOfSeries "Penguin great books of the 20th century"@en . # Title proper of series

# ''The series does not appear to have an ISSN nor any numbering of
# individual titles.''

# aliman: if the series did have further properties, how should you
# model the series as an entity? E.g. ...

ex:M1 frbr:partOf ex:M2 .

ex:M2 rdf:type frbr:Manifestation ;
      rdfs:comment "a series"@en ;
      rda:titleProper "Penguin great books of the 20th century"@en ;
      rda:identifierForTheManifestation "ISSN..."^^xsd:string ;
.

# ...?
</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfPublication

- rda:extentOfText

- rda:identifierForTheManifestation

- rda:languageOfExpression

- rda:languageOfWork

- rda:placeOfPublication

- rda:preferredTitleForTheWork

- rda:publishersName

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

- frbr:partOf

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
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/8/M1"&gt;
    &lt;rda:placeOfPublication rdf:resource="http://www.example.com/rda-scenarios/8/PL1"/&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;ISBN-13:978-0140283334&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;ISBN-10:0140283331&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:extentOfText rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;192 p.&lt;/rda:extentOfText&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;frbr:partOf rdf:resource="http://www.example.com/rda-scenarios/8/M2"/&gt;
    &lt;rda:titleProper xml:lang="en"&gt;Lord of the Flies&lt;/rda:titleProper&gt;
    &lt;rda:publishersName xml:lang="en"&gt;Penguin&lt;/rda:publishersName&gt;
    &lt;rda:dateOfPublication rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1999&lt;/rda:dateOfPublication&gt;
    &lt;rda:titleProperOfSeries xml:lang="en"&gt;Penguin great books of the 20th century&lt;/rda:titleProperOfSeries&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/8/E1"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/8/M1"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/8/M2"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;ISSN...&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:titleProper xml:lang="en"&gt;Penguin great books of the 20th century&lt;/rda:titleProper&gt;
    &lt;rdfs:comment xml:lang="en"&gt;a series&lt;/rdfs:comment&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/8/W1"&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Lord of the Flies&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/8/P1"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/8/E1"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8?action=refresh&arena=Page.py&key=Scenarios_2f8.text_html) for this page (cached 2012-12-26 18:26:44)  

Immutable page (last edited 2008-12-22 15:09:24 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


---
title: "- Scenarios/10"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f10.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/10](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=fullsearch&value=%2F10&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f10">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f10_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f10_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 10
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.1 $ by $Author: alimanfoo $ on $Date: 2008/12/22 16:38:55 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/10/&gt; .

# begin scenario #
##################

# === Scenario 10: No work information ===

# ''Jane Cataloger is working on box of donated books. The donor was
# obviously an old lefty, and she sets aside the pamphlet version of
# Mao's "Oppose Book Worship" to hang up on the staff room bulletin
# board (anonymously).''

# ''The Vanguard edition of Peter Kropotkin's "The Conquest of Bread"
# will be a welcome addition to the library's holdings in the area of
# revolutionary literature.''

# ''The information she has from the volume is:''

# * The Conquest of Bread
# * by Peter Kropotkin
# * Author of "fields, Factories, and Workshops" "The Memoirs of a Revolutionist," Etc.
# * New York
# * Vanguard Press
# * Published, 1906
# * Vanguard printings: first - August 1926, second - November, 1927
# * Printed in the United States of American 
# * Union Bug 489

# ''Jane wants to get this book onto the shelf as quickly and
# efficiently (read: unexpensively) as possible, so she's going to
# create a minimal record. She starts with the author's name. She
# doesn't have an authority record under "Kropotkin." She's aware that
# his "true" name would have a Russian form, but she doesn't want to
# research it, and she doesn't think that the Russian form of the name
# would be particularly useful for her users. She'll use "Kropotkin,
# Peter" and not create an authority record for the name.''

# ''Jane thinks about what to do about the work. She's pretty sure
# that the book was not originally written in English, but there is no
# mention of translation in this edition. Also, she's pretty sure that
# the book was written before 1906. She uses what she has to create a
# work record for the book:''

ex:W1 rdf:type frbr:Work ;
      rdarole:author ex:P1 ; # Author: Kropotkin, Peter 
      rda:preferredTitleForTheWork "The conquest of bread"@en ; # Title of the Work: The conquest of bread
.

# ''Next, she creates a brief expression record:''

ex:W1 frbr:realization ex:E1 .

ex:E1 rdf:type frbr:Expression ;
      rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
      rda:contentType v:Text ; # Content Type: Text
.

# ''Lastly, she creates a manifestation record with the following
# information:''

ex:E1 frbr:embodiment ex:M1 .

ex:M1 rdf:type frbr:Manifestation ;
      rda:titleProper "The conquest of bread"@en ; # Title proper: The conquest of bread
      rda:statementOfResponsibilityRelatingToTitle "by Peter Kropotkin"@en ; # Statement of responsibility relating to title: by Peter Kropotkin
      rda:placeOfPublication ex:PL1 ; # Place of publication: New York
      rda:publishersName "Vanguard Press"@en ; # Publisher's name: Vanguard Press
      rda:dateOfManufacture "1927"^^xsd:year ; # Date of manufacture: 1927 
      # (Because she suspects that the 1906 date does not refer to this manifestation, she uses the printing date.
      rda:extentOfText "214 p."^^xsd:string ; # Extent: 214 p.
.

# ''She adds the RFID tag with the book's accession number, which
# creates an item record:''

ex:M1 frbr:exemplar ex:I1 .

ex:I1 rdf:type frbr:Item ;
      rda:identifierForTheItem "00334872"^^xsd:string ; # Identifier for the item: 00334872
.

# ''(N.B. Original was in French. First published in Paris in
# 1892. The LC Name Authority heading is: "Kropotkin, Petr
# Alekseevich, kni&amp;#65056;a&amp;#65057;z&amp;#697;, 1842-1921" None of the
# editions I could find named a translator, probably because the work
# was originally serialized in a London lefty newspaper founded by
# Kropotkin himself.)''
</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfManufacture

- rda:extentOfText

- rda:identifierForTheItem

- rda:languageOfExpression

- rda:placeOfPublication

- rda:preferredTitleForTheWork

- rda:publishersName

- rda:statementOfResponsibilityRelatingToTitle

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

- frbr:exemplar

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

- frbr:Item

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
&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/10/M1"&gt;
    &lt;rda:publishersName xml:lang="en"&gt;Vanguard Press&lt;/rda:publishersName&gt;
    &lt;rda:extentOfText rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;214 p.&lt;/rda:extentOfText&gt;
    &lt;rda:titleProper xml:lang="en"&gt;The conquest of bread&lt;/rda:titleProper&gt;
    &lt;rda:placeOfPublication rdf:resource="http://www.example.com/rda-scenarios/10/PL1"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:dateOfManufacture rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1927&lt;/rda:dateOfManufacture&gt;
    &lt;frbr:exemplar rdf:resource="http://www.example.com/rda-scenarios/10/I1"/&gt;
    &lt;rda:statementOfResponsibilityRelatingToTitle xml:lang="en"&gt;by Peter Kropotkin&lt;/rda:statementOfResponsibilityRelatingToTitle&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/10/E1"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/10/M1"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/10/W1"&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;The conquest of bread&lt;/rda:preferredTitleForTheWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/10/E1"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/10/P1"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/10/I1"&gt;
    &lt;rda:identifierForTheItem rdf:datatype="http://www.w3.org/2001/XMLSchema#string"&gt;00334872&lt;/rda:identifierForTheItem&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Item"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10?action=refresh&arena=Page.py&key=Scenarios_2f10.text_html) for this page (cached 2012-12-31 12:47:24)  

Immutable page (last edited 2008-12-22 16:36:06 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


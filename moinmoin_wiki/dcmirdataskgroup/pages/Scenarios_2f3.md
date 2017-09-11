---
title: "- Scenarios/3"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f3.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/3](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=fullsearch&value=%2F3&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f3">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f3_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f3_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 3
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.4 $ by $Author: alimanfoo $ on $Date: 2008/11/29 13:33:07 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/3/&gt; .

# begin scenario #
##################

# ==== Scenario 3: A multimedia creation based on a previously published item ====

# ''The next item in Jane Cataloger's queue is a DVD of a movie written, filmed 
# and scored by students in the local university, the screenplay based on a 
# short story written by a faculty member. Jane finds that the story was 
# published in a collection of stories by this particular faculty member, so she 
# creates a work record and an expression record for the story and relates it to 
# the collection (which is already represented by a work record).''

ex:A rdf:type frbr:Work ;
    rdarole:author ex:B ; # Author: Janet McEllison
    rda:preferredTitleForTheWork "Folly remembered"@en ; # Preferred Title of Work
    rda:formOfWork v:ShortStory ; # Form of Work: Short story
.

ex:B rdf:type frbr:Person ;
    rdfs:label "Janet McEllison" ;
.

ex:A frbr:realization ex:C . # Link from work to expression of short story

ex:C rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

ex:A frbr:partOf ex:D . # Link from short story to collection

ex:D rdf:type frbr:Work . # The collection of short stories, described elsewhere

# ''For the story, she provides a link to the manifestation record for the 
# collected stories, since the story is not published in any other 
# manifestation.''

ex:C frbr:embodiment ex:E .

ex:E rdf:type frbr:Manifestation . # Manifestation of the collection of short stories, described elsewhere

# N.B. the expression of the collection of short stories is not mentioned here.

# ''She then creates additional work, expression and manifestation records for 
# the screenplay (which is available online):''

ex:F rdf:type frbr:Work ;
    rdarole:editor ex:G ; # Adapter: Margaret Adamson
    rda:preferredTitleForTheWork "Lily's folly"@en ; # Preferred Title of Work: Lily's folly
    rda:formOfWork v:ScreenPlay ; # Form of Work: Screenplay
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
    frbr:realization ex:H ; # Link from work to expression
.

ex:G rdf:type frbr:Person ;
    rdfs:label "Margaret Adamson" ;
.

ex:H rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: text
    frbr:embodiment &lt;http://hdl.handle.net/3465/7576&gt; ; # Link to manifestation
.

&lt;http://hdl.handle.net/3465/7576&gt; rdf:type frbr:Manifestation ;
    rda:placeOfProduction ex:J ; # Place of Production: Fresno, NH
    rda:publisher ex:K ; # Publisher: Wilson College Repository
    rda:dateOfPublication "2005"^^xsd:year ; # Date of availability: 2005.
    rda:mediaType "text/html" ; # Media Type: text/html
    rda:extentOfText "120 pages" ; # Extent: 120 pages
    rda:identifierForTheManifestation "http://hdl.handle.net/3465/7576"^^xsd:anyURI ; # Resource Identifier: http://hdl.handle.net/3465/7576
.

ex:J rdf:type frbr:Place ;
    rdfs:label "Fresno, NH"@en ;
.

ex:K rdf:type frbr:CorporateBody ;
    rdfs:label "Wilson College Repository"@en ;
.

# ''From there she creates work record and expression records for the movie, and
# relates it at the work level to the related works.''

ex:L rdf:type frbr:Work ;
    rdarole:director ex:M ; # Director: George Freehling
    rdarole:producer ex:N ; # Producer: Amanda Martinez
    rdarole:actor ex:O ; # Actor: Timothy Marchant
    rdarole:actor ex:P ; # Actor: Da'Shawn Gibbons
    rdarole:actor ex:Q ; # Actor: Marianne Sims
    rda:preferredTitleForTheWork "Folly remembered"@en ; # Preferred Title of Work
    rda:formOfWork v:MotionPicture ; # Form of Work: Motion picture
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of Work: English
    frbr:realization ex:R ; # Link to manifestation
    frbr:adaptionOf ex:F ; # Link to the screen play work
    frbr:adaptionOf ex:A ; # Link to short story work
.

ex:M rdf:type frbr:Person ; rdfs:label "George Freehling" .
ex:N rdf:type frbr:Person ; rdfs:label "Amanda Martinez" .
ex:O rdf:type frbr:Person ; rdfs:label "Timothy Marchant" .
ex:P rdf:type frbr:Person ; rdfs:label "Da'Shawn Gibbons" .
ex:Q rdf:type frbr:Person ; rdfs:label "Marianne Sims" .

ex:R rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^ISO639-2 ; # Language of Expression: English
    rda:contentType v:Video ; # Content Type: Video
.

# ''Jane invokes searches for the named contributors to the three works, and 
# assigns:
#
# 1. the existing authority record for author of the short story to the work 
# record for the story itself;

# ex:A rdarole:author ex:B . # See above, already stated

# 2. a newly created authority record for the student writer of the screenplay 
# to the work record for the screenplay;

# ex:F rdarole:editor ex:G . # See above, already stated

# 3. several newly created authority records for the various contributors to 
# the movie itself.''

# Already stated above...
# ex:L 
# rdarole:director ex:M ; # Director: George Freehling
# rdarole:producer ex:N ; # Producer: Amanda Martinez
# rdarole:actor ex:O ; # Actor: Timothy Marchant
# rdarole:actor ex:P ; # Actor: Da'Shawn Gibbons
# rdarole:actor ex:Q ; # Actor: Marianne Sims

# ''This accomplished, she moves on to manifestation for the movie:''

ex:R frbr:embodiment ex:S . # Link to manifestation

ex:S rdf:type frbr:Manifestation ;
    rda:placeOfProduction ex:J ; # Place of Production: Fresno, NH
    rda:publisher ex:T ; # Publisher: Wilson College Video Production Department
    rda:dateOfPublication "2005"^^xsd:year ; # Date of availability: 2005.
    rda:mediaType v:DVD ; # Media Type: DVD
    rda:extent "1 disk" ; # Extent: 1 disk
.

# '''[Consulted]''' Yee, Martha M. Understanding FRBR. Chapter 11, FRBR and 
# Moving Image Materials: Content (Work and Expression) versus Carrier 
# (Manifestation). Available at: http://repositories.cdlib.org/postprints/2648/

</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfPublication

- rda:extent

- rda:extentOfText

- rda:formOfWork

- rda:identifierForTheManifestation

- rda:languageOfExpression

- rda:languageOfWork

- rda:mediaType

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

- rdarole:actor

- rdarole:author

- rdarole:director

- rdarole:editor

- rdarole:producer

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

- frbr:adaptionOf

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
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/B"&gt;
    &lt;rdfs:label&gt;Janet McEllison&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/Q"&gt;
    &lt;rdfs:label&gt;Marianne Sims&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/D"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/O"&gt;
    &lt;rdfs:label&gt;Timothy Marchant&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/A"&gt;
    &lt;frbr:partOf rdf:resource="http://www.example.com/rda-scenarios/3/D"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Folly remembered&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/3/C"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/ShortStory"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/3/B"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/G"&gt;
    &lt;rdfs:label&gt;Margaret Adamson&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/S"&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/3/J"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/3/T"/&gt;
    &lt;rda:mediaType rdf:resource="http://example.com/unknown-vocabulary/DVD"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:extent&gt;1 disk&lt;/rda:extent&gt;
    &lt;rda:dateOfPublication rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2005&lt;/rda:dateOfPublication&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/C"&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/3/E"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/H"&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;frbr:embodiment rdf:resource="http://hdl.handle.net/3465/7576"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/M"&gt;
    &lt;rdfs:label&gt;George Freehling&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/L"&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/3/P"/&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/3/Q"/&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/3/O"/&gt;
    &lt;frbr:adaptionOf rdf:resource="http://www.example.com/rda-scenarios/3/F"/&gt;
    &lt;frbr:adaptionOf rdf:resource="http://www.example.com/rda-scenarios/3/A"/&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/3/R"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Folly remembered&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rdarole:director rdf:resource="http://www.example.com/rda-scenarios/3/M"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/MotionPicture"/&gt;
    &lt;rdarole:producer rdf:resource="http://www.example.com/rda-scenarios/3/N"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/R"&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Video"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://www.example.com/rda-scenarios/#ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/3/S"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/P"&gt;
    &lt;rdfs:label&gt;Da'Shawn Gibbons&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/E"&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/F"&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;rdarole:editor rdf:resource="http://www.example.com/rda-scenarios/3/G"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Lily's folly&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/3/H"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/ScreenPlay"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://hdl.handle.net/3465/7576"&gt;
    &lt;rda:identifierForTheManifestation rdf:datatype="http://www.w3.org/2001/XMLSchema#anyURI"&gt;http://hdl.handle.net/3465/7576&lt;/rda:identifierForTheManifestation&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/3/J"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/3/K"/&gt;
    &lt;rda:extentOfText&gt;120 pages&lt;/rda:extentOfText&gt;
    &lt;rda:mediaType&gt;text/html&lt;/rda:mediaType&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:dateOfPublication rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2005&lt;/rda:dateOfPublication&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/N"&gt;
    &lt;rdfs:label&gt;Amanda Martinez&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/J"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Fresno, NH&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/3/K"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Wilson College Repository&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3?action=refresh&arena=Page.py&key=Scenarios_2f3.text_html) for this page (cached 2012-12-01 06:44:39)  

Immutable page (last edited 2008-12-22 12:48:11 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


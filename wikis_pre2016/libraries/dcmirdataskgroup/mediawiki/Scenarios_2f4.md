---
title: "- Scenarios/4"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f4.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/4](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=fullsearch&value=%2F4&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f4">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f4_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f4_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 4
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.2 $ by $Author: alimanfoo $ on $Date: 2008/11/29 13:33:07 $

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
@prefix ex: &lt;http://www.example.com/rda-scenarios/4/&gt; .
@prefix bfi: &lt;http://britishfilminstitute.example.com/id/&gt; .

# begin scenario #
##################

# ==== Scenario 4: Complex DVD Versions, or, Reality Bites ====

# ''[Contributed by Greta de Groat]''

# ''Jane Cataloger is working on cataloging the individual DVDs from the Ford at 
# Fox Collection. The selector has repackaged the individual DVDs in containers 
# and asked Cataloging to catalog them separately. However, this package 
# contains two DVDs for the film The Iron Horse. She searches the library  
# database and finds:

# A work record for the Ford at Fox collection

ex:A rdf:type frbr:Work ;
    rda:preferredTitleForTheWork "The Ford at Fox Collection"@en ; 
.

# A work record for the film The Iron Horse: ''
ex:B rdf:type frbr:Work ;
    rdarole:director ex:C ; # Director: John Ford
    rda:preferredTitleForTheWork "The Iron Horse"@en ; # Preferred title of work: The Iron Horse
    rda:formOfWork v:MotionPicture ; # Form of work: Motion Picture
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
    rda:dateOfFirstPublicationOrRelease "1924"^^xsd:year ; # Original year of release: 1924
    rdarole:actor ex:D ; # Actor: George O'Brien
    rdarole:actor ex:E ; # Actor: Madge Bellamy
    rdarole:actor ex:F ; # Actor: Charles Edward Bull
    rdarole:productionCompany ex:G ; # Production company: Fox
    rda:formOfWork v:FeatureFilm ; # Genre of work: Feature film
    rda:formOfWork v:SilentFilm ; # Genre of work: Silent film
    rda:formOfWork v:FictionFilm ; # Genre of work : Fiction film
    rda:formOfWork v:WesternFilm ; # Genre of work: Western film
    dcterms:subject ex:H ; # Subject of work: Railroads--West (U.S.--History--19th century--Drama
.

ex:C rdf:type frbr:Person ;
    rdfs:label "John Ford"@en ;
.

ex:D rdf:type frbr:Person ;
    rdfs:label "George O'Brien"@en ;
.

ex:E rdf:type frbr:Person ;
    rdfs:label "Madge Bellamy"@en ;
.

ex:F rdf:type frbr:Person ;
    rdfs:label "Charles Edward Bull"@en ;
.

ex:G rdf:type frbr:CorporateBody ;
    rdfs:label "Fox"@en ;
.

ex:H rdf:type frbr:Subject ;
    rdfs:label "Railroads--West (U.S.--History--19th century--Drama)"@en ;
.

# ''There are assorted other people related to the work, but Jane's not working 
# for a film archive, so she doesn't add any more of them to the work record.''

# ''Now, the two DVDs are two different versions of the film. Presumably she 
# could choose to catalog the DVDs separately or together, but since her 
# selector gave them to her together, she catalogs them together. One DVD is the 
# International version, and the other is the US version.
# Both have scores by William Perry. So she creates two expression records:''

ex:B frbr:realization ex:I .

ex:I rdf:type frbr:Expression ;
    rdfs:comment "the international version"@en ;
.

ex:B frbr:realization ex:J .

ex:J rdf:type frbr:Expression ;
    rdfs:comment "the US version"@en ;
.

# ''Jane finds this expression record attached to a manifestation released by 
# the British Film Institute:''

bfi:X rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    frbr:complement ex:K ; # Composer of musical score of expression: William Perry
    rda:duration "133 minutes" ; # Running time of expression: 133 minutes
.

ex:K rdf:type frbr:Expression ;
    rdfs:comment "the musical score for the iron horse"@en ;
    rdarole:composer ex:L ; # Composer of musical score of expression: William Perry
.

ex:L rdf:type frbr:Person ;
    rdfs:label "William Perry"@en ;
.

# ''Jane wonders if this is the same as her International version. It has the 
# same running time and also has a score by William Perry. So she takes a 
# chance and adds to the record:''

ex:I owl:sameAs bfi:X ;
    rdfs:label "International Version"@en ; # Name of expression: International Version
# already stated: Language of expression: English
# already stated: Composer of musical score of expression: William Perry
.

# ''[In addition, this has optional French or Spanish intertitles so presumably 
# each of those would also be expressions, so Jane would need two more 
# expression records?]''

ex:B frbr:realization ex:M .

ex:M rdf:type frbr:Expression ;
    rdfs:comment "with french intertitles"@en ;
.

ex:B frbr:realization ex:N .

ex:N rdf:type frbr:Expression ;
    rdfs:comment "with spanish intertitles"@en ;
.

# ''Jane does not find this expression record and needs to create it:''

ex:J rdf:type frbr:Expression ;
    rdfs:label "U.S. Version"@en ; # Name of expression: U.S. Version
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    frbr:complement ex:K ; # Composer of musical score of expression: William Perry
    rda:duration "150 min" ; # Running time of expression: 150 min.
.

# ''One or both of these also has a commentary track by Robert Birchard (mea 
# culpa, i didn't note which one when i cataloged it, nor did anyone in OCLC).  
# So presumably the one with the commentary track is yet another expression. so 
# so far Jane has had to use one existing expression record and had to create 6 
# more expression records for this.''

ex:B frbr:realization ex:O .

ex:O rdf:type frbr:Expression ;
    rdfs:comment "has a commentary track by Robert Birchard"@en ;
.

# ''Jane is unsure which other expression is already in OCLC. The two VHS tapes 
# from Nostalgia Family Video run 133 minutes so Jane thinks they might be the 
# international Version, though this is not stated. However, they have an 
# orchestral score by an unidentified composer or compiler, so are a different 
# expression. So she doesn't link to this expression record.''

# no statements

# ''She also finds that the DVDs have a featurette; a restoration comparison; 
# vintage program gallery; advertising gallery; still gallery. Jane is tired by 
# this time and decides that these are untitled and worthy of only a note, 
# instead of creating work records for each. Jane is also starting to worry 
# that the implication of a "restoration comparison" means that there may be a 
# difference in expression between the BFI version and this version, but she 
# really has no way to research this. What does Jane do? Flip a coin? Try to 
# call film experts? Ignore it and let it pass?''

# ''Ignoring that for the moment, Jane can finally gets down to the 
# manifestation:''

ex:I frbr:embodiment ex:P .
ex:J frbr:embodiment ex:P . # N.B. two expressions embodied in one manifestation

ex:P rdf:type frbr:Manifestation ;
    rda:placeOfPublication ex:Q ; # Place of Publication: Beverly Hills, Calif.
    rda:publisher ex:R ; # Publisher: Twentieth Century Fox Home Entertainment
    rda:dateOfPublication "2007"^^xsd:year ; # Date: 2007
    rda:mediaType v:DVD ; # Media type: DVD;
    rda:digitalFileCharacteristics "NTSC, all region, full frame, choice of Dolby 5.1 or stereo for the music track"@en ;
# Other technical characteristics: NTSC, all region, full frame, choice of Dolby 
# 5.1 or stereo for the music track ''(uh oh, Jane wonders if these constitute 
# different expressions, but decides not to think about it and just lets this 
# pass)''
    rda:extent "2 videodiscs : sd., b&amp;w, 4 3/4 in."@en ; # Extent: 2 videodiscs : sd., b&amp;w, 4 3/4 in.
.

# ''She also has to link to the Ford at Fox set somehow for the series. Jane 
# thinks this is manifestation information, and is unsure how the linkage will 
# work between individually cataloged manifestations and the set, which 
# presumably has work, expression, and manifestation records.''

# the 2 DVD (manifestation) is a part of the manifestation of the Ford at Fox Collection ... ?
ex:A frbr:realization [frbr:embodiment [ frbr:part ex:P] ; ] .    

# ''Jane has now spent two days cataloging this resource. Her boss calls her 
# into her office to explain why she should spend so much time and money playing 
# with her records when they could just outsource it to India. Jane goes back 
# to her desk and looks at the next time in her pile, which is a videodisc 
# containing 30 short films by filmmaker Dennis Oppenheim. The one under that 
# is a disc 60 short animated films by a variety of people she's never heard of. 
# Next is the second
# volume with another 60 films. She contemplates the idea of work records for 
# these, then goes home and slits her wrists.''

</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:dateOfFirstPublicationOrRelease

- rda:dateOfPublication

- rda:digitalFileCharacteristics

- rda:duration

- rda:extent

- rda:formOfWork

- rda:languageOfExpression

- rda:languageOfWork

- rda:mediaType

- rda:placeOfPublication

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

- rdarole:composer

- rdarole:director

- rdarole:productionCompany

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

- frbr:complement

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
   xmlns:owl="http://www.w3.org/2002/07/owl#"
   xmlns:rda="http://RDVocab.info/Elements/"
   xmlns:rdarole="http://RDVocab.info/roles/"
   xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
&gt;
  &lt;rdf:Description rdf:nodeID="ZcdAObDc1760"&gt;
    &lt;frbr:embodiment rdf:nodeID="ZcdAObDc1761"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/B"&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/4/N"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/4/O"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/4/I"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/4/M"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/4/J"/&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/4/E"/&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/4/D"/&gt;
    &lt;rdarole:actor rdf:resource="http://www.example.com/rda-scenarios/4/F"/&gt;
    &lt;rda:dateOfFirstPublicationOrRelease rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1924&lt;/rda:dateOfFirstPublicationOrRelease&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;rdarole:director rdf:resource="http://www.example.com/rda-scenarios/4/C"/&gt;
    &lt;rdarole:productionCompany rdf:resource="http://www.example.com/rda-scenarios/4/G"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/SilentFilm"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/WesternFilm"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/FeatureFilm"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/FictionFilm"/&gt;
    &lt;rda:formOfWork rdf:resource="http://example.com/unknown-vocabulary/MotionPicture"/&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/4/H"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;The Iron Horse&lt;/rda:preferredTitleForTheWork&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/G"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Fox&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#CorporateBody"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/P"&gt;
    &lt;rda:dateOfPublication rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;2007&lt;/rda:dateOfPublication&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:extent xml:lang="en"&gt;2 videodiscs : sd., b&amp;amp;w, 4 3/4 in.&lt;/rda:extent&gt;
    &lt;rda:digitalFileCharacteristics xml:lang="en"&gt;NTSC, all region, full frame, choice of Dolby 5.1 or stereo for the music track&lt;/rda:digitalFileCharacteristics&gt;
    &lt;rda:placeOfPublication rdf:resource="http://www.example.com/rda-scenarios/4/Q"/&gt;
    &lt;rda:publisher rdf:resource="http://www.example.com/rda-scenarios/4/R"/&gt;
    &lt;rda:mediaType rdf:resource="http://example.com/unknown-vocabulary/DVD"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/L"&gt;
    &lt;rdfs:label xml:lang="en"&gt;William Perry&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/C"&gt;
    &lt;rdfs:label xml:lang="en"&gt;John Ford&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/K"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;the musical score for the iron horse&lt;/rdfs:comment&gt;
    &lt;rdarole:composer rdf:resource="http://www.example.com/rda-scenarios/4/L"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/D"&gt;
    &lt;rdfs:label xml:lang="en"&gt;George O'Brien&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/M"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;with french intertitles&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:nodeID="ZcdAObDc1761"&gt;
    &lt;frbr:part rdf:resource="http://www.example.com/rda-scenarios/4/P"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/N"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;with spanish intertitles&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/E"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Madge Bellamy&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/A"&gt;
    &lt;frbr:realization rdf:nodeID="ZcdAObDc1760"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;The Ford at Fox Collection&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/I"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;the international version&lt;/rdfs:comment&gt;
    &lt;owl:sameAs rdf:resource="http://britishfilminstitute.example.com/id/X"/&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/4/P"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rdfs:label xml:lang="en"&gt;International Version&lt;/rdfs:label&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/F"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Charles Edward Bull&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/H"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Railroads--West (U.S.--History--19th century--Drama)&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Subject"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/O"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;has a commentary track by Robert Birchard&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://britishfilminstitute.example.com/id/X"&gt;
    &lt;rda:duration&gt;133 minutes&lt;/rda:duration&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;frbr:complement rdf:resource="http://www.example.com/rda-scenarios/4/K"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/4/J"&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/4/P"/&gt;
    &lt;rdfs:label xml:lang="en"&gt;U.S. Version&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rdfs:comment xml:lang="en"&gt;the US version&lt;/rdfs:comment&gt;
    &lt;rda:duration&gt;150 min&lt;/rda:duration&gt;
    &lt;frbr:complement rdf:resource="http://www.example.com/rda-scenarios/4/K"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4?action=refresh&arena=Page.py&key=Scenarios_2f4.text_html) for this page (cached 2012-12-27 06:31:12)  

Immutable page (last edited 2008-12-22 12:48:21 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


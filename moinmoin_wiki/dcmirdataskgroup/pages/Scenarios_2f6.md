---
title: "- Scenarios/6"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios_2f6.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Scenarios/6](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=fullsearch&value=%2F6&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/Scenarios "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios_2f6">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_2f6_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_2f6_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### RDF Expression of Scenario Metadata (Turtle Format)
<pre># RDF expression of information given in RDA cataloguer scenario 6
# see http://dublincore.org/dcmirdataskgroup/Scenarios

# N.B. this document uses the Terse RDF Triple Language (Turtle)
# see http://www.w3.org/TeamSubmission/turtle/

# This is $Revision: 1.3 $ by $Author: alimanfoo $ on $Date: 2008/12/22 12:48:11 $

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

# placeholders for unknown vocabulary
@prefix v: &lt;http://example.com/unknown-vocabulary/&gt; . 
@prefix x: &lt;http://example.com/unknown-schema/&gt; .

# example namespace for things described in this scenario
@prefix ex: &lt;http://www.example.com/rda-scenarios/6/&gt; .

# begin scenario #
##################

# ==== Scenario 6: Complex Relationships--Older Materials ====

# [Notes: Iâ€™ve included in this scenario some of the relationships that will be 
# available through FRBR.  
# See [http://sandbox.metadataregistry.org/concept/list/page/1/vocabulary_id/90.html for a preliminary listing]. 
# Iâ€™ve also included â€œDefendantâ€ as a role--since as a former law librarian I 
# think these are important, and hope some conversations about their relevance 
# can be initiated. Also, although item information is potentially of interest 
# for these materials in particular, Iâ€™ve not included that level in this 
# scenario--Diane.]

# ''Joshua Cataloger was working on a collection of materials accumulated by a 
# nineteenth century criminal lawyer who practiced near Saratoga, NY. This 
# lawyer worked on several high visibility murder cases (the reality TV of the 
# 19th century) and kept meticulous records of his trials, including extensive 
# newspaper reports, in scrapbooks. He published (as was common during this 
# time) books that included his lengthy summations to juries and other testimony 
# and comment during trial. He also had a habit of pasting letters and other 
# related items inside the front and back covers of volumes he owned.''

# ''Joshua was working on the records of one infamous murder trial (which went 
# to two trials after the accused was found to have tampered with the first 
# jury), and found that one of the letters pasted in front of a copy of his 
# published â€œClosing argument of Nathaniel C. Moak at Ballston Spa, October 7, 
# 8, 9, 10, and 11, 1879 ...â€ was from Wilkie Collins, credited for the first 
# mystery novels. Joshua transcribed the letter, and discovered that it was in 
# reply to Moak, who had mentioned Collinsâ€™ novel The Moonstone in his argument 
# and had sent a copy of the book to Collins.''

# ''Given the importance of the letter, which asked exactly the kinds of 
# questions a novelist would ask of a practicing lawyer (â€œHow do you keep track 
# of the facts as you deliver your argument?â€ was one), Joshua felt that he must 
# include the letter in his catalog record. His problem was exacerbated by the 
# fact that the library had three copies, two bound with another Billings trial 
# pamphlet, written by someone else.''

# ''Joshua started by creating work records for the first two published works, 
# issued together--one by Moak, the other by Judge Landon. Work 1:''  

ex:W1 rdf:type frbr:Work ;
    rdarole:author ex:P1 ; # Author: Moak, Nathaniel C. (Nathaniel Cleveland ), 1833-1892.
    rda:preferredTitleForTheWork """Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr."""@en ; # Title of the Work
    dcterms:subject ex:S1 ; # Subject: Trials (Murder) -- New York (State) -- Ballston Spa
    x:defendant ex:P2 ; # Defendant: Billings, Jesse
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
    frbr:complement ex:W3 ; # Has a complement: [id for letter to N. Moak from W. Collins]
.

ex:P1 rdf:type frbr:Person ;
    rdfs:label "Moak, Nathaniel C. (Nathaniel Cleveland ), 1833-1892"@en ;
.

ex:S1 rdf:type frbr:Subject ;
    rdfs:label "Trials (Murder) -- New York (State) -- Ballston Spa"@en ;
.

ex:P2 rdf:type frbr:Person ;
    rdfs:label "Billings, Jesse"@en ;
.

ex:W3 rdf:type frbr:Work ;
    rdfs:comment "letter to N. Moak from W. Collins"@en ;
.

# ''Work 2:''

ex:W2 rdf:type frbr:Work ;
    rdarole:author ex:P3 ; # Author: Landon, Judson S. (Judson Stuart), 1832-1881.
    rda:preferredTitleForTheWork """The charge of Hon. Judson S. Landon, presiding judge at the Saratoga oyer and terminer, in the case of the people against Jesse Billings, Jr."""@en ; # Title of the Work
    dcterms:subject ex:S1 ; # Subject: Trials (Murder) -- New York (State) -- Ballston Spa
    x:defendant ex:P2 ; # Defendant: Billings, Jesse
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
.

ex:P3 rdf:type frbr:Person ;
    rdfs:label "Landon, Judson S. (Judson Stuart), 1832-1881."@en ;
.

# ''Joshua then moves on to create an expression record for each work, with 
# language and content type elements.'' 

ex:W1 frbr:realization ex:E1 .

ex:E1 rdf:type frbr:Expression ;    
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

ex:W2 frbr:realization ex:E2 .

ex:E2 rdf:type frbr:Expression ;    
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

# ''The manifestation record is tricky, because there are separate title pages 
# for each of the works (used for the work records), plus a collective title 
# page for the combined work, which is the only place that the â€œreporterâ€ is 
# mentioned. Joshua puzzles about this, and finally decides to include the 
# reporter in the manifestation record, though heâ€™s not sure this is correct.''

ex:E1 frbr:embodiment ex:M1 .
ex:E2 frbr:embodiment ex:M1 .

ex:M1 rdf:type frbr:Manifestation ;
    rda:titleProper """Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr.; with the charge of the Hon. Judson S. Landon, presiding justice"""@en ; # Title proper 
    rda:statementOfResponsibilityRelatingToTitle "reported by Buel C. Andrews"@en ; # Statement of responsibility relating to title
    x:reporter ex:P3 ; # Reporter: Andrews, Buel C. [note that the RDA roles does not yet include â€œreporterâ€]
    rda:placeOfProduction ex:PL1 ; # Place of Production: Albany
    rda:producersName "Weed, Parsons and Company, printers"@en ; # Producerâ€™s name: Weed, Parsons and Company, printers
    rda:dateOfProduction "1879"^^xsd:year ; # Date of Production: 1879
    rda:extent "189, 32 pages [note that the sets of pages reflect the two parts issued together]"@en ; # Extent 
.

ex:P3 rdf:type frbr:Person ;
    rdfs:label "Andrews, Buel C."@en ;
.

ex:PL1 rdf:type frbr:Place ;
    rdfs:label "Albany"@en ;
.

# ''Joshua then creates a work level description for the letter, in order to 
# relate it properly to the one copy of the combined work in which it is pasted. 
# Heâ€™s not quite sure how to do this, but personfully wades in and makes the 
# attempt, and creates a work record for the letter, and a work/work 
# relationship between it and the Moak argument. Even though the letter has both 
# a bibliographic and physical relationship with the other work, heâ€™s pretty 
# sure the bibliographic one is important enough to highlight.''

ex:W3 rdf:type frbr:Work ;
    rdarole:author ex:P4 ; # Author: Collins, Wilkie, 1824-1889
    rda:preferredTitleForTheWork "Letter to Nathaniel Moak, January 13, 1880"@en ; # Title of work 
    rda:languageOfWork "en"^^dcterms:ISO639-2 ; # Original Language of the Work: English
    frbr:complementOf ex:W1 ; # Complements: [id for Moakâ€™s Closing argument]
    rda:note "handwritten"@en ; # How to note that itâ€™s handwritten?
.

ex:P4 rdf:type frbr:Person ;
    rdfs:label "Collins, Wilkie, 1824-1889"@en ;
.

# ''How to note that itâ€™s handwritten? Heâ€™s not sure, so he moves on to 
# expression:''

ex:W3 frbr:realization ex:E3 .

ex:E3 rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

# ''He includes some information on the letter as a manifestation:''

ex:E3 frbr:embodiment ex:M2 .

ex:M2 rdf:type frbr:Manifestation ;
    rda:extent "2 pages"@en ; # Extent: 2 pages
. 

# ''In order to completely describe the items where there is a â€œbound withâ€ 
# relationship, Joshua creates a third work record for the medical testimony, 
# related to the others both bibliographically (itâ€™s about the same trials), and 
# physically (itâ€™s bound in the same physical volume as two copies of the other 
# combined work, though not the letter).''

ex:W4 rdf:type frbr:Work ;
    rdarole:author ex:P5 ; # Author: Balch, Lewis, 1847-1909
    rda:preferredTitleForTheWork """A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Balston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony"""@en; # Title of work
    rda:historyOfWork """Read before the Medical Society of New York, February 3, 1881 and Reprinted from its Transactions for 1881."""@en ; # History of the work
    dcterms:subject ex:S1 ; # Subject: Trials (Murder) -- New York (State) -- Ballston Spa
    x:defendant ex:P2 ; # Defendant: Billings, Jesse
.

# ''Joshua moves on to the expression record:'' 

ex:W4 frbr:realization ex:E4 .

ex:E4 rdf:type frbr:Expression ;
    rda:languageOfExpression "en"^^dcterms:ISO639-2 ; # Language of Expression: English
    rda:contentType v:Text ; # Content Type: Text
.

# ''And to the manifestation:''
ex:E4 frbr:embodiment ex:M3 .

ex:M3 rdf:type frbr:Manifestation ;
    rda:titleProper """A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Ballston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony"""@en ; # Title proper
    rda:placeOfProduction ex:PL2 ; # Place of Production: Syracuse
    rda:producersName "Truair, Smith &amp; Bruce"@en ; # Producerâ€™s name 
    rda:dateOfProduction "1881"^^xsd:year ; # Date of Production: 1881
    rda:extent "28 pages"@en ; # Extent: 28 pages 
    frbr:reproductionOf ex:M4 ; # Is a reproduction of: [insert link to version in the transactions of the Medical Society]
.

ex:M4 rdf:type frbr:Manifestation ;
    rda:titleProper """A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Ballston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony"""@en ; # Title proper
    rdfs:comment "version in the transactions of the Medical Society"@en ;
.

# ''Joshua is not really sure what to do about the fact that this publication is 
# part of a library created collection of materials about the Billings trials.  
# Should the collection itself have a separate description? He thinks it 
# probably does, but isnâ€™t sure where in the Work/Expression/Manifestation/Item 
# the relationship between the overall collection and this piece is properly 
# expressed.''  

# ''Uh oh. Joshua realizes that thereâ€™s a digital version of all these materials 
# (except the letter). He goes on coffee break.''

</pre>

* * *

### Analysis

#### RDA Elements Vocabulary

##### All Properties Required by This Scenario

- rda:contentType

- rda:dateOfProduction

- rda:extent

- rda:historyOfWork

- rda:languageOfExpression

- rda:languageOfWork

- rda:note

- rda:placeOfProduction

- rda:preferredTitleForTheWork

- rda:producersName

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

- frbr:complement

- frbr:complementOf

- frbr:embodiment

- frbr:realization

- frbr:reproductionOf

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
   xmlns:x="http://example.com/unknown-schema/"
&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/W1"&gt;
    &lt;x:defendant rdf:resource="http://www.example.com/rda-scenarios/6/P2"/&gt;
    &lt;frbr:complement rdf:resource="http://www.example.com/rda-scenarios/6/W3"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/6/E1"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr.&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/6/S1"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/6/P1"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/E2"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/6/M1"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/P3"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Andrews, Buel C.&lt;/rdfs:label&gt;
    &lt;rdfs:label xml:lang="en"&gt;Landon, Judson S. (Judson Stuart), 1832-1881.&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/M4"&gt;
    &lt;rdfs:comment xml:lang="en"&gt;version in the transactions of the Medical Society&lt;/rdfs:comment&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:titleProper xml:lang="en"&gt;A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Ballston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony&lt;/rda:titleProper&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/W4"&gt;
    &lt;x:defendant rdf:resource="http://www.example.com/rda-scenarios/6/P2"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/6/E4"/&gt;
    &lt;rda:historyOfWork xml:lang="en"&gt;Read before the Medical Society of New York, February 3, 1881 and Reprinted from its Transactions for 1881.&lt;/rda:historyOfWork&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Balston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/6/S1"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/6/P5"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/S1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Trials (Murder) -- New York (State) -- Ballston Spa&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Subject"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/W3"&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/6/E3"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;Letter to Nathaniel Moak, January 13, 1880&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rda:note xml:lang="en"&gt;handwritten&lt;/rda:note&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/6/P4"/&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;frbr:complementOf rdf:resource="http://www.example.com/rda-scenarios/6/W1"/&gt;
    &lt;rdfs:comment xml:lang="en"&gt;letter to N. Moak from W. Collins&lt;/rdfs:comment&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/P1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Moak, Nathaniel C. (Nathaniel Cleveland ), 1833-1892&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/W2"&gt;
    &lt;x:defendant rdf:resource="http://www.example.com/rda-scenarios/6/P2"/&gt;
    &lt;frbr:realization rdf:resource="http://www.example.com/rda-scenarios/6/E2"/&gt;
    &lt;rda:preferredTitleForTheWork xml:lang="en"&gt;The charge of Hon. Judson S. Landon, presiding judge at the Saratoga oyer and terminer, in the case of the people against Jesse Billings, Jr.&lt;/rda:preferredTitleForTheWork&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Work"/&gt;
    &lt;rda:languageOfWork rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfWork&gt;
    &lt;dcterms:subject rdf:resource="http://www.example.com/rda-scenarios/6/S1"/&gt;
    &lt;rdarole:author rdf:resource="http://www.example.com/rda-scenarios/6/P3"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/E3"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/6/M2"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/PL1"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Albany&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Place"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/M2"&gt;
    &lt;rda:extent xml:lang="en"&gt;2 pages&lt;/rda:extent&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/E4"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/6/M3"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/E1"&gt;
    &lt;frbr:embodiment rdf:resource="http://www.example.com/rda-scenarios/6/M1"/&gt;
    &lt;rda:languageOfExpression rdf:datatype="http://purl.org/dc/terms/ISO639-2"&gt;en&lt;/rda:languageOfExpression&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Expression"/&gt;
    &lt;rda:contentType rdf:resource="http://example.com/unknown-vocabulary/Text"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/P2"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Billings, Jesse&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/M1"&gt;
    &lt;rda:dateOfProduction rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1879&lt;/rda:dateOfProduction&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/6/PL1"/&gt;
    &lt;rda:statementOfResponsibilityRelatingToTitle xml:lang="en"&gt;reported by Buel C. Andrews&lt;/rda:statementOfResponsibilityRelatingToTitle&gt;
    &lt;rda:producersName xml:lang="en"&gt;Weed, Parsons and Company, printers&lt;/rda:producersName&gt;
    &lt;x:reporter rdf:resource="http://www.example.com/rda-scenarios/6/P3"/&gt;
    &lt;rda:extent xml:lang="en"&gt;189, 32 pages [note that the sets of pages reflect the two parts issued together]&lt;/rda:extent&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;rda:titleProper xml:lang="en"&gt;Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr.; with the charge of the Hon. Judson S. Landon, presiding justice&lt;/rda:titleProper&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/M3"&gt;
    &lt;rda:dateOfProduction rdf:datatype="http://www.w3.org/2001/XMLSchema#year"&gt;1881&lt;/rda:dateOfProduction&gt;
    &lt;rda:placeOfProduction rdf:resource="http://www.example.com/rda-scenarios/6/PL2"/&gt;
    &lt;rda:producersName xml:lang="en"&gt;Truair, Smith &amp;amp; Bruce&lt;/rda:producersName&gt;
    &lt;rda:extent xml:lang="en"&gt;28 pages&lt;/rda:extent&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/&gt;
    &lt;frbr:reproductionOf rdf:resource="http://www.example.com/rda-scenarios/6/M4"/&gt;
    &lt;rda:titleProper xml:lang="en"&gt;A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Ballston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony&lt;/rda:titleProper&gt;
  &lt;/rdf:Description&gt;
  &lt;rdf:Description rdf:about="http://www.example.com/rda-scenarios/6/P4"&gt;
    &lt;rdfs:label xml:lang="en"&gt;Collins, Wilkie, 1824-1889&lt;/rdfs:label&gt;
    &lt;rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Person"/&gt;
  &lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6?action=refresh&arena=Page.py&key=Scenarios_2f6.text_html) for this page (cached 2012-12-11 07:21:00)  

Immutable page (last edited 2008-12-22 12:48:44 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


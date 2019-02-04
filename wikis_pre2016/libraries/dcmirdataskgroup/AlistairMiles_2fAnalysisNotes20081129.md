---
title: "- AlistairMiles/AnalysisNotes20081129"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/AlistairMiles_2fAnalysisNotes20081129.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [AlistairMiles/AnalysisNotes20081129](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=fullsearch&value=%2FAnalysisNotes20081129&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Up](http://dublincore.org/dcmirdataskgroup/AlistairMiles "Up")
- [Edit](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129 "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081129_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="AlistairMiles_2fAnalysisNotes20081129_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Notes on Analysis, 2008-11-29

### Scenarios 1, 2 and 3

begin by reviewing recent changes to RDA elements and roles vocabularies.

RDA elements, run diff between

- RDA-elements-20081129-0906.rdf (new)

- RDA-elements-20081112-1212.rdf (last version analysed)

published diff at [http://dublincore.org/dcmirdataskgroup/RdaElements](http://dublincore.org/dcmirdataskgroup/RdaElements)

substantive changes:

- rda:Publisher removed, rda:publisher added

- rda:manufacturerStatement removed, rda:manufactureStatement added

bugs:

- [http://rdvocab.info/Elements/frequency](http://rdvocab.info/Elements/frequency) -- bad case in namespace?

ok, now rerun analysis of scenarios 1, 2 and 3, look for new issues...

scenario 1...

analysis shows no problems; previously problem with rda:publisher not defined

scenario 2...

analysis shows no problems; previously problem with rda:publisher not defined

scenario 3...

analysis shows no problems; previously problem with rda:publisher not defined

uploaded new wiki pages with new analysis, also including rdf/xml output

### Scenario 4

original year of release, use rda:dateOfFirstPublicationOrRelease ?

production company; n.b. there is both rda:producer and rdarole:producer, in addition to rdarole:productionCompany; also there is frbr:producer !

there is also rda:productionStatement, which could be used to construct an n-ary relationship representing the production characteristics?

genre of work, use rda:formOfWork?

composer of musical score? link to score as separate entity, then use rdarole:composer? what to use to link ... frbr:complement?

with rda:duration, use an xsd datatype? which one?

name of expression?

n.b. still have both workTitle and titleOfTheWork; and also, preferredTitleForTheWork is a sub-property of titleOfTheWork, but I've used workTitle in other scenarios.

expressions for french and spanish intertitles, how to link to expression of international version? frbr:alternate applies to manifestations. frbr:complement?

place of production, find...

<pre>&lt;!--Property: Place of publication--&gt;
&lt;rdf:Property rdf:about="http://RDVocab.info/Elements/placeOfPublication"&gt;
  &lt;rdfs:label xml:lang="en"&gt;Place of publication&lt;/rdfs:label&gt;
  &lt;skos:definition xml:lang="en"&gt;
    A place of ***production*** is a place associated with the publication, release, or issuing of a resource. &lt;/skos:definition&gt;
  &lt;rdfs:isDefinedBy rdf:resource="http://RDVocab.info/Elements"/&gt;
  &lt;reg:status rdf:resource="http://metadataregistry.org/uri/RegStatus/1002" /&gt;
&lt;/rdf:Property&gt;

&lt;!--Property: Place of publication--&gt;
&lt;rdf:Property rdf:about="http://RDVocab.info/Elements/placeOfPublication"&gt;
  &lt;rdfs:label xml:lang="en"&gt;Place of publication&lt;/rdfs:label&gt;
  &lt;skos:definition xml:lang="en"&gt;
    A place of publication is a place associated with the publication, release, or issuing of a resource. &lt;/skos:definition&gt;
  &lt;rdfs:isDefinedBy rdf:resource="http://RDVocab.info/Elements"/&gt;
  &lt;reg:status rdf:resource="http://metadataregistry.org/uri/RegStatus/1008" /&gt;
&lt;/rdf:Property&gt;

&lt;!--Property: Place of Production--&gt;
&lt;rdf:Property rdf:about="http://RDVocab.info/Elements/placeOfProduction"&gt;
  &lt;rdfs:label xml:lang="en"&gt;Place of Production&lt;/rdfs:label&gt;
  &lt;rdfs:comment xml:lang="en"&gt;Associated with the FRBR Manifestation entity.&lt;/rdfs:comment&gt;
  &lt;skos:definition xml:lang="en"&gt;
    A place of production is a place associated with the creation, inscription, fabrication, construction, or manufacture (printing, duplicating, casting, etc.) of a resource &lt;/skos:definition&gt;
  &lt;rdfs:isDefinedBy rdf:resource="http://RDVocab.info/Elements"/&gt;
  &lt;reg:status rdf:resource="http://metadataregistry.org/uri/RegStatus/1002" /&gt;
  &lt;skos:note xml:lang="en"&gt;
    Definition source: RDA 2.7.1.1.1
  &lt;/skos:note&gt;
&lt;/rdf:Property&gt;
</pre>

media type? literal? controlled value?

rda digital file characteristics, use a literal? controlled vocab? appropriate for technical characteristics of DVD?

analysis shows place of publication is deprecated (rda:placeOfPublication)... ?

### scenario 5 analysis

medium of performance, free literal or controlled vocab?

medium of performance duplicated at work and expression levels.

content type use free literal or controlled vocab?

language of expression none, how to express?

additional attribute?

identifier for work, find two...

<pre>&lt;!--Property: Work Identifier--&gt;
&lt;rdf:Property rdf:about="http://RDVocab.info/Elements/identifierOfWork"&gt;
  &lt;rdfs:label xml:lang="en"&gt;Work Identifier&lt;/rdfs:label&gt;
  &lt;rdfs:comment xml:lang="en"&gt;Associated with the FRBR Work entity.&lt;/rdfs:comment&gt;
  &lt;skos:definition xml:lang="en"&gt;
    An identifier for the work is number or code uniquely associated with a work that serves to differentiate that work from other works. &lt;/skos:definition&gt;
  &lt;rdfs:isDefinedBy rdf:resource="http://RDVocab.info/Elements"/&gt;
  &lt;reg:status rdf:resource="http://metadataregistry.org/uri/RegStatus/1008" /&gt;
  &lt;skos:note xml:lang="en"&gt;
    Definition source: RDA 6.10.0.1.1
  &lt;/skos:note&gt;
&lt;/rdf:Property&gt;

&lt;!--Property: Identifier for the work--&gt;
&lt;rdf:Property rdf:about="http://RDVocab.info/Elements/identifierForTheWork"&gt;
  &lt;rdfs:label xml:lang="en"&gt;Identifier for the work&lt;/rdfs:label&gt;
  &lt;skos:definition xml:lang="en"&gt;
    A number or code uniquely associated with a work that serves to differentiate that work from other works. &lt;/skos:definition&gt;
  &lt;rdfs:isDefinedBy rdf:resource="http://RDVocab.info/Elements"/&gt;
  &lt;reg:status rdf:resource="http://metadataregistry.org/uri/RegStatus/1002" /&gt;
  &lt;skos:note xml:lang="en"&gt;
    Definition source: RDA 6.10.0.1.1.
  &lt;/skos:note&gt;
&lt;/rdf:Property&gt;
</pre>

statement of responsibility, cannot find a property, altho can find rda:noteOnStatementOfResponsibility ... ? rda:statementOfResponsibilityRelatingToTitle ?

other attribute, as rda:note?

results of analysis:

- missing property rda:statementOfResponsibility

### scenario 6

roles: defendant, reporter ...

producer's name, how to represent?

frbr:complement, which way round? which is complement of what? or should this be symmetric?

reproduction of used at work level, but in FRBR core it's at manifestation level

how to say part of a collection? do at manifestation level? item level? work level? ...

run analysis...

results of analysis:

- rda:titleProper not in vocab? [http://rdvocab.info/Elements/titleProper](http://rdvocab.info/Elements/titleProper) is in, case comparison issue

- rdarole:defendant not in vocab

- rdarole:reporter not in vocab

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/AlistairMiles_2fAnalysisNotes20081129?action=refresh&arena=Page.py&key=AlistairMiles_2fAnalysisNotes20081129.text_html) for this page (cached 2012-11-15 09:11:23)  

Immutable page (last edited 2008-11-29 17:01:55 by [AlistairMiles](http://dublincore.org/dcmirdataskgroup/AlistairMiles))


---
title: Mappings Details
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Schema.org_Alignment/Mappings_Details.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 December 2011, at 13:38.  
This page has been accessed 79,119 times.

Details in support of [raw mapping draft](/mediawiki_wiki/Schema.org_Alignment/Mappings "Schema.org Alignment/Mappings") from [BernardVatant](/mediawiki_wiki/User:BernardVatant "User:BernardVatant")

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Classes"><span class="tocnumber">1</span> <span class="toctext">Classes</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#schema:Organization_rdfs:subClassOf_dct:Agent"><span class="tocnumber">1.1</span> <span class="toctext">schema:Organization rdfs:subClassOf dct:Agent</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#schema:Person_rdfs:subClassOf_dct:Agent"><span class="tocnumber">1.2</span> <span class="toctext">schema:Person rdfs:subClassOf dct:Agent</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#schema:Place_owl:equivalentClass_dct:Location"><span class="tocnumber">1.3</span> <span class="toctext">schema:Place owl:equivalentClass dct:Location</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#schema:Event_owl:equivalentClass_dctype:Event"><span class="tocnumber">1.4</span> <span class="toctext">schema:Event owl:equivalentClass dctype:Event</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#schema:Language_rdfs:subClassOf_dct:LinguisticSystem"><span class="tocnumber">1.5</span> <span class="toctext">schema:Language rdfs:subClassOf dct:LinguisticSystem</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#dct:BibliographicResource_rdfs:subClassOf_schema:CreativeWork"><span class="tocnumber">1.6</span> <span class="toctext">dct:BibliographicResource rdfs:subClassOf schema:CreativeWork</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-8">
          <a href="#Properties"><span class="tocnumber">2</span> <span class="toctext">Properties</span></a>
          <ul>
            <li class="toclevel-2 tocsection-9"><a href="#dct:title_rdfs:subPropertyOf_schema:name"><span class="tocnumber">2.1</span> <span class="toctext">dct:title rdfs:subPropertyOf schema:name</span></a></li>
            <li class="toclevel-2 tocsection-10"><a href="#schema:description_owl:equivalentProperty_dct:description"><span class="tocnumber">2.2</span> <span class="toctext">schema:description owl:equivalentProperty dct:description</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#schema:caption_rdfs:subPropertyOf_dct:description"><span class="tocnumber">2.3</span> <span class="toctext">schema:caption rdfs:subPropertyOf dct:description</span></a></li>
            <li class="toclevel-2 tocsection-12"><a href="#schema:author_rdfs:subPropertyOf_dct:creator"><span class="tocnumber">2.4</span> <span class="toctext">schema:author rdfs:subPropertyOf dct:creator</span></a></li>
            <li class="toclevel-2 tocsection-13"><a href="#schema:about_owl:equivalentProperty_dct:subject"><span class="tocnumber">2.5</span> <span class="toctext">schema:about owl:equivalentProperty dct:subject</span></a></li>
            <li class="toclevel-2 tocsection-14"><a href="#schema:publisher_owl:equivalentProperty_dct:publisher"><span class="tocnumber">2.6</span> <span class="toctext">schema:publisher owl:equivalentProperty dct:publisher</span></a></li>
            <li class="toclevel-2 tocsection-15"><a href="#schema:datePublished_owl:equivalentProperty_dct:issued"><span class="tocnumber">2.7</span> <span class="toctext">schema:datePublished owl:equivalentProperty dct:issued</span></a></li>
            <li class="toclevel-2 tocsection-16"><a href="#schema:inLanguage_owl:equivalentProperty_dc:language"><span class="tocnumber">2.8</span> <span class="toctext">schema:inLanguage owl:equivalentProperty dc:language</span></a></li>
            <li class="toclevel-2 tocsection-17"><a href="#schema:encodings_rdfs:subPropertyOf_dct:format"><span class="tocnumber">2.9</span> <span class="toctext">schema:encodings rdfs:subPropertyOf dct:format</span></a></li>
            <li class="toclevel-2 tocsection-18"><a href="#schema:duration_rdfs:subPropertyOf_dct:extent"><span class="tocnumber">2.10</span> <span class="toctext">schema:duration rdfs:subPropertyOf dct:extent</span></a></li>
            <li class="toclevel-2 tocsection-19"><a href="#schema:keywords_rdfs:subPropertyOf_dc:subject"><span class="tocnumber">2.11</span> <span class="toctext">schema:keywords rdfs:subPropertyOf dc:subject</span></a></li>
            <li class="toclevel-2 tocsection-20"><a href="#schema:url_rdfs:subPropertyOf_dct:identifier"><span class="tocnumber">2.12</span> <span class="toctext">schema:url rdfs:subPropertyOf dct:identifier</span></a></li>
            <li class="toclevel-2 tocsection-21"><a href="#schema:contentLocation_rdfs:subPropertyOf_dct:coverage"><span class="tocnumber">2.13</span> <span class="toctext">schema:contentLocation rdfs:subPropertyOf dct:coverage</span></a></li>
            <li class="toclevel-2 tocsection-22"><a href="#schema:subEvents_rdfs:subPropertyOf_dct:hasPart"><span class="tocnumber">2.14</span> <span class="toctext">schema:subEvents rdfs:subPropertyOf dct:hasPart</span></a></li>
            <li class="toclevel-2 tocsection-23"><a href="#schema:superEvent_rdfs:subPropertyOf_dct:isPartOf"><span class="tocnumber">2.15</span> <span class="toctext">schema:superEvent rdfs:subPropertyOf dct:isPartOf</span></a></li>
            <li class="toclevel-2 tocsection-24"><a href="#schema:contributor_rdfs:subPropertyOf_dct:contributor"><span class="tocnumber">2.16</span> <span class="toctext">schema:contributor rdfs:subPropertyOf dct:contributor</span></a></li>
            <li class="toclevel-2 tocsection-25"><a href="#schema:illustrator_rdfs:subPropertyOf_dct:contributor"><span class="tocnumber">2.17</span> <span class="toctext">schema:illustrator rdfs:subPropertyOf dct:contributor</span></a></li>
            <li class="toclevel-2 tocsection-26"><a href="#schema:actors_rdfs:subPropertyOf_dct:contributor"><span class="tocnumber">2.18</span> <span class="toctext">schema:actors rdfs:subPropertyOf dct:contributor</span></a></li>
            <li class="toclevel-2 tocsection-27"><a href="#schema:director_rdfs:subPropertyOf_dct:contributor"><span class="tocnumber">2.19</span> <span class="toctext">schema:director rdfs:subPropertyOf dct:contributor</span></a></li>
            <li class="toclevel-2 tocsection-28"><a href="#schema:musicBy_rdfs:subPropertyOf_dct:contributor"><span class="tocnumber">2.20</span> <span class="toctext">schema:musicBy rdfs:subPropertyOf dct:contributor</span></a></li>
            <li class="toclevel-2 tocsection-29"><a href="#schema:producer_rdfs:subPropertyOf_dct:creator"><span class="tocnumber">2.21</span> <span class="toctext">schema:producer rdfs:subPropertyOf dct:creator</span></a></li>
            <li class="toclevel-2 tocsection-30"><a href="#schema:productionCompany_rdfs:subPropertyOf_dct:creator"><span class="tocnumber">2.22</span> <span class="toctext">schema:productionCompany rdfs:subPropertyOf dct:creator</span></a></li>
            <li class="toclevel-2 tocsection-31"><a href="#schema:productId_rdfs:subPropertyOf_dct:identifier"><span class="tocnumber">2.23</span> <span class="toctext">schema:productId rdfs:subPropertyOf dct:identifier</span></a></li>
            <li class="toclevel-2 tocsection-32"><a href="#schema:commentTime_rdfs:subPropertyOf_dct:date"><span class="tocnumber">2.24</span> <span class="toctext">schema:commentTime rdfs:subPropertyOf dct:date</span></a></li>
            <li class="toclevel-2 tocsection-33"><a href="#schema:birthDate_rdfs:subPropertyOf_dct:date"><span class="tocnumber">2.25</span> <span class="toctext">schema:birthDate rdfs:subPropertyOf dct:date</span></a></li>
            <li class="toclevel-2 tocsection-34"><a href="#schema:dateModified_rdfs:subPropertyOf_dct:modified"><span class="tocnumber">2.26</span> <span class="toctext">schema:dateModified rdfs:subPropertyOf dct:modified</span></a></li>
            <li class="toclevel-2 tocsection-35"><a href="#schema:mentions_rdfs:subPropertyOf_dct:related"><span class="tocnumber">2.27</span> <span class="toctext">schema:mentions rdfs:subPropertyOf dct:related</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Classes 

### schema:Organization rdfs:subClassOf dct:Agent 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:Agent rdfs:label "Agent"@en-us .
dct:Agent rdfs:comment "A resource that acts or has the power to act."@en-us .
dct:Agent dct:description "Examples of Agent include person, organization, and software agent."@en-us .
dct:Agent rdf:type rdfs:Class .
dct:Agent rdf:type dct:AgentClass .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:Organization rdf:type rdfs:Class .
schema:Organization rdfs:label "Organization"@en .
schema:Organization rdfs:comment "An organization such as a school, NGO, corporation, club, etc."@en .
schema:Organization rdfs:subClassOf schema:Thing .
</pre>
### schema:Person rdfs:subClassOf dct:Agent 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:Agent rdfs:label "Agent"@en-us .
dct:Agent rdfs:comment "A resource that acts or has the power to act."@en-us .
dct:Agent dct:description "Examples of Agent include person, organization, and software agent."@en-us .
dct:Agent rdf:type rdfs:Class .
dct:Agent rdf:type dct:AgentClass .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:Person rdf:type rdfs:Class .
schema:Person rdfs:label "Person"@en .
schema:Person rdfs:comment "A person (alive, dead, undead, or fictional)."@en .
schema:Person rdfs:subClassOf schema:Thing .
</pre>
### schema:Place owl:equivalentClass dct:Location 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:Location rdfs:label "Location"@en-us .
dct:Location rdfs:comment "A spatial region or named place."@en-us .
dct:Location rdf:type rdfs:Class .
dct:Location rdfs:subClassOf dct:LocationPeriodOrJurisdiction .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:Place rdf:type rdfs:Class .
schema:Place rdfs:label "Place"@en .
schema:Place rdfs:comment "Entities that have a somewhat fixed, physical extension."@en .
schema:Place rdfs:subClassOf schema:Thing .
</pre>
### schema:Event owl:equivalentClass dctype:Event 

- [http://dublincore.org/2010/10/11/dctype.rdf#](http://dublincore.org/2010/10/11/dctype.rdf#)
<pre>dctype:Event rdfs:label "Event"@en-us .
dctype:Event rdfs:comment "A non-persistent, time-based occurrence."@en-us .
dctype:Event dct:description "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."@en-us .
dctype:Event rdf:type rdfs:Class .
dctype:Event <a href="http://purl.org/dc/dcam/memberOf" class="external free" rel="nofollow">http://purl.org/dc/dcam/memberOf</a> dct:DCMIType .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:Event rdf:type rdfs:Class .
schema:Event rdfs:label "Event"@en .
schema:Event rdfs:comment "An event happening at a certain time at a certain location."@en .
schema:Event rdfs:subClassOf schema:Thing .
</pre>
### schema:Language rdfs:subClassOf dct:LinguisticSystem 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:LinguisticSystem rdfs:label "Linguistic System"@en-us .
dct:LinguisticSystem rdfs:comment "A system of signs, symbols, sounds, gestures, or rules used in communication."@en-us .
dct:LinguisticSystem dct:description "Examples include written, spoken, sign, and computer languages."@en-us .
dct:LinguisticSystem rdf:type rdfs:Class .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:Language rdf:type rdfs:Class .
schema:Language rdfs:label "Language"@en .
schema:Language rdfs:comment "Natural languages such as Spanish, Tamil, Hindi, English, etc. and programming languages such as Scheme and Lisp."@en .
schema:Language rdfs:subClassOf schema:Intangible .
</pre>
### dct:BibliographicResource rdfs:subClassOf schema:CreativeWork 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:BibliographicResource rdfs:label "Bibliographic Resource"@en-us .
dct:BibliographicResource rdfs:comment "A book, article, or other documentary resource."@en-us .
dct:BibliographicResource rdf:type rdfs:Class .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:CreativeWork rdf:type rdfs:Class .
schema:CreativeWork rdfs:label "Creative Work"@en .
schema:CreativeWork rdfs:comment "The most generic kind of creative work, including books, movies, photographs, software programs, etc."@en .
schema:CreativeWork rdfs:subClassOf schema:Thing .
</pre>
## Properties 

### dct:title rdfs:subPropertyOf schema:name 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:title rdfs:label "Title"@en-us .
dct:title rdfs:comment "A name given to the resource."@en-us .
dct:title rdf:type rdf:Property .
dct:title rdfs:range rdfs:Literal .
dct:title rdfs:subPropertyOf dc:title .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:name rdf:type rdf:Property .
schema:name rdfs:label "Name"@en .
schema:name rdfs:comment "The name of the item."@en .
schema:name rdfs:domain schema:Thing .
schema:name rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:description owl:equivalentProperty dct:description 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:description rdfs:label "Description"@en-us .
dct:description rdfs:comment "An account of the resource."@en-us .
dct:description dct:description "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-us .
dct:description rdf:type rdf:Property .
dct:description rdfs:subPropertyOf dc:description .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:description rdf:type rdf:Property .
schema:description rdfs:label "Description"@en .
schema:description rdfs:comment "A short description of the item."@en .
schema:description rdfs:domain schema:Thing .
schema:description rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:caption rdfs:subPropertyOf dct:description 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:description rdfs:label "Description"@en-us .
dct:description rdfs:comment "An account of the resource."@en-us .
dct:description dct:description "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."@en-us .
dct:description rdf:type rdf:Property .
dct:description rdfs:subPropertyOf dc:description .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:caption rdf:type rdf:Property .
schema:caption rdfs:label "Caption"@en .
schema:caption rdfs:comment "The caption for this object."@en .
_:node16ggigt2ex34 rdf:type owl:Class .
_:node16ggigt2ex35 rdf:first schema:VideoObject .
_:node16ggigt2ex35 rdf:rest _:node16ggigt2ex36 .
_:node16ggigt2ex36 rdf:first schema:ImageObject .
_:node16ggigt2ex36 rdf:rest rdf:nil .
_:node16ggigt2ex34 owl:unionOf _:node16ggigt2ex35 .
schema:caption rdfs:domain _:node16ggigt2ex34 .
schema:caption rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:author rdfs:subPropertyOf dct:creator 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:creator rdfs:label "Creator"@en-us .
dct:creator rdfs:comment "An entity primarily responsible for making the resource."@en-us .
dct:creator dct:description "Examples of a Creator include a person, an organization, or a service."@en-us .
dct:creator <a href="http://www.w3.org/2002/07/owl#equivalentProperty" class="external free" rel="nofollow">http://www.w3.org/2002/07/owl#equivalentProperty</a> <a href="http://xmlns.com/foaf/0.1/maker" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/maker</a> .
dct:creator rdf:type rdf:Property .
dct:creator rdfs:range dct:Agent .
dct:creator rdfs:subPropertyOf dc:creator .
dct:creator rdfs:subPropertyOf dct:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:author rdf:type rdf:Property .
schema:author rdfs:label "Author"@en .
schema:author rdfs:comment "The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangabely."@en .
schema:author rdfs:domain schema:CreativeWork .
_:node16ggigt2ex22 rdf:type owl:Class .
_:node16ggigt2ex23 rdf:first schema:Person .
_:node16ggigt2ex23 rdf:rest _:node16ggigt2ex24 .
_:node16ggigt2ex24 rdf:first schema:Organization .
_:node16ggigt2ex24 rdf:rest rdf:nil .
_:node16ggigt2ex22 owl:unionOf _:node16ggigt2ex23 .
schema:author rdfs:range _:node16ggigt2ex22 .
</pre>
### schema:about owl:equivalentProperty dct:subject 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:subject rdfs:label "Subject"@en-us .
dct:subject rdfs:comment "The topic of the resource."@en-us .
dct:subject dct:description "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-us .
dct:subject rdf:type rdf:Property .
dct:subject skos:note "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (<a href="http://dublincore.org/documents/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/abstract-model/</a>). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-us .
dct:subject rdfs:subPropertyOf dc:subject .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:about rdf:type rdf:Property .
schema:about rdfs:label "About"@en .
schema:about rdfs:comment "The subject matter of the content."@en .
schema:about rdfs:domain schema:CreativeWork .
schema:about rdfs:range schema:Thing .
</pre>
### schema:publisher owl:equivalentProperty dct:publisher 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:publisher rdfs:label "Publisher"@en-us .
dct:publisher rdfs:comment "An entity responsible for making the resource available."@en-us .
dct:publisher dct:description "Examples of a Publisher include a person, an organization, or a service."@en-us .
dct:publisher rdf:type rdf:Property .
dct:publisher rdfs:range dct:Agent .
dct:publisher rdfs:subPropertyOf dc:publisher .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:publisher rdf:type rdf:Property .
schema:publisher rdfs:label "Publisher"@en .
schema:publisher rdfs:comment "The publisher of the creative work."@en .
schema:publisher rdfs:domain schema:CreativeWork .
schema:publisher rdfs:range schema:Organization .
</pre>
### schema:datePublished owl:equivalentProperty dct:issued 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:issued rdfs:label "Date Issued"@en-us .
dct:issued rdfs:comment "Date of formal issuance (e.g., publication) of the resource."@en-us .
dct:issued rdf:type rdf:Property .
dct:issued rdfs:range rdfs:Literal .
dct:issued rdfs:subPropertyOf dc:date .
dct:issued rdfs:subPropertyOf dct:date .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:datePublished rdf:type rdf:Property .
schema:datePublished rdfs:label "Date Published"@en .
schema:datePublished rdfs:comment "Date of first broadcast/publication."@en .
schema:datePublished rdfs:domain schema:CreativeWork .
schema:datePublished rdfs:range <a href="http://www.w3.org/2001/XMLSchema#date" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#date</a> .

</pre>
### schema:inLanguage owl:equivalentProperty dc:language 

- [http://dublincore.org/2010/10/11/dcelements.rdf#](http://dublincore.org/2010/10/11/dcelements.rdf#)
<pre>dc:language rdf:type rdf:Property .
dc:language rdfs:label "Language"@en-us .
dc:language rdfs:comment "A language of the resource."@en-us .
dc:language dct:description "Recommended best practice is to use a controlled vocabulary such as <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a> [RFC4646]."@en-us .
dc:language rdf:type rdf:Property .
dc:language rdfs:seeAlso <a href="http://www.ietf.org/rfc/rfc4646.txt" class="external free" rel="nofollow">http://www.ietf.org/rfc/rfc4646.txt</a> .
dc:language skos:note "A second property with the same name as this property has been declared in the dcterms: namespace (dct:). See the Introduction to the document \"DCMI Metadata Terms\" (<a href="http://dublincore.org/documents/dcmi-terms/" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/</a>) for an explanation."@en-us .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:inLanguage rdf:type rdf:Property .
schema:inLanguage rdfs:label "In Language"@en .
schema:inLanguage rdfs:comment "The language of the content. please use one of the language codes from the IETF BCP 47 standard."@en .
schema:inLanguage rdfs:domain schema:CreativeWork .
schema:inLanguage rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:encodings rdfs:subPropertyOf dct:format 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:format rdfs:label "Format"@en-us .
dct:format rdfs:comment "The file format, physical medium, or dimensions of the resource."@en-us .
dct:format dct:description "Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME]."@en-us .
dct:format rdf:type rdf:Property .
dct:format rdfs:range dct:MediaTypeOrExtent .
dct:format rdfs:subPropertyOf dc:format .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:encodings rdf:type rdf:Property .
schema:encodings rdfs:label "Encodings"@en .
schema:encodings rdfs:comment "The media objects that encode this creative work"@en .
schema:encodings rdfs:domain schema:CreativeWork .
schema:encodings rdfs:range schema:MediaObject .
</pre>
### schema:duration rdfs:subPropertyOf dct:extent 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:extent rdfs:label "Extent"@en-us .
dct:extent rdfs:comment "The size or duration of the resource."@en-us .
dct:extent rdf:type rdf:Property .
dct:extent rdfs:range dct:SizeOrDuration .
dct:extent rdfs:subPropertyOf dc:format .
dct:extent rdfs:subPropertyOf dct:format .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:duration rdf:type rdf:Property .
schema:duration rdfs:label "Duration"@en .
schema:duration rdfs:comment "The duration of the item (movie, audio recording, event, etc.) in ISO 8601 date format."@en .
_:node16ggigt2ex56 rdf:type owl:Class .
_:node16ggigt2ex57 rdf:first schema:Movie .
_:node16ggigt2ex57 rdf:rest _:node16ggigt2ex58 .
_:node16ggigt2ex58 rdf:first schema:MediaObject .
_:node16ggigt2ex58 rdf:rest _:node16ggigt2ex59 .
_:node16ggigt2ex59 rdf:first schema:MusicRecording .
_:node16ggigt2ex59 rdf:rest _:node16ggigt2ex60 .
_:node16ggigt2ex60 rdf:first schema:Event .
_:node16ggigt2ex60 rdf:rest rdf:nil .
_:node16ggigt2ex56 owl:unionOf _:node16ggigt2ex57 .
schema:duration rdfs:domain _:node16ggigt2ex56 .
schema:duration rdfs:range schema:Duration .
</pre>
### schema:keywords rdfs:subPropertyOf dc:subject 

- [http://dublincore.org/2010/10/11/dcelements.rdf#](http://dublincore.org/2010/10/11/dcelements.rdf#)
<pre>dc:subject rdf:type rdf:Property .
dc:subject rdfs:label "Subject"@en-us .
dc:subject rdfs:comment "The topic of the resource."@en-us .
dc:subject dct:description "Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary. To describe the spatial or temporal topic of the resource, use the Coverage element."@en-us .
dc:subject rdf:type rdf:Property .
dc:subject skos:note "A second property with the same name as this property has been declared in the dcterms: namespace (dct:). See the Introduction to the document \"DCMI Metadata Terms\" (<a href="http://dublincore.org/documents/dcmi-terms/" class="external free" rel="nofollow">http://dublincore.org/documents/dcmi-terms/</a>) for an explanation."@en-us .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:keywords rdf:type rdf:Property .
schema:keywords rdfs:label "Keywords"@en .
schema:keywords rdfs:comment "The keywords/tags used to describe this content."@en .
schema:keywords rdfs:domain schema:CreativeWork .
schema:keywords rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:url rdfs:subPropertyOf dct:identifier 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:identifier rdfs:label "Identifier"@en-us .
dct:identifier rdfs:comment "An unambiguous reference to the resource within a given context."@en-us .
dct:identifier dct:description "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-us .
dct:identifier rdf:type rdf:Property .
dct:identifier rdfs:range rdfs:Literal .
dct:identifier rdfs:subPropertyOf dc:identifier .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:url rdf:type rdf:Property .
schema:url rdfs:label "URL"@en .
schema:url rdfs:comment "URL of the item."@en .
schema:url rdfs:domain schema:Thing .
schema:url rdfs:range rdfs:Resource .
</pre>
### schema:contentLocation rdfs:subPropertyOf dct:coverage 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:coverage rdfs:label "Coverage"@en-us .
dct:coverage rdfs:comment "The spatial or temporal topic of the resource, the spatial applicability of the resource, or the jurisdiction under which the resource is relevant."@en-us .
dct:coverage dct:description "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended best practice is to use a controlled vocabulary such as the Thesaurus of Geographic Names [TGN]. Where appropriate, named places or time periods can be used in preference to numeric identifiers such as sets of coordinates or date ranges."@en-us .
dct:coverage rdf:type rdf:Property .
dct:coverage rdfs:range dct:LocationPeriodOrJurisdiction .
dct:coverage rdfs:subPropertyOf dc:coverage .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:contentLocation rdf:type rdf:Property .
schema:contentLocation rdfs:label "Content Location"@en .
schema:contentLocation rdfs:comment "The location of the content."@en .
schema:contentLocation rdfs:domain schema:CreativeWork .
schema:contentLocation rdfs:range schema:Place .
</pre>
### schema:subEvents rdfs:subPropertyOf dct:hasPart 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:hasPart rdfs:label "Has Part"@en-us .
dct:hasPart rdfs:comment "A related resource that is included either physically or logically in the described resource."@en-us .
dct:hasPart rdf:type rdf:Property .
dct:hasPart skos:note "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (<a href="http://dublincore.org/documents/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/abstract-model/</a>). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-us .
dct:hasPart rdfs:subPropertyOf dc:relation .
dct:hasPart rdfs:subPropertyOf dct:relation .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:subEvents rdf:type rdf:Property .
schema:subEvents rdfs:label "Sub Events"@en .
schema:subEvents rdfs:comment "Events that are a part of this event. For example, a conference event includes many presentations, each are subEvents of the conference."@en .
schema:subEvents rdfs:domain schema:Event .
schema:subEvents rdfs:range schema:Event .
</pre>
### schema:superEvent rdfs:subPropertyOf dct:isPartOf 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:isPartOf rdfs:label "Is Part Of"@en-us .
dct:isPartOf rdfs:comment "A related resource in which the described resource is physically or logically included."@en-us .
dct:isPartOf rdf:type rdf:Property .
dct:isPartOf skos:note "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (<a href="http://dublincore.org/documents/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/abstract-model/</a>). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-us .
dct:isPartOf rdfs:subPropertyOf dc:relation .
dct:isPartOf rdfs:subPropertyOf dct:relation .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:superEvent rdf:type rdf:Property .
schema:superEvent rdfs:label "Super Event"@en .
schema:superEvent rdfs:comment "An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent."@en .
schema:superEvent rdfs:domain schema:Event .
schema:superEvent rdfs:range schema:Event .
</pre>
### schema:contributor rdfs:subPropertyOf dct:contributor 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:contributor rdfs:label "Contributor"@en-us .
dct:contributor rdfs:comment "An entity responsible for making contributions to the resource."@en-us .
dct:contributor dct:description "Examples of a Contributor include a person, an organization, or a service."@en-us .
dct:contributor rdf:type rdf:Property .
dct:contributor rdfs:range dct:Agent .
dct:contributor rdfs:subPropertyOf dc:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:contributor rdf:type rdf:Property .
schema:contributor rdfs:label "Contributor"@en .
schema:contributor rdfs:comment "A secondary contributor to the CreativeWork."@en .
schema:contributor rdfs:domain schema:CreativeWork .
_:node16ggigt2ex40 rdf:type owl:Class .
_:node16ggigt2ex41 rdf:first schema:Person .
_:node16ggigt2ex41 rdf:rest _:node16ggigt2ex42 .
_:node16ggigt2ex42 rdf:first schema:Organization .
_:node16ggigt2ex42 rdf:rest rdf:nil .
_:node16ggigt2ex40 owl:unionOf _:node16ggigt2ex41 .
schema:contributor rdfs:range _:node16ggigt2ex40 .
</pre>
### schema:illustrator rdfs:subPropertyOf dct:contributor 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:contributor rdfs:label "Contributor"@en-us .
dct:contributor rdfs:comment "An entity responsible for making contributions to the resource."@en-us .
dct:contributor dct:description "Examples of a Contributor include a person, an organization, or a service."@en-us .
dct:contributor rdf:type rdf:Property .
dct:contributor rdfs:range dct:Agent .
dct:contributor rdfs:subPropertyOf dc:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:illustrator rdf:type rdf:Property .
schema:illustrator rdfs:label "Illustrator"@en .
schema:illustrator rdfs:comment "The illustrator of the book."@en .
schema:illustrator rdfs:domain schema:Book .
schema:illustrator rdfs:range schema:Person .
</pre>
### schema:actors rdfs:subPropertyOf dct:contributor 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:contributor rdfs:label "Contributor"@en-us .
dct:contributor rdfs:comment "An entity responsible for making contributions to the resource."@en-us .
dct:contributor dct:description "Examples of a Contributor include a person, an organization, or a service."@en-us .
dct:contributor rdf:type rdf:Property .
dct:contributor rdfs:range dct:Agent .
dct:contributor rdfs:subPropertyOf dc:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:actors rdf:type rdf:Property .
schema:actors rdfs:label "Actors"@en .
schema:actors rdfs:comment "A cast member of the movie, TV series, season, or episode, or video."@en .
_:node16ggigt2ex5 rdf:type owl:Class .
_:node16ggigt2ex6 rdf:first schema:TVEpisode .
_:node16ggigt2ex6 rdf:rest _:node16ggigt2ex7 .
_:node16ggigt2ex7 rdf:first schema:Movie .
_:node16ggigt2ex7 rdf:rest _:node16ggigt2ex8 .
_:node16ggigt2ex8 rdf:first schema:TVSeries .
_:node16ggigt2ex8 rdf:rest rdf:nil .
_:node16ggigt2ex5 owl:unionOf _:node16ggigt2ex6 .
schema:actors rdfs:domain _:node16ggigt2ex5 .
schema:actors rdfs:range schema:Person .
</pre>
### schema:director rdfs:subPropertyOf dct:contributor 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:contributor rdfs:label "Contributor"@en-us .
dct:contributor rdfs:comment "An entity responsible for making contributions to the resource."@en-us .
dct:contributor dct:description "Examples of a Contributor include a person, an organization, or a service."@en-us .
dct:contributor rdf:type rdf:Property .
dct:contributor rdfs:range dct:Agent .
dct:contributor rdfs:subPropertyOf dc:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:director rdf:type rdf:Property .
schema:director rdfs:label "Director"@en .
schema:director rdfs:comment "The director of the movie, TV episode, or series."@en .
_:node16ggigt2ex52 rdf:type owl:Class .
_:node16ggigt2ex53 rdf:first schema:TVEpisode .
_:node16ggigt2ex53 rdf:rest _:node16ggigt2ex54 .
_:node16ggigt2ex54 rdf:first schema:Movie .
_:node16ggigt2ex54 rdf:rest _:node16ggigt2ex55 .
_:node16ggigt2ex55 rdf:first schema:TVSeries .
_:node16ggigt2ex55 rdf:rest rdf:nil .
_:node16ggigt2ex52 owl:unionOf _:node16ggigt2ex53 .
schema:director rdfs:domain _:node16ggigt2ex52 .
schema:director rdfs:range schema:Person .
</pre>
### schema:musicBy rdfs:subPropertyOf dct:contributor 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:contributor rdfs:label "Contributor"@en-us .
dct:contributor rdfs:comment "An entity responsible for making contributions to the resource."@en-us .
dct:contributor dct:description "Examples of a Contributor include a person, an organization, or a service."@en-us .
dct:contributor rdf:type rdf:Property .
dct:contributor rdfs:range dct:Agent .
dct:contributor rdfs:subPropertyOf dc:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:musicBy rdf:type rdf:Property .
schema:musicBy rdfs:label "Music by"@en .
schema:musicBy rdfs:comment "The composer of the movie or TV soundtrack."@en .
_:node16ggigt2ex124 rdf:type owl:Class .
_:node16ggigt2ex125 rdf:first schema:TVEpisode .
_:node16ggigt2ex125 rdf:rest _:node16ggigt2ex126 .
_:node16ggigt2ex126 rdf:first schema:Movie .
_:node16ggigt2ex126 rdf:rest _:node16ggigt2ex127 .
_:node16ggigt2ex127 rdf:first schema:TVSeries .
_:node16ggigt2ex127 rdf:rest rdf:nil .
_:node16ggigt2ex124 owl:unionOf _:node16ggigt2ex125 .
schema:musicBy rdfs:domain _:node16ggigt2ex124 .
_:node16ggigt2ex128 rdf:type owl:Class .
_:node16ggigt2ex129 rdf:first schema:Person .
_:node16ggigt2ex129 rdf:rest _:node16ggigt2ex130 .
_:node16ggigt2ex130 rdf:first schema:MusicGroup .
_:node16ggigt2ex130 rdf:rest rdf:nil .
_:node16ggigt2ex128 owl:unionOf _:node16ggigt2ex129 .
schema:musicBy rdfs:range _:node16ggigt2ex128 .
</pre>
### schema:producer rdfs:subPropertyOf dct:creator 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:creator rdfs:label "Creator"@en-us .
dct:creator rdfs:comment "An entity primarily responsible for making the resource."@en-us .
dct:creator dct:description "Examples of a Creator include a person, an organization, or a service."@en-us .
dct:creator <a href="http://www.w3.org/2002/07/owl#equivalentProperty" class="external free" rel="nofollow">http://www.w3.org/2002/07/owl#equivalentProperty</a> <a href="http://xmlns.com/foaf/0.1/maker" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/maker</a> .
dct:creator rdf:type rdf:Property .
dct:creator rdfs:range dct:Agent .
dct:creator rdfs:subPropertyOf dc:creator .
dct:creator rdfs:subPropertyOf dct:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:producer rdf:type rdf:Property .
schema:producer rdfs:label "Producer"@en .
schema:producer rdfs:comment "The producer of the movie, TV series, season, or episode, or video."@en .
_:node16ggigt2ex153 rdf:type owl:Class .
_:node16ggigt2ex154 rdf:first schema:TVEpisode .
_:node16ggigt2ex154 rdf:rest _:node16ggigt2ex155 .
_:node16ggigt2ex155 rdf:first schema:Movie .
_:node16ggigt2ex155 rdf:rest _:node16ggigt2ex156 .
_:node16ggigt2ex156 rdf:first schema:TVSeries .
_:node16ggigt2ex156 rdf:rest rdf:nil .
_:node16ggigt2ex153 owl:unionOf _:node16ggigt2ex154 .
schema:producer rdfs:domain _:node16ggigt2ex153 .
schema:producer rdfs:range schema:Person .
</pre>
### schema:productionCompany rdfs:subPropertyOf dct:creator 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:creator rdfs:label "Creator"@en-us .
dct:creator rdfs:comment "An entity primarily responsible for making the resource."@en-us .
dct:creator dct:description "Examples of a Creator include a person, an organization, or a service."@en-us .
dct:creator <a href="http://www.w3.org/2002/07/owl#equivalentProperty" class="external free" rel="nofollow">http://www.w3.org/2002/07/owl#equivalentProperty</a> <a href="http://xmlns.com/foaf/0.1/maker" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/maker</a> .
dct:creator rdf:type rdf:Property .
dct:creator rdfs:range dct:Agent .
dct:creator rdfs:subPropertyOf dc:creator .
dct:creator rdfs:subPropertyOf dct:contributor .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:productionCompany rdf:type rdf:Property .
schema:productionCompany rdfs:label "Production Company"@en .
schema:productionCompany rdfs:comment "The production company or studio that made the movie, TV series, season, or episode, or video."@en .
_:node16ggigt2ex157 rdf:type owl:Class .
_:node16ggigt2ex158 rdf:first schema:TVEpisode .
_:node16ggigt2ex158 rdf:rest _:node16ggigt2ex159 .
_:node16ggigt2ex159 rdf:first schema:Movie .
_:node16ggigt2ex159 rdf:rest _:node16ggigt2ex160 .
_:node16ggigt2ex160 rdf:first schema:VideoObject .
_:node16ggigt2ex160 rdf:rest _:node16ggigt2ex161 .
_:node16ggigt2ex161 rdf:first schema:TVSeries .
_:node16ggigt2ex161 rdf:rest rdf:nil .
_:node16ggigt2ex157 owl:unionOf _:node16ggigt2ex158 .
schema:productionCompany rdfs:domain _:node16ggigt2ex157 .
schema:productionCompany rdfs:range schema:Organization .
</pre>
### schema:productId rdfs:subPropertyOf dct:identifier 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:identifier rdfs:label "Identifier"@en-us .
dct:identifier rdfs:comment "An unambiguous reference to the resource within a given context."@en-us .
dct:identifier dct:description "Recommended best practice is to identify the resource by means of a string conforming to a formal identification system. "@en-us .
dct:identifier rdf:type rdf:Property .
dct:identifier rdfs:range rdfs:Literal .
dct:identifier rdfs:subPropertyOf dc:identifier .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:productID rdf:type rdf:Property .
schema:productID rdfs:label "Product ID"@en .
schema:productID rdfs:comment "The product identifier, such as ISBN. For example: meta itemprop='productID' content='isbn:123-456-789'/."@en .
schema:productID rdfs:domain schema:Product .
schema:productID rdfs:range <a href="http://www.w3.org/2001/XMLSchema#string" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#string</a> .
</pre>
### schema:commentTime rdfs:subPropertyOf dct:date 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:date rdfs:label "Date"@en-us .
dct:date rdfs:comment "A point or period of time associated with an event in the lifecycle of the resource."@en-us .
dct:date dct:description "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-us .
dct:date rdf:type rdf:Property .
dct:date rdfs:range rdfs:Literal .
dct:date rdfs:subPropertyOf dc:date .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:commentTime rdf:type rdf:Property .
schema:commentTime rdfs:label "Comment Time"@en .
schema:commentTime rdfs:comment "The time at which the UserComment was made."@en .
schema:commentTime rdfs:domain schema:UserComments .
schema:commentTime rdfs:range <a href="http://www.w3.org/2001/XMLSchema#date" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#date</a> .
</pre>
### schema:birthDate rdfs:subPropertyOf dct:date 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:date rdfs:label "Date"@en-us .
dct:date rdfs:comment "A point or period of time associated with an event in the lifecycle of the resource."@en-us .
dct:date dct:description "Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF]."@en-us .
dct:date rdf:type rdf:Property .
dct:date rdfs:range rdfs:Literal .
dct:date rdfs:subPropertyOf dc:date .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:birthDate rdf:type rdf:Property .
schema:birthDate rdfs:label "Birth Date"@en .
schema:birthDate rdfs:comment "Date of birth."@en .
schema:birthDate rdfs:domain schema:Person .
schema:birthDate rdfs:range <a href="http://www.w3.org/2001/XMLSchema#date" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#date</a> .
</pre>
### schema:dateModified rdfs:subPropertyOf dct:modified 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:modified rdfs:label "Date Modified"@en-us .
dct:modified rdfs:comment "Date on which the resource was changed."@en-us .
dct:modified rdf:type rdf:Property .
dct:modified rdfs:range rdfs:Literal .
dct:modified rdfs:subPropertyOf dc:date .
dct:modified rdfs:subPropertyOf dct:date .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:dateModified rdf:type rdf:Property .
schema:dateModified rdfs:label "Date Modified"@en .
schema:dateModified rdfs:comment "The date on which the CreativeWork was most recently modified."@en .
schema:dateModified rdfs:domain schema:CreativeWork .
schema:dateModified rdfs:range <a href="http://www.w3.org/2001/XMLSchema#date" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#date</a> .
</pre>
### schema:mentions rdfs:subPropertyOf dct:related 

- [http://dublincore.org/2010/10/11/dcterms.rdf#](http://dublincore.org/2010/10/11/dcterms.rdf#)
<pre>dct:relation rdfs:label "Relation"@en-us .
dct:relation rdfs:comment "A related resource."@en-us .
dct:relation dct:description "Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system. "@en-us .
dct:relation rdf:type rdf:Property .
dct:relation dct:hasVersion <a href="http://dublincore.org/usage/terms/history/#relationT-001" class="external free" rel="nofollow">http://dublincore.org/usage/terms/history/#relationT-001</a> .
dct:relation skos:note "This term is intended to be used with non-literal values as defined in the DCMI Abstract Model (<a href="http://dublincore.org/documents/abstract-model/" class="external free" rel="nofollow">http://dublincore.org/documents/abstract-model/</a>). As of December 2007, the DCMI Usage Board is seeking a way to express this intention with a formal range declaration."@en-us .
dct:relation rdfs:subPropertyOf dc:relation .
</pre>
- [http://schema.rdfs.org/all.nt](http://schema.rdfs.org/all.nt) (based on [http://schema.org/docs/schemaorg.owl](http://schema.org/docs/schemaorg.owl))
<pre>schema:mentions rdf:type rdf:Property .
schema:mentions rdfs:label "Mentions"@en .
schema:mentions rdfs:comment "Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept."@en .
schema:mentions rdfs:domain schema:CreativeWork .
schema:mentions rdfs:range schema:Thing .
</pre>

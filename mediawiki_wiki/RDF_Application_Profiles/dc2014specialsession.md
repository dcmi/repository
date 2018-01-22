---
title: dc2014specialsession
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/RDF_Application_Profiles/dc2014specialsession.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 28 October 2014, at 02:07.  
This page has been accessed 68,360 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Special_session_at_DC-2014"><span class="tocnumber">1</span> <span class="toctext">Special session at DC-2014</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Abstract"><span class="tocnumber">1.1</span> <span class="toctext">Abstract</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Scope_and_Motivation"><span class="tocnumber">1.2</span> <span class="toctext">Scope and Motivation</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Outline"><span class="tocnumber">1.3</span> <span class="toctext">Outline</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Discussion_questions"><span class="tocnumber">1.4</span> <span class="toctext">Discussion questions</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Special session at DC-2014 

- Session title: RDF Application Profiles and Tools for Metadata Validation and Quality Control
- Day/Time: Thursday, October 9, 2014, 1:30-5:00
- Venue: AT&T Executive Education and Conference Center
- Facilitator: Mark Matienzo, Digital Public Library of America (mark at dp.la)
- **[Public Google Doc for notetaking](https://docs.google.com/document/d/1ExmMZCg5mApOzNAHvL4pDS_geHuoWcj26nNW3vmmiRM/edit)**

## Abstract 

This session will focus on establishing requirements for implementing Application Profiles from the perspective of software developers. In particular, our interests include the requirements necessary for performing validation and quality checks within tools, and the extent to which established and developing constraint languages remain valuable in our context.

## Scope and Motivation 

Over the last fourteen years, the DCMI community has focused much of its efforts on the development of Application Profiles as a means to enable reuse of properties across multiple schemas, as well as constraint languages to express those profiles. Building on the DC-2013 special session, [Application Profiles as an Alternative to OWL Ontologies](http://dcevents.dublincore.org/IntConf/index/pages/view/APaltOO), and the DC-2014 tutorial, [RDF Validation in the Cultural Heritage Community](/mediawiki_wiki/RDF_Application_Profiles/dc2014 "RDF Application Profiles/dc2014"), this session will explore the requirements for defining and implementing Application Profiles from the perspective of software developers and other implementers. In particular, our session will focus on the requirements necessary for performing validation and quality checks within tools, and the extent to which established and developing constraint languages, such as Description Set Profiles and Shape Expressions/RDF Data Shapes, remain valuable in our context.

## Outline 

- 1:30-1:40: [Introduction to session and speakers](https://docs.google.com/a/dp.la/presentation/d/1_PBUH2eC2HeH_PYsj51a_O9b6b81pMHvVItK7aynNXU/edit#slide=id.p) (Mark Matienzo, Digital Public Library of America)
- 1:40-3:00: Presentations (titles and descriptions forthcoming)
  - Dave Wood (3 Round Stones) - [W3C RDF Data Shapes Working Group](http://www.slideshare.net/3roundstones/w3c-data-shapes-working-group)
  - Tom Johnson (Digital Public Library of America) - [Practical Validation](http://bit.ly/dcmi14-rdf)
  - Eric Miller (Zepheira) - [On Pumpkins and Profiles](http://dcevents.dublincore.org/IntConf/dc-2014/paper/view/214/351)
  - Kevin Ford (Library of Congress) - [Presentation links on validation](http://3windmills.com/validation-links.html)
- 3:00-3:30: Break
- 3:30-4:00: Discussion of discussion questions/presentations among panelists
- 4:00-end: Open discussion between panelists and participants

## Discussion questions 

- How can Application Profile-based validation provide meaningful feedback to a user editing a "record" or set of statements?
- From the perspective of an implementer, what do we mean by "validation"?
- Does "validation" mean different things from the perspective of implementers building user-facing tools or automated systems to perform these checks?
- How are existing constraint languages valuable to implementers, particularly if the tools we are building cannot interpret or act on them natively?
- Should we prioritize developing tools that can interpret serialized constraint definitions, or ensuring that our tools and systems can serialize their constraints into one of these languages?
- How can validation requirements inform user interface design and behavior when building user-facing systems for metadata entry or validation?
- Are constraint languages or other representations of Application Profiles adequate for users to specify constraints, and if so, what background knowledge do we expect users to have when creating them?
- How important is validation? Lots of XML and the like are "invalid" per their schema, yet the world has not collapsed. Discuss.
- How can we embrace the concept of an open world assumption whilst investing in the closed world view necessitated by validation, which will surely be based on verifiable constraints?


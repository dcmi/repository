---
title: TB minutes-102014
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/TB_minutes-102014.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 23 October 2014, at 08:37.  
This page has been accessed 27,339 times.

_Technical Board (TB) Meeting, October 11th,Austin_

* * *

**People:**

**Usage Committee (UC):**

Kai Eckert (attends)'

Tom Baker (attends)

Julie Allinson

Pete Johnston

Stefanie Rühle (attends)

Joe Tennis

**Community Specifications Committee (CSC)**

Valentine Charles (attends)

Stuart Sutton(attends)

**Standards and Liaisons Committee (SLC)**

Leif Andresen (will not attend)

**Further people:**

Karen Coyle(attends)

Francesca Schulze(attends)

Konstantin Baierer(attends)

Joseph Busch(attends)

Jon Kunze(attends)

Marcia Zeng (attends)

**Minutes**

**Main points of action** To CSC: send the minutes of the meeting to the advisory board and prepare an email for the communities to announce their closing and redirect them to the to-be-created list for future discussion. To TB: create new mailing list for general discussion on technical related matters. To CSC create namespaces for properties from DCMI libraries Libraries application profile and User guide and transfer the docs to the DCMI website To TB follow up on t the question of the DCMI website revamp. To UC to follow-up on the addition of OWL qualifiers for DC. To TB create an issue tracker and strat using it for the update of the documentation. Note that the issues could be related to other topics as well. To CSC to define a template for specifications including administrative metadata such as an history of changes, dates, names of reviewers. Specifications with new coined elements: elements should be declared in the schema.

**Session 1**

Intro (Kai)

History of Usage Committee (Tom)

Role of the comittee was to maintain DC terms and also validate the extensions proposals. Domain and Range defined in 2008 2009 last face to face meeting of the usage board. Quite inactive for the past years. Previous members were contacted and some people decided to step down Inactivity of the list is not a bad thing. Last changes were more editorial Scope: it was lot of work to review applications profiles for the group (and quite tedious) Guidelines for AP were really specific

Stuart: the last terms were coined in 2005 . Communitites were developnig AP but the terms were not replicated in the model. The role of the usage committe was to verify that the APs conformed to the defined guidelines (schema, documentation..) SWAP for instance was not validated

Valentine: should the work have been more controlled at the beginning? Stuart: the issue was that the bar was to high for people for proposing additions Tom: for instance the new dcterms should be reviewed by the usage board to be then validated by NISO/ISO Karen: will we be able to comment on that? Stuart: yes it will come back for comments

Kai: This brings back to the definition of the role of CSC &UC Stuart: We started to create communities and the terms from APs were replicated in the model. But then communities could't coin any new terms. We should have the namespace to coin terms at community levels.

Kai: the difference for the APs is the commitment of the people. DCMI might not maintain things. Tom: the AP will be in a different namespaces: Dublin Core. org and the purl ids (could point to a document RDFa). The domain name could be different. DCMI will be the holding insitution

Karen: Purl infrastructure is in OCLC and DCMI is maintainer of the purl. DC infrastructure should be stable.

**Decision point: purl.org/dcx/ could be the domain. Separate namespace open to be fleshed out.**

Valentine: if the commmunity provides a report the id would be the id of the wiki. Kai: dcx can be used to reallly separate the profiles from dc. If a communitiy cease to exist we will maintain it. Valentine: if a community re-use a vocabulary from another community what should we do? It should be flagged by CSC and decision taken by UC. Kai: if someone would like to modify something, they should create a new vocabulary

Stefanie: What is the difference between task group and communities? The work should happen in the task group

Karen: if we need communities they will be created. Kai: if people wants to engage they could be part of the CSC. The general DC list could be used for discussion or attract people under the CSC. Tom: the technical board could decide to have no opinion on the communties and work only at the level of the task group Stefanie: we should recommend to the Advisory Board the use of one list Karen: maybe we shouldn't use the general list as it is more for announcment

Kai: we need a list for the discussion dc-to-be-decided list

Valentine: so we would have dcto-be-decided (could be merged with TB-list) dc-architecture dc-CSC dc-UC

Kai: so we don't need to decide now but probably we will start with fewer mailing list

Stuart: it is written in the bylaws when a task group and a communities are alive Task Group report regularly Communtities report regularly for events

Kai: let's act upon the bylaws and closed the communities.

**ACTION for CSC: send the minutes of the meeting to the advisory board and prepare an email for the communities to announce their closing and redirect them to the to-be-created list for future discussion.**

**ACTION for TB: create new mailing list**

Stefanie: DCMI libraries Libraries application profile and User guide need to be transfered to DCMI

**ACTION for CSC create namespaces for properties from these documents.**

Kai: we might want a task group for the website to improve the searchability on the website. Stefanie: when a task group had finished its work the committee should handle the publication

Kai: who is responsible to make DC the best website? Outreach? Tom: the problem is that the portal is maintain in a really manual way The work themes for instance should be the responsibility of the TB We could change only the homepage to make it more users friendly ACTION for TB follow up on the question of the website revamp. Marcia: we just need a additional navigational page

Kai: new item adding OWL to DC vocabularies as a way qualify properties Tom: do you mean having a OWL representation for DC in the same way we have RDF Kai: no Karen: for instance in Protege some programs need OWL dcterms is transformed by programs to WL in a quite nice way but there is problem for DC. There is not enough information to be translated in OWL Stanford has developed a version of DC elements in OWL which is in their domain. Are we ok with that? or should we provide a version of DC in OWL? Kai: we still have to add missing information for OWL. We need to be careful though Tom: @Karen do you mean that if we add information to OWL it will invalidate the Stanford RDF Karen: it is about the Manchester program Kai: we have to see if the problem is with the software or on the Stanford side. If those qualifiers are useful for everybody we should add them Karen: I don't think they are useful for everybody Tom: We have to see. If it is a problem to mix both we have to create two different instances.

**ACTION for UC to follow-up on the addition of OWL qualifiers for DC.**

* * *

**Session 2**

User Guide (Diane Hillman/Stefanie Ruehle)

Marcia: the examples are not good enough for students to answer Stuart: the education&outreach group has been created for that. Tom: the TB could review the content that is on the main website and decide what shouldn't be there. Kai: we need a metadata basic Karen: lot of books have been published so we could re-use the content Valentine: there is also the coursera mooc on metadata. Kai: maybe it is better if we get reviews for those books and then link people to those publication Karen: the wikipedia article for Dublin Core is also really bad Kai: Good opportunity to re-position oursleves by updating the page (DC is not only the 15) Karen: we should have one big page with links pointing to different examples Tom: the problem is that we should have a good way to link to examples. Kai: Let's review what we have and see what can be re-used . A issue tracker could be good for handling those situation (Github). Everybody (especially advisory board) could contribute and brainstorm. Valentine: some aspects won't be covered by the documentation. We could have in complement some screencasts, tutorials to help.

**ACTION for TB create an issue tracker and strat using it for the update of the documentation. Note that the issues could be related to other topics as well.**

Kai: a task group can be created to maintain it. We have to classify the issues and then define a roadmap. The only issue is that you need a Github account

Marcia: maybe we need an agile review process for the specifications Kai: I think the CSC should do it. It is slightly different for the web pages.

Kai: could be the role of DCMI to ensure some sustainability to specifications created under an external project (EU project for instance).

Tom: how you can anchor the issue of vocabulary maintenance in a broader perspective. Kai: we could offer it a a service included in the membership Valentine: the access part is also important (metadata registries..) Valentine: summary of the process: various ways to get specifications, public review, publication within CSC and then re-organised regular review to guarantee freshness of info.

For specifications coming from outside: check consistency, see some kind of templates. For task group: the work should be tracked a bit closely. Check adequacy between the initial scope and the outcome. The CSC should be allowed to ask information in case the task group derives from its initial scope. Kai: Should a documentation in English be mandatory? All: yes if the specifications is originally not in English it should be translated. Marcia: what should we do for NKOS? Kai: first we have to decide whether it is staying in the CSC or idoes it go to the UC Tom: We should not spend too much time defining templates. Kai: we need a process if the chairs are coming in they are automatically added to the CSC. The cases should be documented to feed some future recommendations from the CSC.

**ACTION for CSC to define administrative metadata such as an history of changes, dates, names of reviewers.**

Specifications with new coined elements: elements should be declared in the schema. Fine if the documents are different. Could give recommendations on how to declare properties (reference dcterms elements).


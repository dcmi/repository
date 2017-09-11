---
title: RDA Task Group Historical Archives
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCMI/RDA_Task_Group_Historical_Archives.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 6 January 2012, at 16:09.  
This page has been accessed 119,014 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Former_Front_Page_at_http:.2F.2Fdublincore.org.2Fdcmirdataskgroup.2F"><span class="tocnumber">1</span> <span class="toctext">Former Front Page at http://dublincore.org/dcmirdataskgroup/</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Announcements"><span class="tocnumber">1.1</span> <span class="toctext">Announcements</span></a></li>
            <li class="toclevel-2 tocsection-3">
              <a href="#Wiki_Pages"><span class="tocnumber">1.2</span> <span class="toctext">Wiki Pages</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#Task_Analyses"><span class="tocnumber">1.2.1</span> <span class="toctext">Task Analyses</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-5">
              <a href="#Charter_and_Work_Plan"><span class="tocnumber">1.3</span> <span class="toctext">Charter and Work Plan</span></a>
              <ul>
                <li class="toclevel-3 tocsection-6"><a href="#Workplan_for_RDA_Vocabularies_Project"><span class="tocnumber">1.3.1</span> <span class="toctext">Workplan for RDA Vocabularies Project</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#Some_Resources"><span class="tocnumber">1.3.2</span> <span class="toctext">Some Resources</span></a></li>
                <li class="toclevel-3 tocsection-8"><a href="#Workplan_for_Namespace_for_FRBR_entities.2Felements_in_RDF_project"><span class="tocnumber">1.3.3</span> <span class="toctext">Workplan for Namespace for FRBR entities/elements in RDF project</span></a></li>
                <li class="toclevel-3 tocsection-9"><a href="#General_infrastructure"><span class="tocnumber">1.3.4</span> <span class="toctext">General infrastructure</span></a></li>
                <li class="toclevel-3 tocsection-10"><a href="#Resources_and_Comments_About_Our_Work"><span class="tocnumber">1.3.5</span> <span class="toctext">Resources and Comments About Our Work</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Former Front Page at [http://dublincore.org/dcmirdataskgroup/](http://dublincore.org/dcmirdataskgroup/) 

This Task Group is for collaborative work to enable broader use of the Resource Description and Access (RDA), building on agreements made at a [meeting](http://www.bl.uk/bibliographic/meeting.html) held at the British Library April 30/May 1, 2007. Participants in the meeting came from DCMI and other Semantic Web groups, and the RDA development effort. The Task Group is led by Diane Hillmann (then of Cornell University, now at Syracuse University) and Gordon Dunsire of Strathclyde University.

The planning for the London meeting was originally located on the [DC-Libraries Wiki](http://dublincore.org/librarieswiki/DataModelMeeting) Some information gathered for the meeting, including documents, agendas, a meeting packet, and other information of historical interest remains at that location.

## Announcements 

["Mar. 2011 midterm report"]

["DC-2010 Meeting"]

[Work Begins](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0802&L=dc-general&P=535)

## Wiki Pages 

[Use Cases](/archive/mediawiki_wiki/Use_Cases "Use Cases")

[Cataloger Scenarios](/archive/mediawiki_wiki/Cataloger_Scenarios "Cataloger Scenarios")

[User Scenarios](/archive/mediawiki_wiki/User_Scenarios "User Scenarios")

[Developer Scenarios](/archive/mediawiki_wiki/Developer_Scenarios "Developer Scenarios")

### Task Analyses

- Analysis task 1 ["analysisTask1"]
- Analysis task 2
  - List of in-line vocabularies from RDA ["RDAVocab"]
  - List of in-line vocabularies from MARC (for information) ["MARCVocab"]
- Application Profiles 
  - rda-a and rda-b ["rda-a"]
  - Application Profile design examples ["apDesigns"]
  - Proof of concept conversion of large MARC dataset from LOC to RDA/RDF, see DataConversion and [code4rda](http://code.google.com/p/code4rda/wiki/MilestoneOne)

## Charter and Work Plan 

Charter: To define components of the draft standard "RDA - Resource Description and Access" as an RDF vocabulary for use in developing a Dublin Core application profile.

### Workplan for RDA Vocabularies Project 

**1. Define RDA modeling entities as an RDF vocabulary (properties and classes).**

***Tasks***

Task 1.1 Analyse the RDA data model entities to identify those elements that will be included in the declared “RDA Element Vocabulary”. ["analysisTask1"]

Task 1.2 Produce a report explaining the choices made and listing open issues regarding those excluded (modeling issues, cost etc.) [an preliminary discussion document is being discussed internally]

Task 1.3 Specify each element in the vocabulary using the agreed attributes (see [here](http://metadataregistry.org/concept/list/vocabulary_id/22.html) for a possible set (to be updated with more DCAM-appropriate labels))

Task 1.4 Create an RDA namespace (a recommendation has been forwarded to JSC/CoP for this)

Task 1.5 Assign URIs to each element [The NSDL Registry tools created and manage these using an RDA domain]

Task 1.6 Create web pages containing the element specification [The NSDL Registry tools can create and manage these as well]

Task 1.7 Create an RDF schema representation of the vocabulary [The NSDL Registry tools can create this output; review of the output has been discussed]

***Deliverables***

Del 1.1 Listing of elements to be declared as the RDA element vocabulary

Del 1.2 Report explaining the choices made in producing the list and open issues

Del 1.3 An RDA namespace

Del 1.4 A set of web pages containing the specification of the RDA Element Vocabulary

Del 1.5 An RDF schema of the RDA Element Vocabulary

**2. Identify in-line value vocabularies as candidates for publication in [RDFS](http://www.w3.org/TR/rdf-schema/) or [SKOS](http://www.w3.org/2004/02/skos/).**

***Tasks***

Task 2.1 Analyse the RDA Element Vocabulary to identify those elements whose value would be taken from a controlled vocabulary in the library domain.

Task 2.2 Extract the controlled vocabularies from RDA for SKOS-ification

Task 2.3 Produce a report explaining the choices made and listing open issues.

Task 2.4 Produce RDF representations of the chosen vocabularies using SKOS

***Deliverables***

Del 2.1 A set of controlled vocabularies represented in RDF/SKOS

Del 2.2 Report explaining the choices made and listing open issues

***Timetable/Milestones for Goals 1 & 2***

_March 31, 2008:_

[This date was chosen to allow this set of deliverables to be available for discussion at the JSC meeting in April]

TM 1.1 Preliminary set of elements available as "proposed" in the NSDL Registry (with RDA Namespace, definitions and URIs), with registry outputs in RDF (vocabulary and single element level) and XML schema.

TM 1.2 Wiki available behind the proposed elements in the Registry, available for managed public discussion

TM 1.3 Report explaining the choices made so far and an explanation of open issues

_June 15, 2008_

This milestone should allow revised work to be available for discussion at ALA Annual (Anaheim) at the end of June and IFLA (Quebec City) in August.

TM 2.1 Revised set of elements available as "proposed" in the NSDL Registry (with RDA Namespace, definitions and URIs), with registry outputs in RDF (vocabulary and single element level) and XML schema.

TM 2.2 Revised report explaining the choices made and implemented so far, with still open issues defined

TM 2.3 Preliminary set of value vocabularies available as proposed in the NSDL Registry (with RDA Namespace, definitions and URIs), with registry outputs in RDF (vocabulary and single element level) and XML schema. [We expect these to lack definitions and scope notes, with some exceptions]

TM 2.4 Test plan for service interactions between the Registry and the RDA Web Product for registered element and value vocabularies

_TBD, fall_

TM 3.1 "Published" (though perhaps not yet complete) set of elements approved for use in the NSDL Registry and for applications using the Registry services.

TM 3.2 Revised report of open issues still to be decided before RDA formal "publication"

TM 3.3 Revised set of of value vocabularies, with plan for adding remaining definitions and scope notes

TM 3.4 Completed testing of service interactions between the Registry and the RDA Web Product for registered element and value vocabularies

### Some Resources 

- "RDA Vocabularies: Process, Outcome, Use", D-Lib Magazine, Jan. 2010. (See: [[1]](http://dlib.org/dlib/january10/hillmann/01hillmann.html))
- FRBR entities (See: [[2]](http://www.ifla.org/VII/s13/frbr/frbr.pdf) )
- New organization for RDA (outcome of October 2007 meeting of JSC) [[3]](http://www.collectionscanada.ca/jsc/rda-new-org.html)
- RDA entities (revised 12/2007) (See: [[4]](http://www.collectionscanada.ca/jsc/docs/5rda-elementanalysisrev.pdf) )
- RDA to FRBR mapping (revised 12/2007) (See: [[5]](http://www.collectionscanada.ca/jsc/docs/5rda-frbrmappingrev.pdf) )
- RDA to FRAD (Functional requirements for authority data) mapping (See: [[6]](http://www.collectionscanada.ca/jsc/docs/5rda-fradmapping.pdf) )
- [NSDL Registry](http://metadataregistry.org) Note the link to the Registry planning documents on the front page
- [NSDL Registry presentation](http://www.slideshare.net/jonphipps/code4lib-2008-metadata-registry) at the Code4Lib Conference (note in particular the mock-ups for property registration linked from slide 21)
- List of in-line vocabularies from RDA ["RDAVocab"]
- List of in-line vocabularies from MARC (for information) ["MARCVocab"]
- Comparison of MARC 007 and RDA vocabulary lists [[7]](http://www.kcoyle.net/007_rda_vlists.html)
- Quick guide to publishing a thesaurus on the Semantic Web [[8]](http://www.w3.org/TR/swbp-thesaurus-pubguide/)
- Architecture of the World Wide Web. Volume 1 (URI and namespace policies) [[9]](http://www.w3.org/TR/webarch/#pr-doc-ns-policy)
- RDA carrier vocabulary in NSDL Metadata registry sandbox [[10]](http://sandbox.metadataregistry.org/vocabulary/show/id/44.html)

**3. Develop a DC Application Profile for RDA based on FRBR and FRAD.**

***Tasks***

Task 3.1 Analyse the RDA Element Vocabulary and identify those elements to be used in the application profile.

Task 3.2 Identify the RDA rules relevant to the elements in this context and select those appropriate for this application profile.

Task 3.3 Produce a report explaining the choices made and listing open issues.

Task 3.4 Produce the RDA DC Application Profile

***Deliverables***

Del 3.1 RDA DC Application Profile

Del 3.2 Report explaining the choices made and listing open issues

["Use Cases"]

### Workplan for Namespace for FRBR entities/elements in RDF project 

**Define appropriate namespaces for FRBR (entity-relationship) in RDF and other appropriate syntaxes.**

This project reports to the FRBR Review Group. See ["Namespace for FRBR entities/elements in RDF"] for background information, resources, etc. Contact Gordon Dunsire for further information.

***Tasks***

Task 1 Analyse the FRBR model entities and relationships to identify those elements to be included in one or more namespaces.

Task 2 Extract the controlled vocabularies from FRBR for SKOS-ification.

Task 3 Produce a report explaining the choices made and listing open issues.

Task 4 Produce RDF representations of the chosen vocabularies using SKOS.

***Deliverables***

Del 1 A set of controlled vocabularies represented in RDF/SKOS.

Del 2 Report explaining the choices made and listing open issues.

### General infrastructure 

-- [http://www.jiscmail.ac.uk/lists/dc-rda.html](http://www.jiscmail.ac.uk/lists/dc-rda.html) (a re-purposed mail list)

-- [http://dublincore.org/dcmirdataskgroup/](http://dublincore.org/dcmirdataskgroup/)

-- Seeking ["funding for our tasks"]

### Resources and Comments About Our Work 

-- Karen Coyle's talk at Code4lib 2008 on the RDA Vocabularies Project: [RDA in RDF, Can Resource Description Become Rigorous Data?](http://www.kcoyle.net/code4lib2008_w_text.pdf)

-- [Webcast](http://www.loc.gov/bibliographic-future/meetings/webcasts-may9.html) of Diane Hillmann's testimony to the Library of Congress Working Group on the Future of Bibliographic Control

-- [Podcast](http://talk.talis.com/archives/2007/06/diane_hillmann.html) with Diane Hillmann done for "Talking with Talis" which discusses the London meeeting and it's implications.

-- Some exclamation from the FRBR Blog: [RDA + DC + FRBR + FRAD + RDF = OMG!!!](http://www.frbr.org/2007/05/04/rda-dc-frbr-frad-rdf)

-- Karen Coyle's [blog report](http://kcoyle.blogspot.com/2007/06/some-quick-notes-from-ala.html) of the RDA Update Forum at ALA Annual in Washington DC.

-- Karen Schneider's [explanation](http://www.techsource.ala.org/blog/2007/06/out-of-the-secret-garden-the-rdadc-initiative.html) of our efforts aimed at the generalist librarian--based on interviews with Diane and Karen Coyle.

-- Christine Schwartz's [blog comments](http://www.catalogingfutures.com/catalogingfutures/2007/06/its-all-about-t.html) about our efforts.

-- Brad Allen's [blog post](http://bradleypallen.org/post/4697356) expressing concern about our use of empty nodes.


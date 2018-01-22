---
title: Implementation Grant Discussion Draft
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Implementation_Grant_Discussion_Draft.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 23 September 2012, at 21:30.  
This page has been accessed 25,033 times.

**Project Links**

- [Project home](/mediawiki_wiki/Learning_Linked_Data "Learning Linked Data")
- [IMLS proposal draft](/mediawiki_wiki/Implementation_Grant_Proposal "Implementation Grant Proposal")
<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Implementation_Grant_Proposal_Discussion_Draft"><span class="tocnumber">1</span> <span class="toctext">Implementation Grant Proposal Discussion Draft</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Project_concept.2C_defined_narrowly"><span class="tocnumber">1.1</span> <span class="toctext">Project concept, defined narrowly</span></a></li>
            <li class="toclevel-2 tocsection-3">
              <a href="#Implementation_Options"><span class="tocnumber">1.2</span> <span class="toctext">Implementation Options</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#Related_Work_.28part_of_statement_of_need.29"><span class="tocnumber">1.2.1</span> <span class="toctext">Related Work (part of statement of need)</span></a></li>
                <li class="toclevel-3 tocsection-5"><a href="#ASN-style_RDF_Structure_--_Learning_Objectives.2C_Outcomes.2C_Assessments.2C_Trajectories"><span class="tocnumber">1.2.2</span> <span class="toctext">ASN-style RDF Structure -- Learning Objectives, Outcomes, Assessments, Trajectories</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#Questions_.26_Answers"><span class="tocnumber">1.2.3</span> <span class="toctext">Questions &amp; Answers</span></a></li>
              </ul>
            </li>
            <li class="toclevel-2 tocsection-7">
              <a href="#Presentation_Style:_Metaphors_and_Technologies"><span class="tocnumber">1.3</span> <span class="toctext">Presentation Style: Metaphors and Technologies</span></a>
              <ul>
                <li class="toclevel-3 tocsection-8"><a href="#Technology_choices"><span class="tocnumber">1.3.1</span> <span class="toctext">Technology choices</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Implementation Grant Proposal Discussion Draft

The Learning Linked Data project, funded through September 2012 by a one-year IMLS planning grant led by the University of Washington, envisioned an online learning environment in support of educating library and museum professionals in the principles and practice of Linked Data -- a "language lab" of software-supported methods for data processing and analysis. A core project group of twenty instructors, students, and technology experts met to develop an Inventory of Learning Topics outlining a target set of basic analytical and software skills needed across a wide range of pedagogical contexts. The draft inventory was posted online for input from a larger circle of colleagues, resulting in modifications and additions of its topic list.

These discussions suggested a need for a follow-on project aimed at engaging instructors in a dialogue with software developers to match analytical tasks with specific software tools, resulting in a carefully documented collection of video microtutorials available to instructors and their students. Instructors are expected to use LLD II resources to teach audiences in three broad categories:

- Working professionals seeking to solve problems on-the-job
- Students seeking formal qualification
- Instructors, faculty, or consultants who need to teach either of the above

Planning activities included development of use cases that may be useful to instructors in combining resources including microtutorials into instructional packages meaningful to specific learners. Wide interest in "playable" examples suggest that instructional components tied to real-world scenarios would have great value. However, any particular syllabus offered by the project would require customization for a diverse range of instructional goals and instructor preferences and would go quickly out of date. Therefore specific pedagogical approaches, along with the audiences for which they were tailored, were considered to be out of scope for the project's Inventory of Learning Topics.

## Project concept, defined narrowly 

Taking the Inventory of Learning Topics as a point of departure, the project will identify specific analytical tasks within each topic and develop brief, screencast-based microtutorials for task completion using existing software. Tasks will be identified by an open community of instructors and interested learners, anchored in a metadata community of the Dublin Core Metadata Initiative. Well-specified tasks will provide concrete reference points for recruiting software developers to provide microtutorials targeted on the use of their own tools. Instructors and learners can draw on this selection of tasks to combine LLD II resources and build specific courses. The publication channel for microtutorials, tied to well-practiced workflows with wide applicability and anchored in an ongoing metadata community, could prove sustainable beyond the end of the project. By assigning URIs to Topics, LLD II will establish them as magnets for links to related instructional resources and anchors for navigational structures through DCMI learning lab resources that build on RDF to access materials.

## Implementation Options 

### Related Work (part of statement of need)

The project identified a growing number of Web and courseware resources that cover such fundamentals, such as Coursera, a current partner with the University of Washington, the [EUCLID curriculum](http://euclid-project.eu/), university courses such as those at [Cornell](http://www.infosci.cornell.edu/Courses/info4302/2011fa/index.html) and [Indiana](http://info.slis.indiana.edu/%7Edingying/S636Fall2011.html), guidelines for [publishing Linked Data](http://sites.wiwiss.fu-berlin.de/suhl/bizer/pub/LinkedDataTutorial/) and [Linked Data patterns](http://patterns.dataincubator.org/book/), and [YouTube videos](http://www.youtube.com/watch?v=4x_xzT5eF5Q&feature=g-all-esi).

**Kahn Academy Partnership?** The [Khan Academy](http://www.khanacademy.org/) is an instructional website with strong support from many stakeholders in education, including the Gates Foundation, built around videos that learners consume at their own pace, rewinding and reviewing as needed, closely tied to topic assessments that control progress to more challenging topics. The method aims to free up instructors to spend time with individual students and small groups. Teachers report that they "assign lectures as homework and what used to be homework is now done in the classroom."

**Split-Screen Trial-and-Outcome Console?** Dan Brickley pointed us to a [really stunning tutorial](http://www.khanacademy.org/cs/intro-to-animation/830742281) on writing program code. The learner can stop the tutorial anywhere and EDIT THE CODE in the left-hand pane, then view the results immediately in the right-hand pane. Such a tutorial under LLD II might explain how small scripts (say Python or Ruby) or SPARQL queries work to manipulate a Linked Data dataset. Manu Sporny has created a similar [console for RDFa](http://rdfa.info/play/) showing code, data, and graph views that change as the user modifies the code.

### ASN-style RDF Structure -- Learning Objectives, Outcomes, Assessments, Trajectories

Stuart has described a framework pioneered at the [Achievement Standards Network](http://asn.jesandco.org/resources/D2365735) (ASN) linking educational goals to specific learning outcome statements (LOS). The goals are to relate and enable discovery of instructional units and supporting resources based on what learners accomplish (Outcomes) with respect to a Topic. This work presents a model that could move the LLD Inventory of Learning Topics toward very specifically stated outcomes, built around defined sets of active verbs, which could then be tightly coupled into a "learning triangle" of learning resources contributing to achievement of the outcomes and assessments demonstrating that achievement. The Gates Foundation, among others, emphasizes this use of LOS in its support for educational initiatives.

The ASN model has a powerful benefit for LLD in its basis in RDF, making it an exemplar of the technologies in which the project proposes to encourage instruction. Another benefit might be emphasis on the discrete topics highlighted in the inventory, leaving their combination in course pedagogy to instructors whom the platform is intended to serve. Also, RDF encoding like that established for ASN would allow other Linked Data tool makers beyond the project to map their own tools to the LLD outcomes, creating a comprehensive structure for local curriculum description with potential to connect with related curricula from other contexts and to adapt to varying sets of needs. At a minimum, this model for LLD would allow instructors to select from existing samples of LO statements rather than minting new ones themselves.

Learning outcomes must be stated at the right level of detail: overly broad and generic outcomes would be meaningless, and overly narrow ones would match up poorly with tool capabilities (??). Instruction designers complete a process of breaking down general, often national, standards to outcomes in support of those standards. This process of restating formally stated outcomes that are insufficiently granular for particular needs is called "unpacking" or "deconstruction." For example, the Gates Foundation has just funded work a consortium of CCSSO, PARCC, SBAC and SETDA (\*State Educational Technology Directors Association)\*\* \*to develop finer-grained outcomes for the new U.S. Common Core State Standards.

Under a model like ASN's, developed under funding by NSF [cite needed], the LLD implementation could consider elaborating topics from the inventory in the form of learning outcomes, with links to microtutorials promoting their achievement. Instructors could then combine and sequence outcomes to build ”learning trajectories" in Dutch terminology, called "strands" in the U.S., that fulfill instructional goals for their courses. [NSDL Science Literacy Maps](http://strandmaps.nsdl.org/tutorials/InfoBubble/) provide a very basic example using AAAS Benchmarks for Science Literacy. LLD could facilitate different instructors combining some different sets of learning outcomes to define their own trajectories and related tools or resources, as illustrated in Figure 1, to create curricula with relevance ranging from general to topic-related to personally tailored. Machine readable/addressable learning outcomes function as the glue joining discrete instructional resources to larger pedagogical packages. The LLD community of practitioners could contribute learning trajectories, possibly in the context of existing and new use cases, but at the risk of reversing the decision to avoid articulating pedagogy.

[<img alt="Figure 1: Learning components, outcomes, and trajectories" src="/mediawiki_wiki/images/Outcomes_Trajectories.jpg" width="720" height="540">](/mediawiki_wiki/images/Outcomes_Trajectories.jpg "Figure 1: Learning components, outcomes, and trajectories")  
**Figure 1: Learning components, outcomes, and trajectories**

### Questions & Answers 

- Or should LLD II stop short of articulating LOs and instead limit itself to careful description of learning resources that can be easily linked to instructors' own LO statements? 
  - Maybe define a few and build out resource catalog in relation to them, then expand by iteration (with lessons learned along the way)? Or develop a solid body of outcome statements to start with?
  - Does the topic-outcome relationship need more specific articulation than skos:broader/skos:narrower? No; define outcomes as narrower than topics but don't address topics, address only outcomes.
  - Customizable RDF predicates, e.g. ASN's relationship types.
  - Resource description record structure implied (in part) by outcomes supported. Multiple resource types:
    - Microtutorial videos could be described consistently
    - Reading selections, podcasts, other resources described in the same structure
    - Interactive control panels to edit code and see results in data output/visualization
  - Workshops/advisory boards/online collaboration/other interaction to articulate outcomes: instructors, software tool people, 'high-octane users' (e.g., Corey)
    - Potentially one workshop per large inventory topic
    - Supported by pre-workshop collaboration, which will get traction by posing specific questions to stakeholders
    - Potential to grow into ongoing collaboration to renew, revise, reuse outcome statements and interconnect with other compatible efforts openly via RDF structure for change management, longevity, and continued relevance
- Supporting software platforms
  - Use JES & Co.'s ASN outcome statement utility to articulate outcomes. Resulting RDF would need to be populated to a project or DCMI server for general access -- manual workflow, automated script, other?
  - Some collaboration space to discuss and articulate outcome statements, maybe supplemented by mail list traffic.
  - Specs for media assets to present microtutorials/other resources
    - Can import provider tutorials in workflow to describe and document.
    - Can simply link to external tutorials provided description workflow happens.
  - Drupal-based 'learning lab' to serve tutorial catalog, with access provided via outcome statements.
  - Need 'frozen datasets' in RDF for use by tutorials, potentially instructors' exercises too? DCMI-hosted triple store.
  - Trajectory development could be done by hand or via many tools -- maybe LMS packages. So many options that it's out of scope for LLD II. May want ways for instructors to share their trajectories somewhat like playlists
- If LLD II articulates LOs, does it also need to do something about assessments related to them? 
  - Maybe but perhaps not necessary.
  - Assessments facilitate standards compliance, but standards vary and so will assessment needs.
  - Assessments are therefore part of trajectories/strands.
- Should the LLD II proposal cite the NSF grant discussed in Sutton & Golder 2008 as prior work contributing to LLD – would that strength its case for funding? Might help demonstrate continuity in the funding networks.
  - EUCLID is all trajectories, as are most others
  - LLD II will provide components to be organized into trajectories.
  - Kahn Academy.
- Should LLD II proposal designate numerical targets for number of outcomes to be defined? Numbers for other activities? IMLS likes quantitative goals.

LLD II will not implement an LMS that enforces scope and sequence. Rather, information space that supports needs of instructors.

## Presentation Style: Metaphors and Technologies

A few different implementation metaphors have been proposed for the LLD collection of instructional tools that instructors could use to teach software-supported methods, functionality, and course concepts: artist's palette, language lab, kitchen. Questions:

- Should the implementation plan explicitly adopt one metaphor, or should it stick with native RDF terminology?
- A kitchen metaphor would present tools as utensils and ingredients for preparing a wide range of "courses." Learning Outcomes are things that people should know how to do: Slice-and-Dice, Dress-a-Turkey, Knead-Bread... Learning Trajectories are like "recipes" that put learning outcomes into a specific sequence in order to prepare some specific dish. Learning Outcomes about using tools could be presented with language similar to that for cooking utensils: bread hooks, chef knives, garlic presses... Instead of providing a Julia Child tutorial on baking a turkey, we will aim at providing tutorials on individual preparation steps, like slicing-and-dicing, kneading. 
- Playlist metaphor: Describing learning trajectories through the maps could be a function of the community. Sort of like "play lists" for the short "songs" we will provide.

### Technology choices

- Flash is no longer the easy default choice it was until recently; HTML 5 provides native media tools for presenting MP4, the best current option.
- Choice should accommodate tablet devices but platforms and capabilities vary substantially.
- Authoring tool choices are more under project control; maybe client software installed on the machines of contractors who create tutorials or web-based systems that record then generate output in the desired format. Even the web-based tools typically install some small client utilities to control microphone etc. on creator's system. 
- Web-based authoring tools do use Flash, but it will persist over the 2-year implementation time horizon, so its decline isn't the concern for authoring that it is for user access. 
- LLD can either stream the video tutorials or make them available just as files to be accessed and potentially saved locally by users. Open content licensing terms would make the latter the cheaper, easier, and overall better choice. Learning resources hosted under LLD II would be subject to DCMI rights policy -- CC BY -- and available for saving locally and reuse.
- Drupal provides strong tools for managing media elements, including simple uploads with automatic creation of player skins to control display of the MP4s.

- Create content in open formats (MP4, reference to Flash). But the platform can describe and link content that is not in open formats. Encourage use of open formats but not exclude materials not in open. Platform to share information in open way - to link to it - though information may not be in a format that can be used in an open way. Metadata will describe format.


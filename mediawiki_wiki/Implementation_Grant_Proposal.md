---
title: Implementation Grant Proposal
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Implementation_Grant_Proposal.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 28 Sep 2012, at 05:33.  
This page has been accessed 12,871 times.

**Project Links**

- [Project home](/mediawiki_wiki/Learning_Linked_Data.md)
- [Original Notes on Implementation Grant Proposal](/mediawiki_wiki/Implementation_Grant_Proposal_Notes.md)
- [Discussion draft edited during meetings 17-18 Sept.](/mediawiki_wiki/Implementation_Grant_Discussion_Draft.md)
- IMLS National Leadership Grant guidelines, 10 pp. overall:
  - [General guidelines](http://www.imls.gov/applicants/national_leadership_grant_guidelines.aspx#toc4)
  - [Narrative guidelines](http://www.imls.gov/applicants/national_leadership_grant_guidelines.aspx#narrative)

>>>The headings below reflect the structure laid out by IMLS in its NLG guidelines (linked above). Quoted text under each Section Notes heading comes from review criteria stated in the guideline sections and recommended by IMLS for consideration.<<<

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Statement_of_need"><span class="tocnumber">1</span> <span class="toctext">Statement of need</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Section_notes"><span class="tocnumber">1.1</span> <span class="toctext">Section notes</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-3">
          <a href="#Impact"><span class="tocnumber">2</span> <span class="toctext">Impact</span></a>
          <ul>
            <li class="toclevel-2 tocsection-4"><a href="#Section_Notes_2"><span class="tocnumber">2.1</span> <span class="toctext">Section Notes</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-5">
          <a href="#Project_Design"><span class="tocnumber">3</span> <span class="toctext">Project Design</span></a>
          <ul>
            <li class="toclevel-2 tocsection-6"><a href="#Section_Notes_3"><span class="tocnumber">3.1</span> <span class="toctext">Section Notes</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-7">
          <a href="#Project_Resources:_Personnel.2C_time.2C_budget"><span class="tocnumber">4</span> <span class="toctext">Project Resources: Personnel, time, budget</span></a>
          <ul>
            <li class="toclevel-2 tocsection-8"><a href="#Project_Personnel_and_Roles"><span class="tocnumber">4.1</span> <span class="toctext">Project Personnel and Roles</span></a></li>
            <li class="toclevel-2 tocsection-9">
              <a href="#Project_Budget"><span class="tocnumber">4.2</span> <span class="toctext">Project Budget</span></a>
              <ul>
                <li class="toclevel-3 tocsection-10"><a href="#Section_Notes_4"><span class="tocnumber">4.2.1</span> <span class="toctext">Section Notes</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-11">
          <a href="#Communications_Plan"><span class="tocnumber">5</span> <span class="toctext">Communications Plan</span></a>
          <ul>
            <li class="toclevel-2 tocsection-12"><a href="#Section_Notes_5"><span class="tocnumber">5.1</span> <span class="toctext">Section Notes</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-13">
          <a href="#Sustainability"><span class="tocnumber">6</span> <span class="toctext">Sustainability</span></a>
          <ul>
            <li class="toclevel-2 tocsection-14"><a href="#Section_Notes_6"><span class="tocnumber">6.1</span> <span class="toctext">Section Notes</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-15"><a href="#Supporting_Documents_and_Assurances.2FCertifications"><span class="tocnumber">7</span> <span class="toctext">Supporting Documents and Assurances/Certifications</span></a></li>
        <li class="toclevel-1 tocsection-16"><a href="#References"><span class="tocnumber">8</span> <span class="toctext">References</span></a></li>
      </ul>
    </td>
  </tr>
</table>

# Statement of need

The Learning Linked Data project, led by the Information School at the University of Washington and funded by a one-year IMLS planning grant, began as an investigation of educational needs of library and museum professionals in the technologies and practices of open availability of collection materials and descriptive metadata via the W3C's Resource Description Framework (RDF). A core project group of twenty instructors, students, and technology experts met to develop an Inventory of Learning Topics outlining a target set of basic analytical and software skills needed across a wide range of pedagogical contexts. The draft inventory was posted online for input from a larger circle of colleagues, resulting in modifications of and additions to its topic list. The effort generated and clarified a vision of an online learning environment in support of instruction in the principles and practice of Linked Data -- a "language lab" of software-supported methods for data processing and analysis.

Fulfillment of this vision would require a follow-on project aimed at engaging instructors in a dialogue with software developers to match analytical tasks identified in the Inventory with specific software tools, resulting in a carefully documented collection of video microtutorials available to instructors and their students. Instructors are expected to use resources compiled and maintained by Learning Linked Data to teach audiences in three broad categories:

- Working professionals seeking to solve problems on-the-job
- Students seeking formal qualification
- Instructors, faculty, or consultants who need to teach either of the above

In addition to the Inventory of Learning Topics, planning activities included development of use cases that may suggest to instructors appropriate combinations of resources, including microtutorials from LLD's own collection, into instructional packages meaningful to specific learners. Comments from online reviewers revealed wide interest in "playable" examples, suggesting that a framework linking instructional resources to real-world scenarios would have great value. Given the wide range of learning situations relevant to Linked Data, however, any particular syllabus offered by the project would require customization for a diverse range of instructional goals and instructor preferences and would go quickly out of date. Therefore specific pedagogical approaches, along with the audiences for which they were tailored, were considered to be out of scope for the project's Inventory of Learning Topics and subsequent implementation planning.

The project's core team members brought extensive knowledge of prior work in Linked Data instruction, and public comment alerted them to many additional efforts and resources. Coursera, a current [partner with the University of Washington](http://ischool.uw.edu/news/2012/07/barbara-endicott-popovskys-course-one-first-offered-new-uwcoursera-agreement)<sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup>, is pioneering "massively open online course" models covering topics across a tremendous range. The [Khan Academy](http://www.khanacademy.org/)<sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup> is an instructional website with strong support from many stakeholders in education, including the Gates Foundation, built around videos that learners consume at their own pace. They can rewind and review as needed, and instruction is closely tied to topic assessments that control progress to more challenging topics. The method aims to free up instructors to spend time with individual students and small groups. Teachers report that they "assign lectures as homework and what used to be homework is now done in the classroom."

Specific to Linked Data instruction, the [EUCLID curriculum](http://euclid-project.eu/)<sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup> defines specific topics and instructional sequences applicable in the European Union. Traditional university courses such as those at [Cornell](http://www.infosci.cornell.edu/Courses/info4302/2011fa/index.html)<sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup> and [Indiana](http://info.slis.indiana.edu/%7Edingying/S636Fall2011.html)<sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup> provide alternative topic selections and sequences appropriate to instructional goals defined by professors. Many other instructors and course sponsors have set their own guidelines for [publishing Linked Data](http://sites.wiwiss.fu-berlin.de/suhl/bizer/pub/LinkedDataTutorial/)<sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[6]</a></sup> and [Linked Data patterns](http://patterns.dataincubator.org/book/)<sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[7]</a></sup>, and less formal resources like [YouTube videos](http://www.youtube.com/watch?v=4x_xzT5eF5Q)<sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[8]</a></sup> also are available.

Leading organizations within the library and museum worlds are exploring Linked Data methods and supporting instructional strategies to help staff members and students understand and prepare for the new technologies. [OCLC's work in this area](http://www.youtube.com/watch?v=fWfEYcnk8Z8)<sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[9]</a></sup> is one example.

Already successful learning resources suggest models for new ones relevant to Linked Data. A [Kahn Academy tutorial](http://www.khanacademy.org/cs/intro-to-animation/830742281)<sup id="cite_ref-9" class="reference"><a href="#cite_note-9">[10]</a></sup> on writing program code allows the learner to stop at any point and edit the code in the left-hand pane, then view the results immediately in the right-hand pane. Such a tutorial for Linked Data might explain how small scripts (say Python or Ruby) or SPARQL queries work to manipulate a dataset expressed in RDF. Manu Sporny has created a similar [console for RDFa](http://rdfa.info/play/)<sup id="cite_ref-10" class="reference"><a href="#cite_note-10">[11]</a></sup> showing code with data and graph views that change as the user modifies the code.

Learning Linked Data intends to build on its completed survey of topics and resources to link resources to instructional outcomes. It will promote articulation of learning objective statements important across instructional environments and goals and develop resource descriptions highlighting the objectives supported by existing learning resources. This method resembles provisions pioneered by the National Science Digital Library (NSDL) in implementing [Science Literacy Maps](http://strandmaps.nsdl.org/)<sup id="cite_ref-11" class="reference"><a href="#cite_note-11">[12]</a></sup>. Using AAAS Benchmarks for Science Literacy, NSDL supported development of learning trajectories by mapping learning outcomes and learning resources supporting those outcomes (lesson plans, videos, exercises, etc.) into a meaningful structure. A [brief video](http://strandmaps.nsdl.org/tutorials/InfoBubble/)<sup id="cite_ref-12" class="reference"><a href="#cite_note-12">[13]</a></sup> shows how the NSDL tool was intended to support instructors in developing learning trajectories.

Where learning resources currently are lacking, Learning Linked Data will commission development of microtutorials, including short screencast videos, how-to texts, and annotated code snippets, also defining the learning objectives supported by those new resources. Instructors and self-learners can then identify objectives important to their situations, discover learning resources that support those objectives, and build learning trajectories suited to specific local needs. In this way, the project reaches beyond simply adding to the pool of available resources -- it seeks to craft a fundamentally new structure for describing and accessing resources closely tied to carefully specified and standardized statements of learning objectives.

The Australian government has sponsored development of a [Machine Readable Australian Curriculum](http://www.australiancurriculum.edu.au/Technical/Introduction)<sup id="cite_ref-13" class="reference"><a href="#cite_note-13">[14]</a></sup> that articulates learning objectives appropriate for topics and learners and defines learning trajectories that guide progress through those objectives. This Australian effort complements efforts in Europe to build the EUCLID Project, and U.S. initiatives at OCLC and the Library of Congress to support wider use of Linked Data across libraries and museums. An international consensus has begun to form around both the importance of addressing education in Linked Data and methods for ensuring its success.

Learning Linked Data will address a pressing need for library and museum professionals to stay current with technological developments in an area that's becoming central to the ways their institutions interact with the larger network of cultural memory institutions and the emerging open web of knowledge. Career relevance in any field, but especially in those that are highly dependent on information technologies, depends increasinly on [training and retraining](http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html%7Cnonstop)<sup id="cite_ref-14" class="reference"><a href="#cite_note-14">[15]</a></sup>.

Learning Linked Data will benefit its intended audiences -- instructors, their students, and self-learners -- in this dynamic environment by helping them to survey the unfamiliar terrain of Linked Data topics and learning resources. It will help them ground their search for knowledge and new skills in solid learning objectives defined by consensus among leading educators and practitioners in the field. This key linkage will allow instructors and learners to craft flexible combinations responsive to their situations and needs, confident that they are using the best available learning resources organized according to the best available advice.

>>2 pp., 1111 words<<

### Section notes

- Reviewer guidelines:
  - "include a discussion of what was learned during the [NLG] planning process."
  - "the degree to which the project results in more than incremental change"
- Audience and Need or Challenge
- Consensus around Need to Address Challenge
- Prior Work in the Area
- How the Project Will Benefit the Intended Audience

# Impact

Learning Linked Data will have impact on education of students and practitioners across library, museum, and archive environments at two levels. It will serve instructors designing trajectories composed of well-articulated learning objectives and courses based on those trajectories, and that contribution will enrich understanding and skills of both students gaining new credentials and practicing professionals completing coursework to maintain and extend their skills. It will also facilitate self-learning by staff of cultural memory institutions seeking rigorously structured elements for solutions to practical problems they encounter on the job.

The Learning Lab's flexible configuration will invite widespread interaction with its descriptions of learning objectives and learning resources via the Resource Description Framework. All such descriptions will be formatted in RDF, which has a primary goal of encouraging open interconnection between diverse datasets. The Learning Lab's own interlinked descriptions will thus be implemented in the same extensible format that learners are undertaking to understand, demonstrating the value they'll gain by learning Linked Data techniques through its own openness to statements about related sets of learning objectives and learning resources. This potential for interaction will place the Learning Lab in a broader instructional context, allowing active interoperation across education efforts in the LAM environment and related areas. This open architecture encourages accessibility by all with a stake in instruction around Linked Data.

Ongoing articulation and refinement of learning objective statements will occur in the context of a DCMI community, encouraging participation by many with varying interests in the outcomes. This community will define a natural environment for interaction and discussion, leading toward long-term engagement to raise and resolve issues along with buy-in to the solutions that emerge. DCMI provides a forum for this sort of interaction among all who have concerns around metadata creation and use.

The Learning Linked Data planning grant funded posting of the draft Inventory of Learning Topics for public comment. The resulting input underscored the project's high potential impact by highlighting available instructional resources and linking them with typical learning situations in a way that supports development of practical curriculum. Planning work revealed many resources scattered among providers and limited in their applicability to narrow functions within a complex set of processes. Working in such a diffuse environment, instructional designers face a daunting challenge to identify useful combinations of disjoint tools applicable to varying parts of difficult-to-define activities. The Learning Lab's impact will come jointly from its clear definition of relevant learning objectives and its comprehensive description of available resources that directly support those objectives, adding clarity and focus for those attempting to understand and organize useful learning trajectories.

Commenters during the planning phase also improved prospects for the project's impact through their eagerness for ongoing involvement. Many have self-nominated for future roles in the ongoing effort, and the project plan defines a role for them as evaluators. The project timeline includes activities that will require participation of a group to share their knowledge and experience to help set assessment criteria for the Learning Lab's design and development. Project staff will recruit members for this group and lead them through an iterative process for applying assessment criteria they have previously developed to implementation instances with the goal of providing practical feedback to the development team. At the conclusion of this process, the evaluator team will have to give final approval, validating that the Learning Lab fulfills all the requirements set for it. Evaluators will be natural candidates for ongoing participation in the DCMI community that will guide future review and revision of the platform's functions and success.

>>>1 pg., 554 words<<<

### Section Notes

- Reviewer guidelines:
  - "far-reaching impact through results or products that serve multiple institutions and constituencies"
  - "create, implement, and document workable models that have the potential for successful, widespread adaptation"
  - "evidence that the project demonstrates interoperability and accessibility in its broadest context and potential for integration into larger-scale initiatives"
- How the Project Innovatively Addresses Issues in LAM Community
- Input, Consensus, Buy-in from Other Stakeholders
- Assessment Method: Design, integration, implementation

# Project Design

 [<img alt="LLDImplementationFrameworkV2.png" src="/mediawiki_wiki/images/LLDImplementationFrameworkV2.png" width="600" height="555">](/mediawiki_wiki/images/LLDImplementationFrameworkV2.png)

The planning project initially envisioned the "language lab" for learning Linked data as a software platform -- a set of analytical and data-processing tools, with documentation on how to use those tools for teaching, possibly packaged for download, and ideally integrated with an "orchestrator" interface. The participants concluded, however, that a project heavy on software development would be risky to undertake, subject to continual obsolescence, and thus unsustainably expensive to maintain.

Rather, the project converged on the concept of a learning environment comprising, as a recent New York Times article on "continual learning" puts it: "bite-size instructional videos, peer-to-peer forums, and virtual college courses"<sup id="cite_ref-15" class="reference"><a href="#cite_note-15">[16]</a></sup>. (Indeed, the article highlights the case of a metadata librarian needing to keep up with evolving technology.)

**Virtual courses.** The project lead, University of Washington, participates in Coursera, a pioneer of "massively open online courses"<sup id="cite_ref-16" class="reference"><a href="#cite_note-16">[17]</a></sup>. Online courses and videos offered by MIT, Stanford, Cornell, and Khan Academy<sup id="cite_ref-17" class="reference"><a href="#cite_note-17">[18]</a></sup> (with support from the Bill & Melinda Gates Foundation) exemplify this trend. The trend towards virtual courses, however, also involves support for individualizing learning, sometimes through "flipping" the classroom experience by assigning lectures as homework and using class time for targeted assistance to students with what used to be homework exercises.

**A "competency-based" approach.** Achieving the ideal of individualized instruction involves a new and emerging approach to course design based on the definition of competencies to be achieved as outcomes of instruction (Learning Objectives). The National Science Digital Library (NSDL), for example, defines learning objectives related to the Benchmarks for Scientific Literacy of the American Association for the Advancement of Science (AAAS). These learning objectives are linked to supporting resources -- lesson plans, videos, exercises, quizzes, and the like -- which may be selectively combined in Learning Trajectories (in NSDL terminology "strand maps"<sup id="cite_ref-18" class="reference"><a href="#cite_note-18">[19]</a></sup>). Learning Trajectories chart educational pathways customized for different audiences, or even for individual learners.

**Using Linked Data to implement the competency-based approach.** Another of the IMLS planning project partners, JES & Company, is a pioneer in the use of Linked Data to create machine-readable webs of Learning Resources, linked with Learning Objectives, for use in creating Learning Trajectories. Created with support from the National Science Foundation and from the Bill & Melinda Gates Foundation, the Achievement Standards Network (ASN)<sup id="cite_ref-19" class="reference"><a href="#cite_note-19">[20]</a></sup> provides access to RDF representations of learning objectives in the form of specific "learning outcome statements", identified with URIs, as linking targets for related learning resources. This approach has been adopted for support of United States Common Core State Standards and by related endeavors such as the Learning Resource Metadata Initiative, a project co-led by the Association of Educational Publishers and Creative Commons<sup id="cite_ref-20" class="reference"><a href="#cite_note-20">[21]</a></sup>, the Machine Readable Australian Curriculum<sup id="cite_ref-21" class="reference"><a href="#cite_note-21">[22]</a></sup>, and the European Education Resource Network, EdReNe<sup id="cite_ref-22" class="reference"><a href="#cite_note-22">[23]</a></sup>.

**Proposal for a Learning Lab about Linked Data.** The primary deliverable of the IMLS planning project, an Inventory of Learning Topics in the area of Linked Data, is proposed as the starting point for a learning environment structured according to the competency-based approach. The Learning Lab would initially focus on the three topic areas which fall between prerequisite knowledge ("Understanding Linked Data") and skills related to specific software packages ("Implementing a Linked Data application") -- the topic areas about searching, querying, creating, manipulating, and visualizing Linked Data.

**From Topics to Learning Objectives.** The project will begin by "unpacking" (or "deconstructing") the three general topic areas into more-specific Learning Objectives, using an online cataloging tool provided by the Achievement Standards Network to describe the objectives and assign them URIs. Addressable Learning Objectives, so described, will serve as targets to which supporting tools and resources can be linked by means of Metadata Descriptions using, at least initially, a cataloging tool provided by The Gateway<sup id="cite_ref-23" class="reference"><a href="#cite_note-23">[24]</a></sup>, a repository of education resources for US teachers. Ideally, the definition of more-specific objectives under general topics will result from discussion by a community of interested instructors and over time, the topic areas covered will evolve both in breadth and in depth.

**From Learning Objectives to Microtutorials**. Feedback on the University of Washington blog to the Inventory of Learning Topics reinforced the notion that learners seek "playable" tutorial materials which visibly demonstrate the use of tools for analysing or processing Linked Data. In order to establish an Inventory of (addressable) Learning Objectives as a linking target for such resources, the project will use well-specified Learning Objectives as concrete specifications for screencasts and to-do texts ("microtutorials"), to be solicited by the project from software developers in order to show specific uses of their tools. Longer-term, the goal is bootstrap the creation of a growing set of well-specified Learning Objectives to which other tools and resources can maintainably be mapped -- as common reference points to help developers communicate with users in the education world about the capabilities of their tools, and as the glue joining discrete instructional resources to larger pedagogical packages.

**The role of a peer-to-peer forum.** The IMLS planning grant has begun to create a community of university and professional instructors collectively interested in improving the quality of education about Linked Data. The Dublin Core Metadata Initiative, a non-profit organization dedicated to promoting and educating about the use of open metadata standards, has offered to provide infrastructural support, a permanent home, and long-term-persistent URIs for the activities and products -- Learning Objectives, Learning Resources, and the Metadata Descriptions linking the two -- of a Learning Linked Data community. This community, it is envisioned, can serve as a platform for discussing courses and curricula built on the foundation of the Learning Objective approach, perhaps expanding its scope in the medium term beyond the initial scope of Linked Data to encompass other related topics of metadata best practice.

>>>2-1/2 pp., 950 words<<< >>>To be added: a short discussion of proposed technology infrastructure (hosting, software platform, etc.)<<<

### Section Notes

- Reviewer Guidelines: "uses existing or emerging standards or best practices"
- Project Goals and Activities
- Planning process and specifics of implementation
- Management of Project Partnership

- Media delivery technology options
  - Drupal provides strong tools for managing media elements, including simple uploads with automatic creation of player skins to control display of the MP4s.
  - Create content in open formats (MP4 reference to Flash). But the platform can describe and link content that is not in open formats. Encourage use of open formats but not exclude materials not in open. Platform to share information in open way - to link to it - though information may not be in a format that can be used in an open way. Metadata will describe format.

# Project Resources: Personnel, time, budget

 [<img alt="LLDImplementationTimeline2year.png" src="/mediawiki_wiki/images/LLDImplementationTimeline2year.png" width="850" height="483">](/mediawiki_wiki/images/LLDImplementationTimeline2year.png)

Learning Linked Data anticipates a 2-year implementation timeline, as indicated in the chart above. Columns for the 1-year period of the planning grant, now concluded, indicate accomplishments so far. A process for developing learning topics has resulted in a completed Inventory and led to articulation of a design framework for the solution to be implemented. A community of stakeholders has begun to emerge through the process of commenting on drafts of the Inventory, and they have started identifying learning objectives to be achieved in broad terms along with learning resources that may support progress toward achieving those objectives. This input provides a rich basis of user input to support functional need analysis and development for formal functional requirements early in the first year of the implementation cycle. It also highlights candidates for positions on the team of evaluators who will collaborate with project staff to articulate assessment criteria and evaluate design and development work through an iterative process of feedback-driven development, culminating in final validation of the Learning Lab implementation.

Development efforts on different aspects of the implementation can proceed in parallel. Platform configuration and customization can follow closely upon completion of formal requirements. Meanwhile work on the Inventory can continue and refocus on articulating learning outcomes and a metadata schema for describing resources and linking them to objectives. A review of existing learning resource lists will result in a gap analysis to identify needs for new resources and contacts with tool-makers to create short screencasts and other instructional content to fill the gaps. Technical implementation will follow an iterative process with frequent scheduled evaluations and assessments by community members, which will feed back into development efforts for continuous revision and refinement of technological tools.

## Project Personnel and Roles

- Project coordinator (logistics): Michael Crandall, UW iSchool -- Oversees project activities, logs progress, leads resolution of issues and obstacles
- Evaluator manager: Joseph Tennis, UW iSchool -- Engages community members in discussions of progress and project outcomes, facilitates stakeholder interactions
- Knowledge architect: Tom Baker, DCMI -- Leads development with project community of learning objective statements and metadata schema for resource description
- Technical project manager: TBD -- Leads definition and review of functional requirements, monitors development activities, ensures stakeholder input to development team
- Systems architect: DCMI as contractor -- Creates technical design for platform configuration and customization development to achieve requirements
- Developers (Drupal): DCMI as contractor -- Execute technical design

## Project Budget

- Workshop costs $54000
- Evaluator honoraria 36000
- Project staff travel 48000
- Hosting datasets? 45000
- Drupal dev contracts 30000
- Project staff
  - 1/4-time KM 125000
  - Eval mgr 39000
  - Project coord 135000
- Total $512000
- 2-year project (-170K) $342000

>>>2 pp, 450 words<<<

### Section Notes

- Reviewer Guidelines: "resources, including those funded by the grant and those funded by the organization’s cost share"
- Institutional Responsibilities
- Project Personnel
- Project Budget
- Partnership Roles

# Communications Plan

Project staff will extend and improve the network established during work under the planning grant to maintain communications with participants and stakeholders. Members of the planning workshop communicated effectively via email listserv to prepare for the project's initial workshop, then they reached out through many established channels to engage existing communities with interests around applications of Linked Data technologies. This outreach emphasized groups like the LOD-LAM community who are focused specifically on library, archive, and museum applications. But each workshop member followed up with email lists, forums, and organizations where they were active and also to personal contacts internationally to spread news about the project and particularly to invite comment on the draft Inventory of Learning Topics during the review period.

Engagement with the primary audience of Linked Data educators will move beyond prior strategies of email lists and comments on the WordPress site where the Inventory was posted. Individuals who participated at those levels will be natural candidates to join the project's evaluator team, and they may in turn help to recruit colleagues who share their interests. This group will form the nucleus of a community forum sponsored by DCMI to advise and contribute to the work of assessment, as discussed above in the discussion of the project's impact. DCMI's prominent position in the metadata standards and education space will raise the profile of these discussions and provide a visible and highly credible way to log contributions for public access.

As educators begin to adopt the Learning Lab's resources and gain real-world experience with them, the project anticipates formation of another community, also hosted as a DCMI forum, for sharing knowledge and evaluations of resources. Again, the prominence of the environment will encourage public interest and access, inviting ongoing discussion and accumulation of a knowledge base that will inform future improvements to the Learning Lab.

The project will share communications about implementation plans and progress through additional channels focused on educational achievement standards and curriculum development. This effort will engage existing communities around the U.S. Common Core State Standards and, the Learning Resource Metadata Initiative, the Machine Readable Australian Curriculum, and the European Education Resource Network (EdReNe).

>>>3/4 pg., 350 words<<<

### Section Notes

- Reviewer guidelines: "Extent to which research findings will be made available to other professional organizations and communities, as appropriate" and "to the public"
- How Project Outputs Will Reach the Intended Audience
- New and Emerging Communication Strategies to Further Project Reach, e.g., communities of practice
- Public Availability
- How software and technology tools will be made available to the public for reuse and implementation

# Sustainability

The Learning Lab's architecture design is based on the Resource Description Framework, which is intended primarily to encourage open interoperation among distributed applications. By encouraging integration with other applications, this structure will extend the project's reach to related applications and make it a nucleus for sustainable change in learning about Linked Data.

The project expressly adopts existing techniques and technologies developed by the Achievement Standards Network, which in turn parallel and engage with comparable efforts nationally and internationally. Adoption of these established models will promote successful adoption and use of the Learning Lab while keeping its ongoing development on track with comparable efforts elsewhere. This engagement will provide opportunities for cooperative projects to improve practices and service to educators.

The open RDF architecture will also encourage integrations with learning management systems and other learning resource collections used in and familiar to local environments. The Learning Lab will make its value widely available to enrich resources available to educators in the repositories where they expect to find such resources, and with minimal implementation effort on the part of LMS administrators. Easy interoperation will make the project's work a long-term part of core toolsets relied on by key audiences, ensuring its longevity and lasting impact.

LMS managers and educators who integrate and adopt Learning Lab tools will have a strong motivation to stay engaged in the DCMI community focused on the learning resource collection. They also will have a strong stake and useful input to offer in community discussions of learning objectives articulated within the project. Through this continuing engagement, community members will help to inform and drive change in a continuously improving Learning Lab.

>>>1/2 pg., 275 words<<<

### Section Notes

- Reviewer guidelines: 
  - How the applicant will continue to support the project, its results, and/or the new model it creates beyond the grant period. 
  - Support for "systemic change within the organization as well as within the museum, archive, and/or library fields."
  - "For projects that produce digitized collections, software, information systems, and other technology tools, . . . the extent that project plans address activities to preserve and sustain the resulting digital products."

# Supporting Documents and Assurances/Certifications

- Needs assessments
- Reports from planning activities
- Digitization plans
- Web links to relevant online materials
- Letters of support from experts and/or stakeholders

**Conditionally**

- "copy of the IRS letter indicating your eligibility for nonprofit status"
- [IMLS Partnership Statement form](http://www.imls.gov/applicants/partnerships_and_the_partnership_statement.aspx) for each partner entity" "who will receive grant funds or who will contribute substantive funds to the completion of project activities"
- digital collections or software tools: "evidence that applicant has considered key technical details and has included the form **Specifications for Projects That Develop Digital Products** with relevant portions of Parts I and II completed"
- Assurances/certifications: "you must certify that you are responsible for complying with certain nondiscrimination, debarment and suspension, drug-free workplace, and lobbying laws."

# References

1. ↑ [http://ischool.uw.edu/news/2012/07/barbara-endicott-popovskys-course-one-first-offered-new-uwcoursera-agreement](http://ischool.uw.edu/news/2012/07/barbara-endicott-popovskys-course-one-first-offered-new-uwcoursera-agreement)
2. ↑ [http://www.khanacademy.org/](http://www.khanacademy.org/)
3. ↑ [http://euclid-project.eu/](http://euclid-project.eu/)
4. ↑ [http://www.infosci.cornell.edu/Courses/info4302/2011fa/index.html](http://www.infosci.cornell.edu/Courses/info4302/2011fa/index.html)
5. ↑ [http://info.slis.indiana.edu/%7Edingying/S636Fall2011.html](http://info.slis.indiana.edu/%7Edingying/S636Fall2011.html)
6. ↑ [http://sites.wiwiss.fu-berlin.de/suhl/bizer/pub/LinkedDataTutorial/](http://sites.wiwiss.fu-berlin.de/suhl/bizer/pub/LinkedDataTutorial/)
7. ↑ [http://patterns.dataincubator.org/book/](http://patterns.dataincubator.org/book/)
8. ↑ [http://www.youtube.com/watch?v=4x\_xzT5eF5Q](http://www.youtube.com/watch?v=4x_xzT5eF5Q)
9. ↑ [http://www.youtube.com/watch?v=fWfEYcnk8Z8](http://www.youtube.com/watch?v=fWfEYcnk8Z8)
10. ↑ [http://www.khanacademy.org/cs/intro-to-animation/830742281](http://www.khanacademy.org/cs/intro-to-animation/830742281)
11. ↑ [http://rdfa.info/play/](http://rdfa.info/play/)
12. ↑ [http://strandmaps.nsdl.org/](http://strandmaps.nsdl.org/)
13. ↑ [http://strandmaps.nsdl.org/tutorials/InfoBubble/](http://strandmaps.nsdl.org/tutorials/InfoBubble/) 
14. ↑ [http://www.australiancurriculum.edu.au/Technical/Introduction](http://www.australiancurriculum.edu.au/Technical/Introduction)
15. ↑ [http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html](http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html)
16. ↑ [http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html](http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html)
17. ↑ [http://ischool.uw.edu/news/2012/07/barbara-endicott-popovskys-course-one-first-offered-new-uwcoursera-agreement](http://ischool.uw.edu/news/2012/07/barbara-endicott-popovskys-course-one-first-offered-new-uwcoursera-agreement)
18. ↑ [http://www.khanacademy.org/](http://www.khanacademy.org/)
19. ↑ [http://strandmaps.nsdl.org/](http://strandmaps.nsdl.org/)
20. ↑ [http://asn.jesandco.org/](http://asn.jesandco.org/)
21. ↑ [http://wiki.creativecommons.org/LRMI](http://wiki.creativecommons.org/LRMI)
22. ↑ [http://www.australiancurriculum.edu.au/Technical/Introduction](http://www.australiancurriculum.edu.au/Technical/Introduction)
23. ↑ [http://edrene.org/](http://edrene.org/)
24. ↑ [http://www.thegateway.org/](http://www.thegateway.org/)

Dewan, S. 2012. To stay relevant in a career, workers train nonstop. _New York Times_, Sept. 21. Accessed Sept. 23, 2012. [http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html](http://www.nytimes.com/2012/09/22/business/to-stay-relevant-in-a-career-workers-train-nonstop.html)


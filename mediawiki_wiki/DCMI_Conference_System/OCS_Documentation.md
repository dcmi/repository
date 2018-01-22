---
title: OCS Documentation
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCMI_Conference_System/OCS_Documentation.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 Mar 2012, at 10:58.  
This page has been accessed 2,055 times.

See also [OCS Howto](/mediawiki_wiki/DCMI_Conferences/OCS_Howto "DCMI Conferences/OCS Howto")

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Project_Purpose_.26_Scope"><span class="tocnumber">1</span> <span class="toctext">Project Purpose &amp; Scope</span></a></li>
        <li class="toclevel-1 tocsection-2"><a href="#Reading_Notes"><span class="tocnumber">2</span> <span class="toctext">Reading Notes</span></a></li>
        <li class="toclevel-1 tocsection-3"><a href="#Lit_Review_Follow-up"><span class="tocnumber">3</span> <span class="toctext">Lit Review Follow-up</span></a></li>
        <li class="toclevel-1 tocsection-4"><a href="#Roles_to_be_documented:"><span class="tocnumber">4</span> <span class="toctext">Roles to be documented:</span></a></li>
        <li class="toclevel-1 tocsection-5"><a href="#Assumptions"><span class="tocnumber">5</span> <span class="toctext">Assumptions</span></a></li>
        <li class="toclevel-1 tocsection-6"><a href="#Tasks_.26_sequence"><span class="tocnumber">6</span> <span class="toctext">Tasks &amp; sequence</span></a></li>
        <li class="toclevel-1 tocsection-7"><a href="#Documentation_Model_Summary"><span class="tocnumber">7</span> <span class="toctext">Documentation Model Summary</span></a></li>
        <li class="toclevel-1 tocsection-8"><a href="#Draft_Outline_for_Procedure_Template"><span class="tocnumber">8</span> <span class="toctext">Draft Outline for Procedure Template</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## Project Purpose & Scope 

The primary goal is to develop a well-documented, highly practical model informed by relevant theory for instructional documentation of OCS functionality. The potential for application to other DCMI activities may influence design decisions. The project will include two or more exemplars of procedural documentation for OCS functional elements to illustrate the model and allow evaluation and validation of it, one (at least) for the front-end appearance controls and one from backoffice activities. The resulting documentation template will spell out elements to be included in a procedure document and their structure so it can be replicated as needed. The structure should consider how to tag and manage component resources (e.g., screen grab images) for reuse in multiple procedures where relevant. The project will include stakeholder evaluation of drafts, with revisions and re-evaluation, in a design-centered iterative usability analysis process.

## Reading Notes 

The instruction design for this documentation should benefit from any available research on factors and characteristics that make for effective distance learning. A search turned up these resources, few of which are really targeted to questions of effective structure of documentation per se. Nearly all focus on overall e-learning/distance learning environments.

**Barber, T. 2003. Writing software documentation: A task-oriented approach, 2nd ed. New York: Longman.**

- Instructions are grouped by context of the task and how it contributes to user goals, with conceptual explanation linking program function to desired user outcome (pp. 14-16), in part by evoking user's "tacit knowledge" (p. 17).
- Documentation types: tutorial (detail for pure beginners), procedural (steps for familiar practitioners), reference (look-up for experienced users) – pp. 20-21. We'll have near-beginners, but tasks won't be important enough to motivate them to work through heavy tutorials, and few will ever get enough experience to need just reference look-up, so focus on procedural steps. Procedural action sequence \*in the moment\* to complete a task rather than enable rote recall of basics, as in tutorial (p. 80). Pattern and structure are key for reference functions of documentation, so relevant steps are easily found (p. 109).
- Consider inserting detail as tooltips or other user-selected pop-ups. Leave users in control of their learning with selectable pop-ups rather than overbearing Mr. Clipit –style intrusion. (p. 34). "Layering" gives basic instruction with options to display more detailed at the user's option (pp. 67-68, 444-445). Procedure elements (83-87): task name, overview, steps, elaborations, options, screens. No learning objectives or summary? Minimalist model may need \*some\* orientation to keep pure newbies aligned with the procedural model.
- Accumulative learning (p. 39): learn a basic skill, then add a more detailed, elaborate one. But (p. 49) present tutorials on selected elements in context of defined user scenarios. How to fit with task-completion, since tasks early in the necessary sequence may require intermediate or advanced skills? Can follow the beginning->advanced sequence only to the extent that task completion allows. "Rhythm of exposition" (p. 80): command – system response – explain response & why – refer onward to next step. Consistent! Link procedure instructions by prev/next for the tunnel-vision crowd and place in context of larger process for the big-picture types.
- Minimalist design is action-oriented, anchored in task domain, supporting error recognition & recovery, read to do/study/locate. (pp. 51-52) Practice isn't separate at the end – the tutorial IS the practice (52). Document likely & common mistakes and provide tutorials for recovery steps & strategies, because learners won't have patience to work through more elaborative & detailed guidance. Exploits the motivation and focus gained by "constructive frustration" in imperfect instruction, where a controlled level of challenge creates irritation that focuses learner attention and motivation on resolving the problem. [Oberman, C. 1983. Question analysis and the learning cycle. Research Strategies 1 (Winter):22-30.]
- BUT! Risk rises because failure due to inexperience can lose or corrupt data, and at a minimum it wastes user time; guidance MUST anticipate user error and provide action-relevant recovery steps (p. 80).
- pp. 309-314: Match information design to user analysis (esp. task requirements). Design for user groups: navigation by role, user scenarios, icons.\* Design for program elements: surface quirks of the particular system through job performance aids & special forms. User task needs: focus on goal user will achieve with illustrations (screen grabs), layout matching use situation, examples, tips. Meet user information needs: explain & support problem-solving, examples, summaries for efficiency. 
- Timeline is an effective model for OCS task coverage because an event passes through standard stages – BUT – different user roles are active at different time; need some sort of parallel structure that presents tasks & subtasks in sequence while also pulling out tasks key to a role. Don't forget x-refs (p. 328). Consider primary access via timeline graphic with role icons/colors rather than conventional ToC? Flowchart(s) with progress indicator (pp. 410, 417)?
- "Advance organizers" in the margins to foreshadow upcoming topic coverage (pp. 334-336); might help as visual cue to reference users browsing for targeting memory refreshers. (Similarly, cue sections – maybe esp. likely errors and recovery procedures – with icons, pp. 337-338.) Browse sequences: Next & prev arrows to scroll through a procedure something like a wizard? (346)

**Knapheide, P. 2000. Synergy and Subsidiarity: The Systematic Determination of Software, User, and Operating Instructions. Int. J. HCI 12(3-4): 415-430.**

- Context: Immediate task knowledge < overall task structure < task environment and goals: "The body of knowledge contained in operating instructions completely describing the system is always considerably greater than the knowledge to be used (normally) and in the event of a fault. Now, the colleagues employed at the same workstation know the relevant subset of the relevant missing knowledge of a confused user." -- 423 Therefore, a stuck user prefers coaching by experienced users over consulting documentation because their awareness of context and history allows them to suggest quick fixes. How to promote learning that develops that awareness of context and history?
- 426-427: In operating situations, "the user knows that the fault does not lie with the system but that a knowledge deficit of his or her own is involved. In this situation it is reasonable and consonant with users’ expectations for they themselves to initiate the provision of additional information. It is likewise up to the user to say when he or she can proceed without additional support." Versus fault or potential fault in the machine itself, not in user actions. User tacit knowledge- > (maybe) procedural documentation -> user action -> success|problem (user action issue)|fault (system issue) -> remediation via documentation or expert advice – all of this is an embedded system!

**DaSilva, N., and P. Henderson. 2007. Narrative-based writing for coherent technical documents. SIGDOC’07, October 22–24, 2007, El Paso, Texas, USA.**

- Defines a method for imparting rational structure to procedural documentation, especially where it's developed in collaboration by multiple contributors who might each solve the same problems in different and potentially incompatible ways.
- Rhetorical Structure Theory (209): Define 'segments' of the overall text, some as _nuclei_ which are essential to understanding and some as _satellites_ that provide supporting, nonessential information. "Most relationships exist between two segments: usually, a nucleus and a satellite [e.g., solution isSolutionFor problem]. Some can exist between multiple segments of equal importance [e.g., eventA precedes eventB precedes eventC]. These relationships are illustrated using diagrams." Diagrams look a lot like linked data triples!
- pp. 210-211: process is – formulate document narrative (DN – comparable to elevator speech), analyze DN per RST, construct document in compliance with RST analysis. "It is possible to create different DNs about the same content to fit various audiences." Rough max. size 1/2-page. Define chunks in DN to represent sections of the document, then define their relationships according to the 9-item (or 23-item) taxonomy.
- p. 213: Toward a generic structure of entity relationships within statements: "After analysing different types of technical documents, it is clear that several of them present a solution to a chosen problem. There is often a section preceding the solution which sets the context (background). These three sections – Background, Problem and Solution – can then be thought of as being essential. We introduce a fourth: the Motivation. This is a section that presents the motivation (or justification) for solving this problem."

**Steehouder, M. 2004. Acquiring procedural knowledge of a technology interface. IEEE Transactions on Professional Communication 47(1): 1-4.**

- Elements: title, conceptual indication of task relevance, subheadings, steps, notes such as warnings and cautions.
- In a test of task completion "using instructions that were presented in prose steps, a table, a flowchart, or a logical tree . . . performance was best with a flowchart or logical tree, and worst with prose. The study also showed that the preference of the participants was not always for the most effective format." Also "any graphical format is preferred to prose, at least for these kinds of tasks." (p. 2)
- And "presenting instructions in flowcharts leads to a faster and more accurate performance, but also to less understanding of the logic of the procedure. Presenting instructions in tables has proven to yield both better performance and understanding, as long as these tables are not too complicated." (2)
- 2: "the component steps were read faster when they were preceded by outcome information. The resulting drawings were also better. . . . the more general outcome information governs the component steps in the mental plan built by the reader."

**Karreman, J., and M. Steehouder. 2004. Some effects of system information in instructions for use. IEEE Trans. Prof. Comm.(47)1: 34-43.**

- Compares PROCEDURAL KNOWLEDGE -- "knowledge about goals, actions, and effects of actions, also called a mental plan" with SYSTEM KNOWLEDGE "about the different parts of the device, their functions, the processes that occur within the device, etc." (34)
- General descriptive information reduces errors "only if the information describes the internal functioning of the product, not when it merely stresses motivational aspects or general principles." (34) 
- P. 35: "subjects who were offered a manual with declarative information did not perform better on immediate task performance. However, in a delayed test, these subjects turned out to score better on task performance, error recognition, and answering questions about the 'logic' of the system." So for short-term task completion, declarative information is a waste of effort. But general background does aid later retention and recall, possibly due to well-developed mental models -- not particularly important for OCS learning, probably, give the episodic and transitory nature of users' interaction with the system.
- Task performance improved _without_ system information, maybe because "practice provided the tacit system information that PS version of instructions was meant to provide." (40) Also, system information increases cognitive load on users and increases perceived complexity of the system, which may reduce users' feelings of self-efficacy with the tool -- a potentially serious problem for OCS!

**van der Meij, H., and M. Gellevij. 2004. The four components of a procedure. IEEE Trans. Prof. Commun. (47)1: 5-14.**

- p. 5: Procedures address four system states – desired, prerequisite, interim, unwanted – and three actions – human, system, external. Really, those are types of action or maybe sources of actions. "The model (that is directly applicable for design) consists of the following components: goals, prerequisites, actions and reactions, and unwanted states."
- p. 6: Goals are final and interim; break down large, long-term goals into near-term milestones. What's the scale for proper chunks? 3-5 steps, esp. where user must memorize (5 +/- 2 rule). Methods for defining breakpoints? Task-specific, with subtasks where step lists get long. "Titles that reflect the task structure can support users by offering scenarios and by supporting the different points of view users can take in task execution." State titles as gerunds.
- p. 7: Prerequisites are system states, user skills, user knowledge. Helps to state explicitly, especially starting screen. To avoid repetition of basic information, use _fading_, where "the support for the execution of basic skills tasks is gradually decreased. From the first full instruction onward, the user gets successively less complete reminders. . . . [which] change from predominantly procedural instructions toward conceptual information." (7) Technique is esp. useful in early stages of learning to contribute to basic skill mastery. Graphical or tabular "expository advance organizer" about how the system works can aid comprehension.
- Strive for "proper balance between direct instructions to act and invitations to explore" (8) by balancing support with 'letting go' – letting a learner engage the system on her own and discover via self-directed learning both what to do and how it all works. 'On Your Own' section of a procedure can cue the right sort of exploration to discover important context for current conceptual or procedural elements. Screen grabs provide visual context and mental map support in addition to specific task/step support as well as confirm understanding and promote self-efficacy. Steps give action and object acted upon; helpful to specify location where to find that object.
- Unwanted states: Warnings emphasize see-think-act sequence to avoid errors; problem solving emphasize detect-diagnose-correct sequence, with emphasis on just-in-time detection because early intervention limits damage.

**Manning, A. 1998. Minimalism beyond computer documentation. IEEE Trans. on Prof Commun 41(3): 200-204**

- Minimalist documentation describes computer functions only in context of real user tasks. "Minimalist documentation is framed around a menu of practical tasks that illustrate as many of the software’s functions as possible" (200).
- Assumed process: Users' SCHEMAS (mental models built on past experience) structure new perceptions and create HYPOTHESES, based on which they act immediately, ignoring contradictory or not directly and immediately relevant evidence, to accomplish their intended TASKS. If this accomplishes goals, SCHEMAS are reinforced. User is ready to learn something new when current instructions fail to accomplish goals, i.e. trial results in error. (Similar to productive frustration in Oberman?)
- "Learners discard old schemas for new ones (our very definition of learning), but only if they are stimulated to build new schemas for themselves, stimulated by concrete hypotheses and concrete tasks. This means that writers must give readers examples and tasks (i.e., problems) to help them build schemas" (203). True in politics, as well?
- Anticipated examples (built from actual ones, usually) --> Problem question (why doesn't this example fit the expected pattern?) --> Schema that explains phenomena. Induction trumps deduction in real-life learning, but authors have already mastered the learning they intend to present, so a deductive structure makes sense to them, ergo mismatch. In task context, that structure is useless to less experienced learner.

**Delanghe, S. 2000. Using learning styles in software documentation. IEEE Trans Prof Commun 43(2): 201-205**

- "although dressed up as 'user tasks,' most manuals still simply describe features." (201)
- Building on Kolb's learning style taxonomy: dynamic (impatient, exploratory), focused (responsive to coaching & concrete examples), contemplative (demand evidence), rigorous (expect careful preparation, presentation). Typically they're mixed, with one ascendant; particular writing styles correspond to learning styles.
- Learners mostly favor **focused** style; tech writers mostly dynamic or rigorous.
- Tips: Short intro with benefits & examples highlighted and warnings noted; prominent contents lists with task-focused subject headings; give high-level outlines of complex processes; only significant details with error recovery information; repeat information key to task completion; link references to background information (layering); concise, well-constructed sentences in relatively formal style. Different from minimalist how??

**Farkas, D. 1999. The logical and rhetorical construction of procedural discourse. Technical Communication 46(1): 42-54.**

- "procedural discourse is largely about telling someone who is in one set of circumstances how to transition to another set. In other words, at the most abstract level, procedural discourse describes system states and actions that change system states." (42) System states: desired, prerequisite, interim, unwanted. Actions: human, system, external.
- On credibility: "The user must be convinced that the procedures come from a fully knowledgeable and trustworthy source, people who respect the user’s investment of time and energy. If not convinced, the user may well plunge ahead without following the procedures" (43).
- **Streamlined step model** (45) 1. Short action statement (or two) per step. 2. Simple formatting. 3. Imperative verb. 4. Little or no explanatory information within step body; some explanation may follow in notes. 5. Layering via hyperlinks can make more context available. 
- decision-action sequence – " the model ideally enables users to quickly decide (while reading the initial components) whether the particular procedure meets their needs, and if the procedure is appropriate, to move crisply from decision- making to carrying out actions." (45)
- _Title_ (nearly mandatory) and _conceptual element_ (optional) help user decide whether this is the right procedure for the task. _Infinitive subhead_ clusters related steps in complex procedure. _Steps_ (mandatory) include description of system responses to user actions maybe with "facilitating modifier" such as location of a required control. _Notes_ (optional) surface warnings, links to related procedures.
- Flowchart model accommodates conditional procedures not as cut & dried as streamlined steps. Hyperlink to steps for each action box, using flowchart as a conditional TOC??? 
- Rich-step and paragraph formatted procedures cover higher-context and tutorial instruction. Sometimes "emplotting the user" gives useful identification with complex context.

**Dabbagh, N., and K. Denisar. 2005. Assessing team-based instructional design problem solutions of hierarchical versus heterarchical web-based hypermedia cases. Educational Technology Research & Development 53(2): 5–23.**

- p. 5: "Hypermedia problem-representation capabilities mirror the characteristics of ill-structured problems and could provide an efficient and effective medium to design cases for learning environments that are problem centered." And " random, dynamic, nonlinear access" to varied resources.
- p. 7: "time spent interacting with the heterarchical case design was one and a half times the time spent interacting with the hierarchical case design" – Because it's conceptually richer and more engaging or because it's less efficient?
- p. 20: "relational or network-like hypermedia representations of ill-structured problems or cases are more effective in promoting advanced knowledge acquisition and transfer" -- maybe not the goal for OCS, but maybe more relevant for LLD?
- p. 20: "The heterarchical case structure facilitated more exploratory-type tasks, which put students in control of problem solving, encouraging them to try out different strategies and hypotheses and observe their effects." Hierarchical structure facilitated easy discovery of specific information, which is better aligned with the OCS need and is a big problem for heterachical organization.

**Oberman, C. 1983. Question analysis and the Learning Cycle. Research Strategies 1(1) (Winter): 22-30.**

- Question analysis involves recognition of a research question (factual vs. conceptual), scope definition (incl. variables like time, place, stakeholders, issues), fields of study recognition, reformulation of the research question. (p. 23)
- Self-regulation in pursuing question analysis: "A person confronted with a problem forms and then tests a hypothesis to solve the problem. If the hypothesis fails, a new hypothesis is formed and tested. This process is continued until a solution is found" (24).
- "Students who cannot successfully self-regulate encounter frustration which often results in failure. 'Constructive frustration' or better yet 'controlled frustration,' however, may stimulate self-regulation and, therefore, help students sharpen their reasoning abilities" (25).
- Pp. 25-26: Three steps in the Learning Cycle – exploration ("The activity performed by the students should be constructed to elicit 'constructive frustration.' "), invention, application.

**Eiriksdottir, E., and R. Catrambone. 2011. Procedural instructions, principles, and examples. Human Factors (53)6: 749-770. (December)**

- Cites Farkas, Knapheide, Karreman & Steehouder, van der Meij -- This is the paper I wanted to find at first in October, but it wasn't yet published! Paper is " the first attempt to aggregate and review research on these different types of instructions with the aim of understanding how they can be structured to induce learners to use strategies compatible to the pedagogical goal in questions." (752)
- Addresses " how different methods of structuring [instructions] affect initial performance (doing the task for the first time with the aid of instructions), learning (performing the same task without instructions), and transfer of learning (attempting a different but related task without instructions)." – 749. Repeats tutorial, procedural, reference categories of documentation.
- "Instructions usually do not have information about the environment that the task is being carried out in or any information about the current state of the system" although sometimes the result state – 750 (???)
- 751: Examples " provide both an instantiation of more abstract instructions and a model of how to actually do the task. . . . However, examples do not, by default, provide explanations, and the users must infer general methods. "
- 753: " Users who do read procedural instructions often scan large parts of the instructions and read carefully only when they need clarification." Citing Carroll 1990: "people are situated in a world that provides context and convention for everything they do, and they prefer to try to understand the situation through the effectiveness of their actions." 
- 754: " the basic assumption for including principles in instructions is that they help people build a more comprehensive understanding or mental representation of the system, as compared to what might be derived from procedural instructions only." \*\*\*Worth defining categories for layering links and tracking analytics stats to see which sorts of links users choose?\*\*\*
- 756: Examples "help people instantiate abstract concepts and provide them with an instance of how a rule governing the task applies to a particular situation" so they combine benefits of steps and system information in context of one another. But " when people are working from examples they tend to look for a direct correspondence between the task and the example and do not necessarily extrapolate from the examples they study" (757).
- **Fading,** where "learners are initially supported to accomplish a task, and then this support is gradually removed (faded) as they learn to do the task. Fading in the current context refers to giving the user incrementally less support for a repeated action" – decrease detail, increase abstract information provided, or combine steps. Fading works better when last step is omitted than when first step is omitted. (766)
- Learners like exploration strategies "and providing explicit invitations to explore helps to keep them motivated and relates the instructions to the tasks that they want to complete" (760) inducing them to set their own goals or adopt the system goals as their own. But learners need "domain knowledge to invent the appropriate situation for practice" and problem-solving helps to guide that more than generalized exploration.

**Roy, D. 2007. Significance of Configuration and Subassemblies in Sequential Procedural Instructions and Role of Text-Graphical Aid: An Explorative Study. IEEE Trans Prof Commun 50(2): 147-162.**

- 149: "In traditional instructional design, instructional designers often create instructions involving the whole assembly context (global context), while readers often may have a smaller or limited context (local context) in mind." Potentially important for OCS because users will be coming to role-based tasks out of context of either their familiar daily activities or the overall conference process outside the boundaries of their specific roles.
- 149: "readers prefer illustrations showing process graphics to illustrations showing outcome graphics for a procedural task"
- 150: "Tufte concluded that efficient uses of graphic labeling, such as object labels, line labels, or label callouts, can reduce the switching needs between text and graphics and actually limit the damage done by misleading or ambiguous graphics." And "labels may contain the most important text in the document"
- 161: "Technical writers can design text to function like outcome graphics. If text strategies like 'object-sentence first' (putting the main idea upfront) are used, they help readers to mentally animate the final goal, even before reading through the step-by-step process."

**Lentz, L., and H. Pander Maat. 2004. Functional analysis for document design. Technical Communication 15(3): 387-398.**

- 389: "a description [of a document] in terms of effects [i.e., reader outcomes to be enabled rather than writer's initial purpose] will help the design team to make a more accurate analysis of the document’s requirements." And "To determine the desired content of the document, we recommend analyzing the actions that the reader must be able to perform after using the document." But the distinction blurs in practice: "it is often unclear where the reader task analysis ends and the functional analysis begins." 
- 392: "The design space contains all the options that are initially open regarding the content, structure, style, and visuals to be used in a given document. It is subsequently restricted by purpose constraints (that is, constraints stemming from the purposes of the document) and non-purpose constraints" e.g., budget, management preference, other imposed requirements. 
- 395: "instructive texts have as their main purpose to explain to people how to use a product, but they often also attain secondary persuasive purposes . . . for example, acceptance of a new technology." And "Although the relational purposes are not document purposes in the strict sense, they clearly imply additional constraints on the design space."

## Lit Review Follow-up 

Article reviews have reached that point in the design cycle where familiar concepts are restated rather than new ideas emerging. Further activities to build on the readings notes above, as discussed during a break in LLD meeting:

- Develop standard template for an OCS procedure document
- Submit template for stakeholder review
- Summarize learning from readings in a narrative laying out intended goals, priorities, processes for developing documentation for OCS (and potentially other DCMI-related toolsets) -- While reviewers review
- Submit summary document for stakeholder review (?)
- Revise procedure template per reviewer input
- Revise summary document per reviewer input
- Develop prototypes/exemplars per revised procedure template

## Roles to be documented: 

- Sponsoring organization representative(s)
- Conference manager (decision maker/implementer, accountable to SO reps)
  - Conference information manager (communication responsibilities, accountable to Conf Mgr)
  - Program manager (responsible for managing conf sessions, call for papers, submission reviews, accountable to Conf Mgr)
    - Track manager(s) (responsible for defining tracks, organizing sessions within specific track, accountable to Pgm Mgr)
    - Reviewers (responsible for commenting on submissions assigned, accountable to Pgm Mgr)
  - Registration manager (responsible for attendee registration functions, accountable to Conf Mgr)
- Speakers (submit proposals and papers for accepted sessions; out of scope for this project?)
- Attendees (register & attend; out of scope for this project?)

One person may play more than one of these roles – maybe all – but OCS functions will break down into these logical groupings.

## Assumptions 

- Dates, locations, prices all set by SO reps, not at Conf Mgr’s discretion. Documentation would need a list of these facts that must be established before set-up in OCS.
- Conf Information Mgr will have basic CSS competence or assistant with that competence.

[http://www.w3schools.com/css/](http://www.w3schools.com/css/)

## Tasks & sequence 

Documentation should follow the sequence of tasks needed over the life cycle of a single event site, from initial posting through initial basic information site, call for papers, review, program & track creation, registration, proceedings access, CEU management (???). May need to be cross-referenced by role.

- Basic placeholder/announcement site:
  - ~12 months before event?
  - Header, stylesheet, page structure in place with basic information about location & time, timeline for CFP/review/registration/attendance.
  - Conf Inf Mgr is responsible
- Call for papers
  - ~8 months before event?
  - Acceptance policy/submission guidelines
  - Tracks defined (Pgm Mgr & Track Mgrs)
  - Conf Inf Mgr coordinates posting
  - Front page updates replace the announcement content
- Peer review & program creation
  - ~6 months before event?
  - Reviews assigned, monitored (Pgm Mgr, Track Mgrs)
  - Review comments compiled (outside OCS? Spreadsheet or&nbsp;??)
  - Acceptance/rejection notification (Pgm Mgr, or Conf Inf Mgr?)
  - Program compiled, posted (Pgm Mgr or Conf Inf Mgr?)
- Registration
  - Opens ~3 months before event?
  - Price & terms information (Conf Inf Mgr, directed by Conf Mgr)
  - Travel information (Conf Inf Mgr)
    - Hotel
    - Transportation & logistics
    - Local attractions
  - Announcements updated as events occur – early reg discount deadline, new highlights added to program
  - Speaker guidelines (A/V needs, copyright assignment, other)
  - Bonus content created & posted (e.g., Flickr badge, Twitter feed, videos, etc.)
- Wrap-up
  - Through ~2 months after event
  - Proceedings access
  - CEU or other attendee credits
  - Next annual event basic announcement (return to start)

## Documentation Model Summary 

- Revised lit review (v1.1) [PDF-163K](http://www.preciserecall.com/lis/files/ocs/DocModelForDCMI_v1-1.pdf)/Word 2010 [DOC-44K](http://www.preciserecall.com/lis/files/ocs/DocModelForDCMI_v1-1.docx)
- Completed lit review (v1.2) [PDF-161K](http://www.preciserecall.com/lis/files/ocs/DocModelForDCMI.pdf)/Word 2010 [DOC-45K](http://www.preciserecall.com/lis/files/ocs/DocModelForDCMI.docx)

## Draft Outline for Procedure Template 

- To be executed as a properly formatted, interactive, annotated html page; this is brainstorming, not final output!
- Working draft of the html template [is here for convenience of updating](http://www.preciserecall.com/lis/files/ocs/). That page links to two exemplars of procedures developed using the template. All can move to an appropriate location for reviewer access when ready.
- Version of the page linked above, but in [this mediawiki](/mediawiki_wiki/DCMI_Conference_System/Documentation_Template).

[at the top: timeline or flowchart lists process milestone nodes – hover state for each node displays linked task list relevant there, color/icon-coded for participant role – some link returns linked list of all tasks by role – each task list link returns a 1-page procedure, as below; Farkas 1999, Barber 2003, Steehouder 2004; to support mental modeling of the overall task sequence – Manning 1998, Karreman & Steehouder 2004]

**1.1 Procedure Title** [numbered procedures to accomplish a task from the timeline, stated as a gerund; function is to help user determine if the current procedure is relevant to his/her immediate goals – Farkas 1999, van der Meij & Gellevij 2004]

Brief text summary of procedure scope & objectives [function is to help user determine if the current procedure is relevant to his/her immediate goals – Manning 1998, Farkas 1999, Barber 2003; consider format of Rhetorical Structure Theory as statement of "relationship" between "nucleus" and "satellite," e.g., solution isSolutionFor problem -- Da Sliva & Henderson 2007]

**Role:** RoleName [state user role who completes task to help user determine if the current procedure is relevant to his/her immediate goals –Farkas 1999; match color/icon-coding of role indicators in flowchart]

1. Process steps numbered, starting with definition of required preconditions – system states, prior procedures completed, user skills, user knowledge [van der Meij & Gellevij 2004]
2. List includes 3-7 steps (5 +/- 2) [van der Meij & Gellevij 2004]
3. Short, declarative statements of 1-2 actions per step [per Streamlined Step Model of Farkas 1999; Delanghe 2000]
4. Links open more detail for users who need them, either new learners or returning users needing reminders, to "layer" detail relevant to user needs [Farkas 1999, Delanghe 2000, Eiriksdottir & Catrambone 2011]
5. But AVOID Mr. Clipit-style intrusiveness – keep layered detail under user control!! [Barber 2003]
<pre>***Notes interspersed in steps and called out with special formatting highlight 
warnings of probable errors and/or guide user in recovering from probable errors*** 
[Farkas 1999, Delanghe 2000, van der Meij &amp; Gellevij 2004, Steehouder 2004]
</pre>

**Next Procedure:** 1.2 Next Procedure Title [state next step to be completed to support mental modeling of the overall task sequence – Manning 1998, Karreman & Steehouder 2004]


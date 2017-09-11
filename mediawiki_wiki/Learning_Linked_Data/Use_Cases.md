---
title: Use Cases
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/Learning_Linked_Data/Use_Cases.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 19 August 2012, at 23:28.  
This page has been accessed 25,274 times.

### Project Links 

- [Project Home](/archive/mediawiki_wiki/Learning_Linked_Data "Learning Linked Data")
- [Learning\_Linked\_Data\_Topics](/archive/mediawiki_wiki/Learning_Linked_Data_Topics "Learning Linked Data Topics")
- [Learning\_Linked\_Data\_Tracker](/archive/mediawiki_wiki/Learning_Linked_Data_Tracker "Learning Linked Data Tracker")

### Use Cases 

In addition to comments on the Learning Inventory, the project invites contributions of use cases outlining possible instructional scenarios related to learning Linked Data concepts, technologies, and tools. Such practical applications can help to discover and prioritize tools to be highlighted in implementing a coherent package of instructional resources.

Stuart Sutton, CEO of the Dublin Core Metadata Initiative, has provided a use case for an introductory university course. Others may be posted as comments on this page.

**SCENARIO: Introductory university course in semantic metadata**

- Prerequiste knowledge and skills:

Learners should have a basic understanding of knowledge organization systems, XML, and database management. No prior knowledge of RDF or Semantic Web is assumed.

- Education or training context:

Learners should be motivated to learn the technology. Appropriate for advanced undergraduate informatics majors. Instruction -- lectures and discussion -- are totally online and asynchronous. A ten-week course, with roughly 20 hours of lectures and presentation and 70 hours of reading, assignments, and other activities.

- Student deliverables:

By the end of the course, students will produce serializations of RDF graphs in several syntaxes; design a domain model (class diagram); create RDF vocabularies and SKOS concept schemes; and produce RDF instance data for a student project.

- Expected learning outcomes:

Students should demonstrate a grasp of basic Linked Data and Semantic Web tools and concepts, including the principles and mechanisms for merging graphs. They should understand how to use RDF serialization syntaxes; manually draw RDF graphs; serialize frequently used N-ary triple patterns; "webify" existing controlled vocabularies. They should be able to explain the difference between the XML information set and the RDF abstract data model and demonstrate modeling skills in mapping between the two.

- Required use of tools:

Students should be able to use tools for graphically depicting domain models (class diagrams); for editing and validating RDF data; for transforming data among different RDF syntaxes; and for generating visual depictions of RDF graphs

[David Talley]: Another use case (in very rough draft) is based on experience engaging with object descriptions from museums during a project at the Univ. of Washington iSchool. Many museums have exposed collection metadata as Linked Data, and more of them may well be inspired to follow suit. The learning requirements for such a project are largely conjecture on my part, but maybe they’ll trigger some welcome edits based on wider experience. I’ve followed Stuart’s format.

- SCENARIO: Museum interested in exposing collection descriptions as semantic metadata
  - Prerequiste knowledge and skills: Learners should have a basic understanding of knowledge organization systems, and at least intermediate understanding of the local collection management system, possibly including any web publishing modules available. Some skills/understanding in relational databases needed?
  - Education or training context: Motivation to engage with other cultural institutions is probably a given. Individual learner would be a web developer or web producer, but instruction may have to engage with a policy-level decision maker and primary collection manager(s) with responsibility for collection record content. Instruction strategy would emphasize self-instruction, probably based on text accessed over the web, maybe some video. Maybe some trial & error on tool demo consoles. Engagement via discussion boards with other learner/practitioners? Timeline would likely depend on project implementation plans, or it could be quite indefinite as a side project emphasizing background knowledge.
  - Student deliverables: Deliverables would likely be much the same as for other use cases, but maybe emphasizing working test/demo prototypes, and ultimately working production instances, more than rigorous document artifacts. Training may need to emphasize the value of documentation, e.g., for project revisions over time.
  - Expected learning outcomes: Highly practical! RDF/XML, Turtle, other(?) encodings for sample data from actual collection metadata; working display templates that mash up the museum’s own data with relevant data from other institutions; server and software support specs and configurations, e.g. for a SPARQL endpoint. One key outcome might be knowledge of available data sources relevant to the museum’s collection. Trust relationships could be an important variable, depending on collection scope and type as well as particular application goals. A general natural history museum might happily source Linked Data from Wikipedia for a public education application, while a very specialized institution might select carefully for sources with specific expertise. Persistent publishing of application profiles — A specialized institution might encounter highly detailed needs for resource description within its domain. If appropriate vocabularies don’t yet exist, it may have to develop them, publish them in a persistent way, and provide for their maintenance over time, including other stakeholders within the domain in those processes.
  - Required use of tools: RDF editors and validators; utilities for mediating between back-end systems, likely proprietary vendor systems, and Linked Data output needs, e.g. SPARQL access; SPARQL query builders, consoles; tools for graphic modeling (e.g., class diagrams); use and adaptation of public metadata repositories to publish specialized vocabularies.

[Laura Smart via email]:

- I think this should have been the very top/first thing. It has some of the context which was missing in the other sections. I like [the museum] use case a lot. I think it’s generalizable to other similar use cases. There are lots of LAMs sitting on specialized information and your point re: vocabularies not even existing is well taken. I think it could be applied to my use case, which you can totally use [http://library.caltech.edu/laura/?tag=facnamesproject](http://library.caltech.edu/laura/?tag=facnamesproject) . Putting it into your format:
  - SCENARIO: Small academic research library wants to expose faculty names as linked data to incorporate into the institutional repository, researcher expertise/scholar profile applications (ex. VIVO, Community of Science), grant applications, publication tracking and metrics (esp. for institutional impact/sharing at the provost level).
  - PREREQUSITE KNOWLEDGE: What you said in [the museum] use case. Plus domain knowledge of the data content (i.e. authority records)
  - EDUCATION OR TRAINING CONTEXT: Practicing early & mid-career metadata librarians who didn’t get training like this in library school, lack some of the required background. A small amount of technical support from programmers is available as well as development servers for hands-on practice but no software tools for doing the work are yet installed. Training should be asynchronous, delivered to the individual desktop and consist of practical hands-on exercises which can be related to the types of work libraries will be doing in LD. The application of the learning (i.e. implementation of scenario project) would be done in collaborative team-based fashion
  - STUDENT DELIVERABLES: Working demo prototype. Plus exposing the LD for use within other LD applications (ex. VIVO?).
  - LEARNING OUTCOMES: What you said in [the museum] use case.
  - REQUIRED USE OF TOOLS: What you said in [the museum] use case. I might add testing the LD output by adding it into another tool.

[From the February 2012 workshop:]

- [Corey Harper]: Merge MARC, EAD, and Dublin Core records into "NYU Core" records. Taking five records, extracting parts of them to triples, merging those into a graph, and turning that into a record.
- [Joseph Busch]: "Companies want consultants to produce deliverables. What you're doing here is creating an environment for people to teach themselves. A corporate problem would be that they can't efficiently get the data they need because it's dispersed in all these different places. I educate them, get their data management people to stop doing 'data management,' and think about how their data should be made Linked Data ready without building another system. A lot of this is how to educate people in the real world who are IT professionals, library professionals, to think differently about problems they're already familiar with. This tool is focused on one part of that educational process."
- [Marjorie Hlava]: "My need is a little different; I have to deliver the actual product. I might start with specifications, but we have to take data, massage it, and put it into a system where it will work. A science association might have journals, conferences, committees, etc. on a topic. If someone has an article they discovered, they might want to link out to other things in different formats or venues that have to do with that data. The use case is being able to present on a website to the searcher who finds that article the upcoming conference, etc. It's a great use case for Linked Data capability."
- [Marjorie Hlava]: "In records management, I have a client that's a large insurance company, with 2 terabytes of undifferentiated data lying around like a bomb. It costs them over a million dollars a year to maintain the drive. The application there is to figure out the retention schedule for the data. We have a controlled vocabulary and a retention schedule, and you link the two and apply it in a crawling mechanism to assign retention schedules to every information object on the shared server. They have legal holds on some data that would otherwise fall under some of those schedules."
- Any studies on usability of the visualizations in info retrieval?


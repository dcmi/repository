---
title: Meeting Report
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DC-2011_Vocabulary_Special_Session/Meeting_Report.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 4 January 2012, at 00:55.  
This page has been accessed 171,567 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DC-2011_Vocabulary_Special_Session_Meeting_Report"><span class="tocnumber">1</span> <span class="toctext">DC-2011 Vocabulary Special Session Meeting Report</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Report_of_the_Vocabulary_Management_Session_.28Based_on_Flip_Chart_Transcriptions.29"><span class="tocnumber">1.1</span> <span class="toctext">Report of the Vocabulary Management Session (Based on Flip Chart Transcriptions)</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Issues_of_Discovery.2C_Selection_.26_Quality_Control"><span class="tocnumber">1.2</span> <span class="toctext">Issues of Discovery, Selection &amp; Quality Control</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Measuring_and_Assessing_Quality_Control"><span class="tocnumber">1.3</span> <span class="toctext">Measuring and Assessing Quality Control</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Evaluating_and_Using_Documentation"><span class="tocnumber">1.4</span> <span class="toctext">Evaluating and Using Documentation</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Concerns_of_Vocabulary_Owners_and_Managers"><span class="tocnumber">1.5</span> <span class="toctext">Concerns of Vocabulary Owners and Managers</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#Mapping_And_Alignment_Issues"><span class="tocnumber">1.6</span> <span class="toctext">Mapping And Alignment Issues</span></a></li>
            <li class="toclevel-2 tocsection-8"><a href="#Breakout_session_on_.22Preservation_of_RDF_vocabularies.22"><span class="tocnumber">1.7</span> <span class="toctext">Breakout session on "Preservation of RDF vocabularies"</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## DC-2011 Vocabulary Special Session Meeting Report 

Corey Harper opened the meeting on behalf of the organizing group (Corey, Diane Hillmann, Tom Baker, Gordon Dunsire, Johannes Keizer and Jon Phipps). He explained that the session was set up as an unconference, focusing on issues related to vocabulary alignment and use. Unconferences are participatory events, like Curate Camp and LOD-LAM. With these kinds of events, the audience sets the program, with breakout sessions and lightening talks included. The goals for the day were:

- to establish a community around Vocabulary Management;
- to identify gaps, needs, and pain points for managers and users;
- to create a venue for discussion of tools, technologies, and best practices. 

To set the agenda, a poll was taken to determine the roles participants played in vocabulary management activities. Almost half of the respondents identified themselves as vocabulary managers. Further, most of the vocabularies managed are open. The group determined that there would be about 14 lightning talks to assist in highlighting issues. In the afternoon,solutions and answers to the problems identified in earlier parts of the session. Of the topics revealed by the poll, alignments were the single biggest topic.

Agenda outline:

- 09:00-10:30 Opening session (30 min), 6-8 lightning talks (30 min), selection of breakout session topics (30 min).
- 11:00-12:30 1st set breakout sessions
- 13:30-14:00 Additional lightning talks
- 14:00-15:00 2nd set of breakout sessions
- 15:30-17:00 Closing discussion

### Report of the Vocabulary Management Session (Based on Flip Chart Transcriptions)

In order to re-use vocabularies, we need some principles of acceptable use, covering:

- Rules of conduct and good practice when using, modifying, extending and aligning a vocabulary owned by another entity
  - Is copying permitted, and if so, what kind of attribution is required? Is it okay to modify the URIs?
  - What modifications are permitted when re-using or aligning vocabularies?
  - Is there a responsibility to notify vocabulary owners when reusing or aligning? When extending?
    - Availability for commercial use, and associated restrictions or licenses (recognizing that an openly available vocabulary is difficult to restrict as to commercial uses)
    - Any policies of a vocabulary owner covering these issues should be documented clearly

- What is the value proposition for a vocabulary owner in allowing reuse, extension, or any other adaptive activity around their vocabulary? Pluses include: 
  - Possibility of collaboration providing additional funding for maintenance
  - Larger community in which to discuss changes and modifications (this can be a minus if badly handled). A larger community creates potential for growth and expansion.
  - Potential for other language additions

- Minuses could include:
  - Others might use the vocabulary incorrectly
  - Managing a larger community can be time-consuming and contentious. 

- What happens when a vocabulary outgrows its organization, or is abandoned by that organization?

### Issues of Discovery, Selection & Quality Control

- Discovery of property vocabularies is a different problem than discovery of concept vocabularies.
  - There are no good tools for discovering what’s available. Swoogle is not working for that purpose.

- Selection criteria in a Linked Data context generally have a goal of finding the right properties for dataset
  - Is the vocabulary available on the web?
  - Is the vocabulary open or proprietary?
  - What is the level of complexity/richness available within the vocabulary?
  - Is the vocabulary properly maintained and up-to-date? 
  - Are the services provided adequate?
  - Is the vocabulary author or owner trustworthy?
  - Does the vocabulary have a persistence policy for deleted or deprecated properties or concepts?
  - Is there evidence of extensive use of this vocabulary? (Mondeca has findings)
  - Are the labels used familiar to the intended audience?

- In a Linked Open Data world can we be less conservative about choices?

### Measuring and Assessing Quality Control

- How much quality control is necessary? What are the criteria we should use?
  - Are there conflicting statements? 
  - Does the source vocabulary contain constraints on properties, concepts, domains, etc. Are these well expressed and articulated within the vocabulary or in the URI?
  - Does the vocabulary contain conflicts due to lack of quality control? (for example, typos, un-moored relationships, label preferences?)
  - Because rust is not a yes/no aspect, is there documentation describing the context and point of view of the vocabulary creator?
  - Does the focus of the vocabulary creator fit the needs of the potential re-use? Is the coverage sufficient for the intended re-use? 

- How do we work with imperfect choices?

- In a Linked Data world, do we have requirements or assumptions that need to be accommodated?
  - Is the distribution of the vocabulary within the domain important? 
  - Do we need to allow for redundancy where coverage is spotty?
  - How do we evaluate the growth patterns of the vocabulary, and is it an important consideration (Should it develop “like emergence of natural language” [B. Vatant]?)
    - Vocabularies are similar to natural languages, and require time and curation, particularly where top down and bottom up approaches meet.

### Evaluating and Using Documentation

- Documentation about vocabularies is vitally important, particularly for potential users in the stage of evaluation, but also for the community already using the vocabulary. Documentation should include the following:
  - Explanation of the vocabulary structural as well as a full description of vocabulary itself (editorial policies, scope, extension policies).
  - Whether or not there are multilingual aspects or if planned
  - The disciplinary perspective perspective that informs the point of view and definitions of the vocabulary
  - Whether the vocabulary is usually or may be adopted within a multiple vocabulary adoption (layered)
  - Whether the vocabulary is aimed at a specialized or a general audience
  - In the case of an area of vocabulary interest where usage is shifting and the context is especially volatile vocabs, a management and maintenance strategy is critical in determining fitness for re-use 
    - For example, vocabularies covering time-based issues, like oil importing countries where membership changes over time (temporal drift)
    - We should look at archival practices for more insight into possible best practices for general vocabularies)
  - Use cases are needed to help provide a context for best practices in this area

### Concerns of Vocabulary Owners and Managers

- Governance issues
  - Protecting the rights of various stakeholders
  - Formal organizational models (e.g., AGROVOC has a governance charter)
    - Definition of roles and responsibilities
    - Maintenance policies
    - Sustainability plan, with exit and preservation strategies 
    - Community involvement
    - Role of experts?

- Rights issues
  - License requirements and expectations
  - Expectations around IP rights for language versions, whether done by owner or others
  - Openness for expansion or linkage by others

### Mapping And Alignment Issues

Creators of maps and alignments need to be aware of constraints:

- Mappers must pay close attention to semantics
- Constraints of domain or hierarchy cannot be ignored
- When the match is fuzzy or nonexistent, what then?
- It’s important to remember that the purpose of mapping is to create useful relationships
- Mapping may occur on more than on ‘level’ and should be documented as part of the process
- Provenance is important, in particular to carry process and documentation information
- The logical consistency of the result is important
- Many fear using ‘exact match’ or ‘sameAs’ (asserting a close match is much less daunting)

Remaining questions:

- What is the ideal process for creating a map?
- How important is it to users of maps to know specifically whose decision they’re seeing? Is that a function of provenance?
- How and how often should maintenance of maps occur? 
  - In reciprocal mapping, how is it possible to reflect change and or preserve change?
- Ideally, a mapping lifecycle needs to be defined, along with a set of best practice guidelines
- Mapping methodology also needs definition, documentation, and best practices, including the value of registration
- Mapping predicates are a vocabulary themselves--how do we increase or share the mapping predicates we use? How useful is UMLS as mapping predicates?
- What role does rating and quality assessment have in this process? Could either be used as a focus for sharing information?

Two follow up tasks: Jane Greenburg remembered that an ALCTS subcommittee gathered predicates some years ago--she will look into it. There was a suggestion that we should look at ISO 25964.2, a thesaurus standard, not yet approved by ISO but in process (need a volunteer to chase this down, preferably someone who has access to ISO standards.

### Breakout session on "Preservation of RDF vocabularies" 

[File:2011-09-21.dc2011vocabs-preservation-breakout.pdf](/mediawiki_wiki/files/2011-09-21.dc2011vocabs-preservation-breakout.pdf "File:2011-09-21.dc2011vocabs-preservation-breakout.pdf")

Participants: Tom Baker (discussion leader and note-taker), Kevin Clair, Jian Qin, Shigeo Sugimoto, Raju Buddharaju, Juha Hakala, Bob Boelhouvwer, Doug Moncur

- Access mechanisms to vocabularies: technologies will change
  - Currently using DNS
  - Future will be something else
  - How do we migrate?
- URIs
  - Identification of the object and access mechanism: same identifier
- Use persistent identifier that is embedded for now in...
  - URL: what it resolves to can change
  - With persistent ID, object can move around more easily than with DNS redirects

- Split persistence
  - Organizational/political
  - Technical
- With highly specific systems, lack expertise to maintain.
- With persistence, maintenance part is the most difficult.
- Becomes less and less useful.
- Persistence not just keeping available, but that.

- Mechanism for mapping old vocabularies to new.
- In sciences, ad-hoc vocabularies all the time.
  - Folksonomies that become vocabularies, get abandoned, what's left is useless.
- Organizations should commit
  - But organizations can collapse, so need failr safe mechanism: 
- When you start, need exit strategy
  - Wider community that has guarantees survival that is strongly supported.

- Three-year funding cycles.
- Be explicit, state up-front.
- People can go back to it, re-map.
- Need to be clear what needs to be preserved.
  - Maintenance of resolution system.
  - But last resort might be paper or PDF.
- Heart the problem is a business model
  - Language resources area. Build up knowledge bases from producers of data. 
  - How can an organization commit resources long-term? Governments are still the best safeguard, but must be learn.

- LOCKSS just preserves bits
  - But long-term, may need to be migrated.
- In addition, need technical environment (access and maintenance)
  - Organizations building ontology libraries
  - But cannot get off-the-shelf, commercial systems -- technical specs that limit interoperability.
  - Build national repositories for vocabularies.
  - Like to have international system that harvests SKOS-based.

- Search engine harvesting SKOS vocabularies.
  - Internationally centralized? Should be locally decided instead of 
  - Would not be expensive service to run.
- For preserving vocabularies, also need documentation: structured descriptions
- What to preserve?
  - Documentation
  - RDF schemas resolvable -- but not "preservation"

- Any scientific dataset: 5 years half-life.
  - If you don't want the data, you don't want the vocabulary.
  - Need to preserve some vocabularies long-term.
- Vocabularies need to evolve.
- Changing tool used for classification -- millions of books in the old system.
- Snapshots: cheap to make
  - Periodically refresh cache of the Subversion repository of a vocabulary

- Libraries that prioritize 
- Not expensive to keep a frozen copy.
- Europeana as repository of vocabularies?
- Scientific communities: each one has its own terminologies.
  - Most not formalized (SKOS, etc)
  - We need to go into their communities, understand which vocabularies used in which workflows.

- First ring: developing vocabularies
- Need to preserve environment (hardware, software)?
- Need to preserve access (long-term preservation).
- Not just LOCKSS, but several, e.g. IRODS: same general functionality.
  - IRODS: local client can specify what to ingest
  - If all systems fail simultaneously... but better...
  - More an archival solution.

- A vocabulary that is not maintained will not remain useful.
  - Whether a preserving organization 
  - SKOSification as part of the long-term preservation process
    - Makes it easier to move
- Levels of preservation?
  - What are the risk factors.

- Vocabularies are dynamic, unlike publications.
- Need to maintain system that keeps it useful.
- Example showing importance or danger of vocabulary preservation?
- Risk factors, Preservation levels -- needed for justifying funding.


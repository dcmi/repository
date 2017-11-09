## "Competency Index for Linked Data": style and editorial guidelines

2016-12-24: @TODO: constitution, members, process (members, meetings, decision 
methodology).  Stylistic consistency.

1. Describe Editorial Board process: constitution, members, process (members, meetings, decision method)
1. Pick one pull request, link to its diff
1. Write to CIEB: status of pull requests. Proposal Dec telecon. Still using "manual" update. Propose style cleanup.

Tom Baker, November 2016

The Competency Index for Linked Data (CI) is a set of topically arranged
assertions of the knowledge, skills, and habits of mind required for
professional practice in the area of Linked Data.  The target audience for the
CI consists of independent learners who want to learn Linked Data methods and
technology, and professors or trainers who want to design and teach courses.

The CI exemplifies a broader class of documents, or frameworks, for describing
curriculum standards and learning objectives or outcomes.  There is no one
standard way to formulate a competency framework; the range of subjects to be
learned and the requirements for learning are too diverse to be completely
normalized.  Competency indexes designed to support certification, for example,
may need to be more detailed than this index.

To create this index, the Competency Index Editorial Board invented and tested
its own stylistic principles.  The Board strove for stylistic coherence,
consistent granularity, manageable length, and general readability.  The goal
was to formulate a Competency Index that could be printed out by interested
learners and profitably be read from start to finish, with language evocative
enough to convey the general drift of the subject matter even to newcomers.

This document describes those stylistic principles in the form of guidelines
for future editors who may want to update or expand the index.  Just as Linked
Data technology is bound to evolve and change over the coming years, this
Competency Index can be viewed as a living document.

### Structure of the Competency Index

The Competency Index is structured into _topics_ (and higher-level _topic
clusters_), _competencies_, and _benchmarks_:

__Topics__.  A topic is a theme under which a set of competencies are grouped,
such as _Designing RDF-based vocabularies_ and _Maintaining RDF vocabularies_.
Topics are grouped under higher-level topic clusters, such as _RDF vocabularies
and application profiles_.  

__Competencies__.  A competency is a brief phrase characterizing knowledge
(facts, insights, habits of mind, or skills) that may be learned.
Competencies may be used as building blocks for constructing self-learning
plans, university courses, or even entire curricula.  Under the topic _Querying
RDF Data_, for example, one finds two competencies:

* _Understands that a SPARQL query matches an RDF graph against a pattern of
  triples with fixed and variable values._
* _Understands the basic syntax of a SPARQL query._

__Benchmarks__.  A benchmark is a brief phrase describing an action that can
demonstrate accomplishment in a given competency.  If competencies are about
learning, benchmarks are about doing.  Benchmarks may be used for devising
homework assignments, exam questions, or self-testing checklists.  Under the
competency _Understands the basic syntax of a SPARQL query_, for example, one
finds three benchmarks:

* _Uses angle brackets for delimiting URIs._
* _Uses question marks for indicating variables._
* _Uses PREFIX for base URIs._

The strictly topical structure of the Competency Index entailed the following 
design choices:

* The CI avoids classifying competencies or benchmarks by level of difficulty
  because it makes no particular assumptions about the background or skills
  sets of learners.  Concepts that are comparatively easy for a library science 
  student may be hard for a computer science student, and vice versa.
* The CI avoids implying an inherent order to the topics.

### Writing effective competencies and benchmarks

1. Limit each competency or benchmark to one sentence of circa 140 characters,
   the length of a Twitter posting.  If a thought seems to require more words,
   consider splitting it into two simpler thoughts.

2. Begin each competency or benchmark with an action verb.  Competencies, which
   are about learning and understanding, start with verbs such as _understands_,
   _knows_, _recognizes_, or _differentiates_.  Benchmarks, which are about
   doing, start with verbs such as _uses_, _expresses_, or _demonstrates, 
   or with more task-specific verbs such as _distills_ or
   _converts_.

3. Spell out acronyms at least once.  For example, the competency that
   introducing OWL says: _Knows Web Ontology Language, or OWL (2004), an RDF
   vocabulary of properties and classes that extend support for expressive data
   modeling and automated inferencing (reasoning)._  Use your judgement in this
   regard; in a competency index about Linked Data, frequently used acronyms
   such as _OWL_ and _URI_ need only be spelled out once.

4. Include historical context if possible.  Linked Data technology has largely
   evolved over the past quarter century and continues to evolve.  Knowing the
   year when a technology or concept was introduced helps readers, for example:
   _World Wide Web (1989)_, _HTTP (1991+)_, _URIs (1994)_, _OWL (2004)_, and 
   _Linked Data (2006)_.

5. Include enough detail to characterize the nature of competency in a domain.
   Competencies and benchmarks should not aim at covering all features of a
   technology, in the manner of a reference manual.  Attempts at
   comprehensiveness risk making the CI brittle in the face of inevitable
   change, and they risk making the CI boring to read.

6. Draw attention to ambiguity in the definition or use of terminology.  One 
   competency reads: _Knows that the word "ontology" is amiguous, referring to 
   any RDF vocabulary, but more typically a set of OWL classes and properties 
   designed to support inferencing in a specific domain_.

7. Enlarge the set of topics covered by the CI with prudence, bearing in mind
   adding topic clusters enlarges the scope of the CI as a whole.  The starter
   set of topics for this CI were originally brainstormed in 2012, at a
   workshop of experts convened by a previous IMLS-funded project, Learning
   Linked Data, and there is no expectation that this scope will remain static.
   For example, there is a recognized need to define competencies related to
   knowledge organization systems, but this feels like a topic big enough to 
   require its own competency index.

---
title: "- FoafReviewBackground"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/agentswiki/pages/FoafReviewBackground.html"
---

# > [FoafReviewBackground](http://dublincore.org/agentswiki/FoafReviewBackground?action=fullsearch&value=FoafReviewBackground&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/agentswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/agentswiki/FrontPage)
- [RecentChanges](http://dublincore.org/agentswiki/RecentChanges)
- [FindPage](http://dublincore.org/agentswiki/FindPage)
- [HelpContents](http://dublincore.org/agentswiki/HelpContents)

Page

- [Edit](http://dublincore.org/agentswiki/FoafReviewBackground?action=edit "Edit")
- [View](http://dublincore.org/agentswiki/FoafReviewBackground "View")
- [Diffs](http://dublincore.org/agentswiki/FoafReviewBackground?action=diff "Diffs")
- [Info](http://dublincore.org/agentswiki/FoafReviewBackground?action=info "Info")
- [Subscribe](http://dublincore.org/agentswiki/FoafReviewBackground?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/agentswiki/FoafReviewBackground?action=raw "Raw")
- [Print](http://dublincore.org/agentswiki/FoafReviewBackground?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/agentswiki/FoafReviewBackground?action=AttachFile)
- [DSP2XML](http://dublincore.org/agentswiki/FoafReviewBackground?action=DSP2XML)
- [DeletePage](http://dublincore.org/agentswiki/FoafReviewBackground?action=DeletePage)
- [LikePages](http://dublincore.org/agentswiki/FoafReviewBackground?action=LikePages)
- [LocalSiteMap](http://dublincore.org/agentswiki/FoafReviewBackground?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/agentswiki/FoafReviewBackground?action=SpellCheck)

Search

<form method="POST" action="/agentswiki/FoafReviewBackground">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="FoafReviewBackground_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="FoafReviewBackground_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

This document provides some background on FOAF, DC and Agents. It compares the perspective on Agents from DCMI to that used in the RDF/FOAF approach. 

Detailed discussion of specific attributes is in the main [[[FoafReview](http://dublincore.org/agentswiki/FoafReview)]] document.

#### Background

The Dublin Core community have periodically addressed the topic of Agent description for over a decade. While the original 15 DC terms were historically regarded as being for the description of (broadly) "document-like" objects, the need in the DC community to describe agents associated with those objects has been clear since the early days of the initiative. For example, at the Dublin Core Workshop in Helsinki, in October 1997, UKOLN/AHDS work on deploying DC was presented. Their report, [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">Discovering Online Resources. Unifying Resource Discovery Metadata for the Humanities: An Application Based Upon the Dublin Core](http://ahds.ac.uk/public/metadata/disc_05.html) articulated some common expectations from the metadata community at the time. For example, properties such as "personalName", "corporateName", "affiliation", "email", and constructs for postal addresses, phone numbers, fax etc were required. It was generally recognised that these kinds of property were both useful, needed ... but yet not really properties of the core "document-like" object being described in some Dublin Core record.

This tension between application needs and practical scoping of the DC was central to DC discussions and decisions over the last decade. Dublin Core took as a scoping constraint the ideal that community extensions and refinements should in some sense be "optional" and "dumb-downable", so that all applications and users of DC would at least share some commom base understanding of a DC-based record. If DC were to take a very liberal approach to extensibility, allowing community refinements/qualifiers for DC terms which really encoded properties of various related resources (buildings, telephones, people), ... the core value of DC could be endangered. Intuitively, the phone number of some contributor to some document is not always usefully considered to be a direct property of that document. To avoid "polluting" the values of the 15 core DC terms with such related-but-different metadata, the DC community articulated the "1 to 1" principle, which was an attempt to formalise this constraint to guide the development and community extension of Dublin Core.

At the same time that these discussions were taking place, W3C's RDF initiative was maturing. First publically presented at the October 1997 DC Workshop in Helsinki, RDF provided a clean and formally-grounded model for describing arbitrary properties of arbitrary things, using a data model that made clear their inter-relationships and allowed for many potential ambiguities to be avoided.

From 2000, the FOAF project began experimenting with the use of RDF for describing people and agents in the Web. Unlike DC, organizationally FOAF was an informal collaboration amongst members of the RDF and Semantic Web developer community. While standards-based, it had a more experimental style and adopted the strategy of trying various terms in public to see which were adopted, and documenting them often only in retrospect. FOAF was designed as a pure RDF vocabulary, and as such expected to be used alongside other RDF vocabularies such as DC. The vocabulary evolution model of FOAF was itself derrived from the DC experience, ... in particular the decision to version at a term level rather than at the namespace level came after observing the deployment issues around DC's move from a 1.0 to a 1.1 namespace. The initially ad-hoc approach to FOAF deployment has created some legacy around some parts of the FOAF design, in particular the properties for structured names.

As of May 2007, the FOAF specification defines 12 classes and 53 properties. Each of these is assigned a "term status" of "stable", "unstable" or "testing", corresponding to a set of (currently loosly defined) expectations about likelihood of further change. This term status vocabulary is also used at W3C by the SKOS project within the Semantic Web Deployment Working Group, and in future versions of FOAF is likely to be complimented by use of the OWL "Depracted" construct, for terms (eg. "geekcode") whose status in the spec is likely to be downplayed due to lack of adoption or frivolous nature. Discussions are in progress, facilitated by W3C's Semantic Web Coordination Group, regarding the problem of long-term persistence of the FOAF namespace, and in particular the xmlns.com domain name that it depends upon. Mechanisms being discussed including sharing of the DNS registrar password with a group of advisors, periodic "heartbeat" progress reporting to bodies such as W3C SWCG and DCMI, and offsite archival of relevant documentation.

The current version of the FOAF specification (in HTML and RDF) can be found at [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">http://xmlns.com/foaf/spec/](http://xmlns.com/foaf/spec/). At each revision, a dated snapshot is published and archived. Within each version of the specification, hypertext anchors are available for "permalinks" to each description of each FOAF term. This design allows for the vocabulary to evolve gradually, with a historical record of former documentation always being available. A full CVS version history of the files is also kept.

The remainder of this document assesses the utility of the FOAF specification with respect to the DCMI community's draft Agent requirements document.

1. Background/Discussion

<pre>There is some ambiguity with this issue. The principle question is 
whether we are trying to ‘describe’ agents or ‘identify’ them?
</pre>

Dublin Core is focussed on discovery, yet discovery is a hard concept to use for vocabulary scoping, since any property of any related object can in principle aid discovery. In particular, as noted in the Agents requirements, the identification of agents through the provision of agent descriptions can support discovery. FOAF similarly combines a concern for agent description with agent discovery. In particular, the FOAF discussions have technical design have had a strong emphasis on the need for formally grounded, flexible and pluralistic approaches to agent identification. To accomplish this, FOAF makes use of the W3C OWL language, and defines certain FOAF properties as "inverse functional" properties. For example, the foaf:homepage, foaf:mbox and foaf:isPrimaryTopicOf properties are considered "inverse functional". Technically, this means that there can be at most one thing in the world that has any given value for one of these properties. Terms such as foaf:homepage, foaf:weblog and various Instant Messager properties address the problem of identifying "modern" Web users; the foaf:mbox\_sha1sum term is a quirky but widely used mechanism for indirectly identifying people in terms of a number derrived unambiguously from the address of a mailbox they are the primary owner of. In addition, the foaf:primaryTopic property and its inverse, foaf:isPrimaryTopicOf allow for the indirect identification of agents through describing them in terms such as "the person thatis the primary topic of the document whose URI is [http://en.wikipedia.org/wiki/Isambard\_Kingdom\_Brunel](http://en.wikipedia.org/wiki/Isambard_Kingdom_Brunel)".

Using such techniques, FOAF provides an approach to identification-by-description that is (a) formally grounded, in terms of the semantics provided by OWL and RDFS (b) extensible, in that the same techniques can be used with new terms as they emerge, whether in FOAF or from other namespaces (c) pluralistic: a typical FOAF description can use any combination of identifiers and reference-by-description techniques. The FOAF identification approach is designed to be consistent with Web Architecture and allows for (but does not require) the use of URI identifiers for people and other agents. The document " [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">identifying things in FOAF](http://rdfweb.org/mt/foaflog/archives/2003/07/10/12.05.33/)" describes the approach taken in a little more detail.

The DC Agent requirements goes on to note that "Agent descriptions, therefore, serve two purposes: description and identification.", identifying the following specific purposes of identifying agents.

- disambiguate different agents who have shared or similar attributes (such as name, etc);

- recognise when agents are the same, despite appearing to be different, for example different presentations of the same name, pseudonyms, etc.;

- contact the correct agent associated with a resource;

- and collocate all the works of any specific agent.

FOAF addresses these requirements, to the extent possible given some specific dataset. Basic identity reasoning can be conducted purely by following the semantics of the OWL constructs used (inverse functional etc). Richer (and less formally guaranteed) disambiguation strategies can also be used. Two FOAF descriptions, for example, might mention each a person called "John Smith" who was born on the same day, and who works for the same corporation. FOAF allows this commonality to be expressed, yet doesn't offer any formal guarantee that the descriptions are in fact describing the same person. This is perhaps likely, probably, yet not implied by the meaning of the terms used in the description. W3C's RDF querying language, SPARQL, can be used to express matches such as these - for example finding entries in a database of people descriptions where properties such as name, birthday and workplace match.

The Agent requirements draft argues:

<pre>So the resource description/discovery community needs an agent core because the 
DC element set does not allow a sufficiently precise description of an agent to support the above functions.
</pre>

A FOAF perspective here might be slightly different; a little more "meta". Rather than there just being a core of properties for describing people when identifying people, we also need some higher-level strategies, such as the use of OWL's "inverse functional" mechanism, to allow additional properties from other parties to be acknowledged as uniquely identifying. Having said that, a lot can be done with the basic properties defined in FOAF, in particular primaryTopic can link a person to the ID of a document that is known to identify them.

#### Scope
<pre>This document aims to set out the requirements and the metadata elements needed for unambiguously describing OR
identifying the agents associated with resources. Agent descriptions may be contained within DC metadata records,
or linked to the DC metadata records for particular resources as an associated metadata description. It is not
within the scope of this document to consider the issue of where agent descriptions should be located. The
functional requirements set out in this document will form the basis for development of a core set of metadata
elements for describing agents.
</pre>

These constraints are consistent with the FOAF design. As an RDF vocabulary, FOAF descriptions can be mixed, partitioned and inter-linked quite freely.

<pre>For the purposes of this document agents are defined as persons (author, publisher, sculptor, editor, director,
etc.) or groups (organization, corporation, library, orchestra, country, federation, etc.) that have a role in the
lifecycle of a resource.
</pre>

FOAF defines a term, [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">foaf:Agent](http://xmlns.com/foaf/spec/#term_Agent) as well as a short, non-exhaustive list of sub-classes of Agent. These are:

\* [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">foaf:Person](http://xmlns.com/foaf/spec/#term_Person) \* [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">foaf:Organization](http://xmlns.com/foaf/spec/#term_Organization) \* [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">foaf:Group](http://xmlns.com/foaf/spec/#term_Group)

FOAF does not currently define detailed terms such as "sculptor". Instead, the expectation is that lists such as the [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">MARC relator terms](http://dublincore.org/usage/documents/relators/) would be used.

FOAF does define one specific relationship in this area: [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">foaf:maker](http://xmlns.com/foaf/spec/#term_maker) (and an inverse, foaf:made). The foaf:maker property relates something to a foaf:Agent that foaf:made it. The FOAF specification currently recommends that dc:creator be used only for simple string values. This recommendation should be updated as the DCAM and RDF encoding are finalised. There is an [<img src="FoafReviewBackground_files/moin-www.png" alt="[WWW]" height="11" width="11">entry](http://rdfweb.org/topic/UsingDublinCoreCreator) in the FOAF wiki on the motivation for defining foaf:maker; briefly, it was created to ensure a simple, regular construct that did not have as many deployment variations as dc:creator, to lower the burden on applications that encounter the property.

<pre>We also point out the constraints of the various data protection acts which ensure that there is only a limited
amount of data that can legally be recorded about persons. So dates and location may be problematic for living
people unless their explicit permission to include such data is obtained.
</pre>

As an RDF vocabulary (rather than e.g. an XML format), FOAF does not make mandatory the inclusion any particular information. It defines the meaning of terms, rather than the required content of documents. Consequently it can be used differently in different institutional or legal settings.

#### 3. Entities
<pre>We define two classes of agents in this document:

1. Person: an individual human being, living or dead; and

2. Group: a set, either existing or defunct, of individual entities acting collectively.
</pre>

These correspond well to foaf:Person and foaf:Group. In FOAF, a Group is a group of Agents rather than necessarily of Persons. Furthermore, a Group is itself an Agent, and can therefore be used (where appropriate) within FOAF descriptions wherever an Agent is expected. FOAF provides some technical machinery (again based on W3C OWL) for characterising the membership criteria for a Group based on their properties (defined using RDF terms). This aspect of FOAF is likely to evolve to make better use of new technology under development at W3C (eg. RIF rules, SPARQL queries, OWL 1.1).

#### Attributes
<pre>Each class of entity has associated with it a set of attributes or characteristics that serve to identify that
entity unambiguously from all other entities of either class.
</pre>

FOAF, as an RDF vocabulary, has the notion of "property" at its heart. In RDF, properties are defined in terms of the classes they make sense to be used with, ... rather than a class defining in any exhaustive or centralised way the list of properties/attributes it expects. In practical terms, we can read "attribute" in the Agent requirements as "property" in the FOAF/RDF sense with no loss of meaning.

Detailed discussion of specific attributes is in the main [FoafReview](http://dublincore.org/agentswiki/FoafReview) document.

#### Historical: DC Authorities WG charter from 1999

In 1999, DCMI had some discussions around Authorities metadata. This covered some use cases related to Agents, as well as to subject classification (eg. as treated in SKOS more recently).

A charter summary is reproduced below for the record:

##### Dublin Core Working Group on Authorities

The objectives of this Working Group are to discuss the advantages and possibilities of a special Dublin Core metadata set for persons, to settle a draft for a standard set and to prepare a proposal for application conventions. The background of this intention is the view on persons and organisations not only to have the creator role in documents but to be involved in other considerable roles, too, both concerning documents and other objects. In this view persons should be represented as separate objects with distinct relations to documents and other objects. Both the librarian data model of the Functional Requirements for Bibliographic Records and the metadata model of the INDECs project are based on this view. We think there is good reason for it as the identification and authentification of persons and corporate bodies gain more and more importance in our networked environment, not only for the management of rights. Though there is a lot of discussion in the Dublin Core community and in various other initiatives and projects a metadata description of persons as objects of the real world is still lacking and should be developed. This could contribute to provide interoperability between the libraries' authority files and the personal metadata created and needed by authors, publishers, rights managers etc.. If you are part of a project dealing with persons or if you are interested in the description of persons, corporate bodies and objects you should join this working group in the working group meeting at the DC 7 workshop.

The agenda for the working group on persons and authorities:

1. 

Overview of projects and initiatives

2. 

Discussion of problems and difficulties Drafting of necessary attributes for persons (and corporate bodies)

3. 

Drafting of Relations to other documents and objects

4. 

First draft of a Dublin Core metadata set

5. 

Presentation and discussion in the plenary session Setting up an agenda for outstanding problems and the further work (further discussion on a new discussion list?)

This working group surely has a strong connection to other Dublin Core working groups, especially to the data model group, the schema group and the DC-agents group.

The point of contact for DC Authorities was Christel Hengel

 [RefreshCache](http://dublincore.org/agentswiki/FoafReviewBackground?action=refresh&arena=Page.py&key=FoafReviewBackground.text_html) for this page (cached 2013-01-11 10:55:59)  

Immutable page (last edited 2009-01-22 17:33:56 by DanBri2)


---
title: Proposal DCAPs DanBri
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Proposal_DCAPs_DanBri.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 October 2014, at 19:18.  
This page has been accessed 26,584 times.

[Link to original (email)](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0509&L=DC-RDF-TASKFORCE&P=R2034&I=-3)

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#A_Proposal_for_Dublin_Core_Application_Profiles"><span class="tocnumber">1</span> <span class="toctext">A Proposal for Dublin Core Application Profiles</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#1._DCAM_Binding_Type"><span class="tocnumber">1.1</span> <span class="toctext">1. DCAM Binding Type</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#2._Document_Exemplars"><span class="tocnumber">1.2</span> <span class="toctext">2. Document Exemplars</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#3._Document_Instance_Syntactic_Restrictions_.28eg._DTDs.29"><span class="tocnumber">1.3</span> <span class="toctext">3. Document Instance Syntactic Restrictions (eg. DTDs)</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#4._Namespace_and_Term_Enumeration"><span class="tocnumber">1.4</span> <span class="toctext">4. Namespace and Term Enumeration</span></a></li>
            <li class="toclevel-2 tocsection-6">
              <a href="#5._Use_Case_Query_Patterns"><span class="tocnumber">1.5</span> <span class="toctext">5. Use Case Query Patterns</span></a>
              <ul>
                <li class="toclevel-3 tocsection-7"><a href="#5a._Syntactic_query_patterns"><span class="tocnumber">1.5.1</span> <span class="toctext">5a. Syntactic query patterns</span></a></li>
                <li class="toclevel-3 tocsection-8"><a href="#5b._Abstract_query_patterns"><span class="tocnumber">1.5.2</span> <span class="toctext">5b. Abstract query patterns</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# A Proposal for Dublin Core Application Profiles

Dan Brickley

Dublin Core Application Profiles are collections of descriptive patterns, community conventions and multi-vocabulary metadata structures used by members of the Dublin Core community.

A variety of descriptive techniques are available to the community in support of this, combining human oriented and mechanical approaches depending on the level of formality, precision and machine checkability appropriate. Application Profiles are grounded in real world metadata practice, user needs and local priorities. As such they typically express constraints and information needs that simultaneously extend and restrict global vocabulary standards such as those maintained by DC itself.

A DCAM community serves as a forum for ongoing documentation of these restrictions and extensions, relying on the DC Abstract Model (and associated formalisms such as RDF) to ensure that a consistent approach to description is taken by all Application Profiles. In the simplest case, a DC Application Profile characterises the shared description interests of some community of interest. This can be achieved using natural language and other human-oriented materials (eg. case studies, online discussion fora, etc).

In addition to human-centric documentation, Application Profiles can often usefully be described with various machine-readable techniques.

The applicability of such techniques will vary depending on the degree of consensus and commonality of interest in the relevant community. Such techniques can improve the multilingual accessibility of the profile's documentation, eg. by allowing human-oriented summaries to be automatically generated in a variety of natural languages. The remainder of this document outlines some technical approaches that can be used when documenting an application profile.

A DC Abstract Model

There are various machine-readable ways in which we can represent the descriptive patterns, community conventions and vocabulary-mixing scenarios relevant to some DC community of interest.

These techniques are usually grounded in tools and software via some specific binding of the Dublin Core Abstract Model, and MAY be grounded via a syntax-neutral abstract binding such as RDF's (ie. a concrete grounding that itself supports multiple DCAM-compatible notations).

## 1. DCAM Binding Type

A DCAM profile MAY restrict itself to a subset of the possible DC Abstract Model bindings.

For example, it may specify that compliant instance data be expressed using a specific named binding (such as DC-in-XHTML).

Restrictions on binding type SHOULD specify the specific version of a DCAM concrete binding.

## 2. Document Exemplars

DCAM documentation MAY include 1 or more examplar instance documents indicating typical expected usage.

Exemplar instances MUST be relative to named DCAM bindings, ie. if sample RDF/XML is shown, some version of a DC-in-RDF Abstract Model binding would be named.

Notes: Examplar document instances can be useful for user-facing documentation, since actual examples are often more accessible and understandable than schema-level abstractions.

## 3. Document Instance Syntactic Restrictions (eg. DTDs)

For DCAM bindings that specify a textual notation (typically but not always XML based), any relevant syntactic profiling mechanisms MAY be used.

For example, XML DTDs, Relax-NG or W3C XML Schemas, or Schematron schemas could all be used to express restrictions and extensions for an application profile, indicated in terms of XML-validatable rules, can be used.

Notes: The expression of syntactic restrictions in XML, although relative to a specific textual notation, provide a powerful and industrially accepted mechanism for expression information needs, shared expectations etc.

This technique can be used against RDF/XML and non-RDF XML instance formats.

For non-XML RDF formats, techniques such as W3C's GRDDL can be used to indicate transformation technques (eg. using XSLT) that can convert instances into DCAM-compatible abstractions and hence into other formats. These transformations can ensure that instance data can be converted into other DCAM bindings; however there is no known mechanism for translating syntactic-binding level constraints into their equivalent in other bindings.

RSS 1.0 is an example of a document format that has additional non-RDF syntactic constraints (XML nesting structures, required element patterns etc.). These conventions can be captured to varying degrees using various XML schema languages.

Note also that RDF-based profiles need not necessarily using DC terms in their instances data, since mappings to DC terms can be expressed within schemas using RDFS/OWL technology.

## 4. Namespace and Term Enumeration

A simple technique for indicating an Application Profile is to list the namespaces that are typically used in instance data. The profile SHOULD indicate these namespaces using URIs.

DCAPs SHOULD indicate the status of any enumerated list of namespaces, ie. whether the list is closed, open/extensible, mandatory, etc.

At a finer granularity, profiles MAY list metadata terms that are typically used in instance data. The profile SHOULD indicate these terms using URIs.

TODO: @@pointers to Schemas project etc proposals

## 5. Use Case Query Patterns

An Application Profile MAY characterise the descriptive patterns important in some community of practice by expressing use cases in terms of a query language (or other data access mechnism) for some DCAM binding.

### 5a. Syntactic query patterns

For profiles presented in terms of a concrete syntactic binding (techniques (2) and (3)), syntax-specific data matching and query languages (eg. XPath, XSLT, XQuery) MAY be used to document 1 or more common query structures. The Schematron language provides a suitable high level approach for using XPath to document metadata expectations in this way.

### 5b. Abstract query patterns

Profiles MAY document expected use cases in terms of abstract query patterns, ie. structured in terms of abtract metadata statements, properties and URIs rather than in terms of a textual binding of the DCAM.

Given the close relationship between DCAM and RDF, any RDF query language or data access formalism will be applicable to this task. W3C's SPARQL language offers particular facilities (such as datatyping and optional patterns) that make it a good choice here.

An Application Profile is not itself a collection of such queries. Rather, an Application Profile's documentation MAY be augmented with 1 or more indicative queries, provided as a way of linking application requirements, usage scenarios, user-needs with formally represented patterns of properties and metadata statements.

For example, the following query indicates a pattern for using Dublin Core, FOAF and SKOS vocabularies together for the purpose of finding the interests of colleagues of some specified Agent. Note that this is a highly task-centric pattern, and not an general abstract pattern. Profile documentation MAY present a range of indicative queries, illustrating both specific scenarios and more general vocabulary combination patterns.

(@@todo: fix SKOS stuff to be accurate!)

eg. 1: AP Use Case - "combining DC, FOAF + SKOS for locating colleague subject interests"

<pre>

 PREFIX dc: &lt;http://purl.org/dc/elements/1.1/&gt;
 PREFIX foaf: &lt;http://xmlns.com/foaf/0.1/&gt;
 PREFIX skos: &lt;http://www.w3.org/2002/skos-namespace-@@@/&gt;
 PREFIX rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt;

 SELECT ?ilabel ?iblurb ?wphp ?name

 WHERE
 {
    [ rdf:type foaf:Agent;
      foaf:name ?name;
      foaf:workplaceHomepage ?wphp;
      foaf:homepage [dc:subject [ skos:label ?ilabel; skos:scopeNote] ]
    ]
 }

</pre>

This says, in effect,

"Find us values for&nbsp;?ilabel,&nbsp;?iblurb,&nbsp;?wphp,&nbsp;?name where there is something with a name we call&nbsp;?name that is of type Agent, that has a workplace homepage that is&nbsp;?wphp, and find us SKOS labels and scopenotes for the dc:subject of that page".

Note that this:

- combines multiple vocabulary namespaces
- describes exact patterns for some (but not all!) ways in which such namespaces can be combined
- binds to the DC Abstract Model via RDF
- and hence binds to any concrete DCAM syntax
- corresponds directly to machine-usable queries, for any data that can be transformed into RDF metadata statements (eg. via GRDDL per (3) above, for non-RDF/XML notations).

The results of such a query are sets of variable-value associations, for example some results of this query above might be:

<pre>
	ilabel: Carpentry
	iblurb: Making things with wood
	name: Eric Miller
	wphp: http://www.w3.org/

	ilabel: Photography
	iblurb: Taking blurry photos
	name: Dan Brickley
	wphp: http://www.w3.org/
</pre>

...assuming a dataset in which SKOS, DC and FOAF were combined appropriately, ie. FOAF for people stuff, DC for 'subject' (we could also have asked for titles, descriptions etc of the agent's homepage), and SKOS to elaborate on the details of the subject of the homepage). (the simplistic scenario assumption here is that people are interested in the topics their homepages cover...).


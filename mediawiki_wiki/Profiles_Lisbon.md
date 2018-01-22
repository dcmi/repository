---
title: Profiles Lisbon
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Profiles_Lisbon.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 30 Apr 2013, at 11:15.  
This page has been accessed 3,693 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Application_Profiles_as_alternatives_to_OWL_ontologies"><span class="tocnumber">1</span> <span class="toctext">Application Profiles as alternatives to OWL ontologies</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#The_Dual_Requirements_of_Quality_Control_and_Mashability"><span class="tocnumber">1.1</span> <span class="toctext">The Dual Requirements of Quality Control and Mashability</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Metadata_Development"><span class="tocnumber">1.2</span> <span class="toctext">Metadata Development</span></a></li>
            <li class="toclevel-2 tocsection-4">
              <a href="#An_Example:_Publisher"><span class="tocnumber">1.3</span> <span class="toctext">An Example: Publisher</span></a>
              <ul>
                <li class="toclevel-3 tocsection-5"><a href="#Least_Ontological_Commitment"><span class="tocnumber">1.3.1</span> <span class="toctext">Least Ontological Commitment</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#A_Low_Ontological_Commitment"><span class="tocnumber">1.3.2</span> <span class="toctext">A Low Ontological Commitment</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#A_high_ontological_commitment"><span class="tocnumber">1.3.3</span> <span class="toctext">A high ontological commitment</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-8">
          <a href="#Quality_Control_and_Mashability_with_Application_Profiles"><span class="tocnumber">2</span> <span class="toctext">Quality Control and Mashability with Application Profiles</span></a>
          <ul>
            <li class="toclevel-2 tocsection-9"><a href="#Meeting_the_Quality_Control_Requirement_with_Application_Profiles"><span class="tocnumber">2.1</span> <span class="toctext">Meeting the Quality Control Requirement with Application Profiles</span></a></li>
            <li class="toclevel-2 tocsection-10"><a href="#Application_Profiles_for_Metadata_Creation"><span class="tocnumber">2.2</span> <span class="toctext">Application Profiles for Metadata Creation</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#Application_Profiles_for_Metadata_Use"><span class="tocnumber">2.3</span> <span class="toctext">Application Profiles for Metadata Use</span></a></li>
            <li class="toclevel-2 tocsection-12"><a href="#Conclusion_.28for_Session.29"><span class="tocnumber">2.4</span> <span class="toctext">Conclusion (for Session)</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Application Profiles as alternatives to OWL ontologies 

The Semantic Web ontology language [OWL](http://www.w3.org/TR/owl-features/) defines the terms of vocabularies and relationships between those terms for machine processing. The features of OWL provide machine-actionable semantics. These features are called "constraints" in the OWL documentation, but this term must be understood in the context of the Semantic Web concept of "inferencing": OWL constraints are those that can be acted on by programs called [semantic reasoners](http://en.wikipedia.org/wiki/Semantic_reasoner) that are able to infer logical consequences from data instances. OWL provides the rules for those inferences.

An Application Profile (AP), as defined in this paper, describes a metadata use case. One possible use is a set of structures and rules for the creation of a description of some thing or event. Other use cases may relate to programmed applications or to user displays. In particular, APs can define quality control requirements for either creation or use of specific sets of metadata. This function resembles the rules for validation of records in pre-Semantic Web metadata. Nothing about an AP changes the semantics of the ontological definition of the terms. In this sense, OWL and APs have separate but complementary functionality.

### The Dual Requirements of Quality Control and Mashability

There are two important requirements for data creators who intend to publish their data on the semantic web. One is to create good quality metadata that serves their primary application or immediate function for the data (the Quality Control, or QC Requirement). The other is to create data that can be mashed up with data from other sources (the Mashability Requirement).

There is a tension between these two goals. The first, Quality Control, may require constraints that resemble those imposed through a traditional record definition: cardinality, such as "required," "repeatable"; a definition of what entails a "complete description" of the metadata's focus; the ability to place actonable limits on allowed values, such as controlled lists. The second goal, Mashability, is best served with individual statements, usually as triples, that can be re-used in a broad range of contexts.

The question before us is how best to balance the need for quality control during the data creation process and the need for openness as the data is released into “the wild” on the web. Our answer is to use minimal semantic constraints when defining metadata properties (such as when using the OWL standard) and adopt Application Profiles (APs) for Quality Control.

### Metadata Development 

RDF is a language for representing information about resources on the web. OWL extends RDF to define semantic relationships such as relationships between classes (e.g. disjointness), cardinality (e.g. "exactly one"), equality, rich typing of properties, and characteristics of properties (e.g. symmetry), all of which can be acted on by programs often called "reasoners." The result is that a single statement using a property actually includes (or "entails") all of the relationships defined for that property using OWL. This can be seen as a "semantic commitment" that is true for every use of the property. Thus a simple triple may be much more than it seems on the surface. This semantic commitment is first created during the building of an ontology, and is continued by those who commit to an ontology through use of its classes or properties.

We will illustrate this with an example.

### An Example: Publisher 

Taking a simple example of the description of the publisher of a work, we can see how different vocabulary definitions affect the potential for use of a property.

#### Least Ontological Commitment 

The original Dublin Core vocabulary of 15 terms includes “dc:publisher.” In RDF representation, this term is defined as:

 [<img alt="Figure 1: dc:publisher" src="/mediawiki_wiki/images/Dcpublisher2.png" width="320" height="102">](/mediawiki_wiki/images/Dcpublisher2.png "Figure 1: dc:publisher")

The use of rdf:Resource for the domain means that anything can be the subject of a statement using dc:publisher. As the range, rdf:Resource means that the object value can also be anything. This means that the value can be either a literal or an identified resource. The following are valid statements based on this definition:

<pre>book1:

    dc:publisher “Random House”
</pre><pre>book2:

    dc:publisher <a href="http://viaf.org/viaf/153153594/" class="external free" rel="nofollow">http://viaf.org/viaf/153153594/</a>
</pre><pre>book3:
    dc:publisher "2003-04-21"
</pre>

Note that nothing about the property definition itself results in any validation of the value assigned to dc:publisher. Such validation would have to be done in the application where the data is created.

#### A Low Ontological Commitment 

The current revision of the Dublin Core terms brings the definitions more in line with RDF, and defines publisher as:

 [<img alt="Figure 2: dct:publisher" src="/mediawiki_wiki/images/Dctpublisher2.png" width="320" height="98">](/mediawiki_wiki/images/Dctpublisher2.png "Figure 2: dct:publisher")

**Figure 2: dct:publisher**

Although seemingly a minor change, the range of dct:publisher adds semantics to the usage of this property. Where dc:publisher could be expressed with any object value, dct:publisher has been defined with a range of dct:Agent. This means that reasoners will assume that the value conforms to the definition of dct:Agent. As dct:Agent is a class, and the value must be a thing that is a member of the class, an appropriate value will be in the form of a URI. Note that nothing in OWL constrains the value either to a class member or to a URI, but uses of this property that do not conform to the semantics as described may result in conflicts or contradictions when certain reasoning is applied. This means that the expected uses of dct:publisher now are:

<pre>book1:

    dct:publisher <a href="http://viaf.org/viaf/153153594/" class="external free" rel="nofollow">http://viaf.org/viaf/153153594/</a>
</pre>

or

<pre>book2:

    dct:publisher _node1

_node1:

    dct:title “Random House”
</pre>
#### A high ontological commitment 

Another example of a property that covers the same semantic area as the two Dublin Core properties for publisher is that of frbrer:P3056, which means “has publisher or distributor”:

 [<img alt="Figure 3: FRBR property P3056" src="/mediawiki_wiki/images/P3056a2.png" width="320" height="75">](/mediawiki_wiki/images/P3056a2.png "Figure 3: FRBR property P3056")

**Figure 2: FRBRer property P3056**

The range of this property is any rdf:Resource, which means that the value space is very open: values can be strings or URIs, and no assumptions will be made about what they represent by reasoner programs. The domain is frbrer:C1003, which is the FRBR Manifestation class. Anything that is true of the Manifestation class is also true for this property when reasoning is applied. In FRBR, Manifestation has a required relationship to Expression, and Expression has a required relationship to Work. These have been expressed in FRBRer in OWL as cardinality constraints.

This embeds the property P3056 in a semantic environment with possibilities for inferencing. For each statement that includes P3056, it can be inferred that there is at least one Expression even if that Expression is not immediately available or known. And for each Expression one can infer that there is one and only one Work, again with or without the existence of an actual Work in the environment.

 [<img alt="Figure 4: FRBR property P3056" src="/mediawiki_wiki/images/P3056b2.png" width="320" height="197">](/mediawiki_wiki/images/P3056b2.png "Figure 4: FRBR property P3056")

**Figure 4: FRBR property P3056 plus classes related to its domain class**

There are additional semantic commitments made in this ontology, not all of which are shown here, but one set of those commitments is the declaration of disjointness between the classes that are entailed by P3056.

 [<img alt="Figure 5: FRBR property P3056" src="/mediawiki_wiki/images/P3056c2.png" width="600" height="450">](/mediawiki_wiki/images/P3056c2.png "Figure 5: FRBR property P3056")

**Figure 5: FRBR property P3056 plus classes related to its domain class**

Any use of P3056 entails this entire set of relationships as well as others that are not shown here. Any use of this property is a commitment to the full semantics that can be inferred.

It is important to note that nothing in this semantic commitment has the effect of limiting the use of the property to "valid" statements. In other words, anyone can make any use of P3056. However, not all uses will result in the expected inferences. For example, a set of statements like:

<pre><a href="http://example.com/thing123" class="external free" rel="nofollow">http://example.com/thing123</a> -&gt; P3056 -&gt; "Random House"
<a href="http://example.com/thing123" class="external free" rel="nofollow">http://example.com/thing123</a> -&gt; P3011 -&gt; "English"
</pre>

will result in contradictions for a reasoner because the first statement entails that thing123 is a Manifestation and the second statement entails that thing123 is an Expression. Since Manifestation and Expression are disjoint, the reasoner cannot reach a semantically consistent decision about thing123.

The ontological commitment for this property is very strict, and anyone using these terms is implicitly committing to the FRBRer view of bibliographic description. At the same time, nothing in the OWL definitions actually constrains the model in the Quality Control sense of constraint. It is possible that future library systems will be designed to follow the FRBRer model precisely, and that these systems will enforce QC, perhaps even beyond that which is defined in FRBRer. But FRBRer itself does not achieve Quality Control.

Within a strictly controlled application, FRBRer has affordances for inferencing. On the open web, however, inferencing will be limited by factors that are outside of the control of the creators of the data model. In particular, because no one can be forbidden from re-using these properties, the possibility of "reasoning" in a machine-actionable way will be offset by uses of the terms that do not precisely follow the semantics of the FRBRer model. In a world where "anyone can say anything about any thing," the actual use of these properties on the open web may not allow for accurate inferencing. The Mashability of the properties in this ontology is greatly limited by their position in this complex model.

## Quality Control and Mashability with Application Profiles

As we have discussed above, the current Semantic Web standards are designed for an open data world. They allow inferencing, but do not exert any QC over the creation of the data, nor over its re-use in the linked data space except for inferencing. In this sense, QC is outside of the definition of classes and properties using RDF or OWL.

The definition of classes and properties does, however, have a distinct effect on what we are calling "Mashability," that is, the potential for re-use of terms on the open web. While strict ontological commitment does not in any way prevent anyone from re-using defined terms, any uses that are not consistent with the ontological commitment reduce the efficacy of inferencing over those terms.

The popularity of the original Dublin Core terms can be associated easily with their flexibility of use. This follows the [Principle of Least Effort](http://en.wikipedia.org/wiki/Principle_of_least_effort), which shows that broadly defined terms occur at a high frequency, both individually and in combination with other broadly defined terms, while specialized terms are used less often. The value of generality is in the easy re-usability of the terms, while the value in specificity is in precision.

Whether one designs metadata for broad re-use or for precision will depend on the purposes the metadata is intended to fulfill. Data intended for certain scientific work may need to be highly specified, and may exist only in specialized systems used for particular types of research. On the other hand, data released on the open web for linking should make use of known terms that are shared widely by linked data providers (Mashability).

In metadata development one seeks a "sweet spot" between re-usability (Mashability) and precision. This is where quality control comes in as a factor in re-usable metadata.

In the linked data space these expert metadata types will have provenance information that give assurances as to the quality of the data, although in use on the web they will be governed by the same open world assumption as any other data.

Quality control needs to be applied at the time of data creation or ingest. (Some quality control can be applied as data is exported, but I’m thinking that is also a kind of “data creation”) QC will build on the ontological definitions applied through RDF and OWL. The difference is that the RDF/OWL constraints are inherent in the data as modelled and hold true for the entire lifetime and all downstream uses of the metadata. QC takes place at the point of instance creation but does not constrain downstream use.

Metadata communities wishing to exercise quality control over their data at the time of data entry or ingest generally do so today using ad hoc constraint standards and rules managed by applications. These rules provide limitations on aspects such as cardinality, data type, and on the restriction of values to specific controlled lists of terms.

### Meeting the Quality Control Requirement with Application Profiles 

As mentioned above, the use of OWL to specify a complex of relationships within a data model does not provide Quality Control over the resulting data, and may erect a barrier to the re-usability of the property set. An alternative that facilitates both QC and Mashability is the Application Profile.

Quality Control can take place at the point of creation or use of metadata. QC is an action on the metadata and is not inherent in the data itself. In the creation phase, persons and applications that facilitate data creation need a clear set of actionable rules that are applied to the data. These rules can manage various aspects of the metadata including enforcing a definition of "completeness" of the overall description of a resource; cardinality of individual entities and properties; property ranges, even as specific as selection from pre-defined controlled lists of values. This type of QC may imitate the creation of structured records that are now commonly created as metadata.

 [<img alt="Figure 6: Title to be added" src="/mediawiki_wiki/images/P3056uncons.png" width="320" height="77">](/mediawiki_wiki/images/P3056uncons.png "Figure 6: Title to be added")

**Figure 6: Title to be added**

 [<img alt="Figure 7: Title to be added" src="/mediawiki_wiki/images/ProfileTable2.png" width="600" height="450">](/mediawiki_wiki/images/ProfileTable2.png "Figure 7: Title to be added")

**Figure 7: Title to be added**

### Application Profiles for Metadata Creation 

At the moment there is no SemWeb standard for metadata QC suitable for the point of instance creation. Nearly all (All?) data in the SEmWeb cloud today begins its life in traditional data stores and is translated to RDF for use in the SemWeb environment. This means that QC is taking place against traditional data formats. If we are to create “born semantic” data, using ontologies defined in RDF/OWL, we will need to be able to include the QC step in our data creation process. We therefore need a means to constrain and control data entry on RDF-based data.

In absence of RDF quality control mechanisms, some communities have defined overly strict ontologies that would not only provide some of the benefits of quality control for data entry but unfortunately have the consequence of constraining usage of those same metadata elements on the open Web. We propose instead that an RDF-friendly application profile structure could be applied for data creation without overly constraining open-Web use of the data.

### Application Profiles for Metadata Use 

Application profiles can be applied to data re-use as well. There is no limit to the number of application profiles that can include a particular set of data. These profiles can therefore be used to create views that represent a data application or need, even on a temporary basis. An AP can “tame” a wild dataset for a particular application or function by defining data quality characteristics that will be tested as the data is ingested.

### Conclusion (for Session) 

This session examines how the dual requirements of (data-oriented) quality control and (Web-oriented) interoperability are addressed using these two approaches. This topic is particularly timely in light of interest in RDF validation in the W3C community and of the role of community profiles in the data model of the Bibliographic Framework Transition Initiative. Validation schemas can ensure the quality of data in ways not requiring inference schemas such as OWL Ontologies.

Whether patterns are expressed using constraints on data or as constraints on a model of reality can have unintended consequences when data is consumed in the Linked Data cloud. The choice between Application Profiles and OWL Ontologies depends on how particular data is intended to be used. The session will try to achieve a common view on the strengths and weaknesses of the two approaches and identify next steps in the development of simple and practical conventions for Application Profiles.


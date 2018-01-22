---
title: Resource Collection
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Resource_Collection.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 12 May 2015, at 15:35.  
This page has been accessed 22,016 times.

[<img alt="LD4PE logo" src="/mediawiki_wiki/images/Ld4pe.png" width="100" height="99">](/mediawiki_wiki/images/Ld4pe.png) [LD4PE Task Group Homepage](/mediawiki_wiki/Pet/ld4pe)

# Resource Collection 
<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Resource_Collection"><span class="tocnumber">1</span> <span class="toctext">Resource Collection</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Resource_Database"><span class="tocnumber">1.1</span> <span class="toctext">Resource Database</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Comparison_to_Competency_Index"><span class="tocnumber">1.2</span> <span class="toctext">Comparison to Competency Index</span></a></li>
            <li class="toclevel-2 tocsection-4">
              <a href="#Summaries_of_Conversations_with_Project_Members"><span class="tocnumber">1.3</span> <span class="toctext">Summaries of Conversations with Project Members</span></a>
              <ul>
                <li class="toclevel-3 tocsection-5"><a href="#Marjorie_Hlava_and_Sean_Dolan_on_Wednesday.2C_April_15.2C_2015"><span class="tocnumber">1.3.1</span> <span class="toctext">Marjorie Hlava and Sean Dolan on Wednesday, April 15, 2015</span></a></li>
                <li class="toclevel-3 tocsection-6"><a href="#David_Clarke_and_Sean_Dolan_on_Tuesday.2C_April_21.2C_2015"><span class="tocnumber">1.3.2</span> <span class="toctext">David Clarke and Sean Dolan on Tuesday, April 21, 2015</span></a></li>
                <li class="toclevel-3 tocsection-7"><a href="#Mike_Lauruhn_and_Sean_Dolan_on_Thursday.2C_April_23.2C_2015"><span class="tocnumber">1.3.3</span> <span class="toctext">Mike Lauruhn and Sean Dolan on Thursday, April 23, 2015</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


## Resource Database 

A database has been set up to collect resources and start to organize them so that we can import into the full system when it is ready. The template is simple Dublin Core based. In the future we can make changes if other elements are found useful.

1. Where to enter the data: [http://metadataetc.org/LD4E.html](http://metadataetc.org/LD4E.html)
2. What to enter: anything you find useful. I made one big change, to let the ’Type’ vocabulary more specific for learning materials. This is the NSDL Type vocabulary, extended DCMI Type (otherwise you only have ’text’ to enter). You can find the link directly from the template, but you can also just write done a few that to be used most frequently from it. [https://wiki.ucar.edu/display/nsdldocs/Type](https://wiki.ucar.edu/display/nsdldocs/Type)
3. Where to save: In the end of the template you can find the Submit function. One of them is For storage in the database. Just save there. You can always trace back a record too. There are other view options which I will take off when I come back from China. Those view html, xml, were for student use. 
4. How to see what you have accumulated: We set up a special php to let you view the accumulated records online. I think after a while I may just download the database to make sure to keep them in a spreadsheet. You should also be able to copy the whole table and save to a spreadsheet. [http://metadataetc.org/showSavedLD4ERecords.php](http://metadataetc.org/showSavedLD4ERecords.php).

## Comparison to Competency Index 

As we discussed in our meeting last week (02/18/2015), I have been looking through those learning objects already cataloged and comparing them to the Competency Index (under development) to get a better sense of what we have so far and identify gaps (as well as possible additions). I was going to post the resulting outline and notes I created right here, but quickly discovered it would be quite difficult to preserve the format using the wiki editor, so I am posting a link instead:

[Media:LD4PE\_Annotated\_Competency\_Index.pdf](/mediawiki_wiki/files/LD4PE_Annotated_Competency_Index.pdf)

## Summaries of Conversations with Project Members 

### ***Marjorie Hlava and Sean Dolan on Wednesday, April 15, 2015*** 

Hi Everyone,

Sorry I could not talk on the call this morning. I do have some comments I would like to share and have shared these with Sean who said he would not mind my sharing his response with all of you – it is below and we did speak on the telephone this afternoon.

The competency index as currently outlined is a pretty academic approach. It depends on primarily W3C "standards” like RDF, SPARQL, and SKOS, which are not easily implement directly in industry.

SKOS was built as an attempt to crosswalk between OWL and the Z39.19 NISO standard for controlled vocabularies. SKOS is an under specified format which It needs to be tinkered with quite a lot to add synonyms (alt labels) and multiple broader terms, which are in widespread use in taxonomy applications.

In order to make industrial scale linked data implementations, which I have; one needs to use the standards and protocols underlying data implementations. SKOS does not play well with JATS, the main XML format for published data. JATS updates the NLM DTD for publishing. Without synonymy in use linking to places like dbpedia becomes a mess of overlapping conceptual bubbles. Also depending on Sparql queries is quite narrow. Only Marklogic has done this on an industry scale. In order to achieve board implementation, linked data must be able to work with other systems as well.

RDF is a nice self-specifying format, which has become associated with triple stores. To my mind it does much more than that in that it defines the format of the data included in an export with each transmittal (very handy for any data sharing). Perhaps the notion of building triple stores, which can and have been implemented in Lucene, Solr, and SQL database is should be considered in addition to Sparql. RDF has to be validated at export and import to insure it is properly validated as an XML using something like Oxygen or another validator.

The challenge for you I think maybe that in talking within a small group the syntax and semantics used focus tightly on known areas and narrows the coverage to areas of technical comfort.

I do have quite a few talks and case studies about implementing linked data; for example DBpedia, in text databases. We have implemented a large triple store using RDF for the American Institute for Physics. This one runs using the Lucene on the publishing technologies journal distribution platform using over one million triples: www.aip.org .

MarkLogic has a full week long training session on Semantic implementations using RDF and SPARQL queries which they make broadly available in 2 hour segments: [https://developer.marklogic.com/learn](https://developer.marklogic.com/learn) .

Libraries are for the most part potential consumers but not the creators of the linked data repositories. I think that going to library meetings is nice and informational and the background of the team for the most part BUT the CREATORS of this data are more likely those who will be the users of the curriculum you are developing for the LD4PE project. Going after publishers and Information Architects by giving presentations at meetings like the Charleston Conference [http://www.katina.info/conference/](http://www.katina.info/conference/) , The SSP (Society for Scholarly Publishing [http://www.sspnet.org](http://www.sspnet.org) ), ALPSP [http://www.alpsp.org/Ebusiness/TrainingAndEvents/ALPSPInternationalConference.aspx](http://www.alpsp.org/Ebusiness/TrainingAndEvents/ALPSPInternationalConference.aspx) , STM (www.stm-assoc.org) , PSP - Professional and Scholarly Publishers [http://www.pspcentral.org](http://www.pspcentral.org), ASIST IA Summit [http://www.iasummit.org](http://www.iasummit.org) and so forth would probably be quite beneficial. I would be willing to do some of those as I attend all these meetings.

* * *

I have not looked seriously at the Competency Index items as yet but a couple of thoughts occur to me:

A. Develops Policies for Creation and Management for RDF vocabularies… To me RDF is just another export format, like MARC or CSV, or XML so working on the creation and management of the actual vocabulary instead of just the export format will give a broader range of understanding and support for further implementation over time as the technology advances. There are many published best practices for working with controlled vocabularies, I can share some with Sean.

B. Apache and Tomcat are good servers but the new kid on the block is the Glassfish server. All will support the Lucene and Solr versions and triple stores. To be more modern we should include Glassfish.

I will work on this more over the next month. - Margie Hlava

* * *

_Sean Dolan responded:_

I share many of your observations about the LD4PE project, especially regarding the Competency Index being a very academic approach. I am not sure if the intense focus so far on just RDF, SPARQL, and SKOS is a result of technical comfort or the philosophy of some of the Task Group members that we need to keep the project simple in order to be able to deliver a quality final product in the two-year time frame. There seems to be some division on the issue of how broad or narrow our scope should be. From a personal standpoint, I have learned a great deal about the underlying concepts of Linked Data in my graduate studies, but have struggled so far to put my knowledge to practical use even on the small-scale projects I have attempted for my own benefit. I can only imagine how much more difficult it must be to achieve broad, industry-wide implementations. This is exactly the type of information, which I search for on the Web, and would like to see included in a collection of Linked Data learning resources. I would definitely like to have a telephone call to discuss these topics and the resources that you have dealing with practical implementations of Linked Data.

### ***David Clarke and Sean Dolan on Tuesday, April 21, 2015*** 

David expressed a willingness to produce some learning resources for the LD4PE project, but first wanted to get a handle on what type of resources we were looking for. I told him it was my opinion that ideal resources would be highly visual in nature, modular, and focused on practical implementations of Linked Data technology.

David and I discussed Synaptica products, which are used in business for vocabulary management. These products offer ways to build and manage controlled vocabularies, taxonomies, and ontologies. They have the capability to utilize Linked Data standards and formats, but David told me that many of his clients have not yet embraced Linked Data and are still using the more traditional approaches.

Next, using screen share, David walked me through Synaptica’s new product OASIS (Open Annotation Semantic Imaging System), which was quite interesting. Here is the description of what the product does from the Synaptica website (which is far more succinct than I could have put it):

_“OASIS is a Linked Data application that enables the visual features of an image to be individually identified and expressed as Linked Data URIs. These features can then be semantically indexed to internally- or externally- curated controlled vocabularies. OASIS builds up an interactive map of the visual features and the conceptual ideas contained in images”._

Of course, most of the technical aspects of OASIS are on the back end, hidden from view of the user. OASIS seems very user-friendly, especially compared to other ontology-building tools (such as the complex and somewhat intimidating Protégé from Stanford). The process of semantically indexing an image – or searching and browsing through one which has already been annotated, is done through drop-down menus. Predicates, relationships, properties, and even mapping between schemes (such as AAT, Dublin Core, Iconclass) is made simple because OASIS does technical work for the user.

As mentioned above, OASIS is a Linked Data application. What I found particularly useful was that, whereas traditionally a work of art (such as a painting) may be given an ID and (hopefully) a URI, OASIS gives URIs to each individual part of the painting. And, the parts are not just individually identified and labeled as entities (a skull, a flower, etc.) but can be semantically indexed to the concept which they represent (mortality, the fleeting nature of human existence). Also, because these relationships are stored as triples, they can be linked graphically to each other, allowing the user to search for other paintings with the same concepts within the system. It also appears to me that, because authoritative controlled vocabularies are used whenever possible to describe these concepts and relationships, there also exists the potential for the semantically annotated images to become Linked Open Data, if that is part of the user’s objective.

To me, OASIS seems like a great example of a practical implementation of Linked Data that is relevant both within the GLAM community and beyond it. What David has in mind, resource-wise, is to create four modules, each of which will be a screen-capture “tutorial” showing the user one of the various stages of the semantic annotation process. One module might cover building the ontology; another might be linking concepts to controlled vocabularies. The final module would likely be similar to what David showed me on the screen share, the end-user’s experience exploring paintings which have already been semantically enriched, discovering concepts and relationships to other paintings.

David has set a goal for himself to produce these modules by the end of June, pending the LD4PE group’s consensus that these resources sound like the type of learning objects we are looking to add to our content. I did express some concern that the modules possibly should also include some of the back-end, “behind-the-scenes”, technical aspects as well (such as the RDF triple store, the SPARQL queries that are executed on the datasets as a user visually explores an image). However, before David begins to move forward creating any modules, we would like everyone’s opinions, suggestions - any input in general- on these proposed resources.

As far as how these modules will relate to the Competency Index, I think they would fall mainly under “Creating, Publishing, and Manipulating RDF”, as well as “Implementing Applications” (a topic cluster which has not been fleshed out yet). As David walked me through OASIS, it also occurred to me that perhaps topics such as taxonomies and ontologies, hierarchies and class-property relationships, and controlled vocabularies should be represented more in the Competency Index- right now, they are only alluded to in several areas such as “Creating a new RDF vocabularies”. Since most of us on the LD4PE project have a background in Library and Information Science, we may have a tendency to take for granted that all students interested in linked data will already have this type of knowledge base (and maybe most of them do). This also goes back to a point that Marjorie Hlava raised in her email last week:

_“To me RDF is just another export format, like MARC or CSV, or XML so working on the creation and management of the actual vocabulary instead of just the export format will give a broader range of understanding and support for further implementation over time as the technology advances”._

While keeping in mind the legitimate concern of “Scope creep”- and the fact that we cannot possibly provide resources for every Library and Information Science -related topic- I think a little more representation of these topics within the Competency Index may be worth considering.

### ***Mike Lauruhn and Sean Dolan on Thursday, April 23, 2015*** 

Mike and I went through the Competency Index point by point, spending most of our time on topics and competencies which were “in the red” (in terms of my heat map) and several issues/concerns surfaced which we’d like to share.

<pre> Topic Cluster: RDF &amp; Linked Data fundamentals
</pre><pre> Topic: Policy &amp; best practice development
</pre><pre> Competency: Develops policies for creation and management of RDF vocabularies
</pre><pre> Topic: Perspectives, dispositions and habits of mind
</pre><pre> Competency: Participates in development and maintenance activities of RDF vocabularies and application profiles
</pre>

Mike suggested that the reason I may not be finding resources in the above areas is because I have been searching specifically for RDF-related resources. If we were to instead search for controlled vocabulary, taxonomy, and ontology related resources in general, Mike feels that we would find a great deal of resources (many of which he could point me to, as this is an area he has expertise in at Elsevier). I feel that this (again) echoes Marjorie Hlava’s observation (as expressed in her e-mail several weeks ago):

“To me RDF is just another export format, like MARC or CSV, or XML so working on the creation and management of the actual vocabulary instead of just the export format will give a broader range of understanding and support for further implementation over time as the technology advances”.

It should be noted that the concern here is the risk of widening the scope of the Index/project, because taxonomy is, in itself, an entire discipline/field of study. However, tying resources which deal with the CV/TAX/ONT category, in general, to these two topic statements (without actually adding any new topic or competency statements to the Index) is also an option. I think that this will probably be group's the preferred option for addressing the more "tangential" topics that come up when dealing with such a huge domain as Linked Data.

* * *

On a related note, as Mike and I discussed:

<pre> Topic: Creating a new RDF vocabularies
</pre><pre> Competency: Understands the role of RDFS and uses it in defining new RDF vocabularies
</pre><pre> Competency: Follows naming conventions in coining new terms (properties &amp; classes)
</pre><pre> Competency: Creates new terms (properties &amp; classes) following commonly agreed upon conventions and best practices
</pre>

We felt that the same concerns expressed above also applies to these areas. By searching for “general” rather than RDF-specific resources, we would be able to quickly discover a lot more. Additionally, it seems that there is a good deal of overlap between these areas and the other cluster discussed above, so perhaps the two areas could be merged. Listing them separately does not appear to serve much purpose, other than presenting the same topics in two separate contexts.

* * *

Another area which presented some questions was:

<pre> Topic: Creating and using SPARQL endpoint
</pre><pre> Competency: Creates SPARQL endpoints for RDBMS
</pre><pre> Competency: Uses SPARQL endpoints for RDBMS
</pre><pre> Competency: Demonstrates knowledge of factors influencing whether to publish RDF or provide a SPARQL endpoint
</pre>

Mainly, our concern is that this topic cluster opens up another possibility of expanding the scope of the Index/project to include topics related to the Relational Model and Databases in general. Again, tying resources which deal with these topics, in general, to these two topic statements (without actually adding any new statements to the Index) is also an option. I also brought up the issue of adding RDBMS topics to the Index on a separate call with Tom Baker and Sam Oh, with the consensus of opinion at that time being that this would significantly expand the scope of the project and would not be a good idea. The RDBMS model is also alluded to in another area of the Index:

<pre> Topic: RDF data model
</pre><pre> Competency: Understands and explains the differences and similarities between the RDF abstract data model and the XML and relational (Codd) abstract data models
</pre>

So, this gives us another opportunity to tie relevant RDBMS-related resources to the Index without expanding it. Again, I think that this will probably be group's the preferred option for addressing the more "tangential" topics that come up when dealing with such a huge domain as Linked Data.

* * *

With regard to this area of the Index:

<pre> Topic Cluster: Visualizing graphs
</pre><pre> Topic Cluster: Implementing applications

</pre>

**Question:** Should “Topic Cluster: Visualizing graphs” be nested under “Topic Cluster: Implementing applications”, instead of being separate topics?

**Point of Clarification:** Is the “graph” in “Visualizing Graphs” referring to the graph database model (RDF), or is the term used in the broader sense (An infographic, a visual presentation of data). If it is the latter, then that implies that this topic cluster would represent “Data Visualization” topics- was this the intention?

* * *

**Note:** Since speaking with Mike, I have been finding and adding more resources concerning OWL. In nearly all of the literature and resources I am now encountering, OWL is regarded as one of the three foundational technologies underlying the Semantic Web and Linked Data (the other two being the RDF data model and SPARQL). The majority of these resources also espouse the belief that OWL is a more robust, powerful option for a data modeling language than RDF Schema (which is a much simpler, more basic model). I am starting to believe that OWL may be under-represented on the Competency Index as it stands right now - suggestions to the competency index worksheet are forthcoming.


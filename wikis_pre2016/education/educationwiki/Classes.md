---
title: "- Classes"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/pages/Classes.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Classes](http://dublincore.org/educationwiki/Classes?action=fullsearch&value=Classes&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/educationwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/educationwiki/FrontPage)
- [RecentChanges](http://dublincore.org/educationwiki/RecentChanges)
- [FindPage](http://dublincore.org/educationwiki/FindPage)
- [HelpContents](http://dublincore.org/educationwiki/HelpContents)

Page

- [Edit](http://dublincore.org/educationwiki/Classes?action=edit "Edit")
- [View](http://dublincore.org/educationwiki/Classes "View")
- [Diffs](http://dublincore.org/educationwiki/Classes?action=diff "Diffs")
- [Info](http://dublincore.org/educationwiki/Classes?action=info "Info")
- [Subscribe](http://dublincore.org/educationwiki/Classes?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/educationwiki/Classes?action=raw "Raw")
- [Print](http://dublincore.org/educationwiki/Classes?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/educationwiki/Classes?action=AttachFile)
- [DSP2XML](http://dublincore.org/educationwiki/Classes?action=DSP2XML)
- [DeletePage](http://dublincore.org/educationwiki/Classes?action=DeletePage)
- [LikePages](http://dublincore.org/educationwiki/Classes?action=LikePages)
- [LocalSiteMap](http://dublincore.org/educationwiki/Classes?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/educationwiki/Classes?action=SpellCheck)

Search

<form method="POST" action="/educationwiki/Classes">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Classes_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Classes_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Education Application Profile Classes

#### Document Metadata

<table>
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong>
      </td>
      <td>
        DC-Ed Application Profile Resource Classes</td>
    </tr>
    <tr>
      <td>
        <strong>Creator:</strong>
      </td>
      <td>
        DC-Education Application Profile Task Force</td>
    </tr>
    <tr>
      <td>
        <strong>Date Created:</strong>
      </td>
      <td>
        2009-12-08</td>
    </tr>
    <tr>
      <td>
        <strong>Date Revised:</strong>
      </td>
      <td>
        --</td>
    </tr>
    <tr>
      <td>
        <strong>Document Status:</strong>
      </td>
      <td>
        Pre-discussion Draft</td>
    </tr>
    <tr>
      <td>
        <strong>Contact:</strong>
      </td>
      <td>
        Stuart A. Sutton, <a class="external" href="mailto:sasutton@UW.edu"><img src="Classes_files/moin-email.png" alt="[MAILTO]" height="10" width="14">sasutton@uw.edu</a>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Description:</strong>
      </td>
      <td>
        This is a draft discussion document proposing a set of entity classes 
        for the DC-Ed Application Profile and is not intended for use in 
        metadata or to be cited as other than "pre-discussion draft".</td>
    </tr>
  </tbody>
</table>


#### Background
The DC-Education Application Profile (DC-Ed AP) is intended to describe a precise category of "things in the world"--those things that have been deliberately purposed (or re-purposed) for use in the processes of formal and informal teaching and learning. This scoping of the DC-Ed AP was a deliberate decision of the DC-Education Community at its 2005 meeting in Madrid. 

"_At the DC-Ed meeting in Madrid in 2005, after wrestling with realities of engagement and resources, the group determined to limit the AP to those properties that related specifically to educational resources, remaining agnostic on general properties. ... The DC-Ed AP defines metadata elements for use in describing properties of resources related to the their use in teaching and learning._" [<img src="Classes_files/moin-www.png" alt="[WWW]" height="11" width="11">[1](http://docs.google.com/Doc?id=dn8z3gs_38cgwkvv)]

For purposes of this discussion of resource classes, we call that limited set of things in the world _Learning Resources_. In addition, even in describing a _Learning Resource_, the decision was made to limit the concern of the DC-Ed AP to those attributes that distinguish a _Learning Resource_ from the more general things in the world denoted as rdf:Resource--i.e., anything in the universe of discourse. As a result, the DC-Ed AP is "agnostic" concerning general descriptive attributes such as title, creator, and publisher (to name a few such attributes).

The intention is to define the resource class narrowly as comprised of resources intentionally designed with the purpose of achieving or measuring definable learning objectives for a prescribed audience. While of obvious interest, resources that _might_ be re-purposed for achieving or measuring definable learning objectives for a prescribed audience nevertheless fall outside the class _Learning Resource_. We also recognize that the _Learning Resource_ class can be extended by means of two sub-classes: (1) that sub-class of _Learning Resource_ directly and indirectly supportive of the processes of teaching and learning; and (2) that sub-class of _Learning Resources_ designed to assess and measure the outcomes of learning processes.

#### DC-Ed Resource Classes

***Therefore***, the DC-Ed Application Profile defines the following resource classes:

<table>
  <tbody>
    <tr>
      <td>
        <strong>Class</strong> </td>
      <td>
        <strong>Definition</strong>
      </td>
      <td>
        <strong>Sub-class Of</strong>
      </td>
    </tr>
    <tr>
      <td>
        <em>Learning Resource</em> </td>
      <td>
        A resource with the intentional purpose of achieving or measuring one or more defined learning goals.</td>
      <td>
        rdfs:Resource</td>
    </tr>
    <tr>
      <td>
        <em>Instructional Resource</em> </td>
      <td>
        A learning resource with the intentional purpose of instruction or training for a prescribed class of students.</td>
      <td>
        Learning Resource</td>
    </tr>
    <tr>
      <td>
        <em>Assessment Resource</em> </td>
      <td>
        A learning resource designed to observe or measure the ability of a student to perform a prescribed set of actions.</td>
      <td>
        Learning Resource</td>
    </tr>
  </tbody>
</table>

 [<img src="Classes_files/Classes.html" alt="http://www.ischool.washington.edu/sasutton/DC-Ed_AP/Classes.jpg" title="http://www.ischool.washington.edu/sasutton/DC-Ed_AP/Classes.jpg">](http://www.ischool.washington.edu/sasutton/DC-Ed_AP/Classes.jpg) 
#### Distinguishing Other Related Resource Class Definitions

The DC-Ed AP resource class definitions differ from other class definitions for the teaching and learning context. In sum, the work of the draft MLR and IEEE LOM define the resources of their concern in broad terms that equate to the semantics of rdf:Resource--i.e., anything in the universe of discourse. Specifically, the draft MLR and IEEE LOM define their descriptive domain to include any resource that can be "referenced" and "used for learning, education, or training." Since anything in the universe of discourse can be used in such contexts, the resource domains of the draft MLR and the IEEE LOM are functionally unrestricted to include resources specifically purposed for teaching and learning as well as any resource that _might_ be re-purposed for such uses.

<table>
  <tbody>
    <tr>
      <td>
        <strong>Standard</strong>
      </td>
      <td>
        <strong>Class</strong>
      </td>
      <td>
        <strong>Definition</strong>
      </td>
    </tr>
    <tr>
      <td>
        ISO MLR-2 (Draft)</td>
      <td>
        <em>Learning Resource</em>
      </td>
      <td>
        [Normative] Set of all resources that can be used for learning, education and training.</td>
    </tr>
    <tr>
      <td>
        ISO MLR-5 (Draft</td>
      <td>
        <em>Learning Resource</em>
      </td>
      <td>
        [Normative] For this standard, a learning resource is defined in terms 
        of it’s a priori and typical characteristics. A priori, a learning 
        resource is any entity that can be referenced and used for learning, 
        education and training.</td>
    </tr>
    <tr>
      <td>
        ISO MLR-5 (Draft)</td>
      <td>
        <em>Competency</em>
      </td>
      <td>
        [Normative] Observable or measurable ability of an actor to perform 
        necessary action(s) in given context(s) to achieve specific outcome(s).</td>
    </tr>
    <tr>
      <td>
        ISO-MLR-5 (Draft)</td>
      <td>
        <em>Educational Content</em>
      </td>
      <td>
        [Normative] Educational environment within which the learning and use of the learning resource takes place.</td>
    </tr>
    <tr>
      <td>
        IEEE LOM</td>
      <td>
        <em>Learning Object</em>
      </td>
      <td>
        [Normative] For this standard, a learning object is defined as any 
        entity - digital or non digital - that may be used for learning, 
        education or training.</td>
    </tr>
    <tr>
      <td>
        W3C RDF Specifications</td>
      <td>
        <em>Resource</em>
      </td>
      <td>
        [Informative] All things described by RDF are called resources, and are 
        instances of the class rdfs:Resource. This is the class of everything. 
        (synonymous with 'entity', i.e. as a generic term for anything in the 
        universe of discourse*)</td>
    </tr>
  </tbody>
</table>


##### References
[1] [<img src="Classes_files/moin-www.png" alt="[WWW]" height="11" width="11">http://docs.google.com/Doc?id=dn8z3gs\_38cgwkvv](http://docs.google.com/Doc?id=dn8z3gs_38cgwkvv) 

 [RefreshCache](http://dublincore.org/educationwiki/Classes?action=refresh&arena=Page.py&key=Classes.text_html) for this page (cached 2012-12-25 20:19:58)  

Immutable page (last edited 2009-12-16 12:59:56 by StuartSutton)


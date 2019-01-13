---
title: "- Functional Requirements"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/pages/Functional_20Requirements.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [Functional Requirements](http://dublincore.org/educationwiki/Functional_20Requirements?action=fullsearch&value=Functional+Requirements&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/educationwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/educationwiki/FrontPage)
- [RecentChanges](http://dublincore.org/educationwiki/RecentChanges)
- [FindPage](http://dublincore.org/educationwiki/FindPage)
- [HelpContents](http://dublincore.org/educationwiki/HelpContents)

Page

- [Edit](http://dublincore.org/educationwiki/Functional_20Requirements?action=edit "Edit")
- [View](http://dublincore.org/educationwiki/Functional_20Requirements "View")
- [Diffs](http://dublincore.org/educationwiki/Functional_20Requirements?action=diff "Diffs")
- [Info](http://dublincore.org/educationwiki/Functional_20Requirements?action=info "Info")
- [Subscribe](http://dublincore.org/educationwiki/Functional_20Requirements?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/educationwiki/Functional_20Requirements?action=raw "Raw")
- [Print](http://dublincore.org/educationwiki/Functional_20Requirements?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/educationwiki/Functional_20Requirements?action=AttachFile)
- [DSP2XML](http://dublincore.org/educationwiki/Functional_20Requirements?action=DSP2XML)
- [DeletePage](http://dublincore.org/educationwiki/Functional_20Requirements?action=DeletePage)
- [LikePages](http://dublincore.org/educationwiki/Functional_20Requirements?action=LikePages)
- [LocalSiteMap](http://dublincore.org/educationwiki/Functional_20Requirements?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/educationwiki/Functional_20Requirements?action=SpellCheck)

Search

<form method="POST" action="/educationwiki/Functional_20Requirements">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Functional_20Requirements_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Functional_20Requirements_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### Document Metadata

<table>
  <tbody>
    <tr>
      <td>
        <strong>Title:</strong>
      </td>
      <td>
        DC-Ed Application Profile Functional Requirements</td>
    </tr>
    <tr>
      <td>
        <strong>Creator:</strong>
      </td>
      <td>
        DC-Education Application Profile Task Force (Hillmann/Currier)</td>
    </tr>
    <tr>
      <td>
        <strong>Date Created:</strong>
      </td>
      <td>
        2009-12-27</td>
    </tr>
    <tr>
      <td>
        <strong>Date Revised:</strong>
      </td>
      <td>
        2010-01-22</td>
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
        <strong>Description:</strong>
      </td>
      <td>
        This is a draft discussion document proposing a set of functional 
        requirements for the DC-Ed Application Profile and is not intended for 
        use in metadata or to be cited as other than "pre-discussion draft".</td>
    </tr>
    <tr>
      <td>
        <strong>Contact:</strong>
      </td>
      <td>
        Sarah Currier, <a class="external" href="mailto:sarah.currier@GMAIL.COM"><img src="Functional_20Requirements_files/moin-email.png" alt="[MAILTO]" height="10" width="14">mailto:sarah.currier@GMAIL.COM</a>; Diane Hillmann, <a class="external" href="mailto:dih1@cornell.edu"><img src="Functional_20Requirements_files/moin-email.png" alt="[MAILTO]" height="10" width="14">mailto:dih1@cornell.edu</a>
      </td>
    </tr>
  </tbody>
</table>


### 1. Discussion Functional Requirements

<table>
  <tbody>
    <tr>
      <td>
        <strong>CANDIDATE FUNCTIONAL REQUIREMENT</strong>
      </td>
      <td>
        <strong>DRAFT PROPOSAL</strong>
      </td>
      <td>
        <strong>ALTERNATE DRAFT PROPOSAL</strong>
      </td>
      <td>
        <strong>DISCUSSION SUMMARY</strong>
      </td>
      <td>
        <strong>CANDIDATE PROPERTY SOLUTION</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>FR1: Resource Discovery (General)</strong>
      </td>
      <td>
        Support the <em>discovery</em> of learning resources and activities in order to help meet people's teaching and learning aims.[<a class="external" href="http://tinyurl.com/yz4jwso"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">1</a>]</td>
      <td>
        Support the <em>finding, sharing and managing</em> of learning resources and activities in order to help meet people's teaching and learning aims.[<a class="external" href="http://tinyurl.com/ygcmpoq"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">2</a>]--</td>
      <td>
        -- </td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>FR2: Curriculum Subject Areas</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities designed for 
        particular national, regional or other curriculum subject areas. [<a class="external" href="http://tinyurl.com/ygcmpoq"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">2</a>]</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        dcterms:subject (?) </td>
    </tr>
    <tr>
      <td>
        <strong>FR3: Resource Level of Difficulty</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities targeted at particular levels of difficulty. [<a class="external" href="http://tinyurl.com/ygcmpoq"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">2</a>]</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:difficulty </td>
    </tr>
    <tr>
      <td>
        <strong>FR4: Resource Pedagogical Approach</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities that follow a particular pedagogic approach.[<a class="external" href="http://tinyurl.com/ygcmpoq"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">2</a>]</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        dcterms:instructionalMethod </td>
    </tr>
    <tr>
      <td>
        <strong>FR5: Particular Audience Needs</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities targeted at 
        the needs of people with particular special educational needs.[<a class="external" href="http://tinyurl.com/ygcmpoq"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">2</a>]</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        dcterms:audience </td>
    </tr>
    <tr>
      <td>
        <strong>FR6: Particular Learning Objectives</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities designed to support achievement of specific learning objectives.</td>
      <td>
        --</td>
      <td>
        Both ad hoc and authoritatively prescribed?</td>
      <td>
        dcterms:conformsTo </td>
    </tr>
    <tr>
      <td>
        <strong>FR7: Educational level</strong>
      </td>
      <td>
        Support the discovery of learning resources and activities targeting an 
        audience in terms of its progression through an educational or training 
        context.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        dcterms:educationLevel; lom:context </td>
    </tr>
    <tr>
      <td>
        <strong>FR8: Typical Learning Time</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the 
        typical time it takes it takes to work with or through the resource.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:typicalLearningTime </td>
    </tr>
    <tr>
      <td>
        <strong>FR9: Typical Age Range</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the typical age range of the intended user of the resource. </td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:typicalAgeRange </td>
    </tr>
    <tr>
      <td>
        <strong>FR10: Interactivity Type</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the type of interactivity supported by the resource.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:interactivityType </td>
    </tr>
    <tr>
      <td>
        <strong>FR11: Interactivity Level</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the level of interactivity supported by the resource.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:interactivityLevel </td>
    </tr>
    <tr>
      <td>
        <strong>FR12: Semantic Density</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the semantic density of the resource.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        lom:semanticDensity </td>
    </tr>
    <tr>
      <td>
        <strong>FR13: Intermediary Audience</strong>
      </td>
      <td>
        Support selection of learning resources and activities based on the an agent class that mediates access to the resource.</td>
      <td>
        -- </td>
      <td>
        -- </td>
      <td>
        dcterms:mediator </td>
    </tr>
  </tbody>
</table>


[1] [<img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">http://tinyurl.com/yz4jwso](http://tinyurl.com/yz4jwso)

[2] [<img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">http://tinyurl.com/ygcmpoq](http://tinyurl.com/ygcmpoq)

### 2. Use Cases

The following discussion of Use Case Functional Requirements ("UCFR") have been derived from the [<img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">Use Cases](http://dublincore.org/educationwiki/Use_20Cases).

<table>
  <tbody>
    <tr>
      <td>
        <strong>FUNCTIONAL REQUIREMENTS</strong>
      </td>
      <td>
        <strong>NOTES</strong>
      </td>
      <td>
        <a class="external" href="http://dublincore.org/educationwiki/Use_20Cases"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">USE CASES</a>
      </td>
      <td>
        <strong>DISCUSSION SUMMARY</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR1</strong>: Re-purposing existing resource for use in education</td>
      <td>
        For instance, tagging museum resources with metadata describing 
        educational purposes / contexts it might be useful for, or has been used
        in.</td>
      <td>
        011; 017; 018; 029 </td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR2</strong>: Machine-readable AP</td>
      <td>
        For validation of metadata and vocabularies during a range of harvesting, searching and transformation processes.</td>
      <td>
        020</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR3</strong>: Part-whole relationships in content aggregations</td>
      <td>
        For finding, re-using and re-purposing components of aggregate learning objects.</td>
      <td>
        030</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR4</strong>: Metadata harvesting</td>
      <td>
        Must be able to harvest educational metadata fields, so AP needs to be a format that can be requested via OAI-PMH.</td>
      <td>
        001; 004; 007; 011; 012; 013; 014; 019; 020; 029; 040</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR5</strong>: Searchable &amp; retrievable via SRU/SRW (Search/retrieve by URI and search/retreive by web service (SOAP))</td>
      <td>
        Must be able to search educational metadata fields via SRU/SRW, and have
        full AP record (including educational fields) returned by searches.</td>
      <td>
        001; 013; 020</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR6</strong>: Interoperable /compatible with other educational metadata standards and formats</td>
      <td>
        Includes SCORM packages (which use LOM metadata at present) ; 
        compatibility with learning platforms (LMSs/VLEs usually requires a 
        SCORM or IMS Content Package, or IMS Common Cartridge , and LOM 
        metadata) ; compatibility with IEEE LOM (mixing and matching elements) </td>
      <td>
        03; 006; 013; 030; 031; 036; 041</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR7</strong>: Authority / community reputation: "who says?"</td>
      <td>
        Who says that a resource meets a particular educational achievement 
        standard? Who says the resource was easy to use within a particular
        pedagogical approach or educational context? Etc. One use 
        case required that not only is the person or institution making a 
        statement required, but their role is also required (e.g whether the 
        person making the statement is a teacher, librarian, student, etc.).</td>
      <td>
        032; 033; 041; 044; 046</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR8</strong>: Is intended for vs. Was used in</td>
      <td>
        Differentiation between statements made about the intention of a 
        resource, and metadata describing post hoc how the resource was 
        used. For instance, a resource may have been created as an online 
        module for post-graduate research methods in engineering, but has been 
        successfully re-used in an undergraduate face-to-face tutorial.</td>
      <td>
        042; 046; 047</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR9</strong>: Controlled vocabularies vs. free text and/or user tagging (folksonomies).</td>
      <td>
        For some properties, any given organisation or application may wish to 
        allow for controlled vocabularies to be defined, or for free-text 
        keywords, terms or tags to be added.</td>
      <td>
        022; 023</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR10</strong>: Classification browsing</td>
      <td>
        Browsing by structured vocabularies.</td>
      <td>
        ??</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR11</strong>: Crosswalk or mapping of vocabularies</td>
      <td>
        Particularly important where taxonomies of learning outcomes, local 
        curricula etc are used across various services wanting to allow 
        cross-searching.</td>
      <td>
        045; 047</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR12</strong>: Extensibility for discipline-specific metadata standards to be incorporated</td>
      <td>
        Music and language learning are the two examples given in use cases</td>
      <td>
        034; 037</td>
      <td>
        -- </td>
    </tr>
    <tr>
      <td>
        <strong>UCFR13</strong>: Compatibility with IMS QTI (standard for describing assessments- Question &amp; Test Interoperability)</td>
      <td>
        IMS QTI extends the LOM [<a class="external" href="http://www.imsglobal.org/question/qti_v2p0/imsqti_mdudv2p0.html"><img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">1</a>]</td>
      <td>
        ??</td>
      <td>
        -- </td>
    </tr>
  </tbody>
</table>


[1] [<img src="Functional_20Requirements_files/moin-www.png" alt="[WWW]" height="11" width="11">http://www.imsglobal.org/question/qti\_v2p0/imsqti\_mdudv2p0.html](http://www.imsglobal.org/question/qti_v2p0/imsqti_mdudv2p0.html)

 [RefreshCache](http://dublincore.org/educationwiki/Functional_20Requirements?action=refresh&arena=Page.py&key=Functional_20Requirements.text_html) for this page (cached 2012-12-21 19:31:16)  

Immutable page (last edited 2010-01-23 16:59:46 by StuartSutton)


---
title: "- DCMIIEEELTSCTaskforce/LomDCAMAnalysis"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/pages/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCMIIEEELTSCTaskforce/LomDCAMAnalysis](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=fullsearch&value=%2FLomDCAMAnalysis&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/educationwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/educationwiki/FrontPage)
- [RecentChanges](http://dublincore.org/educationwiki/RecentChanges)
- [FindPage](http://dublincore.org/educationwiki/FindPage)
- [HelpContents](http://dublincore.org/educationwiki/HelpContents)

Page

- [Up](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce "Up")
- [Edit](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=edit "Edit")
- [View](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis "View")
- [Diffs](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=diff "Diffs")
- [Info](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=info "Info")
- [Subscribe](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=raw "Raw")
- [Print](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=AttachFile)
- [DSP2XML](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=DSP2XML)
- [DeletePage](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=DeletePage)
- [LikePages](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=LikePages)
- [LocalSiteMap](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=SpellCheck)

Search

<form method="POST" action="/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Analysis of each of the LOM Elements
This document gives an initial analysis of the LOM elements and their potential mapping to DCAM. 
### Abbreviations

<table>
  <tbody>
    <tr>
      <td>
        <strong>Abbreviation</strong>
      </td>
      <td>
        <strong>Meaning</strong>
      </td>
    </tr>
    <tr>
      <td>
        VES</td>
      <td>
        Vocabulary Encoding Scheme</td>
    </tr>
    <tr>
      <td>
        SES</td>
      <td>
        Syntax Encoding Scheme</td>
    </tr>
    <tr>
      <td>
        VS</td>
      <td>
        Value String</td>
    </tr>
    <tr>
      <td>
        BN</td>
      <td>
        Blank Node, or rather: not expected to have a URI</td>
    </tr>
    <tr>
      <td>
        <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a>
      </td>
      <td>
        Natural Language String object - may be represented by strings in many languages. </td>
    </tr>
    <tr>
      <td>
        LVV</td>
      <td>
        LOM vocabularies as values. Includes coining URIs.</td>
    </tr>
    <tr>
      <td>
        LSVS</td>
      <td>
        Lom langstrings as value strings </td>
    </tr>
  </tbody>
</table>


### Analysis table

#### General category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        1 </td>
      <td>
        General </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        1.1 </td>
      <td>
        Identifier </td>
      <td>
        lom:identifier with lom:Identifier range, described in a Related Description. </td>
      <td>
        See separate table.</td>
      <td>
        P: lom:identifier <br>
        C: lom:Identifier</td>
    </tr>
    <tr>
      <td>
        1.2 </td>
      <td>
        Title </td>
      <td>
        dcterms:title with Literal value, repeatable</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        1.3 </td>
      <td>
        Language </td>
      <td>
        dcterms:language with single value string, using SES RFC3066, repeatable </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        1.4 </td>
      <td>
        Description </td>
      <td>
        dcterms:description with Literal value, repeatable (or <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a>?)</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        1.5 </td>
      <td>
        Keyword </td>
      <td>
        lom:keyword with <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a> value</td>
      <td>
      </td>
      <td>
        P: lom:keyword </td>
    </tr>
    <tr>
      <td>
        1.6 </td>
      <td>
        Coverage </td>
      <td>
        dcterms:coverage, LSVS</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        1.7 </td>
      <td>
        Structure </td>
      <td>
        lom:structure with range lom:Structure, LVV</td>
      <td>
      </td>
      <td>
        P: lom:structure <br>
        C: lom:Structure </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        1.8 </td>
      <td>
        Aggregation level</td>
      <td>
        lom:aggregationLevel with range lom:AggregationLevel, LVV</td>
      <td>
      </td>
      <td>
        P: lom:aggregationLevel <br>
        C: lom:<a class="nonexistent" href="http://dublincore.org/educationwiki/AggregationLevel">AggregationLevel</a>
      </td>
      <td>
        X</td>
    </tr>
  </tbody>
</table>


#### Lifecycle Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        2 </td>
      <td>
        Lifecycle </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        2.1 </td>
      <td>
        Version </td>
      <td>
        lom:version with range lom:Version, LSVS</td>
      <td>
      </td>
      <td>
        P: lom:version <br>
        C: lom:Version </td>
    </tr>
    <tr>
      <td>
        2.2 </td>
      <td>
        Status </td>
      <td>
        lom:status with range lom:Status, LVV</td>
      <td>
      </td>
      <td>
        P: lom:status <br>
        C: lom:Status </td>
      <td>
        X</td>
    </tr>
    <tr>
      <td>
        2.3 </td>
      <td>
        Contribute </td>
      <td>
        lom:contribute with lom:Contribute range, described in a Related Description</td>
      <td>
        See separate table.<br>
        Ordering lost </td>
      <td>
        P: lom:contribute <br>
        C: lom:Contribute </td>
    </tr>
  </tbody>
</table>


#### Metametadata Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        3 </td>
      <td>
        Metametadata </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td colspan="5">
        <strong>Sub-elements of 3.Metametadata apply to the metadata record resource, not the LO.</strong>
      </td>
    </tr>
    <tr>
      <td>
        3.1 </td>
      <td>
        Identifier </td>
      <td>
        See 1.1</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        3.2 </td>
      <td>
        Contribute </td>
      <td>
        See 2.3</td>
      <td>
        But LOM AP restricts vocabulary. <br>
        Ordering lost.</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        3.3 </td>
      <td>
        Metadata Scheme </td>
      <td>
        lom:metadataScheme with range lom:MetadataScheme, LVV</td>
      <td>
      </td>
      <td>
        P: lom:metadataScheme <br>
        C: lom:<a class="nonexistent" href="http://dublincore.org/educationwiki/MetadataScheme">MetadataScheme</a> </td>
      <td>
        X</td>
    </tr>
    <tr>
      <td>
        3.4 </td>
      <td>
        Language </td>
      <td>
        See 1.3</td>
      <td>
        Note that this expected to specify a <strong>default</strong> lang for the metadata record</td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Technical Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        4 </td>
      <td>
        Technical </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        4.1 </td>
      <td>
        Format </td>
      <td>
        dcterms:format with a single value string with the mime type, with dcterms:IMT VES</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        4.2 </td>
      <td>
        Size </td>
      <td>
        dcterms:extent with lom:Size value, size in bytes as VS, xsd:int SES</td>
      <td>
      </td>
      <td>
        C: lom:Size, subclass of dcterms:<a class="nonexistent" href="http://dublincore.org/educationwiki/SizeOrDuration">SizeOrDuration</a> </td>
    </tr>
    <tr>
      <td>
        4.3 </td>
      <td>
        Location </td>
      <td>
        lom:location with literal URI value xsd:URI SES</td>
      <td>
        Ordering lost </td>
      <td>
        P: lom:location (sub-prop of dcterms:identifier) </td>
    </tr>
    <tr>
      <td>
        4.4 </td>
      <td>
        Requirement </td>
      <td>
        lom:requirement with lom:RequirementOrComposite value </td>
      <td>
        See separate table. </td>
      <td>
        P: lom:requirement <br>
        C: lom:RequirementOrComposite </td>
    </tr>
    <tr>
      <td>
        4.5 </td>
      <td>
        Installation Remarks </td>
      <td>
        lom:installationRemarks with <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a> value</td>
      <td>
      </td>
      <td>
        P: lom:installationRemarks </td>
    </tr>
    <tr>
      <td>
        4.6 </td>
      <td>
        Other Platform Requirements </td>
      <td>
        lom:otherPlatformRequirements with <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a> value</td>
      <td>
      </td>
      <td>
        P: lom:otherPlatformRequirements </td>
    </tr>
    <tr>
      <td>
        4.7 </td>
      <td>
        Duration </td>
      <td>
        dcterms:extent with lom:Duration value. Value strings are either plain literals or using SES xsd:duration</td>
      <td>
      </td>
      <td>
        C: lom:Duration, subclass of dcterms:<a class="nonexistent" href="http://dublincore.org/educationwiki/SizeOrDuration">SizeOrDuration</a> </td>
    </tr>
  </tbody>
</table>


#### Educational Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        5 </td>
      <td>
        Educational </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
        <strong>No support for repeated category</strong> ?</td>
    </tr>
    <tr>
      <td>
        5.1 </td>
      <td>
        Interactivity Type </td>
      <td>
        lom:interactivityType with lom:InteractivityType value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:interactivityType <br>
        C: lom:InteractivityType </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.2 </td>
      <td>
        Learning Resource Type </td>
      <td>
        rdf:type, LVV </td>
      <td>
        Ordering lost. </td>
      <td>
      </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.3 </td>
      <td>
        Interactivity Level </td>
      <td>
        lom:interactivityLevel with lom:InteractivityLevel value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:interactivityLevel <br>
        C: lom:InteractivityLevel </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.4 </td>
      <td>
        Semantic Density </td>
      <td>
        lom:semanticDensity with lom:SemanticDensity value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:semanticDensity <br>
        C: lom:SemanticDensity </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.5 </td>
      <td>
        Intended End User Role </td>
      <td>
        dcterms:audience, LVV</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.6 </td>
      <td>
        Context </td>
      <td>
        lom:context with lom:Context value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:context <br>
        C: lom:!Context </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.7 </td>
      <td>
        Typical Age Range</td>
      <td>
        lom:typicalAgeRange with <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a> value, age ranges as value strings </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        5.8 </td>
      <td>
        Difficulty </td>
      <td>
        lom:difficulty with lom:Difficulty values, LVV</td>
      <td>
      </td>
      <td>
        P: lom:difficulty <br>
        C: lom:!Difficulty </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        5.9 </td>
      <td>
        Typical Learning Time</td>
      <td>
        lom:typicalLearningTime with lom:Duration values. Value strings are either plain literals or using SES xsd:duration</td>
      <td>
      </td>
      <td>
        P: lom:typicalLearningtime </td>
    </tr>
    <tr>
      <td>
        5.10 </td>
      <td>
        Description </td>
      <td>
        lom:educationalDescription with <a class="nonexistent" href="http://dublincore.org/educationwiki/LangString">LangString</a> value</td>
      <td>
      </td>
      <td>
        P: lom:educationalDescription </td>
    </tr>
    <tr>
      <td>
        5.11 </td>
      <td>
        Language </td>
      <td>
        lom:educationalLanguage with dcterms:<a class="nonexistent" href="http://dublincore.org/educationwiki/LinguisticSystem">LinguisticSystem</a> value, value uses SES RFC3066</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Rights Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        6 </td>
      <td>
        Rights </td>
      <td>
        Not represented</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        6.1 </td>
      <td>
        Cost </td>
      <td>
        lom:cost with xsd:boolean literal value</td>
      <td>
      </td>
      <td>
        P: lom:cost </td>
    </tr>
    <tr>
      <td>
        6.2 </td>
      <td>
        Copyright and Other Restrictions </td>
      <td>
        lom:copyrightAndOtherRestrictions with xsd:boolean literal value</td>
      <td>
      </td>
      <td>
        P: lom:copyrightAndOtherRestrictions </td>
    </tr>
    <tr>
      <td>
        6.3 </td>
      <td>
        Description </td>
      <td>
        dcterms:rights, LSVS</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Relation Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        7 </td>
      <td>
        Relation </td>
      <td>
        a sub-property of dcterms:relation </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        7.1 </td>
      <td>
        Kind </td>
      <td>
        the actual property used in 7.Relation </td>
      <td>
      </td>
      <td>
      </td>
      <td>
        X </td>
    </tr>
    <tr>
      <td>
        7.2 </td>
      <td>
        Resource </td>
      <td>
        the value of the property used in 7.Relation </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td colspan="5">
        <strong>Sub-elements of 7.2 are properties of the value resource.</strong>
      </td>
    </tr>
    <tr>
      <td>
        7.2.1 </td>
      <td>
        Identifier </td>
      <td>
        See 1.1</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        7.2.2 </td>
      <td>
        Description </td>
      <td>
        See 1.4</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Annotation Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        8 </td>
      <td>
        Annotation </td>
      <td>
        lom:annotation with lom:Annotation value </td>
      <td>
        See separate table </td>
      <td>
        P: lom:annotation <br>
        C:lom:Annotation </td>
    </tr>
  </tbody>
</table>


#### Classification Category

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        9 </td>
      <td>
        Classification </td>
      <td>
        lom:classification with lom:Classification value</td>
      <td>
        See separate table. </td>
      <td>
        P: lom:classification <br>
        C: lom:Classification </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Identifier

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        1.1.1 </td>
      <td>
        Catalog </td>
      <td>
        lom:catalog with literal value</td>
      <td>
      </td>
      <td>
        P: lom:catalog</td>
    </tr>
    <tr>
      <td>
        1.1.2 </td>
      <td>
        Entry </td>
      <td>
        lom:entry with literal value</td>
      <td>
      </td>
      <td>
        P: lom:entry </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Contribute

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        2.3.1 and 3.2.1 </td>
      <td>
        Role </td>
      <td>
        lom:role with lom:Role value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:Role <br>
        C: lom:Role </td>
      <td>
        X</td>
    </tr>
    <tr>
      <td>
        2.3.2 and 3.2.2 </td>
      <td>
        Entity </td>
      <td>
        lom:entity with Literal VCARD value, with lom:VCard SES</td>
      <td>
        Ordering lost</td>
      <td>
        P: lom:entity <br>
        SES: lom:VCard </td>
    </tr>
    <tr>
      <td>
        2.3.3 and 3.2. </td>
      <td>
        Date </td>
      <td>
        dcterms:date with literal dcterms:W3CDTF value or plain literals. </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:RequirementOrComposite

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        4.4.1 </td>
      <td>
        OrComposite </td>
      <td>
        lom:alternativeRequirement with lom:Requirement value </td>
      <td>
        See separate table </td>
      <td>
        P: lom:alternativeRequirement <br>
        C: lom:Requirement </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Requirement

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        4.4.1.1 </td>
      <td>
        Type </td>
      <td>
        rdf:type with class of the resource, subclass of lom:Requirement, LVV</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        X</td>
    </tr>
    <tr>
      <td>
        4.4.1.2 </td>
      <td>
        Name </td>
      <td>
        lom:technology, with lom:Technology value, LVV</td>
      <td>
        Points to a technology, not name of a technology. </td>
      <td>
        P: lom:technology <br>
        C: lom:Technology</td>
    </tr>
    <tr>
      <td>
        4.4.1.3 </td>
      <td>
        Minimum version </td>
      <td>
        lom:minimumVersion with literal version value</td>
      <td>
      </td>
      <td>
        P: lom:minimumVersion </td>
    </tr>
    <tr>
      <td>
        4.4.1.4 </td>
      <td>
        Maximum version </td>
      <td>
        lom:maximumVersion with literal version value</td>
      <td>
      </td>
      <td>
        P: lom:maximumVersion </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Annotation

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        8.1 </td>
      <td>
        Entity </td>
      <td>
        lom:entity with Literal VCARD value, with lom:VCard SES</td>
      <td>
        Ordering lost</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        8.2 </td>
      <td>
        Date </td>
      <td>
        dcterms:created with literal dcterms:W3CDTF value or plain literals.</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        8.3 </td>
      <td>
        Description </td>
      <td>
        dcterms:description with literal value</td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Classification

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        9.1 </td>
      <td>
        Purpose </td>
      <td>
        lom:purpose with lom:Purpose value, LVV</td>
      <td>
      </td>
      <td>
        P: lom:purpose <br>
        C: lom:Purpose </td>
      <td>
        X</td>
    </tr>
    <tr>
      <td>
        9.2 </td>
      <td>
        TaxonPath </td>
      <td>
        lom:taxonPath with lom:<a class="nonexistent" href="http://dublincore.org/educationwiki/TaxonPath">TaxonPath</a> value, see separate table.</td>
      <td>
      </td>
      <td>
        P: lom:taxonPath <br>
        C:lom:<a class="nonexistent" href="http://dublincore.org/educationwiki/TaxonPath">TaxonPath</a> (subclass of rdf:Seq) </td>
    </tr>
    <tr>
      <td>
        9.3 </td>
      <td>
        Description </td>
      <td>
        dcterms:description with literal value </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        9.4 </td>
      <td>
        Keyword </td>
      <td>
        Like 1.5 Keyword</td>
      <td>
        Ordering lost </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:TaxonPath

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        9.2.1 </td>
      <td>
        Source </td>
      <td>
        lom:taxonSource with literal value </td>
      <td>
      </td>
      <td>
        P: lom:taxonSource </td>
    </tr>
    <tr>
      <td>
        9.2.2 </td>
      <td>
        Taxon </td>
      <td>
        rdf:_1, rdf:_2, etc with lom:Taxon values, see separate table.</td>
      <td>
      </td>
      <td>
        C: lom:Taxon </td>
    </tr>
  </tbody>
</table>


#### Resources of class lom:Taxon

<table>
  <tbody>
    <tr>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>Label</strong> </td>
      <td>
        <strong>DCAM representation</strong>
      </td>
      <td>
        <strong>Comment</strong>
      </td>
      <td>
        <strong>Needed RDF terms</strong>
      </td>
      <td>
        <strong>Needs vocabulary?</strong> </td>
    </tr>
    <tr>
      <td>
        9.2.2.1 </td>
      <td>
        Id </td>
      <td>
        dcterms:identifier with literal value </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        9.2.2.2 </td>
      <td>
        Entry </td>
      <td>
        rdfs:label with literal value </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


 [RefreshCache](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis?action=refresh&arena=Page.py&key=DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis.text_html) for this page (cached 2013-01-02 08:18:49)  

Immutable page (last edited 2008-10-22 18:20:07 by [MikaelNilsson](http://dublincore.org/educationwiki/MikaelNilsson))


---
title: DCAM Revision Gap Analysis
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/DCAM_Revision_Gap_Analysis.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 1 February 2012, at 16:30.  
This page has been accessed 117,838 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Gap_Analysis"><span class="tocnumber">1</span> <span class="toctext">Gap Analysis</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Terminology_compared:_grouping_constructs"><span class="tocnumber">1.1</span> <span class="toctext">Terminology compared: grouping constructs</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Terminology_compared:_syntactic_slots"><span class="tocnumber">1.2</span> <span class="toctext">Terminology compared: syntactic slots</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Terminology_compared:_properties_and_classes"><span class="tocnumber">1.3</span> <span class="toctext">Terminology compared: properties and classes</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Terminology_compared:_.22semantic.22_concepts"><span class="tocnumber">1.4</span> <span class="toctext">Terminology compared: "semantic" concepts</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Gap Analysis 

### Terminology compared: grouping constructs 
<table border="1">
  <caption>
  </caption>
  <tr>
    <th> <a href="http://dublincore.org/documents/2007/06/04/abstract-model/description-set-model.jpg" class="external text" rel="nofollow">DCAM Description Set Model</a>
    </th>
    <th> <a href="http://dublincore.org/documents/dc-text" class="external text" rel="nofollow">DC-TEXT</a>
    </th>
    <th> <a href="https://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html" class="external text" rel="nofollow">RDF 1.1</a>
    </th>
    <th style="font-style:italic; color:green;"> Proposed for DCAM 2.0
    </th>
    <caption>
    </caption>
    <td> Description Set
    </td>
    <td> DescriptionSet
    </td>
    <td> <i><b>RDF named graph</b></i>
    </td>
    <td style="font-style:italic; color:green;"> DescriptionSet
    </td>
    <caption>
    </caption>
    <td> Description
    </td>
    <td> Description
    </td>
    <td> <i><b>RDF named graph</b></i>
    </td>
    <td style="font-style:italic; color:green;"> Description
    </td>
    <caption>
    </caption>
    <td> Literal Value Surrogate
    </td>
    <td style="background-color:yellow;"> <i>not explicit - expressed as a pattern</i>
    </td>
    <td style="background-color:yellow;"> <i>not explicit - a sub-graph</i>
    </td>
    <td style="font-style:italic; color:green;"> <i><b>LiteralValuePattern</b></i>
    </td>
    <caption>
    </caption>
    <td> Non-Literal Value Surrogate
    </td>
    <td style="background-color:yellow;"> <i>not explicit - expressed as a pattern</i>
    </td>
    <td style="background-color:yellow;"> <i>not explicit - a sub-graph</i>
    </td>
    <td style="font-style:italic; color:green;"> <i><b>NonLiteralValuePattern</b></i>
    </td>
    <caption>
    </caption>
    <td> Statement
    </td>
    <td> Statement
    </td>
    <td style="background-color:yellow;"> <i>no RDF equivalent - roughly similar to a subgraph of RDF statements</i>
    </td>
    <td style="background-color:yellow; font-style:italic; color:green;"> <b>StatementSet? StatementPattern?? Drop altogether???</b>
    </td>
    <caption>
    </caption>
    <td> Value Surrogate
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop as model entity</b></i> (see Note below)
    </td>
    <caption>
    </caption>
    <td> Record
    </td>
    <td style="background-color:yellow;"> <i>no DC-TEXT equivalent</i>
    </td>
    <td style="background-color:yellow;"> <i>no RDF equivalent</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop as model entity</b></i>
    </td>
  </tr>
</table>


Note: In the current DCAM, the Value Surrogate serves ***only*** to "group" the grouping constructs Non-Literal Value Surrogate and Literal Value Surrogate.

### Terminology compared: syntactic slots 
<table border="1">
  <caption>
  </caption>
  <tr>
    <th> <a href="http://dublincore.org/documents/2007/06/04/abstract-model/description-set-model.jpg" class="external text" rel="nofollow">DCAM Description Set Model</a>
    </th>
    <th> <a href="http://dublincore.org/documents/dc-text" class="external text" rel="nofollow">DC-TEXT</a>
    </th>
    <th> <a href="https://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html" class="external text" rel="nofollow">RDF 1.1</a>
    </th>
    <th style="font-style:italic; color:green;"> Proposed for DCAM 2.0
    </th>
    <caption>
    </caption>
    <td> Described Resource URI
    </td>
    <td> ResourceURI
    </td>
    <td> <i><b>Subject URI</b></i> (in an RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> <b>DescribedResourceURI</b>
    </td>
    <caption>
    </caption>
    <td style="background-color:yellow;"> <i>no formal equivalent in DCAM DSM</i>
    </td>
    <td> ResourceId
    </td>
    <td> <i><b>node identifier</b></i> (for Subject of RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> <b>DescribedResourceID</b>
    </td>
    <caption>
    </caption>
    <td> Property URI
    </td>
    <td> PropertyURI
    </td>
    <td> <i><b>Predicate URI</b></i> (in an RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> PropertyURI
    </td>
    <caption>
    </caption>
    <td> Value URI
    </td>
    <td> ValueURI
    </td>
    <td> <i><b>Object URI</b></i> (in an RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> ValueURI
    </td>
    <caption>
    </caption>
    <td style="background-color:yellow;"> <i>no formal equivalent in DCAM DSM</i>
    </td>
    <td> ValueId
    </td>
    <td> <i><b>node identifier</b></i> (for Object of RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> ValueID
    </td>
    <caption>
    </caption>
    <td> Value String (when used with Literal Value Surrogate)
    </td>
    <td> ValueString
    </td>
    <td> <i><b>RDF Literal</b></i> (when used to annotate the Object of an RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> <i><b>ValueLabel</b></i> (implies rdfs:label or <a href="http://www.w3.org/2011/rdf-wg/track/issues/27" class="external text" rel="nofollow">rdf:value</a>)
    </td>
    <caption>
    </caption>
    <td> Value String (when used with Non-Literal Value Surrogate)
    </td>
    <td> LiteralValueString
    </td>
    <td> <i><b>RDF literal</b></i> (when used directly as the Object of an RDF statement)
    </td>
    <td style="font-style:italic; color:green;"> <i><b>LiteralValue</b></i>
    </td>
    <caption>
    </caption>
    <td> Value String Language
    </td>
    <td> Language
    </td>
    <td> <i><b>Language Tag</b></i>
    </td>
    <td style="font-style:italic; color:green;"> <i><b>LanguageTag</b></i>
    </td>
    <caption>
    </caption>
    <td> Syntax Encoding Scheme URI
    </td>
    <td> SyntaxEncodingSchemeURI
    </td>
    <td> RDF Datatype URI
    </td>
    <td style="font-style:italic; color:green;"> <i><b>SyntaxEncodingSchemeURI</b></i>
    </td>
    <caption>
    </caption>
    <td> Vocabulary Encoding Scheme URI
    </td>
    <td> VocabularyEncodingSchemeURI
    </td>
    <td> <i>SKOS Concept Scheme URI??</i>
    </td>
    <td style="font-style:italic; color:green;"> <i><b>SKOSConceptSchemeURI</b></i> (implies skos:inScheme)
    </td>
    <caption>
    </caption>
    <td> Plain Value String
    </td>
    <td style="background-color:yellow;"> <i>no equivalent, just ValueString used with optional associated Language</i>
    </td>
    <td style="background-color:yellow;"> <i>Was: RDF plain literal with optional language tag (see note below)</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop as model entity</b></i>
    </td>
    <caption>
    </caption>
    <td> Typed Value String
    </td>
    <td style="background-color:yellow;"> <i>no equivalent, just ValueString used with optional SyntaxEncodingSchemeURI</i>
    </td>
    <td style="background-color:yellow;"> <i>Was: RDF typed literal with optional associated RDF datatype URI (see note below)</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop as model entity</b></i>
    </td>
  </tr>
</table>


Note: according to [RDF Working Group Issue 80](http://www.w3.org/2011/rdf-wg/track/issues/80): "The [ISSUE-12](http://www.w3.org/2011/rdf-wg/track/issues/12) and [ISSUE-71](http://www.w3.org/2011/rdf-wg/track/issues/71) resolutions, which are now implemented in the [RDF Concepts ED](http://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html), have removed the distinction between plain and typed literals from the RDF abstract syntax."

### Terminology compared: properties and classes 
<table border="1">
  <caption>
  </caption>
  <tr>
    <th> <a href="http://dublincore.org/documents/2007/06/04/abstract-model/description-set-model.jpg" class="external text" rel="nofollow">DCAM Description Set Model</a>
    </th>
    <th> <a href="http://dublincore.org/documents/dc-text" class="external text" rel="nofollow">DC-TEXT</a>
    </th>
    <th> <a href="https://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html" class="external text" rel="nofollow">RDF 1.1</a>
    </th>
    <th style="font-style:italic; color:green;"> Proposed for DCAM 2.0
    </th>
    <caption>
    </caption>
    <td> dcam:memberOf
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> skos:inScheme
    </td>
    <td style="font-style:italic; color:green;"> <i><b>skos:inScheme</b></i> (owl:equivalentProperty dcam:memberOf)
    </td>
    <caption>
    </caption>
    <td> dcam:VocabularyEncodingScheme
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> skos:ConceptScheme
    </td>
    <td style="font-style:italic; color:green;"> <i><b>skos:ConceptScheme</b></i> (owl:equivalentClass dcam:VocabularyEncodingScheme)
    </td>
    <caption>
    </caption>
    <td> rdf:value
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> <i>rdf:value is <a href="http://www.w3.org/2011/rdf-wg/track/issues/27" class="external text" rel="nofollow">being re-evaluated</a> in <a href="http://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html" class="external text" rel="nofollow">RDF 1.1</a></i>
    </td>
    <td style="font-style:italic; color:green;"> <i><b>rdfs:label</b></i>
    </td>
  </tr>
</table>

### Terminology compared: "semantic" concepts 
<table border="1">
  <caption>
  </caption>
  <tr>
    <th> <a href="http://dublincore.org/documents/2007/06/04/abstract-model/description-set-model.jpg" class="external text" rel="nofollow">DCAM Description Set Model</a>
    </th>
    <th> <a href="http://dublincore.org/documents/dc-text" class="external text" rel="nofollow">DC-TEXT</a>
    </th>
    <th> <a href="https://dvcs.w3.org/hg/rdf/raw-file/default/rdf-concepts/index.html" class="external text" rel="nofollow">RDF 1.1</a>
    </th>
    <th style="font-style:italic; color:green;"> Proposed for DCAM 2.0
    </th>
    <caption>
    </caption>
    <td> Described Resource
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> <i>RDF resource</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
    <caption>
    </caption>
    <td> Property
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> RDF Property
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
    <caption>
    </caption>
    <td> Non-literal value
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td style="background-color:yellow;"> <i>no explicit equivalent</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
    <caption>
    </caption>
    <td> Vocabulary Encoding Scheme
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> SKOS Concept Scheme??
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
    <caption>
    </caption>
    <td> Literal Value
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> <i>RDF Literal as object of statement</i>
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
    <caption>
    </caption>
    <td> Syntax Encoding Scheme
    </td>
    <td style="background-color:yellow;"> <i>no equivalent</i>
    </td>
    <td> RDF Datatype
    </td>
    <td style="background-color:orange; font-style:italic; color:green;"> <i><b>drop</b></i>
    </td>
  </tr>
</table>


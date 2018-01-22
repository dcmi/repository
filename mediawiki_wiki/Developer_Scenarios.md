---
title: Developer Scenarios
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Developer_Scenarios.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 6 January 2012, at 16:10.  
This page has been accessed 115,978 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Developer_Scenarios"><span class="tocnumber">1</span> <span class="toctext">Developer Scenarios</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Scenario:_Linking_to_Authority_Files"><span class="tocnumber">1.1</span> <span class="toctext">Scenario: Linking to Authority Files</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Scenario:_Enrichment"><span class="tocnumber">1.2</span> <span class="toctext">Scenario: Enrichment</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Scenario:_Other_copies"><span class="tocnumber">1.3</span> <span class="toctext">Scenario: Other copies</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Scenario:_Duplicates"><span class="tocnumber">1.4</span> <span class="toctext">Scenario: Duplicates</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Scenario:_Sources"><span class="tocnumber">1.5</span> <span class="toctext">Scenario: Sources</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#Scenario:_Publishers"><span class="tocnumber">1.6</span> <span class="toctext">Scenario: Publishers</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Developer Scenarios 

[Back to TG Historical Archives page](/mediawiki_wiki/DCMI/RDA_Task_Group_Historical_Archives)

## Scenario: Linking to Authority Files 

The catalog has both bibliographic records and authority records. Authority records contain valid values for particular fields. The authority records also contain additional information about the values, such as non-preferred forms of the value and instructions on usage. To integrate the non-preferred forms into the user interface, the developer must create a link between the value in the bibliographic record and the value in the authority record. This link must remain intact even if the preferred form of the value changes, and even if the metadata creator chooses to use a non-preferred form as the display form. _Karen Coyle_

## Scenario: Enrichment 

The system obtains a search result record and wishes to obtain further information from ancillary Sources to enrich the record displayed to the user. Simple (existing) case is the addition of cover art to book records, utilizing a control number. More complex case is identifying where a copy of the retrieved work may be obtained (library loan, bookseller, online download, etc.), using various bib data. The authority link case you sketched out is a close cousin here. Peter Noerr

## Scenario: Other copies 

Using various bits of the bib metadata try to discover other copies of the work at alternate locations. This is a function that comes up in federated search situations where a major part of the requirement is the "find the most available copy" function. This needs identified bib elements useful for discovery, and also some form of equivalence between the Source systems. This is regularly done now, but requires 'human intervention' and lots of maintenance in general. Peter Noerr

## Scenario: Duplicates 

Sort of the opposite of 2). Determine from the available metadata whether two records are the same object - at some bibliographic level. Obvious candidates are the (relatively) simple manifestations -> work 'duplication'. But with no link it becomes quite a difficult operation if data equivalences are not available. If you work your Latvian translation scenario backwards you get the situation here, where only the author's name is the same. Now consider that is has been transliterated into Cyrillic in a Russian version. Peter Noerr

## Scenario: Sources 

Simply discover Sources (databases, content services, OPACS, etc.) which have information about a particular topic, or in a given language, etc. This involves metadata about the Source, not the items within it (though they must, of course, be represented in aggregate by the Source) and hence is a level removed from the other scenarios. Peter Noerr

## Scenario: Publishers 

I need to link bibliographic records to the publisher information that is in the acquisitions system. This will interact with purchasing and supplies for the acquisition of new copies. _Karen Coyle_

[Back to TG Historical Archives page](/mediawiki_wiki/DCMI/RDA_Task_Group_Historical_Archives)


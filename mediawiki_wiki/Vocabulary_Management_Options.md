---
title: Vocabulary Management Options
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Vocabulary_Management_Options.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 6 December 2011, at 16:56.  
This page has been accessed 61,389 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Vocabulary_Management_Options"><span class="tocnumber">1</span> <span class="toctext">Vocabulary Management Options</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#W3C_best_practices_for_publishing_vocabularies_.28see_httpRange-14.2C_etc....29"><span class="tocnumber">1.1</span> <span class="toctext">W3C best practices for publishing vocabularies (see httpRange-14, etc...)</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Publication_of_vocabularies_in_RDFa"><span class="tocnumber">1.2</span> <span class="toctext">Publication of vocabularies in RDFa</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#DCMI_Vocabulary_Management_Tool"><span class="tocnumber">1.3</span> <span class="toctext">DCMI Vocabulary Management Tool</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Open_Metadata_Registry.28Symfony.2C_PHP.29"><span class="tocnumber">1.4</span> <span class="toctext">Open Metadata Registry(Symfony, PHP)</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#SpecGen_.28Python.29"><span class="tocnumber">1.5</span> <span class="toctext">SpecGen (Python)</span></a></li>
            <li class="toclevel-2 tocsection-7"><a href="#OntoSpec_.28SWI-Prolog.29"><span class="tocnumber">1.6</span> <span class="toctext">OntoSpec (SWI-Prolog)</span></a></li>
            <li class="toclevel-2 tocsection-8"><a href="#vocab.org_Toolchain_.28XSLT.29"><span class="tocnumber">1.7</span> <span class="toctext">vocab.org Toolchain (XSLT)</span></a></li>
            <li class="toclevel-2 tocsection-9"><a href="#Neologism_.28Drupal.2C_PHP.29"><span class="tocnumber">1.8</span> <span class="toctext">Neologism (Drupal, PHP)</span></a></li>
            <li class="toclevel-2 tocsection-10"><a href="#OWL2XHTML_.28XSLT.29"><span class="tocnumber">1.9</span> <span class="toctext">OWL2XHTML (XSLT)</span></a></li>
            <li class="toclevel-2 tocsection-11"><a href="#OWLDoc_.28HTML.29"><span class="tocnumber">1.10</span> <span class="toctext">OWLDoc (HTML)</span></a></li>
            <li class="toclevel-2 tocsection-12"><a href="#Altova_RDF_Editor"><span class="tocnumber">1.11</span> <span class="toctext">Altova RDF Editor</span></a></li>
            <li class="toclevel-2 tocsection-13"><a href="#Other_links"><span class="tocnumber">1.12</span> <span class="toctext">Other links</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Vocabulary Management Options 

See also [Vocabulary\_Management\_System\_General\_Requirements](/mediawiki_wiki/Vocabulary_Management_System_General_Requirements "Vocabulary Management System General Requirements") and [Vocabulary\_Management\_System\_Task\_Group](/mediawiki_wiki/Vocabulary_Management_System_Task_Group "Vocabulary Management System Task Group")

### W3C best practices for publishing vocabularies (see httpRange-14, etc...) 

- [http://www.w3.org/TR/swbp-vocab-pub/](http://www.w3.org/TR/swbp-vocab-pub/)
- [http://www.w3.org/TR/cooluris/](http://www.w3.org/TR/cooluris/)

### Publication of vocabularies in RDFa 

Example: FOAF specification [http://xmlns.com/foaf/spec/](http://xmlns.com/foaf/spec/) gets a 200 response code.

- RDF can be extracted from the RDFa: [http://is.gd/pEHzaF](http://is.gd/pEHzaF)
- RDF can be requested: curl --header "Accept: application/rdf+xml" [http://xmlns.com/foaf/spec/](http://xmlns.com/foaf/spec/)

### DCMI Vocabulary Management Tool 

- [http://github.com/dublincore/website](http://github.com/dublincore/website)

### Open Metadata Registry(Symfony, PHP) 

Developed by Jon Phipps at Cornell University under a National Science Foundation Grant for the (US) National Science Digital Library to provide a comprehensive RDF & XML, multi-language vocabulary management and publishing platform. Currently under active development and expansion. Being used to publish the [[RDA](http://rdvocab.info)] and IFLA vocabularies et al.

- [http://metadataregistry.org](http://metadataregistry.org)

### SpecGen (Python) 

Currently used to publish FOAF and SIOC (among others). There are many different forks/versions of SpecGen, here are the ones I've found:

- [http://svn.foaf-project.org/foaftown/specgen/](http://svn.foaf-project.org/foaftown/specgen/)
- [http://forge.morfeo-project.org/wiki\_en/index.php/SpecGen](http://forge.morfeo-project.org/wiki_enSpecGen)
- [http://sioc-project.org/specgen](http://sioc-project.org/specgen)
- [http://smiy.wordpress.com/2010/07/13/my-specgen-version-6/](http://smiy.wordpress.com/2010/07/13/my-specgen-version-6/)

### OntoSpec (SWI-Prolog) 

Developed by Yves Raimond to publish the Music and Event ontologies.

- [http://moustaki.org/ontospec/](http://moustaki.org/ontospec/)

### vocab.org Toolchain (XSLT) 

Created by Ian Davis for the vocab.org vocabularies (relationship, frbr, etc...)

- [http://vocab.org/2004/03/toolchain/](http://vocab.org/2004/03/toolchain/)

### Neologism (Drupal, PHP) 

Developed by DERI and claims to be a more "out-of-the-box" solution. Based on the Drupal content management framework.

- [http://neologism.deri.ie/](http://neologism.deri.ie/)

### OWL2XHTML (XSLT) 

Developed by Martin Hepp et al. for the GoodRelations ontology.

- [http://www.ebusiness-unibw.org/projects/owl2xhtml/](http://www.ebusiness-unibw.org/projects/owl2xhtml/)

### OWLDoc (HTML) 

A plugin for Protege, OWLDoc renders documentation for ontologies in HTML.

- [http://www.co-ode.org/downloads/owldoc/](http://www.co-ode.org/downloads/owldoc/)
- [http://protege.stanford.edu/](http://protege.stanford.edu/)

### Altova RDF Editor 

"Edit RDF instances visually". "Altova SemanticWorks® 2012 provides powerful support for designing and editing RDF and RDFS documents to implement Semantic Web applications in an intuitive, visual manner."

- [http://www.altova.com/semanticworks/rdf-editor.html](http://www.altova.com/semanticworks/rdf-editor.html)

### Other links 

[Imma Subirats](http://code.google.com/p/dspace-agrisap/wiki/ThesaurusAddOn) requirements for a DSpace plugin for thesauri


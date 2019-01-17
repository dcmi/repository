---
title: Creating Metadata
date: 2017-09-01
description: 
draft: false
creators: []
contributors:
- stefanie_ruhle
- thomas_baker
- pete_johnston
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/User_Guide/Creating_Metadata.html"
notes: 
annotation: 
---

Contributors: Stefanie Rühle, Tom Baker and Pete Johnston

Go to [Publishing Metadata](/resources/userguide/publishing_metadata/)


<table id="toc" class="toc"><tr><td>
<div id="toctitle"><h2>Contents</h2></div>
<ul>
<li class="toclevel-1 tocsection-1"><a href="#About_the_examples"><span class="tocnumber">1</span> <span class="toctext">About the examples</span></a></li>
<li class="toclevel-1 tocsection-2">
<a href="#Titles"><span class="tocnumber">2</span> <span class="toctext">Titles</span></a>
<ul>
<li class="toclevel-2 tocsection-3"><a href="#Title"><span class="tocnumber">2.1</span> <span class="toctext">Title</span></a></li>
<li class="toclevel-2 tocsection-4"><a href="#Alternative"><span class="tocnumber">2.2</span> <span class="toctext">Alternative</span></a></li>
<li class="toclevel-2 tocsection-5"><a href="#Guidelines_for_the_creation_of_title_content"><span class="tocnumber">2.3</span> <span class="toctext">Guidelines for the creation of title content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-6">
<a href="#Relationships_between_Resource_and_Agents"><span class="tocnumber">3</span> <span class="toctext">Relationships between Resource and Agents</span></a>
<ul>
<li class="toclevel-2 tocsection-7"><a href="#Using_agent_properties_in_Dublin_Core"><span class="tocnumber">3.1</span> <span class="toctext">Using agent properties in Dublin Core</span></a></li>
<li class="toclevel-2 tocsection-8"><a href="#Contributor"><span class="tocnumber">3.2</span> <span class="toctext">Contributor</span></a></li>
<li class="toclevel-2 tocsection-9"><a href="#Creator"><span class="tocnumber">3.3</span> <span class="toctext">Creator</span></a></li>
<li class="toclevel-2 tocsection-10"><a href="#Publisher"><span class="tocnumber">3.4</span> <span class="toctext">Publisher</span></a></li>
<li class="toclevel-2 tocsection-11"><a href="#RightsHolder"><span class="tocnumber">3.5</span> <span class="toctext">RightsHolder</span></a></li>
<li class="toclevel-2 tocsection-12"><a href="#Guidelines_for_the_creation_of_content_for_agents"><span class="tocnumber">3.6</span> <span class="toctext">Guidelines for the creation of content for agents</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-13">
<a href="#Type"><span class="tocnumber">4</span> <span class="toctext">Type</span></a>
<ul>
<li class="toclevel-2 tocsection-14"><a href="#Guidelines_for_the_creation_of_type_content"><span class="tocnumber">4.1</span> <span class="toctext">Guidelines for the creation of type content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-15">
<a href="#Format"><span class="tocnumber">5</span> <span class="toctext">Format</span></a>
<ul>
<li class="toclevel-2 tocsection-16"><a href="#Guidelines_for_the_creation_of_format_content"><span class="tocnumber">5.1</span> <span class="toctext">Guidelines for the creation of format content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-17">
<a href="#Extent"><span class="tocnumber">6</span> <span class="toctext">Extent</span></a>
<ul>
<li class="toclevel-2 tocsection-18"><a href="#Guidelines_for_the_creation_of_extent_content"><span class="tocnumber">6.1</span> <span class="toctext">Guidelines for the creation of extent content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-19">
<a href="#Medium"><span class="tocnumber">7</span> <span class="toctext">Medium</span></a>
<ul>
<li class="toclevel-2 tocsection-20"><a href="#Guidelines_for_the_creation_of_medium_content"><span class="tocnumber">7.1</span> <span class="toctext">Guidelines for the creation of medium content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-21">
<a href="#Language"><span class="tocnumber">8</span> <span class="toctext">Language</span></a>
<ul>
<li class="toclevel-2 tocsection-22"><a href="#Guidelines_for_the_creation_of_language_content"><span class="tocnumber">8.1</span> <span class="toctext">Guidelines for the creation of language content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-23">
<a href="#Identifiers"><span class="tocnumber">9</span> <span class="toctext">Identifiers</span></a>
<ul>
<li class="toclevel-2 tocsection-24"><a href="#Identifier"><span class="tocnumber">9.1</span> <span class="toctext">Identifier</span></a></li>
<li class="toclevel-2 tocsection-25"><a href="#BibliographicCitation"><span class="tocnumber">9.2</span> <span class="toctext">BibliographicCitation</span></a></li>
<li class="toclevel-2 tocsection-26"><a href="#Guidelines_for_the_creation_of_identifier_content"><span class="tocnumber">9.3</span> <span class="toctext">Guidelines for the creation of identifier content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-27">
<a href="#Descriptions"><span class="tocnumber">10</span> <span class="toctext">Descriptions</span></a>
<ul>
<li class="toclevel-2 tocsection-28"><a href="#Description"><span class="tocnumber">10.1</span> <span class="toctext">Description</span></a></li>
<li class="toclevel-2 tocsection-29"><a href="#Abstract"><span class="tocnumber">10.2</span> <span class="toctext">Abstract</span></a></li>
<li class="toclevel-2 tocsection-30"><a href="#TableOfContent"><span class="tocnumber">10.3</span> <span class="toctext">TableOfContent</span></a></li>
<li class="toclevel-2 tocsection-31"><a href="#Guidelines_for_the_creation_of_descriptions"><span class="tocnumber">10.4</span> <span class="toctext">Guidelines for the creation of descriptions</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-32">
<a href="#Subject"><span class="tocnumber">11</span> <span class="toctext">Subject</span></a>
<ul>
<li class="toclevel-2 tocsection-33"><a href="#Guidelines_for_describing_the_subject_of_a_resource"><span class="tocnumber">11.1</span> <span class="toctext">Guidelines for describing the subject of a resource</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-34">
<a href="#Coverage"><span class="tocnumber">12</span> <span class="toctext">Coverage</span></a>
<ul>
<li class="toclevel-2 tocsection-35"><a href="#Coverage_2"><span class="tocnumber">12.1</span> <span class="toctext">Coverage</span></a></li>
<li class="toclevel-2 tocsection-36"><a href="#Temporal"><span class="tocnumber">12.2</span> <span class="toctext">Temporal</span></a></li>
<li class="toclevel-2 tocsection-37"><a href="#Spatial"><span class="tocnumber">12.3</span> <span class="toctext">Spatial</span></a></li>
<li class="toclevel-2 tocsection-38"><a href="#Guidelines_for_describing_the_coverage.2C_spatial_or_temporal_character_of_a_resource"><span class="tocnumber">12.4</span> <span class="toctext">Guidelines for describing the coverage, spatial or temporal character of a resource</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-39">
<a href="#Dates"><span class="tocnumber">13</span> <span class="toctext">Dates</span></a>
<ul>
<li class="toclevel-2 tocsection-40"><a href="#Date"><span class="tocnumber">13.1</span> <span class="toctext">Date</span></a></li>
<li class="toclevel-2 tocsection-41"><a href="#Created"><span class="tocnumber">13.2</span> <span class="toctext">Created</span></a></li>
<li class="toclevel-2 tocsection-42"><a href="#Issued"><span class="tocnumber">13.3</span> <span class="toctext">Issued</span></a></li>
<li class="toclevel-2 tocsection-43"><a href="#Available"><span class="tocnumber">13.4</span> <span class="toctext">Available</span></a></li>
<li class="toclevel-2 tocsection-44"><a href="#Modified"><span class="tocnumber">13.5</span> <span class="toctext">Modified</span></a></li>
<li class="toclevel-2 tocsection-45"><a href="#Valid"><span class="tocnumber">13.6</span> <span class="toctext">Valid</span></a></li>
<li class="toclevel-2 tocsection-46"><a href="#DateCopyrighted"><span class="tocnumber">13.7</span> <span class="toctext">DateCopyrighted</span></a></li>
<li class="toclevel-2 tocsection-47"><a href="#DateSubmitted"><span class="tocnumber">13.8</span> <span class="toctext">DateSubmitted</span></a></li>
<li class="toclevel-2 tocsection-48"><a href="#DateAccepted"><span class="tocnumber">13.9</span> <span class="toctext">DateAccepted</span></a></li>
<li class="toclevel-2 tocsection-49"><a href="#Guidelines_for_the_creation_of_content_for_dates"><span class="tocnumber">13.10</span> <span class="toctext">Guidelines for the creation of content for dates</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-50">
<a href="#Source_and_Relations"><span class="tocnumber">14</span> <span class="toctext">Source and Relations</span></a>
<ul>
<li class="toclevel-2 tocsection-51"><a href="#Relation"><span class="tocnumber">14.1</span> <span class="toctext">Relation</span></a></li>
<li class="toclevel-2 tocsection-52"><a href="#Source"><span class="tocnumber">14.2</span> <span class="toctext">Source</span></a></li>
<li class="toclevel-2 tocsection-53"><a href="#IsPartOf"><span class="tocnumber">14.3</span> <span class="toctext">IsPartOf</span></a></li>
<li class="toclevel-2 tocsection-54"><a href="#HasPart"><span class="tocnumber">14.4</span> <span class="toctext">HasPart</span></a></li>
<li class="toclevel-2 tocsection-55"><a href="#IsVersionOf"><span class="tocnumber">14.5</span> <span class="toctext">IsVersionOf</span></a></li>
<li class="toclevel-2 tocsection-56"><a href="#HasVersion"><span class="tocnumber">14.6</span> <span class="toctext">HasVersion</span></a></li>
<li class="toclevel-2 tocsection-57"><a href="#IsFormatOf"><span class="tocnumber">14.7</span> <span class="toctext">IsFormatOf</span></a></li>
<li class="toclevel-2 tocsection-58"><a href="#HasFormat"><span class="tocnumber">14.8</span> <span class="toctext">HasFormat</span></a></li>
<li class="toclevel-2 tocsection-59"><a href="#Replaces"><span class="tocnumber">14.9</span> <span class="toctext">Replaces</span></a></li>
<li class="toclevel-2 tocsection-60"><a href="#IsReplacedBy"><span class="tocnumber">14.10</span> <span class="toctext">IsReplacedBy</span></a></li>
<li class="toclevel-2 tocsection-61"><a href="#Requires"><span class="tocnumber">14.11</span> <span class="toctext">Requires</span></a></li>
<li class="toclevel-2 tocsection-62"><a href="#IsRequiredBy"><span class="tocnumber">14.12</span> <span class="toctext">IsRequiredBy</span></a></li>
<li class="toclevel-2 tocsection-63"><a href="#References"><span class="tocnumber">14.13</span> <span class="toctext">References</span></a></li>
<li class="toclevel-2 tocsection-64"><a href="#IsReferencedBy"><span class="tocnumber">14.14</span> <span class="toctext">IsReferencedBy</span></a></li>
<li class="toclevel-2 tocsection-65"><a href="#ConformsTo"><span class="tocnumber">14.15</span> <span class="toctext">ConformsTo</span></a></li>
<li class="toclevel-2 tocsection-66"><a href="#Guidelines_for_the_creation_of_content_for_relations_and_source"><span class="tocnumber">14.16</span> <span class="toctext">Guidelines for the creation of content for relations and source</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-67">
<a href="#Rights"><span class="tocnumber">15</span> <span class="toctext">Rights</span></a>
<ul>
<li class="toclevel-2 tocsection-68"><a href="#Rights_2"><span class="tocnumber">15.1</span> <span class="toctext">Rights</span></a></li>
<li class="toclevel-2 tocsection-69"><a href="#AccessRights"><span class="tocnumber">15.2</span> <span class="toctext">AccessRights</span></a></li>
<li class="toclevel-2 tocsection-70"><a href="#License"><span class="tocnumber">15.3</span> <span class="toctext">License</span></a></li>
<li class="toclevel-2 tocsection-71"><a href="#Guidelines_for_the_creation_of_rights_content"><span class="tocnumber">15.4</span> <span class="toctext">Guidelines for the creation of rights content</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-72">
<a href="#Special_properties_for_the_description_of_education_material"><span class="tocnumber">16</span> <span class="toctext">Special properties for the description of education material</span></a>
<ul>
<li class="toclevel-2 tocsection-73"><a href="#Audience"><span class="tocnumber">16.1</span> <span class="toctext">Audience</span></a></li>
<li class="toclevel-2 tocsection-74"><a href="#Mediator"><span class="tocnumber">16.2</span> <span class="toctext">Mediator</span></a></li>
<li class="toclevel-2 tocsection-75"><a href="#EducationLevel"><span class="tocnumber">16.3</span> <span class="toctext">EducationLevel</span></a></li>
<li class="toclevel-2 tocsection-76"><a href="#InsctructionalMethod"><span class="tocnumber">16.4</span> <span class="toctext">InsctructionalMethod</span></a></li>
<li class="toclevel-2 tocsection-77"><a href="#Guidelines_for_the_creation_of_content_for_properties_describing_education_material"><span class="tocnumber">16.5</span> <span class="toctext">Guidelines for the creation of content for properties describing education material</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-78">
<a href="#Special_properties_for_the_description_of_collections"><span class="tocnumber">17</span> <span class="toctext">Special properties for the description of collections</span></a>
<ul>
<li class="toclevel-2 tocsection-79"><a href="#AccrualMethod"><span class="tocnumber">17.1</span> <span class="toctext">AccrualMethod</span></a></li>
<li class="toclevel-2 tocsection-80"><a href="#AccrualPeriodicity"><span class="tocnumber">17.2</span> <span class="toctext">AccrualPeriodicity</span></a></li>
<li class="toclevel-2 tocsection-81"><a href="#AccrualPolicy"><span class="tocnumber">17.3</span> <span class="toctext">AccrualPolicy</span></a></li>
<li class="toclevel-2 tocsection-82"><a href="#Guidelines_for_the_creation_of_content_for_properties_describing_collections"><span class="tocnumber">17.4</span> <span class="toctext">Guidelines for the creation of content for properties describing collections</span></a></li>
</ul>
</li>
<li class="toclevel-1 tocsection-83">
<a href="#Provenance"><span class="tocnumber">18</span> <span class="toctext">Provenance</span></a>
<ul>
<li class="toclevel-2 tocsection-84"><a href="#Guidelines_for_the_creation_of_content_for_provenance"><span class="tocnumber">18.1</span> <span class="toctext">Guidelines for the creation of content for provenance</span></a></li>
</ul>
</li>
</ul>
</td></tr></table>
<p><br>
</p>
<p><b>How to create content for DCMI Metadata</b>
</p>
<p><br>
</p>
<h1> <span class="mw-headline" id="About_the_examples"> About the examples </span>
</h1>
<p>We are presenting the examples in tables. To interpret these tables please consider that:
</p>
<ul>
<li> <b>yellow rows</b> are standing for statements describing a resource,
</li>
<li> <b>white rows</b> are standing for statements describing a resource that is the value of another statement but is not described by another record,
</li>
<li> <b>bold</b> strings are standing for properties,
</li>
<li> <b>italicized</b> strings are standing for values,
</li>
<li> <b>red strings</b> are standing for values linking to records.
</li>
</ul>
<p>example (see turtle explanation)
</p>
<h1> <span class="mw-headline" id="Titles"> Titles </span>
</h1>
<h2> <span class="mw-headline" id="Title"> <a href="/specifications/dublin-core/dcmi-terms/#terms-title" class="external text" rel="nofollow">Title</a> </span>
</h2>
<p>Title is a property that refers to the name or names by which a resource is formally known.
</p>
<h2> <span class="mw-headline" id="Alternative"> <a href="/specifications/dublin-core/dcmi-terms/#terms-alternative" class="external text" rel="nofollow">Alternative</a> </span>
</h2>
<p>Alternative is a property that refers to a name or names of a resource used as a substitute or alternative to the formal title. These are secondary titles, abbreviations, translations of a title, etc.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_title_content"> Guidelines for the creation of title content </span>
</h2>
<p>For the title use the name given to the resource.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Alvar Aalto Chair No. 66</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>In most databases title is one of the main criteria to identify search results. So <b>if there is no formal title resp. name</b> you should formulate an adequate one by yourself.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Data from a survey about the usage of metadata</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit6" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If there is <b>more than one title resp. name</b> you should repeat the title property
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Autumn Leaves</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The Dead Leaves</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or use the alternative property. 
</p>
<p>Typically alternative is used for <b>secondary titles</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Passion for Pulses</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative</b>
</td>
<td> <i>A Feast of Beans, Peas and Lentils from Around the World</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exAlt1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or for <b>abbreviations</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>American Meteorological Association Newsletter</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative</b>
</td>
<td> <i>AMA Newsletter</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exAlt2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If the title resp. name is expressed in <b>different languages</b> you should use language tags.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>La Joconde</i>
</td>
<td> fre
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Mona Lisa</i>
</td>
<td> eng
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>La Gioconda</i>
</td>
<td> ita
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>the same is true for alternative
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>EU Stability Programm of Belgium</i>
</td>
<td> eng
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative</b>
</td>
<td> <i>Council Opinion on the Updated Stability Programm of Belgium 2009 - 2010</i>
</td>
<td> eng
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative</b>
</td>
<td> <i>Stellungnahme des Rates zum aktualisierten Stabilitätsprogramm Belgiens für 2009 - 2012</i>
</td>
<td> ger
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exAlt3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>It is recommended to describe titles with plain text (as done in the examples above). But sometimes it is necessary to <b>create a relationship between the described resource and a more detailed title description</b>. 
</p>
<p>This should be used to refer to <b>a title with different transliterations</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>in greek</b>
</td>
<td> <i>Οιδίπους Τύραννος</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>in latin</b>
</td>
<td> <i>Oidipous Tyrannos</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or to refer to a <b>title authority</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Nibelungenlied Handschrift B</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i><a href="/index.php?title=Nibelungenlied&amp;action=edit&amp;redlink=1" class="new" title="Nibelungenlied (page does not exist)">nibelungenlied</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Nibelungenlied Handschrift C</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i><a href="/index.php?title=Nibelungenlied&amp;action=edit&amp;redlink=1" class="new" title="Nibelungenlied (page does not exist)">nibelungenlied</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="/index.php?title=Nibelungenlied&amp;action=edit&amp;redlink=1" class="new" title="Nibelungenlied (page does not exist)">nibelungenlied</a></i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>Der Nibelunge Not</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative label</b>
</td>
<td> <i>Nibelungenlied</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative label</b>
</td>
<td> <i>Nibelungenklage</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative label</b>
</td>
<td> <i>Nibelungensage</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i>The Nibelungenlied exists of 39 aventiuren created between 1180 and 1210</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTit2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Relationships_between_Resource_and_Agents"> Relationships between Resource and Agents </span>
</h1>
<h2> <span class="mw-headline" id="Using_agent_properties_in_Dublin_Core"> Using agent properties in Dublin Core</span>
</h2>
<p>Persons, organizations and services can relate to resources in various ways. DCMI defined only a few common properties to describe the relationship between resources and agents. So when necessary other vocabularies should be used describing these relationships more detailed. In these cases we recommend to use the <a href="http://id.loc.gov/vocabulary/relators.html" class="external text" rel="nofollow">marcrelator codes</a>. How to use them is described in 
</p>
<ul>
<li> <a href="http://dublincore.org/usage/documents/relators/" class="external text" rel="nofollow">MARC Relator terms and Dublin Core</a> 
</li>
<li> <a href="http://www.ukoln.ac.uk/metadata/dcmi/marcrel-ex/" class="external text" rel="nofollow">MARC Relator properties in Dublin Core metadata</a>
</li>
</ul>
<h2> <span class="mw-headline" id="Contributor"> <a href="/specifications/dublin-core/dcmi-terms/#terms-contributor" class="external text" rel="nofollow">Contributor</a> </span>
</h2>
<p>The contributor property represents a relationship between the resource and a person, an organization, or a service making a contribution to a resource.
</p>
<h2> <span class="mw-headline" id="Creator"> <a href="/specifications/dublin-core/dcmi-terms/#terms-creator" class="external text" rel="nofollow">Creator</a> </span>
</h2>
<p>The creator property represents a relationship between the resource and a person, an organization, or a service primarily responsible for making the content of a resource.
</p>
<h2> <span class="mw-headline" id="Publisher"> <a href="/specifications/dublin-core/dcmi-terms/#terms-publisher" class="external text" rel="nofollow">Publisher</a> </span>
</h2>
<p>The publisher property represents a relationship between the resource and a person, an organization, or a service responsible for making the resource available and provide access to the resource.
</p>
<h2> <span class="mw-headline" id="RightsHolder"> <a href="/specifications/dublin-core/dcmi-terms/#terms-rightsHolder" class="external text" rel="nofollow">RightsHolder</a> </span>
</h2>
<p>This property represents a relationship between the resource and a person or an organization owning or managing rights over this resource.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_agents"> Guidelines for the creation of content for agents </span>
</h2>
<p>If you know there is a <b>URI standing for a person or organization</b> you should use it. For further information you should handle the person or organization like another resource.
</p>
<p>Example with an <b>organization</b>: 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>rights holder</b>
</td>
<td> gnd
</td>
<td> <i>39454-3</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>name</b>
</td>
<td> <i>Bundesarchiv Koblenz</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>homepage</b>
</td>
<td> <i><a href="http://www.bundesarchiv.de/index.html.de" class="external free" rel="nofollow">http://www.bundesarchiv.de/index.html.de</a></i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exrih1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Example with a <b>person</b>:
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>contributor</b>
</td>
<td> gnd
</td>
<td> <i>135066719</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>family name</b>
</td>
<td> <i>Elliott</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>given name</b>
</td>
<td> <i>Missy</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>nick name</b>
</td>
<td> <i>Missy E </i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCon1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Regardless of the existence of a URI <b>personal names</b> should be grouped in family name resp. surname as one part of the name and forename resp. given name as the other part . 
</p>
<p>You should handle the person name like <b>another resource</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>creator</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>family name</b>
</td>
<td> <i>Shakespeare</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>given name</b>
</td>
<td> <i>William</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCre1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or you could devide these names <b>by comma</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>creator</b>
</td>
<td> <i>Shakespeare, William</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCre2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>When you <b>in doubt about family name and given name</b> give the name as it appears.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>contributor</b>
</td>
<td> <i>Snoop Dogg</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCon2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If there is <b>more than one contributor/creator/publisher/rightsHolder</b>, each should be listed separately, 
</p>
<p>like another resource,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>publisher</b>
</td>
<td> gnd
</td>
<td> <i>2125990-2</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>name</b>
</td>
<td> <i>Rossijskaja Gosudarstvennaja Biblioteka</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>homepage</b>
</td>
<td> <i><a href="http://www.rsl.ru/" class="external free" rel="nofollow">http://www.rsl.ru/</a></i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>publisher</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>name</b>
</td>
<td> <i>Knižnaja Palata</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exPub1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or with plain text.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>creator</b>
</td>
<td> <i>Hubble Telescope</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>publisher</b>
</td>
<td> <i>University of Nowhere</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>publisher</b>
</td>
<td> <i>All Your Data Inc.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exPub2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Type"> <a href="/specifications/dublin-core/dcmi-terms/#terms-type" class="external text" rel="nofollow">Type</a> </span>
</h1>
<p>The type property refers to a description of the nature or genre of the content of a resource (e.g. a stylistic category, a function or an aggregation level). To describe the physical or digital manifestation, use format.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_type_content"> Guidelines for the creation of type content </span>
</h2>
<p>We recommend to <b>select a value from a controlled vocabulary</b> (e. g. <a href="http://dublincore.org/documents/dcmi-type-vocabulary/" class="external text" rel="nofollow">DCMI Type Vocabulary</a>).
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> dctype
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td>
</td>
<td> <i>Still Image</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTyp1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>But you may also use <b>plain text</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> <i>Conference</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTyp4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If <b>no formal controlled vocabulary</b> exists, you could create a domain specific one.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> <i><a href="/index.php?title=Conference&amp;action=edit&amp;redlink=1" class="new" title="Conference (page does not exist)">conference</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> identifier
</td>
<td> <i><a href="/index.php?title=Conference&amp;action=edit&amp;redlink=1" class="new" title="Conference (page does not exist)">conference</a></i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>Conference</i>
</td>
<td> eng
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>Tagung</i>
</td>
<td> ger
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>съезд</i>
</td>
<td> rus
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTyp5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p><br>
Is the resource composed of <b>multiple components of different types</b> the property should be repeated.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> dctype
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td>
</td>
<td> <i>Interactive Resource</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> dctype
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td>
</td>
<td> <i>Text</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTyp2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Different communities use a variety of type vocabularies. To ensure interoperability you can use terms from different vocabularies side by side - e.g. a type of the DCMI  Type vocabulary in addition to <b>a non-controlled or domain specific type term</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td>
</td>
<td> <i>PC Game</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>type</b>
</td>
<td> dctype
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td>
</td>
<td> <i>Software</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exTyp3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Format"> <a href="/specifications/dublin-core/dcmi-terms/#terms-format" class="external text" rel="nofollow">Format</a> </span>
</h1>
<p>The property format refers to the file format, the physical medium (e.g. the data storage medium), or the dimension (the size or duration) of a resource. The information can be relevant to determine the equipment needed to display or operate a resource (e.g. if the described resource has format pdf you need a pdf reader to use it). To specify the different categories of format you should use extent and/or medium. To reference to the nature or genre of the content use type. 
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_format_content"> Guidelines for the creation of format content </span>
</h2>
<p>For the description of the <b>file format</b> we recommend to use a controlled vocabulary - e.g. the list of <a href="http://purl.org/NET/mediatypes/" class="external text" rel="nofollow">Internet Media Types</a>(MIME).
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>format</b>
</td>
<td> mime
</td>
<td> <i>jpeg</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exFor1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>You should repeat the properties when <b>more than one type of value exists</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>format</b>
</td>
<td> mime
</td>
<td> <i>jpeg</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>format</b>
</td>
<td>
</td>
<td> <i>40 x 512 pixels</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exFor2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Extent"> <a href="/specifications/dublin-core/dcmi-terms/#terms-extent" class="external text" rel="nofollow">Extent</a> </span>
</h1>
<p>This property refers to the size (e.g. bytes, pages, inches, etc.) or duration (e.g. hours, minutes, days, etc.) of a resource.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_extent_content"> Guidelines for the creation of extent content </span>
</h2>
<p>Typically the value used for the description of the extent consists of a <b>numeric value and a caption</b> to specify it. You may use a text string to present it
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>extent</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>21 minutes</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exExt1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or use controlled values for the caption. 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>extent</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> minutes
</td>
<td> <i>21</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exExt2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Medium"> <a href="/specifications/dublin-core/dcmi-terms/#terms-medium" class="external text" rel="nofollow">Medium</a> </span>
</h1>
<p>This property refers to the physical carrier of the resource and may only be used if the resource is of physical nature (e.g. a painting, a sculpture, etc.)
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_medium_content"> Guidelines for the creation of medium content </span>
</h2>
<p>Note that the <b>media types must not be used with the property medium</b> because medium describes only physical objects.
</p>
<p>We recommend to <b>use a controlled vocabulary</b>. If no formal controlled vocabulary exist you should nonetheless handle the media type like another resource.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>medium</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>oil on wood</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>oil</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>wood</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exMed1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Language"> <a href="/specifications/dublin-core/dcmi-terms/#terms-language" class="external text" rel="nofollow">Language</a> </span>
</h1>
<p>This properties refers to the language of the intellectual content of the resource.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_language_content"> Guidelines for the creation of language content </span>
</h2>
<p>For the identification of languages please follow <a href="http://www.ietf.org/rfc/rfc4646.txt" class="external text" rel="nofollow">RFC 4646</a>. Best practice would be to <b>select a value from the three letter language tags of ISO 639</b> (e.g. <a href="http://www.sil.org/iso639-3/codes.asp" class="external free" rel="nofollow">http://www.sil.org/iso639-3/codes.asp</a>). 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>A great deliverance</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>eng</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan7" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>A great deliverance</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <a href="http://tools.ietf.org/html/rfc4646" class="external mw-magiclink-rfc">RFC 4646</a>
</td>
<td> <i>eng</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If the content is in <b>more than one language</b>, the property should be repeated.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Charlie Wilson's War</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>eng</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>hun</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>tur</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>But if <b>every language version has it's own identifier</b>, they have to be treated like single resources.
</p>
<p>Video1
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Medieval helpdesk with English subtitles</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded" class="external free" rel="nofollow">http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded</a></i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>isVersionOf</b>
</td>
<td> <i>Video2</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>nor</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>eng</i>
</td>
</tr>
</table>
<p>Video2
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Book help (better verson)</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="http://www.youtube.com/watch?v=UOorZQLsmuA&amp;feature=related" class="external free" rel="nofollow">http://www.youtube.com/watch?v=UOorZQLsmuA&amp;feature=related</a></i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>isVersionOf</b>
</td>
<td> <i>Video1</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> ISO 639-3
</td>
<td> <i>nor</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>You could also use plain text
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The Power of Orange Knickers</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> <i>English</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or create your own language vocabulary.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The Power of Orange Knickers</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>language</b>
</td>
<td> <i><a href="/index.php?title=English&amp;action=edit&amp;redlink=1" class="new" title="English (page does not exist)">english</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="/index.php?title=English&amp;action=edit&amp;redlink=1" class="new" title="English (page does not exist)">english</a></i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>English</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>ISO 639-1</b>
</td>
<td> <i>en</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>ISO 639-3</b>
</td>
<td> <i>eng</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exLan4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Identifiers"> Identifiers </span>
</h1>
<h2> <span class="mw-headline" id="Identifier"> <a href="/specifications/dublin-core/dcmi-terms/#terms-identifier" class="external text" rel="nofollow">Identifier</a> </span>
</h2>
<p>An identifier is an unambiguous reference to a resource. Examples of formal identification systems include the Uniform Resource Identifier (URI) - including the Uniform Resource Locator (URL), the Digital Object Identifier (DOI) or the International Standard Book Number (ISBN). 
</p>
<h2> <span class="mw-headline" id="BibliographicCitation"> <a href="/specifications/dublin-core/dcmi-terms/#terms-bibliographicCitation" class="external text" rel="nofollow">BibliographicCitation</a> </span>
</h2>
<ul><li> dcterms:bibliographicCitation
</li></ul>
<p>BibliographicCitation is a bibliographic reference to a resource identifying the resource by bibliographic details. Typically the described resource is the child in a parent/child relationship where the bibliographicCitation is not describing the relationship but the location of the described resource within the parent resource (e.g. the bibliographic citation of an article consists of the name of a journal as well as the number of volume, issues and even page references). For the description of parent/child relations see hasPart or isPartOf. BibliographicCitation may only be used to describe bibliographic resources like books, articles or other documentary resource.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_identifier_content"> Guidelines for the creation of identifier content </span>
</h2>
<p>Best practice is to <b>declare the identification system</b> from which an identifier is selected.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>What's a URI and why does it matter?</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="http://www.ltg.ed.ac.uk/~ht/WhatAreURIs/" class="external free" rel="nofollow">http://www.ltg.ed.ac.uk/~ht/WhatAreURIs/</a></i>
</td>
<td> URI
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exIde1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Identifiers should be selected from formal identification systems as above but can also be <b>local identifiers</b> as long as there is a proper declaration of these.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Small and medium sized companies in Kathmandu</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i>03KTM147</i>
</td>
<td> local ID
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exIde2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Note that the identifier of the description of a resource (e. g. of the metadata record) is not the same as the identifier of the resource itself. 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr>
<td> metadata record
</td>
<td>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>2010</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i>013234098</i>
</td>
<td> database ID
</td>
</tr>
<tr>
<td> my Video
</td>
<td>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Medieval helpdesk with English subtitles</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>2007</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded" class="external free" rel="nofollow">http://www.youtube.com/watch?v=pQHX-SjgQvQ&amp;feature=player_embedded</a></i>
</td>
<td> URI
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exIde3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If no identifier from a formal identification system exist, the identifier can be generated by a <b>bibliographic citation</b>. The bibliographic citation can be created as <b>text citation</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Prototyping Digital Library Technologies in zetoc</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>bibliographicCitation</b>
</td>
<td> <i>Lecture Notes in Computer Science 2458, 309-323 (2002)</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exBib1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or as <b>machine readable citations</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Prototyping Digital Library Technologies in zetoc</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>bibliographicCitation</b>
</td>
<td> <i>&amp;ctx_ver=Z39.88-2004&amp;rft_val_fmt=info:ofi/fmt:kev:mtx:journal&amp;rft.jtitle=Lecture Notes in Computer Science&amp;rft.volume=2458&amp;rft.spage=309"^^info:ofi/fmt:kev:mtx:ctx</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exBib2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>You can also <b>structure the bibliographic information</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>My first article about metadata</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>journal title</b>
</td>
<td> <i>My Favorite Journal</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>volume</b>
</td>
<td> <i>3</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>issue</b>
</td>
<td> <i>2</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>start page</b>
</td>
<td> <i>14</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>date</b>
</td>
<td> <i>2010</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exIde4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>For additional information on bibliographicCitation see <a href="http://dublincore.org/documents/dc-citation-guidelines/index.shtml" class="external text" rel="nofollow">"Guidelines for Encoding Bibliographic Citation Information in Dublin Core Metadata"</a>.
</p>
<h1> <span class="mw-headline" id="Descriptions"> Descriptions </span>
</h1>
<h2> <span class="mw-headline" id="Description"> <a href="/specifications/dublin-core/dcmi-terms/#terms-description" class="external text" rel="nofollow">Description</a> </span>
</h2>
<p>This property refers to the description of the content of a resource. The description is a potentially rich source of indexable terms and assist the users in their selection of an appropriate resource. To refine the character of a description use abstract or tableOfContent.
</p>
<h2> <span class="mw-headline" id="Abstract"> <a href="/specifications/dublin-core/dcmi-terms/#terms-abstract" class="external text" rel="nofollow">Abstract</a> </span>
</h2>
<p>This property is used when the description of a resource is a formal abstract.
</p>
<h2> <span class="mw-headline" id="TableOfContent"> <a href="/specifications/dublin-core/dcmi-terms/#terms-tableOfContent" class="external text" rel="nofollow">TableOfContent</a> </span>
</h2>
<p>This property is used when the description of a resource is a structured list of the contents of a resource.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_descriptions"> Guidelines for the creation of descriptions </span>
</h2>
<p>A description may be <b>a free text account</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Bugs from New Zealand</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i>A box of ten bugs collected in New Zealand between 1845 and 1846</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDes2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>an <b>abstract</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The Foundations of Programm Verification</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>abstract</b>
</td>
<td> <i>This revised edition provides a precise mathematical background to several program verification techniques. It concentrates on those verification methods that have now become classic, such as the inductive assertions method of Floyd, the axiomatic method of Hoare, and Scott's fixpoint induction. The aim of the book is to present these different verification methods in a simple setting and to explain their mathematical background. In particular the problems of correctness and completeness of the different methods are discussed in some detail and many helpful examples are included.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exAbs1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>a <b>table of contents</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Remains of Claire Klawitter</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>table of content</b>
</td>
<td> <i>Diary 1822 - 1824 -- 20 pictures of Indian farmers -- 5 letters to Rudi Ratlos -- 1 map of North India</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exToc1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or a <b>reference to a description</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Thriller</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i><a href="http://en.wikipedia.org/wiki/Thriller_(album)" class="external free" rel="nofollow">http://en.wikipedia.org/wiki/Thriller_(album)</a></i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDes1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>You can give some <b>information about the description you refer to</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Coriandrum sativum</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i><a href="http://en.wikipedia.org/wiki/Coriander" class="external free" rel="nofollow">http://en.wikipedia.org/wiki/Coriander</a></i>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>title</b>
</td>
<td> <i>Coriander</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>contributor</b>
</td>
<td> <i>Wikipedia</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDes3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If <b>descriptions in different languages</b> exist, the property should be repeated with language tags.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Delvig and Kjuchelbeker</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>abstract</b>
</td>
<td> <i>The book is a collection of works of two poets - contemporaries and friends of Pushkin - A. A. Delvig and V. K. Kjuchelbeker. It includes poems and prosa by Kjuchelbeker, parts of his diary, the poem Jurij and Xenia and reviews by Delvig. The attachment presents some retrospections to Delvig and Kjuchelbeker. A detailed biographic description tells us something about the life of the poets.</i>
</td>
<td> eng
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>abstract</b>
</td>
<td> <i>Сборник впервые обединяет произведения двух поетов - современиков и друзей Пушкина - А. А. Дельвига и В. К. Кюхельбекера. Наряду со стихотворениями в книгу вклучены проза Кюхельбекера, фрагменты из его дневника, поема "Юрий и Ксения", а также рецензии Дельвига. В "Приложении" печатаются воспоминания о Дельвиге и Кюхельбекерею. Подробные биографические очерки рассказывают о жизненном пути поэтов.</i>
</td>
<td> rus
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exAbs2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Subject"> <a href="/specifications/dublin-core/dcmi-terms/#terms-subject" class="external text" rel="nofollow">Subject</a> </span>
</h1>
<p>The property subject represents a relationship between a resource and another resource which is a topic of the first resource rsp. describes the intellectual content of the first resource. If the topic of the resource has a spatial or temporal character, use coverage, spatial or temporal.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_describing_the_subject_of_a_resource"> Guidelines for describing the subject of a resource </span>
</h2>
<p>To express the topic of a resource we recommend to <b>use a URI representing another resource describing this topic</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Inviato alla Biennale : Venezia, 1949 - 2009</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i><a href="http://www.labiennale.org/en/Home.html" class="external free" rel="nofollow">http://www.labiennale.org/en/Home.html</a></i>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>title</b>
</td>
<td> <i>La Biennale di Venezia</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or a URI representing the value of a controlled vocabulary,
</p>
<ul><li> like <b>entries from authority file systems</b> (e.g. <a href="http://id.loc.gov/authorities" class="external text" rel="nofollow">the Library of Congress Subject Headings</a> or the <a href="http://d-nb.info/gnd/" class="external text" rel="nofollow">authority files of the German National Library</a>, etc.), 
</li></ul>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>My Winter Wonderland</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i><a href="http://id.loc.gov/authorities/sh88004323#concept" class="external free" rel="nofollow">http://id.loc.gov/authorities/sh88004323#concept</a></i>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>label</b>
</td>
<td> <i>Cross-country skiing--Skating</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<ul><li> like <b>entries from classification systems</b> ((e.g. the <a href="http://www.oclc.org/dewey/" class="external text" rel="nofollow">Dewey Decimal Classification</a>, or Linnaean taxonomy, etc.).
</li></ul>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Transports in Kazakhstan 2000 - 2010</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i><a href="/index.php?title=W03_7&amp;action=edit&amp;redlink=1" class="new" title="W03 7 (page does not exist)">W03_7</a></i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i><a href="/index.php?title=G06_3&amp;action=edit&amp;redlink=1" class="new" title="G06 3 (page does not exist)">G06_3</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>W03.7</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>name</b>
</td>
<td> <i>Freight Transport</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>broader</b>
</td>
<td> <i>W03</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>narrower</b>
</td>
<td> <i>W03.72</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>narrower</b>
</td>
<td> <i>W03.75</i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>label</b>
</td>
<td> <i>G06_3</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>name</b>
</td>
<td> <i>Kazakhstan</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>broader</b>
</td>
<td> <i>G06</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>narrower</b>
</td>
<td> <i>G06_31</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>narrower</b>
</td>
<td> <i>G06_35</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p><br>               
You may also use plain text. But if you need <b>more than one entry to describe the content</b> you should repeat the property.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>How to get an aircraft</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i>aircraft</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> <i>leasing</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub6" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If you want to use a keyword or keyphrase in <b>different languages</b>, you should use language tags.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>KONSTYTUCJA RZECZYPOSPOLITEJ POLSKIEJ</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>Rzeczpospolita Polska</i>
</td>
<td> pol
</td>
</tr>
<tr>
<td>
</td>
<td> <i>Republic of Poland</i>
</td>
<td> eng
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p><br>            
If the <b>subject is a person or organization</b> you should use names from formal name authorities (e.g. from the Library of Congress Name Authority Headings <a href="http://id.loc.gov/authorities" class="external autonumber" rel="nofollow">[1]</a>, or from the Virtuell International Authority File <a href="http://www.viaf.org/" class="external autonumber" rel="nofollow">[2]</a>).
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Candle in the wind</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>subject</b>
</td>
<td> gnd
</td>
<td> <i>118583549</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>family name</b>
</td>
<td> <i>Monroe</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>given name</b>
</td>
<td> <i>Marilyn</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>born</b>
</td>
<td> <i>1926</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>died</b>
</td>
<td> <i>1962</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exSub5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Coverage"> Coverage </span>
</h1>
<h2> <span class="mw-headline" id="Coverage_2"> <a href="/specifications/dublin-core/dcmi-terms/#terms-coverage" class="external text" rel="nofollow">Coverage</a> </span>
</h2>
<p>The property coverage describes a relationship between a resource and another resource which represents the extent or scope of the content of the first resource. This includes the spatial locations (a place name or geographic co-ordinates), temporal periods (a period label, a date or a date range), or jurisdictions (states, counties, or other administrative entities). If you want to make a destinction between the temporal or spatial character of the content use temporal or spatial.
</p>
<h2> <span class="mw-headline" id="Temporal"> <a href="/specifications/dublin-core/dcmi-terms/#terms-temporal" class="external text" rel="nofollow">Temporal</a> </span>
</h2>
<p>This property describes the relationship between a resource and another resource which represent the temporal characteristics of the intellectual content of the first resource expressed by period labels or date encoding. If you want to describe date of the lifecycle of a resource use the date properties.
</p>
<h2> <span class="mw-headline" id="Spatial"> <a href="/specifications/dublin-core/dcmi-terms/#terms-spatial" class="external text" rel="nofollow">Spatial</a> </span>
</h2>
<p>This property describes the relationship between a resource and another resource which represents spatial characteristics of the intellectual content of the first resource expressed by by geographic names, latitude/longitude, or other established georeferencing. 
</p>
<h2> <span class="mw-headline" id="Guidelines_for_describing_the_coverage.2C_spatial_or_temporal_character_of_a_resource"> Guidelines for describing the coverage, spatial or temporal character of a resource </span>
</h2>
<p>To describe the <b>temporal</b> characteristic of a resource
</p>
<p>you may use plain text,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Transports in Kazakhstan 2000 - 2010</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>coverage</b>
</td>
<td> <i>2000 - 2010</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or <b>structure your entry</b> using dates,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Transports in Kazakhstan 2000 - 2010</i>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>temporal</b>
</td>
<td>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>start</b>
</td>
<td> <i>2000</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr>
<td>
</td>
<td> <b>end</b>
</td>
<td> <i>2010</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or <b>period labels</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Analysis of rocks collected in Perth</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>temporal</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>start</b>
</td>
<td> <i>Cambrian period</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>scheme</b>
</td>
<td> <i>Geological timescale</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>name</b>
</td>
<td> <i>Phanerozoic Eon</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Further information on encoding temporal characteristics you will find in the <a href="http://dublincore.org/documents/dcmi-period/" class="external text" rel="nofollow">DCMI Period Encoding Scheme</a>.
</p>
<p>To describe the <b>spatial</b> character of a resource, you could use plain text,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Analysis of rocks collected in Perth</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>coverage</b>
</td>
<td> <i>Perth, W. A.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov6" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or express it by <b>georeferencing</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Analysis of rocks collected in Perth</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>spatial</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>east</b>
</td>
<td> <i>115.85717</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>north</b>
</td>
<td> <i>-31.95301</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>name</b>
</td>
<td> <i>Perth, W. A.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or <b>reference to a formal encoding</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The growth of trees in the suptropical highlands</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>spatial</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>label</b>
</td>
<td> <i>Cwb</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>source</b>
</td>
<td> <i>Köppen-Geiger Climate Classification</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>main Climates</b>
</td>
<td> <i>warm temperate</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>precipitation</b>
</td>
<td> <i>winter dry</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>temperature</b>
</td>
<td> <i>warmest month averaging below 22°C</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCov2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Further information on encoding spatial characteristics you will find in the <a href="http://dublincore.org/documents/dcmi-box/" class="external text" rel="nofollow">DCMI Box Encoding Scheme</a> and the <a href="http://dublincore.org/documents/dcmi-point/" class="external text" rel="nofollow">DCMI Point Encoding Scheme</a>.
</p>
<h1> <span class="mw-headline" id="Dates"> Dates </span>
</h1>
<h2> <span class="mw-headline" id="Date"> <a href="/specifications/dublin-core/dcmi-terms/#terms-date" class="external text" rel="nofollow">Date</a> </span>
</h2>
<p>The property date refers to a description of any dates or ranges in the lifecycle of a resource and is typically associated with the creation or availability. If the destinction between different sorts of date is necessary, the following subproperties should be used. If a date is describing the content of a resource the properties coverage or temporal have to be used.
</p>
<h2> <span class="mw-headline" id="Created"> <a href="/specifications/dublin-core/dcmi-terms/#terms-created" class="external text" rel="nofollow">Created</a> </span>
</h2>
<p>This property refers to a description of the date or range of the creation of a resource. According to the one-to-one principle this has to be the creation date of the resource being described and not the creation date of any other resource from which the described resource derives (e.g. a former version or a superior resource). So a resource is created only once, every other date of creation belongs to another resource that has to be described on its own.  
</p>
<h2> <span class="mw-headline" id="Issued"> <a href="/specifications/dublin-core/dcmi-terms/#terms-issued" class="external text" rel="nofollow">Issued</a> </span>
</h2>
<p>This property refers to a description of the date of the formal issuance resp. publication of a resource. A resource is issued only once, every other issuance belongs to another resource that has to be described on its own. If the issuance of a resource is not formal the property "available" should be used. 
</p>
<h2> <span class="mw-headline" id="Available"> <a href="/specifications/dublin-core/dcmi-terms/#terms-available" class="external text" rel="nofollow">Available</a> </span>
</h2>
<p>This property refers to a description of the date a resource did become or will become available. A resource becomes available only once, every other availability belongs to another resource that has to be described on its own. If the availability of a resource starts with the formal issuance resp. publication use "issued". 
</p>
<h2> <span class="mw-headline" id="Modified"> <a href="/specifications/dublin-core/dcmi-terms/#terms-modified" class="external text" rel="nofollow">Modified</a> </span>
</h2>
<p>This property refers to a description of the date a resource was changed. You may record every date a resource was modified by repeating this property or record only one date (this should be the last one).
</p>
<h2> <span class="mw-headline" id="Valid"> <a href="/specifications/dublin-core/dcmi-terms/#terms-valid" class="external text" rel="nofollow">Valid</a> </span>
</h2>
<p>This property refers to a description of the date or range a resource is, was or will be valid. This property should be used if a resource is only valid resp. relevant until a particular date.
</p>
<h2> <span class="mw-headline" id="DateCopyrighted"> <a href="/specifications/dublin-core/dcmi-terms/#terms-dateCopyrighted" class="external text" rel="nofollow">DateCopyrighted</a> </span>
</h2>
<p>This property refers to a description of the date or range of the copyright of the resource.
</p>
<h2> <span class="mw-headline" id="DateSubmitted"> <a href="/specifications/dublin-core/dcmi-terms/#terms-dateSubmitted" class="external text" rel="nofollow">DateSubmitted</a> </span>
</h2>
<p>This property refers to a description of the date a resource was submitted (e.g. a thesis at a university department, an article at the editorial board of a journal, etc.).
</p>
<h2> <span class="mw-headline" id="DateAccepted"> <a href="/specifications/dublin-core/dcmi-terms/#terms-dateAccepted" class="external text" rel="nofollow">DateAccepted</a> </span>
</h2>
<p>This property refers to a description of the date a resource was accepted (e.g. a thesis by a university department, an article by the editorial board of a journal, etc.)
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_dates"> Guidelines for the creation of content for dates </span>
</h2>
<p>For the structure of date properties we recommend the usage of the <b>W3CDTF profile of ISO 8601</b> [W3CDTF]. It allows to sort search results by date and facilitates the merging of metadata of different applications.
</p>
<p>You should use this encoding for <b>a point in time</b>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>2003-04-10</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>but must not use it with <b>a range</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>valid</b>
</td>
<td> <i>2007-05-06/2007-07-15</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat9" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or when the date is located <b>before the common area</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>-500</i>
</td>
<td>gYear
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If you need to <b>structure range data</b>, make a distinction of start and end date.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>date</b>
</td>
<td>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>start</b>
</td>
<td> <i>2007-05-06"</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr>
<td>
</td>
<td> <b>end</b>
</td>
<td> <i>2007-07-15</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat10" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If the <b>complete date is unknown</b> you should use 
</p>
<p>month and year
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>available</b>
</td>
<td> <i>2006-07</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or only the year
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>issued</b>
</td>
<td> <i>2009</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat7" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If <b>more than one date of the same type</b> (e.g. modified) is recorded, the property must be repeated.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>modified</b>
</td>
<td> <i>2009-12-22</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>modified</b>
</td>
<td> <i>2010-01-08</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>modified</b>
</td>
<td> <i>2010-02-15</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat8" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>Since a resource has only one date of creation, issuance, availability and/or copyright you may repeat the properties created, issued, available and dateCopyrighted only if you want to <b>provide the same date in another structure</b>. 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>1752</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>probably after 1752</i>
</td>
<td>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If the described date is <b>only approximately known</b>, you may use plain text,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>aprox. 500 B.C.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or describe it.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>date</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>year</b>
</td>
<td> <i>500</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>qualifier</b>
</td>
<td> <i>approx.</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>epoch</b>
</td>
<td> <i>B.C.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat11" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p><b>Another date of creation, issuance, availability and/or copyright</b> however belongs to another resource that has to be described on its own. The relation of both resources may be described by one of the relation properties or by source. 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Population estimates in Scandinavia</i>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>created</b>
</td>
<td> <i>2004</i>
</td>
<td> W3CDTF
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>source</b>
</td>
<td>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>title</b>
</td>
<td> <i>World health report 2002 statistical annex</i>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>created</b>
</td>
<td> <i>2002</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exDat6" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Source_and_Relations"> Source and Relations </span>
</h1>
<h2> <span class="mw-headline" id="Relation"> <a href="/specifications/dublin-core/dcmi-terms/#terms-relation" class="external text" rel="nofollow">Relation</a> </span>
</h2>
<p>Relation represents the relationship between the described resource and another resource, that is related to the described resource in some way. Such relationship may be expressed reciprocally but this is not required and depends on the sort of relation. If the relation shall be specified more precicely use one of the following properties.
</p>
<h2> <span class="mw-headline" id="Source"> <a href="/specifications/dublin-core/dcmi-terms/#terms-source" class="external text" rel="nofollow">Source</a> </span>
</h2>
<p>Source describes the relationship between the described resource and another resource, from which the described resource is derived in whole or in part (e.g. data of a climate centre are the source of a forecast, a book or journal is the source of a scan, etc.)
</p>
<h2> <span class="mw-headline" id="IsPartOf"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isPartOf" class="external text" rel="nofollow">IsPartOf</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource of which the described resource is a physical or logical part (e.g. a painting as part of a collection, an article as part of a journal, etc.). The described resource is like a "child" in a hierarchical or "parent/child" relationship. For the reciprocal statement use hasPart.
</p>
<h2> <span class="mw-headline" id="HasPart"> <a href="/specifications/dublin-core/dcmi-terms/#terms-hasPart" class="external text" rel="nofollow">HasPart</a> </span>
</h2>
<p>This property describes the relationship between the desribed resource and another resource which is a physical or logical part of the described resource (e.g. the described resource is a collection of paintings, or a journal with different articles, etc.). The described resource is like the "parent" in a hierarchical or "parent/child" relationship. For the reciprocal statement use isPartOf.
</p>
<h2> <span class="mw-headline" id="IsVersionOf"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isVersionOf" class="external text" rel="nofollow">IsVersionOf</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource, that is a former version, edition or adaptation of the described resource (e.g. the described resource is the revision of a book, or another recording  of a song, etc.). Another version implies changes in the content of a resource. For resources with different formats use isFormatOf. For the reciprocal statement use hasVersion.  
</p>
<h2> <span class="mw-headline" id="HasVersion"> <a href="/specifications/dublin-core/dcmi-terms/#terms-hasVersion" class="external text" rel="nofollow">HasVersion</a> </span>
</h2>
<p>This property describes the relationship between the desribed property and another property, that is a later version, edition or adaptation of the described resource (e.g. the described resource is the older version of a revised book, or of a song, etc.). Another version implies changes in the content of a resource. For resources with different formats use hasFormat. For the reciprocal statement use isVersionOf.  
</p>
<h2> <span class="mw-headline" id="IsFormatOf"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isFormatOf" class="external text" rel="nofollow">IsFormatOf</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource, that is a former version of the described resource with the same intellectual content but presented in another format (e.g. the described resource is the microfilm version of a printed book, or the pdf version of a doc document). For intellectual changes between resources use isVersonOf. For the reciprocal statement use hasFormat. 
</p>
<h2> <span class="mw-headline" id="HasFormat"> <a href="/specifications/dublin-core/dcmi-terms/#terms-hasFormat" class="external text" rel="nofollow">HasFormat</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource, that is a later version of the described resource with the same intellectual content but presented in another format (e.g. the desribed resource is a printed book that is also availabel as a microfilm, or a doc document that is also available as pdf). For intellectual changes between resources use hasVersion. For the reciprocal statement use isFormatOf. 
</p>
<h2> <span class="mw-headline" id="Replaces"> <a href="/specifications/dublin-core/dcmi-terms/#terms-replaces" class="external text" rel="nofollow">Replaces</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource, that has been supplanted, displaced or superseeded by the described resource. It is used for the valid version in chain of versions (e.g. the described resource is the the last draft of a contract, or the current version of guidelines). For the reciprocal statement use isReplacedBy. 
</p>
<h2> <span class="mw-headline" id="IsReplacedBy"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isReplacedBy" class="external text" rel="nofollow">IsReplacedBy</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource, that supplants, displaces or superseedes the described resource. It is used, when in chain of versions only one version is valid (e.g. the described resource is one of the former drafts of a contract, or a former version of guidelines). For the reciprocal statement use replaces.
</p>
<h2> <span class="mw-headline" id="Requires"> <a href="/specifications/dublin-core/dcmi-terms/#terms-requires" class="external text" rel="nofollow">Requires</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource supporting the function, delivery or coherence of the content of the described resource (e.g. the described resource is an application that can be used only with a particular software, or hardware). For the reciprocal statement use isRequiredBy.
</p>
<h2> <span class="mw-headline" id="IsRequiredBy"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isRequiredBy" class="external text" rel="nofollow">IsRequiredBy</a> </span>
</h2>
<p>The described resource is necesssary for the function, delivery or coherence of the content of the resource the property references to (e.g. the described resource is a software or hardware necesssary to use a particular application). For the reciprocal statement use requires.
</p>
<h2> <span class="mw-headline" id="References"> <a href="/specifications/dublin-core/dcmi-terms/#terms-references" class="external text" rel="nofollow">References</a> </span>
</h2>
<p>This property describes the relationship between the described resource and another resource that is cited, referenced, or otherwise pointed to by the described resource (e.g. the described resource is an article citing a book, or an interview pointing to a play). For the reciprocal statement use isReferencedBy. 
</p>
<h2> <span class="mw-headline" id="IsReferencedBy"> <a href="/specifications/dublin-core/dcmi-terms/#terms-isReferencedBy" class="external text" rel="nofollow">IsReferencedBy</a> </span>
</h2>
<p>This property describes the relationship between a resource and another resource that points to the described resource by citation, acknowledgement, etc (e.g. the described resource is a book cited in an article, or a play pointed to in an interview, etc.). For the reciprocal statement use references.
</p>
<h2> <span class="mw-headline" id="ConformsTo"> <a href="/specifications/dublin-core/dcmi-terms/#terms-conformsTo" class="external text" rel="nofollow">ConformsTo</a></span>
</h2>
<p>This property describes the relationship between a resource and an established standard, to which the described resource conforms (e.g. a metadata record that conforms to the RDA standard, or a pipe that conforms to ISO 3183, etc.)
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_relations_and_source"> Guidelines for the creation of content for relations and source </span>
</h2>
<p>You may refer to the related resource by plain text or by a URI representing the related resource. If you use plain text, you should <b>use a formal citation</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>issued</b>
</td>
<td> <i>2009</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>isFormatOf</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>Eike von  Repgow: Sachsenspiegel, Auffs newe vbersehen mit Summarijs vnd Additionen ...; Leipzig 1561/1563</i>
</td>
<td>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>However recommended best practice is to <b>use an identifier instead of text</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>conformsTo</b>
</td>
<td> <i><a href="http://www.w3.org/2001/XMLSchema" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema</a></i>
</td>
<td>-
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or to <b>describe the related resources like another resource</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>references</b>
</td>
<td>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>creator</b>
</td>
<td> <i>Black, Carl</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>contributor</b>
</td>
<td> <i>White, Stuart</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>title</b>
</td>
<td> <i>Black and White</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>date</b>
</td>
<td> <i>1988</i>
</td>
<td> W3CDTF
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If there is <b>more than one relation of the same sort</b> you have to repeat the property:
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>requires</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>audio</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>video</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If <b>both resources of a relationship are described</b> the relation could be expressed reciprocally whereupon reciprocality could be generated automatically 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="/index.php?title=MySong1&amp;action=edit&amp;redlink=1" class="new" title="MySong1 (page does not exist)">mySong1</a></i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Candle in the wind</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>issued</b>
</td>
<td> <i>1973</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i>Portayal of the life of Marilyn Monroe</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>hasVersion</b>
</td>
<td> <i><a href="/index.php?title=MySong2&amp;action=edit&amp;redlink=1" class="new" title="MySong2 (page does not exist)">mySong2</a></i>
</td>
<td>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel5" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="/index.php?title=MySong2&amp;action=edit&amp;redlink=1" class="new" title="MySong2 (page does not exist)">mySong2</a></i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Candle in the wind</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>alternative</b>
</td>
<td> <i>Goodbye England's Rose</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>issued</b>
</td>
<td> <i>1997</i>
</td>
<td> W3CDTF
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i>Tribut to the dead princess of Wales</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>isVersionOf</b>
</td>
<td> <i><a href="/index.php?title=MySong1&amp;action=edit&amp;redlink=1" class="new" title="MySong1 (page does not exist)">mySong1</a></i>
</td>
<td>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRel6" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Rights"> Rights </span>
</h1>
<h2> <span class="mw-headline" id="Rights_2"> <a href="/specifications/dublin-core/dcmi-terms/#terms-rights" class="external text" rel="nofollow">Rights</a> </span>
</h2>
<p>The rights property represents the relationship between a resource and information about rights held in and over this resource. This includes information like access rights, Intellectual Property Rights (IPR), copyrights, references to legal documents describing how to use a resource, etc. To specify rights more precicely use accessRights or license.
</p>
<h2> <span class="mw-headline" id="AccessRights"> <a href="/specifications/dublin-core/dcmi-terms/#terms-accessRights" class="external text" rel="nofollow">AccessRights</a> </span>
</h2>
<p>This property represents the relationship between a resource and information about who can access a resource or an indication of its security status. Access rights provides information about restrictions to view, search or use a resource based on attributes of the resource itself or the category of user. 
</p>
<h2> <span class="mw-headline" id="License"> <a href="/specifications/dublin-core/dcmi-terms/#terms-license" class="external text" rel="nofollow">License</a> </span>
</h2>
<p>This property represents the relationship between a resource and a legal document giving official permission to do something with the resource (e.g. an otherwise free resource may not be used for reproduction within commercial applications). Examples of such licenses you will find at <a href="http://creativecommons.org/" class="external free" rel="nofollow">http://creativecommons.org/</a>.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_rights_content"> Guidelines for the creation of rights content </span>
</h2>
<p>A rights statement may be <b>a text</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Data from my last evaluation</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>accessRights</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>My colleagues only</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRig1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or <b>a URI</b> referencing to formal rights information,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>You and me</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>rights</b>
</td>
<td> <i><a href="http://creativecommons.org/licenses/by/3.0/legalcode" class="external free" rel="nofollow">http://creativecommons.org/licenses/by/3.0/legalcode</a></i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRig3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or a <b>combination of both</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>GeoNetwork - Geographic Metadata Catalog</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>license</b>
</td>
<td> <i><a href="http://www.gnu.org/licenses/gpl.html" class="external free" rel="nofollow">http://www.gnu.org/licenses/gpl.html</a></i>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>GNU General Public License</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRig2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>If there are no formal rights statements to use you may also <b>create your own rights statement</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Diaries of Juanita Ramirez</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>rights</b>
</td>
<td> <i><a href="/index.php?title=AccessConditions&amp;action=edit&amp;redlink=1" class="new" title="AccessConditions (page does not exist)">accessConditions</a></i>
</td>
</tr>
</table>
<p><br>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>identifier</b>
</td>
<td> <i><a href="/index.php?title=AccessConditions&amp;action=edit&amp;redlink=1" class="new" title="AccessConditions (page does not exist)">accessConditions</a></i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Access to my stuff</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>description</b>
</td>
<td> <i>Resources under this right can only be read, searched and used by members of the myProject</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exRig4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Special_properties_for_the_description_of_education_material"> Special properties for the description of education material  </span>
</h1>
<h2> <span class="mw-headline" id="Audience"> <a href="/specifications/dublin-core/dcmi-terms/#terms-audience" class="external text" rel="nofollow">Audience</a> </span>
</h2>
<p>The property audience represents the relationship between a resource and the class of persons for whom the resource is intended or useful (e.g. the resource is a textbook for psychologists, etc.). To specify an audience more precisely use mediator or educationLevel.
</p>
<h2> <span class="mw-headline" id="Mediator"> <a href="/specifications/dublin-core/dcmi-terms/#terms-mediator" class="external text" rel="nofollow">Mediator</a> </span>
</h2>
<p>This property represents the relationship between a resource and the class of persons who mediate access to the resource and for whom it is intended or useful. This might be teachers, parents etc. (e.g. teachers are  mediators for a resource intended to be used in elementary school lessons)
</p>
<h2> <span class="mw-headline" id="EducationLevel"> <a href="/specifications/dublin-core/dcmi-terms/#terms-educationLevel" class="external text" rel="nofollow">EducationLevel</a> </span>
</h2>
<p>This property refers to information about the progress of an audience through the educational or training context, for which the described resource is intended (e.g. the resource is an English workbook for students of the 4th - 5th grade).
</p>
<h2> <span class="mw-headline" id="InsctructionalMethod"> <a href="/specifications/dublin-core/dcmi-terms/#terms-instructionalMethod" class="external text" rel="nofollow">InsctructionalMethod</a> </span>
</h2>
<p>This property refers to the process used to engender knowledge, attitudes and skills, that the described resource is designed to support. Typically it includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_properties_describing_education_material"> Guidelines for the creation of content for properties describing education material </span>
</h2>
<p>You should use formal or informal <b>controlled vocabularies</b>. Though none are registered by DCMI, implementors are encouraged to develop local lists of values, and to use them consistently.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Advances Physics</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>audience</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>elementary school pupils</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exEdu1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>mediator</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>schoolteacher</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exEdu4" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>educationLevel</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>3rd - 4th grade</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exEdu2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>InstructionalMethod</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>experimental learning</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exEdu3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Special_properties_for_the_description_of_collections"> Special properties for the description of collections </span>
</h1>
<h2> <span class="mw-headline" id="AccrualMethod"> <a href="/specifications/dublin-core/dcmi-terms/#terms-accrualMethod" class="external text" rel="nofollow">AccrualMethod</a> </span>
</h2>
<p>This property refers to the method by which items are added to a collection.
</p>
<h2> <span class="mw-headline" id="AccrualPeriodicity"> <a href="/specifications/dublin-core/dcmi-terms/#terms-accrualPeriodicity" class="external text" rel="nofollow">AccrualPeriodicity</a> </span>
</h2>
<p>This property refers to the frequency with wich items are added to a collection.
</p>
<h2> <span class="mw-headline" id="AccrualPolicy"> <a href="/specifications/dublin-core/dcmi-terms/#terms-accrualPolicy" class="external text" rel="nofollow">AccrualPolicy</a> </span>
</h2>
<p>This property refers to the policy governing the addition of items to a collection.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_properties_describing_collections"> Guidelines for the creation of content for properties describing collections </span>
</h2>
<p>Resources described by these properties <b>have to be collections</b>. We recommend to use values of formal or informal <b>controlled vocabularies</b>. 
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Pottery in Scandinavia in the second half of 19th century</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>accrualMethod</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>purchase</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCol1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>accrualPeriodicity</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>irregular</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCol2" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>accrualPolicy</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>Objects of this collection have to be Scandinavian ceramics from 1940s to 1999s.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exCol3" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<h1> <span class="mw-headline" id="Provenance"> <a href="/specifications/dublin-core/dcmi-terms/#terms-provenance" class="external text" rel="nofollow">Provenance</a> </span>
</h1>
<p>This property refers to a description of changes in ownership and custody. The statement should include any changes of the resource that are significant for its authenticity, integrity and interpretation.
</p>
<h2> <span class="mw-headline" id="Guidelines_for_the_creation_of_content_for_provenance"> Guidelines for the creation of content for provenance </span>
</h2>
<p>The description of the provenance of a resource includes all changes made to a resource.
</p>
<p>The provenance can be <b>described by text</b>,
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>Luxor Obelisk</i>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>provenance</b>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <i>Originally located at the entrance to the Luxor temple the obelisk came to Paris in 1836 as a gift by Muhammad Ali Pasha.</i>
</td>
</tr>
</table>
<p><a href="/resources/userguide/publishing_metadata/#exPro1" title="User Guide/Publishing Metadata">as linked data</a>
</p>
<p>or <b>desribed like another resource</b>.
</p>
<table border="1" cellspacing="0" cellpadding="5" style="border-collapse:collapse;">

<tr style="background-color:#FFFF66;">
<td> <b>title</b>
</td>
<td> <i>The flea circus</i>
</td>
<td>
</td>
</tr>
<tr style="background-color:#FFFF66;">
<td> <b>provenance</b>
</td>
<td>
</td>
<td>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>ownedBy</b>
</td>
<td> <i>1829 - 1833; Jim Button</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>ownedBy</b>
</td>
<td> <i>1833 - 1915; My Library</i>
</td>
</tr>
<tr>
<td>
</td>
<td> <b>ownedBy</b>
</td>
<td> <i>since 1915; Flea Academy</i>
</td>
</tr>
</table>


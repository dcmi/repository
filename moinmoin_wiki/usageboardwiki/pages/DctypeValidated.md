---
title: "- DctypeValidated"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/DctypeValidated.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DctypeValidated](http://dublincore.org/usageboardwiki/DctypeValidated?action=fullsearch&value=DctypeValidated&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/DctypeValidated?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/DctypeValidated "View")
- [Diffs](http://dublincore.org/usageboardwiki/DctypeValidated?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/DctypeValidated?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/DctypeValidated?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/DctypeValidated?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/DctypeValidated?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/DctypeValidated?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/DctypeValidated?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/DctypeValidated?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/DctypeValidated?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/DctypeValidated?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/DctypeValidated?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/DctypeValidated">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DctypeValidated_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DctypeValidated_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The document as Notation 3 <pre>@prefix dcam: &lt;http://purl.org/dc/dcam/&gt; .
@prefix xml: &lt;http://www.w3.org/XML/1998/namespace&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/dcmitype/&gt; dcterms:title "DCMI Namespace for metadata terms of the DCMI Type Vocabulary"@en-US ;
        dcterms:publisher "The Dublin Core Metadata Initiative"@en-US ;
        dcterms:modified "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Collection&gt; rdfs:label "Collection"@en-US ;
        rdfs:comment "An aggregation of resources."@en-US ;
        dcterms:description "A collection is described as a group; its parts may also be separately described."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Collection-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; rdfs:label "Dataset"@en-US ;
        rdfs:comment "Data encoded in a defined structure."@en-US ;
        dcterms:description "Examples include lists, tables, and databases. A dataset may be useful for direct machine processing."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Dataset-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Event&gt; rdfs:label "Event"@en-US ;
        rdfs:comment "A non-persistent, time-based occurrence."@en-US ;
        dcterms:description "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Event-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Image&gt; rdfs:label "Image"@en-US ;
        rdfs:comment "A visual representation other than text."@en-US ;
        dcterms:description "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Image-004&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; rdfs:label "Interactive Resource"@en-US ;
        rdfs:comment "A resource requiring interaction from the user to be understood, executed, or experienced."@en-US ;
        dcterms:description "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#InteractiveResource-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Service&gt; rdfs:label "Service"@en-US ;
        rdfs:comment "A system that provides one or more functions."@en-US ;
        dcterms:description "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Service-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Software&gt; rdfs:label "Software"@en-US ;
        rdfs:comment "A computer program in source or compiled form."@en-US ;
        dcterms:description "Examples include a C source file, MS-Windows .exe executable, or Perl script."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Software-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Sound&gt; rdfs:label "Sound"@en-US ;
        rdfs:comment "A resource primarily intended to be heard."@en-US ;
        dcterms:description "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Sound-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/Text&gt; rdfs:label "Text"@en-US ;
        rdfs:comment "A resource consisting primarily of words for reading."@en-US ;
        dcterms:description "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2000-07-11" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#Text-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; rdfs:label "Physical Object"@en-US ;
        rdfs:comment "An inanimate, three-dimensional object or substance."@en-US ;
        dcterms:description "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2002-07-13" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#PhysicalObject-003&gt; ;
        dcam:memberOf dcterms:DCMIType .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; rdfs:label "Still Image"@en-US ;
        rdfs:comment "A static visual representation."@en-US ;
        dcterms:description "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2003-11-18" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#StillImage-003&gt; ;
        dcam:memberOf dcterms:DCMIType ;
        rdfs:subClassOf &lt;http://purl.org/dc/dcmitype/Image&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; rdfs:label "Moving Image"@en-US ;
        rdfs:comment "A series of visual representations imparting an impression of motion when shown in succession."@en-US ;
        dcterms:description "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcmitype/&gt; ;
        dcterms:issued "2003-11-18" ;
        dcterms:modified "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#MovingImage-003&gt; ;
        dcam:memberOf dcterms:DCMIType ;
        rdfs:subClassOf &lt;http://purl.org/dc/dcmitype/Image&gt; .

      The underlying triples

&lt;http://purl.org/dc/dcmitype/&gt; &lt;http://purl.org/dc/terms/title&gt; "DCMI Namespace for metadata terms of the DCMI Type Vocabulary"@en-US .
&lt;http://purl.org/dc/dcmitype/&gt; &lt;http://purl.org/dc/terms/publisher&gt; "The Dublin Core Metadata Initiative"@en-US .
&lt;http://purl.org/dc/dcmitype/&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Collection"@en-US .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An aggregation of resources."@en-US .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://purl.org/dc/terms/description&gt; "A collection is described as a group; its parts may also be separately described."@en-US .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Collection-003&gt; .
&lt;http://purl.org/dc/dcmitype/Collection&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Dataset"@en-US .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "Data encoded in a defined structure."@en-US .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include lists, tables, and databases. A dataset may be useful for direct machine processing."@en-US .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Dataset-003&gt; .
&lt;http://purl.org/dc/dcmitype/Dataset&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Event"@en-US .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A non-persistent, time-based occurrence."@en-US .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://purl.org/dc/terms/description&gt; "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."@en-US .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Event-003&gt; .
&lt;http://purl.org/dc/dcmitype/Event&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Image"@en-US .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A visual representation other than text."@en-US .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations."@en-US .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Image-004&gt; .
&lt;http://purl.org/dc/dcmitype/Image&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Interactive Resource"@en-US .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A resource requiring interaction from the user to be understood, executed, or experienced."@en-US .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."@en-US .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#InteractiveResource-003&gt; .
&lt;http://purl.org/dc/dcmitype/InteractiveResource&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Service"@en-US .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A system that provides one or more functions."@en-US .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."@en-US .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Service-003&gt; .
&lt;http://purl.org/dc/dcmitype/Service&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Software"@en-US .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A computer program in source or compiled form."@en-US .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include a C source file, MS-Windows .exe executable, or Perl script."@en-US .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Software-003&gt; .
&lt;http://purl.org/dc/dcmitype/Software&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Sound"@en-US .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A resource primarily intended to be heard."@en-US .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."@en-US .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Sound-003&gt; .
&lt;http://purl.org/dc/dcmitype/Sound&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Text"@en-US .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A resource consisting primarily of words for reading."@en-US .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."@en-US .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://purl.org/dc/terms/issued&gt; "2000-07-11" .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#Text-003&gt; .
&lt;http://purl.org/dc/dcmitype/Text&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Physical Object"@en-US .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An inanimate, three-dimensional object or substance."@en-US .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://purl.org/dc/terms/description&gt; "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."@en-US .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://purl.org/dc/terms/issued&gt; "2002-07-13" .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#PhysicalObject-003&gt; .
&lt;http://purl.org/dc/dcmitype/PhysicalObject&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Still Image"@en-US .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A static visual representation."@en-US .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."@en-US .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://purl.org/dc/terms/issued&gt; "2003-11-18" .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#StillImage-003&gt; .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/StillImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/dcmitype/Image&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Moving Image"@en-US .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A series of visual representations imparting an impression of motion when shown in succession."@en-US .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://purl.org/dc/terms/description&gt; "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image."@en-US .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcmitype/&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://purl.org/dc/terms/issued&gt; "2003-11-18" .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#MovingImage-003&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/DCMIType&gt; .
&lt;http://purl.org/dc/dcmitype/MovingImage&gt; &lt;http://www.w3.org/2000/01/rdf-schema#subClassOf&gt; &lt;http://purl.org/dc/dcmitype/Image&gt; .

      Your original RDF/XML document

1 &lt;?xml version="1.0" encoding="UTF-8"?&gt;
2 &lt;!DOCTYPE rdf:RDF [
3 &lt;!ENTITY rdfns 'http://www.w3.org/1999/02/22-rdf-syntax-ns#'&gt;
4 &lt;!ENTITY rdfsns 'http://www.w3.org/2000/01/rdf-schema#'&gt;
5 &lt;!ENTITY dcns 'http://purl.org/dc/elements/1.1/'&gt;
6 &lt;!ENTITY dctermsns 'http://purl.org/dc/terms/'&gt;
7 &lt;!ENTITY dctypens 'http://purl.org/dc/dcmitype/'&gt;
8 &lt;!ENTITY dcamns 'http://purl.org/dc/dcam/'&gt;
9 ]&gt;
10 &lt;rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:dcam="http://purl.org/dc/dcam/" xmlns:dcterms="http://purl.org/dc/terms/" xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"&gt;
11 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/"&gt;
12 &lt;dcterms:title xml:lang="en-US"&gt;DCMI Namespace for metadata terms of the DCMI Type Vocabulary&lt;/dcterms:title&gt;
13 &lt;dcterms:publisher xml:lang="en-US"&gt;The Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
14 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
15 &lt;/rdf:Description&gt;
16 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Collection"&gt;
17 &lt;rdfs:label xml:lang="en-US"&gt;Collection&lt;/rdfs:label&gt;
18 &lt;rdfs:comment xml:lang="en-US"&gt;An aggregation of resources.&lt;/rdfs:comment&gt;
19 &lt;dcterms:description xml:lang="en-US"&gt;A collection is described as a group; its parts may also be separately described.&lt;/dcterms:description&gt;
20 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
21 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
22 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
23 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
24 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Collection-003"/&gt;
25 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
26 &lt;/rdf:Description&gt;
27 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Dataset"&gt;
28 &lt;rdfs:label xml:lang="en-US"&gt;Dataset&lt;/rdfs:label&gt;
29 &lt;rdfs:comment xml:lang="en-US"&gt;Data encoded in a defined structure.&lt;/rdfs:comment&gt;
30 &lt;dcterms:description xml:lang="en-US"&gt;Examples include lists, tables, and databases. A dataset may be useful for direct machine processing.&lt;/dcterms:description&gt;
31 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
32 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
33 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
34 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
35 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Dataset-003"/&gt;
36 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
37 &lt;/rdf:Description&gt;
38 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Event"&gt;
39 &lt;rdfs:label xml:lang="en-US"&gt;Event&lt;/rdfs:label&gt;
40 &lt;rdfs:comment xml:lang="en-US"&gt;A non-persistent, time-based occurrence.&lt;/rdfs:comment&gt;
41 &lt;dcterms:description xml:lang="en-US"&gt;Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration.&lt;/dcterms:description&gt;
42 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
43 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
44 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
45 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
46 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Event-003"/&gt;
47 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
48 &lt;/rdf:Description&gt;
49 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Image"&gt;
50 &lt;rdfs:label xml:lang="en-US"&gt;Image&lt;/rdfs:label&gt;
51 &lt;rdfs:comment xml:lang="en-US"&gt;A visual representation other than text.&lt;/rdfs:comment&gt;
52 &lt;dcterms:description xml:lang="en-US"&gt;Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations.&lt;/dcterms:description&gt;
53 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
54 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
55 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
56 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
57 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Image-004"/&gt;
58 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
59 &lt;/rdf:Description&gt;
60 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/InteractiveResource"&gt;
61 &lt;rdfs:label xml:lang="en-US"&gt;Interactive Resource&lt;/rdfs:label&gt;
62 &lt;rdfs:comment xml:lang="en-US"&gt;A resource requiring interaction from the user to be understood, executed, or experienced.&lt;/rdfs:comment&gt;
63 &lt;dcterms:description xml:lang="en-US"&gt;Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments.&lt;/dcterms:description&gt;
64 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
65 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
66 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
67 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
68 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#InteractiveResource-003"/&gt;
69 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
70 &lt;/rdf:Description&gt;
71 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Service"&gt;
72 &lt;rdfs:label xml:lang="en-US"&gt;Service&lt;/rdfs:label&gt;
73 &lt;rdfs:comment xml:lang="en-US"&gt;A system that provides one or more functions.&lt;/rdfs:comment&gt;
74 &lt;dcterms:description xml:lang="en-US"&gt;Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server.&lt;/dcterms:description&gt;
75 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
76 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
77 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
78 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
79 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Service-003"/&gt;
80 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
81 &lt;/rdf:Description&gt;
82 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Software"&gt;
83 &lt;rdfs:label xml:lang="en-US"&gt;Software&lt;/rdfs:label&gt;
84 &lt;rdfs:comment xml:lang="en-US"&gt;A computer program in source or compiled form.&lt;/rdfs:comment&gt;
85 &lt;dcterms:description xml:lang="en-US"&gt;Examples include a C source file, MS-Windows .exe executable, or Perl script.&lt;/dcterms:description&gt;
86 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
87 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
88 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
89 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
90 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Software-003"/&gt;
91 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
92 &lt;/rdf:Description&gt;
93 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Sound"&gt;
94 &lt;rdfs:label xml:lang="en-US"&gt;Sound&lt;/rdfs:label&gt;
95 &lt;rdfs:comment xml:lang="en-US"&gt;A resource primarily intended to be heard.&lt;/rdfs:comment&gt;
96 &lt;dcterms:description xml:lang="en-US"&gt;Examples include a music playback file format, an audio compact disc, and recorded speech or sounds.&lt;/dcterms:description&gt;
97 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
98 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
99 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
100 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
101 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Sound-003"/&gt;
102 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
103 &lt;/rdf:Description&gt;
104 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/Text"&gt;
105 &lt;rdfs:label xml:lang="en-US"&gt;Text&lt;/rdfs:label&gt;
106 &lt;rdfs:comment xml:lang="en-US"&gt;A resource consisting primarily of words for reading.&lt;/rdfs:comment&gt;
107 &lt;dcterms:description xml:lang="en-US"&gt;Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text.&lt;/dcterms:description&gt;
108 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
109 &lt;dcterms:issued&gt;2000-07-11&lt;/dcterms:issued&gt;
110 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
111 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
112 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#Text-003"/&gt;
113 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
114 &lt;/rdf:Description&gt;
115 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/PhysicalObject"&gt;
116 &lt;rdfs:label xml:lang="en-US"&gt;Physical Object&lt;/rdfs:label&gt;
117 &lt;rdfs:comment xml:lang="en-US"&gt;An inanimate, three-dimensional object or substance.&lt;/rdfs:comment&gt;
118 &lt;dcterms:description xml:lang="en-US"&gt;Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types.&lt;/dcterms:description&gt;
119 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
120 &lt;dcterms:issued&gt;2002-07-13&lt;/dcterms:issued&gt;
121 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
122 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
123 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#PhysicalObject-003"/&gt;
124 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
125 &lt;/rdf:Description&gt;
126 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/StillImage"&gt;
127 &lt;rdfs:label xml:lang="en-US"&gt;Still Image&lt;/rdfs:label&gt;
128 &lt;rdfs:comment xml:lang="en-US"&gt;A static visual representation.&lt;/rdfs:comment&gt;
129 &lt;dcterms:description xml:lang="en-US"&gt;Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image.&lt;/dcterms:description&gt;
130 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
131 &lt;dcterms:issued&gt;2003-11-18&lt;/dcterms:issued&gt;
132 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
133 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
134 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#StillImage-003"/&gt;
135 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
136 &lt;rdfs:subClassOf rdf:resource="http://purl.org/dc/dcmitype/Image"/&gt;
137 &lt;/rdf:Description&gt;
138 &lt;rdf:Description rdf:about="http://purl.org/dc/dcmitype/MovingImage"&gt;
139 &lt;rdfs:label xml:lang="en-US"&gt;Moving Image&lt;/rdfs:label&gt;
140 &lt;rdfs:comment xml:lang="en-US"&gt;A series of visual representations imparting an impression of motion when shown in succession.&lt;/rdfs:comment&gt;
141 &lt;dcterms:description xml:lang="en-US"&gt;Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image.&lt;/dcterms:description&gt;
142 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcmitype/"/&gt;
143 &lt;dcterms:issued&gt;2003-11-18&lt;/dcterms:issued&gt;
144 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
145 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
146 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#MovingImage-003"/&gt;
147 &lt;dcam:memberOf rdf:resource="http://purl.org/dc/terms/DCMIType"/&gt;
148 &lt;rdfs:subClassOf rdf:resource="http://purl.org/dc/dcmitype/Image"/&gt;
149 &lt;/rdf:Description&gt;
150 &lt;/rdf:RDF&gt;
151                     

This site is run by Joshua Tauberer &lt;http://razor.occams.info&gt;.
</pre>

 [RefreshCache](http://dublincore.org/usageboardwiki/DctypeValidated?action=refresh&arena=Page.py&key=DctypeValidated.text_html) for this page (cached 2012-12-09 11:11:03)  

Immutable page (last edited 2007-12-18 09:10:19 by TomBaker)


---
title: "- DcamValidated"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/DcamValidated.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DcamValidated](http://dublincore.org/usageboardwiki/DcamValidated?action=fullsearch&value=DcamValidated&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/DcamValidated?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/DcamValidated "View")
- [Diffs](http://dublincore.org/usageboardwiki/DcamValidated?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/DcamValidated?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/DcamValidated?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/DcamValidated?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/DcamValidated?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/DcamValidated?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/DcamValidated?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/DcamValidated?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/DcamValidated?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/DcamValidated?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/DcamValidated?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/DcamValidated">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DcamValidated_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DcamValidated_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

The document as Notation 3 <pre>@prefix dcam: &lt;http://purl.org/dc/dcam/&gt; .
@prefix xml: &lt;http://www.w3.org/XML/1998/namespace&gt; .
@prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt; .
@prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .
&lt;http://purl.org/dc/dcam/&gt; dcterms:title "DCMI Namespace for metadata terms related to the DCMI Abstract Model"@en-US ;
        dcterms:publisher "The Dublin Core Metadata Initiative"@en-US ;
        dcterms:modified "2008-01-14" .
dcam:memberOf rdf:type rdf:Property ;
        rdfs:label "Member Of"@en-US ;
        rdfs:comment "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcam/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdf:Property ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#memberOf-001&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/2007/06/04/abstract-model/&gt; .
dcam:VocabularyEncodingScheme rdf:type rdfs:Class ;
        rdfs:label "Vocabulary Encoding Scheme"@en-US ;
        rdfs:comment "An enumerated set of resources."@en-US ;
        rdfs:isDefinedBy &lt;http://purl.org/dc/dcam/&gt; ;
        dcterms:issued "2008-01-14" ;
        rdf:type rdfs:Class ;
        dcterms:hasVersion &lt;http://dublincore.org/usage/terms/history/#VocabularyEncodingScheme-001&gt; ;
        rdfs:seeAlso &lt;http://dublincore.org/documents/2007/06/04/abstract-model/&gt; .

      The underlying triples

&lt;http://purl.org/dc/dcam/&gt; &lt;http://purl.org/dc/terms/title&gt; "DCMI Namespace for metadata terms related to the DCMI Abstract Model"@en-US .
&lt;http://purl.org/dc/dcam/&gt; &lt;http://purl.org/dc/terms/publisher&gt; "The Dublin Core Metadata Initiative"@en-US .
&lt;http://purl.org/dc/dcam/&gt; &lt;http://purl.org/dc/terms/modified&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Member Of"@en-US .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set."@en-US .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcam/&gt; .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#Property&gt; .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#memberOf-001&gt; .
&lt;http://purl.org/dc/dcam/memberOf&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/2007/06/04/abstract-model/&gt; .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/2000/01/rdf-schema#label&gt; "Vocabulary Encoding Scheme"@en-US .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/2000/01/rdf-schema#comment&gt; "An enumerated set of resources."@en-US .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/2000/01/rdf-schema#isDefinedBy&gt; &lt;http://purl.org/dc/dcam/&gt; .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://purl.org/dc/terms/issued&gt; "2008-01-14" .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#type&gt; &lt;http://www.w3.org/2000/01/rdf-schema#Class&gt; .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://purl.org/dc/terms/hasVersion&gt; &lt;http://dublincore.org/usage/terms/history/#VocabularyEncodingScheme-001&gt; .
&lt;http://purl.org/dc/dcam/VocabularyEncodingScheme&gt; &lt;http://www.w3.org/2000/01/rdf-schema#seeAlso&gt; &lt;http://dublincore.org/documents/2007/06/04/abstract-model/&gt; .

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
11 &lt;rdf:Description rdf:about="http://purl.org/dc/dcam/"&gt;
12 &lt;dcterms:title xml:lang="en-US"&gt;DCMI Namespace for metadata terms related to the DCMI Abstract Model&lt;/dcterms:title&gt;
13 &lt;dcterms:publisher xml:lang="en-US"&gt;The Dublin Core Metadata Initiative&lt;/dcterms:publisher&gt;
14 &lt;dcterms:modified&gt;2008-01-14&lt;/dcterms:modified&gt;
15 &lt;/rdf:Description&gt;
16 &lt;rdf:Property rdf:about="http://purl.org/dc/dcam/memberOf"&gt;
17 &lt;rdfs:label xml:lang="en-US"&gt;Member Of&lt;/rdfs:label&gt;
18 &lt;rdfs:comment xml:lang="en-US"&gt;A relationship between a resource and a vocabulary encoding scheme which indicates that the resource is a member of a set.&lt;/rdfs:comment&gt;
19 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcam/"/&gt;
20 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
21 &lt;rdf:type rdf:resource="http://www.w3.org/1999/02/22-rdf-syntax-ns#Property"/&gt;
22 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#memberOf-001"/&gt;
23 &lt;rdfs:seeAlso rdf:resource="http://dublincore.org/documents/2007/06/04/abstract-model/"/&gt;
24 &lt;/rdf:Property&gt;
25 &lt;rdfs:Class rdf:about="http://purl.org/dc/dcam/VocabularyEncodingScheme"&gt;
26 &lt;rdfs:label xml:lang="en-US"&gt;Vocabulary Encoding Scheme&lt;/rdfs:label&gt;
27 &lt;rdfs:comment xml:lang="en-US"&gt;An enumerated set of resources.&lt;/rdfs:comment&gt;
28 &lt;rdfs:isDefinedBy rdf:resource="http://purl.org/dc/dcam/"/&gt;
29 &lt;dcterms:issued&gt;2008-01-14&lt;/dcterms:issued&gt;
30 &lt;rdf:type rdf:resource="http://www.w3.org/2000/01/rdf-schema#Class"/&gt;
31 &lt;dcterms:hasVersion rdf:resource="http://dublincore.org/usage/terms/history/#VocabularyEncodingScheme-001"/&gt;
32 &lt;rdfs:seeAlso rdf:resource="http://dublincore.org/documents/2007/06/04/abstract-model/"/&gt;
33 &lt;/rdfs:Class&gt;
34 &lt;/rdf:RDF&gt;
35   
36   
37                      

This site is run by Joshua Tauberer &lt;http://razor.occams.info&gt;.
</pre>

 [RefreshCache](http://dublincore.org/usageboardwiki/DcamValidated?action=refresh&arena=Page.py&key=DcamValidated.text_html) for this page (cached 2012-12-22 20:22:08)  

Immutable page (last edited 2007-12-18 09:09:50 by TomBaker)


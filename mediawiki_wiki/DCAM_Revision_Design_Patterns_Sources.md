---
title: DCAM Revision Design Patterns Sources
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision_Design_Patterns_Sources.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 May 2012, at 22:18.  
This page has been accessed 89,969 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#DCAM_design_patterns"><span class="tocnumber">1</span> <span class="toctext">DCAM design patterns</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#Examples_from_DC-RDF_Appendix_A_.282008.29"><span class="tocnumber">1.1</span> <span class="toctext">Examples from DC-RDF Appendix A (2008)</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#Examples_from_Gordon"><span class="tocnumber">1.2</span> <span class="toctext">Examples from Gordon</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Examples_from_Karen"><span class="tocnumber">1.3</span> <span class="toctext">Examples from Karen</span></a></li>
            <li class="toclevel-2 tocsection-5"><a href="#Examples_from_Alistair"><span class="tocnumber">1.4</span> <span class="toctext">Examples from Alistair</span></a></li>
            <li class="toclevel-2 tocsection-6"><a href="#Examples_from_DC-DSP_.282008.29"><span class="tocnumber">1.5</span> <span class="toctext">Examples from DC-DSP (2008)</span></a></li>
          </ul>
        </li>
        <li class="toclevel-1 tocsection-7"><a href="#Higher_level_examples_from_library_and_archive_communities"><span class="tocnumber">2</span> <span class="toctext">Higher level examples from library and archive communities</span></a></li>
      </ul>
    </td>
  </tr>
</table>

## DCAM design patterns 

### Examples from DC-RDF Appendix A (2008) 

Source: [http://dublincore.org/documents/dc-rdf/](http://dublincore.org/documents/dc-rdf/)

The following examples use the DC-TEXT syntax for describing examples of Dublin Core metadata. The corresponding RDF graph is then presented, using the RDF/XML syntax. Familiarity with the "striped" RDF/XML syntax is assumed. The W3C RDF Validator service may be used to convert these RDF/XML samples to triples and graphs.

<table width="100%" border="1" cellspacing="2" cellpadding="2">
  <tr>
    <th> Description
    </th>
    <th> DC-TEXT representation
    </th>
    <th> RDF/XML representation
    </th>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a value URI to identify the value.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has the subject identified by the URI <code><a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a></code>."<br>
    </td>
    <td>
      <pre>@prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>&gt; )<br> Statement (<br> PropertyURI ( dcterms:subject )<br> ValueURI ( &lt;<a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a>&gt; )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>"&gt;<br> &lt;dcterms:subject rdf:resource="<a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a>"/&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a single value string and a vocabulary encoding scheme to describe the value.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has the subject named 'Ornitology' from the Vocabulary Encoding Scheme <code><a href="http://example.org/taxonomy/MyVocab" class="external free" rel="nofollow">http://example.org/taxonomy/MyVocab</a></code>"<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br>@prefix ex: &lt;<a href="http://example.org/taxonomy/" class="external free" rel="nofollow">http://example.org/taxonomy/</a>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>&gt; )<br> Statement (<br> PropertyURI ( dcterms:subject )<br> VocabularyEncodingSchemeURI ( ex:MyVocab )<br> ValueString ( "Ornitology" )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"<br> xmlns:ex="<a href="http://example.org/taxonomy/" class="external free" rel="nofollow">http://example.org/taxonomy/</a>"<br> xmlns:dcam="<a href="http://purl.org/dc/dcam/" class="external free" rel="nofollow">http://purl.org/dc/dcam/</a>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>"&gt;<br> &lt;dcterms:subject&gt;<br> &lt;rdf:Description&gt;<br> &lt;dcam:memberOf rdf:resource="<a href="http://example.org/taxonomy/MyVocab" class="external free" rel="nofollow">http://example.org/taxonomy/MyVocab</a>"/&gt;<br> &lt;rdf:value&gt;Ornitology&lt;/rdf:value&gt;<br> &lt;/rdf:Description&gt;<br> &lt;/dcterms:subject&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses aÂ language-tagged literal value.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has the title 'Learning Biology' in english"<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>&gt; )<br> Statement (<br> PropertyURI ( dcterms:title )<br> LiteralValueString ( "Learning Biology" <br> Language ( "en" )<br> )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>"&gt;<br> &lt;dcterms:title xml:lang="en"&gt;Learning Biology&lt;/dcterms:title&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a literal value with a Syntax encoding scheme.<br>
      <br>
       "The resource <code><a href="http://example.org/person123" class="external free" rel="nofollow">http://example.org/person123</a></code> has the an age of 43"<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br>@prefix ex: &lt;<a href="http://example.org/ns#" class="external free" rel="nofollow">http://example.org/ns#</a>&gt; .<br><code>@prefix xsd: &lt;<a href="http://www.w3.org/2001/XMLSchema#" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#</a></code>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/person123" class="external free" rel="nofollow">http://example.org/person123</a>&gt; )<br> Statement (<br> PropertyURI ( ex:age )<br> LiteralValueString ( "43" <br> SyntaxEncodingSchemeURI ( xsd:int )<br> )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"<br> xmlns:ex="<a href="http://example.org/ns#" class="external free" rel="nofollow">http://example.org/ns#</a>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/person123" class="external free" rel="nofollow">http://example.org/person123</a>"&gt;<br> &lt;ex:age rdf:datatype="<code><a href="http://www.w3.org/2001/XMLSchema#int" class="external free" rel="nofollow">http://www.w3.org/2001/XMLSchema#int</a></code>"&gt;<br> 43&lt;/ex:age&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses two value strings, one language tagged and one using a syntax encoding scheme, a vocabulary encoding scheme for the value and a value URI identifying the value.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has the subject from the Vocabulary Encoding Scheme <code><a href="http://example.org/taxonomy/MyVocab" class="external free" rel="nofollow">http://example.org/taxonomy/MyVocab</a></code> named 'Biology' in English and 'Biologi' in Swedish, which can be represented using the string "EA32" according to the Syntax Encoding Scheme <code><a href="http://example.org/taxonomy/SubjectEncoding" class="external free" rel="nofollow">http://example.org/taxonomy/SubjectEncoding</a></code>, and which is idenfified by the URI <code><a href="http://example.org/subject32" class="external free" rel="nofollow">http://example.org/subject32</a></code>"<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br>@prefix ex: &lt;<a href="http://example.org/taxonomy/" class="external free" rel="nofollow">http://example.org/taxonomy/</a>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>&gt; )<br> Statement (<br> PropertyURI ( dcterms:subject )<br> ValueURI ( &lt;<a href="http://example.org/subject32" class="external free" rel="nofollow">http://example.org/subject32</a>&gt; )<br> VocabularyEncodingSchemeURI ( ex:ExampleSubjects )<br> ValueString ( "Biology"<br> Language ( "en" )<br> )<br> ValueString ( "Biologi"<br> Language ( "sv" )<br> )<br> ValueString ( "EA32"<br> SyntaxEncodingSchemeURI ( ex:SubjectEncoding )<br> )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"<br> xmlns:ex="<a href="http://example.org/taxonomy/" class="external free" rel="nofollow">http://example.org/taxonomy/</a>"<br> xmlns:dcam="<a href="http://purl.org/dc/dcam/" class="external free" rel="nofollow">http://purl.org/dc/dcam/</a>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>"&gt;<br> &lt;dcterms:subject&gt;<br> &lt;rdf:Description rdf:about="<a href="http://example.org/subject32" class="external free" rel="nofollow">http://example.org/subject32</a>"&gt;<br> &lt;dcam:memberOf<br> rdf:resource="<a href="http://example.org/taxonomy/ExampleSubjects" class="external free" rel="nofollow">http://example.org/taxonomy/ExampleSubjects</a>"/&gt;<br> &lt;rdf:value xml:lang="en"&gt;Biology&lt;/rdf:value&gt;<br> &lt;rdf:value xml:lang="sv"&gt;Biologi&lt;/rdf:value&gt;<br> &lt;rdf:value<br> rdf:datatype="<span class="code"><code></code></span><a href="http://example.org/taxonomy/SubjectEncoding" class="external free" rel="nofollow">http://example.org/taxonomy/SubjectEncoding</a>"&gt;<br> EA32&lt;/rdf:value&gt;<br> &lt;/rdf:Description&gt;<br> &lt;/dcterms:subject&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a single value string and a value URI, together with a description of the value. The description of the value has two statements, each of which only has a value URI.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has the creator identified by <code><a href="http://example.org/person45" class="external free" rel="nofollow">http://example.org/person45</a></code>, represented by the string "John Smith". The resource <code><a href="http://example.org/person45" class="external free" rel="nofollow">http://example.org/person45</a></code> is a person who has the phone number identified by <code>tel: 358-555-1234567</code> (see <a href="http://tools.ietf.org/html/rfc3966" class="external mw-magiclink-rfc">RFC 3966</a>)."<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br>@prefix foaf: &lt;<code><a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a></code>&gt; .<br><br>DescriptionSet (<br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>&gt; )<br> Statement (<br> PropertyURI ( dcterms:creator )<br> ValueURI ( &lt;<a href="http://example.org/person45" class="external free" rel="nofollow">http://example.org/person45</a>&gt; )<br> ValueString ( "John Smith" )<br> )<br> )<br> <br> Description (<br> ResourceURI ( &lt;<a href="http://example.org/person45" class="external free" rel="nofollow">http://example.org/person45</a>&gt; )<br> Statement (<br> PropertyURI ( foaf:phone )<br> ValueURI ( &lt;tel: 358-555-1234567&gt; )<br> )<br> Statement (<br> PropertyURI ( dcterms:type )<br> ValueURI ( foaf:Person )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"<br> xmlns:foaf="<code><a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a></code>"&gt;<br><br> &lt;rdf:Description rdf:about="<a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a>"&gt;<br> &lt;dcterms:creator&gt;<br> &lt;foaf:Person rdf:about="<a href="http://example.org/person45" class="external free" rel="nofollow">http://example.org/person45</a>"&gt;<br> &lt;rdf:value&gt;John Smith&lt;/rdf:value&gt;<br> &lt;foaf:phone rdf:resource="tel: 358-555-1234567"/&gt;<br> &lt;/foaf:Person&gt;<br> &lt;/dcterms:creator&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a value URI but no described resource URI.<br>
      <br>
       "The described resource has the subject identified by the URI <code><a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a></code>."
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br><br>DescriptionSet (<br> Description (<br> Statement (<br> PropertyURI ( dcterms:subject )<br> ValueURI ( &lt;<a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a>&gt; )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"&gt;<br><br> &lt;rdf:Description&gt;<br> &lt;dcterms:subject rdf:resource="<a href="http://example.org/taxonomy/D003.53" class="external free" rel="nofollow">http://example.org/taxonomy/D003.53</a>"/&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
  <tr>
    <td> A description with a single statement, which uses a value string, but no value URI. The description of the value has no described resource URI, but has two statements, both of which use a value URI.<br>
      <br>
       "The resource <code><a href="http://example.org/123" class="external free" rel="nofollow">http://example.org/123</a></code> has a creator represented by the string "John Smith". The creator<span><font face="monospace"></font></span><code></code> is a person who has the phone number identified by <code>tel: 358-555-1234567</code> (see <a href="http://tools.ietf.org/html/rfc3966" class="external mw-magiclink-rfc">RFC 3966</a>)."<br>
    </td>
    <td>
      <pre> @prefix dcterms: &lt;<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>&gt; .<br>@prefix foaf: &lt;<code><a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a></code>&gt; .<br><br>DescriptionSet (<br> Description (<br> Statement (<br> PropertyURI ( dcterms:creator )<br> ValueId ( "john" )<br> ValueString ( "John Smith" )<br> )<br> )<br> <br> Description (<br> ResourceId ( "john" )<br> Statement (<br> PropertyURI ( foaf:phone )<br> ValueURI ( &lt;tel: 358-555-1234567&gt; )<br> )<br> Statement (<br> PropertyURI ( dcterms:type )<br> ValueURI ( foaf:Person )<br> )<br> )<br>)
</pre>
    </td>
    <td>
      <pre> &lt;rdf:RDF xmlns:rdf="<span class="code"><code><a href="http://www.w3.org/1999/02/22-rdf-syntax-ns#" class="external free" rel="nofollow">http://www.w3.org/1999/02/22-rdf-syntax-ns#</a></code></span>"<br> xmlns:dcterms="<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>"<br> xmlns:foaf="<code><a href="http://xmlns.com/foaf/0.1/" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/</a></code>"<br><br> &lt;rdf:Description&gt;<br> &lt;dcterms:creator&gt;<br> &lt;foaf:Person&gt;<br> &lt;rdf:value&gt;John Smith&lt;/rdf:value&gt;<br> &lt;foaf:phone rdf:resource="tel: 358-555-1234567"/&gt;<br> &lt;/foaf:Person&gt;<br> &lt;/dcterms:creator&gt;<br> &lt;/rdf:Description&gt;<br><br>&lt;/rdf:RDF&gt;
</pre>
    </td>
  </tr>
</table>

### Examples from Gordon 

Source: [https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&L=DC-ARCHITECTURE&P=6405](https://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind1202&L=DC-ARCHITECTURE&P=6405)

Expressing library metadata schemas in RDF to support linked data in the Semantic Web has identified requirements for several types of named graph/DCAP features/data lenses:

- Aggregated statements, e.g. the publication statement composed of publication place, publisher name, publication date: the data can be aggregated in an unstructured string, a structured string using, say, ISBD punctuation according to a Syntax Encoding Scheme, or as a named graph containing the individual component triples. btw, it could be argued that this represents a blur between Pete's things-in-the-world and things-in-the-data, as many cataloguers would regard the whole statement as a thing-in-the-world and its components as things-in-the-data.
- Repeatable "fields" and "subfields", such as a classification statement containing notation, source, and edition (e.g. MODS): a named graph is required to keep the component triples together.
- Subsets of properties, designated as mandatory/core, desirable, full, etc (e.g. RDA, ISBD).: named graphs which overlap or subsume one within the other. These can be used for validating conformance of instance data.
- Sets of properties that have different constraints in different applications, such as ISBD's "mandatory if applicable": used for properties which apply only a specific type of resources, such as music, manuscripts, etc.
- Subsets of properties meeting user tasks, such as FRBR's Group 1 (WEMI): the relationships between the subsets need advanced ontological concepts such as cardinality.
- Sets of properties defining schema-schema mappings between properties in different namespaces.

### Examples from Karen 

Source: [http://dublincore.org/dcmirdataskgroup/apDesigns](http://dublincore.org/dcmirdataskgroup/apDesigns)

- Statement: A Simple String. The simplest metadata statement describes a property that takes a simple string value ("literal"), with no constraints.

- Mandatory and Repeatable. Both description templates and statement templates can be coded as mandatory/optional and repeatable/not repeatable. This is done using the values "minimum" and "maximum". The most commonly used values are: ...

- The following code defines a property ("title") that is required and not repeatable: ...

- Using Controlled Lists. One way to assure consistency of metadata use is to require that values be taken from a controlled list. Controlled lists can be short ("yes" "no" "maybe") or they can be long (such as the Library of Congress Subject Headings, which number about 250,000).
  - Vocabulary Encoding Scheme. To define a property as taking a member of a controlled list as its value using the terms of the DC Application Profile, the controlled list is called a "Vocabulary Encoding Scheme" and the list itself is represented with its identifier, a URI. Use of a list can be mandatory or optional.
    - This code illustrates a "subject" property that optionally can use terms from the LC Subject Heading list...
    - This code shows a subject property that requires the use of a term from the LCSH list...
  - Short lists in-line. If you have a short list that you wish to embed in the DSP you can do that using the "LiteralOption". Each term is listed, and values must be taken from the list: ...
    - You can support multiple languages with the LiteralOption by including the XML "lang" attribute: ...

### Examples from Alistair 

Source: [http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/constraints/index.html](http://aliman.googlecode.com/svn/trunk/sodc/SoDC-0.2/constraints/index.html)

- Resource Profiles. A resource profile is a set of constraints on the properties of a resource described in some graph. The following constraints can be expressed in a resource profile...
  - property cardinality constraints
    - exact cardinality -- the resource must have exactly n values for a given property
    - minimum cardinality -- the resource must have at least n values for a given property
    - maximum cardinality -- the resource must have at most n values for a given property
  - property value constraints
    - URI value -- the resource must have only URI values for a given property
    - blank node value -- the resource must have only blank node values for a given property
    - plain literal value (language optional) -- the resource must have only plain literal values for a given property
    - plain literal value (language required) -- the resource must have only plain literal values with language tags for a given property
    - TODO plain literal value (language optional, fixed) -- the resource must have only plain literal values for a given property, and where the plain literal has a language tag, it must take a given value
    - TODO plain literal value (language required, fixed) -- the resource must have only plain literal values with a given language tag for a given property
    - TODO typed literal value -- the resource must have only typed literal values for a given property
    - TODO typed literal value (datatype fixed) -- the resource must have only typed literal values with a given datatype for a given property TODO XML literal value -- the resource must have only XML literal values for a given property
  - given property value constraints
    - TODO given URI value -- the resource must have a given URI value for a given property
    - TODO given plain literal value -- the resource must have a given plain literal value for a given property
    - TODO given typed literal value -- the resource must have a given typed literal value for a given property
  - referential integrity constraints
    - TODO URI value reference -- the URI value of a given property must also be the subject of another description within the same graph
    - TODO blank node reference -- the blank node value of a given property must also be the subject of another description within the same graph 
    - TODO reference with profile -- the URI or blank node value of a given property must also be the subject of another description within the same graph, and the given profile must be specified in that description
- Graph Profiles. A graph profile is a set of constraints on a graph. The following constraints can be expressed...
  - TODO the graph must describe exactly n resources
  - TODO the graph must describe at least n resources
  - TODO the graph must describe at most n resources
  - TODO the graph must describe exactly n resources with resource profile p
  - TODO the graph must describe at least n resources with resource profile p
  - TODO the graph must describe at most n resources with resource profile p
  - TODO all resources in the graph must have a resource profile
  - TODO all resources in the graph must have resource profile p
- SoDC-CL Language & Examples
  - For example, the SoDC-CL document below defines two resource profiles. The first constrains a resource to have exactly one plain literal value for the dc:title property, and at least one URI value for the dc:creator property. The second constrains a resource to have at least one plain literal value for the foaf:name property...
<pre> &lt;?xml version="1.0" encoding="UTF-8"?&gt;
           &lt;constraints name="simple constraints" 
             xmlns="<a href="http://purl.org/net/sodc/cl" class="external free" rel="nofollow">http://purl.org/net/sodc/cl</a>"&gt;

             &lt;profile uri="<a href="http://example.com/profile/simple#book" class="external free" rel="nofollow">http://example.com/profile/simple#book</a>"&gt;
               &lt;constraint property="<a href="http://purl.org/dc/elements/1.1/title" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/title</a>"&gt;
                 &lt;cardinality&gt;1&lt;/cardinality&gt;
               &lt;/constraint&gt;
               &lt;constraint property="<a href="http://purl.org/dc/elements/1.1/title" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/title</a>"&gt;
                 &lt;value&gt;
                   &lt;plainliteral/&gt;
                 &lt;/value&gt;
               &lt;/constraint&gt;
               &lt;constraint property="<a href="http://purl.org/dc/elements/1.1/creator" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/creator</a>"&gt;
                 &lt;mincardinality&gt;1&lt;/mincardinality&gt;
               &lt;/constraint&gt;
               &lt;constraint property="<a href="http://purl.org/dc/elements/1.1/creator" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/creator</a>"&gt;
                 &lt;value&gt;
                   &lt;uri/&gt;
                 &lt;/value&gt;
               &lt;/constraint&gt;
             &lt;/profile&gt;
              
             &lt;profile uri="<a href="http://example.com/profile/simple#person" class="external free" rel="nofollow">http://example.com/profile/simple#person</a>"&gt;
               &lt;constraint property="<a href="http://xmlns.com/foaf/0.1/name" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/name</a>"&gt;
                 &lt;mincardinality&gt;1&lt;/mincardinality&gt;
               &lt;/constraint&gt;
               &lt;constraint property="<a href="http://xmlns.com/foaf/0.1/name" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/name</a>"&gt;
                 &lt;value&gt;
                   &lt;plainliteral/&gt;
                 &lt;/value&gt;
               &lt;/constraint&gt;
             &lt;/profile&gt;
              
           &lt;/constraints&gt;
</pre>
- Applying Resource Profiles in SoDC-XML. A resource profile must of course be applied to specific resources in some graph. In other words, some information must be provided which can be used to determine which resources in some graph must match which resource profiles. The SoDC-XML syntax is designed to allow this information to be embedded in the graph, via the profile element. For example, the graph below has embedded profile information...
<pre> &lt;?xml version="1.0" encoding="UTF-8"?&gt;
           &lt;graph xmlns="<a href="http://purl.org/net/sodc/xml" class="external free" rel="nofollow">http://purl.org/net/sodc/xml</a>"&gt;  

             &lt;resource&gt;
               &lt;uri&gt;<a href="http://example.com/book#1" class="external free" rel="nofollow">http://example.com/book#1</a>&lt;/uri&gt;
               &lt;profile&gt;<a href="http://example.com/profile/simple#book" class="external free" rel="nofollow">http://example.com/profile/simple#book</a>&lt;/profile&gt;
               ... etc ...
</pre>
### Examples from [DC-DSP](http://dublincore.org/documents/dc-dsp/#sect-4) (2008) 

- 4.1. Example 1: Constraining the resource

The following DSP matches descriptions with a single resource. The resource must be an instance of foaf:Person.

<pre>&lt;?xml version="1.0" ?&gt;
&lt;DescriptionSetTemplate xmlns="<a href="http://dublincore.org/xml/dc-dsp/2008/03/31" class="external free" rel="nofollow">http://dublincore.org/xml/dc-dsp/2008/03/31</a>" &gt;
  &lt;DescriptionTemplate ID="person" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
    &lt;ResourceClass&gt;<a href="http://xmlns.com/foaf/0.1/Person" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/Person</a>&lt;/ResourceClass&gt;
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

As it stands, this DSP does not allow for the description of that resource to contain any statements, so it is not very useful.

- 4.2. Example 2: Constraining a property

The following DSP adds a mandatory foaf:name property with a literal value to the previous example.

<pre>&lt;?xml version="1.0" ?&gt;
&lt;DescriptionSetTemplate xmlns="<a href="http://dublincore.org/xml/dc-dsp/2008/03/31" class="external free" rel="nofollow">http://dublincore.org/xml/dc-dsp/2008/03/31</a>"&gt;
  &lt;DescriptionTemplate ID="person" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
   &lt;ResourceClass&gt;<a href="http://xmlns.com/foaf/0.1/Person" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/Person</a>&lt;/ResourceClass&gt;
    &lt;StatementTemplate minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;<a href="http://xmlns.com/foaf/0.1/name" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/name</a>&lt;/Property&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>
- 4.3. Example 3: Constraining the value

The following DSP constrains the value to be a literal without a language.

<pre>&lt;?xml version="1.0" ?&gt;
&lt;DescriptionSetTemplate xmlns="<a href="http://dublincore.org/xml/dc-dsp/2008/03/31" class="external free" rel="nofollow">http://dublincore.org/xml/dc-dsp/2008/03/31</a>"&gt;
  &lt;DescriptionTemplate ID="person" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
    &lt;ResourceClass&gt;<a href="http://xmlns.com/foaf/0.1/Person" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/Person</a>&lt;/ResourceClass&gt;
    &lt;StatementTemplate minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;<a href="http://xmlns.com/foaf/0.1/name" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/name</a>&lt;/Property&gt;
      &lt;LiteralConstraint&gt;
        &lt;LanguageOccurrence&gt;disallowed&lt;/LanguageOccurrence&gt;
      &lt;/LiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>
- 4.4. Example 4: Two resources

The following DSP allows for two kinds of resources: a single "document", and multiple "authors". The Person resources may only occur as values of the dcterms:creator property, not stand-alone. The value may only be described in a separate description with a mandatory foaf:name property.

<pre>&lt;?xml version="1.0" ?&gt;
&lt;DescriptionSetTemplate xmlns="<a href="http://dublincore.org/xml/dc-dsp/2008/03/31" class="external free" rel="nofollow">http://dublincore.org/xml/dc-dsp/2008/03/31</a>"&gt;
  &lt;DescriptionTemplate ID="document" minOccurs="1" maxOccurs="1" standalone="yes"&gt;
    &lt;ResourceClass&gt;<a href="http://purl.org/dc/terms/Text" class="external free" rel="nofollow">http://purl.org/dc/terms/Text</a>&lt;/ResourceClass&gt;
    &lt;StatementTemplate minOccurs="1" type="nonliteral"&gt;
      &lt;Property&gt;<a href="http://purl.org/dc/terms/creator" class="external free" rel="nofollow">http://purl.org/dc/terms/creator</a>&lt;/Property&gt;
      &lt;NonLiteralConstraint descriptionTemplateID="person"&gt;
        &lt;ValueURIOccurrence&gt;disallowed&lt;/ValueURIOccurrence&gt;
        &lt;VocabularyEncodingSchemeOccurrence&gt;disallowed&lt;/VocabularyEncodingSchemeOccurrence&gt;
        &lt;ValueStringConstraint maxOccur="0"/&gt;
      &lt;/NonLiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
  &lt;DescriptionTemplate ID="person" standalone="no"&gt;
    &lt;ResourceClass&gt;<a href="http://xmlns.com/foaf/0.1/Person" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/Person</a>&lt;/ResourceClass&gt;
    &lt;StatementTemplate minOccurs="1" maxOccurs="1" type="literal"&gt;
      &lt;Property&gt;<a href="http://xmlns.com/foaf/0.1/name" class="external free" rel="nofollow">http://xmlns.com/foaf/0.1/name</a>&lt;/Property&gt;
      &lt;LiteralConstraint&gt;
        &lt;LanguageOccurrence&gt;disallowed&lt;/LanguageOccurrence&gt;
      &lt;/LiteralConstraint&gt;
    &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>
## Higher level examples from library and archive communities 

- Example: [Publication statement](/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement)
- Example: [Name heading](/mediawiki_wiki/DCAM_Revision_Example_Name_Heading)
- Example: [Core elements](/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements)
- Example: [Resource descriptions](/mediawiki_wiki/DCAM_Revision_High_Level_Example_Resource_Descriptions)
- [ISBD description set profile](/mediawiki_wiki/DCAM_Revision_ISBD_DSP)


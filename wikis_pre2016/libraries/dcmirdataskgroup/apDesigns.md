---
title: "- apDesigns"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/apDesigns.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [apDesigns](http://dublincore.org/dcmirdataskgroup/apDesigns?action=fullsearch&value=apDesigns&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Edit](http://dublincore.org/dcmirdataskgroup/apDesigns?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/apDesigns "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/apDesigns?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/apDesigns?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/apDesigns?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/apDesigns?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/apDesigns?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/apDesigns?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/apDesigns?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/apDesigns?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/apDesigns?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/apDesigns?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/apDesigns?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/apDesigns">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="apDesigns_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="apDesigns_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Some Application Profile Design Patterns

These design patterns are based on the Dublin Core Description Set Profile (DSP). The DSP structure is a single description set that contains one or more descriptions, each of which contains one or more metadata statements. Both the description and the metadata statements can define constraints on usage.

### Statement: A Simple String

The simplest metadata statement describes a property that takes a simple string value ("literal"), with no constraints.

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14
C:\dcmi\dcmi-dsp.xsd"&gt;
        &lt;DescriptionTemplate ID="resource" &gt;
                &lt;StatementTemplate ID="title" type="literal"&gt;
                        &lt;Property&gt;http://RDVocab.info/Elements/title&lt;/Property&gt;
                &lt;/StatementTemplate&gt;
                &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;</pre>

### Mandatory and Repeatable

Both description templates and statement templates can be coded as mandatory/optional and repeatable/not repeatable. This is done using the values "minimum" and "maximum". The most commonly used values are:

- "minimum = 0" means that the element is optional (the element is not required) [DEFAULT]

- "minimum = 1" means that the element must appear at least once. (the element is required)

- "maximum = 1" means that the element is can only appear once (the element is not repeatable)

- "maximum = infinite" or "maximum = [any non-negative number here]" means that the element can appear more than once, up to the maximum number (the element is repeatable) [DEFAULT]

The following code defines a property ("title") that is required and not repeatable:

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14
C:\dcmi\dcmi-dsp.xsd"&gt;
        &lt;DescriptionTemplate ID="resource" &gt;
                &lt;StatementTemplate ID="title" type="literal" minoccurs="1" maxoccurs="1"&gt;
                        &lt;Property&gt;http://RDVocab.info/Elements/title&lt;/Property&gt;
                &lt;/StatementTemplate&gt;
                &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;</pre>

### Using Controlled Lists

One way to assure consistency of metadata use is to require that values be taken from a controlled list. Controlled lists can be short ("yes" "no" "maybe") or they can be long (such as the Library of Congress Subject Headings, which number about 250,000).

To define a property as taking a member of a controlled list as its value using the terms of the DC Application Profile, the controlled list is called a "Vocabulary Encoding Scheme" and the list itself is represented with its identifier, a URI. Use of a list can be mandatory or optional.

This code illustrates a "subject" property that optionally can use terms from the LC Subject Heading list.

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14"&gt;
  &lt;DescriptionTemplate&gt;
    &lt;StatementTemplate type="nonliteral"&gt;
      &lt;Property&gt;http://purl.org/dc/terms/subject/&lt;/Property&gt;
         &lt;NonLiteralConstraint&gt;
            &lt;VocabularyEncodingSchemeOccurrence&gt;optional
            &lt;/VocabularyEncodingSchemeOccurrence&gt; 
            &lt;VocabularyEncodingSchemeURI&gt;http://purl.org/dc/terms/LCSH
            &lt;/VocabularyEncodingSchemeURI&gt; 
         &lt;/NonLiteralConstraint&gt;
     &lt;/StatementTemplate&gt;
  &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

This code shows a subject property that requires the use of a term from the LCSH list:

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14
C:\daisy\Business\dcmi\dcmi-dsp2.xsd"&gt;
  &lt;DescriptionTemplate&gt;
        &lt;StatementTemplate type="nonliteral"&gt;
                &lt;Property&gt;http://purl.org/dc/terms/subject/&lt;/Property&gt;
                &lt;NonLiteralConstraint&gt;
                        &lt;VocabularyEncodingSchemeOccurrence&gt;
                             mandatory
                        &lt;/VocabularyEncodingSchemeOccurrence&gt;
                        &lt;VocabularyEncodingSchemeURI&gt;http://purl.org/dc/terms/LCSH
                        &lt;/VocabularyEncodingSchemeURI&gt;
                &lt;/NonLiteralConstraint&gt;
                &lt;/StatementTemplate&gt;
        &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

If you have a short list that you wish to embed in the DSP you can do that using the " [LiteralOption](http://dublincore.org/dcmirdataskgroup/LiteralOption)". Each term is listed, and values must be taken from the list:

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14
C:\daisy\Business\dcmi\dcmi-dsp2.xsd"&gt;
  &lt;DescriptionTemplate&gt;
        &lt;StatementTemplate type="nonliteral"&gt;
                &lt;Property&gt;http://purl.org/dc/terms/subject/&lt;/Property&gt;
                &lt;NonLiteralConstraint&gt;
                        &lt;ValueStringConstraint minOccurs="1" maxOccurs="1"&gt;
                        &lt;LiteralOption&gt;red&lt;/LiteralOption&gt;
                        &lt;LiteralOption&gt;white&lt;/LiteralOption&gt;
                        &lt;LiteralOption&gt;blue&lt;/LiteralOption&gt;
                        &lt;/ValueStringConstraint&gt;
                &lt;/NonLiteralConstraint&gt;
                &lt;/StatementTemplate&gt;
        &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

You can support multiple languages with the [LiteralOption](http://dublincore.org/dcmirdataskgroup/LiteralOption) by including the XML "lang" attribute:

<pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;DescriptionSetTemplate xmlns="http://dublincore.org/xml/dc-dsp/2008/01/14" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://dublincore.org/xml/dc-dsp/2008/01/14
C:\daisy\Business\dcmi\dcmi-dsp2.xsd"&gt;
  &lt;DescriptionTemplate&gt;
        &lt;StatementTemplate type="nonliteral"&gt;
                &lt;Property&gt;http://purl.org/dc/terms/subject/&lt;/Property&gt;
                &lt;NonLiteralConstraint&gt;
                        &lt;ValueStringConstraint minOccurs="1" maxOccurs="1"&gt;
                        &lt;LiteralOption lang="en"&gt;red&lt;/LiteralOption&gt;
                        &lt;LiteralOption lang="en"&gt;white&lt;/LiteralOption&gt;
                        &lt;LiteralOption lang="en"&gt;blue&lt;/LiteralOption&gt;
                        &lt;LiteralOption lang="it"&gt;rosso&lt;/LiteralOption&gt;
                        &lt;LiteralOption lang="it"&gt;azzurro&lt;/LiteralOption&gt;
                        &lt;LiteralOption lang="it"&gt;bianco
                             &lt;LiteralOption&gt;                                    
                        &lt;/ValueStringConstraint&gt;
                &lt;/NonLiteralConstraint&gt;
                &lt;/StatementTemplate&gt;
        &lt;/DescriptionTemplate&gt;
&lt;/DescriptionSetTemplate&gt;
</pre>

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/apDesigns?action=refresh&arena=Page.py&key=apDesigns.text_html) for this page (cached 2012-12-25 15:22:30)  

Immutable page (last edited 2009-06-29 21:13:46 by KarenCoyle)


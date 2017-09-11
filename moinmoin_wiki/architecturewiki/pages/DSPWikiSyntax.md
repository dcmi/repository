---
title: "- DSPWikiSyntax"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DSPWikiSyntax.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DSPWikiSyntax](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=fullsearch&value=DSPWikiSyntax&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DSPWikiSyntax "View")
- [Diffs](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DSPWikiSyntax">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DSPWikiSyntax_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DSPWikiSyntax_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Draft: A MoinMoin Wiki Syntax for Description Set Profiles

**Important** : This document has been superseded by [http://dublincore.org/documents/2008/10/07/dsp-wiki-syntax/](http://dublincore.org/documents/2008/10/07/dsp-wiki-syntax/).

**Editor:** Fredrik Enoksson < [fen@csc.kth.se](mailto:fen@csc.kth.se)>, Knowmania HB, Sweden

- [DSP-wiki-syntax presentation as Powerpoint](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=AttachFile&do=get&target=DSP-wikisyntax-DC2007.ppt)

- [DSP-wiki-syntax presentation as PDF printout](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=AttachFile&do=get&target=DSP-wikisyntax-DC2007.pdf)

- [Presentation on usage of DSP-wiki-syntax in Eprints (as PDF printout)](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=AttachFile&do=get&target=2007-08-28-dsp-eprint.pdf)

<table>
  <tbody>
    <tr>
      <td bgcolor="#cef2f2">
        <ol>
          <li>
            <a href="#head-21e4100957686415ea22605b45d86ae3e31debd9">Design and description of the wiki syntax</a>
          </li>
          <ol>
            <li>
              <a href="#head-a8cf5d1a65034c57f0ae4348fa1f30c555658fb3">Expressing the different parts of a DSP</a>
            </li>
            <ol>
              <li>
                <a href="#head-3f0291ee7e0c587827d1b470885efb482c92da58">Expressing a Description Template</a>
              </li>
              <li>
                <a href="#head-2665e5b76252890360499559ea4ccac626af506e">Expressing a Statement Template</a>
              </li>
              <ol>
                <li>
                  <a href="#head-b312f0d38c8c5595ca3e4ecfc063d79180569e93">Expressing a literal value constraint</a>
                </li>
                <li>
                  <a href="#head-21fe2d4bd3e3a5d933f987b3a21ac8da491f8019">Expressing a non-literal Value Constraint</a>
                </li>
              </ol>
              <li>
                <a href="#head-eb01bf04c9a0e8a71c45816513df424f1c7ffedb">Examples</a>
              </li>
            </ol>
          </ol>
          <li>
            <a href="#head-3439e83eddd9b986dc9a370152a22cf7dcf9b189">Usage example</a>
          </li>
          <ol>
            <li>
              <a href="#head-f5509986e8e226b6b28844fec92b37c7f5a7fb7e">Example of the syntax</a>
            </li>
          </ol>
          <li>
            <a href="#head-6134bc0e7a72f4da9df208d88113bf5cfdcbc7e3">Description template</a>
          </li>
          <ol>
            <li>
              <a href="#head-768e0c1c69573fb588f61f1308a015c11468e05f">Title</a>
            </li>
            <li>
              <a href="#head-817b79b0af2db11da9523bd5738397ebf823132b">Creator</a>
            </li>
            <ol>
              <li>
                <a href="#head-706ca23805b223a2b6f5916b52b2f0d4c371522c">The resulting HTML:</a>
              </li>
              <li>
                <a href="#head-02074e8ed10761556c85276dc9f1ff1a57e8adb3">The resulting XML</a>
              </li>
            </ol>
          </ol>
        </ol>
      </td>
    </tr>
  </tbody>
</table>


This document describes a Wiki syntax for a Description Set Profile as defined in the DCMI Working Draft "Description Set Profiles: A constraint language for Dublin Core Application Profiles" of March 2008 [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[1](http://dublincore.org/documents/2008/03/31/dc-dsp/)]], which in turn is based on the DCMI Abstract Model [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[2](http://dublincore.org/documents/abstract-model)]. It is recommended to have some understanding of the concepts of Description Set Profile (abbreviated DSP in the rest of this document) before reading this document.

A DSP is a way of describing structural constraints on a description set and is not directly intended for human consumption. However, with the wiki-syntax for DSP described here makes it possible to mix normal wiki-syntax with specific DSP wiki syntax in order to document an Application Profile. This means that from the same source it is possible to create:

- A Dublin Core Application Profile that contains wiki-syntax for a Description Set Profile, but is rendered as an HTML-page for human consumption

- A formal serialization in XML for the same Description Set Profile, used for machine (computer) consumption

The DSP wiki-syntax and how to use is described in this document and is focused on an implementation done for the moinmoin wiki engine [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[3](http://moinmoin.wikiwikiweb.de/)]] with the help of an extension to that wiki-engine. The extension to the moinmoin wiki-engine to render a HTML-page, has been done by adding a parser extension. To call that parser, named DSP, inside a wiki-page the following syntax is used:

<pre> {{{#!DSP
  /* Here the specific Description Set Profile wiki-syntax to be parsed */
 }} }
</pre>Anything above and below is parsed according to the normal moinmoin wiki syntax. For more information about parsers in moinmoin-wiki visit [http://moinmoin.wikiwikiweb.de/HelpOnParsers](http://moinmoin.wikiwikiweb.de/HelpOnParsers) 

To create the DSP XML a so called action extension for the moinmoin wiki has been implemented, how to retrieve the XML will be described at the end of this document.

### 1. Design and description of the wiki syntax
As stated in the description of Description Set Profile [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[1](http://dublincore.org/architecturewiki/DescriptionSetProfile)]], it uses the notion of _constraint_ and _templates_ to describe the structure of a Description Set. There are two levels of templates in the DSP: 
- **Description templates** , that contains the statement templates that apply to a single kind of description as well as constraints on the described resource.

- **Statement templates** , that contains all the constraints on the property, value strings, vocabulary encoding schemes, etc. that apply to a single kind of statement.

These templates furthermore consist of constraints that are used to limit the structure. The relations between the templates and the constraints are depicted in the figure 1 below

<table>
  <tbody>
    <tr>
      <td>
        <img src="DSPWikiSyntax_files/DescriptionSetProfile.png" alt="http://dublincore.org/architecturewiki/DescriptionSetProfile?action=AttachFile&amp;do=get&amp;target=dsp-uml.png">
      </td>
    </tr>
    <tr>
      <td align="center">
        Figure 1</td>
    </tr>
  </tbody>
</table>


The hierarchical structure of the DSP is reused in the syntax in such a way that when a template or constraint has been declared it is a part of the first declared template above that it can be a part of according to the hierarchy (shown in figure 1). Ie if first a Description Template has been declared followed by a Statement Template, this Statement Template is seen as a part of that Description Template.

In the syntax 4 parts are possible to express on their own:

- **Description template** , directly corresponds to the description of it above.

- **Statement Template** , that also corresponds to the description above. However, a Statement can be either a _Literal Statement Template_ or _Non-Literal Statement Template_. Of which type it is can be expressed inside.

- **Non-Literal Value Constraint** , this corresponds to the value constraints for a _Non-Literal Statement Template_

- **Literal Value Constraint** this corresponds to the value constraints for a _Literal Statement Template_

Before describing the syntax in more detail, below is an empty template to serve as an example of how the structure looks like:

<pre> {{{#!DSP

 Any (moinmoin)wiki-format text, will be placed over the Description Template declared below when rendered
 DT=(ID="" RC=[] min="" max="" standalone="yes|no|both")

 Any (moinmoin)wiki-format text, that is placed above the Statement Template below when rendered  
 ST=(ID="" min="" max="" type="" PC=(""|{,})) 
    
 NLC=(description="" [] 
         VURIConstraint=( occurrence="mandatory|optional|disallowed" {,})
         VESConstraint=( occurrence="mandatory|optional|disallowed" {,})
         VStringConstraint=(min="" max="" {[value="" lang="" SES=""], [...]} 
                           LangC=(occurrence="mandatory|optional|disallowed" {,})
                           SESConstraint=(occurrence="mandatory|optional|disallowed" {,})
                          )
        )

 ST=(ID="" min="" max="" type="" PC=(""|{,})) 

 LC=({[value="" lang="" SES=""], [...]} 
        LangC=(occurrence="mandatory|optional|disallowed" {,})
        SESConstraint=(occurrence="mandatory|optional|disallowed" {,})
       )
 )

 ST=(...)
 

 DT=(...)

 ST=(...)
 
 ST=(...)
 }} }
</pre>

In between each expressed Description Template (DT), Statement Template (ST), [NonLiteral](http://dublincore.org/architecturewiki/NonLiteral) Constraint (NLC) and Literal Constraint (LC) the normal moinmoin wiki-syntax can be used.

Some small remarks on the usage of symbols in general in the format, when something in the format can have one and only one value it is placed between citation marks, as an example, see identifier for Description Template below. If the a set of choices is to be expressed the curly brackets are used in most places.

#### 1.1. Expressing the different parts of a DSP
As previously stated and seen in the template above the 4 basic parts are expressed with: 
- **DT** for a Description Template

- **ST** for a Statement Template

- **NLC** for a [NonLiteral](http://dublincore.org/architecturewiki/NonLiteral) Value Constraint

- **LC** for a Literal Value Constraint.

Each one of these expression has to start on a new line. As can also be seen from the template above it is possible to express normal wiki-syntax in between. This text does also need to start on a new line in order to not be mix up with the DSP wiki-syntax, this text is surrounding the parts of a DSP in the resulting HTML, but will be ignored when creating the XML for the DSP. This means that the HTML that is created for example an ST can be embedded into a table or some similar HTML construct. If the keywords DT, ST, NLC or LC needs to start on an new line in the normal wikisyntax, add a backslash ("\") before and the backslash will be ignored in the resulting HTML.

##### 1.1.1. Expressing a Description Template
Start a new line with "DT" followed by "=" and a starting left parenthesis and in order to close the declaration a right parenthesis is needed. The expression inside the parenthesis is allowed to span over more than one line. Expressed inside the parenthesis are the attributes: 
- **Identifier** , use the keyword "ID" followed by a "=" and a valid XML ID String inside citation marks

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>ID="Person"</tt>
      </td>
    </tr>
  </tbody>
</table>


- **Resource Class Membership Constraint** , is expressed in a list with the keyword RC followed by "=" and a list with the URIs inside angle brackets separated by a comma and a blankspace.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>RC=[http://www.anyuri.net/someResourceConstraint, http://www.anyuri.net/someOtherResourceConstraint]</tt>
      </td>
    </tr>
  </tbody>
</table>


- **Minimum occurrence constraint** , use the keyword "min" followed by a "=" with a non negative integer inside citation mark as the value

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>min="1"</tt>
      </td>
    </tr>
  </tbody>
</table>


- **Maximum occurrence constraint** , use the keyword "max" followed by a "=" with a non negative integer inside citation mark as the value,

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>max="1"</tt>
      </td>
    </tr>
  </tbody>
</table>


- **Standalone** , use the keyword standalone followed by a "=" with one of the following strings as possible values: "yes", "no" or "both" inside citation marks.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>standalone="yes"</tt>
      </td>
    </tr>
  </tbody>
</table>


For a more detailed description about these attributes see the section about Description Template in the description of DSP [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[DT](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-73b00486a2accebac7d388733ee6a7334cf016aa) ]]. Here conditions for the attributes and possible and default values are described in more detail.

The attributes of a Description Template can be declared inside the parenthesis in any order with blankspace as separator. If none of them are declared the parenthesis should be left empty. The Statment Templates that belong to a Description Template are the ones that are declared under until a new declaration of a Description Template occurrs.

<table>
  <tbody>
    <tr>
      <td>
        Example of a declaration of a Description Template:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>DT=(ID="Person" standalone="yes" RC=[http://www.anyuri.net/someResourceConstraint, http://www.anyuri.net/someOtherResourceConstraint] min="1" max="1")</tt>
      </td>
    </tr>
  </tbody>
</table>


##### 1.1.2. Expressing a Statement Template
A Statement Template is expressed in a similar way to the Description Template, starting on a new line with "ST=" followed by a left parenthesis and then closed by a right parenthesis. The expression inside the parenthesis is allowed to span over more than one line and the attributes inside are separated with a blankspace and is allowed to be in any order. Expressed inside the parenthesis are the attributes: 
- **Property list constraint** or **Sub-property constraint** , to declare this start with the keyword "PC" followed by "=" and one and only one of the following:

  - one URI within surrounding citation marks to declare a Sub Property Constraint

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>PC="http://purl.org/dc/elements/1.1/creator"</tt>
      </td>
    </tr>
  </tbody>
</table>


  - a set of URI:s, by using curly braces with comma and a blankspace as a separator to declare a Property List Constraint.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>PC={http://purl.org/dc/elements/1.1/creator, http://xmlns.com/foaf/0.1/name} </tt>
      </td>
    </tr>
  </tbody>
</table>


- **Minimum occurrence constraint** , use the keyword "min" followed by a "=" with a non negative integer inside citation mark as the value

<table>
  <tbody>
    <tr>
      <td>
        Example expression: </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        min="1"</td>
    </tr>
  </tbody>
</table>


- **Maximum occurrence constraint** , use the keyword "max" followed by a "=" with a non negative integer, larger than the minimum occurrence constraint, inside citation mark as the value

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        max="1"</td>
    </tr>
  </tbody>
</table>


- **Type Constraint** , is declared with the keyword "type" followed by a "=" and then either "_Literal_" or " _[NonLiteral](http://dublincore.org/architecturewiki/NonLiteral)_" inside citation marks. The value of this attribute decides if a Statement Template is of type Literal Statement Template or Non-literal Statement Template. If the attribute is not declared it will default to be both and no further value constraints on can be made according to the description of DSP [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">Statement Template type](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-e1f4f88a502b2e1354d3373f7da1a019e3d21096)].

<table>
  <tbody>
    <tr>
      <td>
        Example:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        type="literal"</td>
    </tr>
  </tbody>
</table>


For a more detailed description about these attributes see the section about Statement Template in the description of the DSP [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[ST](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-5159f8967f111d1c1d4534655ae29caed9bfa3e0)]], where conditions for the attributes and possible and default values are described in more detail.

<table>
  <tbody>
    <tr>
      <td>
        Example of the parts described above:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>ST=(min="1" max="10" PC="http://purl.org/dc/elements/1.1/creator" type="literal")</tt>
      </td>
    </tr>
  </tbody>
</table>


A Statement Template can be of either the type Literal Statement Template and have a Literal Value Constraint or of the type Non-literal Statement Template and have a Non-literal Value Constraint. These constraints correspond to the _Literal value surrogates_ and _Non-literal value surrogates_ respectively in the [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">Dublin Core Abstract Model](http://dublincore.org/documents/abstract-model/)]. To express constraints on a Statement Template they will be declared under the Statement Template that they belong to and they also need to start on a new line.

###### 1.1.2.1. Expressing a literal value constraint
When a Statement Template has got the type constraint set to Literal it is possible to further constrain the possible values, by declaring a Literal Value Constraint. To express this constraint the keyword "LC" followed by a "=" and a left parenthesis is used, at the end a right parenthesis is used to close the expression. The declaration of a Literal value constraint have to start on a new line. Inside the parenthesis the following parts can be expressed: 
- **Constraints on Syntax Encoding Scheme** , a set of such constraint are declared with the keyword "SESConstraint" followed by a "=" and a left parenthesis, a right parenthesis close the expression. Inside the parenthesis the following can be declared:

  - **Syntax Encoding Scheme constraint** that decides the occurrence of a Syntax Encoding Scheme constraint, starts with the keyword "occurrence" that have the possible values of _mandatory_, _optional_ or _disallowed_. If this part is not declared it will by default be "optional".

<table>
  <tbody>
    <tr>
      <td>
        example syntax:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>occurrence="mandatory"</tt>
      </td>
    </tr>
  </tbody>
</table>


  - **Syntax Encoding Scheme list constraint** , that states the syntax encoding schemes allowed for the literal, declared as a set of options (in the form of a URI) inside curly brackets, separated by a comma and a blankspace.

<table>
  <tbody>
    <tr>
      <td>
        Example syntax:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> {http://purl.org/dc/terms/URI} </tt> </td>
    </tr>
  </tbody>
</table>


- **Literal list constraint** , are the literals that are allowed as values and are declared as a set inside curly braces, each entry inside the curly braces are declared inside angle brackets and are separated with a comma and a blank space. Inside each entry a value is declared with the keyword "value" followed by a "=" and the value as a string, after the value either a language or a Syntax Encoding Scheme can be declared with the keywords "lang" or "SES" used respectively followed by a "=" and the value. For the language a ISO language tag are the valid values, for Syntax Encoding Scheme a URI is a valid value.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> {[value="A simple String" lang="en"], [...]} </tt>
      </td>
    </tr>
  </tbody>
</table>


- **Constraints on the language** , are declared by using the keyword "LangC" followed by "=" and a pair of parenthesis that inside contain:

  - **Literal language constraint** , that decides the occurrence of a language constraint, starts with the keyword "occurence" that have the possible values of _mandatory_, _optional_ or _disallowed_. If this part is not declared it will by default be "optional",

<table>
  <tbody>
    <tr>
      <td>
        Example syntax:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        occurrence="mandatory"</td>
    </tr>
  </tbody>
</table>


  - **Literal language list constraint** are declared as a set of languages choices expressed inside curly braces with comma and a blankspace as a separator. If no constraint is to be given this part can be left out.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> {en, sv, es} </tt>
      </td>
    </tr>
  </tbody>
</table>


For a more detailed description about the attributes for Literal Value Constraints see the section about this in the description of the DSP [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[LC](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-a956b3a98ea091ebcd800518eaaee2489610bdec)]], where conditions on the attributes and possible and default values are described in more detail.

<table>
  <tbody>
    <tr>
      <td>
        Example 1, how to express an LC:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> LC=( {[value="A typical string" lang="en"]}) </tt>
      </td>
    </tr>
  </tbody>
</table>


<table>
  <tbody>
    <tr>
      <td>
        Example 2, how to express an LC with languageConstraint:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>LC=( LangC=(occurrence="optional" {en, sv, es})) </tt>
      </td>
    </tr>
  </tbody>
</table>


###### 1.1.2.2. Expressing a non-literal Value Constraint
When an Statement Template has got the type constraint set to [NonLiteral](http://dublincore.org/architecturewiki/NonLiteral) it is possible to further constrain the possible values. To declare this constraint start on a new line and use the keyword "NLC" followed by a "=" and a left parenthesis, at the end of the NLC a right parenthesis is used to close the expression. The expression is allowed to span over more than one line. Inside the parenthesis the following parts can be expressed: 
- **Description template reference** , this is a reference to a description template that may be used to describe the value.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        description="ref"</td>
    </tr>
  </tbody>
</table>


- **Class membership constraint** , classes that the value may be an instance of (in the form of a URI) and is declared inside angle-brackets with comma and a blankspace as a separator.

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> {http://www.example.com/exampleURI1, ...} </tt>
      </td>
    </tr>
  </tbody>
</table>


- **Value URI Constraint** , are expressed with the keyword "VURIConstraint" with a following "=" followed by a left parenthesis and it is closed with a right one. Inside two arguments are provided:

  - **Value URI list constraint** , URIs that are allowed as value URIs. Declared as a set and expressed inside curly braces with comma and a blankspace as a separator,

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> {http://www.example.com/uri1, http://www.example.com/uri2} </tt>
      </td>
    </tr>
  </tbody>
</table>


  - **Value URI occurrence constraint** , that have the possible values of _mandatory_, _optional_ or _disallowed_.

<table>
  <tbody>
    <tr>
      <td>
        Example syntax:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        occurrence="mandatory"</td>
    </tr>
  </tbody>
</table>


  - Example of the ValueURIConstraint construct:

<table>
  <tbody>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> VURIConstraint=( occurrence="mandatory" {http://www.example.com/uri1, http://www.example.com/uri2})</tt> </td>
    </tr>
  </tbody>
</table>

- **Vocabulary encoding scheme constraint** , is used if a vocabulary encoding scheme must be given. This is declared almost the same way as ValueURIConstraint, but with the keyword "VESConstraint" used instead.

<table>
  <tbody>
    <tr>
      <td>
        Example expression</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> VESConstraint=( occurrence="mandatory" {http://www.example.com/uri3, http://www.example.com/uri4}) </tt>
      </td>
    </tr>
  </tbody>
</table>


- **Value String Constraint** are declared by using the keyword "V [StringConstraint](http://dublincore.org/architecturewiki/StringConstraint)" and with its argument inside left and right parenthesis. Inside the following is declared:

  - **Minimum occurrence constraint** , use the keyword "min" followed by a "=" with a non zero Integer inside citation mark as the value

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        min="1"</td>
    </tr>
  </tbody>
</table>


  - **Maximum occurrence constraint** , use the keyword "max" followed by a "=" with a non zero Integer inside citation mark as the value

<table>
  <tbody>
    <tr>
      <td>
        Example expression:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        max="1" </td>
    </tr>
  </tbody>
</table>


  - Apart from the _maximum_ and _minimum occurrence constraint_ the rest of the declaration of a Value String Constraint are done the same way as a [Literal Constraint]

For a more detailed description about the attributes for Non-Literal Value Constraints see the section about this in the description of the DSP [[<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">[NLC](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-87a4e839141cffc88091c1d2d57eaaf3ba1c5205)]], where conditions on the attributes and possible and default values are described in more detail.

<table>
  <tbody>
    <tr>
      <td>
        Example 1, how to declare an NLC:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> NLC=(description="ref" {http://www.example.com/exampleURI1}) </tt> </td>
    </tr>
  </tbody>
</table>


<table>
  <tbody>
    <tr>
      <td>
        Example 2 of an NLC with ValueURIConstraint:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> NLC=(description="ref" VURIConstraint=( occurrence="mandatory" {http://www.example.com/uri1, http://www.example.com/uri2})) </tt> </td>
    </tr>
  </tbody>
</table>


<table>
  <tbody>
    <tr>
      <td>
        Example 3 of an NLC with VESConstraint:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> NLC=(description="ref" VESConstraint=( occurrence="mandatory" {http://www.example.com/uri3, http://www.example.com/uri4})) </tt> </td>
    </tr>
  </tbody>
</table>


<table>
  <tbody>
    <tr>
      <td>
        Example 4 of an NLC with <a class="nonexistent" href="http://dublincore.org/architecturewiki/ValueStringConstraint">ValueStringConstraint</a>:</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66">
        <tt> NLC=(description="ref" VStringConstraint=(min="1" max="1" </tt><br>
        <tt> {[value="someFormat:Format2" lang="en" SES="http://www.example.org/someSyntaxEncodingScheme"]})) </tt>
      </td>
    </tr>
  </tbody>
</table>


##### 1.1.3. Examples
The DC-XML example in the Description Set Profile, [<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">DC example](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-eb01bf04c9a0e8a71c45816513df424f1c7ffedb) and [<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">FOAF Example](http://dublincore.org/architecturewiki/DescriptionSetProfile#head-0441a95b1d0d8e30874a4495b77aa328b0e00cb3), in wiki-format: 

DC Example:

<table>
  <tbody>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>{{{#!DSP </tt><br>
        <br>
        <tt>DT=()</tt> <br>
        <br>
        <tt>ST=(PC={http://purl.org/dc/terms/title})</tt><br>
        <br>
        <tt>ST=(PC={http://purl.org/dc/terms/description})</tt><br>
        <br>
        <tt>}} } </tt>
      </td>
    </tr>
  </tbody>
</table>


FOAF Example:

<table>
  <tbody>
    <tr>
      <td bgcolor="#CCFF66">
        <tt>{{{#!DSP</tt><br>
        <br>
        <tt>DT=( ID="Person" RC=[http://xmlns.com/foaf/0.1/Person] min=1 max=1 )</tt><br>
        <br>
        <tt>ST=( min=1 max=1 type="literal" PC={http://xmlns.com/foaf/0.1/name} ) </tt> <br>
        <br>
        <tt>ST=( type="literal" PC={http://xmlns.com/foaf/0.1/knows} )</tt><br>
        <br>
        <tt>NLC=({http://xmlns.com/foaf/0.1/Person})</tt><br>
        <br>
        <tt>}} </tt>}</td>
    </tr>
  </tbody>
</table>


### 2. Usage example
The implementation of this syntax has been done as an extension to the the moinmoin wiki engine. Below follows an example and it will show how the syntax will be rendered in HTML and also how the resulting XML looks like. 
#### 2.1. Example of the syntax
With the extension to the moinmoin wiki engine installed the syntax described in this document can be used on a page. It will be parsed as a Description Set Profile, below is an example: <pre> {{{#!DSP
 == Description template ==
 DT=(min="1" max="1" standalone="yes")

 === Title ===
 ----
 ST=(type="literal" PC={http://purl.org/dc/terms/title})
 || Definition || A name given to the resource. ||
 LC=(LangC=(occurrence="optional") SESConstraint=(occurrence="disallowed") )

 === Creator ===
 ----
 ST=(type="nonliteral" PC={http://purl.org/dc/terms/creator})
 || Definition || An entity primarily responsible for making the resource. ||
 || Comment || Examples of a Creator include a person, an organization, or a service. 
 Typically, the name of a Creator should be used to indicate the entity. ||
 NLC=( VURIConstraint=( occurrence="disallowed") VESConstraint=( occurrence="disallowed" ) VStringConstraint=(max="1" 
 LangC=(occurrence="optional") SESConstraint=(occurrence="disallowed") ) )
 }} }
</pre>

##### 2.1.1. The resulting HTML:
The example of the syntax above will render [<img src="DSPWikiSyntax_files/moin-www.png" alt="[WWW]" height="11" width="11">this HTML-page](http://dublincore.org/architecturewiki/DSPUsageExample) 
##### 2.1.2. The resulting XML
From the wiki-syntax an action-extension has been implemented in order to create XML from the DSP wiki syntax. The XML for a DSP can be retrieved by adding "?action=DSP2XML" at the end of the URL of the page that contains a DSP, for the example the URI is [http://dublincore.org/architecturewiki/DSPUsageExample?action=DSP2XML](http://dublincore.org/architecturewiki/DSPUsageExample?action=DSP2XML) . Below is the XML that will be retrieved from the example: <pre> &lt;DescriptionSetTemplate&gt;

   &lt;DescriptionTemplate maxOccur="1" minOccur="1"&gt;

     &lt;StatementTemplate type="literal"&gt;
       &lt;Property&gt;http://purl.org/dc/terms/title&lt;/Property&gt;

       &lt;LiteralConstraint&gt;
         &lt;SyntaxEncodingSchemeOccurrence&gt;"disallowed"&lt;/SyntaxEncodingSchemeOccurrence&gt;
         &lt;LanguageOccurrence&gt;"optional"&lt;/LanguageOccurrence&gt;
       &lt;/LiteralConstraint&gt;

     &lt;/StatementTemplate&gt;

     &lt;StatementTemplate type="nonliteral"&gt;
       &lt;Property&gt;http://purl.org/dc/terms/creator&lt;/Property&gt;

       &lt;NonliteralConstraint&gt;
         &lt;ValueURIOccurrence&gt;disallowed&lt;/ValueURIOccurrence&gt;
         &lt;VocabularyEncodingSchemeOccurrence&gt;disallowed&lt;/VocabularyEncodingSchemeOccurrence&gt;
         &lt;ValueStringConstraint maxOccur="1"&gt;
           &lt;SyntaxEncodingSchemeOccurrence&gt;"disallowed"&lt;/SyntaxEncodingSchemeOccurrence&gt;
           &lt;LanguageOccurrence&gt;"optional"&lt;/LanguageOccurrence&gt;
         &lt;/ValueStringConstraint&gt;
       &lt;/NonliteralConstraint&gt;

     &lt;/StatementTemplate&gt;

   &lt;/DescriptionTemplate maxOccur="1" minOccur="1"&gt;

 &lt;/DescriptionSetTemplate&gt; 
</pre>

 [RefreshCache](http://dublincore.org/architecturewiki/DSPWikiSyntax?action=refresh&arena=Page.py&key=DSPWikiSyntax.text_html) for this page (cached 2012-12-31 18:18:26)  

Immutable page (last edited 2008-10-07 07:29:37 by TomBaker)


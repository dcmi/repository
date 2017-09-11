---
title: "- EprintsApplicationProfile"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/EprintsApplicationProfile.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [EprintsApplicationProfile](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=fullsearch&value=EprintsApplicationProfile&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/EprintsApplicationProfile "View")
- [Diffs](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/EprintsApplicationProfile">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="EprintsApplicationProfile_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="EprintsApplicationProfile_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## 2009-01-20. Moved: see http://dublincore.org/scholarwiki/SWAPDSP

## Introduction

This document describes a DC Application Profile for describing an eprint, or scholarly work. The application profile is based on the SWAP [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Model](http://www.ukoln.ac.uk/repositories/digirep/index/Model), which is in turn based on FRBR. The model comprises 5 entities - [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork), Expression, Manifestation, Copy and Agent. This application profile provides a way of describing these entities as part of a _description set_ (a set of related DC _descriptions_).

The notion of a _description set_ is part of the DCMI Abstract Model. Readers that are not familiar with the DCMI Abstract Model should read [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">A note about the DCMI Abstract Model](http://www.ukoln.ac.uk/repositories/digirep/index/A_note_about_the_DCMI_Abstract_Model) before proceeding.

All the examples in this document are formatted according to the DC-Text notation. Readers who are not familiar with DC-Text should read [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">A note about DC-Text](http://www.ukoln.ac.uk/repositories/digirep/index/A_note_about_DC-Text) before proceeding.

In the context of this work an eprint is defined to be a _scientific or scholarly research text_ (as defined by the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Budapest Open Access Initiative](http://www.earlham.edu/%7Epeters/fos/boaifaq.htm#literature)), for example a peer-reviewed journal article, a preprint, a working paper, a thesis, a book chapter, a report, etc.

## Scholarly Works Application Profile

Each _description set_ that complies with the Scholarly Works Application Profile is made up of a set of related _descriptions_ about the entities listed above. Therefore, a typical _description set_ (using the DC-Text notation) has the following structure:

<tt>Description Set (</tt>  

<tt>Description (</tt>  

<tt># description of the eprint as a ScholarlyWork</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of an Expression of the eprint</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of a Manifestation of an Expression of the eprint</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of a Copy of a Manifestation of an Expression of the eprint</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of an author, funder, supervisor of the eprint or an affiliated institution</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of an editor of an Expression of the eprint</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>Description (</tt>  

<tt># description of the publisher of a Manifestation of an Expression of the eprint</tt>  
<tt>...</tt>  
<tt>)</tt>  
<tt>...</tt>  
<tt>)</tt>  

Each _description set_ describes only one eprint (i.e. one [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) entity). However, multiple _descriptions_ may be used to describe multiple Expression, Manifestation and Agent entities as necessary.

The metadata terms that may be used to describe each entity are described below. Note that all _properties_ may be repeated if necessary. Unless otherwise noted, multiple _value strings_ should be provided using separate _statements_. Where appropriate, each _value string_ may have an associated _language tag_.

A minimal _description set_ that conforms to this application profile must include either:

- a single [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) _description_ with at least one dc:title _statement_ and one dc:type _statement_ indicating that this is an entity of type [http://purl.org/eprint/entityType/ScholarlyWork](http://purl.org/eprint/entityType/ScholarlyWork), or

- a single [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) _description_ with one one dc:type _statement_ indicating that this is an entity of type [http://purl.org/eprint/entityType/ScholarlyWork](http://purl.org/eprint/entityType/ScholarlyWork) and one eprints:isExpressedAs _statement_ linking to a single Expression _description_ with at least one dc:title _statement_ and one dc:type _statement_ indicating that this is an entity of type [http://purl.org/eprint/entityType/Expression](http://purl.org/eprint/entityType/Expression).

All other aspects of the application profile are optional. #!DSP

### Description of the eprint as a ScholarlyWork

#### Entity type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The type nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Each of the entity <em>descriptions</em> in the <em>description sets</em> conforming with this application profile will need to be explicitly typed. This is done using a dc:type <em>statement</em> with one of the following <em>value URIs</em> taken from the <a class="external" href="http://purl.org/eprint/entityType/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme</a> corresponding to the entity being described. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/entityType/ScholarlyWork/">http://purl.org/eprint/entityType/ScholarlyWork/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/entityType/">http://purl.org/eprint/entityType/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/ScholarlyWork&gt; )</tt>  
<tt>)</tt>  

#### Title

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A name given to the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The title of the eprint. <br>
        <br>
        Preserve the original wording, order and spelling of the eprint title. 
        In general, only capitalize proper nouns, though there may be exceptions
        to this rule particularly regarding Internet-related terms. Punctuation
        need not reflect the usage of the original. Subtitles should be 
        separated from the title by 'space-colon-space'. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "Initial sequencing and analysis of the human genome" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "New nationalism and the old history : perspectives on the West German Historikerstreit" )</tt>  
<tt>)</tt>  

#### Subject

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The topic of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The topic of the eprint. <br>
        <br>
        In general, choose the most significant and unique words for keywords, 
        avoiding those too general to describe a particular eprint. For 
        free-text keywords use multiple <em>statements</em>, one for each term. 
        There are no requirements regarding the capitalization of keywords 
        though internal (within archive) consistency is recommended. <br>
        <br>
        Where terms are taken from a standard classification scheme encode each term in a separate <em>statement</em>. Use a <em>vocabulary encoding scheme URI</em>
        to indicate the classification scheme in use. Encode the complete 
        subject descriptor according to the relevant scheme. Use the 
        capitalisation and punctuation used in the original scheme. Where 
        subject terms are taken from LCSH, the subfields of the subject heading 
        should be separated by double dash (--) and spaces should be omitted. <br>
        <br>
        If the subject of the eprint is a person or an organization, provide their name as a <em>value string</em> according to <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Value String ( "polar oceanography" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Value String ( "boundary current" )</tt>  
<tt>)</tt>  

Using LCSH subjects:

<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:LCSH )</tt>  
<tt>Value String ( "World War, 1939-1945--Germany" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:subject )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:LCSH )</tt>  
<tt>Value String ( "Germany--History--1933-1945" )</tt>  
<tt>)</tt>  

Name as subject:

<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Value String ( "Hitler, Adolf, 1889-1945" )</tt>  
<tt>)</tt>  

#### Abstract

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/abstract">http://purl.org/dc/terms/abstract</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A summary of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A summary of the important points of the eprint. </td>
    </tr>
  </tbody>
</table>


#### Identifier

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An unambiguous reference to the resource within a given context. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A URI for the eprint. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  <a href="http://purl.org/dc/terms/URI">http://purl.org/dc/terms/URI</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.bath.ac.uk/archive/00000003/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  

Note that one of the URIs for the eprint should be encoded as the _resource URI_ in the _description_ of the eprint. If a Handle has been assigned to the eprint then this should be used as the _resource URI_, encoded using the [http://hdl.handle.net/4263537/4069](http://hdl.handle.net/4263537/4069) form. Additional URIs should be provided using a dc:identifier _statement_. (See the A note about using identifiers below.)

<tt>Description Set (</tt>  

<tt>Description ( # description of the eprint as a ScholarlyWork</tt>  

<tt>Resource URI ( &lt;http://hdl.handle.net/4263537/4069&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.bath.ac.uk/archive/00000003/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>...</tt>  
<tt>)</tt>  

#### Creator

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An entity primarily responsible for making the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        An author of the eprint. <br>
        <br>
        Use this <em>property</em> to provide the author's name and/or the URI of the author and/or to link to a <em>related description</em> (with the <em>description set</em>) about the author. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:creator )</tt>  
<tt>Value String ( "Heery, Rachel" )</tt>  
<tt>ResourceRef ( rachelheery )</tt>  
<tt>)</tt>  

#### Funder

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/FND">http://www.loc.gov/loc.terms/relators/FND</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A person or organization that furnished financial support for the production of the work. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the funder's name and/or the URI of the funder and/or to link to a <em>related description</em> (within the <em>description set</em>) about the funder. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( marcrel:FND )</tt>  
<tt>Value String ( "The Mellon Foundation" )</tt>  
<tt>ResourceRef ( organization5 )</tt>  
<tt>)</tt>  

#### Grant Number

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/grantNumber">http://purl.org/eprint/terms/grantNumber</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An alpha-numeric string identifying the funding grant under which the eprint was written. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use a <em>value string</em> to provide the grant number. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( eprint:grantNumber )</tt>  
<tt>Literal Value String ( "A456X" )</tt>  
<tt>)</tt>  

#### Supervisor

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/THS">http://www.loc.gov/loc.terms/relators/THS</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A person under whose supervision a degree candidate develops and presents a thesis, mémoire, or text of a dissertation. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the supervisor's name and/or the URI of the supervisor and/or to link to a <em>related description</em> (within the <em>description set</em>) about the supervisor. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( marcrel:THS )</tt>  
<tt>Value String ( "Bloggs, Fred" )</tt>  
<tt>ResourceRef ( person15 )</tt>  
<tt>)</tt>  

#### Affiliated Institution

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/affiliatedInstitution">http://purl.org/eprint/terms/affiliatedInstitution</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An organisation to which a creator of the eprint is affiliated. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the affiliated organisation's name and/or the URI of the affiliated institution and/or to link to a <em>related description</em> (with the <em>description set</em>) about the affiliated institution. <br>
        <br>
        Where a name of the affiliated organisation is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:affiliatedInstitution )</tt>  
<tt>Value String ( "University of Bristol" )</tt>  
<tt>ResourceRef ( bristoluni )</tt>  
<tt>)</tt>  

#### Has Adaptation

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/hasAdaptation">http://purl.org/eprint/terms/hasAdaptation</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A scholarly work that results from the described eprint being recast in a new form. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide a value URI of an adaptation of the eprint. <br>
        <br>
        In the context of this application profile, an example of an adaptation
        is the powerpoint slides (the adaptation) used to present a conference 
        paper (the eprint) at a conference. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:hasAdaptation )</tt>  
<tt>Value URI ( &lt;http://www.example.com/mypaper.ppt&gt; )</tt>  
<tt>)</tt>  

#### Is Expressed As

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/isExpressedAs">http://purl.org/eprint/terms/isExpressedAs</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A version of the described eprint. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        An expression of the described eprint. In FRBR terms, an eprint is a Work. <br>
        <br>
        Use this <em>property</em> to provide the URI of an expression of the eprint and/or to link to a <em>related description</em> (with the <em>description set</em>) about the expression. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: expression 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isExpressedAs )</tt>  
<tt>ResourceRef ( expression1 )</tt>  
<tt>)</tt>  

### Description of an Expression of the eprint

#### Entity type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The type nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Each of the entity <em>descriptions</em> in the <em>description sets</em> conforming with this application profile will need to be explicitly typed. This is done using a dc:type <em>statement</em> with one of the following <em>value URIs</em> taken from the <a class="external" href="http://purl.org/eprint/entityType/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme</a> corresponding to the entity being described. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/entityType/Expression/">http://purl.org/eprint/entityType/Expression/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/entityType/">http://purl.org/eprint/entityType/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Expression&gt; )</tt>  
<tt>)</tt>  

#### Title

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A name given to the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A title for the expression of the eprint. Only use this property in 
        cases where the expression title is different from the title of the 
        eprint at the scholarly work level. For example, use this property to 
        capture the title of a translation of the eprint. <br>
        <br>
        Preserve the original wording, order and spelling of the eprint title. 
        In general, only capitalize proper nouns, though there may be 
        exceptions to this rule particularly regarding Internet-related terms. 
        Punctuation need not reflect the usage of the original. Subtitles should
        be separated from the title by 'space-colon-space'. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "Initial sequencing and analysis of the human genome" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "The new nationalism and the old history : perspectives on the West German Historikerstreit" )</tt>  
<tt>)</tt>  

#### Description

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An account of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A description of the expression of the eprint. Use this property to 
        describe how the expression relates to the eprint as a scholarly work 
        and/or other expressions. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( dc:description )</tt>  
<tt>Literal Value String ( "Translated into French for publication in Journal des Anthropologues." )</tt>  
<tt>)</tt>  

#### Identifier

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An unambiguous reference to the resource within a given context. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A URI for the described expression of the eprint. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  <a href="http://purl.org/dc/terms/URI">http://purl.org/dc/terms/URI</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.bath.ac.uk/archive/12345678/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  

Note that one of the URIs for the described expression of the eprint should be encoded as the _resource URI_ in the _description_ of the expression. If a DOI or Handle has been assigned to the expression of the eprint then this should be used as the _resource URI_, encoded using the [http://dx.doi.org/10.1000/152](http://dx.doi.org/10.1000/152) or [http://hdl.handle.net/4263537/4069](http://hdl.handle.net/4263537/4069) form. Additional URIs should be provided using a dc:identifier _statement_. (See the A note about using identifiers below.)

<tt>Description Set (</tt>  

<tt>Description ( # description of the eprint as an Expression</tt>  

<tt>Resource URI ( &lt;http://dx.doi.org/10.1000/152&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.bath.ac.uk/archive/00000003/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>...</tt>  
<tt>)</tt>  

#### Date Available

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/available">http://purl.org/dc/terms/available</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        Date (often a range) that the resource will become or did become available. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The date that the described expression of the eprint was first made public. <br>
        <br>
        Use a <em>value string</em> to provide the date, formatted according to the W3C Date Time Format (W3CDTF) specification. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  <a href="http://purl.org/dc/terms/W3CDTF">http://purl.org/dc/terms/W3CDTF</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:available )</tt>  
<tt>Literal Value String ( "2004-09-23"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:W3CDTF )</tt>  
<tt>)</tt>  
<tt>)</tt>  

#### Status

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/status">http://purl.org/eprint/terms/status</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The status of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The status of the described expression of the eprint. Recommended best practice is to provide a <em>value URI</em> taken from the <a class="external" href="http://purl.org/eprint/status/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints Status Vocabulary Encoding Scheme</a>: <a href="http://purl.org/eprint/status/PeerReviewed">http://purl.org/eprint/status/PeerReviewed</a> or <a href="http://purl.org/eprint/status/NonPeerReviewed">http://purl.org/eprint/status/NonPeerReviewed</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/status/PeerReviewed">http://purl.org/eprint/status/PeerReviewed</a> <br>
                  <a href="http://purl.org/eprint/status/NonPeerReviewed">http://purl.org/eprint/status/NonPeerReviewed</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/status/">http://purl.org/eprint/status/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:status )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:Status )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/status/PeerReviewed&gt; )</tt>  
<tt>)</tt>  

#### Version Number or String

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/version">http://purl.org/eprint/terms/version</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A version number or version string associated with the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A version number or version string associated with the described expression of the eprint. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( eprint:version )</tt>  
<tt>Literal Value String ( "2.0" )</tt>  
<tt>)</tt>  

#### Language

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A language of the intellectual content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A language in which the described expression of the eprint is written. Use multiple <em>statements</em> if the described expression of the eprint is written in multiple languages. Provide a <em>value string</em> containing a language tag, formatted according to RFC-3066. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  disallowed </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <br>
                  <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Option</strong>:</td>
                <td>
                  <a href="http://purl.org/dc/terms/RFC3066">http://purl.org/dc/terms/RFC3066</a> <br>
                </td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:language )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:RFC3066 )</tt>  
<tt>Value String ( "fr" )</tt>  
<tt>)</tt>  

#### Type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The type of the described expression of the eprint. <br>
        <br>
        Recommended best practice is to provide a value URI for a class from the <a class="external" href="http://purl.org/eprint/type/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints Type Vocabulary Encoding Scheme</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/type/ScholarlyText">http://purl.org/eprint/type/ScholarlyText</a> <br>
                  <a href="http://purl.org/eprint/type/Book">http://purl.org/eprint/type/Book</a> <br>
                  <a href="http://purl.org/eprint/type/BookItem">http://purl.org/eprint/type/BookItem</a> <br>
                  <a href="http://purl.org/eprint/type/BookReview">http://purl.org/eprint/type/BookReview</a> <br>
                  <a href="http://purl.org/eprint/type/ConferenceItem">http://purl.org/eprint/type/ConferenceItem</a> <br>
                  <a href="http://purl.org/eprint/type/ConferencePaper">http://purl.org/eprint/type/ConferencePaper</a> <br>
                  <a href="http://purl.org/eprint/type/ConferencePoster">http://purl.org/eprint/type/ConferencePoster</a> <br>
                  <a href="http://purl.org/eprint/type/JournalItem">http://purl.org/eprint/type/JournalItem</a> <br>
                  <a href="http://purl.org/eprint/type/JournalArticle">http://purl.org/eprint/type/JournalArticle</a> <br>
                  <a href="http://purl.org/eprint/type/NewsItem">http://purl.org/eprint/type/NewsItem</a> <br>
                  <a href="http://purl.org/eprint/type/Patent">http://purl.org/eprint/type/Patent</a> <br>
                  <a href="http://purl.org/eprint/type/Report">http://purl.org/eprint/type/Report</a> <br>
                  <a href="http://purl.org/eprint/type/SubmittedJournalArticle">http://purl.org/eprint/type/SubmittedJournalArticle</a> <br>
                  <a href="http://purl.org/eprint/type/Thesis">http://purl.org/eprint/type/Thesis</a> <br>
                  <a href="http://purl.org/eprint/type/WorkingPaper">http://purl.org/eprint/type/WorkingPaper</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/type/">http://purl.org/eprint/type/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:Type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/type/JournalArticle&gt; )</tt>  
<tt>)</tt>  

#### Copyright Holder

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/copyrightHolder">http://purl.org/eprint/terms/copyrightHolder</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A person or organization owning copyright in the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A person or organization owning copyright in the eprint. <br>
        <br>
        Use this <em>property</em> to provide the copyright holder's name and/or the URI of the copyright holder and/or to link to a <em>related description</em> (with the <em>description set</em>) about the copyright holder. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:copyrightHolder )</tt>  
<tt>Value String ( "University of Leeds" )</tt>  
<tt>ResourceRef ( leedsuni )</tt>  
<tt>)</tt>  

#### Has Version

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/hasVersion">http://purl.org/dc/terms/hasVersion</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The described resource has a version, edition, or adaptation, namely, the referenced resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the URI of an alternative expression of the eprint and/or to link to a <em>related description</em> (with the <em>description set</em>) about the alternative expression. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: expression 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:hasVersion )</tt>  
<tt>ResourceRef ( version-2.1 )</tt>  
<tt>)</tt>  

#### Has Translation

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/hasTranslation">http://purl.org/eprint/terms/hasTranslation</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A translation of the described resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the URI of an expression that is a translation of the described expression of the eprint and/or to link to a <em>related description</em> (with the <em>description set</em>) about the translated expression. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: expression 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:hasTranslation )</tt>  
<tt>ResourceRef ( version-en )</tt>  
<tt>)</tt>  

#### Bibliographic Citation

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/bibliographicCitation">http://purl.org/dc/terms/bibliographicCitation</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A bibliographic reference for the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the text citation that should be used to cite the described expression of the eprint and/or to provide an OpenURL <a class="nonexistent" href="http://dublincore.org/architecturewiki/ContextObject">ContextObject</a> for the described expression of the eprint following the guidelines in the <a class="external" href="http://dublincore.org/documents/dc-citation-guidelines/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Guidelines for Encoding Bibliographic Citation Information in Dublin Core Metadata</a> DCMI Recommendation. In general, both a human-readable citation and a machine-readable OpenURL <a class="nonexistent" href="http://dublincore.org/architecturewiki/ContextObject">ContextObject</a> should be provided. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  info:ofi/fmt:kev:mtx: <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:bibliographicCitation )</tt>  
<tt>Literal Value String ( "Library and Information Science Research 22(3), 311-338" )</tt>  
<tt>Literal Value String ( "&amp;ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal</tt>  

<tt>&amp;rft.jtitle=Library+and+Information+Science+Research&amp;rft.stitle=LISR</tt>  
<tt>&amp;rft.volume=22&amp;rft.issue=3&amp;rft.spage=311</tt>  
<tt>&amp;rfr_id=info%3Asid%2Fmimas.ac.uk%3Azetoc"</tt>  

<tt>Syntax Encoding Scheme URI ( kev:ctx )</tt>  
<tt>)</tt>  
<tt>)</tt>  

Note that the lines above have been wrapped for readability.

#### References

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/references">http://purl.org/dc/terms/references</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The described resource references, cites, or otherwise points to the referenced resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Use this <em>property</em> to provide the URI of an expression of a different eprint, a textual citation for the expression and/or an OpenURL <a class="nonexistent" href="http://dublincore.org/architecturewiki/ContextObject">ContextObject</a>. In general, where a human-readable citation is provided a machine-readable OpenURL <a class="nonexistent" href="http://dublincore.org/architecturewiki/ContextObject">ContextObject</a> should also be provided. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  2</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
              <tr>
                <td>
                  <strong>Option</strong>:</td>
                <td>
                  info:ofi/fmt:kev:mtx: <br>
                </td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:references )</tt>  
<tt>Value String ( "Heery, R. (2000). \"Information gateways: collaboration on content.\"</tt>  

<tt>Online Information Review, 24 (1), 40-45." )</tt>  
<tt>Value String ( "&amp;ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal</tt>  

<tt>&amp;rft.jtitle=Online+Information+Review&amp;rft.volume=24&amp;rft.issue=1&amp;rft.spage=40</tt>  
<tt>&amp;rft.epage=45&amp;rft.aufirst=Rachel&amp;rft.aulast=Heery&amp;rft.date=2000</tt>  
<tt>&amp;rfr_id=info%3Asid%2Fmimas.ac.uk%3Azetoc"</tt>  

<tt>Syntax Encoding Scheme URI ( kev:ctx )</tt>  
<tt>)</tt>  
<tt>)</tt>  

#### Editor

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/EDT">http://www.loc.gov/loc.terms/relators/EDT</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A person or organization who prepares for publication a work not 
        primarily his/her own, such as by elucidating text, adding introductory 
        or other critical matter, or technically directing an editorial staff. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A person or organisation that prepares the described expression of the eprint for publication. <br>
        <br>
        Use this <em>property</em> to provide the editor's name and/or the URI of the editor and/or to link to a <em>related description</em> (with the <em>description set</em>) about the editor. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( marcrel:EDT )</tt>  
<tt>Value String ( "Day, Michael" )</tt>  
<tt>ResourceRef ( person2 )</tt>  
<tt>)</tt>  

#### Is Manifested As

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/isManifestedAs">http://purl.org/eprint/terms/isManifestedAs</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A manifestation of the described version of the eprint. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A manifestation of the described expression of the eprint. In FRBR terms, an eprint is a Work. <br>
        <br>
        Use this <em>property</em> to provide the URI of a manifestation of the expression of the eprint and/or to link to a <em>related description</em> (with the <em>description set</em>) about the manifestation. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: manifestation 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isManifestedAs )</tt>  
<tt>ResourceRef ( pdfformat1 )</tt>  
<tt>)</tt>  

### Description of a Manifestation of an Expression of the eprint

#### Entity type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The type nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Each of the entity <em>descriptions</em> in the <em>description sets</em> conforming with this application profile will need to be explicitly typed. This is done using a dc:type <em>statement</em> with one of the following <em>value URIs</em> taken from the <a class="external" href="http://purl.org/eprint/entityType/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme</a> corresponding to the entity being described. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/entityType/Manifestation/">http://purl.org/eprint/entityType/Manifestation/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/entityType/">http://purl.org/eprint/entityType/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Manifestation&gt; )</tt>  
<tt>)</tt>  

#### Format

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The physical or digital manifestation of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The media-type of the described manifestation of an expression of the eprint. <br>
        <br>
        Recommended best practice is to select a <em>value string</em> from the IANA registered list of Internet Media Types (MIME types). </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  disallowed </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Option</strong>:</td>
                <td>
                  <a href="http://purl.org/dc/terms/IMT">http://purl.org/dc/terms/IMT</a> <br>
                </td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:format )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:IMT )</tt>  
<tt>Value String ("application/pdf" )</tt>  
<tt>)</tt>  

#### Date Modified

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/modified">http://purl.org/dc/terms/modified</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        Date on which the resource was changed. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The last modified date of the described manifestation of an expression of the eprint. <br>
        <br>
        Use a <em>value string</em> to provide the date, formatted according to the W3C Date Time Format (W3CDTF) specification. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  <a href="http://purl.org/dc/terms/W3CDTF">http://purl.org/dc/terms/W3CDTF</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:modified )</tt>  
<tt>Literal Value String ( "2005-02-14"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:W3CDTF )</tt>  
<tt>)</tt>  
<tt>)</tt>  

#### Publisher

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        An entity responsible for making the resource available. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The publisher of the described manifestation of an expression of the 
        eprint, typically either the author's institution or a commercial 
        publisher. <br>
        <br>
        Use this <em>property</em> to provide the publisher's name and/or the URI of the publisher and/or to link to a <em>related description</em> (with the <em>description set</em>) about the publisher. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: agent 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:publisher )</tt>  
<tt>Value String ( "Springer" )</tt>  
<tt>ResourceRef ( organisation1 )</tt>  
<tt>)</tt>  

#### Is Available As

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/eprint/terms/isAvailableAs">http://purl.org/eprint/terms/isAvailableAs</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A resource that is an exemplar of the described manifestation of an expression of the eprint. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A copy of the described manifestation of an expression of the eprint.  
        In FRBR terms, an eprint is a Work and a copy is an Item. <br>
        <br>
        Use this <em>property</em> to provide the URI of a copy of a manifestation of an expression of the eprint. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <strong>Description</strong>: copy 
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isAvailableAs )</tt>  
<tt>Value URI ( http://www.example.com/work/version/copy.pdf )</tt>  
<tt>)</tt>  

### Description of a Copy of a Manifestation of an Expression of the eprint

#### Entity type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The type nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Each of the entity <em>descriptions</em> in the <em>description sets</em> conforming with this application profile will need to be explicitly typed. This is done using a dc:type <em>statement</em> with one of the following <em>value URIs</em> taken from the <a class="external" href="http://purl.org/eprint/entityType/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme</a> corresponding to the entity being described. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/entityType/Copy/">http://purl.org/eprint/entityType/Copy/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/entityType/">http://purl.org/eprint/entityType/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Copy&gt; )</tt>  
<tt>)</tt>  

#### Access Rights

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/accessRights">http://purl.org/dc/terms/accessRights</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        Information about who can access the resource or an indication of its security status. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Information about who can access the described copy of a manifestation 
        of an expression of the eprint. In FRBR terms, an eprint is a Work and a
        copy is an Item. Recommended best practice is to provide a value URI 
        for a class from the <a class="external" href="http://purl.org/eprint/accessRights/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints AccessRights Vocabulary Encoding Scheme</a>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/accessRights/OpenAccess">http://purl.org/eprint/accessRights/OpenAccess</a> <br>
                  <a href="http://purl.org/eprint/accessRights/RestrictedAccess">http://purl.org/eprint/accessRights/RestrictedAccess</a> <br>
                  <a href="http://purl.org/eprint/accessRights/ClosedAccess">http://purl.org/eprint/accessRights/ClosedAccess</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/accessRights/">http://purl.org/eprint/accessRights/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:accessRights )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:accessRights )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/accessRights/OpenAccess&gt; )</tt>  
<tt>)</tt>  

#### Licence

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/license">http://purl.org/dc/terms/license</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A legal document giving official permission to do something with the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The terms under which the described copy of a manifestation of an 
        expression of the eprint is made available. Typically, the URI of a 
        licence statement should be provided as a <em>value URI</em>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:license )</tt>  
<tt>Value URI ( http://creativecommons.org/licenses/by/2.0/ )</tt>  
<tt>)</tt>  

#### Date Available

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/available">http://purl.org/dc/terms/available</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        Date (often a range) that the resource will become or did become available. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The date that the described copy of a manifestation of an expression of the eprint will become or did become public. <br>
        <br>
        Use a <em>value string</em> to provide the date, formatted according to the W3C Date Time Format (W3CDTF) specification. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Syntax Encoding Scheme:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>
                </td>
                <td>
                  <a href="http://purl.org/dc/terms/W3CDTF">http://purl.org/dc/terms/W3CDTF</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:available )</tt>  
<tt>Literal Value String ( "2004-09-23"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:W3CDTF )</tt>  
<tt>)</tt>  
<tt>)</tt>  

#### Is Part Of

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The described resource is a physical or logical part of the referenced resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A collection, typically a bibliographic collection, of which the described copy is a member. <br>
        <br>
        Use both a <em>value URI</em> and a <em>value string</em> to indicate the collection. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  1</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Syntax Encoding Syntax Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  optional</td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <em>Language Constraint</em>:</td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  optional</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:isPartOf )</tt>  
<tt>Value URI ( &lt;http://purl.org/poi/iesr.ac.uk/1084445801-13323&gt; )</tt>  
<tt>Value String ( "JSTOR" )</tt>  
<tt>)</tt>  

### Description of an Agent

#### Entity type

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Min occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Max occurrence</td>
      <td>
        1</td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The type nature or genre of the content of the resource. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Each of the entity <em>descriptions</em> in the <em>description sets</em> conforming with this application profile will need to be explicitly typed. This is done using a dc:type <em>statement</em> with one of the following <em>value URIs</em> taken from the <a class="external" href="http://purl.org/eprint/entityType/"><img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme</a> corresponding to the entity being described. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>:</td>
                <td>
                  <a href="http://purl.org/eprint/entityType/Person/">http://purl.org/eprint/entityType/Person/</a> <br>
                  <a href="http://purl.org/eprint/entityType/Organization/">http://purl.org/eprint/entityType/Organization/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  mandatory</td>
              </tr>
              <tr>
                <td>
                  <strong>Choose from</strong>: </td>
                <td>
                  <a href="http://purl.org/eprint/entityType/">http://purl.org/eprint/entityType/</a> <br>
                </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Person&gt; )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Organization&gt; )</tt>  
<tt>)</tt>  

#### Name

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/name">http://xmlns.com/foaf/0.1/name</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A name for some thing. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A name for the agent (person or organisation). <br>
        <br>
        In general, use foaf:family_name and foaf:givenname for describing persons and foaf:name for describing organisations. <br>
        <br>
        Where a name is provided, see <a href="#A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings">A note about the form of personal and organisational names used in value strings</a>. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( foaf:name )</tt>  
<tt>Literal Value String ( "University of York" )</tt>  
<tt>)</tt>  

#### Family Name

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/family_name">http://xmlns.com/foaf/0.1/family_name</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The family name of some person. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The family name of a person. <br>
        <br>
        In general, use foaf:family_name and foaf:givenname for describing persons and foaf:name for describing organisations. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( foaf:family_name )</tt>  
<tt>Literal Value String ( "Powell" )</tt>  
<tt>)</tt>  

#### Given Name

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/givenname">http://xmlns.com/foaf/0.1/givenname</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        Yes</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        The given name of some person. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The given name of a person. <br>
        <br>
        In general, use foaf:family_name and foaf:givenname for describing persons and foaf:name for describing organisations. </td>
    </tr>
  </tbody>
</table>


**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( foaf:givenname )</tt>  
<tt>Literal Value String ( "Andy" )</tt>  
<tt>)</tt>  

#### Workplace Homepage

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/workplaceHomepage">http://xmlns.com/foaf/0.1/workplaceHomepage</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A workplace homepage of some person; the homepage of an organization they work for. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        The homepage of the organisation for which the author of the eprint works. <br>
        <br>
        Use this <em>property</em> to provide the URI of the organisational homepage as a <em>value URI</em>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( foaf:workplaceHomepage )</tt>  
<tt>Value URI ( &lt;http://www.bristol.ac.uk/&gt; )</tt>  
<tt>)</tt>  

#### Mailbox

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/mbox">http://xmlns.com/foaf/0.1/mbox</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A personal mailbox, ie. an Internet mailbox associated with exactly one
        owner, the first owner of this mailbox. This is a 'static inverse 
        functional property', in that there is (across time and change) at most 
        one individual that ever has any particular value for foaf:mbox. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        A mailbox associated with a person, formatted as a 'mailto' URI. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( foaf:mbox )</tt>  
<tt>Value URI ( "mailto:fred@example.com" )</tt>  
<tt>)</tt>  

#### Homepage

* * *

<table>
  <tbody>
    <tr bgcolor="#FFFF99">
      <td>
        Property </td>
      <td>
        <a href="http://xmlns.com/foaf/0.1/homepage">http://xmlns.com/foaf/0.1/homepage</a>
      </td>
    </tr>
    <tr bgcolor="#FFFF99">
      <td>
        Literal? </td>
      <td>
        No</td>
    </tr>
    <tr>
      <td>
        Definition </td>
      <td>
        A homepage for some thing. </td>
    </tr>
    <tr>
      <td>
        Eprint-specific recommendation </td>
      <td>
        Provide the URI of the agent's Web homepage as a <em>value URI</em>. </td>
    </tr>
    <tr bgcolor="skyBlue">
      <td>
        Value (Non-Literal) </td>
      <td>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value URI Constraint</strong>: </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>
                </td>
                <td>
                  mandatory </td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Vocabulary Encoding Scheme Constraint</strong>
                </td>
              </tr>
              <tr>
                <td>
                  <strong>Occurrence</strong>: </td>
                <td>
                  disallowed</td>
              </tr>
            </tbody>
          </table>

        </div>
        <div>
          <table>
            <tbody>
              <tr>
                <td colspan="2" align="center">
                  <strong>Value String Constraint:</strong>
                </td>
              </tr>
              <tr>
                <td>
                  Max occurrence</td>
                <td>
                  0</td>
              </tr>
            </tbody>
          </table>

        </div>
      </td>
    </tr>
  </tbody>
</table>

**For example:**
<tt>Statement (</tt>  

<tt>Property URI ( foaf:homepage )</tt>  
<tt>Value URI ( "http://www.bham.ac.uk/" )</tt>  
<tt>)</tt>  

## Entity typing

Each of the entity _descriptions_ in the _description sets_ conforming with this application profile will need to be explicitly typed. This is done using a dc:type _statement_ with one of the following _value URIs_ taken from the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Eprints EntityType Vocabulary Encoding Scheme](http://purl.org/eprint/entityType/):

- [http://purl.org/eprint/entityType/ScholarlyWork](http://purl.org/eprint/entityType/ScholarlyWork)

- [http://purl.org/eprint/entityType/Expression](http://purl.org/eprint/entityType/Expression)

- [http://purl.org/eprint/entityType/Manifestation](http://purl.org/eprint/entityType/Manifestation)

- [http://purl.org/eprint/entityType/Copy](http://purl.org/eprint/entityType/Copy)

- [http://purl.org/eprint/entityType/Person](http://purl.org/eprint/entityType/Person)

- [http://purl.org/eprint/entityType/Organization](http://purl.org/eprint/entityType/Organization)

**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:EntityType )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Copy&gt; )</tt>  
<tt>)</tt>  

<a id="A_note_about_the_form_of_personal_and_organisational_names_used_in_value_strings"></a>

## A note about the form of personal and organisational names used in value strings

Where personal or organisational names are provided as _value strings_, the following guidelines should be followed.

Personal names should be listed surname or family name first, followed by comma-space, then the "usual" or preferred form of forenames and/or initials followed by a full stop. If necessary, this may be followed by the full set of spelled-out forenames in round brackets. Use the same form of name for all eprints, irrespective of the form used on the item itself. ||

**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( marcrel:EDT )</tt>  
<tt>Value String ( "Bloggs, Fred" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( marcrel:EDT )</tt>  
<tt>Value String ( "Sulston, John E." )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( marcrel:FND )</tt>  
<tt>Value String ( "Walker, J. J. (John Joseph)" )</tt>  
<tt>)</tt>  

In the case of organizations where there is clearly a hierarchy present, list the parts of the hierarchy from largest to smallest, separated by full stops. If it is not clear whether there is a hierarchy present, or unclear which is the larger or smaller portion of the body, give the name as it appears in the eprint. ||

**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( marcrel:THS )</tt>  
<tt>Value String ( "Loughborough University. Department of Computer Science" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:creator )</tt>  
<tt>Value String ( "University of Reading. Rural History Centre" )</tt>  
<tt>)</tt>  

<tt>Statement (</tt>

<tt>Property URI ( dc:publisher )</tt>  
<tt>Value String ( "John Wiley &amp;amp; Sons, Inc. (US)" )</tt>  
<tt>)</tt>  

The inclusion of personal and corporate name headings from authority lists constructed according to AACR2, e.g. the Library of Congress Name Authority File (LCNA), is also acceptable.

<a id="A_note_about_using_identifiers"></a>

## A note about using identifiers

Each of the entities in the model may be assigned a URI, encoded as the _resource URI_ in the description of that entity.

It should be noted, however, that assigning and encoding a URI is not mandatory for any of the entities. Although the lack of a URI for any entity means that the entity can not be referenced from within metadata records in other eprint systems, the assignment of URIs to entities should be performed with care (and, where possible, after first checking whether a URI has already been assigned to the entity elsewhere). Multiple URIs for a single entity are likely to cause problems for downstream eprint systems, since it may be difficult for them to determine algorithmically whether any two URIs identify the same entity.

Where the [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) and Expression entities in a _description set_ have additional URIs, these should be encoded in one or more dc:identifier _statements_. As noted in the relevant sections above, in cases where there are multiple URIs for any entity, one of the URIs should be used as the _resource URI_. Recommended best practice is to use a DOI or Handle as the _resource URI_, where these exist.

The URIs assigned to each of the entities should uniquely identify a single entity. There may be more than one URI per entity, but each URI should only identify one entity.

It is an implementation issue whether the URIs assigned to the [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) and Expression entities dereference to a representation of that entity. However, it is anticipated that eprint systems are likely to be configured such that the URI for [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) and/or Expression entities dereference to a 'jump-off page' for the eprint, as served by the archive.

In all cases where a dc:identifier _statement_ is provided, use a _syntax encoding scheme URI_ to indicate that a URI is being provided. ||

**For example:**

<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Value String ( "http://eprints.bath.ac.uk/archive/00000003/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  

It is not yet clear whether current practice is to assign DOIs at the level of the Work or at the level of the Expression (as those terms are used in FRBR) or in a more fine-grained way. The current [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Crossref documentation](http://www.crossref.org/01company/15doi_info.html) indicates that DOIs should be assigned to the 'work', however it is not clear that this usage of the word 'work' corresponds with its usage in FRBR - in fact, it is rather more likely that it corresponds with the use of the term Expression in FRBR.

There is also other evidence that publishers typically assign DOIs at the level of the FRBR Expression. For example, the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">DOI Handbook discussion about 'granularity'](http://www.doi.org/handbook_2000/intro.html#1.6.4) concludes that in practice it is safer to assign separate DOIs to each language translation of a given article, i.e. to assign DOIs at the level of the Expression.

As a result, it is suggested that the following guidelines are followed when making use of DOIs in the context of this application profile:

- If the DOI has been assigned to all possible expressions and manifestations of the eprint (e.g. it is intended to resolve to both the HTML format of the preprint and the PDF format of the formally published article), use the DOI as the _resource URI_ for the [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork) entity (and also encode it as the _value string_ of a dc:identifier _statement_ for that entity).

- If the DOI has been assigned to all manifestations of a particular expression of the eprint (e.g. it is intended to resolve to all the formats of the Spanish language version of the formally published article), use the DOI as the _resource URI_ for the Expression entity.

- If the DOI has been assigned to a particular manifestation of an expression of the eprint (e.g. it is intended to resolve only to the PDF format of the French-language translation of the formally published article), use the DOI as the _resource URI_ for the Manifestation entity.

- If the DOI has been assigned to a particular copy of a manifestation of an expression of the eprint (e.g. it is only intended to resolve to the particular copy of an article as served by a particular Web server), use the DOI as the _resource URI_ for the Copy entity.

In all cases, the ' [http://dx.doi.org/10.100/12345](http://dx.doi.org/10.100/12345)' form of URI encoding should be used.

Note that publisher-assigned DOIs are highly likely to fall into cases 1 or 2.

## A note about mapping the Scholarly Works Application Profile to Simple DC

[http://www.ukoln.ac.uk/repositories/digirep/index/Mapping\_the\_Scholarly\_Works\_Application\_Profile\_to\_Simple\_DC](http://www.ukoln.ac.uk/repositories/digirep/index/Mapping_the_Scholarly_Works_Application_Profile_to_Simple_DC) Mapping the Scholarly Works Application Profile to Simple DC] is available as a separate document.

The mapping enables software to 'dumb-down' (i.e. transform) a _description set_ that conforms with this application profile to a _description set_ that conforms with simple DC. In this context, 'simple DC' means a _description set_ that comprises a single _description_ that only uses the 15 _properties_ in the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Dublin Core Metadata Element Set](http://dublincore.org/documents/dces/).

It is worth noting that by using this mapping, a _description set_ that complies with this application profile will be dumbed-down to form a _description_ that complies with the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">Using simple DC to describe eprints](http://www.rdn.ac.uk/projects/eprints-uk/docs/simpledc-guidelines/) document produced by the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">ePrints UK project](http://www.rdn.ac.uk/projects/eprints-uk/).

It is also worth noting that the resulting simple DC _description_ is about the eprint as a [ScholarlyWork](http://dublincore.org/architecturewiki/ScholarlyWork). While this is not the only approach to mapping this application profile to simple DC (for example, it would also be possible to map this application profile to a set of simple DC _descriptions_ about each of the Copy entities) it fits well with the intended usage of this application profile in the [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">OAI Protocol for Metadata Harvesting](http://www.openarchives.org/). In this case, each [<img src="EprintsApplicationProfile_files/moin-www.png" alt="[WWW]" height="11" width="11">OAI item](http://www.openarchives.org/OAI/openarchivesprotocol.html#Item) will have associated records that correspond to both the oai\_dc format and an XML format based on this application profile.

The particular mapping discussed here and in the separate document does not preclude alternative mappings being generated in the future.

## Examples

### Example 1

<tt>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .</tt>  
<tt>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .</tt>  
<tt>@prefix eprint: &lt;http://purl.org/eprint/terms/&gt; .</tt>  
  
<tt>DescriptionSet (</tt>  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://eprints.gla.ac.uk/503/&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/ScholarlyWork&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "Attempts to detect retrotransposition and de novo deletion of Alus and other dispersed</tt>  

<tt>repeats at specific loci in the human genome" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:abstract )</tt>  
<tt>Value String ( "Dispersed repeat elements contribute to genome instability by de novo insertion and unequal</tt>  

<tt>recombination between repeats. To study the dynamics of these processes, we have developed</tt>  
<tt>single DNA molecule approaches to detect de novo insertions at a single locus and Alu-mediated</tt>  
<tt>deletions at two different loci in human genomic DNA. Validation experiments showed these</tt>  
<tt>approaches could detect insertions and deletions at frequencies below 10(-6) per cell. However,</tt>  
<tt>bulk analysis of germline (sperm) and somatic DNA showed no evidence for genuine mutant molecules,</tt>  
<tt>placing an upper limit of insertion and deletion rates of 2 x 10(-7) and 3 x 10(-7), respectively,</tt>  
<tt>in the individuals tested. Such re-arrangements at these loci therefore occur at a rate lower</tt>  
<tt>than that detectable by the most sensitive methods currently available." )</tt>  
<tt>)</tt>  
<tt># keywords to be added</tt>  
<tt># Alu; deletion; dispersed repeats; insertion; recombination; retroposition</tt>  
<tt>Statement (</tt>  

<tt>Property URI (dc:creator )</tt>  
<tt>Value String ( "Hollies, C.R." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI (dc:creator )</tt>  
<tt>Value String ( "Monckton, D.G." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI (dc:creator )</tt>  
<tt>Value String ( "Jeffreys, A.J." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.gla.ac.uk/503/"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement  (</tt>  

<tt>Property URI ( eprint:isExpressedAs )</tt>  
<tt>ResourceRef ( expression1 )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>ResourceId ( expression1 )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Expression&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:language )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:RFC3066 )</tt>  
<tt>Value String ( "en" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>PropertyURI ( dc:type )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:Type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/type/JournalArticle&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:available )</tt>  
<tt>Literal Value String ( "2001-02"</tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:W3CDTF )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:status )</tt>  
<tt>Vocabulary Encoding Scheme URI ( eprint:Status )</tt>  
<tt>Value URI ( &lt; http://purl.org/eprint/status/PeerReviewed&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:copyrightHolder )</tt>  
<tt>Value String ( "Nature Publishing Group" )</tt>  
<tt>)</tt>  
<tt># Citation and OpenURL context object to be added</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isManifestedAs )</tt>  
<tt>ResourceRef ( pdfmanifestation )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>ResourceId ( pdfmanifestation )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Manifestation&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:format )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:IMT )</tt>  
<tt>Value String ( "application/pdf" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isAvailableAs )</tt>  
<tt>Value URI ( &lt;http://eprints.gla.ac.uk/503/01/Eu_J._Hum_Gen.9(2)143_.pdf&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isAvailableAs )</tt>  
<tt>Value URI ( &lt;http://www.nature.com/ejhg/journal/v9/n2/pdf/5200590a.pdf&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://eprints.gla.ac.uk/503/01/Eu_J._Hum_Gen.9(2)143_.pdf&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Copy&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:accessRights )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/accessRights/OpenAccess&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://www.nature.com/ejhg/journal/v9/n2/pdf/5200590a.pdf&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Copy&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:accessRights )</tt>  
<tt>Value URI ( &lt;http://npg.nature.com/npg/servlet/Content?data=xml/08_home.xml&amp;style=xml/08_home.xsl&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>)</tt>  

### Example 2

<tt>@prefix dc: &lt;http://purl.org/dc/elements/1.1/&gt; .</tt>  
<tt>@prefix dcterms: &lt;http://purl.org/dc/terms/&gt; .</tt>  
<tt>@prefix eprint: &lt;http://purl.org/eprint/terms/&gt; .</tt>  
<tt>@prefix foaf: &lt;http://xmlns.com/foaf/0.1/&gt; .</tt>  
  
<tt>DescriptionSet (</tt>  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://eprints.soton.ac.uk/22934/&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>ValueURI ( &lt;http://purl.org/eprint/entityType/ScholarlyWork&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://eprints.soton.ac.uk/22934/" </tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:title )</tt>  
<tt>Literal Value String ( "Structurally integrated brushless PM motor for miniature propeller thrusters" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:creator )</tt>  
<tt>Value String ( "Abu Sharkh, S.M.A. (Suleiman)" )</tt>  
<tt>ResourceRef ( AbuSharkhSM )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:creator )</tt>  
<tt>Value String ( "Lai, S.H." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:creator )</tt>  
<tt>Value String ( "Turnock, S.R." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:abstract )</tt>  
<tt>Value String ( "The design, analysis and performance of a brushless PM motor that is integrated</tt>  

<tt>in the structure of a  miniature 50 mm diameter propeller thruster is considered;</tt>  
<tt>the stator is fitted in the faired thin duct that surrounds the propeller to improve</tt>  
<tt>its efficiency and protect it from damage, and the rotor is fitted to the rim of the</tt>  
<tt>propeller. Such a thruster is intended for use on small autonomous underwater vehicles</tt>  
<tt>that are being developed for defence, scientific and industry applications. Fitting a</tt>  
<tt>relatively large airgap motor with protective coating within the volume of a thin</tt>  
<tt>propeller duct (&lt;10 mm thick) imposes extreme constraints on the dimensions of the</tt>  
<tt>machine, including a very thin rotor and stator radial thickness and relatively short</tt>  
<tt>axial length in addition to the relatively large airgap, which raises theoretical and</tt>  
<tt>practical issues that have not been considered in the literature. The design of such</tt>  
<tt>a machine is discussed, a demonstrator device is described and FEA and experimental</tt>  
<tt>results are reported." )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:LCSH )</tt>  
<tt>Value String ( "T Technology--TC Hydraulic engineering. Ocean engineering" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:LCSH )</tt>  
<tt>Value String ( "T Technology--TK Electrical engineering. Electronics Nuclear engineering" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:subject )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:LCSH )</tt>  
<tt>Value String ( "T Technology--TL Motor vehicles. Aeronautics. Astronautics" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:affiliatedInstitution )</tt>  
<tt>Value String ( "University of Southampton" )</tt>  
<tt>ResourceRef ( sotonuni )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isExpressedAs )</tt>  
<tt>Value URI ( &lt;http://dx.doi.org/10.1049/ip-epa:20040736&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://dx.doi.org/10.1049/ip-epa:20040736&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>ValueURI ( &lt;http://purl.org/eprint/entityType/Expression&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:language )</tt>  
<tt>Value String ( "en" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/type/JournalArticle&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:identifier )</tt>  
<tt>Literal Value String ( "http://dx.doi.org/doi:10.1049/ip-epa:20040736" </tt>  

<tt>Syntax Encoding Scheme URI ( dcterms:URI )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:available )</tt>  
<tt>Literal Value String ( "2004" </tt>  

<tt>Syntax Encoding Scheme URI (dcterms:W3CDTF )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:status )</tt>  
<tt>Vocabulary Encoding Scheme ( eprint:status )</tt>  
<tt>ValueURI ( &lt;http://purl.org/eprint/status/PeerReviewed&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:copyrightHolder )</tt>  
<tt>Value String ( "Institution of Engineering and Technology" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:bibliographicCitation )</tt>  
<tt>Literal Value String ( "IEE Proceedings - Electric Power Applications, 151, (5), 513-519 (2004)" )</tt>  
<tt>Literal Value String ( "&amp;ctx_ver=Z39.88-2004&amp;rft_val_fmt=info:ofi/fmt:kev:mtx:journal&amp;rft.genre=article</tt>  

<tt>&amp;rft.atitle=Structurally+integrated+brushless+PM+motor+for+miniature+propeller+thrusters</tt>  
<tt>&amp;rft.jtitle=IEE+Proceedings+-+Electric+Power+Applications&amp;rft.volume=151&amp;rft.issue=5</tt>  
<tt>&amp;rft.spage=513&amp;rft.date=2004&amp;rft.issn=1350-2352</tt>  
<tt>&amp;rft.aulast=Sharkh&amp;rft.auinit=S+M+A</tt>  
<tt>&amp;rfr_id=info:sid/eprints.soton.ac.uk"</tt>  

<tt>Syntax Encoding Scheme URI ( &lt;info:ofi/fmt:kev:mtx:ctx&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isManifestedAs )</tt>  
<tt>ResourceRef ( manifestation1 )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>ResourceId ( manifestation1 )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>ValueURI ( &lt;http://purl.org/eprint/entityType/Manifestation&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:format )</tt>  
<tt>Vocabulary Encoding Scheme URI ( dcterms:IMT )</tt>  
<tt>Value String ( "application/pdf" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:publisher )</tt>  
<tt>Value String ( "Institution of Engineering and Technology" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( eprint:isAvailableAs )</tt>  
<tt>Value URI ( &lt;http://scitation.aip.org/getpdf/servlet/GetPDFServlet?filetype=pdf&amp;id=IEPAER000151000005000513000001&amp;idtype=cvips&amp;prog=normal&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>Resource URI ( &lt;http://scitation.aip.org/getpdf/servlet/GetPDFServlet?filetype=pdf&amp;id=IEPAER000151000005000513000001&amp;idtype=cvips&amp;prog=normal&gt; )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Copy&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:licence )</tt>  
<tt>Value URI ( &lt;http://www.ietdl.org/journals/doc/IEEDRL-home/info/subscriptions/terms.jsp&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:accessRights )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/accessRights/RestrictedAccess&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:isPartOf )</tt>  
<tt>Value URI ( &lt;http://www.theiet.org/&gt; )</tt>  
<tt>Value String ( "Institution of Engineering and Technology" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dcterms:isPartOf )</tt>  
<tt>Value URI ( &lt;http://www.ietdl.org/&gt; )</tt>  
<tt>Value String ( "IET Digital Library" )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>ResourceId ( sotonuni )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Organization&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:name )</tt>  
<tt>Literal Value String ( "University of Southampton" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:homepage )</tt>  
<tt>Value URI ( "http://www.soton.ac.uk/" )</tt>  
<tt>)</tt>  
<tt>)</tt>  
  

<tt>Description (</tt>  

<tt>ResourceId ( AbuSharkhSM )</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( dc:type )</tt>  
<tt>Value URI ( &lt;http://purl.org/eprint/entityType/Person&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:givenname )</tt>  
<tt>Literal Value String ( "Suleiman" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:familyname )</tt>  
<tt>Literal Value String ( "Abu Sharkh" )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:homepage )</tt>  
<tt>Value URI ( &lt;http://www.soton.ac.uk/ses/people/AbuSharkhSM.html&gt; )</tt>  
<tt>)</tt>  
<tt>Statement (</tt>  

<tt>Property URI ( foaf:workplaceHomepage )</tt>  
<tt>Value URI ( &lt;http://www.soton.ac.uk/&gt; )</tt>  
<tt>)</tt>  
<tt>)</tt>  
<tt>)</tt>  

 [RefreshCache](http://dublincore.org/architecturewiki/EprintsApplicationProfile?action=refresh&arena=Page.py&key=EprintsApplicationProfile.text_html) for this page (cached 2013-01-04 02:59:20)  

Immutable page (last edited 2009-01-20 09:00:09 by TomBaker)


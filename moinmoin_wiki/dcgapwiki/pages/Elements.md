---
title: DC-Government Application Profile - Elements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcgapwiki/pages/Elements.html"
---

 [DC-Government Application Profile](http://dublincore.org/dcgapwiki/FrontPage)

# > [Elements](http://dublincore.org/dcgapwiki/Elements?action=fullsearch&value=Elements&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcgapwiki/UserPreferences)

Site

- [FrontPage](http://dublincore.org/dcgapwiki/FrontPage)
- [RecentChanges](http://dublincore.org/dcgapwiki/RecentChanges)
- [FindPage](http://dublincore.org/dcgapwiki/FindPage)
- [HelpContents](http://dublincore.org/dcgapwiki/HelpContents)

Page

- [Edit](http://dublincore.org/dcgapwiki/Elements?action=edit "Edit")
- [View](http://dublincore.org/dcgapwiki/Elements "View")
- [Diffs](http://dublincore.org/dcgapwiki/Elements?action=diff "Diffs")
- [Info](http://dublincore.org/dcgapwiki/Elements?action=info "Info")
- [Subscribe](http://dublincore.org/dcgapwiki/Elements?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcgapwiki/Elements?action=raw "Raw")
- [Print](http://dublincore.org/dcgapwiki/Elements?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcgapwiki/Elements?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcgapwiki/Elements?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcgapwiki/Elements?action=DeletePage)
- [LikePages](http://dublincore.org/dcgapwiki/Elements?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcgapwiki/Elements?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcgapwiki/Elements?action=SpellCheck)

Search

<form method="POST" action="/dcgapwiki/Elements">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Elements_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Elements_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### Namespaces
The DC-Government Application Profile uses terms from several namespaces: 
- DCMI Metadata Terms [<img src="Elements_files/moin-www.png" alt="[WWW]" height="11" width="11">http://dublincore.org/documents/dcmi-terms/](http://dublincore.org/documents/dcmi-terms/)

- Endorsed Government metadata standards (UK, Australia, Denmark, Canada(Ontario), Finland)

- The Usage Board has decided that any encoding scheme that has a URI defined in a non-DCMI namespace may be used. DCMI will not define these. Those so far considered for this application profile are indicated.

### Format of entries:
This Application Profile is presented following the [<img src="Elements_files/moin-ftp.png" alt="[FTP]" height="11" width="11">Dublin Core Application Profiles Guidelines](ftp://ftp.cenorm.be/PUBLIC/CWAs/e-Europe/MMI-DC/cwa14855-00-2003-Nov.pdf) produced by the CEN MMI-DC Workshop. 
<table>
  <tbody>
    <tr>
      <td>
        <strong>Name of Term</strong>
      </td>
      <td>
        A unique token assigned to the term.</td>
    </tr>
    <tr>
      <td>
        <strong>Term URI</strong>
      </td>
      <td>
        A Uniform Resource Identifier used to identify the term.</td>
    </tr>
    <tr>
      <td>
        <strong>Label</strong>
      </td>
      <td>
        A human-readable label assigned to the term.</td>
    </tr>
    <tr>
      <td>
        <strong>Defined By</strong>
      </td>
      <td>
        An identifier of a namespace, pointer to a schema, or bibliographic reference for a document within which the term is defined.</td>
    </tr>
    <tr>
      <td>
        <strong>Source Definition</strong>
      </td>
      <td>
        The definition of the term in the namespace in which the term was orginated.</td>
    </tr>
    <tr>
      <td>
        <strong>DC-Gov Definition</strong>
      </td>
      <td>
        The DC-Gov definition of the term.</td>
    </tr>
    <tr>
      <td>
        <strong>Source Comments</strong>
      </td>
      <td>
        Comments on the term from the namespace in which the term orginated.</td>
    </tr>
    <tr>
      <td>
        <strong>DC-Gov Comments</strong>
      </td>
      <td>
        DC-Gov comments about the term.</td>
    </tr>
    <tr>
      <td>
        <strong>Type of term</strong>
      </td>
      <td>
        The grammatical category of the term (e.g. "Element", "Element Refinement", or "Encoding Scheme").</td>
    </tr>
    <tr>
      <td>
        <strong>Refines</strong>
      </td>
      <td>
        The described term semantically refines the referenced term. A 
        refinement makes the meaning of the element narrower or more specific. 
        It will share the meaning of the unrefined element but with a more 
        restricted scope.</td>
    </tr>
    <tr>
      <td>
        <strong>Refined By</strong>
      </td>
      <td>
        The described term is semantically refined by the referenced term.</td>
    </tr>
    <tr>
      <td>
        <strong>Encoding Scheme For</strong>
      </td>
      <td>
        The described term, an encoding scheme, qualifies the referenced term. 
        Using an encoding scheme will aid in the interpretation of an element 
        value. These schemes include controlled vocabularies and formal 
        notations or parsing rules. A value expressed using an encoding scheme 
        will thus be a token selected from a controlled vocabulary (e.g., a term
        from a classification system or set of subject headings) or a string 
        formatted in accordance with a formal notation (e.g., "2000-01-01" as 
        the standard expression of a date). If an encoding scheme is not 
        understood by a client or agent, the value may still be useful to a 
        human reader.In some cases, encoding schemes not yet registered are 
        indicated. These will be registered and/or approved by the DCMI Usage 
        Board as DC Encoding Schemes in the future.</td>
    </tr>
    <tr>
      <td>
        <strong>Has Encoding Scheme</strong>
      </td>
      <td>
        The described term is qualified by the referenced encoding scheme.</td>
    </tr>
    <tr>
      <td>
        <strong>Obligation</strong>
      </td>
      <td>
        Indicates whether the element is required to always or sometimes be 
        present. In this application profile the obligation can be: mandatory 
        (M), mandatory if applicable (MA), strongly recommended (R) or optional 
        (O). Mandatory ensures that some of the elements are always supported 
        and mandatory if applicable means that this element must be supported if
        the information is available. An element with a mandatory obligation 
        must have a value. The strongly recommended and the optional elements 
        should be filled with a value if the information is appropriate to the 
        given resource but if not, they may be omitted.</td>
    </tr>
    <tr>
      <td>
        <strong>Occurence</strong>
      </td>
      <td>
        Indicates any limit to the repeatability of the element.</td>
    </tr>
  </tbody>
</table>


#### General notes regarding all elements

- Either a Title or Identifier are mandatory (Identifier is mandatory if applicable).

- If the record is expressed in a format (e.g., HTML) that allows each element/qualifier/scheme value to be assigned a language attribute (e.g., the HTML tag lang="en"), the use of the attribute is permitted for any or all DC elements as desired.

- All elements may be used as unqualified. If using qualified Dublin Core, additional guidelines are given.

- Any encoding scheme that has a URI defined in a non-DCMI namespace may be used: DCMI will not define these. A mechanism to register these is awaited. Where applicable a table has been created for each encoding scheme in a separate section following the main body of tables for elements and refinements.

## DC-GAP Elements

<table>
  <tbody>
    <tr>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong>CA</strong>
      </td>
      <td>
        <strong>DK</strong>
      </td>
      <td>
        <strong>NL</strong>
      </td>
      <td>
        <strong>NZ</strong>
      </td>
      <td>
        <strong>UK</strong>
      </td>
      <td>
        <strong>FI</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Namespace</strong>
      </td>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>DC-GOV Recom.</strong>
      </td>
      <td>
        <strong># uses conform DC-GOV</strong>
      </td>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong>GO-ITS</strong>
      </td>
      <td>
        <strong>?</strong>
      </td>
      <td>
        <strong>OVERHEID </strong>
      </td>
      <td>
        <strong>NZGLS</strong>
      </td>
      <td>
        <strong>GOVTALK</strong>
      </td>
      <td>
        <strong>JHS143</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/title">title</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/alternative">alternative</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/creator">creator</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        1</td>
      <td>
        D</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        D</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/contributor">contributor</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/publisher">publisher</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/subject">subject</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/description">description</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/abstract">abstract</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/tableOfContents">tableOfContents</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/date">date</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/created">created</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/valid">valid</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/available">available</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/issued">issued</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/modified">modified</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/dateCopyrighted">dateCopyrighted</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>LOCGOV</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/dateCaptured">dateCaptured</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        0</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/type">type</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/format">format</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/extent">extent</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/medium">medium</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/identifier">identifier</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/bibliographicCitation">bibliographicCitation</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/source">source</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/language">language</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/relation">relation</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/isVersionOf">isVersionOf</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/isFormatOf">isFormatOf</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/hasFormat">hasFormat</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/isReplacedBy">isReplacedBy</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/replaces">replaces</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/isPartOf">isPartOf</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/hasPart">hasPart</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/requires">requires</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/isReferencedBy">isReferencedBy</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/references">references</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/coverage">coverage</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/spatial">spatial</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/temporal">temporal</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/rights">rights</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/audience">audience</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        3</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/educationLevel">educationLevel</a></strong>
      </td>
      <td bgcolor="#80FF80">
        Rec</td>
      <td>
        2</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


### Special DC Gov Elements

<table>
  <tbody>
    <tr>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong>DC</strong>
      </td>
      <td>
        <strong>CA</strong>
      </td>
      <td>
        <strong>DK</strong>
      </td>
      <td>
        <strong>NL</strong>
      </td>
      <td>
        <strong>NZ</strong>
      </td>
      <td>
        <strong>UK</strong>
      </td>
      <td>
        <strong>FI</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>Namespace</strong>
      </td>
      <td>
        <strong>Element</strong>
      </td>
      <td>
        <strong>DC-GOV Recom.</strong>
      </td>
      <td>
        <strong># uses conform DC-GOV</strong>
      </td>
      <td>
        <strong>DCTERMS</strong>
      </td>
      <td>
        <strong>GO-ITS</strong>
      </td>
      <td>
        <strong>?</strong>
      </td>
      <td>
        <strong>OVERHEID </strong>
      </td>
      <td>
        <strong>NZGLS</strong>
      </td>
      <td>
        <strong>GOVTALK</strong>
      </td>
      <td>
        <strong>JHS143</strong>
      </td>
    </tr>
    <tr>
      <td>
        <strong>GO-ITS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/version">version</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        N </td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>GOVTALK</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/location">location</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>GO-ITS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/mandate">mandate</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        2</td>
      <td>
        N</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>GO-ITS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/contact">contact</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>NZGLS</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/function">function</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
        Y</td>
      <td>
        N</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>JHS143</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/status">status</a></strong>
      </td>
      <td bgcolor="#FFFF80">
        issue</td>
      <td>
        2</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
        Y</td>
    </tr>
    <tr>
      <td>
        <strong>JHS143</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/audittrail">audittrail</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
        Y</td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/organsationType">organsationType</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/isRatifiedBy">isRatifiedBy</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        ?</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/accessibility">accessibility</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        ?</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/category">category</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/nextVersionDue">nextVersionDue</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        ?</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>OVERHEID</strong>
      </td>
      <td>
        <strong><a class="nonexistent" href="http://dublincore.org/dcgapwiki/updatingFrequency">updatingFrequency</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
      <td>
        ?</td>
      <td>
      </td>
    </tr>
    <tr>
      <td>
        <strong>GOVTALK</strong>
      </td>
      <td>
        <strong><a href="http://dublincore.org/dcgapwiki/addressee">addressee</a></strong>
      </td>
      <td bgcolor="#8080FF">
        Prop</td>
      <td>
        1</td>
      <td>
        N</td>
      <td>
      </td>
      <td>
      </td>
      <td>
        N</td>
      <td>
      </td>
      <td>
        Y</td>
      <td>
      </td>
    </tr>
  </tbody>
</table>


#### Recommendation

<table>
  <tbody>
    <tr>
      <td bgcolor="#8080FF">
        <strong>Prop</strong>
      </td>
      <td>
        Proposed - Candidate element, once suggested, possibly adapted by DC-Government </td>
    </tr>
    <tr>
      <td bgcolor="#80FF80">
        <strong>Rec</strong>
      </td>
      <td>
        Recommended by DC-government </td>
    </tr>
    <tr>
      <td bgcolor="#FFFF80">
        <strong>issue</strong>
      </td>
      <td>
        issue - There is an issue on this element which needs discussion to decide on recommendation or deprication</td>
    </tr>
    <tr>
      <td bgcolor="#FF8080">
        <strong>Depr</strong>
      </td>
      <td>
        Depricated - Element is not compliant with DC </td>
    </tr>
  </tbody>
</table>


#### Usage

<table>
  <tbody>
    <tr>
      <td>
        <strong>Y</strong>
      </td>
      <td>
        Yes </td>
    </tr>
    <tr>
      <td>
        <strong>N</strong>
      </td>
      <td>
        No </td>
    </tr>
    <tr>
      <td>
        <strong>D</strong>
      </td>
      <td>
        Different from DC-Government AP </td>
    </tr>
  </tbody>
</table>


## Encoding Schemes
 [Box](http://dublincore.org/dcgapwiki/Box) [DCMIType](http://dublincore.org/dcgapwiki/DCMIType) [DOI](http://dublincore.org/dcgapwiki/DOI) [IMT](http://dublincore.org/dcgapwiki/IMT) [ISBN](http://dublincore.org/dcgapwiki/ISBN) [ISO3166](http://dublincore.org/dcgapwiki/ISO3166) [ISO639-2](http://dublincore.org/dcgapwiki/ISO639_2d2) [ISO8601](http://dublincore.org/dcgapwiki/ISO8601) [ISSN](http://dublincore.org/dcgapwiki/ISSN) [Period](http://dublincore.org/dcgapwiki/Period) [Point](http://dublincore.org/dcgapwiki/Point) [RFC3066](http://dublincore.org/dcgapwiki/RFC3066) [URI](http://dublincore.org/dcgapwiki/URI) [W3CDTF](http://dublincore.org/dcgapwiki/W3CDTF) 

 [RefreshCache](http://dublincore.org/dcgapwiki/Elements?action=refresh&arena=Page.py&key=Elements.text_html) for this page (cached 2012-12-22 16:19:53)  

Immutable page (last edited 2009-11-16 16:35:41 by [HansOverbeek](http://dublincore.org/dcgapwiki/HansOverbeek))


---
title: "- DCRDFApril2007Comments"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFApril2007Comments.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFApril2007Comments](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=fullsearch&value=DCRDFApril2007Comments&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFApril2007Comments "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFApril2007Comments">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFApril2007Comments_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFApril2007Comments_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Comments on the april 2007 version of DC-RDF

The following comments and issues were raised during public comment for the [<img src="DCRDFApril2007Comments_files/moin-www.png" alt="[WWW]" height="11" width="11">april 2007 version of DC-RDF](http://dublincore.org/documents/2007/04/02/dc-rdf/).

[<img src="DCRDFApril2007Comments_files/moin-www.png" alt="[WWW]" height="11" width="11">Link to Douglas' discussion](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0705&L=dc-architecture&T=0&F=&S=&X=1D14427E5D7A32E084&Y=mikael%40nilsson.name&P=170)

[<img src="DCRDFApril2007Comments_files/moin-www.png" alt="[WWW]" height="11" width="11">Link to Ivan's discussion](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0704&L=dc-architecture&T=0&F=&S=&X=7EA12260DF766D545E&Y=mikael%40nilsson.name&P=1308)

### Value-VES relationship as instance-Of v memberOf

Could the relationship between value and VES be expressed as instanceOf (rdf:type) (with VES as Class) rather than dcam:memberOf?

The current recommendation takes this approach but that has been changed:

- to avoid confusion with "traditional" DCMI concept of VES

- the instance-of relationship between value and VES created problems for integration with SKOS, where the relationship between a concept and a concept scheme is skos:inScheme, not instance-of

#### Proposals

- No change required.

### RDF summary
It was suggested that the RDF summary would go into an appendix 
#### Proposal
As the RDF terminology and graph notation is used later in the document, the section should probably be kept. 
### Include DC-TEXT in all examples

#### Proposal
Should be done. 
### Wording section 4
The language on describing value at the end of section 5 could be improved 
#### Proposal
Improve language 
### Wording section 5
Suggest improving the "Value classes" bullet list with concrete examples. 
#### Proposal
Should be done 
### dcterms:type issue

Examples use dcterms:type but text says to use rdf:type.

#### Proposal
Examples are correct; dcterms:type in DC-TEXT should be converted to rdf:type in RDF. 
### Examples description improvement
Add plain language describing the content of the metadata examples 
#### Proposal
Should be done 
### Example of multiple languages
Add multiple language strings in multiple languages to one of the examples. 
#### Proposal
Should be done 
### rdfs:label preferred over rdf:value
There is an issue with finding the right label for display purposes. 
#### Proposal
rdfs:label is not an option, as the semantics does not match the definition of value string. 
### dcterms:type vs rdf:type
There is an issue with declaring a sub-property of rdf:type. OWL-DL will not accept assertion that dcterms:type is rdfs:subPropertyOf rdf:type. 
#### Proposal
This is a UB issue, really. 
- Remove statement that dcterms:type is rdfs:subPropertyOf rdf:type.

- State that in mapping from DCAM to RDF, dcterms:type maps to rdf:type

### Usage of rdf:ID vs rdf:nodeId

Last example not clear about the mapping of DC-TEXT IDs

#### Proposal
Make clear that no URI is created in the mapping of blank nodes 
## Updates

Some further comments:

[http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0707&L=dc-architecture&T=0&F=&S=&X=6BF2CC1AF89E3F5A74&Y=mikael%40nilsson.name&P=808](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0707&L=dc-architecture&T=0&F=&S=&X=6BF2CC1AF89E3F5A74&Y=mikael%40nilsson.name&P=808)

(i) Some of the DC-Text examples (in the main text and in the appendix) include a namespace declaration for

@prefix rdfs: < [http://www.w3.org/1999/02/22-rdf-syntax-ns#>](http://www.w3.org/1999/02/22-rdf-syntax-ns#%3E)

I don't think the rdfs prefix is ever used in the examples, so it doesn't result in any problems, but I guess it might be confusing to the casual reader who is accustomed to seeing that URI associated with the rdf prefix. I think it could be removed without causing any problems.

(ii) In the fifth example in the appendix table, the RDF/XML has an XML Namespace declaration

xmlns:dcam=" [http://purl.org/dc/rdf/](http://purl.org/dc/rdf/)"

which I think should be

xmlns:dcam=" [http://purl.org/dc/dcam/](http://purl.org/dc/dcam/)"

and in this case the dcam prefix is used in a QName for a property URI, so it does matter.

(iii) In the sixth and eighth examples in the appendix table, the RDF/XML has an XML Namespace declaration

xmlns:dcrdf=" [http://purl.org/dc/rdf/](http://purl.org/dc/rdf/)"

which I think is a hangover from the previous version. I don't think the XML uses any QNames with the dcrdf prefix (because we switched from using a DCMI property to rdf:value), so again it doesn't cause any problems, but I think that declaration can be removed (and probably should be so that people don't start speculating that there is some other set of URIs waiting in the wings)

(iv) The targets of several of the hyperlinks in the references section are stage.dublincore.org URIs (so throw up an authentication challenge when clicked); they should just be dublincore.org URIs

As this is still a "Proposed Rec", I assume it is fine just to make those edits when we are preparing the "Recommendation" version. i.e. I don't think it's sufficiently urgent to merit re-editing/re-posting the document immediately - but if you want to get it out of the way, go ahead! <img src="DCRDFApril2007Comments_files/smile4.png" alt=";-)" height="15" width="15">

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFApril2007Comments?action=refresh&arena=Page.py&key=DCRDFApril2007Comments.text_html) for this page (cached 2012-12-30 06:14:15)  

Immutable page (last edited 2007-07-16 17:02:26 by MikaelNilsson)


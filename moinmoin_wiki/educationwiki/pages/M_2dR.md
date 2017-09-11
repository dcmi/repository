---
title: "- M-R"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/pages/M_2dR.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [M-R](http://dublincore.org/educationwiki/M_2dR?action=fullsearch&value=M-R&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/educationwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/educationwiki/FrontPage)
- [RecentChanges](http://dublincore.org/educationwiki/RecentChanges)
- [FindPage](http://dublincore.org/educationwiki/FindPage)
- [HelpContents](http://dublincore.org/educationwiki/HelpContents)

Page

- [Edit](http://dublincore.org/educationwiki/M_2dR?action=edit "Edit")
- [View](http://dublincore.org/educationwiki/M_2dR "View")
- [Diffs](http://dublincore.org/educationwiki/M_2dR?action=diff "Diffs")
- [Info](http://dublincore.org/educationwiki/M_2dR?action=info "Info")
- [Subscribe](http://dublincore.org/educationwiki/M_2dR?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/educationwiki/M_2dR?action=raw "Raw")
- [Print](http://dublincore.org/educationwiki/M_2dR?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/educationwiki/M_2dR?action=AttachFile)
- [DSP2XML](http://dublincore.org/educationwiki/M_2dR?action=DSP2XML)
- [DeletePage](http://dublincore.org/educationwiki/M_2dR?action=DeletePage)
- [LikePages](http://dublincore.org/educationwiki/M_2dR?action=LikePages)
- [LocalSiteMap](http://dublincore.org/educationwiki/M_2dR?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/educationwiki/M_2dR?action=SpellCheck)

Search

<form method="POST" action="/educationwiki/M_2dR">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="M_2dR_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="M_2dR_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### DC-Ed AP elements and element-refinements, M-R

[<img src="M_2dR_files/moin-www.png" alt="[WWW]" height="11" width="11">G-L](http://dublincore.org/educationwiki/G_2dL) | [<img src="M_2dR_files/moin-www.png" alt="[WWW]" height="11" width="11">S-Z](http://dublincore.org/educationwiki/S_2dZ)

**Mediator**

- Source Definition: A class of entity that mediates access to the resource and for whom the resource is intended or useful.

- Source Comments: The audiences for a resource are of two basic classes: (1) an ultimate beneficiary of the resource, and (2) frequently, an entity that mediates access to the resource. The mediator element refinement represents the second of these two classes.

- DC-Ed Comments:

- Type of term: element-refinement

- Refines: audience

- Has Encoding Scheme

- Obligation

- Occurrence

**Medium**

- Source Definition: The material or physical carrier of the resource.

- Source Comments: [none]

- DC-Ed Comments: Use to specify the medium of the physical carrier of a resource (print or electronic media like a CD-ROM, disk or DVD). Format should be repeated if both are applicable (e.g. a PDF file on CD). Format without an element refinement qualifier should be used to specify the electronic format of the resource, using the encoding scheme Internet Media Type (IMT) often called mime types.

- Type of term: element-refinement

- Refines: format

- Has Encoding Scheme

- Obligation:

- Occurrence

**Modified**

- Source Definition: Date on which the resource was changed.

- Source Comments: [none]

- DC-Ed Comments: The use of this refinement is not recommended. If a resource is modified best practice is to treat the resource as a separate entity and create a relationship hasVersion or isReplacedBy

- Type of term: element-refinement

- Refines: date

- Has Encoding Scheme

- Obligation: Optional (O)

- Occurrence

**Provenance**

- Source Definition: A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity and interpretation.

- Source Comments: The statement may include a description of any impact that changes of ownership may have on use of the resource.

- DC-Ed Comments

- Type of term: element

- Has Encoding Scheme

- Obligation

- Occurrence

**Publisher**

- Source Definition: An entity responsible for making the resource available.

- Source Comments: Examples of a Publisher include a person, an organization, or a service. Typically, the name of a Publisher should be used to indicate the entity.

- DC-Ed Comments: A subset of terms taken from the Library of Congress list of Relators has been approved for use as role refinements of Publisher if applicable ( [http://www.loc.gov/marc/sourcecode/relator/relatorlist.html](http://www.loc.gov/marc/sourcecode/relator/relatorlist.html)). URIs will be provided when available. Although some applications may wish to conflate Creator, Contributor and Publisher, DC-Ed maintains the distinction between Creator and Contributor (which may be conflated) and Publisher.

- Type of term: element

- Has Encoding Scheme:

- Obligation: **O**

- Occurrence

**References**

- Source Definition: The described resource references, cites, or otherwise points to the referenced resource.

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: relation

- Has Encoding Scheme

- Obligation

- Occurrence

**Relation**

- Source Definition: A reference to a related resource.

- Source Comments: Recommended best practice is to reference the resource by means of a string or number conforming to a formal identification system.

- DC-Ed Comments: Relation without qualifier is optional; where it is qualified the recommendation for the qualifier should be followed. If using qualifiers, use the most specific one that is applicable. When no Identifier is available, a bibliographic description may be constructed. Recommended use with qualifiers in certain educational situations:

1. 

When the resource aligns with an established standard.

2. 

When the resource requires other resources

3. 

When the resource is required by another resource.

- Type of term: element-refinement

- Refined By: conformsTo; hasFormat; hasMetadata; hasPart; hasVersion; isFormatOf; isPartOf; isReferencedBy; [IsReplacedBy](http://dublincore.org/educationwiki/IsReplacedBy); isRequiredBy; isVersionOf; references; replaces; requires

- Has Encoding Scheme

- Obligation

- Occurrence

**Replaces**

- Source Definition: The described resource supplants, displaces, or supersedes the referenced resource.

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: relation

- Has Encoding Scheme

- Obligation

- Occurrence

**Requires**

- Source Definition: The described resource requires the referenced resource to support its function, delivery, or coherence of content.

- Source Comments: [none]

- DC-Ed Comments

- Type of term: element-refinement

- Refines: relation

- Has Encoding Scheme

- Obligation

- Occurrence

**Rights**

- Source Definition: Information about rights held in and over the resource.

- Source Comments: Typically, a Rights element will contain a rights management statement for the resource, or reference a service providing such information. Rights information often encompasses Intellectual Property Rights (IPR), Copyright, and various Property Rights. If the Rights element is absent, no assumptions can be made about the status of these and other rights with respect to the resource.

- DC-Ed Comments: Recommend use of an element refinement for completeness. Recommend inclusion of terms of use (commercial or educational) and derivative works information.

- Type of term: element

- Refined by: accessRights; license

- Has Encoding Scheme

- Obligation

- Occurrence

**[RightsHolder](http://dublincore.org/educationwiki/RightsHolder)**

- Source Definition: A person or organization owning or managing rights over the resource.

- Source Comments: Recommended best practice is to use the URI or name of the Rights Holder to indicate the entity.

- DC-Ed Comments

- Type of term: element

- Has Encoding Scheme

- Obligation

- Occurrence

[<img src="M_2dR_files/moin-www.png" alt="[WWW]" height="11" width="11">G-L](http://dublincore.org/educationwiki/G_2dL) | [<img src="M_2dR_files/moin-www.png" alt="[WWW]" height="11" width="11">S-Z](http://dublincore.org/educationwiki/S_2dZ)

 [RefreshCache](http://dublincore.org/educationwiki/M_2dR?action=refresh&arena=Page.py&key=M_2dR.text_html) for this page (cached 2012-12-08 16:51:35)  

Immutable page (last edited 2005-08-30 09:05:43 by mikecollett)


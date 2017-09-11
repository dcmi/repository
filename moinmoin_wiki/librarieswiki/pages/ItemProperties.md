---
title: "- ItemProperties"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/librarieswiki/pages/ItemProperties.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ItemProperties](http://dublincore.org/librarieswiki/ItemProperties?action=fullsearch&value=ItemProperties&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/librarieswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/librarieswiki/FrontPage)
- [RecentChanges](http://dublincore.org/librarieswiki/RecentChanges)
- [FindPage](http://dublincore.org/librarieswiki/FindPage)
- [HelpContents](http://dublincore.org/librarieswiki/HelpContents)

Page

- [Edit](http://dublincore.org/librarieswiki/ItemProperties?action=edit "Edit")
- [View](http://dublincore.org/librarieswiki/ItemProperties "View")
- [Diffs](http://dublincore.org/librarieswiki/ItemProperties?action=diff "Diffs")
- [Info](http://dublincore.org/librarieswiki/ItemProperties?action=info "Info")
- [Subscribe](http://dublincore.org/librarieswiki/ItemProperties?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/librarieswiki/ItemProperties?action=raw "Raw")
- [Print](http://dublincore.org/librarieswiki/ItemProperties?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/librarieswiki/ItemProperties?action=AttachFile)
- [DSP2XML](http://dublincore.org/librarieswiki/ItemProperties?action=DSP2XML)
- [DeletePage](http://dublincore.org/librarieswiki/ItemProperties?action=DeletePage)
- [LikePages](http://dublincore.org/librarieswiki/ItemProperties?action=LikePages)
- [LocalSiteMap](http://dublincore.org/librarieswiki/ItemProperties?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/librarieswiki/ItemProperties?action=SpellCheck)

Search

<form method="POST" action="/librarieswiki/ItemProperties">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ItemProperties_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ItemProperties_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

### Properties used with an Item

#### Identifier

**Name:** identifier 

**URI:** [http://purl.org/dc/elements/1.1/identifier](http://purl.org/dc/elements/1.1/identifier)

**Definition:** An unambiguous reference to the resource within a given context.

**Type of Term:** Property

**DCLIB-Comment:**

  - _Unique-resource identifier:_ Provide identifiers assigned to one-of-a-kind resources (such as accession numbers assigned to items in a museum collection) if one or more of this class of identifiers have been assigned to the resource and are known to the metadata agency. Local identifiers should be expressed in a form that guarantee global uniqueness. For instance, local accession number should be expanded into NBN (which can be expressed as HTTP URI; for instance, in [http://urn.fi/URN:NBN:fi-fe201010142588](http://urn.fi/URN:NBN:fi-fe201010142588) NBN is fi-fe201010142588).

**Has Range:** dc:identifier may be used with literal or non-literal values. For further information see [<img src="ItemProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace). 

**SES:**

  - URI - [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI).

**Obligation:** MA 

**Occurence:** 0-n

#### Holding Location

**Name:** availability 

**URI:** [http://www.agls.gov.au/agls/terms/availability](http://www.agls.gov.au/agls/terms/availability)

**Definition:** How the resource can be obtained or accessed, or contact information.

**Type of Term:** Property

**DCLIB-Comment:** Use for a physical location that allows the user to retrieve the item when a URI is not appropriate (e.g. for physical items not available electronically). This also facilitates access if the URI doesn't retrieve anything or only a poor substitute. Can also contain further identification within a location such as call number, accession number.

**Has Range:** [http://www.w3.org/2000/01/rdf-schema#Literal](http://www.w3.org/2000/01/rdf-schema#Literal)

**SES:** MARC Code list for Organizations - [http://www.loc.gov/marc/organizations/](http://www.loc.gov/marc/organizations/)

**Obligation:** MA

**Occurence:** 0-1

#### Description

**Name:** description 

**URI:** [http://purl.org/dc/elements/1.1/description](http://purl.org/dc/elements/1.1/description)

**Definition:** An account of the resource.

**Type of Term:** Property

**DCLIB-Comment:**

  - It is permitted to link one or more external descriptions using a URI.

**Has Range:**
  - dc:description may be used with literal or non-literal values. For further information see [<img src="ItemProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Legacy Namespace as Linked Data](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_legacy_namespace).

**SES:** Using a URL the Syntax Encoding [http://purl.org/dc/terms/URI](http://purl.org/dc/terms/URI) should be used. 

**Obligation:** O

**Occurence:** 0-n

#### Provenance

**Name:** Provenance 

**URI:** [http://purl.org/dc/terms/provenance](http://purl.org/dc/terms/provenance)

**Definition:** A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation.

**Type of Term:** Property

**DCLIB-Comment:**

  - Has to be used with non-literal values.You may link to a provenance statement by URI. If no URI exist use a blank node describing the provenance (see [<img src="ItemProperties_files/moin-www.png" alt="[WWW]" height="11" width="11">Properties of the Terms Namespace used only with Non-Literal Values](http://colab.mpdl.mpg.de/mediawiki/PublishingMetadata#Properties_of_the_terms_namespace_used_only_with_non-literal_values))

**Has Range:** [http://purl.org/dc/terms/ProvenanceStatement](http://purl.org/dc/terms/ProvenanceStatement)

**Obligation:** O

**Occurence:** 0-1

#### Exemplar Of

**Name:** isExemplarOf 

**URI:** [http://iflastandards.info/ns/fr/frbr/frbrer/P2006](http://iflastandards.info/ns/fr/frbr/frbrer/P2006)

**Definition:** Relates an item to the manifestation that is exemplified by the item.

**Type of Term:** Property

**DCLIB-Comment:** The relation between an item and the bibliographicTextResouce.

**Has Range:** The "Manifestation" level of the bibliographicTextResource

**Has Domain:** Item

**Obligation:** M

**Occurence:** 1

* * *

Go back to [DescriptionSetProfile](http://dublincore.org/librarieswiki/DescriptionSetProfile)

 [RefreshCache](http://dublincore.org/librarieswiki/ItemProperties?action=refresh&arena=Page.py&key=ItemProperties.text_html) for this page (cached 2012-12-04 18:48:35)  

Immutable page (last edited 2010-12-01 19:18:32 by StefanieRuehle)


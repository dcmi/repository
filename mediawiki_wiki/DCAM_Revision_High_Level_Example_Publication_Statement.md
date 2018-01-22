---
title: DCAM Revision High Level Example Publication Statement
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 July 2012, at 09:12.  
This page has been accessed 114,723 times.

In ISBD there is a high-level element "Publication, production, distribution, etc area" (URI: isbd:P1162). The documentations says "including the place of publication, production and/or distribution; the name of publisher, producer, and/or distributor; the date of publication, production, and/or distribution; the place of printing or manufacture; the name of printer or manufacturer; and the date of printing or manufacture." The element is not repeatable, but constituent elements are repeatable:

- Place of publication, production and/or distribution statement (isbd:P1168)
- Name of publisher, producer and/or distributor statement (isbd:P1169)
- Date of publication, production and/or distribution (isbd:P1018)
- Place of printing or manufacture (isbd:P1019)
- Name of printer or manufacturer (isbd:P0120)
- Date of printing or manufacture (isbd:P1021)

Some attributes have internal structure, simplified here.

The syntax of ISBD is based on punctuation separating (and partially identifying) component elements.

Examples:

Simple: [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution]

Complex: [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution]&nbsp;; [Place of publication, production and/or distribution statement]&nbsp;: [Name of publisher, producer and/or distributor statement], [Date of publication, production and/or distribution] ([Place of printing or manufacture]&nbsp;: [Name of printer or manufacturer], [Date of printing or manufacture])

[] indicates an element and is not part of the syntax.

In MARC21 there is a high-level element "260 - Publication, Distribution, etc. (Imprint)" (m21:M260). This element is repeatable. The constituent elements are all repeatable:

- $a - Place of publication, distribution, etc. (m21:M260a)
- $b - Name of publisher, distributor, etc. (m21:M260b)
- $c - Date of publication, distribution, etc. (m21:M260c)
- $e - Place of manufacture (m21:M260e)
- $f – Manufacturer (m21:M260f)
- $g - Date of manufacture (m21:M260g)

Examples:

Simple: 260$aNew York, N.Y.&nbsp;:$bElsevier,$c1984.

Complex: 260$aLondon&nbsp;:$bArts Council of Great Britain,$c1976$e(Twickenham&nbsp;:$fCTD Printers,$g1974)

#### Notes 

ISBD and MARC21 have common origins, and often align (more or less).

ISBD elements [Place of publication, production and/or distribution statement] and [Name of publisher, producer and/or distributor statement] are themselves aggregations of more refined elements. The refined elements are not separately identified in MARC21.

[kc: It may not be obvious to those who have not taken a course in library cataloging... but the values for the elements here are, by definition and by their semantics, character strings. While the element is called "Place of publication" in fact the value is a transcription of the place of publication given on (in the case of a book) the title page. This string may or may not represent what one would consider a valid "place" entity. If the place given on the title page is wrong (e.g. "Nwe York") it is transcribed in that way, with the option of adding the correct place (if known) in the same string, using square brackets to indicate that it has been added by the cataloger and does not represent the title page itself. Thus:

<dl><dd>Nwe York [New York]
</dd></dl>


Ditto for the other elements in this example: they are transcriptions from the resource itself and serve as a detailed description of the information on the source. This makes more difference in older works and in ones that don't come from mainstream publishers. The purpose is to be able to identify two items, cataloged separately, as representing the exact same resource, same printing.

Also, if there is more than one place of publication but only one publisher, the two places are given in the "place" position in the resulting string:

<dl><dd>London ; Chicago
</dd></dl>
<dl><dd>London ; Chicago : Penguin, 2003
</dd></dl>


but if there is more than one publisher, then place _and_ publication are repeated:

<dl><dd>New York : Columbia University ; Boston : Computer Research Institute
</dd></dl>


I don't know if this changes the solution, but we should avoid assumptions such as thinking that a "place of publication" could be a string _or_ a URI. In this particular case they are all strings, and there are no controlled vocabularies. This could keep us from going off in a not very useful direction in our discussion.]

The URIs given for MARC21 elements are placeholders.

Back to [DCAM revision design patterns](/mediawiki_wiki/DCAM_Revision_Design_Patterns)

[kc: In MARC, at least, each "statement" must have at least one $a, one $b and one $c. If the information is missing (e.g. no place of publication), then you get a "$a no place of publication". In MARC, elements $a $b $c are repeatable, but the cataloging rules seem to require at least one of each: $a[S.l.&nbsp;:$bs.n.,$c15--?] .] [gd: In ISBD, place of publication uses the string "s.l." and name of publisher "s.n." if the information is missing. Note that the MARC example given by kc is using the Anglo-American Cataloguing Rules (not ISBD) which are generally being superseded by RDA; RDA also mandates the use of a default string for these two elements.]


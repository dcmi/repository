---
title: DCAM Revision Example Name Heading
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision_Example_Name_Heading.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 22 May 2012, at 02:03.  
This page has been accessed 94,913 times.

This example is similar to the publication statement, in that it is a grouping of elements in a particular order. It has some differences because the elements themselves are mostly not fixed and they are all optional except one. This type of heading is not part of ISBD, which is limited to description and does not include access.

A name heading is very complex, but we can reduce it down to a small elements for this discussion. For starters, we should consider the elements that are associated with a personal name:

- $a - Personal name (NR) - Surname and/or forename; letters, initials, abbreviations, phrases, or numbers used in place of a name; or a family name.

- $b - Numeration (NR) - Roman numeral or roman numeral and a subsequent part of a forename when the first indicator value is 0.

- $c - Titles and other words associated with a name (R)

- $d - Dates associated with a name (NR) - Dates of birth, death, or flourishing, or any other date associated with a name.

- $e - Relator term (R) - Relationship between a name and a work.

- $g - Miscellaneous information (NR) - Data element not more appropriately contained in another defined subfield.

- $j - Attribution qualifier (R) - Attribution information for names when the responsibility is unknown, uncertain, fictitious or pseudonymous.

- $q - Fuller form of name (NR) - More complete form of the name contained in subfield $a.

We can assume that only the $a (using the MARC subfield designation) is required. All other subfields are added if necessary, with necessity being defined by quite complex cataloging rules. (e.g. $b, $c are "mandatory if applicable"; $q, I believe, is required only if there are abbreviations or initialisms in $a (e.g. $a Smith, J $q John).

Some examples:

<dl><dd>$a Saur, Karl-Otto, $c Jr. 
</dd></dl>
<dl><dd>$a Kalashnikov, S. D. $q (Sergei Dmitrievich) 
</dd></dl>
<dl><dd>$a Black Foot, $c Chief, $d d. 1877 $c (Spirit) 
</dd></dl>
<dl><dd>$a Salisbury, James Cecil, $c Earl of, $d d. 1683 
</dd></dl>
<dl><dd>$a Gustaf $b V, $c King of Sweden, $d 1858-1950 
</dd></dl>


While the order of the subfields generally follows a pattern, as you can see in this example:

<dl><dd>$a Black Foot, $c Chief, $d d. 1877 $c (Spirit) 
</dd></dl>


there are exceptions. Therefore, the order must be assumed to be the order in which the elements are presented in the data, not an algorithmically determined one.


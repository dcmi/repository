---
title: DCAM Revision High Level Example Core Elements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DCAM_Revision_High_Level_Example_Core_Elements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 7 June 2012, at 22:59.  
This page has been accessed 92,585 times.

The RDA documentation says "Certain elements in RDA are identified as core elements … As a minimum, a resource description … should include all the core elements that are applicable and readily ascertainable. The description should also include any additional elements that are required in a particular case to differentiate the resource from one or more other resources bearing similar identifying information."

Example (RDA elements for FRBR Work):

Core:

- Date of work (rda:dateOfWork)
- Form of work (rda:formOfWork)
- Key (rda:keyWork) [note a]
- Numeric designation of a musical work (rda:numericDesignationOfAMusicalWork) [note a]
- Equinox (rda:equinox) [note b]
- ...

Enhanced:

- Intended audience (rda:intendedAudienceWork)
- Nature of the content (rda:natureOfTheContentWork)
- Coordinates of cartographic content (rda:coordinatesOfCartographicContentWork [note b]
- ...

The ISBD documentation says "A small number of elements of the description, such as a title, are mandatory and must be included in any ISBD description. Other elements, such as an edition statement, are mandatory if the information is available. Elements are designated by the term Mandatory or Mandatory if available or Mandatory if applicable after the heading for the element."

Example:

Mandatory:

- Media type (isbd:P1003)
- Date of publication, production and/or distribution (isbd:P1018)
- ...

Mandatory if applicable:

- Statement of coordinates and equinox (isbd:P1049) [note b]
- Music format statement (Notated music) (isbd:P1014) [note a]
- ...

Not mandatory:

- Statement of equinox (isbd:P1052) [note b]
- Date of printing or manufacture (isbd:P1021)
- ...

#### Note 

- [a] Applies only to musical works.
- [b] Applies only to cartographic works.

Note the intersection of ISBD elements with [Publication statement example](/mediawiki_wiki/DCAM_Revision_High_Level_Example_Publication_Statement "DCAM Revision High Level Example Publication Statement").

Back to [DCAM revision design patterns](/mediawiki_wiki/DCAM_Revision_Design_Patterns "DCAM Revision Design Patterns").


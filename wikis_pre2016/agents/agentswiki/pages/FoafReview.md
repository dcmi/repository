---
title: "- FoafReview"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/agentswiki/pages/FoafReview.html"
---

# > [FoafReview](http://dublincore.org/agentswiki/FoafReview?action=fullsearch&value=FoafReview&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/agentswiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/agentswiki/FrontPage)
- [RecentChanges](http://dublincore.org/agentswiki/RecentChanges)
- [FindPage](http://dublincore.org/agentswiki/FindPage)
- [HelpContents](http://dublincore.org/agentswiki/HelpContents)

Page

- [Edit](http://dublincore.org/agentswiki/FoafReview?action=edit "Edit")
- [View](http://dublincore.org/agentswiki/FoafReview "View")
- [Diffs](http://dublincore.org/agentswiki/FoafReview?action=diff "Diffs")
- [Info](http://dublincore.org/agentswiki/FoafReview?action=info "Info")
- [Subscribe](http://dublincore.org/agentswiki/FoafReview?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/agentswiki/FoafReview?action=raw "Raw")
- [Print](http://dublincore.org/agentswiki/FoafReview?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/agentswiki/FoafReview?action=AttachFile)
- [DSP2XML](http://dublincore.org/agentswiki/FoafReview?action=DSP2XML)
- [DeletePage](http://dublincore.org/agentswiki/FoafReview?action=DeletePage)
- [LikePages](http://dublincore.org/agentswiki/FoafReview?action=LikePages)
- [LocalSiteMap](http://dublincore.org/agentswiki/FoafReview?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/agentswiki/FoafReview?action=SpellCheck)

Search

<form method="POST" action="/agentswiki/FoafReview">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="FoafReview_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="FoafReview_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

**This review of FOAF against the Agent Description Requirements ( [<img src="FoafReview_files/moin-www.png" alt="[WWW]" height="11" width="11">http://dublincore.org/groups/agents/agentFRdraft2-2.html](http://dublincore.org/groups/agents/agentFRdraft2-2.html)) has been prepared by Dan Brickley and Tom Baker. Comments are welcome. There is a comment space provided at the end of the review. Please use feel free to use it.**

This document addresses an action on [DanBrickley](http://dublincore.org/agentswiki/DanBrickley) and [TomBaker](http://dublincore.org/agentswiki/TomBaker) to "investigate and assess feasibility of using FOAF for DC agent descriptions". See [FoafReviewBackground](http://dublincore.org/agentswiki/FoafReviewBackground) for background and overview. This document focusses on the detail of expressing DC Agent requirements using FOAF's Person and Group classes.

### FOAF and the draft DC Agents requirements

The following is a walk-through of the proposed properties from the DC Agents draft, discussing each in terms of FOAF or other RDF vocabularies often used with FOAF. The following is a walk-through of the proposed properties from the DC Agents draft, discussing each in terms of FOAF or other RDF vocabularies often used with FOAF.

<pre>This document defines the attributes of a person as the following:
identifier
name
dates
title
affiliation
location
email
other information
</pre><pre>4.1.1. Identifier
A scheme, numeric or alphabetic, or a combination of the two, used to identify unambiguously a specific individual
agent. No such schemes yet exist. This element will allow for the use of such schemes when and if they are
developed.
----- /!\ Edit conflict! Other version: -----
</pre>
- FOAF allows URI identifiers to be used directly for people, groups etc.

- in theory dc:identifier might also be applicable

- FOAF uses RDFS/OWL schemas to indicate which other properties are uniquely identifying

<pre>4.1.2 Name
The name or names by which the person is known, including alternative names.
</pre>
- FOAF provides the foaf:name property for plain text and xhtml (ruby markup etc) names

- other properties in FOAF include givenName, family\_name, and these names are irregularly ... named, and in need of cleanup.

<pre>----- /!\ Edit conflict! Your version: -----
</pre>
- FOAF allows URI identifiers to be used directly for people, groups etc.

- in theory dc:identifier might also be applicable

- FOAF uses RDFS/OWL schemas to indicate which other properties are uniquely identifying

<pre>4.1.2 Name
The name or names by which the person is known, including alternative names.
</pre>
- FOAF provides the foaf:name property for plain text and xhtml (ruby markup etc) names

- other properties in FOAF include givenName, family\_name, and these names are irregularly ... named, and in need of cleanup.

<pre>----- /!\ End of edit conflict -----
4.1.3 Dates
May include date of the person's birth and/or death, or floruit dates (ie. an indication of the period in which the
person was known to be active in a given field of endeavour).
----- /!\ Edit conflict! Other version: -----
</pre>
- FOAF doesn't currently include much by way of dates

- See [[<img src="FoafReview_files/moin-www.png" alt="[WWW]" height="11" width="11">http://wiki.foaf-project.org/BirthdayIssue](http://wiki.foaf-project.org/BirthdayIssue)[birthday issue]] in FOAF wiki

- FOAF doesn't yet define anything beyond [[<img src="FoafReview_files/moin-www.png" alt="[WWW]" height="11" width="11">http://xmlns.com/foaf/spec/#term\_birthday](http://xmlns.com/foaf/spec/#term_birthday)[birthday]] (month day)

- foaf:birthdate would be a natural addition

<pre>----- /!\ Edit conflict! Your version: -----
</pre>
- FOAF doesn't currently include much by way of dates

- See [[<img src="FoafReview_files/moin-www.png" alt="[WWW]" height="11" width="11">http://wiki.foaf-project.org/BirthdayIssue](http://wiki.foaf-project.org/BirthdayIssue)[birthday issue]] in FOAF wiki

- FOAF doesn't yet define anything beyond [[<img src="FoafReview_files/moin-www.png" alt="[WWW]" height="11" width="11">http://xmlns.com/foaf/spec/#term\_birthday](http://xmlns.com/foaf/spec/#term_birthday)[birthday]] (month day)

- foaf:birthdate would be a natural addition

<pre>----- /!\ End of edit conflict -----
4.1.4 Title
A word or phrase used to identify the rank, office, nobility, honour, etc. of the person.

4.1.5 Affiliation
The name of the organization, institution, company, or other body with which the person was or is associated, or by
whom the person was employed or contracted.

4.1.6 Location
Information about the person’s principal area of residence over time. Context may be indicated by the use of
appropriate qualifiers (for example: Lived in Canberra 1991-2005).

4.1.7 Email
Email address or addresses currently assigned to the person at the time of the description.

4.1.8 Other Information
Any additional significant information about the person that is needed to unambiguously identify that person.
</pre>

##### 4.2 Attributes of a Group
<pre>This document defines the attributes of a group as the following:

legal number
name
jurisdiction
location
dates
web site
other information
</pre><pre>4.2.1 Legal number
Any official number assigned by a public authority that is used to identify the group.

4.2.2. Name
Names by which the group is or was known. May include other forms of the name and changes of name over time.

4.2.3 Jurisdiction
The legal name of the judicial and administrative entity which has jurisdiction over the territory in which the
group operates.

4.2.4 Location
The place from which the group operated.

4.2.5 Dates
Dates indicating the period the group operated. May include such things as date of founding and dissolution, date
of legal mandate establishing the group, etc.

4.2.6 Web Site
The http address of the world wide web site operated by the group.

4.2.7 Other Information
Any additional significant information about the group that is needed to unambiguously identify that group.
</pre>

* * *
**COMMENTS** <pre>[If you have any comments, views, opinions about the review please add them here] 

</pre>

 [RefreshCache](http://dublincore.org/agentswiki/FoafReview?action=refresh&arena=Page.py&key=FoafReview.text_html) for this page (cached 2013-01-12 01:37:18)  

Immutable page (last edited 2009-01-22 13:52:43 by DanBri2)


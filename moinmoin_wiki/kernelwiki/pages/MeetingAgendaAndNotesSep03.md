---
title: "- MeetingAgendaAndNotesSep03"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/pages/MeetingAgendaAndNotesSep03.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [MeetingAgendaAndNotesSep03](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=fullsearch&value=MeetingAgendaAndNotesSep03&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/kernelwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/kernelwiki/FrontPage)
- [RecentChanges](http://dublincore.org/kernelwiki/RecentChanges)
- [FindPage](http://dublincore.org/kernelwiki/FindPage)
- [HelpContents](http://dublincore.org/kernelwiki/HelpContents)

Page

- [Edit](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=edit "Edit")
- [View](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03 "View")
- [Diffs](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=diff "Diffs")
- [Info](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=info "Info")
- [Subscribe](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=raw "Raw")
- [Print](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=AttachFile)
- [DSP2XML](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=DSP2XML)
- [DeletePage](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=DeletePage)
- [LikePages](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=LikePages)
- [LocalSiteMap](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=SpellCheck)

Search

<form method="POST" action="/kernelwiki/MeetingAgendaAndNotesSep03">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="MeetingAgendaAndNotesSep03_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="MeetingAgendaAndNotesSep03_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### KAP Task Group conference call 3 September 2009

- ERC module (Perl) now available at [http://search.cpan.org/~jak/File-ERC-0.01/](http://search.cpan.org/%7Ejak/File-ERC-0.01/)

- ERC low level method takes

<tt>erc: name1;name2;name3|title;subtitle|date|where|vellum|because|a|b|c</tt> and produces 
<pre>@prefix erc: &lt;http://purl.org/kernel/elements/1.1/&gt; 
     @prefix this: &lt;where&gt;
     this: erc:who """name1; name2; name3""";
           erc:what """title; subtitle""";
           erc:when """date""";
           erc:where """where""";
           erc:how """vellum""";
           erc:why """because""";</pre>- Adrian: good idea to have a command-line tool (with documentation) linked from the DCMI kernel page

- Charles: there are some minor problems with ERC.pm output; ok to combine his rapper script with ERC.pm

- Charles: what about using the W3C RDF vallidator? he's using RDF triple store and SPARQL

- Bill: add to Adrian's scenario a demo showing ERC conversion in action -- could be a canned demo in a flash file linked from DCMI kernel page

- John: I've been wanting to tweak the comma convention for indicating inversion points in element values; instead of having the comma at the beginning, the principle of "least surprise" suggests that placing it at the end of the element would be equally machine readable but less disruptive from point of view of human scanning; will write this up for the group to review

- scheduled next call

#### Attending:

 Charles Blair, Jane Huang, Bill Moen, Adrian Turner, John Kunze 

 [RefreshCache](http://dublincore.org/kernelwiki/MeetingAgendaAndNotesSep03?action=refresh&arena=Page.py&key=MeetingAgendaAndNotesSep03.text_html) for this page (cached 2012-12-23 01:10:09)  

Immutable page (last edited 2009-10-04 16:03:51 by JohnKunze)


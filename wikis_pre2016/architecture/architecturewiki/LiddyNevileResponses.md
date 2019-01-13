---
title: "- LiddyNevileResponses"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/LiddyNevileResponses.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [LiddyNevileResponses](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=fullsearch&value=LiddyNevileResponses&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Edit](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/LiddyNevileResponses "View")
- [Diffs](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/LiddyNevileResponses">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="LiddyNevileResponses_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="LiddyNevileResponses_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### The following are my comments added to the examples provided by Andy Powell on the AdaptabilityApplicationProfile

There are some general 'responsive' comments made immediately and then some [MoreCarefullyThought](http://dublincore.org/architecturewiki/MoreCarefullyThought) out comments also available and then a discussion of what I think is a [RealProblem](http://dublincore.org/architecturewiki/RealProblem).

#### First responsive comments

- There are no alternative formats available in this example, so dcterms:hasFormat and dcterms:isFormatOf are not used.

When there is a text alternative for a Web page, for instance, this would be used.

- The proposed vocabularies for 'role', 'format', 'type', 'flexibility', 'access mode' and 'support tool' are shown here using both a 'value string' and a 'value URI'. They could be provided using only 'value strings' but it is good practice to assign URIs to all vocabulary terms (as per the CORES resolution). Therefore, recommended best practice is to define and use 'value URIs' for all vocabulary terms. There is not widespread agreement (yet) about whether it is good practice to provide both a 'value string' and a 'value URI' or whether providing only a 'value URI' is sufficient.

This is not an issue just for DC Accessibility

- It is not clear where the semantics of the a4a properties and the various vocabulary terms are defined, so some of the examples shown here may be wrong? The semantics of a4a:supportTool appear to be particularly unclear.

These terms are in the process of being defined for the ISO standard. If these definitions are suitable, they will probably be recommended for use in the accessibility case as best practice.

- The proposed a4a:Format and a4a:Type vocabulary terms do not appear to conform to the semantics of dc:format and dc:type.

In the case of format and type, it would probably be that vocabularies would be useful for these terms and so they will probably need to be declared and identified as a4a:format and a4a:type but match DC semantics.

- a4a:readingRate (as used here) is not a refinement of either dcterms:educationLevel or dcterms:audience.

No, this is a term that is required in the case when a resource has a timed component - for instance, when a user of an ATM takes longer than usual to read the instructions because they have to work through a braille version, they need to know if they will just be timed out or if they can manage in the time available or if the time is adjustable. This is not info that is found in other, currently existing, dc terms so it will be a special a4a term...if an application profile is developed ion the future.

- The usage of a4a:role shown here does not fit well with the DAM, since it indicates a relationship between the described resource and another resource but doesn't offer a mechanism for identifying the other resource (the text file is only a 'visual replacement' w.r.t. the multimedia Web page - being a 'visual replacement' is not an inherent property of the text).

There are times when this is not true. For instance, captions are very specific and not useful to anyone except people looking for something playing the role of replacing audio. I think this is sufficient reason for having this term. We tried to avoid it but sometimes it is necessary to bring together several values to make the sort of decision that is necessary for adaptability for people with disabilities, so I have not thrown away values that are used, and had to find good places for them.

Please remember that this application profile is only a tester of the term adaptability - it is not being proposed for adoption by anyone yet. So all suggestions are welcome and will be considered. The point at issue is whether the term adaptability will work well for the community who must get help asap - those with disabilities - and the rest of us who on a daily basis suffer constructed disabilities because we are mobile etc.

- It would therefore be better to model this property as a set of new refinements of dc:relation - e.g. a4a:isTextualAdaptationOf. This argument can also be made about some of the proposed terms within the a4a:Format and a4a:Type vocabularies - e.g. 'Caption' (a piece of text is only a caption w.r.t. something else) and 'Enhanced Text' (ditto).

So these suggestions are very welcome - re-use of current terms is a goal and the best re-use is certainly a goal.

Again, Andy, thank you for the excellent contributions.

Liddy

 [RefreshCache](http://dublincore.org/architecturewiki/LiddyNevileResponses?action=refresh&arena=Page.py&key=LiddyNevileResponses.text_html) for this page (cached 2012-12-10 08:39:46)  

Immutable page (last edited 2006-02-22 03:08:38 by dhcp5-171)


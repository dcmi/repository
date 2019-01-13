---
title: "- DcarchTelecons/MeetingNotes-20071026"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DcarchTelecons_2fMeetingNotes_2d20071026.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DcarchTelecons/MeetingNotes-20071026](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=fullsearch&value=%2FMeetingNotes-20071026&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DcarchTelecons "Up")
- [Edit](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026 "View")
- [Diffs](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DcarchTelecons_2fMeetingNotes_2d20071026_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DcarchTelecons_2fMeetingNotes_2d20071026_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## 2007-10-26 DC-ARCH telecon

Participants: Pete, Mikael, Tom (scribe), Hans

1. Finalize DC-HTML for Public Comment on 5 November

Aim to put out for Website build. About ready - will post on stage area soon. Maybe Ivan feedback before public comment. Try to get out for Public Comment on 5 November.

DCAM interpretations of the existing specifications. Prepare and publish note on backwards compatibility and publish at same time? Pete to prepare something on wiki by 5 November. Mikael: let's make that a more stable type of note by time DC-HTML is finalized - Pete agrees.

Two issues:

- interpretn of old in terms of DCAM (how to interpret data)

- differences btw old and new

Both of these would need to be part of document. We need to do this quickly.

Good idea to note in examples, if new URIs are used, that this refers to the upcoming decision just in case people are confused about the new URIs. Pete can put this into email. Mikael suggests also putting it into body of text -- a temporary place-holder, would later be removed.

Mikael: Backwards compatibility note is important here. Otherwise, DC-HTML should be more straightforward than DC-XML.

2. DC-XML

Mikael: we do not have a draft ready to be taken forward to Public Comment - need to make changes to existing drafts.

Conclusions from Singapore: DC-XML would be better off focusing on very straightforward and very regular "full" format and dealing with compactness at later stage. Priority: machine-friendly, easy to parse.

Pete: in Singapore, we agreed to avoid situation of too many options on table. Even within a single format we should be wary of having multiple ways to represent the same thing. We should not worry too much about the human readability of the raw syntax but assume tools will deal with human-friendly issues. This is closer to what we now call DC-XML-FULL - maybe revise this to take away some of the optionality (ways to abbreviate URIs, etc). Agree we do not have something ready to go to Public Comment.

Mikael: If DC-HTML takes November to finish, assume DC-XML version ready for Public Comment by end of year? This would probably be preceded by an updated draft circulated to the list before that. We would also need a backwards-compatibility note for this too.

There is an issue with interpretation of existing DC-XML format. Might be a good idea to have an interpretation of the old (2003) specification that follows the argument of the DC-HTML compatibility note (though not necessarily the same document). Need to have answers ready for people who will be asking questions about backwards compatibility.

Pete: DC-XML issues are different than with DC-HTML. In the XML case, format will look quite different than existing. In HTML case, similar. However, commonalities. I had thought of them as two separate documents (though they might have similar forms).

3. DC-TEXT

Mikael: Pete is using this in the DC-XML spec. Also used in DC-RDF which is Proposed Recommendation. Would be good to publish as a Note - Recommended Resource - relatively soon. Would be good to publish before DC-HTML spec gets Recommendation status. This spec is relatively stable - should just be a case of producing HTML version and putting on dublincore.org. Would be great to do this during November.

Pete: Agree with your analysis of dependencies. In terms of content, only question I have is whether to leave content pretty much as stands, where description of format is fairly informal - complete but informal - or add something like BNF description of the format.

Mikael: As long as it doesn't lead to ambiguities, can leave informal for now. Would not be hard to add the formal stuff later.

Pete: will work on getting cleaned-up up version out soon.

Tom: full set of DCTERMS documentation (decision documents, RDF schemas, HTML "DCMI Metadata Terms") may not be ready in time for 5 November, given need to check.

4. Finalize DC-RDF

DC-RDF is on hold waiting for updated DCTERMS vocabularies.

Mikael: Finalize new version during November (during Public Comment of DC-HTML) and if all goes to plan, publish DC-RDF as Rec beginning of December, maybe together with HTML document.

Pete: Question about Turtle versus RDF/XML...?

Mikael: Have thought alot about this. Decided on RDF/XML not because it is easily human-readable but because it is supported by tools - more than Turtle. One argument: wanted to use RDF validator service - take the XML examples and just plug them into the validator and get triples. Validator generates N-triples. Open to modify that but have had comments both ways - some people want both Turtle and RDF/XML. Do not have a strong opinion - will make a poll on list relatively soon opening this for comments. Apart from this DC-RDF is relatively straightforward.

5. Publishing the DSP model

Mikael: Needs to be modified a bit (work on examples). Propose to publish working draft document.

Tom: We have traditionally used wiki only for drafts and used the main SVN server for stable documents, but it has been suggested that URIs to specific versions on the wiki would be good enough to use for this purpose.

Mikael: Not reasonable to expect wiki software to survive more than five years - with risk of making URIs unresolvable. [MoinMoin](http://dublincore.org/architecturewiki/MoinMoin) is not the best option from a Content Management point of view compared to others. But Content Mgt is one thing and stable URI management is another. One way of solving would be to freeze certain versions - define the URIs on the main server, but turn into redirect to wiki document. If wiki software were to change, redirects could be changed. One would need to live with differences in style. Partly a question of image: can DCMI live with links to cached images, etc?

Tom: how about we just capture the HTML file?

Mikael: requires manual labor, so not a clean solution.

Pete: in theory, should be simple but cleaning up those documents is not as simple as it should be. Table structure in wiki pages is always a problem.

Mikael: With things of Working Draft status, it is an issue of being forced to create HTML version. Inconvenient to continue editing in HTML. Some things like APs might be kept in wikis and maintained there.

[posts link to "print" version of a historical version]

What is at this URI is constant. This is a possible way of solving the redirect issue - could point to this with a redirect from the main site. This is doable, even if we decide later to put up an HTML version. This is a way of postponing the decision of making an HTML version to a later stage. I could live with this for DSP - put up a stable URI at the main server as a redirect something like the above. Five years from now, if [MoinMoin](http://dublincore.org/architecturewiki/MoinMoin) were dropped, would need to change those redirects to point to URIs of the same snapshots in the new system (or to URIs of stored HTML versions if for any reason the wiki documents could not be moved forward as wiki versions). The same issue is true of HTML versions as well - depend on server as currently configured. If one were to move to a content mgt system different from Unix file system (SVN). Currently, URIs assume a static filesystem.

As for DSP... Moving to HTML too early creates extra work.

ACTION Tom: To check with Makx whether DSP draft could remain on wiki and redirect from a stable URI on the main server.

Mikael: Software will be installed when Website moved to Singapore. Need to wait for DC-XML and DC-HTML to be stable before putting DSP out for public comment. After a recommendation for DC-XML beginning of 2008 would be a good time to work on PR for DSP model.

Number of issues to resolve: documentation of terms in the format itself? Need to have a plan for dealing with those issues. Not ready to go to PC at this point.

6. GRDDL

Pete: In Singapore, we agreed to put GRDDL transforms into place for new DC-HTML - would need to take action. DanC stylesheet: need to check the RDF output of that.

Mikael: Two issues: GRDDL transform for new one (as part of the specification) and transform for the old one (as part of the compatibility note).

Pete: profile transformation for the old one is a core part of the backwards compatibility - basis for DCAM interpretation of old.

Mikael: would be useful to have a set of examples.

Pete: for new specification, would be useful to have these available so GRDDL-aware processor could be pointed to them.

7. Topic maps

Mikael: waiting for more input from Sam and his group. My view: welcome to produce something in collaboration with DCARCH, but they would need to drive discussion. Most of the discussion seems to be happening within ISO. Would be good if product is compatible with DCAM - would be good to have review from DCARCH Forum.

8. RDFa

Pete: we should have a look at RDFa syntax and possibly comment on issues such as unexpected triples being generated.

Mikael: DCMI position is pretty clear - no pressing need to produce further input to the process.

9. Next meeting

Plan to hold meetings every third week. Next meeting Wednesday 14 November.

 [RefreshCache](http://dublincore.org/architecturewiki/DcarchTelecons_2fMeetingNotes_2d20071026?action=refresh&arena=Page.py&key=DcarchTelecons_2fMeetingNotes_2d20071026.text_html) for this page (cached 2012-12-07 16:31:47)  

Immutable page (last edited 2007-10-26 13:50:23 by TomBaker)


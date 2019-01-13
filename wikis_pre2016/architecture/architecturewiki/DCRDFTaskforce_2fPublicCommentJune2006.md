---
title: "- DCRDFTaskforce/PublicCommentJune2006"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/architecturewiki/pages/DCRDFTaskforce_2fPublicCommentJune2006.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [DCRDFTaskforce/PublicCommentJune2006](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=fullsearch&value=%2FPublicCommentJune2006&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/architecturewiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/architecturewiki/FrontPage)
- [RecentChanges](http://dublincore.org/architecturewiki/RecentChanges)
- [FindPage](http://dublincore.org/architecturewiki/FindPage)
- [HelpContents](http://dublincore.org/architecturewiki/HelpContents)

Page

- [Up](http://dublincore.org/architecturewiki/DCRDFTaskforce "Up")
- [Edit](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=edit "Edit")
- [View](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006 "View")
- [Diffs](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=diff "Diffs")
- [Info](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=info "Info")
- [Subscribe](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=raw "Raw")
- [Print](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=AttachFile)
- [DSP2XML](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=DSP2XML)
- [DeletePage](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=DeletePage)
- [LikePages](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=LikePages)
- [LocalSiteMap](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=SpellCheck)

Search

<form method="POST" action="/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fPublicCommentJune2006_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="DCRDFTaskforce_2fPublicCommentJune2006_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Report from public comment period on Dublin Core RDF expression

Period: 30 May - 30 June 2006

The following is a report of the feedback received during the public comment period on the new Working Draft "Expressing Dublin Core using the Resource Description Framework". A summary of the discussions and proposals for moving forward are presented in the sections below.

### The consequences of adding domains and ranges to DCMI properties

Some concern has been raised concerning the proposal to add ranges and domains to the definitions of the DCMI properties. While strictly not part of this public comment period, the possibility of adding domains and ranges has been explicitly recognized in the new Working Draft. If domains and ranges are added, it is also clear that the RDF expression of certain metadata constructs (such as for dc:creator) will be different as compared to earlier RDF expressions from the DCMI. In particular, several uses of literal strings as direct values of properties will be made invalid. Based on Swoogle statistics on the usage of DCMI properties, it is clear that a vast majority of uses of the 15 core elements in RDF are literal uses, and hence problematic.

Concern has also been raised that the notions of domains and ranges are not part of the DCAM.

#### Proposals

- We need to be very clear that the new expression represents a closer conformance to the DCAM, and not the other way around.

- It is also important that we are clear regarding the fact that value strings may still be used to represent the value of a DCMI property, regardless of range.

- Domains and ranges should be acknowledged in a future version of the DCAM.

- The discussion on domains and ranges in the draft needs some improvement, especially concerning the consequences of not specifying a value type.

- A proposal has been put forward to only apply the new domains and ranges to properties in the "terms" namespace (including terms copied from the "1.1" namespace), to lessen the effect on legacy metadata.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5526](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5526)

- [http://dublincore.org/documents/dc-rdf-notes/#sect-3](http://dublincore.org/documents/dc-rdf-notes/#sect-3)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163)

### The relationship between encoding schemes and the corresponding RDF concepts.

This comment period about expressing DCAM-based metadata in RDF has revived an older discussion about the status of "vocabulary encoding schemes" (VES) in the DCAM itself. Both the Proposed Recommendation from 2002 on expressing qualified Dublin Core in RDF and the DCAM itself model a VES as "the type of a value". This approach has been followed in the current DC-RDF draft, which uses the "rdf:type" property to express VESs.

Traditionally, the function of VES has been to "indicate that the value is a term from a controlled vocabulary" (see the [<img src="DCRDFTaskforce_2fPublicCommentJune2006_files/moin-www.png" alt="[WWW]" height="11" width="11">principles](http://dublincore.org/usage/documents/2003/11/18/principles/) document), and the comment period has made clear that this traditional definition does not fully overlap with the RDF notion of Class, which encompasses non-vocabulary-like entities such as Person and Date.

A proposal has been put forward to modify the DCAM in order to separate the notions of "vocabulary encoding scheme" and "value type", which in the current version of the DCAM are seen as equivalent.

#### Proposals

- Change the DCAM to separate the notions of "value type" from "vocabulary encoding scheme".

- Modify the Draft DC-RDF expression to separate "value type" from VES, using a new RDF property, e.g. "dcrdf:inScheme".

- Withhold the draft until clarification of the DCMI "encoding schemes" has been introduced, especially regarding if they are of type VES or SES.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1211](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1211)

- [http://dublincore.org/architecturewiki/AMIssues#head-3b6b8af3b9273893a16037aed1b3b1ca1334e7bc](http://dublincore.org/architecturewiki/AMIssues#head-3b6b8af3b9273893a16037aed1b3b1ca1334e7bc)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0510&L=dc-rdf-taskforce&T=0&P=61](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0510&L=dc-rdf-taskforce&T=0&P=61)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163)

### The use of rdf:value

It has been suggested that the proposed new RDF property "dcrdf:valueString" would be dropped. Instead the rdf:value property could be used. This would allow for partial compatibility with the existing Qualified Dublin Core RDF expression. Note that the proposed "dcrdf:valueString" RDF property was intended to be a sub-property of rdf:value, so much of the same semantics would be retained.

It has also been suggested that dcrdf:valueString overlaps too much with using a dc:title in a related description of the value. There is some merit to the argument, even though the value of dc:title is not necessarily a "value representation". Certainly it is the case that an application looking for text for indexing of the value would look at both rdf:value, dc:title and possibly other properties.

#### Proposals

- Revert back to using rdf:value for value strings.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071)

- [http://dublincore.org/architecturewiki/DCRDFTaskforce/DCRDFIssues#head-ca100afa3355ef06c589a811ef2804c703286446](http://dublincore.org/architecturewiki/DCRDFTaskforce/DCRDFIssues#head-ca100afa3355ef06c589a811ef2804c703286446)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0)

### The use of datatyped literals as objects of RDF statements

The use of literal strings as direct values of RDF properties is still not fully understood. Note that using value strings in general is relatively unproblematic, even when used in combination with Syntax encoding schemes (SES). This issue has to do with the case when the range of a property allows for literal values (such as possibly dc:title and maybe dc:date), especially when that value is combined with a syntax encoding scheme. It is currently somewhat unclear what the precise interactions between ranges, value types, VES, SES and literal values are.

As this issue is heavily influenced by the decision on the value type and VES issue mentioned above, a final solution needs to wait for that issue to be finalized.

#### Proposals

- Retains current text, but make sure the consequences with respect to value type, VES and SES are understood.

- Revisit this issue once the other issues have been sorted out.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071)

### The use of dc:type vs. rdf:type

It was discussed whether using dc:type in RDF metadata was recommended, as the semantics overlap nearly or completely with rdf:type, especially after the introduction of a range of "Class" for dc:type. Using rdf:type would certainly increase interoperability with other RDF metadata.

#### Proposals

- Recommmend the use of rdf:type in RDF metadata, together with an explanation that it is equivalent to dc:type for a DC application.

- Revisit this issue after the introduction of domains and ranges of DCMI properties, to make sure the semantics really match.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1805&D=0&I=-3&T=0](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1805&D=0&I=-3&T=0)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=1071)

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0606&L=dc-architecture&T=0&P=5163)

### The use of rich representations

Several issues have been brought up regarding rich representations:

- Can we embed anything other than XML in an RDF document? No, currently all other rich representations need to stored externally.

- Can we put a language tag or SES on rich representations? Not currently, and not according to the DCAM.

These issues are really DCAM issues. The DCAM s unclear on the exact nature of rich representations, and the current wording in the DC-RDF draft is a best-effort formulation.

#### Proposal

- Retain current text in DC-RDF.

- Revisit after any changes in DCAM are introduced.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0)

- [http://dublincore.org/architecturewiki/AMIssues#head-9c296de12340944dba792c52c99eb19718ee1acf](http://dublincore.org/architecturewiki/AMIssues#head-9c296de12340944dba792c52c99eb19718ee1acf)

### Using syntax encoding schemes and language tags simultaneously

Currently, the DCAM allows value strings to carry both a language tag and a syntax encoding scheme, while the draft DC-RDF expression does not allow this.

#### Proposals

- Change the DCAM to only allow one of language tag and SES for each value string.

- Retain current text in DC-RDF.

#### References

- [http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0](http://www.jiscmail.ac.uk/cgi-bin/webadmin?A2=ind0605&L=DC-ARCHITECTURE&P=R1125&D=0&I=-3&T=0)

- [http://dublincore.org/architecturewiki/AMIssues#head-e6d59f3bf467816e6a96812c2662523f2d4066aa](http://dublincore.org/architecturewiki/AMIssues#head-e6d59f3bf467816e6a96812c2662523f2d4066aa)

### Conclusion

The draft did not meet with substantial opposition. There are a few minor issues within the draft that we should address, and then a few larger issues that have to do with the interaction between DC-RDF, the DCAM and the definitions of the DCMI terms.

 [RefreshCache](http://dublincore.org/architecturewiki/DCRDFTaskforce_2fPublicCommentJune2006?action=refresh&arena=Page.py&key=DCRDFTaskforce_2fPublicCommentJune2006.text_html) for this page (cached 2012-12-31 08:38:26)  

Immutable page (last edited 2006-07-06 09:45:37 by MikaelNilsson)


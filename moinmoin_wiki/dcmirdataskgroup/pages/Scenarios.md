---
title: "- Scenarios"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/dcmirdataskgroup/pages/Scenarios.html"
---

# > [Scenarios](http://dublincore.org/dcmirdataskgroup/Scenarios?action=fullsearch&value=Scenarios&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/dcmirdataskgroup/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/dcmirdataskgroup/FrontPage)
- [RecentChanges](http://dublincore.org/dcmirdataskgroup/RecentChanges)
- [FindPage](http://dublincore.org/dcmirdataskgroup/FindPage)
- [HelpContents](http://dublincore.org/dcmirdataskgroup/HelpContents)

Page

- [Edit](http://dublincore.org/dcmirdataskgroup/Scenarios?action=edit "Edit")
- [View](http://dublincore.org/dcmirdataskgroup/Scenarios "View")
- [Diffs](http://dublincore.org/dcmirdataskgroup/Scenarios?action=diff "Diffs")
- [Info](http://dublincore.org/dcmirdataskgroup/Scenarios?action=info "Info")
- [Subscribe](http://dublincore.org/dcmirdataskgroup/Scenarios?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/dcmirdataskgroup/Scenarios?action=raw "Raw")
- [Print](http://dublincore.org/dcmirdataskgroup/Scenarios?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/dcmirdataskgroup/Scenarios?action=AttachFile)
- [DSP2XML](http://dublincore.org/dcmirdataskgroup/Scenarios?action=DSP2XML)
- [DeletePage](http://dublincore.org/dcmirdataskgroup/Scenarios?action=DeletePage)
- [LikePages](http://dublincore.org/dcmirdataskgroup/Scenarios?action=LikePages)
- [LocalSiteMap](http://dublincore.org/dcmirdataskgroup/Scenarios?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/dcmirdataskgroup/Scenarios?action=SpellCheck)

Search

<form method="POST" action="/dcmirdataskgroup/Scenarios">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="Scenarios_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="Scenarios_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

#### Cataloger Scenarios

**Note:** These scenarios are intended to assist catalogers in visualizing how their work might flow in a setting that used RDA Vocabularies and FRBR relationships. The goal here is just to show how these packages of information might fit together and how catalogers can use their knowledge and experience in different contexts.

**Caveats:** 1. The labels used are those verified using the latest RDAToolkit ERDs. 2. Identifiers are assumed to be mandatory but many will presumably be system supplied; only some "standard" ones are used in these examples. 3. Assumptions are made about how systems using RDA will assist in the process. Your mileage may vary.

##### Scenario 1: A new expression for an existing simple work

**Link to Scenario 1 RDF Expression and Analysis: [Scenarios/1](http://dublincore.org/dcmirdataskgroup/Scenarios_2f1)**

_Jane Cataloger is assigned to work on a gift collection. Her first selection is a Latvian translation of Kurt Vonnegut's "Bluebeard: a novel." She searches the library database for the original work, and finds:_

- Author: Kurt Vonnegut

- Preferred Title for the Work: Bluebeard: a novel.

- Form of Work: Novel

_with links to the following expression information:_

- Language of Expression: English

- Content Type: Text

_and one manifestation:_

- Edition Statement: 1st trade edition.

- Place of Production: New York

- Publisher's Name: Delacorte Press

- Date of Production: 1987

- Extent: 300 pages

- Resource Identifier: [<img src="Scenarios_files/moin-inter.png" alt="[ISBN]" height="16" width="16">0385295901](http://www.amazon.com/exec/obidos/ISBN=0385295901 "ISBN")

_Jane begins her description by linking to the existing Work entity. She then creates an expression description:_

- Language of Expression: Latvian

- Translator: Arvida Grigulis

_She creates an authority record for the translator since none yet existed. She continues by creating a fuller description for the new manifestation, linking to the authority record for the Latvian publisher (what luck, it already existed!)._

- Title Proper: [in Latvian]

- Place of Production: Riga

- Publisher: Liesma

- Date of Production: 1997

[Updated 3/14/11 dih]

##### Scenario 2: A collected work

**Link to Scenario 2 RDF Expression and Analysis: [Scenarios/2](http://dublincore.org/dcmirdataskgroup/Scenarios_2f2)**

_Jane Cataloger selects a second item to catalog from her gift collection. This item is a festschrift in honor of an environmental activist who died young, containing contributions by a number of important writers in the field. Jane begins by searching the library database and publisher databases for the collection itself. She finds an existing record for the collection as a work, from an ONIX record contributed by the publisher. She uses that record as a basis for the work description, adding a subject heading for the collection and a link to an existing authority record for the honoree and another to the editor of the collection._

- Editor: Ambrose Watts

- Preferred Title for the Work: Our collective environment: essays in honor of Pauline Warner

- Subject: Natural resources--Management

- Honoree: Pauline Warner

- Original Language of the Work: English

_Since her institution has a strong environmental program, she also creates work records for each of the contributions, and links them to the collection using relationship links and identifiers to and from the individual contributions. This allows the collected work to reflect the parts, and the contribution records to relate to the collection. Example:_

- Author: Marcelline Probst

- Preferred Title for the Work: Some compelling biodiversity issues in natural resources management

- Subject: Natural resources--Management

- Form of Work: Essay

- Original Language of the Work: English

_She creates an expression record for each work (including the collected work), with language and content type elements. Example:_

- Language of Expression: English

- Content Type: Text

_She uses information in the ONIX record to create a manifestation record for the collection (which will also be linked to and from the expression records for the parts)._

- Place of Production: Boston

- Publisher: Beacon Press

- Date of Production: 2006.

- Extent: 240 pages

- ISBN: 0723888560

_She creates authority records as required._

##### Scenario 3: A multimedia creation based on a previously published item

**Link to Scenario 3 RDF Expression and Analysis: [Scenarios/3](http://dublincore.org/dcmirdataskgroup/Scenarios_2f3)**

_The next item in Jane Cataloger's queue is a DVD of a movie written, filmed and scored by students in the local university, the screenplay based on a short story written by a faculty member. Jane finds that the story was published in a collection of stories by this particular faculty member, so she creates a work record and an expression record for the story and relates it to the collection (which is already represented by a work record)._

- Author: Janet [McEllison](http://dublincore.org/dcmirdataskgroup/McEllison)

- Preferred Title of Work: Folly remembered

- Form of Work: Short story

- Language of Expression: English

- Content Type: Text

_For the story, she provides a link to the manifestation record for the collected stories, since the story is not published in any other manifestation._

_She then creates additional work, expression and manifestation records for the screenplay (which is available online):_

- Adapter: Margaret Adamson

- Preferred Title of Work: Lily's folly

- Form of Work: Screenplay

- Original Language of the Work: English

- Language of Expression: English

- Content Type: text

- Place of Production: Fresno, NH

- Publisher: Wilson College Repository

- Date of availability: 2005.

- Media Type: text/html

- Extent: 120 pages

- Resource Identifier: [http://hdl.handle.net/3465/7576](http://hdl.handle.net/3465/7576)

_From there she creates work record and expression records for the movie, and relates it at the work level to the related works._

- Director: George Freehling

- Producer: Amanda Martinez

- Actor: Timothy Marchant

- Actor: Da'Shawn Gibbons

- Actor: Marianne Sims

- Preferred Title of Work: Folly remembered

- Form of Work: Motion picture

- Original Language of Work: English

- Language of Expression: English

- Content Type: Video

_Jane invokes searches for the named contributors to the three works, and assigns:_

_1. the existing authority record for author of the short story to the work record for the story itself; 2. a newly created authority record for the student writer of the screenplay to the work record for the screenplay; 3. several newly created authority records for the various contributors to the movie itself._

_This accomplished, she moves on to manifestation for the movie:_

- Place of Production: Fresno, NH

- Publisher: Wilson College Video Production Department

- Date of availability: 2005.

- Media Type: DVD

- Extent: 1 disk

**[Consulted]** Yee, Martha M. Understanding FRBR. Chapter 11, FRBR and Moving Image Materials: Content (Work and Expression) versus Carrier (Manifestation). Available at: [http://repositories.cdlib.org/postprints/2648/](http://repositories.cdlib.org/postprints/2648/)

##### Scenario 4: Complex DVD Versions, or, Reality Bites
**Link to Scenario 4 RDF Expression and Analysis: [Scenarios/4](http://dublincore.org/dcmirdataskgroup/Scenarios_2f4)** 

_[Contributed by Greta de Groat]_

_Jane Cataloger is working on cataloging the individual DVDs from the Ford at Fox Collection. The selector has repackaged the individual DVDs in containers and asked Cataloging to catalog them separately. However, this package contains two DVDs for the film The Iron Horse. She searches the library database and finds:_

_A work record for the Ford at Fox collection_

_A work record for the film The Iron Horse:_

- Director: John Ford

- Preferred title of work: The Iron Horse

- Form of work: Motion Picture

- Original language of work: English

- Original year of release: 1924

- Actor: George O'Brien

- Actor: Madge Bellamy

- Actor: Charles Edward Bull

- Production company: Fox

- Genre of work: Feature film

- Genre of work: Silent film

- Genre of work : Fiction film

- Genre of work: Western film

- Subject of work: Railroads--West (U.S.--History--19th century--Drama

_There are assorted other people related to the work, but Jane's not working for a film archive, so she doesn't add any more of them to the work record._

_Now, the two DVDs are two different versions of the film. Presumably she could choose to catalog the DVDs separately or together, but since her selector gave them to her together, she catalogs them together. One DVD is the International version, and the other is the US version. Both have scores by William Perry. So she creates two expression records:_

_Jane finds this expression record attached to a manifestation released by the British Film Institute:_

- Language of expression: English

- Composer of musical score of expression: William Perry

- Running time of expression: 133 minutes

_Jane wonders if this is the same as her International version. It has the same running time and also has a score by William Perry. So she takes a chance and adds to the record:_

- Name of expression: International Version

- Language of expression: English

- Composer of musical score of expression: William Perry

_[In addition, this has optional French or Spanish intertitles so presumably each of those would also be expressions, so Jane would need two more expression records?]_

_Jane does not find this expression record and needs to create it:_

- Name of expression: U.S. Version

- Language of Expression: English

- Composer of musical score of expression: William Perry

- Running time of expression: 150 min.

_One or both of these also has a commentary track by Robert Birchard (mea culpa, i didn't note which one when i cataloged it, nor did anyone in OCLC). So presumably the one with the commentary track is yet another expression. so so far Jane has had to use one existing expression record and had to create 6 more expression records for this._

_Jane is unsure which other expression is already in OCLC. The two VHS tapes from Nostalgia Family Video run 133 minutes so Jane thinks they might be the international Version, though this is not stated. However, they have an orchestral score by an unidentified composer or compiler, so are a different expression. So she doesn't link to this expression record._

_She also finds that the DVDs have a featurette; a restoration comparison; vintage program gallery; advertising gallery; still gallery. Jane is tired by this time and decides that these are untitled and worthy of only a note, instead of creating work records for each. Jane is also starting to worry that the implication of a "restoration comparison" means that there may be a difference in expression between the BFI version and this version, but she really has no way to research this. What does Jane do? Flip a coin? Try to call film experts? Ignore it and let it pass?_

_Ignoring that for the moment, Jane can finally gets down to the manifestation:_

- Place of Publication: Beverly Hills, Calif.

- Publisher: Twentieth Century Fox Home Entertainment

- Date: 2007

- Media type: DVD;

- Other technical characteristics: NTSC, all region, full frame, choice of Dolby 5.1 or stereo for the music track _(uh oh, Jane wonders if these constitute different expressions, but decides not to think about it and just lets this pass)_

- Extent: 2 videodiscs : sd., b&w, 4 3/4 in.

_She also has to link to the Ford at Fox set somehow for the series. Jane thinks this is manifestation information, and is unsure how the linkage will work between individually cataloged manifestations and the set, which presumably has work, expression, and manifestation records._

_Jane has now spent two days cataloging this resource. Her boss calls her into her office to explain why she should spend so much time and money playing with her records when they could just outsource it to India. Jane goes back to her desk and looks at the next time in her pile, which is a videodisc containing 30 short films by filmmaker Dennis Oppenheim. The one under that is a disc 60 short animated films by a variety of people she's never heard of. Next is the second volume with another 60 films. She contemplates the idea of work records for these, then goes home and slits her wrists._

##### Scenario 5: Musical score

**Link to Scenario 5 RDF Expression and Analysis: [Scenarios/5](http://dublincore.org/dcmirdataskgroup/Scenarios_2f5)**

_[Contributed by Kathy Glennan]_

_Jane Cataloger next picks up a musical score, an arrangement of Luigi Boccherini's Concerto in D major op. 34 for violoncello and orchestra, edited, with cadenzas and piano reduction by Luigi Silva._

_She searches the library database for the original work and finds:_

- Author: Luigi Boccherini

- Preferred title for the work: Concertos

- Medium of performance: violoncello

- Medium of performance: orchestra

- Numeric designation: G. 483

- Key: D major

- Variant title: Concertos, violoncello, orchestra, no. 10, D major

- Variant title: Concertos, violoncello, orchestra, op. 34, D major

_with links to the following expression information:_

- Medium of performance: violoncello

- Medium of performance: piano

- Content type: notated music

- Language of expression: none

- Additional attribute: arranged

_and the following manifestation:_

- Place of production: New York

- Publisher: Franco Colombo, Inc.

- Copyright date: 1964

- Extent of notated music: 1 score (38 pages) & 1 part (11 pages)

- Resource identifier: Plate number: N.Y. 1941

- Statement of responsibility: Luigi Boccherini

- Statement of responsibility: edited, with cadenzas and piano reduction by Luigi Silva

_(other manifestations in the library catalog include three separate ms. versions of the above; a full score edited by Aldo Pais; a violoncello and piano manifestation edited by Aldo Pais; a collection of 6 violoncello concertos by Boccherini, of which this composition is #6, edited by James Collorafi; a collection of 6 violoncello concertos by Boccherini, of which this composition is #6, edited by James Nicholas)_

_Theoretically, the work record for G. 483 could have a link to the following work; however, since Jane cannot identify the actual title assigned to the two cadenzas written by Silva, she does not create this work record:_

- Author: Luigi Silva

- Preferred title for the work: [unknown, but probably close to "Cadenzas for Boccherini's Concerto for violoncello, opus 34"]

- Medium of performance: violoncello

_The work record should also be linked to the following related work:_

- Author: Jerome Kessler

- Preferred title for the work: Cadenzas to Boccherini D maj. concerto, op. 34 (1st, 3d mov'ts)

- Medium of performance: violoncello

- Key: D major [assumed; not stated]

_This is linked to the following expression:_

- Content type: notated music

- Language of expression: none

_This is linked to the following manifestation:_

- Place of production: Los Angeles, Calif.

- Publisher: I Cellisti Publications

- Copyright date: 1980

- Extent: 1 score: (2 leaves)

- Other attribute: Reproduced from holograph

##### Scenario 6: Complex Relationships--Older Materials

**Link to Scenario 6 RDF Expression and Analysis: [Scenarios/6](http://dublincore.org/dcmirdataskgroup/Scenarios_2f6)**

[Notes: I’ve included in this scenario some of the relationships that will be available through FRBR. See [<img src="Scenarios_files/moin-www.png" alt="[WWW]" height="11" width="11">for a preliminary listing](http://sandbox.metadataregistry.org/concept/list/page/1/vocabulary_id/90.html). I’ve also included “Defendant” as a role--since as a former law librarian I think these are important, and hope some conversations about their relevance can be initiated. Also, although item information is potentially of interest for these materials in particular, I’ve not included that level in this scenario--Diane.]

_Joshua Cataloger was working on a collection of materials accumulated by a nineteenth century criminal lawyer who practiced near Saratoga, NY. This lawyer worked on several high visibility murder cases (the reality TV of the 19th century) and kept meticulous records of his trials, including extensive newspaper reports, in scrapbooks. He published (as was common during this time) books that included his lengthy summations to juries and other testimony and comment during trial. He also had a habit of pasting letters and other related items inside the front and back covers of volumes he owned._

_Joshua was working on the records of one infamous murder trial (which went to two trials after the accused was found to have tampered with the first jury), and found that one of the letters pasted in front of a copy of his published “Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10, and 11, 1879 ...” was from Wilkie Collins, credited for the first mystery novels. Joshua transcribed the letter, and discovered that it was in reply to Moak, who had mentioned Collins’ novel The Moonstone in his argument and had sent a copy of the book to Collins._

_Given the importance of the letter, which asked exactly the kinds of questions a novelist would ask of a practicing lawyer (“How do you keep track of the facts as you deliver your argument?” was one), Joshua felt that he must include the letter in his catalog record. His problem was exacerbated by the fact that the library had three copies, two bound with another Billings trial pamphlet, written by someone else._

_Joshua started by creating work records for the first two published works, issued together--one by Moak, the other by Judge Landon. Work 1:_

- Author: Moak, Nathaniel C. (Nathaniel Cleveland ), 1833-1892.

- Title of the Work: Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr.

- Subject: Trials (Murder) -- New York (State) -- Ballston Spa

- Defendant: Billings, Jesse

- Original Language of the Work: English

- Has a complement: [id for letter to N. Moak from W. Collins]

_Work 2:_

- Author: Landon, Judson S. (Judson Stuart), 1832-1881.

- Title of the Work: : The charge of Hon. Judson S. Landon, presiding judge at the Saratoga oyer and terminer, in the case of the people against Jesse Billings, Jr.

- Subject: Trials (Murder) -- New York (State) -- Ballston Spa

- Defendant: Billings, Jesse

- Original Language of the Work: English

_Joshua then moves on to create an expression record for each work, with language and content type elements._

- Language of Expression: English

- Content Type: Text

_The manifestation record is tricky, because there are separate title pages for each of the works (used for the work records), plus a collective title page for the combined work, which is the only place that the “reporter” is mentioned. Joshua puzzles about this, and finally decides to include the reporter in the manifestation record, though he’s not sure this is correct._

- Title proper: Closing argument of Nathaniel C. Moak at Ballston Spa, October 7, 8, 9, 10 and 11, 1878, on behalf of the people, in the case of the people against Jesse Billings, Jr.; with the charge of the Hon. Judson S. Landon, presiding justice

- Statement of responsibility relating to title: reported by Buel C. Andrews

- Reporter: Andrews, Buel C. [note that the RDA roles does not yet include “reporter”]

- Place of Production: Albany

- Producer’s name: Weed, Parsons and Company, printers

- Date of Production: 1879

- Extent: 189, 32 pages [note that the sets of pages reflect the two parts issued together]

_Joshua then creates a work level description for the letter, in order to relate it properly to the one copy of the combined work in which it is pasted. He’s not quite sure how to do this, but personfully wades in and makes the attempt, and creates a work record for the letter, and a work/work relationship between it and the Moak argument. Even though the letter has both a bibliographic and physical relationship with the other work, he’s pretty sure the bibliographic one is important enough to highlight._

- Author: Collins, Wilkie, 1824-1889

- Title of work: Letter to Nathaniel Moak, January 13, 1880

- Original language of the work: English

- Complements: [id for Moak’s Closing argument]

_How to note that it’s handwritten? He’s not sure, so he moves on to expression:_

- Language of Expression: English

- Content Type: Text

_He includes some information on the letter as a manifestation:_

- Extent: 2 pages

_In order to completely describe the items where there is a “bound with” relationship, Joshua creates a third work record for the medical testimony, related to the others both bibliographically (it’s about the same trials), and physically (it’s bound in the same physical volume as two copies of the other combined work, though not the letter)._

- Author: Balch, Lewis, 1847-1909

- Title of work: A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Balston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony

- History of the work: Read before the Medical Society of New York, February 3, 1881 and Reprinted from its Transactions for 1881.

- Is a reproduction of: [insert link to version in the transactions of the Medical Society]

- Subject: Trials (Murder) -- New York (State) -- Ballston Spa

- Defendant: Billings, Jesse

_Joshua moves on to the expression record:_

- Language of Expression: English

- Content Type: Text

_And to the manifestation:_

- Title proper: A review of the second trial of Jesse Billings, Jr., for the murder of his wife : tried at the Saratoga oyer and terminer, Ballston, Saratoga county, April, 1880. Being chiefly a review of the medical testimony

- Place of Production: Syracuse

- Producer’s name: Truair, Smith & Bruce

- Date of production: 1881

- Extent: 28 pages

_Joshua is not really sure what to do about the fact that this publication is part of a library created collection of materials about the Billings trials. Should the collection itself have a separate description? He thinks it probably does, but isn’t sure where in the Work/Expression/Manifestation/Item the relationship between the overall collection and this piece is properly expressed._

_Uh oh. Joshua realizes that there’s a digital version of all these materials (except the letter). He goes on coffee break._

#### Scenario 7, a typical best-seller

**Link to Scenario 7 RDF Expression and Analysis: [Scenarios/7](http://dublincore.org/dcmirdataskgroup/Scenarios_2f7)**

_James Cataloger works in a small public library that serves the leisure reading needs of the local population. His library does not use OCLC for cataloging. Instead, James creates records for each of the new books, often using the Library of Congress CIP that is found in the books, because they don't have a source of copy cataloging._

_James is working through a box of new books, and pulls out "The Spy Who Came for Christmas"_

_The title page reads:_

 The Spy Who Came for Christmas 
 David Morrell New York, Vanguard Press 

_The verso has:_

 (c) Copyright 2008, David Morrell 

_Because there is no publication date on the title page, James will use the copyright date in his record._

_The ISBNs (both 10 and 13) are on the back cover by the barcode.

The CIP shows the author's name as simply "Morell, David"_

_Using this information, James sets up the work as:_

- Author: Morell, David

- Title of the Work: The Spy who came for Christmas

_And the expression:_

- Language of expression: English

- Content type: Text

_And the manifestation:_

- Title proper: The Spy who came for Christmas

- Statement of responsibility relating to title: David Morrell

- Place of publication: New York

- Publisher's name: Vanguard Press

- Copyright date: 2008

- Pagination: 233 p.

- Size: 20 cm

- Identifier for the manifestation: ISBN-10:1593154879

- Identifier for the manifestation: ISBN-13:978-1593154875

_He sticks a big "M" on the spine, and shelves the book in the mystery section._

#### Scenario 8: Publisher's series

**Link to Scenario 8 RDF Expression and Analysis: [Scenarios/8](http://dublincore.org/dcmirdataskgroup/Scenarios_2f8)**

_Jane Cataloger's library receives a new copy of William Golding's "Lord of the Flies," replacing one that was returned with too many missing pages. The book is published by Penguin as part of their Penguin Great Books of the 20th Century series. The basic information for the manifestation is:_

- Title proper: Lord of the flies

- Publisher's name: Penguin

- Date of publication: 1999

- Place of publication: New York

- Pagination: 192 p.

- Identifier for the manifestation: ISBN-10:0140283331

- Identifier for the manifestation: ISBN-13:978-0140283334

_Jane knows (or at least assumes) that the original work was written in English and the title was Lord of the Flies, so she has the beginning of a work record:_

- Author: Golding, William _(Jane finds an authority record in the catalog for "Golding, William, 1911-1993" and uses this form in her record.)_

- Title of the work: Lord of the flies

- Original language of the work: English

_She doesn't know the date of the work and doesn't want to take the time to look it up. The only thing she has for the expression is:_

- Language of expression: English

- Content type: Text

_There is one last thing: The book is part of the "Penguin Great Books of the 20th Century" series. This is a publisher series, so she knows that her library will not have a separate record for it. However, she knows that the series is popular among her readers, and she wants them to be able to search on the series and see which ones the library owns. She adds a series field to the record:_

- Title proper of series: Penguin great books of the 20th century

_The series does not appear to have an ISSN nor any numbering of individual titles._

#### Scenario 9: Series with separate catalog entry

**Link to Scenario 9 RDF Expression and Analysis: [Scenarios/9](http://dublincore.org/dcmirdataskgroup/Scenarios_2f9)**

_Janet Cataloger works in an academic library that carries many esteemed research materials that are issued in known and revered series. Today she is cataloging the following book:_

_(From the cover:)_

CURRENT TOPICS IN MICROBIOLOGY AND IMMUNOLOGY

Anireddy S. N. Reddy Maxim Golovkin Editors

Nuclear pre-mRNA Processing in Plants

Springer

_Inside the book, she finds:_

c 2008

Berlin, Springer

_She thinks she recognizes the series title, and looks it up in the catalog. There is a record in the catalog treating the series as an ongoing serial (although the format is listed as Journal). It reads in part:_

Title: Current topics in microbiology and immunology = Ergebnisse der Mikrobiologie und Immunitätsforschung

Publisher: Berlin ; New York : Springer-Verlag, 1967-

Description: v. : ill. ; 26 cm

Publishing History: Irregular

Note: German title dropped with 76

 Some vols. have also distinctive titles, 40-129; each v. has also a distinctive title, 130-<167> 

ISSN 0070-217X

_Janet creates a record for the volume:_

- Work:

  - Title of the work: Nuclear pre-mRNA processing in plants

  - Date of work: 2008

  - Subject: Plant genetic regulation

  - Editor: Reddy, Anireddy S. N.

  - Editor: Golovkin, Maxim

- Expression:

  - Language of expression: English

  - Content type: Text

- Manifestation

  - Title proper: Nuclear pre-mRNA processing in plants

  - Statement of responsibility relating to title: Anireddy S. N. Reddy, Maxim Golovkin, Editors

  - Place of publication: Berlin

  - Publisher's name: Springer

  - Copyright date: 2008

  - Title proper of series: Current topics in microbiology and immunology

  - Parallel title of series: Ergebnisse der Mikrobiologie und Immunitätsforschung

  - ISSN of series: 0070-217X

  - Numbering within series: v. 326

_Because the policy in her library is to analyze to the chapter level for aggregations in certain subjects, she also separate work records for each chapter and links them to the aggregate work, the expression and the manifestation records already created._

#### Scenario 10: No work information

**Link to Scenario 10 RDF Expression and Analysis: [Scenarios/10](http://dublincore.org/dcmirdataskgroup/Scenarios_2f10)**

_Jane Cataloger is working on box of donated books. The donor was obviously an old lefty, and she sets aside the pamphlet version of Mao's "Oppose Book Worship" to hang up on the staff room bulletin board (anonymously)._

_The Vanguard edition of Peter Kropotkin's "The Conquest of Bread" will be a welcome addition to the library's holdings in the area of revolutionary literature._

_The information she has from the volume is:_

- The Conquest of Bread

- by Peter Kropotkin

- Author of "fields, Factories, and Workshops" "The Memoirs of a Revolutionist," Etc.

- New York

- Vanguard Press

- Published, 1906

- Vanguard printings: first - August 1926, second - November, 1927

- Printed in the United States of American

- Union Bug 489

_Jane wants to get this book onto the shelf as quickly and efficiently (read: unexpensively) as possible, so she's going to create a minimal record. She starts with the author's name. She doesn't have an authority record under "Kropotkin." She's aware that his "true" name would have a Russian form, but she doesn't want to research it, and she doesn't think that the Russian form of the name would be particularly useful for her users. She'll use "Kropotkin, Peter" and not create an authority record for the name._

_Jane thinks about what to do about the work. She's pretty sure that the book was not originally written in English, but there is no mention of translation in this edition. Also, she's pretty sure that the book was written before 1906. She uses what she has to create a work record for the book:_

- Author: Kropotkin, Peter

- Title of the Work: The conquest of bread

_Next, she creates a brief expression record:_

- Language of expression: English

- Content type: Text

_Lastly, she creates a manifestation record with the following information:_

- Title proper: The conquest of bread

- Statement of responsibility relating to title: by Peter Kropotkin

- Place of publication: New York

- Publisher's name: Vanguard Press

- Date of manufacture: 1927 (Because she suspects that the 1906 date does not refer to this manifestation, she uses the printing date.)

- Extent: 214 p.

_She adds the RFID tag with the book's accession number, which creates an item record:_

- Identifier for the item: 00334872

_(N.B. Original was in French. First published in Paris in 1892. The LC Name Authority heading is: "Kropotkin, Petr Alekseevich, kni︠a︡zʹ, 1842-1921" None of the editions I could find named a translator, probably because the work was originally serialized in a London lefty newspaper founded by Kropotkin himself.)_

#### Changes made

- dih 3/8/08 Clarification of creation of expression for collected work in scenario 2; moved actors from expression to work in scenario 3 [as per Greta and Martha's suggestion].

- dih 3/9/08 Added Scenario 4

- dih 3/12/08 Added Scenario 5

- dih 10/13/08 Added Scenari0 6

- kc 11/25/08 added Scenario 7

- kc 12/4/08 added Scenario 8

- kc 12/?/08 added scenario 9

- kc 12/7/08 added scenario 10

- dih 12/12/08 modified Scenarios 7-10

 [RefreshCache](http://dublincore.org/dcmirdataskgroup/Scenarios?action=refresh&arena=Page.py&key=Scenarios.text_html) for this page (cached 2013-01-10 15:59:54)  

Immutable page (last edited 2011-03-14 19:15:53 by DianeHillmann)


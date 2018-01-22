---
title: Functional Requirements
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/DublinToDrupal_Project/Functional_Requirements.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 7 Oct 2012, at 12:27.  
This page has been accessed 1,284 times.

Return to [Dublin to Drupal Top](/mediawiki_wiki/DublinToDrupal_Project "DublinToDrupal Project")

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Description"><span class="tocnumber">1</span> <span class="toctext">Description</span></a></li>
        <li class="toclevel-1 tocsection-2">
          <a href="#Functional_Requirements"><span class="tocnumber">2</span> <span class="toctext">Functional Requirements</span></a>
          <ul>
            <li class="toclevel-2 tocsection-3"><a href="#Drupal_Unauthenticated_Users"><span class="tocnumber">2.1</span> <span class="toctext">Drupal Unauthenticated Users</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#Drupal_Authenticated_Users"><span class="tocnumber">2.2</span> <span class="toctext">Drupal Authenticated Users</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>


## Description 

General categories of DCMI activity, goals and objectives:

1. 

**Groups (_"Community"_):**

  1. 

**Ecology Watch:**  
Functionality supporting the automated aggregation of information feeds from relevant sources and the ability of authenticated users to quickly and easily submit information about upcoming events, projects of interest and other valuable resources for reference and community discussion. Ecology watch is intended to provide DCMI authenticated users with the means to actively participate and contribute to community awareness with minimal demands on content creation.

  2. 

**Communications & Social Networking:**  
 In addition to inclusion of forums, blogs and commenting features supporting communications among authenticated users, this area of functionality also includes the integration of existing 3rd-party social networking features such as "like this page" on Facebook and "tweet this page" on Twitter, among others.

  3. 

**Activities:**  
 Through the work of its Communities and Task Groups, authenticated users are engaged in activities frequently leading to the community authoring (and maintenance) of **_specifications_** , various forms of **_best practice documentation_** , **_user guides_** and **_learning resources_**. Group authoring functionality will support community engagement in creating such resources including appropriate content type templating to facilitate input, workflows, editorial processes and publication ("activity" as Drupal "Book"?).

_Current activity themes in metadata innovation & best practices:_

    - Vocabularies for metadata: Creation, curation, mapping, access & preservation

  4. 

**Meetings & Conferences:**

    - **International Conference:** Currently on an Open Conference System (Public Knowledge Foundation) platform at [http://dcevents.dublincore.org/](http://dcevents.dublincore.org/)

    - **Regional Meetings/Conferences:** Currently on an Open Journal System (Public Knowledge Foundation) platform at [http://dcpapers.dublincore.org/](http://dcpapers.dublincore.org/)

2. 

**Learning Lab (_"Education & Training"_)**

_Creation, preservation and access to ..._

  1. 

**Learning Resources:** @@@

  2. 

**Tutorials:**

    - **Live Tutorials:** (e.g., tutorials at conferences)

    - **Webinars:** (e.g., the NISO/DCMI webinar series)

    - **Screencasts** (e.g., @@@)

3. 

**Cross-Ecology Relationships and Liaisons (_"Cross-Ecology Relationships"_)**

  1. 

**Metadata Standards Bodies:** @@@

  2. 

**Domain-focused metadata organizations:** @@@

## Functional Requirements 

See also [Roles & Permissions](/index.php?title=DublinToDrupal_Project/Roles&action=edit&redlink=1 "DublinToDrupal Project/Roles (page does not exist)") & [Website Users](/index.php?title=DublinToDrupal_Project/Users&action=edit&redlink=1 "DublinToDrupal Project/Users (page does not exist)")

### Drupal Unauthenticated Users 
<dl>
<dd> Unauthenticated Users with varying metadata knowledge and skill-levels wanting to learn about metadata (and DCMI) (the "47%"); 
<dl><dd> As far as we can tell, the '47%' is comprised of a rich array of people ranging across LIS professionals. Some are directed to DCMI to learn about the Initiative and the DCMI specifications including (but not limited to): (a) students of CS and LIS with coursework with a DC metadata component, employment contexts thinking about using DCMI specifications; and (c) those simply interested in learning more. The knowledge and skills of this group vary widely; however, most are new either to metadata or DCMI specifications or best practices (or all of the above). 
</dd></dl>

</dd>
<dd> Unauthenticated practitioners, researchers and developers who use the website as "reference" for doing their work on an ongoing basis (e.g., bookmark the dcterms namespace); 
<dl><dd> DCMI properties are among the most prevalent in describing resources on the web and committed professional users are continuously needing to use the website documentation pages for reference. These are usually metadata-knowledgable people with ongoing uses of DCMI who likely never look at pages on the website other than specifications. They bookmark or memorize the needed URLs and drop directly in and directly out. 
</dd></dl>

</dd>
</dl>
<dl><dd>
<ul>
<li> Users can come to the site and see aggregated feeds at community and DCMI-wide levels of metadata activities beyond DCMI.
</li>
<li> Users are able to submit questions regarding metadata and community members can respond to those questions (FAQ) with subsequent community comments on responses.
</li>
<li> Users have access to all DCMI published content not designated "premium content".
</li>
<li> RSS feeds are available at various levels (community, task group, DCMI administration) and with specific content types allowing users to monitor specific activities and resources.
</li>
</ul>
</dd></dl>

### Drupal Authenticated Users 

1. ***Participating Members***
  - Able to submit calendar events at the community or DCMI-wide level (what's happening around the world?).
  - Able to submit activity/project submissions (what's new, interesting projects out there?).
  - Able to submit for publication descriptions of metadata tools & other useful community resources (including learning resources, publications).
  - Able to submit glossary terms and to comment on the terms submissions of others.
  - Able to contributors at the task group, community and DCMI-wide levels can create structured specification documents with controlled editorial permissions and levels of public visibility.
2. ***Supporting Members***
  - Supporting Members have all of the privileges of Participating Members.
  - Supporting Members are Participating Members that pay an annual membership fee.
  - Obtain discounts to DCMI events (annual conference and joint NISO/DCMI webinars).
  - Obtain early access to resource designated "premium content".
3. ***Activity Lead***
  - Activity Leads have all of the privileges of Participating Members.
  - Activity leads are people charged with managing a group and have different labels depending on the nature of the group--e.g., "moderator" and "chair"--but common rights. 
  - Able to manage a group blog.
  - Able to edit and delete comments on resources and blogs
  - Able designate calendar events, metadata initiative tool, other resource descriptions and news items submitted by Participating Members to "bubble up" from the level of their entry (e.g., task group, community levels) to parent levels.


---
title: TinyArchive
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/TinyArchive.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 25 July 2014, at 15:15.  
This page has been accessed 28,990 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Case_Study_-_The_Tiny_Archive"><span class="tocnumber">1</span> <span class="toctext">Case Study - The Tiny Archive</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2">
              <a href="#Use_Cases"><span class="tocnumber">1.1</span> <span class="toctext">Use Cases</span></a>
              <ul>
                <li class="toclevel-3 tocsection-3"><a href="#Document_the_schema.org_properties_that_are_being_used"><span class="tocnumber">1.1.1</span> <span class="toctext">Document the schema.org properties that are being used</span></a></li>
                <li class="toclevel-3 tocsection-4"><a href="#Document_the_values_of_the_properties"><span class="tocnumber">1.1.2</span> <span class="toctext">Document the values of the properties</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Case Study - The Tiny Archive

Tiny archive has less than 10,000 total items. About 2/3 of these have been described in a spreadsheet, and each item is represented on the web as a web page. The descriptions contain commentary about their items in different languages. The archive wants to begin linking to other archives in its topic area, as well as to a database of terms that is now available in RDF. Because there is no database behind their data, and that all of their data uses text strings, they have decided to begin by adding schema.org RDFa to their web pages as part of the transformation from spreadsheet to html.They want to continue developing their data and adding linkable URIs. As they "improve" their web pages by adding more linkable values in their RDFa, they need a way to document the current state of their RDFa: what properties they are using from schema.org, and what value types they provide for those properties. As they create normalized forms of their data (e.g. creating standard format dates) they want to update the documentation to reflect this. This documentation will help them interact with other archives and data providers, as well as documenting the changes for themselves.

Because Tiny Archive has only 1.5 FTE, maintaining this document needs to be something that requires very little specialized knowledge about RDF/RDFa. Also, the archives they wish to interact with similarly have great subject expertise but no dedicated technology staff. Their data needs are simple, and the profile method needs to be equally simple.

## Use Cases

### Document the schema.org properties that are being used

e.g.

<pre>

  schema.org/web page
	schema.org/name = the title of the web page
	schema.org/date = the most recent update data of the web page
  schema.org/creativeWork
	schema.org/name = the name of the item being described
	schema.org/dateCreated = the creation date of the work (estimated)</pre>
### Document the values of the properties

e.g.

<pre>
   schema.org/creativeWork
	schema.org/name = literal "Veneri di Parabita" (can this get a language code?)
	schema.org/dateCreated = literal (to be normalized in the future) e.g. "300-200 BC"</pre>

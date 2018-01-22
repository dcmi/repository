---
title: Lrmi-schema
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Lrmi-schema.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 11 Dec 2014, at 05:45.  
This page has been accessed 537 times.

[<img alt="LRMI logo" src="/mediawiki_wiki/images/LRMI_400w.png" width="300" height="119">](/mediawiki_wiki/images/LRMI_400w.png "LRMI logo")

[Task Group Home Page](/mediawiki_wiki/Pet/ld4pe "Pet/ld4pe")

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1"><a href="#Resource_Description_in_LD4PE"><span class="tocnumber">1</span> <span class="toctext">Resource Description in LD4PE</span></a></li>
        <li class="toclevel-1 tocsection-2">
          <a href="#Schemes_.26_Schemas"><span class="tocnumber">2</span> <span class="toctext">Schemes &amp; Schemas</span></a>
          <ul>
            <li class="toclevel-2 tocsection-3">
              <a href="#Describing_Learning_Resources"><span class="tocnumber">2.1</span> <span class="toctext">Describing Learning Resources</span></a>
              <ul>
                <li class="toclevel-3 tocsection-4"><a href="#schema.org.2FLRMI_to_Dublin_Core_.26_IEEE.2FLOM_mappings"><span class="tocnumber">2.1.1</span> <span class="toctext">schema.org/LRMI to Dublin Core &amp; IEEE/LOM mappings</span></a></li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

# Resource Description in LD4PE 

- Competency index resources
- Learning resources (with mappings to competency index(es))

# Schemes & Schemas 

## Describing Learning Resources 

The LD4PE goal in describing learning resources <u>is not rich description</u>. We leave rich description to others. LD4PE has no need beyond core data (title, description (abstract), subjects (aboutness—particularly proper nouns), & educational framework mappings. Of course, the LRMI/schema.org framework provides for extensibility.

### schema.org/LRMI to Dublin Core & IEEE/LOM mappings 
> <table border="1" cellpadding="5" width="85%">
> <tr>
> <th>LRMI/Schema.org</th>
> <th>Dublin Core</th>
> <th>GEM</th>
> <th>IEEE/LOM</th>
> </tr>
> <tr>
> <th colspan="4">Type: <a href="http://schema.org/CreativeWork" class="external free" rel="nofollow">http://schema.org/CreativeWork</a>
> </th>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>name</em><br>
> <strong>URI:</strong> <a href="http://schema.org/name" class="external free" rel="nofollow">http://schema.org/name</a>
> </td>
> <td>
> <strong>Property:</strong> <em>title</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/terms/title" class="external free" rel="nofollow">http://purl.org/dc/terms/title</a>
> </td>
> <td>
> <strong>Property:</strong> <em>title</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/terms/title" class="external free" rel="nofollow">http://purl.org/dc/terms/title</a>
> </td>
> <td>
> <strong>Property:</strong> <em>Title</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>about</em><br>
> <strong>URI:</strong> <a href="http://schema.org/about" class="external free" rel="nofollow">http://schema.org/about</a>
> </td>
> <td>
> <strong>Property:</strong> <em>subject</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/subject" class="external free" rel="nofollow">http://purl.org/dc/dcterms/subject</a>
> </td>
> <td>
> <strong>Property:</strong> <em>subject</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/subject" class="external free" rel="nofollow">http://purl.org/dc/dcterms/subject</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>dateCreated</em><br>
> <strong>URI:</strong> <a href="http://schema.org/dateCreated" class="external free" rel="nofollow">http://schema.org/dateCreated</a>
> </td>
> <td>
> <strong>Property:</strong> <em>created</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/created" class="external free" rel="nofollow">http://purl.org/dc/dcterms/created</a>
> </td>
> <td>
> <strong>Property:</strong> <em>created</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/created" class="external free" rel="nofollow">http://purl.org/dc/dcterms/created</a>
> </td>
> <td>
> <strong>Property:</strong> <em>Date</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>author</em><br>
> <strong>URI:</strong> <a href="http://schema.org/author" class="external free" rel="nofollow">http://schema.org/author</a>
> </td>
> <td>
> <strong>Property:</strong> <em>creator</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/creator" class="external free" rel="nofollow">http://purl.org/dc/dcterms/creator</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>publisher</em><br>
> <strong>URI:</strong> <a href="http://schema.org/publisher" class="external free" rel="nofollow">http://schema.org/publisher</a>
> </td>
> <td>
> <strong>Property:</strong> <em>publisher</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/pubisher" class="external free" rel="nofollow">http://purl.org/dc/dcterms/pubisher</a>
> </td>
> <td>
> <strong>Property:</strong> <em>publisher</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/pubisher" class="external free" rel="nofollow">http://purl.org/dc/dcterms/pubisher</a>
> </td>
> <td>
> <strong>Property:</strong> <em>Role</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>inLanguage</em><br>
> <strong>URI:</strong> <a href="http://schema.org/inLanguage" class="external free" rel="nofollow">http://schema.org/inLanguage</a>
> </td>
> <td>
> <strong>Property:</strong> <em>language</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/language" class="external free" rel="nofollow">http://purl.org/dc/dcterms/language</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>license</em><br>
> <strong>URI:</strong> <a href="http://schema.org/license" class="external free" rel="nofollow">http://schema.org/license</a>
> </td>
> <td>
> <strong>Property:</strong> <em>license</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/license" class="external free" rel="nofollow">http://purl.org/dc/dcterms/license</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>educationalAlignment</em><br>
> <strong>URI:</strong> <a href="http://schema.org/educationalAlignment" class="external free" rel="nofollow">http://schema.org/educationalAlignment</a>
> </td>
> <td>
> <strong>Property:</strong> <em>conformsTo</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/conformsTo" class="external free" rel="nofollow">http://purl.org/dc/dcterms/conformsTo</a>
> </td>
> <td>
> <strong>Property:</strong> <em>conformsTo</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/conformsTo" class="external free" rel="nofollow">http://purl.org/dc/dcterms/conformsTo</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>educationalUse</em><br>
> <strong>URI:</strong> <a href="http://schema.org/educationalUse" class="external free" rel="nofollow">http://schema.org/educationalUse</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em>pedagogy</em><br>
> <strong>URI:</strong> <a href="http://purl.org/gem/qualifiers/pedagogy" class="external free" rel="nofollow">http://purl.org/gem/qualifiers/pedagogy</a>
> </td>
> <td>
> <strong>Property:</strong> <em>Purpose (Classification Category)</em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>timeRequired</em><br>
> <strong>URI:</strong> <a href="http://schema.org/timeRequired" class="external free" rel="nofollow">http://schema.org/timeRequired</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em>duration</em><br>
> <strong>URI:</strong> <a href="http://purl.org/gem/qualifiers/duration" class="external free" rel="nofollow">http://purl.org/gem/qualifiers/duration</a>
> </td>
> <td>
> <strong>Property:</strong> <em>Typical Learning Time</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>typicalAgeRange</em><br>
> <strong>URI:</strong> <a href="http://schema.org/typicalAgeRange" class="external free" rel="nofollow">http://schema.org/typicalAgeRange</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em>Typical Age Range</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>interactivityType</em><br>
> <strong>URI:</strong> <a href="http://schema.org/interactivityType" class="external free" rel="nofollow">http://schema.org/interactivityType</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em>Interactivity Type</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>learningResourceType</em><br>
> <strong>URI:</strong> <a href="http://schema.org/learningResourceType" class="external free" rel="nofollow">http://schema.org/learningResourceType</a>
> </td>
> <td>
> <strong>Property:</strong> <em>type</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/type" class="external free" rel="nofollow">http://purl.org/dc/dcterms/type</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em>Learning Resource Type</em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>isBasedOnUrl</em><br>
> <strong>URI:</strong> <a href="http://schema.org/isBasedOnUrl" class="external free" rel="nofollow">http://schema.org/isBasedOnUrl</a>
> </td>
> <td>
> <strong>Property:</strong> <em>source</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/source" class="external free" rel="nofollow">http://purl.org/dc/dcterms/source</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>accessibilityAPI</em><br>
> <strong>URI:</strong> <a href="http://schema.org/accessibilityAPI" class="external free" rel="nofollow">http://schema.org/accessibilityAPI</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>accessibilityControl</em><br>
> <strong>URI:</strong> <a href="http://schema.org/accessibilityControl" class="external free" rel="nofollow">http://schema.org/accessibilityControl</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>accessibilityFeature</em><br>
> <strong>URI:</strong> <a href="http://schema.org/accessibilityFeature" class="external free" rel="nofollow">http://schema.org/accessibilityFeature</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>accessibilityHazard</em><br>
> <strong>URI:</strong> <a href="http://schema.org/accessibilityHazard" class="external free" rel="nofollow">http://schema.org/accessibilityHazard</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> None</td>
> <td>
> <strong>Property:</strong> <em>educationLevel</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/terms/educationLevel" class="external free" rel="nofollow">http://purl.org/dc/terms/educationLevel</a>
> </td>
> <td>
> <strong>Property:</strong> <em>educationLevel</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/terms/educationLevel" class="external free" rel="nofollow">http://purl.org/dc/terms/educationLevel</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong> None</td>
> </tr>
> <tr>
> <th colspan="4">Type: <a href="http://schema.org/AlignmentObject" class="external free" rel="nofollow">http://schema.org/AlignmentObject</a>
> </th>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>alignmentType</em><br>
> <strong>URI:</strong> <a href="http://schema.org/alignmentType" class="external free" rel="nofollow">http://schema.org/alignmentType</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>educationalFramework</em><br>
> <strong>URI:</strong> <a href="http://schema.org/educationalFramework" class="external free" rel="nofollow">http://schema.org/educationalFramework</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>targetDescription</em><br>
> <strong>URI:</strong> <a href="http://schema.org/targetDescription" class="external free" rel="nofollow">http://schema.org/targetDescription</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>targetName</em><br>
> <strong>URI:</strong> <a href="http://schema.org/targetName" class="external free" rel="nofollow">http://schema.org/targetName</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>targetUrl</em><br>
> <strong>URI:</strong> <a href="http://schema.org/targetUrl" class="external free" rel="nofollow">http://schema.org/targetUrl</a>
> </td>
> <td>
> <strong>Property:</strong> <em>N/A</em><br>
> <strong>URI:</strong> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> <tr>
> <th colspan="4">Type: <a href="http://schema.org/EducationalAudience" class="external free" rel="nofollow">http://schema.org/EducationalAudience</a>
> </th>
> </tr>
> <tr>
> <td>
> <strong>Property:</strong> <em>educationalRole</em><br>
> <strong>URI:</strong> <a href="http://schema.org/educationalRole" class="external free" rel="nofollow">http://schema.org/educationalRole</a>
> </td>
> <td>
> <strong>Property:</strong> <em>audience</em><br>
> <strong>URI:</strong> <a href="http://purl.org/dc/dcterms/audience" class="external free" rel="nofollow">http://purl.org/dc/dcterms/audience</a>
> </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> <td>
> <strong>Property:</strong> <em> </em><br>
> <strong>URI:</strong>  </td>
> </tr>
> </table>


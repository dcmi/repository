---
title: MoinMoin to MediaWiki Migration
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/mediawiki_wiki/MoinMoin_to_MediaWiki_Migration.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 3 May 2011, at 03:52.  
This page has been accessed 19,548 times.

<table id="toc" class="toc">
  <tr>
    <td>
      <div id="toctitle">
        <h2>Contents</h2>
      </div>
      <ul>
        <li class="toclevel-1 tocsection-1">
          <a href="#Migrating_pages_from_legacy_DCMI_MoinMoin_wikis_to_the_new_MediaWiki"><span class="tocnumber">1</span> <span class="toctext">Migrating pages from legacy DCMI MoinMoin wikis to the new MediaWiki</span></a>
          <ul>
            <li class="toclevel-2 tocsection-2"><a href="#MoinMoin_wikis_with_more_than_ten_pages"><span class="tocnumber">1.1</span> <span class="toctext">MoinMoin wikis with more than ten pages</span></a></li>
            <li class="toclevel-2 tocsection-3"><a href="#MoinMoin_wikis_with_fewer_pages"><span class="tocnumber">1.2</span> <span class="toctext">MoinMoin wikis with fewer pages</span></a></li>
            <li class="toclevel-2 tocsection-4"><a href="#References"><span class="tocnumber">1.3</span> <span class="toctext">References</span></a></li>
          </ul>
        </li>
      </ul>
    </td>
  </tr>
</table>

## Migrating pages from legacy DCMI MoinMoin wikis to the new MediaWiki 

There are no plans to turn off the existing MoinMoin wikis, but they are running on very old versions of the MoinMoin software, and DCMI is not in a position to guarantee that their contents will be preserved. If owners of MoinMoin wikis feel that particular materials should be preserved for archival reasons but not necessarily edited further, by far the easiest option would be to save the wiki pages, as viewed in the browser, to HTML, and archive the resulting HTML pages to dublincore.org.

Tom was able to port the MoinMoin version of the DCAM review <sup id="cite_ref-0" class="reference"><a href="#cite_note-0">[1]</a></sup> into MediaWiki <sup id="cite_ref-1" class="reference"><a href="#cite_note-1">[2]</a></sup> by hand without too much trouble. It appears to be easy to change titles and lists by hand, but tables are more challenging. One example that looks like it would be more difficult to convert, because of its tables, is the LOM-DCAM analysis <sup id="cite_ref-2" class="reference"><a href="#cite_note-2">[3]</a></sup>. This document is from the Education wiki <sup id="cite_ref-3" class="reference"><a href="#cite_note-3">[4]</a></sup> which is among the two or three largest of the legacy MoinMoin wikis (see attached list).

W3C migrated its MoinMoin into MediaWiki about two or three years ago, and the batch process they used is available for others <sup id="cite_ref-4" class="reference"><a href="#cite_note-4">[5]</a></sup>. Tom has not found any scripts for converting raw MoinMoin texts to raw MediaWiki texts. The alternative appears to be that between batch-converting an entire MoinMoin wiki to MediaWiki using the W3C method or to hand-editing documents one-by-one.

#### MoinMoin wikis with more than ten pages 

- [http://dublincore.org/dcmirdataskgroup](http://dublincore.org/dcmirdataskgroup)
- [http://dublincore.org/accessibilitywiki](http://dublincore.org/accessibilitywiki)
- [http://dublincore.org/architecturewiki](http://dublincore.org/architecturewiki)
- [http://dublincore.org/educationwiki](http://dublincore.org/educationwiki)
- [http://dublincore.org/kernelwiki](http://dublincore.org/kernelwiki)
- [http://dublincore.org/librarieswiki](http://dublincore.org/librarieswiki)
- [http://dublincore.org/usageboardwiki](http://dublincore.org/usageboardwiki)

#### MoinMoin wikis with fewer pages 

- [http://dublincore.org/collectionwiki](http://dublincore.org/collectionwiki)
- [http://dublincore.org/identifierswiki](http://dublincore.org/identifierswiki)
- [http://dublincore.org/scholarwiki](http://dublincore.org/scholarwiki) (e.g., SWAP/DSP)
- [http://dublincore.org/taggingwiki](http://dublincore.org/taggingwiki)
- [http://dublincore.org/agentswiki](http://dublincore.org/agentswiki)
- [http://dublincore.org/datewiki](http://dublincore.org/datewiki)
- [http://dublincore.org/dc-conferencewiki](http://dublincore.org/dc-conferencewiki)
- [http://dublincore.org/dcgapwiki](http://dublincore.org/dcgapwiki)
- [http://dublincore.org/kmwiki](http://dublincore.org/kmwiki)

#### References 

1. ↑ [http://dublincore.org/architecturewiki/DcamInContext](http://dublincore.org/architecturewiki/DcamInContext)
2. ↑ [/archive/mediawiki_wiki/Review\_of\_DCMI\_Abstract\_Model](/archive/mediawiki_wiki/Review_of_DCMI_Abstract_Model)
3. ↑ [http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce\_2fLomDCAMAnalysis](http://dublincore.org/educationwiki/DCMIIEEELTSCTaskforce_2fLomDCAMAnalysis)
4. ↑ [http://dublincore.org/educationwiki/](http://dublincore.org/educationwiki/)
5. ↑ [http://dev.w3.org/2008/moinmoin2mediawiki/](http://dev.w3.org/2008/moinmoin2mediawiki/)


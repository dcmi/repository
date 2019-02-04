---
title: Map of value vocabularies for frequency of issue of continuing resources
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Map_of_value_vocabularies_for_frequency_of_issue_of_continuing_resources.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 6 August 2013, at 09:38.  
This page has been accessed 93,181 times.

This is a sufficient map between published UNIMARC, Dublin Core Collection Level Description, MARC 21, and RDA value vocabularies for frequency of issue of continuing resources.

Mappings not specified can be entailed: skos:closeMatch is symmetric; skos:broadMatch has inverse skos:narrowMatch.

Assumptions:

1. A collection, a continuing resource, and an integrating resource are all types of resource with content that changes through time.
2. A lower frequency is a broader concept than a higher frequency within similar concepts; weekly (excluding weekend) is broader than weekly (including weekend).

See the [Map of properties for frequency of a resource](/mediawiki_wiki/Map_of_properties_for_frequency_of_a_resource.md) for properties that can take these values.

<pre>
#
# Map of value vocabularies for frequency of issue of continuing resources.
#
# This map is not approved by the target vocabulary owners.
#
# Creator: Gordon Dunsire
# Date: 7 Jun 2013
#
@prefix dccld: &lt;http://purl.org/dc/cld/freq/&gt; .
@prefix marc21: &lt;http://marc21rdf.info/terms/continuingfre#&gt; .
@prefix rda: &lt;http://rdvocab.info/termList/frequency/&gt;.
@prefix skos: &lt;http://www.w3.org/2004/02/skos/core#&gt; .
@prefix unimarc: &lt;http://iflastandards.info/ns/unimarc/terms/continuingfreq#&gt; .
# daily
unimarc:a skos:closeMatch dccld:daily .
unimarc:a skos:closeMatch marc21:d .
dccld:daily skos:closeMatch marc21:d .
rda:1001 skos:broadMatch dccld:daily .
rda:1001 skos:broadMatch marc21:d .
rda:1001 skos:broadMatch unimarc:a .
# semiweekly
unimarc:b skos:closeMatch dccld:semiweekly .
unimarc:b skos:closeMatch marc21:c .
unimarc:b skos:closeMatch rda:1005 .
dccld:semiweekly skos:closeMatch marc21:c .
dccld:semiweekly skos:closeMatch rda:1005 .
marc21:c skos:closeMatch rda:1005 .
# weekly
unimarc:c skos:closeMatch dccld:weekly .
unimarc:c skos:closeMatch marc21:w .
unimarc:c skos:closeMatch rda:1004 .
dccld:weekly skos:closeMatch marc21:w .
dccld:weekly skos:closeMatch rda:1004 .
marc21:w skos:closeMatch rda:1004 .
# biweekly
unimarc:d skos:closeMatch dccld:biweekly .
unimarc:d skos:closeMatch marc21:e .
unimarc:d skos:closeMatch rda:1003 .
dccld:biweekly skos:closeMatch marc21:e .
dccld:biweekly skos:closeMatch rda:1003 .
marc21:e skos:closeMatch rda:1003 .
# semimonthly
unimarc:e skos:closeMatch dccld:semimonthly .
unimarc:e skos:closeMatch marc21:s .
unimarc:e skos:closeMatch rda:1009 .
dccld:semimonthly skos:closeMatch marc21:s .
dccld:semimonthly skos:closeMatch rda:1009 .
marc21:s skos:closeMatch rda:1009 .
# monthly
unimarc:f skos:closeMatch dccld:monthly .
unimarc:f skos:closeMatch rda:1008 .
dccld:monthly skos:closeMatch rda:1008 .
unimarc:f skos:broadMatch marc21:m .
dccld:monthly skos:broadMatch marc21:m .
rda:1008 skos:broadMatch marc21:m .
# bimonthly
unimarc:g skos:closeMatch dccld:bimonthly .
unimarc:g skos:closeMatch marc21:b .
unimarc:g skos:closeMatch rda:1007 .
dccld:bimonthly skos:closeMatch marc21:b .
dccld:bimonthly skos:closeMatch rda:1007 .
marc21:b skos:closeMatch rda:1007 .
# quarterly
unimarc:h skos:closeMatch dccld:quarterly .
unimarc:h skos:closeMatch rda:1010 .
unimarc:h skos:closeMatch marc21:q .
dccld:quarterly skos:closeMatch marc21:q .
dccld:quarterly skos:closeMatch rda:1010 .
rda:1010 skos:closeMatch marc21:q .
# three times a year
unimarc:i skos:closeMatch dccld:threeTimesAYear .
unimarc:i skos:closeMatch marc21:t .
unimarc:i skos:closeMatch rda:1011 .
dccld:threeTimesAYear skos:closeMatch marc21:t .
dccld:threeTimesAYear skos:closeMatch rda:1011 .
marc21:t skos:closeMatch rda:1011 .
# semiannual
unimarc:j skos:closeMatch dccld:semiannual .
unimarc:j skos:closeMatch marc21:f .
unimarc:j skos:closeMatch rda:1012 .
dccld:semiannual skos:closeMatch marc21:f .
dccld:semiannual skos:closeMatch rda:1012 .
marc21:f skos:closeMatch rda:1012 .
# annual
unimarc:k skos:closeMatch dccld:annual .
unimarc:k skos:closeMatch marc21:a .
unimarc:k skos:closeMatch rda:1013 .
dccld:annual skos:closeMatch marc21:a .
dccld:annual skos:closeMatch rda:1013 .
marc21:a skos:closeMatch rda:1013 .
# biennial
unimarc:l skos:closeMatch dccld:biennial .
unimarc:l skos:closeMatch marc21:g .
unimarc:l skos:closeMatch rda:1014 .
dccld:biennial skos:closeMatch marc21:g .
dccld:biennial skos:closeMatch rda:1014 .
marc21:g skos:closeMatch rda:1014 .
# triennial
unimarc:m skos:closeMatch dccld:triennial .
unimarc:m skos:closeMatch marc21:h .
unimarc:m skos:closeMatch rda:1015 .
dccld:triennial skos:closeMatch marc21:h .
dccld:triennial skos:closeMatch rda:1015 .
marc21:h skos:closeMatch rda:1015 .
# three times a week
unimarc:n skos:closeMatch dccld:threeTimesAWeek .
unimarc:n skos:closeMatch marc21:i .
unimarc:n skos:closeMatch rda:1002 .
dccld:threeTimesAWeek skos:closeMatch marc21:i .
dccld:threeTimesAWeek skos:closeMatch rda:1002 .
marc21:i skos:closeMatch rda:1002 .
# three times a month
unimarc:o skos:closeMatch dccld:threeTimesAMonth .
unimarc:o skos:closeMatch marc21:j .
unimarc:o skos:closeMatch rda:1006 .
dccld:threeTimesAMonth skos:closeMatch marc21:j .
dccld:threeTimesAMonth skos:closeMatch rda:1006 .
marc21:j skos:closeMatch rda:1006 .
# continuously updated
unimarc:p skos:closeMatch dccld:continuous .
unimarc:p skos:broadMatch marc21:k .
dccld:continuous skos:broadMatch marc21:k .
# unknown
unimarc:u skos:exactMatch marc21:u .
# irregular
unimarc:y skos:closeMatch dccld:irregular .
unimarc:y skos:closeMatch &lt;http://marc21rdf.info/terms/continuingfre#%23&gt; .
unimarc:y skos:closeMatch rda:1016 .
dccld:irregular skos:closeMatch &lt;http://marc21rdf.info/terms/continuingfre#%23&gt; .
dccld:irregular skos:closeMatch rda:1016 .
&lt;http://marc21rdf.info/terms/continuingfre#%23&gt; skos:closeMatch rda:1016 .
# other
unimarc:z skos:closeMatch marc21:z .

</pre>

[Maps between bibliographic value vocabularies](/mediawiki_wiki/Maps_between_bibliographic_value_vocabularies.md)


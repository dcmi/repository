---
title: Kernel Metadata and RDF
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/kernelwiki/attachments/kernelTurtle.html"
---


Examples from Charles Blair and Erik Hetzner

<pre><b>Abbreviated ANVL:</b>

erc: Gibbon, Edward | The Decline and Fall of the Roman Empire | 1781
     | http://www.ccel.org/g/gibbon/decline/

<b>"Normalized" or "Canonical" ANVL:</b>

erc: 
who: Gibbon, Edward
what: The Decline and Fall of the Roman Empire
when: 1781
where: http://www.ccel.org/g/gibbon/decline/

<b>Full Turtle:</b>

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 &lt;http://purl.org/kernel/elements/1.1/who&gt;
   "Gibbon, Edward" ;

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 &lt;http://purl.org/kernel/elements/1.1/what&gt;
   "The Decline and Fall of the Roman Empire" ;

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 &lt;http://purl.org/kernel/elements/1.1/when&gt;
   "1781" ;

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 &lt;http://purl.org/kernel/elements/1.1/where&gt;
   "http://www.ccel.org/g/gibbon/decline/" .

<b>Brief Turtle:</b>

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 &lt;http://purl.org/kernel/elements/1.1/who&gt;
   "Gibbon, Edward" ;

 &lt;http://purl.org/kernel/elements/1.1/what&gt;
   "The Decline and Fall of the Roman Empire" ;

 &lt;http://purl.org/kernel/elements/1.1/when&gt;
   "1781" ;

 &lt;http://purl.org/kernel/elements/1.1/where&gt;
   "http://www.ccel.org/g/gibbon/decline/" .

<b>Briefer Turtle:</b>

@prefix erc: &lt;http://purl.org/kernel/elements/1.1/&gt; .
&lt;http://www.ccel.org/g/gibbon/decline/&gt;
 erc:who
   "Gibbon, Edward" ;

 erc:what
   "The Decline and Fall of the Roman Empire" ;

 erc:when
   "1781" ;

 erc:where
   "http://www.ccel.org/g/gibbon/decline/" .

<b>Or:</b>

@prefix erc: &lt;http://purl.org/kernel/elements/1.1/&gt;.
@prefix this: &lt;http://www.ccel.org/g/gibbon/decline/&gt;.
this: erc:who "Gibbon, Edward";
      erc:what "The Decline and Fall of the Roman Empire";
      erc:when "1781";
      erc:where "http://www.ccel.org/g/gibbon/decline/".

<b>More examples:</b>

# Note the language attribute and date type.

@prefix erc: &lt;http://purl.org/kernel/elements/1.1/&gt; .
@prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .

&lt;http://www.ccel.org/g/gibbon/decline/&gt;
  erc:who "Gibbon, Edward" ;
  erc:what "The Decline and Fall of the Roman Empire"@en ;
  erc:when "1781"^^xsd:gYear ;
  erc:where &lt;http://www.ccel.org/g/gibbon/decline/&gt; .

<b>As canonical RDF:</b>

&lt;?xml version="1.0"?&gt;
&lt;rdf:RDF xmlns:xsd="http://www.w3.org/2001/XMLSchema#"
xmlns:erc="http://purl.org/kernel/elements/1.1/"
xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"&gt;
&lt;rdf:Description rdf:about="http://www.ccel.org/g/gibbon/decline/"&gt;
&lt;erc:who&gt;Gibbon, Edward&lt;/erc:who&gt;
&lt;erc:what xml:lang="en"&gt;The Decline and Fall of the Roman
Empire&lt;/erc:what&gt;
&lt;erc:when
rdf:datatype="http://www.w3.org/2001/XMLSchema#gYear"&gt;1781&lt;/erc:when&gt;
&lt;erc:where rdf:resource="http://www.ccel.org/g/gibbon/decline/" /&gt;
&lt;/rdf:Description&gt;
&lt;/rdf:RDF&gt;

<b>And:</b>

@prefix chas: &lt;http://www.lib.uchicago.edu/chas/private/elements/&gt;.
@prefix dcterms: &lt;http://purl.org/dc/terms/&gt;.
@prefix erc: &lt;http://purl.org/kernel/elements/1.1/&gt;.
@prefix skos: &lt;http://www.w3.org/2004/02/skos/core#&gt;.
@prefix : &lt;http://mark-four.lib.uchicago.edu:8003/rdf/connector.xqy?item=&gt;.

:a45
dcterms:creator """Pacheco de Narvaez, Luis""";
dcterms:title """Advertencias para la enseñanza de la
Filosofia y destreza de las armas assí a pie como a
cavallo""";
dcterms:publisher """Pamplona""";
dcterms:created """1642""";
dcterms:extent """2 h., 68 p. ; 8º""";
dcterms:provenance """Biblioteca Nacional de España""";
dcterms:provenance """Biblioteca RAE""";
skos:note """In: Vindel, Pedro. Antiguos tratados de esgrima (siglo
XVII). Nuevamente impresos por D. L. D'Orvenipe. Madrid. 1898""";
chas:where [
           erc:where
	   &lt;http://books.google.com/books?id=xzNS0kVKbdcC&amp;printsec=frontcover#PPP1,M1&gt;;
           chas:file
	   """Antiguos_tratados_de_esgrima__siglo_XVII.pdf""";
           chas:note """Google Books (University of Michigan)""";
           chas:note """p. 98 is missing; reported to Google Books
           on 2009-05-11"""];
erc:meta-who """Curtis, Mary Dill and R.E. "Puck" Curtis.""";
erc:meta-what """\"Destreza Books.\" Destreza Translation and Research
Project. 2005. Ghost Sparrow Publications.""";
erc:meta-when """2009-05-08""";
erc:meta-where &lt;http://www.destreza.us/resources/destreza_sources.html&gt;.

<b>As canonical RDF:</b>

&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:creator&gt;Pacheco de Narvaez, Luis&lt;/dcterms:creator&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:title&gt;Advertencias para la enseñanza de la Filosofia y destreza de las armas assí a pie como a cavallo&lt;/dcterms:title&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:publisher&gt;Pamplona&lt;/dcterms:publisher&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:created&gt;1642&lt;/dcterms:created&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:extent&gt;2 h., 68 p. ; 8º&lt;/dcterms:extent&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:provenance&gt;Biblioteca Nacional de España&lt;/dcterms:provenance&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;dcterms:provenance&gt;Biblioteca RAE&lt;/dcterms:provenance&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;skos:note&gt;In: Vindel, Pedro. Antiguos tratados de esgrima (siglo XVII). Nuevamente impresos por D. L. D'Orvenipe. Madrid. 1898&lt;/skos:note&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;chas:where rdf:nodeID="genid24"/&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;erc:meta-who&gt;Curtis, Mary Dill and R.E. "Puck" Curtis.&lt;/erc:meta-who&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;erc:meta-what&gt;"Destreza Books." Destreza Translation and Research Project. 2005. Ghost Sparrow Publications.&lt;/erc:meta-what&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;erc:meta-when&gt;2009-05-08&lt;/erc:meta-when&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:about="http://chas.lib.uchicago.edu:1969/abc.html#a45"&gt;
  &lt;erc:meta-where rdf:resource="http://www.plumes.org/destreza/resources/destreza_sources.html"/&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:nodeID="genid24"&gt;
  &lt;erc:where rdf:resource="http://books.google.com/books?id=xzNS0kVKbdcC&amp;printsec=frontcover#PPP1,M1"/&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:nodeID="genid24"&gt;
  &lt;chas:file&gt;Antiguos_tratados_de_esgrima__siglo_XVII.pdf&lt;/chas:file&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:nodeID="genid24"&gt;
  &lt;chas:note&gt;Google Books (University of Michigan)&lt;/chas:note&gt;
&lt;/rdf:Description&gt;
&lt;rdf:Description rdf:nodeID="genid24"&gt;
  &lt;chas:note&gt;p. 98 is missing; reported to Google Books on 2009-05-11&lt;/chas:note&gt;
&lt;/rdf:Description&gt;

</pre>

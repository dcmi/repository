---
title: DC and DCTERMS Namespaces
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/FAQ/DC_and_DCTERMS_Namespaces.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 24 February 2013, at 15:40.  
This page has been accessed 165,694 times.

**Question** : What is the difference between dc:creator and dcterms:creator, and why have the fifteen elements of the Dublin Core been declared using two separate namespaces?

The fifteen elements of Dublin Core were coined in 1995-1996 -- before the invention of RDF in 1997-1998 -- and were among the first RDF properties to be declared anywhere, so they were declared as RDF properties before W3C had yet standardized the notion of "range" in the RDF Schema specification. As RDF matured, these properties were criticized in Semantic Web circles for being underspecified and thus ambiguous. For example, was dc:creator intended to refer to the creator of a resource (an object) or to the name of the creator (a string)? DCMI wanted to assign ranges, but in doing so did not want to "break" existing data, which elements such as Subject and Create were used, "in the wild", with both literal and non-literal values.

As described in the [January 2008 release of DCMI Metadata Terms](http://dublincore.org/documents/2008/01/14/dcmi-terms/), DCMI resolved this dilemma by creating fifteen properties in the /terms/ namespace in parallel to the corresponding terms in the /elements/1.1/ namespace, and declared the former as subproperties of the latter:

<dl><dd>Formal domains and ranges specify what kind of described resources and value resources are associated with a given property. Domains and ranges express the meanings implicit in natural-language definitions in an explicit form that is usable for the automatic processing of logical inferences. When a given property is encountered, an inferencing application may use the domains and ranges assigned by DCMI to that property in order to make inferences about the resources described thereby.
</dd></dl>
<dl><dd>So as not to affect the conformance of existing implementations of "simple Dublin Core" in RDF, domains and ranges have not been specified for the fifteen properties of the dc: namespace (<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>). Rather, fifteen new properties with "names" identical to those of DCMES Version 1.1 have been created in the dcterms: namespace (<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>). These fifteen new properties have been defined as subproperties of the corresponding properties of DCMES Version 1.1 and assigned domains and ranges as outlined in this document.
</dd></dl>
<dl><dd>Implementers may freely choose to use these fifteen properties either in their original dc: variant (e.g., <a href="http://purl.org/dc/elements/1.1/creator" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/creator</a>) or in the dcterms: variant (e.g., <a href="http://purl.org/dc/terms/creator" class="external free" rel="nofollow">http://purl.org/dc/terms/creator</a>) depending on application requirements. The RDF schemas of the DCMI namespaces describe the subproperty relation of dcterms:creator to dc:creator for use by Semantic Web-aware applications. Over time, however, implementers are encouraged to use the semantically more precise dcterms: properties, as they more fully follow emerging notions of best practice for machine-processable metadata. 
</dd></dl>


It is <u>not</u> incorrect to continue using dc:subject and dc:title -- alot of Semantic Web data still does -- and since the range of those properties is unspecified, it is not actually incorrect to use (for example) dc:subject with a <u>literal</u> value or dc:title with a <u>non-literal</u> value. However, good Semantic Web practice is to use properties consistently in accordance with formal ranges, so implementers are encouraged to use the more precisely defined dcterms: properties.

**Update, December 2011** : It is worth noting that the [Schema.org](http://schema.org/) initiative is taking a pragmatic approach towards the formal ranges of their properties [6]:

<dl><dd>We also expect that often, where we expect a property value of type Person, Place, Organization or some other subClassOf Thing, we will get a text string. In the spirit of "some data is better than none", we will accept this markup and do the best we can.
</dd></dl>


What constitutes "best practice" in this area is bound to evolve with implementation experience over time.

**References**

- [1] [http://dublincore.org/documents/dcmi-terms/#elements-title](http://dublincore.org/documents/dcmi-terms/#elements-title)
- [2] [http://dublincore.org/documents/dcmi-terms/#elements-subject](http://dublincore.org/documents/dcmi-terms/#elements-subject)
- [3] [http://dublincore.org/documents/dcmi-terms/#H1](http://dublincore.org/documents/dcmi-terms/#H1)
- [4] [http://dublincore.org/documents/dcmi-terms/#terms-subject](http://dublincore.org/documents/dcmi-terms/#terms-subject)
- [5] [http://lists.w3.org/Archives/Public/public-swd-wg/2009Jan/0000.html](http://lists.w3.org/Archives/Public/public-swd-wg/2009Jan/0000.html)
- [6] [http://schema.org/docs/datamodel.html](http://schema.org/docs/datamodel.html)


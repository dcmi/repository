---
title: Dublin Core Prefixes
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/mediawiki_wiki/Dublin_Core_Prefixes.html"
---

 **This is an archived MediaWiki page.**  
This page was last modified on 31 October 2012, at 15:41.  
This page has been accessed 44,990 times.

**Question** : What is the difference between dc:creator and dcterms:creator, and why have the fifteen elements of the Dublin Core been declared using two separate namespaces?

The fifteen elements of Dublin Core were coined in 1995-1996 -- before the invention of RDF in 1997-1998 -- and were among the first RDF properties to be declared anywhere, so they were declared as RDF properties before W3C had yet standardized the notion of "range" in the RDF Schema specification. As RDF matured, these properties were criticized in Semantic Web circles for being underspecified and thus ambiguous. For example, was dc:creator intended to refer to the creator of a resource (an object) or to the name of the creator (a string)? DCMI wanted to assign ranges, but in doing so did not want to "break" existing legacy data, which elements such as Subject and Create were used, "in the wild", with both literal and non-literal values.

As described in the [January 2008 release of DCMI Metadata Terms](http://dublincore.org/documents/2008/01/14/dcmi-terms/), DCMI resolved this dilemma by creating fifteen properties in the /terms/ namespace in parallel to the corresponding terms in the /elements/1.1/ namespace, and declared the former as subproperties of the latter:

<dl><dd>Formal domains and ranges specify what kind of described resources and value resources are associated with a given property. Domains and ranges express the meanings implicit in natural-language definitions in an explicit form that is usable for the automatic processing of logical inferences. When a given property is encountered, an inferencing application may use the domains and ranges assigned by DCMI to that property in order to make inferences about the resources described thereby.
</dd></dl>
<dl><dd>So as not to affect the conformance of existing implementations of "simple Dublin Core" in RDF, domains and ranges have not been specified for the fifteen properties of the dc: namespace (<a href="http://purl.org/dc/elements/1.1/" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/</a>). Rather, fifteen new properties with "names" identical to those of DCMES Version 1.1 have been created in the dcterms: namespace (<a href="http://purl.org/dc/terms/" class="external free" rel="nofollow">http://purl.org/dc/terms/</a>). These fifteen new properties have been defined as subproperties of the corresponding properties of DCMES Version 1.1 and assigned domains and ranges as outlined in this document.
</dd></dl>
<dl><dd>Implementers may freely choose to use these fifteen properties either in their legacy dc: variant (e.g., <a href="http://purl.org/dc/elements/1.1/creator" class="external free" rel="nofollow">http://purl.org/dc/elements/1.1/creator</a>) or in the dcterms: variant (e.g., <a href="http://purl.org/dc/terms/creator" class="external free" rel="nofollow">http://purl.org/dc/terms/creator</a>) depending on application requirements. The RDF schemas of the DCMI namespaces describe the subproperty relation of dcterms:creator to dc:creator for use by Semantic Web-aware applications. Over time, however, implementers are encouraged to use the semantically more precise dcterms: properties, as they more fully follow emerging notions of best practice for machine-processable metadata. 
</dd></dl>


It is not actually incorrect to continue using dc:subject and dc:title -- alot of Semantic Web data still does -- and since the range of those properties is unspecified, it is not actually incorrect to use (for example) dc:subject with a \_literal\_ value or dc:title with a \_non-literal\_ value. However, good Semantic Web practice is to use properties consistently in accordance with formal ranges, so implementers are encouraged to use the more precisely defined dcterms: properties.

**Update, December 2011** : It is worth noting that the [Schema.org](http://schema.org/) initiative is taking a pragmatic approach towards the formal ranges of their properties [6]:

<dl><dd>We also expect that often, where we expect a property value of type Person, Place, Organization or some other subClassOf Thing, we will get a text string. In the spirit of "some data is better than none", we will accept this markup and do the best we can.
</dd></dl>


What constitutes "best practice" in this area is bound to evolve with implementation experience over time.

### Dublin Core prefixes (Dan) 

In W3C standards like like RDF/XML, Turtle, SPARQL and RDFa, it is possible to use an abbreviated form instead of writing full URIs for DC terms.

So, the term whose URI is [http://purl.org/dc/terms/creator](http://purl.org/dc/terms/creator) might be written xyz:creator, so long as the prefix 'xyz' is associated with the vocabulary URI, namely [http://purl.org/dc/terms/](http://purl.org/dc/terms/)

In RDF/XML we can do this with xmlns:xyz=" [http://purl.org/dc/terms/](http://purl.org/dc/terms/)"; in RDFa 1.1 we might use prefix="xyz: [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)". In RDFa 1.0, which works with XML-based HTML, SVG etc, xmlns:xyz would be used.

Having said this, the prefix 'xyz', while technically correct, is not very helpful to publishers or consumers. Generally, prefixes are used which are indicative of the associated vocabulary.

For vocabularies such as Dublin Core whose main URI has changed over time, this gives rise to a practical question. Should we use the common abbreviation of 'dc' with the older or the newer vocabulary URI? Is it better to associate 'dc:' with the URI [http://purl.org/dc/terms/](http://purl.org/dc/terms/) or the URI [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/)? Older content might even use [http://purl.org/dc/elements/1.0/](http://purl.org/dc/elements/1.0/)

For Dublin Core, there is an additional consideration. The /terms/ version of Dublin Core has a strong bias towards entity-centric modeling rather than the use of textual labels. So we say that the 'range' of 'creator' (to be precise of ' [http://purl.org/dc/terms/creator'](http://purl.org/dc/terms/creator')) is the class [http://purl.org/dc/terms/Agent](http://purl.org/dc/terms/Agent). Earlier versions of Dublin Core were more tolerant of the practice of writing an Agent's name, instead of also describing the agent explicitly.

Finally, a further consideration is that the W3C recommendation for RDFa 1.1 (including the simple RDFa Lite profile) comes with some built-in default prefix declarations. RDFa 1.1 associates both 'dc:' and 'dcterms:' with [http://purl.org/dc/terms/](http://purl.org/dc/terms/).

Where does this leave us?

- the prefix 'dc:' has several common uses; most recently with /terms/, but with a strong historical association to /elements/1.1/ and before that /elements/1.0/. The earlier pre-XML 'dc.' prefix is still occasionally seen, as are hybrid patterns such as the use of 'dcterms.\*' using the pre-XML dotted notation (e.g. see BBC site)
- as an abbreviation for 'Dublin Core', it is reasonable to use 'dc:' to represent the most mature representation of DC, namely [http://purl.org/dc/terms/](http://purl.org/dc/terms/)
- many publishers enjoy the simplicity of allowing a name to 'stand in' where a more explicit description would provide an 'Agent' entity, and although this usage doesn't fit with the formal definition of /terms/ it is expected as a common shortcut.
- publishers who prefer to use the earlier [http://purl.org/dc/elements/1.1/](http://purl.org/dc/elements/1.1/) DC vocabulary rather than stretch the meaning of /terms/ can still use that; the prefix 'dce' (for the older style name, Dublin Core elements) is a good choice here, as it is less ambiguous than 'dc'.
- publishers who prefer to remain explicit that they are using /terms/ can use 'dcterms:'; this usage is anticpated in the RDFa Initial context and the prefix declaration can be omitted in RDFa 1.1.
- it remains perfectly proper to use either ' [http://purl.org/dc/elements/1.1/'](http://purl.org/dc/elements/1.1/') or ' [http://purl.org/dc/terms/'](http://purl.org/dc/terms/') with the prefix 'dc:'; however, note that 'dc:' is associated with the newer /terms/ URI in RDFa 1.1, and this usage is likely to become more mainstream. It is possible to write RDFa that overides the default prefix bindings, but this may cause more confusion than it saves,
- While the proper use of e.g. [http://purl.org/dc/terms/creator](http://purl.org/dc/terms/creator) is to give Agent as its value, it is not unusual for consuming applications to accept the informal usage and accept string values. For example, schema.org adopts such a mechanism.

In summary, 'dc:' can be used with either URI, 'dcterms:' is best used with the /terms/ URI, and 'dce:' with the /elements/1.1/' URI.

**References**

- [1] [http://dublincore.org/documents/dcmi-terms/#elements-title](http://dublincore.org/documents/dcmi-terms/#elements-title)
- [2] [http://dublincore.org/documents/dcmi-terms/#elements-subject](http://dublincore.org/documents/dcmi-terms/#elements-subject)
- [3] [http://dublincore.org/documents/dcmi-terms/#H1](http://dublincore.org/documents/dcmi-terms/#H1)
- [4] [http://dublincore.org/documents/dcmi-terms/#terms-subject](http://dublincore.org/documents/dcmi-terms/#terms-subject)
- [5] [http://lists.w3.org/Archives/Public/public-swd-wg/2009Jan/0000.html](http://lists.w3.org/Archives/Public/public-swd-wg/2009Jan/0000.html)
- [6] [http://schema.org/docs/datamodel.html](http://schema.org/docs/datamodel.html)


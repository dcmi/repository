---
title: "- SwapConstraints"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/usageboardwiki/pages/SwapConstraints.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [SwapConstraints](http://dublincore.org/usageboardwiki/SwapConstraints?action=fullsearch&value=SwapConstraints&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/usageboardwiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/usageboardwiki/FrontPage)
- [RecentChanges](http://dublincore.org/usageboardwiki/RecentChanges)
- [FindPage](http://dublincore.org/usageboardwiki/FindPage)
- [HelpContents](http://dublincore.org/usageboardwiki/HelpContents)

Page

- [Edit](http://dublincore.org/usageboardwiki/SwapConstraints?action=edit "Edit")
- [View](http://dublincore.org/usageboardwiki/SwapConstraints "View")
- [Diffs](http://dublincore.org/usageboardwiki/SwapConstraints?action=diff "Diffs")
- [Info](http://dublincore.org/usageboardwiki/SwapConstraints?action=info "Info")
- [Subscribe](http://dublincore.org/usageboardwiki/SwapConstraints?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/usageboardwiki/SwapConstraints?action=raw "Raw")
- [Print](http://dublincore.org/usageboardwiki/SwapConstraints?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/usageboardwiki/SwapConstraints?action=AttachFile)
- [DSP2XML](http://dublincore.org/usageboardwiki/SwapConstraints?action=DSP2XML)
- [DeletePage](http://dublincore.org/usageboardwiki/SwapConstraints?action=DeletePage)
- [LikePages](http://dublincore.org/usageboardwiki/SwapConstraints?action=LikePages)
- [LocalSiteMap](http://dublincore.org/usageboardwiki/SwapConstraints?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/usageboardwiki/SwapConstraints?action=SpellCheck)

Search

<form method="POST" action="/usageboardwiki/SwapConstraints">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="SwapConstraints_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="SwapConstraints_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## Review of the SWAP Description Set Profile

### Description Templates for the entities of the Domain Model

<table>
  <tbody>
    <tr>
      <td>
        <a class="external" href="http://dublincore.org/documents/2008/03/31/dc-dsp/"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">In draft DC-DSP spec</a>
      </td>
      <td>
        Caption in <a class="external" href="http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">SWAP</a>
      </td>
    </tr>
    <tr>
      <td>
        5.5. Resource Class Membership Constraint</td>
      <td>
        See explanation below</td>
    </tr>
    <tr>
      <td>
        5.1. Identifier</td>
      <td>
        Description</td>
    </tr>
  </tbody>
</table>


According to the review criteria, "the header or introduction of a Description Template" should provide one piece of mandatory information: "the class (or classes) of which resources described in this description may be an instance".

In the Scholarly Works Application Profile, the description templates are clearly marked with section headings such as "Description of the eprint as a Scholarly Work". As explained in the section "Entity typing" (near the end of the document), the Descriptions are explicitly "typed" using dc:type statements with one of the value URIs taken from the Eprints Entity Type Vocabulary Encoding Scheme:

- [http://purl.org/eprint/entityType/Expression/](http://purl.org/eprint/entityType/Expression/)

- [http://purl.org/eprint/entityType/Manifestation/](http://purl.org/eprint/entityType/Manifestation/)

- [http://purl.org/eprint/entityType/Copy/](http://purl.org/eprint/entityType/Copy/)

- [http://purl.org/dc/terms/DigitalResource](http://purl.org/dc/terms/DigitalResource)

- [http://purl.org/eprint/entityType/Person/](http://purl.org/eprint/entityType/Person/)

- [http://purl.org/eprint/entityType/Organization/](http://purl.org/eprint/entityType/Organization/)

This constraint corresponds to [<img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">"5.5. Resource Class Membership Constraint"](http://dublincore.org/documents/2008/03/31/dc-dsp/#sect-5) in the draft "Description Set Profiles" specification. In the [<img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">XML expression of SWAP](http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile?action=DSP2XML), the constraint is expressed with the XML element " [ResourceClass](http://dublincore.org/usageboardwiki/ResourceClass)".

The constraint [<img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">"5.1. Identifier"](http://dublincore.org/documents/2008/03/31/dc-dsp/#sect-5) -- "A string that can be used in a Value Constraint to reference a description template that applies to the value resource." -- is used in several statement templates. For example, in the description template for the property dc:creator, the Identifier constraint is labelled "Description: agent". The nature and function of this constraint is not clear unless one consults the [<img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">XML expression of SWAP](http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile?action=DSP2XML)), where the "Description" constraint is expressed with the XML element "descriptionTemplateID", which is itself not explicitly defined in the draft [<img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">DSP specification](http://dublincore.org/documents/2008/03/31/dc-dsp/).

### Statement Templates within a Description Template

<table>
  <tbody>
    <tr>
      <td>
        <a class="external" href="http://dublincore.org/documents/2008/03/31/dc-dsp/"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">In draft DC-DSP spec</a>
      </td>
      <td>
        Caption in <a class="external" href="http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">SWAP</a>
      </td>
    </tr>
    <tr>
      <td>
        6.1. Minimum occurrence constraint </td>
      <td>
        Min occurrence </td>
    </tr>
    <tr>
      <td>
        6.2. Maximum occurrence constraint </td>
      <td>
        Max occurrence </td>
    </tr>
    <tr>
      <td>
        6.3. Type constraint </td>
      <td>
        Literal? </td>
    </tr>
    <tr>
      <td>
        6.4.1. Property List Constraint </td>
      <td>
        Property </td>
    </tr>
  </tbody>
</table>


The two mandatory constraints (6.3. Type Constraint and 6.4.1. Property List Constraint) are provided in all cases. In some cases, maximum and minimum times that the given kind of Statement may appear in the enclosing Description are also provided.

The following property constraints are given

- In the section "Description of the eprint as a Scholarly Work"

<table>
  <tbody>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/abstract">http://purl.org/dc/terms/abstract</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/FND">http://www.loc.gov/loc.terms/relators/FND</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/grantNumber">http://purl.org/eprint/terms/grantNumber</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/THS">http://www.loc.gov/loc.terms/relators/THS</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/affiliatedInstitution">http://purl.org/eprint/terms/affiliatedInstitution</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/hasAdaptation">http://purl.org/eprint/terms/hasAdaptation</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/isExpressedAs">http://purl.org/eprint/terms/isExpressedAs</a>
      </td>
    </tr>
  </tbody>
</table>


- In the section "Description of an Expression of the eprint"

<table>
  <tbody>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/available">http://purl.org/dc/terms/available</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/status">http://purl.org/eprint/terms/status</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/version">http://purl.org/eprint/terms/version</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/copyrightHolder">http://purl.org/eprint/terms/copyrightHolder</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/hasVersion">http://purl.org/dc/terms/hasVersion</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/hasTranslation">http://purl.org/eprint/terms/hasTranslation</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/bibliographicCitation">http://purl.org/dc/terms/bibliographicCitation</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/references">http://purl.org/dc/terms/references</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://www.loc.gov/loc.terms/relators/EDT">http://www.loc.gov/loc.terms/relators/EDT</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/isManifestedAs">http://purl.org/eprint/terms/isManifestedAs</a>
      </td>
    </tr>
  </tbody>
</table>


- In the section "Description of a Manifestation of an Expression of the eprint"

<table>
  <tbody>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/modified">http://purl.org/dc/terms/modified</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/eprint/terms/isAvailableAs">http://purl.org/eprint/terms/isAvailableAs</a>
      </td>
    </tr>
  </tbody>
</table>


- In the section "Description of a Copy of a Manifestation of the eprint"

<table>
  <tbody>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/accessRights">http://purl.org/dc/terms/accessRights</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/license">http://purl.org/dc/terms/license</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/available">http://purl.org/dc/terms/available</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
      </td>
    </tr>
  </tbody>
</table>


- In the section "Description of a Copy of an Agent"

<table>
  <tbody>
    <tr>
      <td>
        <a href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/name">http://xmlns.com/foaf/0.1/name</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/family_name">http://xmlns.com/foaf/0.1/family_name</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/givenname">http://xmlns.com/foaf/0.1/givenname</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/workplaceHomepage">http://xmlns.com/foaf/0.1/workplaceHomepage</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/mbox">http://xmlns.com/foaf/0.1/mbox</a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="http://xmlns.com/foaf/0.1/homepage">http://xmlns.com/foaf/0.1/homepage</a>
      </td>
    </tr>
  </tbody>
</table>


### Statement Templates defining Literal Value Constraints

<table>
  <tbody>
    <tr>
      <td>
        <a class="external" href="http://dublincore.org/documents/2008/03/31/dc-dsp/"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">In draft DC-DSP spec</a>
      </td>
      <td>
        Caption in <a class="external" href="http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">SWAP</a>
      </td>
    </tr>
    <tr>
      <td>
        6.5.2. Literal language constraint </td>
      <td>
        Language constraint - Occurrence </td>
    </tr>
    <tr>
      <td>
        6.5.4. SES constraint </td>
      <td>
        SES constraint - Occurrence </td>
    </tr>
    <tr>
      <td>
        6.5.5. SES list constraint </td>
      <td>
        SES constraint - Choose from </td>
    </tr>
  </tbody>
</table>


Three of the five optional constraints defined for Literal Value Surrogates are used -- correctly and consistently, as far as the reviewer can see.

### Statement Templates defining Non-Literal Value Constraints

<table>
  <tbody>
    <tr>
      <td>
        <a class="external" href="http://dublincore.org/documents/2008/03/31/dc-dsp/"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">In draft DC-DSP spec</a>
      </td>
      <td>
        Caption in <a class="external" href="http://knowware.nada.kth.se/DCWiki/EprintsApplicationProfile"><img src="SwapConstraints_files/moin-www.png" alt="[WWW]" height="11" width="11">SWAP</a>
      </td>
    </tr>
    <tr>
      <td>
        6.3.1. Value URI constraint </td>
      <td>
        Value URI constraint - Occurrence </td>
    </tr>
    <tr>
      <td>
        6.6.3.2. Value URI List Constraint </td>
      <td>
        Value URI constraint - Choose from </td>
    </tr>
    <tr>
      <td>
        6.6.4.1. VES list constraint </td>
      <td>
        VES constraint - Choose from </td>
    </tr>
    <tr>
      <td>
        6.6.4.1. VES occurrence constraint </td>
      <td>
        VES constraint - Occurrence </td>
    </tr>
    <tr>
      <td>
        6.6.5.2. Maximum occurrence constraint </td>
      <td>
        Value string constraint - Max occur </td>
    </tr>
  </tbody>
</table>


Five of the possible constraints defined for Non-Literal Value Surrogates are used -- correctly and consistently, as far as the reviewer can see.

### Comments

- Is it redundant to have a Value VES constraint in addition to a Value URI constraint... or good practice? (for discussion). Example: "Entity Type" under "Scholarly Work"; "Status".

- The reviewer notes that "Subject" is intended to be used with a maximum of one value string.

- There are a few systematic typos in the text:

  - s/with the description set/within the description set/

  - s/Syntax Encoding Syntax Constraint/Syntax Encoding Scheme Constraint/

- The properties "Funder", "Supervisor", "Copyright Holder", "Editor", and "Publisher" have VES occurrence constraints defined as "optional". Perhaps the intention is to make Value URIs optional?

- The property templates for "Is Expressed As", "Has Version", "Have Translation", "References", "Is Manifested As", and "Is Available As" have VES occurrence constraints of "disallowed", which makes more sense but seems unnecessary.

- The property template for "Language" (under "Expression") disallows Value URIs and VESes, but provides Value URI List Constraints and VES List Constraints with null contents. Is this redundant? The reviewer notes that this is not done for "Format".

- The property templates for "Type" (under "Expression") and "Licence" say that "recommended best practice is to provide a value URI for a class from the Eprints Type Vocabulary Encoding Scheme. However, the formal Value URI constraints force the user to choose one of the defined types, and Value Strings are disallowed. In this case, the formal constraints are stronger than the constraints expressed in natural language.

<pre>----------------------------------------------------------------------
2008-09-11 Pete comments

&gt; I have written up my review results on a new wiki page [1].
&gt; Please note in particular the comments at the end. Please
&gt; feel free to fold your points directly into this wiki page.

On description templates,

===
The constraint [WWW]"5.1. Identifier" -- "A string that can be used in a
Value Constraint to reference a description template that applies to the
value resource." -- is used in several statement templates.
===

I think this needs to be a bit clearer.

5.1 applies to Description Templates - and isn't itself really a
constraint, I don't think: providing a DT identifier in a DSP doesn't in
itself provde any sort of constraint on a description set; it's the
subsequent reference to this identifier in a constraint within a
Statement Template which creates the constraint.

In the Statement Template, the constraint being used is 6.6.1
Description template reference (and this is a constraint). So I think
this text needs to be clearer what is being referred to, and if it's the
latter, then it belongs in the discussion of Statement Templates.

===
For example, in the description template for the property dc:creator,
the Identifier constraint is labelled "Description: agent".
===

This is definitely 6.6.1 Description template reference

===
The nature and function of this constraint is not clear unless one
consults the [WWW]XML expression of SWAP), where the "Description"
constraint is expressed with the XML element "descriptionTemplateID",
which is itself not explicitly defined in the draft [WWW]DSP
specification.
===

OK, I know we can only review what is in front of us, but to be fair on
the authors, this XML error is an error in the Wiki macro/plugin thing
(which generates the XML).

It's also the result of the Wiki macro/plugin behaviour that - AFAICT -
none of the Description Template data is made visible in the
human-readable text

I think we kinda need to find some way of acknowledging that in this
case some of the presentation of the document is out of the control of
the author and is determined by the Wiki plugin.

And the Wiki plugin might be improved to e.g. HTML hyperlink a 6.6.1
Description template reference to the referenced DT

On statement templates....

As I think I mentioned on the telecon, I think the current UB criterion
that a "6.4.1. Property List Constraint" is mandatory is too strong. A
DSP can provide a "6.4.2. Sub-property constraint" (and I'm probably
going to do that in one I'm working on now).

My main point is on

===
The property templates for "Type" (under "Expression") and "Licence" say
that "recommended best practice is to provide a value URI for a class
from the Eprints Type Vocabulary Encoding Scheme. However, the formal
Value URI constraints force the user to choose one of the defined types,
and Value Strings are disallowed. In this case, the formal constraints
are stronger than the constraints expressed in natural language.
===

I think there is a more fundamental problem with the STs which reference
the dc:type property in the Expression DT. There are two STs
(Expression/Entity Type and Expression/Type) with the same property list
constraint (list of one member, dc:type).

The first ST (Expression/Entity Type) says a statement must use a value
URI and that URI must be http://purl.org/eprint/entityType/Expression/
(which actually shouldn't have a terminal slash, but that isn't the
point I'm making!).

The second ST (Expression/Type) says a statement must use a value URI
and that URI must be one of a list (not including the URI above)

But this creates a problem for the matching algorithm. I'm fairly sure
the intent is that after matching up the description template, then it
uses the property constraint to select a statement template. And there
must be a match on exactly one statement template i.e. the DSP draft
says

===
Binding of statements to statement templates
    For each description, each statement is bound to a Statement
Template in the corresponding Description Template by evaluating the
Property Constraint. Each statement must be bound to exactly one
===

But here, within one DT, there are two different STs using the _same_
property list constraint (list of one member, dc:type). So in a
description of an Expression, any statement using dc:type is going to
match up on two STs, which I don't think is permitted.

To be sure, we proably need to check again with Mikael how the matching
algorithm is supposed to work, but I think I'm right in saying there's
an issue here, because we discussed it for the case of "how do we allow
dc:subject with a literal "tag" value and with a specified VES?")

(The solution is to use two different properties e.g. dc:type in one
case and rdf:type in the other, or coin a new subproperty)

And there prob needs to be another point in the criteria to say "Are the
STs and DTs defined so as to be matchable?" (in a better form of words
than that!)

----------------------------------------------------------------------
2008-09-11 Joe comments

Do the constraints presented in the Description Templates and
Statement Templates reflect the content of the domain model?

Is Creator an agent? In other words how does it relate to
agent in the model?

Is an Editor a type of Creator? Is Editor an agent?

Status says that when used a Value is mandatory. Why is it
"recommended best practice" if it is required?

Are the constraints presented in the Statement Templates
consistent with the definition of property provided by
its owner?

In the "Eprint-specific recommendation" for Creator you state
that implementers are to provide name or URI and/or a link to a
related description - is this consistent with the definition?
Is a related description the Creator? Should it be "and if
available a link to a related description about the author"

Property constraint declared with a literal or non-literal range?
Did not check

For "annotations": Is the recommended use of the term consistent
with the definition provided by the term owner? See question
about Creator.

For "annotations": Is the usage of these terms in the
description set profile consistent with the declared semantics?
See comment on related description

----------------------------------------------------------------------
2008-09-15 Pete

I'm looking at SWAP for other reasons, and just noticed one thing which
I think is an error...

In the Expression DT, there's an ST for bibliographic citation, which is
specified to take literal values, which is consistent with the range of
the property.

But the DC-Text example provided has a single statement with a literal
value surrogate with two value strings, one plain text, one an XML
literal. Which you can't do with a literal value surrogate. It should
use repeated statements each with a single value string.

I think this is a result of SWAP being designed on the basis of old DCAM
and then partly updated to new DCAM and various things being missed. 

</pre>

 [RefreshCache](http://dublincore.org/usageboardwiki/SwapConstraints?action=refresh&arena=Page.py&key=SwapConstraints.text_html) for this page (cached 2012-12-31 12:24:21)  

Immutable page (last edited 2008-09-17 13:55:20 by TomBaker)


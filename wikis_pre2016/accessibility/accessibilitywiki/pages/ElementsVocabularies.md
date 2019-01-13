---
title: "- ElementsVocabularies"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/accessibilitywiki/pages/ElementsVocabularies.html"
---

**2012-01-05. Frozen archive - links may not resolve - see directory of files at [MoinMoin wiki archive](/moinmoin-wiki-archive/)**

# > [ElementsVocabularies](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=fullsearch&value=ElementsVocabularies&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/ElementsVocabularies "View")
- [Diffs](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/ElementsVocabularies">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="ElementsVocabularies_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="ElementsVocabularies_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

## AfA Accessibility Metadata Module (Draft)
Note: This module is intended to be part of a standard DC application profile and so should be thought of as a module, rather than a complete, application profile. 

When the term 'accessibility' is used alone, the values best used are allTextual, auditoryOnly, hapticOnly, visualOnly, brailleOnly, tactileOnly, olfactoryOnly, hazard. For a complete definition of these terms, see below. These terms are defined at [http://purl.org/afa/accessibility](http://purl.org/afa/accessibility)

The following terms and vocabularies are presented as the DC equivalent of the terms and vocabularies in ISO/IEC JTC1 SC 36 N 24751. They are for use in an application profile.

### Terms

#### format (dc.format, AfA Vocabulary)

 alternative text, long description, caption, audio description, daisy, e-book, talking book (Note: should this be ebook or e-book?) 
#### type (dc.type, AfA vocabulary)

 enhanced text, verbatim text, reduced text, realtime transcription, transcription, concept imagery, symbolic, recorded, synthesized 
#### language (dc.language)

 ISO 15836; RFC 3066 
#### education level (dc.educationLevel)

 string 
#### has adaptation (AfA.hasAdaptation)

 resource (URI) 
#### is adaptation of (AfA.isAdaptationOf)

 resource (URI) 
#### has format (dc.hasFormat)

 resource (URI) 
#### is format of (dc.isFormatOf)

 resource (URI) 
#### has part (dc.hasPart)

 resource (URI) 
#### is part of (dc.isPartOf)

 resource (URI) 
#### accessMode (AfA.accessMode)

\*\*\* See below for proposed definitions of controlled vocabulary terms. See also note about 'hazard'.

 auditory, tactile, textual, visual, braille, haptic, olfactory, flashing hazard, sound hazard, ornamental content 
#### accessibility (AfA.accessibility) - NB: changed back from the earlier proposal of adaptability (AfA.adaptability) See below for proposed definitions of controlled vocabulary terms.

 allTextual, auditoryOnly, visualOnly, brailleOnly, tactileOnly, hapticOnly, olfactoryOnly, hazard 
#### flexibility (AfA.flexibility)

 keyboard only control, mouse only control, variable font size, variable font face, variable foreground colour, variable background colour, variable cursor , variable highlight , variable layout, variable reading rate, structured presentation 
#### support tool (AfA.supportTool)

 dictionary, calculator, note taker, peer interaction, thesaurus, abacus, spell checker, grammar checker, homophone checker, mind mapper, outliner 
#### role (AfA.role)

 replaces auditory, replaces tactile, replaces textual, replaces visual, replaces olfactory, auditory adaptation, tactile adaptation, textual adaptation, visual adaptation, olfactory adaptation 
#### reading rate (AfA.readingRate)

 integer [0,300] 
### Vocabularies

Introductory note: the definitions being proposed aim to make creation of the metadata easy and use of the metadata suitable for people trying to avoid resources with content (of value, not merely ornamental) in formats they cannot access. It should also make it possible to select content according to its format.

For example, one user may want to avoid resources where some of the significant content is only available as an image (i.e. there is no textual alternative, for instance), while another user wants to select only content that is available as an image, say a map, and a third wants a resource where the content that would be auditory for one user, can be in sign language for them.

The top level term 'afa.accessibility' is the term that most metadata creators will use and for that there is a vocabulary proposed that should assist users in their avoidance of resoucres they cann ot use, for one reason or another. For those users or systems that support selection, the range of terms proposed should be used, as appropriate.

For example, using 'afa.accessibility=visual" one can indicate that there is content that is in visual form and not available in any other form. Using 'afa.accessMode=visual; afa.hasAdaptation=textual and afa.role=replaces visual' one can indicate that although there is visual content, it can be replaced fully by textual content.

To enable a full selection process, other [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) terms should be used, such as language, to indicate that a resource is available in sign language (saying which sign language, of course), and format, to show that a resource is an image, a PDF, a Word document, or an mp3 sound file. All the relevant terms in the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) module (shown above) are recommended where possible because in combination they support content selection for people according to their needs and preferences.

While the multiplicity of uses of metadata is the goal of [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) work, it is recognised that in many cases it will be wonderful if there is just one accessibility element used, and that should probably be the main accessibility term used with a controlled vocabulary.

Where possible, the [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) module should form part of all metadata application profiles to support [AccessForAll](http://dublincore.org/accessibilitywiki/AccessForAll) to resources.

#### AfA.accessibility Vocabulary

auditoryOnly: Resource contains some significant content available as sounds only.

 E.G.: there is a significant content component with recorded speech with no alternative format. 

allTextual: Resource contains all significant content as transformable text.

 E.G.: although there is visual content, it is also available as transformable text. 

visualOnly: Resource contains some significant content available as images only.

 E.G.: there is some significant content that is available as an image with no alternative format. 

brailleOnly: Resource provides all significant content in Braille.

 E.G.: all the significant content of the resource, in whatever format, is also available as Braille or transformable text. 

tactileOnly: Resource contains some significant content as touchable components only.

 E.G.: there is a component of significant content that needs to be touched and has no alternative format. 

hapticOnly: Resource contains some significant content as kinesthetic components only.

 E.G.: there is a component of significant content that requires kinesthetic interaction with no alternative format. 

olfactoryOnly: Resource contains some significant content as smells only.

 E.G.: there is a component of significant content that offers odours that are not available in any alternative format. 

hazard: Resource contains potentially harmful content.

 E.G.: there is brief repetitive light or sound, or an odour, or motion simulation, that may be harmful to some people. 
#### AfA.accessMode Vocabulary

auditory: Resource contains some significant content as sounds.

 E.G.: there is a significant content component with recorded speech. 

textual: Resource contains some significant content as transformable text.

 E.G.: there is some significant content available as text that complies with WCAG AAA 

visual: Resource contains some significant content as images.

 E.G.: there is some significant content that is available as an image. 

braille: Resource contains some significant content in Braille.

 E.G.: some of the significant content of the resource is available as Braille. 

tactile: Resource contains some significant content as touchable components.

 E.G.: there is a component of significant content that needs to be touched. 

haptic: Resource contains some significant content as kinesthetic components.

 E.G.: there is a component of significant content that requires kinesthetic interaction. 

olfactory: Resource contains some significant content as smells.

 E.G.: there is a component of significant content that requires smelling. 

hazard: Resource contains potentially harmful content. See note below...

 E.G.: there is brief repetitive light or sound, or an odour, or motion simulation, that may be harmful to some people. 

### Notes

1. There should be no incompatibility between the use of the afa.accessibility vocabulary and the afa.access.Mode vocabulary. The DCAM requires that any value for the afa.accessMode term is also a suitable value for the term afa.accessibility because afa.accessMode is a sub-term of afa.accessibility.

2. The elements related to hazards are repeated in the vocabularies for afa.accessibility and afa.accessMode because of the importance of a warning for some people. In fact, as there are 4 values for hazard, it may be better to make hazard another sub-element, i.e. a term in its own right, so the 4 choices can be specified???? but, on the other hand, having yet another term means yet another that people may not want to bother with and it would be OK to have the 4 values available for afa.accessMode.

 [RefreshCache](http://dublincore.org/accessibilitywiki/ElementsVocabularies?action=refresh&arena=Page.py&key=ElementsVocabularies.text_html) for this page (cached 2013-01-01 02:24:14)  

Immutable page (last edited 2008-10-10 23:57:36 by LiddyNevile)


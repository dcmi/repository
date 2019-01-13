---
title: "- SyntaxReference"
date: '2017-09-01T16:21:09+01:00'
description: 
draft: false
creators: []
contributors: []
publisher: 
tags: []
aliases:
- "/archive/moinmoin_wiki/educationwiki/attachments/SyntaxReference.html"
---

# > [SyntaxReference](http://dublincore.org/accessibilitywiki/SyntaxReference?action=fullsearch&value=SyntaxReference&literal=1&case=1&context=40 "Click here to do a full-text search for this title")

User

 [UserPreferences](http://dublincore.org/accessibilitywiki/UserPreferences)
  

Site

- [FrontPage](http://dublincore.org/accessibilitywiki/FrontPage)
- [RecentChanges](http://dublincore.org/accessibilitywiki/RecentChanges)
- [FindPage](http://dublincore.org/accessibilitywiki/FindPage)
- [HelpContents](http://dublincore.org/accessibilitywiki/HelpContents)

Page

- [Edit](http://dublincore.org/accessibilitywiki/SyntaxReference?action=edit "Edit")
- [View](http://dublincore.org/accessibilitywiki/SyntaxReference "View")
- [Diffs](http://dublincore.org/accessibilitywiki/SyntaxReference?action=diff "Diffs")
- [Info](http://dublincore.org/accessibilitywiki/SyntaxReference?action=info "Info")
- [Subscribe](http://dublincore.org/accessibilitywiki/SyntaxReference?action=subscribe "Subscribe")
- [Raw](http://dublincore.org/accessibilitywiki/SyntaxReference?action=raw "Raw")
- [Print](http://dublincore.org/accessibilitywiki/SyntaxReference?action=print "Print")

Actions

- [AttachFile](http://dublincore.org/accessibilitywiki/SyntaxReference?action=AttachFile)
- [DSP2XML](http://dublincore.org/accessibilitywiki/SyntaxReference?action=DSP2XML)
- [DeletePage](http://dublincore.org/accessibilitywiki/SyntaxReference?action=DeletePage)
- [LikePages](http://dublincore.org/accessibilitywiki/SyntaxReference?action=LikePages)
- [LocalSiteMap](http://dublincore.org/accessibilitywiki/SyntaxReference?action=LocalSiteMap)
- [SpellCheck](http://dublincore.org/accessibilitywiki/SyntaxReference?action=SpellCheck)

Search

<form method="POST" action="/accessibilitywiki/SyntaxReference">
<p>
<input name="action" value="inlinesearch" type="hidden">
<input name="context" value="40" type="hidden">
Title: <input name="text_title" size="15" maxlength="50" type="text"><input src="SyntaxReference_files/moin-search.png" name="button_title" alt="[?]" type="image"><br>Text: <input name="text_full" size="15" maxlength="50" type="text"><input src="SyntaxReference_files/moin-search.png" name="button_full" alt="[?]" type="image">
</p>
</form>

<pre>#pragma section-numbers off
#acl All:admin,read,write,delete,revert
##language:en
</pre>

This page tries to use each supported markup element at least once.

<pre>'''Index'''
[[TableOfContents(2)]]
</pre>
**Index** 
1. Headers

  1. Header 2
2. Font styles

  1. Syntax Hilighting
3. Smileys
4. Hyperlinks

  1. Internal
  2. External
  3. Escaping WikiNames
5. Blockquote
6. Bullet list
7. Numbered list
8. Decriptions + Definitions
9. Code display
10. Tables

  1. General table layout and HTML like options
  2. Cell width
  3. Spanning rows and columns
  4. Alignment
  5. Colors
  6. CSV Tables
11. Rules
12. Macros

## Headers

### Header 2

#### Header 3

##### Header 4

###### Header 5

## Font styles
<pre>Normal text, ''emphasized'', '''strong''', __underline__ , ,,subscript,,, ^superscript^, `typewriter` and {{{typewriter}}}.
</pre>

Normal text, _emphasized_, **strong** , <u>underline</u>, <sub>subscript</sub>, <sup>superscript</sup>, <tt>typewriter</tt> and <tt>typewriter</tt>.

### Syntax Hilighting

<pre></pre>
<table border="0">
  <tbody>
    <tr>
      <td align="right" valign="top"></td>
      <td align="right" valign="top">
        <pre><font color="#000000" face="Lucida,Courier New"> 1 
  2 
</font></pre>
      </td>
      <td valign="top">
        <pre><font face="Lucida,Courier New"><font color="#008000"># python code
</font><font color="#C00000">print</font> <font color="#000000">code</font><font color="#0000C0">.</font><font color="#000000">colorize</font><font color="#0000C0">(</font><font color="#004080">"abc"</font><font color="#0000C0">,</font> <font color="#0080C0">1</font> <font color="#0000C0">+</font> <font color="#0080C0">1</font><font color="#0000C0">)</font><font color="#000000"></font></font></pre>
      </td>
    </tr>
  </tbody>
</table>


## Smileys

<table>
  <tbody>
    <tr>
      <td>
        <strong>Markup</strong>
      </td>
      <td>
        <strong>Display</strong>
      </td>
      <td>
        <strong>Filename</strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong>Markup</strong>
      </td>
      <td>
        <strong>Display</strong>
      </td>
      <td>
        <strong>Filename</strong>
      </td>
      <td>
        <strong></strong>
      </td>
      <td>
        <strong>Markup</strong>
      </td>
      <td>
        <strong>Display</strong>
      </td>
      <td>
        <strong>Filename</strong>
      </td>
    </tr>
    <tr>
      <td>
        <tt>(!)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/idea.png" alt="(!)" height="15" width="15">
      </td>
      <td>
        <tt>idea.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>(./)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/checkmark.png" alt="(./)" height="15" width="20">
      </td>
      <td>
        <tt>checkmark.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>/!\</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/alert.png" alt="/!\" height="15" width="15">
      </td>
      <td>
        <tt>alert.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>:(</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/sad.png" alt=":(" height="15" width="15">
      </td>
      <td>
        <tt>sad.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile.png" alt=":)" height="15" width="15">
      </td>
      <td>
        <tt>smile.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:))</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile3.png" alt=":))" height="15" width="15">
      </td>
      <td>
        <tt>smile3.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>:-(</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/sad.png" alt=":-(" height="15" width="15">
      </td>
      <td>
        <tt>sad.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:-)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile.png" alt=":-)" height="15" width="15">
      </td>
      <td>
        <tt>smile.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:-))</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile3.png" alt=":-))" height="15" width="15">
      </td>
      <td>
        <tt>smile3.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>:-?</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/tongue.png" alt=":-?" height="15" width="15">
      </td>
      <td>
        <tt>tongue.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:D</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/biggrin.png" alt=":D" height="15" width="15">
      </td>
      <td>
        <tt>biggrin.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>:\</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/ohwell.png" alt=":\" height="15" width="15">
      </td>
      <td>
        <tt>ohwell.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>:o</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/redface.png" alt=":o" height="15" width="15">
      </td>
      <td>
        <tt>redface.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>;)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile4.png" alt=";)" height="15" width="15">
      </td>
      <td>
        <tt>smile4.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>;-)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile4.png" alt=";-)" height="15" width="15">
      </td>
      <td>
        <tt>smile4.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>&lt;!&gt;</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/attention.png" alt="&lt;!&gt;" height="15" width="15">
      </td>
      <td>
        <tt>attention.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>&lt;:(</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/frown.png" alt="&lt;:(" height="15" width="15">
      </td>
      <td>
        <tt>frown.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>&gt;:&gt;</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/devil.png" alt="&gt;:&gt;" height="15" width="15">
      </td>
      <td>
        <tt>devil.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>B)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile2.png" alt="B)" height="15" width="15">
      </td>
      <td>
        <tt>smile2.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>B-)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/smile2.png" alt="B-)" height="15" width="15">
      </td>
      <td>
        <tt>smile2.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>X-(</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/angry.png" alt="X-(" height="15" width="15">
      </td>
      <td>
        <tt>angry.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{1}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/prio1.png" alt="{1}" height="13" width="15">
      </td>
      <td>
        <tt>prio1.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{2}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/prio2.png" alt="{2}" height="13" width="15">
      </td>
      <td>
        <tt>prio2.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{3}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/prio3.png" alt="{3}" height="13" width="15">
      </td>
      <td>
        <tt>prio3.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{OK}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/thumbs-up.png" alt="{OK}" height="12" width="14">
      </td>
      <td>
        <tt>thumbs-up.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{X}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/icon-error.png" alt="{X}" height="16" width="16">
      </td>
      <td>
        <tt>icon-error.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{da}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-da.png" alt="{da}" height="12" width="18">
      </td>
      <td>
        <tt>flag-da.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{de}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-de.png" alt="{de}" height="12" width="18">
      </td>
      <td>
        <tt>flag-de.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{en}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-en.png" alt="{en}" height="12" width="24">
      </td>
      <td>
        <tt>flag-en.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{es}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-es.png" alt="{es}" height="12" width="18">
      </td>
      <td>
        <tt>flag-es.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{fi}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-fi.png" alt="{fi}" height="12" width="18">
      </td>
      <td>
        <tt>flag-fi.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{fr}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-fr.png" alt="{fr}" height="12" width="18">
      </td>
      <td>
        <tt>flag-fr.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{it}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-it.png" alt="{it}" height="12" width="18">
      </td>
      <td>
        <tt>flag-it.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{i}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/icon-info.png" alt="{i}" height="16" width="16">
      </td>
      <td>
        <tt>icon-info.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{ja}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-ja.png" alt="{ja}" height="12" width="18">
      </td>
      <td>
        <tt>flag-ja.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{ko}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-ko.png" alt="{ko}" height="12" width="18">
      </td>
      <td>
        <tt>flag-ko.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{nl}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-nl.png" alt="{nl}" height="12" width="18">
      </td>
      <td>
        <tt>flag-nl.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{pt}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-pt.png" alt="{pt}" height="12" width="18">
      </td>
      <td>
        <tt>flag-pt.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{sv}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-sv.png" alt="{sv}" height="12" width="18">
      </td>
      <td>
        <tt>flag-sv.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>{us}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-us.png" alt="{us}" height="12" width="20">
      </td>
      <td>
        <tt>flag-us.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>{zh}</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/flag-zh.png" alt="{zh}" height="12" width="18">
      </td>
      <td>
        <tt>flag-zh.png</tt>
      </td>
      <td>
      </td>
      <td>
        <tt>|)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/tired.png" alt="|)" height="15" width="15">
      </td>
      <td>
        <tt>tired.png</tt>
      </td>
    </tr>
    <tr>
      <td>
        <tt>|-)</tt>
      </td>
      <td>
        <img src="SyntaxReference_files/tired.png" alt="|-)" height="15" width="15">
      </td>
      <td>
        <tt>tired.png</tt>
      </td>
      <td>
      </td>
      <td>
         </td>
      <td>
         </td>
      <td>
         </td>
      <td>
         </td>
      <td>
         </td>
      <td>
         </td>
      <td>
         </td>
    </tr>
  </tbody>
</table>


## Hyperlinks

### Internal
<pre> * MoinMoin
 * MoinMoin/TextFormatting
 * MoinMoin/InstallDocs 
 * ../InstallDocs 
 * /SubPage
 * Self:InterWiki
</pre>
- [MoinMoin](http://dublincore.org/accessibilitywiki/MoinMoin)

- [MoinMoin/TextFormatting](http://dublincore.org/accessibilitywiki/MoinMoin_2fTextFormatting)

- [MoinMoin/InstallDocs](http://dublincore.org/accessibilitywiki/MoinMoin_2fInstallDocs)

- [../InstallDocs](http://dublincore.org/accessibilitywiki/InstallDocs)

- [/SubPage](http://dublincore.org/accessibilitywiki/SyntaxReference_2fSubPage)

- [<img src="SyntaxReference_files/moin-inter.png" alt="[Self]" height="16" width="16">InterWiki](http://dublincore.org/accessibilitywiki/InterWiki "Self")

<pre>[#anchorname Anchor Link]
</pre>
Anchor Link 
### External
<pre> * http://moin.sourceforge.net/
 * [http://moin.sourceforge.net/]
 * [http://moin.sourceforge.net/ MoinMoin Sourceforge Homepage]
 * [^http://moin.sourceforge.net/ MoinMoin Sourceforge Homepage - in new window]
 * [http://moin.sourceforge.net/moinmoin.gif]
 * http://moin.sourceforge.net/moinmoin.gif
 * [http://moin.sourceforge.net/moinmoin.gif moinmoin.gif]
 * MeatBall:InterWiki
 * wiki:MeatBall/InterWiki
 * [wiki:MeatBall/InterWiki]
 * [wiki:MeatBall/InterWiki InterWiki page on MeatBall]
 * [file://servername/full/path/to/file/filename%20with%20spaces.txt Click here to read filename with spaces.txt]
 * jh@web.de
</pre>
- [http://moin.sourceforge.net/](http://moin.sourceforge.net/)

- [<img src="SyntaxReference_files/moin-www.png" alt="[WWW]" height="11" width="11">http://moin.sourceforge.net/](http://moin.sourceforge.net/)

- [<img src="SyntaxReference_files/moin-www.png" alt="[WWW]" height="11" width="11">MoinMoin Sourceforge Homepage](http://moin.sourceforge.net/)

- [^ [http://moin.sourceforge.net/](http://moin.sourceforge.net/) [MoinMoin](http://dublincore.org/accessibilitywiki/MoinMoin) Sourceforge Homepage - in new window]

- [<img src="SyntaxReference_files/moinmoin.html" alt="http://moin.sourceforge.net/moinmoin.gif" title="http://moin.sourceforge.net/moinmoin.gif">](http://moin.sourceforge.net/moinmoin.gif)

- <img src="SyntaxReference_files/moinmoin.html" alt="http://moin.sourceforge.net/moinmoin.gif">

- [<img src="SyntaxReference_files/moin-www.png" alt="[WWW]" height="11" width="11">moinmoin.gif](http://moin.sourceforge.net/moinmoin.gif)

- [<img src="SyntaxReference_files/moin-inter.png" alt="[MeatBall]" height="16" width="16">InterWiki](http://www.usemod.com/cgi-bin/mb.pl?InterWiki "MeatBall")

- [<img src="SyntaxReference_files/moin-inter.png" alt="[MeatBall]" height="16" width="16">InterWiki](http://www.usemod.com/cgi-bin/mb.pl?InterWiki "MeatBall")

- [<img src="SyntaxReference_files/moin-inter.png" alt="[MeatBall]" height="16" width="16">wiki:MeatBall/InterWiki](http://www.usemod.com/cgi-bin/mb.pl?InterWiki "MeatBall")

- [<img src="SyntaxReference_files/moin-inter.png" alt="[MeatBall]" height="16" width="16">InterWiki page on MeatBall](http://www.usemod.com/cgi-bin/mb.pl?InterWiki "MeatBall")

- [<img src="SyntaxReference_files/moin-ftp.png" alt="[FILE]" height="11" width="11">Click here to read filename with spaces.txt](file:///full/path/to/file/filename%20with%20spaces.txt)

- [jh@web.de](mailto:jh@web.de)

### Escaping WikiNames
<pre>Wiki''''''Name
Wiki``Name
</pre>WikiName WikiName 
## Blockquote
<pre> This is indented
  Even more
</pre>
 This is indented 
 Even more 
## Bullet list
<pre> * item 1

 * item 2, with gap
 * item 3
   * item 3.1
</pre>
- item 1

- item 2, with gap

- item 3

  - item 3.1

## Numbered list
<pre> 1. item 1
   i. item 1
   i. item 2
</pre>
1. 

item 1

  1. 

item 1

  2. 

item 2

<pre> 1. item 2
   a. item 1
   a. item 2
</pre>
1. 

item 2

  1. 

item 1

  2. 

item 2

## Decriptions + Definitions
<pre> Term:: Decription
 Label:: Definition
</pre><dl>

    <dt> Term</dt>
<dd>
<p>
Decription 
</p>
</dd>
    <dt> Label</dt>
<dd>
<p>
Definition 
</p>
</dd>

    </dl>

## Code display

<pre>line 1
    indented 4 characters
</pre>
## Tables

### General table layout and HTML like options
<pre> ||||||&lt;tablewidth="80%"&gt;'''Heading'''||
 ||cell 1||cell2||cell 3||
 ||&lt;rowspan=2&gt; spanning rows||||&lt;bgcolor='#E0E0FF'&gt; spanning 2 columns||
 ||&lt;rowbgcolor="#FFFFE0"&gt;cell2||cell 3||
</pre>

<table width="80%">
  <tbody>
    <tr>
      <td colspan="3" align="center">
        <strong>Heading</strong>
      </td>
    </tr>
    <tr>
      <td>
        cell 1</td>
      <td>
        cell2</td>
      <td>
        cell 3</td>
    </tr>
    <tr>
      <td rowspan="2">
        spanning rows</td>
      <td colspan="2" align="center" bgcolor="#E0E0FF">
        spanning 2 columns</td>
    </tr>
    <tr bgcolor="#FFFFE0">
      <td>
        cell2</td>
      <td>
        cell 3</td>
    </tr>
  </tbody>
</table>


### Cell width
<pre> || narrow ||&lt;:99%&gt; wide ||
</pre>

<table>
  <tbody>
    <tr>
      <td>
        narrow </td>
      <td align="center" width="99%">
        wide </td>
    </tr>
  </tbody>
</table>


### Spanning rows and columns
<pre> ||&lt;|2&gt; 2 rows || row 1 ||
 || row 2 ||
 ||&lt;-2&gt; row 3 over 2 columns ||
</pre>

<table>
  <tbody>
    <tr>
      <td colspan="1" rowspan="2" align="center">
        2 rows </td>
      <td>
        row 1 </td>
    </tr>
    <tr>
      <td>
        row 2 </td>
    </tr>
    <tr>
      <td colspan="2">
        row 3 over 2 columns </td>
    </tr>
  </tbody>
</table>


### Alignment
<pre> ||&lt;(&gt; left ||&lt;^|3&gt; top ||&lt;v|3&gt; bottom ||
 ||&lt;:&gt; centered ||
 ||&lt;)&gt; right ||
</pre>

<table>
  <tbody>
    <tr>
      <td align="left">
        left </td>
      <td colspan="1" rowspan="3" align="center" valign="top">
        top </td>
      <td colspan="1" rowspan="3" align="center" valign="bottom">
        bottom </td>
    </tr>
    <tr>
      <td align="center">
        centered </td>
    </tr>
    <tr>
      <td align="right">
        right </td>
    </tr>
  </tbody>
</table>


### Colors
<pre> ||&lt;#FF8080&gt; red ||&lt;#80FF80&gt; green ||&lt;#8080FF&gt; blue ||
</pre>

<table>
  <tbody>
    <tr>
      <td bgcolor="#FF8080">
        red </td>
      <td bgcolor="#80FF80">
        green </td>
      <td bgcolor="#8080FF">
        blue </td>
    </tr>
  </tbody>
</table>


### CSV Tables

<table>
  <tbody>
    <tr>
      <td>
        <strong>Col1</strong>
      </td>
      <td>
        <strong>Col3</strong>
      </td>
      <td>
        <strong>Col4</strong>
      </td>
    </tr>
    <tr>
      <td>
        1</td>
      <td>
        3</td>
      <td>
        4</td>
    </tr>
    <tr>
      <td>
        a</td>
      <td>
        c</td>
      <td>
        d</td>
    </tr>
  </tbody>
</table>


<table>
  <tbody>
    <tr>
      <td>
        <strong>Col1</strong>
      </td>
      <td>
        <strong>Col3</strong>
      </td>
      <td>
        <strong>Col4</strong>
      </td>
    </tr>
    <tr>
      <td>
        1</td>
      <td>
        3</td>
      <td>
        4</td>
    </tr>
    <tr>
      <td>
        a</td>
      <td>
        c</td>
      <td>
        d</td>
    </tr>
  </tbody>
</table>


## Rules
<pre>--- (not a rule)
----
-----
------
-------
--------
---------
----------
-------------------------------------------- (not thicker than 10)
</pre>--- (not a rule) 
* * *

* * *

* * *

* * *

* * *

* * *

* * *

* * *
 (not thicker than 10) 
## Macros
<pre>[[Anchor(anchorname)]]
'''[[PageCount]]''' pages
[[RandomPage]]
</pre>
<a id="anchorname"></a> **491** pages [CancoreAccessForAllMetadataGuidelines/alternative/DiscussAlternative](http://dublincore.org/accessibilitywiki/CancoreAccessForAllMetadataGuidelines_2falternative_2fDiscussAlternative) 

 [RefreshCache](http://dublincore.org/accessibilitywiki/SyntaxReference?action=refresh&arena=Page.py&key=SyntaxReference.text_html) for this page (cached 2012-12-26 02:12:43)  

Immutable page (last modified 2008-07-02 05:47:03)


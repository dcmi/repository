<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="languages">
	<xsl:param name="language" select="''"/>

<select name="language">
   <xsl:choose>
      <xsl:when test="$language='aa'">
         <option selected="selected" value="aa">aa</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="aa">aa</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ab'">
         <option selected="selected" value="ab">ab</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ab">ab</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='af'">
         <option selected="selected" value="af">af</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="af">af</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='am'">
         <option selected="selected" value="am">am</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="am">am</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ar'">
         <option selected="selected" value="ar">ar</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ar">ar</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='as'">
         <option selected="selected" value="as">as</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="as">as</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ay'">
         <option selected="selected" value="ay">ay</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ay">ay</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='az'">
         <option selected="selected" value="az">az</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="az">az</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ba'">
         <option selected="selected" value="ba">ba</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ba">ba</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='be'">
         <option selected="selected" value="be">be</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="be">be</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='bg'">
         <option selected="selected" value="bg">bg</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="bg">bg</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='bh'">
         <option selected="selected" value="bh">bh</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="bh">bh</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='bi'">
         <option selected="selected" value="bi">bi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="bi">bi</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='bn'">
         <option selected="selected" value="bn">bn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="bn">bn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='bo'">
         <option selected="selected" value="bo">bo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="bo">bo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='br'">
         <option selected="selected" value="br">br</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="br">br</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ca'">
         <option selected="selected" value="ca">ca</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ca">ca</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='co'">
         <option selected="selected" value="co">co</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="co">co</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='cs'">
         <option selected="selected" value="cs">cs</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="cs">cs</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='cy'">
         <option selected="selected" value="cy">cy</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="cy">cy</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='da'">
         <option selected="selected" value="da">da</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="da">da</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='de'">
         <option selected="selected" value="de">de</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="de">de</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='dz'">
         <option selected="selected" value="dz">dz</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="dz">dz</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='el'">
         <option selected="selected" value="el">el</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="el">el</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='en'">
         <option selected="selected" value="en">en</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="en">en</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='eo'">
         <option selected="selected" value="eo">eo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="eo">eo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='es'">
         <option selected="selected" value="es">es</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="es">es</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='et'">
         <option selected="selected" value="et">et</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="et">et</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='eu'">
         <option selected="selected" value="eu">eu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="eu">eu</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fa'">
         <option selected="selected" value="fa">fa</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fa">fa</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fi'">
         <option selected="selected" value="fi">fi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fi">fi</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fj'">
         <option selected="selected" value="fj">fj</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fj">fj</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fo'">
         <option selected="selected" value="fo">fo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fo">fo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fr'">
         <option selected="selected" value="fr">fr</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fr">fr</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='fy'">
         <option selected="selected" value="fy">fy</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fy">fy</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ga'">
         <option selected="selected" value="ga">ga</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ga">ga</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='gd'">
         <option selected="selected" value="gd">gd</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="gd">gd</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='gl'">
         <option selected="selected" value="gl">gl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="gl">gl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='gn'">
         <option selected="selected" value="gn">gn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="gn">gn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='gu'">
         <option selected="selected" value="gu">gu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="gu">gu</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='he'">
         <option selected="selected" value="he">he</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="he">he</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ha'">
         <option selected="selected" value="ha">ha</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ha">ha</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='hi'">
         <option selected="selected" value="hi">hi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="hi">hi</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='hr'">
         <option selected="selected" value="hr">hr</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="hr">hr</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='hu'">
         <option selected="selected" value="hu">hu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="hu">hu</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='hy'">
         <option selected="selected" value="hy">hy</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="hy">hy</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ia'">
         <option selected="selected" value="ia">ia</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ia">ia</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='id'">
         <option selected="selected" value="id">id</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="id">id</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ie'">
         <option selected="selected" value="ie">ie</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ie">ie</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ik'">
         <option selected="selected" value="ik">ik</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ik">ik</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='in'">
         <option selected="selected" value="in">in</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="in">in</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='is'">
         <option selected="selected" value="is">is</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="is">is</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='it'">
         <option selected="selected" value="it">it</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="it">it</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='iu'">
         <option selected="selected" value="iu">iu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="iu">iu</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='iw'">
         <option selected="selected" value="iw">iw</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="iw">iw</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ja'">
         <option selected="selected" value="ja">ja</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ja">ja</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ji'">
         <option selected="selected" value="ji">ji</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ji">ji</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='jw'">
         <option selected="selected" value="jw">jw</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="jw">jw</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ka'">
         <option selected="selected" value="ka">ka</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ka">ka</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='kk'">
         <option selected="selected" value="kk">kk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="kk">kk</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='kl'">
         <option selected="selected" value="kl">kl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="kl">kl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='km'">
         <option selected="selected" value="km">km</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="km">km</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='kn'">
         <option selected="selected" value="kn">kn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="kn">kn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ko'">
         <option selected="selected" value="ko">ko</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ko">ko</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ks'">
         <option selected="selected" value="ks">ks</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ks">ks</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ku'">
         <option selected="selected" value="ku">ku</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ku">ku</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ky'">
         <option selected="selected" value="ky">ky</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ky">ky</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='la'">
         <option selected="selected" value="la">la</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="la">la</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ln'">
         <option selected="selected" value="ln">ln</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ln">ln</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='lo'">
         <option selected="selected" value="lo">lo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="lo">lo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='lt'">
         <option selected="selected" value="lt">lt</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="lt">lt</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='lv'">
         <option selected="selected" value="lv">lv</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="lv">lv</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mg'">
         <option selected="selected" value="mg">mg</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mg">mg</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mi'">
         <option selected="selected" value="mi">mi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mi">mi</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mk'">
         <option selected="selected" value="mk">mk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mk">mk</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ml'">
         <option selected="selected" value="ml">ml</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ml">ml</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mn'">
         <option selected="selected" value="mn">mn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mn">mn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mo'">
         <option selected="selected" value="mo">mo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mo">mo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mr'">
         <option selected="selected" value="mr">mr</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mr">mr</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ms'">
         <option selected="selected" value="ms">ms</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ms">ms</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='mt'">
         <option selected="selected" value="mt">mt</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mt">mt</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='my'">
         <option selected="selected" value="my">my</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="my">my</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='na'">
         <option selected="selected" value="na">na</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="na">na</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ne'">
         <option selected="selected" value="ne">ne</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ne">ne</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='nl'">
         <option selected="selected" value="nl">nl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="nl">nl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='no'">
         <option selected="selected" value="no">no</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="no">no</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='oc'">
         <option selected="selected" value="oc">oc</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="oc">oc</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='om'">
         <option selected="selected" value="om">om</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="om">om</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='or'">
         <option selected="selected" value="or">or</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="or">or</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='pa'">
         <option selected="selected" value="pa">pa</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="pa">pa</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='pl'">
         <option selected="selected" value="pl">pl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="pl">pl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ps'">
         <option selected="selected" value="ps">ps</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ps">ps</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='pt'">
         <option selected="selected" value="pt">pt</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="pt">pt</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='qu'">
         <option selected="selected" value="qu">qu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="qu">qu</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='rm'">
         <option selected="selected" value="rm">rm</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="rm">rm</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='rn'">
         <option selected="selected" value="rn">rn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="rn">rn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ro'">
         <option selected="selected" value="ro">ro</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ro">ro</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ru'">
         <option selected="selected" value="ru">ru</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ru">ru</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='rw'">
         <option selected="selected" value="rw">rw</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="rw">rw</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sa'">
         <option selected="selected" value="sa">sa</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sa">sa</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sd'">
         <option selected="selected" value="sd">sd</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sd">sd</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sg'">
         <option selected="selected" value="sg">sg</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sg">sg</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sh'">
         <option selected="selected" value="sh">sh</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sh">sh</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='si'">
         <option selected="selected" value="si">si</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="si">si</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sk'">
         <option selected="selected" value="sk">sk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sk">sk</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sl'">
         <option selected="selected" value="sl">sl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sl">sl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sm'">
         <option selected="selected" value="sm">sm</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sm">sm</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sn'">
         <option selected="selected" value="sn">sn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sn">sn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='so'">
         <option selected="selected" value="so">so</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="so">so</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sq'">
         <option selected="selected" value="sq">sq</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sq">sq</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sr'">
         <option selected="selected" value="sr">sr</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sr">sr</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ss'">
         <option selected="selected" value="ss">ss</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ss">ss</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='st'">
         <option selected="selected" value="st">st</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="st">st</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='su'">
         <option selected="selected" value="su">su</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="su">su</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sv'">
         <option selected="selected" value="sv">sv</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sv">sv</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='sw'">
         <option selected="selected" value="sw">sw</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sw">sw</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ta'">
         <option selected="selected" value="ta">ta</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ta">ta</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='te'">
         <option selected="selected" value="te">te</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="te">te</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tg'">
         <option selected="selected" value="tg">tg</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tg">tg</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='th'">
         <option selected="selected" value="th">th</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="th">th</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ti'">
         <option selected="selected" value="ti">ti</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ti">ti</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tk'">
         <option selected="selected" value="tk">tk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tk">tk</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tl'">
         <option selected="selected" value="tl">tl</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tl">tl</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tn'">
         <option selected="selected" value="tn">tn</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tn">tn</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='to'">
         <option selected="selected" value="to">to</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="to">to</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tr'">
         <option selected="selected" value="tr">tr</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tr">tr</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ts'">
         <option selected="selected" value="ts">ts</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ts">ts</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tt'">
         <option selected="selected" value="tt">tt</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tt">tt</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='tw'">
         <option selected="selected" value="tw">tw</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="tw">tw</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ug'">
         <option selected="selected" value="ug">ug</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ug">ug</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='uk'">
         <option selected="selected" value="uk">uk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="uk">uk</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='ur'">
         <option selected="selected" value="ur">ur</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ur">ur</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='uz'">
         <option selected="selected" value="uz">uz</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="uz">uz</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='vi'">
         <option selected="selected" value="vi">vi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="vi">vi</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='vo'">
         <option selected="selected" value="vo">vo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="vo">vo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='wo'">
         <option selected="selected" value="wo">wo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="wo">wo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='xh'">
         <option selected="selected" value="xh">xh</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="xh">xh</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='yo'">
         <option selected="selected" value="yo">yo</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="yo">yo</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='za'">
         <option selected="selected" value="za">za</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="za">za</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='zh'">
         <option selected="selected" value="zh">zh</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="zh">zh</option>
      </xsl:otherwise>
   </xsl:choose>
   <xsl:choose>
      <xsl:when test="$language='zu'">
         <option selected="selected" value="zu">zu</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="zu">zu</option>
      </xsl:otherwise>
   </xsl:choose>
</select>

</xsl:template>

</xsl:stylesheet>

<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="getSupportedLanguages">
	<xsl:param name="language" select="''"/>

<select name="languageOpts">

   <xsl:choose>
      <xsl:when test="$language='ar-SA'">
      	<option value="ar-SA,ar-SA" selected="selected">&#x0627;&#x0644;&#x0639;&#x0631;&#x0628;&#x064a;&#x0629; &#x0627;&#x0644;&#x0646;&#x0633;&#x062e;&#x0629;/&#x0639;&#x0631;&#x0628;&#x064a;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ar-SA,ar-SA">&#x0627;&#x0644;&#x0639;&#x0631;&#x0628;&#x064a;&#x0629; &#x0627;&#x0644;&#x0646;&#x0633;&#x062e;&#x0629;/&#x0639;&#x0631;&#x0628;&#x064a;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='ca-ES'">
         <option value="ca-ES,ca-ES" selected="selected">Castellano</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ca-ES,ca-ES">Castellano</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='cs-CZ'">
         <option value="cs-CZ,cs-CZ" selected="selected">&#x010c;esky</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="cs-CZ,cs-CZ">&#x010c;esky</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='cy-GB'">
         <option value="en-US,cy-GB" selected="selected">Cymraeg</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="en-US,cy-GB">Cymraeg</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='da-DK'">
         <option value="en-US,da-DK" selected="selected">Dansk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="en-US,da-DK">Dansk</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='de-DE'">
         <option value="de-DE,de-DE" selected="selected">Deutsch</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="de-DE,de-DE">Deutsch</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='el-GR'">
         <option value="el-GR,el-GR" selected="selected">&#x0395;&#x03bb;&#x03bb;&#x03b7;&#x03bd;&#x03b9;&#x03ba;&#x03ac;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="el-GR,el-GR">&#x0395;&#x03bb;&#x03bb;&#x03b7;&#x03bd;&#x03b9;&#x03ba;&#x03ac;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='en-US'">
         <option value="en-US,en-US" selected="selected">English</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="en-US,en-US">English</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='es-ES'">
         <option value="es-ES,es-ES" selected="selected">Espa&#x00f1;ol</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="es-ES,es-ES">Espa&#x00f1;ol</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='fi-FI'">
         <option value="fi-FI,fi-FI" selected="selected">Suomeksi</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fi-FI,fi-FI">Suomeksi</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='fr-FR'">
         <option value="fr-FR,fr-FR" selected="selected">Fran&#x00e7;ais</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="fr-FR,fr-FR">Fran&#x00e7;ais</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='it-IT'">
         <option value="it-IT,it-IT" selected="selected">Italiano</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="it-IT,it-IT">Italiano</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='ja-JP'">
         <option value="ja-JP,ja-JP" selected="selected">&#x65e5;&#x672c;&#x8a9e;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ja-JP,ja-JP">&#x65e5;&#x672c;&#x8a9e;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='ko-KR'">
         <option value="ko-KR,ko-KR" selected="selected">&#xd55c;&#xad6d;&#xc5b4;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ko-KR,ko-KR">&#xd55c;&#xad6d;&#xc5b4;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='mr-IN'">
         <option value="mr-IN,mr-IN" selected="selected">&#x092e;&#x0930;&#x093e;&#x0920;&#x0940;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="mr-IN,mr-IN">&#x092e;&#x0930;&#x093e;&#x0920;&#x0940;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='no-NO'">
         <option value="en-US,no-NO" selected="selected">Norsk</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="en-US,no-NO">Norsk</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='pl-PL'">
         <option value="pl-PL,pl-PL" selected="selected">Polski</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="pl-PL,pl-PL">Polski</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='pt-PT'">
         <option value="pt-PT,pt-PT" selected="selected">Portugu&#x00ea;s</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="pt-PT,pt-PT">Portugu&#x00ea;s</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='ru-RU'">
         <option value="ru-RU,ru-RU" selected="selected">&#x0420;&#x0443;&#x0441;&#x0441;&#x043a;&#x0438;&#x0439;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="ru-RU,ru-RU">&#x0420;&#x0443;&#x0441;&#x0441;&#x043a;&#x0438;&#x0439;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='sv-SE'">
         <option value="sv-SE,sv-SE" selected="selected">Svenska</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="sv-SE,sv-SE">Svenska</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='th-TH'">
         <option value="th-TH,th-TH" selected="selected">&#x0e44;&#x0e17;&#x0e22;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="th-TH,th-TH">&#x0e44;&#x0e17;&#x0e22;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='uk-UA'">
         <option value="uk-UA,uk-UA" selected="selected">&#x0443;&#x043a;&#x0440;&#x0430;&#x0457;&#x043d;&#x0441;&#x044c;&#x043a;&#x0430;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="uk-UA,uk-UA">&#x0443;&#x043a;&#x0440;&#x0430;&#x0457;&#x043d;&#x0441;&#x044c;&#x043a;&#x0430;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='zh-CN'">
         <option value="zh-CN,zh-CN" selected="selected">&#x7b80;&#x4f53;&#x4e2d;&#x6587;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="zh-CN,zh-CN">&#x7b80;&#x4f53;&#x4e2d;&#x6587;</option>
      </xsl:otherwise>
   </xsl:choose>
   
   <xsl:choose>
      <xsl:when test="$language='zh-TW'">
         <option value="zh-TW,zh-TW" selected="selected">&#x7e41;&#x9ad4;&#x4e2d;&#x6587;</option>
      </xsl:when>
      <xsl:otherwise>
         <option value="zh-TW,zh-TW">&#x7e41;&#x9ad4;&#x4e2d;&#x6587;</option>
      </xsl:otherwise>
   </xsl:choose>
 
</select>

</xsl:template>

</xsl:stylesheet>

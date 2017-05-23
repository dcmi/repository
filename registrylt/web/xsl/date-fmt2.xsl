<?xml version='1.0' encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"	
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 

<xsl:template name="date-fmt2">
	<xsl:param name="bYear" select="''"/>
	<xsl:param name="bMonth" select="''"/>
	<xsl:param name="bDay" select="''"/>

<select name="bYear">
	<xsl:choose>
		<xsl:when test="$bYear='2000'"> 
			<option selected="selected" value="2000">2000</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2000">2000</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2001'"> 
			<option selected="selected" value="2001">2001</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2001">2001</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2002'"> 
			<option selected="selected" value="2002">2002</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2002">2002</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2003'"> 
			<option selected="selected" value="2003">2003</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2003">2003</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2004'"> 
			<option selected="selected" value="2004">2004</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2004">2004</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2005'"> 
			<option selected="selected" value="2005">2005</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2005">2005</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2006'"> 
			<option selected="selected" value="2006">2006</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2006">2006</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2007'"> 
			<option selected="selected" value="2007">2007</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2007">2007</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2008'"> 
			<option selected="selected" value="2008">2008</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2008">2008</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2009'"> 
			<option selected="selected" value="2009">2009</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2009">2009</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2010'"> 
			<option selected="selected" value="2010">2010</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2010">2010</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2011'"> 
			<option selected="selected" value="2011">2011</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2011">2011</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2012'"> 
			<option selected="selected" value="2012">2012</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2012">2012</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2013'"> 
			<option selected="selected" value="2013">2013</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2013">2013</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bYear='2014'"> 
			<option selected="selected" value="2014">2014</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="2014">2014</option>
		</xsl:otherwise>
	</xsl:choose>	
</select> -
<select name="bMonth">
	<xsl:choose>
		<xsl:when test="$bMonth='01'"> 
			<option selected="selected" value="01">01</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="01">01</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='02'"> 
			<option selected="selected" value="02">02</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="02">02</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='03'"> 
			<option selected="selected" value="03">03</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="03">03</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='04'"> 
			<option selected="selected" value="04">04</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="04">04</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='05'"> 
			<option selected="selected" value="05">05</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="05">05</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='06'"> 
			<option selected="selected" value="06">06</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="06">06</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='07'"> 
			<option selected="selected" value="07">07</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="07">07</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='08'"> 
			<option selected="selected" value="08">08</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="08">08</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='09'"> 
			<option selected="selected" value="09">09</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="09">09</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='10'"> 
			<option selected="selected" value="10">10</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="10">10</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='11'"> 
			<option selected="selected" value="11">11</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="11">11</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bMonth='12'"> 
			<option selected="selected" value="12">12</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="12">12</option>
		</xsl:otherwise>
	</xsl:choose>		
</select> -
<select name="bDay">			
	<xsl:choose>
		<xsl:when test="$bDay='01'"> 
			<option selected="selected" value="01">01</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="01">01</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='02'"> 
			<option selected="selected" value="02">02</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="02">02</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='03'"> 
			<option selected="selected" value="03">03</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="03">03</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='04'"> 
			<option selected="selected" value="04">04</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="04">04</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='05'"> 
			<option selected="selected" value="05">05</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="05">05</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='06'"> 
			<option selected="selected" value="06">06</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="06">06</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='07'"> 
			<option selected="selected" value="07">07</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="07">07</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='08'"> 
			<option selected="selected" value="08">08</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="08">08</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='09'"> 
			<option selected="selected" value="09">09</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="09">09</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='10'"> 
			<option selected="selected" value="10">10</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="10">10</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='11'"> 
			<option selected="selected" value="11">11</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="11">11</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='12'"> 
			<option selected="selected" value="12">12</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="12">12</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='13'"> 
			<option selected="selected" value="13">13</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="13">13</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='14'"> 
			<option selected="selected" value="14">14</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="14">14</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='15'"> 
			<option selected="selected" value="15">15</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="15">15</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='16'"> 
			<option selected="selected" value="16">16</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="16">16</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='17'"> 
			<option selected="selected" value="17">17</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="17">17</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='18'"> 
			<option selected="selected" value="18">18</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="18">18</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='19'"> 
			<option selected="selected" value="19">19</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="19">19</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='20'"> 
			<option selected="selected" value="20">20</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="20">20</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='21'"> 
			<option selected="selected" value="21">21</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="21">21</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='22'"> 
			<option selected="selected" value="22">22</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="22">22</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='23'"> 
			<option selected="selected" value="23">23</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="23">23</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='24'"> 
			<option selected="selected" value="24">24</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="24">24</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='25'"> 
			<option selected="selected" value="25">25</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="25">25</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='26'"> 
			<option selected="selected" value="26">26</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="26">26</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='27'"> 
			<option selected="selected" value="27">27</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="27">27</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='28'"> 
			<option selected="selected" value="28">28</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="28">28</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='29'"> 
			<option selected="selected" value="29">29</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="29">29</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='30'"> 
			<option selected="selected" value="30">30</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="30">30</option>
		</xsl:otherwise>
	</xsl:choose>
	<xsl:choose>
		<xsl:when test="$bDay='31'"> 
			<option selected="selected" value="31">31</option>
		</xsl:when>
		<xsl:otherwise>
			<option value="31">31</option>
		</xsl:otherwise>
	</xsl:choose>
</select>

</xsl:template>

</xsl:stylesheet>

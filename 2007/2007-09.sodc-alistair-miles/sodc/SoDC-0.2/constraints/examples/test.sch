<?xml version="1.0" encoding="UTF-8"?>
<sch:schema xmlns:sch="http://www.ascc.net/xml/schematron" xmlns:cl="http://purl.org/net/sodc/cl">
   <sch:ns uri="http://purl.org/net/sodc/xml" prefix="sodc"/>
   <sch:pattern name="test constraints">
      <sch:rule context="//sodc:resource[sodc:profile='http://example.com/profile/test#foo']"><!-- exact cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://example.com/property#a']) = 1">The subject does not have exactly 1 property with URI http://example.com/property#a</sch:assert><!-- maximum cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://example.com/property#b']) &lt;= 1">The subject does not have 1 or less properties with URI http://example.com/property#b</sch:assert><!-- minimum cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://example.com/property#c']) &gt;= 1">The subject does not have 1 or more properties with URI http://example.com/property#c</sch:assert><!-- URI-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://example.com/property#d']/sodc:value/sodc:uri">The subject does not have only URI values for property with URI http://example.com/property#d</sch:assert><!-- Nodeid-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://example.com/property#e']/sodc:value/sodc:nodeid">The subject does not have only blank node values for property with URI http://example.com/property#e</sch:assert><!-- Plain literal-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://example.com/property#f']/sodc:value/sodc:plainliteral">The subject does not have only plain literal values for property with URI http://example.com/property#f</sch:assert><!-- Plain literal-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://example.com/property#g']/sodc:value/sodc:plainliteral[@lang]">The subject does not have only plain literal values with language tags for property with URI http://example.com/property#g</sch:assert>
      </sch:rule>
   </sch:pattern>
</sch:schema>
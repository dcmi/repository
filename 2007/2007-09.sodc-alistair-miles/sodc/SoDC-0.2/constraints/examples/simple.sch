<?xml version="1.0" encoding="UTF-8"?>
<sch:schema xmlns:sch="http://www.ascc.net/xml/schematron" xmlns:cl="http://purl.org/net/sodc/cl">
   <sch:ns uri="http://purl.org/net/sodc/xml" prefix="sodc"/>
   <sch:pattern name="simple constraints">
      <sch:rule context="//sodc:resource[sodc:profile='http://example.com/profile/simple#book']"><!-- exact cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://purl.org/dc/elements/1.1/title']) = 1">The subject does not have exactly 1 property with URI http://purl.org/dc/elements/1.1/title</sch:assert><!-- Plain literal-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://purl.org/dc/elements/1.1/title']/sodc:value/sodc:plainliteral">The subject does not have only plain literal values for property with URI http://purl.org/dc/elements/1.1/title</sch:assert><!-- minimum cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://purl.org/dc/elements/1.1/creator']) &gt;= 1">The subject does not have 1 or more properties with URI http://purl.org/dc/elements/1.1/creator</sch:assert><!-- URI-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://purl.org/dc/elements/1.1/creator']/sodc:value/sodc:uri">The subject does not have only URI values for property with URI http://purl.org/dc/elements/1.1/creator</sch:assert>
      </sch:rule>
      <sch:rule context="//sodc:resource[sodc:profile='http://example.com/profile/simple#person']"><!-- minimum cardinality constraint -->
         <sch:assert subject="." test="count(sodc:property[@uri='http://xmlns.com/foaf/0.1/name']) &gt;= 1">The subject does not have 1 or more properties with URI http://xmlns.com/foaf/0.1/name</sch:assert><!-- Plain literal-only value constraint -->
         <sch:assert subject="." test="sodc:property[@uri='http://xmlns.com/foaf/0.1/name']/sodc:value/sodc:plainliteral">The subject does not have only plain literal values for property with URI http://xmlns.com/foaf/0.1/name</sch:assert>
      </sch:rule>
   </sch:pattern>
</sch:schema>
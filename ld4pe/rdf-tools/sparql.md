

#### Return the number of records created/modified on a given day (6-17-15):
```` 
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT COUNT(?s) as ?totalRecords {
 ?s rdf:type <http://schema.org/CreativeWork>;
   dcterms:created ?date.
 FILTER (?date > "2015-06-17"^^xsd:date)
 FILTER (?date < "2015-06-18"^^xsd:date)
}
````
[View Results as JSON](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+COUNT%28%3Fs%29+as+%3FtotalRecords+%7B%0D%0A+%3Fs+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++dcterms%3Acreated+%3Fdate.%0D%0A+FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A+FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D&output=json "Return the number of records created/modified on a given day - 6-17-15")

[View Results as HTML](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+COUNT%28%3Fs%29+as+%3FtotalRecords+%7B%0D%0A+%3Fs+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++dcterms%3Acreated+%3Fdate.%0D%0A+FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A+FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D&output=htmltab "Return the number of records created/modified on a given day - 6-17-15")

#### Get the first 50 record url's created/modified on 6-17-15.
````
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT distinct ?url ?date WHERE {
  ?url rdf:type <http://schema.org/CreativeWork>;
     dcterms:created ?date.
  FILTER (?date > "2015-06-17"^^xsd:date)
  FILTER (?date < "2015-06-18"^^xsd:date)
}
ORDER BY DESC(?date)
LIMIT 50
OFFSET 0
````
[View Results as JSON](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+distinct+%3Furl+%3Fdate+WHERE+%7B%0D%0A++%3Furl+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++++dcterms%3Acreated+%3Fdate.%0D%0A++FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A++FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D%0D%0AORDER+BY+DESC%28%3Fdate%29%0D%0ALIMIT+50%0D%0AOFFSET+0&output=json "Get the first 50 record url's created/modified on 6-17-15")

[View Results as HTML](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+distinct+%3Furl+%3Fdate+WHERE+%7B%0D%0A++%3Furl+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++++dcterms%3Acreated+%3Fdate.%0D%0A++FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A++FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D%0D%0AORDER+BY+DESC%28%3Fdate%29%0D%0ALIMIT+50%0D%0AOFFSET+0&output=htmltab "Get the first 50 record url's created/modified on 6-17-15")

#### Find the next 50 record url's created/modified on 6-17-15
````
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT distinct ?url ?date WHERE {
  ?url rdf:type <http://schema.org/CreativeWork>;
     dcterms:created ?date.
  FILTER (?date > "2015-06-17"^^xsd:date)
  FILTER (?date < "2015-06-18"^^xsd:date)
}
ORDER BY DESC(?date)
LIMIT 50
OFFSET 50
````
[View Results as JSON](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+distinct+%3Furl+%3Fdate+WHERE+%7B%0D%0A++%3Furl+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++++dcterms%3Acreated+%3Fdate.%0D%0A++FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A++FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D%0D%0AORDER+BY+DESC%28%3Fdate%29%0D%0ALIMIT+50%0D%0AOFFSET+50&output=json "Find the next 50 record url's created/modified on 6-17-1")

[View Results as HTML](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+distinct+%3Furl+%3Fdate+WHERE+%7B%0D%0A++%3Furl+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++++dcterms%3Acreated+%3Fdate.%0D%0A++FILTER+%28%3Fdate+%3E+%222015-06-17%22%5E%5Exsd%3Adate%29%0D%0A++FILTER+%28%3Fdate+%3C+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A%7D%0D%0AORDER+BY+DESC%28%3Fdate%29%0D%0ALIMIT+50%0D%0AOFFSET+50&output=htmltab "Find the next 50 record url's created/modified on 6-17-1")

#### Return everything about a given URL (http://www.screencast.com/t/4pzAoMjyeJ)... including any curriculum standards information
````
SELECT * WHERE {
  GRAPH <http://www.screencast.com/t/4pzAoMjyeJ> { ?subject ?predicate ?object.}
}
````
[View Results as JSON](http://explore.dublincore.net/rdf/endpoint.php?query=SELECT+*+WHERE+%7B%0D%0A++GRAPH+%3Chttp%3A%2F%2Fwww.screencast.com%2Ft%2F4pzAoMjyeJ%3E+%7B+%3Fsubject+%3Fpredicate+%3Fobject.%7D%0D%0A%7D&output=json "Return everything about a single record... including curriculum standards")

[View Results as HTML](http://explore.dublincore.net/rdf/endpoint.php?query=SELECT+*+WHERE+%7B%0D%0A++GRAPH+%3Chttp%3A%2F%2Fwww.screencast.com%2Ft%2F4pzAoMjyeJ%3E+%7B+%3Fsubject+%3Fpredicate+%3Fobject.%7D%0D%0A%7D&output=htmltab "Return everything about a single record... including curriculum standards")

#### Return the number of records created/modified on 6-18-15
````
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT COUNT(?s) as ?totalRecords {
 ?s rdf:type <http://schema.org/CreativeWork>;
   dcterms:created ?date.
 FILTER (?date > "2015-06-18"^^xsd:date)
 FILTER (?date < "2015-06-19"^^xsd:date)
}
````
[View Results as JSON](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+COUNT%28%3Fs%29+as+%3FtotalRecords+%7B%0D%0A+%3Fs+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++dcterms%3Acreated+%3Fdate.%0D%0A+FILTER+%28%3Fdate+%3E+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A+FILTER+%28%3Fdate+%3C+%222015-06-19%22%5E%5Exsd%3Adate%29%0D%0A%7D&output=json "Return the number of records created/modified on 6-18-15")

[View Results as HTML](http://explore.dublincore.net/rdf/endpoint.php?query=PREFIX+rdf%3A+%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0D%0APREFIX+dcterms%3A+%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0D%0A%0D%0ASELECT+COUNT%28%3Fs%29+as+%3FtotalRecords+%7B%0D%0A+%3Fs+rdf%3Atype+%3Chttp%3A%2F%2Fschema.org%2FCreativeWork%3E%3B%0D%0A+++dcterms%3Acreated+%3Fdate.%0D%0A+FILTER+%28%3Fdate+%3E+%222015-06-18%22%5E%5Exsd%3Adate%29%0D%0A+FILTER+%28%3Fdate+%3C+%222015-06-19%22%5E%5Exsd%3Adate%29%0D%0A%7D&output=htmltab "Return the number of records created/modified on 6-18-15")
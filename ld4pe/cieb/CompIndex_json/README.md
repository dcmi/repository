Dear all,

I'll try to keep this initial message short and elaborate on specific 
issues in subsequent postings.

We recently had a call with Joseph Chapman [1], who showed us how we could
directly edit the native representation of the Competency Index using the RDF
editor of the Achievement Standards Network ("ASN Editor"), which runs in the
browser [2].

The ASN Editor:

* reads and writes to RDF/JSON, an informally standardized precursor to the 
  serialization format to JSON-LD [3] (note that this W3C Working 
  Group Note says: "Use of JSON-LD is recommended.")  See a copy of the 
  RDF/JSON representation at [4] of the "official" published RDF/JSON [7].  
  This RDF/JSON format is the basis for all functions on the WordPress site, 
  such as creation of a WP taxonomy.

* loads the Competency Index in the correct order; 

* renders a hierarchical view of the CI that can be clicked on to add new 
  competencies, edit existing competencies, or move things around within
  the hierarchy; and 

* write things back to a file in the correct order.  

* is smart about URIs: if the entities described in the RDF/JSON already 
  have URIs, it keeps those; otherwise it assigns new (ASN) URIs.

Our vision had been:

* that the Editorial use the ASN Editor to make changes to the CI in our 
  Github repo;

* that members of the public would be invited to fork the repo, make changes 
  in their copy, and propose their changes in the form of pull requests;

* that in addition to the raw RDF/JSON sources and the web-based view of 
  the hierarchy, we would supply, and continually update, a PDF of the 
  competency index for printing;

* that members of the public would be invited to submit feedback 
  on the basis of the PDF printout or web-based view and post their 
  comments or proposals using the Github issue tracker.

However, I currently see several issues with this approach:

* The native representation format for CI (RDF/JSON) does not appear
  to be well supported by software libraries.  As Joseph points out, 
  it can be converted into Turtle using online tools (with limitations 
  discussed below), but the command-line tool 'rapper' dropped support 
  for RDF/JSON between versions 2.0.14 and 2.0.15.  This makes the task 
  of writing a script to generate a printable PDF more daunting than 
  I had assumed.

* The sequential order of clusters, topics, competencies, and benchmarks, 
  which is of course crucial for the CI, is not determined by their order 
  in the RDF/JSON file.  Their order in the RDF/JSON file is arbitrary, 
  and the order of the CI is constituted by references to parent and child 
  nodes that must be resolved in order to reconstitute that order,
  complicating the task of writing the script.

* Indeed, the RDF model sees clusters, topics, competencies, and benchmarks
  (CTCB) all as members of Statement, the ASN Core class.  Their status as 
  CTCB is determined by their hierarchical relations to other entities and 
  by a "statement label" attached to each (e.g., the string "Competency").
  It is done this way for flexibility, because ASN encompasses a very wide 
  range of models (one model's "benchmark" is another model's "indicator").

* Diffs between two versions of the CI in RDF/JSON would be hard to read 
  because of their non-sequential order (as described above), which would 
  make it difficult to interpret a pull request.

* The ASN Editor gives the topics and competencies of the CI URIs in the 
  ASN namespace.  This means that according to the principle of "following 
  your nose", the official published version of the CI is the one to 
  which its URIs resolve on the ASN website.  For example, the competency 
  that reads "Understands that a 'real-world' thing..." is identified by
  http://asn.desire2learn.com/resources/S2742438 , which resolves to 
  a single competency description on the ASN website.  When the CI is 
  edited in the ASN Editor, temporary UUIDs are assigned.

* Assuming changes were made to a copy of the RDF/JSON in a DCMI Github 
  repo, we would need to define some sort of workflow, preferably 
  automatic in response to commits on the master branch, by which the
  "published" CI on the ASN website [5] could be refreshed along with any other
  representations of the CI, such as a printable PDF or the clickable web-based
  hierarchical view currently on the WordPress site [6].

[1] https://github.com/ld4pe/cieb/blob/master/calls/2017-05-16.cieb-notes.md
[2] http://rdf.tools => click on "ASN" => "load ASN file"
[3] https://www.w3.org/TR/rdf-json/
[4] https://github.com/ld4pe/cieb/blob/master/CompIndex_json/D2695955.json
[5] http://asn.desire2learn.com/resources/D2695955
[6] http://explore.dublincore.net/explore-learning-resources-by-competency/
[7] http://s3.amazonaws.com/asnstaticd2l/data/rdf/D2695955.json


https://github.com/ld4pe/cieb/blob/master/CompIndex_json/D2695955.ttl
https://github.com/ld4pe/cieb/blob/master/CompIndex_json/D2695955.ttl-prune
https://github.com/ld4pe/cieb/blob/master/CompIndex_json/json2ttl.sh
https://github.com/ld4pe/cieb/blob/master/CompIndex_json/prunettl.sh
https://github.com/ld4pe/cieb/blob/master/CompIndex/versions/2016-09-21.CompIndex-generated.docx
https://github.com/ld4pe/cieb/blob/master/CompIndex/versions/2016-09-21.CompIndex-generated.md


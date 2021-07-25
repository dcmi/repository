<h1> <span class="mw-headline" id="What_is_Linked_Data.3F"> What is Linked Data? </span>
</h1>
<p>Linked Data is a method of exposing, sharing, and connecting data on the Semantic Web using URIs and RDF (see <a href="http://linkeddata.org/" class="external free" rel="nofollow">http://linkeddata.org/</a>). Metadata are the backbone of this method, making <b>statements</b> about data and how they relate to each other. In Linked Data these statements have to be expressed in RDF triples, which break statements in three parts:
</p>
<p><a href="./Diagram1.jpeg" class="image"><img alt="Diagram1.jpeg" src="./Diagram1.jpeg" width="237" height="119"></a>
</p>
<ul>
<li> the subject - the part that identifies the thing the statement describes,
</li>
<li> the predicate - the part that identifies a property of the described thing.
</li>
<li> the object - the part that identifies the value this property has when describing this thing.
</li>
</ul>
<p>(see: <a href="http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#statements" class="external free" rel="nofollow">http://www.w3.org/TR/2004/REC-rdf-primer-20040210/#statements</a>)
</p>
<p>Another "must" when publishing metadata in Linked Data is the usage of URIs. In Linked Data you need URIs referencing to things by identifying, localizing and interlinking them. Considering this a triple graph describing Charles Dickens "A Christmas Carol" might look this way:
</p>
<p><a href="./Dickens2.jpeg" class="image"><img alt="Dickens2.jpeg" src="./Dickens2.jpeg" width="554" height="195"></a>
</p>
<p>Here the value "A Christmas Carol" is a simple string or literal value. Another sort of values used in a triple are non-literal values, which means you use a URI that references to another description - the description of a thing that is the object of your statement. In our example the dbpedia URI of Charles Dickens references to such a description.
</p>

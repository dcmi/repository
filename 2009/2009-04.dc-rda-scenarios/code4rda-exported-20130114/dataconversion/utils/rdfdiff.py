import sys
from rdflib import ConjunctiveGraph, BNode, Namespace, URIRef, Literal

#print "\necho args:"

#for arg in sys.argv :
#    print arg
   
#print "\ncheck args length:"

if len(sys.argv) != 3 :
    print "expect 3 arguments"
    sys.exit(2)
    
#print "\nparse files:"

g1 = ConjunctiveGraph()
g1.parse(sys.argv[1])
g2 = ConjunctiveGraph()
g2.parse(sys.argv[2])

g1_g2 = ConjunctiveGraph()
g2_g1 = ConjunctiveGraph()

for t in g1.triples((None,None,None)) :
    if t not in g2 :
        g1_g2.add(t)

for t in g2.triples((None,None,None)) :
    if t not in g1 :
        g2_g1.add(t)

prefixes = [ 
    ["http://RDVocab.info/Elements/", "rda:"] , 
    ["http://www.w3.org/2004/02/skos/core#", "skos:"] ,
    ["http://www.w3.org/2000/01/rdf-schema#", "rdfs:" ] ,
    ["http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf:" ] ,
    ["http://metadataregistry.org/uri/profile/RegAp/", "regap:" ] ,
    ["http://www.w3.org/2001/XMLSchema#", "xsd:" ] ,
    ["http://metadataregistry.org/uri/RegStatus/", "regstatus:" ]
]

def abbrev(uristr):
    for mapping in prefixes :
        uristr = uristr.replace(mapping[0], mapping[1])
    return uristr

master = []

def render(node):
    content = str(node)
    if type(node) == URIRef :
        content = abbrev(content)
    elif type(node) == Literal :
        if len(content) > 40 :
            content = content[:40] + "..."
        content = "\"" + content.lstrip('\\n ') + "\""
        if node.language:
            content += "@" + node.language
        elif node.datatype:
            content += "^^" + abbrev(str(node.datatype)) + ""
    return content 

print "\n==== Triples Added ===="

#for t in g1.triples((None,None,None)) :
#    if t not in g2 :
#        print "|| "+render(t[0])+" || "+render(t[1])+" || "+render(t[2])+" ||"

print "|| '''subject''' || '''predicate''' || '''object''' ||"
for t in g1_g2 :
    tuple = '+', t[0], t[1], t[2]
    master.append(tuple)
    print "|| "+render(t[0])+" || "+render(t[1])+" || "+render(t[2])+" ||"
        
print "\n==== Triples Removed ===="

#for t in g2.triples((None,None,None)) :
#    if t not in g1 :
#        print "|| "+render(t[0])+" || "+render(t[1])+" || "+render(t[2])+" ||"

print "|| '''subject''' || '''predicate''' || '''object''' ||"
for t in g2_g1 :
    tuple = '-', t[0], t[1], t[2]
    master.append(tuple)
    print "|| "+render(t[0])+" || "+render(t[1])+" || "+render(t[2])+" ||"

def comparetuples(a, b) :
    # compare first by subject
    if str(a[1]) > str(b[1]) :
        return 1
    elif str(a[1]) == str(b[1]) :
        # compare next by predicate
        if str(a[2]) > str(b[2]) :
            return 1
        elif str(a[2]) == str(b[2]) :
            # compare next by added/removed
            if a[0] == '+' :
                return -1
            else :
                return 1
        else : # str(a[2]) < str(b[2])
            return -1
    else : # str(a[1]) < str(b[1])
        return -1

master.sort(comparetuples)

print "\n==== All Changes, Sorted by Subject ====\n"

print "|| '''+/-''' || '''subject''' || '''predicate''' || '''object''' ||"
for tup in master :
    print "|| "+tup[0]+" || "+render(tup[1])+" || "+render(tup[2])+" || "+render(tup[3])+" ||"


#print "\nall done."


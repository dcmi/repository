#!/usr/bin/python

import sys
import xml.sax
import string

def printElementPathCount(stack):
    print "LongValueSum:" + string.join(stack, "/") + "\t" + "1"

def printAttrPathCount(stack, attr):
    print "LongValueSum:" + string.join(stack, "/") + "@" + attr + "\t" + "1"

class ModsHandler(xml.sax.ContentHandler):

    def __init__(self):
        self.stack = []

    def startElement(self, name, attrs):
        self.stack.append(name)
        printElementPathCount(self.stack)
        for (k,v) in attrs.items():
            printAttrPathCount(self.stack, k)

    def endElement(self, name):
        self.stack.pop()

def main(argv):
    parser = xml.sax.make_parser(["xml.sax.xmlreader.IncrementalParser"])
    parser.setContentHandler(ModsHandler())
    lines = []
    line = sys.stdin.readline()
    try:
        while line:
            lines.append(line)
            line = sys.stdin.readline()
    except "end of file":
        print "end of file hit"
        return None
    except:
        print "Unexpected error attempting to parse line: "+line+"\n", sys.exc_info()[0]
        return None
    for line in lines:
        parser.feed(line)
    parser.close()

if __name__ == "__main__":
    main(sys.argv)


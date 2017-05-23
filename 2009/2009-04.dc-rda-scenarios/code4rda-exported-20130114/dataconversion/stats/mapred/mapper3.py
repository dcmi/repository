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
    parser = xml.sax.make_parser()
    parser.setContentHandler(ModsHandler())
    parser.parse(sys.stdin)

if __name__ == "__main__":
    main(sys.argv)


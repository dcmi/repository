#!/usr/bin/python

import sys
import xml.sax

class ModsHandler(xml.sax.ContentHandler):
    def startElement(self, name, attrs):
        print "LongValueSum:" + name + "\t" + "1"
        for (k,v) in attrs.items():
            print "LongValueSum:@" + k + "\t" + "1"

def main(argv):
    parser = xml.sax.make_parser()
    parser.setContentHandler(ModsHandler())
    parser.parse(sys.stdin)

if __name__ == "__main__":
    main(sys.argv)


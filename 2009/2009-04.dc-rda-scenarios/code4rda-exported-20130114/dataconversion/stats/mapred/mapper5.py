#!/usr/bin/python

import sys
import xml.sax

class ModsHandler(xml.sax.ContentHandler):
    def startElement(self, name, attrs):
        print "LongValueSum:" + name + "\t" + "1"
        for (k,v) in attrs.items():
            print "LongValueSum:@" + k + "\t" + "1"

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


#!/usr/bin/python

import sys
import xml.sax

class MarcHandler(xml.sax.ContentHandler):

    def __init__(self):
        self.islcsh = False
        self.lccn = None
        self.term = None
        self.incf8 = False

    def startElement(self, name, attrs):
        if name == "record":
            print "found record"
            self.islcsh = False
            self.lccn = None
            self.term = None
        if name == "controlfield":
            for (k,v) in attrs.items():
                if (k == "tag" and v == "8"):
                    self.incf8 = True
                    print "found control field 8"

    def characters(self, content):
        if (self.incf8):
            self.incf8 = False
            print "found control field 8 content: " + content
            system = content[11:12]
            print "position 11: " + system
            if system == "a":
                self.islcsh = True

def main(argv):
    parser = xml.sax.make_parser(["xml.sax.xmlreader.IncrementalParser"])
    parser.setContentHandler(MarcHandler())
    line = sys.stdin.readline()
    try:
        while line:
            parser.feed(line)
            line = sys.stdin.readline()
    except "end of file":
        print "end of file hit"
        return None
    except:
        print "Unexpected error attempting to parse line: "+line+"\n", sys.exc_info()[0]
        return None
    parser.close()

if __name__ == "__main__":
    main(sys.argv)


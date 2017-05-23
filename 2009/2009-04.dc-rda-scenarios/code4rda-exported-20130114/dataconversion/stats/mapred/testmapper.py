#!/usr/bin/python

import sys
import re

def main(argv):
    prog = re.compile("<(\w+)")
    line = sys.stdin.readline()
    try:
        while line:
            x = line.strip()
            result = prog.match(x)
            if result != None:
                print "LongValueSum:" + result.group(1) + "\t" + "1"
#            if x.startswith("<"):
#                print x + "\t" + "1"
            line = sys.stdin.readline()
    except "end of file":
        return None

if __name__ == "__main__":
    main(sys.argv)


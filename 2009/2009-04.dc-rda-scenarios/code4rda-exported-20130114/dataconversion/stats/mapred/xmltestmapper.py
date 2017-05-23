#!/usr/bin/python

import sys

def main(argv):
    line = sys.stdin.readline()
    try:
        print "-- start of record --"
        while line:
            print line
            line = sys.stdin.readline()
        print "-- end of record --"
    except "end of file":
        return None

if __name__ == "__main__":
    main(sys.argv)


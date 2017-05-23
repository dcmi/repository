#!/bin/sh

echo Building with classpath $CLASSPATH
java org/dublincore/dcregistry/tools/importRDF $1 $2


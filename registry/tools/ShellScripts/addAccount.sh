#!/bin/sh

echo Building with classpath $CLASSPATH
echo
java org/dublincore/dcregistry/tools/addAccount $1 $2

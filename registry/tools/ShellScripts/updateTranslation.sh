#!/bin/sh

echo classpath $CLASSPATH
java org/dublincore/dcregistry/tools/updateTranslation $1 $2 $3

#!/bin/sh

echo Building with classpath $CLASSPATH
java org/dublincore/dcregistry/tools/createModel account
java org/dublincore/dcregistry/tools/createModel registry
java org/dublincore/dcregistry/tools/createModel collection
java org/dublincore/dcregistry/tools/createModel provenance
java org/dublincore/dcregistry/tools/createModel translations
java org/dublincore/dcregistry/tools/createModel remote
java org/dublincore/dcregistry/tools/createModel canonical
java org/dublincore/dcregistry/tools/createModel extensions

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

java org/dublincore/dcregistry/tools/initExtensionsDB
java org/dublincore/dcregistry/tools/initRemoteDB
java org/dublincore/dcregistry/tools/initTranslationDB
java org/dublincore/dcregistry/tools/addCollection default
java org/dublincore/dcregistry/tools/addAccount $1 $2

java org/dublincore/dcregistry/tools/importRDF ../../RDF/schemas registry
#java org/dublincore/dcregistry/tools/importRDF ../../RDF/documents registry
#java org/dublincore/dcregistry/tools/importRDF ../../RDF/translations registry
java org/dublincore/dcregistry/tools/importRDF ../../RDF/provenance provenance

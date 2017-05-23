#!/bin/sh

export CLASSPATH=../build/WEB-INF/classes/
java org.dublincore.dcregistrylt.tools.registryDES -e key $1

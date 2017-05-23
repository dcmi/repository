#!/bin/sh

export CLASSPATH=../build/WEB-INF/classes/
java org.dublincore.dcregistrylt.tools.registryDES -d key pass.enc

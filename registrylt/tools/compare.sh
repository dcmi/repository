#!/bin/sh

export CLASSPATH=../build/WEB-INF/classes/
java org.dublincore.dcregistrylt.tools.registryDES -c key pass.enc $1

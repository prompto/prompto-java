#!/bin/bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home
mvn -e clean deploy -P deploy
	 
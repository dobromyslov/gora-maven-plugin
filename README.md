#Apache Gora Maven plugin by Argonio

The Gora Maven Plugin is used to generate Java sources from Apache Avro *.json schema descriptors.
This plugin works with Apache Gora 0.4.

##Goals Overview

The Gora Maven Plugin has two goals:

* gora:generate generates Java sources from Apache Avro schema descriptors,
* gora:help shows usage help.

##Build plugin

To build and install plugin on the local machine just run:
    
    mvn clean install
    
##Usage

Add to your `pom.xml` the following plugin:
    
    <build>
        <plugins>
            <plugin>
                <groupId>com.argonio.gora</groupId>
                <artifactId>gora-maven-plugin</artifactId>
                <version>0.4-SNAPSHOT</version>
                <configuration>
                    <sourceDirectory>${basedir}/src/main/avro</sourceDirectory>
                    <outputDirectory>${basedir}/src/main/java</outputDirectory>
                </configuration>
            </plugin>
        </plugins>
    </build>
    
And then run:

    mvn gora:generate

##Related links

* http://gora.apache.org/current/tutorial.html
* https://issues.apache.org/jira/browse/GORA-277

###License

This work is provided under Apache License version 2.0. See LICENSE for more details.
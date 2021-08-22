#!/bin/bash
JAR_FILE=/root/apm-spring-boot/GerenciadorProjeto-0.0.1-SNAPSHOT.jar
JAR_AGENT=/root/apm-spring-boot/elastic-apm-agent-1.7.0.jar

nohup java -javaagent:$JAR_AGENT \
     -Delastic.apm.server_url=http://localhost:8200 \
     -Delastic.apm.service_name=GerenciadorProjeto \
     -Delastic.apm.application_packages=com.kingoftech.api \
     -jar $JAR_FILE > agent-elastic.log 2> agent-elastic-erro.log &

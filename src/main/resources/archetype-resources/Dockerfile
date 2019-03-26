#set($d="$")
FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
#if (${buildTool} == "maven")
COPY target/${artifactId}*.jar ${artifactId}.jar
#[[#COPY]]# build/libs/*-all.jar ${artifactId}.jar
#else
#[[#COPY]]# target/${artifactId}*.jar ${artifactId}.jar
COPY build/libs/*-all.jar ${artifactId}.jar
#end
CMD java ${d}{JAVA_OPTS} -jar ${artifactId}.jar

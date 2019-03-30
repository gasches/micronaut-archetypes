#set($d="$")
FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
#if (${buildTool} == "maven")
COPY target/${artifactId}*.jar ${artifactId}.jar
#[[#COPY]]# build/libs/*-all.jar ${artifactId}.jar
#else
#[[#COPY]]# target/${artifactId}*.jar ${artifactId}.jar
COPY build/libs/*-all.jar ${artifactId}.jar
#end
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap \
    -Dcom.sun.management.jmxremote -noverify ${d}{JAVA_OPTS} -jar ${artifactId}.jar

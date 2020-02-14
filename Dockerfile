FROM adoptopenjdk/openjdk11-openj9:alpine-jre
ADD ./target/ringer-0.0.1-SNAPSHOT.jar /usr/src/ringer-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "ringer-0.0.1-SNAPSHOT.jar"]

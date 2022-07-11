FROM openjdk:12
COPY ./build/libs/java-health-0.0.1-SNAPSHOT.jar /opt/java-health-0.0.1-SNAPSHOT.jar
VOLUME /tmp
CMD java -jar "-Dspring.profiles.active=prod" /opt/java-health-0.0.1-SNAPSHOT
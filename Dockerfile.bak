FROM openjdk:12
RUN cd /reto_back_java_health/
RUN gradlew.bat build
COPY /reto_back_java_health/build/libs/java-health-0.0.1-SNAPSHOT.jar /opt/java-health-0.0.1-SNAPSHOT.jar
VOLUME /tmp
CMD java -jar "-Dspring.profiles.active=prod" /opt/java-health-0.0.1-SNAPSHOT
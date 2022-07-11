FROM openjdk:12
COPY /reto_back_java_health/target/reto_back_java_health-1.0-SNAPSHOT.jar /opt/reto_back_java_healthjar
VOLUME /tmp
CMD java -jar "-Dspring.profiles.active=prod" /opt/reto_back_java_health.jar
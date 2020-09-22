FROM openjdk:8-jdk-alpine

COPY target/fonderos-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/app.jar"]
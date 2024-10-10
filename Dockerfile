FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/*.jar /app/converter-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/app/converter-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-jdk-alpine

LABEL maintaner="blu4ck@outlook.com"
ENV APP_NAME="Converter Alpha"
ENV VERSION="V1.0.0"
ENV PORT="http://localhost:4444"

RUN echo "App Name: $APP_NAME"
RUN echo "Version: $VERSION"
RUN echo "Port:4444 $PORT"


WORKDIR /app

COPY target/*.jar /app/converter-0.0.1-SNAPSHOT.jar
EXPOSE 4444
ENTRYPOINT ["java", "-jar", "/app/converter-0.0.1-SNAPSHOT.jar"]



HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
 CMD wget --quiet --tries=1 --spider http://localhost:4444 exit 1
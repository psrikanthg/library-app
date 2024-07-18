FROM openjdk:17-alpine
LABEL maintainer="tanks"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
#ADD ${JAR_FILE} /app/bin/app.jar
#ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /app/bin

ENTRYPOINT ["java",  "-jar", "app.jar"]

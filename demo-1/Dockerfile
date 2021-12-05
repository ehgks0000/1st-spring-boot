FROM openjdk:11-jdk AS base
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080



FROM base AS dev
ENTRYPOINT ["java","-Dspring.profiles.active=dev", "-jar", "/app.jar"]

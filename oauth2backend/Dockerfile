FROM ubuntu:latest
LABEL authors="user"

# Korak 1: build / builder stage (opciono)
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /oauth2backend

# Kopiraj fajlove koji su potrebni da se build-uje
COPY pom.xml .
COPY src ./src

# Pokreni Maven build
RUN mvn clean package -DskipTests

# Korak 2: runtime image
FROM openjdk:17-jdk-slim
WORKDIR /app

# Kopiraj jar iz build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (onaj koji si definisao u application.properties)
EXPOSE 8080

# Komanda koja se izvršava kada kontejner startuje
ENTRYPOINT ["java", "-jar", "app.jar"]
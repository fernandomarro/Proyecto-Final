FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTest

FROM openjdk:17.0.1-jdk-slim
COPY --from=buil /target/AeropuertoAPI-0.0.1-SNAPSHOT.jar AeropuertoAPI.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","AeropuertoAPI.jar"]
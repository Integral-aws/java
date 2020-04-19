FROM openjdk:8u131-jre-alpine
EXPOSE 3001
WORKDIR /usr/local/bin
COPY ./target/Java1-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
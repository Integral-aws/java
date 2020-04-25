FROM openjdk:8u131-jre-alpine
EXPOSE 3001
WORKDIR mkdir /app
RUN ECHO ${DIR_JAR}
COPY ${DIR_JAR}/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp

#WORKDIR /app
COPY target/*.jar app.jar

EXPOSE 8080
#CMD ["java","-jar","sample-app-0.0.1-SNAPSHOT.jar"]
#CMD ["java","-jar","sample-app-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java","-jar","/app.jar"]
FROM amazoncorretto:17
WORKDIR /app
COPY target/appointment-setter-service-0.0.1-SNAPSHOT.jar /app/target/appointment-setter-service-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "target/appointment-setter-service-0.0.1-SNAPSHOT.jar"]


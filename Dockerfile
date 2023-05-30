FROM openjdk:17-jdk-slim-buster

COPY target/awsec2springmongo-0.0.1-SNAPSHOT.jar awsec2springmongo-0.0.1-SNAPSHOT.jar

EXPOSE 8080
CMD ["java", "-jar", "awsec2springmongo-0.0.1-SNAPSHOT.jar"]
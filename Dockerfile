FROM openjdk:17-jdk
COPY build/libs/student-information-service-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
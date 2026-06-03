FROM eclipse-temurin:26-jre

WORKDIR /app

COPY target/student-app-1.0-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
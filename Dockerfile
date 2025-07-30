FROM openjdk:17-slim
WORKDIR /app
COPY build/libs/DockUser-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

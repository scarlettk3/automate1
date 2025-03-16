FROM openjdk:17
WORKDIR /app
COPY target/demo1-0.0.1-SNAPSHOT.jar /app/


# Expose the port
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "demo1-0.0.1-SNAPSHOT.jar"]
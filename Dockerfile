FROM gradle:latest as builder
WORKDIR /uek223-backend-2
COPY build.gradle .
COPY settings.gradle .
COPY gradle/ gradle/
COPY src/ src/
RUN gradle build --no-daemon

FROM openjdk:18
WORKDIR /app
COPY --from=builder /uek223-backend-2/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
FROM gradle:7.4.0-jdk11-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build

FROM openjdk:11 as runner
COPY --from=BUILD /home/gradle/src/build/libs/date-calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

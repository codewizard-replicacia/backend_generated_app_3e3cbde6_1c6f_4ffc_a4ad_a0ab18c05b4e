FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_generated_app_3e3cbde6_1c6f_4ffc_a4ad_a0ab18c05b4e backend_generated_app_3e3cbde6_1c6f_4ffc_a4ad_a0ab18c05b4e
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_generated_app_3e3cbde6_1c6f_4ffc_a4ad_a0ab18c05b4e/target/generated_app-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar generated_app-0.0.1-SNAPSHOT.jar"]
FROM openjdk:21

COPY target/apiDemo-0.0.1.jar spring-boot-docker.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/spring-boot-docker.jar" ]
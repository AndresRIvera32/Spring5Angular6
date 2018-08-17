FROM openjdk:8
ADD target/spring-boot-backend-apirest.jar spring-boot-backend-apirest.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","spring-boot-backend-apirest.jar"]
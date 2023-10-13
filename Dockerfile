FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-docker.jar
ADD ${JAR_FILE} PizzettAppBackEnd.jar
ENTRYPOINT ["java","-jar","/PizzettAppBackEnd.jar"]
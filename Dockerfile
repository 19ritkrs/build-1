FROM openjdk:17
EXPOSE 8080
ADD target/build-1.jar build-1.jar
ENTRYPOINT ["java","-jar","/build-1.jar"]
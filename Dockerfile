FROM openjdk:17
EXPOSE 8080
ADD target/doc-kub.jar doc-kub.jar
ENTRYPOINT ["java","-jar","/doc-kub.jar"]
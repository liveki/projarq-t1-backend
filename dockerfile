FROM maven:3.8.1-openjdk-15
COPY ./target/SvBkEnd-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java","-jar","SvBkEnd-0.0.1-SNAPSHOT.jar"]
FROM openjdk:20-jdk

WORKDIR /app

COPY target/todo_list_management-0.0.1-SNAPSHOT.jar /app/spring.jar

EXPOSE 8080

CMD ["java","-jar","spring.jar"]

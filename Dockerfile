FROM openjdk:17

COPY /target/basic*SNAPSHOT.jar /app/app.jar

WORKDIR /app/

CMD ["java", "-jar", "app.jar"]
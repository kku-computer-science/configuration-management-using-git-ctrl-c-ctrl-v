FROM eclipse-temurin:24-jdk

WORKDIR /app

COPY src/ /app/src/

RUN javac src/*.java

CMD ["java", "-cp", "src", "App"]

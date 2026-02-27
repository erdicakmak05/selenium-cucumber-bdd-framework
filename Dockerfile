FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:resolve

COPY . .

CMD ["mvn", "clean", "test", "-Dbrowser=chrome"]

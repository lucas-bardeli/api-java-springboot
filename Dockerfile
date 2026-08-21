FROM ubuntu:latest

RUN apt-get update && \
  apt-get install -y openjdk-17-jdk maven && \
  rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/api-java-springboot-1.0.0.jar"]
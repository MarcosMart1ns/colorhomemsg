FROM maven:latest
WORKDIR ./
COPY . .
CMD mvn clean install
EXPOSE 8080
CMD mvn spring-boot:run
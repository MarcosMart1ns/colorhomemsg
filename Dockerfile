FROM maven:latest
WORKDIR ./
COPY . .
EXPOSE 8080
CMD mvn spring-boot:run
FROM openjdk:8-jdk
EXPOSE 8080
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
ENTRYPOINT ["java", "-jar", "target/rockpaperscissors.jar"]
FROM openjdk:8-jre-slim
VOLUME /tmp
ENV JAR_FILE /beca-web/target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
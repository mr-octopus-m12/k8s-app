FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/k8s-consumer-0.0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Xms1G", "-Xmx4G", "-XX:MaxMetaspaceSize=256M", "-XX:+UseG1GC", "-Dfile.encoding=UTF8", "-jar", "app.jar"]
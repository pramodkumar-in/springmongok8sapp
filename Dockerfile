FROM openjdk:8-jdk-alpine
ENV PORT 8100
EXPOSE 8100
COPY target/*.jar springmongok8sapp.jar
ENTRYPOINT exec java $JAVA_OPTS -jar springmongok8sapp.jar
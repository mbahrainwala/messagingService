FROM azul/zulu-openjdk-alpine:17.0.10-17.48

ARG JAR_FILE=service/target/*-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar
EXPOSE 8090
ENV USE_DEFAULT_CONFIG=false
ENV PROFILE=h2db

ENTRYPOINT ["sh", "-c", "java -Xms512M -Xmx4096M -XX:+HeapDumpOnOutOfMemoryError -jar app.jar --spring.profiles.active=${PROFILE}"]
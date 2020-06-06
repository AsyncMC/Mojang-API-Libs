FROM openjdk:8-jre-alpine

COPY ./build/libs/mojang-sessions-kotlin-server.jar /root/mojang-sessions-kotlin-server.jar

WORKDIR /root

CMD ["java", "-server", "-Xms4g", "-Xmx4g", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "mojang-sessions-kotlin-server.jar"]
FROM openjdk:8-jre-alpine

COPY ./build/libs/mojang-status-kotlin-server.jar /root/mojang-status-kotlin-server.jar

WORKDIR /root

CMD ["java", "-server", "-Xms4g", "-Xmx4g", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "mojang-status-kotlin-server.jar"]
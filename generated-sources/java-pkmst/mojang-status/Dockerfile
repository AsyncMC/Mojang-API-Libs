FROM frolvlad/alpine-oraclejdk8:slim
COPY target/mojang-status-java-pkmst.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
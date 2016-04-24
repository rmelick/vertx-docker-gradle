FROM java:8

ADD vert.x-2.1.5.tar.gz /opt/vertx/
ENV PATH $PATH:/opt/vertx/vert.x-2.1.5/bin

EXPOSE 8080
COPY build/mods /vertx-docker-gradle/mods/

CMD ["vertx", "runzip", "/vertx-docker-gradle/mods/mod-module.zip"]
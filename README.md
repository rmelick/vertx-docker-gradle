# vertx-docker-gradle
Build a vertx2 app into a locally deployable docker image

You can deploy the example with the following command.
```
gradle docker && docker run -d --name vertx-docker-gradle -p 8080:8080 vertx-docker-gradle
```

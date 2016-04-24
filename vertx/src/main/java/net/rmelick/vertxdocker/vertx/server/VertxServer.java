package net.rmelick.vertxdocker.vertx.server;

import net.rmelick.vertxdocker.shared.ib.SharedLibraryClass;
import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/**
 *
 */
public class VertxServer extends Verticle  {
  public void start() {
    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
      public void handle(HttpServerRequest req) {
        String localString = SharedLibraryClass.RMELICK_TEST_SHARED_STRING;
        boolean successfullyLoaded = SharedLibraryClass.testSharedMethod() && SharedLibraryClass.testTransitiveDependency();


        String file = req.path().equals("/") ? "index.html" : req.path();
        req.response().end("Hello from the docker container.");
      }
    }).listen(8080);
  }
}
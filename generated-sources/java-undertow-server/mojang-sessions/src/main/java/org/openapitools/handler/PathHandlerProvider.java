package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.GET, "/blockedservers", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getBlockedServerHashes");
                        }
                    })


            .add(Methods.GET, "/session/minecraft/profile/{stripped_uuid}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPlayerProfile");
                        }
                    })

        ;
        return handler;
    }
}


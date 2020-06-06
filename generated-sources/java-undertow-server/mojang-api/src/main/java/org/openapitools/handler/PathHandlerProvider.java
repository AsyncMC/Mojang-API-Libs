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


            .add(Methods.POST, "/orders/statistics", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getOrdersStatistics");
                        }
                    })


            .add(Methods.POST, "/profiles/minecraft", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("findUniqueIdsByName");
                        }
                    })


            .add(Methods.GET, "/user/profiles/{stripped_uuid}/names", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getNameHistory");
                        }
                    })


            .add(Methods.GET, "/users/profiles/minecraft/{username}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getUniqueIdByName");
                        }
                    })


            .add(Methods.GET, "/user/security/location", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("checkSecurityStatus");
                        }
                    })


            .add(Methods.GET, "/user/security/challenges", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("listPendingSecurityQuestions");
                        }
                    })


            .add(Methods.POST, "/user/security/location", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("sendSecurityQuestionAnswers");
                        }
                    })


            .add(Methods.POST, "/user/profile/{stripped_uuid}/skin", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("changePlayerSkin");
                        }
                    })


            .add(Methods.DELETE, "/user/profile/{stripped_uuid}/skin", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("resetPlayerSkin");
                        }
                    })


            .add(Methods.PUT, "/user/profile/{stripped_uuid}/skin", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("uploadPlayerSkin");
                        }
                    })

        ;
        return handler;
    }
}


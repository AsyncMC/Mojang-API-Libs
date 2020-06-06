package com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.SessionApiService;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.impl.SessionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:11.618967200-03:00[America/Sao_Paulo]")
public class SessionApiServiceFactory {
    private final static SessionApiService service = new SessionApiServiceImpl();

    public static SessionApiService getSessionApi() {
        return service;
    }
}

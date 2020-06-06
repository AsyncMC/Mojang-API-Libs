package com.github.asyncmc.mojang.status.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.status.jaxrs.jersey.api.CheckApiService;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.impl.CheckApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:04.026871200-03:00[America/Sao_Paulo]")
public class CheckApiServiceFactory {
    private final static CheckApiService service = new CheckApiServiceImpl();

    public static CheckApiService getCheckApi() {
        return service;
    }
}

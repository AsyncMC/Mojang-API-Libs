package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.InvalidateApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl.InvalidateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:02.185411600-03:00[America/Sao_Paulo]")
public class InvalidateApiServiceFactory {
    private final static InvalidateApiService service = new InvalidateApiServiceImpl();

    public static InvalidateApiService getInvalidateApi() {
        return service;
    }
}

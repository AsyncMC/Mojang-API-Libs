package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.SignoutApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl.SignoutApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:10.678452700-03:00[America/Sao_Paulo]")
public class SignoutApiServiceFactory {
    private final static SignoutApiService service = new SignoutApiServiceImpl();

    public static SignoutApiService getSignoutApi() {
        return service;
    }
}

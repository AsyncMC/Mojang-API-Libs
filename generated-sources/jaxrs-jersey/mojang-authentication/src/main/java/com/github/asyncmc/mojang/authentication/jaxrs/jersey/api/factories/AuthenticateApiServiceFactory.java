package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.AuthenticateApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl.AuthenticateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:02.185411600-03:00[America/Sao_Paulo]")
public class AuthenticateApiServiceFactory {
    private final static AuthenticateApiService service = new AuthenticateApiServiceImpl();

    public static AuthenticateApiService getAuthenticateApi() {
        return service;
    }
}

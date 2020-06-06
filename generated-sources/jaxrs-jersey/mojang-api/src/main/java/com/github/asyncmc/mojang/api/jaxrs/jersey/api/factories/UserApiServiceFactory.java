package com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.UserApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}

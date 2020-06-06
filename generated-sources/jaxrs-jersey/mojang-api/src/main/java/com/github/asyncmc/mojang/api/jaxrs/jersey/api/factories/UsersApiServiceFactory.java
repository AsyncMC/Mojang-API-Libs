package com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.UsersApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.impl.UsersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:09.626845200-03:00[America/Sao_Paulo]")
public class UsersApiServiceFactory {
    private final static UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}

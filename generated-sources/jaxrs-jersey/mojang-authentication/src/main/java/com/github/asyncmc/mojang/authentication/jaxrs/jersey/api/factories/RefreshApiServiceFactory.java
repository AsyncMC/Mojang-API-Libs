package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.RefreshApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl.RefreshApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:02.185411600-03:00[America/Sao_Paulo]")
public class RefreshApiServiceFactory {
    private final static RefreshApiService service = new RefreshApiServiceImpl();

    public static RefreshApiService getRefreshApi() {
        return service;
    }
}

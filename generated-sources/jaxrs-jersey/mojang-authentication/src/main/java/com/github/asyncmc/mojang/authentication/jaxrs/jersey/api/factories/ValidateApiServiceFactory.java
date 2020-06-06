package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.ValidateApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl.ValidateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:02.185411600-03:00[America/Sao_Paulo]")
public class ValidateApiServiceFactory {
    private final static ValidateApiService service = new ValidateApiServiceImpl();

    public static ValidateApiService getValidateApi() {
        return service;
    }
}

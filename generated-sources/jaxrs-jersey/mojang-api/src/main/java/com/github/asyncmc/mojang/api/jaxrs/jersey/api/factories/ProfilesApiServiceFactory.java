package com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.ProfilesApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.impl.ProfilesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public class ProfilesApiServiceFactory {
    private final static ProfilesApiService service = new ProfilesApiServiceImpl();

    public static ProfilesApiService getProfilesApi() {
        return service;
    }
}

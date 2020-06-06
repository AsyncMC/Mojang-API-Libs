package com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.BlockedserversApiService;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.impl.BlockedserversApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:11.618967200-03:00[America/Sao_Paulo]")
public class BlockedserversApiServiceFactory {
    private final static BlockedserversApiService service = new BlockedserversApiServiceImpl();

    public static BlockedserversApiService getBlockedserversApi() {
        return service;
    }
}

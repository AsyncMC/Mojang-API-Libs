package com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.OrdersApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.impl.OrdersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public class OrdersApiServiceFactory {
    private final static OrdersApiService service = new OrdersApiServiceImpl();

    public static OrdersApiService getOrdersApi() {
        return service;
    }
}

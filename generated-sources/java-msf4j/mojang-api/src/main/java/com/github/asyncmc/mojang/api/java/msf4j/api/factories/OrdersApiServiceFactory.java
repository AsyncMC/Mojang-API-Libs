package com.github.asyncmc.mojang.api.java.msf4j.api.factories;

import com.github.asyncmc.mojang.api.java.msf4j.api.OrdersApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.impl.OrdersApiServiceImpl;

public class OrdersApiServiceFactory {
    private final static OrdersApiService service = new OrdersApiServiceImpl();

    public static OrdersApiService getOrdersApi() {
        return service;
    }
}

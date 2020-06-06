package com.github.asyncmc.mojang.authentication.java.msf4j.api.factories;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.InvalidateApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.impl.InvalidateApiServiceImpl;

public class InvalidateApiServiceFactory {
    private final static InvalidateApiService service = new InvalidateApiServiceImpl();

    public static InvalidateApiService getInvalidateApi() {
        return service;
    }
}

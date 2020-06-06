package com.github.asyncmc.mojang.status.java.msf4j.api.factories;

import com.github.asyncmc.mojang.status.java.msf4j.api.CheckApiService;
import com.github.asyncmc.mojang.status.java.msf4j.api.impl.CheckApiServiceImpl;

public class CheckApiServiceFactory {
    private final static CheckApiService service = new CheckApiServiceImpl();

    public static CheckApiService getCheckApi() {
        return service;
    }
}

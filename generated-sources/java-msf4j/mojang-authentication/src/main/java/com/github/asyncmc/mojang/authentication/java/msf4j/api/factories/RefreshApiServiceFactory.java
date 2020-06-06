package com.github.asyncmc.mojang.authentication.java.msf4j.api.factories;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.RefreshApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.impl.RefreshApiServiceImpl;

public class RefreshApiServiceFactory {
    private final static RefreshApiService service = new RefreshApiServiceImpl();

    public static RefreshApiService getRefreshApi() {
        return service;
    }
}

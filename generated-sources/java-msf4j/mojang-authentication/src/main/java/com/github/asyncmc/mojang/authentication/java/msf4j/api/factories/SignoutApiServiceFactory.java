package com.github.asyncmc.mojang.authentication.java.msf4j.api.factories;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.SignoutApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.impl.SignoutApiServiceImpl;

public class SignoutApiServiceFactory {
    private final static SignoutApiService service = new SignoutApiServiceImpl();

    public static SignoutApiService getSignoutApi() {
        return service;
    }
}

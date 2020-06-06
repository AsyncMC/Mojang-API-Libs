package com.github.asyncmc.mojang.authentication.java.msf4j.api.factories;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.AuthenticateApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.impl.AuthenticateApiServiceImpl;

public class AuthenticateApiServiceFactory {
    private final static AuthenticateApiService service = new AuthenticateApiServiceImpl();

    public static AuthenticateApiService getAuthenticateApi() {
        return service;
    }
}

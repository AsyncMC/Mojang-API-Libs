package com.github.asyncmc.mojang.api.java.msf4j.api.factories;

import com.github.asyncmc.mojang.api.java.msf4j.api.UserApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.impl.UserApiServiceImpl;

public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}

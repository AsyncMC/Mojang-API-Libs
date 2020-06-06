package com.github.asyncmc.mojang.api.java.msf4j.api.factories;

import com.github.asyncmc.mojang.api.java.msf4j.api.UsersApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.impl.UsersApiServiceImpl;

public class UsersApiServiceFactory {
    private final static UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}

package com.github.asyncmc.mojang.authentication.java.msf4j.api.factories;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.ValidateApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.impl.ValidateApiServiceImpl;

public class ValidateApiServiceFactory {
    private final static ValidateApiService service = new ValidateApiServiceImpl();

    public static ValidateApiService getValidateApi() {
        return service;
    }
}

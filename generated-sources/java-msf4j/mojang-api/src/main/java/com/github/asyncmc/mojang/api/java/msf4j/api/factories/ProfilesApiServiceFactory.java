package com.github.asyncmc.mojang.api.java.msf4j.api.factories;

import com.github.asyncmc.mojang.api.java.msf4j.api.ProfilesApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.impl.ProfilesApiServiceImpl;

public class ProfilesApiServiceFactory {
    private final static ProfilesApiService service = new ProfilesApiServiceImpl();

    public static ProfilesApiService getProfilesApi() {
        return service;
    }
}

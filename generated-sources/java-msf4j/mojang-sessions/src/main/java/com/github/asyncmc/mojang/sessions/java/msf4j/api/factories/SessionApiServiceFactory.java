package com.github.asyncmc.mojang.sessions.java.msf4j.api.factories;

import com.github.asyncmc.mojang.sessions.java.msf4j.api.SessionApiService;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.impl.SessionApiServiceImpl;

public class SessionApiServiceFactory {
    private final static SessionApiService service = new SessionApiServiceImpl();

    public static SessionApiService getSessionApi() {
        return service;
    }
}

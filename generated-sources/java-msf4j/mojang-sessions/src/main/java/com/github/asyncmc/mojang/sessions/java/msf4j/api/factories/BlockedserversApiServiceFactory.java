package com.github.asyncmc.mojang.sessions.java.msf4j.api.factories;

import com.github.asyncmc.mojang.sessions.java.msf4j.api.BlockedserversApiService;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.impl.BlockedserversApiServiceImpl;

public class BlockedserversApiServiceFactory {
    private final static BlockedserversApiService service = new BlockedserversApiServiceImpl();

    public static BlockedserversApiService getBlockedserversApi() {
        return service;
    }
}

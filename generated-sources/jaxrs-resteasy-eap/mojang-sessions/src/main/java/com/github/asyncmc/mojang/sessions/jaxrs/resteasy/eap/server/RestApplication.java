package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.api.impl.BlockedserversApiServiceImpl;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.api.impl.SessionApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(BlockedserversApiServiceImpl.class);
        resources.add(SessionApiServiceImpl.class);

        return resources;
    }




}
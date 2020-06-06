package com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.api.impl.CheckApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(CheckApiServiceImpl.class);

        return resources;
    }




}
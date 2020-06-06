package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl.AuthenticateApiServiceImpl;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl.InvalidateApiServiceImpl;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl.RefreshApiServiceImpl;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl.SignoutApiServiceImpl;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl.ValidateApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AuthenticateApiServiceImpl.class);
        resources.add(InvalidateApiServiceImpl.class);
        resources.add(RefreshApiServiceImpl.class);
        resources.add(SignoutApiServiceImpl.class);
        resources.add(ValidateApiServiceImpl.class);

        return resources;
    }




}
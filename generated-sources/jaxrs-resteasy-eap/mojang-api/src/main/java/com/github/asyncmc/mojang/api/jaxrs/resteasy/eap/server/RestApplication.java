package com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl.OrdersApiServiceImpl;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl.ProfilesApiServiceImpl;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl.UserApiServiceImpl;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl.UsersApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(OrdersApiServiceImpl.class);
        resources.add(ProfilesApiServiceImpl.class);
        resources.add(UserApiServiceImpl.class);
        resources.add(UsersApiServiceImpl.class);

        return resources;
    }




}
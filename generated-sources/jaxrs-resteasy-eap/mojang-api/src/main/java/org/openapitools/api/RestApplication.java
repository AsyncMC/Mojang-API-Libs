package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.OrdersApiServiceImpl;
import org.openapitools.api.impl.ProfilesApiServiceImpl;
import org.openapitools.api.impl.UserApiServiceImpl;
import org.openapitools.api.impl.UsersApiServiceImpl;

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
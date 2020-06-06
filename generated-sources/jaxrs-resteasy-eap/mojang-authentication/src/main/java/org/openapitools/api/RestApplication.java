package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.AuthenticateApiServiceImpl;
import org.openapitools.api.impl.InvalidateApiServiceImpl;
import org.openapitools.api.impl.RefreshApiServiceImpl;
import org.openapitools.api.impl.SignoutApiServiceImpl;
import org.openapitools.api.impl.ValidateApiServiceImpl;

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
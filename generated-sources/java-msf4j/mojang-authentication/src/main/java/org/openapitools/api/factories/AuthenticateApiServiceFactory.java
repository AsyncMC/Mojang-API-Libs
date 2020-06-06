package org.openapitools.api.factories;

import org.openapitools.api.AuthenticateApiService;
import org.openapitools.api.impl.AuthenticateApiServiceImpl;

public class AuthenticateApiServiceFactory {
    private final static AuthenticateApiService service = new AuthenticateApiServiceImpl();

    public static AuthenticateApiService getAuthenticateApi() {
        return service;
    }
}

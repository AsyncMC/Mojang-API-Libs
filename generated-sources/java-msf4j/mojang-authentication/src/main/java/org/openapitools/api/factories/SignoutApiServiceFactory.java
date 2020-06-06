package org.openapitools.api.factories;

import org.openapitools.api.SignoutApiService;
import org.openapitools.api.impl.SignoutApiServiceImpl;

public class SignoutApiServiceFactory {
    private final static SignoutApiService service = new SignoutApiServiceImpl();

    public static SignoutApiService getSignoutApi() {
        return service;
    }
}

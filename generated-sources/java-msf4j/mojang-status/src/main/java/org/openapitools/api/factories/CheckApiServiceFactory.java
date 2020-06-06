package org.openapitools.api.factories;

import org.openapitools.api.CheckApiService;
import org.openapitools.api.impl.CheckApiServiceImpl;

public class CheckApiServiceFactory {
    private final static CheckApiService service = new CheckApiServiceImpl();

    public static CheckApiService getCheckApi() {
        return service;
    }
}

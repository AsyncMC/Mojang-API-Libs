package org.openapitools.api.factories;

import org.openapitools.api.InvalidateApiService;
import org.openapitools.api.impl.InvalidateApiServiceImpl;

public class InvalidateApiServiceFactory {
    private final static InvalidateApiService service = new InvalidateApiServiceImpl();

    public static InvalidateApiService getInvalidateApi() {
        return service;
    }
}

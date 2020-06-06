package org.openapitools.api.factories;

import org.openapitools.api.ValidateApiService;
import org.openapitools.api.impl.ValidateApiServiceImpl;

public class ValidateApiServiceFactory {
    private final static ValidateApiService service = new ValidateApiServiceImpl();

    public static ValidateApiService getValidateApi() {
        return service;
    }
}

package org.openapitools.api.factories;

import org.openapitools.api.RefreshApiService;
import org.openapitools.api.impl.RefreshApiServiceImpl;

public class RefreshApiServiceFactory {
    private final static RefreshApiService service = new RefreshApiServiceImpl();

    public static RefreshApiService getRefreshApi() {
        return service;
    }
}

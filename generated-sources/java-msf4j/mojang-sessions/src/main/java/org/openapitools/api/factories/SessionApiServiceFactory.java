package org.openapitools.api.factories;

import org.openapitools.api.SessionApiService;
import org.openapitools.api.impl.SessionApiServiceImpl;

public class SessionApiServiceFactory {
    private final static SessionApiService service = new SessionApiServiceImpl();

    public static SessionApiService getSessionApi() {
        return service;
    }
}

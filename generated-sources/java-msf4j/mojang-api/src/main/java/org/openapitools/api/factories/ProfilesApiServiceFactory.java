package org.openapitools.api.factories;

import org.openapitools.api.ProfilesApiService;
import org.openapitools.api.impl.ProfilesApiServiceImpl;

public class ProfilesApiServiceFactory {
    private final static ProfilesApiService service = new ProfilesApiServiceImpl();

    public static ProfilesApiService getProfilesApi() {
        return service;
    }
}

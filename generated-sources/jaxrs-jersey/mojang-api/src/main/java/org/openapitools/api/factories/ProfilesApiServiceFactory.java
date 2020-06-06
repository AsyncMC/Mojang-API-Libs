package org.openapitools.api.factories;

import org.openapitools.api.ProfilesApiService;
import org.openapitools.api.impl.ProfilesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:07.073325700-03:00[America/Sao_Paulo]")
public class ProfilesApiServiceFactory {
    private final static ProfilesApiService service = new ProfilesApiServiceImpl();

    public static ProfilesApiService getProfilesApi() {
        return service;
    }
}

package org.openapitools.api.factories;

import org.openapitools.api.AuthenticateApiService;
import org.openapitools.api.impl.AuthenticateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class AuthenticateApiServiceFactory {
    private final static AuthenticateApiService service = new AuthenticateApiServiceImpl();

    public static AuthenticateApiService getAuthenticateApi() {
        return service;
    }
}

package org.openapitools.api.factories;

import org.openapitools.api.SignoutApiService;
import org.openapitools.api.impl.SignoutApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class SignoutApiServiceFactory {
    private final static SignoutApiService service = new SignoutApiServiceImpl();

    public static SignoutApiService getSignoutApi() {
        return service;
    }
}

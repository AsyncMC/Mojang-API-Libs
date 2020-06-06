package org.openapitools.api.factories;

import org.openapitools.api.InvalidateApiService;
import org.openapitools.api.impl.InvalidateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class InvalidateApiServiceFactory {
    private final static InvalidateApiService service = new InvalidateApiServiceImpl();

    public static InvalidateApiService getInvalidateApi() {
        return service;
    }
}

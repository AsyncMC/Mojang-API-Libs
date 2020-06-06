package org.openapitools.api.factories;

import org.openapitools.api.ValidateApiService;
import org.openapitools.api.impl.ValidateApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class ValidateApiServiceFactory {
    private final static ValidateApiService service = new ValidateApiServiceImpl();

    public static ValidateApiService getValidateApi() {
        return service;
    }
}

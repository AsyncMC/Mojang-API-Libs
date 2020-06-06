package org.openapitools.api.factories;

import org.openapitools.api.CheckApiService;
import org.openapitools.api.impl.CheckApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:09.826183400-03:00[America/Sao_Paulo]")
public class CheckApiServiceFactory {
    private final static CheckApiService service = new CheckApiServiceImpl();

    public static CheckApiService getCheckApi() {
        return service;
    }
}

package org.openapitools.api.factories;

import org.openapitools.api.RefreshApiService;
import org.openapitools.api.impl.RefreshApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class RefreshApiServiceFactory {
    private final static RefreshApiService service = new RefreshApiServiceImpl();

    public static RefreshApiService getRefreshApi() {
        return service;
    }
}

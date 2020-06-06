package org.openapitools.api.factories;

import org.openapitools.api.UserApiService;
import org.openapitools.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:07.073325700-03:00[America/Sao_Paulo]")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}

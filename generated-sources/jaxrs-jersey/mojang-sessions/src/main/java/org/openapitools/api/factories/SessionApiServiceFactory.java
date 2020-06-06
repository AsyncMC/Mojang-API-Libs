package org.openapitools.api.factories;

import org.openapitools.api.SessionApiService;
import org.openapitools.api.impl.SessionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.961495700-03:00[America/Sao_Paulo]")
public class SessionApiServiceFactory {
    private final static SessionApiService service = new SessionApiServiceImpl();

    public static SessionApiService getSessionApi() {
        return service;
    }
}

package org.openapitools.api.factories;

import org.openapitools.api.BlockedserversApiService;
import org.openapitools.api.impl.BlockedserversApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.961495700-03:00[America/Sao_Paulo]")
public class BlockedserversApiServiceFactory {
    private final static BlockedserversApiService service = new BlockedserversApiServiceImpl();

    public static BlockedserversApiService getBlockedserversApi() {
        return service;
    }
}

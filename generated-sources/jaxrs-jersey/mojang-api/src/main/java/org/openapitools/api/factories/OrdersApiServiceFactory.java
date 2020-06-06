package org.openapitools.api.factories;

import org.openapitools.api.OrdersApiService;
import org.openapitools.api.impl.OrdersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:07.073325700-03:00[America/Sao_Paulo]")
public class OrdersApiServiceFactory {
    private final static OrdersApiService service = new OrdersApiServiceImpl();

    public static OrdersApiService getOrdersApi() {
        return service;
    }
}

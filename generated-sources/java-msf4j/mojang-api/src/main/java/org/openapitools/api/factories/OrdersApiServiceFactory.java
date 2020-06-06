package org.openapitools.api.factories;

import org.openapitools.api.OrdersApiService;
import org.openapitools.api.impl.OrdersApiServiceImpl;

public class OrdersApiServiceFactory {
    private final static OrdersApiService service = new OrdersApiServiceImpl();

    public static OrdersApiService getOrdersApi() {
        return service;
    }
}

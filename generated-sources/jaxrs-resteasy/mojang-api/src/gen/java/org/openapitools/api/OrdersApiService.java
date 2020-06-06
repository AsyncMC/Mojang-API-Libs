package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.OrderStatisticsRequest;
import org.openapitools.model.OrderStatisticsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:14.066473100-03:00[America/Sao_Paulo]")
public interface OrdersApiService {
      Response getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest,SecurityContext securityContext)
      throws NotFoundException;
}

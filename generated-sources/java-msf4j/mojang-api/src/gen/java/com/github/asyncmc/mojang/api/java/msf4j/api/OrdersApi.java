package com.github.asyncmc.mojang.api.java.msf4j.api;

import com.github.asyncmc.mojang.api.java.msf4j.model.*;
import com.github.asyncmc.mojang.api.java.msf4j.api.OrdersApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.factories.OrdersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.java.msf4j.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.msf4j.model.OrderStatisticsResponse;

import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/orders")


@io.swagger.annotations.Api(description = "the orders API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:21.461323800-03:00[America/Sao_Paulo]")
public class OrdersApi  {
   private final OrdersApiService delegate = OrdersApiServiceFactory.getOrdersApi();

    @POST
    @Path("/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get statistics on the sales of Minecraft.", notes = "", response = OrderStatisticsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "MojangStatisticsToken")
    }, tags={ "Miscellaneous", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class) })
    public Response getOrdersStatistics(@ApiParam(value = "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/" ,required=true) OrderStatisticsRequest orderStatisticsRequest
)
    throws NotFoundException {
        return delegate.getOrdersStatistics(orderStatisticsRequest);
    }
}

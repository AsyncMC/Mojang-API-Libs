package com.github.asyncmc.mojang.api.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.OrdersApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.OrderStatisticsResponse;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/orders")


@io.swagger.annotations.Api(description = "the orders API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:08.418392200-03:00[America/Sao_Paulo]")
public class OrdersApi  {

    @Inject OrdersApiService service;

    @POST
    @Path("/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get statistics on the sales of Minecraft.", notes = "", response = OrderStatisticsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "MojangStatisticsToken")
    }, tags={ "Miscellaneous", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class) })
    public Response getOrdersStatistics(@ApiParam(value = "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/" ,required=true) @NotNull @Valid OrderStatisticsRequest orderStatisticsRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOrdersStatistics(orderStatisticsRequest,securityContext);
    }
}

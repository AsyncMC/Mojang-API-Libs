package com.github.asyncmc.mojang.api.jaxrs.spec.api;

import com.github.asyncmc.mojang.api.jaxrs.spec.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.spec.model.OrderStatisticsResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/orders")
@Api(description = "the orders API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-06T05:00:11.972163-03:00[America/Sao_Paulo]")
public class OrdersApi {

    @POST
    @Path("/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get statistics on the sales of Minecraft.", notes = "", response = OrderStatisticsResponse.class, authorizations = {
        @Authorization(value = "MojangStatisticsToken")
    }, tags={ "Miscellaneous" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class)
    })
    public Response getOrdersStatistics(@Valid OrderStatisticsRequest orderStatisticsRequest) {
        return Response.ok().entity("magic!").build();
    }
}

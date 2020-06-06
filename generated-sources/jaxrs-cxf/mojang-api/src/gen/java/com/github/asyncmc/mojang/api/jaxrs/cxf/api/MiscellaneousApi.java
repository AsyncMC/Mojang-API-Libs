package com.github.asyncmc.mojang.api.jaxrs.cxf.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.cxf.model.OrderStatisticsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Mojang API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface MiscellaneousApi  {

    /**
     * Get statistics on the sales of Minecraft.
     *
     */
    @POST
    @Path("/orders/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get statistics on the sales of Minecraft.", tags={ "Miscellaneous" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class) })
    public OrderStatisticsResponse getOrdersStatistics(@Valid OrderStatisticsRequest orderStatisticsRequest);
}


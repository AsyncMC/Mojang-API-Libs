package org.openapitools.api;

import org.openapitools.model.OrderStatisticsRequest;
import org.openapitools.model.OrderStatisticsResponse;
import org.openapitools.api.OrdersApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/orders")
@RequestScoped

@Api(description = "the orders API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:55.984553100-03:00[America/Sao_Paulo]")

public class OrdersApi  {

  @Context SecurityContext securityContext;

  @Inject OrdersApiService delegate;


    @POST
    @Path("/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get statistics on the sales of Minecraft.", notes = "", response = OrderStatisticsResponse.class, authorizations = {
        @Authorization(value = "MojangStatisticsToken")
    }, tags={ "Miscellaneous" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class) })
    public Response getOrdersStatistics(@ApiParam(value = "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/" ,required=true) OrderStatisticsRequest orderStatisticsRequest) {
        return delegate.getOrdersStatistics(orderStatisticsRequest, securityContext);
    }
}

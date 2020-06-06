package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OrdersApiService;
import org.openapitools.api.factories.OrdersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OrderStatisticsRequest;
import org.openapitools.model.OrderStatisticsResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/orders")


@io.swagger.annotations.Api(description = "the orders API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:07.073325700-03:00[America/Sao_Paulo]")
public class OrdersApi  {
   private final OrdersApiService delegate;

   public OrdersApi(@Context ServletConfig servletContext) {
      OrdersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrdersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrdersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = OrdersApiServiceFactory.getOrdersApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/statistics")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get statistics on the sales of Minecraft.", notes = "", response = OrderStatisticsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "MojangStatisticsToken")
    }, tags={ "Miscellaneous", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", response = OrderStatisticsResponse.class) })
    public Response getOrdersStatistics(@ApiParam(value = "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/" ,required=true) @Valid OrderStatisticsRequest orderStatisticsRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrdersStatistics(orderStatisticsRequest,securityContext);
    }
}

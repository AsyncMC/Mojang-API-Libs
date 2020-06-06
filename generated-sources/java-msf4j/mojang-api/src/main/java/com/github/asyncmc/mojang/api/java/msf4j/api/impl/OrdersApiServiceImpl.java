package com.github.asyncmc.mojang.api.java.msf4j.api.impl;

import com.github.asyncmc.mojang.api.java.msf4j.api.*;
import com.github.asyncmc.mojang.api.java.msf4j.model.*;

import com.github.asyncmc.mojang.api.java.msf4j.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.msf4j.model.OrderStatisticsResponse;

import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:29.917115200-03:00[America/Sao_Paulo]")
public class OrdersApiServiceImpl extends OrdersApiService {
    @Override
    public Response getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

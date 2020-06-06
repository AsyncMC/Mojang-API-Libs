package com.github.asyncmc.mojang.api.jaxrs.jersey.api;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.OrderStatisticsResponse;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public abstract class OrdersApiService {
    public abstract Response getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest,SecurityContext securityContext) throws NotFoundException;
}

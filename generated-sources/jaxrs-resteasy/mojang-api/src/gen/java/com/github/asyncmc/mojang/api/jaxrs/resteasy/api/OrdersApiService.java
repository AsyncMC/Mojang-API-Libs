package com.github.asyncmc.mojang.api.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.OrderStatisticsResponse;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:16.982094400-03:00[America/Sao_Paulo]")
public interface OrdersApiService {
      Response getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest,SecurityContext securityContext)
      throws NotFoundException;
}
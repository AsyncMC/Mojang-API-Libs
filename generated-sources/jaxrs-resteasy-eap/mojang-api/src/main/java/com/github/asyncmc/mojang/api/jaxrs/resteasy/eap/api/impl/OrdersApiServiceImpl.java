package com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.*;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.OrderStatisticsResponse;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:13.397400-03:00[America/Sao_Paulo]")
public class OrdersApiServiceImpl implements OrdersApi {
      public Response getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
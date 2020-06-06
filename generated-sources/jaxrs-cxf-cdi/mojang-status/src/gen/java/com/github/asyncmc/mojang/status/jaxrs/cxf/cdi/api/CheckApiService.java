package com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.model.ApiStatus;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:53.138977100-03:00[America/Sao_Paulo]")
public interface CheckApiService {
      public Response checkStatuses(SecurityContext securityContext);
}

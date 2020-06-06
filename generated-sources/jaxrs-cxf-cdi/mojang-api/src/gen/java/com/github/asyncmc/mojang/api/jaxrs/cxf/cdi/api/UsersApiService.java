package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.Error;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:50.207331100-03:00[America/Sao_Paulo]")
public interface UsersApiService {
      public Response getUniqueIdByName(String username, Long at, SecurityContext securityContext);
}

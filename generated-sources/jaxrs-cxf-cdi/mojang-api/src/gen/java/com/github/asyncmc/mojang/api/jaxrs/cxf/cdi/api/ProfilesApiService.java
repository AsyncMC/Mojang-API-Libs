package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.CurrentPlayerIDs;
import java.util.List;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:32:58.743651500-03:00[America/Sao_Paulo]")
public interface ProfilesApiService {
      public Response findUniqueIdsByName(List<String> requestBody, SecurityContext securityContext);
}

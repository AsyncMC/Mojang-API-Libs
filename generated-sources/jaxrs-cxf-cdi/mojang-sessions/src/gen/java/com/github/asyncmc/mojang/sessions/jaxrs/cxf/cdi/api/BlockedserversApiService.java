package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:52.199488500-03:00[America/Sao_Paulo]")
public interface BlockedserversApiService {
      public Response getBlockedServerHashes(SecurityContext securityContext);
}

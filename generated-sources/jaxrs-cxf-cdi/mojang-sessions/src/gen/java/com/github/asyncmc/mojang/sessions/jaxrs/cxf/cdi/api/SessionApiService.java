package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.SessionApiError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:33:00.757857600-03:00[America/Sao_Paulo]")
public interface SessionApiService {
      public Response getPlayerProfile(String strippedUuid, Boolean unsigned, SecurityContext securityContext);
}

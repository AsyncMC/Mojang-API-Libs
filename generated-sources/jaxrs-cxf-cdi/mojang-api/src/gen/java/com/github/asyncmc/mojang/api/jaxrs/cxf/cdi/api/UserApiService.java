package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SkinModel;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:50.207331100-03:00[America/Sao_Paulo]")
public interface UserApiService {
      public Response changePlayerSkin(String strippedUuid, String url, SkinModel model, SecurityContext securityContext);
      public Response checkSecurityStatus(SecurityContext securityContext);
      public Response getNameHistory(String strippedUuid, SecurityContext securityContext);
      public Response listPendingSecurityQuestions(SecurityContext securityContext);
      public Response resetPlayerSkin(String strippedUuid, SecurityContext securityContext);
      public Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer, SecurityContext securityContext);
      public Response uploadPlayerSkin(String strippedUuid, InputStream fileInputStream, Attachment fileDetail, SkinModel model, SecurityContext securityContext);
}

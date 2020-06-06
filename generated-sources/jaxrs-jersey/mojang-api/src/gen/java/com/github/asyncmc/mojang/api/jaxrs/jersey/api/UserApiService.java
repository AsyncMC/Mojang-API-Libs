package com.github.asyncmc.mojang.api.jaxrs.jersey.api;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.SkinModel;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public abstract class UserApiService {
    public abstract Response changePlayerSkin(String strippedUuid,String url,SkinModel model,SecurityContext securityContext) throws NotFoundException;
    public abstract Response checkSecurityStatus(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNameHistory(String strippedUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listPendingSecurityQuestions(SecurityContext securityContext) throws NotFoundException;
    public abstract Response resetPlayerSkin(String strippedUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadPlayerSkin(String strippedUuid,InputStream fileInputStream, FormDataContentDisposition fileDetail,SkinModel model,SecurityContext securityContext) throws NotFoundException;
}

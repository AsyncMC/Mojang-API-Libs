package com.github.asyncmc.mojang.api.java.msf4j.api.impl;

import com.github.asyncmc.mojang.api.java.msf4j.api.*;
import com.github.asyncmc.mojang.api.java.msf4j.model.*;

import com.github.asyncmc.mojang.api.java.msf4j.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.model.NameChange;
import com.github.asyncmc.mojang.api.java.msf4j.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.msf4j.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.java.msf4j.model.SkinModel;

import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:21.461323800-03:00[America/Sao_Paulo]")
public class UserApiServiceImpl extends UserApiService {
    @Override
    public Response changePlayerSkin(String strippedUuid
, String url
, SkinModel model
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response checkSecurityStatus() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getNameHistory(String strippedUuid
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listPendingSecurityQuestions() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response resetPlayerSkin(String strippedUuid
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response uploadPlayerSkin(String strippedUuid
, InputStream fileInputStream, FileInfo fileDetail
, SkinModel model
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

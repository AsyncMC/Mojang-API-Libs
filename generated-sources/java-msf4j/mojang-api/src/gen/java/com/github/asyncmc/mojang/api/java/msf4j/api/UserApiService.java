package com.github.asyncmc.mojang.api.java.msf4j.api;

import com.github.asyncmc.mojang.api.java.msf4j.api.*;
import com.github.asyncmc.mojang.api.java.msf4j.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:29.917115200-03:00[America/Sao_Paulo]")
public abstract class UserApiService {
    public abstract Response changePlayerSkin(String strippedUuid
 ,String url
 ,SkinModel model
 ) throws NotFoundException;
    public abstract Response checkSecurityStatus() throws NotFoundException;
    public abstract Response getNameHistory(String strippedUuid
 ) throws NotFoundException;
    public abstract Response listPendingSecurityQuestions() throws NotFoundException;
    public abstract Response resetPlayerSkin(String strippedUuid
 ) throws NotFoundException;
    public abstract Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer
 ) throws NotFoundException;
    public abstract Response uploadPlayerSkin(String strippedUuid
 ,InputStream fileInputStream, FileInfo fileDetail
 ,SkinModel model
 ) throws NotFoundException;
}

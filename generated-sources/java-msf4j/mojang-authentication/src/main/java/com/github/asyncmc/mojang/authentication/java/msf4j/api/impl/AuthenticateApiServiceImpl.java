package com.github.asyncmc.mojang.authentication.java.msf4j.api.impl;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.*;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.*;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.Error;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.UsernamePassword;

import java.util.List;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:30.945226100-03:00[America/Sao_Paulo]")
public class AuthenticateApiServiceImpl extends AuthenticateApiService {
    @Override
    public Response authenticate(AuthenticationRequest authenticationRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

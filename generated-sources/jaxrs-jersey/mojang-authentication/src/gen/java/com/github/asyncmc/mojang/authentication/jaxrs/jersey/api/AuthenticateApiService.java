package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.UsernamePassword;

import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:02.185411600-03:00[America/Sao_Paulo]")
public abstract class AuthenticateApiService {
    public abstract Response authenticate(AuthenticationRequest authenticationRequest,SecurityContext securityContext) throws NotFoundException;
}

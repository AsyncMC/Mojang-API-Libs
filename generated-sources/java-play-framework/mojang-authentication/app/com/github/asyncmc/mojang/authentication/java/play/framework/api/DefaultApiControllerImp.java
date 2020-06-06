package com.github.asyncmc.mojang.authentication.java.play.framework.api;

import com.github.asyncmc.mojang.authentication.java.play.framework.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.Error;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.UsernamePassword;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:29.903633400-03:00[America/Sao_Paulo]")

public class DefaultApiControllerImp implements DefaultApiControllerImpInterface {
    @Override
    public Authentication authenticate(AuthenticationRequest authenticationRequest) throws Exception {
        //Do your magic!!!
        return new Authentication();
    }

    @Override
    public void invalidate(AccessKeys accessKeys) throws Exception {
        //Do your magic!!!
    }

    @Override
    public RefreshResponse refresh(RefreshRequest refreshRequest) throws Exception {
        //Do your magic!!!
        return new RefreshResponse();
    }

    @Override
    public void siginout(UsernamePassword usernamePassword) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void validate(AccessKeys accessKeys) throws Exception {
        //Do your magic!!!
    }

}

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

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    Authentication authenticate(AuthenticationRequest authenticationRequest) throws Exception;

    void invalidate(AccessKeys accessKeys) throws Exception;

    RefreshResponse refresh(RefreshRequest refreshRequest) throws Exception;

    void siginout(UsernamePassword usernamePassword) throws Exception;

    void validate(AccessKeys accessKeys) throws Exception;

}

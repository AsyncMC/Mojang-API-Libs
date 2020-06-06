package com.github.asyncmc.mojang.sessions.java.play.framework.api;

import com.github.asyncmc.mojang.sessions.java.play.framework.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.play.framework.model.SessionApiError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:30.811111-03:00[America/Sao_Paulo]")

public class LoginApiControllerImp implements LoginApiControllerImpInterface {
    @Override
    public PlayerProfile getPlayerProfile(String strippedUuid, Boolean unsigned) throws Exception {
        //Do your magic!!!
        return new PlayerProfile();
    }

}

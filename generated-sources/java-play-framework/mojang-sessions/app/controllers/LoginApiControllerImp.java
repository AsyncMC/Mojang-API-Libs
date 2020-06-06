package controllers;

import apimodels.PlayerProfile;
import apimodels.SessionApiError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:33.623197600-03:00[America/Sao_Paulo]")

public class LoginApiControllerImp implements LoginApiControllerImpInterface {
    @Override
    public PlayerProfile getPlayerProfile(String strippedUuid, Boolean unsigned) throws Exception {
        //Do your magic!!!
        return new PlayerProfile();
    }

}

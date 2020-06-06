package controllers;

import apimodels.AccessKeys;
import apimodels.Authentication;
import apimodels.AuthenticationRequest;
import apimodels.Error;
import apimodels.RefreshRequest;
import apimodels.RefreshResponse;
import apimodels.UsernamePassword;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:32.782277100-03:00[America/Sao_Paulo]")

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

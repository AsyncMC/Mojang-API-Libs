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

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    Authentication authenticate(AuthenticationRequest authenticationRequest) throws Exception;

    void invalidate(AccessKeys accessKeys) throws Exception;

    RefreshResponse refresh(RefreshRequest refreshRequest) throws Exception;

    void siginout(UsernamePassword usernamePassword) throws Exception;

    void validate(AccessKeys accessKeys) throws Exception;

}

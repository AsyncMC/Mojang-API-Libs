package controllers;

import apimodels.PlayerProfile;
import apimodels.SessionApiError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface LoginApiControllerImpInterface {
    PlayerProfile getPlayerProfile(String strippedUuid, Boolean unsigned) throws Exception;

}

package controllers;

import apimodels.ApiStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    List<Map<String, ApiStatus>> checkStatuses() throws Exception;

}

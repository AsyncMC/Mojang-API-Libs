package controllers;

import apimodels.ApiStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:34.491534-03:00[America/Sao_Paulo]")

public class DefaultApiControllerImp implements DefaultApiControllerImpInterface {
    @Override
    public List<Map<String, ApiStatus>> checkStatuses() throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, ApiStatus>>();
    }

}

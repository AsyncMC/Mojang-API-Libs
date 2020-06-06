package controllers;

import apimodels.Error;
import java.io.InputStream;
import apimodels.SkinModel;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:31.774915700-03:00[America/Sao_Paulo]")

public class SkinOperationsApiController extends Controller {

    private final SkinOperationsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private SkinOperationsApiController(Configuration configuration, SkinOperationsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result changePlayerSkin(String strippedUuid) throws Exception {
        String valuemodel = (request().body().asMultipartFormData().asFormUrlEncoded().get("model"))[0];
        SkinModel model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
        }
        String valueurl = (request().body().asMultipartFormData().asFormUrlEncoded().get("url"))[0];
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            throw new IllegalArgumentException("'url' parameter is required");
        }
        imp.changePlayerSkin(strippedUuid, url, model);
        return ok();
    }

    @ApiAction
    public Result resetPlayerSkin(String strippedUuid) throws Exception {
        imp.resetPlayerSkin(strippedUuid);
        return ok();
    }

    @ApiAction
    public Result uploadPlayerSkin(String strippedUuid) throws Exception {
        String valuemodel = (request().body().asMultipartFormData().asFormUrlEncoded().get("model"))[0];
        SkinModel model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
        }
        Http.MultipartFormData.FilePart file = request().body().asMultipartFormData().getFile("file");
        if ((file == null || ((File) file.getFile()).length() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        imp.uploadPlayerSkin(strippedUuid, file, model);
        return ok();
    }
}

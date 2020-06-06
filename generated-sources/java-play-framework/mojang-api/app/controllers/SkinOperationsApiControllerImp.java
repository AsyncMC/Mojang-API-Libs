package controllers;

import apimodels.Error;
import java.io.InputStream;
import apimodels.SkinModel;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:31.774915700-03:00[America/Sao_Paulo]")

public class SkinOperationsApiControllerImp implements SkinOperationsApiControllerImpInterface {
    @Override
    public void changePlayerSkin(String strippedUuid, String url, SkinModel model) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void resetPlayerSkin(String strippedUuid) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void uploadPlayerSkin(String strippedUuid, Http.MultipartFormData.FilePart file, SkinModel model) throws Exception {
        //Do your magic!!!
    }

}

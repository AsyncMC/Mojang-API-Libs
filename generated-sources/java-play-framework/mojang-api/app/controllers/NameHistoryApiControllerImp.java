package controllers;

import apimodels.CurrentPlayerIDs;
import apimodels.Error;
import java.util.List;
import apimodels.NameChange;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-05T23:33:31.774915700-03:00[America/Sao_Paulo]")

public class NameHistoryApiControllerImp implements NameHistoryApiControllerImpInterface {
    @Override
    public List<CurrentPlayerIDs> findUniqueIdsByName(List<String> requestBody) throws Exception {
        //Do your magic!!!
        return new ArrayList<CurrentPlayerIDs>();
    }

    @Override
    public List<NameChange> getNameHistory(String strippedUuid) throws Exception {
        //Do your magic!!!
        return new ArrayList<NameChange>();
    }

    @Override
    public CurrentPlayerIDs getUniqueIdByName(String username, Long at) throws Exception {
        //Do your magic!!!
        return new CurrentPlayerIDs();
    }

}

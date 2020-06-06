package com.github.asyncmc.mojang.status.java.play.framework.api;

import com.github.asyncmc.mojang.status.java.play.framework.model.ApiStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:40.096065200-03:00[America/Sao_Paulo]")

public class DefaultApiControllerImp implements DefaultApiControllerImpInterface {
    @Override
    public List<Map<String, ApiStatus>> checkStatuses() throws Exception {
        //Do your magic!!!
        return new ArrayList<Map<String, ApiStatus>>();
    }

}

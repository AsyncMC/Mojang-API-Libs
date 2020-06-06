package com.github.asyncmc.mojang.authentication.java.msf4j.api;

import com.github.asyncmc.mojang.authentication.java.msf4j.api.*;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:30.945226100-03:00[America/Sao_Paulo]")
public abstract class ValidateApiService {
    public abstract Response validate(AccessKeys accessKeys
 ) throws NotFoundException;
}

package com.github.asyncmc.mojang.api.java.msf4j.api;

import com.github.asyncmc.mojang.api.java.msf4j.api.*;
import com.github.asyncmc.mojang.api.java.msf4j.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.github.asyncmc.mojang.api.java.msf4j.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.java.msf4j.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:21.461323800-03:00[America/Sao_Paulo]")
public abstract class UsersApiService {
    public abstract Response getUniqueIdByName(String username
 ,Long at
 ) throws NotFoundException;
}

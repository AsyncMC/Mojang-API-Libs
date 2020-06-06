package com.github.asyncmc.mojang.sessions.java.msf4j.api.impl;

import com.github.asyncmc.mojang.sessions.java.msf4j.api.*;
import com.github.asyncmc.mojang.sessions.java.msf4j.model.*;


import java.util.List;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:31.865898300-03:00[America/Sao_Paulo]")
public class BlockedserversApiServiceImpl extends BlockedserversApiService {
    @Override
    public Response getBlockedServerHashes() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

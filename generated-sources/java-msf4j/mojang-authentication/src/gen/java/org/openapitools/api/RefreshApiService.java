package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;
import org.openapitools.model.RefreshRequest;
import org.openapitools.model.RefreshResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:25.668599-03:00[America/Sao_Paulo]")
public abstract class RefreshApiService {
    public abstract Response refresh(RefreshRequest refreshRequest
 ) throws NotFoundException;
}

package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public abstract class InvalidateApiService {
    public abstract Response invalidate(AccessKeys accessKeys,SecurityContext securityContext) throws NotFoundException;
}

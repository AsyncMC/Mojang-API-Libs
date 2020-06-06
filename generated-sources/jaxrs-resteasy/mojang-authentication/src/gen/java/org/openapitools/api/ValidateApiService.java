package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:15.056337600-03:00[America/Sao_Paulo]")
public interface ValidateApiService {
      Response validate(AccessKeys accessKeys,SecurityContext securityContext)
      throws NotFoundException;
}

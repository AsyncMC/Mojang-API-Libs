package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ApiStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:16.777995700-03:00[America/Sao_Paulo]")
public interface CheckApiService {
      Response checkStatuses(SecurityContext securityContext)
      throws NotFoundException;
}

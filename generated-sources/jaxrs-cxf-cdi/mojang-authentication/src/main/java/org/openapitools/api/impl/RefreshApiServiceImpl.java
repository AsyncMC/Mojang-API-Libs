package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;
import org.openapitools.model.RefreshRequest;
import org.openapitools.model.RefreshResponse;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:57.027574300-03:00[America/Sao_Paulo]")
public class RefreshApiServiceImpl implements RefreshApiService {
      @Override
      public Response refresh(RefreshRequest refreshRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}

package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccessKeys;
import org.openapitools.model.Authentication;
import org.openapitools.model.AuthenticationRequest;
import org.openapitools.model.Error;
import org.openapitools.model.RefreshRequest;
import org.openapitools.model.RefreshResponse;
import org.openapitools.model.UsernamePassword;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Mojang Authentication API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    public Authentication authenticate(AuthenticationRequest authenticationRequest) {
        // TODO: Implement...
        
        return null;
    }
    
    public void invalidate(AccessKeys accessKeys) {
        // TODO: Implement...
        
        
    }
    
    public RefreshResponse refresh(RefreshRequest refreshRequest) {
        // TODO: Implement...
        
        return null;
    }
    
    public void siginout(UsernamePassword usernamePassword) {
        // TODO: Implement...
        
        
    }
    
    public void validate(AccessKeys accessKeys) {
        // TODO: Implement...
        
        
    }
    
}


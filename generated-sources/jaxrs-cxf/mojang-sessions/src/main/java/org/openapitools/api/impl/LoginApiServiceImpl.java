package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.PlayerProfile;
import org.openapitools.model.SessionApiError;

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
 * Mojang Session API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
public class LoginApiServiceImpl implements LoginApi {
    /**
     * Gets the player&#39;s game profile
     *
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     *
     */
    public PlayerProfile getPlayerProfile(String strippedUuid, Boolean unsigned) {
        // TODO: Implement...
        
        return null;
    }
    
}


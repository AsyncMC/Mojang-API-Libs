package com.github.asyncmc.mojang.api.jaxrs.cxf.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.cxf.api.*;
import com.github.asyncmc.mojang.api.jaxrs.cxf.model.Error;
import java.io.File;
import com.github.asyncmc.mojang.api.jaxrs.cxf.model.SkinModel;

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
 * Mojang API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
public class SkinOperationsApiServiceImpl implements SkinOperationsApi {
    /**
     * Changes the player skin by URL
     *
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     *
     */
    public void changePlayerSkin(String strippedUuid, String url, SkinModel model) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Resets the player skin to default
     *
     */
    public void resetPlayerSkin(String strippedUuid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Changes the player skin by upload
     *
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     *
     */
    public void uploadPlayerSkin(String strippedUuid,  Attachment fileDetail, SkinModel model) {
        // TODO: Implement...
        
        
    }
    
}


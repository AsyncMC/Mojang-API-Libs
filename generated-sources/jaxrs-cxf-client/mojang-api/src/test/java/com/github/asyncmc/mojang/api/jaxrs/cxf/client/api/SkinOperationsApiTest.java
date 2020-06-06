/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.github.asyncmc.mojang.api.jaxrs.cxf.client.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.Error;
import java.io.File;
import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.SkinModel;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Mojang API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API tests for SkinOperationsApi 
 */
public class SkinOperationsApiTest {


    private SkinOperationsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://api.mojang.com", SkinOperationsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Changes the player skin by URL
     *
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePlayerSkinTest() {
        String strippedUuid = null;
        String url = null;
        SkinModel model = null;
        //api.changePlayerSkin(strippedUuid, url, model);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Resets the player skin to default
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPlayerSkinTest() {
        String strippedUuid = null;
        //api.resetPlayerSkin(strippedUuid);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Changes the player skin by upload
     *
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadPlayerSkinTest() {
        String strippedUuid = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment file = null;
        SkinModel model = null;
        //api.uploadPlayerSkin(strippedUuid, file, model);
        
        // TODO: test validations
        
        
    }
    
}
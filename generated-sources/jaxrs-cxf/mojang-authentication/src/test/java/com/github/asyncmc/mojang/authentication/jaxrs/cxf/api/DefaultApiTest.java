/**
 * Mojang Authentication API
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


package com.github.asyncmc.mojang.authentication.jaxrs.cxf.api;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.model.UsernamePassword;
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
 * Mojang Authentication API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API tests for DefaultApi 
 */
public class DefaultApiTest {


    private DefaultApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://authserver.mojang.com", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateTest() {
        AuthenticationRequest authenticationRequest = null;
        //Authentication response = api.authenticate(authenticationRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invalidateTest() {
        AccessKeys accessKeys = null;
        //api.invalidate(accessKeys);
        
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshTest() {
        RefreshRequest refreshRequest = null;
        //RefreshResponse response = api.refresh(refreshRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void siginoutTest() {
        UsernamePassword usernamePassword = null;
        //api.siginout(usernamePassword);
        
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateTest() {
        AccessKeys accessKeys = null;
        //api.validate(accessKeys);
        
        // TODO: test validations
        
        
    }
    
}

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
import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.cxf.client.model.SecurityChallenge;
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
 * API tests for SecurityQuestionAnswerApi 
 */
public class SecurityQuestionAnswerApiTest {


    private SecurityQuestionAnswerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://api.mojang.com", SecurityQuestionAnswerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Check if security questions are needed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkSecurityStatusTest() {
        //api.checkSecurityStatus();
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get list of questions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPendingSecurityQuestionsTest() {
        //List<SecurityChallenge> response = api.listPendingSecurityQuestions();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Send back the answers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendSecurityQuestionAnswersTest() {
        List<SecurityAnswer> securityAnswer = null;
        //api.sendSecurityQuestionAnswers(securityAnswer);
        
        // TODO: test validations
        
        
    }
    
}
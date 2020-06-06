/*
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.sessions.java.pkmst.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.SessionApiError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for LoginApi
 */
@Ignore
public class LoginApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final LoginApi api = new LoginApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Gets the player&#39;s game profile
     *
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlayerProfileTest() throws Exception {
        String strippedUuid = null;
        Boolean unsigned = null;
    ResponseEntity<PlayerProfile> response = api.getPlayerProfile(strippedUuid, unsigned , accept);

        // TODO: test validations
    }
    
}

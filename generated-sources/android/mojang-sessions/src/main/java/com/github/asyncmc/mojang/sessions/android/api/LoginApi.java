/**
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

package com.github.asyncmc.mojang.sessions.android.api;

import com.github.asyncmc.mojang.sessions.android.server.ApiInvoker;
import com.github.asyncmc.mojang.sessions.android.server.ApiException;
import com.github.asyncmc.mojang.sessions.android.server.Pair;

import com.github.asyncmc.mojang.sessions.android.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.github.asyncmc.mojang.sessions.android.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.android.model.SessionApiError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class LoginApi {
  String basePath = "https://sessionserver.mojang.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Gets the player&#39;s game profile
  * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
   * @param strippedUuid The player UUID without hyphens
   * @param unsigned When set to false, the signature data are sent
   * @return PlayerProfile
  */
  public PlayerProfile getPlayerProfile (String strippedUuid, Boolean unsigned) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'strippedUuid' when calling getPlayerProfile",
        new ApiException(400, "Missing the required parameter 'strippedUuid' when calling getPlayerProfile"));
    }

    // create path and map variables
    String path = "/session/minecraft/profile/{stripped_uuid}".replaceAll("\\{" + "stripped_uuid" + "\\}", apiInvoker.escapeString(strippedUuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unsigned", unsigned));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PlayerProfile) ApiInvoker.deserialize(localVarResponse, "", PlayerProfile.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Gets the player&#39;s game profile
   * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
   * @param strippedUuid The player UUID without hyphens   * @param unsigned When set to false, the signature data are sent
  */
  public void getPlayerProfile (String strippedUuid, Boolean unsigned, final Response.Listener<PlayerProfile> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'strippedUuid' when calling getPlayerProfile",
        new ApiException(400, "Missing the required parameter 'strippedUuid' when calling getPlayerProfile"));
    }

    // create path and map variables
    String path = "/session/minecraft/profile/{stripped_uuid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "stripped_uuid" + "\\}", apiInvoker.escapeString(strippedUuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "unsigned", unsigned));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PlayerProfile) ApiInvoker.deserialize(localVarResponse,  "", PlayerProfile.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}

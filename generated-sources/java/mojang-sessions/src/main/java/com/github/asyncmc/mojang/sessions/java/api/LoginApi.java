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


package com.github.asyncmc.mojang.sessions.java.api;

import com.github.asyncmc.mojang.sessions.java.server.ApiCallback;
import com.github.asyncmc.mojang.sessions.java.server.ApiClient;
import com.github.asyncmc.mojang.sessions.java.server.ApiException;
import com.github.asyncmc.mojang.sessions.java.server.ApiResponse;
import com.github.asyncmc.mojang.sessions.java.server.Configuration;
import com.github.asyncmc.mojang.sessions.java.server.Pair;
import com.github.asyncmc.mojang.sessions.java.server.ProgressRequestBody;
import com.github.asyncmc.mojang.sessions.java.server.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.asyncmc.mojang.sessions.java.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.model.SessionApiError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private ApiClient apiClient;

    public LoginApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoginApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getPlayerProfile
     * @param strippedUuid The player UUID without hyphens (required)
     * @param unsigned When set to false, the signature data are sent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlayerProfileCall(String strippedUuid, Boolean unsigned, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/session/minecraft/profile/{stripped_uuid}"
            .replaceAll("\\{" + "stripped_uuid" + "\\}", apiClient.escapeString(strippedUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (unsigned != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("unsigned", unsigned));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPlayerProfileValidateBeforeCall(String strippedUuid, Boolean unsigned, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'strippedUuid' is set
        if (strippedUuid == null) {
            throw new ApiException("Missing the required parameter 'strippedUuid' when calling getPlayerProfile(Async)");
        }
        

        com.squareup.okhttp.Call call = getPlayerProfileCall(strippedUuid, unsigned, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the player&#39;s game profile
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param unsigned When set to false, the signature data are sent (optional)
     * @return PlayerProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlayerProfile getPlayerProfile(String strippedUuid, Boolean unsigned) throws ApiException {
        ApiResponse<PlayerProfile> resp = getPlayerProfileWithHttpInfo(strippedUuid, unsigned);
        return resp.getData();
    }

    /**
     * Gets the player&#39;s game profile
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param unsigned When set to false, the signature data are sent (optional)
     * @return ApiResponse&lt;PlayerProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlayerProfile> getPlayerProfileWithHttpInfo(String strippedUuid, Boolean unsigned) throws ApiException {
        com.squareup.okhttp.Call call = getPlayerProfileValidateBeforeCall(strippedUuid, unsigned, null, null);
        Type localVarReturnType = new TypeToken<PlayerProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the player&#39;s game profile (asynchronously)
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param unsigned When set to false, the signature data are sent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlayerProfileAsync(String strippedUuid, Boolean unsigned, final ApiCallback<PlayerProfile> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPlayerProfileValidateBeforeCall(strippedUuid, unsigned, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlayerProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
